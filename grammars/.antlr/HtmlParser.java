// Generated from d:/RAMA/MyProject/ComplierProject-1/grammars/HtmlParser.g4 by ANTLR 4.13.1
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
		HTML_TEXT=1, TAG_OPEN=2, TAG_SLASH_CLOSE=3, TAG_CLOSE=4, STYLE_OPEN=5, 
		STYLE_CLOSE=6, TAG_NAME=7, TAG_EQUALS=8, ATTVALUE_VALUE=9, TAG_SLASH=10, 
		CSS_LBRACE=11, CSS_RBRACE=12, CSS_COMMA=13, CSS_GT=14, CSS_ID=15, CSS_DOT=16, 
		CSS_HASH=17, CSS_COLON=18, CSS_SEMI=19, CSS_LPAREN=20, CSS_RPAREN=21, 
		CSS_STRING=22, CSS_HEX_COLOR=23, CSS_NUMBER=24, CSS_UNIT=25, JINJA_STMT_START=26, 
		JINJA_EXPR_START=27, JINJA_EXPR_END=28, J_EXTENDS=29, J_STRING=30, JINJA_STMT_END=31, 
		J_BLOCK=32, J_NAME=33, J_ENDBLOCK=34, J_FOR=35, J_IN=36, J_ENDFOR=37, 
		J_IF=38, J_ENDIF=39, J_EQ=40, J_NEQ=41, J_GT=42, J_LT=43, J_PIPE=44, J_LENGTH=45, 
		J_LPAREN=46, J_RPAREN=47, J_DOT=48, J_COMMA=49, J_ASSIGN=50, J_NUMBER=51, 
		J_TRUE=52, J_FALSE=53, J_NONE=54;
	public static final int
		RULE_html_content = 0, RULE_html_content_item = 1, RULE_htmlElement = 2, 
		RULE_tag_content = 3, RULE_style_sheet = 4, RULE_ruleSet = 5, RULE_selector_decl = 6, 
		RULE_css_selector_list = 7, RULE_css_selector = 8, RULE_declarationList = 9, 
		RULE_declaration = 10, RULE_css_function_args = 11, RULE_css_function_call = 12, 
		RULE_cssterm = 13, RULE_jinjaStatementBlock = 14, RULE_jinjaExpressionBlock = 15, 
		RULE_jStatement = 16, RULE_j_extends_stmt = 17, RULE_j_block_stmt = 18, 
		RULE_j_for_stmt = 19, RULE_j_if_stmt = 20, RULE_j_expression = 21, RULE_j_call_expr = 22, 
		RULE_j_var_access = 23, RULE_j_argument_list = 24, RULE_j_argument = 25, 
		RULE_j_atom = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"html_content", "html_content_item", "htmlElement", "tag_content", "style_sheet", 
			"ruleSet", "selector_decl", "css_selector_list", "css_selector", "declarationList", 
			"declaration", "css_function_args", "css_function_call", "cssterm", "jinjaStatementBlock", 
			"jinjaExpressionBlock", "jStatement", "j_extends_stmt", "j_block_stmt", 
			"j_for_stmt", "j_if_stmt", "j_expression", "j_call_expr", "j_var_access", 
			"j_argument_list", "j_argument", "j_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_TEXT", "TAG_OPEN", "TAG_SLASH_CLOSE", "TAG_CLOSE", "STYLE_OPEN", 
			"STYLE_CLOSE", "TAG_NAME", "TAG_EQUALS", "ATTVALUE_VALUE", "TAG_SLASH", 
			"CSS_LBRACE", "CSS_RBRACE", "CSS_COMMA", "CSS_GT", "CSS_ID", "CSS_DOT", 
			"CSS_HASH", "CSS_COLON", "CSS_SEMI", "CSS_LPAREN", "CSS_RPAREN", "CSS_STRING", 
			"CSS_HEX_COLOR", "CSS_NUMBER", "CSS_UNIT", "JINJA_STMT_START", "JINJA_EXPR_START", 
			"JINJA_EXPR_END", "J_EXTENDS", "J_STRING", "JINJA_STMT_END", "J_BLOCK", 
			"J_NAME", "J_ENDBLOCK", "J_FOR", "J_IN", "J_ENDFOR", "J_IF", "J_ENDIF", 
			"J_EQ", "J_NEQ", "J_GT", "J_LT", "J_PIPE", "J_LENGTH", "J_LPAREN", "J_RPAREN", 
			"J_DOT", "J_COMMA", "J_ASSIGN", "J_NUMBER", "J_TRUE", "J_FALSE", "J_NONE"
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
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					html_content_item();
					}
					} 
				}
				setState(59);
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
			case STYLE_OPEN:
				_localctx = new HtmlElementItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				htmlElement();
				}
				break;
			case HTML_TEXT:
				_localctx = new HtmlTextItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(HTML_TEXT);
				}
				break;
			case JINJA_STMT_START:
				_localctx = new JinjaStmtItemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				jinjaStatementBlock();
				}
				break;
			case JINJA_EXPR_START:
				_localctx = new JinjaExprItemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
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
		public TerminalNode TAG_OPEN() { return getToken(HtmlParser.TAG_OPEN, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HtmlParser.TAG_SLASH_CLOSE, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HtmlParser.TAG_CLOSE, 0); }
		public List<Tag_contentContext> tag_content() {
			return getRuleContexts(Tag_contentContext.class);
		}
		public Tag_contentContext tag_content(int i) {
			return getRuleContext(Tag_contentContext.class,i);
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
			int _alt;
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new TagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(TAG_OPEN);
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(67);
						tag_content();
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(73);
				_la = _input.LA(1);
				if ( !(_la==TAG_SLASH_CLOSE || _la==TAG_CLOSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STYLE_OPEN:
				_localctx = new StyleElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(STYLE_OPEN);
				setState(75);
				style_sheet();
				setState(76);
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
		enterRule(_localctx, 6, RULE_tag_content);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				_localctx = new HtmlAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(TAG_NAME);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(81);
					match(TAG_EQUALS);
					setState(82);
					match(ATTVALUE_VALUE);
					}
				}

				}
				break;
			case TAG_SLASH:
				_localctx = new ClosingMarkerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
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
		enterRule(_localctx, 8, RULE_style_sheet);
		int _la;
		try {
			_localctx = new StyleSheetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID || _la==CSS_DOT) {
				{
				{
				setState(88);
				ruleSet();
				}
				}
				setState(93);
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
		enterRule(_localctx, 10, RULE_ruleSet);
		try {
			_localctx = new CssRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			selector_decl();
			setState(95);
			match(CSS_LBRACE);
			setState(96);
			declarationList();
			setState(97);
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
		enterRule(_localctx, 12, RULE_selector_decl);
		int _la;
		try {
			_localctx = new CssSelectorDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			css_selector_list();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(100);
				match(CSS_COMMA);
				setState(101);
				css_selector_list();
				}
				}
				setState(106);
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
		enterRule(_localctx, 14, RULE_css_selector_list);
		int _la;
		try {
			_localctx = new CssSelectorListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			css_selector();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) {
				{
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_GT) {
					{
					setState(108);
					match(CSS_GT);
					}
				}

				setState(111);
				css_selector();
				}
				}
				setState(116);
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
		enterRule(_localctx, 16, RULE_css_selector);
		int _la;
		try {
			int _alt;
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new QualifiedSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(CSS_ID);
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(118);
						match(CSS_DOT);
						setState(119);
						match(CSS_ID);
						}
						} 
					}
					setState(124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new StandaloneSimpleSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(125);
						match(CSS_DOT);
						setState(126);
						match(CSS_ID);
						setState(128);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(127);
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
					setState(132); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new TypeAndIdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(CSS_ID);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_HASH) {
					{
					{
					setState(135);
					match(CSS_HASH);
					setState(136);
					match(CSS_ID);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new TypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
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
		enterRule(_localctx, 18, RULE_declarationList);
		int _la;
		try {
			_localctx = new DeclarationBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID) {
				{
				{
				setState(145);
				declaration();
				}
				}
				setState(150);
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
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			_localctx = new CssDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(CSS_ID);
			setState(152);
			match(CSS_COLON);
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				cssterm();
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 29392896L) != 0) );
			setState(158);
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
		enterRule(_localctx, 22, RULE_css_function_args);
		int _la;
		try {
			_localctx = new FunctionArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				cssterm();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 29392896L) != 0) );
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(165);
				match(CSS_COMMA);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					cssterm();
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 29392896L) != 0) );
				}
				}
				setState(175);
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
		enterRule(_localctx, 24, RULE_css_function_call);
		int _la;
		try {
			_localctx = new CssFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(CSS_ID);
			setState(177);
			match(CSS_LPAREN);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29392896L) != 0)) {
				{
				setState(178);
				css_function_args();
				}
			}

			setState(181);
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
		enterRule(_localctx, 26, RULE_cssterm);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new FunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				css_function_call();
				}
				break;
			case 2:
				_localctx = new StringTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(CSS_STRING);
				}
				break;
			case 3:
				_localctx = new ColorTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(CSS_HEX_COLOR);
				}
				break;
			case 4:
				_localctx = new UnitNumberTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(CSS_NUMBER);
				setState(187);
				match(CSS_UNIT);
				}
				break;
			case 5:
				_localctx = new NumberTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
				match(CSS_NUMBER);
				}
				break;
			case 6:
				_localctx = new IdentifierTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
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
		enterRule(_localctx, 28, RULE_jinjaStatementBlock);
		try {
			_localctx = new JinjaStmtBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(JINJA_STMT_START);
			setState(193);
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
		enterRule(_localctx, 30, RULE_jinjaExpressionBlock);
		try {
			_localctx = new JinjaExprBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(JINJA_EXPR_START);
			setState(196);
			j_expression();
			setState(197);
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
		enterRule(_localctx, 32, RULE_jStatement);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_EXTENDS:
				_localctx = new JinjaExtendsStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				j_extends_stmt();
				}
				break;
			case J_BLOCK:
				_localctx = new JinjaBlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				j_block_stmt();
				}
				break;
			case J_FOR:
				_localctx = new JinjaForStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				j_for_stmt();
				}
				break;
			case J_IF:
				_localctx = new JinjaIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
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
		enterRule(_localctx, 34, RULE_j_extends_stmt);
		try {
			_localctx = new JinjaExtendsStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(J_EXTENDS);
			setState(206);
			match(J_STRING);
			setState(207);
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
		enterRule(_localctx, 36, RULE_j_block_stmt);
		int _la;
		try {
			_localctx = new JinjaBlockStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(J_BLOCK);
			setState(210);
			match(J_NAME);
			setState(211);
			match(JINJA_STMT_END);
			setState(212);
			html_content();
			setState(213);
			match(JINJA_STMT_START);
			setState(214);
			match(J_ENDBLOCK);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_NAME) {
				{
				setState(215);
				match(J_NAME);
				}
			}

			setState(218);
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
		enterRule(_localctx, 38, RULE_j_for_stmt);
		try {
			_localctx = new JinjaForStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(J_FOR);
			setState(221);
			match(J_NAME);
			setState(222);
			match(J_IN);
			setState(223);
			j_expression();
			setState(224);
			match(JINJA_STMT_END);
			setState(225);
			html_content();
			setState(226);
			match(JINJA_STMT_START);
			setState(227);
			match(J_ENDFOR);
			setState(228);
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
		enterRule(_localctx, 40, RULE_j_if_stmt);
		try {
			_localctx = new JinjaIfStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(J_IF);
			setState(231);
			j_expression();
			setState(232);
			match(JINJA_STMT_END);
			setState(233);
			html_content();
			setState(234);
			match(JINJA_STMT_START);
			setState(235);
			match(J_ENDIF);
			setState(236);
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
		enterRule(_localctx, 42, RULE_j_expression);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new JinjaBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				j_call_expr();
				setState(239);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674416640L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				j_call_expr();
				}
				break;
			case 2:
				_localctx = new JinjaSimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
		enterRule(_localctx, 44, RULE_j_call_expr);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new JinjaFilteredExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				j_var_access();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==J_PIPE) {
					{
					setState(246);
					match(J_PIPE);
					setState(247);
					_la = _input.LA(1);
					if ( !(_la==J_NAME || _la==J_LENGTH) ) {
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
				setState(250);
				match(J_NAME);
				setState(251);
				match(J_LPAREN);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33777006868955136L) != 0)) {
					{
					setState(252);
					j_argument_list();
					}
				}

				setState(255);
				match(J_RPAREN);
				}
				break;
			case 3:
				_localctx = new JinjaVarAccessOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				j_var_access();
				}
				break;
			case 4:
				_localctx = new JinjaAtomOnlyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
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
		enterRule(_localctx, 46, RULE_j_var_access);
		int _la;
		try {
			_localctx = new JinjaVarAccessOnlyDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(J_NAME);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_DOT) {
				{
				{
				setState(261);
				match(J_DOT);
				setState(262);
				match(J_NAME);
				}
				}
				setState(267);
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
		enterRule(_localctx, 48, RULE_j_argument_list);
		int _la;
		try {
			_localctx = new JinjaArgListDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			j_argument();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(269);
				match(J_COMMA);
				setState(270);
				j_argument();
				}
				}
				setState(275);
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
		enterRule(_localctx, 50, RULE_j_argument);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new JinjaPosArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				j_expression();
				}
				break;
			case 2:
				_localctx = new JinjaKwArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(J_NAME);
				setState(278);
				match(J_ASSIGN);
				setState(279);
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
		enterRule(_localctx, 52, RULE_j_atom);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NUMBER:
				_localctx = new JinjaNumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(J_NUMBER);
				}
				break;
			case J_STRING:
				_localctx = new JinjaStringAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(J_STRING);
				}
				break;
			case J_TRUE:
				_localctx = new JinjaTrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(J_TRUE);
				}
				break;
			case J_FALSE:
				_localctx = new JinjaFalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				match(J_FALSE);
				}
				break;
			case J_NONE:
				_localctx = new JinjaNoneAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(J_NONE);
				}
				break;
			case J_NAME:
				_localctx = new JinjaNameAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
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
		"\u0004\u00016\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0003\u0003\u0003W\b\u0003\u0001"+
		"\u0004\u0005\u0004Z\b\u0004\n\u0004\f\u0004]\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006g\b\u0006\n\u0006\f\u0006j\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0003\u0007n\b\u0007\u0001\u0007\u0005\u0007q\b\u0007\n\u0007\f"+
		"\u0007t\t\u0007\u0001\b\u0001\b\u0001\b\u0005\by\b\b\n\b\f\b|\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0081\b\b\u0004\b\u0083\b\b\u000b\b\f\b\u0084"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u008a\b\b\n\b\f\b\u008d\t\b\u0001\b\u0003"+
		"\b\u0090\b\b\u0001\t\u0005\t\u0093\b\t\n\t\f\t\u0096\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u009b\b\n\u000b\n\f\n\u009c\u0001\n\u0001\n\u0001\u000b"+
		"\u0004\u000b\u00a2\b\u000b\u000b\u000b\f\u000b\u00a3\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u00a8\b\u000b\u000b\u000b\f\u000b\u00a9\u0005\u000b"+
		"\u00ac\b\u000b\n\u000b\f\u000b\u00af\t\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00b4\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00bf\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00cc\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d9\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00f4\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00f9"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00fe\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0103\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0108\b\u0017\n\u0017\f\u0017\u010b"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0110\b\u0018"+
		"\n\u0018\f\u0018\u0113\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0119\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0121\b\u001a\u0001\u001a\u0001"+
		"F\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0003\u0001\u0000\u0003\u0004"+
		"\u0001\u0000(+\u0002\u0000!!--\u0137\u00009\u0001\u0000\u0000\u0000\u0002"+
		"@\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006V\u0001"+
		"\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000"+
		"\fc\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010\u008f"+
		"\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000\u0000\u0000\u0014\u0097"+
		"\u0001\u0000\u0000\u0000\u0016\u00a1\u0001\u0000\u0000\u0000\u0018\u00b0"+
		"\u0001\u0000\u0000\u0000\u001a\u00be\u0001\u0000\u0000\u0000\u001c\u00c0"+
		"\u0001\u0000\u0000\u0000\u001e\u00c3\u0001\u0000\u0000\u0000 \u00cb\u0001"+
		"\u0000\u0000\u0000\"\u00cd\u0001\u0000\u0000\u0000$\u00d1\u0001\u0000"+
		"\u0000\u0000&\u00dc\u0001\u0000\u0000\u0000(\u00e6\u0001\u0000\u0000\u0000"+
		"*\u00f3\u0001\u0000\u0000\u0000,\u0102\u0001\u0000\u0000\u0000.\u0104"+
		"\u0001\u0000\u0000\u00000\u010c\u0001\u0000\u0000\u00002\u0118\u0001\u0000"+
		"\u0000\u00004\u0120\u0001\u0000\u0000\u000068\u0003\u0002\u0001\u0000"+
		"76\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:\u0001\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000<A\u0003\u0004\u0002\u0000=A\u0005\u0001\u0000\u0000"+
		">A\u0003\u001c\u000e\u0000?A\u0003\u001e\u000f\u0000@<\u0001\u0000\u0000"+
		"\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000A\u0003\u0001\u0000\u0000\u0000BF\u0005\u0002\u0000\u0000"+
		"CE\u0003\u0006\u0003\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IO\u0007\u0000\u0000\u0000JK\u0005"+
		"\u0005\u0000\u0000KL\u0003\b\u0004\u0000LM\u0005\u0006\u0000\u0000MO\u0001"+
		"\u0000\u0000\u0000NB\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000"+
		"O\u0005\u0001\u0000\u0000\u0000PS\u0005\u0007\u0000\u0000QR\u0005\b\u0000"+
		"\u0000RT\u0005\t\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000UW\u0005\n\u0000\u0000VP\u0001\u0000\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XZ\u0003"+
		"\n\u0005\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^_\u0003\f\u0006\u0000_`\u0005\u000b\u0000\u0000"+
		"`a\u0003\u0012\t\u0000ab\u0005\f\u0000\u0000b\u000b\u0001\u0000\u0000"+
		"\u0000ch\u0003\u000e\u0007\u0000de\u0005\r\u0000\u0000eg\u0003\u000e\u0007"+
		"\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000i\r\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000kr\u0003\u0010\b\u0000ln\u0005\u000e\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oq\u0003\u0010\b\u0000pm\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u000f\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uz\u0005\u000f\u0000\u0000vw\u0005"+
		"\u0010\u0000\u0000wy\u0005\u000f\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{\u0090\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005"+
		"\u0010\u0000\u0000~\u0080\u0005\u000f\u0000\u0000\u007f\u0081\u0005\u000f"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082}\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0090\u0001\u0000\u0000"+
		"\u0000\u0086\u008b\u0005\u000f\u0000\u0000\u0087\u0088\u0005\u0011\u0000"+
		"\u0000\u0088\u008a\u0005\u000f\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0090\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090\u0005\u000f\u0000"+
		"\u0000\u008fu\u0001\u0000\u0000\u0000\u008f\u0082\u0001\u0000\u0000\u0000"+
		"\u008f\u0086\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0093\u0003\u0014\n\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0013\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\u000f\u0000\u0000\u0098\u009a\u0005\u0012\u0000\u0000\u0099"+
		"\u009b\u0003\u001a\r\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0013\u0000\u0000\u009f\u0015\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u0003\u001a\r\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00ad\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005"+
		"\r\u0000\u0000\u00a6\u00a8\u0003\u001a\r\u0000\u00a7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u0017\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\u000f\u0000\u0000\u00b1\u00b3\u0005\u0014"+
		"\u0000\u0000\u00b2\u00b4\u0003\u0016\u000b\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0015\u0000\u0000\u00b6\u0019\u0001\u0000"+
		"\u0000\u0000\u00b7\u00bf\u0003\u0018\f\u0000\u00b8\u00bf\u0005\u0016\u0000"+
		"\u0000\u00b9\u00bf\u0005\u0017\u0000\u0000\u00ba\u00bb\u0005\u0018\u0000"+
		"\u0000\u00bb\u00bf\u0005\u0019\u0000\u0000\u00bc\u00bf\u0005\u0018\u0000"+
		"\u0000\u00bd\u00bf\u0005\u000f\u0000\u0000\u00be\u00b7\u0001\u0000\u0000"+
		"\u0000\u00be\u00b8\u0001\u0000\u0000\u0000\u00be\u00b9\u0001\u0000\u0000"+
		"\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u001b\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\u001a\u0000\u0000\u00c1\u00c2\u0003 \u0010\u0000"+
		"\u00c2\u001d\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u001b\u0000\u0000"+
		"\u00c4\u00c5\u0003*\u0015\u0000\u00c5\u00c6\u0005\u001c\u0000\u0000\u00c6"+
		"\u001f\u0001\u0000\u0000\u0000\u00c7\u00cc\u0003\"\u0011\u0000\u00c8\u00cc"+
		"\u0003$\u0012\u0000\u00c9\u00cc\u0003&\u0013\u0000\u00ca\u00cc\u0003("+
		"\u0014\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc!\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u001d\u0000"+
		"\u0000\u00ce\u00cf\u0005\u001e\u0000\u0000\u00cf\u00d0\u0005\u001f\u0000"+
		"\u0000\u00d0#\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005 \u0000\u0000\u00d2"+
		"\u00d3\u0005!\u0000\u0000\u00d3\u00d4\u0005\u001f\u0000\u0000\u00d4\u00d5"+
		"\u0003\u0000\u0000\u0000\u00d5\u00d6\u0005\u001a\u0000\u0000\u00d6\u00d8"+
		"\u0005\"\u0000\u0000\u00d7\u00d9\u0005!\u0000\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005\u001f\u0000\u0000\u00db%\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005#\u0000\u0000\u00dd\u00de\u0005!\u0000\u0000"+
		"\u00de\u00df\u0005$\u0000\u0000\u00df\u00e0\u0003*\u0015\u0000\u00e0\u00e1"+
		"\u0005\u001f\u0000\u0000\u00e1\u00e2\u0003\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0005\u001a\u0000\u0000\u00e3\u00e4\u0005%\u0000\u0000\u00e4\u00e5\u0005"+
		"\u001f\u0000\u0000\u00e5\'\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005&"+
		"\u0000\u0000\u00e7\u00e8\u0003*\u0015\u0000\u00e8\u00e9\u0005\u001f\u0000"+
		"\u0000\u00e9\u00ea\u0003\u0000\u0000\u0000\u00ea\u00eb\u0005\u001a\u0000"+
		"\u0000\u00eb\u00ec\u0005\'\u0000\u0000\u00ec\u00ed\u0005\u001f\u0000\u0000"+
		"\u00ed)\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003,\u0016\u0000\u00ef\u00f0"+
		"\u0007\u0001\u0000\u0000\u00f0\u00f1\u0003,\u0016\u0000\u00f1\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f4\u0003,\u0016\u0000\u00f3\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4+\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f8\u0003.\u0017\u0000\u00f6\u00f7\u0005,\u0000\u0000\u00f7"+
		"\u00f9\u0007\u0002\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9\u0103\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005!\u0000\u0000\u00fb\u00fd\u0005.\u0000\u0000\u00fc\u00fe\u0003"+
		"0\u0018\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0103\u0005/\u0000"+
		"\u0000\u0100\u0103\u0003.\u0017\u0000\u0101\u0103\u00034\u001a\u0000\u0102"+
		"\u00f5\u0001\u0000\u0000\u0000\u0102\u00fa\u0001\u0000\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103"+
		"-\u0001\u0000\u0000\u0000\u0104\u0109\u0005!\u0000\u0000\u0105\u0106\u0005"+
		"0\u0000\u0000\u0106\u0108\u0005!\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a/\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u0111\u00032\u0019\u0000\u010d"+
		"\u010e\u00051\u0000\u0000\u010e\u0110\u00032\u0019\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u01121\u0001\u0000"+
		"\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0119\u0003*\u0015"+
		"\u0000\u0115\u0116\u0005!\u0000\u0000\u0116\u0117\u00052\u0000\u0000\u0117"+
		"\u0119\u0003*\u0015\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0118\u0115"+
		"\u0001\u0000\u0000\u0000\u01193\u0001\u0000\u0000\u0000\u011a\u0121\u0005"+
		"3\u0000\u0000\u011b\u0121\u0005\u001e\u0000\u0000\u011c\u0121\u00054\u0000"+
		"\u0000\u011d\u0121\u00055\u0000\u0000\u011e\u0121\u00056\u0000\u0000\u011f"+
		"\u0121\u0005!\u0000\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011b"+
		"\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120\u011d"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f"+
		"\u0001\u0000\u0000\u0000\u01215\u0001\u0000\u0000\u0000 9@FNSV[hmrz\u0080"+
		"\u0084\u008b\u008f\u0094\u009c\u00a3\u00a9\u00ad\u00b3\u00be\u00cb\u00d8"+
		"\u00f3\u00f8\u00fd\u0102\u0109\u0111\u0118\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}