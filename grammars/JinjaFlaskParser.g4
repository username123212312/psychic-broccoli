parser grammar JinjaFlaskParser;

@header {package antlr;}

@parser::members {
    private void trace(String rule) {
        System.out.println("ENTER RULE: " + rule + " at token " + _input.LT(1).getText());
    }
}

options { tokenVocab=JinjaFlaskLexer; }

program
    : NEWLINE* (statement)* EOF
    ;

statement
    : compound_stmt
    | simple_stmt
    ;

compound_stmt
    : if_stmt
    | assign_stmt
    | for_loop
    | atom_expr
    | func_def
    ;



//simple_stmt
//    : ( return_stmt | import_from | global_stmt ) NEWLINE?
//    ;
simple_stmt
    : ( return_stmt | import_from | global_stmt | atom_expr ) NEWLINE?
    ;

//for_loop
//    : FOR atom_expr IN atom_expr (simple_stmt | compound_stmt)*
//    ;
for_loop
    : FOR atom_expr IN atom_expr COLON (indented_block | statement)
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

return_stmt
    : RETURN atom_expr
    | RETURN atom
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*
    ;

expr
    : atom_expr ((PLUS | MINUS) atom_expr)*
    ;

atom_expr
    : trailer
    | atom trailer*
    ;

trailer
    : LP arglist? RP
    | LBRACK dict_maker RBRACK
    | LBRACK atom_expr RBRACK
    | DOT NAME
    | LP generator_expr RP                      // For nested generator expressions
    | LBRACK list_comprehension RBRACK          // For list comprehensions in brackets
    | LKBRACE dict_comprehension RKBRACE        // For dict comprehensions in braces
    | LKBRACE set_comprehension RKBRACE         // For set comprehensions in braces
    ;

//if_stmt
//    : IF comparison COLON statement
//      ( ELIF comparison COLON statement )*
//      ( ELSE COLON statement )?
//    | IF comparison
//    ;

block
    : NEWLINE INDENT stmt_block DEDENT
    | stmt_block
    ;
stmt_block
    : statement+
    ;
if_stmt
    : IF comparison COLON (indented_block | statement)
      ( ELIF comparison COLON (indented_block | statement) )*
      ( ELSE COLON (indented_block | statement) )?
    ;

indented_block
    : NEWLINE INDENT statement+ DEDENT
    ;



//assign_stmt
//    : atom_expr ASSIGN ( simple_stmt+ | compound_stmt | template_literal )
//    ;

assign_stmt
    : atom_expr ASSIGN ( expr | atom_expr | template_literal ) NEWLINE?
    ;

template_literal
    : TRIPLE_DOUBLE_START html_content  TRIPLE_DOUBLE_END
    | TRIPLE_SINGLE_START html_content  TRIPLE_SINGLE_END
    ;

func_def
    : decorator? DEF NAME parameters COLON function_body
    ;

decorator
    : AT dotted_name ( LP arglist? RP )? NEWLINE
    ;
//function_body
//    : NEWLINE INDENT function_statement* DEDENT  // Allow empty body
//    | PASS NEWLINE
//    | NEWLINE  // Allow just a newline (empty function)
//    ;
function_body
    : block
    | PASS NEWLINE
    ;

parameters
    : LP typedargslist? RP
    ;

typedargslist
    : NAME (COMMA NAME)*
    ;

generator_expr
    : atom_expr comp_for
    ;
// List comprehension
list_comprehension
    : atom_expr comp_for
    ;

// Dict comprehension
dict_comprehension
    : keyvalue comp_for
    ;

// Set comprehension
set_comprehension
    : atom_expr comp_for
    ;

// Key-value pair for dict comprehensions
keyvalue
    : atom_expr COLON atom_expr
    ;

comp_for
    : FOR exprlist IN or_test (IF or_test)* (comp_for)?
    ;

exprlist
    : atom_expr (COMMA atom_expr)* (COMMA)?
    ;

atom
    : NAME
    | NUMBER
    | STRING
    | NONE | TRUE | FALSE
    | LP atom_expr? RP
    | LBRACK list_content? RBRACK
    | LKBRACE dict_maker? RKBRACE
    // Comprehensions
    | LP generator_expr RP
    | LBRACK list_comprehension RBRACK
    | LKBRACE dict_comprehension RKBRACE        
    | LKBRACE set_comprehension RKBRACE
    ;

//function_call
//    : STRING LP atom (COMMA atom)* RP
//    ;

list_content
    : atom_expr (COMMA atom_expr)* (COMMA)?
    ;

dict_maker
   : atom COLON (expr | or_test)
     (  COMMA  atom COLON  (expr | or_test) )*
     COMMA?
   ;

arglist
    :  argument
      ( COMMA  argument )*
      ( COMMA  )?
    ;

argument
    : atom_expr
    | NAME ASSIGN atom_expr
    ;


or_test
    : and_test (OR and_test)*
    ;
and_test
    : not_test (AND not_test)*
    ;

not_test
    : NOT not_test
    | comparison
    ;

comparison
    : NOT expr
    | expr (comp_op expr)*
    ;

comp_op
    : LT | GT | EQ | GTE | LTE | NEQ | IN | NOT IN | IS | IS NOT
    ;


//==========================HTML RULES=====================
html_content
    : (htmlElement
    | HTML_TEXT
    | jinjaStatement
    | jinjaExpression
    )*
    ;

htmlElement
    : TAG_OPEN tag_content* (TAG_CLOSE | TAG_SLASH_CLOSE)
    | SCRIPT_OPEN SCRIPT_BODY
    | STYLE_OPEN stylesheet STYLE_CLOSE
    | XML_DECLARATION
    | CDATA
    | DTD
    | SCRIPTLET
    ;

tag_content
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?
    | jinjaExpression
    | jinjaStatement
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
    | ( CSS_DOT CSS_ID CSS_ID? | CSS_HASH CSS_ID )+
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
   : JINJA_STMT_START jStatement
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