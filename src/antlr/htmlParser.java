// Generated from C:/Users/TWL/Desktop/psychic-broccoli-main/grammars/htmlParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class htmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML_DECLARATION=3, CDATA=4, 
		DTD=5, SCRIPTLET=6, SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, 
		JINJA_EXPR=11, JINJA_STATEMENT=12, HTML_TEXT=13, TAG_CLOSE=14, TAG_SLASH_CLOSE=15, 
		TAG_SLASH=16, TAG_EQUALS=17, TAG_NAME=18, TAG_WHITESPACE=19, TAG_ATTVALUE_VALUE=20, 
		SCRIPT_CLOSE=21, SCRIPT_BODY=22, STYLE_CLOSE=23, STYLE_BODY=24;
	public static final int
		RULE_document = 0, RULE_htmlContent = 1, RULE_htmlElement = 2, RULE_attribute = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "htmlContent", "htmlElement", "attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'<script'", "'<style'", 
			"'<'", null, null, null, "'>'", "'/>'", "'/'", "'='", null, null, null, 
			"'</script>'", null, "'</style>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", 
			"CDATA", "DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
			"JINJA_EXPR", "JINJA_STATEMENT", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "TAG_ATTVALUE_VALUE", 
			"SCRIPT_CLOSE", "SCRIPT_BODY", "STYLE_CLOSE", "STYLE_BODY"
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
	public String getGrammarFileName() { return "htmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public htmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(htmlParser.EOF, 0); }
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htmlParserVisitor ) return ((htmlParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16208L) != 0)) {
				{
				{
				setState(8);
				htmlContent();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode HTML_TEXT() { return getToken(htmlParser.HTML_TEXT, 0); }
		public TerminalNode JINJA_EXPR() { return getToken(htmlParser.JINJA_EXPR, 0); }
		public TerminalNode JINJA_STATEMENT() { return getToken(htmlParser.JINJA_STATEMENT, 0); }
		public TerminalNode CDATA() { return getToken(htmlParser.CDATA, 0); }
		public TerminalNode SCRIPTLET() { return getToken(htmlParser.SCRIPTLET, 0); }
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htmlParserVisitor ) return ((htmlParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlContent);
		try {
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPT_OPEN:
			case STYLE_OPEN:
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				htmlElement();
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(HTML_TEXT);
				}
				break;
			case JINJA_EXPR:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(JINJA_EXPR);
				}
				break;
			case JINJA_STATEMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				match(JINJA_STATEMENT);
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(20);
				match(CDATA);
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 6);
				{
				setState(21);
				match(SCRIPTLET);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(htmlParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(htmlParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(htmlParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(htmlParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(htmlParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(htmlParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH() { return getToken(htmlParser.TAG_SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(htmlParser.TAG_SLASH_CLOSE, 0); }
		public TerminalNode SCRIPT_OPEN() { return getToken(htmlParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(htmlParser.SCRIPT_CLOSE, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(htmlParser.SCRIPT_BODY, 0); }
		public TerminalNode STYLE_OPEN() { return getToken(htmlParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_CLOSE() { return getToken(htmlParser.STYLE_CLOSE, 0); }
		public TerminalNode STYLE_BODY() { return getToken(htmlParser.STYLE_BODY, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htmlParserVisitor ) return ((htmlParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(TAG_OPEN);
				setState(25);
				match(TAG_NAME);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(26);
					attribute();
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				match(TAG_CLOSE);
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(33);
						htmlContent();
						}
						} 
					}
					setState(38);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(39);
				match(TAG_OPEN);
				setState(40);
				match(TAG_SLASH);
				setState(41);
				match(TAG_NAME);
				setState(42);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(TAG_OPEN);
				setState(44);
				match(TAG_NAME);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(45);
					attribute();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(TAG_OPEN);
				setState(53);
				match(TAG_NAME);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(54);
					attribute();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(TAG_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				match(SCRIPT_OPEN);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(62);
					attribute();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				match(TAG_CLOSE);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCRIPT_BODY) {
					{
					setState(69);
					match(SCRIPT_BODY);
					}
				}

				setState(72);
				match(SCRIPT_CLOSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(STYLE_OPEN);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(74);
					attribute();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				match(TAG_CLOSE);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STYLE_BODY) {
					{
					setState(81);
					match(STYLE_BODY);
					}
				}

				setState(84);
				match(STYLE_CLOSE);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(htmlParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(htmlParser.TAG_EQUALS, 0); }
		public TerminalNode TAG_ATTVALUE_VALUE() { return getToken(htmlParser.TAG_ATTVALUE_VALUE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof htmlParserListener ) ((htmlParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof htmlParserVisitor ) return ((htmlParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TAG_NAME);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(88);
				match(TAG_EQUALS);
				setState(89);
				match(TAG_ATTVALUE_VALUE);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018]\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0017"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001c\b\u0002"+
		"\n\u0002\f\u0002\u001f\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002#\b"+
		"\u0002\n\u0002\f\u0002&\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b\u0002\n\u0002"+
		"\f\u00022\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u00028\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002@\b\u0002\n\u0002\f\u0002C\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002G\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002S\b\u0002\u0001\u0002\u0003\u0002V\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000"+
		"\u0002\u0004\u0006\u0000\u0000k\u0000\u000b\u0001\u0000\u0000\u0000\u0002"+
		"\u0016\u0001\u0000\u0000\u0000\u0004U\u0001\u0000\u0000\u0000\u0006W\u0001"+
		"\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000"+
		"\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001"+
		"\u0000\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0005\u0000\u0000\u0001\u000f\u0001\u0001\u0000"+
		"\u0000\u0000\u0010\u0017\u0003\u0004\u0002\u0000\u0011\u0017\u0005\r\u0000"+
		"\u0000\u0012\u0017\u0005\u000b\u0000\u0000\u0013\u0017\u0005\f\u0000\u0000"+
		"\u0014\u0017\u0005\u0004\u0000\u0000\u0015\u0017\u0005\u0006\u0000\u0000"+
		"\u0016\u0010\u0001\u0000\u0000\u0000\u0016\u0011\u0001\u0000\u0000\u0000"+
		"\u0016\u0012\u0001\u0000\u0000\u0000\u0016\u0013\u0001\u0000\u0000\u0000"+
		"\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000"+
		"\u0017\u0003\u0001\u0000\u0000\u0000\u0018\u0019\u0005\n\u0000\u0000\u0019"+
		"\u001d\u0005\u0012\u0000\u0000\u001a\u001c\u0003\u0006\u0003\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		" \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 $\u0005"+
		"\u000e\u0000\u0000!#\u0003\u0002\u0001\u0000\"!\u0001\u0000\u0000\u0000"+
		"#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'(\u0005\n"+
		"\u0000\u0000()\u0005\u0010\u0000\u0000)*\u0005\u0012\u0000\u0000*V\u0005"+
		"\u000e\u0000\u0000+,\u0005\n\u0000\u0000,0\u0005\u0012\u0000\u0000-/\u0003"+
		"\u0006\u0003\u0000.-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u00003V\u0005\u000f\u0000\u000045\u0005\n\u0000"+
		"\u000059\u0005\u0012\u0000\u000068\u0003\u0006\u0003\u000076\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<V\u0005\u000e\u0000\u0000=A\u0005\b\u0000\u0000>@\u0003\u0006\u0003\u0000"+
		"?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DF\u0005\u000e\u0000\u0000EG\u0005\u0016\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HV\u0005\u0015\u0000\u0000IM\u0005\t\u0000\u0000JL\u0003\u0006\u0003\u0000"+
		"KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PR\u0005\u000e\u0000\u0000QS\u0005\u0018\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0005\u0017\u0000\u0000U\u0018\u0001\u0000\u0000\u0000U+\u0001\u0000"+
		"\u0000\u0000U4\u0001\u0000\u0000\u0000U=\u0001\u0000\u0000\u0000UI\u0001"+
		"\u0000\u0000\u0000V\u0005\u0001\u0000\u0000\u0000WZ\u0005\u0012\u0000"+
		"\u0000XY\u0005\u0011\u0000\u0000Y[\u0005\u0014\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0007\u0001\u0000\u0000\u0000"+
		"\f\u000b\u0016\u001d$09AFMRUZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}