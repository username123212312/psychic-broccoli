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
    | STYLE_OPEN style_content STYLE_CLOSE               // <style>...</style>
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

style_content // Rule to consume the CSS tokens within the <style> block
    : stylesheet;

stylesheet
    : css_ws (charset ( CSS_COMMENT | Space | Cdo | Cdc)*)* (imports ( CSS_COMMENT | Space | Cdo | Cdc)*)* (
        namespace_ ( CSS_COMMENT | Space | Cdo | Cdc)*
    )* (nestedStatement ( CSS_COMMENT | Space | Cdo | Cdc)*)* EOF
    ;

charset
    : Charset css_ws String_ css_ws CSS_SEMICOLON css_ws # goodCharset
    | Charset css_ws String_ css_ws        # badCharset
    ;

imports
    : Import css_ws (String_ | url) css_ws mediaQueryList CSS_SEMICOLON css_ws # goodImport
    | Import css_ws ( String_ | url) css_ws CSS_SEMICOLON css_ws               # goodImport
    | Import css_ws ( String_ | url) css_ws mediaQueryList       # badImport
    | Import css_ws ( String_ | url) css_ws                      # badImport
    ;

// Namespaces
// https://www.w3.org/TR/css-namespaces-3/
namespace_
    : Namespace css_ws (namespacePrefix css_ws)? (String_ | url) css_ws CSS_SEMICOLON css_ws # goodNamespace
    | Namespace css_ws (namespacePrefix css_ws)? ( String_ | url) css_ws       # badNamespace
    ;

namespacePrefix
    : ident
    ;

// Media queries
// https://www.w3.org/TR/css3-mediaqueries/
media
    : Media css_ws mediaQueryList groupRuleBody css_ws
    ;

mediaQueryList
    : (mediaQuery ( CSS_COMMA css_ws mediaQuery)*)? css_ws
    ;

mediaQuery
    : (MediaOnly | Not)? css_ws mediaType css_ws (And css_ws mediaExpression)*
    | mediaExpression ( And css_ws mediaExpression)*
    ;

mediaType
    : ident
    ;

mediaExpression
    : CSS_LPAREN css_ws mediaFeature (CSS_COLON css_ws expr)? CSS_RPAREN css_ws
    // Grammar allocss_ws for 'and(', which gets tokenized as Function. In practice, people always insert space before CSS_LPAREN to have it work on Chrome.
    ;

mediaFeature
    : ident css_ws
    ;

// Page
page
    : Page css_ws pseudoPage? CSS_LBRACE css_ws declaration? (CSS_SEMICOLON css_ws declaration?)* CSS_RBRACE css_ws
    ;

pseudoPage
    : CSS_COLON ident css_ws
    ;

// Selectors
// https://www.w3.org/TR/css3-selectors/
selectorGroup
    : selector (CSS_COMMA css_ws selector)*
    ;

selector
    : simpleSelectorSequence css_ws (combinator simpleSelectorSequence css_ws)*
    ;

combinator
    : CSS_PLUS css_ws
    | CSS_GREATER css_ws
    | CSS_TILDE css_ws
    | Space css_ws
    ;

simpleSelectorSequence
    : (typeSelector | universal) (Hash | className | attrib | pseudo | negation)*
    | ( Hash | className | attrib | pseudo | negation)+
    ;

typeSelector
    : typeNamespacePrefix? elementName
    ;

typeNamespacePrefix
    : (ident | CSS_ASTERISK)? CSS_PIPE
    ;

elementName
    : ident
    ;

universal
    : typeNamespacePrefix? CSS_ASTERISK
    ;

className
    : CSS_DOT ident
    ;

attrib
    : CSS_LBRACKET css_ws typeNamespacePrefix? ident css_ws (
        (PrefixMatch | SuffixMatch | SubstringMatch | CSS_EQUALS | Includes | DashMatch) css_ws (
            ident
            | String_
        ) css_ws
    )? CSS_RBRACKET
    ;

pseudo
    /* '::' starts a pseudo-element, CSS_COLON a pseudo-class */
    /* Exceptions: :first-line, :first-letter, :before And :after. */
    /* Note that pseudo-elements are restricted to one per selector And */
    /* occur MediaOnly in the last simple_selector_sequence. */
    : CSS_COLON CSS_COLON? (ident | functionalPseudo)
    ;

functionalPseudo
    : Function_ css_ws expression CSS_RPAREN
    ;

