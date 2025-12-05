lexer grammar JinjaFlaskLexer;

// Tokens are defined in the parser file, but we redefine the virtual ones here for reference
tokens { INDENT, DEDENT }

channels {
    ERROR
}
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

Plus: '+';

Minus: '-';

Greater: '>';

Comma: ',';

Tilde: '~';
OpenBracket  : '[';
CloseBracket : ']';
OpenParen    : '(';
CloseParen   : ')';
OpenBrace    : '{';
CloseBrace   : '}';
SemiColon    : ';';
Equal        : '=';
Colon        : ':';
Dot          : '.';
Multiply     : '*';
Divide       : '/';
Pipe         : '|';
Underscore   : '_';



// CSS2.2 Grammar defines the following, but I'm not sure how to add them to parser for error handling
// BadString :
// BadUri :
// BadComment :
// BadUri :

Comment: '/*' ~'*'* '*'+ ( ~[/*] ~'*'* '*'+)* '/' -> skip;



Url: U R L '(' Whitespace ( [!#$%&*-~] | Nonascii | Escape)* Whitespace ')';

Space: [ \t\r\n\f]+ -> skip;



Cdo: '<!--';

Cdc: '-->';

Includes: '~=';

DashMatch: '|=';

Hash: '#' Name;

Import: At I M P O R T;

Page: At P A G E;

Media: At M E D I A;

Namespace: At N A M E S P A C E;

Charset: '@charset ';

Important: '!' ( Space | Comment)* I M P O R T A N T;



Percentage: Number '%';

Url_: 'url(';

UnicodeRange:
    [u|U] '+?' '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' Hex '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' Hex Hex '?'? '?'? '?'? '?'?
    | [u|U] '+' Hex Hex Hex '?'? '?'? '?'?
    | [u|U] '+' Hex Hex Hex Hex '?'? '?'?
    | [u|U] '+' Hex Hex Hex Hex Hex '?'?
;

// https://www.w3.org/TR/css3-mediaqueries/
MediaOnly: O N L Y;

Not: N O T;

And: A N D;


Dimension: Length | Time | Freq | Resolution | Angle;

UnknownDimension: Number Ident;


PseudoNot: ':' N O T '(';

Number: [0-9]+ | [0-9]* '.' [0-9]+;

String_:
    '"' (~[\n\r\f\\"] | '\\' Newline | Nonascii | Escape)* '"'
    | '\'' ( ~[\n\r\f\\'] | '\\' Newline | Nonascii | Escape)* '\''
;

PrefixMatch: '^=';

SuffixMatch: '$=';

SubstringMatch: '*=';

// https://www.w3.org/TR/css-fonts-3/#font-face-rule
FontFace: At F O N T DashChar F A C E;

// https://www.w3.org/TR/css3-conditional/
Supports: At S U P P O R T S;

Or: O R;

// https://www.w3.org/TR/css3-animations/


Keyframes: At VendorPrefix? K E Y F R A M E S;

From: F R O M;

To: T O;

// https://www.w3.org/TR/css3-values/#calc-syntax
Calc: 'calc(';

// https://www.w3.org/TR/css-device-adapt-1/
Viewport: At V I E W P O R T;

// https://www.w3.org/TR/css-counter-styles-3/
CounterStyle: At C O U N T E R DashChar S T Y L E;

// https://www.w3.org/TR/css-fonts-3/
FontFeatureValues: At F O N T DashChar F E A T U R E DashChar V A L U E S;

// https://msdn.microsoft.com/en-us/library/ms532847.aspx
DxImageTransform: 'progid:DXImageTransform.Microsoft.' Function_;

AtKeyword: At Ident;

// Variables
// https://www.w3.org/TR/css-variables-1
Variable: '--' Nmstart Nmchar*;

Var: 'var(';

// Give Ident least priority so that more specific rules matches first
Ident: '-'? Nmstart Nmchar*;

Function_: Ident '(';

UnexpectedCharacter: . -> channel(ERROR);


fragment At: '@';

fragment Hex: [0-9a-fA-F];

fragment NewlineOrSpace: '\r\n' | [ \t\r\n\f] |;

fragment Unicode: '\\' Hex Hex? Hex? Hex? Hex? Hex? NewlineOrSpace;

fragment Escape: Unicode | '\\' ~[\r\n\f0-9a-fA-F];

fragment Nmstart: [_a-zA-Z] | Nonascii | Escape;

fragment Nmchar: [_a-zA-Z0-9\-] | Nonascii | Escape;

fragment VendorPrefix: '-' M O Z '-' | '-' W E B K I T '-' | '-' O '-';

// https://www.w3.org/TR/css3-selectors/
fragment Nonascii: ~[\u0000-\u007f];

fragment Resolution: Number D P I | Number D P C M | Number D P P X;

fragment Length: AbsLength | FontRelative | ViewportRelative;

fragment FontRelative: Number E M | Number E X | Number C H | Number R E M;

// https://www.w3.org/TR/css3-values/#viewport-relative-lengths
fragment ViewportRelative: Number V W | Number V H | Number V M I N | Number V M A X;

fragment AbsLength:
    Number P X
    | Number C M
    | Number M M
    | Number I N
    | Number P T
    | Number P C
    | Number Q
;

fragment Angle: Number D E G | Number R A D | Number G R A D | Number T U R N;

fragment Time: Number M S | Number S;

fragment Freq: Number H Z | Number K H Z;

fragment Whitespace: Space |;

fragment Newline: '\n' | '\r\n' | '\r' | '\f';

fragment ZeroToFourZeros: '0'? '0'? '0'? '0'?;

fragment A: 'a' | 'A' | '\\' ZeroToFourZeros ('41' | '61') NewlineOrSpace;

fragment B: 'b' | 'B' | '\\' ZeroToFourZeros ('42' | '62') NewlineOrSpace;

fragment C: 'c' | 'C' | '\\' ZeroToFourZeros ('43' | '63') NewlineOrSpace;

fragment D: 'd' | 'D' | '\\' ZeroToFourZeros ('44' | '64') NewlineOrSpace;

fragment E: 'e' | 'E' | '\\' ZeroToFourZeros ('45' | '65') NewlineOrSpace;

fragment F: 'f' | 'F' | '\\' ZeroToFourZeros ('46' | '66') NewlineOrSpace;

fragment G: 'g' | 'G' | '\\' ZeroToFourZeros ('47' | '67') NewlineOrSpace | '\\g' | '\\G';

fragment H: 'h' | 'H' | '\\' ZeroToFourZeros ('48' | '68') NewlineOrSpace | '\\h' | '\\H';

fragment I: 'i' | 'I' | '\\' ZeroToFourZeros ('49' | '69') NewlineOrSpace | '\\i' | '\\I';

fragment K: 'k' | 'K' | '\\' ZeroToFourZeros ('4b' | '6b') NewlineOrSpace | '\\k' | '\\K';

fragment L: 'l' | 'L' | '\\' ZeroToFourZeros ('4c' | '6c') NewlineOrSpace | '\\l' | '\\L';

fragment M: 'm' | 'M' | '\\' ZeroToFourZeros ('4d' | '6d') NewlineOrSpace | '\\m' | '\\M';

fragment N: 'n' | 'N' | '\\' ZeroToFourZeros ('4e' | '6e') NewlineOrSpace | '\\n' | '\\N';

fragment O: 'o' | 'O' | '\\' ZeroToFourZeros ('4f' | '6f') NewlineOrSpace | '\\o' | '\\O';

fragment P: 'p' | 'P' | '\\' ZeroToFourZeros ('50' | '70') NewlineOrSpace | '\\p' | '\\P';

fragment Q: 'q' | 'Q' | '\\' ZeroToFourZeros ('51' | '71') NewlineOrSpace | '\\q' | '\\Q';

fragment R: 'r' | 'R' | '\\' ZeroToFourZeros ('52' | '72') NewlineOrSpace | '\\r' | '\\R';

fragment S: 's' | 'S' | '\\' ZeroToFourZeros ('53' | '73') NewlineOrSpace | '\\s' | '\\S';

fragment T: 't' | 'T' | '\\' ZeroToFourZeros ('54' | '74') NewlineOrSpace | '\\t' | '\\T';

fragment U: 'u' | 'U' | '\\' ZeroToFourZeros ('55' | '75') NewlineOrSpace | '\\u' | '\\U';

fragment V: 'v' | 'V' | '\\' ZeroToFourZeros ('56' | '76') NewlineOrSpace | '\\v' | '\\V';

fragment W: 'w' | 'W' | '\\' ZeroToFourZeros ('57' | '77') NewlineOrSpace | '\\w' | '\\W';

fragment X: 'x' | 'X' | '\\' ZeroToFourZeros ('58' | '78') NewlineOrSpace | '\\x' | '\\X';

fragment Y: 'y' | 'Y' | '\\' ZeroToFourZeros ('59' | '79') NewlineOrSpace | '\\y' | '\\Y';

fragment Z: 'z' | 'Z' | '\\' ZeroToFourZeros ('5a' | '7a') NewlineOrSpace | '\\z' | '\\Z';

fragment DashChar: '-' | '\\' ZeroToFourZeros '2d' NewlineOrSpace;

fragment Name: Nmchar+;
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

//TEXT : (~[{}]|'{'~[{]|'}'~[}])+ ;

mode JINJA_COMMENT;
JINJA_COMMENT_END: '#}' -> popMode;
// JINJA_COMMENT_CONTENT: Match all until '#}'
JINJA_COMMENT_CONTENT: . ; // CRITICAL FIX: Match any single character until the end tag is hit

// =================== FRAGMENTS (Helper Rules) ===================

fragment
TAG_NameChar
    : ~[ \t\r\n"'<>/=-]
    ;

//fragment
//Name
//    : '-'? [a-zA-Z_] [a-zA-Z0-9_-]*
//    ;

fragment
HEX_CHAR
    : [0-9a-fA-F]
    ;