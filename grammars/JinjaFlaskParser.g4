parser grammar JinjaFlaskParser;

@header {package antlr;}

options { tokenVocab=JinjaFlaskLexer; }

// ======================================================
// 1. ROOT RULE (The Entry Point)
// ======================================================

// The parser expects a sequence of Python statements until End of File
program
    : (statement | NEWLINE)* EOF
    ;

// ======================================================
// 2. PYTHON STATEMENTS
// ======================================================

statement
    : compound_stmt
    | simple_stmt
    ;
// (statement {
// simple_stmt{
// small_stmt
// }
// Simple statements are one-liners (imports, assignments, expressions)
simple_stmt
    : ( small_stmt (SEMI small_stmt)* )? (SEMI | NEWLINE)
    ;

small_stmt
    : assign_stmt
    | import_stmt
    | return_stmt
    | global_stmt
    | expr
    | flow_stmt
    ;

// Compound statements involve indentation (def, if, decorators)
compound_stmt
    : if_stmt
    | func_def
    | decorated
    ;

// ======================================================
// 3. THE BRIDGE: ASSIGNMENT & TEMPLATES
// ======================================================

// This is the critical rule for your test file.
// It handles: 'x = 1' AND 'BASE_HTML = """<html>..."""'
assign_stmt
    : NAME ASSIGN ( test | template_literal )
    ;

// This rule triggers the parsing of the HTML/Jinja inside the strings
template_literal
    : TRIPLE_DOUBLE_START html_content TRIPLE_DOUBLE_END
    | TRIPLE_SINGLE_START html_content TRIPLE_SINGLE_END
    ;

// We will define 'html_content' in the next step.
// It is the container for all your HTML and Jinja logic.
html_content
    : ( htmlElement | jinjaStatement | jinjaExpression | HTML_TEXT )*
    ;

// ======================================================
// 4. IMPORTS & GLOBALS
// ======================================================

import_stmt
    : import_name
    | import_from
    ;

import_name
    : IMPORT dotted_name (AS NAME)?
    ;

import_from
    : FROM dotted_name IMPORT (STAR | import_as_names)
    ;

import_as_names
    : import_as_name (COMMA import_as_name)*
    ;

import_as_name
    : NAME (AS NAME)?
    ;

dotted_name
    : NAME (DOT NAME)*
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*
    ;

// ======================================================
// 5. FUNCTIONS & DECORATORS
// ======================================================

// Handles: @app.route("/") def index(): ...
decorated
    : decorators func_def
    ;

decorators
    : decorator+
    ;

decorator
    : AT dotted_name ( LP arglist? RP )? NEWLINE
    ;

func_def
    : DEF NAME parameters (ARROW test)? COLON suite
    ;

parameters
    : LP typedargslist? RP
    ;

typedargslist
    // Simplified: just a list of names for now, can be expanded for defaults/types
    : NAME (COMMA NAME)*
    ;

// ======================================================
// 6. CONTROL FLOW & BLOCKS (The "Suite")
// ======================================================

if_stmt
    : IF test COLON suite
      ( ELIF test COLON suite )*
      ( ELSE COLON suite )?
    ;

return_stmt
    : RETURN testlist?
    ;

flow_stmt
    : return_stmt
    // | raise_stmt | break_stmt (add these if needed later)
    ;

// The "Suite" is the core of Python indentation handling.
// It matches either a one-liner: "if True: return 1"
// OR an indented block.
suite
    : simple_stmt
    | NEWLINE INDENT statement+ DEDENT
    ;

// ======================================================
// 7. PLACEHOLDERS FOR EXPRESSIONS (Step 3)
// ======================================================

// We need these so the parser compiles, but we will fill them in Step 3.

testlist: test (COMMA test)*;

// ======================================================
// 8. PYTHON EXPRESSIONS (The "test" rule)
// ======================================================

// The top-level expression wrapper
test
    : or_test
    ;

// Logical OR (lowest precedence)
or_test
    : and_test (OR and_test)*
    ;

// Logical AND
and_test
    : not_test (AND not_test)*
    ;

// Logical NOT
not_test
    : NOT not_test
    | comparison
    ;

// Comparisons (==, !=, <, >, in)
comparison
    : expr (comp_op expr)*
    ;

