// Generated from C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/grammars/CssParser.g4 by ANTLR 4.13.2
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
		WS=1, COMMENT=2, LBRACE=3, RBRACE=4, COLON=5, SEMICOLON=6, LPAREN=7, RPAREN=8, 
		COMMA=9, DOT=10, SLASH=11, PERCENT=12, PLUS=13, GREATER=14, TILDE=15, 
		EQUALS=16, LBRACKET=17, RBRACKET=18, ASTERISK=19, AT_IMPORT=20, AT_MEDIA=21, 
		AT_FONT_FACE=22, AT_KEYFRAMES=23, AT_SUPPORTS=24, FUNCTION=25, NUMBER=26, 
		COLOR_HEX=27, STRING=28, HASH=29, CLASS=30, PSEUDO_ELEMENT=31, PSEUDO_CLASS=32, 
		IDENT=33, JINJA_EXPR=34, JINJA_STATEMENT=35, INLINE_STYLE_START=36, INLINE_JINJA_EXPR=37, 
		INLINE_JINJA_STATEMENT=38, INLINE_STYLE_END=39;
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_ruleset = 2, RULE_selectorGroup = 3, 
		RULE_selector = 4, RULE_combinator = 5, RULE_simpleSelectorSequence = 6, 
		RULE_simpleSelector = 7, RULE_typeSelector = 8, RULE_universal = 9, RULE_hash = 10, 
		RULE_classSelector = 11, RULE_pseudo = 12, RULE_attributeSelector = 13, 
		RULE_atRule = 14, RULE_importTerminator = 15, RULE_mediaQueryList = 16, 
		RULE_mediaQuery = 17, RULE_declarationBlock = 18, RULE_declaration = 19, 
		RULE_propertyName = 20, RULE_value = 21, RULE_term = 22, RULE_functionCall = 23, 
		RULE_valueList = 24, RULE_keyframeBlock = 25, RULE_keyframeSelector = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "statement", "ruleset", "selectorGroup", "selector", "combinator", 
			"simpleSelectorSequence", "simpleSelector", "typeSelector", "universal", 
			"hash", "classSelector", "pseudo", "attributeSelector", "atRule", "importTerminator", 
			"mediaQueryList", "mediaQuery", "declarationBlock", "declaration", "propertyName", 
			"value", "term", "functionCall", "valueList", "keyframeBlock", "keyframeSelector"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{'", "'}'", "':'", "';'", "'('", "')'", "','", "'.'", 
			"'/'", "'%'", "'+'", "'>'", "'~'", "'='", "'['", "']'", "'*'", "'@import'", 
			"'@media'", "'@font-face'", "'@keyframes'", "'@supports'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "LBRACE", "RBRACE", "COLON", "SEMICOLON", "LPAREN", 
			"RPAREN", "COMMA", "DOT", "SLASH", "PERCENT", "PLUS", "GREATER", "TILDE", 
			"EQUALS", "LBRACKET", "RBRACKET", "ASTERISK", "AT_IMPORT", "AT_MEDIA", 
			"AT_FONT_FACE", "AT_KEYFRAMES", "AT_SUPPORTS", "FUNCTION", "NUMBER", 
			"COLOR_HEX", "STRING", "HASH", "CLASS", "PSEUDO_ELEMENT", "PSEUDO_CLASS", 
			"IDENT", "JINJA_EXPR", "JINJA_STATEMENT", "INLINE_STYLE_START", "INLINE_JINJA_EXPR", 
			"INLINE_JINJA_STATEMENT", "INLINE_STYLE_END"
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
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CssParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> JINJA_STATEMENT() { return getTokens(CssParser.JINJA_STATEMENT); }
		public TerminalNode JINJA_STATEMENT(int i) {
			return getToken(CssParser.JINJA_STATEMENT, i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 51019120640L) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACKET:
				case ASTERISK:
				case AT_IMPORT:
				case AT_MEDIA:
				case AT_FONT_FACE:
				case AT_KEYFRAMES:
				case HASH:
				case CLASS:
				case PSEUDO_ELEMENT:
				case PSEUDO_CLASS:
				case IDENT:
					{
					setState(54);
					statement();
					}
					break;
				case JINJA_STATEMENT:
					{
					setState(55);
					match(JINJA_STATEMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
	public static class StatementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
			case ASTERISK:
			case HASH:
			case CLASS:
			case PSEUDO_ELEMENT:
			case PSEUDO_CLASS:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				ruleset();
				}
				break;
			case AT_IMPORT:
			case AT_MEDIA:
			case AT_FONT_FACE:
			case AT_KEYFRAMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				atRule();
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
	public static class RulesetContext extends ParserRuleContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ruleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			selectorGroup();
			setState(68);
			match(LBRACE);
			setState(69);
			declarationBlock();
			setState(70);
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
	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			selector();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				selector();
				}
				}
				setState(79);
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
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorSequenceContext> simpleSelectorSequence() {
			return getRuleContexts(SimpleSelectorSequenceContext.class);
		}
		public SimpleSelectorSequenceContext simpleSelectorSequence(int i) {
			return getRuleContext(SimpleSelectorSequenceContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			simpleSelectorSequence();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16643710976L) != 0)) {
				{
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) {
					{
					setState(81);
					combinator();
					}
				}

				setState(84);
				simpleSelectorSequence();
				}
				}
				setState(89);
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
	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CssParser.PLUS, 0); }
		public TerminalNode GREATER() { return getToken(CssParser.GREATER, 0); }
		public TerminalNode TILDE() { return getToken(CssParser.TILDE, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
	public static class SimpleSelectorSequenceContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public List<HashContext> hash() {
			return getRuleContexts(HashContext.class);
		}
		public HashContext hash(int i) {
			return getRuleContext(HashContext.class,i);
		}
		public List<ClassSelectorContext> classSelector() {
			return getRuleContexts(ClassSelectorContext.class);
		}
		public ClassSelectorContext classSelector(int i) {
			return getRuleContext(ClassSelectorContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<AttributeSelectorContext> attributeSelector() {
			return getRuleContexts(AttributeSelectorContext.class);
		}
		public AttributeSelectorContext attributeSelector(int i) {
			return getRuleContext(AttributeSelectorContext.class,i);
		}
		public SimpleSelectorSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectorSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSimpleSelectorSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSimpleSelectorSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSimpleSelectorSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorSequenceContext simpleSelectorSequence() throws RecognitionException {
		SimpleSelectorSequenceContext _localctx = new SimpleSelectorSequenceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleSelectorSequence);
		try {
			int _alt;
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(92);
					typeSelector();
					}
					break;
				case ASTERISK:
					{
					setState(93);
					universal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(100);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(96);
							hash();
							}
							break;
						case CLASS:
							{
							setState(97);
							classSelector();
							}
							break;
						case PSEUDO_ELEMENT:
						case PSEUDO_CLASS:
							{
							setState(98);
							pseudo();
							}
							break;
						case LBRACKET:
							{
							setState(99);
							attributeSelector();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case LBRACKET:
			case HASH:
			case CLASS:
			case PSEUDO_ELEMENT:
			case PSEUDO_CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(109);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(105);
							hash();
							}
							break;
						case CLASS:
							{
							setState(106);
							classSelector();
							}
							break;
						case PSEUDO_ELEMENT:
						case PSEUDO_CLASS:
							{
							setState(107);
							pseudo();
							}
							break;
						case LBRACKET:
							{
							setState(108);
							attributeSelector();
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
					setState(111); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public AttributeSelectorContext attributeSelector() {
			return getRuleContext(AttributeSelectorContext.class,0);
		}
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleSelector);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				typeSelector();
				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				universal();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				hash();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				classSelector();
				}
				break;
			case PSEUDO_ELEMENT:
			case PSEUDO_CLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				pseudo();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				attributeSelector();
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
	public static class TypeSelectorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
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

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IDENT);
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
	public static class UniversalContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(CssParser.ASTERISK, 0); }
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ASTERISK);
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
	public static class HashContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(CssParser.HASH, 0); }
		public HashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitHash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashContext hash() throws RecognitionException {
		HashContext _localctx = new HashContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(HASH);
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
	public static class ClassSelectorContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CssParser.CLASS, 0); }
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(CLASS);
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
	public static class PseudoContext extends ParserRuleContext {
		public TerminalNode PSEUDO_CLASS() { return getToken(CssParser.PSEUDO_CLASS, 0); }
		public TerminalNode PSEUDO_ELEMENT() { return getToken(CssParser.PSEUDO_ELEMENT, 0); }
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==PSEUDO_ELEMENT || _la==PSEUDO_CLASS) ) {
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
	public static class AttributeSelectorContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(CssParser.LBRACKET, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode RBRACKET() { return getToken(CssParser.RBRACKET, 0); }
		public TerminalNode EQUALS() { return getToken(CssParser.EQUALS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttributeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttributeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttributeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSelectorContext attributeSelector() throws RecognitionException {
		AttributeSelectorContext _localctx = new AttributeSelectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attributeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LBRACKET);
			setState(134);
			match(IDENT);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(135);
				match(EQUALS);
				setState(136);
				value();
				}
			}

			setState(139);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleContext extends ParserRuleContext {
		public TerminalNode AT_IMPORT() { return getToken(CssParser.AT_IMPORT, 0); }
		public ImportTerminatorContext importTerminator() {
			return getRuleContext(ImportTerminatorContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode AT_MEDIA() { return getToken(CssParser.AT_MEDIA, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> JINJA_STATEMENT() { return getTokens(CssParser.JINJA_STATEMENT); }
		public TerminalNode JINJA_STATEMENT(int i) {
			return getToken(CssParser.JINJA_STATEMENT, i);
		}
		public TerminalNode AT_FONT_FACE() { return getToken(CssParser.AT_FONT_FACE, 0); }
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public TerminalNode AT_KEYFRAMES() { return getToken(CssParser.AT_KEYFRAMES, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public List<KeyframeBlockContext> keyframeBlock() {
			return getRuleContexts(KeyframeBlockContext.class);
		}
		public KeyframeBlockContext keyframeBlock(int i) {
			return getRuleContext(KeyframeBlockContext.class,i);
		}
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atRule);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(AT_IMPORT);
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(142);
					match(STRING);
					}
					break;
				case FUNCTION:
					{
					setState(143);
					functionCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146);
				importTerminator();
				}
				break;
			case AT_MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(AT_MEDIA);
				setState(148);
				mediaQueryList();
				setState(149);
				match(LBRACE);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 51019120640L) != 0)) {
					{
					setState(152);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACKET:
					case ASTERISK:
					case AT_IMPORT:
					case AT_MEDIA:
					case AT_FONT_FACE:
					case AT_KEYFRAMES:
					case HASH:
					case CLASS:
					case PSEUDO_ELEMENT:
					case PSEUDO_CLASS:
					case IDENT:
						{
						setState(150);
						statement();
						}
						break;
					case JINJA_STATEMENT:
						{
						setState(151);
						match(JINJA_STATEMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(RBRACE);
				}
				break;
			case AT_FONT_FACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(AT_FONT_FACE);
				setState(160);
				match(LBRACE);
				setState(161);
				declarationBlock();
				setState(162);
				match(RBRACE);
				}
				break;
			case AT_KEYFRAMES:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(AT_KEYFRAMES);
				setState(165);
				match(IDENT);
				setState(166);
				match(LBRACE);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 43016785920L) != 0)) {
					{
					setState(169);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PERCENT:
					case NUMBER:
					case IDENT:
						{
						setState(167);
						keyframeBlock();
						}
						break;
					case JINJA_STATEMENT:
						{
						setState(168);
						match(JINJA_STATEMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(RBRACE);
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
	public static class ImportTerminatorContext extends ParserRuleContext {
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
		public ImportTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importTerminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterImportTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitImportTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitImportTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportTerminatorContext importTerminator() throws RecognitionException {
		ImportTerminatorContext _localctx = new ImportTerminatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_importTerminator);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				mediaQueryList();
				setState(178);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(SEMICOLON);
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
	public static class MediaQueryListContext extends ParserRuleContext {
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitMediaQueryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitMediaQueryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			mediaQuery();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(184);
				match(COMMA);
				setState(185);
				mediaQuery();
				}
				}
				setState(190);
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
	public static class MediaQueryContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(CssParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(CssParser.IDENT, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(CssParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CssParser.LPAREN, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CssParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CssParser.RPAREN, i);
		}
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mediaQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(191);
				match(IDENT);
				}
				break;
			}
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(194);
				match(IDENT);
				}
				break;
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(197);
				match(LPAREN);
				setState(198);
				declaration();
				setState(199);
				match(RPAREN);
				}
			}

			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(203);
				match(IDENT);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(204);
					match(LPAREN);
					setState(205);
					declaration();
					setState(206);
					match(RPAREN);
					}
				}

				}
				}
				setState(214);
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
	public static class DeclarationBlockContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> JINJA_STATEMENT() { return getTokens(CssParser.JINJA_STATEMENT); }
		public TerminalNode JINJA_STATEMENT(int i) {
			return getToken(CssParser.JINJA_STATEMENT, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CssParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CssParser.SEMICOLON, i);
		}
		public DeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationBlock; }
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

	public final DeclarationBlockContext declarationBlock() throws RecognitionException {
		DeclarationBlockContext _localctx = new DeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT || _la==JINJA_STATEMENT) {
				{
				setState(220);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(215);
					declaration();
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(216);
						match(SEMICOLON);
						}
					}

					}
					break;
				case JINJA_STATEMENT:
					{
					setState(219);
					match(JINJA_STATEMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(224);
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
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			propertyName();
			setState(226);
			match(COLON);
			setState(227);
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
	public static class PropertyNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IDENT);
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(231);
					term();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(234); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public TerminalNode PERCENT() { return getToken(CssParser.PERCENT, 0); }
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public TerminalNode COLOR_HEX() { return getToken(CssParser.COLOR_HEX, 0); }
		public TerminalNode HASH() { return getToken(CssParser.HASH, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode JINJA_EXPR() { return getToken(CssParser.JINJA_EXPR, 0); }
		public TerminalNode JINJA_STATEMENT() { return getToken(CssParser.JINJA_STATEMENT, 0); }
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public TerminalNode SLASH() { return getToken(CssParser.SLASH, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(NUMBER);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(237);
					_la = _input.LA(1);
					if ( !(_la==PERCENT || _la==IDENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(STRING);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(IDENT);
				}
				break;
			case COLOR_HEX:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(COLOR_HEX);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(HASH);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				functionCall();
				}
				break;
			case JINJA_EXPR:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(JINJA_EXPR);
				}
				break;
			case JINJA_STATEMENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				match(JINJA_STATEMENT);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(247);
				match(LPAREN);
				setState(248);
				value();
				setState(249);
				match(RPAREN);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				match(SLASH);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CssParser.FUNCTION, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(FUNCTION);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61169731712L) != 0)) {
				{
				setState(255);
				valueList();
				}
			}

			setState(258);
			match(RPAREN);
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
	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			value();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				value();
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
	public static class KeyframeBlockContext extends ParserRuleContext {
		public KeyframeSelectorContext keyframeSelector() {
			return getRuleContext(KeyframeSelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public KeyframeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeBlockContext keyframeBlock() throws RecognitionException {
		KeyframeBlockContext _localctx = new KeyframeBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_keyframeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			keyframeSelector();
			setState(269);
			match(LBRACE);
			setState(270);
			declarationBlock();
			setState(271);
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
	public static class KeyframeSelectorContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(CssParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CssParser.NUMBER, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(CssParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(CssParser.PERCENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public TerminalNode IDENT() { return getToken(CssParser.IDENT, 0); }
		public KeyframeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeSelectorContext keyframeSelector() throws RecognitionException {
		KeyframeSelectorContext _localctx = new KeyframeSelectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keyframeSelector);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERCENT:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				_la = _input.LA(1);
				if ( !(_la==PERCENT || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(274);
					match(COMMA);
					setState(275);
					_la = _input.LA(1);
					if ( !(_la==PERCENT || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(IDENT);
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
		"\u0004\u0001\'\u011d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0005\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004S\b\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004\f\u0004"+
		"Y\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"_\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"e\b\u0006\n\u0006\f\u0006h\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006n\b\u0006\u000b\u0006\f\u0006o\u0003\u0006r\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007z\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u008a\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u0091\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0099\b\u000e\n\u000e\f\u000e\u009c"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00aa\b\u000e\n\u000e\f\u000e\u00ad\t\u000e\u0001\u000e"+
		"\u0003\u000e\u00b0\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00bb\b\u0010\n\u0010\f\u0010\u00be\t\u0010\u0001\u0011\u0003\u0011\u00c1"+
		"\b\u0011\u0001\u0011\u0003\u0011\u00c4\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00ca\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d1\b\u0011\u0005\u0011"+
		"\u00d3\b\u0011\n\u0011\f\u0011\u00d6\t\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00da\b\u0012\u0001\u0012\u0005\u0012\u00dd\b\u0012\n\u0012\f\u0012"+
		"\u00e0\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0004\u0015\u00e9\b\u0015\u000b\u0015\f\u0015"+
		"\u00ea\u0001\u0016\u0001\u0016\u0003\u0016\u00ef\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00fd"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0101\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0108\b\u0018"+
		"\n\u0018\f\u0018\u010b\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0115"+
		"\b\u001a\n\u001a\f\u001a\u0118\t\u001a\u0001\u001a\u0003\u001a\u011b\b"+
		"\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0004"+
		"\u0001\u0000\r\u000f\u0001\u0000\u001f \u0002\u0000\f\f!!\u0002\u0000"+
		"\f\f\u001a\u001a\u0138\u0000:\u0001\u0000\u0000\u0000\u0002A\u0001\u0000"+
		"\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000"+
		"\bP\u0001\u0000\u0000\u0000\nZ\u0001\u0000\u0000\u0000\fq\u0001\u0000"+
		"\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000"+
		"\u0012}\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016"+
		"\u0081\u0001\u0000\u0000\u0000\u0018\u0083\u0001\u0000\u0000\u0000\u001a"+
		"\u0085\u0001\u0000\u0000\u0000\u001c\u00af\u0001\u0000\u0000\u0000\u001e"+
		"\u00b5\u0001\u0000\u0000\u0000 \u00b7\u0001\u0000\u0000\u0000\"\u00c0"+
		"\u0001\u0000\u0000\u0000$\u00de\u0001\u0000\u0000\u0000&\u00e1\u0001\u0000"+
		"\u0000\u0000(\u00e5\u0001\u0000\u0000\u0000*\u00e8\u0001\u0000\u0000\u0000"+
		",\u00fc\u0001\u0000\u0000\u0000.\u00fe\u0001\u0000\u0000\u00000\u0104"+
		"\u0001\u0000\u0000\u00002\u010c\u0001\u0000\u0000\u00004\u011a\u0001\u0000"+
		"\u0000\u000069\u0003\u0002\u0001\u000079\u0005#\u0000\u000086\u0001\u0000"+
		"\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000=>\u0005\u0000\u0000\u0001>\u0001\u0001\u0000"+
		"\u0000\u0000?B\u0003\u0004\u0002\u0000@B\u0003\u001c\u000e\u0000A?\u0001"+
		"\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\u0003\u0001\u0000\u0000"+
		"\u0000CD\u0003\u0006\u0003\u0000DE\u0005\u0003\u0000\u0000EF\u0003$\u0012"+
		"\u0000FG\u0005\u0004\u0000\u0000G\u0005\u0001\u0000\u0000\u0000HM\u0003"+
		"\b\u0004\u0000IJ\u0005\t\u0000\u0000JL\u0003\b\u0004\u0000KI\u0001\u0000"+
		"\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000PW\u0003\f\u0006\u0000QS\u0003\n\u0005\u0000RQ\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0003\f\u0006"+
		"\u0000UR\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000Z[\u0007\u0000\u0000\u0000[\u000b\u0001\u0000\u0000"+
		"\u0000\\_\u0003\u0010\b\u0000]_\u0003\u0012\t\u0000^\\\u0001\u0000\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_f\u0001\u0000\u0000\u0000`e\u0003\u0014"+
		"\n\u0000ae\u0003\u0016\u000b\u0000be\u0003\u0018\f\u0000ce\u0003\u001a"+
		"\r\u0000d`\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gr\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000in\u0003\u0014\n\u0000jn\u0003\u0016\u000b\u0000"+
		"kn\u0003\u0018\f\u0000ln\u0003\u001a\r\u0000mi\u0001\u0000\u0000\u0000"+
		"mj\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pr\u0001\u0000\u0000\u0000q^\u0001\u0000\u0000\u0000qm\u0001"+
		"\u0000\u0000\u0000r\r\u0001\u0000\u0000\u0000sz\u0003\u0010\b\u0000tz"+
		"\u0003\u0012\t\u0000uz\u0003\u0014\n\u0000vz\u0003\u0016\u000b\u0000w"+
		"z\u0003\u0018\f\u0000xz\u0003\u001a\r\u0000ys\u0001\u0000\u0000\u0000"+
		"yt\u0001\u0000\u0000\u0000yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u000f\u0001"+
		"\u0000\u0000\u0000{|\u0005!\u0000\u0000|\u0011\u0001\u0000\u0000\u0000"+
		"}~\u0005\u0013\u0000\u0000~\u0013\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005\u001d\u0000\u0000\u0080\u0015\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\u001e\u0000\u0000\u0082\u0017\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0007\u0001\u0000\u0000\u0084\u0019\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u0011\u0000\u0000\u0086\u0089\u0005!\u0000\u0000\u0087\u0088\u0005"+
		"\u0010\u0000\u0000\u0088\u008a\u0003*\u0015\u0000\u0089\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\u0012\u0000\u0000\u008c\u001b\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0005\u0014\u0000\u0000\u008e\u0091\u0005\u001c"+
		"\u0000\u0000\u008f\u0091\u0003.\u0017\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u00b0\u0003\u001e\u000f\u0000\u0093\u0094\u0005\u0015\u0000"+
		"\u0000\u0094\u0095\u0003 \u0010\u0000\u0095\u009a\u0005\u0003\u0000\u0000"+
		"\u0096\u0099\u0003\u0002\u0001\u0000\u0097\u0099\u0005#\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0004\u0000\u0000\u009e"+
		"\u00b0\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0016\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0003\u0000\u0000\u00a1\u00a2\u0003$\u0012\u0000\u00a2\u00a3"+
		"\u0005\u0004\u0000\u0000\u00a3\u00b0\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0017\u0000\u0000\u00a5\u00a6\u0005!\u0000\u0000\u00a6\u00ab\u0005"+
		"\u0003\u0000\u0000\u00a7\u00aa\u00032\u0019\u0000\u00a8\u00aa\u0005#\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\u0004\u0000"+
		"\u0000\u00af\u008d\u0001\u0000\u0000\u0000\u00af\u0093\u0001\u0000\u0000"+
		"\u0000\u00af\u009f\u0001\u0000\u0000\u0000\u00af\u00a4\u0001\u0000\u0000"+
		"\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003 \u0010\u0000"+
		"\u00b2\u00b3\u0005\u0006\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0005\u0006\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u001f\u0001\u0000\u0000\u0000"+
		"\u00b7\u00bc\u0003\"\u0011\u0000\u00b8\u00b9\u0005\t\u0000\u0000\u00b9"+
		"\u00bb\u0003\"\u0011\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00be"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0005!\u0000\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0005!\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005\u0007\u0000\u0000\u00c6\u00c7\u0003&\u0013\u0000"+
		"\u00c7\u00c8\u0005\b\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00d4\u0001\u0000\u0000\u0000\u00cb\u00d0\u0005!\u0000\u0000\u00cc\u00cd"+
		"\u0005\u0007\u0000\u0000\u00cd\u00ce\u0003&\u0013\u0000\u00ce\u00cf\u0005"+
		"\b\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d2\u00cb\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5#\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d9\u0003&\u0013\u0000\u00d8\u00da\u0005\u0006\u0000\u0000"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00dd\u0005#\u0000\u0000\u00dc"+
		"\u00d7\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df%\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003(\u0014\u0000\u00e2\u00e3\u0005"+
		"\u0005\u0000\u0000\u00e3\u00e4\u0003*\u0015\u0000\u00e4\'\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005!\u0000\u0000\u00e6)\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e9\u0003,\u0016\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb+\u0001\u0000\u0000\u0000\u00ec\u00ee"+
		"\u0005\u001a\u0000\u0000\u00ed\u00ef\u0007\u0002\u0000\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00fd"+
		"\u0001\u0000\u0000\u0000\u00f0\u00fd\u0005\u001c\u0000\u0000\u00f1\u00fd"+
		"\u0005!\u0000\u0000\u00f2\u00fd\u0005\u001b\u0000\u0000\u00f3\u00fd\u0005"+
		"\u001d\u0000\u0000\u00f4\u00fd\u0003.\u0017\u0000\u00f5\u00fd\u0005\""+
		"\u0000\u0000\u00f6\u00fd\u0005#\u0000\u0000\u00f7\u00f8\u0005\u0007\u0000"+
		"\u0000\u00f8\u00f9\u0003*\u0015\u0000\u00f9\u00fa\u0005\b\u0000\u0000"+
		"\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\u000b\u0000\u0000"+
		"\u00fc\u00ec\u0001\u0000\u0000\u0000\u00fc\u00f0\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f1\u0001\u0000\u0000\u0000\u00fc\u00f2\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f3\u0001\u0000\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f5\u0001\u0000\u0000\u0000\u00fc\u00f6\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f7\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd-\u0001\u0000\u0000\u0000\u00fe\u0100\u0005\u0019\u0000\u0000\u00ff"+
		"\u0101\u00030\u0018\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005\b\u0000\u0000\u0103/\u0001\u0000\u0000\u0000\u0104\u0109\u0003"+
		"*\u0015\u0000\u0105\u0106\u0005\t\u0000\u0000\u0106\u0108\u0003*\u0015"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a1\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u00034\u001a\u0000\u010d\u010e\u0005\u0003\u0000\u0000\u010e"+
		"\u010f\u0003$\u0012\u0000\u010f\u0110\u0005\u0004\u0000\u0000\u01103\u0001"+
		"\u0000\u0000\u0000\u0111\u0116\u0007\u0003\u0000\u0000\u0112\u0113\u0005"+
		"\t\u0000\u0000\u0113\u0115\u0007\u0003\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011b\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011b\u0005!\u0000"+
		"\u0000\u011a\u0111\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000"+
		"\u0000\u011b5\u0001\u0000\u0000\u0000%8:AMRW^dfmoqy\u0089\u0090\u0098"+
		"\u009a\u00a9\u00ab\u00af\u00b5\u00bc\u00c0\u00c3\u00c9\u00d0\u00d4\u00d9"+
		"\u00dc\u00de\u00ea\u00ee\u00fc\u0100\u0109\u0116\u011a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}