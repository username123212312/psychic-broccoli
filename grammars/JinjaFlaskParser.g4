parser grammar JinjaFlaskParser;

@header {package antlr;}

options { tokenVocab=JinjaFlaskLexer; }

// ======================================================
// 1. ROOT RULE (The Entry Point)
// ======================================================

// The parser expects a sequence of Python statements until End of File
program
    : (statement | NEWLINE | DEDENT)* EOF
    ;

// ======================================================
// 2. PYTHON STATEMENTS
// ======================================================

statement
    : compound_stmt
    | simple_stmt
    ;

// Simple statements are one-liners (imports, assignments, expressions)
simple_stmt
    : ( small_stmt (SEMI small_stmt)* )? (SEMI | NEWLINE)
    ;

small_stmt
    : assign_stmt
    | import_stmt
    | return_stmt
    | global_stmt
    | expr
    | flow_stmt
    ;

// Compound statements involve indentation (def, if, decorators)
compound_stmt
    : if_stmt
    | func_def
    | decorated
    ;

// ======================================================
// 3. THE BRIDGE: ASSIGNMENT & TEMPLATES
// ======================================================

// This is the critical rule for your test file.
// It handles: 'x = 1' AND 'BASE_HTML = """<html>..."""'
assign_stmt
    : atom_expr ASSIGN ( test | template_literal )
    ;

// This rule triggers the parsing of the HTML/Jinja inside the strings
template_literal
    : TRIPLE_DOUBLE_START html_content (NEWLINE | WS)* TRIPLE_DOUBLE_END
    | TRIPLE_SINGLE_START html_content (NEWLINE | WS)* TRIPLE_SINGLE_END
    ;

// We will define 'html_content' in the next step.
// It is the container for all your HTML and Jinja logic.
html_content
    : (htmlElement
    | HTML_TEXT
    | jinjaStatement
    | jinjaExpression
    )*
    ;

// ======================================================
// 4. IMPORTS & GLOBALS
// ======================================================

import_stmt
    : import_name
    | import_from
    ;

import_name
    : IMPORT dotted_name (AS NAME)?
    ;

import_from
    : FROM dotted_name IMPORT (STAR | import_as_names)
    ;

import_as_names
    : import_as_name (COMMA import_as_name)*
    ;

import_as_name
    : NAME (AS NAME)?
    ;

dotted_name
    : NAME (DOT NAME)*
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*
    ;

// ======================================================
// 5. FUNCTIONS & DECORATORS
// ======================================================

// Handles: @app.route("/") def index(): ...
decorated
    : decorators func_def
    ;

decorators
    : decorator+
    ;

decorator
    : AT dotted_name ( LP arglist? RP )? NEWLINE
    ;

func_def
    : DEF NAME parameters (ARROW test)? COLON suite
    ;

parameters
    : LP typedargslist? RP
    ;

typedargslist
    // Simplified: just a list of names for now, can be expanded for defaults/types
    : NAME (COMMA NAME)*
    ;

// ======================================================
// 6. CONTROL FLOW & BLOCKS (The "Suite")
// ======================================================

if_stmt
    : IF test COLON suite
      ( ELIF test COLON suite )*
      ( ELSE COLON suite )?
    ;

return_stmt
    : RETURN testlist?
    ;

flow_stmt
    : return_stmt
    // | raise_stmt | break_stmt (add these if needed later)
    ;

multiplicativeExpression
    : complexExpression ( (STAR | SLASH | ASSIGN) complexExpression )* # multiplicativeOp
    ;

expressions
    : test
    ;

primaryExpression
    :
         NUMBER                                               # p_number
        | STRING                                              # string