comp_op
    : LT | GT | EQ | NEQ | GTE | LTE
    | IN | NOT IN
    // Note: 'IS' is not in your lexer, but 'IN' is.
    ;

// ======================================================
// 9. ARITHMETIC
// ======================================================

expr
    : term ((PLUS | MINUS) term)*
    ;

term
    : factor ((STAR | SLASH | SLASHSLASH) factor)* // Modulo (%) missing in lexer
    ;

factor
    : (PLUS | MINUS) factor
    | power
    ;

power
    : atom_expr // Power (**) not strictly in lexer top-level, so we skip to atoms
    ;

// ======================================================
// 10. ATOMS & TRAILERS (Calls, Attributes, Slices)
// ======================================================

// Handles: func(), obj.prop, list[0]
atom_expr
    : atom trailer*
    ;

trailer
    : LP arglist? RP        // Function call: func(arg)
    | LBRACK test RBRACK    // Indexing: list[0]
    | DOT NAME              // Attribute: obj.name
    ;

// The basic building blocks of data
atom
    : NAME
    | NUMBER
    | STRING+                   // Implicit concatenation: "a" "b" -> "ab"
    | NONE | TRUE | FALSE
    | LP test? RP               // Parentheses (grouping) or Tuples
    | LBRACK list_content? RBRACK  // Lists & List Comprehensions
    | LBRACE dict_maker? RBRACE // Dictionaries
    ;

// ======================================================
// 11. DATA STRUCTURES & ARGUMENTS
// ======================================================

// Handles both [1, 2] AND [x for x in y]
list_content
    : test comp_for             // List Comprehension
    | test (COMMA test)* // Standard List
    ;

comp_for
    : FOR test IN test (IF test)*
    ;

// Dictionary: {"key": value, "k2": v2}
dict_maker
    : test COLON test (COMMA test COLON test)*
    ;

// Function Arguments: (a, b=1)
arglist
    : argument (COMMA argument)*
    ;

argument
    : test              // Positional: 10
    | NAME ASSIGN test  // Keyword: debug=True
    ;
// Continuation of JinjaFlaskParser.g4

// ======================================================
// 12. HTML TEMPLATE CONTENT (The root of the template string)
// ======================================================

htmlElement
    : TAG_OPEN tag_content* (TAG_CLOSE | TAG_SLASH_CLOSE) // e.g., <div class="prod">
    | SCRIPT_OPEN SCRIPT_BODY                            // <script>...</script>
    | STYLE_OPEN stylesheet STYLE_CLOSE               // <style>...</style>
    | XML_DECLARATION
    | CDATA
    | DTD
    | SCRIPTLET
    ;

tag_content
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)? // Basic attribute name="value"
    | jinjaExpression // Jinja inside attribute values: <img src="{{ p.img }}">
    | jinjaStatement  // Jinja inside tag body: <div {% if cond %}>
    | TAG_SLASH
    | TAG_EQUALS
    ;



stylesheet
    :  (charset ( Comment | Space | Cdo | Cdc)*)* (imports ( Comment | Space | Cdo | Cdc)*)* (
        namespace_ ( Comment | Space | Cdo | Cdc)*
    )* (nestedStatement ( Comment | Space | Cdo | Cdc)*)* EOF
    ;

charset
    : Charset  String_  SemiColon  # goodCharset
    | Charset  String_         # badCharset
    ;

imports
    : Import  (String_ | url)  mediaQueryList SemiColon  # goodImport
    | Import  ( String_ | url)  SemiColon                # goodImport
    | Import  ( String_ | url)  mediaQueryList       # badImport
    | Import  ( String_ | url)                       # badImport
    ;

// Namespaces
// https://www.w3.org/TR/css-namespaces-3/
namespace_
    : Namespace  (namespacePrefix )? (String_ | url)  SemiColon  # goodNamespace
    | Namespace  (namespacePrefix )? ( String_ | url)        # badNamespace
    ;

namespacePrefix
    : ident
    ;

// Media queries
// https://www.w3.org/TR/css3-mediaqueries/
media
    : Media  mediaQueryList groupRuleBody
    ;

mediaQueryList
    : (mediaQuery ( Comma  mediaQuery)*)?
    ;

