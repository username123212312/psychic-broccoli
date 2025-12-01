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
//tripleQuotedString
//    : (TRIPLE_DOUBLE_START | TRIPLE_SINGLE_START)
//    document
//      (TRIPLE_DOUBLE_END | TRIPLE_SINGLE_END)
//    ;

tripleQuotedString
    : (TRIPLE_DOUBLE_START | TRIPLE_SINGLE_START)
      document?
      (TRIPLE_DOUBLE_END | TRIPLE_SINGLE_END)
    ;
// Integrated HTML Parser Rules:
//document
//    : ( SCRIPTLET | SEA_WS )*
//      ( element ( SCRIPTLET | SEA_WS )* )*
//    ;
document
    : ( SCRIPTLET | SEA_WS | element | HTML_TEXT | JINJA_EXPR_START JINJA_EXPR_CONTENT JINJA_EXPR_END | JINJA_STMT_START JINJA_STMT_CONTENT JINJA_STMT_END | JINJA_COMMENT_START JINJA_COMMENT_CONTENT JINJA_COMMENT_END )*
    ;

content
    : ( HTML_TEXT | element | CDATA | SCRIPTLET | JINJA_EXPR_START JINJA_EXPR_CONTENT JINJA_EXPR_END | JINJA_STMT_START JINJA_STMT_CONTENT JINJA_STMT_END | JINJA_COMMENT_START JINJA_COMMENT_CONTENT JINJA_COMMENT_END )*
    ;

//element
//    // Closing Tag format: <div> content </div>
//    : TAG_OPEN TAG_NAME ( attribute )* TAG_CLOSE
//      content
//      TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE
//    // Self-Closing Tag format: <img src="..." />
//    | TAG_OPEN TAG_NAME ( attribute )* TAG_SLASH_CLOSE
//    // Opening Tag only (Content is parsed in a separate rule if required)
//    | TAG_OPEN TAG_NAME ( attribute )* TAG_CLOSE
//    | styleElement
//    ;
element
    : TAG_OPEN TAG_NAME ( attribute )* TAG_CLOSE
      document
      TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE
    | TAG_OPEN TAG_NAME ( attribute )* TAG_SLASH_CLOSE
    | SCRIPT_OPEN SCRIPT_BODY?
    | styleElement
    ;
//attribute
//    : TAG_NAME ( TAG_EQUALS ATTVALUE_VALUE )?
//    ;
attribute
    : TAG_NAME ( TAG_EQUALS ATTVALUE_VALUE )?
    ;

// ----------------- CSS PARSING (BASED ON STYLE MODE TOKENS) -----------------

// styleElement
//     : STYLE_OPEN styleContent STYLE_CLOSE
//     ;
styleElement
    : STYLE_OPEN styleContent? STYLE_CLOSE
    ;
// styleContent
//     : (cssStatement | JINJA_STATEMENT)*
//     ;
styleContent
    : ( ruleset | atRule | JINJA_STMT | JINJA_COMMENT )*
    ;
 cssStatement
     : ruleset
     | atRule
     ;


 // ----------------------------------------------
 // Rule Sets
 // ----------------------------------------------
// ruleset
//     : selectorGroup CSS_LBRACE declarationBlock CSS_RBRACE
//     ;
ruleset
    : selectorList CSS_LBRACE declarationList? CSS_RBRACE
    ;
selectorList
    : selector (CSS_COMMA selector)*
    ;
 selectorGroup
     : selector (CSS_COMMA selector)*
     ;

// selector
//     : simpleSelectorSequence ( combinator? simpleSelectorSequence )*
//     ;

selector
    : (IDENT | CSS_ASTERISK | HASH | CLASS | PSEUDO_CLASS | PSEUDO_ELEMENT)+ ( (CSS_GREATER | CSS_PLUS | CSS_TILDE) (IDENT | CSS_ASTERISK | HASH | CLASS | PSEUDO_CLASS | PSEUDO_ELEMENT)+ )*
    ;
 combinator
     : CSS_PLUS | CSS_GREATER | CSS_TILDE
     ;

 simpleSelectorSequence
     : (typeSelector | universal) (hash | classSelector | pseudo | attributeSelector)*
     | (hash | classSelector | pseudo | attributeSelector)+
     ;

 simpleSelector
     : typeSelector | universal | hash | classSelector | pseudo | attributeSelector
     ;

 typeSelector      : IDENT ;
 universal         : CSS_ASTERISK ;
 hash              : HASH ;
 classSelector     : CLASS ;
 pseudo            : PSEUDO_CLASS | PSEUDO_ELEMENT ;
 attributeSelector : CSS_LBRACKET IDENT ( CSS_EQUALS value )? CSS_RBRACKET ;

 // ----------------------------------------------
 // At-Rules
 // ----------------------------------------------
