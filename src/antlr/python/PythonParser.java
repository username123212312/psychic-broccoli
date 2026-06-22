// Generated from grammars/PythonParser.g4 by ANTLR 4.13.2
package antlr.python;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, STRING=3, NUMBER=4, PASS=5, DEF=6, RETURN=7, FROM=8, 
		IMPORT=9, AS=10, IF=11, ELIF=12, ELSE=13, FOR=14, IN=15, GLOBAL=16, AND=17, 
		OR=18, NOT=19, TRUE=20, FALSE=21, NONE=22, IS=23, WHILE=24, ARROW=25, 
		AT=26, EQ=27, NEQ=28, GTE=29, LTE=30, SLASHSLASH=31, POW=32, ASSIGN=33, 
		GT=34, LT=35, SLASH=36, STAR=37, COLON=38, SEMI=39, COMMA=40, PLUS=41, 
		MINUS=42, MOD=43, NEWLINE=44, CLASS_NAME=45, NAME=46, LP=47, RP=48, LBRACK=49, 
		RBRACK=50, LKBRACE=51, RKBRACE=52, SKIP_=53, SPACES_INLINE=54, DOT=55, 
		TRIPLE_QUOTE_STRING=56;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_compound_stmt = 2, RULE_return_stmt = 3, 
		RULE_global_stmt = 4, RULE_import_from = 5, RULE_import_stmt = 6, RULE_import_target = 7, 
		RULE_imptd = 8, RULE_if_stmt = 9, RULE_condition = 10, RULE_python_expr = 11, 
		RULE_atom_expr = 12, RULE_complex_expr = 13, RULE_comp_op = 14, RULE_assign_stmt = 15, 
		RULE_template_literal = 16, RULE_for_loop = 17, RULE_while_loop = 18, 
		RULE_func_def = 19, RULE_dec = 20, RULE_parameters = 21, RULE_fun_params = 22, 
		RULE_fun_param = 23, RULE_atom = 24, RULE_bool_exp = 25, RULE_list_items = 26, 
		RULE_dict_maker = 27, RULE_key_value = 28, RULE_simple_expr = 29, RULE_arithmetic_expr = 30, 
		RULE_arglist = 31, RULE_argument = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "compound_stmt", "return_stmt", "global_stmt", "import_from", 
			"import_stmt", "import_target", "imptd", "if_stmt", "condition", "python_expr", 
			"atom_expr", "complex_expr", "comp_op", "assign_stmt", "template_literal", 
			"for_loop", "while_loop", "func_def", "dec", "parameters", "fun_params", 
			"fun_param", "atom", "bool_exp", "list_items", "dict_maker", "key_value", 
			"simple_expr", "arithmetic_expr", "arglist", "argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'pass'", "'def'", "'return'", "'from'", 
			"'import'", "'as'", "'if'", "'elif'", "'else'", "'for'", "'in'", "'global'", 
			"'and'", "'or'", "'not'", "'True'", "'False'", "'None'", "'is'", "'while'", 
			"'->'", "'@'", "'=='", "'!='", "'>='", "'<='", "'//'", "'**'", "'='", 
			"'>'", "'<'", "'/'", "'*'", "':'", "';'", "','", "'+'", "'-'", "'%'", 
			null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "STRING", "NUMBER", "PASS", "DEF", "RETURN", 
			"FROM", "IMPORT", "AS", "IF", "ELIF", "ELSE", "FOR", "IN", "GLOBAL", 
			"AND", "OR", "NOT", "TRUE", "FALSE", "NONE", "IS", "WHILE", "ARROW", 
			"AT", "EQ", "NEQ", "GTE", "LTE", "SLASHSLASH", "POW", "ASSIGN", "GT", 
			"LT", "SLASH", "STAR", "COLON", "SEMI", "COMMA", "PLUS", "MINUS", "MOD", 
			"NEWLINE", "CLASS_NAME", "NAME", "LP", "RP", "LBRACK", "RBRACK", "LKBRACE", 
			"RKBRACE", "SKIP_", "SPACES_INLINE", "DOT", "TRIPLE_QUOTE_STRING"
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
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					match(NEWLINE);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3078632649608184L) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends StatementContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public CompoundStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PassStatementContext extends StatementContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public PassStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CompoundStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(80);
					match(NEWLINE);
					setState(81);
					match(INDENT);
					}
				}

				setState(85); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(84);
						compound_stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(87); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(89);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new PassStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(92);
					match(NEWLINE);
					setState(93);
					match(INDENT);
					}
				}

				setState(96);
				match(PASS);
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(97);
					match(DEDENT);
					}
					break;
				}
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
	public static class Compound_stmtContext extends ParserRuleContext {
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	 
		public Compound_stmtContext() { }
		public void copyFrom(Compound_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends Compound_stmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public IfStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends Compound_stmtContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AssignmentStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementContext extends Compound_stmtContext {
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public GlobalStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopStatementContext extends Compound_stmtContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ForLoopStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends Compound_stmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ReturnStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PythonExpressionContext extends Compound_stmtContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public PythonExpressionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPythonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExpressionContext extends Compound_stmtContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AtomExpressionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends Compound_stmtContext {
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public FunctionDefinitionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends Compound_stmtContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public WhileStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends Compound_stmtContext {
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ImportStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends Compound_stmtContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public SimpleExpressionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainImportContext extends Compound_stmtContext {
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public PlainImportContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPlainImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compound_stmt);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				if_stmt();
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(103);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				assign_stmt();
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(107);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new AtomExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				atom_expr();
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(111);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SimpleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				simple_expr();
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(115);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ForLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				for_loop();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(119);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new PythonExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				python_expr();
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(123);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new FunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				func_def();
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(127);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				return_stmt();
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(131);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(134);
				while_loop();
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(135);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
				import_from();
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(139);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new PlainImportContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(142);
				import_stmt();
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(143);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new GlobalStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(146);
				global_stmt();
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(147);
					match(NEWLINE);
					}
					break;
				}
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
	public static class Return_stmtContext extends ParserRuleContext {
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	 
		public Return_stmtContext() { }
		public void copyFrom(Return_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleReturnContext extends Return_stmtContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SimpleReturnContext(Return_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexReturnContext extends Return_stmtContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public ComplexReturnContext(Return_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticReturnContext extends Return_stmtContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ArithmeticReturnContext(Return_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArithmeticReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionReturnContext extends Return_stmtContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionReturnContext(Return_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitConditionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return_stmt);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ComplexReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(RETURN);
				setState(153);
				python_expr();
				}
				break;
			case 2:
				_localctx = new SimpleReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(RETURN);
				setState(155);
				atom();
				}
				break;
			case 3:
				_localctx = new ArithmeticReturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(RETURN);
				setState(157);
				arithmetic_expr();
				}
				break;
			case 4:
				_localctx = new ConditionReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(RETURN);
				setState(159);
				condition();
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
	public static class Global_stmtContext extends ParserRuleContext {
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
	 
		public Global_stmtContext() { }
		public void copyFrom(Global_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementDefContext extends Global_stmtContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public GlobalStatementDefContext(Global_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGlobalStatementDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_stmt);
		int _la;
		try {
			_localctx = new GlobalStatementDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(GLOBAL);
			setState(163);
			match(NAME);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164);
				match(COMMA);
				setState(165);
				match(NAME);
				}
				}
				setState(170);
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
	public static class Import_fromContext extends ParserRuleContext {
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
	 
		public Import_fromContext() { }
		public void copyFrom(Import_fromContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromDefContext extends Import_fromContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public List<ImptdContext> imptd() {
			return getRuleContexts(ImptdContext.class);
		}
		public ImptdContext imptd(int i) {
			return getRuleContext(ImptdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ImportFromDefContext(Import_fromContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_from);
		int _la;
		try {
			_localctx = new ImportFromDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(FROM);
			setState(172);
			match(NAME);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(173);
				match(DOT);
				setState(174);
				match(NAME);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(IMPORT);
			setState(181);
			imptd();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(182);
				match(COMMA);
				setState(183);
				imptd();
				}
				}
				setState(188);
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
	public static class Import_stmtContext extends ParserRuleContext {
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	 
		public Import_stmtContext() { }
		public void copyFrom(Import_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefContext extends Import_stmtContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public List<Import_targetContext> import_target() {
			return getRuleContexts(Import_targetContext.class);
		}
		public Import_targetContext import_target(int i) {
			return getRuleContext(Import_targetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ImportDefContext(Import_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_import_stmt);
		int _la;
		try {
			_localctx = new ImportDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(IMPORT);
			setState(190);
			import_target();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(191);
				match(COMMA);
				setState(192);
				import_target();
				}
				}
				setState(197);
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
	public static class Import_targetContext extends ParserRuleContext {
		public Import_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_target; }
	 
		public Import_targetContext() { }
		public void copyFrom(Import_targetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportTargetDefContext extends Import_targetContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public ImportTargetDefContext(Import_targetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportTargetDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_targetContext import_target() throws RecognitionException {
		Import_targetContext _localctx = new Import_targetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_target);
		int _la;
		try {
			_localctx = new ImportTargetDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(NAME);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(199);
				match(DOT);
				setState(200);
				match(NAME);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(206);
				match(AS);
				setState(207);
				match(NAME);
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
	public static class ImptdContext extends ParserRuleContext {
		public ImptdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imptd; }
	 
		public ImptdContext() { }
		public void copyFrom(ImptdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportedContext extends ImptdContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> CLASS_NAME() { return getTokens(PythonParser.CLASS_NAME); }
		public TerminalNode CLASS_NAME(int i) {
			return getToken(PythonParser.CLASS_NAME, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public ImportedContext(ImptdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImported(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImptdContext imptd() throws RecognitionException {
		ImptdContext _localctx = new ImptdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_imptd);
		int _la;
		try {
			_localctx = new ImportedContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==CLASS_NAME || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(211);
				match(AS);
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==CLASS_NAME || _la==NAME) ) {
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
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	 
		public If_stmtContext() { }
		public void copyFrom(If_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementDefContext extends If_stmtContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public IfStatementDefContext(If_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfStatementDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_stmt);
		try {
			int _alt;
			_localctx = new IfStatementDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IF);
			setState(216);
			condition();
			setState(217);
			match(COLON);
			setState(218);
			statement();
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					match(ELIF);
					setState(220);
					condition();
					setState(221);
					match(COLON);
					setState(222);
					statement();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(229);
				match(ELSE);
				setState(230);
				match(COLON);
				setState(231);
				statement();
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ConditionContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonExpressionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanConditionContext extends ConditionContext {
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public BooleanConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBooleanCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public NotExpressionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			int _alt;
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new BooleanConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				bool_exp();
				}
				break;
			case 2:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(NOT);
				setState(236);
				python_expr();
				}
				break;
			case 3:
				_localctx = new ComparisonExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				python_expr();
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(238);
						comp_op();
						setState(239);
						python_expr();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
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
	public static class Python_exprContext extends ParserRuleContext {
		public Python_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_expr; }
	 
		public Python_exprContext() { }
		public void copyFrom(Python_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomComplexExpressionContext extends Python_exprContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public AtomComplexExpressionContext(Python_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomComplexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexExpressionContext extends Python_exprContext {
		public Complex_exprContext complex_expr() {
			return getRuleContext(Complex_exprContext.class,0);
		}
		public ComplexExpressionContext(Python_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Python_exprContext python_expr() throws RecognitionException {
		Python_exprContext _localctx = new Python_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_python_expr);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case TRUE:
			case FALSE:
			case NONE:
			case CLASS_NAME:
			case NAME:
				_localctx = new AtomComplexExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				atom_expr();
				}
				break;
			case LP:
			case LBRACK:
			case LKBRACE:
				_localctx = new ComplexExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				complex_expr();
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
	public static class Atom_exprContext extends ParserRuleContext {
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
	 
		public Atom_exprContext() { }
		public void copyFrom(Atom_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictionaryAccessContext extends Atom_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public DictionaryAccessContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictionaryAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAccessContext extends Atom_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public ListAccessContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleVarContext extends Atom_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SimpleVarContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectCreationContext extends Atom_exprContext {
		public TerminalNode CLASS_NAME() { return getToken(PythonParser.CLASS_NAME, 0); }
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ObjectCreationContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitObjectCreation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeAccessContext extends Atom_exprContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public AttributeAccessContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAttributeAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends Atom_exprContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public FunctionCallContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodAccessContext extends Atom_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public List<Atom_exprContext> atom_expr() {
			return getRuleContexts(Atom_exprContext.class);
		}
		public Atom_exprContext atom_expr(int i) {
			return getRuleContext(Atom_exprContext.class,i);
		}
		public MethodAccessContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMethodAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atom_expr);
		int _la;
		try {
			int _alt;
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new ListAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				atom();
				setState(253);
				match(LBRACK);
				setState(254);
				match(NUMBER);
				setState(255);
				match(RBRACK);
				}
				break;
			case 2:
				_localctx = new DictionaryAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				atom();
				setState(258);
				match(LBRACK);
				setState(259);
				match(STRING);
				setState(260);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new AttributeAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				atom();
				setState(265); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(263);
						match(DOT);
						setState(264);
						atom();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(267); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new MethodAccessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				atom();
				setState(272); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(270);
						match(DOT);
						setState(271);
						atom_expr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(274); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				_localctx = new ObjectCreationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(CLASS_NAME);
				setState(277);
				match(LP);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3061040379068440L) != 0)) {
					{
					setState(278);
					arglist();
					}
				}

				setState(281);
				match(RP);
				}
				break;
			case 6:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				match(NAME);
				setState(283);
				match(LP);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3061040379068440L) != 0)) {
					{
					setState(284);
					arglist();
					}
				}

				setState(287);
				match(RP);
				}
				break;
			case 7:
				_localctx = new SimpleVarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				atom();
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
	public static class Complex_exprContext extends ParserRuleContext {
		public Complex_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_expr; }
	 
		public Complex_exprContext() { }
		public void copyFrom(Complex_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictionaryLiteralContext extends Complex_exprContext {
		public TerminalNode LKBRACE() { return getToken(PythonParser.LKBRACE, 0); }
		public TerminalNode RKBRACE() { return getToken(PythonParser.RKBRACE, 0); }
		public Dict_makerContext dict_maker() {
			return getRuleContext(Dict_makerContext.class,0);
		}
		public DictionaryLiteralContext(Complex_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictionaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends Complex_exprContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public List_itemsContext list_items() {
			return getRuleContext(List_itemsContext.class,0);
		}
		public ListLiteralContext(Complex_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListComprehensionContext extends Complex_exprContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public ListComprehensionContext(Complex_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListComprehension(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorContext extends Complex_exprContext {
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public GeneratorContext(Complex_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_exprContext complex_expr() throws RecognitionException {
		Complex_exprContext _localctx = new Complex_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_complex_expr);
		int _la;
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new GeneratorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(LP);
				setState(292);
				for_loop();
				setState(293);
				match(RP);
				}
				break;
			case 2:
				_localctx = new ListComprehensionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(LBRACK);
				setState(296);
				for_loop();
				setState(297);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new DictionaryLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(LKBRACE);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 105553123606552L) != 0)) {
					{
					setState(300);
					dict_maker();
					}
				}

				setState(303);
				match(RKBRACE);
				}
				break;
			case 4:
				_localctx = new ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(LBRACK);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 105553123606552L) != 0)) {
					{
					setState(305);
					list_items();
					}
				}

				setState(308);
				match(RBRACK);
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
	public static class Comp_opContext extends ParserRuleContext {
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	 
		public Comp_opContext() { }
		public void copyFrom(Comp_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrOperatorContext extends Comp_opContext {
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public OrOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOrOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOperatorContext extends Comp_opContext {
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public LessThanOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLessThanOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InOperatorContext extends Comp_opContext {
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public InOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOperatorContext extends Comp_opContext {
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public GreaterThanOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGreaterThanOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNotOperatorContext extends Comp_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public IsNotOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqualOperatorContext extends Comp_opContext {
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public LessEqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLessEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqualOperatorContext extends Comp_opContext {
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public GreaterEqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGreaterEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInOperatorContext extends Comp_opContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public NotInOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotInOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsOperatorContext extends Comp_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public IsOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualOperatorContext extends Comp_opContext {
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public NotEqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualOperatorContext extends Comp_opContext {
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public EqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comp_op);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new LessThanOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(LT);
				}
				break;
			case 2:
				_localctx = new GreaterThanOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(GT);
				}
				break;
			case 3:
				_localctx = new EqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(EQ);
				}
				break;
			case 4:
				_localctx = new GreaterEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				match(GTE);
				}
				break;
			case 5:
				_localctx = new LessEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				match(LTE);
				}
				break;
			case 6:
				_localctx = new NotEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				match(NEQ);
				}
				break;
			case 7:
				_localctx = new OrOperatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(317);
				match(OR);
				}
				break;
			case 8:
				_localctx = new InOperatorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(318);
				match(IN);
				}
				break;
			case 9:
				_localctx = new NotInOperatorContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(319);
				match(NOT);
				setState(320);
				match(IN);
				}
				break;
			case 10:
				_localctx = new IsOperatorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(321);
				match(IS);
				}
				break;
			case 11:
				_localctx = new IsNotOperatorContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(322);
				match(IS);
				setState(323);
				match(NOT);
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
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	 
		public Assign_stmtContext() { }
		public void copyFrom(Assign_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticAssignStmtContext extends Assign_stmtContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ArithmeticAssignStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArithmeticAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonAssignStmtContext extends Assign_stmtContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ComparisonAssignStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComparisonAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PythonExpressionAssignStmtContext extends Assign_stmtContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public PythonExpressionAssignStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPythonExpressionAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiteralAssignStmtContext extends Assign_stmtContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Template_literalContext template_literal() {
			return getRuleContext(Template_literalContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TemplateLiteralAssignStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTemplateLiteralAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign_stmt);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new PythonExpressionAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				python_expr();
				setState(327);
				match(ASSIGN);
				setState(328);
				python_expr();
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(329);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ComparisonAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				python_expr();
				setState(333);
				match(ASSIGN);
				setState(334);
				condition();
				setState(336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(335);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ArithmeticAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				python_expr();
				setState(339);
				match(ASSIGN);
				setState(340);
				arithmetic_expr();
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(341);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new TemplateLiteralAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				python_expr();
				setState(345);
				match(ASSIGN);
				setState(346);
				template_literal();
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(347);
					match(NEWLINE);
					}
					break;
				}
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
	public static class Template_literalContext extends ParserRuleContext {
		public Template_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_literal; }
	 
		public Template_literalContext() { }
		public void copyFrom(Template_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiteralContext extends Template_literalContext {
		public TerminalNode TRIPLE_QUOTE_STRING() { return getToken(PythonParser.TRIPLE_QUOTE_STRING, 0); }
		public TemplateLiteralContext(Template_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTemplateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_literalContext template_literal() throws RecognitionException {
		Template_literalContext _localctx = new Template_literalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_template_literal);
		try {
			_localctx = new TemplateLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(TRIPLE_QUOTE_STRING);
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
	public static class For_loopContext extends ParserRuleContext {
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	 
		public For_loopContext() { }
		public void copyFrom(For_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexForLoopContext extends For_loopContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ComplexForLoopContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleForLoopContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleForLoopContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_loop);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new SimpleForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(FOR);
				setState(355);
				atom();
				setState(356);
				match(IN);
				setState(357);
				python_expr();
				setState(358);
				match(COLON);
				setState(359);
				statement();
				}
				break;
			case STRING:
			case NUMBER:
			case TRUE:
			case FALSE:
			case NONE:
			case CLASS_NAME:
			case NAME:
				_localctx = new ComplexForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				atom();
				setState(362);
				match(FOR);
				setState(363);
				atom();
				setState(364);
				match(IN);
				setState(365);
				python_expr();
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(366);
					match(IF);
					setState(367);
					condition();
					}
					break;
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
	public static class While_loopContext extends ParserRuleContext {
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	 
		public While_loopContext() { }
		public void copyFrom(While_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementDefContext extends While_loopContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementDefContext(While_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhileStatementDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_loop);
		try {
			_localctx = new WhileStatementDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(WHILE);
			setState(373);
			condition();
			setState(374);
			match(COLON);
			setState(375);
			statement();
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
	public static class Func_defContext extends ParserRuleContext {
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
	 
		public Func_defContext() { }
		public void copyFrom(Func_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefDefContext extends Func_defContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public FunctionDefDefContext(Func_defContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionDefDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_def);
		int _la;
		try {
			_localctx = new FunctionDefDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(377);
				dec();
				}
			}

			setState(380);
			match(DEF);
			setState(381);
			match(NAME);
			setState(382);
			parameters();
			setState(383);
			match(COLON);
			setState(384);
			statement();
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
	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends DecContext {
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public DecoratorContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dec);
		int _la;
		try {
			_localctx = new DecoratorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(AT);
			setState(387);
			match(NAME);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(388);
				match(DOT);
				setState(389);
				match(NAME);
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(395);
				match(LP);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3061040379068440L) != 0)) {
					{
					setState(396);
					arglist();
					}
				}

				setState(399);
				match(RP);
				}
			}

			setState(402);
			match(NEWLINE);
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
	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParametersContext extends ParametersContext {
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public Fun_paramsContext fun_params() {
			return getRuleContext(Fun_paramsContext.class,0);
		}
		public FunctionParametersContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameters);
		int _la;
		try {
			_localctx = new FunctionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(LP);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(405);
				fun_params();
				}
			}

			setState(408);
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
	public static class Fun_paramsContext extends ParserRuleContext {
		public Fun_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_params; }
	 
		public Fun_paramsContext() { }
		public void copyFrom(Fun_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParamListContext extends Fun_paramsContext {
		public List<Fun_paramContext> fun_param() {
			return getRuleContexts(Fun_paramContext.class);
		}
		public Fun_paramContext fun_param(int i) {
			return getRuleContext(Fun_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public FunctionParamListContext(Fun_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_paramsContext fun_params() throws RecognitionException {
		Fun_paramsContext _localctx = new Fun_paramsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fun_params);
		int _la;
		try {
			_localctx = new FunctionParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			fun_param();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(411);
				match(COMMA);
				setState(412);
				fun_param();
				}
				}
				setState(417);
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
	public static class Fun_paramContext extends ParserRuleContext {
		public Fun_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_param; }
	 
		public Fun_paramContext() { }
		public void copyFrom(Fun_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamWithoutDefaultContext extends Fun_paramContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ParamWithoutDefaultContext(Fun_paramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParamWithoutDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamWithDefaultContext extends Fun_paramContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ParamWithDefaultContext(Fun_paramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParamWithDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_paramContext fun_param() throws RecognitionException {
		Fun_paramContext _localctx = new Fun_paramContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fun_param);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new ParamWithDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(NAME);
				setState(419);
				match(ASSIGN);
				setState(420);
				atom();
				}
				break;
			case 2:
				_localctx = new ParamWithoutDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
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
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameAtomContext extends AtomContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public NameAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNameAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneAtomContext extends AtomContext {
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public NoneAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNoneAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomContext extends AtomContext {
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassAtomContext extends AtomContext {
		public TerminalNode CLASS_NAME() { return getToken(PythonParser.CLASS_NAME, 0); }
		public ClassAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atom);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new NameAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(NAME);
				}
				break;
			case CLASS_NAME:
				_localctx = new ClassAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(CLASS_NAME);
				}
				break;
			case NUMBER:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				match(STRING);
				}
				break;
			case NONE:
				_localctx = new NoneAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				match(NONE);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				bool_exp();
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
	public static class Bool_expContext extends ParserRuleContext {
		public Bool_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_exp; }
	 
		public Bool_expContext() { }
		public void copyFrom(Bool_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueAtomContext extends Bool_expContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TrueAtomContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseAtomContext extends Bool_expContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public FalseAtomContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expContext bool_exp() throws RecognitionException {
		Bool_expContext _localctx = new Bool_expContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bool_exp);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(FALSE);
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
	public static class List_itemsContext extends ParserRuleContext {
		public List_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_items; }
	 
		public List_itemsContext() { }
		public void copyFrom(List_itemsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListItemsContext extends List_itemsContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ListItemsContext(List_itemsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_itemsContext list_items() throws RecognitionException {
		List_itemsContext _localctx = new List_itemsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_list_items);
		int _la;
		try {
			int _alt;
			_localctx = new ListItemsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			atom();
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(437);
					match(COMMA);
					setState(438);
					atom();
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(444);
				match(COMMA);
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
	public static class Dict_makerContext extends ParserRuleContext {
		public Dict_makerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_maker; }
	 
		public Dict_makerContext() { }
		public void copyFrom(Dict_makerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyValuePairsContext extends Dict_makerContext {
		public List<Key_valueContext> key_value() {
			return getRuleContexts(Key_valueContext.class);
		}
		public Key_valueContext key_value(int i) {
			return getRuleContext(Key_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public KeyValuePairsContext(Dict_makerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeyValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dict_makerContext dict_maker() throws RecognitionException {
		Dict_makerContext _localctx = new Dict_makerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dict_maker);
		int _la;
		try {
			int _alt;
			_localctx = new KeyValuePairsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			key_value();
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					match(COMMA);
					setState(449);
					key_value();
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(455);
				match(COMMA);
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
	public static class Key_valueContext extends ParserRuleContext {
		public Key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value; }
	 
		public Key_valueContext() { }
		public void copyFrom(Key_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleKeyValueContext extends Key_valueContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public SimpleKeyValueContext(Key_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomKeyValueContext extends Key_valueContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public AtomKeyValueContext(Key_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_valueContext key_value() throws RecognitionException {
		Key_valueContext _localctx = new Key_valueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_key_value);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new AtomKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				atom();
				setState(459);
				match(COLON);
				setState(460);
				atom();
				}
				break;
			case 2:
				_localctx = new SimpleKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				atom();
				setState(463);
				match(COLON);
				setState(464);
				simple_expr();
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
	public static class Simple_exprContext extends ParserRuleContext {
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
	 
		public Simple_exprContext() { }
		public void copyFrom(Simple_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleComparisonExpressionContext extends Simple_exprContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SimpleComparisonExpressionContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends Simple_exprContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ArithmeticExpressionContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simple_expr);
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new ArithmeticExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				arithmetic_expr();
				}
				break;
			case 2:
				_localctx = new SimpleComparisonExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				condition();
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
	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
	 
		public Arithmetic_exprContext() { }
		public void copyFrom(Arithmetic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionContext extends Arithmetic_exprContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PythonParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PythonParser.PLUS, i);
		}
		public AdditionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationContext extends Arithmetic_exprContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public MultiplicationContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionContext extends Arithmetic_exprContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PythonParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PythonParser.MINUS, i);
		}
		public SubtractionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends Arithmetic_exprContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(PythonParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PythonParser.SLASH, i);
		}
		public DivisionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arithmetic_expr);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				python_expr();
				setState(475); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(473);
					match(PLUS);
					setState(474);
					python_expr();
					}
					}
					setState(477); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case 2:
				_localctx = new SubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				python_expr();
				setState(482); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(480);
					match(MINUS);
					setState(481);
					python_expr();
					}
					}
					setState(484); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				}
				break;
			case 3:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				python_expr();
				setState(489); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(487);
					match(SLASH);
					setState(488);
					python_expr();
					}
					}
					setState(491); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SLASH );
				}
				break;
			case 4:
				_localctx = new MultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				python_expr();
				setState(496); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(494);
					match(STAR);
					setState(495);
					python_expr();
					}
					}
					setState(498); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STAR );
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
	public static class ArglistContext extends ParserRuleContext {
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
	 
		public ArglistContext() { }
		public void copyFrom(ArglistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexArgsContext extends ArglistContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ComplexArgsContext(ArglistContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomArgsContext extends ArglistContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public AtomArgsContext(ArglistContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arglist);
		int _la;
		try {
			int _alt;
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new AtomArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				atom();
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(503);
						match(COMMA);
						setState(504);
						atom();
						}
						} 
					}
					setState(509);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(510);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new ComplexArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				argument();
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(514);
						match(COMMA);
						setState(515);
						argument();
						}
						} 
					}
					setState(520);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(521);
					match(COMMA);
					}
				}

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
	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalArgumentContext extends ArgumentContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public PositionalArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordArgumentContext extends ArgumentContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public KeywordArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeywordArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_argument);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				python_expr();
				}
				break;
			case 2:
				_localctx = new KeywordArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(NAME);
				setState(528);
				match(ASSIGN);
				setState(529);
				python_expr();
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
		"\u0004\u00018\u0215\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000"+
		"M\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"S\b\u0001\u0001\u0001\u0004\u0001V\b\u0001\u000b\u0001\f\u0001W\u0001"+
		"\u0001\u0003\u0001[\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001_\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001c\b\u0001\u0003\u0001e\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002i\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002m\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002q\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002u\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"y\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002}\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0081\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0085"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0089\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u008d\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0091\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0095\b\u0002\u0003"+
		"\u0002\u0097\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a1\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a7\b\u0004\n"+
		"\u0004\f\u0004\u00aa\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00b0\b\u0005\n\u0005\f\u0005\u00b3\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b9\b\u0005\n\u0005"+
		"\f\u0005\u00bc\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00c2\b\u0006\n\u0006\f\u0006\u00c5\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00ca\b\u0007\n\u0007\f\u0007\u00cd\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00d1\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00d6\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00e1\b\t\n\t\f\t\u00e4\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00e9\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00f2\b\n\n\n\f\n\u00f5\t\n\u0003\n\u00f7\b\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00fb\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0004\f\u010a\b\f\u000b\f\f\f\u010b\u0001\f\u0001\f\u0001\f\u0004\f"+
		"\u0111\b\f\u000b\f\f\f\u0112\u0001\f\u0001\f\u0001\f\u0003\f\u0118\b\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u011e\b\f\u0001\f\u0001\f\u0003"+
		"\f\u0122\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u012e\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0133"+
		"\b\r\u0001\r\u0003\r\u0136\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0145\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u014b\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0151\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0157\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u015d\b\u000f\u0003"+
		"\u000f\u015f\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0171\b\u0011\u0003\u0011\u0173\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u017b\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0187\b\u0014"+
		"\n\u0014\f\u0014\u018a\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u018e"+
		"\b\u0014\u0001\u0014\u0003\u0014\u0191\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0197\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u019e\b\u0016\n\u0016"+
		"\f\u0016\u01a1\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01a7\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u01af\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u01b3\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u01b8\b\u001a\n\u001a\f\u001a\u01bb\t\u001a\u0001\u001a\u0003\u001a\u01be"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01c3\b\u001b"+
		"\n\u001b\f\u001b\u01c6\t\u001b\u0001\u001b\u0003\u001b\u01c9\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01d3\b\u001c\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01d7\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u01dc"+
		"\b\u001e\u000b\u001e\f\u001e\u01dd\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0004\u001e\u01e3\b\u001e\u000b\u001e\f\u001e\u01e4\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0004\u001e\u01ea\b\u001e\u000b\u001e\f\u001e\u01eb"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u01f1\b\u001e\u000b\u001e"+
		"\f\u001e\u01f2\u0003\u001e\u01f5\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01fa\b\u001f\n\u001f\f\u001f\u01fd\t\u001f\u0001\u001f"+
		"\u0003\u001f\u0200\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0205\b\u001f\n\u001f\f\u001f\u0208\t\u001f\u0001\u001f\u0003\u001f\u020b"+
		"\b\u001f\u0003\u001f\u020d\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 "+
		"\u0213\b \u0001 \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0001"+
		"\u0001\u0000-.\u0264\u0000E\u0001\u0000\u0000\u0000\u0002d\u0001\u0000"+
		"\u0000\u0000\u0004\u0096\u0001\u0000\u0000\u0000\u0006\u00a0\u0001\u0000"+
		"\u0000\u0000\b\u00a2\u0001\u0000\u0000\u0000\n\u00ab\u0001\u0000\u0000"+
		"\u0000\f\u00bd\u0001\u0000\u0000\u0000\u000e\u00c6\u0001\u0000\u0000\u0000"+
		"\u0010\u00d2\u0001\u0000\u0000\u0000\u0012\u00d7\u0001\u0000\u0000\u0000"+
		"\u0014\u00f6\u0001\u0000\u0000\u0000\u0016\u00fa\u0001\u0000\u0000\u0000"+
		"\u0018\u0121\u0001\u0000\u0000\u0000\u001a\u0135\u0001\u0000\u0000\u0000"+
		"\u001c\u0144\u0001\u0000\u0000\u0000\u001e\u015e\u0001\u0000\u0000\u0000"+
		" \u0160\u0001\u0000\u0000\u0000\"\u0172\u0001\u0000\u0000\u0000$\u0174"+
		"\u0001\u0000\u0000\u0000&\u017a\u0001\u0000\u0000\u0000(\u0182\u0001\u0000"+
		"\u0000\u0000*\u0194\u0001\u0000\u0000\u0000,\u019a\u0001\u0000\u0000\u0000"+
		".\u01a6\u0001\u0000\u0000\u00000\u01ae\u0001\u0000\u0000\u00002\u01b2"+
		"\u0001\u0000\u0000\u00004\u01b4\u0001\u0000\u0000\u00006\u01bf\u0001\u0000"+
		"\u0000\u00008\u01d2\u0001\u0000\u0000\u0000:\u01d6\u0001\u0000\u0000\u0000"+
		"<\u01f4\u0001\u0000\u0000\u0000>\u020c\u0001\u0000\u0000\u0000@\u0212"+
		"\u0001\u0000\u0000\u0000BD\u0005,\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FK\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0003\u0002"+
		"\u0001\u0000IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NO\u0005\u0000\u0000\u0001O\u0001\u0001\u0000"+
		"\u0000\u0000PQ\u0005,\u0000\u0000QS\u0005\u0001\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TV\u0003"+
		"\u0004\u0002\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000"+
		"\u0000Y[\u0005\u0002\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[e\u0001\u0000\u0000\u0000\\]\u0005,\u0000\u0000]_\u0005\u0001"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0005\u0005\u0000\u0000ac\u0005\u0002\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000"+
		"\u0000dR\u0001\u0000\u0000\u0000d^\u0001\u0000\u0000\u0000e\u0003\u0001"+
		"\u0000\u0000\u0000fh\u0003\u0012\t\u0000gi\u0005,\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0097\u0001\u0000\u0000"+
		"\u0000jl\u0003\u001e\u000f\u0000km\u0005,\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u0097\u0001\u0000\u0000\u0000np\u0003"+
		"\u0018\f\u0000oq\u0005,\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u0097\u0001\u0000\u0000\u0000rt\u0003:\u001d\u0000"+
		"su\u0005,\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"u\u0097\u0001\u0000\u0000\u0000vx\u0003\"\u0011\u0000wy\u0005,\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0097\u0001\u0000"+
		"\u0000\u0000z|\u0003\u0016\u000b\u0000{}\u0005,\u0000\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0097\u0001\u0000\u0000\u0000"+
		"~\u0080\u0003&\u0013\u0000\u007f\u0081\u0005,\u0000\u0000\u0080\u007f"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0097"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0006\u0003\u0000\u0083\u0085"+
		"\u0005,\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0097\u0001\u0000\u0000\u0000\u0086\u0088\u0003"+
		"$\u0012\u0000\u0087\u0089\u0005,\u0000\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0097\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0003\n\u0005\u0000\u008b\u008d\u0005,\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u0097\u0001\u0000\u0000\u0000\u008e\u0090\u0003\f\u0006\u0000\u008f"+
		"\u0091\u0005,\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0097\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0003\b\u0004\u0000\u0093\u0095\u0005,\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001"+
		"\u0000\u0000\u0000\u0096f\u0001\u0000\u0000\u0000\u0096j\u0001\u0000\u0000"+
		"\u0000\u0096n\u0001\u0000\u0000\u0000\u0096r\u0001\u0000\u0000\u0000\u0096"+
		"v\u0001\u0000\u0000\u0000\u0096z\u0001\u0000\u0000\u0000\u0096~\u0001"+
		"\u0000\u0000\u0000\u0096\u0082\u0001\u0000\u0000\u0000\u0096\u0086\u0001"+
		"\u0000\u0000\u0000\u0096\u008a\u0001\u0000\u0000\u0000\u0096\u008e\u0001"+
		"\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0097\u0005\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\u0007\u0000\u0000\u0099\u00a1\u0003"+
		"\u0016\u000b\u0000\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u00a1\u0003"+
		"0\u0018\u0000\u009c\u009d\u0005\u0007\u0000\u0000\u009d\u00a1\u0003<\u001e"+
		"\u0000\u009e\u009f\u0005\u0007\u0000\u0000\u009f\u00a1\u0003\u0014\n\u0000"+
		"\u00a0\u0098\u0001\u0000\u0000\u0000\u00a0\u009a\u0001\u0000\u0000\u0000"+
		"\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a1\u0007\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0010\u0000\u0000"+
		"\u00a3\u00a8\u0005.\u0000\u0000\u00a4\u00a5\u0005(\u0000\u0000\u00a5\u00a7"+
		"\u0005.\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\t\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\b\u0000\u0000\u00ac\u00b1\u0005.\u0000"+
		"\u0000\u00ad\u00ae\u00057\u0000\u0000\u00ae\u00b0\u0005.\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005\t\u0000\u0000\u00b5\u00ba\u0003\u0010\b\u0000\u00b6\u00b7"+
		"\u0005(\u0000\u0000\u00b7\u00b9\u0003\u0010\b\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u000b\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"\t\u0000\u0000\u00be\u00c3\u0003\u000e\u0007\u0000\u00bf\u00c0\u0005("+
		"\u0000\u0000\u00c0\u00c2\u0003\u000e\u0007\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\r\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00cb\u0005.\u0000\u0000"+
		"\u00c7\u00c8\u00057\u0000\u0000\u00c8\u00ca\u0005.\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005\n\u0000\u0000\u00cf\u00d1\u0005.\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u000f\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d5\u0007\u0000\u0000\u0000\u00d3\u00d4\u0005"+
		"\n\u0000\u0000\u00d4\u00d6\u0007\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u0011\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0005\u000b\u0000\u0000\u00d8\u00d9\u0003\u0014"+
		"\n\u0000\u00d9\u00da\u0005&\u0000\u0000\u00da\u00e2\u0003\u0002\u0001"+
		"\u0000\u00db\u00dc\u0005\f\u0000\u0000\u00dc\u00dd\u0003\u0014\n\u0000"+
		"\u00dd\u00de\u0005&\u0000\u0000\u00de\u00df\u0003\u0002\u0001\u0000\u00df"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e0\u00db\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e8\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\r\u0000\u0000\u00e6\u00e7"+
		"\u0005&\u0000\u0000\u00e7\u00e9\u0003\u0002\u0001\u0000\u00e8\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u0013\u0001"+
		"\u0000\u0000\u0000\u00ea\u00f7\u00032\u0019\u0000\u00eb\u00ec\u0005\u0013"+
		"\u0000\u0000\u00ec\u00f7\u0003\u0016\u000b\u0000\u00ed\u00f3\u0003\u0016"+
		"\u000b\u0000\u00ee\u00ef\u0003\u001c\u000e\u0000\u00ef\u00f0\u0003\u0016"+
		"\u000b\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00ea\u0001\u0000"+
		"\u0000\u0000\u00f6\u00eb\u0001\u0000\u0000\u0000\u00f6\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f7\u0015\u0001\u0000\u0000\u0000\u00f8\u00fb\u0003\u0018"+
		"\f\u0000\u00f9\u00fb\u0003\u001a\r\u0000\u00fa\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u0017\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u00030\u0018\u0000\u00fd\u00fe\u00051\u0000\u0000\u00fe"+
		"\u00ff\u0005\u0004\u0000\u0000\u00ff\u0100\u00052\u0000\u0000\u0100\u0122"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u00030\u0018\u0000\u0102\u0103\u0005"+
		"1\u0000\u0000\u0103\u0104\u0005\u0003\u0000\u0000\u0104\u0105\u00052\u0000"+
		"\u0000\u0105\u0122\u0001\u0000\u0000\u0000\u0106\u0109\u00030\u0018\u0000"+
		"\u0107\u0108\u00057\u0000\u0000\u0108\u010a\u00030\u0018\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0122"+
		"\u0001\u0000\u0000\u0000\u010d\u0110\u00030\u0018\u0000\u010e\u010f\u0005"+
		"7\u0000\u0000\u010f\u0111\u0003\u0018\f\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0122\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005-\u0000\u0000\u0115\u0117\u0005/\u0000\u0000"+
		"\u0116\u0118\u0003>\u001f\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u0122\u00050\u0000\u0000\u011a\u011b\u0005.\u0000\u0000\u011b\u011d\u0005"+
		"/\u0000\u0000\u011c\u011e\u0003>\u001f\u0000\u011d\u011c\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0122\u00050\u0000\u0000\u0120\u0122\u00030\u0018\u0000\u0121"+
		"\u00fc\u0001\u0000\u0000\u0000\u0121\u0101\u0001\u0000\u0000\u0000\u0121"+
		"\u0106\u0001\u0000\u0000\u0000\u0121\u010d\u0001\u0000\u0000\u0000\u0121"+
		"\u0114\u0001\u0000\u0000\u0000\u0121\u011a\u0001\u0000\u0000\u0000\u0121"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0019\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005/\u0000\u0000\u0124\u0125\u0003\"\u0011\u0000\u0125\u0126"+
		"\u00050\u0000\u0000\u0126\u0136\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"1\u0000\u0000\u0128\u0129\u0003\"\u0011\u0000\u0129\u012a\u00052\u0000"+
		"\u0000\u012a\u0136\u0001\u0000\u0000\u0000\u012b\u012d\u00053\u0000\u0000"+
		"\u012c\u012e\u00036\u001b\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0136\u00054\u0000\u0000\u0130\u0132\u00051\u0000\u0000\u0131\u0133\u0003"+
		"4\u001a\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u00052\u0000"+
		"\u0000\u0135\u0123\u0001\u0000\u0000\u0000\u0135\u0127\u0001\u0000\u0000"+
		"\u0000\u0135\u012b\u0001\u0000\u0000\u0000\u0135\u0130\u0001\u0000\u0000"+
		"\u0000\u0136\u001b\u0001\u0000\u0000\u0000\u0137\u0145\u0005#\u0000\u0000"+
		"\u0138\u0145\u0005\"\u0000\u0000\u0139\u0145\u0005\u001b\u0000\u0000\u013a"+
		"\u0145\u0005\u001d\u0000\u0000\u013b\u0145\u0005\u001e\u0000\u0000\u013c"+
		"\u0145\u0005\u001c\u0000\u0000\u013d\u0145\u0005\u0012\u0000\u0000\u013e"+
		"\u0145\u0005\u000f\u0000\u0000\u013f\u0140\u0005\u0013\u0000\u0000\u0140"+
		"\u0145\u0005\u000f\u0000\u0000\u0141\u0145\u0005\u0017\u0000\u0000\u0142"+
		"\u0143\u0005\u0017\u0000\u0000\u0143\u0145\u0005\u0013\u0000\u0000\u0144"+
		"\u0137\u0001\u0000\u0000\u0000\u0144\u0138\u0001\u0000\u0000\u0000\u0144"+
		"\u0139\u0001\u0000\u0000\u0000\u0144\u013a\u0001\u0000\u0000\u0000\u0144"+
		"\u013b\u0001\u0000\u0000\u0000\u0144\u013c\u0001\u0000\u0000\u0000\u0144"+
		"\u013d\u0001\u0000\u0000\u0000\u0144\u013e\u0001\u0000\u0000\u0000\u0144"+
		"\u013f\u0001\u0000\u0000\u0000\u0144\u0141\u0001\u0000\u0000\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0145\u001d\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0003\u0016\u000b\u0000\u0147\u0148\u0005!\u0000\u0000\u0148\u014a"+
		"\u0003\u0016\u000b\u0000\u0149\u014b\u0005,\u0000\u0000\u014a\u0149\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u015f\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0003\u0016\u000b\u0000\u014d\u014e\u0005"+
		"!\u0000\u0000\u014e\u0150\u0003\u0014\n\u0000\u014f\u0151\u0005,\u0000"+
		"\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000"+
		"\u0000\u0151\u015f\u0001\u0000\u0000\u0000\u0152\u0153\u0003\u0016\u000b"+
		"\u0000\u0153\u0154\u0005!\u0000\u0000\u0154\u0156\u0003<\u001e\u0000\u0155"+
		"\u0157\u0005,\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0001\u0000\u0000\u0000\u0157\u015f\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0003\u0016\u000b\u0000\u0159\u015a\u0005!\u0000\u0000\u015a\u015c\u0003"+
		" \u0010\u0000\u015b\u015d\u0005,\u0000\u0000\u015c\u015b\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000\u0000"+
		"\u0000\u015e\u0146\u0001\u0000\u0000\u0000\u015e\u014c\u0001\u0000\u0000"+
		"\u0000\u015e\u0152\u0001\u0000\u0000\u0000\u015e\u0158\u0001\u0000\u0000"+
		"\u0000\u015f\u001f\u0001\u0000\u0000\u0000\u0160\u0161\u00058\u0000\u0000"+
		"\u0161!\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u000e\u0000\u0000\u0163"+
		"\u0164\u00030\u0018\u0000\u0164\u0165\u0005\u000f\u0000\u0000\u0165\u0166"+
		"\u0003\u0016\u000b\u0000\u0166\u0167\u0005&\u0000\u0000\u0167\u0168\u0003"+
		"\u0002\u0001\u0000\u0168\u0173\u0001\u0000\u0000\u0000\u0169\u016a\u0003"+
		"0\u0018\u0000\u016a\u016b\u0005\u000e\u0000\u0000\u016b\u016c\u00030\u0018"+
		"\u0000\u016c\u016d\u0005\u000f\u0000\u0000\u016d\u0170\u0003\u0016\u000b"+
		"\u0000\u016e\u016f\u0005\u000b\u0000\u0000\u016f\u0171\u0003\u0014\n\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0162\u0001\u0000\u0000\u0000"+
		"\u0172\u0169\u0001\u0000\u0000\u0000\u0173#\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0005\u0018\u0000\u0000\u0175\u0176\u0003\u0014\n\u0000\u0176\u0177"+
		"\u0005&\u0000\u0000\u0177\u0178\u0003\u0002\u0001\u0000\u0178%\u0001\u0000"+
		"\u0000\u0000\u0179\u017b\u0003(\u0014\u0000\u017a\u0179\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0005\u0006\u0000\u0000\u017d\u017e\u0005.\u0000\u0000"+
		"\u017e\u017f\u0003*\u0015\u0000\u017f\u0180\u0005&\u0000\u0000\u0180\u0181"+
		"\u0003\u0002\u0001\u0000\u0181\'\u0001\u0000\u0000\u0000\u0182\u0183\u0005"+
		"\u001a\u0000\u0000\u0183\u0188\u0005.\u0000\u0000\u0184\u0185\u00057\u0000"+
		"\u0000\u0185\u0187\u0005.\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u0190\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018d\u0005/\u0000\u0000\u018c"+
		"\u018e\u0003>\u001f\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191"+
		"\u00050\u0000\u0000\u0190\u018b\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0005"+
		",\u0000\u0000\u0193)\u0001\u0000\u0000\u0000\u0194\u0196\u0005/\u0000"+
		"\u0000\u0195\u0197\u0003,\u0016\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u00050\u0000\u0000\u0199+\u0001\u0000\u0000\u0000\u019a\u019f"+
		"\u0003.\u0017\u0000\u019b\u019c\u0005(\u0000\u0000\u019c\u019e\u0003."+
		"\u0017\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a0-\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0005.\u0000\u0000\u01a3\u01a4\u0005!\u0000\u0000\u01a4"+
		"\u01a7\u00030\u0018\u0000\u01a5\u01a7\u0005.\u0000\u0000\u01a6\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7/\u0001\u0000"+
		"\u0000\u0000\u01a8\u01af\u0005.\u0000\u0000\u01a9\u01af\u0005-\u0000\u0000"+
		"\u01aa\u01af\u0005\u0004\u0000\u0000\u01ab\u01af\u0005\u0003\u0000\u0000"+
		"\u01ac\u01af\u0005\u0016\u0000\u0000\u01ad\u01af\u00032\u0019\u0000\u01ae"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ae\u01a9\u0001\u0000\u0000\u0000\u01ae"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01ae"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af"+
		"1\u0001\u0000\u0000\u0000\u01b0\u01b3\u0005\u0014\u0000\u0000\u01b1\u01b3"+
		"\u0005\u0015\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b33\u0001\u0000\u0000\u0000\u01b4\u01b9\u0003"+
		"0\u0018\u0000\u01b5\u01b6\u0005(\u0000\u0000\u01b6\u01b8\u00030\u0018"+
		"\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bc\u01be\u0005(\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0001\u0000\u0000\u0000\u01be5\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c4\u00038\u001c\u0000\u01c0\u01c1\u0005(\u0000\u0000\u01c1\u01c3\u0003"+
		"8\u001c\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c9\u0005(\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c97\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u00030\u0018\u0000\u01cb\u01cc\u0005&\u0000\u0000\u01cc\u01cd"+
		"\u00030\u0018\u0000\u01cd\u01d3\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003"+
		"0\u0018\u0000\u01cf\u01d0\u0005&\u0000\u0000\u01d0\u01d1\u0003:\u001d"+
		"\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01ca\u0001\u0000\u0000"+
		"\u0000\u01d2\u01ce\u0001\u0000\u0000\u0000\u01d39\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d7\u0003<\u001e\u0000\u01d5\u01d7\u0003\u0014\n\u0000\u01d6"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7"+
		";\u0001\u0000\u0000\u0000\u01d8\u01db\u0003\u0016\u000b\u0000\u01d9\u01da"+
		"\u0005)\u0000\u0000\u01da\u01dc\u0003\u0016\u000b\u0000\u01db\u01d9\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01db\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01f5\u0001"+
		"\u0000\u0000\u0000\u01df\u01e2\u0003\u0016\u000b\u0000\u01e0\u01e1\u0005"+
		"*\u0000\u0000\u01e1\u01e3\u0003\u0016\u000b\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01f5\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e9\u0003\u0016\u000b\u0000\u01e7\u01e8\u0005$\u0000"+
		"\u0000\u01e8\u01ea\u0003\u0016\u000b\u0000\u01e9\u01e7\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01f5\u0001\u0000\u0000"+
		"\u0000\u01ed\u01f0\u0003\u0016\u000b\u0000\u01ee\u01ef\u0005%\u0000\u0000"+
		"\u01ef\u01f1\u0003\u0016\u000b\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f4\u01d8\u0001\u0000\u0000\u0000\u01f4\u01df\u0001\u0000\u0000\u0000"+
		"\u01f4\u01e6\u0001\u0000\u0000\u0000\u01f4\u01ed\u0001\u0000\u0000\u0000"+
		"\u01f5=\u0001\u0000\u0000\u0000\u01f6\u01fb\u00030\u0018\u0000\u01f7\u01f8"+
		"\u0005(\u0000\u0000\u01f8\u01fa\u00030\u0018\u0000\u01f9\u01f7\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0200\u0005(\u0000"+
		"\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000"+
		"\u0000\u0200\u020d\u0001\u0000\u0000\u0000\u0201\u0206\u0003@ \u0000\u0202"+
		"\u0203\u0005(\u0000\u0000\u0203\u0205\u0003@ \u0000\u0204\u0202\u0001"+
		"\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u020a\u0001"+
		"\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020b\u0005"+
		"(\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u01f6\u0001\u0000"+
		"\u0000\u0000\u020c\u0201\u0001\u0000\u0000\u0000\u020d?\u0001\u0000\u0000"+
		"\u0000\u020e\u0213\u0003\u0016\u000b\u0000\u020f\u0210\u0005.\u0000\u0000"+
		"\u0210\u0211\u0005!\u0000\u0000\u0211\u0213\u0003\u0016\u000b\u0000\u0212"+
		"\u020e\u0001\u0000\u0000\u0000\u0212\u020f\u0001\u0000\u0000\u0000\u0213"+
		"A\u0001\u0000\u0000\u0000LEKRWZ^bdhlptx|\u0080\u0084\u0088\u008c\u0090"+
		"\u0094\u0096\u00a0\u00a8\u00b1\u00ba\u00c3\u00cb\u00d0\u00d5\u00e2\u00e8"+
		"\u00f3\u00f6\u00fa\u010b\u0112\u0117\u011d\u0121\u012d\u0132\u0135\u0144"+
		"\u014a\u0150\u0156\u015c\u015e\u0170\u0172\u017a\u0188\u018d\u0190\u0196"+
		"\u019f\u01a6\u01ae\u01b2\u01b9\u01bd\u01c4\u01c8\u01d2\u01d6\u01dd\u01e4"+
		"\u01eb\u01f2\u01f4\u01fb\u01ff\u0206\u020a\u020c\u0212";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}