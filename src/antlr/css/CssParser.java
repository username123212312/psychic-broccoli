// Generated from grammars/CssParser.g4 by ANTLR 4.13.2
package antlr.css;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSS_LBRACE=1, CSS_RBRACE=2, CSS_LPAREN=3, CSS_RPAREN=4, CSS_COLON=5, CSS_SEMI=6, 
		CSS_COMMA=7, CSS_DOT=8, CSS_GT=9, CSS_HASH=10, CSS_HEX_COLOR=11, CSS_NUMBER=12, 
		CSS_UNIT=13, CSS_STRING=14, CSS_ID=15, CSS_Space=16, CSS_Comment=17, CSS_TILDE=18;
	public static final int
		RULE_style_sheet = 0, RULE_ruleSet = 1, RULE_selector_decl = 2, RULE_css_selector_list = 3, 
		RULE_css_selector = 4, RULE_declarationList = 5, RULE_declaration = 6, 
		RULE_css_function_args = 7, RULE_css_function_call = 8, RULE_cssterm = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"style_sheet", "ruleSet", "selector_decl", "css_selector_list", "css_selector", 
			"declarationList", "declaration", "css_function_args", "css_function_call", 
			"cssterm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "':'", "';'", "','", "'.'", "'>'", 
			"'#'", null, null, null, null, null, null, null, "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CSS_LBRACE", "CSS_RBRACE", "CSS_LPAREN", "CSS_RPAREN", "CSS_COLON", 
			"CSS_SEMI", "CSS_COMMA", "CSS_DOT", "CSS_GT", "CSS_HASH", "CSS_HEX_COLOR", 
			"CSS_NUMBER", "CSS_UNIT", "CSS_STRING", "CSS_ID", "CSS_Space", "CSS_Comment", 
			"CSS_TILDE"
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
	public String getGrammarFileName() { return "CssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStyleSheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStyleSheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStyleSheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_sheetContext style_sheet() throws RecognitionException {
		Style_sheetContext _localctx = new Style_sheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_style_sheet);
		int _la;
		try {
			_localctx = new StyleSheetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_DOT || _la==CSS_ID) {
				{
				{
				setState(20);
				ruleSet();
				}
				}
				setState(25);
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
		public TerminalNode CSS_LBRACE() { return getToken(CssParser.CSS_LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(CssParser.CSS_RBRACE, 0); }
		public CssRuleContext(RuleSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleSet);
		try {
			_localctx = new CssRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			selector_decl();
			setState(27);
			match(CSS_LBRACE);
			setState(28);
			declarationList();
			setState(29);
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
		public List<TerminalNode> CSS_COMMA() { return getTokens(CssParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(CssParser.CSS_COMMA, i);
		}
		public CssSelectorDeclarationContext(Selector_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssSelectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssSelectorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssSelectorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_declContext selector_decl() throws RecognitionException {
		Selector_declContext _localctx = new Selector_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selector_decl);
		int _la;
		try {
			_localctx = new CssSelectorDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			css_selector_list();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(32);
				match(CSS_COMMA);
				setState(33);
				css_selector_list();
				}
				}
				setState(38);
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
		public List<TerminalNode> CSS_GT() { return getTokens(CssParser.CSS_GT); }
		public TerminalNode CSS_GT(int i) {
			return getToken(CssParser.CSS_GT, i);
		}
		public CssSelectorListContext(Css_selector_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssSelectorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_selector_listContext css_selector_list() throws RecognitionException {
		Css_selector_listContext _localctx = new Css_selector_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_css_selector_list);
		int _la;
		try {
			_localctx = new CssSelectorListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			css_selector();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33536L) != 0)) {
				{
				{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_GT) {
					{
					setState(40);
					match(CSS_GT);
					}
				}

				setState(43);
				css_selector();
				}
				}
				setState(48);
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
		public List<TerminalNode> CSS_ID() { return getTokens(CssParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(CssParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_DOT() { return getTokens(CssParser.CSS_DOT); }
		public TerminalNode CSS_DOT(int i) {
			return getToken(CssParser.CSS_DOT, i);
		}
		public QualifiedSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterQualifiedSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitQualifiedSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitQualifiedSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneSimpleSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_DOT() { return getTokens(CssParser.CSS_DOT); }
		public TerminalNode CSS_DOT(int i) {
			return getToken(CssParser.CSS_DOT, i);
		}
		public List<TerminalNode> CSS_ID() { return getTokens(CssParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(CssParser.CSS_ID, i);
		}
		public StandaloneSimpleSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStandaloneSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStandaloneSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStandaloneSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAndIdSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_ID() { return getTokens(CssParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(CssParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_HASH() { return getTokens(CssParser.CSS_HASH); }
		public TerminalNode CSS_HASH(int i) {
			return getToken(CssParser.CSS_HASH, i);
		}
		public TypeAndIdSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTypeAndIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTypeAndIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTypeAndIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends Css_selectorContext {
		public TerminalNode CSS_ID() { return getToken(CssParser.CSS_ID, 0); }
		public TypeSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_selectorContext css_selector() throws RecognitionException {
		Css_selectorContext _localctx = new Css_selectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_css_selector);
		int _la;
		try {
			int _alt;
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new QualifiedSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(CSS_ID);
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(50);
						match(CSS_DOT);
						setState(51);
						match(CSS_ID);
						}
						} 
					}
					setState(56);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new StandaloneSimpleSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(57);
						match(CSS_DOT);
						setState(58);
						match(CSS_ID);
						setState(60);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
						case 1:
							{
							setState(59);
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
					setState(64); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				_localctx = new TypeAndIdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(CSS_ID);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_HASH) {
					{
					{
					setState(67);
					match(CSS_HASH);
					setState(68);
					match(CSS_ID);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new TypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDeclarationBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationList);
		int _la;
		try {
			_localctx = new DeclarationBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID) {
				{
				{
				setState(77);
				declaration();
				}
				}
				setState(82);
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
		public TerminalNode CSS_ID() { return getToken(CssParser.CSS_ID, 0); }
		public TerminalNode CSS_COLON() { return getToken(CssParser.CSS_COLON, 0); }
		public TerminalNode CSS_SEMI() { return getToken(CssParser.CSS_SEMI, 0); }
		public List<CsstermContext> cssterm() {
			return getRuleContexts(CsstermContext.class);
		}
		public CsstermContext cssterm(int i) {
			return getRuleContext(CsstermContext.class,i);
		}
		public CssDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			_localctx = new CssDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(CSS_ID);
			setState(84);
			match(CSS_COLON);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				cssterm();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 55296L) != 0) );
			setState(90);
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
		public List<TerminalNode> CSS_COMMA() { return getTokens(CssParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(CssParser.CSS_COMMA, i);
		}
		public FunctionArgumentsContext(Css_function_argsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_function_argsContext css_function_args() throws RecognitionException {
		Css_function_argsContext _localctx = new Css_function_argsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_css_function_args);
		int _la;
		try {
			_localctx = new FunctionArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				cssterm();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 55296L) != 0) );
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(97);
				match(CSS_COMMA);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					cssterm();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 55296L) != 0) );
				}
				}
				setState(107);
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
		public TerminalNode CSS_ID() { return getToken(CssParser.CSS_ID, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(CssParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(CssParser.CSS_RPAREN, 0); }
		public Css_function_argsContext css_function_args() {
			return getRuleContext(Css_function_argsContext.class,0);
		}
		public CssFunctionCallContext(Css_function_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_function_callContext css_function_call() throws RecognitionException {
		Css_function_callContext _localctx = new Css_function_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_css_function_call);
		int _la;
		try {
			_localctx = new CssFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(CSS_ID);
			setState(109);
			match(CSS_LPAREN);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 55296L) != 0)) {
				{
				setState(110);
				css_function_args();
				}
			}

			setState(113);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFunctionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFunctionTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTermContext extends CsstermContext {
		public TerminalNode CSS_STRING() { return getToken(CssParser.CSS_STRING, 0); }
		public StringTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStringTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStringTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStringTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberTermContext extends CsstermContext {
		public TerminalNode CSS_NUMBER() { return getToken(CssParser.CSS_NUMBER, 0); }
		public NumberTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterNumberTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitNumberTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitNumberTermContext extends CsstermContext {
		public TerminalNode CSS_NUMBER() { return getToken(CssParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(CssParser.CSS_UNIT, 0); }
		public UnitNumberTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUnitNumberTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUnitNumberTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUnitNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorTermContext extends CsstermContext {
		public TerminalNode CSS_HEX_COLOR() { return getToken(CssParser.CSS_HEX_COLOR, 0); }
		public ColorTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterColorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitColorTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitColorTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierTermContext extends CsstermContext {
		public TerminalNode CSS_ID() { return getToken(CssParser.CSS_ID, 0); }
		public IdentifierTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterIdentifierTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitIdentifierTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitIdentifierTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsstermContext cssterm() throws RecognitionException {
		CsstermContext _localctx = new CsstermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cssterm);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new FunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				css_function_call();
				}
				break;
			case 2:
				_localctx = new StringTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(CSS_STRING);
				}
				break;
			case 3:
				_localctx = new ColorTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(CSS_HEX_COLOR);
				}
				break;
			case 4:
				_localctx = new UnitNumberTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(CSS_NUMBER);
				setState(119);
				match(CSS_UNIT);
				}
				break;
			case 5:
				_localctx = new NumberTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				match(CSS_NUMBER);
				}
				break;
			case 6:
				_localctx = new IdentifierTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012}\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002#\b\u0002"+
		"\n\u0002\f\u0002&\t\u0002\u0001\u0003\u0001\u0003\u0003\u0003*\b\u0003"+
		"\u0001\u0003\u0005\u0003-\b\u0003\n\u0003\f\u00030\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u00045\b\u0004\n\u0004\f\u00048\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004=\b\u0004\u0004\u0004"+
		"?\b\u0004\u000b\u0004\f\u0004@\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0004\u0003\u0004L\b\u0004"+
		"\u0001\u0005\u0005\u0005O\b\u0005\n\u0005\f\u0005R\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0004\u0006W\b\u0006\u000b\u0006\f\u0006X\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007^\b\u0007\u000b\u0007\f\u0007"+
		"_\u0001\u0007\u0001\u0007\u0004\u0007d\b\u0007\u000b\u0007\f\u0007e\u0005"+
		"\u0007h\b\u0007\n\u0007\f\u0007k\t\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\bp\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t{\b\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0000\u0000\u0088\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001f\u0001\u0000\u0000"+
		"\u0000\u0006\'\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000\nP\u0001"+
		"\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000e]\u0001\u0000\u0000"+
		"\u0000\u0010l\u0001\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014"+
		"\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0004\u0002\u0000\u001b"+
		"\u001c\u0005\u0001\u0000\u0000\u001c\u001d\u0003\n\u0005\u0000\u001d\u001e"+
		"\u0005\u0002\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f$\u0003"+
		"\u0006\u0003\u0000 !\u0005\u0007\u0000\u0000!#\u0003\u0006\u0003\u0000"+
		"\" \u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000\'.\u0003\b\u0004\u0000(*\u0005\t\u0000\u0000)(\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+-\u0003\b\u0004\u0000,)\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0007\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000016\u0005\u000f\u0000\u000023\u0005"+
		"\b\u0000\u000035\u0005\u000f\u0000\u000042\u0001\u0000\u0000\u000058\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7L\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\b\u0000\u0000"+
		":<\u0005\u000f\u0000\u0000;=\u0005\u000f\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000>9\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000AL\u0001\u0000\u0000\u0000BG\u0005\u000f\u0000\u0000"+
		"CD\u0005\n\u0000\u0000DF\u0005\u000f\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HL\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0005\u000f"+
		"\u0000\u0000K1\u0001\u0000\u0000\u0000K>\u0001\u0000\u0000\u0000KB\u0001"+
		"\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\t\u0001\u0000\u0000\u0000"+
		"MO\u0003\f\u0006\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u000b\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u000f\u0000\u0000TV\u0005"+
		"\u0005\u0000\u0000UW\u0003\u0012\t\u0000VU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z[\u0005\u0006\u0000\u0000[\r\u0001\u0000\u0000"+
		"\u0000\\^\u0003\u0012\t\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`i\u0001"+
		"\u0000\u0000\u0000ac\u0005\u0007\u0000\u0000bd\u0003\u0012\t\u0000cb\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000"+
		"\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000j\u000f\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lm\u0005\u000f\u0000\u0000mo\u0005\u0003\u0000\u0000np\u0003\u000e\u0007"+
		"\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0005\u0004\u0000\u0000r\u0011\u0001\u0000\u0000\u0000"+
		"s{\u0003\u0010\b\u0000t{\u0005\u000e\u0000\u0000u{\u0005\u000b\u0000\u0000"+
		"vw\u0005\f\u0000\u0000w{\u0005\r\u0000\u0000x{\u0005\f\u0000\u0000y{\u0005"+
		"\u000f\u0000\u0000zs\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000"+
		"zu\u0001\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{\u0013\u0001\u0000\u0000\u0000\u0010"+
		"\u0017$).6<@GKPX_eioz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}