mediaQuery
    : (MediaOnly | Not)?  mediaType  (And  mediaExpression)*
    | mediaExpression ( And  mediaExpression)*
    ;

mediaType
    : ident
    ;

mediaExpression
    : OpenParen  mediaFeature (Colon  css_expr)? CloseParen
    // Grammar allo for 'and(', which gets tokenized as Function. In practice, people always insert space before OpenParen to have it work on Chrome.
    ;

mediaFeature
    : ident
    ;

// Page
page
    : Page  pseudoPage? OpenBrace  declaration? (SemiColon  declaration?)* CloseBrace
    ;

pseudoPage
    : Colon ident
    ;

// Selectors
// https://www.w3.org/TR/css3-selectors/
selectorGroup
    : selector (Comma  selector)*
    ;

selector
    : simpleSelectorSequence  (combinator simpleSelectorSequence)*
    ;

combinator
    : Plus
    | Greater
    | Tilde
    | Space
    ;

simpleSelectorSequence
    : (typeSelector | universal) (Hash | className | attrib | pseudo | negation)*
    | ( Hash | className | attrib | pseudo | negation)+
    ;

typeSelector
    : typeNamespacePrefix? elementName
    ;

typeNamespacePrefix
    : (ident | Multiply)? Pipe
    ;

elementName
    : ident
    ;

universal
    : typeNamespacePrefix? Multiply
    ;

className
    : Dot ident
    ;

attrib
    : OpenBracket  typeNamespacePrefix? ident  (
        (PrefixMatch | SuffixMatch | SubstringMatch | Equal | Includes | DashMatch)  (
            ident
            | String_
        )
    )? CloseBracket
    ;

pseudo
    /* '::' starts a pseudo-element, Colon a pseudo-class */
    /* Exceptions: :first-line, :first-letter, :before And :after. */
    /* Note that pseudo-elements are restricted to one per selector And */
    /* occur MediaOnly in the last simple_selector_sequence. */
    : Colon Colon? (ident | functionalPseudo)
    ;

functionalPseudo
    : Function_  expression CloseParen
    ;

expression
    /* In CSS3, the expressions are identifiers, strings, */
    /* or of the form "an+b" */
    : (( Plus | Minus | Dimension | UnknownDimension | Number | String_ | ident) )+
    ;

negation
    : PseudoNot  negationArg  CloseParen
    ;

negationArg
    : typeSelector
    | universal
    | Hash
    | className
    | attrib
    | pseudo
    ;

// Rules
operator_
    : Divide    # goodOperator
    | Comma  # goodOperator
    | Space  # goodOperator
    | Equal    # badOperator // IE filter and DXImageTransform function
    ;

property_
    : ident     # goodProperty
    | Variable  # goodProperty
    | Multiply ident   # badProperty // IE hacks
    | '_' ident   # badProperty // IE hacks
    ;

ruleset
    : selectorGroup OpenBrace  declarationList? CloseBrace  # knownRuleset
    | any_* OpenBrace  declarationList? CloseBrace          # unknownRuleset
    ;

declarationList
    : (SemiColon )* declaration  (SemiColon  declaration?)*
    ;

declaration
    : property_ Colon  css_expr prio? # knownDeclaration
    | property_ Colon  value      # unknownDeclaration
    ;

prio
    : Important
    ;

value
    : (any_ | block | AtKeyword )+
    ;

css_expr
    : css_term (operator_? css_term)*
    ;

css_term
    : number            # knownTerm
    | percentage        # knownTerm
    | dimension         # knownTerm
    | String_           # knownTerm
    | UnicodeRange      # knownTerm
    | ident             # knownTerm
    | var_                # knownTerm
    | url               # knownTerm
    | hexcolor            # knownTerm
    | calc                # knownTerm
    | function_           # knownTerm
    | unknownDimension  # unknownTerm
    | dxImageTransform    # badTerm
    ;

function_
    : Function_  css_expr CloseParen
    ;

dxImageTransform
    : DxImageTransform  css_expr CloseParen  // IE DXImageTransform function
    ;

hexcolor
    : Hash
    ;

number
    : (Plus | Minus)? Number
    ;

percentage
    : (Plus | Minus)? Percentage
    ;

dimension
    : (Plus | Minus)? Dimension
    ;

unknownDimension
    : (Plus | Minus)? UnknownDimension
    ;