//        | tripleQuotedString                                  # tripleString
        | TRUE                                                # true
        | FALSE                                               # false
        | NONE                                                # none
        | NAME                                                # name
        | LP expressions RP                                    # parenthesis
        | LBRACK (expressions (COMMA expressions)*)? RBRACK     # listLiteral
        | template_literal                                      # templateLiteral
        // Using the safe, standard combined rule to prevent ambiguity-related crashes.
        | LBRACE NEWLINE? (expressions (COLON expressions)? (COMMA expressions (COLON expressions)?)*)? RBRACE # dictOrSetLiteral
        ;

    complexExpression
    : primaryExpression
        (
         DOT NAME
         | LP (expressions (COMMA expressions)*)? RP
         | LBRACK expressions RBRACK
         )*
        ;
// The "Suite" is the core of Python indentation handling.
// It matches either a one-liner: "if True: return 1"
// OR an indented block.
suite
    : simple_stmt
    | NEWLINE INDENT statement+ DEDENT
    ;

// ======================================================
// 7. PLACEHOLDERS FOR EXPRESSIONS (Step 3)
// ======================================================

// We need these so the parser compiles, but we will fill them in Step 3.

testlist: test (COMMA test)*;

// ======================================================
// 8. PYTHON EXPRESSIONS (The "test" rule)
// ======================================================

// The top-level expressions wrapper
test
    : or_test
    ;

// Logical OR (lowest precedence)
or_test
    : and_test (OR and_test)*
    ;

// Logical AND
and_test
    : not_test (AND not_test)*
    ;

// Logical NOT
not_test
    : NOT not_test
    | comparison
    ;

// Comparisons (==, !=, <, >, in)
comparison
    : expr (comp_op expr)*
    ;

comp_op
    : LT | GT | EQ | NEQ | GTE | LTE
    | IN | NOT IN
    // Note: 'IS' is not in your lexer, but 'IN' is.
    ;

// ======================================================
// 9. ARITHMETIC
// ======================================================

expr
    : term ((PLUS | MINUS) term)*
    ;

term
    : factor ((STAR | SLASH | SLASHSLASH) factor)* // Modulo (%) missing in lexer
    ;

factor
    : (PLUS | MINUS) factor
    | power
    ;

power
    : atom_expr // Power (**) not strictly in lexer top-level, so we skip to atoms
    ;

// ======================================================
// 10. ATOMS & TRAILERS (Calls, Attributes, Slices)
// ======================================================

// Handles: func(), obj.prop, list[0]
atom_expr
    : atom trailer*
    ;

trailer
    : LP arglist? RP        // Function call: func(arg)
    | LBRACK test RBRACK    // Indexing: list[0]
    | DOT NAME              // Attribute: obj.name
    ;

// The basic building blocks of data
atom
    : NAME
    | NUMBER
    | STRING+
    | NONE | TRUE | FALSE
    | LP test? RP
    | LBRACK list_content? RBRACK
    | (NEWLINE | INDENT)* LBRACE dict_maker? RBRACE
    ;

// ======================================================
// 11. DATA STRUCTURES & ARGUMENTS
// ======================================================
// Handles both [1, 2] AND [x for x in y]
list_content
    : test comp_for             // List Comprehension
    | test (COMMA test)* // Standard List
    ;

comp_for
    : FOR test IN test (IF test)*
    ;

dict_maker
    : (NEWLINE | INDENT | DEDENT)*
      test COLON test
      ( COMMA (NEWLINE | INDENT | DEDENT)* test COLON test )* ( COMMA (NEWLINE | INDENT | DEDENT)* )?
    ;

arglist
    : WS* argument ( COMMA WS* argument )* WS*
    ;

argument
    : test              // Positional: 10
    | NAME ASSIGN test  // Keyword: debug=True
    ;

// ======================================================
// 12. HTML TEMPLATE CONTENT (The root of the template string)
// ======================================================

htmlElement
    : TAG_OPEN tag_content* (TAG_CLOSE | TAG_SLASH_CLOSE) // e.g., <div class="prod">
    | SCRIPT_OPEN SCRIPT_BODY                            // <script>...</script>
    | STYLE_OPEN stylesheet STYLE_CLOSE               // <style>...</style>
    | XML_DECLARATION
    | CDATA
    | DTD
    | SCRIPTLET
    ;

