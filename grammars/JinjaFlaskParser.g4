parser grammar JinjaFlaskParser;

@header {package antlr;}

options { tokenVocab=JinjaFlaskLexer; }

// --- Primary Structure ---
program: NEWLINE* (statement NEWLINE*)* EOF;

// --- Statements ---
statement
    : importStmt
    | simpleStmt
    | tripleQuotedString
    | decorator
    | decoratedDef
    | assignmentStmt
    | globalStmt
    | ifStmt
    | forLoop
    | whileLoop
    | defStmt
    | returnStmt
    | expression
    ;

// New rule: Definition for a single decorator (@expression NEWLINE)
decorator
    : '@' expression NEWLINE
    ;

// New rule: Defines a function definition optionally preceded by decorators
decoratedDef
    : decorator*
      DEF NAME LP RP COLON NEWLINE NEWLINE* block
    ;

defStmt
    : DEF NAME LP RP COLON NEWLINE NEWLINE* block
    ;

// --- Simple Statements ---
simpleStmt
    // CRITICAL: assignmentStmt MUST be listed BEFORE expressionStmt
    : assignmentStmt
    | returnStmt
    | importStmt
    | globalStmt
    | expression
    ;

// --- Indented Block Structure ---
ifStmt
    // Added NEWLINE* to tolerate blank lines between header and block
    : IF expression COLON NEWLINE NEWLINE* block
    ( ELIF expression COLON NEWLINE NEWLINE* block )*
    ( ELSE COLON NEWLINE NEWLINE* block )?
    ;

// A block requires INDENT, statements, and DEDENT
block: INDENT (statement NEWLINE*)* DEDENT;

// --- Assignments and Expressions ---
assignmentStmt: NAME ASSIGN expression;

returnStmt
    : RETURN expression?
    ;

globalStmt
    : GLOBAL NAME (COMMA NAME)*
    ;

importStmt
    : FROM expression IMPORT (STAR | NAME (AS NAME)? (COMMA NAME (AS NAME)?)*)
    | IMPORT NAME (AS NAME)? (COMMA NAME (AS NAME)?)*
    ;

forLoop : FOR NAME IN expression COLON block;

whileLoop : WHILE expression COLON block;


// =================== HTML/TEMPLATE INTEGRATION (New Rules) ===================

// Rule to group the multi-token sequence for triple-quoted strings
// Now uses the integrated HTML parser rules.
tripleQuotedString
    : (TRIPLE_DOUBLE_START | TRIPLE_SINGLE_START)
      document
      (TRIPLE_DOUBLE_END | TRIPLE_SINGLE_END)
    ;

// Integrated HTML Parser Rules:
document
    : ( SCRIPTLET | SEA_WS )*
      ( element ( SCRIPTLET | SEA_WS )* )*
    ;

content
    : ( HTML_TEXT | element | CDATA | SCRIPTLET | JINJA_EXPR_START JINJA_EXPR_CONTENT JINJA_EXPR_END | JINJA_STMT_START JINJA_STMT_CONTENT JINJA_STMT_END | JINJA_COMMENT_START JINJA_COMMENT_CONTENT JINJA_COMMENT_END )*
    ;

element
    // Closing Tag format: <div> content </div>
    : TAG_OPEN TAG_NAME ( attribute )* TAG_CLOSE
      content
      TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE
    // Self-Closing Tag format: <img src="..." />
    | TAG_OPEN TAG_NAME ( attribute )* TAG_SLASH_CLOSE
    // Opening Tag only (Content is parsed in a separate rule if required)
    | TAG_OPEN TAG_NAME ( attribute )* TAG_CLOSE
    ;

attribute
    : TAG_NAME ( TAG_EQUALS ATTVALUE_VALUE )?
    ;

// =================== PYTHON EXPRESSIONS (Unchanged) ===================

expression
    : comparisonExpression ( (AND | OR) comparisonExpression )* # logicalOp
    | NOT comparisonExpression                   # notOp
    ;

comparisonExpression
    : additiveExpression ( (EQ | NEQ | GT | LT | GTE | LTE) additiveExpression )* # comparisonOp
    ;

additiveExpression
    : multiplicativeExpression ( (PLUS | MINUS) multiplicativeExpression )* # additiveOp
    ;

multiplicativeExpression
    : primaryExpression ( (STAR | SLASH) primaryExpression )* # multiplicativeOp
    ;

primaryExpression
    : NUMBER                                              # number
    | STRING                                              # string
    | tripleQuotedString                                  # tripleString
    | TRUE                                                # true
    | FALSE                                               # false
    | NONE                                                # none
    | NAME                                                # name
    | LP expression RP                                    # parenthesis
    | LBRACK (expression (COMMA expression)*)? RBRACK     # listLiteral

    // Using the safe, standard combined rule to prevent ambiguity-related crashes.
    | LBRACE (expression (COLON expression)? (COMMA expression (COLON expression)?)*)? RBRACE # dictOrSetLiteral
    ;
