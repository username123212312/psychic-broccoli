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

JINJA_EXPR_START: '{{' -> pushMode(JINJA_MODE);
JINJA_STMT_START: '{%' -> pushMode(JINJA_MODE);
JINJA_COMMENT_START: '{#' -> pushMode(JINJA_MODE);

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
   : ~[<{"] (~[<{"])*
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

CSS_LBRACE     : '{' ;
CSS_RBRACE     : '}' ;
CSS_LPAREN     : '(' ;
CSS_RPAREN     : ')' ;
CSS_COLON      : ':' ;
CSS_SEMI       : ';' ;
CSS_COMMA      : ',' ;
CSS_DOT        : '.' ;
CSS_GT         : '>' ;
CSS_HEX_COLOR  : '#' ( [0-9a-fA-F] [0-9a-fA-F] [0-9a-fA-F] )+ ;
CSS_NUMBER     : ( '0' | [1-9] [0-9]* ) ( '.' [0-9]+ )? ;
CSS_UNIT       : ( 'px' | 'fr' | '%' | 'em' | 'vh' | 'vw' | 'rem') ;
CSS_STRING     : '"' (~'"')* '"' | '\'' (~'\'')* '\'' ;
CSS_ID         : [a-zA-Z] [a-zA-Z0-9\-]* ;
CSS_Space      : [ \t\r\n]+ -> skip ;
CSS_Comment    : '/*' .*? '*/' -> skip ;

CSS_HASH: '#' Name;
fragment Name: Nmchar+;
fragment Nmchar: [_a-zA-Z0-9\-] | Nonascii | Escape;
fragment Nonascii: ~[\u0000-\u007f];
fragment Escape: Unicode | '\\' ~[\r\n\f0-9a-fA-F];
fragment Hex: [0-9a-fA-F];
fragment Unicode: '\\' Hex Hex? Hex? Hex? Hex? Hex?;

// =================== JINJA MODE (Unified Jinja Logic) ===================

mode JINJA_MODE;

JINJA_EXPR_END : '}}' -> popMode;
JINJA_STMT_END : '%}' -> popMode;

J_EXTENDS    : 'extends'  ;
J_BLOCK      : 'block'    ;
J_ENDBLOCK   : 'endblock' ;
J_FOR        : 'for'      ;
J_ENDFOR     : 'endfor'   ;
J_IF         : 'if'       ;
J_ENDIF      : 'endif'    ;
J_IN         : 'in'       ;
J_LENGTH     : 'length'   ;
J_OR         : 'or'       ;
J_AND        : 'and'      ;
J_NOT        : 'not'      ;
J_IS         : 'is'       ;
J_FILTER     : 'filter'   ;
J_TRUE       : 'true'     ;
J_FALSE      : 'false'    ;
J_NONE       : 'none'     ;

J_LPAREN     : '(' ;
J_RPAREN     : ')' ;
J_COMMA      : ',' ;
J_DOT        : '.' ;
J_PIPE       : '|' ;
J_EQ         : '==' ;
J_NEQ        : '!=' ;
J_GT         : '>' ;
J_LT         : '<' ;
J_ASSIGN     : '=' ;
J_NUMBER     : [0-9]+ ('.' [0-9]+)? ;
J_STRING     : '"' (~'"')* '"' | '\'' (~'\'')* '\'' ;
J_NAME       : [a-zA-Z_] [a-zA-Z0-9_]* ;
J_WS         : [ \t\r\n]+ -> skip ;

//// =================== FRAGMENTS (Helper Rules) ===================

fragment
TAG_NameChar
    : ~[ \t\r\n"'<>/=-]
    ;

//
////fragment
////Name
////    : '-'? [a-zA-Z_] [a-zA-Z0-9_-]*
////    ;
//
//fragment
//HEX_CHAR
//    : [0-9a-fA-F]
//    ;