parser grammar JinjaFlaskParser;

@header {package antlr;}

@parser::members {
    private void trace(String rule) {
        System.out.println("ENTER RULE: " + rule + " at token " + _input.LT(1).getText());
    }
}

options { tokenVocab=JinjaFlaskLexer; }

prog
    : NEWLINE* (statement)* EOF         #Program
    ;

statement
    : (NEWLINE INDENT)? simple_stmt+ DEDENT?          #SimpleStatement
    | (NEWLINE INDENT)? compound_stmt+ DEDENT?        #CompoundStatement
    ;

compound_stmt
    : if_stmt                   # IfStatement
    | assign_stmt               # AssignmentStatement
    | for_loop                  # ForLoopStatement
    | python_expr               # PythonExprStatement
    | func_def                  # FunctionDefinition
    ;

simple_stmt
    : return_stmt  NEWLINE?      # ReturnStatement
    | import_from  NEWLINE?      # ImportStatement
    | global_stmt  NEWLINE?      # GlobalStatement
    | python_expr  NEWLINE?      # PythonExprssionStatement
    ;

return_stmt
    : RETURN python_expr      # ComplexReturn
    | RETURN atom             # SimpleReturn
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*            
    ;

import_from
    : FROM NAME (DOT NAME)* IMPORT NAME (AS NAME)? (COMMA NAME (AS NAME)?)*   
    ;

if_stmt
    : IF comparison COLON statement ( ELIF comparison COLON statement )* ( ELSE COLON statement )?
    ;

comparison
    : NOT python_expr                        # NotExpression
    | python_expr (comp_op python_expr)*     # ComparisonExpression
    ;

python_expr
    : complex_expr               # ComplexExpression
    | atom complex_expr*         # AtomcomplexExpression
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
    : python_expr ASSIGN comparison NEWLINE?          # ComparisonAssignStmt
    | python_expr ASSIGN template_literal NEWLINE?    # TemplateLiteralAssignStmt
    ;

template_literal
   : TRIPLE_DOUBLE_START html_content  TRIPLE_DOUBLE_END      # HtmlContentDoubleTemplate
   | TRIPLE_SINGLE_START html_content  TRIPLE_SINGLE_END      # HtmlContentSingleTemplate
   ;

for_loop
    : FOR python_expr IN python_expr statement            # SimpleForLoop
    | atom FOR python_expr IN atom (IF comparison)*       # ComplexForLoop
    ;

func_def
    : dec? DEF NAME parameters COLON function_body
    ;

dec
    : AT NAME (DOT NAME)* ( LP arglist? RP )? NEWLINE       # Decorator
    ;

parameters
    : LP typedargslist? RP  # FunctionParameters
    ;

typedargslist
    : NAME (COMMA NAME)*    # FunctionArgumentsList
    ;

function_body
    : statement         # FunctionBody
    | PASS NEWLINE      # PassBody
    ;

complex_expr
    : LP for_loop RP               # ParenthesizedForLoop
    | LP arglist? RP               # FunctionCall
    | LBRACK for_loop? RBRACK      # ListComprehension
    | LBRACK comparison RBRACK     # Subscription      // (or SubscriptAccess)
    | LKBRACE dict_maker? RKBRACE  # DictionaryLiteral
    | LBRACK exprlist? RBRACK      # ListLiteral      
    | DOT NAME                     # AttributeAccess
    ;

atom
    : NAME   # NameAtom
    | NUMBER # NumberAtom
    | STRING # StringAtom
    | NONE   # NoneAtom
    | TRUE   # TrueAtom
    | FALSE  # FalseAtom
    ;

exprlist
    : atom (COMMA atom)* COMMA? # ExpressionList
    ;

dict_maker
   : atom COLON (simple_expr) ( COMMA atom COLON simple_expr )* COMMA?
   ;

simple_expr
    : python_expr (PLUS python_expr)*           # AdditionExpression
    | comparison                                # ComparisonExprssion
    ;

arglist
    :  argument (COMMA argument )* COMMA?        # ArgumentsList
    ;

argument
    : python_expr                 # SimpleArgument
    | NAME ASSIGN python_expr     # AssignArgument
    ;

//==========================HTML RULES=====================
html_content
    : html_content_item* # HtmlContent
    ;

html_content_item
    : htmlElement     # HtmlElementItem
    | HTML_TEXT       # HtmlTextItem
    | jinjaStatement  # JinjaStmtItem
    | jinjaExpression # JinjaExprItem
    ;

htmlElement
    // Regular HTML tags
    : TAG_OPEN tag_content* (TAG_CLOSE | TAG_SLASH_CLOSE) # TagElement

    // Special elements with content
    | SCRIPT_OPEN SCRIPT_BODY                             # ScriptElement
    | STYLE_OPEN style_sheet STYLE_CLOSE                   # StyleElement

    // XML/HTML special constructs
    | XML_DECLARATION                                     # ProcessingInstruction
    | CDATA                                               # CDataSection
    | DTD                                                 # DocTypeDeclaration
    | SCRIPTLET                                           # ServerScript
    ;