expression
    /* In CSS3, the expressions are identifiers, strings, */
    /* or of the form "an+b" */
    : (( CSS_PLUS | CSS_MINUS | Dimension | UnknownDimension | Number | String_ | ident) css_ws)+
    ;

negation
    : PseudoNot css_ws negationArg css_ws CSS_RPAREN
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
    : CSS_SLASH css_ws   # goodOperator
    | CSS_COMMA css_ws # goodOperator
    | Space css_ws # goodOperator
    | CSS_EQUALS css_ws   # badOperator // IE filter and DXImageTransform function
    ;

property_
    : ident css_ws    # goodProperty
    | Variable css_ws # goodProperty
    | CSS_ASTERISK ident   # badProperty // IE hacks
    | CSS_UNDERSCORE ident   # badProperty // IE hacks
    ;

ruleset
    : selectorGroup CSS_LBRACE css_ws declarationList? CSS_RBRACE css_ws # knownRuleset
    | any_* CSS_LBRACE css_ws declarationList? CSS_RBRACE css_ws         # unknownRuleset
    ;

declarationList
    : (CSS_SEMICOLON css_ws)* declaration css_ws (CSS_SEMICOLON css_ws declaration?)*
    ;

declaration
    : property_ CSS_COLON css_ws css_expr prio? # knownDeclaration
    | property_ CSS_COLON css_ws value      # unknownDeclaration
    ;

prio
    : Important css_ws
    ;

value
    : (any_ | block | AtKeyword css_ws)+
    ;

css_expr
    : css_term (operator_? term)*
    ;

css_term
    : number css_ws           # knownTerm
    | percentage css_ws       # knownTerm
    | dimension css_ws        # knownTerm
    | String_ css_ws          # knownTerm
    | UnicodeRange css_ws     # knownTerm
    | ident css_ws            # knownTerm
    | var_                # knownTerm
    | url css_ws              # knownTerm
    | hexcolor            # knownTerm
    | calc                # knownTerm
    | function_           # knownTerm
    | unknownDimension css_ws # unknownTerm
    | dxImageTransform    # badTerm
    ;

function_
    : Function_ css_ws css_expr CSS_RPAREN css_ws
    ;

dxImageTransform
    : DxImageTransform css_ws css_expr CSS_RPAREN css_ws // IE DXImageTransform function
    ;

hexcolor
    : Hash css_ws
    ;

number
    : (CSS_PLUS | CSS_MINUS)? Number
    ;

percentage
    : (CSS_PLUS | CSS_MINUS)? Percentage
    ;

dimension
    : (CSS_PLUS | CSS_MINUS)? Dimension
    ;

unknownDimension
    : (CSS_PLUS | CSS_MINUS)? UnknownDimension
    ;

// Error handling
any_
    : ident css_ws
    | number css_ws
    | percentage css_ws
    | dimension css_ws
    | unknownDimension css_ws
    | String_ css_ws
    //| Delim css_ws    // Not implemented yet
    | url css_ws
    | Hash css_ws
    | UnicodeRange css_ws
    | Includes css_ws
    | DashMatch css_ws
    | CSS_COLON css_ws
    | Function_ css_ws ( any_ | unused)* CSS_RPAREN css_ws
    | CSS_LPAREN css_ws ( any_ | unused)* CSS_RPAREN css_ws
    | CSS_LBRACKET css_ws ( any_ | unused)* CSS_RBRACKET css_ws
    ;

atRule
    : AtKeyword css_ws any_* (block | CSS_SEMICOLON css_ws) # unknownAtRule
    ;

unused
    : block
    | AtKeyword css_ws
    | CSS_SEMICOLON css_ws
    | Cdo css_ws
    | Cdc css_ws
    ;

block
    : CSS_LBRACE css_ws (declarationList | nestedStatement | any_ | block | AtKeyword css_ws | CSS_SEMICOLON css_ws)* CSS_RBRACE css_ws
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
    : CSS_LBRACE css_ws nestedStatement* CSS_RBRACE css_ws
    ;

supportsRule
    : Supports css_ws supportsCondition css_ws groupRuleBody
    ;

supportsCondition
    : supportsNegation
    | supportsConjunction
    | supportsDisjunction
    | supportsConditionInParens
    ;

supportsConditionInParens
    : CSS_LPAREN css_ws supportsCondition css_ws CSS_RPAREN
    | supportsDeclarationCondition
    | generalEnclosed
    ;

