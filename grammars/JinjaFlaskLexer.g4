lexer grammar JinjaFlaskLexer;

// =================== DEFAULT MODE (Python) ===================
WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

DEF: 'def';
RETURN: 'return';
FROM: 'from';
IMPORT: 'import';
AS: 'as';

AT: '@';
COLON: ':';
COMMA: ',';
ASSIGN: '=';
LP: '(';
RP: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
DOT: '.';

NAME: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;

// Single/double-quoted string
STRING
    : '\'' (~['\r\n])* '\''
    | '"' (~["\r\n])* '"'
    ;

// Triple-quoted string → enter HTMLMODE
TRIPLE_DOUBLE_START: '"""' -> pushMode(HTMLMODE);
TRIPLE_SINGLE_START: '\'\'\'' -> pushMode(HTMLMODE);

// Catch all other characters (for safety)
OTHER: . ;

// =================== HTMLMODE ===================
mode HTMLMODE;

// CSS starts first
STYLE_START: '<style>' -> pushMode(CSSMODE);

// Jinja starts
JINJA_EXPR_START: '{{' -> pushMode(JINJA_EXPR);
JINJA_STMT_START: '{%' -> pushMode(JINJA_STMT);
JINJA_COMMENT_START: '{#' -> pushMode(JINJA_COMMENT);

// Triple-quote ends
TRIPLE_DOUBLE_END: '"""' -> popMode;
TRIPLE_SINGLE_END: '\'\'\'' -> popMode;

// HTML content (everything else)
HTML_CONTENT
    : (   ~[<{'"]    // any char except <, {, or "
        | '<' ~'s'   // < not followed by s
        | '{' ~[#{%] // { not followed by # or %
        | '"' ~'"'   // double quote not starting """
        | '\'' ~'\'' // single quote not starting '''
      )+
    ;

// =================== CSS MODE ===================
mode CSSMODE;
STYLE_END: '</style>' -> popMode;
CSS_CONTENT
    : (   ~'<'          // any char except <
        | '<' ~'/'      // < not followed by /
        | '</' ~'s'     // </ not followed by s
        | '</s' ~'t'    // </st not followed by t
        | '</st' ~'y'   // continue
        | '</sty' ~'l'
        | '</styl' ~'e'
      )+
    ;// non-greedy until </style>

// =================== JINJA EXPRESSION MODE ===================
mode JINJA_EXPR;
JINJA_EXPR_END: '}}' -> popMode;
fragment JINJA_EXPR_CONTENT: (~'}')* ;

// =================== JINJA STATEMENT MODE ===================
mode JINJA_STMT;
JINJA_STMT_END: '%}' -> popMode;
fragment JINJA_STMT_CONTENT: (~'%')* ;

// =================== JINJA COMMENT MODE ===================
mode JINJA_COMMENT;
JINJA_COMMENT_END: '#}' -> popMode;
fragment JINJA_COMMENT_CONTENT: (~'#')* ;
