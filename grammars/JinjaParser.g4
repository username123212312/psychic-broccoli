parser grammar JinjaParser;

options {
    tokenVocab = JinjaLexer;
}

// ===============================
//  Entry POINT
// ===============================

jinja_content
    : jinja_part* EOF
    ;

 jinja_template_block
     : jinja_part*
     ;

// ===============================
//  Parts (text / output / statements)
// ===============================

jinja_part
    : jinja_output
    | jinja_statement
    | TEXT
    ;

// ===============================
//  {{ jinja_expression }}
// ===============================
jinja_output
    : JINJA_LVAR jinja_expr JINJA_RVAR
    ;

// ===============================
//  {% statements %}
// ===============================
jinja_statement
    : jinja_ifStatement
    | jinja_forStatement
    | jinja_setStatement
    | jinja_rawStatement
    ;

// ===============================
//  IF / ELIF / ELSE
// ===============================
jinja_ifStatement
    : JINJA_LBLOCK IF jinja_expr JINJA_RBLOCK
        jinja_template_block
        jinja_elifBlock*
        jinja_elseBlock?
      JINJA_LBLOCK ENDIF JINJA_RBLOCK
    ;

jinja_elifBlock
    : JINJA_LBLOCK ELIF jinja_expr JINJA_RBLOCK
        jinja_template_block
    ;

jinja_elseBlock
    : JINJA_LBLOCK ELSE JINJA_RBLOCK
        jinja_template_block
    ;

// ===============================
//  FOR
// ===============================
jinja_forStatement
    : JINJA_LBLOCK FOR NAME IN jinja_expr JINJA_RBLOCK jinja_template_block JINJA_LBLOCK ENDFOR JINJA_RBLOCK
    ;

// ===============================
//  SET
// ===============================
jinja_setStatement
    : JINJA_LBLOCK SET NAME ASSIGN jinja_expr JINJA_RBLOCK
    ;

// ===============================
//  RAW
// ===============================
jinja_rawStatement
    : JINJA_LBLOCK RAW JINJA_RBLOCK jinja_rawText JINJA_LBLOCK ENDRAW JINJA_RBLOCK
    ;

jinja_rawText
    : TEXT+
    ;

// ===============================
//  Expressions
// ===============================

jinja_expr
    : jinja_logicalOr
    ;

jinja_logicalOr
    : jinja_logicalAnd ( OR jinja_logicalAnd )*
    ;

jinja_logicalAnd
    : jinja_equality ( AND jinja_equality )*
    ;


// ==  !=
jinja_equality
    : jinja_comparison ( (EQ | NE) jinja_comparison )*
    ;

// < <= > >=
jinja_comparison
    : jinja_addition ( (LT | LE | GT | GE) jinja_addition )*
    ;

// + -
jinja_addition
    : jinja_multiplication ( (PLUS | MINUS) jinja_multiplication )*
    ;

// * / %
jinja_multiplication
    : jinja_unary ( (TIMES | DIVIDE | MOD) jinja_unary )*
    ;

// unary + -
jinja_unary
    : (PLUS | MINUS) jinja_unary
    | jinja_primary
    ;

// primary atoms
jinja_primary
    : jinja_atom ( jinja_trailer )*
    ;

jinja_atom
    : NAME
    | NUMBER
    | STRING
    | LPAREN jinja_expr RPAREN
    ;

jinja_trailer
    : DOT NAME
    | LBRACK jinja_expr RBRACK
    | LPAREN (jinja_expr (COMMA jinja_expr)*)? RPAREN
    ;


