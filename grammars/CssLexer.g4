lexer grammar CssLexer;

// ======================================================
// 1. MODES
// We define modes to handle different contexts like Jinja
// ======================================================
//modes DEFAULT_MODE JINJA_EXPR_MODE JINJA_STMT_MODE ;



// ======================================================
// 2. WHITESPACE & COMMENTS (Skipped)
// ======================================================
WS
    : [ \t\r\n\f]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;

// ======================================================
// 3. JINJA / TEMPLATING (Handled with mode switching)
// ======================================================
JINJA_EXPR_START
    : '{{' -> pushMode(JINJA_EXPR_MODE)
    ;

JINJA_STMT_START
    : '{%' -> pushMode(JINJA_STMT_MODE)
    ;

// --- Inside Jinja Expression ---
mode JINJA_EXPR_MODE;

JINJA_EXPR_END
    : '}}' -> popMode
    ;

JINJA_EXPR_CONTENT
    : . // Consume everything inside
    ;

// --- Inside Jinja Statement ---
mode JINJA_STMT_MODE;

JINJA_STMT_END
    : '%}' -> popMode
    ;

JINJA_STMT_CONTENT
    : . // Consume everything inside
    ;

// ======================================================
// 4. CSS TOKENS (in DEFAULT_MODE)
// ======================================================

// --- Basic Symbols ---
LBRACE      : '{';
RBRACE      : '}';
COLON       : ':';
SEMICOLON   : ';';
LPAREN      : '(';
RPAREN      : ')';
COMMA       : ',';
DOT         : '.';
SLASH       : '/';
PERCENT     : '%';
PLUS        : '+';
GREATER     : '>';
TILDE       : '~';
EQUALS      : '=';
LBRACKET    : '[';
RBRACKET    : ']';
ASTERISK    : '*';

// --- At-Rules Keywords ---
// We use fragments to make them case-insensitive if needed later
AT_IMPORT       : '@' 'import';
AT_MEDIA        : '@' 'media';
AT_FONT_FACE    : '@' 'font-face';
AT_KEYFRAMES    : '@' 'keyframes';
AT_SUPPORTS     : '@' 'supports';
// Generic @rule for any others
AT_RULE         : '@' Name;


// --- Functions & Complex Tokens ---

// Using a more robust, non-greedy match for functions
FUNCTION
    : Name '('
    ;

NUMBER
    : [0-9]+ ('.' [0-9]+)?
    ;

// More compatible version of COLOR_HEX
COLOR_HEX
    : '#' (
          HEX_CHAR HEX_CHAR HEX_CHAR                    // #rgb
        | HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR          // #rgba
        | HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR // #rrggbb
        | HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR // #rrggbbaa
      )
    ;

STRING
    : '"' ( ~["\\\r\n] | '\\' . )* '"'
    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
    ;

// --- Selectors & Identifiers ---

// ID Selector (#my-id)
HASH
    : '#' Name
    ;

// Class Selector (.my-class)
CLASS
    : '.' Name
    ;

// Pseudo-elements (::before)
PSEUDO_ELEMENT
    : '::' Name
    ;

// Pseudo-classes (:hover)
PSEUDO_CLASS
    : ':' Name
    ;

// Generic Identifier (Must be last to avoid consuming keywords)
IDENT
    : Name
    ;

// ======================================================
// 5. FRAGMENTS (Helper rules, not tokens)
// ======================================================

fragment Name
    : '-'? [a-zA-Z_] [a-zA-Z0-9_-]*
    ;

fragment HEX_CHAR
    : [0-9a-fA-F]
    ;


// lexer grammar CssLexer;
//
// // ------------------------------------------------
// // Whitespace & Comments (Skip)
// // ------------------------------------------------
// WS
//     : [ \t\r\n\f]+ -> skip
//     ;
//
// COMMENT
//     : '/*' .*? '*/' -> skip
//     ;
//
// // ------------------------------------------------
// // Basic Symbols
// // ------------------------------------------------
// LBRACE      : '{';
// RBRACE      : '}';
// COLON       : ':';
// SEMICOLON   : ';';
// LPAREN      : '(';
// RPAREN      : ')';
// COMMA       : ',';
// DOT         : '.';
// SLASH       : '/';
// PERCENT     : '%';
// PLUS        : '+';
// GREATER     : '>';
// TILDE       : '~';
// EQUALS      : '=';
// LBRACKET    : '[';
// RBRACKET    : ']';
// ASTERISK    : '*';
//
// // ------------------------------------------------
// // At-Rules Keywords
// // ------------------------------------------------
// AT_IMPORT       : '@import';
// AT_MEDIA        : '@media';
// AT_FONT_FACE    : '@font-face';
// AT_KEYFRAMES    : '@keyframes';
// AT_SUPPORTS     : '@supports';
//
// // ------------------------------------------------
// // Functions & Complex Tokens (Critical Priority)
// // ------------------------------------------------
//
// // نضع هذه القاعدة قبل IDENT لضمان أن minmax( تؤخذ كدالة وليس كاسم
// FUNCTION
//     : Name '('
//     ;
//
// NUMBER
//     : [0-9]+ ('.' [0-9]+)?
//     ;
//
// COLOR_HEX
//     : '#' [0-9a-fA-F]{3,8}
//     ;
//
// // Strings
// STRING
//     : '"' ( ~["\\\r\n] | '\\' . )* '"'
//     | '\'' ( ~['\\\r\n] | '\\' . )* '\''
//     ;
//
// // ------------------------------------------------
// // Selectors & Identifiers
// // ------------------------------------------------
//
// // ID Selector
// HASH
//     : '#' Name
//     ;
//
// // Class Selector
// CLASS
//     : '.' Name
//     ;
//
// // Pseudo-elements (::before)
// PSEUDO_ELEMENT
//     : '::' Name
//     ;
//
// // Pseudo-classes (:hover)
// PSEUDO_CLASS
//     : ':' Name
//     ;
//
// // Generic Identifier (Must be last)
// IDENT
//     : Name
//     ;
//
// // Fragment for CSS Identifiers (NMCHAR)
// fragment
// Name
//     : '-'? [a-zA-Z_] [a-zA-Z0-9_-]*
//     ;
//
// // ------------------------------------------------
// // Jinja / Templating
// // ------------------------------------------------
// JINJA_EXPR
//     : '{{' .*? '}}'
//     ;
//
// JINJA_STATEMENT
//     : '{%' .*? '%}'
//     ;
//
//
//
// // ------------------------------------------------
// // Inline Mode (Optional)
// // ------------------------------------------------
// INLINE_STYLE_START
//     : 'style' WS* '=' WS* '"'  -> pushMode(INLINE_CSS)
//     ;
//
// mode INLINE_CSS;
//     INLINE_JINJA_EXPR      : '{{' .*? '}}';
//     INLINE_JINJA_STATEMENT : '{%' .*? '%}';
//     INLINE_STYLE_END       : '"' -> popMode;