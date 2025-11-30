lexer grammar JinjaFlaskLexer;

// Tokens are defined in the parser file, but we redefine the virtual ones here for reference
tokens { INDENT, DEDENT }

@lexer::header {
package antlr;
    import org.antlr.v4.runtime.CommonToken;
    import org.antlr.v4.runtime.Token;
    import java.util.*;
    import org.antlr.v4.runtime.CharStream;
    import org.antlr.v4.runtime.TokenSource;
    import org.antlr.v4.runtime.misc.Pair;
}

@lexer::members {
  public static final int HIDDEN = 1;
  public static final int DEFAULT = Token.DEFAULT_CHANNEL;

  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
  private java.util.LinkedList<Token> pending = new java.util.LinkedList<>();
  // The stack that keeps track of the indentation level.
  private java.util.Stack<Integer> indents = new java.util.Stack<>();
  // The amount of opened braces, brackets and parenthesis.
  private int opened = 0;

  // CRITICAL FIX: Ensure the indentation stack is initialized with 0
  {
      indents.push(0);
  }

  // Helper method to emit tokens into the pending queue.
  public void emit(Token t) {
    super.setToken(t);
    pending.offer(t);
  }

  private Token createDedent() {
    return commonToken(DEDENT, "<DEDENT>");
  }

  private CommonToken commonToken(int type, String text) {
    int stop = this.getCharIndex() - 1;
    int start = text.isEmpty() ? stop : stop - text.length() + 1;
    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
  }

  static int getIndentationCount(String spaces) {
    int count = 0;
    for (char ch : spaces.toCharArray()) {
      switch (ch) {
        case '\t':
          count += 8 - (count % 8);
          break;
        default:
          count++;
      }
    }
    return count;
  }
}

// =================== LEXER RULES (Hybrid Indentation) ===================

NEWLINE
 : ( '\r'? '\n' | '\r' ) [ \t]*
   {
     String newLine = getText().replaceAll("[^\r\n]+", "");
     String spaces = getText().replaceAll("[\r\n]+", "");
     int next = _input.LA(1);

     if (opened > 0 || next == '\r' || next == '\n' || next == '#') {
       skip();
     }
     else {
       emit(commonToken(JinjaFlaskLexer.NEWLINE, newLine));

       int indent = getIndentationCount(spaces);
       int previous = indents.peek();

       if (indent > previous) {
         indents.push(indent);
         emit(commonToken(JinjaFlaskLexer.INDENT, spaces));
       }
       else if (indent < previous) {
         while(!indents.isEmpty() && indents.peek() > indent) {
           this.emit(createDedent());
           indents.pop();
         }
         if (indents.peek() != indent) {
            // Indentation error detection
         }
       }
       skip();
     }
   }
   -> channel(HIDDEN)
 ;

// Intra-line whitespace
WS: [ \t]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

// Tokens
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
PRINT : 'print' ;
WHILE : 'while';


AT: '@';
COLON   : ':' ;
SEMI    : ';' ;
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
SLASHSLASH  : '//' ;


LP: {opened++;} '(';
RP: {opened--;} ')';
LBRACK: {opened++;} '[';
RBRACK: {opened--;} ']';
LBRACE: {opened++;} '{';
RBRACE: {opened--;} '}';
DOT: '.';

NAME: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+ ('.' [0-9]+)? ;

TRIPLE_DOUBLE_STRING
    : '"""' ( options {greedy=false;} : . )*? '"""'
    ;

TRIPLE_SINGLE_STRING
    : '\'\'\'' ( options {greedy=false;} : . )*? '\'\'\''
    ;

