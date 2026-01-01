<<<<<<< HEAD
// Generated from D:/مشاريع المترجمات/Compiler_project/src/antlr/UnifiedParser.g4 by ANTLR 4.13.2
=======
// Generated from E:/مراحل عمل مشروع المترجمات/Compiler_project/src/antlr/UnifiedParser.g4 by ANTLR 4.13.2
>>>>>>> d54e76de6f500ed28981183f66cc0addcb0448e8
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class UnifiedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOCTYPE=1, COMMENT=2, STYLE_OPEN=3, SCRIPT_JSON_OPEN=4, OPEN=5, TEXT=6, 
		NEWLINE=7, CR=8, WS=9, JINJA_EXPR=10, JINJA_STMT_IF=11, JINJA_STMT_ELSE=12, 
		JINJA_STMT_ENDIF=13, JINJA_STMT_FOR=14, JINJA_STMT_ENDFOR=15, JINJA_STMT_BLOCK=16, 
		JINJA_STMT_ENDBLOCK=17, JINJA_STMT_EXTENDS=18, JINJA_STMT=19, META=20, 
		LINK=21, IMG=22, BR=23, HR=24, INPUT=25, CLOSE=26, SLASH=27, EQUALS=28, 
		ATTR_VALUE=29, NAME=30, WS_TAG=31, FONT_FAMILY=32, DIRECTION=33, BACKGROUND_COLOR=34, 
		PADDING=35, MAX_WIDTH=36, MARGIN=37, BACKGROUND=38, BORDER_RADIUS=39, 
		BOX_SHADOW=40, TEXT_ALIGN=41, COLOR=42, DISPLAY=43, MARGIN_TOP=44, WIDTH=45, 
		BORDER=46, CURSOR=47, LIST_STYLE=48, TEXT_DECORATION=49, MARGIN_BOTTOM=50, 
		CLASS_SELECTOR=51, LBRACE=52, RBRACE=53, COLON=54, SEMICOLON=55, DOT=56, 
		HASH=57, FUNCTION=58, IDENTIFIER=59, VALUE=60, WS_CSS=61, STYLE_CLOSE=62, 
		LBRACE_JSON=63, RBRACE_JSON=64, LBRACKET=65, RBRACKET=66, COLON_JSON=67, 
		COMMA=68, TRUE=69, FALSE=70, NULL=71, STRING=72, NUMBER=73, WS_JSON=74, 
		SCRIPT_JSON_CLOSE=75;
	public static final int
		RULE_program = 0, RULE_programItem = 1, RULE_htmlDocument = 2, RULE_doctype = 3, 
		RULE_styleBlock = 4, RULE_scriptJsonBlock = 5, RULE_element = 6, RULE_normalElement = 7, 
		RULE_voidHtmlElement = 8, RULE_voidName = 9, RULE_startTag = 10, RULE_endTag = 11, 
		RULE_selfClosingTag = 12, RULE_content = 13, RULE_attribute = 14, RULE_misc = 15, 
		RULE_jinjaStmt = 16, RULE_jinjaIf = 17, RULE_jinjaFor = 18, RULE_jinjaBlock = 19, 
		RULE_jinjaExtends = 20, RULE_cssStylesheet = 21, RULE_ruleSet = 22, RULE_selector = 23, 
		RULE_simpleSelector = 24, RULE_elementSelector = 25, RULE_pseudoClass = 26, 
		RULE_declaration = 27, RULE_valueGroup = 28, RULE_property = 29, RULE_jsonDocument = 30, 
		RULE_value = 31, RULE_object = 32, RULE_pair = 33, RULE_array = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programItem", "htmlDocument", "doctype", "styleBlock", "scriptJsonBlock", 
			"element", "normalElement", "voidHtmlElement", "voidName", "startTag", 
			"endTag", "selfClosingTag", "content", "attribute", "misc", "jinjaStmt", 
			"jinjaIf", "jinjaFor", "jinjaBlock", "jinjaExtends", "cssStylesheet", 
			"ruleSet", "selector", "simpleSelector", "elementSelector", "pseudoClass", 
			"declaration", "valueGroup", "property", "jsonDocument", "value", "object", 
			"pair", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<style>'", "'<script>'", "'<'", null, null, "'\\r'", 
			null, null, null, null, null, null, null, null, null, null, null, "'meta'", 
			"'link'", "'img'", "'br'", "'hr'", "'input'", "'>'", "'/'", "'='", null, 
			null, null, "'font-family'", "'direction'", "'background-color'", "'padding'", 
			"'max-width'", "'margin'", "'background'", "'border-radius'", "'box-shadow'", 
			"'text-align'", "'color'", "'display'", "'margin-top'", "'width'", "'border'", 
			"'cursor'", "'list-style'", "'text-decoration'", "'margin-bottom'", null, 
			null, null, null, "';'", "'.'", "'#'", null, null, null, null, "'</style>'", 
			null, null, "'['", "']'", null, "','", "'true'", "'false'", "'null'", 
			null, null, null, "'</script>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOCTYPE", "COMMENT", "STYLE_OPEN", "SCRIPT_JSON_OPEN", "OPEN", 
			"TEXT", "NEWLINE", "CR", "WS", "JINJA_EXPR", "JINJA_STMT_IF", "JINJA_STMT_ELSE", 
			"JINJA_STMT_ENDIF", "JINJA_STMT_FOR", "JINJA_STMT_ENDFOR", "JINJA_STMT_BLOCK", 
			"JINJA_STMT_ENDBLOCK", "JINJA_STMT_EXTENDS", "JINJA_STMT", "META", "LINK", 
			"IMG", "BR", "HR", "INPUT", "CLOSE", "SLASH", "EQUALS", "ATTR_VALUE", 
			"NAME", "WS_TAG", "FONT_FAMILY", "DIRECTION", "BACKGROUND_COLOR", "PADDING", 
			"MAX_WIDTH", "MARGIN", "BACKGROUND", "BORDER_RADIUS", "BOX_SHADOW", "TEXT_ALIGN", 
			"COLOR", "DISPLAY", "MARGIN_TOP", "WIDTH", "BORDER", "CURSOR", "LIST_STYLE", 
			"TEXT_DECORATION", "MARGIN_BOTTOM", "CLASS_SELECTOR", "LBRACE", "RBRACE", 
			"COLON", "SEMICOLON", "DOT", "HASH", "FUNCTION", "IDENTIFIER", "VALUE", 
			"WS_CSS", "STYLE_CLOSE", "LBRACE_JSON", "RBRACE_JSON", "LBRACKET", "RBRACKET", 
			"COLON_JSON", "COMMA", "TRUE", "FALSE", "NULL", "STRING", "NUMBER", "WS_JSON", 
			"SCRIPT_JSON_CLOSE"
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

	@Override
	public String getGrammarFileName() { return "UnifiedParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UnifiedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(UnifiedParser.EOF, 0); }
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public List<ProgramItemContext> programItem() {
			return getRuleContexts(ProgramItemContext.class);
		}
		public ProgramItemContext programItem(int i) {
			return getRuleContext(ProgramItemContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(70);
				doctype();
				}
				break;
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -8644659484736795398L) != 0) || _la==LBRACKET) {
				{
				{
				setState(73);
				programItem();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramItemContext extends ParserRuleContext {
		public HtmlDocumentContext htmlDocument() {
			return getRuleContext(HtmlDocumentContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public MiscContext misc() {
			return getRuleContext(MiscContext.class,0);
		}
		public StyleBlockContext styleBlock() {
			return getRuleContext(StyleBlockContext.class,0);
		}
		public ScriptJsonBlockContext scriptJsonBlock() {
			return getRuleContext(ScriptJsonBlockContext.class,0);
		}
		public CssStylesheetContext cssStylesheet() {
			return getRuleContext(CssStylesheetContext.class,0);
		}
		public JsonDocumentContext jsonDocument() {
			return getRuleContext(JsonDocumentContext.class,0);
		}
		public ProgramItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterProgramItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitProgramItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitProgramItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramItemContext programItem() throws RecognitionException {
		ProgramItemContext _localctx = new ProgramItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programItem);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				htmlDocument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				misc();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				styleBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				scriptJsonBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				cssStylesheet();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				jsonDocument();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<DoctypeContext> doctype() {
			return getRuleContexts(DoctypeContext.class);
		}
		public DoctypeContext doctype(int i) {
			return getRuleContext(DoctypeContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(UnifiedParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(UnifiedParser.NEWLINE, i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlDocument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(94);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOCTYPE:
						{
						setState(90);
						doctype();
						}
						break;
					case OPEN:
						{
						setState(91);
						element();
						}
						break;
					case TEXT:
					case JINJA_EXPR:
					case JINJA_STMT_IF:
					case JINJA_STMT_FOR:
					case JINJA_STMT_BLOCK:
					case JINJA_STMT_EXTENDS:
					case JINJA_STMT:
						{
						setState(92);
						misc();
						}
						break;
					case NEWLINE:
						{
						setState(93);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode DOCTYPE() { return getToken(UnifiedParser.DOCTYPE, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_doctype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(DOCTYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleBlockContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(UnifiedParser.STYLE_OPEN, 0); }
		public CssStylesheetContext cssStylesheet() {
			return getRuleContext(CssStylesheetContext.class,0);
		}
		public List<TerminalNode> STYLE_CLOSE() { return getTokens(UnifiedParser.STYLE_CLOSE); }
		public TerminalNode STYLE_CLOSE(int i) {
			return getToken(UnifiedParser.STYLE_CLOSE, i);
		}
		public StyleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterStyleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitStyleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitStyleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleBlockContext styleBlock() throws RecognitionException {
		StyleBlockContext _localctx = new StyleBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_styleBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(STYLE_OPEN);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(101);
				cssStylesheet();
				}
				break;
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE_CLOSE) {
				{
				{
				setState(104);
				match(STYLE_CLOSE);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptJsonBlockContext extends ParserRuleContext {
		public TerminalNode SCRIPT_JSON_OPEN() { return getToken(UnifiedParser.SCRIPT_JSON_OPEN, 0); }
		public TerminalNode SCRIPT_JSON_CLOSE() { return getToken(UnifiedParser.SCRIPT_JSON_CLOSE, 0); }
		public JsonDocumentContext jsonDocument() {
			return getRuleContext(JsonDocumentContext.class,0);
		}
		public ScriptJsonBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptJsonBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterScriptJsonBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitScriptJsonBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitScriptJsonBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptJsonBlockContext scriptJsonBlock() throws RecognitionException {
		ScriptJsonBlockContext _localctx = new ScriptJsonBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scriptJsonBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(SCRIPT_JSON_OPEN);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE_JSON || _la==LBRACKET) {
				{
				setState(111);
				jsonDocument();
				}
			}

			setState(114);
			match(SCRIPT_JSON_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public NormalElementContext normalElement() {
			return getRuleContext(NormalElementContext.class,0);
		}
		public VoidHtmlElementContext voidHtmlElement() {
			return getRuleContext(VoidHtmlElementContext.class,0);
		}
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_element);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				normalElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				voidHtmlElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				selfClosingTag();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends ParserRuleContext {
		public StartTagContext startTag() {
			return getRuleContext(StartTagContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public NormalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalElementContext normalElement() throws RecognitionException {
		NormalElementContext _localctx = new NormalElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_normalElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			startTag();
			setState(122);
			content();
			setState(123);
			endTag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VoidHtmlElementContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UnifiedParser.OPEN, 0); }
		public VoidNameContext voidName() {
			return getRuleContext(VoidNameContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(UnifiedParser.CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public VoidHtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidHtmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterVoidHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitVoidHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitVoidHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidHtmlElementContext voidHtmlElement() throws RecognitionException {
		VoidHtmlElementContext _localctx = new VoidHtmlElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_voidHtmlElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(OPEN);
			setState(126);
			voidName();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(127);
				attribute();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VoidNameContext extends ParserRuleContext {
		public TerminalNode META() { return getToken(UnifiedParser.META, 0); }
		public TerminalNode LINK() { return getToken(UnifiedParser.LINK, 0); }
		public TerminalNode IMG() { return getToken(UnifiedParser.IMG, 0); }
		public TerminalNode BR() { return getToken(UnifiedParser.BR, 0); }
		public TerminalNode HR() { return getToken(UnifiedParser.HR, 0); }
		public TerminalNode INPUT() { return getToken(UnifiedParser.INPUT, 0); }
		public VoidNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterVoidName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitVoidName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitVoidName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidNameContext voidName() throws RecognitionException {
		VoidNameContext _localctx = new VoidNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_voidName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartTagContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UnifiedParser.OPEN, 0); }
		public TerminalNode NAME() { return getToken(UnifiedParser.NAME, 0); }
		public TerminalNode CLOSE() { return getToken(UnifiedParser.CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public StartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterStartTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitStartTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitStartTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartTagContext startTag() throws RecognitionException {
		StartTagContext _localctx = new StartTagContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_startTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(OPEN);
			setState(138);
			match(NAME);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(139);
				attribute();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndTagContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UnifiedParser.OPEN, 0); }
		public TerminalNode SLASH() { return getToken(UnifiedParser.SLASH, 0); }
		public TerminalNode NAME() { return getToken(UnifiedParser.NAME, 0); }
		public TerminalNode CLOSE() { return getToken(UnifiedParser.CLOSE, 0); }
		public EndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndTagContext endTag() throws RecognitionException {
		EndTagContext _localctx = new EndTagContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(OPEN);
			setState(148);
			match(SLASH);
			setState(149);
			match(NAME);
			setState(150);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(UnifiedParser.OPEN, 0); }
		public TerminalNode NAME() { return getToken(UnifiedParser.NAME, 0); }
		public TerminalNode SLASH() { return getToken(UnifiedParser.SLASH, 0); }
		public TerminalNode CLOSE() { return getToken(UnifiedParser.CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(OPEN);
			setState(153);
			match(NAME);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(154);
				attribute();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(SLASH);
			setState(161);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<MiscContext> misc() {
			return getRuleContexts(MiscContext.class);
		}
		public MiscContext misc(int i) {
			return getRuleContext(MiscContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(165);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN:
						{
						setState(163);
						element();
						}
						break;
					case TEXT:
					case JINJA_EXPR:
					case JINJA_STMT_IF:
					case JINJA_STMT_FOR:
					case JINJA_STMT_BLOCK:
					case JINJA_STMT_EXTENDS:
					case JINJA_STMT:
						{
						setState(164);
						misc();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(UnifiedParser.NAME, 0); }
		public TerminalNode EQUALS() { return getToken(UnifiedParser.EQUALS, 0); }
		public TerminalNode ATTR_VALUE() { return getToken(UnifiedParser.ATTR_VALUE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attribute);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(NAME);
				setState(171);
				match(EQUALS);
				setState(172);
				match(ATTR_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(NAME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MiscContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(UnifiedParser.TEXT, 0); }
		public TerminalNode JINJA_EXPR() { return getToken(UnifiedParser.JINJA_EXPR, 0); }
		public JinjaStmtContext jinjaStmt() {
			return getRuleContext(JinjaStmtContext.class,0);
		}
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_misc);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(TEXT);
				}
				break;
			case JINJA_EXPR:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(JINJA_EXPR);
				}
				break;
			case JINJA_STMT_IF:
			case JINJA_STMT_FOR:
			case JINJA_STMT_BLOCK:
			case JINJA_STMT_EXTENDS:
			case JINJA_STMT:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				jinjaStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStmtContext extends ParserRuleContext {
		public JinjaIfContext jinjaIf() {
			return getRuleContext(JinjaIfContext.class,0);
		}
		public JinjaForContext jinjaFor() {
			return getRuleContext(JinjaForContext.class,0);
		}
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public JinjaExtendsContext jinjaExtends() {
			return getRuleContext(JinjaExtendsContext.class,0);
		}
		public TerminalNode JINJA_STMT() { return getToken(UnifiedParser.JINJA_STMT, 0); }
		public JinjaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterJinjaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitJinjaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitJinjaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStmtContext jinjaStmt() throws RecognitionException {
		JinjaStmtContext _localctx = new JinjaStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinjaStmt);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_STMT_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				jinjaIf();
				}
				break;
			case JINJA_STMT_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				jinjaFor();
				}
				break;
			case JINJA_STMT_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				jinjaBlock();
				}
				break;
			case JINJA_STMT_EXTENDS:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				jinjaExtends();
				}
				break;
			case JINJA_STMT:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(JINJA_STMT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_IF() { return getToken(UnifiedParser.JINJA_STMT_IF, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode JINJA_STMT_ENDIF() { return getToken(UnifiedParser.JINJA_STMT_ENDIF, 0); }
		public JinjaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterJinjaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitJinjaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitJinjaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfContext jinjaIf() throws RecognitionException {
		JinjaIfContext _localctx = new JinjaIfContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinjaIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(JINJA_STMT_IF);
			setState(189);
			content();
			setState(190);
			match(JINJA_STMT_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_FOR() { return getToken(UnifiedParser.JINJA_STMT_FOR, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public TerminalNode JINJA_STMT_ENDFOR() { return getToken(UnifiedParser.JINJA_STMT_ENDFOR, 0); }
		public TerminalNode JINJA_STMT_ELSE() { return getToken(UnifiedParser.JINJA_STMT_ELSE, 0); }
		public JinjaForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterJinjaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitJinjaFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitJinjaFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForContext jinjaFor() throws RecognitionException {
		JinjaForContext _localctx = new JinjaForContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jinjaFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(JINJA_STMT_FOR);
			setState(193);
			content();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_STMT_ELSE) {
				{
				setState(194);
				match(JINJA_STMT_ELSE);
				setState(195);
				content();
				}
			}

			setState(198);
			match(JINJA_STMT_ENDFOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_BLOCK() { return getToken(UnifiedParser.JINJA_STMT_BLOCK, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode JINJA_STMT_ENDBLOCK() { return getToken(UnifiedParser.JINJA_STMT_ENDBLOCK, 0); }
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jinjaBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(JINJA_STMT_BLOCK);
			setState(201);
			content();
			setState(202);
			match(JINJA_STMT_ENDBLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExtendsContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_EXTENDS() { return getToken(UnifiedParser.JINJA_STMT_EXTENDS, 0); }
		public JinjaExtendsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExtends; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterJinjaExtends(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitJinjaExtends(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitJinjaExtends(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExtendsContext jinjaExtends() throws RecognitionException {
		JinjaExtendsContext _localctx = new JinjaExtendsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jinjaExtends);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(JINJA_STMT_EXTENDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssStylesheetContext extends ParserRuleContext {
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public CssStylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterCssStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitCssStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitCssStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStylesheetContext cssStylesheet() throws RecognitionException {
		CssStylesheetContext _localctx = new CssStylesheetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cssStylesheet);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(206);
					ruleSet();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UnifiedParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UnifiedParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ruleSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			selector();
			setState(212);
			match(LBRACE);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251795518717952L) != 0)) {
				{
				{
				setState(213);
				declaration();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				simpleSelector();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS_SELECTOR || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public ElementSelectorContext elementSelector() {
			return getRuleContext(ElementSelectorContext.class,0);
		}
		public PseudoClassContext pseudoClass() {
			return getRuleContext(PseudoClassContext.class,0);
		}
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			elementSelector();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(227);
				pseudoClass();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementSelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(UnifiedParser.IDENTIFIER, 0); }
		public TerminalNode CLASS_SELECTOR() { return getToken(UnifiedParser.CLASS_SELECTOR, 0); }
		public ElementSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitElementSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitElementSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementSelectorContext elementSelector() throws RecognitionException {
		ElementSelectorContext _localctx = new ElementSelectorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elementSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==CLASS_SELECTOR || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoClassContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(UnifiedParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(UnifiedParser.IDENTIFIER, 0); }
		public PseudoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterPseudoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitPseudoClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitPseudoClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoClassContext pseudoClass() throws RecognitionException {
		PseudoClassContext _localctx = new PseudoClassContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pseudoClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(COLON);
			setState(233);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(UnifiedParser.COLON, 0); }
		public ValueGroupContext valueGroup() {
			return getRuleContext(ValueGroupContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UnifiedParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			property();
			setState(236);
			match(COLON);
			setState(237);
			valueGroup();
			setState(238);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueGroupContext extends ParserRuleContext {
		public List<TerminalNode> VALUE() { return getTokens(UnifiedParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(UnifiedParser.VALUE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(UnifiedParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(UnifiedParser.IDENTIFIER, i);
		}
		public List<TerminalNode> HASH() { return getTokens(UnifiedParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(UnifiedParser.HASH, i);
		}
		public List<TerminalNode> DOT() { return getTokens(UnifiedParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(UnifiedParser.DOT, i);
		}
		public List<TerminalNode> COLON() { return getTokens(UnifiedParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(UnifiedParser.COLON, i);
		}
		public List<TerminalNode> CLASS_SELECTOR() { return getTokens(UnifiedParser.CLASS_SELECTOR); }
		public TerminalNode CLASS_SELECTOR(int i) {
			return getToken(UnifiedParser.CLASS_SELECTOR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(UnifiedParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(UnifiedParser.NUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(UnifiedParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(UnifiedParser.STRING, i);
		}
		public List<TerminalNode> FUNCTION() { return getTokens(UnifiedParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(UnifiedParser.FUNCTION, i);
		}
		public ValueGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterValueGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitValueGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitValueGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueGroupContext valueGroup() throws RecognitionException {
		ValueGroupContext _localctx = new ValueGroupContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_valueGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				_la = _input.LA(1);
				if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 6292457L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 6292457L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode FONT_FAMILY() { return getToken(UnifiedParser.FONT_FAMILY, 0); }
		public TerminalNode DIRECTION() { return getToken(UnifiedParser.DIRECTION, 0); }
		public TerminalNode BACKGROUND_COLOR() { return getToken(UnifiedParser.BACKGROUND_COLOR, 0); }
		public TerminalNode PADDING() { return getToken(UnifiedParser.PADDING, 0); }
		public TerminalNode MAX_WIDTH() { return getToken(UnifiedParser.MAX_WIDTH, 0); }
		public TerminalNode MARGIN() { return getToken(UnifiedParser.MARGIN, 0); }
		public TerminalNode BACKGROUND() { return getToken(UnifiedParser.BACKGROUND, 0); }
		public TerminalNode BORDER_RADIUS() { return getToken(UnifiedParser.BORDER_RADIUS, 0); }
		public TerminalNode BOX_SHADOW() { return getToken(UnifiedParser.BOX_SHADOW, 0); }
		public TerminalNode TEXT_ALIGN() { return getToken(UnifiedParser.TEXT_ALIGN, 0); }
		public TerminalNode COLOR() { return getToken(UnifiedParser.COLOR, 0); }
		public TerminalNode DISPLAY() { return getToken(UnifiedParser.DISPLAY, 0); }
		public TerminalNode MARGIN_TOP() { return getToken(UnifiedParser.MARGIN_TOP, 0); }
		public TerminalNode WIDTH() { return getToken(UnifiedParser.WIDTH, 0); }
		public TerminalNode BORDER() { return getToken(UnifiedParser.BORDER, 0); }
		public TerminalNode CURSOR() { return getToken(UnifiedParser.CURSOR, 0); }
		public TerminalNode LIST_STYLE() { return getToken(UnifiedParser.LIST_STYLE, 0); }
		public TerminalNode TEXT_DECORATION() { return getToken(UnifiedParser.TEXT_DECORATION, 0); }
		public TerminalNode MARGIN_BOTTOM() { return getToken(UnifiedParser.MARGIN_BOTTOM, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2251795518717952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonDocumentContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public JsonDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterJsonDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitJsonDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitJsonDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonDocumentContext jsonDocument() throws RecognitionException {
		JsonDocumentContext _localctx = new JsonDocumentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jsonDocument);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE_JSON:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				object();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(UnifiedParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(UnifiedParser.STRING, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(UnifiedParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(UnifiedParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(UnifiedParser.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_value);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				array();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(STRING);
				}
				break;
			case LBRACE_JSON:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				object();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE_JSON() { return getToken(UnifiedParser.LBRACE_JSON, 0); }
		public TerminalNode RBRACE_JSON() { return getToken(UnifiedParser.RBRACE_JSON, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UnifiedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UnifiedParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(LBRACE_JSON);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(261);
				pair();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(262);
					match(COMMA);
					setState(263);
					pair();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(271);
			match(RBRACE_JSON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UnifiedParser.STRING, 0); }
		public TerminalNode COLON_JSON() { return getToken(UnifiedParser.COLON_JSON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(STRING);
			setState(274);
			match(COLON_JSON);
			setState(275);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(UnifiedParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(UnifiedParser.RBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UnifiedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UnifiedParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnifiedParserListener ) ((UnifiedParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnifiedParserVisitor ) return ((UnifiedParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LBRACKET);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 1989L) != 0)) {
				{
				setState(278);
				value();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(279);
					match(COMMA);
					setState(280);
					value();
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(288);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001K\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0003\u0000H\b\u0000\u0001\u0000\u0005\u0000K\b\u0000\n\u0000\f"+
		"\u0000N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Y\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002_\b"+
		"\u0002\u000b\u0002\f\u0002`\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004g\b\u0004\u0001\u0004\u0005\u0004j\b\u0004\n\u0004\f"+
		"\u0004m\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005q\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006x\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u0081\b\b\n\b\f\b\u0084\t\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u008d\b\n\n\n\f\n\u0090\t\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0005\f\u009c\b\f\n\f\f\f\u009f\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0005\r\u00a6\b\r\n\r\f\r\u00a9\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00af\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00b4\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00bb\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00c5\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0004"+
		"\u0015\u00d0\b\u0015\u000b\u0015\f\u0015\u00d1\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00d7\b\u0016\n\u0016\f\u0016\u00da\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u00df\b\u0017\u000b\u0017\f"+
		"\u0017\u00e0\u0001\u0018\u0001\u0018\u0003\u0018\u00e5\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004\u001c\u00f2\b\u001c"+
		"\u000b\u001c\f\u001c\u00f3\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u00fa\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0103\b\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0005 \u0109\b \n \f \u010c\t \u0003 \u010e\b \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u011a\b\"\n\"\f\"\u011d\t\"\u0003\"\u011f\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0004\u0001\u0000"+
		"\u0014\u0019\u0002\u000033;;\u0004\u000033668<HI\u0001\u0000 2\u012d\u0000"+
		"G\u0001\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004^\u0001"+
		"\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000"+
		"\u0000\nn\u0001\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000\u000ey\u0001"+
		"\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u0087\u0001\u0000"+
		"\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000"+
		"\u0000\u0000\u0018\u0098\u0001\u0000\u0000\u0000\u001a\u00a7\u0001\u0000"+
		"\u0000\u0000\u001c\u00ae\u0001\u0000\u0000\u0000\u001e\u00b3\u0001\u0000"+
		"\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00bc\u0001\u0000\u0000"+
		"\u0000$\u00c0\u0001\u0000\u0000\u0000&\u00c8\u0001\u0000\u0000\u0000("+
		"\u00cc\u0001\u0000\u0000\u0000*\u00cf\u0001\u0000\u0000\u0000,\u00d3\u0001"+
		"\u0000\u0000\u0000.\u00de\u0001\u0000\u0000\u00000\u00e2\u0001\u0000\u0000"+
		"\u00002\u00e6\u0001\u0000\u0000\u00004\u00e8\u0001\u0000\u0000\u00006"+
		"\u00eb\u0001\u0000\u0000\u00008\u00f1\u0001\u0000\u0000\u0000:\u00f5\u0001"+
		"\u0000\u0000\u0000<\u00f9\u0001\u0000\u0000\u0000>\u0102\u0001\u0000\u0000"+
		"\u0000@\u0104\u0001\u0000\u0000\u0000B\u0111\u0001\u0000\u0000\u0000D"+
		"\u0115\u0001\u0000\u0000\u0000FH\u0003\u0006\u0003\u0000GF\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HL\u0001\u0000\u0000\u0000IK\u0003"+
		"\u0002\u0001\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u0000\u0000\u0001P\u0001\u0001"+
		"\u0000\u0000\u0000QY\u0003\u0004\u0002\u0000RY\u0003\f\u0006\u0000SY\u0003"+
		"\u001e\u000f\u0000TY\u0003\b\u0004\u0000UY\u0003\n\u0005\u0000VY\u0003"+
		"*\u0015\u0000WY\u0003<\u001e\u0000XQ\u0001\u0000\u0000\u0000XR\u0001\u0000"+
		"\u0000\u0000XS\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000XU\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\u0003\u0001\u0000\u0000\u0000Z_\u0003\u0006\u0003\u0000[_\u0003\f\u0006"+
		"\u0000\\_\u0003\u001e\u000f\u0000]_\u0005\u0007\u0000\u0000^Z\u0001\u0000"+
		"\u0000\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a\u0005\u0001\u0000\u0000\u0000bc\u0005\u0001"+
		"\u0000\u0000c\u0007\u0001\u0000\u0000\u0000df\u0005\u0003\u0000\u0000"+
		"eg\u0003*\u0015\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gk\u0001\u0000\u0000\u0000hj\u0005>\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000l\t\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0005\u0004"+
		"\u0000\u0000oq\u0003<\u001e\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005K\u0000\u0000s\u000b\u0001"+
		"\u0000\u0000\u0000tx\u0003\u000e\u0007\u0000ux\u0003\u0010\b\u0000vx\u0003"+
		"\u0018\f\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001"+
		"\u0000\u0000\u0000x\r\u0001\u0000\u0000\u0000yz\u0003\u0014\n\u0000z{"+
		"\u0003\u001a\r\u0000{|\u0003\u0016\u000b\u0000|\u000f\u0001\u0000\u0000"+
		"\u0000}~\u0005\u0005\u0000\u0000~\u0082\u0003\u0012\t\u0000\u007f\u0081"+
		"\u0003\u001c\u000e\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u001a\u0000\u0000\u0086\u0011"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0007\u0000\u0000\u0000\u0088\u0013"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0005\u0000\u0000\u008a\u008e"+
		"\u0005\u001e\u0000\u0000\u008b\u008d\u0003\u001c\u000e\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u001a\u0000\u0000\u0092\u0015\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\u0005\u0000\u0000\u0094\u0095\u0005\u001b\u0000\u0000\u0095\u0096"+
		"\u0005\u001e\u0000\u0000\u0096\u0097\u0005\u001a\u0000\u0000\u0097\u0017"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0005\u0000\u0000\u0099\u009d"+
		"\u0005\u001e\u0000\u0000\u009a\u009c\u0003\u001c\u000e\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005\u001b\u0000\u0000\u00a1\u00a2\u0005\u001a\u0000\u0000\u00a2\u0019"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a6\u0003\f\u0006\u0000\u00a4\u00a6\u0003"+
		"\u001e\u000f\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u001b\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"\u001e\u0000\u0000\u00ab\u00ac\u0005\u001c\u0000\u0000\u00ac\u00af\u0005"+
		"\u001d\u0000\u0000\u00ad\u00af\u0005\u001e\u0000\u0000\u00ae\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u001d\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b4\u0005\u0006\u0000\u0000\u00b1\u00b4\u0005"+
		"\n\u0000\u0000\u00b2\u00b4\u0003 \u0010\u0000\u00b3\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u001f\u0001\u0000\u0000\u0000\u00b5\u00bb\u0003\"\u0011"+
		"\u0000\u00b6\u00bb\u0003$\u0012\u0000\u00b7\u00bb\u0003&\u0013\u0000\u00b8"+
		"\u00bb\u0003(\u0014\u0000\u00b9\u00bb\u0005\u0013\u0000\u0000\u00ba\u00b5"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b7"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb!\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u000b\u0000\u0000\u00bd\u00be\u0003\u001a\r\u0000\u00be\u00bf\u0005\r"+
		"\u0000\u0000\u00bf#\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u000e\u0000"+
		"\u0000\u00c1\u00c4\u0003\u001a\r\u0000\u00c2\u00c3\u0005\f\u0000\u0000"+
		"\u00c3\u00c5\u0003\u001a\r\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005\u000f\u0000\u0000\u00c7%\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0005\u0010\u0000\u0000\u00c9\u00ca\u0003\u001a\r\u0000\u00ca\u00cb\u0005"+
		"\u0011\u0000\u0000\u00cb\'\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0012"+
		"\u0000\u0000\u00cd)\u0001\u0000\u0000\u0000\u00ce\u00d0\u0003,\u0016\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2+\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003.\u0017\u0000\u00d4\u00d8"+
		"\u00054\u0000\u0000\u00d5\u00d7\u00036\u001b\u0000\u00d6\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0001\u0000"+
		"\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u00055\u0000"+
		"\u0000\u00dc-\u0001\u0000\u0000\u0000\u00dd\u00df\u00030\u0018\u0000\u00de"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"/\u0001\u0000\u0000\u0000\u00e2\u00e4\u00032\u0019\u0000\u00e3\u00e5\u0003"+
		"4\u001a\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e51\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007\u0001\u0000"+
		"\u0000\u00e73\u0001\u0000\u0000\u0000\u00e8\u00e9\u00056\u0000\u0000\u00e9"+
		"\u00ea\u0005;\u0000\u0000\u00ea5\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003"+
		":\u001d\u0000\u00ec\u00ed\u00056\u0000\u0000\u00ed\u00ee\u00038\u001c"+
		"\u0000\u00ee\u00ef\u00057\u0000\u0000\u00ef7\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f2\u0007\u0002\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f49\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0007\u0003\u0000\u0000\u00f6;\u0001\u0000\u0000\u0000\u00f7\u00fa\u0003"+
		"@ \u0000\u00f8\u00fa\u0003D\"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa=\u0001\u0000\u0000\u0000\u00fb"+
		"\u0103\u0003D\"\u0000\u00fc\u0103\u0005I\u0000\u0000\u00fd\u0103\u0005"+
		"H\u0000\u0000\u00fe\u0103\u0003@ \u0000\u00ff\u0103\u0005E\u0000\u0000"+
		"\u0100\u0103\u0005F\u0000\u0000\u0101\u0103\u0005G\u0000\u0000\u0102\u00fb"+
		"\u0001\u0000\u0000\u0000\u0102\u00fc\u0001\u0000\u0000\u0000\u0102\u00fd"+
		"\u0001\u0000\u0000\u0000\u0102\u00fe\u0001\u0000\u0000\u0000\u0102\u00ff"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101"+
		"\u0001\u0000\u0000\u0000\u0103?\u0001\u0000\u0000\u0000\u0104\u010d\u0005"+
		"?\u0000\u0000\u0105\u010a\u0003B!\u0000\u0106\u0107\u0005D\u0000\u0000"+
		"\u0107\u0109\u0003B!\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c"+
		"\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0005@\u0000\u0000\u0110A\u0001\u0000\u0000\u0000\u0111\u0112\u0005H"+
		"\u0000\u0000\u0112\u0113\u0005C\u0000\u0000\u0113\u0114\u0003>\u001f\u0000"+
		"\u0114C\u0001\u0000\u0000\u0000\u0115\u011e\u0005A\u0000\u0000\u0116\u011b"+
		"\u0003>\u001f\u0000\u0117\u0118\u0005D\u0000\u0000\u0118\u011a\u0003>"+
		"\u001f\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000"+
		"\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011e\u0116\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0005B\u0000"+
		"\u0000\u0121E\u0001\u0000\u0000\u0000\u001dGLX^`fkpw\u0082\u008e\u009d"+
		"\u00a5\u00a7\u00ae\u00b3\u00ba\u00c4\u00d1\u00d8\u00e0\u00e4\u00f3\u00f9"+
		"\u0102\u010a\u010d\u011b\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}