<<<<<<< HEAD
// Generated from D:/مشاريع المترجمات/Compiler_project/src/antlr/PythonLexer.g4 by ANTLR 4.13.2
=======
// Generated from E:/مراحل عمل مشروع المترجمات/Compiler_project/src/antlr/PythonLexer.g4 by ANTLR 4.13.2
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, IMPORT=3, FROM=4, DEF=5, RETURN=6, IF=7, ELSE=8, WITH=9, 
		AS=10, NOT=11, AND=12, OR=13, FOR=14, IN=15, AT=16, EQEQ=17, NOTEQ=18, 
		LE=19, GE=20, LT=21, GT=22, EQUAL=23, COLON=24, COMMA=25, DOT=26, LPAREN=27, 
		RPAREN=28, LBRACK=29, RBRACK=30, LBRACE=31, RBRACE=32, SEMI=33, STRING=34, 
		NUMBER=35, NAME=36, COMMENT=37, NEWLINE=38, WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IMPORT", "FROM", "DEF", "RETURN", "IF", "ELSE", "WITH", "AS", "NOT", 
			"AND", "OR", "FOR", "IN", "AT", "EQEQ", "NOTEQ", "LE", "GE", "LT", "GT", 
			"EQUAL", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"LBRACE", "RBRACE", "SEMI", "STRING", "NUMBER", "NAME", "COMMENT", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'import'", "'from'", "'def'", "'return'", "'if'", 
			"'else'", "'with'", "'as'", "'not'", "'and'", "'or'", "'for'", "'in'", 
			"'@'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'='", "':'", "','", 
			"'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "IMPORT", "FROM", "DEF", "RETURN", "IF", "ELSE", 
			"WITH", "AS", "NOT", "AND", "OR", "FOR", "IN", "AT", "EQEQ", "NOTEQ", 
			"LE", "GE", "LT", "GT", "EQUAL", "COLON", "COMMA", "DOT", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "SEMI", "STRING", "NUMBER", "NAME", 
			"COMMENT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


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


	public PythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PythonLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\'\u00ed\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u00b1\b\u001f\n"+
		"\u001f\f\u001f\u00b4\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u00bb\b\u001f\n\u001f\f\u001f\u00be\t\u001f"+
		"\u0001\u001f\u0003\u001f\u00c1\b\u001f\u0001 \u0004 \u00c4\b \u000b \f"+
		" \u00c5\u0001 \u0001 \u0004 \u00ca\b \u000b \f \u00cb\u0003 \u00ce\b "+
		"\u0001!\u0001!\u0005!\u00d2\b!\n!\f!\u00d5\t!\u0001\"\u0001\"\u0005\""+
		"\u00d9\b\"\n\"\f\"\u00dc\t\"\u0001\"\u0001\"\u0001#\u0003#\u00e1\b#\u0001"+
		"#\u0001#\u0003#\u00e5\b#\u0001$\u0004$\u00e8\b$\u000b$\f$\u00e9\u0001"+
		"$\u0001$\u0000\u0000%\u0001\u0003\u0003\u0004\u0005\u0005\u0007\u0006"+
		"\t\u0007\u000b\b\r\t\u000f\n\u0011\u000b\u0013\f\u0015\r\u0017\u000e\u0019"+
		"\u000f\u001b\u0010\u001d\u0011\u001f\u0012!\u0013#\u0014%\u0015\'\u0016"+
		")\u0017+\u0018-\u0019/\u001a1\u001b3\u001c5\u001d7\u001e9\u001f; =!?\""+
		"A#C$E%G&I\'\u0001\u0000\b\u0004\u0000\n\n\r\r\"\"\\\\\u0004\u0000\n\n"+
		"\r\r\'\'\\\\\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002"+
		"\u0000\n\n\r\r\u0002\u0000\r\r\u2028\u2029\u0002\u0000\t\t  \u00f9\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0001K"+
		"\u0001\u0000\u0000\u0000\u0003R\u0001\u0000\u0000\u0000\u0005W\u0001\u0000"+
		"\u0000\u0000\u0007[\u0001\u0000\u0000\u0000\tb\u0001\u0000\u0000\u0000"+
		"\u000be\u0001\u0000\u0000\u0000\rj\u0001\u0000\u0000\u0000\u000fo\u0001"+
		"\u0000\u0000\u0000\u0011r\u0001\u0000\u0000\u0000\u0013v\u0001\u0000\u0000"+
		"\u0000\u0015z\u0001\u0000\u0000\u0000\u0017}\u0001\u0000\u0000\u0000\u0019"+
		"\u0081\u0001\u0000\u0000\u0000\u001b\u0084\u0001\u0000\u0000\u0000\u001d"+
		"\u0086\u0001\u0000\u0000\u0000\u001f\u0089\u0001\u0000\u0000\u0000!\u008c"+
		"\u0001\u0000\u0000\u0000#\u008f\u0001\u0000\u0000\u0000%\u0092\u0001\u0000"+
		"\u0000\u0000\'\u0094\u0001\u0000\u0000\u0000)\u0096\u0001\u0000\u0000"+
		"\u0000+\u0098\u0001\u0000\u0000\u0000-\u009a\u0001\u0000\u0000\u0000/"+
		"\u009c\u0001\u0000\u0000\u00001\u009e\u0001\u0000\u0000\u00003\u00a0\u0001"+
		"\u0000\u0000\u00005\u00a2\u0001\u0000\u0000\u00007\u00a4\u0001\u0000\u0000"+
		"\u00009\u00a6\u0001\u0000\u0000\u0000;\u00a8\u0001\u0000\u0000\u0000="+
		"\u00aa\u0001\u0000\u0000\u0000?\u00c0\u0001\u0000\u0000\u0000A\u00c3\u0001"+
		"\u0000\u0000\u0000C\u00cf\u0001\u0000\u0000\u0000E\u00d6\u0001\u0000\u0000"+
		"\u0000G\u00e4\u0001\u0000\u0000\u0000I\u00e7\u0001\u0000\u0000\u0000K"+
		"L\u0005i\u0000\u0000LM\u0005m\u0000\u0000MN\u0005p\u0000\u0000NO\u0005"+
		"o\u0000\u0000OP\u0005r\u0000\u0000PQ\u0005t\u0000\u0000Q\u0002\u0001\u0000"+
		"\u0000\u0000RS\u0005f\u0000\u0000ST\u0005r\u0000\u0000TU\u0005o\u0000"+
		"\u0000UV\u0005m\u0000\u0000V\u0004\u0001\u0000\u0000\u0000WX\u0005d\u0000"+
		"\u0000XY\u0005e\u0000\u0000YZ\u0005f\u0000\u0000Z\u0006\u0001\u0000\u0000"+
		"\u0000[\\\u0005r\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005t\u0000\u0000"+
		"^_\u0005u\u0000\u0000_`\u0005r\u0000\u0000`a\u0005n\u0000\u0000a\b\u0001"+
		"\u0000\u0000\u0000bc\u0005i\u0000\u0000cd\u0005f\u0000\u0000d\n\u0001"+
		"\u0000\u0000\u0000ef\u0005e\u0000\u0000fg\u0005l\u0000\u0000gh\u0005s"+
		"\u0000\u0000hi\u0005e\u0000\u0000i\f\u0001\u0000\u0000\u0000jk\u0005w"+
		"\u0000\u0000kl\u0005i\u0000\u0000lm\u0005t\u0000\u0000mn\u0005h\u0000"+
		"\u0000n\u000e\u0001\u0000\u0000\u0000op\u0005a\u0000\u0000pq\u0005s\u0000"+
		"\u0000q\u0010\u0001\u0000\u0000\u0000rs\u0005n\u0000\u0000st\u0005o\u0000"+
		"\u0000tu\u0005t\u0000\u0000u\u0012\u0001\u0000\u0000\u0000vw\u0005a\u0000"+
		"\u0000wx\u0005n\u0000\u0000xy\u0005d\u0000\u0000y\u0014\u0001\u0000\u0000"+
		"\u0000z{\u0005o\u0000\u0000{|\u0005r\u0000\u0000|\u0016\u0001\u0000\u0000"+
		"\u0000}~\u0005f\u0000\u0000~\u007f\u0005o\u0000\u0000\u007f\u0080\u0005"+
		"r\u0000\u0000\u0080\u0018\u0001\u0000\u0000\u0000\u0081\u0082\u0005i\u0000"+
		"\u0000\u0082\u0083\u0005n\u0000\u0000\u0083\u001a\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005@\u0000\u0000\u0085\u001c\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005=\u0000\u0000\u0087\u0088\u0005=\u0000\u0000\u0088\u001e\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005!\u0000\u0000\u008a\u008b\u0005=\u0000"+
		"\u0000\u008b \u0001\u0000\u0000\u0000\u008c\u008d\u0005<\u0000\u0000\u008d"+
		"\u008e\u0005=\u0000\u0000\u008e\"\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005>\u0000\u0000\u0090\u0091\u0005=\u0000\u0000\u0091$\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005<\u0000\u0000\u0093&\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005>\u0000\u0000\u0095(\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005=\u0000\u0000\u0097*\u0001\u0000\u0000\u0000\u0098\u0099\u0005:"+
		"\u0000\u0000\u0099,\u0001\u0000\u0000\u0000\u009a\u009b\u0005,\u0000\u0000"+
		"\u009b.\u0001\u0000\u0000\u0000\u009c\u009d\u0005.\u0000\u0000\u009d0"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005(\u0000\u0000\u009f2\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005)\u0000\u0000\u00a14\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005[\u0000\u0000\u00a36\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005]\u0000\u0000\u00a58\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005{"+
		"\u0000\u0000\u00a7:\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005}\u0000\u0000"+
		"\u00a9<\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005;\u0000\u0000\u00ab>"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b2\u0005\"\u0000\u0000\u00ad\u00b1\b"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005\\\u0000\u0000\u00af\u00b1\t\u0000"+
		"\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00c1\u0005\"\u0000"+
		"\u0000\u00b6\u00bc\u0005\'\u0000\u0000\u00b7\u00bb\b\u0001\u0000\u0000"+
		"\u00b8\u00b9\u0005\\\u0000\u0000\u00b9\u00bb\t\u0000\u0000\u0000\u00ba"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005\'\u0000\u0000\u00c0\u00ac"+
		"\u0001\u0000\u0000\u0000\u00c0\u00b6\u0001\u0000\u0000\u0000\u00c1@\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0007\u0002\u0000\u0000\u00c3\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00cd\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c9\u0005.\u0000\u0000\u00c8\u00ca\u0007\u0002"+
		"\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c7\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ceB\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d3\u0007\u0003\u0000\u0000\u00d0\u00d2\u0007\u0004\u0000"+
		"\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4D\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00da\u0005#\u0000\u0000\u00d7\u00d9\b\u0005\u0000\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0006\"\u0000\u0000\u00deF\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0005\r\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e5\u0005"+
		"\n\u0000\u0000\u00e3\u00e5\u0007\u0006\u0000\u0000\u00e4\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5H\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e8\u0007\u0007\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0006$\u0000\u0000\u00ecJ\u0001\u0000\u0000\u0000\u000e"+
		"\u0000\u00b0\u00b2\u00ba\u00bc\u00c0\u00c5\u00cb\u00cd\u00d3\u00da\u00e0"+
		"\u00e4\u00e9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}