STRING: '\'' (~['\r\n])* '\'' | '"' (~["\r\n])* '"';



// =================== GLOBAL JINJA STARTS (Fixes Redefinition) ===================

// These must be defined globally to be visible in both HTMLMODE and STYLE mode
// without causing redefinition errors.
JINJA_EXPR_START: '{{' -> pushMode(JINJA_EXPR);
JINJA_STMT_START: '{%' -> pushMode(JINJA_STMT);
JINJA_COMMENT_START: '{#' -> pushMode(JINJA_COMMENT);

// Start rules push into HTMLMODE
TRIPLE_DOUBLE_START: '"""' -> pushMode(HTMLMODE);
TRIPLE_SINGLE_START: '\'\'\'' -> pushMode(HTMLMODE);


// =================== HTML MODE (JinjaFlask Templates) ===================

mode HTMLMODE;

// 1. Jinja Mode Switching is now handled by the global definitions above.

// 2. Triple Quote End (Mode exit)
TRIPLE_DOUBLE_END: '"""' -> popMode;
TRIPLE_SINGLE_END: '\'\'\'' -> popMode;

// 3. HTML Comment/Declaration Tokens (From provided HTML Lexer)
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

// 4. Mode-Pushing Tag Starts
SCRIPT_OPEN
    : '<script' ~'>'* '>' -> pushMode(SCRIPT)
    ;

STYLE_OPEN
    : '<style' ~'>'* '>' -> pushMode(STYLE)
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;

// 5. Default Content Text (Must consume everything that isn't a Jinja or HTML start/end)
HTML_TEXT
    : ~[<{\\'"]+
    ;


// =================== TAG MODE (Inside <...>) ===================
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


// =================== SCRIPT MODE (Raw Text) ===================
mode SCRIPT;

SCRIPT_BODY
    : .*? '</script>' -> popMode
    ;


// =================== STYLE MODE (CSS Parsing) ===================
mode STYLE;

// 1. Mode Exit (Must be prioritized)
STYLE_CLOSE
    : '</style' ~'>'* '>' -> popMode
    ;

// 2. Jinja transitions are handled by the global start tokens.

// 3. CSS Whitespace & Comments (Skip)
CSS_WS
    : [ \t\r\n\f]+ -> skip
    ;

CSS_COMMENT
    : '/*' .*? '*/' -> skip
    ;

// 4. Basic Symbols (CRITICAL: Renamed to avoid conflicts)
CSS_LBRACE      : '{'; // Renamed from LBRACE
CSS_RBRACE      : '}'; // Renamed from RBRACE
CSS_COLON       : ':'; // Renamed from COLON
CSS_SEMICOLON   : ';';
CSS_LPAREN      : '('; // Renamed from LP
CSS_RPAREN      : ')'; // Renamed from RP
CSS_COMMA       : ','; // Renamed from COMMA
CSS_DOT         : '.'; // Renamed from DOT
CSS_SLASH       : '/'; // Renamed from SLASH
CSS_PERCENT     : '%';
CSS_PLUS        : '+'; // Renamed from PLUS
CSS_GREATER     : '>';
CSS_TILDE       : '~';
CSS_EQUALS      : '='; // Renamed from ASSIGN
CSS_LBRACKET    : '['; // Renamed from LBRACK
CSS_RBRACKET    : ']'; // Renamed from RBRACKET
CSS_ASTERISK    : '*'; // Renamed from STAR


// 4. At-Rules Keywords (Unique names, no change)
AT_IMPORT       : '@import';
AT_MEDIA        : '@media';
AT_FONT_FACE    : '@font-face';
AT_KEYFRAMES    : '@keyframes';
AT_SUPPORTS     : '@supports';

// 5. Functions & Complex Tokens (CRITICAL: Renamed to avoid conflicts)
//
//FUNCTION
//    : Name
//    ;

CSS_NUMBER // Renamed from NUMBER (Conflict with Python)
    : [0-9]+ ('.' [0-9]+)?
    ;

// CRITICAL FIX: Explicitly spell out the repetitions to avoid compilation issues
// caused by the {N} operator in ANTLR's Java Lexer action generation.
COLOR_HEX
    : '#' (
          HEX_CHAR HEX_CHAR HEX_CHAR                    // #rgb (3 chars)
        | HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR          // #rgba (4 chars)
        | HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR // #rrggbb (6 chars)
        | HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR // #rrggbbaa (8 chars)
      )
    ;

CSS_STRING // Renamed from STRING (Conflict with Python)
    : '"' ( ~["\\\r\n] | '\\' . )* '"'
    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
    ;

// 6. Selectors & Identifiers (Unique names, no change)
HASH
    : '#' Name
    ;

CLASS
    : '.' Name
    ;

PSEUDO_ELEMENT
    : '::' Name
    ;

PSEUDO_CLASS
    : ':' Name
    ;

// Generic Identifier (Must be last)
IDENT
    : Name
    ;


// =================== JINJA MODES (From previous JinjaFlask Lexer) ===================

mode JINJA_EXPR;
JINJA_EXPR_END: '}}' -> popMode;
// JINJA_EXPR_CONTENT: Match all until '}}'
JINJA_EXPR_CONTENT: (~'}')+ ;

mode JINJA_STMT;
JINJA_STMT_END: '%}' -> popMode;
// JINJA_STMT_CONTENT: Match all until '%}'
JINJA_STMT_CONTENT: (~'%')+ ;

mode JINJA_COMMENT;
JINJA_COMMENT_END: '#}' -> popMode;
// JINJA_COMMENT_CONTENT: Match all until '#}'
JINJA_COMMENT_CONTENT: (~'#')+ ;


// =================== FRAGMENTS (Helper Rules) ===================

fragment
TAG_NameChar
    : ~[ \t\r\n"'<>/=-]
    ;

fragment
Name
    : '-'? [a-zA-Z_] [a-zA-Z0-9_-]*
    ;

fragment
HEX_CHAR
    : [0-9a-fA-F]
    ;