// Error handling
any_
    : ident
    | number
    | percentage
    | dimension
    | unknownDimension
    | String_
    //| Delim     // Not implemented yet
    | url
    | Hash
    | UnicodeRange
    | Includes
    | DashMatch
    | Colon
    | Function_  ( any_ | unused)* CloseParen
    | OpenParen  ( any_ | unused)* CloseParen
    | OpenBracket  ( any_ | unused)* CloseBracket
    ;

atRule
    : AtKeyword  any_* (block | SemiColon ) # unknownAtRule
    ;

unused
    : block
    | AtKeyword
    | SemiColon
    | Cdo
    | Cdc
    ;

block
    : OpenBrace  (declarationList | nestedStatement | any_ | block | AtKeyword  | SemiColon )* CloseBrace
    ;

// Conditional
// https://www.w3.org/TR/css3-conditional/
nestedStatement
    : ruleset
    | media
    | page
    | fontFaceRule
    | keyframesRule
    | supportsRule
    | viewport
    | counterStyle
    | fontFeatureValuesRule
    | atRule
    ;

groupRuleBody
    : OpenBrace  nestedStatement* CloseBrace
    ;

supportsRule
    : Supports  supportsCondition  groupRuleBody
    ;

supportsCondition
    : supportsNegation
    | supportsConjunction
    | supportsDisjunction
    | supportsConditionInParens
    ;

supportsConditionInParens
    : OpenParen  supportsCondition  CloseParen
    | supportsDeclarationCondition
    | generalEnclosed
    ;

supportsNegation
    : Not  Space  supportsConditionInParens
    ;

supportsConjunction
    : supportsConditionInParens ( Space  And  Space  supportsConditionInParens)+
    ;

supportsDisjunction
    : supportsConditionInParens ( Space  Or  Space  supportsConditionInParens)+
    ;

supportsDeclarationCondition
    : OpenParen  declaration CloseParen
    ;

generalEnclosed
    : (Function_ | OpenParen) (any_ | unused)* CloseParen
    ;

// Url
// https://www.w3.org/TR/css3-values/#urls
url
    : Url_  String_  CloseParen
    | Url
    ;

// Variable
// https://www.w3.org/TR/css-variables-1
var_
    : Var  Variable  CloseParen
    ;

// Calc
// https://www.w3.org/TR/css3-values/#calc-syntax
calc
    : Calc  calcSum CloseParen
    ;

calcSum
    : calcProduct (Space  ( Plus | Minus)  Space  calcProduct)*
    ;

calcProduct
    : calcValue (Multiply  calcValue | Divide  number )*
    ;

calcValue
    : number
    | dimension
    | unknownDimension
    | percentage
    | OpenParen  calcSum CloseParen
    ;

// Font face
// https://www.w3.org/TR/2013/CR-css-fonts-3-20131003/#font-face-rule
fontFaceRule
    : FontFace  OpenBrace  fontFaceDeclaration? (SemiColon  fontFaceDeclaration?)* CloseBrace
    ;

fontFaceDeclaration
    : property_ Colon  css_expr # knownFontFaceDeclaration
    | property_ Colon  value # unknownFontFaceDeclaration
    ;

// Animations
// https://www.w3.org/TR/css3-animations/
keyframesRule
    : Keyframes  Space  ident  OpenBrace  keyframeBlock* CloseBrace
    ;

keyframeBlock
    : (keyframeSelector OpenBrace  declarationList? CloseBrace )
    ;

keyframeSelector
    : (From | To | Percentage)  (Comma  ( From | To | Percentage) )*
    ;

// Viewport
// https://www.w3.org/TR/css-device-adapt-1/
viewport
    : Viewport  OpenBrace  declarationList? CloseBrace
    ;

// Counter style
// https://www.w3.org/TR/css-counter-styles-3/
counterStyle
    : CounterStyle  ident  OpenBrace  declarationList? CloseBrace
    ;

// Font feature values
// https://www.w3.org/TR/css-fonts-3/
fontFeatureValuesRule
    : FontFeatureValues  fontFamilyNameList  OpenBrace  featureValueBlock* CloseBrace
    ;

fontFamilyNameList
    : fontFamilyName ( Comma  fontFamilyName)*
    ;

