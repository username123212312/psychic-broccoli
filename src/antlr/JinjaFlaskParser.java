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
		WS=1, COMMENT=2, DEF=3, RETURN=4, FROM=5, IMPORT=6, AS=7, AT=8, COLON=9, 
		COMMA=10, ASSIGN=11, LP=12, RP=13, LBRACK=14, RBRACK=15, LBRACE=16, RBRACE=17, 
		NAME=18, NUMBER=19, STRING=20, TRIPLE_DOUBLE_START=21, TRIPLE_SINGLE_START=22, 
		OTHER=23, STYLE_START=24, JINJA_EXPR_START=25, JINJA_STMT_START=26, JINJA_COMMENT_START=27, 
		TRIPLE_DOUBLE_END=28, TRIPLE_SINGLE_END=29, HTML_CONTENT=30, STYLE_END=31, 
		CSS_CONTENT=32, JINJA_EXPR_END=33, JINJA_EXPR_CONTENT=34, JINJA_STMT_END=35, 
		JINJA_STMT_CONTENT=36, JINJA_COMMENT_END=37, JINJA_COMMENT_CONTENT=38;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStmt = 2, RULE_decorator = 3, 
		RULE_assignment = 4, RULE_expr = 5, RULE_constructorCall = 6, RULE_functionCall = 7, 
		RULE_functionDef = 8, RULE_returnStmt = 9, RULE_block = 10, RULE_tripleQuotedTemplate = 11, 
		RULE_templateContent = 12, RULE_jinjaExpr = 13, RULE_jinjaStmt = 14, RULE_jinjaComment = 15, 
		RULE_styleBlock = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStmt", "decorator", "assignment", "expr", 
			"constructorCall", "functionCall", "functionDef", "returnStmt", "block", 
			"tripleQuotedTemplate", "templateContent", "jinjaExpr", "jinjaStmt", 
			"jinjaComment", "styleBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'def'", "'return'", "'from'", "'import'", "'as'", 
			"'@'", "':'", "','", "'='", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			null, null, null, null, null, null, "'<style>'", "'{{'", "'{%'", "'{#'", 
			null, null, null, "'</style>'", null, "'}}'", null, "'%}'", null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "DEF", "RETURN", "FROM", "IMPORT", "AS", "AT", 
			"COLON", "COMMA", "ASSIGN", "LP", "RP", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "NAME", "NUMBER", "STRING", "TRIPLE_DOUBLE_START", "TRIPLE_SINGLE_START", 
			"OTHER", "STYLE_START", "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_COMMENT_START", 
			"TRIPLE_DOUBLE_END", "TRIPLE_SINGLE_END", "HTML_CONTENT", "STYLE_END", 
			"CSS_CONTENT", "JINJA_EXPR_END", "JINJA_EXPR_CONTENT", "JINJA_STMT_END", 
			"JINJA_STMT_CONTENT", "JINJA_COMMENT_END", "JINJA_COMMENT_CONTENT"
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JinjaFlaskParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6553976L) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public TripleQuotedTemplateContext tripleQuotedTemplate() {
			return getRuleContext(TripleQuotedTemplateContext.class,0);
		}
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				importStmt();
				}
				break;
			case TRIPLE_DOUBLE_START:
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				tripleQuotedTemplate();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				decorator();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				assignment();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				functionDef();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				returnStmt();
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
	public static class ImportStmtContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(JinjaFlaskParser.FROM, 0); }
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public TerminalNode IMPORT() { return getToken(JinjaFlaskParser.IMPORT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(JinjaFlaskParser.AS, 0); }
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStmt);
		int _la;
		try {
			int _alt;
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(FROM);
				setState(51);
				match(NAME);
				setState(52);
				match(IMPORT);
				setState(53);
				match(NAME);
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(54);
						match(COMMA);
						setState(55);
						match(NAME);
						}
						} 
					}
					setState(60);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(61);
					match(COMMA);
					}
				}

				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(64);
					match(AS);
					setState(65);
					match(NAME);
					}
				}

				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(IMPORT);
				setState(69);
				match(NAME);
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						match(COMMA);
						setState(71);
						match(NAME);
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(77);
					match(COMMA);
					}
				}

				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(80);
					match(AS);
					setState(81);
					match(NAME);
					}
				}

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
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JinjaFlaskParser.AT, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode STRING() { return getToken(JinjaFlaskParser.STRING, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(AT);
			setState(87);
			match(NAME);
			setState(88);
			match(LP);
			setState(89);
			match(STRING);
			setState(90);
			match(RP);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(JinjaFlaskParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(NAME);
			setState(93);
			match(ASSIGN);
			setState(94);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JinjaFlaskParser.STRING, 0); }
		public TripleQuotedTemplateContext tripleQuotedTemplate() {
			return getRuleContext(TripleQuotedTemplateContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(JinjaFlaskParser.NUMBER, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
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
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				tripleQuotedTemplate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(NAME);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				constructorCall();
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
	public static class ConstructorCallContext extends ParserRuleContext {
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
	 
		public ConstructorCallContext() { }
		public void copyFrom(ConstructorCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorCallExprContext extends ConstructorCallContext {
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public ConstructorCallExprContext(ConstructorCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterConstructorCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitConstructorCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitConstructorCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructorCall);
		int _la;
		try {
			int _alt;
			_localctx = new ConstructorCallExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(NAME);
			setState(105);
			match(LP);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) {
				{
				setState(106);
				expr();
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(107);
						match(COMMA);
						setState(108);
						expr();
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(114);
					match(COMMA);
					}
				}

				}
			}

			setState(119);
			match(RP);
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
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(NAME);
			setState(122);
			match(LP);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) {
				{
				setState(123);
				expr();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(124);
					match(COMMA);
					setState(125);
					expr();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(133);
			match(RP);
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
	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(JinjaFlaskParser.DEF, 0); }
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(DEF);
			setState(136);
			match(NAME);
			setState(137);
			match(LP);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(138);
				match(NAME);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(139);
					match(COMMA);
					setState(140);
					match(NAME);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(148);
			match(RP);
			setState(149);
			match(COLON);
			setState(150);
			block();
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
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JinjaFlaskParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(RETURN);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(153);
				expr();
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(156);
					statement();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	public static class TripleQuotedTemplateContext extends ParserRuleContext {
		public TerminalNode TRIPLE_DOUBLE_START() { return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_START, 0); }
		public TerminalNode TRIPLE_DOUBLE_END() { return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_END, 0); }
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public TerminalNode TRIPLE_SINGLE_START() { return getToken(JinjaFlaskParser.TRIPLE_SINGLE_START, 0); }
		public TerminalNode TRIPLE_SINGLE_END() { return getToken(JinjaFlaskParser.TRIPLE_SINGLE_END, 0); }
		public TripleQuotedTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tripleQuotedTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTripleQuotedTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTripleQuotedTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTripleQuotedTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TripleQuotedTemplateContext tripleQuotedTemplate() throws RecognitionException {
		TripleQuotedTemplateContext _localctx = new TripleQuotedTemplateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tripleQuotedTemplate);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIPLE_DOUBLE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(TRIPLE_DOUBLE_START);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1325400064L) != 0)) {
					{
					{
					setState(163);
					templateContent();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(TRIPLE_DOUBLE_END);
				}
				break;
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(TRIPLE_SINGLE_START);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1325400064L) != 0)) {
					{
					{
					setState(171);
					templateContent();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(TRIPLE_SINGLE_END);
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
	public static class TemplateContentContext extends ParserRuleContext {
		public TerminalNode HTML_CONTENT() { return getToken(JinjaFlaskParser.HTML_CONTENT, 0); }
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public JinjaStmtContext jinjaStmt() {
			return getRuleContext(JinjaStmtContext.class,0);
		}
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public StyleBlockContext styleBlock() {
			return getRuleContext(StyleBlockContext.class,0);
		}
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTemplateContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTemplateContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTemplateContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_templateContent);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_CONTENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(HTML_CONTENT);
				}
				break;
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				jinjaExpr();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				jinjaStmt();
				}
				break;
			case JINJA_COMMENT_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				jinjaComment();
				}
				break;
			case STYLE_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				styleBlock();
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
	public static class JinjaExprContext extends ParserRuleContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(JinjaFlaskParser.JINJA_EXPR_START, 0); }
		public TerminalNode JINJA_EXPR_CONTENT() { return getToken(JinjaFlaskParser.JINJA_EXPR_CONTENT, 0); }
		public TerminalNode JINJA_EXPR_END() { return getToken(JinjaFlaskParser.JINJA_EXPR_END, 0); }
		public JinjaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinjaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinjaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinjaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprContext jinjaExpr() throws RecognitionException {
		JinjaExprContext _localctx = new JinjaExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinjaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(JINJA_EXPR_START);
			setState(188);
			match(JINJA_EXPR_CONTENT);
			setState(189);
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
	public static class JinjaStmtContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public TerminalNode JINJA_STMT_CONTENT() { return getToken(JinjaFlaskParser.JINJA_STMT_CONTENT, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaFlaskParser.JINJA_STMT_END, 0); }
		public JinjaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinjaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinjaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinjaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStmtContext jinjaStmt() throws RecognitionException {
		JinjaStmtContext _localctx = new JinjaStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jinjaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(JINJA_STMT_START);
			setState(192);
			match(JINJA_STMT_CONTENT);
			setState(193);
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
	public static class JinjaCommentContext extends ParserRuleContext {
		public TerminalNode JINJA_COMMENT_START() { return getToken(JinjaFlaskParser.JINJA_COMMENT_START, 0); }
		public TerminalNode JINJA_COMMENT_CONTENT() { return getToken(JinjaFlaskParser.JINJA_COMMENT_CONTENT, 0); }
		public TerminalNode JINJA_COMMENT_END() { return getToken(JinjaFlaskParser.JINJA_COMMENT_END, 0); }
		public JinjaCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinjaComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinjaComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinjaComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCommentContext jinjaComment() throws RecognitionException {
		JinjaCommentContext _localctx = new JinjaCommentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jinjaComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(JINJA_COMMENT_START);
			setState(196);
			match(JINJA_COMMENT_CONTENT);
			setState(197);
			match(JINJA_COMMENT_END);
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
		public TerminalNode STYLE_START() { return getToken(JinjaFlaskParser.STYLE_START, 0); }
		public TerminalNode CSS_CONTENT() { return getToken(JinjaFlaskParser.CSS_CONTENT, 0); }
		public TerminalNode STYLE_END() { return getToken(JinjaFlaskParser.STYLE_END, 0); }
		public StyleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterStyleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitStyleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitStyleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleBlockContext styleBlock() throws RecognitionException {
		StyleBlockContext _localctx = new StyleBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_styleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(STYLE_START);
			setState(200);
			match(CSS_CONTENT);
			setState(201);
			match(STYLE_END);
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
		"\u0004\u0001&\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"9\b\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0003\u0002?\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002L\t\u0002\u0001"+
		"\u0002\u0003\u0002O\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002S\b\u0002"+
		"\u0003\u0002U\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005g\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006n\b\u0006\n\u0006\f\u0006q\t\u0006\u0001\u0006"+
		"\u0003\u0006t\b\u0006\u0003\u0006v\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u007f"+
		"\b\u0007\n\u0007\f\u0007\u0082\t\u0007\u0003\u0007\u0084\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u008e\b\b\n\b\f\b\u0091\t\b\u0003\b\u0093\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0003\t\u009b\b\t\u0001\n\u0005\n\u009e\b\n"+
		"\n\n\f\n\u00a1\t\n\u0001\u000b\u0001\u000b\u0005\u000b\u00a5\b\u000b\n"+
		"\u000b\f\u000b\u00a8\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00ad\b\u000b\n\u000b\f\u000b\u00b0\t\u000b\u0001\u000b\u0003\u000b"+
		"\u00b3\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ba\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0000\u00dc\u0000%\u0001\u0000\u0000\u0000\u00020\u0001"+
		"\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000"+
		"\u0000\b\\\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000\u0000\fh\u0001"+
		"\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010\u0087\u0001\u0000"+
		"\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000"+
		"\u0000\u0000\u0016\u00b2\u0001\u0000\u0000\u0000\u0018\u00b9\u0001\u0000"+
		"\u0000\u0000\u001a\u00bb\u0001\u0000\u0000\u0000\u001c\u00bf\u0001\u0000"+
		"\u0000\u0000\u001e\u00c3\u0001\u0000\u0000\u0000 \u00c7\u0001\u0000\u0000"+
		"\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0000\u0000"+
		"\u0001)\u0001\u0001\u0000\u0000\u0000*1\u0003\u0004\u0002\u0000+1\u0003"+
		"\u0016\u000b\u0000,1\u0003\u0006\u0003\u0000-1\u0003\b\u0004\u0000.1\u0003"+
		"\u0010\b\u0000/1\u0003\u0012\t\u00000*\u0001\u0000\u0000\u00000+\u0001"+
		"\u0000\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000"+
		"\u0000\u000023\u0005\u0005\u0000\u000034\u0005\u0012\u0000\u000045\u0005"+
		"\u0006\u0000\u00005:\u0005\u0012\u0000\u000067\u0005\n\u0000\u000079\u0005"+
		"\u0012\u0000\u000086\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000=?\u0005\n\u0000\u0000>=\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@A\u0005\u0007"+
		"\u0000\u0000AC\u0005\u0012\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CU\u0001\u0000\u0000\u0000DE\u0005\u0006\u0000\u0000"+
		"EJ\u0005\u0012\u0000\u0000FG\u0005\n\u0000\u0000GI\u0005\u0012\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000MO\u0005\n\u0000\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OR\u0001\u0000\u0000\u0000PQ\u0005\u0007\u0000\u0000QS\u0005"+
		"\u0012\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000T2\u0001\u0000\u0000\u0000TD\u0001\u0000\u0000"+
		"\u0000U\u0005\u0001\u0000\u0000\u0000VW\u0005\b\u0000\u0000WX\u0005\u0012"+
		"\u0000\u0000XY\u0005\f\u0000\u0000YZ\u0005\u0014\u0000\u0000Z[\u0005\r"+
		"\u0000\u0000[\u0007\u0001\u0000\u0000\u0000\\]\u0005\u0012\u0000\u0000"+
		"]^\u0005\u000b\u0000\u0000^_\u0003\n\u0005\u0000_\t\u0001\u0000\u0000"+
		"\u0000`g\u0005\u0014\u0000\u0000ag\u0003\u0016\u000b\u0000bg\u0005\u0013"+
		"\u0000\u0000cg\u0005\u0012\u0000\u0000dg\u0003\u000e\u0007\u0000eg\u0003"+
		"\f\u0006\u0000f`\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000\u0000fb\u0001"+
		"\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fe\u0001\u0000\u0000\u0000g\u000b\u0001\u0000\u0000\u0000hi\u0005\u0012"+
		"\u0000\u0000iu\u0005\f\u0000\u0000jo\u0003\n\u0005\u0000kl\u0005\n\u0000"+
		"\u0000ln\u0003\n\u0005\u0000mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0005\n\u0000\u0000sr\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000uj\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0005\r\u0000\u0000x\r\u0001\u0000\u0000\u0000yz\u0005\u0012\u0000"+
		"\u0000z\u0083\u0005\f\u0000\u0000{\u0080\u0003\n\u0005\u0000|}\u0005\n"+
		"\u0000\u0000}\u007f\u0003\n\u0005\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0083{\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\r\u0000\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0003"+
		"\u0000\u0000\u0088\u0089\u0005\u0012\u0000\u0000\u0089\u0092\u0005\f\u0000"+
		"\u0000\u008a\u008f\u0005\u0012\u0000\u0000\u008b\u008c\u0005\n\u0000\u0000"+
		"\u008c\u008e\u0005\u0012\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005\r\u0000\u0000\u0095\u0096\u0005\t\u0000\u0000\u0096"+
		"\u0097\u0003\u0014\n\u0000\u0097\u0011\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0005\u0004\u0000\u0000\u0099\u009b\u0003\n\u0005\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0013\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0003\u0002\u0001\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0015\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a6\u0005"+
		"\u0015\u0000\u0000\u00a3\u00a5\u0003\u0018\f\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00b3\u0005\u001c"+
		"\u0000\u0000\u00aa\u00ae\u0005\u0016\u0000\u0000\u00ab\u00ad\u0003\u0018"+
		"\f\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0005\u001d\u0000\u0000\u00b2\u00a2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00aa\u0001\u0000\u0000\u0000\u00b3\u0017\u0001\u0000\u0000"+
		"\u0000\u00b4\u00ba\u0005\u001e\u0000\u0000\u00b5\u00ba\u0003\u001a\r\u0000"+
		"\u00b6\u00ba\u0003\u001c\u000e\u0000\u00b7\u00ba\u0003\u001e\u000f\u0000"+
		"\u00b8\u00ba\u0003 \u0010\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u0019\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0019\u0000\u0000\u00bc"+
		"\u00bd\u0005\"\u0000\u0000\u00bd\u00be\u0005!\u0000\u0000\u00be\u001b"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u001a\u0000\u0000\u00c0\u00c1"+
		"\u0005$\u0000\u0000\u00c1\u00c2\u0005#\u0000\u0000\u00c2\u001d\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u001b\u0000\u0000\u00c4\u00c5\u0005&\u0000"+
		"\u0000\u00c5\u00c6\u0005%\u0000\u0000\u00c6\u001f\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005\u0018\u0000\u0000\u00c8\u00c9\u0005 \u0000\u0000\u00c9"+
		"\u00ca\u0005\u001f\u0000\u0000\u00ca!\u0001\u0000\u0000\u0000\u0017%0"+
		":>BJNRTfosu\u0080\u0083\u008f\u0092\u009a\u009f\u00a6\u00ae\u00b2\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}