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
		OR=18, NOT=19, TRUE=20, FALSE=21, NONE=22, PRINT=23, WHILE=24, ARROW=25, 
		AT=26, COLON=27, SEMI=28, COMMA=29, ASSIGN=30, EQ=31, NEQ=32, GT=33, LT=34, 
		GTE=35, LTE=36, PLUS=37, MINUS=38, STAR=39, SLASH=40, SLASHSLASH=41, LP=42, 
		RP=43, LBRACK=44, RBRACK=45, LBRACE=46, RBRACE=47, DOT=48, NAME=49, NUMBER=50, 
		STRING=51, TRIPLE_DOUBLE_START=52, TRIPLE_SINGLE_START=53, TRIPLE_DOUBLE_END=54, 
		TRIPLE_SINGLE_END=55, JINJA_EXPR_START=56, JINJA_STMT_START=57, JINJA_COMMENT_START=58, 
		HTML_COMMENT=59, HTML_CONDITIONAL_COMMENT=60, XML_DECLARATION=61, CDATA=62, 
		DTD=63, SCRIPTLET=64, SEA_WS=65, SCRIPT_OPEN=66, STYLE_OPEN=67, TAG_OPEN=68, 
		HTML_TEXT=69, TAG_CLOSE=70, TAG_SLASH_CLOSE=71, TAG_SLASH=72, TAG_EQUALS=73, 
		TAG_NAME=74, TAG_WHITESPACE=75, ATTVALUE_VALUE=76, SCRIPT_BODY=77, STYLE_CLOSE=78, 
		CSS_WS=79, CSS_COMMENT=80, CSS_LBRACE=81, CSS_RBRACE=82, CSS_COLON=83, 
		CSS_SEMICOLON=84, CSS_LPAREN=85, CSS_RPAREN=86, CSS_COMMA=87, CSS_DOT=88, 
		CSS_SLASH=89, CSS_PERCENT=90, CSS_PLUS=91, CSS_GREATER=92, CSS_TILDE=93, 
		CSS_EQUALS=94, CSS_LBRACKET=95, CSS_RBRACKET=96, CSS_ASTERISK=97, AT_IMPORT=98, 
		AT_MEDIA=99, AT_FONT_FACE=100, AT_KEYFRAMES=101, AT_SUPPORTS=102, CSS_NUMBER=103, 
		COLOR_HEX=104, CSS_STRING=105, HASH=106, CLASS=107, PSEUDO_ELEMENT=108, 
		PSEUDO_CLASS=109, IDENT=110, JINJA_EXPR_END=111, J_WS=112, J_NUMBER=113, 
		J_STRING=114, J_NAME=115, J_PLUS=116, J_MINUS=117, J_TIMES=118, J_DIVIDE=119, 
		J_MOD=120, J_POW=121, J_EQ=122, J_NE=123, J_LE=124, J_LT=125, J_GE=126, 
		J_GT=127, J_ASSIGN=128, J_DOT=129, J_COMMA=130, J_PIPE=131, J_LPAREN=132, 
		J_RPAREN=133, J_LBRACK=134, J_RBRACK=135, J_LBRACE=136, J_RBRACE=137, 
		J_COLON=138, JINJA_STMT_END=139, J_IF=140, J_ELIF=141, J_ELSE=142, J_ENDIF=143, 
		J_FOR=144, J_IN=145, J_ENDFOR=146, J_SET=147, J_RAW=148, J_ENDRAW=149, 
		J_OR=150, J_AND=151, J_NOT=152, J_WS_STMT=153, J_NUMBER_STMT=154, J_STRING_STMT=155, 
		J_NAME_STMT=156, J_PLUS_STMT=157, J_MINUS_STMT=158, J_TIMES_STMT=159, 
		J_DIVIDE_STMT=160, J_MOD_STMT=161, J_POW_STMT=162, J_EQ_STMT=163, J_NE_STMT=164, 
		J_LE_STMT=165, J_LT_STMT=166, J_GE_STMT=167, J_GT_STMT=168, J_ASSIGN_STMT=169, 
		J_DOT_STMT=170, J_COMMA_STMT=171, J_PIPE_STMT=172, J_LPAREN_STMT=173, 
		J_RPAREN_STMT=174, J_LBRACK_STMT=175, J_RBRACK_STMT=176, JINJA_COMMENT_END=177, 
		JINJA_COMMENT_CONTENT=178;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simple_stmt = 2, RULE_small_stmt = 3, 
		RULE_compound_stmt = 4, RULE_assign_stmt = 5, RULE_template_literal = 6, 
		RULE_html_content = 7, RULE_import_stmt = 8, RULE_import_name = 9, RULE_import_from = 10, 
		RULE_import_as_names = 11, RULE_import_as_name = 12, RULE_dotted_name = 13, 
		RULE_global_stmt = 14, RULE_decorated = 15, RULE_decorators = 16, RULE_decorator = 17, 
		RULE_func_def = 18, RULE_parameters = 19, RULE_typedargslist = 20, RULE_if_stmt = 21, 
		RULE_return_stmt = 22, RULE_flow_stmt = 23, RULE_suite = 24, RULE_testlist = 25, 
		RULE_test = 26, RULE_or_test = 27, RULE_and_test = 28, RULE_not_test = 29, 
		RULE_comparison = 30, RULE_comp_op = 31, RULE_expr = 32, RULE_term = 33, 
		RULE_factor = 34, RULE_power = 35, RULE_atom_expr = 36, RULE_trailer = 37, 
		RULE_atom = 38, RULE_list_content = 39, RULE_comp_for = 40, RULE_dict_maker = 41, 
		RULE_arglist = 42, RULE_argument = 43, RULE_htmlElement = 44, RULE_tag_content = 45, 
		RULE_style_content = 46, RULE_stylesheet = 47, RULE_css_statement = 48, 
		RULE_ruleset = 49, RULE_selectorGroup = 50, RULE_selector = 51, RULE_combinator = 52, 
		RULE_simpleSelectorSequence = 53, RULE_typeSelector = 54, RULE_universal = 55, 
		RULE_hash = 56, RULE_classSelector = 57, RULE_pseudo = 58, RULE_attributeSelector = 59, 
		RULE_atRule = 60, RULE_importTerminator = 61, RULE_mediaQueryList = 62, 
		RULE_mediaQuery = 63, RULE_declarationBlock = 64, RULE_declaration = 65, 
		RULE_propertyName = 66, RULE_css_value = 67, RULE_css_term = 68, RULE_css_functionCall = 69, 
		RULE_css_valueList = 70, RULE_keyframeBlock = 71, RULE_keyframeSelector = 72, 
		RULE_jinjaStatement = 73, RULE_jStatement = 74, RULE_jRawStatement = 75, 
		RULE_jIfStatement = 76, RULE_jForStatement = 77, RULE_jTargetList = 78, 
		RULE_jinjaExpression = 79, RULE_jExpression = 80, RULE_jFilter = 81, RULE_jTestExpr = 82, 
		RULE_jOrTest = 83, RULE_jAndTest = 84, RULE_jNotTest = 85, RULE_jComparison = 86, 
		RULE_jCompOp = 87, RULE_jMathExpr = 88, RULE_jTerm = 89, RULE_jFactor = 90, 
		RULE_jAtomExpr = 91, RULE_jTrailer = 92, RULE_jAtom = 93, RULE_jTestExprList = 94, 
		RULE_jArgumentList = 95, RULE_jDictMaker = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simple_stmt", "small_stmt", "compound_stmt", 
			"assign_stmt", "template_literal", "html_content", "import_stmt", "import_name", 
			"import_from", "import_as_names", "import_as_name", "dotted_name", "global_stmt", 
			"decorated", "decorators", "decorator", "func_def", "parameters", "typedargslist", 
			"if_stmt", "return_stmt", "flow_stmt", "suite", "testlist", "test", "or_test", 
			"and_test", "not_test", "comparison", "comp_op", "expr", "term", "factor", 
			"power", "atom_expr", "trailer", "atom", "list_content", "comp_for", 
			"dict_maker", "arglist", "argument", "htmlElement", "tag_content", "style_content", 
			"stylesheet", "css_statement", "ruleset", "selectorGroup", "selector", 
			"combinator", "simpleSelectorSequence", "typeSelector", "universal", 
			"hash", "classSelector", "pseudo", "attributeSelector", "atRule", "importTerminator", 
			"mediaQueryList", "mediaQuery", "declarationBlock", "declaration", "propertyName", 
			"css_value", "css_term", "css_functionCall", "css_valueList", "keyframeBlock", 
			"keyframeSelector", "jinjaStatement", "jStatement", "jRawStatement", 
			"jIfStatement", "jForStatement", "jTargetList", "jinjaExpression", "jExpression", 
			"jFilter", "jTestExpr", "jOrTest", "jAndTest", "jNotTest", "jComparison", 
			"jCompOp", "jMathExpr", "jTerm", "jFactor", "jAtomExpr", "jTrailer", 
			"jAtom", "jTestExprList", "jArgumentList", "jDictMaker"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'def'", "'return'", "'from'", "'import'", 
			"'as'", null, null, null, null, null, "'global'", null, null, null, "'True'", 
			"'False'", "'None'", "'print'", "'while'", "'->'", "'@'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'//'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'{{'", "'{%'", "'{#'", "'d'", null, null, null, null, 
			null, null, null, null, null, null, null, "'/>'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'~'", null, null, null, null, "'@import'", 
			"'@media'", "'@font-face'", "'@keyframes'", "'@supports'", null, null, 
			null, null, null, null, null, null, "'}}'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'%}'", null, 
			null, null, "'endif'", null, null, "'endfor'", "'set'", "'raw'", "'endraw'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "NEWLINE", "WS", "COMMENT", "DEF", "RETURN", 
			"FROM", "IMPORT", "AS", "IF", "ELIF", "ELSE", "FOR", "IN", "GLOBAL", 
			"AND", "OR", "NOT", "TRUE", "FALSE", "NONE", "PRINT", "WHILE", "ARROW", 
			"AT", "COLON", "SEMI", "COMMA", "ASSIGN", "EQ", "NEQ", "GT", "LT", "GTE", 
			"LTE", "PLUS", "MINUS", "STAR", "SLASH", "SLASHSLASH", "LP", "RP", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "DOT", "NAME", "NUMBER", "STRING", "TRIPLE_DOUBLE_START", 
			"TRIPLE_SINGLE_START", "TRIPLE_DOUBLE_END", "TRIPLE_SINGLE_END", "JINJA_EXPR_START", 
			"JINJA_STMT_START", "JINJA_COMMENT_START", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML_DECLARATION", "CDATA", "DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", 
			"STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "ATTVALUE_VALUE", 
			"SCRIPT_BODY", "STYLE_CLOSE", "CSS_WS", "CSS_COMMENT", "CSS_LBRACE", 
			"CSS_RBRACE", "CSS_COLON", "CSS_SEMICOLON", "CSS_LPAREN", "CSS_RPAREN", 
			"CSS_COMMA", "CSS_DOT", "CSS_SLASH", "CSS_PERCENT", "CSS_PLUS", "CSS_GREATER", 
			"CSS_TILDE", "CSS_EQUALS", "CSS_LBRACKET", "CSS_RBRACKET", "CSS_ASTERISK", 
			"AT_IMPORT", "AT_MEDIA", "AT_FONT_FACE", "AT_KEYFRAMES", "AT_SUPPORTS", 
			"CSS_NUMBER", "COLOR_HEX", "CSS_STRING", "HASH", "CLASS", "PSEUDO_ELEMENT", 
			"PSEUDO_CLASS", "IDENT", "JINJA_EXPR_END", "J_WS", "J_NUMBER", "J_STRING", 
			"J_NAME", "J_PLUS", "J_MINUS", "J_TIMES", "J_DIVIDE", "J_MOD", "J_POW", 
			"J_EQ", "J_NE", "J_LE", "J_LT", "J_GE", "J_GT", "J_ASSIGN", "J_DOT", 
			"J_COMMA", "J_PIPE", "J_LPAREN", "J_RPAREN", "J_LBRACK", "J_RBRACK", 
			"J_LBRACE", "J_RBRACE", "J_COLON", "JINJA_STMT_END", "J_IF", "J_ELIF", 
			"J_ELSE", "J_ENDIF", "J_FOR", "J_IN", "J_ENDFOR", "J_SET", "J_RAW", "J_ENDRAW", 
			"J_OR", "J_AND", "J_NOT", "J_WS_STMT", "J_NUMBER_STMT", "J_STRING_STMT", 
			"J_NAME_STMT", "J_PLUS_STMT", "J_MINUS_STMT", "J_TIMES_STMT", "J_DIVIDE_STMT", 
			"J_MOD_STMT", "J_POW_STMT", "J_EQ_STMT", "J_NE_STMT", "J_LE_STMT", "J_LT_STMT", 
			"J_GE_STMT", "J_GT_STMT", "J_ASSIGN_STMT", "J_DOT_STMT", "J_COMMA_STMT", 
			"J_PIPE_STMT", "J_LPAREN_STMT", "J_RPAREN_STMT", "J_LBRACK_STMT", "J_RBRACK_STMT", 
			"JINJA_COMMENT_END", "JINJA_COMMENT_CONTENT"
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
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033421310495688L) != 0)) {
				{
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(194);
					statement();
					}
					break;
				case 2:
					{
					setState(195);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case IF:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
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
			case LBRACE:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
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
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420974949248L) != 0)) {
				{
				setState(207);
				small_stmt();
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(208);
						match(SEMI);
						setState(209);
						small_stmt();
						}
						} 
					}
					setState(214);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
			}

			setState(217);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				import_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				return_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				global_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
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
		enterRule(_localctx, 8, RULE_compound_stmt);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				if_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				func_def();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
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
	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
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
		enterRule(_localctx, 10, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(NAME);
			setState(233);
			match(ASSIGN);
			setState(236);
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
			case LBRACE:
			case NAME:
			case NUMBER:
			case STRING:
				{
				setState(234);
				test();
				}
				break;
			case TRIPLE_DOUBLE_START:
			case TRIPLE_SINGLE_START:
				{
				setState(235);
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
		enterRule(_localctx, 12, RULE_template_literal);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIPLE_DOUBLE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(TRIPLE_DOUBLE_START);
				setState(239);
				html_content();
				setState(240);
				match(TRIPLE_DOUBLE_END);
				}
				break;
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(TRIPLE_SINGLE_START);
				setState(243);
				html_content();
				setState(244);
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
	public static class Html_contentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
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
		public List<TerminalNode> HTML_TEXT() { return getTokens(JinjaFlaskParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(JinjaFlaskParser.HTML_TEXT, i);
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
		enterRule(_localctx, 14, RULE_html_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 15843L) != 0)) {
				{
				setState(252);
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
					setState(248);
					htmlElement();
					}
					break;
				case JINJA_STMT_START:
					{
					setState(249);
					jinjaStatement();
					}
					break;
				case JINJA_EXPR_START:
					{
					setState(250);
					jinjaExpression();
					}
					break;
				case HTML_TEXT:
					{
					setState(251);
					match(HTML_TEXT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(256);
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
		enterRule(_localctx, 16, RULE_import_stmt);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
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
		enterRule(_localctx, 18, RULE_import_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IMPORT);
			setState(262);
			dotted_name();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(263);
				match(AS);
				setState(264);
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
		enterRule(_localctx, 20, RULE_import_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(FROM);
			setState(268);
			dotted_name();
			setState(269);
			match(IMPORT);
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(270);
				match(STAR);
				}
				break;
			case NAME:
				{
				setState(271);
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
		enterRule(_localctx, 22, RULE_import_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			import_as_name();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(275);
				match(COMMA);
				setState(276);
				import_as_name();
				}
				}
				setState(281);
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
		enterRule(_localctx, 24, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(NAME);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(283);
				match(AS);
				setState(284);
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
		enterRule(_localctx, 26, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(NAME);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(288);
				match(DOT);
				setState(289);
				match(NAME);
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
		enterRule(_localctx, 28, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(GLOBAL);
			setState(296);
			match(NAME);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(297);
				match(COMMA);
				setState(298);
				match(NAME);
				}
				}
				setState(303);
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
		enterRule(_localctx, 30, RULE_decorated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			decorators();
			setState(305);
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
		enterRule(_localctx, 32, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				decorator();
				}
				}
				setState(310); 
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
		enterRule(_localctx, 34, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(AT);
			setState(313);
			dotted_name();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(314);
				match(LP);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(315);
					arglist();
					}
				}

				setState(318);
				match(RP);
				}
			}

			setState(321);
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
		enterRule(_localctx, 36, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(DEF);
			setState(324);
			match(NAME);
			setState(325);
			parameters();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(326);
				match(ARROW);
				setState(327);
				test();
				}
			}

			setState(330);
			match(COLON);
			setState(331);
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
		enterRule(_localctx, 38, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LP);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(334);
				typedargslist();
				}
			}

			setState(337);
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
		enterRule(_localctx, 40, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(NAME);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(340);
				match(COMMA);
				setState(341);
				match(NAME);
				}
				}
				setState(346);
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
		enterRule(_localctx, 42, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IF);
			setState(348);
			test();
			setState(349);
			match(COLON);
			setState(350);
			suite();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(351);
				match(ELIF);
				setState(352);
				test();
				setState(353);
				match(COLON);
				setState(354);
				suite();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(361);
				match(ELSE);
				setState(362);
				match(COLON);
				setState(363);
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
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JinjaFlaskParser.RETURN, 0); }
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
		enterRule(_localctx, 44, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(RETURN);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
				{
				setState(367);
				testlist();
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
		enterRule(_localctx, 46, RULE_flow_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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
		enterRule(_localctx, 48, RULE_suite);
		int _la;
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(NEWLINE);
				setState(374);
				match(INDENT);
				setState(376); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(375);
					statement();
					}
					}
					setState(378); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4033421310495688L) != 0) );
				setState(380);
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
		enterRule(_localctx, 50, RULE_testlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			test();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(385);
				match(COMMA);
				setState(386);
				test();
				}
				}
				setState(391);
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
		enterRule(_localctx, 52, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		enterRule(_localctx, 54, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			and_test();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(395);
				match(OR);
				setState(396);
				and_test();
				}
				}
				setState(401);
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
		enterRule(_localctx, 56, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			not_test();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(403);
				match(AND);
				setState(404);
				not_test();
				}
				}
				setState(409);
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
		enterRule(_localctx, 58, RULE_not_test);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(NOT);
				setState(411);
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
			case LBRACE:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
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
		enterRule(_localctx, 60, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			expr();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					comp_op();
					setState(417);
					expr();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public TerminalNode NEQ() { return getToken(JinjaFlaskParser.NEQ, 0); }
		public TerminalNode GTE() { return getToken(JinjaFlaskParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(JinjaFlaskParser.LTE, 0); }
		public TerminalNode IN() { return getToken(JinjaFlaskParser.IN, 0); }
		public TerminalNode NOT() { return getToken(JinjaFlaskParser.NOT, 0); }
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
		enterRule(_localctx, 62, RULE_comp_op);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(GT);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				match(NEQ);
				}
				break;
			case GTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				match(GTE);
				}
				break;
			case LTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				match(LTE);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(430);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(431);
				match(NOT);
				setState(432);
				match(IN);
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
		enterRule(_localctx, 64, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			term();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(436);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(437);
				term();
				}
				}
				setState(442);
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
		enterRule(_localctx, 66, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			factor();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				{
				setState(444);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(445);
				factor();
				}
				}
				setState(450);
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
		enterRule(_localctx, 68, RULE_factor);
		int _la;
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(452);
				factor();
				}
				break;
			case TRUE:
			case FALSE:
			case NONE:
			case LP:
			case LBRACK:
			case LBRACE:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
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
		enterRule(_localctx, 70, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		enterRule(_localctx, 72, RULE_atom_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			atom();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 303465209266176L) != 0)) {
				{
				{
				setState(459);
				trailer();
				}
				}
				setState(464);
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
		enterRule(_localctx, 74, RULE_trailer);
		int _la;
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(LP);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(466);
					arglist();
					}
				}

				setState(469);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(LBRACK);
				setState(471);
				test();
				setState(472);
				match(RBRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(DOT);
				setState(475);
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
		public TerminalNode LBRACE() { return getToken(JinjaFlaskParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JinjaFlaskParser.RBRACE, 0); }
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
		enterRule(_localctx, 76, RULE_atom);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(NAME);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(481); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(480);
					match(STRING);
					}
					}
					setState(483); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(486);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(487);
				match(FALSE);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 7);
				{
				setState(488);
				match(LP);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(489);
					test();
					}
				}

				setState(492);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(493);
				match(LBRACK);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(494);
					list_content();
					}
				}

				setState(497);
				match(RBRACK);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 9);
				{
				setState(498);
				match(LBRACE);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(499);
					dict_maker();
					}
				}

				setState(502);
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
	public static class List_contentContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
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
		enterRule(_localctx, 78, RULE_list_content);
		int _la;
		try {
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				test();
				setState(506);
				comp_for();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				test();
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(509);
					match(COMMA);
					setState(510);
					test();
					}
					}
					setState(515);
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
	public static class Comp_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JinjaFlaskParser.FOR, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode IN() { return getToken(JinjaFlaskParser.IN, 0); }
		public List<TerminalNode> IF() { return getTokens(JinjaFlaskParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(JinjaFlaskParser.IF, i);
		}
		public Comp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterComp_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitComp_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitComp_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(FOR);
			setState(519);
			test();
			setState(520);
			match(IN);
			setState(521);
			test();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(522);
				match(IF);
				setState(523);
				test();
				}
				}
				setState(528);
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
	public static class Dict_makerContext extends ParserRuleContext {
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
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
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
		enterRule(_localctx, 82, RULE_dict_maker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			test();
			setState(530);
			match(COLON);
			setState(531);
			test();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(532);
				match(COMMA);
				setState(533);
				test();
				setState(534);
				match(COLON);
				setState(535);
				test();
				}
				}
				setState(541);
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
		enterRule(_localctx, 84, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			argument();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(543);
				match(COMMA);
				setState(544);
				argument();
				}
				}
				setState(549);
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
		enterRule(_localctx, 86, RULE_argument);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(NAME);
				setState(552);
				match(ASSIGN);
				setState(553);
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
		public Style_contentContext style_content() {
			return getRuleContext(Style_contentContext.class,0);
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
		enterRule(_localctx, 88, RULE_htmlElement);
		int _la;
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				match(TAG_OPEN);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 458755L) != 0)) {
					{
					{
					setState(557);
					tag_content();
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(563);
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
				setState(564);
				match(SCRIPT_OPEN);
				setState(565);
				match(SCRIPT_BODY);
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				match(STYLE_OPEN);
				setState(567);
				style_content();
				setState(568);
				match(STYLE_CLOSE);
				}
				break;
			case XML_DECLARATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				match(XML_DECLARATION);
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(571);
				match(CDATA);
				}
				break;
			case DTD:
				enterOuterAlt(_localctx, 6);
				{
				setState(572);
				match(DTD);
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 7);
				{
				setState(573);
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
		enterRule(_localctx, 90, RULE_tag_content);
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				match(TAG_NAME);
				setState(579);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(577);
					match(TAG_EQUALS);
					setState(578);
					match(ATTVALUE_VALUE);
					}
					break;
				}
				}
				break;
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				jinjaExpression();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				jinjaStatement();
				}
				break;
			case TAG_SLASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				match(TAG_SLASH);
				}
				break;
			case TAG_EQUALS:
				enterOuterAlt(_localctx, 5);
				{
				setState(584);
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
	public static class Style_contentContext extends ParserRuleContext {
		public StylesheetContext stylesheet() {
			return getRuleContext(StylesheetContext.class,0);
		}
		public Style_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterStyle_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitStyle_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitStyle_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_contentContext style_content() throws RecognitionException {
		Style_contentContext _localctx = new Style_contentContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_style_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			stylesheet();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode EOF() { return getToken(JinjaFlaskParser.EOF, 0); }
		public List<Css_statementContext> css_statement() {
			return getRuleContexts(Css_statementContext.class);
		}
		public Css_statementContext css_statement(int i) {
			return getRuleContext(Css_statementContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(JinjaFlaskParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_START, i);
		}
		public List<JStatementContext> jStatement() {
			return getRuleContexts(JStatementContext.class);
		}
		public JStatementContext jStatement(int i) {
			return getRuleContext(JStatementContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
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
		enterRule(_localctx, 94, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 17485808294428673L) != 0)) {
				{
				setState(594);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_LBRACKET:
				case CSS_ASTERISK:
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
					setState(589);
					css_statement();
					}
					break;
				case JINJA_STMT_START:
					{
					setState(590);
					match(JINJA_STMT_START);
					setState(591);
					jStatement();
					setState(592);
					match(JINJA_STMT_END);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599);
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
	public static class Css_statementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public Css_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCss_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCss_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCss_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_statementContext css_statement() throws RecognitionException {
		Css_statementContext _localctx = new Css_statementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_css_statement);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_LBRACKET:
			case CSS_ASTERISK:
			case HASH:
			case CLASS:
			case PSEUDO_ELEMENT:
			case PSEUDO_CLASS:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				ruleset();
				}
				break;
			case AT_IMPORT:
			case AT_MEDIA:
			case AT_FONT_FACE:
			case AT_KEYFRAMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
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
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ruleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			selectorGroup();
			setState(606);
			match(CSS_LBRACE);
			setState(607);
			declarationBlock();
			setState(608);
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
	public static class SelectorGroupContext extends ParserRuleContext {
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
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			selector();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(611);
				match(CSS_COMMA);
				setState(612);
				selector();
				}
				}
				setState(617);
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
		enterRule(_localctx, 102, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			simpleSelectorSequence();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 1015895L) != 0)) {
				{
				{
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 7L) != 0)) {
					{
					setState(619);
					combinator();
					}
				}

				setState(622);
				simpleSelectorSequence();
				}
				}
				setState(627);
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
		public TerminalNode CSS_PLUS() { return getToken(JinjaFlaskParser.CSS_PLUS, 0); }
		public TerminalNode CSS_GREATER() { return getToken(JinjaFlaskParser.CSS_GREATER, 0); }
		public TerminalNode CSS_TILDE() { return getToken(JinjaFlaskParser.CSS_TILDE, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 7L) != 0)) ) {
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
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSimpleSelectorSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSimpleSelectorSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSimpleSelectorSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorSequenceContext simpleSelectorSequence() throws RecognitionException {
		SimpleSelectorSequenceContext _localctx = new SimpleSelectorSequenceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_simpleSelectorSequence);
		try {
			int _alt;
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_ASTERISK:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(630);
					typeSelector();
					}
					break;
				case CSS_ASTERISK:
					{
					setState(631);
					universal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(638);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(634);
							hash();
							}
							break;
						case CLASS:
							{
							setState(635);
							classSelector();
							}
							break;
						case PSEUDO_ELEMENT:
						case PSEUDO_CLASS:
							{
							setState(636);
							pseudo();
							}
							break;
						case CSS_LBRACKET:
							{
							setState(637);
							attributeSelector();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(642);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				}
				break;
			case CSS_LBRACKET:
			case HASH:
			case CLASS:
			case PSEUDO_ELEMENT:
			case PSEUDO_CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(647); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(647);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(643);
							hash();
							}
							break;
						case CLASS:
							{
							setState(644);
							classSelector();
							}
							break;
						case PSEUDO_ELEMENT:
						case PSEUDO_CLASS:
							{
							setState(645);
							pseudo();
							}
							break;
						case CSS_LBRACKET:
							{
							setState(646);
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
					setState(649); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
	public static class TypeSelectorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
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
		public TerminalNode CSS_ASTERISK() { return getToken(JinjaFlaskParser.CSS_ASTERISK, 0); }
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(CSS_ASTERISK);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode HASH() { return getToken(JinjaFlaskParser.HASH, 0); }
		public HashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitHash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashContext hash() throws RecognitionException {
		HashContext _localctx = new HashContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
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
		public TerminalNode CLASS() { return getToken(JinjaFlaskParser.CLASS, 0); }
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
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
		public TerminalNode PSEUDO_CLASS() { return getToken(JinjaFlaskParser.PSEUDO_CLASS, 0); }
		public TerminalNode PSEUDO_ELEMENT() { return getToken(JinjaFlaskParser.PSEUDO_ELEMENT, 0); }
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
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
		public TerminalNode CSS_LBRACKET() { return getToken(JinjaFlaskParser.CSS_LBRACKET, 0); }
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public TerminalNode CSS_RBRACKET() { return getToken(JinjaFlaskParser.CSS_RBRACKET, 0); }
		public TerminalNode CSS_EQUALS() { return getToken(JinjaFlaskParser.CSS_EQUALS, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public AttributeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAttributeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAttributeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAttributeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSelectorContext attributeSelector() throws RecognitionException {
		AttributeSelectorContext _localctx = new AttributeSelectorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_attributeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(CSS_LBRACKET);
			setState(664);
			match(IDENT);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_EQUALS) {
				{
				setState(665);
				match(CSS_EQUALS);
				setState(666);
				css_value();
				}
			}

			setState(669);
			match(CSS_RBRACKET);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode AT_IMPORT() { return getToken(JinjaFlaskParser.AT_IMPORT, 0); }
		public ImportTerminatorContext importTerminator() {
			return getRuleContext(ImportTerminatorContext.class,0);
		}
		public TerminalNode CSS_STRING() { return getToken(JinjaFlaskParser.CSS_STRING, 0); }
		public Css_functionCallContext css_functionCall() {
			return getRuleContext(Css_functionCallContext.class,0);
		}
		public TerminalNode AT_MEDIA() { return getToken(JinjaFlaskParser.AT_MEDIA, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public List<Css_statementContext> css_statement() {
			return getRuleContexts(Css_statementContext.class);
		}
		public Css_statementContext css_statement(int i) {
			return getRuleContext(Css_statementContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(JinjaFlaskParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_START, i);
		}
		public List<JStatementContext> jStatement() {
			return getRuleContexts(JStatementContext.class);
		}
		public JStatementContext jStatement(int i) {
			return getRuleContext(JStatementContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
		}
		public TerminalNode AT_FONT_FACE() { return getToken(JinjaFlaskParser.AT_FONT_FACE, 0); }
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public TerminalNode AT_KEYFRAMES() { return getToken(JinjaFlaskParser.AT_KEYFRAMES, 0); }
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
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
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_atRule);
		int _la;
		try {
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(AT_IMPORT);
				setState(674);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_STRING:
					{
					setState(672);
					match(CSS_STRING);
					}
					break;
				case IDENT:
					{
					setState(673);
					css_functionCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(676);
				importTerminator();
				}
				break;
			case AT_MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(AT_MEDIA);
				setState(678);
				mediaQueryList();
				setState(679);
				match(CSS_LBRACE);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 17485808294428673L) != 0)) {
					{
					setState(685);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_LBRACKET:
					case CSS_ASTERISK:
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
						setState(680);
						css_statement();
						}
						break;
					case JINJA_STMT_START:
						{
						setState(681);
						match(JINJA_STMT_START);
						setState(682);
						jStatement();
						setState(683);
						match(JINJA_STMT_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(690);
				match(CSS_RBRACE);
				}
				break;
			case AT_FONT_FACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				match(AT_FONT_FACE);
				setState(693);
				match(CSS_LBRACE);
				setState(694);
				declarationBlock();
				setState(695);
				match(CSS_RBRACE);
				}
				break;
			case AT_KEYFRAMES:
				enterOuterAlt(_localctx, 4);
				{
				setState(697);
				match(AT_KEYFRAMES);
				setState(698);
				match(IDENT);
				setState(699);
				match(CSS_LBRACE);
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 9077576588853249L) != 0)) {
					{
					setState(705);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_PERCENT:
					case CSS_NUMBER:
					case IDENT:
						{
						setState(700);
						keyframeBlock();
						}
						break;
					case JINJA_STMT_START:
						{
						setState(701);
						match(JINJA_STMT_START);
						setState(702);
						jStatement();
						setState(703);
						match(JINJA_STMT_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(710);
				match(CSS_RBRACE);
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
		public TerminalNode CSS_SEMICOLON() { return getToken(JinjaFlaskParser.CSS_SEMICOLON, 0); }
		public ImportTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importTerminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterImportTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitImportTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitImportTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportTerminatorContext importTerminator() throws RecognitionException {
		ImportTerminatorContext _localctx = new ImportTerminatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_importTerminator);
		try {
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				mediaQueryList();
				setState(714);
				match(CSS_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(CSS_SEMICOLON);
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
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitMediaQueryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitMediaQueryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			mediaQuery();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(720);
				match(CSS_COMMA);
				setState(721);
				mediaQuery();
				}
				}
				setState(726);
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
		public List<TerminalNode> IDENT() { return getTokens(JinjaFlaskParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(JinjaFlaskParser.IDENT, i);
		}
		public List<TerminalNode> CSS_LPAREN() { return getTokens(JinjaFlaskParser.CSS_LPAREN); }
		public TerminalNode CSS_LPAREN(int i) {
			return getToken(JinjaFlaskParser.CSS_LPAREN, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_RPAREN() { return getTokens(JinjaFlaskParser.CSS_RPAREN); }
		public TerminalNode CSS_RPAREN(int i) {
			return getToken(JinjaFlaskParser.CSS_RPAREN, i);
		}
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_mediaQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(727);
				match(IDENT);
				}
				break;
			}
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(730);
				match(IDENT);
				}
				break;
			}
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_LPAREN) {
				{
				setState(733);
				match(CSS_LPAREN);
				setState(734);
				declaration();
				setState(735);
				match(CSS_RPAREN);
				}
			}

			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(739);
				match(IDENT);
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_LPAREN) {
					{
					setState(740);
					match(CSS_LPAREN);
					setState(741);
					declaration();
					setState(742);
					match(CSS_RPAREN);
					}
				}

				}
				}
				setState(750);
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
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(JinjaFlaskParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_START, i);
		}
		public List<JStatementContext> jStatement() {
			return getRuleContexts(JStatementContext.class);
		}
		public JStatementContext jStatement(int i) {
			return getRuleContext(JStatementContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
		}
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(JinjaFlaskParser.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(JinjaFlaskParser.CSS_SEMICOLON, i);
		}
		public DeclarationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDeclarationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDeclarationBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationBlockContext declarationBlock() throws RecognitionException {
		DeclarationBlockContext _localctx = new DeclarationBlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_declarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_STMT_START || _la==IDENT) {
				{
				setState(759);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(751);
					declaration();
					setState(753);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CSS_SEMICOLON) {
						{
						setState(752);
						match(CSS_SEMICOLON);
						}
					}

					}
					break;
				case JINJA_STMT_START:
					{
					setState(755);
					match(JINJA_STMT_START);
					setState(756);
					jStatement();
					setState(757);
					match(JINJA_STMT_END);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(763);
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
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
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
		enterRule(_localctx, 130, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			propertyName();
			setState(765);
			match(CSS_COLON);
			setState(766);
			css_value();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
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
	public static class Css_valueContext extends ParserRuleContext {
		public List<Css_termContext> css_term() {
			return getRuleContexts(Css_termContext.class);
		}
		public Css_termContext css_term(int i) {
			return getRuleContext(Css_termContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
		}
		public List<TerminalNode> CSS_SLASH() { return getTokens(JinjaFlaskParser.CSS_SLASH); }
		public TerminalNode CSS_SLASH(int i) {
			return getToken(JinjaFlaskParser.CSS_SLASH, i);
		}
		public Css_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCss_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCss_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCss_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_css_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(771); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(770);
					css_term();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(773); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(785);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CSS_COMMA || _la==CSS_SLASH) {
						{
						setState(775);
						_la = _input.LA(1);
						if ( !(_la==CSS_COMMA || _la==CSS_SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(779); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(778);
							css_term();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(781); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(787);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
	public static class Css_termContext extends ParserRuleContext {
		public TerminalNode CSS_NUMBER() { return getToken(JinjaFlaskParser.CSS_NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public TerminalNode CSS_PERCENT() { return getToken(JinjaFlaskParser.CSS_PERCENT, 0); }
		public TerminalNode CSS_STRING() { return getToken(JinjaFlaskParser.CSS_STRING, 0); }
		public TerminalNode COLOR_HEX() { return getToken(JinjaFlaskParser.COLOR_HEX, 0); }
		public TerminalNode HASH() { return getToken(JinjaFlaskParser.HASH, 0); }
		public Css_functionCallContext css_functionCall() {
			return getRuleContext(Css_functionCallContext.class,0);
		}
		public TerminalNode JINJA_EXPR_START() { return getToken(JinjaFlaskParser.JINJA_EXPR_START, 0); }
		public JExpressionContext jExpression() {
			return getRuleContext(JExpressionContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(JinjaFlaskParser.JINJA_EXPR_END, 0); }
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public JStatementContext jStatement() {
			return getRuleContext(JStatementContext.class,0);
		}
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaFlaskParser.JINJA_STMT_END, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
		public Css_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCss_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCss_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCss_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_termContext css_term() throws RecognitionException {
		Css_termContext _localctx = new Css_termContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_css_term);
		int _la;
		try {
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(CSS_NUMBER);
				setState(790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(789);
					_la = _input.LA(1);
					if ( !(_la==CSS_PERCENT || _la==IDENT) ) {
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
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(CSS_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(793);
				match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				match(COLOR_HEX);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(795);
				match(HASH);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(796);
				css_functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(797);
				match(JINJA_EXPR_START);
				setState(798);
				jExpression();
				setState(799);
				match(JINJA_EXPR_END);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(801);
				match(JINJA_STMT_START);
				setState(802);
				jStatement();
				setState(803);
				match(JINJA_STMT_END);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(805);
				match(CSS_LPAREN);
				setState(806);
				css_value();
				setState(807);
				match(CSS_RPAREN);
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
	public static class Css_functionCallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public Css_valueListContext css_valueList() {
			return getRuleContext(Css_valueListContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
		public Css_functionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCss_functionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCss_functionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCss_functionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_functionCallContext css_functionCall() throws RecognitionException {
		Css_functionCallContext _localctx = new Css_functionCallContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_css_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(IDENT);
			setState(812);
			match(CSS_LPAREN);
			setState(813);
			css_valueList();
			setState(814);
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
	public static class Css_valueListContext extends ParserRuleContext {
		public List<Css_valueContext> css_value() {
			return getRuleContexts(Css_valueContext.class);
		}
		public Css_valueContext css_value(int i) {
			return getRuleContext(Css_valueContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
		}
		public Css_valueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCss_valueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCss_valueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCss_valueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_valueListContext css_valueList() throws RecognitionException {
		Css_valueListContext _localctx = new Css_valueListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_css_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			css_value();
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(817);
				match(CSS_COMMA);
				setState(818);
				css_value();
				}
				}
				setState(823);
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
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public DeclarationBlockContext declarationBlock() {
			return getRuleContext(DeclarationBlockContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public KeyframeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterKeyframeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitKeyframeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitKeyframeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeBlockContext keyframeBlock() throws RecognitionException {
		KeyframeBlockContext _localctx = new KeyframeBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_keyframeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			keyframeSelector();
			setState(825);
			match(CSS_LBRACE);
			setState(826);
			declarationBlock();
			setState(827);
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
	public static class KeyframeSelectorContext extends ParserRuleContext {
		public List<TerminalNode> CSS_NUMBER() { return getTokens(JinjaFlaskParser.CSS_NUMBER); }
		public TerminalNode CSS_NUMBER(int i) {
			return getToken(JinjaFlaskParser.CSS_NUMBER, i);
		}
		public List<TerminalNode> CSS_PERCENT() { return getTokens(JinjaFlaskParser.CSS_PERCENT); }
		public TerminalNode CSS_PERCENT(int i) {
			return getToken(JinjaFlaskParser.CSS_PERCENT, i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
		}
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public KeyframeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterKeyframeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitKeyframeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitKeyframeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeSelectorContext keyframeSelector() throws RecognitionException {
		KeyframeSelectorContext _localctx = new KeyframeSelectorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_keyframeSelector);
		int _la;
		try {
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_PERCENT:
			case CSS_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				_la = _input.LA(1);
				if ( !(_la==CSS_PERCENT || _la==CSS_NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COMMA) {
					{
					{
					setState(830);
					match(CSS_COMMA);
					setState(831);
					_la = _input.LA(1);
					if ( !(_la==CSS_PERCENT || _la==CSS_NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public JStatementContext jStatement() {
			return getRuleContext(JStatementContext.class,0);
		}
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaFlaskParser.JINJA_STMT_END, 0); }
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
		enterRule(_localctx, 146, RULE_jinjaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(JINJA_STMT_START);
			setState(841);
			jStatement();
			setState(842);
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
	public static class JStatementContext extends ParserRuleContext {
		public JIfStatementContext jIfStatement() {
			return getRuleContext(JIfStatementContext.class,0);
		}
		public JForStatementContext jForStatement() {
			return getRuleContext(JForStatementContext.class,0);
		}
		public TerminalNode J_NAME() { return getToken(JinjaFlaskParser.J_NAME, 0); }
		public JTestExprContext jTestExpr() {
			return getRuleContext(JTestExprContext.class,0);
		}
		public TerminalNode J_SET() { return getToken(JinjaFlaskParser.J_SET, 0); }
		public JExpressionContext jExpression() {
			return getRuleContext(JExpressionContext.class,0);
		}
		public JRawStatementContext jRawStatement() {
			return getRuleContext(JRawStatementContext.class,0);
		}
		public TerminalNode J_LPAREN() { return getToken(JinjaFlaskParser.J_LPAREN, 0); }
		public JArgumentListContext jArgumentList() {
			return getRuleContext(JArgumentListContext.class,0);
		}
		public TerminalNode J_RPAREN() { return getToken(JinjaFlaskParser.J_RPAREN, 0); }
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
		enterRule(_localctx, 148, RULE_jStatement);
		int _la;
		try {
			setState(860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				jIfStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				jForStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(846);
				match(J_NAME);
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 549766823967L) != 0)) {
					{
					setState(847);
					jTestExpr();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(850);
				match(J_SET);
				setState(851);
				jExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(852);
				jRawStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(853);
				match(J_NAME);
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==J_LPAREN) {
					{
					setState(854);
					match(J_LPAREN);
					setState(855);
					jArgumentList();
					setState(856);
					match(J_RPAREN);
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
	public static class JRawStatementContext extends ParserRuleContext {
		public TerminalNode J_RAW() { return getToken(JinjaFlaskParser.J_RAW, 0); }
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode J_ENDRAW() { return getToken(JinjaFlaskParser.J_ENDRAW, 0); }
		public JRawStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jRawStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJRawStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJRawStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJRawStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JRawStatementContext jRawStatement() throws RecognitionException {
		JRawStatementContext _localctx = new JRawStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_jRawStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(J_RAW);
			setState(863);
			html_content();
			setState(864);
			match(J_ENDRAW);
			}
		}
		catch (RecognitionException re) {
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
	public static class JIfStatementContext extends ParserRuleContext {
		public TerminalNode J_IF() { return getToken(JinjaFlaskParser.J_IF, 0); }
		public List<JTestExprContext> jTestExpr() {
			return getRuleContexts(JTestExprContext.class);
		}
		public JTestExprContext jTestExpr(int i) {
			return getRuleContext(JTestExprContext.class,i);
		}
		public List<Html_contentContext> html_content() {
			return getRuleContexts(Html_contentContext.class);
		}
		public Html_contentContext html_content(int i) {
			return getRuleContext(Html_contentContext.class,i);
		}
		public TerminalNode J_ENDIF() { return getToken(JinjaFlaskParser.J_ENDIF, 0); }
		public List<TerminalNode> J_ELIF() { return getTokens(JinjaFlaskParser.J_ELIF); }
		public TerminalNode J_ELIF(int i) {
			return getToken(JinjaFlaskParser.J_ELIF, i);
		}
		public TerminalNode J_ELSE() { return getToken(JinjaFlaskParser.J_ELSE, 0); }
		public JIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JIfStatementContext jIfStatement() throws RecognitionException {
		JIfStatementContext _localctx = new JIfStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_jIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(J_IF);
			setState(867);
			jTestExpr();
			setState(868);
			html_content();
			setState(875);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_ELIF) {
				{
				{
				setState(869);
				match(J_ELIF);
				setState(870);
				jTestExpr();
				setState(871);
				html_content();
				}
				}
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_ELSE) {
				{
				setState(878);
				match(J_ELSE);
				setState(879);
				html_content();
				}
			}

			setState(882);
			match(J_ENDIF);
			}
		}
		catch (RecognitionException re) {
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
	public static class JForStatementContext extends ParserRuleContext {
		public TerminalNode J_FOR() { return getToken(JinjaFlaskParser.J_FOR, 0); }
		public JTargetListContext jTargetList() {
			return getRuleContext(JTargetListContext.class,0);
		}
		public TerminalNode J_IN() { return getToken(JinjaFlaskParser.J_IN, 0); }
		public JExpressionContext jExpression() {
			return getRuleContext(JExpressionContext.class,0);
		}
		public List<Html_contentContext> html_content() {
			return getRuleContexts(Html_contentContext.class);
		}
		public Html_contentContext html_content(int i) {
			return getRuleContext(Html_contentContext.class,i);
		}
		public TerminalNode J_ENDFOR() { return getToken(JinjaFlaskParser.J_ENDFOR, 0); }
		public TerminalNode J_ELSE() { return getToken(JinjaFlaskParser.J_ELSE, 0); }
		public JForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JForStatementContext jForStatement() throws RecognitionException {
		JForStatementContext _localctx = new JForStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_jForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(J_FOR);
			setState(885);
			jTargetList();
			setState(886);
			match(J_IN);
			setState(887);
			jExpression();
			setState(888);
			html_content();
			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_ELSE) {
				{
				setState(889);
				match(J_ELSE);
				setState(890);
				html_content();
				}
			}

			setState(893);
			match(J_ENDFOR);
			}
		}
		catch (RecognitionException re) {
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
	public static class JTargetListContext extends ParserRuleContext {
		public List<TerminalNode> J_NAME() { return getTokens(JinjaFlaskParser.J_NAME); }
		public TerminalNode J_NAME(int i) {
			return getToken(JinjaFlaskParser.J_NAME, i);
		}
		public List<TerminalNode> J_COMMA() { return getTokens(JinjaFlaskParser.J_COMMA); }
		public TerminalNode J_COMMA(int i) {
			return getToken(JinjaFlaskParser.J_COMMA, i);
		}
		public JTargetListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jTargetList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJTargetList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJTargetList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJTargetList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JTargetListContext jTargetList() throws RecognitionException {
		JTargetListContext _localctx = new JTargetListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_jTargetList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			match(J_NAME);
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(896);
				match(J_COMMA);
				setState(897);
				match(J_NAME);
				}
				}
				setState(902);
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
	public static class JinjaExpressionContext extends ParserRuleContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(JinjaFlaskParser.JINJA_EXPR_START, 0); }
		public JExpressionContext jExpression() {
			return getRuleContext(JExpressionContext.class,0);
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
		enterRule(_localctx, 158, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(JINJA_EXPR_START);
			setState(904);
			jExpression();
			setState(905);
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
	public static class JExpressionContext extends ParserRuleContext {
		public JTestExprContext jTestExpr() {
			return getRuleContext(JTestExprContext.class,0);
		}
		public List<TerminalNode> J_PIPE() { return getTokens(JinjaFlaskParser.J_PIPE); }
		public TerminalNode J_PIPE(int i) {
			return getToken(JinjaFlaskParser.J_PIPE, i);
		}
		public List<JFilterContext> jFilter() {
			return getRuleContexts(JFilterContext.class);
		}
		public JFilterContext jFilter(int i) {
			return getRuleContext(JFilterContext.class,i);
		}
		public JExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JExpressionContext jExpression() throws RecognitionException {
		JExpressionContext _localctx = new JExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_jExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			jTestExpr();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_PIPE) {
				{
				{
				setState(908);
				match(J_PIPE);
				setState(909);
				jFilter();
				}
				}
				setState(914);
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
	public static class JFilterContext extends ParserRuleContext {
		public TerminalNode J_NAME() { return getToken(JinjaFlaskParser.J_NAME, 0); }
		public TerminalNode J_LPAREN() { return getToken(JinjaFlaskParser.J_LPAREN, 0); }
		public TerminalNode J_RPAREN() { return getToken(JinjaFlaskParser.J_RPAREN, 0); }
		public JArgumentListContext jArgumentList() {
			return getRuleContext(JArgumentListContext.class,0);
		}
		public JFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JFilterContext jFilter() throws RecognitionException {
		JFilterContext _localctx = new JFilterContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_jFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(J_NAME);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_LPAREN) {
				{
				setState(916);
				match(J_LPAREN);
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 549766823967L) != 0)) {
					{
					setState(917);
					jArgumentList();
					}
				}

				setState(920);
				match(J_RPAREN);
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
	public static class JTestExprContext extends ParserRuleContext {
		public JOrTestContext jOrTest() {
			return getRuleContext(JOrTestContext.class,0);
		}
		public JTestExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jTestExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJTestExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJTestExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJTestExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JTestExprContext jTestExpr() throws RecognitionException {
		JTestExprContext _localctx = new JTestExprContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_jTestExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			jOrTest();
			}
		}
		catch (RecognitionException re) {
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
	public static class JOrTestContext extends ParserRuleContext {
		public List<JAndTestContext> jAndTest() {
			return getRuleContexts(JAndTestContext.class);
		}
		public JAndTestContext jAndTest(int i) {
			return getRuleContext(JAndTestContext.class,i);
		}
		public List<TerminalNode> J_OR() { return getTokens(JinjaFlaskParser.J_OR); }
		public TerminalNode J_OR(int i) {
			return getToken(JinjaFlaskParser.J_OR, i);
		}
		public JOrTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jOrTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJOrTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJOrTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJOrTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JOrTestContext jOrTest() throws RecognitionException {
		JOrTestContext _localctx = new JOrTestContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_jOrTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			jAndTest();
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_OR) {
				{
				{
				setState(926);
				match(J_OR);
				setState(927);
				jAndTest();
				}
				}
				setState(932);
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
	public static class JAndTestContext extends ParserRuleContext {
		public List<JNotTestContext> jNotTest() {
			return getRuleContexts(JNotTestContext.class);
		}
		public JNotTestContext jNotTest(int i) {
			return getRuleContext(JNotTestContext.class,i);
		}
		public List<TerminalNode> J_AND() { return getTokens(JinjaFlaskParser.J_AND); }
		public TerminalNode J_AND(int i) {
			return getToken(JinjaFlaskParser.J_AND, i);
		}
		public JAndTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jAndTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJAndTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJAndTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJAndTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JAndTestContext jAndTest() throws RecognitionException {
		JAndTestContext _localctx = new JAndTestContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_jAndTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			jNotTest();
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_AND) {
				{
				{
				setState(934);
				match(J_AND);
				setState(935);
				jNotTest();
				}
				}
				setState(940);
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
	public static class JNotTestContext extends ParserRuleContext {
		public TerminalNode J_NOT() { return getToken(JinjaFlaskParser.J_NOT, 0); }
		public JNotTestContext jNotTest() {
			return getRuleContext(JNotTestContext.class,0);
		}
		public JComparisonContext jComparison() {
			return getRuleContext(JComparisonContext.class,0);
		}
		public JNotTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jNotTest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJNotTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJNotTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJNotTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JNotTestContext jNotTest() throws RecognitionException {
		JNotTestContext _localctx = new JNotTestContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_jNotTest);
		try {
			setState(944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(J_NOT);
				setState(942);
				jNotTest();
				}
				break;
			case J_NUMBER:
			case J_STRING:
			case J_NAME:
			case J_PLUS:
			case J_MINUS:
			case J_LPAREN:
			case J_LBRACK:
			case J_LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				jComparison();
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
	public static class JComparisonContext extends ParserRuleContext {
		public List<JMathExprContext> jMathExpr() {
			return getRuleContexts(JMathExprContext.class);
		}
		public JMathExprContext jMathExpr(int i) {
			return getRuleContext(JMathExprContext.class,i);
		}
		public List<JCompOpContext> jCompOp() {
			return getRuleContexts(JCompOpContext.class);
		}
		public JCompOpContext jCompOp(int i) {
			return getRuleContext(JCompOpContext.class,i);
		}
		public JComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JComparisonContext jComparison() throws RecognitionException {
		JComparisonContext _localctx = new JComparisonContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_jComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			jMathExpr();
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 1082130495L) != 0)) {
				{
				{
				setState(947);
				jCompOp();
				setState(948);
				jMathExpr();
				}
				}
				setState(954);
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
	public static class JCompOpContext extends ParserRuleContext {
		public TerminalNode J_LT() { return getToken(JinjaFlaskParser.J_LT, 0); }
		public TerminalNode J_GT() { return getToken(JinjaFlaskParser.J_GT, 0); }
		public TerminalNode J_EQ() { return getToken(JinjaFlaskParser.J_EQ, 0); }
		public TerminalNode J_NE() { return getToken(JinjaFlaskParser.J_NE, 0); }
		public TerminalNode J_GE() { return getToken(JinjaFlaskParser.J_GE, 0); }
		public TerminalNode J_LE() { return getToken(JinjaFlaskParser.J_LE, 0); }
		public TerminalNode J_IN() { return getToken(JinjaFlaskParser.J_IN, 0); }
		public TerminalNode J_NOT() { return getToken(JinjaFlaskParser.J_NOT, 0); }
		public JCompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jCompOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JCompOpContext jCompOp() throws RecognitionException {
		JCompOpContext _localctx = new JCompOpContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_jCompOp);
		try {
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				match(J_LT);
				}
				break;
			case J_GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(J_GT);
				}
				break;
			case J_EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				match(J_EQ);
				}
				break;
			case J_NE:
				enterOuterAlt(_localctx, 4);
				{
				setState(958);
				match(J_NE);
				}
				break;
			case J_GE:
				enterOuterAlt(_localctx, 5);
				{
				setState(959);
				match(J_GE);
				}
				break;
			case J_LE:
				enterOuterAlt(_localctx, 6);
				{
				setState(960);
				match(J_LE);
				}
				break;
			case J_IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(961);
				match(J_IN);
				}
				break;
			case J_NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(962);
				match(J_NOT);
				setState(963);
				match(J_IN);
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
	public static class JMathExprContext extends ParserRuleContext {
		public List<JTermContext> jTerm() {
			return getRuleContexts(JTermContext.class);
		}
		public JTermContext jTerm(int i) {
			return getRuleContext(JTermContext.class,i);
		}
		public List<TerminalNode> J_PLUS() { return getTokens(JinjaFlaskParser.J_PLUS); }
		public TerminalNode J_PLUS(int i) {
			return getToken(JinjaFlaskParser.J_PLUS, i);
		}
		public List<TerminalNode> J_MINUS() { return getTokens(JinjaFlaskParser.J_MINUS); }
		public TerminalNode J_MINUS(int i) {
			return getToken(JinjaFlaskParser.J_MINUS, i);
		}
		public JMathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jMathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JMathExprContext jMathExpr() throws RecognitionException {
		JMathExprContext _localctx = new JMathExprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_jMathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			jTerm();
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_PLUS || _la==J_MINUS) {
				{
				{
				setState(967);
				_la = _input.LA(1);
				if ( !(_la==J_PLUS || _la==J_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(968);
				jTerm();
				}
				}
				setState(973);
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
	public static class JTermContext extends ParserRuleContext {
		public List<JFactorContext> jFactor() {
			return getRuleContexts(JFactorContext.class);
		}
		public JFactorContext jFactor(int i) {
			return getRuleContext(JFactorContext.class,i);
		}
		public List<TerminalNode> J_TIMES() { return getTokens(JinjaFlaskParser.J_TIMES); }
		public TerminalNode J_TIMES(int i) {
			return getToken(JinjaFlaskParser.J_TIMES, i);
		}
		public List<TerminalNode> J_DIVIDE() { return getTokens(JinjaFlaskParser.J_DIVIDE); }
		public TerminalNode J_DIVIDE(int i) {
			return getToken(JinjaFlaskParser.J_DIVIDE, i);
		}
		public List<TerminalNode> J_MOD() { return getTokens(JinjaFlaskParser.J_MOD); }
		public TerminalNode J_MOD(int i) {
			return getToken(JinjaFlaskParser.J_MOD, i);
		}
		public List<TerminalNode> J_POW() { return getTokens(JinjaFlaskParser.J_POW); }
		public TerminalNode J_POW(int i) {
			return getToken(JinjaFlaskParser.J_POW, i);
		}
		public JTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JTermContext jTerm() throws RecognitionException {
		JTermContext _localctx = new JTermContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_jTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			jFactor();
			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 15L) != 0)) {
				{
				{
				setState(975);
				_la = _input.LA(1);
				if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(976);
				jFactor();
				}
				}
				setState(981);
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
	public static class JFactorContext extends ParserRuleContext {
		public JFactorContext jFactor() {
			return getRuleContext(JFactorContext.class,0);
		}
		public TerminalNode J_PLUS() { return getToken(JinjaFlaskParser.J_PLUS, 0); }
		public TerminalNode J_MINUS() { return getToken(JinjaFlaskParser.J_MINUS, 0); }
		public JAtomExprContext jAtomExpr() {
			return getRuleContext(JAtomExprContext.class,0);
		}
		public JFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JFactorContext jFactor() throws RecognitionException {
		JFactorContext _localctx = new JFactorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_jFactor);
		int _la;
		try {
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_PLUS:
			case J_MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				_la = _input.LA(1);
				if ( !(_la==J_PLUS || _la==J_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(983);
				jFactor();
				}
				break;
			case J_NUMBER:
			case J_STRING:
			case J_NAME:
			case J_LPAREN:
			case J_LBRACK:
			case J_LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				jAtomExpr();
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
	public static class JAtomExprContext extends ParserRuleContext {
		public JAtomContext jAtom() {
			return getRuleContext(JAtomContext.class,0);
		}
		public List<JTrailerContext> jTrailer() {
			return getRuleContexts(JTrailerContext.class);
		}
		public JTrailerContext jTrailer(int i) {
			return getRuleContext(JTrailerContext.class,i);
		}
		public JAtomExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jAtomExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JAtomExprContext jAtomExpr() throws RecognitionException {
		JAtomExprContext _localctx = new JAtomExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_jAtomExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			jAtom();
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 41L) != 0)) {
				{
				{
				setState(988);
				jTrailer();
				}
				}
				setState(993);
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
	public static class JTrailerContext extends ParserRuleContext {
		public TerminalNode J_LPAREN() { return getToken(JinjaFlaskParser.J_LPAREN, 0); }
		public TerminalNode J_RPAREN() { return getToken(JinjaFlaskParser.J_RPAREN, 0); }
		public JArgumentListContext jArgumentList() {
			return getRuleContext(JArgumentListContext.class,0);
		}
		public TerminalNode J_LBRACK() { return getToken(JinjaFlaskParser.J_LBRACK, 0); }
		public JTestExprContext jTestExpr() {
			return getRuleContext(JTestExprContext.class,0);
		}
		public TerminalNode J_RBRACK() { return getToken(JinjaFlaskParser.J_RBRACK, 0); }
		public TerminalNode J_DOT() { return getToken(JinjaFlaskParser.J_DOT, 0); }
		public TerminalNode J_NAME() { return getToken(JinjaFlaskParser.J_NAME, 0); }
		public JTrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jTrailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JTrailerContext jTrailer() throws RecognitionException {
		JTrailerContext _localctx = new JTrailerContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_jTrailer);
		int _la;
		try {
			setState(1005);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				match(J_LPAREN);
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 549766823967L) != 0)) {
					{
					setState(995);
					jArgumentList();
					}
				}

				setState(998);
				match(J_RPAREN);
				}
				break;
			case J_LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(999);
				match(J_LBRACK);
				setState(1000);
				jTestExpr();
				setState(1001);
				match(J_RBRACK);
				}
				break;
			case J_DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1003);
				match(J_DOT);
				setState(1004);
				match(J_NAME);
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
	public static class JAtomContext extends ParserRuleContext {
		public TerminalNode J_NAME() { return getToken(JinjaFlaskParser.J_NAME, 0); }
		public TerminalNode J_NUMBER() { return getToken(JinjaFlaskParser.J_NUMBER, 0); }
		public TerminalNode J_STRING() { return getToken(JinjaFlaskParser.J_STRING, 0); }
		public TerminalNode J_LPAREN() { return getToken(JinjaFlaskParser.J_LPAREN, 0); }
		public JTestExprContext jTestExpr() {
			return getRuleContext(JTestExprContext.class,0);
		}
		public TerminalNode J_RPAREN() { return getToken(JinjaFlaskParser.J_RPAREN, 0); }
		public TerminalNode J_LBRACK() { return getToken(JinjaFlaskParser.J_LBRACK, 0); }
		public TerminalNode J_RBRACK() { return getToken(JinjaFlaskParser.J_RBRACK, 0); }
		public JTestExprListContext jTestExprList() {
			return getRuleContext(JTestExprListContext.class,0);
		}
		public TerminalNode J_LBRACE() { return getToken(JinjaFlaskParser.J_LBRACE, 0); }
		public TerminalNode J_RBRACE() { return getToken(JinjaFlaskParser.J_RBRACE, 0); }
		public JDictMakerContext jDictMaker() {
			return getRuleContext(JDictMakerContext.class,0);
		}
		public JAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JAtomContext jAtom() throws RecognitionException {
		JAtomContext _localctx = new JAtomContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_jAtom);
		int _la;
		try {
			setState(1024);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				match(J_NAME);
				}
				break;
			case J_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(J_NUMBER);
				}
				break;
			case J_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1009);
				match(J_STRING);
				}
				break;
			case J_LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				match(J_LPAREN);
				setState(1011);
				jTestExpr();
				setState(1012);
				match(J_RPAREN);
				}
				break;
			case J_LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1014);
				match(J_LBRACK);
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 549766823967L) != 0)) {
					{
					setState(1015);
					jTestExprList();
					}
				}

				setState(1018);
				match(J_RBRACK);
				}
				break;
			case J_LBRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1019);
				match(J_LBRACE);
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 549766823967L) != 0)) {
					{
					setState(1020);
					jDictMaker();
					}
				}

				setState(1023);
				match(J_RBRACE);
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
	public static class JTestExprListContext extends ParserRuleContext {
		public List<JTestExprContext> jTestExpr() {
			return getRuleContexts(JTestExprContext.class);
		}
		public JTestExprContext jTestExpr(int i) {
			return getRuleContext(JTestExprContext.class,i);
		}
		public List<TerminalNode> J_COMMA() { return getTokens(JinjaFlaskParser.J_COMMA); }
		public TerminalNode J_COMMA(int i) {
			return getToken(JinjaFlaskParser.J_COMMA, i);
		}
		public JTestExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jTestExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJTestExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJTestExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJTestExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JTestExprListContext jTestExprList() throws RecognitionException {
		JTestExprListContext _localctx = new JTestExprListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_jTestExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			jTestExpr();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1027);
				match(J_COMMA);
				setState(1028);
				jTestExpr();
				}
				}
				setState(1033);
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
	public static class JArgumentListContext extends ParserRuleContext {
		public List<JTestExprContext> jTestExpr() {
			return getRuleContexts(JTestExprContext.class);
		}
		public JTestExprContext jTestExpr(int i) {
			return getRuleContext(JTestExprContext.class,i);
		}
		public List<TerminalNode> J_COMMA() { return getTokens(JinjaFlaskParser.J_COMMA); }
		public TerminalNode J_COMMA(int i) {
			return getToken(JinjaFlaskParser.J_COMMA, i);
		}
		public JArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JArgumentListContext jArgumentList() throws RecognitionException {
		JArgumentListContext _localctx = new JArgumentListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_jArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			jTestExpr();
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1035);
				match(J_COMMA);
				setState(1036);
				jTestExpr();
				}
				}
				setState(1041);
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
	public static class JDictMakerContext extends ParserRuleContext {
		public List<JTestExprContext> jTestExpr() {
			return getRuleContexts(JTestExprContext.class);
		}
		public JTestExprContext jTestExpr(int i) {
			return getRuleContext(JTestExprContext.class,i);
		}
		public List<TerminalNode> J_COLON() { return getTokens(JinjaFlaskParser.J_COLON); }
		public TerminalNode J_COLON(int i) {
			return getToken(JinjaFlaskParser.J_COLON, i);
		}
		public List<TerminalNode> J_COMMA() { return getTokens(JinjaFlaskParser.J_COMMA); }
		public TerminalNode J_COMMA(int i) {
			return getToken(JinjaFlaskParser.J_COMMA, i);
		}
		public JDictMakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jDictMaker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJDictMaker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJDictMaker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJDictMaker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JDictMakerContext jDictMaker() throws RecognitionException {
		JDictMakerContext _localctx = new JDictMakerContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_jDictMaker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			jTestExpr();
			setState(1043);
			match(J_COLON);
			setState(1044);
			jTestExpr();
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1045);
				match(J_COMMA);
				setState(1046);
				jTestExpr();
				setState(1047);
				match(J_COLON);
				setState(1048);
				jTestExpr();
				}
				}
				setState(1054);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00b2\u0420\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0001\u0000\u0001\u0000\u0005\u0000\u00c5"+
		"\b\u0000\n\u0000\f\u0000\u00c8\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00ce\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u00d3\b\u0002\n\u0002\f\u0002\u00d6\t\u0002\u0003\u0002\u00d8"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00e2\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00e7\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00ed\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00f7\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00fd\b\u0007\n\u0007\f\u0007\u0100\t\u0007\u0001\b\u0001\b\u0003"+
		"\b\u0104\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u010a\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0111\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0116\b\u000b\n\u000b\f\u000b\u0119\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u011e\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u0123"+
		"\b\r\n\r\f\r\u0126\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u012c\b\u000e\n\u000e\f\u000e\u012f\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u0135\b\u0010\u000b\u0010\f"+
		"\u0010\u0136\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u013d\b\u0011\u0001\u0011\u0003\u0011\u0140\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0149\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0150\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0157\b\u0014\n\u0014\f\u0014\u015a\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0165\b\u0015\n\u0015"+
		"\f\u0015\u0168\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u016d\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0171\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004"+
		"\u0018\u0179\b\u0018\u000b\u0018\f\u0018\u017a\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u017f\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0184\b\u0019\n\u0019\f\u0019\u0187\t\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u018e\b\u001b\n\u001b\f\u001b"+
		"\u0191\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0196\b"+
		"\u001c\n\u001c\f\u001c\u0199\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u019e\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u01a4\b\u001e\n\u001e\f\u001e\u01a7\t\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01b2\b\u001f\u0001 \u0001 \u0001 \u0005"+
		" \u01b7\b \n \f \u01ba\t \u0001!\u0001!\u0001!\u0005!\u01bf\b!\n!\f!\u01c2"+
		"\t!\u0001\"\u0001\"\u0001\"\u0003\"\u01c7\b\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0005$\u01cd\b$\n$\f$\u01d0\t$\u0001%\u0001%\u0003%\u01d4\b%\u0001%"+
		"\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01dd\b%\u0001&\u0001"+
		"&\u0001&\u0004&\u01e2\b&\u000b&\f&\u01e3\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u01eb\b&\u0001&\u0001&\u0001&\u0003&\u01f0\b&\u0001&\u0001&\u0001"+
		"&\u0003&\u01f5\b&\u0001&\u0003&\u01f8\b&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u0200\b\'\n\'\f\'\u0203\t\'\u0003\'\u0205\b"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u020d\b(\n(\f(\u0210"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u021a"+
		"\b)\n)\f)\u021d\t)\u0001*\u0001*\u0001*\u0005*\u0222\b*\n*\f*\u0225\t"+
		"*\u0001+\u0001+\u0001+\u0001+\u0003+\u022b\b+\u0001,\u0001,\u0005,\u022f"+
		"\b,\n,\f,\u0232\t,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u023f\b,\u0001-\u0001-\u0001-\u0003-\u0244"+
		"\b-\u0001-\u0001-\u0001-\u0001-\u0003-\u024a\b-\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0005/\u0253\b/\n/\f/\u0256\t/\u0001/\u0001/\u0001"+
		"0\u00010\u00030\u025c\b0\u00011\u00011\u00011\u00011\u00011\u00012\u0001"+
		"2\u00012\u00052\u0266\b2\n2\f2\u0269\t2\u00013\u00013\u00033\u026d\b3"+
		"\u00013\u00053\u0270\b3\n3\f3\u0273\t3\u00014\u00014\u00015\u00015\u0003"+
		"5\u0279\b5\u00015\u00015\u00015\u00015\u00055\u027f\b5\n5\f5\u0282\t5"+
		"\u00015\u00015\u00015\u00015\u00045\u0288\b5\u000b5\f5\u0289\u00035\u028c"+
		"\b5\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001"+
		":\u0001;\u0001;\u0001;\u0001;\u0003;\u029c\b;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0003<\u02a3\b<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0005<\u02ae\b<\n<\f<\u02b1\t<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0005<\u02c2\b<\n<\f<\u02c5\t<\u0001<\u0003<\u02c8\b<\u0001="+
		"\u0001=\u0001=\u0001=\u0003=\u02ce\b=\u0001>\u0001>\u0001>\u0005>\u02d3"+
		"\b>\n>\f>\u02d6\t>\u0001?\u0003?\u02d9\b?\u0001?\u0003?\u02dc\b?\u0001"+
		"?\u0001?\u0001?\u0001?\u0003?\u02e2\b?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u02e9\b?\u0005?\u02eb\b?\n?\f?\u02ee\t?\u0001@\u0001@\u0003@"+
		"\u02f2\b@\u0001@\u0001@\u0001@\u0001@\u0005@\u02f8\b@\n@\f@\u02fb\t@\u0001"+
		"A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001C\u0004C\u0304\bC\u000bC\fC"+
		"\u0305\u0001C\u0003C\u0309\bC\u0001C\u0004C\u030c\bC\u000bC\fC\u030d\u0005"+
		"C\u0310\bC\nC\fC\u0313\tC\u0001D\u0001D\u0003D\u0317\bD\u0001D\u0001D"+
		"\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u032a\bD\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001F\u0001F\u0001F\u0005F\u0334\bF\nF\fF\u0337\tF\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0005H\u0341\bH\nH"+
		"\fH\u0344\tH\u0001H\u0003H\u0347\bH\u0001I\u0001I\u0001I\u0001I\u0001"+
		"J\u0001J\u0001J\u0001J\u0003J\u0351\bJ\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0003J\u035b\bJ\u0003J\u035d\bJ\u0001K\u0001K\u0001"+
		"K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0005L\u036a"+
		"\bL\nL\fL\u036d\tL\u0001L\u0001L\u0003L\u0371\bL\u0001L\u0001L\u0001M"+
		"\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u037c\bM\u0001M\u0001"+
		"M\u0001N\u0001N\u0001N\u0005N\u0383\bN\nN\fN\u0386\tN\u0001O\u0001O\u0001"+
		"O\u0001O\u0001P\u0001P\u0001P\u0005P\u038f\bP\nP\fP\u0392\tP\u0001Q\u0001"+
		"Q\u0001Q\u0003Q\u0397\bQ\u0001Q\u0003Q\u039a\bQ\u0001R\u0001R\u0001S\u0001"+
		"S\u0001S\u0005S\u03a1\bS\nS\fS\u03a4\tS\u0001T\u0001T\u0001T\u0005T\u03a9"+
		"\bT\nT\fT\u03ac\tT\u0001U\u0001U\u0001U\u0003U\u03b1\bU\u0001V\u0001V"+
		"\u0001V\u0001V\u0005V\u03b7\bV\nV\fV\u03ba\tV\u0001W\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0001W\u0001W\u0003W\u03c5\bW\u0001X\u0001X\u0001"+
		"X\u0005X\u03ca\bX\nX\fX\u03cd\tX\u0001Y\u0001Y\u0001Y\u0005Y\u03d2\bY"+
		"\nY\fY\u03d5\tY\u0001Z\u0001Z\u0001Z\u0003Z\u03da\bZ\u0001[\u0001[\u0005"+
		"[\u03de\b[\n[\f[\u03e1\t[\u0001\\\u0001\\\u0003\\\u03e5\b\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u03ee\b\\\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0003]\u03f9\b]\u0001"+
		"]\u0001]\u0001]\u0003]\u03fe\b]\u0001]\u0003]\u0401\b]\u0001^\u0001^\u0001"+
		"^\u0005^\u0406\b^\n^\f^\u0409\t^\u0001_\u0001_\u0001_\u0005_\u040e\b_"+
		"\n_\f_\u0411\t_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0005`\u041b\b`\n`\f`\u041e\t`\u0001`\u0000\u0000a\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u0000\u000b\u0002\u0000\u0003\u0003\u001c"+
		"\u001c\u0001\u0000%&\u0001\u0000\')\u0001\u0000FG\u0001\u0000[]\u0001"+
		"\u0000lm\u0002\u0000WWYY\u0002\u0000ZZnn\u0002\u0000ZZgg\u0001\u0000t"+
		"u\u0001\u0000vy\u0470\u0000\u00c6\u0001\u0000\u0000\u0000\u0002\u00cd"+
		"\u0001\u0000\u0000\u0000\u0004\u00d7\u0001\u0000\u0000\u0000\u0006\u00e1"+
		"\u0001\u0000\u0000\u0000\b\u00e6\u0001\u0000\u0000\u0000\n\u00e8\u0001"+
		"\u0000\u0000\u0000\f\u00f6\u0001\u0000\u0000\u0000\u000e\u00fe\u0001\u0000"+
		"\u0000\u0000\u0010\u0103\u0001\u0000\u0000\u0000\u0012\u0105\u0001\u0000"+
		"\u0000\u0000\u0014\u010b\u0001\u0000\u0000\u0000\u0016\u0112\u0001\u0000"+
		"\u0000\u0000\u0018\u011a\u0001\u0000\u0000\u0000\u001a\u011f\u0001\u0000"+
		"\u0000\u0000\u001c\u0127\u0001\u0000\u0000\u0000\u001e\u0130\u0001\u0000"+
		"\u0000\u0000 \u0134\u0001\u0000\u0000\u0000\"\u0138\u0001\u0000\u0000"+
		"\u0000$\u0143\u0001\u0000\u0000\u0000&\u014d\u0001\u0000\u0000\u0000("+
		"\u0153\u0001\u0000\u0000\u0000*\u015b\u0001\u0000\u0000\u0000,\u016e\u0001"+
		"\u0000\u0000\u0000.\u0172\u0001\u0000\u0000\u00000\u017e\u0001\u0000\u0000"+
		"\u00002\u0180\u0001\u0000\u0000\u00004\u0188\u0001\u0000\u0000\u00006"+
		"\u018a\u0001\u0000\u0000\u00008\u0192\u0001\u0000\u0000\u0000:\u019d\u0001"+
		"\u0000\u0000\u0000<\u019f\u0001\u0000\u0000\u0000>\u01b1\u0001\u0000\u0000"+
		"\u0000@\u01b3\u0001\u0000\u0000\u0000B\u01bb\u0001\u0000\u0000\u0000D"+
		"\u01c6\u0001\u0000\u0000\u0000F\u01c8\u0001\u0000\u0000\u0000H\u01ca\u0001"+
		"\u0000\u0000\u0000J\u01dc\u0001\u0000\u0000\u0000L\u01f7\u0001\u0000\u0000"+
		"\u0000N\u0204\u0001\u0000\u0000\u0000P\u0206\u0001\u0000\u0000\u0000R"+
		"\u0211\u0001\u0000\u0000\u0000T\u021e\u0001\u0000\u0000\u0000V\u022a\u0001"+
		"\u0000\u0000\u0000X\u023e\u0001\u0000\u0000\u0000Z\u0249\u0001\u0000\u0000"+
		"\u0000\\\u024b\u0001\u0000\u0000\u0000^\u0254\u0001\u0000\u0000\u0000"+
		"`\u025b\u0001\u0000\u0000\u0000b\u025d\u0001\u0000\u0000\u0000d\u0262"+
		"\u0001\u0000\u0000\u0000f\u026a\u0001\u0000\u0000\u0000h\u0274\u0001\u0000"+
		"\u0000\u0000j\u028b\u0001\u0000\u0000\u0000l\u028d\u0001\u0000\u0000\u0000"+
		"n\u028f\u0001\u0000\u0000\u0000p\u0291\u0001\u0000\u0000\u0000r\u0293"+
		"\u0001\u0000\u0000\u0000t\u0295\u0001\u0000\u0000\u0000v\u0297\u0001\u0000"+
		"\u0000\u0000x\u02c7\u0001\u0000\u0000\u0000z\u02cd\u0001\u0000\u0000\u0000"+
		"|\u02cf\u0001\u0000\u0000\u0000~\u02d8\u0001\u0000\u0000\u0000\u0080\u02f9"+
		"\u0001\u0000\u0000\u0000\u0082\u02fc\u0001\u0000\u0000\u0000\u0084\u0300"+
		"\u0001\u0000\u0000\u0000\u0086\u0303\u0001\u0000\u0000\u0000\u0088\u0329"+
		"\u0001\u0000\u0000\u0000\u008a\u032b\u0001\u0000\u0000\u0000\u008c\u0330"+
		"\u0001\u0000\u0000\u0000\u008e\u0338\u0001\u0000\u0000\u0000\u0090\u0346"+
		"\u0001\u0000\u0000\u0000\u0092\u0348\u0001\u0000\u0000\u0000\u0094\u035c"+
		"\u0001\u0000\u0000\u0000\u0096\u035e\u0001\u0000\u0000\u0000\u0098\u0362"+
		"\u0001\u0000\u0000\u0000\u009a\u0374\u0001\u0000\u0000\u0000\u009c\u037f"+
		"\u0001\u0000\u0000\u0000\u009e\u0387\u0001\u0000\u0000\u0000\u00a0\u038b"+
		"\u0001\u0000\u0000\u0000\u00a2\u0393\u0001\u0000\u0000\u0000\u00a4\u039b"+
		"\u0001\u0000\u0000\u0000\u00a6\u039d\u0001\u0000\u0000\u0000\u00a8\u03a5"+
		"\u0001\u0000\u0000\u0000\u00aa\u03b0\u0001\u0000\u0000\u0000\u00ac\u03b2"+
		"\u0001\u0000\u0000\u0000\u00ae\u03c4\u0001\u0000\u0000\u0000\u00b0\u03c6"+
		"\u0001\u0000\u0000\u0000\u00b2\u03ce\u0001\u0000\u0000\u0000\u00b4\u03d9"+
		"\u0001\u0000\u0000\u0000\u00b6\u03db\u0001\u0000\u0000\u0000\u00b8\u03ed"+
		"\u0001\u0000\u0000\u0000\u00ba\u0400\u0001\u0000\u0000\u0000\u00bc\u0402"+
		"\u0001\u0000\u0000\u0000\u00be\u040a\u0001\u0000\u0000\u0000\u00c0\u0412"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0003\u0002\u0001\u0000\u00c3\u00c5"+
		"\u0005\u0003\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0000\u0000\u0001\u00ca\u0001\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0003\b\u0004\u0000\u00cc\u00ce\u0003\u0004\u0002\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u0003\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d4\u0003\u0006\u0003\u0000\u00d0\u00d1\u0005"+
		"\u001c\u0000\u0000\u00d1\u00d3\u0003\u0006\u0003\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0007\u0000\u0000\u0000\u00da\u0005\u0001"+
		"\u0000\u0000\u0000\u00db\u00e2\u0003\n\u0005\u0000\u00dc\u00e2\u0003\u0010"+
		"\b\u0000\u00dd\u00e2\u0003,\u0016\u0000\u00de\u00e2\u0003\u001c\u000e"+
		"\u0000\u00df\u00e2\u0003@ \u0000\u00e0\u00e2\u0003.\u0017\u0000\u00e1"+
		"\u00db\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e1"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u0007\u0001\u0000\u0000\u0000\u00e3\u00e7\u0003*\u0015\u0000\u00e4\u00e7"+
		"\u0003$\u0012\u0000\u00e5\u00e7\u0003\u001e\u000f\u0000\u00e6\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\t\u0001\u0000\u0000\u0000\u00e8\u00e9\u00051"+
		"\u0000\u0000\u00e9\u00ec\u0005\u001e\u0000\u0000\u00ea\u00ed\u00034\u001a"+
		"\u0000\u00eb\u00ed\u0003\f\u0006\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u000b\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u00054\u0000\u0000\u00ef\u00f0\u0003\u000e\u0007\u0000\u00f0"+
		"\u00f1\u00056\u0000\u0000\u00f1\u00f7\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u00055\u0000\u0000\u00f3\u00f4\u0003\u000e\u0007\u0000\u00f4\u00f5\u0005"+
		"7\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f7\r\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fd\u0003X,\u0000\u00f9\u00fd\u0003\u0092I\u0000\u00fa"+
		"\u00fd\u0003\u009eO\u0000\u00fb\u00fd\u0005E\u0000\u0000\u00fc\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u000f\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0104\u0003\u0012\t\u0000\u0102\u0104\u0003\u0014"+
		"\n\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0011\u0001\u0000\u0000\u0000\u0105\u0106\u0005\t\u0000\u0000"+
		"\u0106\u0109\u0003\u001a\r\u0000\u0107\u0108\u0005\n\u0000\u0000\u0108"+
		"\u010a\u00051\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u0013\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005\b\u0000\u0000\u010c\u010d\u0003\u001a\r\u0000\u010d\u0110\u0005"+
		"\t\u0000\u0000\u010e\u0111\u0005\'\u0000\u0000\u010f\u0111\u0003\u0016"+
		"\u000b\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u0015\u0001\u0000\u0000\u0000\u0112\u0117\u0003\u0018"+
		"\f\u0000\u0113\u0114\u0005\u001d\u0000\u0000\u0114\u0116\u0003\u0018\f"+
		"\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u0017\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u011a\u011d\u00051\u0000\u0000\u011b\u011c\u0005\n\u0000\u0000"+
		"\u011c\u011e\u00051\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0019\u0001\u0000\u0000\u0000\u011f"+
		"\u0124\u00051\u0000\u0000\u0120\u0121\u00050\u0000\u0000\u0121\u0123\u0005"+
		"1\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u001b\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005\u0010\u0000\u0000\u0128\u012d\u00051\u0000"+
		"\u0000\u0129\u012a\u0005\u001d\u0000\u0000\u012a\u012c\u00051\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e\u001d\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0003 \u0010\u0000\u0131\u0132\u0003$\u0012\u0000\u0132\u001f"+
		"\u0001\u0000\u0000\u0000\u0133\u0135\u0003\"\u0011\u0000\u0134\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137!\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005\u001a\u0000\u0000\u0139\u013f\u0003\u001a"+
		"\r\u0000\u013a\u013c\u0005*\u0000\u0000\u013b\u013d\u0003T*\u0000\u013c"+
		"\u013b\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0005+\u0000\u0000\u013f\u013a"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0003\u0000\u0000\u0142#\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005\u0006\u0000\u0000\u0144\u0145\u0005"+
		"1\u0000\u0000\u0145\u0148\u0003&\u0013\u0000\u0146\u0147\u0005\u0019\u0000"+
		"\u0000\u0147\u0149\u00034\u001a\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0005\u001b\u0000\u0000\u014b\u014c\u00030\u0018\u0000\u014c"+
		"%\u0001\u0000\u0000\u0000\u014d\u014f\u0005*\u0000\u0000\u014e\u0150\u0003"+
		"(\u0014\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005+\u0000"+
		"\u0000\u0152\'\u0001\u0000\u0000\u0000\u0153\u0158\u00051\u0000\u0000"+
		"\u0154\u0155\u0005\u001d\u0000\u0000\u0155\u0157\u00051\u0000\u0000\u0156"+
		"\u0154\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		")\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005\u000b\u0000\u0000\u015c\u015d\u00034\u001a\u0000\u015d\u015e\u0005"+
		"\u001b\u0000\u0000\u015e\u0166\u00030\u0018\u0000\u015f\u0160\u0005\f"+
		"\u0000\u0000\u0160\u0161\u00034\u001a\u0000\u0161\u0162\u0005\u001b\u0000"+
		"\u0000\u0162\u0163\u00030\u0018\u0000\u0163\u0165\u0001\u0000\u0000\u0000"+
		"\u0164\u015f\u0001\u0000\u0000\u0000\u0165\u0168\u0001\u0000\u0000\u0000"+
		"\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000"+
		"\u0167\u016c\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0005\r\u0000\u0000\u016a\u016b\u0005\u001b\u0000\u0000\u016b"+
		"\u016d\u00030\u0018\u0000\u016c\u0169\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d+\u0001\u0000\u0000\u0000\u016e\u0170\u0005"+
		"\u0007\u0000\u0000\u016f\u0171\u00032\u0019\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171-\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0003,\u0016\u0000\u0173/\u0001\u0000\u0000\u0000\u0174"+
		"\u017f\u0003\u0004\u0002\u0000\u0175\u0176\u0005\u0003\u0000\u0000\u0176"+
		"\u0178\u0005\u0001\u0000\u0000\u0177\u0179\u0003\u0002\u0001\u0000\u0178"+
		"\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a"+
		"\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0002\u0000\u0000\u017d"+
		"\u017f\u0001\u0000\u0000\u0000\u017e\u0174\u0001\u0000\u0000\u0000\u017e"+
		"\u0175\u0001\u0000\u0000\u0000\u017f1\u0001\u0000\u0000\u0000\u0180\u0185"+
		"\u00034\u001a\u0000\u0181\u0182\u0005\u001d\u0000\u0000\u0182\u0184\u0003"+
		"4\u001a\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000"+
		"\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u01863\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u00036\u001b\u0000\u01895\u0001\u0000\u0000\u0000\u018a"+
		"\u018f\u00038\u001c\u0000\u018b\u018c\u0005\u0012\u0000\u0000\u018c\u018e"+
		"\u00038\u001c\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u0191\u0001"+
		"\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001"+
		"\u0000\u0000\u0000\u01907\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000"+
		"\u0000\u0000\u0192\u0197\u0003:\u001d\u0000\u0193\u0194\u0005\u0011\u0000"+
		"\u0000\u0194\u0196\u0003:\u001d\u0000\u0195\u0193\u0001\u0000\u0000\u0000"+
		"\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u01989\u0001\u0000\u0000\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u0013\u0000\u0000\u019b"+
		"\u019e\u0003:\u001d\u0000\u019c\u019e\u0003<\u001e\u0000\u019d\u019a\u0001"+
		"\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e;\u0001\u0000"+
		"\u0000\u0000\u019f\u01a5\u0003@ \u0000\u01a0\u01a1\u0003>\u001f\u0000"+
		"\u01a1\u01a2\u0003@ \u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6=\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01b2\u0005"+
		"\"\u0000\u0000\u01a9\u01b2\u0005!\u0000\u0000\u01aa\u01b2\u0005\u001f"+
		"\u0000\u0000\u01ab\u01b2\u0005 \u0000\u0000\u01ac\u01b2\u0005#\u0000\u0000"+
		"\u01ad\u01b2\u0005$\u0000\u0000\u01ae\u01b2\u0005\u000f\u0000\u0000\u01af"+
		"\u01b0\u0005\u0013\u0000\u0000\u01b0\u01b2\u0005\u000f\u0000\u0000\u01b1"+
		"\u01a8\u0001\u0000\u0000\u0000\u01b1\u01a9\u0001\u0000\u0000\u0000\u01b1"+
		"\u01aa\u0001\u0000\u0000\u0000\u01b1\u01ab\u0001\u0000\u0000\u0000\u01b1"+
		"\u01ac\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000\u01b1"+
		"\u01ae\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2"+
		"?\u0001\u0000\u0000\u0000\u01b3\u01b8\u0003B!\u0000\u01b4\u01b5\u0007"+
		"\u0001\u0000\u0000\u01b5\u01b7\u0003B!\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9A\u0001\u0000\u0000\u0000"+
		"\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01c0\u0003D\"\u0000\u01bc"+
		"\u01bd\u0007\u0002\u0000\u0000\u01bd\u01bf\u0003D\"\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1C\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c4\u0007"+
		"\u0001\u0000\u0000\u01c4\u01c7\u0003D\"\u0000\u01c5\u01c7\u0003F#\u0000"+
		"\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c7E\u0001\u0000\u0000\u0000\u01c8\u01c9\u0003H$\u0000\u01c9G\u0001"+
		"\u0000\u0000\u0000\u01ca\u01ce\u0003L&\u0000\u01cb\u01cd\u0003J%\u0000"+
		"\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cfI\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d3\u0005*\u0000\u0000\u01d2\u01d4\u0003T*\u0000\u01d3\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d5\u01dd\u0005+\u0000\u0000\u01d6\u01d7\u0005,\u0000"+
		"\u0000\u01d7\u01d8\u00034\u001a\u0000\u01d8\u01d9\u0005-\u0000\u0000\u01d9"+
		"\u01dd\u0001\u0000\u0000\u0000\u01da\u01db\u00050\u0000\u0000\u01db\u01dd"+
		"\u00051\u0000\u0000\u01dc\u01d1\u0001\u0000\u0000\u0000\u01dc\u01d6\u0001"+
		"\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01ddK\u0001\u0000"+
		"\u0000\u0000\u01de\u01f8\u00051\u0000\u0000\u01df\u01f8\u00052\u0000\u0000"+
		"\u01e0\u01e2\u00053\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4\u01f8\u0001\u0000\u0000\u0000\u01e5"+
		"\u01f8\u0005\u0016\u0000\u0000\u01e6\u01f8\u0005\u0014\u0000\u0000\u01e7"+
		"\u01f8\u0005\u0015\u0000\u0000\u01e8\u01ea\u0005*\u0000\u0000\u01e9\u01eb"+
		"\u00034\u001a\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01f8\u0005"+
		"+\u0000\u0000\u01ed\u01ef\u0005,\u0000\u0000\u01ee\u01f0\u0003N\'\u0000"+
		"\u01ef\u01ee\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f8\u0005-\u0000\u0000\u01f2"+
		"\u01f4\u0005.\u0000\u0000\u01f3\u01f5\u0003R)\u0000\u01f4\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f8\u0005/\u0000\u0000\u01f7\u01de\u0001\u0000"+
		"\u0000\u0000\u01f7\u01df\u0001\u0000\u0000\u0000\u01f7\u01e1\u0001\u0000"+
		"\u0000\u0000\u01f7\u01e5\u0001\u0000\u0000\u0000\u01f7\u01e6\u0001\u0000"+
		"\u0000\u0000\u01f7\u01e7\u0001\u0000\u0000\u0000\u01f7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01f7\u01ed\u0001\u0000\u0000\u0000\u01f7\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f8M\u0001\u0000\u0000\u0000\u01f9\u01fa\u00034\u001a\u0000"+
		"\u01fa\u01fb\u0003P(\u0000\u01fb\u0205\u0001\u0000\u0000\u0000\u01fc\u0201"+
		"\u00034\u001a\u0000\u01fd\u01fe\u0005\u001d\u0000\u0000\u01fe\u0200\u0003"+
		"4\u001a\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000"+
		"\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000"+
		"\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000"+
		"\u0000\u0000\u0204\u01f9\u0001\u0000\u0000\u0000\u0204\u01fc\u0001\u0000"+
		"\u0000\u0000\u0205O\u0001\u0000\u0000\u0000\u0206\u0207\u0005\u000e\u0000"+
		"\u0000\u0207\u0208\u00034\u001a\u0000\u0208\u0209\u0005\u000f\u0000\u0000"+
		"\u0209\u020e\u00034\u001a\u0000\u020a\u020b\u0005\u000b\u0000\u0000\u020b"+
		"\u020d\u00034\u001a\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020d\u0210"+
		"\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f"+
		"\u0001\u0000\u0000\u0000\u020fQ\u0001\u0000\u0000\u0000\u0210\u020e\u0001"+
		"\u0000\u0000\u0000\u0211\u0212\u00034\u001a\u0000\u0212\u0213\u0005\u001b"+
		"\u0000\u0000\u0213\u021b\u00034\u001a\u0000\u0214\u0215\u0005\u001d\u0000"+
		"\u0000\u0215\u0216\u00034\u001a\u0000\u0216\u0217\u0005\u001b\u0000\u0000"+
		"\u0217\u0218\u00034\u001a\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219"+
		"\u0214\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b"+
		"\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c"+
		"S\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u0223"+
		"\u0003V+\u0000\u021f\u0220\u0005\u001d\u0000\u0000\u0220\u0222\u0003V"+
		"+\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000"+
		"\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224U\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000"+
		"\u0226\u022b\u00034\u001a\u0000\u0227\u0228\u00051\u0000\u0000\u0228\u0229"+
		"\u0005\u001e\u0000\u0000\u0229\u022b\u00034\u001a\u0000\u022a\u0226\u0001"+
		"\u0000\u0000\u0000\u022a\u0227\u0001\u0000\u0000\u0000\u022bW\u0001\u0000"+
		"\u0000\u0000\u022c\u0230\u0005D\u0000\u0000\u022d\u022f\u0003Z-\u0000"+
		"\u022e\u022d\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000"+
		"\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000"+
		"\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000"+
		"\u0233\u023f\u0007\u0003\u0000\u0000\u0234\u0235\u0005B\u0000\u0000\u0235"+
		"\u023f\u0005M\u0000\u0000\u0236\u0237\u0005C\u0000\u0000\u0237\u0238\u0003"+
		"\\.\u0000\u0238\u0239\u0005N\u0000\u0000\u0239\u023f\u0001\u0000\u0000"+
		"\u0000\u023a\u023f\u0005=\u0000\u0000\u023b\u023f\u0005>\u0000\u0000\u023c"+
		"\u023f\u0005?\u0000\u0000\u023d\u023f\u0005@\u0000\u0000\u023e\u022c\u0001"+
		"\u0000\u0000\u0000\u023e\u0234\u0001\u0000\u0000\u0000\u023e\u0236\u0001"+
		"\u0000\u0000\u0000\u023e\u023a\u0001\u0000\u0000\u0000\u023e\u023b\u0001"+
		"\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023d\u0001"+
		"\u0000\u0000\u0000\u023fY\u0001\u0000\u0000\u0000\u0240\u0243\u0005J\u0000"+
		"\u0000\u0241\u0242\u0005I\u0000\u0000\u0242\u0244\u0005L\u0000\u0000\u0243"+
		"\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
		"\u024a\u0001\u0000\u0000\u0000\u0245\u024a\u0003\u009eO\u0000\u0246\u024a"+
		"\u0003\u0092I\u0000\u0247\u024a\u0005H\u0000\u0000\u0248\u024a\u0005I"+
		"\u0000\u0000\u0249\u0240\u0001\u0000\u0000\u0000\u0249\u0245\u0001\u0000"+
		"\u0000\u0000\u0249\u0246\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000"+
		"\u0000\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a[\u0001\u0000\u0000"+
		"\u0000\u024b\u024c\u0003^/\u0000\u024c]\u0001\u0000\u0000\u0000\u024d"+
		"\u0253\u0003`0\u0000\u024e\u024f\u00059\u0000\u0000\u024f\u0250\u0003"+
		"\u0094J\u0000\u0250\u0251\u0005\u008b\u0000\u0000\u0251\u0253\u0001\u0000"+
		"\u0000\u0000\u0252\u024d\u0001\u0000\u0000\u0000\u0252\u024e\u0001\u0000"+
		"\u0000\u0000\u0253\u0256\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000"+
		"\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0257\u0001\u0000"+
		"\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257\u0258\u0005\u0000"+
		"\u0000\u0001\u0258_\u0001\u0000\u0000\u0000\u0259\u025c\u0003b1\u0000"+
		"\u025a\u025c\u0003x<\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025a"+
		"\u0001\u0000\u0000\u0000\u025ca\u0001\u0000\u0000\u0000\u025d\u025e\u0003"+
		"d2\u0000\u025e\u025f\u0005Q\u0000\u0000\u025f\u0260\u0003\u0080@\u0000"+
		"\u0260\u0261\u0005R\u0000\u0000\u0261c\u0001\u0000\u0000\u0000\u0262\u0267"+
		"\u0003f3\u0000\u0263\u0264\u0005W\u0000\u0000\u0264\u0266\u0003f3\u0000"+
		"\u0265\u0263\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000\u0000\u0000"+
		"\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000"+
		"\u0268e\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u026a"+
		"\u0271\u0003j5\u0000\u026b\u026d\u0003h4\u0000\u026c\u026b\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000"+
		"\u0000\u0000\u026e\u0270\u0003j5\u0000\u026f\u026c\u0001\u0000\u0000\u0000"+
		"\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0001\u0000\u0000\u0000\u0272g\u0001\u0000\u0000\u0000\u0273"+
		"\u0271\u0001\u0000\u0000\u0000\u0274\u0275\u0007\u0004\u0000\u0000\u0275"+
		"i\u0001\u0000\u0000\u0000\u0276\u0279\u0003l6\u0000\u0277\u0279\u0003"+
		"n7\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0278\u0277\u0001\u0000\u0000"+
		"\u0000\u0279\u0280\u0001\u0000\u0000\u0000\u027a\u027f\u0003p8\u0000\u027b"+
		"\u027f\u0003r9\u0000\u027c\u027f\u0003t:\u0000\u027d\u027f\u0003v;\u0000"+
		"\u027e\u027a\u0001\u0000\u0000\u0000\u027e\u027b\u0001\u0000\u0000\u0000"+
		"\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000"+
		"\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u028c\u0001\u0000\u0000\u0000"+
		"\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0288\u0003p8\u0000\u0284\u0288"+
		"\u0003r9\u0000\u0285\u0288\u0003t:\u0000\u0286\u0288\u0003v;\u0000\u0287"+
		"\u0283\u0001\u0000\u0000\u0000\u0287\u0284\u0001\u0000\u0000\u0000\u0287"+
		"\u0285\u0001\u0000\u0000\u0000\u0287\u0286\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289"+
		"\u028a\u0001\u0000\u0000\u0000\u028a\u028c\u0001\u0000\u0000\u0000\u028b"+
		"\u0278\u0001\u0000\u0000\u0000\u028b\u0287\u0001\u0000\u0000\u0000\u028c"+
		"k\u0001\u0000\u0000\u0000\u028d\u028e\u0005n\u0000\u0000\u028em\u0001"+
		"\u0000\u0000\u0000\u028f\u0290\u0005a\u0000\u0000\u0290o\u0001\u0000\u0000"+
		"\u0000\u0291\u0292\u0005j\u0000\u0000\u0292q\u0001\u0000\u0000\u0000\u0293"+
		"\u0294\u0005k\u0000\u0000\u0294s\u0001\u0000\u0000\u0000\u0295\u0296\u0007"+
		"\u0005\u0000\u0000\u0296u\u0001\u0000\u0000\u0000\u0297\u0298\u0005_\u0000"+
		"\u0000\u0298\u029b\u0005n\u0000\u0000\u0299\u029a\u0005^\u0000\u0000\u029a"+
		"\u029c\u0003\u0086C\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c"+
		"\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e"+
		"\u0005`\u0000\u0000\u029ew\u0001\u0000\u0000\u0000\u029f\u02a2\u0005b"+
		"\u0000\u0000\u02a0\u02a3\u0005i\u0000\u0000\u02a1\u02a3\u0003\u008aE\u0000"+
		"\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4\u02c8\u0003z=\u0000\u02a5\u02a6"+
		"\u0005c\u0000\u0000\u02a6\u02a7\u0003|>\u0000\u02a7\u02af\u0005Q\u0000"+
		"\u0000\u02a8\u02ae\u0003`0\u0000\u02a9\u02aa\u00059\u0000\u0000\u02aa"+
		"\u02ab\u0003\u0094J\u0000\u02ab\u02ac\u0005\u008b\u0000\u0000\u02ac\u02ae"+
		"\u0001\u0000\u0000\u0000\u02ad\u02a8\u0001\u0000\u0000\u0000\u02ad\u02a9"+
		"\u0001\u0000\u0000\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad"+
		"\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b2\u02b3"+
		"\u0005R\u0000\u0000\u02b3\u02c8\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005"+
		"d\u0000\u0000\u02b5\u02b6\u0005Q\u0000\u0000\u02b6\u02b7\u0003\u0080@"+
		"\u0000\u02b7\u02b8\u0005R\u0000\u0000\u02b8\u02c8\u0001\u0000\u0000\u0000"+
		"\u02b9\u02ba\u0005e\u0000\u0000\u02ba\u02bb\u0005n\u0000\u0000\u02bb\u02c3"+
		"\u0005Q\u0000\u0000\u02bc\u02c2\u0003\u008eG\u0000\u02bd\u02be\u00059"+
		"\u0000\u0000\u02be\u02bf\u0003\u0094J\u0000\u02bf\u02c0\u0005\u008b\u0000"+
		"\u0000\u02c0\u02c2\u0001\u0000\u0000\u0000\u02c1\u02bc\u0001\u0000\u0000"+
		"\u0000\u02c1\u02bd\u0001\u0000\u0000\u0000\u02c2\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c8\u0005R\u0000\u0000\u02c7\u029f\u0001\u0000\u0000\u0000"+
		"\u02c7\u02a5\u0001\u0000\u0000\u0000\u02c7\u02b4\u0001\u0000\u0000\u0000"+
		"\u02c7\u02b9\u0001\u0000\u0000\u0000\u02c8y\u0001\u0000\u0000\u0000\u02c9"+
		"\u02ca\u0003|>\u0000\u02ca\u02cb\u0005T\u0000\u0000\u02cb\u02ce\u0001"+
		"\u0000\u0000\u0000\u02cc\u02ce\u0005T\u0000\u0000\u02cd\u02c9\u0001\u0000"+
		"\u0000\u0000\u02cd\u02cc\u0001\u0000\u0000\u0000\u02ce{\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d4\u0003~?\u0000\u02d0\u02d1\u0005W\u0000\u0000\u02d1"+
		"\u02d3\u0003~?\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001"+
		"\u0000\u0000\u0000\u02d5}\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d9\u0005n\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9\u02db\u0001\u0000\u0000"+
		"\u0000\u02da\u02dc\u0005n\u0000\u0000\u02db\u02da\u0001\u0000\u0000\u0000"+
		"\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc\u02e1\u0001\u0000\u0000\u0000"+
		"\u02dd\u02de\u0005U\u0000\u0000\u02de\u02df\u0003\u0082A\u0000\u02df\u02e0"+
		"\u0005V\u0000\u0000\u02e0\u02e2\u0001\u0000\u0000\u0000\u02e1\u02dd\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02ec\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e8\u0005n\u0000\u0000\u02e4\u02e5\u0005U\u0000"+
		"\u0000\u02e5\u02e6\u0003\u0082A\u0000\u02e6\u02e7\u0005V\u0000\u0000\u02e7"+
		"\u02e9\u0001\u0000\u0000\u0000\u02e8\u02e4\u0001\u0000\u0000\u0000\u02e8"+
		"\u02e9\u0001\u0000\u0000\u0000\u02e9\u02eb\u0001\u0000\u0000\u0000\u02ea"+
		"\u02e3\u0001\u0000\u0000\u0000\u02eb\u02ee\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ea\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed"+
		"\u007f\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ef"+
		"\u02f1\u0003\u0082A\u0000\u02f0\u02f2\u0005T\u0000\u0000\u02f1\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f3\u02f4\u00059\u0000\u0000\u02f4\u02f5\u0003\u0094"+
		"J\u0000\u02f5\u02f6\u0005\u008b\u0000\u0000\u02f6\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f7\u02ef\u0001\u0000\u0000\u0000\u02f7\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f8\u02fb\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u0081\u0001\u0000\u0000"+
		"\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fc\u02fd\u0003\u0084B\u0000"+
		"\u02fd\u02fe\u0005S\u0000\u0000\u02fe\u02ff\u0003\u0086C\u0000\u02ff\u0083"+
		"\u0001\u0000\u0000\u0000\u0300\u0301\u0005n\u0000\u0000\u0301\u0085\u0001"+
		"\u0000\u0000\u0000\u0302\u0304\u0003\u0088D\u0000\u0303\u0302\u0001\u0000"+
		"\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u0303\u0001\u0000"+
		"\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0311\u0001\u0000"+
		"\u0000\u0000\u0307\u0309\u0007\u0006\u0000\u0000\u0308\u0307\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030b\u0001\u0000"+
		"\u0000\u0000\u030a\u030c\u0003\u0088D\u0000\u030b\u030a\u0001\u0000\u0000"+
		"\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000"+
		"\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0310\u0001\u0000\u0000"+
		"\u0000\u030f\u0308\u0001\u0000\u0000\u0000\u0310\u0313\u0001\u0000\u0000"+
		"\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000"+
		"\u0000\u0312\u0087\u0001\u0000\u0000\u0000\u0313\u0311\u0001\u0000\u0000"+
		"\u0000\u0314\u0316\u0005g\u0000\u0000\u0315\u0317\u0007\u0007\u0000\u0000"+
		"\u0316\u0315\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000"+
		"\u0317\u032a\u0001\u0000\u0000\u0000\u0318\u032a\u0005i\u0000\u0000\u0319"+
		"\u032a\u0005n\u0000\u0000\u031a\u032a\u0005h\u0000\u0000\u031b\u032a\u0005"+
		"j\u0000\u0000\u031c\u032a\u0003\u008aE\u0000\u031d\u031e\u00058\u0000"+
		"\u0000\u031e\u031f\u0003\u00a0P\u0000\u031f\u0320\u0005o\u0000\u0000\u0320"+
		"\u032a\u0001\u0000\u0000\u0000\u0321\u0322\u00059\u0000\u0000\u0322\u0323"+
		"\u0003\u0094J\u0000\u0323\u0324\u0005\u008b\u0000\u0000\u0324\u032a\u0001"+
		"\u0000\u0000\u0000\u0325\u0326\u0005U\u0000\u0000\u0326\u0327\u0003\u0086"+
		"C\u0000\u0327\u0328\u0005V\u0000\u0000\u0328\u032a\u0001\u0000\u0000\u0000"+
		"\u0329\u0314\u0001\u0000\u0000\u0000\u0329\u0318\u0001\u0000\u0000\u0000"+
		"\u0329\u0319\u0001\u0000\u0000\u0000\u0329\u031a\u0001\u0000\u0000\u0000"+
		"\u0329\u031b\u0001\u0000\u0000\u0000\u0329\u031c\u0001\u0000\u0000\u0000"+
		"\u0329\u031d\u0001\u0000\u0000\u0000\u0329\u0321\u0001\u0000\u0000\u0000"+
		"\u0329\u0325\u0001\u0000\u0000\u0000\u032a\u0089\u0001\u0000\u0000\u0000"+
		"\u032b\u032c\u0005n\u0000\u0000\u032c\u032d\u0005U\u0000\u0000\u032d\u032e"+
		"\u0003\u008cF\u0000\u032e\u032f\u0005V\u0000\u0000\u032f\u008b\u0001\u0000"+
		"\u0000\u0000\u0330\u0335\u0003\u0086C\u0000\u0331\u0332\u0005W\u0000\u0000"+
		"\u0332\u0334\u0003\u0086C\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0334"+
		"\u0337\u0001\u0000\u0000\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0335"+
		"\u0336\u0001\u0000\u0000\u0000\u0336\u008d\u0001\u0000\u0000\u0000\u0337"+
		"\u0335\u0001\u0000\u0000\u0000\u0338\u0339\u0003\u0090H\u0000\u0339\u033a"+
		"\u0005Q\u0000\u0000\u033a\u033b\u0003\u0080@\u0000\u033b\u033c\u0005R"+
		"\u0000\u0000\u033c\u008f\u0001\u0000\u0000\u0000\u033d\u0342\u0007\b\u0000"+
		"\u0000\u033e\u033f\u0005W\u0000\u0000\u033f\u0341\u0007\b\u0000\u0000"+
		"\u0340\u033e\u0001\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000"+
		"\u0342\u0340\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000"+
		"\u0343\u0347\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000"+
		"\u0345\u0347\u0005n\u0000\u0000\u0346\u033d\u0001\u0000\u0000\u0000\u0346"+
		"\u0345\u0001\u0000\u0000\u0000\u0347\u0091\u0001\u0000\u0000\u0000\u0348"+
		"\u0349\u00059\u0000\u0000\u0349\u034a\u0003\u0094J\u0000\u034a\u034b\u0005"+
		"\u008b\u0000\u0000\u034b\u0093\u0001\u0000\u0000\u0000\u034c\u035d\u0003"+
		"\u0098L\u0000\u034d\u035d\u0003\u009aM\u0000\u034e\u0350\u0005s\u0000"+
		"\u0000\u034f\u0351\u0003\u00a4R\u0000\u0350\u034f\u0001\u0000\u0000\u0000"+
		"\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u035d\u0001\u0000\u0000\u0000"+
		"\u0352\u0353\u0005\u0093\u0000\u0000\u0353\u035d\u0003\u00a0P\u0000\u0354"+
		"\u035d\u0003\u0096K\u0000\u0355\u035a\u0005s\u0000\u0000\u0356\u0357\u0005"+
		"\u0084\u0000\u0000\u0357\u0358\u0003\u00be_\u0000\u0358\u0359\u0005\u0085"+
		"\u0000\u0000\u0359\u035b\u0001\u0000\u0000\u0000\u035a\u0356\u0001\u0000"+
		"\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035d\u0001\u0000"+
		"\u0000\u0000\u035c\u034c\u0001\u0000\u0000\u0000\u035c\u034d\u0001\u0000"+
		"\u0000\u0000\u035c\u034e\u0001\u0000\u0000\u0000\u035c\u0352\u0001\u0000"+
		"\u0000\u0000\u035c\u0354\u0001\u0000\u0000\u0000\u035c\u0355\u0001\u0000"+
		"\u0000\u0000\u035d\u0095\u0001\u0000\u0000\u0000\u035e\u035f\u0005\u0094"+
		"\u0000\u0000\u035f\u0360\u0003\u000e\u0007\u0000\u0360\u0361\u0005\u0095"+
		"\u0000\u0000\u0361\u0097\u0001\u0000\u0000\u0000\u0362\u0363\u0005\u008c"+
		"\u0000\u0000\u0363\u0364\u0003\u00a4R\u0000\u0364\u036b\u0003\u000e\u0007"+
		"\u0000\u0365\u0366\u0005\u008d\u0000\u0000\u0366\u0367\u0003\u00a4R\u0000"+
		"\u0367\u0368\u0003\u000e\u0007\u0000\u0368\u036a\u0001\u0000\u0000\u0000"+
		"\u0369\u0365\u0001\u0000\u0000\u0000\u036a\u036d\u0001\u0000\u0000\u0000"+
		"\u036b\u0369\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000"+
		"\u036c\u0370\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000"+
		"\u036e\u036f\u0005\u008e\u0000\u0000\u036f\u0371\u0003\u000e\u0007\u0000"+
		"\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000"+
		"\u0371\u0372\u0001\u0000\u0000\u0000\u0372\u0373\u0005\u008f\u0000\u0000"+
		"\u0373\u0099\u0001\u0000\u0000\u0000\u0374\u0375\u0005\u0090\u0000\u0000"+
		"\u0375\u0376\u0003\u009cN\u0000\u0376\u0377\u0005\u0091\u0000\u0000\u0377"+
		"\u0378\u0003\u00a0P\u0000\u0378\u037b\u0003\u000e\u0007\u0000\u0379\u037a"+
		"\u0005\u008e\u0000\u0000\u037a\u037c\u0003\u000e\u0007\u0000\u037b\u0379"+
		"\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037d"+
		"\u0001\u0000\u0000\u0000\u037d\u037e\u0005\u0092\u0000\u0000\u037e\u009b"+
		"\u0001\u0000\u0000\u0000\u037f\u0384\u0005s\u0000\u0000\u0380\u0381\u0005"+
		"\u0082\u0000\u0000\u0381\u0383\u0005s\u0000\u0000\u0382\u0380\u0001\u0000"+
		"\u0000\u0000\u0383\u0386\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000"+
		"\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u009d\u0001\u0000"+
		"\u0000\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0387\u0388\u00058\u0000"+
		"\u0000\u0388\u0389\u0003\u00a0P\u0000\u0389\u038a\u0005o\u0000\u0000\u038a"+
		"\u009f\u0001\u0000\u0000\u0000\u038b\u0390\u0003\u00a4R\u0000\u038c\u038d"+
		"\u0005\u0083\u0000\u0000\u038d\u038f\u0003\u00a2Q\u0000\u038e\u038c\u0001"+
		"\u0000\u0000\u0000\u038f\u0392\u0001\u0000\u0000\u0000\u0390\u038e\u0001"+
		"\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u00a1\u0001"+
		"\u0000\u0000\u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0393\u0399\u0005"+
		"s\u0000\u0000\u0394\u0396\u0005\u0084\u0000\u0000\u0395\u0397\u0003\u00be"+
		"_\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000"+
		"\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u039a\u0005\u0085\u0000"+
		"\u0000\u0399\u0394\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000"+
		"\u0000\u039a\u00a3\u0001\u0000\u0000\u0000\u039b\u039c\u0003\u00a6S\u0000"+
		"\u039c\u00a5\u0001\u0000\u0000\u0000\u039d\u03a2\u0003\u00a8T\u0000\u039e"+
		"\u039f\u0005\u0096\u0000\u0000\u039f\u03a1\u0003\u00a8T\u0000\u03a0\u039e"+
		"\u0001\u0000\u0000\u0000\u03a1\u03a4\u0001\u0000\u0000\u0000\u03a2\u03a0"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3\u00a7"+
		"\u0001\u0000\u0000\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a5\u03aa"+
		"\u0003\u00aaU\u0000\u03a6\u03a7\u0005\u0097\u0000\u0000\u03a7\u03a9\u0003"+
		"\u00aaU\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a9\u03ac\u0001\u0000"+
		"\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000"+
		"\u0000\u0000\u03ab\u00a9\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001\u0000"+
		"\u0000\u0000\u03ad\u03ae\u0005\u0098\u0000\u0000\u03ae\u03b1\u0003\u00aa"+
		"U\u0000\u03af\u03b1\u0003\u00acV\u0000\u03b0\u03ad\u0001\u0000\u0000\u0000"+
		"\u03b0\u03af\u0001\u0000\u0000\u0000\u03b1\u00ab\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b8\u0003\u00b0X\u0000\u03b3\u03b4\u0003\u00aeW\u0000\u03b4\u03b5"+
		"\u0003\u00b0X\u0000\u03b5\u03b7\u0001\u0000\u0000\u0000\u03b6\u03b3\u0001"+
		"\u0000\u0000\u0000\u03b7\u03ba\u0001\u0000\u0000\u0000\u03b8\u03b6\u0001"+
		"\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u00ad\u0001"+
		"\u0000\u0000\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03bb\u03c5\u0005"+
		"}\u0000\u0000\u03bc\u03c5\u0005\u007f\u0000\u0000\u03bd\u03c5\u0005z\u0000"+
		"\u0000\u03be\u03c5\u0005{\u0000\u0000\u03bf\u03c5\u0005~\u0000\u0000\u03c0"+
		"\u03c5\u0005|\u0000\u0000\u03c1\u03c5\u0005\u0091\u0000\u0000\u03c2\u03c3"+
		"\u0005\u0098\u0000\u0000\u03c3\u03c5\u0005\u0091\u0000\u0000\u03c4\u03bb"+
		"\u0001\u0000\u0000\u0000\u03c4\u03bc\u0001\u0000\u0000\u0000\u03c4\u03bd"+
		"\u0001\u0000\u0000\u0000\u03c4\u03be\u0001\u0000\u0000\u0000\u03c4\u03bf"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c0\u0001\u0000\u0000\u0000\u03c4\u03c1"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c5\u00af"+
		"\u0001\u0000\u0000\u0000\u03c6\u03cb\u0003\u00b2Y\u0000\u03c7\u03c8\u0007"+
		"\t\u0000\u0000\u03c8\u03ca\u0003\u00b2Y\u0000\u03c9\u03c7\u0001\u0000"+
		"\u0000\u0000\u03ca\u03cd\u0001\u0000\u0000\u0000\u03cb\u03c9\u0001\u0000"+
		"\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u00b1\u0001\u0000"+
		"\u0000\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000\u03ce\u03d3\u0003\u00b4"+
		"Z\u0000\u03cf\u03d0\u0007\n\u0000\u0000\u03d0\u03d2\u0003\u00b4Z\u0000"+
		"\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d2\u03d5\u0001\u0000\u0000\u0000"+
		"\u03d3\u03d1\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000"+
		"\u03d4\u00b3\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d7\u0007\t\u0000\u0000\u03d7\u03da\u0003\u00b4Z\u0000\u03d8"+
		"\u03da\u0003\u00b6[\u0000\u03d9\u03d6\u0001\u0000\u0000\u0000\u03d9\u03d8"+
		"\u0001\u0000\u0000\u0000\u03da\u00b5\u0001\u0000\u0000\u0000\u03db\u03df"+
		"\u0003\u00ba]\u0000\u03dc\u03de\u0003\u00b8\\\u0000\u03dd\u03dc\u0001"+
		"\u0000\u0000\u0000\u03de\u03e1\u0001\u0000\u0000\u0000\u03df\u03dd\u0001"+
		"\u0000\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0\u00b7\u0001"+
		"\u0000\u0000\u0000\u03e1\u03df\u0001\u0000\u0000\u0000\u03e2\u03e4\u0005"+
		"\u0084\u0000\u0000\u03e3\u03e5\u0003\u00be_\u0000\u03e4\u03e3\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000"+
		"\u0000\u0000\u03e6\u03ee\u0005\u0085\u0000\u0000\u03e7\u03e8\u0005\u0086"+
		"\u0000\u0000\u03e8\u03e9\u0003\u00a4R\u0000\u03e9\u03ea\u0005\u0087\u0000"+
		"\u0000\u03ea\u03ee\u0001\u0000\u0000\u0000\u03eb\u03ec\u0005\u0081\u0000"+
		"\u0000\u03ec\u03ee\u0005s\u0000\u0000\u03ed\u03e2\u0001\u0000\u0000\u0000"+
		"\u03ed\u03e7\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000"+
		"\u03ee\u00b9\u0001\u0000\u0000\u0000\u03ef\u0401\u0005s\u0000\u0000\u03f0"+
		"\u0401\u0005q\u0000\u0000\u03f1\u0401\u0005r\u0000\u0000\u03f2\u03f3\u0005"+
		"\u0084\u0000\u0000\u03f3\u03f4\u0003\u00a4R\u0000\u03f4\u03f5\u0005\u0085"+
		"\u0000\u0000\u03f5\u0401\u0001\u0000\u0000\u0000\u03f6\u03f8\u0005\u0086"+
		"\u0000\u0000\u03f7\u03f9\u0003\u00bc^\u0000\u03f8\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fa\u0401\u0005\u0087\u0000\u0000\u03fb\u03fd\u0005\u0088\u0000"+
		"\u0000\u03fc\u03fe\u0003\u00c0`\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000"+
		"\u03fd\u03fe\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000"+
		"\u03ff\u0401\u0005\u0089\u0000\u0000\u0400\u03ef\u0001\u0000\u0000\u0000"+
		"\u0400\u03f0\u0001\u0000\u0000\u0000\u0400\u03f1\u0001\u0000\u0000\u0000"+
		"\u0400\u03f2\u0001\u0000\u0000\u0000\u0400\u03f6\u0001\u0000\u0000\u0000"+
		"\u0400\u03fb\u0001\u0000\u0000\u0000\u0401\u00bb\u0001\u0000\u0000\u0000"+
		"\u0402\u0407\u0003\u00a4R\u0000\u0403\u0404\u0005\u0082\u0000\u0000\u0404"+
		"\u0406\u0003\u00a4R\u0000\u0405\u0403\u0001\u0000\u0000\u0000\u0406\u0409"+
		"\u0001\u0000\u0000\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0408"+
		"\u0001\u0000\u0000\u0000\u0408\u00bd\u0001\u0000\u0000\u0000\u0409\u0407"+
		"\u0001\u0000\u0000\u0000\u040a\u040f\u0003\u00a4R\u0000\u040b\u040c\u0005"+
		"\u0082\u0000\u0000\u040c\u040e\u0003\u00a4R\u0000\u040d\u040b\u0001\u0000"+
		"\u0000\u0000\u040e\u0411\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000"+
		"\u0000\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u00bf\u0001\u0000"+
		"\u0000\u0000\u0411\u040f\u0001\u0000\u0000\u0000\u0412\u0413\u0003\u00a4"+
		"R\u0000\u0413\u0414\u0005\u008a\u0000\u0000\u0414\u041c\u0003\u00a4R\u0000"+
		"\u0415\u0416\u0005\u0082\u0000\u0000\u0416\u0417\u0003\u00a4R\u0000\u0417"+
		"\u0418\u0005\u008a\u0000\u0000\u0418\u0419\u0003\u00a4R\u0000\u0419\u041b"+
		"\u0001\u0000\u0000\u0000\u041a\u0415\u0001\u0000\u0000\u0000\u041b\u041e"+
		"\u0001\u0000\u0000\u0000\u041c\u041a\u0001\u0000\u0000\u0000\u041c\u041d"+
		"\u0001\u0000\u0000\u0000\u041d\u00c1\u0001\u0000\u0000\u0000\u041e\u041c"+
		"\u0001\u0000\u0000\u0000y\u00c4\u00c6\u00cd\u00d4\u00d7\u00e1\u00e6\u00ec"+
		"\u00f6\u00fc\u00fe\u0103\u0109\u0110\u0117\u011d\u0124\u012d\u0136\u013c"+
		"\u013f\u0148\u014f\u0158\u0166\u016c\u0170\u017a\u017e\u0185\u018f\u0197"+
		"\u019d\u01a5\u01b1\u01b8\u01c0\u01c6\u01ce\u01d3\u01dc\u01e3\u01ea\u01ef"+
		"\u01f4\u01f7\u0201\u0204\u020e\u021b\u0223\u022a\u0230\u023e\u0243\u0249"+
		"\u0252\u0254\u025b\u0267\u026c\u0271\u0278\u027e\u0280\u0287\u0289\u028b"+
		"\u029b\u02a2\u02ad\u02af\u02c1\u02c3\u02c7\u02cd\u02d4\u02d8\u02db\u02e1"+
		"\u02e8\u02ec\u02f1\u02f7\u02f9\u0305\u0308\u030d\u0311\u0316\u0329\u0335"+
		"\u0342\u0346\u0350\u035a\u035c\u036b\u0370\u037b\u0384\u0390\u0396\u0399"+
		"\u03a2\u03aa\u03b0\u03b8\u03c4\u03cb\u03d3\u03d9\u03df\u03e4\u03ed\u03f8"+
		"\u03fd\u0400\u0407\u040f\u041c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}