fontFamilyName
    : String_
    | ident (  ident)*
    ;

featureValueBlock
    : featureType  OpenBrace  featureValueDefinition? ( SemiColon  featureValueDefinition?)* CloseBrace
    ;

featureType
    : AtKeyword
    ;

featureValueDefinition
    : ident  Colon  number ( number)*
    ;

// The specific words can be identifiers too
ident
    : Ident
    | MediaOnly
    | Not
    | And
    | Or
    | From
    | To
    ;

// Comments might be part of CSS hacks, thus pass them to visitor to decide whether to skip
// Spaces are significant around '+' '-' OpenParen, thus they should not be skipped


// CSS_COMMENTs might be part of CSS hacks, thus pass them to visitor to decide whether to skip
// Spaces are significant around '+' '-' CSS_LPAREN, thus they should not be skipped

// CSS Entry Point
//stylesheet
//    : (css_statement | JINJA_STMT_START jStatement JINJA_STMT_END)* EOF
//    ;
//
//css_statement
//    : ruleset
//    | atRule
//    ;
//
//// ----------------------------------------------
//// Rule Sets
//// ----------------------------------------------
//ruleset
//    : selectorGroup CSS_LBRACE declarationBlock CSS_RBRACE
//    ;
//
//selectorGroup
//    : selector (CSS_COMMA selector)*
//    ;
//
//selector
//    : simpleSelectorSequence ( combinator? simpleSelectorSequence )*
//    ;
//
//combinator
//    : CSS_PLUS | CSS_GREATER | CSS_TILDE
//    ;
//
//simpleSelectorSequence
//    : (typeSelector | universal) (hash | classSelector | pseudo | attributeSelector)*
//    | (hash | classSelector | pseudo | attributeSelector)+
//    ;
//
//typeSelector      : IDENT ;
//universal         : CSS_ASTERISK ;
//hash              : HASH ;
//classSelector     : CLASS ;
//pseudo            : PSEUDO_CLASS | PSEUDO_ELEMENT ;
//attributeSelector : CSS_LBRACKET IDENT ( CSS_EQUALS css_value )? CSS_RBRACKET ;
//
//
//// ----------------------------------------------
//// At-Rules
//// ----------------------------------------------
//atRule
//    : AT_IMPORT (CSS_STRING | css_functionCall) importTerminator
//    | AT_MEDIA mediaQueryList CSS_LBRACE (css_statement | JINJA_STMT_START jStatement JINJA_STMT_END)* CSS_RBRACE
//    | AT_FONT_FACE CSS_LBRACE declarationBlock CSS_RBRACE
//    | AT_KEYFRAMES IDENT CSS_LBRACE (keyframeBlock | JINJA_STMT_START jStatement JINJA_STMT_END)* CSS_RBRACE
//    ;
//
//importTerminator
//    : mediaQueryList CSS_SEMICOLON
//    | CSS_SEMICOLON
//    ;
//
//// ----------------------------------------------
//// Media Queries
//// ----------------------------------------------
//mediaQueryList
//    : mediaQuery (CSS_COMMA mediaQuery)*
//    ;
//
//mediaQuery
//    : (IDENT)? IDENT? (CSS_LPAREN declaration CSS_RPAREN)? (IDENT (CSS_LPAREN declaration CSS_RPAREN)?)*
//    ;
//
//// ----------------------------------------------
//// Declarations & Values
//// ----------------------------------------------
//
//// CRITICAL FIX: Ensures CSS_SEMICOLON is accepted after declarations and before RBRACE.
//declarationBlock
//    : ( declaration (CSS_SEMICOLON)? | JINJA_STMT_START jStatement JINJA_STMT_END )* ;
//
//declaration
//    : propertyName CSS_COLON css_value
//    ;
//
//propertyName
//    : IDENT
//    ;
//
//css_value
//    : css_term+ ( (CSS_COMMA | CSS_SLASH)? css_term+ )* ;
//
//css_term
//    : CSS_NUMBER (IDENT | CSS_PERCENT)?
//    | CSS_STRING
//    | IDENT
//    | COLOR_HEX
//    | HASH
//    | css_functionCall
//    | JINJA_EXPR_START jExpression JINJA_EXPR_END
//    | JINJA_STMT_START jStatement JINJA_STMT_END
//    | CSS_LPAREN css_value CSS_RPAREN
////    | CSS_SLASH
////    | CSS_COMMA
//    ;
//
//css_functionCall
//    : IDENT CSS_LPAREN css_valueList CSS_RPAREN // Fix: Added CSS_LPAREN
//    ;
//
//css_valueList
//    : css_value (CSS_COMMA css_value)*
//    ;
//
//// ----------------------------------------------
//// Keyframes
//// ----------------------------------------------
//keyframeBlock
//    : keyframeSelector CSS_LBRACE declarationBlock CSS_RBRACE
//    ;
//
//keyframeSelector
//    : (CSS_NUMBER | CSS_PERCENT) (CSS_COMMA (CSS_NUMBER | CSS_PERCENT))*
//    | IDENT
//    ;



