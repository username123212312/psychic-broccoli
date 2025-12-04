parser grammar JinjaParser;

options {
    tokenVocab = JinjaLexer;
}

// ===============================
//  Entry POINT
// ===============================

template_root
    : part* EOF
    ;

 template_block
     : part*
     ;

// ===============================
//  Parts (text / output / statements)
// ===============================

part
    : output
    | statement
    | TEXT
    ;

// ===============================
//  {{ expression }}
// ===============================
output
    : JINJA_LVAR expr JINJA_RVAR
    ;

// ===============================
//  {% statements %}
// ===============================
statement
    : ifStatement
    | forStatement
    | setStatement
    | rawStatement
    ;

// ===============================
//  IF / ELIF / ELSE
// ===============================
ifStatement
    : JINJA_LBLOCK IF expr JINJA_RBLOCK
        template_block
        elifBlock*
        elseBlock?
      JINJA_LBLOCK ENDIF JINJA_RBLOCK
    ;

elifBlock
    : JINJA_LBLOCK ELIF expr JINJA_RBLOCK
        template_block
    ;

elseBlock
    : JINJA_LBLOCK ELSE JINJA_RBLOCK
        template_block
    ;

// ===============================
//  FOR
// ===============================
forStatement
    : JINJA_LBLOCK FOR NAME IN expr JINJA_RBLOCK template_block JINJA_LBLOCK ENDFOR JINJA_RBLOCK
    ;

// ===============================
//  SET
// ===============================
setStatement
    : JINJA_LBLOCK SET NAME ASSIGN expr JINJA_RBLOCK
    ;

// ===============================
//  RAW
// ===============================
rawStatement
    : JINJA_LBLOCK RAW JINJA_RBLOCK rawText JINJA_LBLOCK ENDRAW JINJA_RBLOCK
    ;

rawText
    : TEXT+
    ;

// ===============================
//  Expressions
// ===============================

expr
    : logicalOr
    ;

logicalOr
    : logicalAnd ( OR logicalAnd )*
    ;

logicalAnd
    : equality ( AND equality )*
    ;


// ==  !=
equality
    : comparison ( (EQ | NE) comparison )*
    ;

// < <= > >=
comparison
    : addition ( (LT | LE | GT | GE) addition )*
    ;

// + -
addition
    : multiplication ( (PLUS | MINUS) multiplication )*
    ;

// * / %
multiplication
    : unary ( (TIMES | DIVIDE | MOD) unary )*
    ;

// unary + -
unary
    : (PLUS | MINUS) unary
    | primary
    ;

// primary atoms
primary
    : atom ( trailer )*
    ;

atom
    : NAME
    | NUMBER
    | STRING
    | LPAREN expr RPAREN
    ;

trailer
    : DOT NAME
    | LBRACK expr RBRACK
    | LPAREN (expr (COMMA expr)*)? RPAREN
    ;


