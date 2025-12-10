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
    : (NEWLINE INDENT)? (compound_stmt | simple_stmt )+ DEDENT?
    ;

compound_stmt
    : if_stmt
    | assign_stmt
    | for_loop
    | atom_expr
    | func_def
    ;

simple_stmt
    : ( return_stmt | import_from | global_stmt | atom_expr ) NEWLINE?
    ;

return_stmt
    : RETURN atom_expr
    | RETURN atom
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*
    ;

import_from
    : FROM dotted_name IMPORT (STAR | import_as_names)
    ;

dotted_name
    : NAME (DOT NAME)*
    ;

import_as_names
    : import_as_name (COMMA import_as_name)*
    ;

import_as_name
    : NAME (AS NAME)?
    ;

if_stmt
    : IF comparison COLON statement
      ( ELIF comparison COLON statement )*
      ( ELSE COLON statement )?
    ;

comparison
    : NOT atom_expr
    | atom_expr (comp_op atom_expr)*
    ;

atom_expr
    : trailer
    | atom trailer*
    ;

comp_op
    : LT | GT | EQ | GTE | LTE | NEQ | IN | NOT IN | IS | IS NOT
    ;

arithmetic_expr
    : atom_expr ((PLUS | MINUS) atom_expr)*
    ;

assign_stmt
    : atom_expr ASSIGN (comparison | template_literal ) NEWLINE?
    ;

template_literal
    : TRIPLE_DOUBLE_START html_content  TRIPLE_DOUBLE_END
    | TRIPLE_SINGLE_START html_content  TRIPLE_SINGLE_END
    ;

for_loop
    : FOR atom_expr IN atom_expr statement
    | atom FOR atom_expr IN atom (IF comparison)*
    ;

func_def
    : decorator? DEF NAME parameters COLON function_body
    ;

decorator
    : AT dotted_name ( LP arglist? RP )? NEWLINE
    ;

parameters
    : LP typedargslist? RP
    ;

typedargslist
    : NAME (COMMA NAME)*
    ;

function_body
    : statement
    | PASS NEWLINE
    ;

trailer
    : LP for_loop RP
    | LP arglist? RP
    | LBRACK for_loop RBRACK
    | LBRACK comparison RBRACK
    | LKBRACE dict_maker? RKBRACE
    | DOT NAME
    ;

atom
    : NAME
    | NUMBER
    | STRING
    | NONE
    | TRUE
    | LBRACK exprlist? RBRACK
    ;

exprlist
    : atom (COMMA atom)* COMMA?
    ;

dict_maker
   : atom COLON (arithmetic_expr | or_test)
     ( COMMA atom COLON (arithmetic_expr | or_test) )*
     COMMA?
   ;

or_test
    : comparison (OR comparison)*
    ;

arglist
    :  argument (COMMA argument )* COMMA?
    ;

argument
    : atom_expr
    | NAME ASSIGN atom_expr
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