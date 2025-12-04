parser grammar htmlParser;

options {
    tokenVocab = htmlLexer;
}

// ======================================================
// 1. ENTRY POINT
// The document is a series of content nodes until the end.
// ======================================================
document
    : htmlContent* EOF
    ;

// ======================================================
// 2. CONTENT RULES
// Defines what can appear in an HTML document.
// ======================================================

// htmlContent is the main building block. It can be an element, text, or Jinja.
htmlContent
    : htmlElement
    | HTML_TEXT
    | JINJA_EXPR
    | JINJA_STATEMENT
    | CDATA
    | SCRIPTLET
    ;

// ======================================================
// 3. ELEMENT RULES
// Defines the structure of HTML tags.
// ======================================================

htmlElement
    // Case 1: Standard element with content, e.g., <div>...</div>
    : TAG_OPEN TAG_NAME attribute* TAG_CLOSE
      htmlContent* // The content inside the tag
      TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE

    // Case 2: Self-closing tag, e.g., <img ... />
    | TAG_OPEN TAG_NAME attribute* TAG_SLASH_CLOSE

    // Case 3: Void element (no closing tag), e.g.,
// or <meta ...>
    // This is a simplification; we treat them as open tags.
    | TAG_OPEN TAG_NAME attribute* TAG_CLOSE

    // Case 4: Script element, which contains a single SCRIPT_BODY token
    | SCRIPT_OPEN attribute* TAG_CLOSE
      SCRIPT_BODY? // The body is optional
      SCRIPT_CLOSE

    // Case 5: Style element, which contains a single STYLE_BODY token
    | STYLE_OPEN attribute* TAG_CLOSE
      STYLE_BODY? // The body is optional
      STYLE_CLOSE
    ;

// An attribute is a name, optionally followed by a value.
attribute
    : TAG_NAME (TAG_EQUALS TAG_ATTVALUE_VALUE)?
    ;


//parser grammar htmlParser;
//
//options {
//    tokenVocab = htmlLexer;
//}
//
//
//document
//    : ( SCRIPTLET | SEA_WS )*
//      ( element ( SCRIPTLET | SEA_WS )* )*
//      EOF
//    ;
//
//
//content
//    : ( HTML_TEXT | element | CDATA | SCRIPTLET )*
//    ;
//
//
//element
//
//    : TAG_OPEN TAG_NAME ( attribute )* TAG_CLOSE
//      content
//      TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE
//    | TAG_OPEN TAG_NAME ( attribute )* TAG_SLASH_CLOSE
//    | TAG_OPEN TAG_NAME ( attribute )* TAG_CLOSE
//    ;
//
//
//attribute
//    : TAG_NAME ( TAG_EQUALS ATTVALUE_VALUE )?
//    ;
////
////screen
////    : header_text? button? section_title? section_content?
////    ;
////
////header_text
////    : TEXT
////    ;
////
////button
////    : BUTTON_START TEXT BUTTON_END
////    ;
////
////section_title
////    : SECTION_TITLE
////    ;
////
////section_content
////    : SECTION_CONTENT
////    ;
//
//
////tag: tagDef+;
////
////tagDef: OPEN_TAG tagBody CLOSE_TAG;
////
////tagBody:TAG_NAME ;
//
////
////tag_open : OPEN_TAG tag_name;
////
////tag_name:TAG_NAME close_tagB1 |close_tag;
////
////close_tagB1: CLOSE_TAG;
////
////close_tag: SLASH CLOSE_TAG ;
//
///*options {tokenVocab=Example1Lexer;}
//
//  array : arrayDef+ ;
//  arrayDef : ARRAY OPEN_B arraybody CLOSE_B;
//  arraybody : ARRAY_INT(COMMA ARRAY_INT)* #arrayINT
//            | ARRAY_STRING (COMMA ARRAY_STRING)* #arrayString ;
//*/
