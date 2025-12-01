parser grammar htmlParser;

options {
    tokenVocab = htmlLexer;
}


document
    : ( SCRIPTLET | SEA_WS )*
      ( element ( SCRIPTLET | SEA_WS )* )*
      EOF
    ;


content
    : ( HTML_TEXT | element | CDATA | SCRIPTLET )*
    ;


element

    : TAG_OPEN TAG_NAME ( attribute )* TAG_CLOSE
      content
      TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE
    | TAG_OPEN TAG_NAME ( attribute )* TAG_SLASH_CLOSE
    | TAG_OPEN TAG_NAME ( attribute )* TAG_CLOSE
    ;


attribute
    : TAG_NAME ( TAG_EQUALS ATTVALUE_VALUE )?
    ;
//
//screen
//    : header_text? button? section_title? section_content?
//    ;
//
//header_text
//    : TEXT
//    ;
//
//button
//    : BUTTON_START TEXT BUTTON_END
//    ;
//
//section_title
//    : SECTION_TITLE
//    ;
//
//section_content
//    : SECTION_CONTENT
//    ;


//tag: tagDef+;
//
//tagDef: OPEN_TAG tagBody CLOSE_TAG;
//
//tagBody:TAG_NAME ;

//
//tag_open : OPEN_TAG tag_name;
//
//tag_name:TAG_NAME close_tagB1 |close_tag;
//
//close_tagB1: CLOSE_TAG;
//
//close_tag: SLASH CLOSE_TAG ;

/*options {tokenVocab=Example1Lexer;}

  array : arrayDef+ ;
  arrayDef : ARRAY OPEN_B arraybody CLOSE_B;
  arraybody : ARRAY_INT(COMMA ARRAY_INT)* #arrayINT
            | ARRAY_STRING (COMMA ARRAY_STRING)* #arrayString ;
*/
