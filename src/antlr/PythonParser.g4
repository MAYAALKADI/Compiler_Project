parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

// ملف كامل
// ملف كامل - أكثر مرونة للأسطر الفارغة
file_input
    : (NEWLINE* statement)* DEDENT* NEWLINE* EOF
    ;
//file_input
//    : NEWLINE* statement* DEDENT* NEWLINE* EOF
//    ;

// STATEMENTS
statement
    : simple_stmt                           #SimpleStatement
    | compound_stmt                         #CompoundStatement
    ;

simple_stmt
    : small_stmt (SEMI small_stmt)* (NEWLINE | DEDENT | EOF?)  #SimpleStmtLine
    ;

small_stmt
    : expr_stmt                              #ExprStatement
    | return_stmt                            #ReturnStatement
    | import_stmt                            #ImportStatement
    ;

// RETURNS
return_stmt
    : RETURN expr?                           #ReturnStmt
    ;

// IMPORTS
import_stmt
    : IMPORT name_list                       #ImportStmt
    | FROM dotted_name IMPORT name_list      #FromImportStmt
    ;

dotted_name
    : NAME (DOT NAME)*                       #DottedName
    ;

name_list
    : NAME (COMMA NAME)*                     #NameList
    ;

// ASSIGN / EXPR LINE
expr_stmt
    : NAME EQUAL expr                        #AssignStmt
    | expr                                   #ExprOnlyStmt
    ;

// COMPOUND STATEMENTS
compound_stmt
    : if_stmt                                #IfStatement
    | function_def                           #FunctionDef
    | with_stmt                              #WithStatement
    | for_stmt                               #ForStatement
    ;

// IF (يدعم المقارنات)
if_stmt
    : IF comparison COLON suite (ELSE COLON suite)?          #IfStmt
    ;

// FUNCTION DEF مع decorators
function_def
    : decorator* NEWLINE* DEF NAME LPAREN param_list? RPAREN COLON suite   #FuncDef
    ;

decorator
    : AT dotted_name (LPAREN arg_list? RPAREN)?               #Dec_orator
    ;

param_list
    : NAME (COMMA NAME)*                                      #ParamList
    ;

// WITH
with_stmt
    : WITH expr AS NAME COLON suite                           #WithStmt
    ;

// FOR LOOP
for_stmt
    : FOR NAME IN expr COLON suite                            #ForStmt
    ;

// BLOCKS
suite
    : NEWLINE INDENT? (statement | NEWLINE)* DEDENT?           #SuiteBlock
    | simple_stmt                                             #SuiteSimple
    ;

// EXPRESSIONS + COMPARISON
expr
    : or_expr (IF expr ELSE expr)?                            #ExprIfElse
    ;

comparison
    : or_expr ( (EQEQ | NOTEQ | LT | GT | LE | GE | EQUAL EQUAL) or_expr )*   #Comp_arison
    ;

// Boolean OR/AND/NOT
or_expr
    : and_expr (OR and_expr)*                                 #OrExpr
    ;

and_expr
    : not_expr (AND not_expr)*                                #AndExpr
    ;

not_expr
    : NOT not_expr                                            #NotExpr
    | atom_expr                                               #AtomExpr
    ;

// ATOM EXPR
atom_expr
    : primary trailer*                                        #AtomExprPrimary
    | LPAREN expr RPAREN                                      #ParenExpr
    | LPAREN generator_expr RPAREN                            #GenExpr
    ;

primary
    : atom                                                    #PrimaryAtom
    ;

// CALL / INDEX / ATTRIBUTE
trailer
    : LPAREN arg_list? RPAREN                                 #CallTrailer
    | LBRACK expr RBRACK                                      #IndexTrailer
    | DOT NAME                                                #AttrTrailer
    ;

atom
    : NAME                                                    #AtomName
    | STRING                                                  #AtomString
    | NUMBER                                                  #AtomNumber
    | list_literal                                            #AtomList
    | dict_literal                                            #AtomDict
    ;

list_literal
    : LBRACK (expr (COMMA expr)*)? RBRACK                     #ListLiteral
    ;

dict_literal
    : LBRACE (STRING COLON expr (COMMA STRING COLON expr)*)? RBRACE   #DictLiteral
    ;
    // ARGUMENTS
    arg_list
        : argument (COMMA argument)*                              #ArgList
        ;
    argument
            : NAME EQUAL expr                                         #KeywordArg
            | expr                                                    #PositionalArg
            ;

        // GENERATOR EXPRESSION
    generator_expr
        : expr FOR NAME IN expr (IF comparison)?                  #GeneratorExpr
        ;