supportsNegation
    : Not css_ws Space css_ws supportsConditionInParens
    ;

supportsConjunction
    : supportsConditionInParens (css_ws Space css_ws And css_ws Space css_ws supportsConditionInParens)+
    ;

supportsDisjunction
    : supportsConditionInParens (css_ws Space css_ws Or css_ws Space css_ws supportsConditionInParens)+
    ;

supportsDeclarationCondition
    : CSS_LPAREN css_ws declaration CSS_RPAREN
    ;

generalEnclosed
    : (Function_ | CSS_LPAREN) (any_ | unused)* CSS_RPAREN
    ;

// Url
// https://www.w3.org/TR/css3-values/#urls
url
    : Url_ css_ws String_ css_ws CSS_RPAREN
    | Url
    ;

// Variable
// https://www.w3.org/TR/css-variables-1
var_
    : Var css_ws Variable css_ws CSS_RPAREN css_ws
    ;

// Calc
// https://www.w3.org/TR/css3-values/#calc-syntax
calc
    : Calc css_ws calcSum CSS_RPAREN css_ws
    ;

calcSum
    : calcProduct (Space css_ws ( CSS_PLUS | CSS_MINUS) css_ws Space css_ws calcProduct)*
    ;

calcProduct
    : calcValue (CSS_ASTERISK css_ws calcValue | CSS_SLASH css_ws number css_ws)*
    ;

calcValue
    : number css_ws
    | dimension css_ws
    | unknownDimension css_ws
    | percentage css_ws
    | CSS_LPAREN css_ws calcSum CSS_RPAREN css_ws
    ;

// Font face
// https://www.w3.org/TR/2013/CR-css-fonts-3-20131003/#font-face-rule
fontFaceRule
    : FontFace css_ws CSS_LBRACE css_ws fontFaceDeclaration? (CSS_SEMICOLON css_ws fontFaceDeclaration?)* CSS_RBRACE css_ws
    ;

fontFaceDeclaration
    : property_ CSS_COLON css_ws css_expr  # knownFontFaceDeclaration
    | property_ CSS_COLON css_ws value # unknownFontFaceDeclaration
    ;

// Animations
// https://www.w3.org/TR/css3-animations/
keyframesRule
    : Keyframes css_ws Space css_ws ident css_ws CSS_LBRACE css_ws keyframeBlock* CSS_RBRACE css_ws
    ;

keyframeBlock
    : (keyframeSelector CSS_LBRACE css_ws declarationList? CSS_RBRACE css_ws)
    ;

keyframeSelector
    : (From | To | Percentage) css_ws (CSS_COMMA css_ws ( From | To | Percentage) css_ws)*
    ;

// Viewport
// https://www.w3.org/TR/css-device-adapt-1/
viewport
    : Viewport css_ws CSS_LBRACE css_ws declarationList? CSS_RBRACE css_ws
    ;

// Counter style
// https://www.w3.org/TR/css-counter-styles-3/
counterStyle
    : CounterStyle css_ws ident css_ws CSS_LBRACE css_ws declarationList? CSS_RBRACE css_ws
    ;

// Font feature values
// https://www.w3.org/TR/css-fonts-3/
fontFeatureValuesRule
    : FontFeatureValues css_ws fontFamilyNameList css_ws CSS_LBRACE css_ws featureValueBlock* CSS_RBRACE css_ws
    ;

fontFamilyNameList
    : fontFamilyName (css_ws CSS_COMMA css_ws fontFamilyName)*
    ;

fontFamilyName
    : String_
    | ident ( css_ws ident)*
    ;

featureValueBlock
    : featureType css_ws CSS_LBRACE css_ws featureValueDefinition? (css_ws CSS_SEMICOLON css_ws featureValueDefinition?)* CSS_RBRACE css_ws
    ;

featureType
    : AtKeyword
    ;

featureValueDefinition
    : ident css_ws CSS_COLON css_ws number (css_ws number)*
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

// CSS_COMMENTs might be part of CSS hacks, thus pass them to visitor to decide whether to skip
// Spaces are significant around '+' '-' CSS_LPAREN, thus they should not be skipped
css_ws
    : (CSS_COMMENT | Space)*
    ;
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
    : J_RAW html_content J_ENDRAW // Allocss_ws parsing raw block recursively
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

// The rest of the expression grammar follocss_ws the Python structure from Step 3,
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