lexer grammar UnifiedLexer;

// ================= DOCTYPE (قبل OPEN) =================
DOCTYPE
    : '<!' WS* 'DOCTYPE' WS+ 'html' WS* '>'
    ;

// ================= HTML / Jinja =================
COMMENT     : '<!--' .*? '-->' -> skip ;

STYLE_OPEN
    : '<style>' -> pushMode(CSS_MODE)
    ;

SCRIPT_JSON_OPEN
    : '<script>' -> pushMode(JSON_MODE)
    ;

OPEN        : '<' -> pushMode(TAG);

TEXT        : (~[<{}\r\n])+ ;
NEWLINE     : [\r\n]+ -> skip ;
CR          : '\r' -> skip ;
WS          : [ \t]+ -> skip ;

// ================= JINJA =================
JINJA_EXPR        : '{{' .*? '}}' ;
JINJA_STMT_IF     : '{%' WS* 'if' .*? '%}' ;
JINJA_STMT_ELSE   : '{%' WS* 'else' WS* '%}' ;
JINJA_STMT_ENDIF  : '{%' WS* 'endif' WS* '%}' ;
JINJA_STMT_FOR    : '{%' WS* 'for' .*? '%}' ;
JINJA_STMT_ENDFOR : '{%' WS* 'endfor' WS* '%}' ;
JINJA_STMT_BLOCK  : '{%' WS* 'block' .*? '%}' ;
JINJA_STMT_ENDBLOCK : '{%' WS* 'endblock' WS* '%}' ;
JINJA_STMT_EXTENDS : '{%' WS* 'extends' .*? '%}' ;
JINJA_STMT        : '{%' .*? '%}' ;

// ================= TAG MODE =================
mode TAG;

META    : 'meta';
LINK    : 'link';
IMG     : 'img';
BR      : 'br';
HR      : 'hr';
INPUT   : 'input';

CLOSE       : '>' -> popMode ;
SLASH       : '/' ;
EQUALS      : '=' ;
ATTR_VALUE  : '"' ( ~["\\] | '\\' . )* '"' ;
NAME        : [a-zA-Z_:][a-zA-Z0-9_:.\\-]* ;
WS_TAG      : [ \t\r\n]+ -> skip ;


// ================= CSS MODE =================
mode CSS_MODE;

FONT_FAMILY      : 'font-family';
DIRECTION        : 'direction';
BACKGROUND_COLOR : 'background-color';
PADDING          : 'padding';
MAX_WIDTH        : 'max-width';
MARGIN           : 'margin';
BACKGROUND       : 'background';
BORDER_RADIUS    : 'border-radius';
BOX_SHADOW       : 'box-shadow';
TEXT_ALIGN       : 'text-align';
COLOR            : 'color';
DISPLAY          : 'display';
MARGIN_TOP       : 'margin-top';
WIDTH            : 'width';
BORDER           : 'border';
CURSOR           : 'cursor';
LIST_STYLE       : 'list-style';
TEXT_DECORATION  : 'text-decoration';
MARGIN_BOTTOM    : 'margin-bottom';

CLASS_SELECTOR : '.' IDENTIFIER ;

LBRACE      : '{' ;
RBRACE      : '}' ;
COLON       : ':' ;
SEMICOLON   : ';' ;
DOT         : '.' ;
HASH        : '#' ;

FUNCTION    : IDENTIFIER '(' (~[)])+ ')' ;
IDENTIFIER  : [a-zA-Z][a-zA-Z0-9_-]* ;
VALUE       : [0-9#,%()\-][a-zA-Z0-9#,%()\-]* ;

WS_CSS      : [ \t\r\n]+ -> skip ;

STYLE_CLOSE
    : '</style>' -> popMode
    ;

// ================= JSON MODE =================
mode JSON_MODE;

LBRACE_JSON  : '{' ;
RBRACE_JSON  : '}' ;
LBRACKET     : '[' ;
RBRACKET     : ']' ;
COLON_JSON   : ':' ;
COMMA        : ',' ;

TRUE         : 'true' ;
FALSE        : 'false' ;
NULL         : 'null' ;

STRING       : '"' ( ESC | ~["\\] )* '"' ;
NUMBER       : '-'? INT ('.' [0-9]+)? EXP? ;

fragment INT : '0' | [1-9] [0-9]* ;
fragment EXP : [eE] [+\-]? [0-9]+ ;
fragment ESC : '\\' (["\\/bfnrt] | 'u' HEX HEX HEX HEX) ;
fragment HEX : [0-9a-fA-F] ;

WS_JSON      : [ \t\r\n]+ -> skip ;

SCRIPT_JSON_CLOSE
    : '</script>' -> popMode
    ;
