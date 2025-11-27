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
		DOT=18, NAME=19, NUMBER=20, STRING=21, TRIPLE_DOUBLE_START=22, TRIPLE_SINGLE_START=23, 
		OTHER=24, STYLE_START=25, JINJA_EXPR_START=26, JINJA_STMT_START=27, JINJA_COMMENT_START=28, 
		TRIPLE_DOUBLE_END=29, TRIPLE_SINGLE_END=30, HTML_CONTENT=31, STYLE_END=32, 
		CSS_CONTENT=33, JINJA_EXPR_END=34, JINJA_STMT_END=35, JINJA_COMMENT_END=36, 
		JINJA_EXPR_CONTENT=37, JINJA_STMT_CONTENT=38, JINJA_COMMENT_CONTENT=39;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStmt = 2, RULE_decorator = 3, 
		RULE_assignment = 4, RULE_returnStmt = 5, RULE_functionDef = 6, RULE_block = 7, 
		RULE_expr = 8, RULE_constructorCall = 9, RULE_functionCall = 10, RULE_attributeAccess = 11, 
		RULE_listLiteral = 12, RULE_dictLiteral = 13, RULE_tripleQuotedTemplate = 14, 
		RULE_templateContent = 15, RULE_jinjaExpr = 16, RULE_jinjaStmt = 17, RULE_jinjaComment = 18, 
		RULE_styleBlock = 19, RULE_routeArgs = 20, RULE_routeOptions = 21, RULE_arrayOfStrings = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStmt", "decorator", "assignment", "returnStmt", 
			"functionDef", "block", "expr", "constructorCall", "functionCall", "attributeAccess", 
			"listLiteral", "dictLiteral", "tripleQuotedTemplate", "templateContent", 
			"jinjaExpr", "jinjaStmt", "jinjaComment", "styleBlock", "routeArgs", 
			"routeOptions", "arrayOfStrings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'def'", "'return'", "'from'", "'import'", "'as'", 
			"'@'", "':'", "','", "'='", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'.'", null, null, null, null, null, null, "'<style>'", "'{{'", "'{%'", 
			"'{#'", null, null, null, "'</style>'", null, "'}}'", "'%}'", "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "DEF", "RETURN", "FROM", "IMPORT", "AS", "AT", 
			"COLON", "COMMA", "ASSIGN", "LP", "RP", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "DOT", "NAME", "NUMBER", "STRING", "TRIPLE_DOUBLE_START", "TRIPLE_SINGLE_START", 
			"OTHER", "STYLE_START", "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_COMMENT_START", 
			"TRIPLE_DOUBLE_END", "TRIPLE_SINGLE_END", "HTML_CONTENT", "STYLE_END", 
			"CSS_CONTENT", "JINJA_EXPR_END", "JINJA_STMT_END", "JINJA_COMMENT_END", 
			"JINJA_EXPR_CONTENT", "JINJA_STMT_CONTENT", "JINJA_COMMENT_CONTENT"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13107576L) != 0)) {
				{
				{
				setState(46);
				statement();
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				importStmt();
				}
				break;
			case TRIPLE_DOUBLE_START:
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				tripleQuotedTemplate();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				decorator();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				assignment();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				functionDef();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(FROM);
				setState(63);
				match(NAME);
				setState(64);
				match(IMPORT);
				setState(65);
				match(NAME);
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(66);
						match(COMMA);
						setState(67);
						match(NAME);
						}
						} 
					}
					setState(72);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(73);
					match(COMMA);
					}
				}

				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(76);
					match(AS);
					setState(77);
					match(NAME);
					}
				}

				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(IMPORT);
				setState(81);
				match(NAME);
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(82);
						match(COMMA);
						setState(83);
						match(NAME);
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(89);
					match(COMMA);
					}
				}

				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(92);
					match(AS);
					setState(93);
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
		public AttributeAccessContext attributeAccess() {
			return getRuleContext(AttributeAccessContext.class,0);
		}
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public RouteArgsContext routeArgs() {
			return getRuleContext(RouteArgsContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(AT);
			setState(99);
			attributeAccess();
			setState(100);
			match(LP);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(101);
				routeArgs();
				}
			}

			setState(104);
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
			setState(106);
			match(NAME);
			setState(107);
			match(ASSIGN);
			setState(108);
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
		enterRule(_localctx, 10, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(RETURN);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(111);
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
		enterRule(_localctx, 12, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(DEF);
			setState(115);
			match(NAME);
			setState(116);
			match(LP);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(117);
				match(NAME);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					match(NAME);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(127);
			match(RP);
			setState(128);
			match(COLON);
			setState(129);
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
		enterRule(_localctx, 14, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					statement();
					}
					} 
				}
				setState(136);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JinjaFlaskParser.STRING, 0); }
		public TripleQuotedTemplateContext tripleQuotedTemplate() {
			return getRuleContext(TripleQuotedTemplateContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(JinjaFlaskParser.NUMBER, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public AttributeAccessContext attributeAccess() {
			return getRuleContext(AttributeAccessContext.class,0);
		}
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
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
		enterRule(_localctx, 16, RULE_expr);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				tripleQuotedTemplate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				constructorCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				attributeAccess();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				dictLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				listLiteral();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
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
		enterRule(_localctx, 18, RULE_constructorCall);
		int _la;
		try {
			int _alt;
			_localctx = new ConstructorCallExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(NAME);
			setState(149);
			match(LP);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16334848L) != 0)) {
				{
				setState(150);
				expr();
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						match(COMMA);
						setState(152);
						expr();
						}
						} 
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(158);
					match(COMMA);
					}
				}

				}
			}

			setState(163);
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
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(JinjaFlaskParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(JinjaFlaskParser.ASSIGN, i);
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
		enterRule(_localctx, 20, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(NAME);
			setState(166);
			match(LP);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16334848L) != 0)) {
				{
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(167);
					expr();
					}
					break;
				case 2:
					{
					setState(168);
					match(NAME);
					setState(169);
					match(ASSIGN);
					setState(170);
					expr();
					}
					break;
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(173);
					match(COMMA);
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(174);
						expr();
						}
						break;
					case 2:
						{
						setState(175);
						match(NAME);
						setState(176);
						match(ASSIGN);
						setState(177);
						expr();
						}
						break;
					}
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(187);
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
	public static class AttributeAccessContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JinjaFlaskParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JinjaFlaskParser.DOT, i);
		}
		public AttributeAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAttributeAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAttributeAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAttributeAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeAccessContext attributeAccess() throws RecognitionException {
		AttributeAccessContext _localctx = new AttributeAccessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(NAME);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				match(DOT);
				setState(191);
				match(NAME);
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
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
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JinjaFlaskParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JinjaFlaskParser.RBRACK, 0); }
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
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(LBRACK);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16334848L) != 0)) {
				{
				setState(197);
				expr();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198);
					match(COMMA);
					setState(199);
					expr();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(207);
			match(RBRACK);
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
	public static class DictLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JinjaFlaskParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JinjaFlaskParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(JinjaFlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JinjaFlaskParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dictLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(LBRACE);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16334848L) != 0)) {
				{
				setState(210);
				expr();
				setState(211);
				match(COLON);
				setState(212);
				expr();
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(213);
					match(COMMA);
					setState(214);
					expr();
					setState(215);
					match(COLON);
					setState(216);
					expr();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(225);
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
		enterRule(_localctx, 28, RULE_tripleQuotedTemplate);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIPLE_DOUBLE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(TRIPLE_DOUBLE_START);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2650800128L) != 0)) {
					{
					{
					setState(228);
					templateContent();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(TRIPLE_DOUBLE_END);
				}
				break;
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(TRIPLE_SINGLE_START);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2650800128L) != 0)) {
					{
					{
					setState(236);
					templateContent();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
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
		enterRule(_localctx, 30, RULE_templateContent);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_CONTENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(HTML_CONTENT);
				}
				break;
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				jinjaExpr();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				jinjaStmt();
				}
				break;
			case JINJA_COMMENT_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				jinjaComment();
				}
				break;
			case STYLE_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
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
		public TerminalNode JINJA_EXPR_END() { return getToken(JinjaFlaskParser.JINJA_EXPR_END, 0); }
		public TerminalNode JINJA_EXPR_CONTENT() { return getToken(JinjaFlaskParser.JINJA_EXPR_CONTENT, 0); }
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
		enterRule(_localctx, 32, RULE_jinjaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(JINJA_EXPR_START);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_EXPR_CONTENT) {
				{
				setState(253);
				match(JINJA_EXPR_CONTENT);
				}
			}

			setState(256);
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
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaFlaskParser.JINJA_STMT_END, 0); }
		public TerminalNode JINJA_STMT_CONTENT() { return getToken(JinjaFlaskParser.JINJA_STMT_CONTENT, 0); }
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
		enterRule(_localctx, 34, RULE_jinjaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(JINJA_STMT_START);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_STMT_CONTENT) {
				{
				setState(259);
				match(JINJA_STMT_CONTENT);
				}
			}

			setState(262);
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
		public TerminalNode JINJA_COMMENT_END() { return getToken(JinjaFlaskParser.JINJA_COMMENT_END, 0); }
		public TerminalNode JINJA_COMMENT_CONTENT() { return getToken(JinjaFlaskParser.JINJA_COMMENT_CONTENT, 0); }
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
		enterRule(_localctx, 36, RULE_jinjaComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(JINJA_COMMENT_START);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_COMMENT_CONTENT) {
				{
				setState(265);
				match(JINJA_COMMENT_CONTENT);
				}
			}

			setState(268);
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
		enterRule(_localctx, 38, RULE_styleBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(STYLE_START);
			setState(271);
			match(CSS_CONTENT);
			setState(272);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouteArgsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JinjaFlaskParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(JinjaFlaskParser.COMMA, 0); }
		public RouteOptionsContext routeOptions() {
			return getRuleContext(RouteOptionsContext.class,0);
		}
		public RouteArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterRouteArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitRouteArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitRouteArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteArgsContext routeArgs() throws RecognitionException {
		RouteArgsContext _localctx = new RouteArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_routeArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(STRING);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(275);
				match(COMMA);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(276);
					routeOptions();
					}
				}

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
	public static class RouteOptionsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(JinjaFlaskParser.ASSIGN, 0); }
		public ArrayOfStringsContext arrayOfStrings() {
			return getRuleContext(ArrayOfStringsContext.class,0);
		}
		public RouteOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterRouteOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitRouteOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitRouteOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteOptionsContext routeOptions() throws RecognitionException {
		RouteOptionsContext _localctx = new RouteOptionsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_routeOptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(NAME);
			setState(282);
			match(ASSIGN);
			setState(283);
			arrayOfStrings();
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
	public static class ArrayOfStringsContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JinjaFlaskParser.LBRACK, 0); }
		public List<TerminalNode> STRING() { return getTokens(JinjaFlaskParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JinjaFlaskParser.STRING, i);
		}
		public TerminalNode RBRACK() { return getToken(JinjaFlaskParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public ArrayOfStringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOfStrings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterArrayOfStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitArrayOfStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitArrayOfStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayOfStringsContext arrayOfStrings() throws RecognitionException {
		ArrayOfStringsContext _localctx = new ArrayOfStringsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayOfStrings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LBRACK);
			setState(286);
			match(STRING);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(287);
				match(COMMA);
				setState(288);
				match(STRING);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(RBRACK);
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
		"\u0004\u0001\'\u0129\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"E\b\u0002\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0003\u0002K\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002U\b\u0002\n\u0002\f\u0002X\t\u0002\u0001"+
		"\u0002\u0003\u0002[\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002_\b\u0002"+
		"\u0003\u0002a\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003g\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005q\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006y\b\u0006\n\u0006\f\u0006|\t\u0006\u0003\u0006~\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0005\u0007\u0085"+
		"\b\u0007\n\u0007\f\u0007\u0088\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0093\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u009a\b\t\n\t\f\t\u009d\t\t\u0001\t"+
		"\u0003\t\u00a0\b\t\u0003\t\u00a2\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ac\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00b3\b\n\u0005\n\u00b5\b\n\n\n\f\n\u00b8\t\n\u0003"+
		"\n\u00ba\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004"+
		"\u000b\u00c1\b\u000b\u000b\u000b\f\u000b\u00c2\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00c9\b\f\n\f\f\f\u00cc\t\f\u0003\f\u00ce\b\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00db\b\r\n\r\f\r\u00de\t\r\u0003\r\u00e0\b\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u00e6\b\u000e\n\u000e\f"+
		"\u000e\u00e9\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ee"+
		"\b\u000e\n\u000e\f\u000e\u00f1\t\u000e\u0001\u000e\u0003\u000e\u00f4\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00fb\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00ff\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0105\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u010b\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0116\b\u0014\u0003\u0014"+
		"\u0118\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0122\b\u0016\n\u0016"+
		"\f\u0016\u0125\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000"+
		"\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,\u0000\u0000\u0144\u00001\u0001\u0000\u0000"+
		"\u0000\u0002<\u0001\u0000\u0000\u0000\u0004`\u0001\u0000\u0000\u0000\u0006"+
		"b\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000"+
		"\u0000\fr\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000"+
		"\u0010\u0092\u0001\u0000\u0000\u0000\u0012\u0094\u0001\u0000\u0000\u0000"+
		"\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00bd\u0001\u0000\u0000\u0000"+
		"\u0018\u00c4\u0001\u0000\u0000\u0000\u001a\u00d1\u0001\u0000\u0000\u0000"+
		"\u001c\u00f3\u0001\u0000\u0000\u0000\u001e\u00fa\u0001\u0000\u0000\u0000"+
		" \u00fc\u0001\u0000\u0000\u0000\"\u0102\u0001\u0000\u0000\u0000$\u0108"+
		"\u0001\u0000\u0000\u0000&\u010e\u0001\u0000\u0000\u0000(\u0112\u0001\u0000"+
		"\u0000\u0000*\u0119\u0001\u0000\u0000\u0000,\u011d\u0001\u0000\u0000\u0000"+
		".0\u0003\u0002\u0001\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000045\u0005\u0000\u0000\u00015\u0001"+
		"\u0001\u0000\u0000\u00006=\u0003\u0004\u0002\u00007=\u0003\u001c\u000e"+
		"\u00008=\u0003\u0006\u0003\u00009=\u0003\b\u0004\u0000:=\u0003\f\u0006"+
		"\u0000;=\u0003\n\u0005\u0000<6\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000"+
		"\u0000<8\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<;\u0001\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000"+
		">?\u0005\u0005\u0000\u0000?@\u0005\u0013\u0000\u0000@A\u0005\u0006\u0000"+
		"\u0000AF\u0005\u0013\u0000\u0000BC\u0005\n\u0000\u0000CE\u0005\u0013\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000IK\u0005\n\u0000\u0000JI\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LM\u0005\u0007\u0000\u0000"+
		"MO\u0005\u0013\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000Oa\u0001\u0000\u0000\u0000PQ\u0005\u0006\u0000\u0000QV\u0005\u0013"+
		"\u0000\u0000RS\u0005\n\u0000\u0000SU\u0005\u0013\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"Y[\u0005\n\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\]\u0005\u0007\u0000\u0000]_\u0005\u0013\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000"+
		"\u0000\u0000`>\u0001\u0000\u0000\u0000`P\u0001\u0000\u0000\u0000a\u0005"+
		"\u0001\u0000\u0000\u0000bc\u0005\b\u0000\u0000cd\u0003\u0016\u000b\u0000"+
		"df\u0005\f\u0000\u0000eg\u0003(\u0014\u0000fe\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\r\u0000\u0000"+
		"i\u0007\u0001\u0000\u0000\u0000jk\u0005\u0013\u0000\u0000kl\u0005\u000b"+
		"\u0000\u0000lm\u0003\u0010\b\u0000m\t\u0001\u0000\u0000\u0000np\u0005"+
		"\u0004\u0000\u0000oq\u0003\u0010\b\u0000po\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u000b\u0001\u0000\u0000\u0000rs\u0005\u0003\u0000"+
		"\u0000st\u0005\u0013\u0000\u0000t}\u0005\f\u0000\u0000uz\u0005\u0013\u0000"+
		"\u0000vw\u0005\n\u0000\u0000wy\u0005\u0013\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}u\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\r\u0000\u0000\u0080\u0081\u0005\t\u0000\u0000"+
		"\u0081\u0082\u0003\u000e\u0007\u0000\u0082\r\u0001\u0000\u0000\u0000\u0083"+
		"\u0085\u0003\u0002\u0001\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u000f\u0001\u0000\u0000\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u0093\u0005\u0015\u0000\u0000\u008a"+
		"\u0093\u0003\u001c\u000e\u0000\u008b\u0093\u0005\u0014\u0000\u0000\u008c"+
		"\u0093\u0003\u0014\n\u0000\u008d\u0093\u0003\u0012\t\u0000\u008e\u0093"+
		"\u0003\u0016\u000b\u0000\u008f\u0093\u0003\u001a\r\u0000\u0090\u0093\u0003"+
		"\u0018\f\u0000\u0091\u0093\u0005\u0013\u0000\u0000\u0092\u0089\u0001\u0000"+
		"\u0000\u0000\u0092\u008a\u0001\u0000\u0000\u0000\u0092\u008b\u0001\u0000"+
		"\u0000\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000"+
		"\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0011\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0013"+
		"\u0000\u0000\u0095\u00a1\u0005\f\u0000\u0000\u0096\u009b\u0003\u0010\b"+
		"\u0000\u0097\u0098\u0005\n\u0000\u0000\u0098\u009a\u0003\u0010\b\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0005\n\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u0096\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\r\u0000\u0000\u00a4\u0013"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0013\u0000\u0000\u00a6\u00b9"+
		"\u0005\f\u0000\u0000\u00a7\u00ac\u0003\u0010\b\u0000\u00a8\u00a9\u0005"+
		"\u0013\u0000\u0000\u00a9\u00aa\u0005\u000b\u0000\u0000\u00aa\u00ac\u0003"+
		"\u0010\b\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b6\u0001\u0000\u0000\u0000\u00ad\u00b2\u0005\n\u0000"+
		"\u0000\u00ae\u00b3\u0003\u0010\b\u0000\u00af\u00b0\u0005\u0013\u0000\u0000"+
		"\u00b0\u00b1\u0005\u000b\u0000\u0000\u00b1\u00b3\u0003\u0010\b\u0000\u00b2"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ab\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\r\u0000\u0000\u00bc\u0015\u0001\u0000\u0000\u0000\u00bd\u00c0"+
		"\u0005\u0013\u0000\u0000\u00be\u00bf\u0005\u0012\u0000\u0000\u00bf\u00c1"+
		"\u0005\u0013\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u0017\u0001\u0000\u0000\u0000\u00c4\u00cd"+
		"\u0005\u000e\u0000\u0000\u00c5\u00ca\u0003\u0010\b\u0000\u00c6\u00c7\u0005"+
		"\n\u0000\u0000\u00c7\u00c9\u0003\u0010\b\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00c5\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005\u000f\u0000\u0000\u00d0\u0019\u0001\u0000"+
		"\u0000\u0000\u00d1\u00df\u0005\u0010\u0000\u0000\u00d2\u00d3\u0003\u0010"+
		"\b\u0000\u00d3\u00d4\u0005\t\u0000\u0000\u00d4\u00dc\u0003\u0010\b\u0000"+
		"\u00d5\u00d6\u0005\n\u0000\u0000\u00d6\u00d7\u0003\u0010\b\u0000\u00d7"+
		"\u00d8\u0005\t\u0000\u0000\u00d8\u00d9\u0003\u0010\b\u0000\u00d9\u00db"+
		"\u0001\u0000\u0000\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00db\u00de"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00df\u00d2\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0011\u0000\u0000\u00e2\u001b\u0001\u0000\u0000\u0000\u00e3\u00e7"+
		"\u0005\u0016\u0000\u0000\u00e4\u00e6\u0003\u001e\u000f\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00f4"+
		"\u0005\u001d\u0000\u0000\u00eb\u00ef\u0005\u0017\u0000\u0000\u00ec\u00ee"+
		"\u0003\u001e\u000f\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005\u001e\u0000\u0000\u00f3\u00e3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00eb\u0001\u0000\u0000\u0000\u00f4\u001d"+
		"\u0001\u0000\u0000\u0000\u00f5\u00fb\u0005\u001f\u0000\u0000\u00f6\u00fb"+
		"\u0003 \u0010\u0000\u00f7\u00fb\u0003\"\u0011\u0000\u00f8\u00fb\u0003"+
		"$\u0012\u0000\u00f9\u00fb\u0003&\u0013\u0000\u00fa\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u001f\u0001\u0000\u0000\u0000\u00fc\u00fe\u0005\u001a\u0000"+
		"\u0000\u00fd\u00ff\u0005%\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005\"\u0000\u0000\u0101!\u0001\u0000\u0000\u0000\u0102"+
		"\u0104\u0005\u001b\u0000\u0000\u0103\u0105\u0005&\u0000\u0000\u0104\u0103"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0005#\u0000\u0000\u0107#\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0005\u001c\u0000\u0000\u0109\u010b\u0005\'\u0000"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0005$\u0000\u0000"+
		"\u010d%\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0019\u0000\u0000\u010f"+
		"\u0110\u0005!\u0000\u0000\u0110\u0111\u0005 \u0000\u0000\u0111\'\u0001"+
		"\u0000\u0000\u0000\u0112\u0117\u0005\u0015\u0000\u0000\u0113\u0115\u0005"+
		"\n\u0000\u0000\u0114\u0116\u0003*\u0015\u0000\u0115\u0114\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000"+
		"\u0000\u0000\u0117\u0113\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118)\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0013\u0000"+
		"\u0000\u011a\u011b\u0005\u000b\u0000\u0000\u011b\u011c\u0003,\u0016\u0000"+
		"\u011c+\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u000e\u0000\u0000\u011e"+
		"\u0123\u0005\u0015\u0000\u0000\u011f\u0120\u0005\n\u0000\u0000\u0120\u0122"+
		"\u0005\u0015\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0125"+
		"\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u000f\u0000\u0000\u0127-\u0001"+
		"\u0000\u0000\u0000%1<FJNVZ^`fpz}\u0086\u0092\u009b\u009f\u00a1\u00ab\u00b2"+
		"\u00b6\u00b9\u00c2\u00ca\u00cd\u00dc\u00df\u00e7\u00ef\u00f3\u00fa\u00fe"+
		"\u0104\u010a\u0115\u0117\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}