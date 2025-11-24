// Generated from C:/Users/Yousef Razzouk/IdeaProjects/compiler_project/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.2

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
public class JinjaFlaskParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, INDENT=3, DEDENT=4, NEWLINE=5, NAME=6, NUMBER=7, STRING=8, 
		ASSIGN=9, PLUS=10, MINUS=11, STAR=12, SLASH=13, COLON=14, COMMA=15, SEMI=16, 
		LPAREN=17, RPAREN=18, LBRACK=19, RBRACK=20, LBRACE=21, RBRACE=22, IF=23, 
		WHILE=24, FOR=25, IN=26, DEF=27, PY_TRIPLE_START=28, PY_TRIPLE_START2=29, 
		PY_LINE=30, HTML_OPEN=31, HTML_CLOSE=32, HTML_TEXT=33, HTML_ANY=34, CSS_TEXT=35, 
		STYLE_CLOSE=36, CSS_ANY=37, JINJA_VAR_OPEN=38, JINJA_STMT_OPEN=39, JINJA_COMMENT_OPEN=40, 
		JINJA_VAR_CLOSE=41, JINJA_STMT_CLOSE=42, JINJA_COMMENT_CLOSE=43, JINJA_CONTENT=44, 
		JINJA_ANY=45, TEMPLATE_TRIPLE_END1=46, TEMPLATE_TRIPLE_END2=47, TEMPLATE_TEXT=48, 
		TEMPLATE_ANY=49;
	public static final int
		RULE_file = 0, RULE_element = 1, RULE_python_block = 2, RULE_python_stmt = 3, 
		RULE_simple_stmt = 4, RULE_small_stmt = 5, RULE_assign_stmt = 6, RULE_expr_stmt = 7, 
		RULE_compound_stmt = 8, RULE_if_stmt = 9, RULE_while_stmt = 10, RULE_for_stmt = 11, 
		RULE_funcdef = 12, RULE_expr = 13, RULE_term = 14, RULE_factor = 15, RULE_html_block = 16, 
		RULE_html_content = 17, RULE_jinja_unit = 18, RULE_template_block = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "element", "python_block", "python_stmt", "simple_stmt", "small_stmt", 
			"assign_stmt", "expr_stmt", "compound_stmt", "if_stmt", "while_stmt", 
			"for_stmt", "funcdef", "expr", "term", "factor", "html_block", "html_content", 
			"jinja_unit", "template_block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<INDENT>'", "'<DEDENT>'", null, null, null, null, 
			"'='", "'+'", "'-'", "'*'", "'/'", "':'", "','", "';'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'if'", "'while'", "'for'", "'in'", "'def'", 
			null, null, null, null, null, null, null, null, "'</style>'", null, "'{{'", 
			"'{%'", "'{#'", "'}}'", "'%}'", "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "INDENT", "DEDENT", "NEWLINE", "NAME", "NUMBER", 
			"STRING", "ASSIGN", "PLUS", "MINUS", "STAR", "SLASH", "COLON", "COMMA", 
			"SEMI", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "IF", 
			"WHILE", "FOR", "IN", "DEF", "PY_TRIPLE_START", "PY_TRIPLE_START2", "PY_LINE", 
			"HTML_OPEN", "HTML_CLOSE", "HTML_TEXT", "HTML_ANY", "CSS_TEXT", "STYLE_CLOSE", 
			"CSS_ANY", "JINJA_VAR_OPEN", "JINJA_STMT_OPEN", "JINJA_COMMENT_OPEN", 
			"JINJA_VAR_CLOSE", "JINJA_STMT_CLOSE", "JINJA_COMMENT_CLOSE", "JINJA_CONTENT", 
			"JINJA_ANY", "TEMPLATE_TRIPLE_END1", "TEMPLATE_TRIPLE_END2", "TEMPLATE_TEXT", 
			"TEMPLATE_ANY"
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
	public String getGrammarFileName() { return "JinjaFlaskParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JinjaFlaskParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JinjaFlaskParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1927635009536L) != 0)) {
				{
				{
				setState(40);
				element();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
	public static class ElementContext extends ParserRuleContext {
		public Python_blockContext python_block() {
			return getRuleContext(Python_blockContext.class,0);
		}
		public Html_blockContext html_block() {
			return getRuleContext(Html_blockContext.class,0);
		}
		public Jinja_unitContext jinja_unit() {
			return getRuleContext(Jinja_unitContext.class,0);
		}
		public Template_blockContext template_block() {
			return getRuleContext(Template_blockContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PY_LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				python_block();
				}
				break;
			case HTML_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				html_block();
				}
				break;
			case JINJA_VAR_OPEN:
			case JINJA_STMT_OPEN:
			case JINJA_COMMENT_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				jinja_unit();
				}
				break;
			case PY_TRIPLE_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				template_block();
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
	public static class Python_blockContext extends ParserRuleContext {
		public List<TerminalNode> PY_LINE() { return getTokens(JinjaFlaskParser.PY_LINE); }
		public TerminalNode PY_LINE(int i) {
			return getToken(JinjaFlaskParser.PY_LINE, i);
		}
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(JinjaFlaskParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JinjaFlaskParser.DEDENT, 0); }
		public List<Python_stmtContext> python_stmt() {
			return getRuleContexts(Python_stmtContext.class);
		}
		public Python_stmtContext python_stmt(int i) {
			return getRuleContext(Python_stmtContext.class,i);
		}
		public Python_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterPython_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitPython_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitPython_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Python_blockContext python_block() throws RecognitionException {
		Python_blockContext _localctx = new Python_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_python_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54);
					match(PY_LINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(59);
					match(NEWLINE);
					}
				}

				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(62);
					match(INDENT);
					setState(64); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(63);
						python_stmt();
						}
						}
						setState(66); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 193069504L) != 0) );
					setState(68);
					match(DEDENT);
					}
				}

				}
				break;
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
	public static class Python_stmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Python_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterPython_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitPython_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitPython_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Python_stmtContext python_stmt() throws RecognitionException {
		Python_stmtContext _localctx = new Python_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_python_stmt);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case NUMBER:
			case STRING:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				simple_stmt();
				}
				break;
			case IF:
			case WHILE:
			case FOR:
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				compound_stmt();
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
	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JinjaFlaskParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JinjaFlaskParser.SEMI, i);
		}
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simple_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			small_stmt();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(79);
				match(SEMI);
				setState(80);
				small_stmt();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(86);
				match(NEWLINE);
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
	public static class Small_stmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSmall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_small_stmt);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				expr_stmt();
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
	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(JinjaFlaskParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(NAME);
			setState(94);
			match(ASSIGN);
			setState(95);
			expr();
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
	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			expr();
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
	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound_stmt);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				for_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				funcdef();
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
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JinjaFlaskParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(JinjaFlaskParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JinjaFlaskParser.DEDENT, 0); }
		public List<Python_stmtContext> python_stmt() {
			return getRuleContexts(Python_stmtContext.class);
		}
		public Python_stmtContext python_stmt(int i) {
			return getRuleContext(Python_stmtContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(IF);
			setState(106);
			expr();
			setState(107);
			match(COLON);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(108);
				match(NEWLINE);
				setState(109);
				match(INDENT);
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					python_stmt();
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 193069504L) != 0) );
				setState(115);
				match(DEDENT);
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
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JinjaFlaskParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(JinjaFlaskParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JinjaFlaskParser.DEDENT, 0); }
		public List<Python_stmtContext> python_stmt() {
			return getRuleContexts(Python_stmtContext.class);
		}
		public Python_stmtContext python_stmt(int i) {
			return getRuleContext(Python_stmtContext.class,i);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(WHILE);
			setState(120);
			expr();
			setState(121);
			match(COLON);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(122);
				match(NEWLINE);
				setState(123);
				match(INDENT);
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					python_stmt();
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 193069504L) != 0) );
				setState(129);
				match(DEDENT);
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JinjaFlaskParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode IN() { return getToken(JinjaFlaskParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(JinjaFlaskParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JinjaFlaskParser.DEDENT, 0); }
		public List<Python_stmtContext> python_stmt() {
			return getRuleContexts(Python_stmtContext.class);
		}
		public Python_stmtContext python_stmt(int i) {
			return getRuleContext(Python_stmtContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(FOR);
			setState(134);
			match(NAME);
			setState(135);
			match(IN);
			setState(136);
			expr();
			setState(137);
			match(COLON);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(138);
				match(NEWLINE);
				setState(139);
				match(INDENT);
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140);
					python_stmt();
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 193069504L) != 0) );
				setState(145);
				match(DEDENT);
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
	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(JinjaFlaskParser.DEF, 0); }
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public TerminalNode LPAREN() { return getToken(JinjaFlaskParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JinjaFlaskParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(JinjaFlaskParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JinjaFlaskParser.DEDENT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public List<Python_stmtContext> python_stmt() {
			return getRuleContexts(Python_stmtContext.class);
		}
		public Python_stmtContext python_stmt(int i) {
			return getRuleContext(Python_stmtContext.class,i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(DEF);
			setState(150);
			match(NAME);
			setState(151);
			match(LPAREN);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(152);
				match(NAME);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(153);
					match(COMMA);
					setState(154);
					match(NAME);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(162);
			match(RPAREN);
			setState(163);
			match(COLON);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(164);
				match(NEWLINE);
				setState(165);
				match(INDENT);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					python_stmt();
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 193069504L) != 0) );
				setState(171);
				match(DEDENT);
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
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(JinjaFlaskParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JinjaFlaskParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JinjaFlaskParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JinjaFlaskParser.MINUS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			term();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(177);
				term();
				}
				}
				setState(182);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(JinjaFlaskParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(JinjaFlaskParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(JinjaFlaskParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(JinjaFlaskParser.SLASH, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			factor();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH) {
				{
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				factor();
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(JinjaFlaskParser.NUMBER, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(JinjaFlaskParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(JinjaFlaskParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JinjaFlaskParser.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(NUMBER);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(NAME);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(STRING);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(LPAREN);
				setState(195);
				expr();
				setState(196);
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
	public static class Html_blockContext extends ParserRuleContext {
		public TerminalNode HTML_OPEN() { return getToken(JinjaFlaskParser.HTML_OPEN, 0); }
		public List<Html_contentContext> html_content() {
			return getRuleContexts(Html_contentContext.class);
		}
		public Html_contentContext html_content(int i) {
			return getRuleContext(Html_contentContext.class,i);
		}
		public TerminalNode HTML_CLOSE() { return getToken(JinjaFlaskParser.HTML_CLOSE, 0); }
		public Html_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterHtml_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitHtml_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitHtml_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_blockContext html_block() throws RecognitionException {
		Html_blockContext _localctx = new Html_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_html_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(HTML_OPEN);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					html_content();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(207);
				match(HTML_CLOSE);
				}
				break;
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
	public static class Html_contentContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(JinjaFlaskParser.HTML_TEXT, 0); }
		public Jinja_unitContext jinja_unit() {
			return getRuleContext(Jinja_unitContext.class,0);
		}
		public Html_blockContext html_block() {
			return getRuleContext(Html_blockContext.class,0);
		}
		public Html_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterHtml_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitHtml_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitHtml_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_contentContext html_content() throws RecognitionException {
		Html_contentContext _localctx = new Html_contentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_html_content);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(HTML_TEXT);
				}
				break;
			case JINJA_VAR_OPEN:
			case JINJA_STMT_OPEN:
			case JINJA_COMMENT_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				jinja_unit();
				}
				break;
			case HTML_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				html_block();
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
	public static class Jinja_unitContext extends ParserRuleContext {
		public TerminalNode JINJA_VAR_OPEN() { return getToken(JinjaFlaskParser.JINJA_VAR_OPEN, 0); }
		public TerminalNode JINJA_CONTENT() { return getToken(JinjaFlaskParser.JINJA_CONTENT, 0); }
		public TerminalNode JINJA_VAR_CLOSE() { return getToken(JinjaFlaskParser.JINJA_VAR_CLOSE, 0); }
		public TerminalNode JINJA_STMT_OPEN() { return getToken(JinjaFlaskParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(JinjaFlaskParser.JINJA_STMT_CLOSE, 0); }
		public TerminalNode JINJA_COMMENT_OPEN() { return getToken(JinjaFlaskParser.JINJA_COMMENT_OPEN, 0); }
		public TerminalNode JINJA_COMMENT_CLOSE() { return getToken(JinjaFlaskParser.JINJA_COMMENT_CLOSE, 0); }
		public Jinja_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_unitContext jinja_unit() throws RecognitionException {
		Jinja_unitContext _localctx = new Jinja_unitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jinja_unit);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_VAR_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(JINJA_VAR_OPEN);
				setState(216);
				match(JINJA_CONTENT);
				setState(217);
				match(JINJA_VAR_CLOSE);
				}
				break;
			case JINJA_STMT_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(JINJA_STMT_OPEN);
				setState(219);
				match(JINJA_CONTENT);
				setState(220);
				match(JINJA_STMT_CLOSE);
				}
				break;
			case JINJA_COMMENT_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(JINJA_COMMENT_OPEN);
				setState(222);
				match(JINJA_CONTENT);
				setState(223);
				match(JINJA_COMMENT_CLOSE);
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
	public static class Template_blockContext extends ParserRuleContext {
		public List<TerminalNode> PY_TRIPLE_START() { return getTokens(JinjaFlaskParser.PY_TRIPLE_START); }
		public TerminalNode PY_TRIPLE_START(int i) {
			return getToken(JinjaFlaskParser.PY_TRIPLE_START, i);
		}
		public List<TerminalNode> TEMPLATE_TEXT() { return getTokens(JinjaFlaskParser.TEMPLATE_TEXT); }
		public TerminalNode TEMPLATE_TEXT(int i) {
			return getToken(JinjaFlaskParser.TEMPLATE_TEXT, i);
		}
		public Template_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTemplate_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTemplate_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTemplate_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_blockContext template_block() throws RecognitionException {
		Template_blockContext _localctx = new Template_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_template_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(PY_TRIPLE_START);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE_TEXT) {
				{
				{
				setState(227);
				match(TEMPLATE_TEXT);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(233);
				match(PY_TRIPLE_START);
				}
				break;
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
		"\u0004\u00011\u00ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0002\u0004\u00028\b\u0002\u000b"+
		"\u0002\f\u00029\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002A\b\u0002\u000b\u0002\f\u0002B\u0001\u0002\u0001\u0002\u0003"+
		"\u0002G\b\u0002\u0003\u0002I\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003"+
		"M\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004R\b\u0004\n\u0004"+
		"\f\u0004U\t\u0004\u0001\u0004\u0003\u0004X\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\\\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bh\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\tp\b\t\u000b\t"+
		"\f\tq\u0001\t\u0001\t\u0003\tv\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n~\b\n\u000b\n\f\n\u007f\u0001\n\u0001\n\u0003\n\u0084"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u008e\b\u000b\u000b\u000b\f"+
		"\u000b\u008f\u0001\u000b\u0001\u000b\u0003\u000b\u0094\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u009c\b\f\n\f\f\f\u009f"+
		"\t\f\u0003\f\u00a1\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f"+
		"\u00a8\b\f\u000b\f\f\f\u00a9\u0001\f\u0001\f\u0003\f\u00ae\b\f\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u00b3\b\r\n\r\f\r\u00b6\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00bb\b\u000e\n\u000e\f\u000e\u00be\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00c7\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00cb\b\u0010\n\u0010\f\u0010\u00ce\t\u0010\u0001\u0010\u0003\u0010\u00d1"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d6\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e1\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00e5\b\u0013\n\u0013\f\u0013\u00e8\t\u0013\u0001"+
		"\u0013\u0003\u0013\u00eb\b\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0002\u0001\u0000\n\u000b\u0001\u0000\f\r\u00ff\u0000+\u0001"+
		"\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000"+
		"\u0000\u0006L\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\n[\u0001"+
		"\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000"+
		"\u0000\u0010g\u0001\u0000\u0000\u0000\u0012i\u0001\u0000\u0000\u0000\u0014"+
		"w\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000\u0000\u0000\u0018\u0095"+
		"\u0001\u0000\u0000\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c\u00b7"+
		"\u0001\u0000\u0000\u0000\u001e\u00c6\u0001\u0000\u0000\u0000 \u00c8\u0001"+
		"\u0000\u0000\u0000\"\u00d5\u0001\u0000\u0000\u0000$\u00e0\u0001\u0000"+
		"\u0000\u0000&\u00e2\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000"+
		")(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000./\u0005\u0000\u0000\u0001/\u0001\u0001\u0000\u0000\u0000"+
		"05\u0003\u0004\u0002\u000015\u0003 \u0010\u000025\u0003$\u0012\u00003"+
		"5\u0003&\u0013\u000040\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u00005\u0003\u0001\u0000"+
		"\u0000\u000068\u0005\u001e\u0000\u000076\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":H\u0001\u0000\u0000\u0000;=\u0005\u0005\u0000\u0000<;\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=F\u0001\u0000\u0000\u0000>@\u0005\u0003"+
		"\u0000\u0000?A\u0003\u0006\u0003\u0000@?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DE\u0005\u0004\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000F>\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000H<\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0005"+
		"\u0001\u0000\u0000\u0000JM\u0003\b\u0004\u0000KM\u0003\u0010\b\u0000L"+
		"J\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0007\u0001\u0000"+
		"\u0000\u0000NS\u0003\n\u0005\u0000OP\u0005\u0010\u0000\u0000PR\u0003\n"+
		"\u0005\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VX\u0005\u0005\u0000\u0000WV\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000Y\\\u0003\f"+
		"\u0006\u0000Z\\\u0003\u000e\u0007\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005\u0006\u0000"+
		"\u0000^_\u0005\t\u0000\u0000_`\u0003\u001a\r\u0000`\r\u0001\u0000\u0000"+
		"\u0000ab\u0003\u001a\r\u0000b\u000f\u0001\u0000\u0000\u0000ch\u0003\u0012"+
		"\t\u0000dh\u0003\u0014\n\u0000eh\u0003\u0016\u000b\u0000fh\u0003\u0018"+
		"\f\u0000gc\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0011\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0017\u0000\u0000jk\u0003\u001a\r\u0000ku\u0005\u000e\u0000\u0000"+
		"lm\u0005\u0005\u0000\u0000mo\u0005\u0003\u0000\u0000np\u0003\u0006\u0003"+
		"\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0005"+
		"\u0004\u0000\u0000tv\u0001\u0000\u0000\u0000ul\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\u0013\u0001\u0000\u0000\u0000wx\u0005\u0018"+
		"\u0000\u0000xy\u0003\u001a\r\u0000y\u0083\u0005\u000e\u0000\u0000z{\u0005"+
		"\u0005\u0000\u0000{}\u0005\u0003\u0000\u0000|~\u0003\u0006\u0003\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\u0004\u0000\u0000\u0082\u0084\u0001"+
		"\u0000\u0000\u0000\u0083z\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0019"+
		"\u0000\u0000\u0086\u0087\u0005\u0006\u0000\u0000\u0087\u0088\u0005\u001a"+
		"\u0000\u0000\u0088\u0089\u0003\u001a\r\u0000\u0089\u0093\u0005\u000e\u0000"+
		"\u0000\u008a\u008b\u0005\u0005\u0000\u0000\u008b\u008d\u0005\u0003\u0000"+
		"\u0000\u008c\u008e\u0003\u0006\u0003\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0094\u0001\u0000\u0000"+
		"\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001b\u0000"+
		"\u0000\u0096\u0097\u0005\u0006\u0000\u0000\u0097\u00a0\u0005\u0011\u0000"+
		"\u0000\u0098\u009d\u0005\u0006\u0000\u0000\u0099\u009a\u0005\u000f\u0000"+
		"\u0000\u009a\u009c\u0005\u0006\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u0098\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0012\u0000\u0000\u00a3\u00ad\u0005\u000e\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0005\u0000\u0000\u00a5\u00a7\u0005\u0003\u0000"+
		"\u0000\u00a6\u00a8\u0003\u0006\u0003\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b4\u0003\u001c\u000e"+
		"\u0000\u00b0\u00b1\u0007\u0000\u0000\u0000\u00b1\u00b3\u0003\u001c\u000e"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00bc\u0003\u001e\u000f\u0000\u00b8\u00b9\u0007\u0001\u0000"+
		"\u0000\u00b9\u00bb\u0003\u001e\u000f\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u001d\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c7\u0005\u0007\u0000"+
		"\u0000\u00c0\u00c7\u0005\u0006\u0000\u0000\u00c1\u00c7\u0005\b\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0011\u0000\u0000\u00c3\u00c4\u0003\u001a\r\u0000\u00c4"+
		"\u00c5\u0005\u0012\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c7"+
		"\u001f\u0001\u0000\u0000\u0000\u00c8\u00cc\u0005\u001f\u0000\u0000\u00c9"+
		"\u00cb\u0003\"\u0011\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005 \u0000\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1!\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d6\u0005!\u0000\u0000\u00d3\u00d6\u0003$\u0012\u0000"+
		"\u00d4\u00d6\u0003 \u0010\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"#\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005&\u0000\u0000\u00d8\u00d9\u0005"+
		",\u0000\u0000\u00d9\u00e1\u0005)\u0000\u0000\u00da\u00db\u0005\'\u0000"+
		"\u0000\u00db\u00dc\u0005,\u0000\u0000\u00dc\u00e1\u0005*\u0000\u0000\u00dd"+
		"\u00de\u0005(\u0000\u0000\u00de\u00df\u0005,\u0000\u0000\u00df\u00e1\u0005"+
		"+\u0000\u0000\u00e0\u00d7\u0001\u0000\u0000\u0000\u00e0\u00da\u0001\u0000"+
		"\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e1%\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e6\u0005\u001c\u0000\u0000\u00e3\u00e5\u00050\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e9\u00eb\u0005\u001c\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\'\u0001\u0000\u0000\u0000\u001f"+
		"+49<BFHLSW[gqu\u007f\u0083\u008f\u0093\u009d\u00a0\u00a9\u00ad\u00b4\u00bc"+
		"\u00c6\u00cc\u00d0\u00d5\u00e0\u00e6\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}