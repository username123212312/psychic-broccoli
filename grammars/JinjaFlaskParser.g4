parser grammar JinjaFlaskParser;
options { tokenVocab=JinjaFlaskLexer; }

@header { package antlr; }

prog: statement* EOF #Program;

// --------------------- STATEMENTS ---------------------
statement
    : importStmt
    | tripleQuotedTemplate
    | decorator
    | assignment
    | globalStmt
    | ifStmt
    | functionDef
    | returnStmt
    | exprStmt
    ;

// --------------------- SIMPLE STATEMENTS ---------------------
importStmt
    : FROM NAME IMPORT NAME (COMMA NAME)* COMMA? (AS NAME)?
    | IMPORT NAME (COMMA NAME)* COMMA? (AS NAME)?
    ;

globalStmt
    : GLOBAL NAME (COMMA NAME)*
    ;

exprStmt
    : expr
    ;

decorator
    : AT attributeAccess LP routeArgs? RP
    ;

// 🟢 FIX FOR "extraneous input '='": allow attribute/subscript assignment on LHS
assignment
    : assignTarget ASSIGN expr
    ;

// Defines what can be on the left side of the ASSIGN operator
assignTarget
    : NAME
    | attributeAccess
    | expr LBRACK expr RBRACK // Allows array/dictionary assignment: products[0] = 1
    ;

returnStmt
    : RETURN expr?
    ;

// --------------------- CONTROL FLOW ---------------------
functionDef
    : DEF NAME LP paramList? RP (COLON block)?
    ;

paramList
    : NAME (COMMA NAME)*
    ;

ifStmt
    : IF expr (COLON block)?
      (ELIF expr (COLON block)?)*
      (ELSE (COLON block)?)?
    ;

// --------------------- BLOCK ---------------------
block
    : INDENT statement+ DEDENT
    ;

// --------------------- EXPRESSIONS ---------------------
// Organized by precedence (tightest binding first)
expr
    // Lowest Precedence: Logical
    : expr OR expr                               # OrExpr
    | expr AND expr                              # AndExpr

    // Unary Operators
    | NOT expr                                   # NotExpr

    // Comparison Operators
    | expr (EQ | NEQ | GT | LT | GTE | LTE) expr # ComparisonExpr

    // Arithmetic (Add/Subtract)
    | expr (PLUS | MINUS) expr                   # AddSubExpr

    // Arithmetic (Multiply/Divide)
    | expr (STAR | SLASH) expr                   # MulDivExpr

    // Highest Precedence: Primary Atoms & Member Access
    | atom                                       # AtomExpr
    | expr LBRACK expr RBRACK                    # SubscriptExpr  // products[0]
    | expr LP argList? RP                        # FnCallExpr     // func(x)
    | expr DOT NAME                              # AttributeExpr  // request.form
    ;

atom
    : NAME
    | NUMBER
    | STRING
    | TRUE | FALSE | NONE
    | tripleQuotedTemplate
    | listLiteral
    | dictLiteral
    | LP expr RP
    | generatorExpr
    ;

// --------------------- ARGUMENTS & CALLS ---------------------
argList
    : argument (COMMA argument)* COMMA?
    ;

argument
    : expr                 // Positional arg: "index.html"
    | NAME ASSIGN expr     // Keyword arg: products=products
    ;

// --------------------- DATA STRUCTURES ---------------------
// Supports both [1,2] and [p for p in products]

listLiteral
    : LBRACK (expr (COMMA expr)* COMMA?)? RBRACK # ListElements
    | LBRACK expr FOR NAME IN expr (IF expr)? RBRACK # ListComp
    ;

dictLiteral
    : LBRACE (entry (COMMA entry)* COMMA?)? RBRACE
    ;

entry
    : expr COLON expr
    ;

generatorExpr
    : LP expr FOR NAME IN expr (IF expr)? RP
    ;

// --------------------- MISC HELPERS ---------------------
attributeAccess
    : NAME (DOT NAME)+
    ;

// --------------------- TEMPLATES ---------------------
tripleQuotedTemplate
    : TRIPLE_DOUBLE_START templateContent* TRIPLE_DOUBLE_END
    | TRIPLE_SINGLE_START templateContent* TRIPLE_SINGLE_END
    ;

templateContent
    : HTML_CONTENT
    | jinjaExpr
    | jinjaStmt
    | jinjaComment
    | styleBlock
    ;

jinjaExpr: JINJA_EXPR_START JINJA_EXPR_CONTENT? JINJA_EXPR_END;
jinjaStmt: JINJA_STMT_START JINJA_STMT_CONTENT? JINJA_STMT_END;
jinjaComment: JINJA_COMMENT_START JINJA_COMMENT_CONTENT? JINJA_COMMENT_END;

styleBlock: STYLE_START CSS_CONTENT STYLE_END;

// --------------------- FLASK ROUTE ARGS ---------------------
routeArgs
    : STRING (COMMA routeOptions?)?
    ;

routeOptions
    : NAME ASSIGN LBRACK STRING (COMMA STRING)* RBRACK
    ;