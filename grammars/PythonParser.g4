parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

prog
    : NEWLINE* (statement)* EOF         # Program
    ;

statement
    : (NEWLINE INDENT)? compound_stmt+ DEDENT?        # CompoundStatement
    | (NEWLINE INDENT)? PASS DEDENT?                  # PassStatement
    ;

compound_stmt
    : if_stmt      NEWLINE?      # IfStatement
    | assign_stmt  NEWLINE?      # AssignmentStatement
    | atom_expr    NEWLINE?      # AtomExpression
    | simple_expr  NEWLINE?      # SimpleExpression
    | for_loop     NEWLINE?      # ForLoopStatement
    | python_expr  NEWLINE?      # PythonExpression
    | func_def     NEWLINE?      # FunctionDefinition
    | return_stmt  NEWLINE?      # ReturnStatement
    | while_loop   NEWLINE?      # WhileStatement
    | import_from  NEWLINE?      # ImportStatement
    | import_stmt  NEWLINE?      # PlainImport
    | global_stmt  NEWLINE?      # GlobalStatement
    ;

return_stmt
    : RETURN python_expr      # ComplexReturn
    | RETURN atom             # SimpleReturn
    | RETURN arithmetic_expr  # ArithmeticReturn
    | RETURN condition        # ConditionReturn
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*    # GlobalStatementDef
    ;

import_from
    : FROM NAME (DOT NAME)* IMPORT imptd (COMMA imptd)* # ImportFromDef
    ;

import_stmt
    : IMPORT import_target (COMMA import_target)*   # ImportDef
    ;

import_target
    : NAME (DOT NAME)* (AS NAME)?   # ImportTargetDef
    ;

imptd
    : (NAME | CLASS_NAME) (AS (NAME | CLASS_NAME))?   # Imported
    ;

if_stmt
    : IF condition COLON statement
     ( ELIF condition COLON statement )*
     ( ELSE COLON statement )? # IfStatementDef
    ;

condition
    : bool_exp                               # BooleanCondition
    | NOT python_expr                        # NotExpression
    | python_expr (comp_op python_expr)*     # ComparisonExpression
    ;

python_expr
    : atom_expr                  # AtomComplexExpression
    | complex_expr               # ComplexExpression
    ;

atom_expr
    : atom LBRACK NUMBER RBRACK         # ListAccess
    | atom LBRACK STRING RBRACK         # DictionaryAccess
    | atom (DOT atom)+                  # AttributeAccess
    | atom (DOT atom_expr)+             # MethodAccess
    | CLASS_NAME LP arglist? RP         # ObjectCreation
    | NAME LP arglist? RP               # FunctionCall
    | atom                              # SimpleVar
    ;

complex_expr
    : LP for_loop RP               # Generator
    | LBRACK for_loop RBRACK       # ListComprehension
    | LKBRACE dict_maker? RKBRACE  # DictionaryLiteral
    | LBRACK list_items? RBRACK    # ListLiteral
    ;

comp_op
    : LT       # LessThanOperator
    | GT       # GreaterThanOperator
    | EQ       # EqualOperator
    | GTE      # GreaterEqualOperator
    | LTE      # LessEqualOperator
    | NEQ      # NotEqualOperator
    | OR       # OrOperator
    | IN       # InOperator
    | NOT IN   # NotInOperator
    | IS       # IsOperator
    | IS NOT   # IsNotOperator
    ;


assign_stmt
    : python_expr ASSIGN python_expr NEWLINE?       # PythonExpressionAssignStmt
    | python_expr ASSIGN condition NEWLINE?          # ComparisonAssignStmt
    | python_expr ASSIGN arithmetic_expr NEWLINE?    # ArithmeticAssignStmt
    | python_expr ASSIGN template_literal NEWLINE?    # TemplateLiteralAssignStmt
    ;

template_literal
    : TRIPLE_QUOTE_STRING  # TemplateLiteral;

for_loop
    : FOR atom IN python_expr COLON statement                  # SimpleForLoop
    | atom FOR atom IN python_expr (IF condition)?       # ComplexForLoop
    ;

while_loop
    : WHILE condition COLON statement   # WhileStatementDef
    ;

func_def
    : dec? DEF NAME parameters COLON statement      # FunctionDefDef
    ;

dec
    : AT NAME (DOT NAME)* ( LP arglist? RP )? NEWLINE       # Decorator
    ;

parameters
    : LP fun_params? RP  # FunctionParameters
    ;

fun_params
    : fun_param (COMMA fun_param)*   # FunctionParamList
    ;

fun_param
    : NAME ASSIGN atom   # ParamWithDefault
    | NAME               # ParamWithoutDefault
    ;

atom
    : NAME   # NameAtom
    | CLASS_NAME  # ClassAtom
    | NUMBER # NumberAtom
    | STRING # StringAtom
    | NONE   # NoneAtom
    | bool_exp # BooleanAtom
    ;

bool_exp:
    TRUE   # TrueAtom
    | FALSE  # FalseAtom
    ;

list_items
    : list_item (COMMA list_item)* COMMA? # ListItems
    ;

list_item
    : atom        # ScalarListItem
    | complex_expr # ComplexListItem
    ;

dict_maker
   : key_value ( COMMA key_value )* COMMA? # KeyValuePairs
   ;

key_value
   : atom COLON atom        # AtomKeyValue
   | atom COLON simple_expr # SimpleKeyValue
   ;

simple_expr
    : arithmetic_expr                           # ArithmeticExpression
    | condition                                 # SimpleComparisonExpression
    ;

arithmetic_expr
    : python_expr (PLUS python_expr)+           # Addition
    | python_expr (MINUS python_expr)+          # Subtraction
    | python_expr (SLASH python_expr)+          # Division
    | python_expr (STAR python_expr)+          # Multiplication
    ;

arglist
    : atom (COMMA atom )* COMMA?            # AtomArgs
    | argument (COMMA argument )* COMMA?    # ComplexArgs
    ;

argument
    : python_expr                 # PositionalArgument
    | NAME ASSIGN python_expr     # KeywordArgument
    ;