// Generated from c:/Users/dell/psychic-broccoli/grammars/PythonParser.g4 by ANTLR 4.13.1
package antlr.python;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		RULE_global_stmt = 4, RULE_import_from = 5, RULE_imptd = 6, RULE_if_stmt = 7, 
		RULE_condition = 8, RULE_python_expr = 9, RULE_atom_expr = 10, RULE_complex_expr = 11, 
		RULE_comp_op = 12, RULE_assign_stmt = 13, RULE_template_literal = 14, 
		RULE_for_loop = 15, RULE_while_loop = 16, RULE_func_def = 17, RULE_dec = 18, 
		RULE_parameters = 19, RULE_fun_params = 20, RULE_atom = 21, RULE_bool_exp = 22, 
		RULE_list_items = 23, RULE_dict_maker = 24, RULE_key_value = 25, RULE_simple_expr = 26, 
		RULE_arithmetic_expr = 27, RULE_arglist = 28, RULE_argument = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "compound_stmt", "return_stmt", "global_stmt", "import_from", 
			"imptd", "if_stmt", "condition", "python_expr", "atom_expr", "complex_expr", 
			"comp_op", "assign_stmt", "template_literal", "for_loop", "while_loop", 
			"func_def", "dec", "parameters", "fun_params", "atom", "bool_exp", "list_items", 
			"dict_maker", "key_value", "simple_expr", "arithmetic_expr", "arglist", 
			"argument"
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
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(NEWLINE);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3078632649607672L) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PassStatementContext extends StatementContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public PassStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CompoundStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(74);
					match(NEWLINE);
					setState(75);
					match(INDENT);
					}
				}

				setState(79); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(78);
						compound_stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(81); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(83);
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
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(86);
					match(NEWLINE);
					setState(87);
					match(INDENT);
					}
				}

				setState(90);
				match(PASS);
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(91);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends Compound_stmtContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AssignmentStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementContext extends Compound_stmtContext {
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public GlobalStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopStatementContext extends Compound_stmtContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ForLoopStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends Compound_stmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ReturnStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PythonExpressionContext extends Compound_stmtContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public PythonExpressionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExpressionContext extends Compound_stmtContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AtomExpressionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends Compound_stmtContext {
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public FunctionDefinitionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends Compound_stmtContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public WhileStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends Compound_stmtContext {
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ImportStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends Compound_stmtContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public SimpleExpressionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compound_stmt);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				if_stmt();
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(97);
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
				setState(100);
				assign_stmt();
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(101);
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
				setState(104);
				atom_expr();
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(105);
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
				setState(108);
				simple_expr();
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(109);
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
				setState(112);
				for_loop();
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(113);
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
				setState(116);
				python_expr();
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(117);
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
				setState(120);
				func_def();
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(121);
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
				setState(124);
				return_stmt();
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(125);
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
				setState(128);
				while_loop();
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(129);
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
				setState(132);
				import_from();
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(133);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new GlobalStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(136);
				global_stmt();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(137);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexReturnContext extends Return_stmtContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public ComplexReturnContext(Return_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_return_stmt);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ComplexReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(RETURN);
				setState(143);
				python_expr();
				}
				break;
			case 2:
				_localctx = new SimpleReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(RETURN);
				setState(145);
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
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_global_stmt);
		int _la;
		try {
			_localctx = new GlobalStatementDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(GLOBAL);
			setState(149);
			match(NAME);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				match(NAME);
				}
				}
				setState(156);
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
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_from);
		int _la;
		try {
			_localctx = new ImportFromDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(FROM);
			setState(158);
			match(NAME);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(159);
				match(DOT);
				setState(160);
				match(NAME);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(IMPORT);
			setState(167);
			imptd();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(168);
				match(COMMA);
				setState(169);
				imptd();
				}
				}
				setState(174);
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
	}

	public final ImptdContext imptd() throws RecognitionException {
		ImptdContext _localctx = new ImptdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imptd);
		int _la;
		try {
			_localctx = new ImportedContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==CLASS_NAME || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(176);
				match(AS);
				setState(177);
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
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stmt);
		try {
			int _alt;
			_localctx = new IfStatementDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IF);
			setState(181);
			condition();
			setState(182);
			match(COLON);
			setState(183);
			statement();
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					match(ELIF);
					setState(185);
					condition();
					setState(186);
					match(COLON);
					setState(187);
					statement();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(194);
				match(ELSE);
				setState(195);
				match(COLON);
				setState(196);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanConditionContext extends ConditionContext {
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public BooleanConditionContext(ConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public NotExpressionContext(ConditionContext ctx) { copyFrom(ctx); }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			int _alt;
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new BooleanConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				bool_exp();
				}
				break;
			case 2:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(NOT);
				setState(201);
				python_expr();
				}
				break;
			case 3:
				_localctx = new ComparisonExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				python_expr();
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(203);
						comp_op();
						setState(204);
						python_expr();
						}
						} 
					}
					setState(210);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexExpressionContext extends Python_exprContext {
		public Complex_exprContext complex_expr() {
			return getRuleContext(Complex_exprContext.class,0);
		}
		public ComplexExpressionContext(Python_exprContext ctx) { copyFrom(ctx); }
	}

	public final Python_exprContext python_expr() throws RecognitionException {
		Python_exprContext _localctx = new Python_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_python_expr);
		try {
			setState(215);
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
				setState(213);
				atom_expr();
				}
				break;
			case LP:
			case LBRACK:
			case LKBRACE:
				_localctx = new ComplexExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleVarContext extends Atom_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SimpleVarContext(Atom_exprContext ctx) { copyFrom(ctx); }
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
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom_expr);
		int _la;
		try {
			int _alt;
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ListAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				atom();
				setState(218);
				match(LBRACK);
				setState(219);
				match(NUMBER);
				setState(220);
				match(RBRACK);
				}
				break;
			case 2:
				_localctx = new DictionaryAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				atom();
				setState(223);
				match(LBRACK);
				setState(224);
				match(STRING);
				setState(225);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new AttributeAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				atom();
				setState(230); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(228);
						match(DOT);
						setState(229);
						atom();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(232); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new MethodAccessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				atom();
				setState(237); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(235);
						match(DOT);
						setState(236);
						atom_expr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(239); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				_localctx = new ObjectCreationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(CLASS_NAME);
				setState(242);
				match(LP);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3061040379068440L) != 0)) {
					{
					setState(243);
					arglist();
					}
				}

				setState(246);
				match(RP);
				}
				break;
			case 6:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				match(NAME);
				setState(248);
				match(LP);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3061040379068440L) != 0)) {
					{
					setState(249);
					arglist();
					}
				}

				setState(252);
				match(RP);
				}
				break;
			case 7:
				_localctx = new SimpleVarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(253);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends Complex_exprContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public List_itemsContext list_items() {
			return getRuleContext(List_itemsContext.class,0);
		}
		public ListLiteralContext(Complex_exprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListComprehensionContext extends Complex_exprContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public ListComprehensionContext(Complex_exprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorContext extends Complex_exprContext {
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public GeneratorContext(Complex_exprContext ctx) { copyFrom(ctx); }
	}

	public final Complex_exprContext complex_expr() throws RecognitionException {
		Complex_exprContext _localctx = new Complex_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_complex_expr);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new GeneratorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(LP);
				setState(257);
				for_loop();
				setState(258);
				match(RP);
				}
				break;
			case 2:
				_localctx = new ListComprehensionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(LBRACK);
				setState(261);
				for_loop();
				setState(262);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new DictionaryLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(LKBRACE);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 105553123606552L) != 0)) {
					{
					setState(265);
					dict_maker();
					}
				}

				setState(268);
				match(RKBRACE);
				}
				break;
			case 4:
				_localctx = new ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				match(LBRACK);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 105553123606552L) != 0)) {
					{
					setState(270);
					list_items();
					}
				}

				setState(273);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOperatorContext extends Comp_opContext {
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public LessThanOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InOperatorContext extends Comp_opContext {
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public InOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOperatorContext extends Comp_opContext {
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public GreaterThanOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNotOperatorContext extends Comp_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public IsNotOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqualOperatorContext extends Comp_opContext {
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public LessEqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqualOperatorContext extends Comp_opContext {
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public GreaterEqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInOperatorContext extends Comp_opContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public NotInOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsOperatorContext extends Comp_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public IsOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualOperatorContext extends Comp_opContext {
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public NotEqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualOperatorContext extends Comp_opContext {
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public EqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comp_op);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new LessThanOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(LT);
				}
				break;
			case 2:
				_localctx = new GreaterThanOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(GT);
				}
				break;
			case 3:
				_localctx = new EqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(EQ);
				}
				break;
			case 4:
				_localctx = new GreaterEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(GTE);
				}
				break;
			case 5:
				_localctx = new LessEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(LTE);
				}
				break;
			case 6:
				_localctx = new NotEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				match(NEQ);
				}
				break;
			case 7:
				_localctx = new OrOperatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				match(OR);
				}
				break;
			case 8:
				_localctx = new InOperatorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(283);
				match(IN);
				}
				break;
			case 9:
				_localctx = new NotInOperatorContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(284);
				match(NOT);
				setState(285);
				match(IN);
				}
				break;
			case 10:
				_localctx = new IsOperatorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(286);
				match(IS);
				}
				break;
			case 11:
				_localctx = new IsNotOperatorContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(287);
				match(IS);
				setState(288);
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
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_stmt);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new PythonExpressionAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				python_expr();
				setState(292);
				match(ASSIGN);
				setState(293);
				python_expr();
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(294);
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
				setState(297);
				python_expr();
				setState(298);
				match(ASSIGN);
				setState(299);
				condition();
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(300);
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
				setState(303);
				python_expr();
				setState(304);
				match(ASSIGN);
				setState(305);
				arithmetic_expr();
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(306);
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
				setState(309);
				python_expr();
				setState(310);
				match(ASSIGN);
				setState(311);
				template_literal();
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(312);
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
	}

	public final Template_literalContext template_literal() throws RecognitionException {
		Template_literalContext _localctx = new Template_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_template_literal);
		try {
			_localctx = new TemplateLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_for_loop);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new SimpleForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(FOR);
				setState(320);
				atom();
				setState(321);
				match(IN);
				setState(322);
				python_expr();
				setState(323);
				match(COLON);
				setState(324);
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
				setState(326);
				atom();
				setState(327);
				match(FOR);
				setState(328);
				atom();
				setState(329);
				match(IN);
				setState(330);
				python_expr();
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(331);
					match(IF);
					setState(332);
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
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_loop);
		try {
			_localctx = new WhileStatementDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(WHILE);
			setState(338);
			condition();
			setState(339);
			match(COLON);
			setState(340);
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
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func_def);
		int _la;
		try {
			_localctx = new FunctionDefDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(342);
				dec();
				}
			}

			setState(345);
			match(DEF);
			setState(346);
			match(NAME);
			setState(347);
			parameters();
			setState(348);
			match(COLON);
			setState(349);
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
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dec);
		int _la;
		try {
			_localctx = new DecoratorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(AT);
			setState(352);
			match(NAME);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(353);
				match(DOT);
				setState(354);
				match(NAME);
				}
				}
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(360);
				match(LP);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3061040379068440L) != 0)) {
					{
					setState(361);
					arglist();
					}
				}

				setState(364);
				match(RP);
				}
			}

			setState(367);
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameters);
		int _la;
		try {
			_localctx = new FunctionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LP);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(370);
				fun_params();
				}
			}

			setState(373);
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
	public static class KeywordParamsContext extends Fun_paramsContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(PythonParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(PythonParser.ASSIGN, i);
		}
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
		public KeywordParamsContext(Fun_paramsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalParamsContext extends Fun_paramsContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public PositionalParamsContext(Fun_paramsContext ctx) { copyFrom(ctx); }
	}

	public final Fun_paramsContext fun_params() throws RecognitionException {
		Fun_paramsContext _localctx = new Fun_paramsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fun_params);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new KeywordParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(NAME);
				setState(376);
				match(ASSIGN);
				setState(377);
				atom();
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(378);
					match(COMMA);
					setState(379);
					match(NAME);
					setState(380);
					match(ASSIGN);
					setState(381);
					atom();
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new PositionalParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(NAME);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(388);
					match(COMMA);
					setState(389);
					match(NAME);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameAtomContext extends AtomContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public NameAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneAtomContext extends AtomContext {
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public NoneAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomContext extends AtomContext {
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassAtomContext extends AtomContext {
		public TerminalNode CLASS_NAME() { return getToken(PythonParser.CLASS_NAME, 0); }
		public ClassAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new NameAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(NAME);
				}
				break;
			case CLASS_NAME:
				_localctx = new ClassAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(CLASS_NAME);
				}
				break;
			case NUMBER:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(STRING);
				}
				break;
			case NONE:
				_localctx = new NoneAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				match(NONE);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(402);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseAtomContext extends Bool_expContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public FalseAtomContext(Bool_expContext ctx) { copyFrom(ctx); }
	}

	public final Bool_expContext bool_exp() throws RecognitionException {
		Bool_expContext _localctx = new Bool_expContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bool_exp);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
	}

	public final List_itemsContext list_items() throws RecognitionException {
		List_itemsContext _localctx = new List_itemsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_list_items);
		int _la;
		try {
			int _alt;
			_localctx = new ListItemsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			atom();
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					match(COMMA);
					setState(411);
					atom();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(417);
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
	}

	public final Dict_makerContext dict_maker() throws RecognitionException {
		Dict_makerContext _localctx = new Dict_makerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dict_maker);
		int _la;
		try {
			int _alt;
			_localctx = new KeyValuePairsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			key_value();
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(421);
					match(COMMA);
					setState(422);
					key_value();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(428);
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
	}

	public final Key_valueContext key_value() throws RecognitionException {
		Key_valueContext _localctx = new Key_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_key_value);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new AtomKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				atom();
				setState(432);
				match(COLON);
				setState(433);
				atom();
				}
				break;
			case 2:
				_localctx = new SimpleKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				atom();
				setState(436);
				match(COLON);
				setState(437);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends Simple_exprContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ArithmeticExpressionContext(Simple_exprContext ctx) { copyFrom(ctx); }
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_simple_expr);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new ArithmeticExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				arithmetic_expr();
				}
				break;
			case 2:
				_localctx = new SimpleComparisonExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
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
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithmetic_expr);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				python_expr();
				setState(448); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(446);
					match(PLUS);
					setState(447);
					python_expr();
					}
					}
					setState(450); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case 2:
				_localctx = new SubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				python_expr();
				setState(455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(453);
					match(MINUS);
					setState(454);
					python_expr();
					}
					}
					setState(457); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				}
				break;
			case 3:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				python_expr();
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(460);
					match(SLASH);
					setState(461);
					python_expr();
					}
					}
					setState(464); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SLASH );
				}
				break;
			case 4:
				_localctx = new MultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				python_expr();
				setState(469); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(467);
					match(STAR);
					setState(468);
					python_expr();
					}
					}
					setState(471); 
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
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arglist);
		int _la;
		try {
			int _alt;
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new AtomArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				atom();
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(476);
						match(COMMA);
						setState(477);
						atom();
						}
						} 
					}
					setState(482);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(483);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new ComplexArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				argument();
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(487);
						match(COMMA);
						setState(488);
						argument();
						}
						} 
					}
					setState(493);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(494);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordArgumentContext extends ArgumentContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public KeywordArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_argument);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				python_expr();
				}
				break;
			case 2:
				_localctx = new KeywordArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(NAME);
				setState(501);
				match(ASSIGN);
				setState(502);
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
		"\u0004\u00018\u01fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0005\u0000"+
		">\b\u0000\n\u0000\f\u0000A\t\u0000\u0001\u0000\u0005\u0000D\b\u0000\n"+
		"\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001M\b\u0001\u0001\u0001\u0004\u0001P\b\u0001\u000b\u0001\f\u0001"+
		"Q\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"Y\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001]\b\u0001\u0003\u0001_\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u0002c\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002g\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002k\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002o\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002s\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002w\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002{\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u007f\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0083\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0087\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u008b\b\u0002\u0003\u0002\u008d\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0093\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0099\b\u0004\n\u0004\f\u0004"+
		"\u009c\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00a2\b\u0005\n\u0005\f\u0005\u00a5\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00ab\b\u0005\n\u0005\f\u0005\u00ae\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b3\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00be\b\u0007\n\u0007\f\u0007\u00c1"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c6\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00cf"+
		"\b\b\n\b\f\b\u00d2\t\b\u0003\b\u00d4\b\b\u0001\t\u0001\t\u0003\t\u00d8"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00e7\b\n\u000b\n\f\n\u00e8"+
		"\u0001\n\u0001\n\u0001\n\u0004\n\u00ee\b\n\u000b\n\f\n\u00ef\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00f5\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00fb"+
		"\b\n\u0001\n\u0001\n\u0003\n\u00ff\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u010b\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0110\b\u000b\u0001\u000b\u0003\u000b\u0113\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0122\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0128\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u012e\b\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0134\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u013a\b\r\u0003\r\u013c\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u014e\b\u000f\u0003\u000f\u0150\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0003\u0011\u0158\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0164\b\u0012\n\u0012\f\u0012\u0167\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u016b\b\u0012\u0001\u0012\u0003\u0012\u016e\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0174"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u017f\b\u0014\n"+
		"\u0014\f\u0014\u0182\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0187\b\u0014\n\u0014\f\u0014\u018a\t\u0014\u0003\u0014\u018c\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0194\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0198"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u019d\b\u0017"+
		"\n\u0017\f\u0017\u01a0\t\u0017\u0001\u0017\u0003\u0017\u01a3\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01a8\b\u0018\n\u0018\f\u0018"+
		"\u01ab\t\u0018\u0001\u0018\u0003\u0018\u01ae\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u01b8\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01bc"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u01c1\b\u001b"+
		"\u000b\u001b\f\u001b\u01c2\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b"+
		"\u01c8\b\u001b\u000b\u001b\f\u001b\u01c9\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0004\u001b\u01cf\b\u001b\u000b\u001b\f\u001b\u01d0\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0004\u001b\u01d6\b\u001b\u000b\u001b\f\u001b"+
		"\u01d7\u0003\u001b\u01da\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u01df\b\u001c\n\u001c\f\u001c\u01e2\t\u001c\u0001\u001c\u0003\u001c"+
		"\u01e5\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01ea\b"+
		"\u001c\n\u001c\f\u001c\u01ed\t\u001c\u0001\u001c\u0003\u001c\u01f0\b\u001c"+
		"\u0003\u001c\u01f2\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01f8\b\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:\u0000\u0001\u0001\u0000-.\u0246\u0000?\u0001\u0000\u0000"+
		"\u0000\u0002^\u0001\u0000\u0000\u0000\u0004\u008c\u0001\u0000\u0000\u0000"+
		"\u0006\u0092\u0001\u0000\u0000\u0000\b\u0094\u0001\u0000\u0000\u0000\n"+
		"\u009d\u0001\u0000\u0000\u0000\f\u00af\u0001\u0000\u0000\u0000\u000e\u00b4"+
		"\u0001\u0000\u0000\u0000\u0010\u00d3\u0001\u0000\u0000\u0000\u0012\u00d7"+
		"\u0001\u0000\u0000\u0000\u0014\u00fe\u0001\u0000\u0000\u0000\u0016\u0112"+
		"\u0001\u0000\u0000\u0000\u0018\u0121\u0001\u0000\u0000\u0000\u001a\u013b"+
		"\u0001\u0000\u0000\u0000\u001c\u013d\u0001\u0000\u0000\u0000\u001e\u014f"+
		"\u0001\u0000\u0000\u0000 \u0151\u0001\u0000\u0000\u0000\"\u0157\u0001"+
		"\u0000\u0000\u0000$\u015f\u0001\u0000\u0000\u0000&\u0171\u0001\u0000\u0000"+
		"\u0000(\u018b\u0001\u0000\u0000\u0000*\u0193\u0001\u0000\u0000\u0000,"+
		"\u0197\u0001\u0000\u0000\u0000.\u0199\u0001\u0000\u0000\u00000\u01a4\u0001"+
		"\u0000\u0000\u00002\u01b7\u0001\u0000\u0000\u00004\u01bb\u0001\u0000\u0000"+
		"\u00006\u01d9\u0001\u0000\u0000\u00008\u01f1\u0001\u0000\u0000\u0000:"+
		"\u01f7\u0001\u0000\u0000\u0000<>\u0005,\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@E\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BD\u0003"+
		"\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0000\u0000\u0001I\u0001\u0001"+
		"\u0000\u0000\u0000JK\u0005,\u0000\u0000KM\u0005\u0001\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000"+
		"NP\u0003\u0004\u0002\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000"+
		"\u0000\u0000SU\u0005\u0002\u0000\u0000TS\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U_\u0001\u0000\u0000\u0000VW\u0005,\u0000\u0000WY\u0005"+
		"\u0001\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\\\u0005\u0005\u0000\u0000[]\u0005\u0002\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000"+
		"\u0000\u0000^L\u0001\u0000\u0000\u0000^X\u0001\u0000\u0000\u0000_\u0003"+
		"\u0001\u0000\u0000\u0000`b\u0003\u000e\u0007\u0000ac\u0005,\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u008d\u0001\u0000"+
		"\u0000\u0000df\u0003\u001a\r\u0000eg\u0005,\u0000\u0000fe\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000g\u008d\u0001\u0000\u0000\u0000"+
		"hj\u0003\u0014\n\u0000ik\u0005,\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000k\u008d\u0001\u0000\u0000\u0000ln\u00034\u001a"+
		"\u0000mo\u0005,\u0000\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000o\u008d\u0001\u0000\u0000\u0000pr\u0003\u001e\u000f\u0000qs\u0005"+
		",\u0000\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u008d"+
		"\u0001\u0000\u0000\u0000tv\u0003\u0012\t\u0000uw\u0005,\u0000\u0000vu"+
		"\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u008d\u0001\u0000"+
		"\u0000\u0000xz\u0003\"\u0011\u0000y{\u0005,\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{\u008d\u0001\u0000\u0000\u0000"+
		"|~\u0003\u0006\u0003\u0000}\u007f\u0005,\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u008d\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u0003 \u0010\u0000\u0081\u0083\u0005,\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u008d"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0003\n\u0005\u0000\u0085\u0087\u0005"+
		",\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u008d\u0001\u0000\u0000\u0000\u0088\u008a\u0003\b\u0004"+
		"\u0000\u0089\u008b\u0005,\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000"+
		"\u008c`\u0001\u0000\u0000\u0000\u008cd\u0001\u0000\u0000\u0000\u008ch"+
		"\u0001\u0000\u0000\u0000\u008cl\u0001\u0000\u0000\u0000\u008cp\u0001\u0000"+
		"\u0000\u0000\u008ct\u0001\u0000\u0000\u0000\u008cx\u0001\u0000\u0000\u0000"+
		"\u008c|\u0001\u0000\u0000\u0000\u008c\u0080\u0001\u0000\u0000\u0000\u008c"+
		"\u0084\u0001\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008d"+
		"\u0005\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0007\u0000\u0000\u008f"+
		"\u0093\u0003\u0012\t\u0000\u0090\u0091\u0005\u0007\u0000\u0000\u0091\u0093"+
		"\u0003*\u0015\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u0007\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\u0010\u0000\u0000\u0095\u009a\u0005.\u0000\u0000\u0096\u0097\u0005(\u0000"+
		"\u0000\u0097\u0099\u0005.\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\t\u0001\u0000\u0000\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005\b\u0000\u0000\u009e\u00a3"+
		"\u0005.\u0000\u0000\u009f\u00a0\u00057\u0000\u0000\u00a0\u00a2\u0005."+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\t\u0000\u0000\u00a7\u00ac\u0003\f\u0006"+
		"\u0000\u00a8\u00a9\u0005(\u0000\u0000\u00a9\u00ab\u0003\f\u0006\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u000b\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00b2\u0007\u0000\u0000\u0000\u00b0\u00b1\u0005\n\u0000\u0000\u00b1"+
		"\u00b3\u0007\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\r\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u000b\u0000\u0000\u00b5\u00b6\u0003\u0010\b\u0000\u00b6\u00b7\u0005"+
		"&\u0000\u0000\u00b7\u00bf\u0003\u0002\u0001\u0000\u00b8\u00b9\u0005\f"+
		"\u0000\u0000\u00b9\u00ba\u0003\u0010\b\u0000\u00ba\u00bb\u0005&\u0000"+
		"\u0000\u00bb\u00bc\u0003\u0002\u0001\u0000\u00bc\u00be\u0001\u0000\u0000"+
		"\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c5\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\r\u0000\u0000\u00c3\u00c4\u0005&\u0000\u0000"+
		"\u00c4\u00c6\u0003\u0002\u0001\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u000f\u0001\u0000\u0000\u0000"+
		"\u00c7\u00d4\u0003,\u0016\u0000\u00c8\u00c9\u0005\u0013\u0000\u0000\u00c9"+
		"\u00d4\u0003\u0012\t\u0000\u00ca\u00d0\u0003\u0012\t\u0000\u00cb\u00cc"+
		"\u0003\u0018\f\u0000\u00cc\u00cd\u0003\u0012\t\u0000\u00cd\u00cf\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00c7\u0001\u0000\u0000\u0000\u00d3\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d3\u00ca\u0001\u0000\u0000\u0000\u00d4\u0011\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0003\u0014\n\u0000\u00d6\u00d8\u0003\u0016"+
		"\u000b\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u0013\u0001\u0000\u0000\u0000\u00d9\u00da\u0003*\u0015"+
		"\u0000\u00da\u00db\u00051\u0000\u0000\u00db\u00dc\u0005\u0004\u0000\u0000"+
		"\u00dc\u00dd\u00052\u0000\u0000\u00dd\u00ff\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0003*\u0015\u0000\u00df\u00e0\u00051\u0000\u0000\u00e0\u00e1\u0005"+
		"\u0003\u0000\u0000\u00e1\u00e2\u00052\u0000\u0000\u00e2\u00ff\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0003*\u0015\u0000\u00e4\u00e5\u00057\u0000\u0000"+
		"\u00e5\u00e7\u0003*\u0015\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ff\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0003*\u0015\u0000\u00eb\u00ec\u00057\u0000\u0000\u00ec\u00ee\u0003"+
		"\u0014\n\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ff\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005-\u0000"+
		"\u0000\u00f2\u00f4\u0005/\u0000\u0000\u00f3\u00f5\u00038\u001c\u0000\u00f4"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00ff\u00050\u0000\u0000\u00f7\u00f8"+
		"\u0005.\u0000\u0000\u00f8\u00fa\u0005/\u0000\u0000\u00f9\u00fb\u00038"+
		"\u001c\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00ff\u00050\u0000"+
		"\u0000\u00fd\u00ff\u0003*\u0015\u0000\u00fe\u00d9\u0001\u0000\u0000\u0000"+
		"\u00fe\u00de\u0001\u0000\u0000\u0000\u00fe\u00e3\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ea\u0001\u0000\u0000\u0000\u00fe\u00f1\u0001\u0000\u0000\u0000"+
		"\u00fe\u00f7\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0015\u0001\u0000\u0000\u0000\u0100\u0101\u0005/\u0000\u0000\u0101"+
		"\u0102\u0003\u001e\u000f\u0000\u0102\u0103\u00050\u0000\u0000\u0103\u0113"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u00051\u0000\u0000\u0105\u0106\u0003"+
		"\u001e\u000f\u0000\u0106\u0107\u00052\u0000\u0000\u0107\u0113\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u00053\u0000\u0000\u0109\u010b\u00030\u0018\u0000"+
		"\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0113\u00054\u0000\u0000\u010d"+
		"\u010f\u00051\u0000\u0000\u010e\u0110\u0003.\u0017\u0000\u010f\u010e\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u0113\u00052\u0000\u0000\u0112\u0100\u0001\u0000"+
		"\u0000\u0000\u0112\u0104\u0001\u0000\u0000\u0000\u0112\u0108\u0001\u0000"+
		"\u0000\u0000\u0112\u010d\u0001\u0000\u0000\u0000\u0113\u0017\u0001\u0000"+
		"\u0000\u0000\u0114\u0122\u0005#\u0000\u0000\u0115\u0122\u0005\"\u0000"+
		"\u0000\u0116\u0122\u0005\u001b\u0000\u0000\u0117\u0122\u0005\u001d\u0000"+
		"\u0000\u0118\u0122\u0005\u001e\u0000\u0000\u0119\u0122\u0005\u001c\u0000"+
		"\u0000\u011a\u0122\u0005\u0012\u0000\u0000\u011b\u0122\u0005\u000f\u0000"+
		"\u0000\u011c\u011d\u0005\u0013\u0000\u0000\u011d\u0122\u0005\u000f\u0000"+
		"\u0000\u011e\u0122\u0005\u0017\u0000\u0000\u011f\u0120\u0005\u0017\u0000"+
		"\u0000\u0120\u0122\u0005\u0013\u0000\u0000\u0121\u0114\u0001\u0000\u0000"+
		"\u0000\u0121\u0115\u0001\u0000\u0000\u0000\u0121\u0116\u0001\u0000\u0000"+
		"\u0000\u0121\u0117\u0001\u0000\u0000\u0000\u0121\u0118\u0001\u0000\u0000"+
		"\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u011a\u0001\u0000\u0000"+
		"\u0000\u0121\u011b\u0001\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000"+
		"\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0122\u0019\u0001\u0000\u0000\u0000\u0123\u0124\u0003\u0012\t\u0000"+
		"\u0124\u0125\u0005!\u0000\u0000\u0125\u0127\u0003\u0012\t\u0000\u0126"+
		"\u0128\u0005,\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u013c\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0003\u0012\t\u0000\u012a\u012b\u0005!\u0000\u0000\u012b\u012d\u0003"+
		"\u0010\b\u0000\u012c\u012e\u0005,\u0000\u0000\u012d\u012c\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u013c\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0003\u0012\t\u0000\u0130\u0131\u0005!\u0000"+
		"\u0000\u0131\u0133\u00036\u001b\u0000\u0132\u0134\u0005,\u0000\u0000\u0133"+
		"\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u013c\u0001\u0000\u0000\u0000\u0135\u0136\u0003\u0012\t\u0000\u0136\u0137"+
		"\u0005!\u0000\u0000\u0137\u0139\u0003\u001c\u000e\u0000\u0138\u013a\u0005"+
		",\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0123\u0001\u0000"+
		"\u0000\u0000\u013b\u0129\u0001\u0000\u0000\u0000\u013b\u012f\u0001\u0000"+
		"\u0000\u0000\u013b\u0135\u0001\u0000\u0000\u0000\u013c\u001b\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u00058\u0000\u0000\u013e\u001d\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0005\u000e\u0000\u0000\u0140\u0141\u0003*\u0015\u0000"+
		"\u0141\u0142\u0005\u000f\u0000\u0000\u0142\u0143\u0003\u0012\t\u0000\u0143"+
		"\u0144\u0005&\u0000\u0000\u0144\u0145\u0003\u0002\u0001\u0000\u0145\u0150"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0003*\u0015\u0000\u0147\u0148\u0005"+
		"\u000e\u0000\u0000\u0148\u0149\u0003*\u0015\u0000\u0149\u014a\u0005\u000f"+
		"\u0000\u0000\u014a\u014d\u0003\u0012\t\u0000\u014b\u014c\u0005\u000b\u0000"+
		"\u0000\u014c\u014e\u0003\u0010\b\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u013f\u0001\u0000\u0000\u0000\u014f\u0146\u0001\u0000\u0000\u0000"+
		"\u0150\u001f\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0018\u0000\u0000"+
		"\u0152\u0153\u0003\u0010\b\u0000\u0153\u0154\u0005&\u0000\u0000\u0154"+
		"\u0155\u0003\u0002\u0001\u0000\u0155!\u0001\u0000\u0000\u0000\u0156\u0158"+
		"\u0003$\u0012\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		"\u0006\u0000\u0000\u015a\u015b\u0005.\u0000\u0000\u015b\u015c\u0003&\u0013"+
		"\u0000\u015c\u015d\u0005&\u0000\u0000\u015d\u015e\u0003\u0002\u0001\u0000"+
		"\u015e#\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u001a\u0000\u0000\u0160"+
		"\u0165\u0005.\u0000\u0000\u0161\u0162\u00057\u0000\u0000\u0162\u0164\u0005"+
		".\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000"+
		"\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000"+
		"\u0000\u0000\u0166\u016d\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0168\u016a\u0005/\u0000\u0000\u0169\u016b\u00038\u001c\u0000"+
		"\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u00050\u0000\u0000\u016d"+
		"\u0168\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0005,\u0000\u0000\u0170%\u0001"+
		"\u0000\u0000\u0000\u0171\u0173\u0005/\u0000\u0000\u0172\u0174\u0003(\u0014"+
		"\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u00050\u0000\u0000"+
		"\u0176\'\u0001\u0000\u0000\u0000\u0177\u0178\u0005.\u0000\u0000\u0178"+
		"\u0179\u0005!\u0000\u0000\u0179\u0180\u0003*\u0015\u0000\u017a\u017b\u0005"+
		"(\u0000\u0000\u017b\u017c\u0005.\u0000\u0000\u017c\u017d\u0005!\u0000"+
		"\u0000\u017d\u017f\u0003*\u0015\u0000\u017e\u017a\u0001\u0000\u0000\u0000"+
		"\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u018c\u0001\u0000\u0000\u0000"+
		"\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0188\u0005.\u0000\u0000\u0184"+
		"\u0185\u0005(\u0000\u0000\u0185\u0187\u0005.\u0000\u0000\u0186\u0184\u0001"+
		"\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018c\u0001"+
		"\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u0177\u0001"+
		"\u0000\u0000\u0000\u018b\u0183\u0001\u0000\u0000\u0000\u018c)\u0001\u0000"+
		"\u0000\u0000\u018d\u0194\u0005.\u0000\u0000\u018e\u0194\u0005-\u0000\u0000"+
		"\u018f\u0194\u0005\u0004\u0000\u0000\u0190\u0194\u0005\u0003\u0000\u0000"+
		"\u0191\u0194\u0005\u0016\u0000\u0000\u0192\u0194\u0003,\u0016\u0000\u0193"+
		"\u018d\u0001\u0000\u0000\u0000\u0193\u018e\u0001\u0000\u0000\u0000\u0193"+
		"\u018f\u0001\u0000\u0000\u0000\u0193\u0190\u0001\u0000\u0000\u0000\u0193"+
		"\u0191\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194"+
		"+\u0001\u0000\u0000\u0000\u0195\u0198\u0005\u0014\u0000\u0000\u0196\u0198"+
		"\u0005\u0015\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198-\u0001\u0000\u0000\u0000\u0199\u019e\u0003"+
		"*\u0015\u0000\u019a\u019b\u0005(\u0000\u0000\u019b\u019d\u0003*\u0015"+
		"\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000"+
		"\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000"+
		"\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a3\u0005(\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3/\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a9\u00032\u0019\u0000\u01a5\u01a6\u0005(\u0000\u0000\u01a6\u01a8\u0003"+
		"2\u0019\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ae\u0005(\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae1\u0001\u0000\u0000\u0000"+
		"\u01af\u01b0\u0003*\u0015\u0000\u01b0\u01b1\u0005&\u0000\u0000\u01b1\u01b2"+
		"\u0003*\u0015\u0000\u01b2\u01b8\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003"+
		"*\u0015\u0000\u01b4\u01b5\u0005&\u0000\u0000\u01b5\u01b6\u00034\u001a"+
		"\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01af\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b3\u0001\u0000\u0000\u0000\u01b83\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bc\u00036\u001b\u0000\u01ba\u01bc\u0003\u0010\b\u0000\u01bb"+
		"\u01b9\u0001\u0000\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc"+
		"5\u0001\u0000\u0000\u0000\u01bd\u01c0\u0003\u0012\t\u0000\u01be\u01bf"+
		"\u0005)\u0000\u0000\u01bf\u01c1\u0003\u0012\t\u0000\u01c0\u01be\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01da\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c7\u0003\u0012\t\u0000\u01c5\u01c6\u0005*"+
		"\u0000\u0000\u01c6\u01c8\u0003\u0012\t\u0000\u01c7\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01da\u0001\u0000\u0000"+
		"\u0000\u01cb\u01ce\u0003\u0012\t\u0000\u01cc\u01cd\u0005$\u0000\u0000"+
		"\u01cd\u01cf\u0003\u0012\t\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d1\u01da\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d5\u0003\u0012\t\u0000\u01d3\u01d4\u0005%\u0000\u0000\u01d4\u01d6"+
		"\u0003\u0012\t\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01bd\u0001"+
		"\u0000\u0000\u0000\u01d9\u01c4\u0001\u0000\u0000\u0000\u01d9\u01cb\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d2\u0001\u0000\u0000\u0000\u01da7\u0001\u0000"+
		"\u0000\u0000\u01db\u01e0\u0003*\u0015\u0000\u01dc\u01dd\u0005(\u0000\u0000"+
		"\u01dd\u01df\u0003*\u0015\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e5\u0005(\u0000\u0000\u01e4\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01f2"+
		"\u0001\u0000\u0000\u0000\u01e6\u01eb\u0003:\u001d\u0000\u01e7\u01e8\u0005"+
		"(\u0000\u0000\u01e8\u01ea\u0003:\u001d\u0000\u01e9\u01e7\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f0\u0005(\u0000\u0000"+
		"\u01ef\u01ee\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01db\u0001\u0000\u0000\u0000"+
		"\u01f1\u01e6\u0001\u0000\u0000\u0000\u01f29\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f8\u0003\u0012\t\u0000\u01f4\u01f5\u0005.\u0000\u0000\u01f5\u01f6"+
		"\u0005!\u0000\u0000\u01f6\u01f8\u0003\u0012\t\u0000\u01f7\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f4\u0001\u0000\u0000\u0000\u01f8;\u0001\u0000"+
		"\u0000\u0000I?ELQTX\\^bfjnrvz~\u0082\u0086\u008a\u008c\u0092\u009a\u00a3"+
		"\u00ac\u00b2\u00bf\u00c5\u00d0\u00d3\u00d7\u00e8\u00ef\u00f4\u00fa\u00fe"+
		"\u010a\u010f\u0112\u0121\u0127\u012d\u0133\u0139\u013b\u014d\u014f\u0157"+
		"\u0165\u016a\u016d\u0173\u0180\u0188\u018b\u0193\u0197\u019e\u01a2\u01a9"+
		"\u01ad\u01b7\u01bb\u01c2\u01c9\u01d0\u01d7\u01d9\u01e0\u01e4\u01eb\u01ef"+
		"\u01f1\u01f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}