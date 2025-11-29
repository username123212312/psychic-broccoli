 parser grammar CssParser;

 options {
     tokenVocab=CssLexer;
 }

 // ----------------------------------------------
 // Entry Point
 // ----------------------------------------------
 stylesheet
     : (statement | JINJA_STATEMENT)* EOF
     ;

 statement
     : ruleset
     | atRule
     ;

 // ----------------------------------------------
 // Rule Sets
 // ----------------------------------------------
 ruleset
     : selectorGroup LBRACE declarationBlock RBRACE
     ;

 selectorGroup
     : selector (COMMA selector)*
     ;

 selector
     : simpleSelectorSequence ( combinator? simpleSelectorSequence )*
     ;

 combinator
     : PLUS | GREATER | TILDE
     ;

 simpleSelectorSequence
     : (typeSelector | universal) (hash | classSelector | pseudo | attributeSelector)*
     | (hash | classSelector | pseudo | attributeSelector)+
     ;

 simpleSelector
     : typeSelector | universal | hash | classSelector | pseudo | attributeSelector
     ;

 typeSelector      : IDENT ;
 universal         : ASTERISK ;
 hash              : HASH ;
 classSelector     : CLASS ;
 pseudo            : PSEUDO_CLASS | PSEUDO_ELEMENT ;
 attributeSelector : LBRACKET IDENT ( EQUALS value )? RBRACKET ;

 // ----------------------------------------------
 // At-Rules
 // ----------------------------------------------
 atRule
     : AT_IMPORT (STRING | functionCall) importTerminator
     | AT_MEDIA mediaQueryList LBRACE (statement | JINJA_STATEMENT)* RBRACE
     | AT_FONT_FACE LBRACE declarationBlock RBRACE
     | AT_KEYFRAMES IDENT LBRACE (keyframeBlock | JINJA_STATEMENT)* RBRACE
     ;

 importTerminator
     : mediaQueryList SEMICOLON
     | SEMICOLON
     ;

 // ----------------------------------------------
 // Media Queries
 // ----------------------------------------------
 mediaQueryList
     : mediaQuery (COMMA mediaQuery)*
     ;

 mediaQuery
     : (IDENT)? IDENT? (LPAREN declaration RPAREN)? (IDENT (LPAREN declaration RPAREN)?)*
     ;

 // ----------------------------------------------
 // Declarations & Values
 // ----------------------------------------------
 declarationBlock
     : ( declaration (SEMICOLON)? | JINJA_STATEMENT )* ;

 declaration
     : propertyName COLON value
     ;

 propertyName
     : IDENT
     ;

 value
     : term+
     ;

 // التعديل الأساسي هنا: إضافة HASH للقائمة
 term
     : NUMBER (IDENT | PERCENT)?
     | STRING
     | IDENT
     | COLOR_HEX
     | HASH           // Fix: Allows #ccc to be used as a value even if recognized as HASH
     | functionCall
     | JINJA_EXPR
     | JINJA_STATEMENT
     | LPAREN value RPAREN
     | SLASH
     ;

 functionCall
     : FUNCTION valueList? RPAREN
     ;

 valueList
     : value (COMMA value)*
     ;

 // ----------------------------------------------
 // Keyframes
 // ----------------------------------------------
 keyframeBlock
     : keyframeSelector LBRACE declarationBlock RBRACE
     ;

 keyframeSelector
     : (NUMBER | PERCENT) (COMMA (NUMBER | PERCENT))*
     | IDENT
     ;