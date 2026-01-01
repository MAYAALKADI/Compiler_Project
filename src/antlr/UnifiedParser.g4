parser grammar UnifiedParser;

options { tokenVocab = UnifiedLexer; }

// ================= ROOT =================
program
    : doctype? programItem* EOF
    ;



programItem
    : htmlDocument
    | element
    | misc
    | styleBlock
    | scriptJsonBlock
    | cssStylesheet
    | jsonDocument
    ;


// ======== HTML + Jinja ========

htmlDocument
    : (doctype
      | element
      | misc
      | NEWLINE
      )+
    ;

doctype
    : DOCTYPE
    ;



styleBlock
    : STYLE_OPEN cssStylesheet? STYLE_CLOSE*
    ;

scriptJsonBlock
    : SCRIPT_JSON_OPEN jsonDocument? SCRIPT_JSON_CLOSE
    ;





// ================= HTML ELEMENTS =================

// فصل العناصر لتفادي الغموض
element
    : normalElement
    | voidHtmlElement
    | selfClosingTag
    ;

// عناصر لها start + content + end
normalElement
    : startTag content endTag
    ;

// عناصر VOID (حسب HTML Standard)
voidHtmlElement
    : OPEN voidName attribute* CLOSE
    ;

// أسماء عناصر VOID
voidName
    : META
    | LINK
    | IMG
    | BR
    | HR
    | INPUT
    ;


// ================= TAGS =================
startTag
    : OPEN NAME attribute* CLOSE
    ;

endTag
    : OPEN SLASH NAME CLOSE
    ;

selfClosingTag
    : OPEN NAME attribute* SLASH CLOSE
    ;

// ================= CONTENT =================
content
    : (element | misc)*
    ;

// ================= ATTRIBUTES =================
attribute
    : NAME EQUALS ATTR_VALUE
    | NAME
    ;

// ================= MISC =================
misc
    : TEXT
    | JINJA_EXPR
    | jinjaStmt
    ;

// ================= JINJA =================
jinjaStmt
    : jinjaIf
    | jinjaFor
    | jinjaBlock
    | jinjaExtends
    | JINJA_STMT
    ;

jinjaIf
    : JINJA_STMT_IF content JINJA_STMT_ENDIF
    ;

jinjaFor
    : JINJA_STMT_FOR content (JINJA_STMT_ELSE content)? JINJA_STMT_ENDFOR
    ;

jinjaBlock
    : JINJA_STMT_BLOCK content JINJA_STMT_ENDBLOCK
    ;

jinjaExtends
    : JINJA_STMT_EXTENDS
    ;

// ================= CSS =================
cssStylesheet
    : ruleSet+
    ;

ruleSet
    : selector LBRACE declaration* RBRACE
    ;

selector
    : simpleSelector+
    ;

simpleSelector
    : elementSelector (pseudoClass)?
    ;

elementSelector
    : IDENTIFIER
    | CLASS_SELECTOR
    ;

pseudoClass
    : COLON IDENTIFIER
    ;

declaration
    : property COLON valueGroup SEMICOLON
    ;

valueGroup
    : (VALUE | IDENTIFIER | HASH | DOT | COLON | CLASS_SELECTOR | NUMBER | STRING | FUNCTION)+
    ;

property
    : FONT_FAMILY
    | DIRECTION
    | BACKGROUND_COLOR
    | PADDING
    | MAX_WIDTH
    | MARGIN
    | BACKGROUND
    | BORDER_RADIUS
    | BOX_SHADOW
    | TEXT_ALIGN
    | COLOR
    | DISPLAY
    | MARGIN_TOP
    | WIDTH
    | BORDER
    | CURSOR
    | LIST_STYLE
    | TEXT_DECORATION
    | MARGIN_BOTTOM
    ;

// ================= JSON =================
jsonDocument
    : object
    | array
    ;

value
    : array
    | NUMBER
    | STRING
    | object
    | TRUE
    | FALSE
    | NULL
    ;

object
    : LBRACE_JSON (pair (COMMA pair)*)? RBRACE_JSON
    ;

pair
    : STRING COLON_JSON value
    ;

array
    : LBRACKET (value (COMMA value)*)? RBRACKET
    ;