tag_content
    // Attribute definitions
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)? # HtmlAttribute

    // Dynamic/Jinja content
    | jinjaExpression # DynamicExpression
    | jinjaStatement  # DynamicStatement

    // Syntax markers
    | TAG_SLASH  # ClosingMarker
    | TAG_EQUALS # AssignmentOperator
    ;


//===============CSS RULE======================

style_sheet
    : ( CSS_Space | CSS_Comment )* ruleSet ( ( CSS_Space | CSS_Comment )* ruleSet )* ( CSS_Space | CSS_Comment )* # StyleSheet
    ;

ruleSet
    : selector_list
      (CSS_Space | CSS_Comment)* CSS_LBRACE
      declarationList
      CSS_RBRACE # CssRule
    ;

selector_list
    : selector (( CSS_Space | CSS_Comment )* CSS_COMMA ( CSS_Space | CSS_Comment )* selector )* # SelectorList
    ;

selector
    : simpleSelector (( CSS_Space+ | CSS_GT ) ( CSS_Space | CSS_Comment )* simpleSelector )* # ComplexSelector
    ;

simpleSelector
    : CSS_ID ( CSS_DOT CSS_ID | CSS_HASH CSS_ID )* # QualifiedSelector
    | ( CSS_DOT CSS_ID CSS_ID? | CSS_HASH CSS_ID )+ # ClassOrIdSelector
    | CSS_ID # SimpleIdSelector
    ;

declarationList
    : ( declaration ( css_spacing declaration )* )? # DeclarationBlock
    ;

declaration
    : CSS_ID css_spacing CSS_COLON css_spacing cssValueTerms css_spacing CSS_SEMI # CssDeclaration
    ;

cssValueTerms
    : cssterm ( css_spacing cssterm )* # CssValueList
    ;

cssterm
    : css_function_call # FunctionTerm
    | CSS_STRING      # StringTerm
    | CSS_HEX_COLOR   # ColorTerm
    | CSS_NUMBER CSS_UNIT # UnitNumberTerm
    | CSS_NUMBER      # NumberTerm
    | CSS_ID          # IdentifierTerm
    ;

css_spacing
    : (CSS_Space | CSS_Comment)* # CssWhitespace
    ;


css_function_call
    : CSS_ID CSS_LPAREN css_spacing css_function_args? css_spacing CSS_RPAREN # CssFunctionCall
    ;

css_function_args
    : cssValueTerms ( css_spacing CSS_COMMA css_spacing cssValueTerms )* # FunctionArguments
    ;
//=================jinja rules======================
jinjaStatement
   : JINJA_STMT_START jStatement # JinjaStmtNode
   ;

jinjaExpression
    : JINJA_EXPR_START j_expression JINJA_EXPR_END # JinjaExprNode
    ;

jStatement
    : j_extends_stmt # JinjaExtendsStmt
    | j_block_stmt   # JinjaBlockStmt
    | j_for_stmt     # JinjaForStmt
    | j_if_stmt      # JinjaIfStmt
    ;

j_extends_stmt
    : J_EXTENDS J_STRING JINJA_STMT_END # JinjaExtendsDirective
    ;

j_block_stmt
    : J_BLOCK J_NAME JINJA_STMT_END
      html_content
      JINJA_STMT_START J_ENDBLOCK ( J_NAME )? JINJA_STMT_END # JinjaBlockDefinition
    ;

j_for_stmt
    : J_FOR J_NAME J_IN j_expression JINJA_STMT_END
      html_content
      JINJA_STMT_START J_ENDFOR JINJA_STMT_END # JinjaForLoop
    ;

j_if_stmt
    : J_IF j_expression JINJA_STMT_END
      html_content
      JINJA_STMT_START J_ENDIF JINJA_STMT_END # JinjaConditional
    ;

j_expression
    : j_call_expr ( J_EQ | J_NEQ | J_GT | J_LT ) j_call_expr # JinjaBinaryExpr
    | j_call_expr # JinjaSimpleExpr
    ;

j_call_expr
    : j_var_access ( J_PIPE (J_NAME | J_LENGTH) )? # JinjaFilteredExpr
    | J_NAME J_LPAREN j_argument_list? J_RPAREN    # JinjaFunctionCall
    | j_var_access                                 # JinjaVarAccessOnly
    | j_atom                                       # JinjaAtomOnly
    ;

j_var_access
    : J_NAME ( J_DOT J_NAME )* # JinjaDottedName
    ;

j_argument_list
    : j_argument ( J_COMMA j_argument )* # JinjaArgList
    ;

j_argument
    : j_expression            # JinjaPosArg
    | J_NAME J_ASSIGN j_expression # JinjaKwArg
    ;

j_atom
    : J_NUMBER # JinjaNumberAtom
    | J_STRING # JinjaStringAtom
    | J_TRUE   # JinjaTrueAtom
    | J_FALSE  # JinjaFalseAtom
    | J_NONE   # JinjaNoneAtom
    | J_NAME   # JinjaNameAtom
    ;