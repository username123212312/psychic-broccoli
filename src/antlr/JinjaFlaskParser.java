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
		INDENT=1, DEDENT=2, NEWLINE=3, WS=4, COMMENT=5, DEF=6, RETURN=7, FROM=8, 
		IMPORT=9, AS=10, IF=11, ELIF=12, ELSE=13, FOR=14, IN=15, GLOBAL=16, AND=17, 
		OR=18, NOT=19, TRUE=20, FALSE=21, NONE=22, IS=23, PRINT=24, WHILE=25, 
		ARROW=26, AT=27, EQ=28, NEQ=29, GTE=30, LTE=31, SLASHSLASH=32, POW=33, 
		ASSIGN=34, GT=35, LT=36, SLASH=37, STAR=38, COLON=39, SEMI=40, COMMA=41, 
		PLUS=42, MINUS=43, MOD=44, LP=45, RP=46, LBRACK=47, RBRACK=48, LKBRACE=49, 
		RKBRACE=50, DOT=51, NAME=52, NUMBER=53, STRING=54, TRIPLE_DOUBLE_START=55, 
		TRIPLE_SINGLE_START=56, TRIPLE_DOUBLE_END=57, TRIPLE_SINGLE_END=58, JINJA_EXPR_START=59, 
		JINJA_STMT_START=60, JINJA_COMMENT_START=61, HTML_COMMENT=62, HTML_CONDITIONAL_COMMENT=63, 
		XML_DECLARATION=64, CDATA=65, DTD=66, SCRIPTLET=67, SEA_WS=68, SCRIPT_OPEN=69, 
		STYLE_OPEN=70, TAG_OPEN=71, HTML_TEXT=72, TAG_CLOSE=73, TAG_SLASH_CLOSE=74, 
		TAG_SLASH=75, TAG_EQUALS=76, TAG_NAME=77, TAG_WHITESPACE=78, ATTVALUE_VALUE=79, 
		SCRIPT_BODY=80, STYLE_CLOSE=81, CSS_LBRACE=82, CSS_RBRACE=83, CSS_LPAREN=84, 
		CSS_RPAREN=85, CSS_COLON=86, CSS_SEMI=87, CSS_COMMA=88, CSS_DOT=89, CSS_GT=90, 
		CSS_HASH=91, CSS_HEX_COLOR=92, CSS_NUMBER=93, CSS_UNIT=94, CSS_STRING=95, 
		CSS_ID=96, CSS_Space=97, CSS_Comment=98, JINJA_EXPR_END=99, JINJA_STMT_END=100, 
		J_EXTENDS=101, J_BLOCK=102, J_ENDBLOCK=103, J_FOR=104, J_ENDFOR=105, J_IF=106, 
		J_ENDIF=107, J_IN=108, J_LENGTH=109, J_OR=110, J_AND=111, J_NOT=112, J_IS=113, 
		J_FILTER=114, J_TRUE=115, J_FALSE=116, J_NONE=117, J_LPAREN=118, J_RPAREN=119, 
		J_COMMA=120, J_DOT=121, J_PIPE=122, J_EQ=123, J_NEQ=124, J_GT=125, J_LT=126, 
		J_ASSIGN=127, J_NUMBER=128, J_STRING=129, J_NAME=130, J_WS=131;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simple_stmt = 2, RULE_small_stmt = 3, 
		RULE_import_stmt = 4, RULE_import_name = 5, RULE_import_from = 6, RULE_import_as_names = 7, 
		RULE_import_as_name = 8, RULE_dotted_name = 9, RULE_return_stmt = 10, 
		RULE_testlist = 11, RULE_test = 12, RULE_or_test = 13, RULE_and_test = 14, 
		RULE_not_test = 15, RULE_comparison = 16, RULE_comp_op = 17, RULE_global_stmt = 18, 
		RULE_expr = 19, RULE_term = 20, RULE_factor = 21, RULE_power = 22, RULE_atom_expr = 23, 
		RULE_trailer = 24, RULE_flow_stmt = 25, RULE_compound_stmt = 26, RULE_if_stmt = 27, 
		RULE_suite = 28, RULE_assign_stmt = 29, RULE_template_literal = 30, RULE_decorated = 31, 
		RULE_decorators = 32, RULE_decorator = 33, RULE_func_def = 34, RULE_parameters = 35, 
		RULE_typedargslist = 36, RULE_atom = 37, RULE_list_content = 38, RULE_dict_maker = 39, 
		RULE_arglist = 40, RULE_argument = 41, RULE_html_content = 42, RULE_htmlElement = 43, 
		RULE_tag_content = 44, RULE_stylesheet = 45, RULE_ruleSet = 46, RULE_selectorList = 47, 
		RULE_selector = 48, RULE_simpleSelector = 49, RULE_declarationList = 50, 
		RULE_declaration = 51, RULE_cssValueTerms = 52, RULE_cssterm = 53, RULE_cssfunctionCall = 54, 
		RULE_jinjaStatement = 55, RULE_jinjaExpression = 56, RULE_jStatement = 57, 
		RULE_extends_stmt = 58, RULE_block_stmt = 59, RULE_for_stmt = 60, RULE_j_if_stmt = 61, 
		RULE_expression = 62, RULE_call_expr = 63, RULE_var_access = 64, RULE_argument_list = 65, 
		RULE_j_argument = 66, RULE_j_atom = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simple_stmt", "small_stmt", "import_stmt", "import_name", 
			"import_from", "import_as_names", "import_as_name", "dotted_name", "return_stmt", 
			"testlist", "test", "or_test", "and_test", "not_test", "comparison", 
			"comp_op", "global_stmt", "expr", "term", "factor", "power", "atom_expr", 
			"trailer", "flow_stmt", "compound_stmt", "if_stmt", "suite", "assign_stmt", 
			"template_literal", "decorated", "decorators", "decorator", "func_def", 
			"parameters", "typedargslist", "atom", "list_content", "dict_maker", 
			"arglist", "argument", "html_content", "htmlElement", "tag_content", 
			"stylesheet", "ruleSet", "selectorList", "selector", "simpleSelector", 
			"declarationList", "declaration", "cssValueTerms", "cssterm", "cssfunctionCall", 
			"jinjaStatement", "jinjaExpression", "jStatement", "extends_stmt", "block_stmt", 
			"for_stmt", "j_if_stmt", "expression", "call_expr", "var_access", "argument_list", 
			"j_argument", "j_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'def'", "'return'", "'from'", "'import'", 
			"'as'", null, "'elif'", "'else'", null, null, "'global'", null, null, 
			null, "'True'", "'False'", "'None'", null, "'print'", "'while'", "'->'", 
			"'@'", null, null, "'>='", "'<='", "'//'", "'**'", null, null, null, 
			null, "'*'", null, null, null, "'+'", "'-'", "'%'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'{{'", 
			"'{%'", "'{#'", "'d'", null, null, null, null, null, null, null, null, 
			null, null, null, "'/>'", null, null, null, null, null, null, null, "'{'", 
			"'}'", null, null, null, null, null, null, null, "'#'", null, null, null, 
			null, null, null, null, "'}}'", "'%}'", "'extends'", "'block'", "'endblock'", 
			null, "'endfor'", null, "'endif'", null, "'length'", null, null, null, 
			null, "'filter'", "'true'", "'false'", "'none'", null, null, null, null, 
			"'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "NEWLINE", "WS", "COMMENT", "DEF", "RETURN", 
			"FROM", "IMPORT", "AS", "IF", "ELIF", "ELSE", "FOR", "IN", "GLOBAL", 
			"AND", "OR", "NOT", "TRUE", "FALSE", "NONE", "IS", "PRINT", "WHILE", 
			"ARROW", "AT", "EQ", "NEQ", "GTE", "LTE", "SLASHSLASH", "POW", "ASSIGN", 
			"GT", "LT", "SLASH", "STAR", "COLON", "SEMI", "COMMA", "PLUS", "MINUS", 
			"MOD", "LP", "RP", "LBRACK", "RBRACK", "LKBRACE", "RKBRACE", "DOT", "NAME", 
			"NUMBER", "STRING", "TRIPLE_DOUBLE_START", "TRIPLE_SINGLE_START", "TRIPLE_DOUBLE_END", 
			"TRIPLE_SINGLE_END", "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_COMMENT_START", 
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", "CDATA", 
			"DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", 
			"HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME", "TAG_WHITESPACE", "ATTVALUE_VALUE", "SCRIPT_BODY", "STYLE_CLOSE", 
			"CSS_LBRACE", "CSS_RBRACE", "CSS_LPAREN", "CSS_RPAREN", "CSS_COLON", 
			"CSS_SEMI", "CSS_COMMA", "CSS_DOT", "CSS_GT", "CSS_HASH", "CSS_HEX_COLOR", 
			"CSS_NUMBER", "CSS_UNIT", "CSS_STRING", "CSS_ID", "CSS_Space", "CSS_Comment", 
			"JINJA_EXPR_END", "JINJA_STMT_END", "J_EXTENDS", "J_BLOCK", "J_ENDBLOCK", 
			"J_FOR", "J_ENDFOR", "J_IF", "J_ENDIF", "J_IN", "J_LENGTH", "J_OR", "J_AND", 
			"J_NOT", "J_IS", "J_FILTER", "J_TRUE", "J_FALSE", "J_NONE", "J_LPAREN", 
			"J_RPAREN", "J_COMMA", "J_DOT", "J_PIPE", "J_EQ", "J_NEQ", "J_GT", "J_LT", 
			"J_ASSIGN", "J_NUMBER", "J_STRING", "J_NAME", "J_WS"
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
		public List<TerminalNode> NEWLINE() { return getTokens(JinjaFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JinjaFlaskParser.NEWLINE, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(JinjaFlaskParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(JinjaFlaskParser.DEDENT, i);
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
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32278362998246348L) != 0)) {
				{
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(136);
					statement();
					}
					break;
				case 2:
					{
					setState(137);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(138);
					match(DEDENT);
					}
					break;
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
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
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case IF:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				compound_stmt();
				}
				break;
			case NEWLINE:
			case RETURN:
			case FROM:
			case IMPORT:
			case GLOBAL:
			case TRUE:
			case FALSE:
			case NONE:
			case SEMI:
			case PLUS:
			case MINUS:
			case LP:
			case LBRACK:
			case LKBRACE:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				simple_stmt();
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
		public List<TerminalNode> SEMI() { return getTokens(JinjaFlaskParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JinjaFlaskParser.SEMI, i);
		}
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
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
		enterRule(_localctx, 4, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32277263352398720L) != 0)) {
				{
				setState(150);
				small_stmt();
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						match(SEMI);
						setState(152);
						small_stmt();
						}
						} 
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
			}

			setState(160);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SEMI) ) {
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
	public static class Small_stmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
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
		enterRule(_localctx, 6, RULE_small_stmt);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				import_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				return_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				global_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				flow_stmt();
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
	public static class Import_stmtContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterImport_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitImport_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_stmt);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				import_from();
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
	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(JinjaFlaskParser.IMPORT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(JinjaFlaskParser.AS, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterImport_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitImport_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_import_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IMPORT);
			setState(175);
			dotted_name();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(176);
				match(AS);
				setState(177);
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
	public static class Import_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(JinjaFlaskParser.FROM, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(JinjaFlaskParser.IMPORT, 0); }
		public TerminalNode STAR() { return getToken(JinjaFlaskParser.STAR, 0); }
		public Import_as_namesContext import_as_names() {
			return getRuleContext(Import_as_namesContext.class,0);
		}
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterImport_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitImport_from(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitImport_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_import_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(FROM);
			setState(181);
			dotted_name();
			setState(182);
			match(IMPORT);
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(183);
				match(STAR);
				}
				break;
			case NAME:
				{
				setState(184);
				import_as_names();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Import_as_namesContext extends ParserRuleContext {
		public List<Import_as_nameContext> import_as_name() {
			return getRuleContexts(Import_as_nameContext.class);
		}
		public Import_as_nameContext import_as_name(int i) {
			return getRuleContext(Import_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public Import_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterImport_as_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitImport_as_names(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitImport_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_namesContext import_as_names() throws RecognitionException {
		Import_as_namesContext _localctx = new Import_as_namesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_import_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			import_as_name();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				import_as_name();
				}
				}
				setState(194);
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
	public static class Import_as_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public TerminalNode AS() { return getToken(JinjaFlaskParser.AS, 0); }
		public Import_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterImport_as_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitImport_as_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitImport_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_nameContext import_as_name() throws RecognitionException {
		Import_as_nameContext _localctx = new Import_as_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(NAME);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(196);
				match(AS);
				setState(197);
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
	public static class Dotted_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JinjaFlaskParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JinjaFlaskParser.DOT, i);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDotted_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDotted_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDotted_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(NAME);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(201);
				match(DOT);
				setState(202);
				match(NAME);
				}
				}
				setState(207);
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
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JinjaFlaskParser.RETURN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_stmt);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(RETURN);
				setState(209);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(RETURN);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32277263352856576L) != 0)) {
					{
					setState(211);
					testlist();
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
	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTestlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTestlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_testlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			test();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(217);
				match(COMMA);
				setState(218);
				test();
				}
				}
				setState(223);
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
	public static class TestContext extends ParserRuleContext {
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			or_test();
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
	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JinjaFlaskParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JinjaFlaskParser.OR, i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterOr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitOr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			and_test();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(227);
				match(OR);
				setState(228);
				and_test();
				}
				}
				setState(233);
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
	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JinjaFlaskParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JinjaFlaskParser.AND, i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAnd_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAnd_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			not_test();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(235);
				match(AND);
				setState(236);
				not_test();
				}
				}
				setState(241);
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
	public static class Not_testContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(JinjaFlaskParser.NOT, 0); }
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterNot_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitNot_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitNot_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_not_test);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(NOT);
				setState(243);
				not_test();
				}
				break;
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case LP:
			case LBRACK:
			case LKBRACE:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				comparison();
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
	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			expr();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 107114692608L) != 0)) {
				{
				{
				setState(248);
				comp_op();
				setState(249);
				expr();
				}
				}
				setState(255);
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
	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JinjaFlaskParser.LT, 0); }
		public TerminalNode GT() { return getToken(JinjaFlaskParser.GT, 0); }
		public TerminalNode EQ() { return getToken(JinjaFlaskParser.EQ, 0); }
		public TerminalNode GTE() { return getToken(JinjaFlaskParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(JinjaFlaskParser.LTE, 0); }
		public TerminalNode NEQ() { return getToken(JinjaFlaskParser.NEQ, 0); }
		public TerminalNode IN() { return getToken(JinjaFlaskParser.IN, 0); }
		public TerminalNode NOT() { return getToken(JinjaFlaskParser.NOT, 0); }
		public TerminalNode IS() { return getToken(JinjaFlaskParser.IS, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp_op);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(EQ);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				match(GTE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				match(LTE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				match(NEQ);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				match(IN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				match(NOT);
				setState(264);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(265);
				match(IS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(266);
				match(IS);
				setState(267);
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
	public static class Global_stmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(JinjaFlaskParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterGlobal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitGlobal_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitGlobal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(GLOBAL);
			setState(271);
			match(NAME);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(272);
				match(COMMA);
				setState(273);
				match(NAME);
				}
				}
				setState(278);
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
		enterRule(_localctx, 38, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			term();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(280);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				term();
				}
				}
				setState(286);
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
		public List<TerminalNode> SLASHSLASH() { return getTokens(JinjaFlaskParser.SLASHSLASH); }
		public TerminalNode SLASHSLASH(int i) {
			return getToken(JinjaFlaskParser.SLASHSLASH, i);
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
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			factor();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 416611827712L) != 0)) {
				{
				{
				setState(288);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 416611827712L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				factor();
				}
				}
				setState(294);
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(JinjaFlaskParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JinjaFlaskParser.MINUS, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_factor);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				factor();
				}
				break;
			case TRUE:
			case FALSE:
			case NONE:
			case LP:
			case LBRACK:
			case LKBRACE:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				power();
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
	public static class PowerContext extends ParserRuleContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			atom_expr();
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
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAtom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAtom_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAtom_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_atom_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			atom();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2427721674129408L) != 0)) {
				{
				{
				setState(303);
				trailer();
				}
				}
				setState(308);
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
	public static class TrailerContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JinjaFlaskParser.LBRACK, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JinjaFlaskParser.RBRACK, 0); }
		public TerminalNode DOT() { return getToken(JinjaFlaskParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_trailer);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(LP);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32277263352856600L) != 0)) {
					{
					setState(310);
					arglist();
					}
				}

				setState(313);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(LBRACK);
				setState(315);
				test();
				setState(316);
				match(RBRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(DOT);
				setState(319);
				match(NAME);
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
	public static class Flow_stmtContext extends ParserRuleContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFlow_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFlow_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFlow_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_flow_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			return_stmt();
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
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public DecoratedContext decorated() {
			return getRuleContext(DecoratedContext.class,0);
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
		enterRule(_localctx, 52, RULE_compound_stmt);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				if_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				func_def();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				decorated();
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
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(JinjaFlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JinjaFlaskParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(JinjaFlaskParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(JinjaFlaskParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(JinjaFlaskParser.ELSE, 0); }
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
		enterRule(_localctx, 54, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(IF);
			setState(330);
			test();
			setState(331);
			match(COLON);
			setState(332);
			suite();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(333);
				match(ELIF);
				setState(334);
				test();
				setState(335);
				match(COLON);
				setState(336);
				suite();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(343);
				match(ELSE);
				setState(344);
				match(COLON);
				setState(345);
				suite();
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
	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(JinjaFlaskParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JinjaFlaskParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_suite);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(NEWLINE);
				setState(350);
				match(INDENT);
				setState(352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(351);
					statement();
					}
					}
					setState(354); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32278362998246344L) != 0) );
				setState(356);
				match(DEDENT);
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
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JinjaFlaskParser.ASSIGN, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Template_literalContext template_literal() {
			return getRuleContext(Template_literalContext.class,0);
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
		enterRule(_localctx, 58, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			atom_expr();
			setState(361);
			match(ASSIGN);
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case LP:
			case LBRACK:
			case LKBRACE:
			case NAME:
			case NUMBER:
			case STRING:
				{
				setState(362);
				test();
				}
				break;
			case TRIPLE_DOUBLE_START:
			case TRIPLE_SINGLE_START:
				{
				setState(363);
				template_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Template_literalContext extends ParserRuleContext {
		public TerminalNode TRIPLE_DOUBLE_START() { return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_START, 0); }
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode TRIPLE_DOUBLE_END() { return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JinjaFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JinjaFlaskParser.NEWLINE, i);
		}
		public List<TerminalNode> WS() { return getTokens(JinjaFlaskParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JinjaFlaskParser.WS, i);
		}
		public TerminalNode TRIPLE_SINGLE_START() { return getToken(JinjaFlaskParser.TRIPLE_SINGLE_START, 0); }
		public TerminalNode TRIPLE_SINGLE_END() { return getToken(JinjaFlaskParser.TRIPLE_SINGLE_END, 0); }
		public Template_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTemplate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTemplate_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTemplate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_literalContext template_literal() throws RecognitionException {
		Template_literalContext _localctx = new Template_literalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_template_literal);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIPLE_DOUBLE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				match(TRIPLE_DOUBLE_START);
				setState(367);
				html_content();
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE || _la==WS) {
					{
					{
					setState(368);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(374);
				match(TRIPLE_DOUBLE_END);
				}
				break;
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(TRIPLE_SINGLE_START);
				setState(377);
				html_content();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE || _la==WS) {
					{
					{
					setState(378);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(384);
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
	public static class DecoratedContext extends ParserRuleContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public DecoratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDecorated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDecorated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDecorated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratedContext decorated() throws RecognitionException {
		DecoratedContext _localctx = new DecoratedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_decorated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			decorators();
			setState(389);
			func_def();
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
	public static class DecoratorsContext extends ParserRuleContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDecorators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDecorators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDecorators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorsContext decorators() throws RecognitionException {
		DecoratorsContext _localctx = new DecoratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(391);
				decorator();
				}
				}
				setState(394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
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
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
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
		enterRule(_localctx, 66, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(AT);
			setState(397);
			dotted_name();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(398);
				match(LP);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32277263352856600L) != 0)) {
					{
					setState(399);
					arglist();
					}
				}

				setState(402);
				match(RP);
				}
			}

			setState(405);
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
	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(JinjaFlaskParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JinjaFlaskParser.ARROW, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(DEF);
			setState(408);
			match(NAME);
			setState(409);
			parameters();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(410);
				match(ARROW);
				setState(411);
				test();
				}
			}

			setState(414);
			match(COLON);
			setState(415);
			suite();
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
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(LP);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(418);
				typedargslist();
				}
			}

			setState(421);
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
	public static class TypedargslistContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTypedargslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTypedargslist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTypedargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(NAME);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(424);
				match(COMMA);
				setState(425);
				match(NAME);
				}
				}
				setState(430);
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
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(JinjaFlaskParser.NUMBER, 0); }
		public List<TerminalNode> STRING() { return getTokens(JinjaFlaskParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JinjaFlaskParser.STRING, i);
		}
		public TerminalNode NONE() { return getToken(JinjaFlaskParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(JinjaFlaskParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JinjaFlaskParser.FALSE, 0); }
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JinjaFlaskParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JinjaFlaskParser.RBRACK, 0); }
		public List_contentContext list_content() {
			return getRuleContext(List_contentContext.class,0);
		}
		public TerminalNode LKBRACE() { return getToken(JinjaFlaskParser.LKBRACE, 0); }
		public TerminalNode RKBRACE() { return getToken(JinjaFlaskParser.RKBRACE, 0); }
		public Dict_makerContext dict_maker() {
			return getRuleContext(Dict_makerContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_atom);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(NAME);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(433);
					match(STRING);
					}
					}
					setState(436); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(439);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(440);
				match(FALSE);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 7);
				{
				setState(441);
				match(LP);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32277263352856576L) != 0)) {
					{
					setState(442);
					test();
					}
				}

				setState(445);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(446);
				match(LBRACK);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32277263352856576L) != 0)) {
					{
					setState(447);
					list_content();
					}
				}

				setState(450);
				match(RBRACK);
				}
				break;
			case LKBRACE:
				enterOuterAlt(_localctx, 9);
				{
				setState(451);
				match(LKBRACE);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32264069212798976L) != 0)) {
					{
					setState(452);
					dict_maker();
					}
				}

				setState(455);
				match(RKBRACE);
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
	public static class List_contentContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public List_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterList_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitList_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitList_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_contentContext list_content() throws RecognitionException {
		List_contentContext _localctx = new List_contentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_list_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			test();
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(459);
					match(COMMA);
					setState(460);
					test();
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(466);
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
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(JinjaFlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JinjaFlaskParser.COLON, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JinjaFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JinjaFlaskParser.NEWLINE, i);
		}
		public List<TerminalNode> WS() { return getTokens(JinjaFlaskParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JinjaFlaskParser.WS, i);
		}
		public Dict_makerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_maker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDict_maker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDict_maker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDict_maker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dict_makerContext dict_maker() throws RecognitionException {
		Dict_makerContext _localctx = new Dict_makerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dict_maker);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			atom();
			setState(470);
			match(COLON);
			setState(471);
			test();
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE || _la==WS) {
						{
						{
						setState(472);
						_la = _input.LA(1);
						if ( !(_la==NEWLINE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(477);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(478);
					match(COMMA);
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE || _la==WS) {
						{
						{
						setState(479);
						_la = _input.LA(1);
						if ( !(_la==NEWLINE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(484);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(485);
					atom();
					setState(486);
					match(COLON);
					setState(487);
					test();
					}
					} 
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2199023255576L) != 0)) {
				{
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE || _la==WS) {
					{
					{
					setState(494);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(500);
				match(COMMA);
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE || _la==WS) {
					{
					{
					setState(501);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JinjaFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JinjaFlaskParser.NEWLINE, i);
		}
		public List<TerminalNode> WS() { return getTokens(JinjaFlaskParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(JinjaFlaskParser.WS, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==WS) {
				{
				{
				setState(509);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			argument();
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(516);
					match(COMMA);
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE || _la==WS) {
						{
						{
						setState(517);
						_la = _input.LA(1);
						if ( !(_la==NEWLINE || _la==WS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(522);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(523);
					argument();
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(529);
				match(COMMA);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE || _la==WS) {
					{
					{
					setState(530);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class ArgumentContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(JinjaFlaskParser.ASSIGN, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argument);
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(NAME);
				setState(540);
				match(ASSIGN);
				setState(541);
				test();
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
	public static class Html_contentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> HTML_TEXT() { return getTokens(JinjaFlaskParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(JinjaFlaskParser.HTML_TEXT, i);
		}
		public List<JinjaStatementContext> jinjaStatement() {
			return getRuleContexts(JinjaStatementContext.class);
		}
		public JinjaStatementContext jinjaStatement(int i) {
			return getRuleContext(JinjaStatementContext.class,i);
		}
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
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
		enterRule(_localctx, 84, RULE_html_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(548);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case XML_DECLARATION:
					case CDATA:
					case DTD:
					case SCRIPTLET:
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(544);
						htmlElement();
						}
						break;
					case HTML_TEXT:
						{
						setState(545);
						match(HTML_TEXT);
						}
						break;
					case JINJA_STMT_START:
						{
						setState(546);
						jinjaStatement();
						}
						break;
					case JINJA_EXPR_START:
						{
						setState(547);
						jinjaExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(JinjaFlaskParser.TAG_OPEN, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(JinjaFlaskParser.TAG_CLOSE, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(JinjaFlaskParser.TAG_SLASH_CLOSE, 0); }
		public List<Tag_contentContext> tag_content() {
			return getRuleContexts(Tag_contentContext.class);
		}
		public Tag_contentContext tag_content(int i) {
			return getRuleContext(Tag_contentContext.class,i);
		}
		public TerminalNode SCRIPT_OPEN() { return getToken(JinjaFlaskParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(JinjaFlaskParser.SCRIPT_BODY, 0); }
		public TerminalNode STYLE_OPEN() { return getToken(JinjaFlaskParser.STYLE_OPEN, 0); }
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(JinjaFlaskParser.STYLE_CLOSE, 0); }
		public TerminalNode XML_DECLARATION() { return getToken(JinjaFlaskParser.XML_DECLARATION, 0); }
		public TerminalNode CDATA() { return getToken(JinjaFlaskParser.CDATA, 0); }
		public TerminalNode DTD() { return getToken(JinjaFlaskParser.DTD, 0); }
		public TerminalNode SCRIPTLET() { return getToken(JinjaFlaskParser.SCRIPTLET, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_htmlElement);
		int _la;
		try {
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(TAG_OPEN);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 458755L) != 0)) {
					{
					{
					setState(554);
					tag_content();
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(560);
				_la = _input.LA(1);
				if ( !(_la==TAG_CLOSE || _la==TAG_SLASH_CLOSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SCRIPT_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(SCRIPT_OPEN);
				setState(562);
				match(SCRIPT_BODY);
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				match(STYLE_OPEN);
				setState(564);
				stylesheet();
				setState(565);
				match(STYLE_CLOSE);
				}
				break;
			case XML_DECLARATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(567);
				match(XML_DECLARATION);
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(568);
				match(CDATA);
				}
				break;
			case DTD:
				enterOuterAlt(_localctx, 6);
				{
				setState(569);
				match(DTD);
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 7);
				{
				setState(570);
				match(SCRIPTLET);
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
		public TerminalNode TAG_NAME() { return getToken(JinjaFlaskParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(JinjaFlaskParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(JinjaFlaskParser.ATTVALUE_VALUE, 0); }
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(JinjaFlaskParser.TAG_SLASH, 0); }
		public Tag_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTag_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTag_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTag_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_contentContext tag_content() throws RecognitionException {
		Tag_contentContext _localctx = new Tag_contentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tag_content);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(TAG_NAME);
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(574);
					match(TAG_EQUALS);
					setState(575);
					match(ATTVALUE_VALUE);
					}
					break;
				}
				}
				break;
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				jinjaExpression();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				jinjaStatement();
				}
				break;
			case TAG_SLASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(TAG_SLASH);
				}
				break;
			case TAG_EQUALS:
				enterOuterAlt(_localctx, 5);
				{
				setState(581);
				match(TAG_EQUALS);
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
	public static class StylesheetContext extends ParserRuleContext {
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(JinjaFlaskParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(JinjaFlaskParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_Comment() { return getTokens(JinjaFlaskParser.CSS_Comment); }
		public TerminalNode CSS_Comment(int i) {
			return getToken(JinjaFlaskParser.CSS_Comment, i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_stylesheet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Space || _la==CSS_Comment) {
				{
				{
				setState(584);
				_la = _input.LA(1);
				if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590);
			ruleSet();
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CSS_Space || _la==CSS_Comment) {
						{
						{
						setState(591);
						_la = _input.LA(1);
						if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(596);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(597);
					ruleSet();
					}
					} 
				}
				setState(602);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Space || _la==CSS_Comment) {
				{
				{
				setState(603);
				_la = _input.LA(1);
				if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(608);
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
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public List<TerminalNode> CSS_Space() { return getTokens(JinjaFlaskParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(JinjaFlaskParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_Comment() { return getTokens(JinjaFlaskParser.CSS_Comment); }
		public TerminalNode CSS_Comment(int i) {
			return getToken(JinjaFlaskParser.CSS_Comment, i);
		}
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ruleSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			selectorList();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Space || _la==CSS_Comment) {
				{
				{
				setState(610);
				_la = _input.LA(1);
				if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
			match(CSS_LBRACE);
			setState(617);
			declarationList();
			setState(618);
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
	public static class SelectorListContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(JinjaFlaskParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(JinjaFlaskParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_Comment() { return getTokens(JinjaFlaskParser.CSS_Comment); }
		public TerminalNode CSS_Comment(int i) {
			return getToken(JinjaFlaskParser.CSS_Comment, i);
		}
		public SelectorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSelectorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSelectorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorListContext selectorList() throws RecognitionException {
		SelectorListContext _localctx = new SelectorListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selectorList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			selector();
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CSS_Space || _la==CSS_Comment) {
						{
						{
						setState(621);
						_la = _input.LA(1);
						if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(626);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(627);
					match(CSS_COMMA);
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CSS_Space || _la==CSS_Comment) {
						{
						{
						setState(628);
						_la = _input.LA(1);
						if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(633);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(634);
					selector();
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public List<TerminalNode> CSS_GT() { return getTokens(JinjaFlaskParser.CSS_GT); }
		public TerminalNode CSS_GT(int i) {
			return getToken(JinjaFlaskParser.CSS_GT, i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(JinjaFlaskParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(JinjaFlaskParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_Comment() { return getTokens(JinjaFlaskParser.CSS_Comment); }
		public TerminalNode CSS_Comment(int i) {
			return getToken(JinjaFlaskParser.CSS_Comment, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_selector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			simpleSelector();
			setState(658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(647);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_Space:
						{
						setState(642); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(641);
								match(CSS_Space);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(644); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case CSS_GT:
						{
						setState(646);
						match(CSS_GT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CSS_Space || _la==CSS_Comment) {
						{
						{
						setState(649);
						_la = _input.LA(1);
						if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(654);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(655);
					simpleSelector();
					}
					} 
				}
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public List<TerminalNode> CSS_ID() { return getTokens(JinjaFlaskParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(JinjaFlaskParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_DOT() { return getTokens(JinjaFlaskParser.CSS_DOT); }
		public TerminalNode CSS_DOT(int i) {
			return getToken(JinjaFlaskParser.CSS_DOT, i);
		}
		public List<TerminalNode> CSS_HASH() { return getTokens(JinjaFlaskParser.CSS_HASH); }
		public TerminalNode CSS_HASH(int i) {
			return getToken(JinjaFlaskParser.CSS_HASH, i);
		}
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_simpleSelector);
		int _la;
		try {
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				match(CSS_ID);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_DOT || _la==CSS_HASH) {
					{
					setState(666);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_DOT:
						{
						setState(662);
						match(CSS_DOT);
						setState(663);
						match(CSS_ID);
						}
						break;
					case CSS_HASH:
						{
						setState(664);
						match(CSS_HASH);
						setState(665);
						match(CSS_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(675); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(675);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_DOT:
						{
						setState(671);
						match(CSS_DOT);
						setState(672);
						match(CSS_ID);
						}
						break;
					case CSS_HASH:
						{
						setState(673);
						match(CSS_HASH);
						setState(674);
						match(CSS_ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(677); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CSS_DOT || _la==CSS_HASH );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(JinjaFlaskParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(JinjaFlaskParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_Comment() { return getTokens(JinjaFlaskParser.CSS_Comment); }
		public TerminalNode CSS_Comment(int i) {
			return getToken(JinjaFlaskParser.CSS_Comment, i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_ID) {
				{
				setState(682);
				declaration();
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 7L) != 0)) {
					{
					{
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CSS_Space || _la==CSS_Comment) {
						{
						{
						setState(683);
						_la = _input.LA(1);
						if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(688);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(689);
					declaration();
					}
					}
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode CSS_ID() { return getToken(JinjaFlaskParser.CSS_ID, 0); }
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public CssValueTermsContext cssValueTerms() {
			return getRuleContext(CssValueTermsContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(JinjaFlaskParser.CSS_SEMI, 0); }
		public List<TerminalNode> CSS_Space() { return getTokens(JinjaFlaskParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(JinjaFlaskParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_Comment() { return getTokens(JinjaFlaskParser.CSS_Comment); }
		public TerminalNode CSS_Comment(int i) {
			return getToken(JinjaFlaskParser.CSS_Comment, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(CSS_ID);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Space || _la==CSS_Comment) {
				{
				{
				setState(698);
				_la = _input.LA(1);
				if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
			match(CSS_COLON);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Space || _la==CSS_Comment) {
				{
				{
				setState(705);
				_la = _input.LA(1);
				if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(711);
			cssValueTerms();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Space || _la==CSS_Comment) {
				{
				{
				setState(712);
				_la = _input.LA(1);
				if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(718);
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
	public static class CssValueTermsContext extends ParserRuleContext {
		public List<CsstermContext> cssterm() {
			return getRuleContexts(CsstermContext.class);
		}
		public CsstermContext cssterm(int i) {
			return getRuleContext(CsstermContext.class,i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(JinjaFlaskParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(JinjaFlaskParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_Comment() { return getTokens(JinjaFlaskParser.CSS_Comment); }
		public TerminalNode CSS_Comment(int i) {
			return getToken(JinjaFlaskParser.CSS_Comment, i);
		}
		public CssValueTermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValueTerms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCssValueTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCssValueTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCssValueTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueTermsContext cssValueTerms() throws RecognitionException {
		CssValueTermsContext _localctx = new CssValueTermsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cssValueTerms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			cssterm();
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CSS_Space || _la==CSS_Comment) {
						{
						{
						setState(721);
						_la = _input.LA(1);
						if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(726);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(727);
					cssterm();
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
	public static class CsstermContext extends ParserRuleContext {
		public CssfunctionCallContext cssfunctionCall() {
			return getRuleContext(CssfunctionCallContext.class,0);
		}
		public TerminalNode CSS_STRING() { return getToken(JinjaFlaskParser.CSS_STRING, 0); }
		public TerminalNode CSS_HEX_COLOR() { return getToken(JinjaFlaskParser.CSS_HEX_COLOR, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(JinjaFlaskParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(JinjaFlaskParser.CSS_UNIT, 0); }
		public TerminalNode CSS_ID() { return getToken(JinjaFlaskParser.CSS_ID, 0); }
		public CsstermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCssterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCssterm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCssterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsstermContext cssterm() throws RecognitionException {
		CsstermContext _localctx = new CsstermContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cssterm);
		try {
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(733);
				cssfunctionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(CSS_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				match(CSS_HEX_COLOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(736);
				match(CSS_NUMBER);
				setState(737);
				match(CSS_UNIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(738);
				match(CSS_NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(739);
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
	public static class CssfunctionCallContext extends ParserRuleContext {
		public TerminalNode CSS_ID() { return getToken(JinjaFlaskParser.CSS_ID, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public List<CssValueTermsContext> cssValueTerms() {
			return getRuleContexts(CssValueTermsContext.class);
		}
		public CssValueTermsContext cssValueTerms(int i) {
			return getRuleContext(CssValueTermsContext.class,i);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
		}
		public List<TerminalNode> CSS_Space() { return getTokens(JinjaFlaskParser.CSS_Space); }
		public TerminalNode CSS_Space(int i) {
			return getToken(JinjaFlaskParser.CSS_Space, i);
		}
		public List<TerminalNode> CSS_Comment() { return getTokens(JinjaFlaskParser.CSS_Comment); }
		public TerminalNode CSS_Comment(int i) {
			return getToken(JinjaFlaskParser.CSS_Comment, i);
		}
		public CssfunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssfunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCssfunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCssfunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCssfunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssfunctionCallContext cssfunctionCall() throws RecognitionException {
		CssfunctionCallContext _localctx = new CssfunctionCallContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cssfunctionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			match(CSS_ID);
			setState(743);
			match(CSS_LPAREN);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Space || _la==CSS_Comment) {
				{
				{
				setState(744);
				_la = _input.LA(1);
				if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(750);
			cssValueTerms();
			setState(767);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CSS_Space || _la==CSS_Comment) {
						{
						{
						setState(751);
						_la = _input.LA(1);
						if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(756);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(757);
					match(CSS_COMMA);
					setState(761);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CSS_Space || _la==CSS_Comment) {
						{
						{
						setState(758);
						_la = _input.LA(1);
						if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(763);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(764);
					cssValueTerms();
					}
					} 
				}
				setState(769);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_Space || _la==CSS_Comment) {
				{
				{
				setState(770);
				_la = _input.LA(1);
				if ( !(_la==CSS_Space || _la==CSS_Comment) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776);
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
	public static class JinjaStatementContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public JStatementContext jStatement() {
			return getRuleContext(JStatementContext.class,0);
		}
		public JinjaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinjaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinjaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinjaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementContext jinjaStatement() throws RecognitionException {
		JinjaStatementContext _localctx = new JinjaStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_jinjaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(JINJA_STMT_START);
			setState(779);
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
	public static class JinjaExpressionContext extends ParserRuleContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(JinjaFlaskParser.JINJA_EXPR_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(JinjaFlaskParser.JINJA_EXPR_END, 0); }
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(JINJA_EXPR_START);
			setState(782);
			expression();
			setState(783);
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
		public Extends_stmtContext extends_stmt() {
			return getRuleContext(Extends_stmtContext.class,0);
		}
		public Block_stmtContext block_stmt() {
			return getRuleContext(Block_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public J_if_stmtContext j_if_stmt() {
			return getRuleContext(J_if_stmtContext.class,0);
		}
		public JStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JStatementContext jStatement() throws RecognitionException {
		JStatementContext _localctx = new JStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_jStatement);
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(785);
				extends_stmt();
				}
				break;
			case J_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(786);
				block_stmt();
				}
				break;
			case J_FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				for_stmt();
				}
				break;
			case J_IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(788);
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
	public static class Extends_stmtContext extends ParserRuleContext {
		public TerminalNode J_EXTENDS() { return getToken(JinjaFlaskParser.J_EXTENDS, 0); }
		public TerminalNode J_STRING() { return getToken(JinjaFlaskParser.J_STRING, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaFlaskParser.JINJA_STMT_END, 0); }
		public Extends_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extends_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterExtends_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitExtends_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitExtends_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extends_stmtContext extends_stmt() throws RecognitionException {
		Extends_stmtContext _localctx = new Extends_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_extends_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(J_EXTENDS);
			setState(792);
			match(J_STRING);
			setState(793);
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
	public static class Block_stmtContext extends ParserRuleContext {
		public TerminalNode J_BLOCK() { return getToken(JinjaFlaskParser.J_BLOCK, 0); }
		public List<TerminalNode> J_NAME() { return getTokens(JinjaFlaskParser.J_NAME); }
		public TerminalNode J_NAME(int i) {
			return getToken(JinjaFlaskParser.J_NAME, i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public TerminalNode J_ENDBLOCK() { return getToken(JinjaFlaskParser.J_ENDBLOCK, 0); }
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterBlock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitBlock_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitBlock_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_block_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(J_BLOCK);
			setState(796);
			match(J_NAME);
			setState(797);
			match(JINJA_STMT_END);
			setState(798);
			html_content();
			setState(799);
			match(JINJA_STMT_START);
			setState(800);
			match(J_ENDBLOCK);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_NAME) {
				{
				setState(801);
				match(J_NAME);
				}
			}

			setState(804);
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode J_FOR() { return getToken(JinjaFlaskParser.J_FOR, 0); }
		public TerminalNode J_NAME() { return getToken(JinjaFlaskParser.J_NAME, 0); }
		public TerminalNode J_IN() { return getToken(JinjaFlaskParser.J_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public TerminalNode J_ENDFOR() { return getToken(JinjaFlaskParser.J_ENDFOR, 0); }
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
		enterRule(_localctx, 120, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(J_FOR);
			setState(807);
			match(J_NAME);
			setState(808);
			match(J_IN);
			setState(809);
			expression();
			setState(810);
			match(JINJA_STMT_END);
			setState(811);
			html_content();
			setState(812);
			match(JINJA_STMT_START);
			setState(813);
			match(J_ENDFOR);
			setState(814);
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
		public TerminalNode J_IF() { return getToken(JinjaFlaskParser.J_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public TerminalNode J_ENDIF() { return getToken(JinjaFlaskParser.J_ENDIF, 0); }
		public J_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJ_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJ_if_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJ_if_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_if_stmtContext j_if_stmt() throws RecognitionException {
		J_if_stmtContext _localctx = new J_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_j_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(J_IF);
			setState(817);
			expression();
			setState(818);
			match(JINJA_STMT_END);
			setState(819);
			html_content();
			setState(820);
			match(JINJA_STMT_START);
			setState(821);
			match(J_ENDIF);
			setState(822);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<Call_exprContext> call_expr() {
			return getRuleContexts(Call_exprContext.class);
		}
		public Call_exprContext call_expr(int i) {
			return getRuleContext(Call_exprContext.class,i);
		}
		public TerminalNode J_EQ() { return getToken(JinjaFlaskParser.J_EQ, 0); }
		public TerminalNode J_NEQ() { return getToken(JinjaFlaskParser.J_NEQ, 0); }
		public TerminalNode J_GT() { return getToken(JinjaFlaskParser.J_GT, 0); }
		public TerminalNode J_LT() { return getToken(JinjaFlaskParser.J_LT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_expression);
		int _la;
		try {
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(824);
				call_expr();
				setState(825);
				_la = _input.LA(1);
				if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(826);
				call_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				call_expr();
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
	public static class Call_exprContext extends ParserRuleContext {
		public Var_accessContext var_access() {
			return getRuleContext(Var_accessContext.class,0);
		}
		public TerminalNode J_PIPE() { return getToken(JinjaFlaskParser.J_PIPE, 0); }
		public TerminalNode J_NAME() { return getToken(JinjaFlaskParser.J_NAME, 0); }
		public TerminalNode J_LENGTH() { return getToken(JinjaFlaskParser.J_LENGTH, 0); }
		public TerminalNode J_LPAREN() { return getToken(JinjaFlaskParser.J_LPAREN, 0); }
		public TerminalNode J_RPAREN() { return getToken(JinjaFlaskParser.J_RPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public J_atomContext j_atom() {
			return getRuleContext(J_atomContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCall_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCall_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_call_expr);
		int _la;
		try {
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				var_access();
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==J_PIPE) {
					{
					setState(832);
					match(J_PIPE);
					setState(833);
					_la = _input.LA(1);
					if ( !(_la==J_LENGTH || _la==J_NAME) ) {
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
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				match(J_NAME);
				setState(837);
				match(J_LPAREN);
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 57351L) != 0)) {
					{
					setState(838);
					argument_list();
					}
				}

				setState(841);
				match(J_RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				var_access();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
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
	public static class Var_accessContext extends ParserRuleContext {
		public List<TerminalNode> J_NAME() { return getTokens(JinjaFlaskParser.J_NAME); }
		public TerminalNode J_NAME(int i) {
			return getToken(JinjaFlaskParser.J_NAME, i);
		}
		public List<TerminalNode> J_DOT() { return getTokens(JinjaFlaskParser.J_DOT); }
		public TerminalNode J_DOT(int i) {
			return getToken(JinjaFlaskParser.J_DOT, i);
		}
		public Var_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterVar_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitVar_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitVar_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_accessContext var_access() throws RecognitionException {
		Var_accessContext _localctx = new Var_accessContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_var_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(J_NAME);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_DOT) {
				{
				{
				setState(847);
				match(J_DOT);
				setState(848);
				match(J_NAME);
				}
				}
				setState(853);
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
	public static class Argument_listContext extends ParserRuleContext {
		public List<J_argumentContext> j_argument() {
			return getRuleContexts(J_argumentContext.class);
		}
		public J_argumentContext j_argument(int i) {
			return getRuleContext(J_argumentContext.class,i);
		}
		public List<TerminalNode> J_COMMA() { return getTokens(JinjaFlaskParser.J_COMMA); }
		public TerminalNode J_COMMA(int i) {
			return getToken(JinjaFlaskParser.J_COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			j_argument();
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(855);
				match(J_COMMA);
				setState(856);
				j_argument();
				}
				}
				setState(861);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode J_NAME() { return getToken(JinjaFlaskParser.J_NAME, 0); }
		public TerminalNode J_ASSIGN() { return getToken(JinjaFlaskParser.J_ASSIGN, 0); }
		public J_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJ_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJ_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJ_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_argumentContext j_argument() throws RecognitionException {
		J_argumentContext _localctx = new J_argumentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_j_argument);
		try {
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				match(J_NAME);
				setState(864);
				match(J_ASSIGN);
				setState(865);
				expression();
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
		public TerminalNode J_NUMBER() { return getToken(JinjaFlaskParser.J_NUMBER, 0); }
		public TerminalNode J_STRING() { return getToken(JinjaFlaskParser.J_STRING, 0); }
		public TerminalNode J_TRUE() { return getToken(JinjaFlaskParser.J_TRUE, 0); }
		public TerminalNode J_FALSE() { return getToken(JinjaFlaskParser.J_FALSE, 0); }
		public TerminalNode J_NONE() { return getToken(JinjaFlaskParser.J_NONE, 0); }
		public TerminalNode J_NAME() { return getToken(JinjaFlaskParser.J_NAME, 0); }
		public J_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJ_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJ_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJ_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_atomContext j_atom() throws RecognitionException {
		J_atomContext _localctx = new J_atomContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_j_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 57351L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0083\u0367\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u008c\b\u0000\n\u0000\f\u0000\u008f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0095\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u009a\b\u0002\n\u0002\f\u0002\u009d"+
		"\t\u0002\u0003\u0002\u009f\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00a9\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00ad\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b3\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ba"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00bf\b\u0007"+
		"\n\u0007\f\u0007\u00c2\t\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00c7\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u00cc\b\t\n\t\f\t\u00cf\t\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u00d5\b\n\u0003\n\u00d7\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00dc\b\u000b\n\u000b\f\u000b\u00df"+
		"\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00e6\b\r\n\r"+
		"\f\r\u00e9\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ee\b"+
		"\u000e\n\u000e\f\u000e\u00f1\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00f6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00fc\b\u0010\n\u0010\f\u0010\u00ff\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u010d"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0113"+
		"\b\u0012\n\u0012\f\u0012\u0116\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u011b\b\u0013\n\u0013\f\u0013\u011e\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0123\b\u0014\n\u0014\f\u0014\u0126\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u012b\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u0131\b\u0017\n\u0017"+
		"\f\u0017\u0134\t\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0138\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0141\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0148\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u0153\b\u001b\n\u001b\f\u001b\u0156\t\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u015b\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u0161\b\u001c\u000b\u001c\f"+
		"\u001c\u0162\u0001\u001c\u0001\u001c\u0003\u001c\u0167\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u016d\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u0172\b\u001e\n\u001e\f\u001e\u0175"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u017c\b\u001e\n\u001e\f\u001e\u017f\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0183\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0004 \u0189\b \u000b \f \u018a\u0001!\u0001!\u0001!\u0001!\u0003!\u0191"+
		"\b!\u0001!\u0003!\u0194\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u019d\b\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0003"+
		"#\u01a4\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u01ab\b$\n$\f$\u01ae"+
		"\t$\u0001%\u0001%\u0001%\u0004%\u01b3\b%\u000b%\f%\u01b4\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u01bc\b%\u0001%\u0001%\u0001%\u0003%\u01c1"+
		"\b%\u0001%\u0001%\u0001%\u0003%\u01c6\b%\u0001%\u0003%\u01c9\b%\u0001"+
		"&\u0001&\u0001&\u0005&\u01ce\b&\n&\f&\u01d1\t&\u0001&\u0003&\u01d4\b&"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01da\b\'\n\'\f\'\u01dd\t\'\u0001"+
		"\'\u0001\'\u0005\'\u01e1\b\'\n\'\f\'\u01e4\t\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0005\'\u01ea\b\'\n\'\f\'\u01ed\t\'\u0001\'\u0005\'\u01f0\b\'"+
		"\n\'\f\'\u01f3\t\'\u0001\'\u0001\'\u0005\'\u01f7\b\'\n\'\f\'\u01fa\t\'"+
		"\u0003\'\u01fc\b\'\u0001(\u0005(\u01ff\b(\n(\f(\u0202\t(\u0001(\u0001"+
		"(\u0001(\u0005(\u0207\b(\n(\f(\u020a\t(\u0001(\u0005(\u020d\b(\n(\f(\u0210"+
		"\t(\u0001(\u0001(\u0005(\u0214\b(\n(\f(\u0217\t(\u0003(\u0219\b(\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u021f\b)\u0001*\u0001*\u0001*\u0001*\u0005"+
		"*\u0225\b*\n*\f*\u0228\t*\u0001+\u0001+\u0005+\u022c\b+\n+\f+\u022f\t"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u023c\b+\u0001,\u0001,\u0001,\u0003,\u0241\b,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u0247\b,\u0001-\u0005-\u024a\b-\n-\f-\u024d\t-"+
		"\u0001-\u0001-\u0005-\u0251\b-\n-\f-\u0254\t-\u0001-\u0005-\u0257\b-\n"+
		"-\f-\u025a\t-\u0001-\u0005-\u025d\b-\n-\f-\u0260\t-\u0001.\u0001.\u0005"+
		".\u0264\b.\n.\f.\u0267\t.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0005"+
		"/\u026f\b/\n/\f/\u0272\t/\u0001/\u0001/\u0005/\u0276\b/\n/\f/\u0279\t"+
		"/\u0001/\u0005/\u027c\b/\n/\f/\u027f\t/\u00010\u00010\u00040\u0283\b0"+
		"\u000b0\f0\u0284\u00010\u00030\u0288\b0\u00010\u00050\u028b\b0\n0\f0\u028e"+
		"\t0\u00010\u00050\u0291\b0\n0\f0\u0294\t0\u00011\u00011\u00011\u00011"+
		"\u00011\u00051\u029b\b1\n1\f1\u029e\t1\u00011\u00011\u00011\u00011\u0004"+
		"1\u02a4\b1\u000b1\f1\u02a5\u00011\u00031\u02a9\b1\u00012\u00012\u0005"+
		"2\u02ad\b2\n2\f2\u02b0\t2\u00012\u00052\u02b3\b2\n2\f2\u02b6\t2\u0003"+
		"2\u02b8\b2\u00013\u00013\u00053\u02bc\b3\n3\f3\u02bf\t3\u00013\u00013"+
		"\u00053\u02c3\b3\n3\f3\u02c6\t3\u00013\u00013\u00053\u02ca\b3\n3\f3\u02cd"+
		"\t3\u00013\u00013\u00014\u00014\u00054\u02d3\b4\n4\f4\u02d6\t4\u00014"+
		"\u00054\u02d9\b4\n4\f4\u02dc\t4\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u02e5\b5\u00016\u00016\u00016\u00056\u02ea\b6\n6\f6\u02ed"+
		"\t6\u00016\u00016\u00056\u02f1\b6\n6\f6\u02f4\t6\u00016\u00016\u00056"+
		"\u02f8\b6\n6\f6\u02fb\t6\u00016\u00056\u02fe\b6\n6\f6\u0301\t6\u00016"+
		"\u00056\u0304\b6\n6\f6\u0307\t6\u00016\u00016\u00017\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00039\u0316\b9\u0001"+
		":\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0003;\u0323\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u033e\b>\u0001"+
		"?\u0001?\u0001?\u0003?\u0343\b?\u0001?\u0001?\u0001?\u0003?\u0348\b?\u0001"+
		"?\u0001?\u0001?\u0003?\u034d\b?\u0001@\u0001@\u0001@\u0005@\u0352\b@\n"+
		"@\f@\u0355\t@\u0001A\u0001A\u0001A\u0005A\u035a\bA\nA\fA\u035d\tA\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u0363\bB\u0001C\u0001C\u0001C\u0000\u0000"+
		"D\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0000\t\u0002\u0000\u0003\u0003((\u0001\u0000*+\u0002\u0000"+
		"  %&\u0001\u0000\u0003\u0004\u0001\u0000IJ\u0001\u0000ab\u0001\u0000{"+
		"~\u0002\u0000mm\u0082\u0082\u0002\u0000su\u0080\u0082\u03b6\u0000\u008d"+
		"\u0001\u0000\u0000\u0000\u0002\u0094\u0001\u0000\u0000\u0000\u0004\u009e"+
		"\u0001\u0000\u0000\u0000\u0006\u00a8\u0001\u0000\u0000\u0000\b\u00ac\u0001"+
		"\u0000\u0000\u0000\n\u00ae\u0001\u0000\u0000\u0000\f\u00b4\u0001\u0000"+
		"\u0000\u0000\u000e\u00bb\u0001\u0000\u0000\u0000\u0010\u00c3\u0001\u0000"+
		"\u0000\u0000\u0012\u00c8\u0001\u0000\u0000\u0000\u0014\u00d6\u0001\u0000"+
		"\u0000\u0000\u0016\u00d8\u0001\u0000\u0000\u0000\u0018\u00e0\u0001\u0000"+
		"\u0000\u0000\u001a\u00e2\u0001\u0000\u0000\u0000\u001c\u00ea\u0001\u0000"+
		"\u0000\u0000\u001e\u00f5\u0001\u0000\u0000\u0000 \u00f7\u0001\u0000\u0000"+
		"\u0000\"\u010c\u0001\u0000\u0000\u0000$\u010e\u0001\u0000\u0000\u0000"+
		"&\u0117\u0001\u0000\u0000\u0000(\u011f\u0001\u0000\u0000\u0000*\u012a"+
		"\u0001\u0000\u0000\u0000,\u012c\u0001\u0000\u0000\u0000.\u012e\u0001\u0000"+
		"\u0000\u00000\u0140\u0001\u0000\u0000\u00002\u0142\u0001\u0000\u0000\u0000"+
		"4\u0147\u0001\u0000\u0000\u00006\u0149\u0001\u0000\u0000\u00008\u0166"+
		"\u0001\u0000\u0000\u0000:\u0168\u0001\u0000\u0000\u0000<\u0182\u0001\u0000"+
		"\u0000\u0000>\u0184\u0001\u0000\u0000\u0000@\u0188\u0001\u0000\u0000\u0000"+
		"B\u018c\u0001\u0000\u0000\u0000D\u0197\u0001\u0000\u0000\u0000F\u01a1"+
		"\u0001\u0000\u0000\u0000H\u01a7\u0001\u0000\u0000\u0000J\u01c8\u0001\u0000"+
		"\u0000\u0000L\u01ca\u0001\u0000\u0000\u0000N\u01d5\u0001\u0000\u0000\u0000"+
		"P\u0200\u0001\u0000\u0000\u0000R\u021e\u0001\u0000\u0000\u0000T\u0226"+
		"\u0001\u0000\u0000\u0000V\u023b\u0001\u0000\u0000\u0000X\u0246\u0001\u0000"+
		"\u0000\u0000Z\u024b\u0001\u0000\u0000\u0000\\\u0261\u0001\u0000\u0000"+
		"\u0000^\u026c\u0001\u0000\u0000\u0000`\u0280\u0001\u0000\u0000\u0000b"+
		"\u02a8\u0001\u0000\u0000\u0000d\u02b7\u0001\u0000\u0000\u0000f\u02b9\u0001"+
		"\u0000\u0000\u0000h\u02d0\u0001\u0000\u0000\u0000j\u02e4\u0001\u0000\u0000"+
		"\u0000l\u02e6\u0001\u0000\u0000\u0000n\u030a\u0001\u0000\u0000\u0000p"+
		"\u030d\u0001\u0000\u0000\u0000r\u0315\u0001\u0000\u0000\u0000t\u0317\u0001"+
		"\u0000\u0000\u0000v\u031b\u0001\u0000\u0000\u0000x\u0326\u0001\u0000\u0000"+
		"\u0000z\u0330\u0001\u0000\u0000\u0000|\u033d\u0001\u0000\u0000\u0000~"+
		"\u034c\u0001\u0000\u0000\u0000\u0080\u034e\u0001\u0000\u0000\u0000\u0082"+
		"\u0356\u0001\u0000\u0000\u0000\u0084\u0362\u0001\u0000\u0000\u0000\u0086"+
		"\u0364\u0001\u0000\u0000\u0000\u0088\u008c\u0003\u0002\u0001\u0000\u0089"+
		"\u008c\u0005\u0003\u0000\u0000\u008a\u008c\u0005\u0002\u0000\u0000\u008b"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005\u0000\u0000\u0001\u0091\u0001\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u00034\u001a\u0000\u0093\u0095\u0003\u0004\u0002\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0003"+
		"\u0001\u0000\u0000\u0000\u0096\u009b\u0003\u0006\u0003\u0000\u0097\u0098"+
		"\u0005(\u0000\u0000\u0098\u009a\u0003\u0006\u0003\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009f\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u0096\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0007\u0000\u0000\u0000\u00a1\u0005\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a9\u0003:\u001d\u0000\u00a3\u00a9\u0003\b"+
		"\u0004\u0000\u00a4\u00a9\u0003\u0014\n\u0000\u00a5\u00a9\u0003$\u0012"+
		"\u0000\u00a6\u00a9\u0003&\u0013\u0000\u00a7\u00a9\u00032\u0019\u0000\u00a8"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u0007\u0001\u0000\u0000\u0000\u00aa\u00ad\u0003\n\u0005\u0000\u00ab\u00ad"+
		"\u0003\f\u0006\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\t\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\t"+
		"\u0000\u0000\u00af\u00b2\u0003\u0012\t\u0000\u00b0\u00b1\u0005\n\u0000"+
		"\u0000\u00b1\u00b3\u00054\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u000b\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\b\u0000\u0000\u00b5\u00b6\u0003\u0012\t\u0000\u00b6"+
		"\u00b9\u0005\t\u0000\u0000\u00b7\u00ba\u0005&\u0000\u0000\u00b8\u00ba"+
		"\u0003\u000e\u0007\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\r\u0001\u0000\u0000\u0000\u00bb\u00c0\u0003"+
		"\u0010\b\u0000\u00bc\u00bd\u0005)\u0000\u0000\u00bd\u00bf\u0003\u0010"+
		"\b\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u000f\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u00054\u0000\u0000\u00c4\u00c5\u0005\n\u0000\u0000"+
		"\u00c5\u00c7\u00054\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u0011\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cd\u00054\u0000\u0000\u00c9\u00ca\u00053\u0000\u0000\u00ca\u00cc\u0005"+
		"4\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u0013\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005\u0007\u0000\u0000\u00d1\u00d7\u0003J%\u0000"+
		"\u00d2\u00d4\u0005\u0007\u0000\u0000\u00d3\u00d5\u0003\u0016\u000b\u0000"+
		"\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d7\u0015\u0001\u0000\u0000\u0000"+
		"\u00d8\u00dd\u0003\u0018\f\u0000\u00d9\u00da\u0005)\u0000\u0000\u00da"+
		"\u00dc\u0003\u0018\f\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u0017\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003\u001a\r\u0000\u00e1\u0019\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e7\u0003\u001c\u000e\u0000\u00e3\u00e4\u0005"+
		"\u0012\u0000\u0000\u00e4\u00e6\u0003\u001c\u000e\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u001b\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ef\u0003"+
		"\u001e\u000f\u0000\u00eb\u00ec\u0005\u0011\u0000\u0000\u00ec\u00ee\u0003"+
		"\u001e\u000f\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u001d\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0005\u0013\u0000\u0000\u00f3\u00f6\u0003"+
		"\u001e\u000f\u0000\u00f4\u00f6\u0003 \u0010\u0000\u00f5\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u001f\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fd\u0003&\u0013\u0000\u00f8\u00f9\u0003\"\u0011"+
		"\u0000\u00f9\u00fa\u0003&\u0013\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe!\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100"+
		"\u010d\u0005$\u0000\u0000\u0101\u010d\u0005#\u0000\u0000\u0102\u010d\u0005"+
		"\u001c\u0000\u0000\u0103\u010d\u0005\u001e\u0000\u0000\u0104\u010d\u0005"+
		"\u001f\u0000\u0000\u0105\u010d\u0005\u001d\u0000\u0000\u0106\u010d\u0005"+
		"\u000f\u0000\u0000\u0107\u0108\u0005\u0013\u0000\u0000\u0108\u010d\u0005"+
		"\u000f\u0000\u0000\u0109\u010d\u0005\u0017\u0000\u0000\u010a\u010b\u0005"+
		"\u0017\u0000\u0000\u010b\u010d\u0005\u0013\u0000\u0000\u010c\u0100\u0001"+
		"\u0000\u0000\u0000\u010c\u0101\u0001\u0000\u0000\u0000\u010c\u0102\u0001"+
		"\u0000\u0000\u0000\u010c\u0103\u0001\u0000\u0000\u0000\u010c\u0104\u0001"+
		"\u0000\u0000\u0000\u010c\u0105\u0001\u0000\u0000\u0000\u010c\u0106\u0001"+
		"\u0000\u0000\u0000\u010c\u0107\u0001\u0000\u0000\u0000\u010c\u0109\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d#\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\u0010\u0000\u0000\u010f\u0114\u00054\u0000"+
		"\u0000\u0110\u0111\u0005)\u0000\u0000\u0111\u0113\u00054\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115"+
		"%\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011c"+
		"\u0003(\u0014\u0000\u0118\u0119\u0007\u0001\u0000\u0000\u0119\u011b\u0003"+
		"(\u0014\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d\'\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011f\u0124\u0003*\u0015\u0000\u0120\u0121\u0007\u0002\u0000\u0000"+
		"\u0121\u0123\u0003*\u0015\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123"+
		"\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125)\u0001\u0000\u0000\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0007\u0001\u0000\u0000\u0128\u012b"+
		"\u0003*\u0015\u0000\u0129\u012b\u0003,\u0016\u0000\u012a\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b+\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0003.\u0017\u0000\u012d-\u0001\u0000\u0000\u0000\u012e"+
		"\u0132\u0003J%\u0000\u012f\u0131\u00030\u0018\u0000\u0130\u012f\u0001"+
		"\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133/\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0137\u0005-\u0000"+
		"\u0000\u0136\u0138\u0003P(\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u0141\u0005.\u0000\u0000\u013a\u013b\u0005/\u0000\u0000\u013b\u013c\u0003"+
		"\u0018\f\u0000\u013c\u013d\u00050\u0000\u0000\u013d\u0141\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u00053\u0000\u0000\u013f\u0141\u00054\u0000\u0000"+
		"\u0140\u0135\u0001\u0000\u0000\u0000\u0140\u013a\u0001\u0000\u0000\u0000"+
		"\u0140\u013e\u0001\u0000\u0000\u0000\u01411\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0003\u0014\n\u0000\u01433\u0001\u0000\u0000\u0000\u0144\u0148"+
		"\u00036\u001b\u0000\u0145\u0148\u0003D\"\u0000\u0146\u0148\u0003>\u001f"+
		"\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u01485\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0005\u000b\u0000\u0000\u014a\u014b\u0003\u0018\f\u0000\u014b"+
		"\u014c\u0005\'\u0000\u0000\u014c\u0154\u00038\u001c\u0000\u014d\u014e"+
		"\u0005\f\u0000\u0000\u014e\u014f\u0003\u0018\f\u0000\u014f\u0150\u0005"+
		"\'\u0000\u0000\u0150\u0151\u00038\u001c\u0000\u0151\u0153\u0001\u0000"+
		"\u0000\u0000\u0152\u014d\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155\u015a\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0005\r\u0000\u0000\u0158\u0159\u0005\'\u0000"+
		"\u0000\u0159\u015b\u00038\u001c\u0000\u015a\u0157\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b7\u0001\u0000\u0000\u0000\u015c"+
		"\u0167\u0003\u0004\u0002\u0000\u015d\u015e\u0005\u0003\u0000\u0000\u015e"+
		"\u0160\u0005\u0001\u0000\u0000\u015f\u0161\u0003\u0002\u0001\u0000\u0160"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0002\u0000\u0000\u0165"+
		"\u0167\u0001\u0000\u0000\u0000\u0166\u015c\u0001\u0000\u0000\u0000\u0166"+
		"\u015d\u0001\u0000\u0000\u0000\u01679\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0003.\u0017\u0000\u0169\u016c\u0005\"\u0000\u0000\u016a\u016d\u0003"+
		"\u0018\f\u0000\u016b\u016d\u0003<\u001e\u0000\u016c\u016a\u0001\u0000"+
		"\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d;\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u00057\u0000\u0000\u016f\u0173\u0003T*\u0000\u0170"+
		"\u0172\u0007\u0003\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0176\u0177\u00059\u0000\u0000\u0177\u0183"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u00058\u0000\u0000\u0179\u017d\u0003"+
		"T*\u0000\u017a\u017c\u0007\u0003\u0000\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0180\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0181\u0005:\u0000\u0000"+
		"\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u016e\u0001\u0000\u0000\u0000"+
		"\u0182\u0178\u0001\u0000\u0000\u0000\u0183=\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0003@ \u0000\u0185\u0186\u0003D\"\u0000\u0186?\u0001\u0000\u0000"+
		"\u0000\u0187\u0189\u0003B!\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018bA\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0005\u001b\u0000\u0000\u018d\u0193\u0003\u0012\t\u0000\u018e\u0190\u0005"+
		"-\u0000\u0000\u018f\u0191\u0003P(\u0000\u0190\u018f\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0194\u0005.\u0000\u0000\u0193\u018e\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0005\u0003\u0000\u0000\u0196C\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0005\u0006\u0000\u0000\u0198\u0199\u00054\u0000\u0000\u0199\u019c"+
		"\u0003F#\u0000\u019a\u019b\u0005\u001a\u0000\u0000\u019b\u019d\u0003\u0018"+
		"\f\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0005\'\u0000\u0000"+
		"\u019f\u01a0\u00038\u001c\u0000\u01a0E\u0001\u0000\u0000\u0000\u01a1\u01a3"+
		"\u0005-\u0000\u0000\u01a2\u01a4\u0003H$\u0000\u01a3\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0005.\u0000\u0000\u01a6G\u0001\u0000\u0000\u0000"+
		"\u01a7\u01ac\u00054\u0000\u0000\u01a8\u01a9\u0005)\u0000\u0000\u01a9\u01ab"+
		"\u00054\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01adI\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000"+
		"\u0000\u0000\u01af\u01c9\u00054\u0000\u0000\u01b0\u01c9\u00055\u0000\u0000"+
		"\u01b1\u01b3\u00056\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5\u01c9\u0001\u0000\u0000\u0000\u01b6"+
		"\u01c9\u0005\u0016\u0000\u0000\u01b7\u01c9\u0005\u0014\u0000\u0000\u01b8"+
		"\u01c9\u0005\u0015\u0000\u0000\u01b9\u01bb\u0005-\u0000\u0000\u01ba\u01bc"+
		"\u0003\u0018\f\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01c9\u0005"+
		".\u0000\u0000\u01be\u01c0\u0005/\u0000\u0000\u01bf\u01c1\u0003L&\u0000"+
		"\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c9\u00050\u0000\u0000\u01c3"+
		"\u01c5\u00051\u0000\u0000\u01c4\u01c6\u0003N\'\u0000\u01c5\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c9\u00052\u0000\u0000\u01c8\u01af\u0001\u0000"+
		"\u0000\u0000\u01c8\u01b0\u0001\u0000\u0000\u0000\u01c8\u01b2\u0001\u0000"+
		"\u0000\u0000\u01c8\u01b6\u0001\u0000\u0000\u0000\u01c8\u01b7\u0001\u0000"+
		"\u0000\u0000\u01c8\u01b8\u0001\u0000\u0000\u0000\u01c8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01c8\u01be\u0001\u0000\u0000\u0000\u01c8\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c9K\u0001\u0000\u0000\u0000\u01ca\u01cf\u0003\u0018\f"+
		"\u0000\u01cb\u01cc\u0005)\u0000\u0000\u01cc\u01ce\u0003\u0018\f\u0000"+
		"\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000"+
		"\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d4\u0005)\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4M\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0003J%\u0000\u01d6\u01d7\u0005\'\u0000\u0000\u01d7\u01eb\u0003\u0018"+
		"\f\u0000\u01d8\u01da\u0007\u0003\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000"+
		"\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01de\u0001\u0000\u0000"+
		"\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e2\u0005)\u0000\u0000"+
		"\u01df\u01e1\u0007\u0003\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e6\u0003J%\u0000\u01e6\u01e7"+
		"\u0005\'\u0000\u0000\u01e7\u01e8\u0003\u0018\f\u0000\u01e8\u01ea\u0001"+
		"\u0000\u0000\u0000\u01e9\u01db\u0001\u0000\u0000\u0000\u01ea\u01ed\u0001"+
		"\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ec\u01fb\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f0\u0007\u0003\u0000\u0000\u01ef\u01ee\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f8\u0005"+
		")\u0000\u0000\u01f5\u01f7\u0007\u0003\u0000\u0000\u01f6\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01f1\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fcO\u0001\u0000\u0000"+
		"\u0000\u01fd\u01ff\u0007\u0003\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000"+
		"\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0203\u0001\u0000\u0000"+
		"\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u020e\u0003R)\u0000\u0204"+
		"\u0208\u0005)\u0000\u0000\u0205\u0207\u0007\u0003\u0000\u0000\u0206\u0205"+
		"\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206"+
		"\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020b"+
		"\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020d"+
		"\u0003R)\u0000\u020c\u0204\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000"+
		"\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000"+
		"\u0000\u0000\u020f\u0218\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000"+
		"\u0000\u0000\u0211\u0215\u0005)\u0000\u0000\u0212\u0214\u0007\u0003\u0000"+
		"\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000"+
		"\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000"+
		"\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000"+
		"\u0000\u0218\u0211\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000"+
		"\u0000\u0219Q\u0001\u0000\u0000\u0000\u021a\u021f\u0003\u0018\f\u0000"+
		"\u021b\u021c\u00054\u0000\u0000\u021c\u021d\u0005\"\u0000\u0000\u021d"+
		"\u021f\u0003\u0018\f\u0000\u021e\u021a\u0001\u0000\u0000\u0000\u021e\u021b"+
		"\u0001\u0000\u0000\u0000\u021fS\u0001\u0000\u0000\u0000\u0220\u0225\u0003"+
		"V+\u0000\u0221\u0225\u0005H\u0000\u0000\u0222\u0225\u0003n7\u0000\u0223"+
		"\u0225\u0003p8\u0000\u0224\u0220\u0001\u0000\u0000\u0000\u0224\u0221\u0001"+
		"\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001"+
		"\u0000\u0000\u0000\u0225\u0228\u0001\u0000\u0000\u0000\u0226\u0224\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227U\u0001\u0000"+
		"\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0229\u022d\u0005G\u0000"+
		"\u0000\u022a\u022c\u0003X,\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022c"+
		"\u022f\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0001\u0000\u0000\u0000\u022e\u0230\u0001\u0000\u0000\u0000\u022f"+
		"\u022d\u0001\u0000\u0000\u0000\u0230\u023c\u0007\u0004\u0000\u0000\u0231"+
		"\u0232\u0005E\u0000\u0000\u0232\u023c\u0005P\u0000\u0000\u0233\u0234\u0005"+
		"F\u0000\u0000\u0234\u0235\u0003Z-\u0000\u0235\u0236\u0005Q\u0000\u0000"+
		"\u0236\u023c\u0001\u0000\u0000\u0000\u0237\u023c\u0005@\u0000\u0000\u0238"+
		"\u023c\u0005A\u0000\u0000\u0239\u023c\u0005B\u0000\u0000\u023a\u023c\u0005"+
		"C\u0000\u0000\u023b\u0229\u0001\u0000\u0000\u0000\u023b\u0231\u0001\u0000"+
		"\u0000\u0000\u023b\u0233\u0001\u0000\u0000\u0000\u023b\u0237\u0001\u0000"+
		"\u0000\u0000\u023b\u0238\u0001\u0000\u0000\u0000\u023b\u0239\u0001\u0000"+
		"\u0000\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023cW\u0001\u0000\u0000"+
		"\u0000\u023d\u0240\u0005M\u0000\u0000\u023e\u023f\u0005L\u0000\u0000\u023f"+
		"\u0241\u0005O\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\u0001\u0000\u0000\u0000\u0241\u0247\u0001\u0000\u0000\u0000\u0242\u0247"+
		"\u0003p8\u0000\u0243\u0247\u0003n7\u0000\u0244\u0247\u0005K\u0000\u0000"+
		"\u0245\u0247\u0005L\u0000\u0000\u0246\u023d\u0001\u0000\u0000\u0000\u0246"+
		"\u0242\u0001\u0000\u0000\u0000\u0246\u0243\u0001\u0000\u0000\u0000\u0246"+
		"\u0244\u0001\u0000\u0000\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0247"+
		"Y\u0001\u0000\u0000\u0000\u0248\u024a\u0007\u0005\u0000\u0000\u0249\u0248"+
		"\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b\u0249"+
		"\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024e"+
		"\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e\u0258"+
		"\u0003\\.\u0000\u024f\u0251\u0007\u0005\u0000\u0000\u0250\u024f\u0001"+
		"\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0255\u0001"+
		"\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0257\u0003"+
		"\\.\u0000\u0256\u0252\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000"+
		"\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000"+
		"\u0000\u0000\u0259\u025e\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000"+
		"\u0000\u0000\u025b\u025d\u0007\u0005\u0000\u0000\u025c\u025b\u0001\u0000"+
		"\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f[\u0001\u0000\u0000"+
		"\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261\u0265\u0003^/\u0000\u0262"+
		"\u0264\u0007\u0005\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0264"+
		"\u0267\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265"+
		"\u0266\u0001\u0000\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267"+
		"\u0265\u0001\u0000\u0000\u0000\u0268\u0269\u0005R\u0000\u0000\u0269\u026a"+
		"\u0003d2\u0000\u026a\u026b\u0005S\u0000\u0000\u026b]\u0001\u0000\u0000"+
		"\u0000\u026c\u027d\u0003`0\u0000\u026d\u026f\u0007\u0005\u0000\u0000\u026e"+
		"\u026d\u0001\u0000\u0000\u0000\u026f\u0272\u0001\u0000\u0000\u0000\u0270"+
		"\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271"+
		"\u0273\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0273"+
		"\u0277\u0005X\u0000\u0000\u0274\u0276\u0007\u0005\u0000\u0000\u0275\u0274"+
		"\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0275"+
		"\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027a"+
		"\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027c"+
		"\u0003`0\u0000\u027b\u0270\u0001\u0000\u0000\u0000\u027c\u027f\u0001\u0000"+
		"\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000"+
		"\u0000\u0000\u027e_\u0001\u0000\u0000\u0000\u027f\u027d\u0001\u0000\u0000"+
		"\u0000\u0280\u0292\u0003b1\u0000\u0281\u0283\u0005a\u0000\u0000\u0282"+
		"\u0281\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284"+
		"\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285"+
		"\u0288\u0001\u0000\u0000\u0000\u0286\u0288\u0005Z\u0000\u0000\u0287\u0282"+
		"\u0001\u0000\u0000\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0288\u028c"+
		"\u0001\u0000\u0000\u0000\u0289\u028b\u0007\u0005\u0000\u0000\u028a\u0289"+
		"\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000\u0000\u028c\u028a"+
		"\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028f"+
		"\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028f\u0291"+
		"\u0003b1\u0000\u0290\u0287\u0001\u0000\u0000\u0000\u0291\u0294\u0001\u0000"+
		"\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000"+
		"\u0000\u0000\u0293a\u0001\u0000\u0000\u0000\u0294\u0292\u0001\u0000\u0000"+
		"\u0000\u0295\u029c\u0005`\u0000\u0000\u0296\u0297\u0005Y\u0000\u0000\u0297"+
		"\u029b\u0005`\u0000\u0000\u0298\u0299\u0005[\u0000\u0000\u0299\u029b\u0005"+
		"`\u0000\u0000\u029a\u0296\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000"+
		"\u0000\u0000\u029b\u029e\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u02a9\u0001\u0000"+
		"\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029f\u02a0\u0005Y\u0000"+
		"\u0000\u02a0\u02a4\u0005`\u0000\u0000\u02a1\u02a2\u0005[\u0000\u0000\u02a2"+
		"\u02a4\u0005`\u0000\u0000\u02a3\u029f\u0001\u0000\u0000\u0000\u02a3\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a9"+
		"\u0001\u0000\u0000\u0000\u02a7\u02a9\u0005`\u0000\u0000\u02a8\u0295\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a3\u0001\u0000\u0000\u0000\u02a8\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a9c\u0001\u0000\u0000\u0000\u02aa\u02b4\u0003f3"+
		"\u0000\u02ab\u02ad\u0007\u0005\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ad\u02b0\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b1\u02b3\u0003f3\u0000\u02b2"+
		"\u02ae\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7"+
		"\u02aa\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8"+
		"e\u0001\u0000\u0000\u0000\u02b9\u02bd\u0005`\u0000\u0000\u02ba\u02bc\u0007"+
		"\u0005\u0000\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001"+
		"\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001"+
		"\u0000\u0000\u0000\u02be\u02c0\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c4\u0005V\u0000\u0000\u02c1\u02c3\u0007\u0005"+
		"\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c7\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c7\u02cb\u0003h4\u0000\u02c8\u02ca\u0007\u0005\u0000\u0000"+
		"\u02c9\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000"+
		"\u02cc\u02ce\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cf\u0005W\u0000\u0000\u02cfg\u0001\u0000\u0000\u0000\u02d0\u02da"+
		"\u0003j5\u0000\u02d1\u02d3\u0007\u0005\u0000\u0000\u02d2\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d7\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d9\u0003j5\u0000"+
		"\u02d8\u02d4\u0001\u0000\u0000\u0000\u02d9\u02dc\u0001\u0000\u0000\u0000"+
		"\u02da\u02d8\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000"+
		"\u02dbi\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd"+
		"\u02e5\u0003l6\u0000\u02de\u02e5\u0005_\u0000\u0000\u02df\u02e5\u0005"+
		"\\\u0000\u0000\u02e0\u02e1\u0005]\u0000\u0000\u02e1\u02e5\u0005^\u0000"+
		"\u0000\u02e2\u02e5\u0005]\u0000\u0000\u02e3\u02e5\u0005`\u0000\u0000\u02e4"+
		"\u02dd\u0001\u0000\u0000\u0000\u02e4\u02de\u0001\u0000\u0000\u0000\u02e4"+
		"\u02df\u0001\u0000\u0000\u0000\u02e4\u02e0\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e5"+
		"k\u0001\u0000\u0000\u0000\u02e6\u02e7\u0005`\u0000\u0000\u02e7\u02eb\u0005"+
		"T\u0000\u0000\u02e8\u02ea\u0007\u0005\u0000\u0000\u02e9\u02e8\u0001\u0000"+
		"\u0000\u0000\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee\u02ff\u0003h4\u0000"+
		"\u02ef\u02f1\u0007\u0005\u0000\u0000\u02f0\u02ef\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02f9\u0005X\u0000\u0000\u02f6"+
		"\u02f8\u0007\u0005\u0000\u0000\u02f7\u02f6\u0001\u0000\u0000\u0000\u02f8"+
		"\u02fb\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02f9"+
		"\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fc\u0001\u0000\u0000\u0000\u02fb"+
		"\u02f9\u0001\u0000\u0000\u0000\u02fc\u02fe\u0003h4\u0000\u02fd\u02f2\u0001"+
		"\u0000\u0000\u0000\u02fe\u0301\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001"+
		"\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0305\u0001"+
		"\u0000\u0000\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0302\u0304\u0007"+
		"\u0005\u0000\u0000\u0303\u0302\u0001\u0000\u0000\u0000\u0304\u0307\u0001"+
		"\u0000\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001"+
		"\u0000\u0000\u0000\u0306\u0308\u0001\u0000\u0000\u0000\u0307\u0305\u0001"+
		"\u0000\u0000\u0000\u0308\u0309\u0005U\u0000\u0000\u0309m\u0001\u0000\u0000"+
		"\u0000\u030a\u030b\u0005<\u0000\u0000\u030b\u030c\u0003r9\u0000\u030c"+
		"o\u0001\u0000\u0000\u0000\u030d\u030e\u0005;\u0000\u0000\u030e\u030f\u0003"+
		"|>\u0000\u030f\u0310\u0005c\u0000\u0000\u0310q\u0001\u0000\u0000\u0000"+
		"\u0311\u0316\u0003t:\u0000\u0312\u0316\u0003v;\u0000\u0313\u0316\u0003"+
		"x<\u0000\u0314\u0316\u0003z=\u0000\u0315\u0311\u0001\u0000\u0000\u0000"+
		"\u0315\u0312\u0001\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000"+
		"\u0315\u0314\u0001\u0000\u0000\u0000\u0316s\u0001\u0000\u0000\u0000\u0317"+
		"\u0318\u0005e\u0000\u0000\u0318\u0319\u0005\u0081\u0000\u0000\u0319\u031a"+
		"\u0005d\u0000\u0000\u031au\u0001\u0000\u0000\u0000\u031b\u031c\u0005f"+
		"\u0000\u0000\u031c\u031d\u0005\u0082\u0000\u0000\u031d\u031e\u0005d\u0000"+
		"\u0000\u031e\u031f\u0003T*\u0000\u031f\u0320\u0005<\u0000\u0000\u0320"+
		"\u0322\u0005g\u0000\u0000\u0321\u0323\u0005\u0082\u0000\u0000\u0322\u0321"+
		"\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323\u0324"+
		"\u0001\u0000\u0000\u0000\u0324\u0325\u0005d\u0000\u0000\u0325w\u0001\u0000"+
		"\u0000\u0000\u0326\u0327\u0005h\u0000\u0000\u0327\u0328\u0005\u0082\u0000"+
		"\u0000\u0328\u0329\u0005l\u0000\u0000\u0329\u032a\u0003|>\u0000\u032a"+
		"\u032b\u0005d\u0000\u0000\u032b\u032c\u0003T*\u0000\u032c\u032d\u0005"+
		"<\u0000\u0000\u032d\u032e\u0005i\u0000\u0000\u032e\u032f\u0005d\u0000"+
		"\u0000\u032fy\u0001\u0000\u0000\u0000\u0330\u0331\u0005j\u0000\u0000\u0331"+
		"\u0332\u0003|>\u0000\u0332\u0333\u0005d\u0000\u0000\u0333\u0334\u0003"+
		"T*\u0000\u0334\u0335\u0005<\u0000\u0000\u0335\u0336\u0005k\u0000\u0000"+
		"\u0336\u0337\u0005d\u0000\u0000\u0337{\u0001\u0000\u0000\u0000\u0338\u0339"+
		"\u0003~?\u0000\u0339\u033a\u0007\u0006\u0000\u0000\u033a\u033b\u0003~"+
		"?\u0000\u033b\u033e\u0001\u0000\u0000\u0000\u033c\u033e\u0003~?\u0000"+
		"\u033d\u0338\u0001\u0000\u0000\u0000\u033d\u033c\u0001\u0000\u0000\u0000"+
		"\u033e}\u0001\u0000\u0000\u0000\u033f\u0342\u0003\u0080@\u0000\u0340\u0341"+
		"\u0005z\u0000\u0000\u0341\u0343\u0007\u0007\u0000\u0000\u0342\u0340\u0001"+
		"\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u034d\u0001"+
		"\u0000\u0000\u0000\u0344\u0345\u0005\u0082\u0000\u0000\u0345\u0347\u0005"+
		"v\u0000\u0000\u0346\u0348\u0003\u0082A\u0000\u0347\u0346\u0001\u0000\u0000"+
		"\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000"+
		"\u0000\u0349\u034d\u0005w\u0000\u0000\u034a\u034d\u0003\u0080@\u0000\u034b"+
		"\u034d\u0003\u0086C\u0000\u034c\u033f\u0001\u0000\u0000\u0000\u034c\u0344"+
		"\u0001\u0000\u0000\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034c\u034b"+
		"\u0001\u0000\u0000\u0000\u034d\u007f\u0001\u0000\u0000\u0000\u034e\u0353"+
		"\u0005\u0082\u0000\u0000\u034f\u0350\u0005y\u0000\u0000\u0350\u0352\u0005"+
		"\u0082\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0352\u0355\u0001"+
		"\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353\u0354\u0001"+
		"\u0000\u0000\u0000\u0354\u0081\u0001\u0000\u0000\u0000\u0355\u0353\u0001"+
		"\u0000\u0000\u0000\u0356\u035b\u0003\u0084B\u0000\u0357\u0358\u0005x\u0000"+
		"\u0000\u0358\u035a\u0003\u0084B\u0000\u0359\u0357\u0001\u0000\u0000\u0000"+
		"\u035a\u035d\u0001\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000"+
		"\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u0083\u0001\u0000\u0000\u0000"+
		"\u035d\u035b\u0001\u0000\u0000\u0000\u035e\u0363\u0003|>\u0000\u035f\u0360"+
		"\u0005\u0082\u0000\u0000\u0360\u0361\u0005\u007f\u0000\u0000\u0361\u0363"+
		"\u0003|>\u0000\u0362\u035e\u0001\u0000\u0000\u0000\u0362\u035f\u0001\u0000"+
		"\u0000\u0000\u0363\u0085\u0001\u0000\u0000\u0000\u0364\u0365\u0007\b\u0000"+
		"\u0000\u0365\u0087\u0001\u0000\u0000\u0000k\u008b\u008d\u0094\u009b\u009e"+
		"\u00a8\u00ac\u00b2\u00b9\u00c0\u00c6\u00cd\u00d4\u00d6\u00dd\u00e7\u00ef"+
		"\u00f5\u00fd\u010c\u0114\u011c\u0124\u012a\u0132\u0137\u0140\u0147\u0154"+
		"\u015a\u0162\u0166\u016c\u0173\u017d\u0182\u018a\u0190\u0193\u019c\u01a3"+
		"\u01ac\u01b4\u01bb\u01c0\u01c5\u01c8\u01cf\u01d3\u01db\u01e2\u01eb\u01f1"+
		"\u01f8\u01fb\u0200\u0208\u020e\u0215\u0218\u021e\u0224\u0226\u022d\u023b"+
		"\u0240\u0246\u024b\u0252\u0258\u025e\u0265\u0270\u0277\u027d\u0284\u0287"+
		"\u028c\u0292\u029a\u029c\u02a3\u02a5\u02a8\u02ae\u02b4\u02b7\u02bd\u02c4"+
		"\u02cb\u02d4\u02da\u02e4\u02eb\u02f2\u02f9\u02ff\u0305\u0315\u0322\u033d"+
		"\u0342\u0347\u034c\u0353\u035b\u0362";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}