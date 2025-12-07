lexer grammar JinjaLexer;

WS : [ \t\r\n]+ -> channel(HIDDEN) ;

// Delimiters
JINJA_LVAR     : '{{' ;
JINJA_RVAR     : '}}' ;
JINJA_LBLOCK   : '{%' ;
JINJA_RBLOCK   : '%}' ;
JINJA_LCOMMENT : '{#' ;
JINJA_RCOMMENT : '#}' ;

JINJA_COMMENT_CONTENT : JINJA_LCOMMENT .*? JINJA_RCOMMENT -> skip ;

// ===== Keywords  =====
IF      : 'if' ;
ELIF    : 'elif' ;
ELSE    : 'else' ;
ENDIF   : 'endif' ;

FOR     : 'for' ;
IN      : 'in' ;
ENDFOR  : 'endfor' ;

SET     : 'set' ;
RAW     : 'raw' ;
ENDRAW  : 'endraw' ;

OR      : 'or' ;
AND     : 'and' ;

// Operators
PLUS        : '+';
MINUS       : '-';
TIMES       : '*';
DIVIDE      : '/';
MOD         : '%';
POW         : '**';

EQ          : '==';
NE          : '!=';
LE          : '<=';
LT          : '<';
GE          : '>=';
GT          : '>';

ASSIGN      : '=';
DOT         : '.';
COMMA       : ',';

LPAREN      : '(';
RPAREN      : ')';
LBRACK      : '[';
RBRACK      : ']';
PIPE        : '|';

// Literals
NUMBER : [0-9]+ ('.' [0-9]+)? ;

STRING
    : '"' ( ~["\\] | '\\' . )* '"'
    | '\'' ( ~['\\] | '\\' . )* '\''
    ;

// Identifiers
NAME : [A-Za-z_][A-Za-z0-9_]* ;

// Fallback text
TEXT : (~[{}]|'{'~[{]|'}'~[}])+ ;