tag_content
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)? // Basic attribute name="value"
    | jinjaExpression // Jinja inside attribute values: <img src="{{ p.img }}">
    | jinjaStatement  // Jinja inside tag body: <div {% if cond %}>
    | TAG_SLASH
    | TAG_EQUALS
    ;


//===============CSS RULE======================

stylesheet
    : ( CSS_Space | CSS_Comment )* ruleSet ( ( CSS_Space | CSS_Comment )* ruleSet )* ( CSS_Space | CSS_Comment )*
    ;

ruleSet
    : selectorList
      (CSS_Space | CSS_Comment)* CSS_LBRACE
      declarationList
      CSS_RBRACE
    ;

selectorList
    : selector (( CSS_Space | CSS_Comment )* CSS_COMMA ( CSS_Space | CSS_Comment )* selector )*
    ;

selector
    : simpleSelector
    (( CSS_Space+ | CSS_GT ) ( CSS_Space | CSS_Comment )* simpleSelector )*
    ;

simpleSelector
    : CSS_ID ( CSS_DOT CSS_ID | CSS_HASH CSS_ID )*
    | ( CSS_DOT CSS_ID | CSS_HASH CSS_ID )+
    | CSS_ID
    ;

declarationList
    : ( declaration ( ( CSS_Space | CSS_Comment )* declaration )* )?
    ;

declaration
    : CSS_ID ( CSS_Space | CSS_Comment )* CSS_COLON ( CSS_Space | CSS_Comment )* cssValueTerms ( CSS_Space | CSS_Comment )* CSS_SEMI
    ;

cssValueTerms
    : cssterm ( ( CSS_Space | CSS_Comment )* cssterm )*
    ;

cssterm
    : cssfunctionCall
    | CSS_STRING
    | CSS_HEX_COLOR
    | CSS_NUMBER CSS_UNIT
    | CSS_NUMBER
    | CSS_ID
    ;

cssfunctionCall
    : CSS_ID CSS_LPAREN ( CSS_Space | CSS_Comment )*
      cssValueTerms
      (( CSS_Space | CSS_Comment )* CSS_COMMA ( CSS_Space | CSS_Comment )* cssValueTerms )*
      (CSS_Space | CSS_Comment )* CSS_RPAREN
    ;

//=================jinja rules======================
jinjaStatement
   : JINJA_STMT_START jStatement JINJA_STMT_END
   ;

jinjaExpression
    : JINJA_EXPR_START expression JINJA_EXPR_END
    ;

jStatement
    : extends_stmt
    | block_stmt
    | for_stmt
    | j_if_stmt
    ;

extends_stmt
    : J_EXTENDS J_STRING JINJA_STMT_END
    ;

block_stmt
    : J_BLOCK J_NAME JINJA_STMT_END
    html_content
    JINJA_STMT_START J_ENDBLOCK ( J_NAME )? JINJA_STMT_END
    ;

for_stmt
    : J_FOR J_NAME J_IN expression JINJA_STMT_END
      html_content
      JINJA_STMT_START J_ENDFOR JINJA_STMT_END
    ;

j_if_stmt
    : J_IF expression JINJA_STMT_END
      html_content
      JINJA_STMT_START J_ENDIF JINJA_STMT_END
    ;

expression
    : call_expr ( J_EQ | J_NEQ | J_GT | J_LT ) call_expr
    | call_expr
    ;


call_expr
    : var_access ( J_PIPE (J_NAME | J_LENGTH) )?
    | J_NAME J_LPAREN argument_list? J_RPAREN
    | var_access
    | j_atom
    ;

var_access
    : J_NAME ( J_DOT J_NAME )*
    ;

argument_list
    : j_argument ( J_COMMA j_argument )*
    ;

j_argument
    : expression
    | J_NAME J_ASSIGN expression
    ;

j_atom
    : J_NUMBER
    | J_STRING
    | J_TRUE
    | J_FALSE
    | J_NONE
    | J_NAME
    ;