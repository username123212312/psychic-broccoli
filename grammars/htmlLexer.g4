lexer grammar htmlLexer;



HTML_COMMENT
    : '<!--' .*? '-->' -> channel(HIDDEN)
    ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>' -> channel(HIDDEN)
    ;

XML_DECLARATION
    : '<?xml' .*? '?>' -> channel(HIDDEN)
    ;

CDATA
    : '<![CDATA[' .*? ']]>'
    ;

DTD
    : '<!' .*? '>' -> channel(HIDDEN)
    ;

SCRIPTLET
    : '<%' .*? '%>'
    ;

SEA_WS
    : [ \t\r\n]+ -> channel(HIDDEN)
    ;

SCRIPT_OPEN
    : '<script' ~'>'* '>' -> pushMode(SCRIPT)
    ;

STYLE_OPEN
    : '<style' ~'>'* '>' -> pushMode(STYLE)
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;

HTML_TEXT
    : ~'<'+
    ;



mode TAG;

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;

TAG_EQUALS
    : '='
    ;

TAG_NAME
    : TAG_NameChar+
    ;

TAG_WHITESPACE
    : [ \t\r\n]+ -> channel(HIDDEN)
    ;

ATTVALUE_VALUE
    : '"' ~'"'* '"'
    | '\'' ~'\''* '\''
    ;


mode SCRIPT;

SCRIPT_BODY
    : .*? '</script>' -> popMode
    ;



mode STYLE;

STYLE_BODY
    : .*? '</style>' -> popMode
    ;



fragment
TAG_NameChar
    : ~[ \t\r\n"'<>/=-]
    ;
