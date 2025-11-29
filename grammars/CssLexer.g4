 lexer grammar CssLexer;

 // ------------------------------------------------
 // Whitespace & Comments (Skip)
 // ------------------------------------------------
 WS
     : [ \t\r\n\f]+ -> skip
     ;

 COMMENT
     : '/*' .*? '*/' -> skip
     ;

 // ------------------------------------------------
 // Basic Symbols
 // ------------------------------------------------
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

 // ------------------------------------------------
 // At-Rules Keywords
 // ------------------------------------------------
 AT_IMPORT       : '@import';
 AT_MEDIA        : '@media';
 AT_FONT_FACE    : '@font-face';
 AT_KEYFRAMES    : '@keyframes';
 AT_SUPPORTS     : '@supports';

 // ------------------------------------------------
 // Functions & Complex Tokens (Critical Priority)
 // ------------------------------------------------

 // نضع هذه القاعدة قبل IDENT لضمان أن minmax( تؤخذ كدالة وليس كاسم
 FUNCTION
     : Name '('
     ;

 NUMBER
     : [0-9]+ ('.' [0-9]+)?
     ;

 COLOR_HEX
     : '#' [0-9a-fA-F]{3,8}
     ;

 // Strings
 STRING
     : '"' ( ~["\\\r\n] | '\\' . )* '"'
     | '\'' ( ~['\\\r\n] | '\\' . )* '\''
     ;

 // ------------------------------------------------
 // Selectors & Identifiers
 // ------------------------------------------------

 // ID Selector
 HASH
     : '#' Name
     ;

 // Class Selector
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

 // Generic Identifier (Must be last)
 IDENT
     : Name
     ;

 // Fragment for CSS Identifiers (NMCHAR)
 fragment
 Name
     : '-'? [a-zA-Z_] [a-zA-Z0-9_-]*
     ;

 // ------------------------------------------------
 // Jinja / Templating
 // ------------------------------------------------
 JINJA_EXPR
     : '{{' .*? '}}'
     ;

 JINJA_STATEMENT
     : '{%' .*? '%}'
     ;



 // ------------------------------------------------
 // Inline Mode (Optional)
 // ------------------------------------------------
 INLINE_STYLE_START
     : 'style' WS* '=' WS* '"'  -> pushMode(INLINE_CSS)
     ;

 mode INLINE_CSS;
     INLINE_JINJA_EXPR      : '{{' .*? '}}';
     INLINE_JINJA_STATEMENT : '{%' .*? '%}';
     INLINE_STYLE_END       : '"' -> popMode;