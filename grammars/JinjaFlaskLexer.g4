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
            // throw new InputMismatchException("Indentation error: Expected " + indents.peek() + ", got " + indent);
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

// Tokens (Top-level Python/Flask code)
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
ARROW : '->';

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

STRING: '\'' (~['\r\n])* '\'' | '"' (~["\r\n])* '"';

// Start rules push into HTMLMODE
TRIPLE_DOUBLE_START: '"""' -> pushMode(HTMLMODE);
TRIPLE_SINGLE_START: '\'\'\'' -> pushMode(HTMLMODE);


// =================== HTML MODE (JinjaFlask Templates) ===================

mode HTMLMODE;


TRIPLE_DOUBLE_END: '"""' -> popMode;
TRIPLE_SINGLE_END: '\'\'\'' -> popMode;

// =================== GLOBAL JINJA STARTS (Fixes Redefinition) ===================

JINJA_EXPR_START: '{{' -> pushMode(JINJA_EXPR);
JINJA_STMT_START: '{%' -> pushMode(JINJA_STMT);
JINJA_COMMENT_START: '{#' -> pushMode(JINJA_COMMENT);

HTML_COMMENT
    : 'd' -> channel(HIDDEN)
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

HTML_TEXT
    : .
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
COLOR_HEX
    : '#' (
          HEX_CHAR HEX_CHAR HEX_CHAR
        | HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR
        | HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR
        | HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR
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


// =================== JINJA MODES (Corrected to tokenize content) ===================

mode JINJA_EXPR;

// 1. Mode Exit
JINJA_EXPR_END: '}}' -> popMode;

// 2. Jinja Whitespace
J_WS : [ \t\r\n]+ -> skip ;

// 3. Literals & Identifiers (Prefixed with J_)
J_NUMBER : [0-9]+ ('.' [0-9]+)? ;
J_STRING
    : '"' ( ~["\\] | '\\' . )* '"'
    | '\'' ( ~['\\] | '\\' . )* '\''
    ;
J_NAME : [A-Za-z_][A-Za-z0-9_]* ;

// 4. Jinja/Python Operators/Delimiters
J_PLUS        : '+';
J_MINUS       : '-';
J_TIMES       : '*';
J_DIVIDE      : '/';
J_MOD         : '%';
J_POW         : '**';

J_EQ          : '==';
J_NE          : '!=';
J_LE          : '<=';
J_LT          : '<';
J_GE          : '>=';
J_GT          : '>';

J_ASSIGN      : '=';
J_DOT         : '.';
J_COMMA       : ',';
J_PIPE        : '|'; // For filters

J_LPAREN      : '(';
J_RPAREN      : ')';
J_LBRACK      : '[';
J_RBRACK      : ']';
J_LBRACE      : '{';
J_RBRACE      : '}';
J_COLON       : ':';

mode JINJA_STMT;

// 1. Mode Exit
JINJA_STMT_END: '%}' -> popMode;

// 2. Keywords
J_IF      : 'if' ;
J_ELIF    : 'elif' ;
J_ELSE    : 'else' ;
J_ENDIF   : 'endif' ;

J_FOR     : 'for' ;
J_IN      : 'in' ;
J_ENDFOR  : 'endfor' ;

J_SET     : 'set' ;
J_RAW     : 'raw' ;
J_ENDRAW  : 'endraw' ;

J_OR      : 'or' ;
J_AND     : 'and' ;
J_NOT     : 'not' ;

// 3. Re-use the same tokens as JINJA_EXPR (J_WS, J_NUMBER, J_NAME, J_PLUS, etc.)
J_WS_STMT : [ \t\r\n]+ -> skip ;

J_NUMBER_STMT : [0-9]+ ('.' [0-9]+)? ;
J_STRING_STMT
    : '"' ( ~["\\] | '\\' . )* '"'
    | '\'' ( ~['\\] | '\\' . )* '\''
    ;
J_NAME_STMT : [A-Za-z_][A-Za-z0-9_]* ;

J_PLUS_STMT        : '+';
J_MINUS_STMT       : '-';
J_TIMES_STMT       : '*';
J_DIVIDE_STMT      : '/';
J_MOD_STMT         : '%';
J_POW_STMT         : '**';

J_EQ_STMT          : '==';
J_NE_STMT          : '!=';
J_LE_STMT          : '<=';
J_LT_STMT          : '<';
J_GE_STMT          : '>=';
J_GT_STMT          : '>';

J_ASSIGN_STMT      : '=';
J_DOT_STMT         : '.';
J_COMMA_STMT       : ',';
J_PIPE_STMT        : '|';

J_LPAREN_STMT      : '(';
J_RPAREN_STMT      : ')';
J_LBRACK_STMT      : '[';
J_RBRACK_STMT      : ']';


mode JINJA_COMMENT;
JINJA_COMMENT_END: '#}' -> popMode;
// JINJA_COMMENT_CONTENT: Match all until '#}'
JINJA_COMMENT_CONTENT: . ; // CRITICAL FIX: Match any single character until the end tag is hit

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