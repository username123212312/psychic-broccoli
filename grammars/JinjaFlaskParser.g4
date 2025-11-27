parser grammar JinjaFlaskParser;

// import lexer

options {tokenVocab=JinjaFlaskLexer;}

@header {
    package antlr;
}

program: statement* EOF;

statement
    : importStmt
    | tripleQuotedTemplate
    | decorator
    | assignment
    | functionDef
    | returnStmt
    ;

importStmt
    : FROM NAME IMPORT NAME (COMMA NAME)* COMMA? (AS NAME)?   // optional trailing comma
    | IMPORT NAME (COMMA NAME)* COMMA? (AS NAME)?
    ;

decorator
    : AT NAME LP STRING RP
    ;

assignment
    : NAME ASSIGN expr
    ;

expr
    : STRING
        | tripleQuotedTemplate
        | NUMBER
        | NAME
        | functionCall
        | constructorCall
    ;

constructorCall
    : NAME LP (expr (COMMA expr)* COMMA?)? RP
      # ConstructorCallExpr
    ;

functionCall
    : NAME LP (expr (COMMA expr)*)? RP
    ;

functionDef
    : DEF NAME LP (NAME (COMMA NAME)*)? RP COLON block
    ;

returnStmt
    : RETURN expr?
    ;

block
    : statement*
    ;

tripleQuotedTemplate
    : TRIPLE_DOUBLE_START htmlContent* TRIPLE_DOUBLE_END
    | TRIPLE_SINGLE_START htmlContent* TRIPLE_SINGLE_END
    ;

htmlContent
    : HTML_CONTENT
    | jinjaExpr
    | jinjaStmt
    | jinjaComment
    ;

jinjaExpr: JINJA_EXPR_START JINJA_EXPR_CONTENT JINJA_EXPR_END;
jinjaStmt: JINJA_STMT_START JINJA_STMT_CONTENT JINJA_STMT_END;
jinjaComment: JINJA_COMMENT_START JINJA_COMMENT_CONTENT JINJA_COMMENT_END;