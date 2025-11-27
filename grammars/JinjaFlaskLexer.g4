lexer grammar JinjaFlaskLexer;

@lexer::header {
    import org.antlr.v4.runtime.CommonToken;
    import org.antlr.v4.runtime.Token;
    import java.util.*;
    import org.antlr.v4.runtime.CharStream; // Added for robust indentation
}

@lexer::members {
    private List<Token> pending = new ArrayList<>();
    private Stack<Integer> indents = new Stack<>();
    { indents.push(0); }
    private int opened = 0; // For tracking open parentheses/brackets

    // Helper method to accurately measure indentation depth from the character stream.
    private int getIndentation() {
        // Start reading from the current position after the NEWLINE token has been consumed.
        int charIndex = _input.index();
        int indent = 0;

        while (charIndex < _input.size()) {
            int charCode = _input.LA(charIndex - _input.index() + 1); // Peek ahead

            if (charCode == ' ') {
                indent++;
            } else if (charCode == '\t') {
                indent += 4 - (indent % 4);
            } else if (charCode == '\r' || charCode == '\n') {
                // Ignore empty lines
                charIndex++;
                continue;
            } else {
                // Found non-whitespace character (start of a statement)
                return indent;
            }
            charIndex++;
        }
        return indent; // Should only happen at EOF
    }

    @Override
    public Token nextToken() {
        if (!pending.isEmpty()) {
            return pending.remove(0);
        }

        Token t = super.nextToken();

        if (t.getType() == NEWLINE) {
            if (opened == 0) {
                // CRITICAL: Calculate new indent based on the raw character stream
                int newIndent = getIndentation();

                int previousIndent = indents.isEmpty() ? 0 : indents.peek();

                if (newIndent > previousIndent) {
                    indents.push(newIndent);
                    pending.add(commonToken(INDENT, "<INDENT>"));
                } else if (newIndent < previousIndent) {
                    while (newIndent < previousIndent) {
                        indents.pop();
                        pending.add(commonToken(DEDENT, "<DEDENT>"));
                        previousIndent = indents.isEmpty() ? 0 : indents.peek();

                        if (previousIndent < newIndent) {
                            // Inconsistent indentation, stop unwinding here
                            break;
                        }
                    }
                }
            }
            // Since NEWLINE is hidden, we recursively call nextToken()
            return nextToken();

        } else if (t.getType() == EOF) {
            // Unwind stack at EOF
            while (!indents.isEmpty() && indents.peek() != 0) {
                indents.pop();
                pending.add(commonToken(DEDENT, "<DEDENT>"));
            }
            if (!pending.isEmpty()) {
                return pending.remove(0);
            }
        }

        return t;
    }

    public Token commonToken(int type, String text) {
        // Use the same robust token creation as the last step
        CommonToken token = new CommonToken(this._tokenFactory, type, Token.DEFAULT_CHANNEL, this._tokenStartCharIndex, this._input.index() - 1);
        token.setText(text);
        token.setLine(this._tokenStartLine);
        token.setCharPositionInLine(this._tokenStartCharPositionInLine);
        token.setTokenIndex(-1); // Virtual token
        return token;
    }
}

// =================== DEFAULT MODE (Python) ===================
WS: [ \t]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

// --- Keywords (Must be before NAME) ---
DEF: 'def';
RETURN: 'return';
FROM: 'from';
IMPORT: 'import';
AS: 'as';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
IN: 'in';
GLOBAL: 'global';
AND: 'and';
OR: 'or';
NOT: 'not';
TRUE: 'True';
FALSE: 'False';
NONE: 'None';

// --- Punctuation ---
AT: '@';
COLON: ':';
COMMA: ',';
ASSIGN: '=';
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';

LP: '(' { opened++; } ;
RP: ')' { if (opened>0) opened--; } ;
LBRACK: '[' { opened++; } ;
RBRACK: ']' { if (opened>0) opened--; } ;
LBRACE: '{' { opened++; } ;
RBRACE: '}' { if (opened>0) opened--; } ;
DOT: '.';

NAME: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;

// --- Indentation ---
INDENT: '<INDENT>';
DEDENT: '<DEDENT>';

NEWLINE
    :   ('\r'? '\n') [ \t]*
        -> channel(HIDDEN)
    ;

// --- Strings ---
STRING
    : '\'' (~['\r\n])* '\''
    | '"' (~["\r\n])* '"'
    ;

TRIPLE_DOUBLE_START: '"""' -> pushMode(HTMLMODE);
TRIPLE_SINGLE_START: '\'\'\'' -> pushMode(HTMLMODE);

OTHER: . ;

// =================== HTMLMODE ===================
mode HTMLMODE;
STYLE_START: '<style>' -> pushMode(CSSMODE);
JINJA_EXPR_START: '{{' -> pushMode(JINJA_EXPR);
JINJA_STMT_START: '{%' -> pushMode(JINJA_STMT);
JINJA_COMMENT_START: '{#' -> pushMode(JINJA_COMMENT);
TRIPLE_DOUBLE_END: '"""' -> popMode;
TRIPLE_SINGLE_END: '\'\'\'' -> popMode;
HTML_CONTENT
    : ( ~[<{"'] | '<' ~'s' | '{' ~[#{%] | '"' ~'"' | '\'' ~'\'' )+ ;

// =================== CSS MODE ===================
mode CSSMODE;
STYLE_END: '</style>' -> popMode;
CSS_CONTENT: ( ~'<' | '<' ~'/' | '</' ~'s' | '</s' ~'t' | '</st' ~'y' | '</sty' ~'l' | '</styl' ~'e' )+ ;

// =================== JINJA MODES ===================
mode JINJA_EXPR;
JINJA_EXPR_END: '}}' -> popMode;
JINJA_EXPR_CONTENT: (~'}')+ ;

mode JINJA_STMT;
JINJA_STMT_END: '%}' -> popMode;
JINJA_STMT_CONTENT: (~'%')+ ;

mode JINJA_COMMENT;
JINJA_COMMENT_END: '#}' -> popMode;
JINJA_COMMENT_CONTENT: (~'#')+ ;
