parser grammar JinjaFlaskParser;
options { tokenVocab=JinjaFlaskLexer; }

@header { package antlr; }

// Entry point
program: statement* EOF;

// --------------------- STATEMENTS ---------------------
statement
    : importStmt
    | tripleQuotedTemplate
    | decorator
    | assignment
    | functionDef
    | returnStmt
    ;

// --------------------- IMPORTS ---------------------
importStmt
    : FROM NAME IMPORT NAME (COMMA NAME)* COMMA? (AS NAME)?
    | IMPORT NAME (COMMA NAME)* COMMA? (AS NAME)?
    ;

// --------------------- DECORATORS ---------------------
decorator
    : AT attributeAccess LP routeArgs? RP
    ;

// --------------------- ASSIGNMENT ---------------------
assignment
    : NAME ASSIGN expr
    ;

// --------------------- RETURN ---------------------
returnStmt
    : RETURN expr?
    ;

// --------------------- FUNCTION DEFINITION ---------------------
functionDef
    : DEF NAME LP (NAME (COMMA NAME)*)? RP COLON block
    ;

// --------------------- BLOCK ---------------------
block
    : statement*
    ;

// --------------------- EXPRESSIONS ---------------------
expr
    : STRING
    | tripleQuotedTemplate
    | NUMBER
    | functionCall
    | constructorCall
    | attributeAccess
    | dictLiteral
    | listLiteral
    | NAME
    ;

// --------------------- FUNCTION & CONSTRUCTOR CALLS ---------------------
constructorCall
    : NAME LP (expr (COMMA expr)* COMMA?)? RP
      # ConstructorCallExpr
    ;

functionCall
    : NAME LP ((expr | NAME ASSIGN expr) (COMMA (expr | NAME ASSIGN expr))*)? RP
    ;

// --------------------- ATTRIBUTE ACCESS ---------------------
attributeAccess
    : NAME (DOT NAME)+
    ;

// --------------------- LIST & DICTIONARY ---------------------
listLiteral
    : LBRACK (expr (COMMA expr)*)? RBRACK
    ;

dictLiteral
    : LBRACE (expr COLON expr (COMMA expr COLON expr)*)? RBRACE
    ;

// --------------------- TRIPLE-QUOTED TEMPLATES ---------------------
tripleQuotedTemplate
    : TRIPLE_DOUBLE_START templateContent* TRIPLE_DOUBLE_END
    | TRIPLE_SINGLE_START templateContent* TRIPLE_SINGLE_END
    ;

templateContent
    : HTML_CONTENT
    | jinjaExpr
    | jinjaStmt
    | jinjaComment
    | styleBlock
    ;

jinjaExpr: JINJA_EXPR_START (JINJA_EXPR_CONTENT)? JINJA_EXPR_END;
jinjaStmt: JINJA_STMT_START (JINJA_STMT_CONTENT)? JINJA_STMT_END;
jinjaComment: JINJA_COMMENT_START (JINJA_COMMENT_CONTENT)? JINJA_COMMENT_END;

styleBlock: STYLE_START CSS_CONTENT STYLE_END;

// --------------------- FLASK ROUTE ARGUMENTS ---------------------
routeArgs
    : STRING (COMMA routeOptions?)?
    ;

routeOptions
    : NAME ASSIGN arrayOfStrings
    ;

arrayOfStrings
    : LBRACK STRING (COMMA STRING)* RBRACK
    ;
