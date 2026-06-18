// Generated from c:/Users/dell/psychic-broccoli/grammars/HtmlParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JINJA_EXPR_START=1, JINJA_STMT_START=2, JINJA_COMMENT_START=3, HTML_COMMENT=4, 
		HTML_CONDITIONAL_COMMENT=5, XML_DECLARATION=6, CDATA=7, DTD=8, SCRIPTLET=9, 
		SEA_WS=10, STYLE_OPEN=11, TAG_OPEN=12, HTML_TEXT=13, TAG_CLOSE=14, TAG_SLASH_CLOSE=15, 
		TAG_SLASH=16, TAG_EQUALS=17, TAG_NAME=18, TAG_WHITESPACE=19, ATTVALUE_VALUE=20, 
		STYLE_CLOSE=21, CSS_LBRACE=22, CSS_RBRACE=23, CSS_LPAREN=24, CSS_RPAREN=25, 
		CSS_COLON=26, CSS_SEMI=27, CSS_COMMA=28, CSS_DOT=29, CSS_GT=30, CSS_HASH=31, 
		CSS_HEX_COLOR=32, CSS_NUMBER=33, CSS_UNIT=34, CSS_STRING=35, CSS_ID=36, 
		CSS_Space=37, CSS_Comment=38, CSS_TILDE=39, JINJA_EXPR_END=40, JINJA_STMT_END=41, 
		J_EXTENDS=42, J_BLOCK=43, J_ENDBLOCK=44, J_FOR=45, J_ENDFOR=46, J_IF=47, 
		J_ENDIF=48, J_IN=49, J_LENGTH=50, J_OR=51, J_AND=52, J_NOT=53, J_IS=54, 
		J_FILTER=55, J_TRUE=56, J_FALSE=57, J_NONE=58, J_LPAREN=59, J_RPAREN=60, 
		J_COMMA=61, J_DOT=62, J_PIPE=63, J_EQ=64, J_NEQ=65, J_GT=66, J_LT=67, 
		J_ASSIGN=68, J_NUMBER=69, J_STRING=70, J_NAME=71, J_WS=72;
	public static final int
		RULE_html_content = 0, RULE_html_content_item = 1, RULE_htmlElement = 2, 
		RULE_tag_attribute = 3, RULE_tag_content = 4, RULE_style_sheet = 5, RULE_ruleSet = 6, 
		RULE_selector_decl = 7, RULE_css_selector_list = 8, RULE_css_selector = 9, 
		RULE_declarationList = 10, RULE_declaration = 11, RULE_css_function_args = 12, 
		RULE_css_function_call = 13, RULE_cssterm = 14, RULE_jinjaStatementBlock = 15, 
		RULE_jinjaExpressionBlock = 16, RULE_jStatement = 17, RULE_j_extends_stmt = 18, 
		RULE_j_block_stmt = 19, RULE_j_for_stmt = 20, RULE_j_if_stmt = 21, RULE_j_expression = 22, 
		RULE_j_call_expr = 23, RULE_j_var_access = 24, RULE_j_argument_list = 25, 
		RULE_j_argument = 26, RULE_j_atom = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"html_content", "html_content_item", "htmlElement", "tag_attribute", 
			"tag_content", "style_sheet", "ruleSet", "selector_decl", "css_selector_list", 
			"css_selector", "declarationList", "declaration", "css_function_args", 
			"css_function_call", "cssterm", "jinjaStatementBlock", "jinjaExpressionBlock", 
			"jStatement", "j_extends_stmt", "j_block_stmt", "j_for_stmt", "j_if_stmt", 
			"j_expression", "j_call_expr", "j_var_access", "j_argument_list", "j_argument", 
			"j_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'{%'", "'{#'", null, null, null, null, null, null, null, 
			null, null, null, null, "'/>'", "'/'", null, null, null, null, null, 
			"'{'", "'}'", null, null, "':'", "';'", null, null, null, "'#'", null, 
			null, null, null, null, null, null, "'~'", "'}}'", "'%}'", "'extends'", 
			"'block'", "'endblock'", "'for'", "'endfor'", "'if'", "'endif'", "'in'", 
			"'length'", "'or'", "'and'", "'not'", "'is'", "'filter'", "'true'", "'false'", 
			"'none'", null, null, null, null, "'|'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_COMMENT_START", 
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", "CDATA", 
			"DTD", "SCRIPTLET", "SEA_WS", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", 
			"TAG_WHITESPACE", "ATTVALUE_VALUE", "STYLE_CLOSE", "CSS_LBRACE", "CSS_RBRACE", 
			"CSS_LPAREN", "CSS_RPAREN", "CSS_COLON", "CSS_SEMI", "CSS_COMMA", "CSS_DOT", 
			"CSS_GT", "CSS_HASH", "CSS_HEX_COLOR", "CSS_NUMBER", "CSS_UNIT", "CSS_STRING", 
			"CSS_ID", "CSS_Space", "CSS_Comment", "CSS_TILDE", "JINJA_EXPR_END", 
			"JINJA_STMT_END", "J_EXTENDS", "J_BLOCK", "J_ENDBLOCK", "J_FOR", "J_ENDFOR", 
			"J_IF", "J_ENDIF", "J_IN", "J_LENGTH", "J_OR", "J_AND", "J_NOT", "J_IS", 
			"J_FILTER", "J_TRUE", "J_FALSE", "J_NONE", "J_LPAREN", "J_RPAREN", "J_COMMA", 
			"J_DOT", "J_PIPE", "J_EQ", "J_NEQ", "J_GT", "J_LT", "J_ASSIGN", "J_NUMBER", 
			"J_STRING", "J_NAME", "J_WS"
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
	public String getGrammarFileName() { return "HtmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_contentContext extends ParserRuleContext {
		public Html_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_content; }
	 
		public Html_contentContext() { }
		public void copyFrom(Html_contentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends Html_contentContext {
		public List<Html_content_itemContext> html_content_item() {
			return getRuleContexts(Html_content_itemContext.class);
		}
		public Html_content_itemContext html_content_item(int i) {
			return getRuleContext(Html_content_itemContext.class,i);
		}
		public HtmlContentContext(Html_contentContext ctx) { copyFrom(ctx); }
	}

	public final Html_contentContext html_content() throws RecognitionException {
		Html_contentContext _localctx = new Html_contentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_html_content);
		try {
			int _alt;
			_localctx = new HtmlContentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					html_content_item();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
	public static class Html_content_itemContext extends ParserRuleContext {
		public Html_content_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_content_item; }
	 
		public Html_content_itemContext() { }
		public void copyFrom(Html_content_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStmtItemContext extends Html_content_itemContext {
		public JinjaStatementBlockContext jinjaStatementBlock() {
			return getRuleContext(JinjaStatementBlockContext.class,0);
		}
		public JinjaStmtItemContext(Html_content_itemContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprItemContext extends Html_content_itemContext {
		public JinjaExpressionBlockContext jinjaExpressionBlock() {
			return getRuleContext(JinjaExpressionBlockContext.class,0);
		}
		public JinjaExprItemContext(Html_content_itemContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementItemContext extends Html_content_itemContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementItemContext(Html_content_itemContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextItemContext extends Html_content_itemContext {
		public TerminalNode HTML_TEXT() { return getToken(HtmlParser.HTML_TEXT, 0); }
		public HtmlTextItemContext(Html_content_itemContext ctx) { copyFrom(ctx); }
	}

	public final Html_content_itemContext html_content_item() throws RecognitionException {
		Html_content_itemContext _localctx = new Html_content_itemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_html_content_item);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE_OPEN:
			case TAG_OPEN:
				_localctx = new HtmlElementItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				htmlElement();
				}
				break;
			case HTML_TEXT:
				_localctx = new HtmlTextItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(HTML_TEXT);
				}
				break;
			case JINJA_STMT_START:
				_localctx = new JinjaStmtItemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				jinjaStatementBlock();
				}
				break;
			case JINJA_EXPR_START:
				_localctx = new JinjaExprItemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				jinjaExpressionBlock();
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
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagElementContext extends HtmlElementContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(HtmlParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HtmlParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HtmlParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HtmlParser.TAG_NAME, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HtmlParser.TAG_SLASH_CLOSE, 0); }
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HtmlParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HtmlParser.TAG_CLOSE, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HtmlParser.TAG_SLASH, 0); }
		public List<Tag_attributeContext> tag_attribute() {
			return getRuleContexts(Tag_attributeContext.class);
		}
		public Tag_attributeContext tag_attribute(int i) {
			return getRuleContext(Tag_attributeContext.class,i);
		}
		public TagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends HtmlElementContext {
		public TerminalNode STYLE_OPEN() { return getToken(HtmlParser.STYLE_OPEN, 0); }
		public Style_sheetContext style_sheet() {
			return getRuleContext(Style_sheetContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(HtmlParser.STYLE_CLOSE, 0); }
		public StyleElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new TagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(TAG_OPEN);
				setState(69);
				match(TAG_NAME);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(70);
					tag_attribute();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_SLASH_CLOSE:
					{
					setState(76);
					match(TAG_SLASH_CLOSE);
					}
					break;
				case TAG_CLOSE:
					{
					setState(77);
					match(TAG_CLOSE);
					setState(78);
					html_content();
					setState(79);
					match(TAG_OPEN);
					setState(80);
					match(TAG_SLASH);
					setState(81);
					match(TAG_NAME);
					setState(82);
					match(TAG_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case STYLE_OPEN:
				_localctx = new StyleElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(STYLE_OPEN);
				setState(87);
				style_sheet();
				setState(88);
				match(STYLE_CLOSE);
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
	public static class Tag_attributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HtmlParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HtmlParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HtmlParser.ATTVALUE_VALUE, 0); }
		public Tag_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_attribute; }
	}

	public final Tag_attributeContext tag_attribute() throws RecognitionException {
		Tag_attributeContext _localctx = new Tag_attributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(TAG_NAME);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(93);
				match(TAG_EQUALS);
				setState(94);
				match(ATTVALUE_VALUE);
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
	public static class Tag_contentContext extends ParserRuleContext {
		public Tag_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_content; }
	 
		public Tag_contentContext() { }
		public void copyFrom(Tag_contentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClosingMarkerContext extends Tag_contentContext {
		public TerminalNode TAG_SLASH() { return getToken(HtmlParser.TAG_SLASH, 0); }
		public ClosingMarkerContext(Tag_contentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends Tag_contentContext {
		public TerminalNode TAG_NAME() { return getToken(HtmlParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HtmlParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HtmlParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(Tag_contentContext ctx) { copyFrom(ctx); }
	}

	public final Tag_contentContext tag_content() throws RecognitionException {
		Tag_contentContext _localctx = new Tag_contentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tag_content);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				_localctx = new HtmlAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(TAG_NAME);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(98);
					match(TAG_EQUALS);
					setState(99);
					match(ATTVALUE_VALUE);
					}
				}

				}
				break;
			case TAG_SLASH:
				_localctx = new ClosingMarkerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(TAG_SLASH);
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
	public static class Style_sheetContext extends ParserRuleContext {
		public Style_sheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_sheet; }
	 
		public Style_sheetContext() { }
		public void copyFrom(Style_sheetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleSheetContext extends Style_sheetContext {
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public StyleSheetContext(Style_sheetContext ctx) { copyFrom(ctx); }
	}

	public final Style_sheetContext style_sheet() throws RecognitionException {
		Style_sheetContext _localctx = new Style_sheetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_style_sheet);
		int _la;
		try {
			_localctx = new StyleSheetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_DOT || _la==CSS_ID) {
				{
				{
				setState(105);
				ruleSet();
				}
				}
				setState(110);
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
	public static class RuleSetContext extends ParserRuleContext {
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
	 
		public RuleSetContext() { }
		public void copyFrom(RuleSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends RuleSetContext {
		public Selector_declContext selector_decl() {
			return getRuleContext(Selector_declContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(HtmlParser.CSS_LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(HtmlParser.CSS_RBRACE, 0); }
		public CssRuleContext(RuleSetContext ctx) { copyFrom(ctx); }
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ruleSet);
		try {
			_localctx = new CssRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			selector_decl();
			setState(112);
			match(CSS_LBRACE);
			setState(113);
			declarationList();
			setState(114);
			match(CSS_RBRACE);
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
	public static class Selector_declContext extends ParserRuleContext {
		public Selector_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_decl; }
	 
		public Selector_declContext() { }
		public void copyFrom(Selector_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorDeclarationContext extends Selector_declContext {
		public List<Css_selector_listContext> css_selector_list() {
			return getRuleContexts(Css_selector_listContext.class);
		}
		public Css_selector_listContext css_selector_list(int i) {
			return getRuleContext(Css_selector_listContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(HtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(HtmlParser.CSS_COMMA, i);
		}
		public CssSelectorDeclarationContext(Selector_declContext ctx) { copyFrom(ctx); }
	}

	public final Selector_declContext selector_decl() throws RecognitionException {
		Selector_declContext _localctx = new Selector_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selector_decl);
		int _la;
		try {
			_localctx = new CssSelectorDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			css_selector_list();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(117);
				match(CSS_COMMA);
				setState(118);
				css_selector_list();
				}
				}
				setState(123);
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
	public static class Css_selector_listContext extends ParserRuleContext {
		public Css_selector_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_selector_list; }
	 
		public Css_selector_listContext() { }
		public void copyFrom(Css_selector_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorListContext extends Css_selector_listContext {
		public List<Css_selectorContext> css_selector() {
			return getRuleContexts(Css_selectorContext.class);
		}
		public Css_selectorContext css_selector(int i) {
			return getRuleContext(Css_selectorContext.class,i);
		}
		public List<TerminalNode> CSS_GT() { return getTokens(HtmlParser.CSS_GT); }
		public TerminalNode CSS_GT(int i) {
			return getToken(HtmlParser.CSS_GT, i);
		}
		public CssSelectorListContext(Css_selector_listContext ctx) { copyFrom(ctx); }
	}

	public final Css_selector_listContext css_selector_list() throws RecognitionException {
		Css_selector_listContext _localctx = new Css_selector_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_css_selector_list);
		int _la;
		try {
			_localctx = new CssSelectorListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			css_selector();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70330089472L) != 0)) {
				{
				{
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_GT) {
					{
					setState(125);
					match(CSS_GT);
					}
				}

				setState(128);
				css_selector();
				}
				}
				setState(133);
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
	public static class Css_selectorContext extends ParserRuleContext {
		public Css_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_selector; }
	 
		public Css_selectorContext() { }
		public void copyFrom(Css_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_ID() { return getTokens(HtmlParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(HtmlParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_DOT() { return getTokens(HtmlParser.CSS_DOT); }
		public TerminalNode CSS_DOT(int i) {
			return getToken(HtmlParser.CSS_DOT, i);
		}
		public QualifiedSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneSimpleSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_DOT() { return getTokens(HtmlParser.CSS_DOT); }
		public TerminalNode CSS_DOT(int i) {
			return getToken(HtmlParser.CSS_DOT, i);
		}
		public List<TerminalNode> CSS_ID() { return getTokens(HtmlParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(HtmlParser.CSS_ID, i);
		}
		public StandaloneSimpleSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAndIdSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_ID() { return getTokens(HtmlParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(HtmlParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_HASH() { return getTokens(HtmlParser.CSS_HASH); }
		public TerminalNode CSS_HASH(int i) {
			return getToken(HtmlParser.CSS_HASH, i);
		}
		public TypeAndIdSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends Css_selectorContext {
		public TerminalNode CSS_ID() { return getToken(HtmlParser.CSS_ID, 0); }
		public TypeSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
	}

	public final Css_selectorContext css_selector() throws RecognitionException {
		Css_selectorContext _localctx = new Css_selectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_css_selector);
		int _la;
		try {
			int _alt;
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new QualifiedSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(CSS_ID);
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
						match(CSS_DOT);
						setState(136);
						match(CSS_ID);
						}
						} 
					}
					setState(141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new StandaloneSimpleSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(142);
						match(CSS_DOT);
						setState(143);
						match(CSS_ID);
						setState(145);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
							{
							setState(144);
							match(CSS_ID);
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(149); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new TypeAndIdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(CSS_ID);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_HASH) {
					{
					{
					setState(152);
					match(CSS_HASH);
					setState(153);
					match(CSS_ID);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new TypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(CSS_ID);
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
	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	 
		public DeclarationListContext() { }
		public void copyFrom(DeclarationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationBlockContext extends DeclarationListContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationBlockContext(DeclarationListContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationList);
		int _la;
		try {
			_localctx = new DeclarationBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID) {
				{
				{
				setState(162);
				declaration();
				}
				}
				setState(167);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends DeclarationContext {
		public TerminalNode CSS_ID() { return getToken(HtmlParser.CSS_ID, 0); }
		public TerminalNode CSS_COLON() { return getToken(HtmlParser.CSS_COLON, 0); }
		public TerminalNode CSS_SEMI() { return getToken(HtmlParser.CSS_SEMI, 0); }
		public List<CsstermContext> cssterm() {
			return getRuleContexts(CsstermContext.class);
		}
		public CsstermContext cssterm(int i) {
			return getRuleContext(CsstermContext.class,i);
		}
		public CssDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		int _la;
		try {
			_localctx = new CssDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(CSS_ID);
			setState(169);
			match(CSS_COLON);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				cssterm();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 115964116992L) != 0) );
			setState(175);
			match(CSS_SEMI);
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
	public static class Css_function_argsContext extends ParserRuleContext {
		public Css_function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_function_args; }
	 
		public Css_function_argsContext() { }
		public void copyFrom(Css_function_argsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgumentsContext extends Css_function_argsContext {
		public List<CsstermContext> cssterm() {
			return getRuleContexts(CsstermContext.class);
		}
		public CsstermContext cssterm(int i) {
			return getRuleContext(CsstermContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(HtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(HtmlParser.CSS_COMMA, i);
		}
		public FunctionArgumentsContext(Css_function_argsContext ctx) { copyFrom(ctx); }
	}

	public final Css_function_argsContext css_function_args() throws RecognitionException {
		Css_function_argsContext _localctx = new Css_function_argsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_css_function_args);
		int _la;
		try {
			_localctx = new FunctionArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				cssterm();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 115964116992L) != 0) );
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(182);
				match(CSS_COMMA);
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183);
					cssterm();
					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 115964116992L) != 0) );
				}
				}
				setState(192);
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
	public static class Css_function_callContext extends ParserRuleContext {
		public Css_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_function_call; }
	 
		public Css_function_callContext() { }
		public void copyFrom(Css_function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionCallContext extends Css_function_callContext {
		public TerminalNode CSS_ID() { return getToken(HtmlParser.CSS_ID, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(HtmlParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(HtmlParser.CSS_RPAREN, 0); }
		public Css_function_argsContext css_function_args() {
			return getRuleContext(Css_function_argsContext.class,0);
		}
		public CssFunctionCallContext(Css_function_callContext ctx) { copyFrom(ctx); }
	}

	public final Css_function_callContext css_function_call() throws RecognitionException {
		Css_function_callContext _localctx = new Css_function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_css_function_call);
		int _la;
		try {
			_localctx = new CssFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(CSS_ID);
			setState(194);
			match(CSS_LPAREN);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 115964116992L) != 0)) {
				{
				setState(195);
				css_function_args();
				}
			}

			setState(198);
			match(CSS_RPAREN);
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
	public static class CsstermContext extends ParserRuleContext {
		public CsstermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssterm; }
	 
		public CsstermContext() { }
		public void copyFrom(CsstermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTermContext extends CsstermContext {
		public Css_function_callContext css_function_call() {
			return getRuleContext(Css_function_callContext.class,0);
		}
		public FunctionTermContext(CsstermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTermContext extends CsstermContext {
		public TerminalNode CSS_STRING() { return getToken(HtmlParser.CSS_STRING, 0); }
		public StringTermContext(CsstermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberTermContext extends CsstermContext {
		public TerminalNode CSS_NUMBER() { return getToken(HtmlParser.CSS_NUMBER, 0); }
		public NumberTermContext(CsstermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitNumberTermContext extends CsstermContext {
		public TerminalNode CSS_NUMBER() { return getToken(HtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(HtmlParser.CSS_UNIT, 0); }
		public UnitNumberTermContext(CsstermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorTermContext extends CsstermContext {
		public TerminalNode CSS_HEX_COLOR() { return getToken(HtmlParser.CSS_HEX_COLOR, 0); }
		public ColorTermContext(CsstermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierTermContext extends CsstermContext {
		public TerminalNode CSS_ID() { return getToken(HtmlParser.CSS_ID, 0); }
		public IdentifierTermContext(CsstermContext ctx) { copyFrom(ctx); }
	}

	public final CsstermContext cssterm() throws RecognitionException {
		CsstermContext _localctx = new CsstermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cssterm);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new FunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				css_function_call();
				}
				break;
			case 2:
				_localctx = new StringTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(CSS_STRING);
				}
				break;
			case 3:
				_localctx = new ColorTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(CSS_HEX_COLOR);
				}
				break;
			case 4:
				_localctx = new UnitNumberTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(CSS_NUMBER);
				setState(204);
				match(CSS_UNIT);
				}
				break;
			case 5:
				_localctx = new NumberTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				match(CSS_NUMBER);
				}
				break;
			case 6:
				_localctx = new IdentifierTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(206);
				match(CSS_ID);
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
	public static class JinjaStatementBlockContext extends ParserRuleContext {
		public JinjaStatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatementBlock; }
	 
		public JinjaStatementBlockContext() { }
		public void copyFrom(JinjaStatementBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStmtBlockContext extends JinjaStatementBlockContext {
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlParser.JINJA_STMT_START, 0); }
		public JStatementContext jStatement() {
			return getRuleContext(JStatementContext.class,0);
		}
		public JinjaStmtBlockContext(JinjaStatementBlockContext ctx) { copyFrom(ctx); }
	}

	public final JinjaStatementBlockContext jinjaStatementBlock() throws RecognitionException {
		JinjaStatementBlockContext _localctx = new JinjaStatementBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jinjaStatementBlock);
		try {
			_localctx = new JinjaStmtBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(JINJA_STMT_START);
			setState(210);
			jStatement();
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
	public static class JinjaExpressionBlockContext extends ParserRuleContext {
		public JinjaExpressionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpressionBlock; }
	 
		public JinjaExpressionBlockContext() { }
		public void copyFrom(JinjaExpressionBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprBlockContext extends JinjaExpressionBlockContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(HtmlParser.JINJA_EXPR_START, 0); }
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(HtmlParser.JINJA_EXPR_END, 0); }
		public JinjaExprBlockContext(JinjaExpressionBlockContext ctx) { copyFrom(ctx); }
	}

	public final JinjaExpressionBlockContext jinjaExpressionBlock() throws RecognitionException {
		JinjaExpressionBlockContext _localctx = new JinjaExpressionBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinjaExpressionBlock);
		try {
			_localctx = new JinjaExprBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(JINJA_EXPR_START);
			setState(213);
			j_expression();
			setState(214);
			match(JINJA_EXPR_END);
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
	public static class JStatementContext extends ParserRuleContext {
		public JStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jStatement; }
	 
		public JStatementContext() { }
		public void copyFrom(JStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForStmtContext extends JStatementContext {
		public J_for_stmtContext j_for_stmt() {
			return getRuleContext(J_for_stmtContext.class,0);
		}
		public JinjaForStmtContext(JStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExtendsStmtContext extends JStatementContext {
		public J_extends_stmtContext j_extends_stmt() {
			return getRuleContext(J_extends_stmtContext.class,0);
		}
		public JinjaExtendsStmtContext(JStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockStmtContext extends JStatementContext {
		public J_block_stmtContext j_block_stmt() {
			return getRuleContext(J_block_stmtContext.class,0);
		}
		public JinjaBlockStmtContext(JStatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfStmtContext extends JStatementContext {
		public J_if_stmtContext j_if_stmt() {
			return getRuleContext(J_if_stmtContext.class,0);
		}
		public JinjaIfStmtContext(JStatementContext ctx) { copyFrom(ctx); }
	}

	public final JStatementContext jStatement() throws RecognitionException {
		JStatementContext _localctx = new JStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jStatement);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_EXTENDS:
				_localctx = new JinjaExtendsStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				j_extends_stmt();
				}
				break;
			case J_BLOCK:
				_localctx = new JinjaBlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				j_block_stmt();
				}
				break;
			case J_FOR:
				_localctx = new JinjaForStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				j_for_stmt();
				}
				break;
			case J_IF:
				_localctx = new JinjaIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				j_if_stmt();
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
	public static class J_extends_stmtContext extends ParserRuleContext {
		public J_extends_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_extends_stmt; }
	 
		public J_extends_stmtContext() { }
		public void copyFrom(J_extends_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExtendsStmtDefContext extends J_extends_stmtContext {
		public TerminalNode J_EXTENDS() { return getToken(HtmlParser.J_EXTENDS, 0); }
		public TerminalNode J_STRING() { return getToken(HtmlParser.J_STRING, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(HtmlParser.JINJA_STMT_END, 0); }
		public JinjaExtendsStmtDefContext(J_extends_stmtContext ctx) { copyFrom(ctx); }
	}

	public final J_extends_stmtContext j_extends_stmt() throws RecognitionException {
		J_extends_stmtContext _localctx = new J_extends_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_j_extends_stmt);
		try {
			_localctx = new JinjaExtendsStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(J_EXTENDS);
			setState(223);
			match(J_STRING);
			setState(224);
			match(JINJA_STMT_END);
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
	public static class J_block_stmtContext extends ParserRuleContext {
		public J_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_block_stmt; }
	 
		public J_block_stmtContext() { }
		public void copyFrom(J_block_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockStmtDefContext extends J_block_stmtContext {
		public TerminalNode J_BLOCK() { return getToken(HtmlParser.J_BLOCK, 0); }
		public List<TerminalNode> J_NAME() { return getTokens(HtmlParser.J_NAME); }
		public TerminalNode J_NAME(int i) {
			return getToken(HtmlParser.J_NAME, i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlParser.JINJA_STMT_END, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode J_ENDBLOCK() { return getToken(HtmlParser.J_ENDBLOCK, 0); }
		public JinjaBlockStmtDefContext(J_block_stmtContext ctx) { copyFrom(ctx); }
	}

	public final J_block_stmtContext j_block_stmt() throws RecognitionException {
		J_block_stmtContext _localctx = new J_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_j_block_stmt);
		int _la;
		try {
			_localctx = new JinjaBlockStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(J_BLOCK);
			setState(227);
			match(J_NAME);
			setState(228);
			match(JINJA_STMT_END);
			setState(229);
			html_content();
			setState(230);
			match(JINJA_STMT_START);
			setState(231);
			match(J_ENDBLOCK);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_NAME) {
				{
				setState(232);
				match(J_NAME);
				}
			}

			setState(235);
			match(JINJA_STMT_END);
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
	public static class J_for_stmtContext extends ParserRuleContext {
		public J_for_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_for_stmt; }
	 
		public J_for_stmtContext() { }
		public void copyFrom(J_for_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForStmtDefContext extends J_for_stmtContext {
		public TerminalNode J_FOR() { return getToken(HtmlParser.J_FOR, 0); }
		public TerminalNode J_NAME() { return getToken(HtmlParser.J_NAME, 0); }
		public TerminalNode J_IN() { return getToken(HtmlParser.J_IN, 0); }
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlParser.JINJA_STMT_END, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode J_ENDFOR() { return getToken(HtmlParser.J_ENDFOR, 0); }
		public JinjaForStmtDefContext(J_for_stmtContext ctx) { copyFrom(ctx); }
	}

	public final J_for_stmtContext j_for_stmt() throws RecognitionException {
		J_for_stmtContext _localctx = new J_for_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_j_for_stmt);
		try {
			_localctx = new JinjaForStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(J_FOR);
			setState(238);
			match(J_NAME);
			setState(239);
			match(J_IN);
			setState(240);
			j_expression();
			setState(241);
			match(JINJA_STMT_END);
			setState(242);
			html_content();
			setState(243);
			match(JINJA_STMT_START);
			setState(244);
			match(J_ENDFOR);
			setState(245);
			match(JINJA_STMT_END);
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
	public static class J_if_stmtContext extends ParserRuleContext {
		public J_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_if_stmt; }
	 
		public J_if_stmtContext() { }
		public void copyFrom(J_if_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfStmtDefContext extends J_if_stmtContext {
		public TerminalNode J_IF() { return getToken(HtmlParser.J_IF, 0); }
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlParser.JINJA_STMT_END, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode J_ENDIF() { return getToken(HtmlParser.J_ENDIF, 0); }
		public JinjaIfStmtDefContext(J_if_stmtContext ctx) { copyFrom(ctx); }
	}

	public final J_if_stmtContext j_if_stmt() throws RecognitionException {
		J_if_stmtContext _localctx = new J_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_j_if_stmt);
		try {
			_localctx = new JinjaIfStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(J_IF);
			setState(248);
			j_expression();
			setState(249);
			match(JINJA_STMT_END);
			setState(250);
			html_content();
			setState(251);
			match(JINJA_STMT_START);
			setState(252);
			match(J_ENDIF);
			setState(253);
			match(JINJA_STMT_END);
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
	public static class J_expressionContext extends ParserRuleContext {
		public J_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_expression; }
	 
		public J_expressionContext() { }
		public void copyFrom(J_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSimpleExprContext extends J_expressionContext {
		public J_call_exprContext j_call_expr() {
			return getRuleContext(J_call_exprContext.class,0);
		}
		public JinjaSimpleExprContext(J_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBinaryExprContext extends J_expressionContext {
		public List<J_call_exprContext> j_call_expr() {
			return getRuleContexts(J_call_exprContext.class);
		}
		public J_call_exprContext j_call_expr(int i) {
			return getRuleContext(J_call_exprContext.class,i);
		}
		public TerminalNode J_EQ() { return getToken(HtmlParser.J_EQ, 0); }
		public TerminalNode J_NEQ() { return getToken(HtmlParser.J_NEQ, 0); }
		public TerminalNode J_GT() { return getToken(HtmlParser.J_GT, 0); }
		public TerminalNode J_LT() { return getToken(HtmlParser.J_LT, 0); }
		public JinjaBinaryExprContext(J_expressionContext ctx) { copyFrom(ctx); }
	}

	public final J_expressionContext j_expression() throws RecognitionException {
		J_expressionContext _localctx = new J_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_j_expression);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new JinjaBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				j_call_expr();
				setState(256);
				_la = _input.LA(1);
				if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				j_call_expr();
				}
				break;
			case 2:
				_localctx = new JinjaSimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				j_call_expr();
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
	public static class J_call_exprContext extends ParserRuleContext {
		public J_call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_call_expr; }
	 
		public J_call_exprContext() { }
		public void copyFrom(J_call_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarAccessOnlyContext extends J_call_exprContext {
		public J_var_accessContext j_var_access() {
			return getRuleContext(J_var_accessContext.class,0);
		}
		public JinjaVarAccessOnlyContext(J_call_exprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFunctionCallContext extends J_call_exprContext {
		public TerminalNode J_NAME() { return getToken(HtmlParser.J_NAME, 0); }
		public TerminalNode J_LPAREN() { return getToken(HtmlParser.J_LPAREN, 0); }
		public TerminalNode J_RPAREN() { return getToken(HtmlParser.J_RPAREN, 0); }
		public J_argument_listContext j_argument_list() {
			return getRuleContext(J_argument_listContext.class,0);
		}
		public JinjaFunctionCallContext(J_call_exprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaAtomOnlyContext extends J_call_exprContext {
		public J_atomContext j_atom() {
			return getRuleContext(J_atomContext.class,0);
		}
		public JinjaAtomOnlyContext(J_call_exprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFilteredExprContext extends J_call_exprContext {
		public J_var_accessContext j_var_access() {
			return getRuleContext(J_var_accessContext.class,0);
		}
		public TerminalNode J_PIPE() { return getToken(HtmlParser.J_PIPE, 0); }
		public TerminalNode J_NAME() { return getToken(HtmlParser.J_NAME, 0); }
		public TerminalNode J_LENGTH() { return getToken(HtmlParser.J_LENGTH, 0); }
		public JinjaFilteredExprContext(J_call_exprContext ctx) { copyFrom(ctx); }
	}

	public final J_call_exprContext j_call_expr() throws RecognitionException {
		J_call_exprContext _localctx = new J_call_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_j_call_expr);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new JinjaFilteredExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				j_var_access();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==J_PIPE) {
					{
					setState(263);
					match(J_PIPE);
					setState(264);
					_la = _input.LA(1);
					if ( !(_la==J_LENGTH || _la==J_NAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				_localctx = new JinjaFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(J_NAME);
				setState(268);
				match(J_LPAREN);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 57351L) != 0)) {
					{
					setState(269);
					j_argument_list();
					}
				}

				setState(272);
				match(J_RPAREN);
				}
				break;
			case 3:
				_localctx = new JinjaVarAccessOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				j_var_access();
				}
				break;
			case 4:
				_localctx = new JinjaAtomOnlyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				j_atom();
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
	public static class J_var_accessContext extends ParserRuleContext {
		public J_var_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_var_access; }
	 
		public J_var_accessContext() { }
		public void copyFrom(J_var_accessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarAccessOnlyDefContext extends J_var_accessContext {
		public List<TerminalNode> J_NAME() { return getTokens(HtmlParser.J_NAME); }
		public TerminalNode J_NAME(int i) {
			return getToken(HtmlParser.J_NAME, i);
		}
		public List<TerminalNode> J_DOT() { return getTokens(HtmlParser.J_DOT); }
		public TerminalNode J_DOT(int i) {
			return getToken(HtmlParser.J_DOT, i);
		}
		public JinjaVarAccessOnlyDefContext(J_var_accessContext ctx) { copyFrom(ctx); }
	}

	public final J_var_accessContext j_var_access() throws RecognitionException {
		J_var_accessContext _localctx = new J_var_accessContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_j_var_access);
		int _la;
		try {
			_localctx = new JinjaVarAccessOnlyDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(J_NAME);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_DOT) {
				{
				{
				setState(278);
				match(J_DOT);
				setState(279);
				match(J_NAME);
				}
				}
				setState(284);
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
	public static class J_argument_listContext extends ParserRuleContext {
		public J_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_argument_list; }
	 
		public J_argument_listContext() { }
		public void copyFrom(J_argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaArgListDefContext extends J_argument_listContext {
		public List<J_argumentContext> j_argument() {
			return getRuleContexts(J_argumentContext.class);
		}
		public J_argumentContext j_argument(int i) {
			return getRuleContext(J_argumentContext.class,i);
		}
		public List<TerminalNode> J_COMMA() { return getTokens(HtmlParser.J_COMMA); }
		public TerminalNode J_COMMA(int i) {
			return getToken(HtmlParser.J_COMMA, i);
		}
		public JinjaArgListDefContext(J_argument_listContext ctx) { copyFrom(ctx); }
	}

	public final J_argument_listContext j_argument_list() throws RecognitionException {
		J_argument_listContext _localctx = new J_argument_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_j_argument_list);
		int _la;
		try {
			_localctx = new JinjaArgListDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			j_argument();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(286);
				match(J_COMMA);
				setState(287);
				j_argument();
				}
				}
				setState(292);
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
	public static class J_argumentContext extends ParserRuleContext {
		public J_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_argument; }
	 
		public J_argumentContext() { }
		public void copyFrom(J_argumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaKwArgContext extends J_argumentContext {
		public TerminalNode J_NAME() { return getToken(HtmlParser.J_NAME, 0); }
		public TerminalNode J_ASSIGN() { return getToken(HtmlParser.J_ASSIGN, 0); }
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public JinjaKwArgContext(J_argumentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaPosArgContext extends J_argumentContext {
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public JinjaPosArgContext(J_argumentContext ctx) { copyFrom(ctx); }
	}

	public final J_argumentContext j_argument() throws RecognitionException {
		J_argumentContext _localctx = new J_argumentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_j_argument);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new JinjaPosArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				j_expression();
				}
				break;
			case 2:
				_localctx = new JinjaKwArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(J_NAME);
				setState(295);
				match(J_ASSIGN);
				setState(296);
				j_expression();
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
	public static class J_atomContext extends ParserRuleContext {
		public J_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_atom; }
	 
		public J_atomContext() { }
		public void copyFrom(J_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNumberAtomContext extends J_atomContext {
		public TerminalNode J_NUMBER() { return getToken(HtmlParser.J_NUMBER, 0); }
		public JinjaNumberAtomContext(J_atomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaTrueAtomContext extends J_atomContext {
		public TerminalNode J_TRUE() { return getToken(HtmlParser.J_TRUE, 0); }
		public JinjaTrueAtomContext(J_atomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFalseAtomContext extends J_atomContext {
		public TerminalNode J_FALSE() { return getToken(HtmlParser.J_FALSE, 0); }
		public JinjaFalseAtomContext(J_atomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNoneAtomContext extends J_atomContext {
		public TerminalNode J_NONE() { return getToken(HtmlParser.J_NONE, 0); }
		public JinjaNoneAtomContext(J_atomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStringAtomContext extends J_atomContext {
		public TerminalNode J_STRING() { return getToken(HtmlParser.J_STRING, 0); }
		public JinjaStringAtomContext(J_atomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNameAtomContext extends J_atomContext {
		public TerminalNode J_NAME() { return getToken(HtmlParser.J_NAME, 0); }
		public JinjaNameAtomContext(J_atomContext ctx) { copyFrom(ctx); }
	}

	public final J_atomContext j_atom() throws RecognitionException {
		J_atomContext _localctx = new J_atomContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_j_atom);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NUMBER:
				_localctx = new JinjaNumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(J_NUMBER);
				}
				break;
			case J_STRING:
				_localctx = new JinjaStringAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(J_STRING);
				}
				break;
			case J_TRUE:
				_localctx = new JinjaTrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(J_TRUE);
				}
				break;
			case J_FALSE:
				_localctx = new JinjaFalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(J_FALSE);
				}
				break;
			case J_NONE:
				_localctx = new JinjaNoneAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(J_NONE);
				}
				break;
			case J_NAME:
				_localctx = new JinjaNameAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(304);
				match(J_NAME);
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

	public static final String _serializedATN =
		"\u0004\u0001H\u0134\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004e\b\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0005\u0005"+
		"\u0005k\b\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007x\b\u0007\n\u0007\f\u0007{\t\u0007\u0001\b\u0001\b\u0003\b\u007f"+
		"\b\b\u0001\b\u0005\b\u0082\b\b\n\b\f\b\u0085\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u008a\b\t\n\t\f\t\u008d\t\t\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u0092\b\t\u0004\t\u0094\b\t\u000b\t\f\t\u0095\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u009b\b\t\n\t\f\t\u009e\t\t\u0001\t\u0003\t\u00a1\b\t\u0001\n"+
		"\u0005\n\u00a4\b\n\n\n\f\n\u00a7\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u00ac\b\u000b\u000b\u000b\f\u000b\u00ad\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0004\f\u00b3\b\f\u000b\f\f\f\u00b4\u0001\f\u0001\f\u0004"+
		"\f\u00b9\b\f\u000b\f\f\f\u00ba\u0005\f\u00bd\b\f\n\f\f\f\u00c0\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00c5\b\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00d0\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00dd\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00ea\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0105"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010a\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u010f\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u0114\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0119\b\u0018\n\u0018\f\u0018\u011c\t\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0121\b\u0019\n\u0019\f\u0019"+
		"\u0124\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u012a\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0132\b\u001b\u0001\u001b\u0000\u0000\u001c\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.0246\u0000\u0002\u0001\u0000@C\u0002\u000022GG\u0149\u0000"+
		";\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004Z\u0001"+
		"\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000"+
		"\u0000\nl\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000et\u0001"+
		"\u0000\u0000\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u00a0\u0001\u0000"+
		"\u0000\u0000\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000"+
		"\u0000\u0000\u0018\u00b2\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000"+
		"\u0000\u0000\u001c\u00cf\u0001\u0000\u0000\u0000\u001e\u00d1\u0001\u0000"+
		"\u0000\u0000 \u00d4\u0001\u0000\u0000\u0000\"\u00dc\u0001\u0000\u0000"+
		"\u0000$\u00de\u0001\u0000\u0000\u0000&\u00e2\u0001\u0000\u0000\u0000("+
		"\u00ed\u0001\u0000\u0000\u0000*\u00f7\u0001\u0000\u0000\u0000,\u0104\u0001"+
		"\u0000\u0000\u0000.\u0113\u0001\u0000\u0000\u00000\u0115\u0001\u0000\u0000"+
		"\u00002\u011d\u0001\u0000\u0000\u00004\u0129\u0001\u0000\u0000\u00006"+
		"\u0131\u0001\u0000\u0000\u00008:\u0003\u0002\u0001\u000098\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<\u0001\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>C\u0003\u0004\u0002\u0000?C\u0005\r\u0000\u0000@C\u0003\u001e\u000f"+
		"\u0000AC\u0003 \u0010\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003\u0001"+
		"\u0000\u0000\u0000DE\u0005\f\u0000\u0000EI\u0005\u0012\u0000\u0000FH\u0003"+
		"\u0006\u0003\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JT\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LU\u0005\u000f\u0000\u0000MN\u0005\u000e"+
		"\u0000\u0000NO\u0003\u0000\u0000\u0000OP\u0005\f\u0000\u0000PQ\u0005\u0010"+
		"\u0000\u0000QR\u0005\u0012\u0000\u0000RS\u0005\u000e\u0000\u0000SU\u0001"+
		"\u0000\u0000\u0000TL\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000"+
		"U[\u0001\u0000\u0000\u0000VW\u0005\u000b\u0000\u0000WX\u0003\n\u0005\u0000"+
		"XY\u0005\u0015\u0000\u0000Y[\u0001\u0000\u0000\u0000ZD\u0001\u0000\u0000"+
		"\u0000ZV\u0001\u0000\u0000\u0000[\u0005\u0001\u0000\u0000\u0000\\_\u0005"+
		"\u0012\u0000\u0000]^\u0005\u0011\u0000\u0000^`\u0005\u0014\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0007\u0001\u0000"+
		"\u0000\u0000ad\u0005\u0012\u0000\u0000bc\u0005\u0011\u0000\u0000ce\u0005"+
		"\u0014\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fh\u0005\u0010\u0000\u0000ga\u0001\u0000\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000h\t\u0001\u0000\u0000\u0000ik\u0003\f"+
		"\u0006\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u000b\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000op\u0003\u000e\u0007\u0000pq\u0005\u0016"+
		"\u0000\u0000qr\u0003\u0014\n\u0000rs\u0005\u0017\u0000\u0000s\r\u0001"+
		"\u0000\u0000\u0000ty\u0003\u0010\b\u0000uv\u0005\u001c\u0000\u0000vx\u0003"+
		"\u0010\b\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u000f\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|\u0083\u0003\u0012\t\u0000}\u007f\u0005"+
		"\u001e\u0000\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0012\t\u0000"+
		"\u0081~\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0011\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u008b\u0005$\u0000\u0000\u0087\u0088\u0005\u001d\u0000\u0000\u0088\u008a"+
		"\u0005$\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u00a1\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u001d\u0000\u0000\u008f\u0091\u0005"+
		"$\u0000\u0000\u0090\u0092\u0005$\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000"+
		"\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u00a1\u0001\u0000\u0000\u0000\u0097\u009c\u0005$\u0000\u0000"+
		"\u0098\u0099\u0005\u001f\u0000\u0000\u0099\u009b\u0005$\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u00a1\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u00a1\u0005$\u0000\u0000\u00a0\u0086\u0001\u0000\u0000\u0000\u00a0\u0093"+
		"\u0001\u0000\u0000\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0003\u0016\u000b\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u0015\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005$\u0000\u0000\u00a9\u00ab\u0005"+
		"\u001a\u0000\u0000\u00aa\u00ac\u0003\u001c\u000e\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0005\u001b\u0000\u0000\u00b0\u0017\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0003\u001c\u000e\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00be\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b8\u0005\u001c\u0000\u0000\u00b7\u00b9\u0003"+
		"\u001c\u000e\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u0019\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		"$\u0000\u0000\u00c2\u00c4\u0005\u0018\u0000\u0000\u00c3\u00c5\u0003\u0018"+
		"\f\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0019\u0000"+
		"\u0000\u00c7\u001b\u0001\u0000\u0000\u0000\u00c8\u00d0\u0003\u001a\r\u0000"+
		"\u00c9\u00d0\u0005#\u0000\u0000\u00ca\u00d0\u0005 \u0000\u0000\u00cb\u00cc"+
		"\u0005!\u0000\u0000\u00cc\u00d0\u0005\"\u0000\u0000\u00cd\u00d0\u0005"+
		"!\u0000\u0000\u00ce\u00d0\u0005$\u0000\u0000\u00cf\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000\u00cf\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u001d\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0002\u0000\u0000\u00d2\u00d3\u0003\"\u0011\u0000"+
		"\u00d3\u001f\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000"+
		"\u00d5\u00d6\u0003,\u0016\u0000\u00d6\u00d7\u0005(\u0000\u0000\u00d7!"+
		"\u0001\u0000\u0000\u0000\u00d8\u00dd\u0003$\u0012\u0000\u00d9\u00dd\u0003"+
		"&\u0013\u0000\u00da\u00dd\u0003(\u0014\u0000\u00db\u00dd\u0003*\u0015"+
		"\u0000\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd#\u0001\u0000\u0000\u0000\u00de\u00df\u0005*\u0000\u0000\u00df"+
		"\u00e0\u0005F\u0000\u0000\u00e0\u00e1\u0005)\u0000\u0000\u00e1%\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005+\u0000\u0000\u00e3\u00e4\u0005G\u0000"+
		"\u0000\u00e4\u00e5\u0005)\u0000\u0000\u00e5\u00e6\u0003\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0002\u0000\u0000\u00e7\u00e9\u0005,\u0000\u0000\u00e8"+
		"\u00ea\u0005G\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005)\u0000\u0000\u00ec\'\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		"-\u0000\u0000\u00ee\u00ef\u0005G\u0000\u0000\u00ef\u00f0\u00051\u0000"+
		"\u0000\u00f0\u00f1\u0003,\u0016\u0000\u00f1\u00f2\u0005)\u0000\u0000\u00f2"+
		"\u00f3\u0003\u0000\u0000\u0000\u00f3\u00f4\u0005\u0002\u0000\u0000\u00f4"+
		"\u00f5\u0005.\u0000\u0000\u00f5\u00f6\u0005)\u0000\u0000\u00f6)\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0005/\u0000\u0000\u00f8\u00f9\u0003,\u0016"+
		"\u0000\u00f9\u00fa\u0005)\u0000\u0000\u00fa\u00fb\u0003\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005\u0002\u0000\u0000\u00fc\u00fd\u00050\u0000\u0000\u00fd"+
		"\u00fe\u0005)\u0000\u0000\u00fe+\u0001\u0000\u0000\u0000\u00ff\u0100\u0003"+
		".\u0017\u0000\u0100\u0101\u0007\u0000\u0000\u0000\u0101\u0102\u0003.\u0017"+
		"\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0105\u0003.\u0017\u0000"+
		"\u0104\u00ff\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000"+
		"\u0105-\u0001\u0000\u0000\u0000\u0106\u0109\u00030\u0018\u0000\u0107\u0108"+
		"\u0005?\u0000\u0000\u0108\u010a\u0007\u0001\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0114\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005G\u0000\u0000\u010c\u010e\u0005;\u0000"+
		"\u0000\u010d\u010f\u00032\u0019\u0000\u010e\u010d\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110\u0114\u0005<\u0000\u0000\u0111\u0114\u00030\u0018\u0000\u0112\u0114"+
		"\u00036\u001b\u0000\u0113\u0106\u0001\u0000\u0000\u0000\u0113\u010b\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0114/\u0001\u0000\u0000\u0000\u0115\u011a\u0005G\u0000"+
		"\u0000\u0116\u0117\u0005>\u0000\u0000\u0117\u0119\u0005G\u0000\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"1\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u0122"+
		"\u00034\u001a\u0000\u011e\u011f\u0005=\u0000\u0000\u011f\u0121\u00034"+
		"\u001a\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u01233\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u012a\u0003,\u0016\u0000\u0126\u0127\u0005G\u0000\u0000\u0127"+
		"\u0128\u0005D\u0000\u0000\u0128\u012a\u0003,\u0016\u0000\u0129\u0125\u0001"+
		"\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000\u012a5\u0001\u0000"+
		"\u0000\u0000\u012b\u0132\u0005E\u0000\u0000\u012c\u0132\u0005F\u0000\u0000"+
		"\u012d\u0132\u00058\u0000\u0000\u012e\u0132\u00059\u0000\u0000\u012f\u0132"+
		"\u0005:\u0000\u0000\u0130\u0132\u0005G\u0000\u0000\u0131\u012b\u0001\u0000"+
		"\u0000\u0000\u0131\u012c\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000"+
		"\u0000\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000"+
		"\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u01327\u0001\u0000\u0000"+
		"\u0000\";BITZ_dgly~\u0083\u008b\u0091\u0095\u009c\u00a0\u00a5\u00ad\u00b4"+
		"\u00ba\u00be\u00c4\u00cf\u00dc\u00e9\u0104\u0109\u010e\u0113\u011a\u0122"+
		"\u0129\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}