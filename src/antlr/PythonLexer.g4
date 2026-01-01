lexer grammar PythonLexer;

tokens { INDENT, DEDENT }

@members {
    java.util.Stack<Integer> indents = new java.util.Stack<>();
    java.util.LinkedList<Token> pending = new java.util.LinkedList<>();

    int getIndentationCount(String spaces) {
        int count = 0;
        for (char c : spaces.toCharArray()) {
            if (c == '\t') count += 8;
            else count++;
        }
        return count;
    }

    @Override
    public Token nextToken() {
        if (!pending.isEmpty()) return pending.poll();

        Token t = super.nextToken();

        if (t.getType() == NEWLINE) {
            StringBuilder buf = new StringBuilder();
            int la = _input.LA(1);

            // اجمع المسافات بعد الـ NEWLINE
            while (la == ' ' || la == '\t') {
                buf.append((char) la);
                _input.consume();
                la = _input.LA(1);
            }

            int indent = getIndentationCount(buf.toString());
            int prev = indents.isEmpty() ? 0 : indents.peek();

            // سطر فارغ أو تعليق بعد NEWLINE → نرجع NEWLINE فقط
            if (la == '\n' || la == '\r' || la == '#' || la == EOF) {
                return t;
            }

            // نرجع NEWLINE أولًا ثم نحقن INDENT/DEDENT
            pending.add(t);

            if (indent > prev) {
                // نولّد INDENT واحد فقط عند بداية البلوك
                indents.push(indent);
                pending.add(new CommonToken(INDENT, "INDENT"));
            } else {
                while (!indents.isEmpty() && indent < indents.peek()) {
                    indents.pop();
                    pending.add(new CommonToken(DEDENT, "DEDENT"));
                }
            }

            return pending.poll();
        }

        if (t.getType() == EOF) {
            while (!indents.isEmpty()) {
                indents.pop();
                pending.add(new CommonToken(DEDENT, "DEDENT"));
            }
            if (!pending.isEmpty()) return pending.poll();
        }

        return t;
    }
}

// KEYWORDS
IMPORT: 'import';
FROM: 'from';
DEF: 'def';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
WITH: 'with';
AS: 'as';
NOT: 'not';
AND: 'and';
OR: 'or';
FOR: 'for';
IN: 'in';

// DECORATOR
AT: '@';

// OPERATORS & COMPARISONS & PUNCTUATION
EQEQ: '==';
NOTEQ: '!=';
LE: '<=';
GE: '>=';
LT: '<';
GT: '>';

EQUAL: '=';
COLON: ':';
COMMA: ',';
DOT: '.';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
SEMI: ';';

// LITERALS
STRING
    : '"' ( ~["\\\r\n] | '\\' . )* '"'
    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
    ;

NUMBER: [0-9]+ ('.' [0-9]+)? ;
NAME: [a-zA-Z_][a-zA-Z0-9_]* ;

// WHITESPACE & NEWLINES & COMMENTS
COMMENT: '#' ~[\r\n]* -> skip;

NEWLINE
    : ('\r'? '\n'     // Windows (\r\n) أو Linux (\n)
    | '\r'            // Mac القديم (\r)
    | '\u2028'        // Unicode Line Separator
    | '\u2029')       // Unicode Paragraph Separator
    ;

WS: [ \t]+ -> skip;