// atRule
//     : AT_IMPORT (CSS_STRING | functionCall) importTerminator
//     | AT_MEDIA mediaQueryList CSS_LBRACE (statement | JINJA_STATEMENT)* CSS_RBRACE
//     | AT_FONT_FACE CSS_LBRACE declarationBlock CSS_RBRACE
//     | AT_KEYFRAMES IDENT CSS_LBRACE (keyframeBlock | JINJA_STATEMENT)* CSS_RBRACE
//     ;
atRule
    : (AT_MEDIA | AT_SUPPORTS) anyValue* CSS_LBRACE (ruleset | atRule)* CSS_RBRACE
    | (AT_IMPORT | AT_KEYFRAMES | AT_FONT_FACE) anyValue* (CSS_LBRACE declarationList? CSS_RBRACE | CSS_SEMICOLON)
    ;
declarationList
    : declaration (CSS_SEMICOLON declaration)* CSS_SEMICOLON?
    ;

 importTerminator
     : mediaQueryList CSS_SEMICOLON
     | CSS_SEMICOLON
     ;

 // ----------------------------------------------
 // Media Queries
 // ----------------------------------------------
 mediaQueryList
     : mediaQuery (CSS_COMMA mediaQuery)*
     ;

 mediaQuery
     : (IDENT)? IDENT? (CSS_LPAREN declaration CSS_RPAREN)? (IDENT (CSS_LPAREN declaration CSS_RPAREN)?)*
     ;

 // ----------------------------------------------
 // Declarations & Values
 // ----------------------------------------------
 declarationBlock
     : ( declaration (CSS_SEMICOLON)? | JINJA_STATEMENT )* ;

// declaration
//     : propertyName CSS_COLON valueList
//     ;
declaration
    : IDENT CSS_COLON anyValue
    ;
anyValue
    : (term | functionCall | CSS_COMMA | CSS_SLASH)+
    ;

 propertyName
     : IDENT
     ;

 value
     : term+
     ;

 // التعديل الأساسي هنا: إضافة HASH للقائمة
// term
//     : CSS_NUMBER (IDENT | CSS_PERCENT)?
//     | CSS_STRING
//     | IDENT
//     | COLOR_HEX
//     | HASH           // Fix: Allows #ccc to be used as a value even if recognized as HASH
//     | functionCall
//     | JINJA_EXPR
//     | JINJA_STATEMENT
//     | CSS_LPAREN value CSS_RPAREN
//     | CSS_SLASH
//     ;
term
    : (CSS_PLUS | MINUS)? (CSS_NUMBER (IDENT | CSS_PERCENT)?)
    | CSS_STRING
    | COLOR_HEX
    | IDENT
    | HASH
    ;

// functionCall
//     : IDENT CSS_LPAREN valueList? CSS_RPAREN
//     ;

functionCall
    : IDENT CSS_LPAREN anyValue? CSS_RPAREN
    ;
// valueList
//     : value (CSS_COMMA (value | functionCall))*
//     ;
//
// // ----------------------------------------------
// // Keyframes
// // ----------------------------------------------
// keyframeBlock
//     : keyframeSelector CSS_LBRACE declarationBlock CSS_RBRACE
//     ;
//
// keyframeSelector
//     : (CSS_NUMBER | CSS_PERCENT) (CSS_COMMA (CSS_NUMBER | CSS_PERCENT))*
//     | IDENT
//     ;


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

//primaryExpression
//    : NUMBER                                              # number
//    | STRING                                              # string
//    | tripleQuotedString                                  # tripleString
//    | TRUE                                                # true
//    | FALSE                                               # false
//    | NONE                                                # none
//    | NAME                                                # name
//    | LP expression RP                                    # parenthesis
//    | LBRACK (expression (COMMA expression)*)? RBRACK     # listLiteral
//
//    //| TRIPLE_DOUBLE_STRING                                # tripleDoubleString
//    //| TRIPLE_SINGLE_STRING                                # tripleSingleString
//
//    // Using the safe, standard combined rule to prevent ambiguity-related crashes.
//    | LBRACE (expression (COLON expression)? (COMMA expression (COLON expression)?)*)? RBRACE # dictOrSetLiteral
//    ;
primaryExpression
    : atom (trailer)*  # atomExpression
    ;

trailer
    : LP argumentList? RP      # functionCallTrailer
    | LBRACK expression RBRACK # subscriptTrailer
    | DOT NAME                 # attributeAccessTrailer
    ;

atom
    : NUMBER
    | STRING
    | tripleQuotedString
    | TRUE
    | FALSE
    | NONE
    | NAME
    | LP expression RP
    | LBRACK (expression (COMMA expression)*)? RBRACK
    | LBRACE (expression (COLON expression)? (COMMA expression (COLON expression)?)*)? RBRACE
    ;

argumentList
    : expression (COMMA expression)*
    ;