parser grammar JinjaFlaskParser;

// import lexer

options {tokenVocab=JinjaFlaskLexer;}

@header {
    package antlr;
}

prog: TRUE
| FALSE
;