parser grammar JinjaFlaskParser;

// import lexer

options {tokenVocab=JinjaFlaskLexer;}

@header {
    package antlr;
}

file
    : element* EOF
    ;

element
    : python_block
    | html_block
    | jinja_unit
    | template_block
    ;

python_block
    : PY_LINE+ (NEWLINE? (INDENT python_stmt+ DEDENT)?)?
    ;

python_stmt
    : simple_stmt
    | compound_stmt
    ;

simple_stmt
    : small_stmt (SEMI small_stmt)* NEWLINE?
    ;

small_stmt
    : assign_stmt
    | expr_stmt
    ;

assign_stmt
    : NAME ASSIGN expr
    ;

expr_stmt
    : expr
    ;

compound_stmt
    : if_stmt
    | while_stmt
    | for_stmt
    | funcdef
    ;

if_stmt
    : IF expr COLON (NEWLINE INDENT python_stmt+ DEDENT)?
    ;

while_stmt
    : WHILE expr COLON (NEWLINE INDENT python_stmt+ DEDENT)?
    ;

for_stmt
    : FOR NAME IN expr COLON (NEWLINE INDENT python_stmt+ DEDENT)?
    ;

funcdef
    : DEF NAME LPAREN (NAME (COMMA NAME)*)? RPAREN COLON (NEWLINE INDENT python_stmt+ DEDENT)?
    ;

expr
    : term ((PLUS|MINUS) term)*
    ;

term
    : factor ((STAR|SLASH) factor)*
    ;

factor
    : NUMBER
    | NAME
    | STRING
    | LPAREN expr RPAREN
    ;

html_block
    : HTML_OPEN html_content* HTML_CLOSE?
    ;

html_content
    : HTML_TEXT
    | jinja_unit
    | html_block
    ;

jinja_unit
    : JINJA_VAR_OPEN JINJA_CONTENT JINJA_VAR_CLOSE
    | JINJA_STMT_OPEN JINJA_CONTENT JINJA_STMT_CLOSE
    | JINJA_COMMENT_OPEN JINJA_CONTENT JINJA_COMMENT_CLOSE
    ;

template_block
    : PY_TRIPLE_START TEMPLATE_TEXT* PY_TRIPLE_START?
    ;
