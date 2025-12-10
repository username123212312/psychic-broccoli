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
    : (NEWLINE INDENT)? simple_stmt+ DEDENT?          #simpleStatement
    | (NEWLINE INDENT)? compound_stmt+ DEDENT?        #compoundStatement
    ;

compound_stmt
    : if_stmt               #ifStatement
    | assign_stmt           #assignmentStatement
    | for_loop              #forLoopStatement
    | python_expr           #pythonExprStatement
    | func_def              #functionDefinition
    ;

simple_stmt
    : return_stmt  NEWLINE?      #returnStatement
    | import_from  NEWLINE?      #importStatement
    | global_stmt  NEWLINE?      #globalStatement
    | python_expr  NEWLINE?      #pythonExprssionStatement
    ;

return_stmt
    : RETURN python_expr      #complexReturn
    | RETURN atom             #simpleReturn
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*
    ;

import_from
    : FROM NAME (DOT NAME)* IMPORT NAME (AS NAME)? (COMMA NAME (AS NAME)?)*
    ;

if_stmt
    : IF comparison COLON statement ( ELIF comparison COLON statement )* ( ELSE COLON statement )?
    ;

comparison
    : NOT python_expr                        #notExpression
    | python_expr (comp_op python_expr)*     #comparisonExpression
    ;

python_expr
    : complex_expr               #complexExpression
    | atom complex_expr*         #atomcomplexExpression
    ;

comp_op
    : LT | GT | EQ | GTE | LTE | NEQ |OR | IN | NOT IN | IS | IS NOT
    ;

assign_stmt
    : python_expr ASSIGN comparison NEWLINE?          #comparisonAssignStmt
    | python_expr ASSIGN template_literal NEWLINE?    #templateLiteralAssignStmt
    ;

template_literal
   : TRIPLE_DOUBLE_START html_content  TRIPLE_DOUBLE_END      #htmlContentDoubleTemplate
   | TRIPLE_SINGLE_START html_content  TRIPLE_SINGLE_END      #htmlContentSingleTemplate
   ;

for_loop
    : FOR python_expr IN python_expr statement            #simpleForLoop
    | atom FOR python_expr IN atom (IF comparison)*       #complexForLoop
    ;

func_def
    : decorator? DEF NAME parameters COLON function_body
    ;

decorator
    : AT NAME (DOT NAME)* ( LP arglist? RP )? NEWLINE
    ;

parameters
    : LP typedargslist? RP
    ;

typedargslist
    : NAME (COMMA NAME)*
    ;

function_body
    : statement         #functionBody
    | PASS NEWLINE      #passBody
    ;

complex_expr
    : LP for_loop RP               #forLoopInRBra
    | LP arglist? RP               #arglistInRBra
    | LBRACK for_loop? RBRACK      #forLoopInSqBra
    | LBRACK comparison RBRACK     #comparisonInSqBra
    | LKBRACE dict_maker? RKBRACE  #dictionaryInKBra
    | LBRACK exprlist? RBRACK      #exprlistInSqBra
    | DOT NAME                     #memberAccess
    ;

atom
    : NAME | NUMBER  | STRING  | NONE  | TRUE
    ;

exprlist
    : atom (COMMA atom)* COMMA?
    ;

dict_maker
   : atom COLON (simple_expr) ( COMMA atom COLON simple_expr )* COMMA?
   ;

simple_expr
    : python_expr (PLUS python_expr)*           #additionExpression
    | comparison                                #comparisonExprssion
    ;

arglist
    :  argument (COMMA argument )* COMMA?
    ;

argument
    : python_expr                 #simpleArgument
    | NAME ASSIGN python_expr     #assignArgument
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