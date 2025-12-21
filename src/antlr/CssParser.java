// Generated from C:/Users/TWL/Desktop/psychic-broccoli-main/grammars/CssParser.g4 by ANTLR 4.13.2
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
		WS=1, COMMENT=2, JINJA_EXPR_START=3, JINJA_STMT_START=4, JINJA_EXPR_END=5, 
		JINJA_EXPR_CONTENT=6, JINJA_STMT_END=7, JINJA_STMT_CONTENT=8, LBRACE=9, 
		RBRACE=10, COLON=11, SEMICOLON=12, LPAREN=13, RPAREN=14, COMMA=15, DOT=16, 
		SLASH=17, PERCENT=18, PLUS=19, GREATER=20, TILDE=21, EQUALS=22, LBRACKET=23, 
		RBRACKET=24, ASTERISK=25, AT_IMPORT=26, AT_MEDIA=27, AT_FONT_FACE=28, 
		AT_KEYFRAMES=29, AT_SUPPORTS=30, AT_RULE=31, FUNCTION=32, NUMBER=33, COLOR_HEX=34, 
		STRING=35, HASH=36, CLASS=37, PSEUDO_ELEMENT=38, PSEUDO_CLASS=39, IDENT=40;
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_atRule = 2, RULE_ruleset = 3, 
		RULE_selectorGroup = 4, RULE_declarationBlock = 5, RULE_declaration = 6, 
		RULE_anyValueUntilBrace = 7, RULE_anyValueUntilSemicolon = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "statement", "atRule", "ruleset", "selectorGroup", "declarationBlock", 
			"declaration", "anyValueUntilBrace", "anyValueUntilSemicolon"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'{{'", "'{%'", "'}}'", null, "'%}'", null, "'{'", 
			"'}'", "':'", "';'", "'('", "')'", "','", "'.'", "'/'", "'%'", "'+'", 
			"'>'", "'~'", "'='", "'['", "']'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_EXPR_END", 
			"JINJA_EXPR_CONTENT", "JINJA_STMT_END", "JINJA_STMT_CONTENT", "LBRACE", 
			"RBRACE", "COLON", "SEMICOLON", "LPAREN", "RPAREN", "COMMA", "DOT", "SLASH", 
			"PERCENT", "PLUS", "GREATER", "TILDE", "EQUALS", "LBRACKET", "RBRACKET", 
			"ASTERISK", "AT_IMPORT", "AT_MEDIA", "AT_FONT_FACE", "AT_KEYFRAMES", 
			"AT_SUPPORTS", "AT_RULE", "FUNCTION", "NUMBER", "COLOR_HEX", "STRING", 
			"HASH", "CLASS", "PSEUDO_ELEMENT", "PSEUDO_CLASS", "IDENT"
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
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(CssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(CssParser.JINJA_STMT_START, i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(CssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(CssParser.JINJA_STMT_END, i);
		}
		public List<TerminalNode> JINJA_STMT_CONTENT() { return getTokens(CssParser.JINJA_STMT_CONTENT); }
		public TerminalNode JINJA_STMT_CONTENT(int i) {
			return getToken(CssParser.JINJA_STMT_CONTENT, i);
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255030L) != 0)) {
				{
				setState(27);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WS:
				case COMMENT:
				case JINJA_EXPR_END:
				case JINJA_EXPR_CONTENT:
				case JINJA_STMT_END:
				case JINJA_STMT_CONTENT:
				case RBRACE:
				case COLON:
				case SEMICOLON:
				case LPAREN:
				case RPAREN:
				case COMMA:
				case DOT:
				case SLASH:
				case PERCENT:
				case PLUS:
				case GREATER:
				case TILDE:
				case EQUALS:
				case LBRACKET:
				case RBRACKET:
				case ASTERISK:
				case AT_IMPORT:
				case AT_MEDIA:
				case AT_FONT_FACE:
				case AT_KEYFRAMES:
				case AT_SUPPORTS:
				case AT_RULE:
				case FUNCTION:
				case NUMBER:
				case COLOR_HEX:
				case STRING:
				case HASH:
				case CLASS:
				case PSEUDO_ELEMENT:
				case PSEUDO_CLASS:
				case IDENT:
					{
					setState(18);
					statement();
					}
					break;
				case JINJA_STMT_START:
					{
					setState(19);
					match(JINJA_STMT_START);
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==JINJA_STMT_CONTENT) {
						{
						{
						setState(20);
						match(JINJA_STMT_CONTENT);
						}
						}
						setState(25);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(26);
					match(JINJA_STMT_END);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				ruleset();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				atRule();
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
	public static class AtRuleContext extends ParserRuleContext {
		public AnyValueUntilBraceContext anyValueUntilBrace() {
			return getRuleContext(AnyValueUntilBraceContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public TerminalNode AT_MEDIA() { return getToken(CssParser.AT_MEDIA, 0); }
		public TerminalNode AT_KEYFRAMES() { return getToken(CssParser.AT_KEYFRAMES, 0); }
		public TerminalNode AT_SUPPORTS() { return getToken(CssParser.AT_SUPPORTS, 0); }
		public TerminalNode AT_FONT_FACE() { return getToken(CssParser.AT_FONT_FACE, 0); }
		public TerminalNode AT_RULE() { return getToken(CssParser.AT_RULE, 0); }
		public List<RulesetContext> ruleset() {
			return getRuleContexts(RulesetContext.class);
		}
		public RulesetContext ruleset(int i) {
			return getRuleContext(RulesetContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(CssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(CssParser.JINJA_STMT_START, i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(CssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(CssParser.JINJA_STMT_END, i);
		}
		public List<TerminalNode> JINJA_STMT_CONTENT() { return getTokens(CssParser.JINJA_STMT_CONTENT); }
		public TerminalNode JINJA_STMT_CONTENT(int i) {
			return getToken(CssParser.JINJA_STMT_CONTENT, i);
		}
		public TerminalNode AT_IMPORT() { return getToken(CssParser.AT_IMPORT, 0); }
		public AnyValueUntilSemicolonContext anyValueUntilSemicolon() {
			return getRuleContext(AnyValueUntilSemicolonContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 4, RULE_atRule);
		int _la;
		try {
			int _alt;
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_MEDIA:
			case AT_FONT_FACE:
			case AT_KEYFRAMES:
			case AT_SUPPORTS:
			case AT_RULE:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(39);
				anyValueUntilBrace();
				setState(40);
				match(LBRACE);
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(50);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case WS:
						case COMMENT:
						case JINJA_EXPR_END:
						case JINJA_EXPR_CONTENT:
						case JINJA_STMT_END:
						case JINJA_STMT_CONTENT:
						case RBRACE:
						case COLON:
						case SEMICOLON:
						case LPAREN:
						case RPAREN:
						case COMMA:
						case DOT:
						case SLASH:
						case PERCENT:
						case PLUS:
						case GREATER:
						case TILDE:
						case EQUALS:
						case LBRACKET:
						case RBRACKET:
						case ASTERISK:
						case AT_IMPORT:
						case AT_MEDIA:
						case AT_FONT_FACE:
						case AT_KEYFRAMES:
						case AT_SUPPORTS:
						case AT_RULE:
						case FUNCTION:
						case NUMBER:
						case COLOR_HEX:
						case STRING:
						case HASH:
						case CLASS:
						case PSEUDO_ELEMENT:
						case PSEUDO_CLASS:
						case IDENT:
							{
							setState(41);
							ruleset();
							}
							break;
						case JINJA_STMT_START:
							{
							setState(42);
							match(JINJA_STMT_START);
							setState(46);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==JINJA_STMT_CONTENT) {
								{
								{
								setState(43);
								match(JINJA_STMT_CONTENT);
								}
								}
								setState(48);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(49);
							match(JINJA_STMT_END);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(54);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(55);
				match(RBRACE);
				}
				break;
			case AT_IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(AT_IMPORT);
				setState(58);
				anyValueUntilSemicolon();
				setState(59);
				match(SEMICOLON);
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
		enterRule(_localctx, 6, RULE_ruleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			selectorGroup();
			setState(64);
			match(LBRACE);
			setState(65);
			declarationBlock();
			setState(66);
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
		public AnyValueUntilBraceContext anyValueUntilBrace() {
			return getRuleContext(AnyValueUntilBraceContext.class,0);
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
		enterRule(_localctx, 8, RULE_selectorGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			anyValueUntilBrace();
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
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(CssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(CssParser.JINJA_STMT_START, i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(CssParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(CssParser.JINJA_STMT_END, i);
		}
		public List<TerminalNode> JINJA_STMT_CONTENT() { return getTokens(CssParser.JINJA_STMT_CONTENT); }
		public TerminalNode JINJA_STMT_CONTENT(int i) {
			return getToken(CssParser.JINJA_STMT_CONTENT, i);
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
		enterRule(_localctx, 10, RULE_declarationBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(79);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WS:
					case COMMENT:
					case JINJA_EXPR_END:
					case JINJA_EXPR_CONTENT:
					case JINJA_STMT_END:
					case JINJA_STMT_CONTENT:
					case LBRACE:
					case RBRACE:
					case COLON:
					case LPAREN:
					case RPAREN:
					case COMMA:
					case DOT:
					case SLASH:
					case PERCENT:
					case PLUS:
					case GREATER:
					case TILDE:
					case EQUALS:
					case LBRACKET:
					case RBRACKET:
					case ASTERISK:
					case AT_IMPORT:
					case AT_MEDIA:
					case AT_FONT_FACE:
					case AT_KEYFRAMES:
					case AT_SUPPORTS:
					case AT_RULE:
					case FUNCTION:
					case NUMBER:
					case COLOR_HEX:
					case STRING:
					case HASH:
					case CLASS:
					case PSEUDO_ELEMENT:
					case PSEUDO_CLASS:
					case IDENT:
						{
						setState(70);
						declaration();
						}
						break;
					case JINJA_STMT_START:
						{
						setState(71);
						match(JINJA_STMT_START);
						setState(75);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==JINJA_STMT_CONTENT) {
							{
							{
							setState(72);
							match(JINJA_STMT_CONTENT);
							}
							}
							setState(77);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(78);
						match(JINJA_STMT_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public AnyValueUntilSemicolonContext anyValueUntilSemicolon() {
			return getRuleContext(AnyValueUntilSemicolonContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 12, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			anyValueUntilSemicolon();
			setState(85);
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
	public static class AnyValueUntilBraceContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(CssParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(CssParser.LBRACE, i);
		}
		public List<TerminalNode> JINJA_EXPR_START() { return getTokens(CssParser.JINJA_EXPR_START); }
		public TerminalNode JINJA_EXPR_START(int i) {
			return getToken(CssParser.JINJA_EXPR_START, i);
		}
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(CssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(CssParser.JINJA_STMT_START, i);
		}
		public AnyValueUntilBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyValueUntilBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAnyValueUntilBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAnyValueUntilBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAnyValueUntilBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyValueUntilBraceContext anyValueUntilBrace() throws RecognitionException {
		AnyValueUntilBraceContext _localctx = new AnyValueUntilBraceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_anyValueUntilBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(87);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255014L) != 0) );
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
	public static class AnyValueUntilSemicolonContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(CssParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CssParser.SEMICOLON, i);
		}
		public List<TerminalNode> JINJA_EXPR_START() { return getTokens(CssParser.JINJA_EXPR_START); }
		public TerminalNode JINJA_EXPR_START(int i) {
			return getToken(CssParser.JINJA_EXPR_START, i);
		}
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(CssParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(CssParser.JINJA_STMT_START, i);
		}
		public AnyValueUntilSemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyValueUntilSemicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAnyValueUntilSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAnyValueUntilSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAnyValueUntilSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyValueUntilSemicolonContext anyValueUntilSemicolon() throws RecognitionException {
		AnyValueUntilSemicolonContext _localctx = new AnyValueUntilSemicolonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_anyValueUntilSemicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4120L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023251430L) != 0) );
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
		"\u0004\u0001(b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f"+
		"\u0000\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001"+
		"\u0002\u0005\u00023\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005J\b"+
		"\u0005\n\u0005\f\u0005M\t\u0005\u0001\u0005\u0005\u0005P\b\u0005\n\u0005"+
		"\f\u0005S\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004"+
		"\u0007Y\b\u0007\u000b\u0007\f\u0007Z\u0001\b\u0004\b^\b\b\u000b\b\f\b"+
		"_\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000"+
		"\u0003\u0001\u0000\u001b\u001f\u0002\u0000\u0003\u0004\t\t\u0002\u0000"+
		"\u0003\u0004\f\fe\u0000\u001d\u0001\u0000\u0000\u0000\u0002$\u0001\u0000"+
		"\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000"+
		"\bD\u0001\u0000\u0000\u0000\nQ\u0001\u0000\u0000\u0000\fT\u0001\u0000"+
		"\u0000\u0000\u000eX\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000\u0000"+
		"\u0012\u001c\u0003\u0002\u0001\u0000\u0013\u0017\u0005\u0004\u0000\u0000"+
		"\u0014\u0016\u0005\b\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u001c\u0005\u0007\u0000\u0000\u001b"+
		"\u0012\u0001\u0000\u0000\u0000\u001b\u0013\u0001\u0000\u0000\u0000\u001c"+
		"\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000 !\u0005\u0000\u0000\u0001!\u0001\u0001\u0000"+
		"\u0000\u0000\"%\u0003\u0006\u0003\u0000#%\u0003\u0004\u0002\u0000$\"\u0001"+
		"\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000"+
		"\u0000&\'\u0007\u0000\u0000\u0000\'(\u0003\u000e\u0007\u0000(4\u0005\t"+
		"\u0000\u0000)3\u0003\u0006\u0003\u0000*.\u0005\u0004\u0000\u0000+-\u0005"+
		"\b\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000013\u0005\u0007\u0000\u00002)\u0001\u0000\u0000"+
		"\u00002*\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000078\u0005\n\u0000\u00008>\u0001\u0000\u0000\u00009:\u0005"+
		"\u001a\u0000\u0000:;\u0003\u0010\b\u0000;<\u0005\f\u0000\u0000<>\u0001"+
		"\u0000\u0000\u0000=&\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000"+
		">\u0005\u0001\u0000\u0000\u0000?@\u0003\b\u0004\u0000@A\u0005\t\u0000"+
		"\u0000AB\u0003\n\u0005\u0000BC\u0005\n\u0000\u0000C\u0007\u0001\u0000"+
		"\u0000\u0000DE\u0003\u000e\u0007\u0000E\t\u0001\u0000\u0000\u0000FP\u0003"+
		"\f\u0006\u0000GK\u0005\u0004\u0000\u0000HJ\u0005\b\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NP\u0005\u0007\u0000\u0000OF\u0001\u0000\u0000\u0000OG\u0001\u0000"+
		"\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000R\u000b\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000TU\u0003\u0010\b\u0000UV\u0005\f\u0000\u0000V\r\u0001\u0000\u0000"+
		"\u0000WY\b\u0001\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u000f\u0001"+
		"\u0000\u0000\u0000\\^\b\u0002\u0000\u0000]\\\u0001\u0000\u0000\u0000^"+
		"_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`\u0011\u0001\u0000\u0000\u0000\r\u0017\u001b\u001d$.24=KOQZ_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}