// ======================================================
// 13. JINJA STATEMENTS ({% ... %})
// ======================================================

jinjaStatement
    : JINJA_STMT_START jStatement JINJA_STMT_END
    ;

jStatement
    : jIfStatement
    | jForStatement
    // Template commands (using J_NAME since EXCLUDE/BLOCK are not explicit tokens)
    | J_NAME jTestExpr? // e.g., extends 'base.html' or block content
    | J_SET jExpression
    | jRawStatement
    | J_NAME (J_LPAREN jArgumentList J_RPAREN)? // Macro calls
    ;

jRawStatement
    : J_RAW html_content J_ENDRAW // Allo parsing raw block recursively
    ;

// Jinja Control Flow: IF block
jIfStatement
    : J_IF jTestExpr
      html_content // Content inside the IF block
      ( J_ELIF jTestExpr html_content )*
      ( J_ELSE html_content )?
      J_ENDIF
    ;

// Jinja Control Flow: FOR loop
jForStatement
    : J_FOR jTargetList J_IN jExpression
      html_content // Content inside the FOR block
      ( J_ELSE html_content )?
      J_ENDFOR
    ;

jTargetList
    : J_NAME (J_COMMA J_NAME)* // e.g., p or (key, value)
    ;


// ======================================================
// 14. JINJA EXPRESSIONS ({{ ... }})
// ======================================================

jinjaExpression
    : JINJA_EXPR_START jExpression JINJA_EXPR_END
    ;

// The key Jinja feature: Expressions piped through filters
jExpression
    : jTestExpr ( J_PIPE jFilter )*
    ;

jFilter
    : J_NAME ( J_LPAREN jArgumentList? J_RPAREN )? // filter | length(args)
    ;

// The rest of the expression grammar follo the Python structure from Step 3,
// but uses the J_ prefixed tokens (J_NAME, J_PLUS, J_EQ, J_IN, etc.).

jTestExpr : jOrTest;
jOrTest : jAndTest (J_OR jAndTest)*;
jAndTest : jNotTest (J_AND jNotTest)*;
jNotTest : J_NOT jNotTest | jComparison;

jComparison
    : jMathExpr ( jCompOp jMathExpr )*
    ;
jCompOp
    : J_LT | J_GT | J_EQ | J_NE | J_GE | J_LE | J_IN | J_NOT J_IN
    ;

jMathExpr
    : jTerm ((J_PLUS | J_MINUS) jTerm)*
    ;

jTerm
    : jFactor ((J_TIMES | J_DIVIDE | J_MOD | J_POW) jFactor)*
    ;

jFactor
    : (J_PLUS | J_MINUS) jFactor
    | jAtomExpr
    ;

jAtomExpr
    : jAtom jTrailer*
    ;

jTrailer
    : J_LPAREN jArgumentList? J_RPAREN
    | J_LBRACK jTestExpr J_RBRACK
    | J_DOT J_NAME
    ;

jAtom
    : J_NAME | J_NUMBER | J_STRING
    | J_LPAREN jTestExpr J_RPAREN
    | J_LBRACK jTestExprList? J_RBRACK
    | J_LBRACE jDictMaker? J_RBRACE
    ;

jTestExprList
    : jTestExpr (J_COMMA jTestExpr)*
    ;
jArgumentList
    : jTestExpr (J_COMMA jTestExpr)*
    ;
jDictMaker
    : jTestExpr J_COLON jTestExpr (J_COMMA jTestExpr J_COLON jTestExpr)*
    ;