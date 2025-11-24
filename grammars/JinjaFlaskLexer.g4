lexer grammar JinjaFlaskLexer;

@lexer::members {
    java.util.Stack<Integer> indents = new java.util.Stack<>();
    int opened = 0;

    private org.antlr.v4.runtime.CommonToken makeToken(int type, String text) {
        org.antlr.v4.runtime.CommonToken t = new org.antlr.v4.runtime.CommonToken(type, text);
        t.setLine(getLine());
        t.setCharPositionInLine(getCharPositionInLine());
        return t;
    }

    private int getIndentCount(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '\t') count += 8 - (count % 8);
            else count += 1;
        }
        return count;
    }
}

// --------------------
// WHITESPACE & COMMENTS
// --------------------
WS      : [ \t]+ -> skip;
COMMENT : '#' ~[\r\n]* -> skip;

// --------------------
// INDENT / DEDENT / NEWLINE
// --------------------
INDENT  : '<INDENT>';  // injected from NEWLINE actions
DEDENT  : '<DEDENT>';

NEWLINE
    : ('\r'? '\n') [ \t]* {
        String spaces = getText().replaceAll("\\r?\\n", "");
        int indent = getIndentCount(spaces);
        int prev = indents.isEmpty() ? 0 : indents.peek();

        if (opened == 0) { // only handle indentation outside parentheses/braces
            if (indent > prev) {
                indents.push(indent);
                emit(makeToken(INDENT, spaces));
            } else if (indent < prev) {
                while (!indents.isEmpty() && indents.peek() > indent) {
                    emit(makeToken(DEDENT, ""));
                    indents.pop();
                }
            }
        }
    }
    ;

// --------------------
// PYTHON TOKENS
// --------------------
IF    : 'if';
WHILE : 'while';
FOR   : 'for';
IN    : 'in';
DEF   : 'def';

NAME    : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER  : [0-9]+ ('.' [0-9]+)? ;
STRING  : '\'' (~['\\\r\n])* '\''
        | '"'  (~["\\\r\n])* '"' ;

ASSIGN  : '=' ;
PLUS    : '+' ;
MINUS   : '-' ;
STAR    : '*' ;
SLASH   : '/' ;
COLON   : ':' ;
COMMA   : ',' ;
SEMI    : ';' ;
LPAREN  : '(' { opened++; } ;
RPAREN  : ')' { if (opened>0) opened--; } ;
LBRACK  : '[' { opened++; } ;
RBRACK  : ']' { if (opened>0) opened--; } ;
LBRACE  : '{' { opened++; } ;
RBRACE  : '}' { if (opened>0) opened--; } ;

// Triple-quoted strings
PY_TRIPLE_START1 : '"""' -> pushMode(TEMPLATE);
PY_TRIPLE_START2 : '\'\'\'' -> pushMode(TEMPLATE);

// Single Python line
PY_LINE : ~[\r\n]+ ;

// --------------------
// HTML MODE
// --------------------
mode HTML;
HTML_OPEN  : '<' [a-zA-Z!] [^>]* '>' -> pushMode(HTML);
HTML_CLOSE : '</' [a-zA-Z]+ [^>]* '>' -> popMode;
HTML_TEXT  : (~('<' | '{' | '\r' | '\n'))+ ;
HTML_ANY   : . ;

// --------------------
// CSS MODE
// --------------------
mode CSS;
CSS_TEXT    : (~('<' | '{' | '\r' | '\n'))+ ;
STYLE_CLOSE : '</style>' -> popMode;
CSS_ANY     : . ;

// --------------------
// JINJA MODE
// --------------------
mode JINJA;
JINJA_VAR_CLOSE    : '}}' -> popMode;
JINJA_STMT_CLOSE   : '%}' -> popMode;
JINJA_COMMENT_CLOSE: '#}' -> popMode;
JINJA_CONTENT      : (~('}'|'%'))+ ;
JINJA_ANY          : . ;

// --------------------
// TEMPLATE MODE (triple-quoted strings)
// --------------------
mode TEMPLATE;
TEMPLATE_TRIPLE_END1 : '"""' -> popMode;
TEMPLATE_TRIPLE_END2 : '\'\'\'' -> popMode;
TEMPLATE_TEXT       : (~('"'))+ ;
TEMPLATE_ANY        : . ;
