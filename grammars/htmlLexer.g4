lexer grammar htmlLexer;

// ======================================================
// 1. MODES
// We define all modes used in this lexer for clarity.
// ======================================================
//modes { DEFAULT_MODE, TAG_MODE, SCRIPT_MODE, STYLE_MODE }

// ======================================================
// 2. DEFAULT MODE TOKENS (Outside of any tags)
// ======================================================

// --- Comments and Declarations ---
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

SCRIPTLET // For ASP/JSP style tags <% ... %>
    : '<%' .*? '%>'
    ;

SEA_WS // Whitespace in the main document
    : [ \t\r\n]+ -> channel(HIDDEN)
    ;

// --- Mode Pushing Tokens (The most important part) ---

// When we see '<script', switch to SCRIPT_MODE
SCRIPT_OPEN
    : '<script' -> pushMode(SCRIPT_MODE)
    ;

// When we see '<style', switch to STYLE_MODE
STYLE_OPEN
    : '<style' -> pushMode(STYLE_MODE)
    ;

// When we see any other '<', switch to TAG_MODE
TAG_OPEN
    : '<' -> pushMode(TAG_MODE)
    ;

// --- Jinja / Templating ---
// These are captured as whole blocks in the default mode.
JINJA_EXPR
    : '{{' .*? '}}'
    ;

JINJA_STATEMENT
    : '{%' .*? '%}'
    ;

// --- Default Text ---
// Anything that is not a '<' or a '{' is considered text.
HTML_TEXT
    : ~[<{]+
    ;

// ======================================================
// 3. TAG_MODE (Inside a <...>)
// ======================================================
mode TAG_MODE;

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

// Attribute values can also contain Jinja
TAG_ATTVALUE_VALUE
    : '"' ( ~["] | JINJA_EXPR_IN_ATTR )*? '"'
    | '\'' ( ~['] | JINJA_EXPR_IN_ATTR )*? '\''
    ;

// Fragment to recognize Jinja inside attribute strings
fragment JINJA_EXPR_IN_ATTR
    : '{{' .*? '}}'
    ;

// ======================================================
// 4. SCRIPT_MODE (Inside a <script>...</script>)
// ======================================================
mode SCRIPT_MODE;

// First, handle the closing tag to exit the mode
SCRIPT_CLOSE
    : '</script>' -> popMode
    ;

// Then, consume everything else as the body
SCRIPT_BODY
    : .
    ;

// ======================================================
// 5. STYLE_MODE (Inside a <style>...</style>)
// ======================================================
mode STYLE_MODE;

// First, handle the closing tag to exit the mode
STYLE_CLOSE
    : '</style>' -> popMode
    ;

// Then, consume everything else as the body
STYLE_BODY
    : .
    ;

// ======================================================
// 6. FRAGMENTS (Helper rules)
// ======================================================
fragment TAG_NameChar
    : ~[ \t\r\n"'<>/=]
    ;



//
//
//
//HTML_COMMENT
//    : '<!--' .*? '-->' -> channel(HIDDEN)
//    ;
//
//HTML_CONDITIONAL_COMMENT
//    : '<![' .*? ']>' -> channel(HIDDEN)
//    ;
//
//XML_DECLARATION
//    : '<?xml' .*? '?>' -> channel(HIDDEN)
//    ;
//
//CDATA
//    : '<![CDATA[' .*? ']]>'
//    ;
//
//DTD
//    : '<!' .*? '>' -> channel(HIDDEN)
//    ;
//
//SCRIPTLET
//    : '<%' .*? '%>'
//    ;
//
//SEA_WS
//    : [ \t\r\n]+ -> channel(HIDDEN)
//    ;
//
//SCRIPT_OPEN
//    : '<script' ~'>'* '>' -> pushMode(SCRIPT)
//    ;
//
//STYLE_OPEN
//    : '<style' ~'>'* '>' -> pushMode(STYLE)
//    ;
//
//TAG_OPEN
//    : '<' -> pushMode(TAG)
//    ;
//
//HTML_TEXT
//    : ~'<'+
//    ;
//
//
//
//mode TAG;
//
//TAG_CLOSE
//    : '>' -> popMode
//    ;
//
//TAG_SLASH_CLOSE
//    : '/>' -> popMode
//    ;
//
//TAG_SLASH
//    : '/'
//    ;
//
//TAG_EQUALS
//    : '='
//    ;
//
//TAG_NAME
//    : TAG_NameChar+
//    ;
//
//TAG_WHITESPACE
//    : [ \t\r\n]+ -> channel(HIDDEN)
//    ;
//
//ATTVALUE_VALUE
//    : '"' ~'"'* '"'
//    | '\'' ~'\''* '\''
//    ;
//
//
//mode SCRIPT;
//
//SCRIPT_BODY
//    : .*? '</script>' -> popMode
//    ;
//
//
//
//mode STYLE;
//
//STYLE_BODY
//    : .*? '</style>' -> popMode
//    ;
//
//
//
//fragment
//TAG_NameChar
//    : ~[ \t\r\n"'<>/=-]
//    ;
