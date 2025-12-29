// Generated from C:/Users/center/psychic-broccoli/grammars/JinjaParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, JINJA_LVAR=2, JINJA_RVAR=3, JINJA_LBLOCK=4, JINJA_RBLOCK=5, JINJA_LCOMMENT=6, 
		JINJA_RCOMMENT=7, JINJA_COMMENT_CONTENT=8, IF=9, ELIF=10, ELSE=11, ENDIF=12, 
		FOR=13, IN=14, ENDFOR=15, SET=16, RAW=17, ENDRAW=18, OR=19, AND=20, PLUS=21, 
		MINUS=22, TIMES=23, DIVIDE=24, MOD=25, POW=26, EQ=27, NE=28, LE=29, LT=30, 
		GE=31, GT=32, ASSIGN=33, DOT=34, COMMA=35, LPAREN=36, RPAREN=37, LBRACK=38, 
		RBRACK=39, PIPE=40, NUMBER=41, STRING=42, NAME=43, TEXT=44;
	public static final int
		RULE_jinja_content = 0, RULE_jinja_template_block = 1, RULE_jinja_part = 2, 
		RULE_jinja_output = 3, RULE_jinja_statement = 4, RULE_jinja_ifStatement = 5, 
		RULE_jinja_elifBlock = 6, RULE_jinja_elseBlock = 7, RULE_jinja_forStatement = 8, 
		RULE_jinja_setStatement = 9, RULE_jinja_rawStatement = 10, RULE_jinja_rawText = 11, 
		RULE_jinja_expr = 12, RULE_jinja_logicalOr = 13, RULE_jinja_logicalAnd = 14, 
		RULE_jinja_equality = 15, RULE_jinja_comparison = 16, RULE_jinja_addition = 17, 
		RULE_jinja_multiplication = 18, RULE_jinja_unary = 19, RULE_jinja_primary = 20, 
		RULE_jinja_atom = 21, RULE_jinja_trailer = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"jinja_content", "jinja_template_block", "jinja_part", "jinja_output", 
			"jinja_statement", "jinja_ifStatement", "jinja_elifBlock", "jinja_elseBlock", 
			"jinja_forStatement", "jinja_setStatement", "jinja_rawStatement", "jinja_rawText", 
			"jinja_expr", "jinja_logicalOr", "jinja_logicalAnd", "jinja_equality", 
			"jinja_comparison", "jinja_addition", "jinja_multiplication", "jinja_unary", 
			"jinja_primary", "jinja_atom", "jinja_trailer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{{'", "'}}'", "'{%'", "'%}'", "'{#'", "'#}'", null, "'if'", 
			"'elif'", "'else'", "'endif'", "'for'", "'in'", "'endfor'", "'set'", 
			"'raw'", "'endraw'", "'or'", "'and'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'**'", "'=='", "'!='", "'<='", "'<'", "'>='", "'>'", "'='", "'.'", "','", 
			"'('", "')'", "'['", "']'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "JINJA_LVAR", "JINJA_RVAR", "JINJA_LBLOCK", "JINJA_RBLOCK", 
			"JINJA_LCOMMENT", "JINJA_RCOMMENT", "JINJA_COMMENT_CONTENT", "IF", "ELIF", 
			"ELSE", "ENDIF", "FOR", "IN", "ENDFOR", "SET", "RAW", "ENDRAW", "OR", 
			"AND", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "POW", "EQ", "NE", 
			"LE", "LT", "GE", "GT", "ASSIGN", "DOT", "COMMA", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "PIPE", "NUMBER", "STRING", "NAME", "TEXT"
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
	public String getGrammarFileName() { return "JinjaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_contentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JinjaParser.EOF, 0); }
		public List<Jinja_partContext> jinja_part() {
			return getRuleContexts(Jinja_partContext.class);
		}
		public Jinja_partContext jinja_part(int i) {
			return getRuleContext(Jinja_partContext.class,i);
		}
		public Jinja_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_contentContext jinja_content() throws RecognitionException {
		Jinja_contentContext _localctx = new Jinja_contentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jinja_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186044436L) != 0)) {
				{
				{
				setState(46);
				jinja_part();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
	public static class Jinja_template_blockContext extends ParserRuleContext {
		public List<Jinja_partContext> jinja_part() {
			return getRuleContexts(Jinja_partContext.class);
		}
		public Jinja_partContext jinja_part(int i) {
			return getRuleContext(Jinja_partContext.class,i);
		}
		public Jinja_template_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_template_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_template_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_template_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_template_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_template_blockContext jinja_template_block() throws RecognitionException {
		Jinja_template_blockContext _localctx = new Jinja_template_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jinja_template_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					jinja_part();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class Jinja_partContext extends ParserRuleContext {
		public Jinja_outputContext jinja_output() {
			return getRuleContext(Jinja_outputContext.class,0);
		}
		public Jinja_statementContext jinja_statement() {
			return getRuleContext(Jinja_statementContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(JinjaParser.TEXT, 0); }
		public Jinja_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_partContext jinja_part() throws RecognitionException {
		Jinja_partContext _localctx = new Jinja_partContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jinja_part);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_LVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				jinja_output();
				}
				break;
			case JINJA_LBLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				jinja_statement();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(TEXT);
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
	public static class Jinja_outputContext extends ParserRuleContext {
		public TerminalNode JINJA_LVAR() { return getToken(JinjaParser.JINJA_LVAR, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode JINJA_RVAR() { return getToken(JinjaParser.JINJA_RVAR, 0); }
		public Jinja_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_outputContext jinja_output() throws RecognitionException {
		Jinja_outputContext _localctx = new Jinja_outputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jinja_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(JINJA_LVAR);
			setState(66);
			jinja_expr();
			setState(67);
			match(JINJA_RVAR);
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
	public static class Jinja_statementContext extends ParserRuleContext {
		public Jinja_ifStatementContext jinja_ifStatement() {
			return getRuleContext(Jinja_ifStatementContext.class,0);
		}
		public Jinja_forStatementContext jinja_forStatement() {
			return getRuleContext(Jinja_forStatementContext.class,0);
		}
		public Jinja_setStatementContext jinja_setStatement() {
			return getRuleContext(Jinja_setStatementContext.class,0);
		}
		public Jinja_rawStatementContext jinja_rawStatement() {
			return getRuleContext(Jinja_rawStatementContext.class,0);
		}
		public Jinja_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_statementContext jinja_statement() throws RecognitionException {
		Jinja_statementContext _localctx = new Jinja_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_jinja_statement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				jinja_ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				jinja_forStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				jinja_setStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				jinja_rawStatement();
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
	public static class Jinja_ifStatementContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_LBLOCK() { return getTokens(JinjaParser.JINJA_LBLOCK); }
		public TerminalNode JINJA_LBLOCK(int i) {
			return getToken(JinjaParser.JINJA_LBLOCK, i);
		}
		public TerminalNode IF() { return getToken(JinjaParser.IF, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public List<TerminalNode> JINJA_RBLOCK() { return getTokens(JinjaParser.JINJA_RBLOCK); }
		public TerminalNode JINJA_RBLOCK(int i) {
			return getToken(JinjaParser.JINJA_RBLOCK, i);
		}
		public Jinja_template_blockContext jinja_template_block() {
			return getRuleContext(Jinja_template_blockContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(JinjaParser.ENDIF, 0); }
		public List<Jinja_elifBlockContext> jinja_elifBlock() {
			return getRuleContexts(Jinja_elifBlockContext.class);
		}
		public Jinja_elifBlockContext jinja_elifBlock(int i) {
			return getRuleContext(Jinja_elifBlockContext.class,i);
		}
		public Jinja_elseBlockContext jinja_elseBlock() {
			return getRuleContext(Jinja_elseBlockContext.class,0);
		}
		public Jinja_ifStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_ifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_ifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_ifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_ifStatementContext jinja_ifStatement() throws RecognitionException {
		Jinja_ifStatementContext _localctx = new Jinja_ifStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jinja_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(JINJA_LBLOCK);
			setState(76);
			match(IF);
			setState(77);
			jinja_expr();
			setState(78);
			match(JINJA_RBLOCK);
			setState(79);
			jinja_template_block();
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					jinja_elifBlock();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(86);
				jinja_elseBlock();
				}
				break;
			}
			setState(89);
			match(JINJA_LBLOCK);
			setState(90);
			match(ENDIF);
			setState(91);
			match(JINJA_RBLOCK);
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
	public static class Jinja_elifBlockContext extends ParserRuleContext {
		public TerminalNode JINJA_LBLOCK() { return getToken(JinjaParser.JINJA_LBLOCK, 0); }
		public TerminalNode ELIF() { return getToken(JinjaParser.ELIF, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode JINJA_RBLOCK() { return getToken(JinjaParser.JINJA_RBLOCK, 0); }
		public Jinja_template_blockContext jinja_template_block() {
			return getRuleContext(Jinja_template_blockContext.class,0);
		}
		public Jinja_elifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_elifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_elifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_elifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_elifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_elifBlockContext jinja_elifBlock() throws RecognitionException {
		Jinja_elifBlockContext _localctx = new Jinja_elifBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jinja_elifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(JINJA_LBLOCK);
			setState(94);
			match(ELIF);
			setState(95);
			jinja_expr();
			setState(96);
			match(JINJA_RBLOCK);
			setState(97);
			jinja_template_block();
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
	public static class Jinja_elseBlockContext extends ParserRuleContext {
		public TerminalNode JINJA_LBLOCK() { return getToken(JinjaParser.JINJA_LBLOCK, 0); }
		public TerminalNode ELSE() { return getToken(JinjaParser.ELSE, 0); }
		public TerminalNode JINJA_RBLOCK() { return getToken(JinjaParser.JINJA_RBLOCK, 0); }
		public Jinja_template_blockContext jinja_template_block() {
			return getRuleContext(Jinja_template_blockContext.class,0);
		}
		public Jinja_elseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_elseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_elseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_elseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_elseBlockContext jinja_elseBlock() throws RecognitionException {
		Jinja_elseBlockContext _localctx = new Jinja_elseBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jinja_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(JINJA_LBLOCK);
			setState(100);
			match(ELSE);
			setState(101);
			match(JINJA_RBLOCK);
			setState(102);
			jinja_template_block();
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
	public static class Jinja_forStatementContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_LBLOCK() { return getTokens(JinjaParser.JINJA_LBLOCK); }
		public TerminalNode JINJA_LBLOCK(int i) {
			return getToken(JinjaParser.JINJA_LBLOCK, i);
		}
		public TerminalNode FOR() { return getToken(JinjaParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(JinjaParser.NAME, 0); }
		public TerminalNode IN() { return getToken(JinjaParser.IN, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public List<TerminalNode> JINJA_RBLOCK() { return getTokens(JinjaParser.JINJA_RBLOCK); }
		public TerminalNode JINJA_RBLOCK(int i) {
			return getToken(JinjaParser.JINJA_RBLOCK, i);
		}
		public Jinja_template_blockContext jinja_template_block() {
			return getRuleContext(Jinja_template_blockContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(JinjaParser.ENDFOR, 0); }
		public Jinja_forStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_forStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_forStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_forStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_forStatementContext jinja_forStatement() throws RecognitionException {
		Jinja_forStatementContext _localctx = new Jinja_forStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinja_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(JINJA_LBLOCK);
			setState(105);
			match(FOR);
			setState(106);
			match(NAME);
			setState(107);
			match(IN);
			setState(108);
			jinja_expr();
			setState(109);
			match(JINJA_RBLOCK);
			setState(110);
			jinja_template_block();
			setState(111);
			match(JINJA_LBLOCK);
			setState(112);
			match(ENDFOR);
			setState(113);
			match(JINJA_RBLOCK);
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
	public static class Jinja_setStatementContext extends ParserRuleContext {
		public TerminalNode JINJA_LBLOCK() { return getToken(JinjaParser.JINJA_LBLOCK, 0); }
		public TerminalNode SET() { return getToken(JinjaParser.SET, 0); }
		public TerminalNode NAME() { return getToken(JinjaParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(JinjaParser.ASSIGN, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode JINJA_RBLOCK() { return getToken(JinjaParser.JINJA_RBLOCK, 0); }
		public Jinja_setStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_setStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_setStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_setStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_setStatementContext jinja_setStatement() throws RecognitionException {
		Jinja_setStatementContext _localctx = new Jinja_setStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jinja_setStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(JINJA_LBLOCK);
			setState(116);
			match(SET);
			setState(117);
			match(NAME);
			setState(118);
			match(ASSIGN);
			setState(119);
			jinja_expr();
			setState(120);
			match(JINJA_RBLOCK);
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
	public static class Jinja_rawStatementContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_LBLOCK() { return getTokens(JinjaParser.JINJA_LBLOCK); }
		public TerminalNode JINJA_LBLOCK(int i) {
			return getToken(JinjaParser.JINJA_LBLOCK, i);
		}
		public TerminalNode RAW() { return getToken(JinjaParser.RAW, 0); }
		public List<TerminalNode> JINJA_RBLOCK() { return getTokens(JinjaParser.JINJA_RBLOCK); }
		public TerminalNode JINJA_RBLOCK(int i) {
			return getToken(JinjaParser.JINJA_RBLOCK, i);
		}
		public Jinja_rawTextContext jinja_rawText() {
			return getRuleContext(Jinja_rawTextContext.class,0);
		}
		public TerminalNode ENDRAW() { return getToken(JinjaParser.ENDRAW, 0); }
		public Jinja_rawStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_rawStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_rawStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_rawStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_rawStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_rawStatementContext jinja_rawStatement() throws RecognitionException {
		Jinja_rawStatementContext _localctx = new Jinja_rawStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinja_rawStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(JINJA_LBLOCK);
			setState(123);
			match(RAW);
			setState(124);
			match(JINJA_RBLOCK);
			setState(125);
			jinja_rawText();
			setState(126);
			match(JINJA_LBLOCK);
			setState(127);
			match(ENDRAW);
			setState(128);
			match(JINJA_RBLOCK);
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
	public static class Jinja_rawTextContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(JinjaParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(JinjaParser.TEXT, i);
		}
		public Jinja_rawTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_rawText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_rawText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_rawText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_rawText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_rawTextContext jinja_rawText() throws RecognitionException {
		Jinja_rawTextContext _localctx = new Jinja_rawTextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinja_rawText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(TEXT);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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
	public static class Jinja_exprContext extends ParserRuleContext {
		public Jinja_logicalOrContext jinja_logicalOr() {
			return getRuleContext(Jinja_logicalOrContext.class,0);
		}
		public Jinja_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_exprContext jinja_expr() throws RecognitionException {
		Jinja_exprContext _localctx = new Jinja_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinja_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			jinja_logicalOr();
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
	public static class Jinja_logicalOrContext extends ParserRuleContext {
		public List<Jinja_logicalAndContext> jinja_logicalAnd() {
			return getRuleContexts(Jinja_logicalAndContext.class);
		}
		public Jinja_logicalAndContext jinja_logicalAnd(int i) {
			return getRuleContext(Jinja_logicalAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JinjaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JinjaParser.OR, i);
		}
		public Jinja_logicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_logicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_logicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_logicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_logicalOrContext jinja_logicalOr() throws RecognitionException {
		Jinja_logicalOrContext _localctx = new Jinja_logicalOrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinja_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			jinja_logicalAnd();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(138);
				match(OR);
				setState(139);
				jinja_logicalAnd();
				}
				}
				setState(144);
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
	public static class Jinja_logicalAndContext extends ParserRuleContext {
		public List<Jinja_equalityContext> jinja_equality() {
			return getRuleContexts(Jinja_equalityContext.class);
		}
		public Jinja_equalityContext jinja_equality(int i) {
			return getRuleContext(Jinja_equalityContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JinjaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JinjaParser.AND, i);
		}
		public Jinja_logicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_logicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_logicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_logicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_logicalAndContext jinja_logicalAnd() throws RecognitionException {
		Jinja_logicalAndContext _localctx = new Jinja_logicalAndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jinja_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			jinja_equality();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(146);
				match(AND);
				setState(147);
				jinja_equality();
				}
				}
				setState(152);
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
	public static class Jinja_equalityContext extends ParserRuleContext {
		public List<Jinja_comparisonContext> jinja_comparison() {
			return getRuleContexts(Jinja_comparisonContext.class);
		}
		public Jinja_comparisonContext jinja_comparison(int i) {
			return getRuleContext(Jinja_comparisonContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(JinjaParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(JinjaParser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(JinjaParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(JinjaParser.NE, i);
		}
		public Jinja_equalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_equality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_equality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_equality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_equalityContext jinja_equality() throws RecognitionException {
		Jinja_equalityContext _localctx = new Jinja_equalityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jinja_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			jinja_comparison();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NE) {
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				jinja_comparison();
				}
				}
				setState(160);
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
	public static class Jinja_comparisonContext extends ParserRuleContext {
		public List<Jinja_additionContext> jinja_addition() {
			return getRuleContexts(Jinja_additionContext.class);
		}
		public Jinja_additionContext jinja_addition(int i) {
			return getRuleContext(Jinja_additionContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(JinjaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JinjaParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(JinjaParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(JinjaParser.LE, i);
		}
		public List<TerminalNode> GT() { return getTokens(JinjaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JinjaParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(JinjaParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(JinjaParser.GE, i);
		}
		public Jinja_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_comparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_comparisonContext jinja_comparison() throws RecognitionException {
		Jinja_comparisonContext _localctx = new Jinja_comparisonContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinja_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			jinja_addition();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				jinja_addition();
				}
				}
				setState(168);
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
	public static class Jinja_additionContext extends ParserRuleContext {
		public List<Jinja_multiplicationContext> jinja_multiplication() {
			return getRuleContexts(Jinja_multiplicationContext.class);
		}
		public Jinja_multiplicationContext jinja_multiplication(int i) {
			return getRuleContext(Jinja_multiplicationContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(JinjaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JinjaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JinjaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JinjaParser.MINUS, i);
		}
		public Jinja_additionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_addition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_addition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_additionContext jinja_addition() throws RecognitionException {
		Jinja_additionContext _localctx = new Jinja_additionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinja_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			jinja_multiplication();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				jinja_multiplication();
				}
				}
				setState(176);
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
	public static class Jinja_multiplicationContext extends ParserRuleContext {
		public List<Jinja_unaryContext> jinja_unary() {
			return getRuleContexts(Jinja_unaryContext.class);
		}
		public Jinja_unaryContext jinja_unary(int i) {
			return getRuleContext(Jinja_unaryContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(JinjaParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(JinjaParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(JinjaParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(JinjaParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(JinjaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(JinjaParser.MOD, i);
		}
		public Jinja_multiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_multiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_multiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_multiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_multiplicationContext jinja_multiplication() throws RecognitionException {
		Jinja_multiplicationContext _localctx = new Jinja_multiplicationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jinja_multiplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			jinja_unary();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				{
				setState(178);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				jinja_unary();
				}
				}
				setState(184);
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
	public static class Jinja_unaryContext extends ParserRuleContext {
		public Jinja_unaryContext jinja_unary() {
			return getRuleContext(Jinja_unaryContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(JinjaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JinjaParser.MINUS, 0); }
		public Jinja_primaryContext jinja_primary() {
			return getRuleContext(Jinja_primaryContext.class,0);
		}
		public Jinja_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_unaryContext jinja_unary() throws RecognitionException {
		Jinja_unaryContext _localctx = new Jinja_unaryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jinja_unary);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				jinja_unary();
				}
				break;
			case LPAREN:
			case NUMBER:
			case STRING:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				jinja_primary();
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
	public static class Jinja_primaryContext extends ParserRuleContext {
		public Jinja_atomContext jinja_atom() {
			return getRuleContext(Jinja_atomContext.class,0);
		}
		public List<Jinja_trailerContext> jinja_trailer() {
			return getRuleContexts(Jinja_trailerContext.class);
		}
		public Jinja_trailerContext jinja_trailer(int i) {
			return getRuleContext(Jinja_trailerContext.class,i);
		}
		public Jinja_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_primaryContext jinja_primary() throws RecognitionException {
		Jinja_primaryContext _localctx = new Jinja_primaryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jinja_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			jinja_atom();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 360777252864L) != 0)) {
				{
				{
				setState(191);
				jinja_trailer();
				}
				}
				setState(196);
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
	public static class Jinja_atomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JinjaParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(JinjaParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(JinjaParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(JinjaParser.LPAREN, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JinjaParser.RPAREN, 0); }
		public Jinja_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_atomContext jinja_atom() throws RecognitionException {
		Jinja_atomContext _localctx = new Jinja_atomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jinja_atom);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(NAME);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(STRING);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(LPAREN);
				setState(201);
				jinja_expr();
				setState(202);
				match(RPAREN);
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
	public static class Jinja_trailerContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JinjaParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(JinjaParser.NAME, 0); }
		public TerminalNode LBRACK() { return getToken(JinjaParser.LBRACK, 0); }
		public List<Jinja_exprContext> jinja_expr() {
			return getRuleContexts(Jinja_exprContext.class);
		}
		public Jinja_exprContext jinja_expr(int i) {
			return getRuleContext(Jinja_exprContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(JinjaParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(JinjaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JinjaParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JinjaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaParser.COMMA, i);
		}
		public Jinja_trailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinja_trailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinja_trailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinja_trailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_trailerContext jinja_trailer() throws RecognitionException {
		Jinja_trailerContext _localctx = new Jinja_trailerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jinja_trailer);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(DOT);
				setState(207);
				match(NAME);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(LBRACK);
				setState(209);
				jinja_expr();
				setState(210);
				match(RBRACK);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(LPAREN);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15461888557056L) != 0)) {
					{
					setState(213);
					jinja_expr();
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(214);
						match(COMMA);
						setState(215);
						jinja_expr();
						}
						}
						setState(220);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(223);
				match(RPAREN);
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
		"\u0004\u0001,\u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u00018\b\u0001\n\u0001"+
		"\f\u0001;\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002@\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005R\b\u0005"+
		"\n\u0005\f\u0005U\t\u0005\u0001\u0005\u0003\u0005X\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u0084\b\u000b\u000b\u000b\f"+
		"\u000b\u0085\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u008d\b\r"+
		"\n\r\f\r\u0090\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0095"+
		"\b\u000e\n\u000e\f\u000e\u0098\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u009d\b\u000f\n\u000f\f\u000f\u00a0\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00a5\b\u0010\n\u0010\f\u0010\u00a8\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00ad\b\u0011\n\u0011"+
		"\f\u0011\u00b0\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00b5\b\u0012\n\u0012\f\u0012\u00b8\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00bd\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u00c1"+
		"\b\u0014\n\u0014\f\u0014\u00c4\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00cd\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00d9\b\u0016"+
		"\n\u0016\f\u0016\u00dc\t\u0016\u0003\u0016\u00de\b\u0016\u0001\u0016\u0003"+
		"\u0016\u00e1\b\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0004\u0001\u0000\u001b\u001c\u0001\u0000\u001d \u0001\u0000\u0015\u0016"+
		"\u0001\u0000\u0017\u0019\u00e4\u00001\u0001\u0000\u0000\u0000\u00029\u0001"+
		"\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000"+
		"\u0000\bI\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\f]\u0001"+
		"\u0000\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000"+
		"\u0000\u0012s\u0001\u0000\u0000\u0000\u0014z\u0001\u0000\u0000\u0000\u0016"+
		"\u0083\u0001\u0000\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a"+
		"\u0089\u0001\u0000\u0000\u0000\u001c\u0091\u0001\u0000\u0000\u0000\u001e"+
		"\u0099\u0001\u0000\u0000\u0000 \u00a1\u0001\u0000\u0000\u0000\"\u00a9"+
		"\u0001\u0000\u0000\u0000$\u00b1\u0001\u0000\u0000\u0000&\u00bc\u0001\u0000"+
		"\u0000\u0000(\u00be\u0001\u0000\u0000\u0000*\u00cc\u0001\u0000\u0000\u0000"+
		",\u00e0\u0001\u0000\u0000\u0000.0\u0003\u0004\u0002\u0000/.\u0001\u0000"+
		"\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"45\u0005\u0000\u0000\u00015\u0001\u0001\u0000\u0000\u000068\u0003\u0004"+
		"\u0002\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0003\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000<@\u0003\u0006\u0003\u0000=@\u0003\b\u0004"+
		"\u0000>@\u0005,\u0000\u0000?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0005"+
		"\u0002\u0000\u0000BC\u0003\u0018\f\u0000CD\u0005\u0003\u0000\u0000D\u0007"+
		"\u0001\u0000\u0000\u0000EJ\u0003\n\u0005\u0000FJ\u0003\u0010\b\u0000G"+
		"J\u0003\u0012\t\u0000HJ\u0003\u0014\n\u0000IE\u0001\u0000\u0000\u0000"+
		"IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000"+
		"\u0000J\t\u0001\u0000\u0000\u0000KL\u0005\u0004\u0000\u0000LM\u0005\t"+
		"\u0000\u0000MN\u0003\u0018\f\u0000NO\u0005\u0005\u0000\u0000OS\u0003\u0002"+
		"\u0001\u0000PR\u0003\f\u0006\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0003\u000e\u0007\u0000"+
		"WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0005\u0004\u0000\u0000Z[\u0005\f\u0000\u0000[\\\u0005\u0005"+
		"\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005\u0004\u0000\u0000"+
		"^_\u0005\n\u0000\u0000_`\u0003\u0018\f\u0000`a\u0005\u0005\u0000\u0000"+
		"ab\u0003\u0002\u0001\u0000b\r\u0001\u0000\u0000\u0000cd\u0005\u0004\u0000"+
		"\u0000de\u0005\u000b\u0000\u0000ef\u0005\u0005\u0000\u0000fg\u0003\u0002"+
		"\u0001\u0000g\u000f\u0001\u0000\u0000\u0000hi\u0005\u0004\u0000\u0000"+
		"ij\u0005\r\u0000\u0000jk\u0005+\u0000\u0000kl\u0005\u000e\u0000\u0000"+
		"lm\u0003\u0018\f\u0000mn\u0005\u0005\u0000\u0000no\u0003\u0002\u0001\u0000"+
		"op\u0005\u0004\u0000\u0000pq\u0005\u000f\u0000\u0000qr\u0005\u0005\u0000"+
		"\u0000r\u0011\u0001\u0000\u0000\u0000st\u0005\u0004\u0000\u0000tu\u0005"+
		"\u0010\u0000\u0000uv\u0005+\u0000\u0000vw\u0005!\u0000\u0000wx\u0003\u0018"+
		"\f\u0000xy\u0005\u0005\u0000\u0000y\u0013\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0004\u0000\u0000{|\u0005\u0011\u0000\u0000|}\u0005\u0005\u0000\u0000"+
		"}~\u0003\u0016\u000b\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u0080"+
		"\u0005\u0012\u0000\u0000\u0080\u0081\u0005\u0005\u0000\u0000\u0081\u0015"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0005,\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0017\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0003\u001a\r\u0000\u0088\u0019\u0001\u0000"+
		"\u0000\u0000\u0089\u008e\u0003\u001c\u000e\u0000\u008a\u008b\u0005\u0013"+
		"\u0000\u0000\u008b\u008d\u0003\u001c\u000e\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u001b\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0096\u0003\u001e"+
		"\u000f\u0000\u0092\u0093\u0005\u0014\u0000\u0000\u0093\u0095\u0003\u001e"+
		"\u000f\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u001d\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u009e\u0003 \u0010\u0000\u009a\u009b\u0007\u0000\u0000"+
		"\u0000\u009b\u009d\u0003 \u0010\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u001f\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a6\u0003\"\u0011\u0000\u00a2"+
		"\u00a3\u0007\u0001\u0000\u0000\u00a3\u00a5\u0003\"\u0011\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7!\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ae\u0003"+
		"$\u0012\u0000\u00aa\u00ab\u0007\u0002\u0000\u0000\u00ab\u00ad\u0003$\u0012"+
		"\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af#\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b6\u0003&\u0013\u0000\u00b2\u00b3\u0007\u0003\u0000\u0000\u00b3"+
		"\u00b5\u0003&\u0013\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7%\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0007\u0002\u0000\u0000\u00ba\u00bd\u0003"+
		"&\u0013\u0000\u00bb\u00bd\u0003(\u0014\u0000\u00bc\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\'\u0001\u0000\u0000\u0000"+
		"\u00be\u00c2\u0003*\u0015\u0000\u00bf\u00c1\u0003,\u0016\u0000\u00c0\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3)\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00cd\u0005"+
		"+\u0000\u0000\u00c6\u00cd\u0005)\u0000\u0000\u00c7\u00cd\u0005*\u0000"+
		"\u0000\u00c8\u00c9\u0005$\u0000\u0000\u00c9\u00ca\u0003\u0018\f\u0000"+
		"\u00ca\u00cb\u0005%\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc"+
		"\u00c5\u0001\u0000\u0000\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cd"+
		"+\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\"\u0000\u0000\u00cf\u00e1"+
		"\u0005+\u0000\u0000\u00d0\u00d1\u0005&\u0000\u0000\u00d1\u00d2\u0003\u0018"+
		"\f\u0000\u00d2\u00d3\u0005\'\u0000\u0000\u00d3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00dd\u0005$\u0000\u0000\u00d5\u00da\u0003\u0018\f\u0000"+
		"\u00d6\u00d7\u0005#\u0000\u0000\u00d7\u00d9\u0003\u0018\f\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d5\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0005%\u0000\u0000\u00e0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00e0\u00d0\u0001\u0000\u0000\u0000\u00e0\u00d4"+
		"\u0001\u0000\u0000\u0000\u00e1-\u0001\u0000\u0000\u0000\u001319?ISW\u0085"+
		"\u008e\u0096\u009e\u00a6\u00ae\u00b6\u00bc\u00c2\u00cc\u00da\u00dd\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}