// parser grammar CssParser;
//
// options {
//     tokenVocab=CssLexer;
// }
//
// // ----------------------------------------------
// // Entry Point
// // ----------------------------------------------
// stylesheet
//     : (statement | JINJA_STATEMENT)* EOF
//     ;
//
// statement
//     : ruleset
//     | atRule
//     ;
//
// // ----------------------------------------------
// // Rule Sets
// // ----------------------------------------------
// ruleset
//     : selectorGroup LBRACE declarationBlock RBRACE
//     ;
//
// selectorGroup
//     : selector (COMMA selector)*
//     ;
//
// selector
//     : simpleSelectorSequence ( combinator? simpleSelectorSequence )*
//     ;
//
// combinator
//     : PLUS | GREATER | TILDE
//     ;
//
// simpleSelectorSequence
//     : (typeSelector | universal) (hash | classSelector | pseudo | attributeSelector)*
//     | (hash | classSelector | pseudo | attributeSelector)+
//     ;
//
// simpleSelector
//     : typeSelector | universal | hash | classSelector | pseudo | attributeSelector
//     ;
//
// typeSelector      : IDENT ;
// universal         : ASTERISK ;
// hash              : HASH ;
// classSelector     : CLASS ;
// pseudo            : PSEUDO_CLASS | PSEUDO_ELEMENT ;
// attributeSelector : LBRACKET IDENT ( EQUALS value )? RBRACKET ;
//
// // ----------------------------------------------
// // At-Rules
// // ----------------------------------------------
// atRule
//     : AT_IMPORT (STRING | functionCall) importTerminator
//     | AT_MEDIA mediaQueryList LBRACE (statement | JINJA_STATEMENT)* RBRACE
//     | AT_FONT_FACE LBRACE declarationBlock RBRACE
//     | AT_KEYFRAMES IDENT LBRACE (keyframeBlock | JINJA_STATEMENT)* RBRACE
//     ;
//
// importTerminator
//     : mediaQueryList SEMICOLON
//     | SEMICOLON
//     ;
//
// // ----------------------------------------------
// // Media Queries
// // ----------------------------------------------
// mediaQueryList
//     : mediaQuery (COMMA mediaQuery)*
//     ;
//
// mediaQuery
//     : (IDENT)? IDENT? (LPAREN declaration RPAREN)? (IDENT (LPAREN declaration RPAREN)?)*
//     ;
//
// // ----------------------------------------------
// // Declarations & Values
// // ----------------------------------------------
// declarationBlock
//     : ( declaration (SEMICOLON)? | JINJA_STATEMENT )* ;
//
// declaration
//     : propertyName COLON value
//     ;
//
// propertyName
//     : IDENT
//     ;
//
// value
//     : term+
//     ;
//
// // التعديل الأساسي هنا: إضافة HASH للقائمة
// term
//     : NUMBER (IDENT | PERCENT)?
//     | STRING
//     | IDENT
//     | COLOR_HEX
//     | HASH           // Fix: Allows #ccc to be used as a value even if recognized as HASH
//     | functionCall
//     | JINJA_EXPR
//     | JINJA_STATEMENT
//     | LPAREN value RPAREN
//     | SLASH
//     ;
//
// functionCall
//     : FUNCTION valueList? RPAREN
//     ;
//
// valueList
//     : value (COMMA value)*
//     ;
//
// // ----------------------------------------------
// // Keyframes
// // ----------------------------------------------
// keyframeBlock
//     : keyframeSelector LBRACE declarationBlock RBRACE
//     ;
//
// keyframeSelector
//     : (NUMBER | PERCENT) (COMMA (NUMBER | PERCENT))*
//     | IDENT
//     ;

parser grammar CssParser;

options {
    tokenVocab = CssLexer;
}

// ======================================================
// 1. ENTRY POINT & HIGH-LEVEL STRUCTURE
// ======================================================

stylesheet
    : (statement | JINJA_STMT_START JINJA_STMT_CONTENT* JINJA_STMT_END)* EOF
    ;

statement
    : ruleset
    | atRule
    ;

// ======================================================
// 2. AT-RULES (@media, @import, etc.)
// (Simplified to be robust)
// ======================================================

atRule
    // Case 1: @rule with a block, like @media or @keyframes
    : (AT_MEDIA | AT_KEYFRAMES | AT_SUPPORTS | AT_FONT_FACE | AT_RULE)
      anyValueUntilBrace // Consume the selector/condition (e.g., screen and (min-width: 900px))
      LBRACE
      (ruleset | JINJA_STMT_START JINJA_STMT_CONTENT* JINJA_STMT_END)* // Allow nested rulesets inside @media
      RBRACE

    // Case 2: @rule ending with a semicolon, like @import
    | AT_IMPORT
      anyValueUntilSemicolon // Consume the URL and any other info
      SEMICOLON
    ;

// ======================================================
// 3. RULESETS (selector { declarations })
// ======================================================

ruleset
    : selectorGroup LBRACE declarationBlock RBRACE
    ;

// A selector is now simply "anything before a {"
selectorGroup
    : anyValueUntilBrace
    ;

// The block of declarations inside a ruleset
declarationBlock
    : (declaration | JINJA_STMT_START JINJA_STMT_CONTENT* JINJA_STMT_END)*
    ;

// ======================================================
// 4. DECLARATIONS (property: value;)
// (This is the most critical fix)
// ======================================================

// A declaration is now simply "anything before a ;"
declaration
    : anyValueUntilSemicolon SEMICOLON
    ;

// ======================================================
// 5. ROBUST HELPER RULES
// (These make the parser strong)
// ======================================================

// This rule greedily consumes any token until it sees a '{'
anyValueUntilBrace
    : (~(LBRACE | JINJA_EXPR_START | JINJA_STMT_START))+
    ;

// This rule greedily consumes any token until it sees a ';'
anyValueUntilSemicolon
    : (~(SEMICOLON | JINJA_EXPR_START | JINJA_STMT_START))+
    ;
