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
		Plus=79, Minus=80, Greater=81, Comma=82, Tilde=83, OpenBracket=84, CloseBracket=85, 
		OpenParen=86, CloseParen=87, OpenBrace=88, CloseBrace=89, SemiColon=90, 
		Equal=91, Colon=92, Dot=93, Multiply=94, Divide=95, Pipe=96, Underscore=97, 
		Comment=98, Url=99, Space=100, Cdo=101, Cdc=102, Includes=103, DashMatch=104, 
		Hash=105, Import=106, Page=107, Media=108, Namespace=109, Charset=110, 
		Important=111, Percentage=112, Url_=113, UnicodeRange=114, MediaOnly=115, 
		Not=116, And=117, Dimension=118, UnknownDimension=119, PseudoNot=120, 
		Number=121, String_=122, PrefixMatch=123, SuffixMatch=124, SubstringMatch=125, 
		FontFace=126, Supports=127, Or=128, Keyframes=129, From=130, To=131, Calc=132, 
		Viewport=133, CounterStyle=134, FontFeatureValues=135, DxImageTransform=136, 
		AtKeyword=137, Variable=138, Var=139, Ident=140, Function_=141, UnexpectedCharacter=142, 
		JINJA_EXPR_END=143, J_WS=144, J_NUMBER=145, J_STRING=146, J_NAME=147, 
		J_PLUS=148, J_MINUS=149, J_TIMES=150, J_DIVIDE=151, J_MOD=152, J_POW=153, 
		J_EQ=154, J_NE=155, J_LE=156, J_LT=157, J_GE=158, J_GT=159, J_ASSIGN=160, 
		J_DOT=161, J_COMMA=162, J_PIPE=163, J_LPAREN=164, J_RPAREN=165, J_LBRACK=166, 
		J_RBRACK=167, J_LBRACE=168, J_RBRACE=169, J_COLON=170, JINJA_STMT_END=171, 
		J_IF=172, J_ELIF=173, J_ELSE=174, J_ENDIF=175, J_FOR=176, J_IN=177, J_ENDFOR=178, 
		J_SET=179, J_RAW=180, J_ENDRAW=181, J_OR=182, J_AND=183, J_NOT=184, J_WS_STMT=185, 
		J_NUMBER_STMT=186, J_STRING_STMT=187, J_NAME_STMT=188, J_PLUS_STMT=189, 
		J_MINUS_STMT=190, J_TIMES_STMT=191, J_DIVIDE_STMT=192, J_MOD_STMT=193, 
		J_POW_STMT=194, J_EQ_STMT=195, J_NE_STMT=196, J_LE_STMT=197, J_LT_STMT=198, 
		J_GE_STMT=199, J_GT_STMT=200, J_ASSIGN_STMT=201, J_DOT_STMT=202, J_COMMA_STMT=203, 
		J_PIPE_STMT=204, J_LPAREN_STMT=205, J_RPAREN_STMT=206, J_LBRACK_STMT=207, 
		J_RBRACK_STMT=208, JINJA_COMMENT_END=209, JINJA_COMMENT_CONTENT=210;
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
		RULE_stylesheet = 46, RULE_charset = 47, RULE_imports = 48, RULE_namespace_ = 49, 
		RULE_namespacePrefix = 50, RULE_media = 51, RULE_mediaQueryList = 52, 
		RULE_mediaQuery = 53, RULE_mediaType = 54, RULE_mediaExpression = 55, 
		RULE_mediaFeature = 56, RULE_page = 57, RULE_pseudoPage = 58, RULE_selectorGroup = 59, 
		RULE_selector = 60, RULE_combinator = 61, RULE_simpleSelectorSequence = 62, 
		RULE_typeSelector = 63, RULE_typeNamespacePrefix = 64, RULE_elementName = 65, 
		RULE_universal = 66, RULE_className = 67, RULE_attrib = 68, RULE_pseudo = 69, 
		RULE_functionalPseudo = 70, RULE_expression = 71, RULE_negation = 72, 
		RULE_negationArg = 73, RULE_operator_ = 74, RULE_property_ = 75, RULE_ruleset = 76, 
		RULE_declarationList = 77, RULE_declaration = 78, RULE_prio = 79, RULE_value = 80, 
		RULE_css_expr = 81, RULE_css_term = 82, RULE_function_ = 83, RULE_dxImageTransform = 84, 
		RULE_hexcolor = 85, RULE_number = 86, RULE_percentage = 87, RULE_dimension = 88, 
		RULE_unknownDimension = 89, RULE_any_ = 90, RULE_atRule = 91, RULE_unused = 92, 
		RULE_block = 93, RULE_nestedStatement = 94, RULE_groupRuleBody = 95, RULE_supportsRule = 96, 
		RULE_supportsCondition = 97, RULE_supportsConditionInParens = 98, RULE_supportsNegation = 99, 
		RULE_supportsConjunction = 100, RULE_supportsDisjunction = 101, RULE_supportsDeclarationCondition = 102, 
		RULE_generalEnclosed = 103, RULE_url = 104, RULE_var_ = 105, RULE_calc = 106, 
		RULE_calcSum = 107, RULE_calcProduct = 108, RULE_calcValue = 109, RULE_fontFaceRule = 110, 
		RULE_fontFaceDeclaration = 111, RULE_keyframesRule = 112, RULE_keyframeBlock = 113, 
		RULE_keyframeSelector = 114, RULE_viewport = 115, RULE_counterStyle = 116, 
		RULE_fontFeatureValuesRule = 117, RULE_fontFamilyNameList = 118, RULE_fontFamilyName = 119, 
		RULE_featureValueBlock = 120, RULE_featureType = 121, RULE_featureValueDefinition = 122, 
		RULE_ident = 123, RULE_jinja_part = 124, RULE_jinja_output = 125, RULE_jinja_statement = 126, 
		RULE_jinja_ifStatement = 127, RULE_jinja_elifBlock = 128, RULE_jinja_elseBlock = 129, 
		RULE_jinja_forStatement = 130, RULE_jinja_setStatement = 131, RULE_jinja_rawStatement = 132, 
		RULE_jinja_rawText = 133, RULE_jinja_expr = 134, RULE_jinja_logicalOr = 135, 
		RULE_jinja_logicalAnd = 136, RULE_jinja_equality = 137, RULE_jinja_comparison = 138, 
		RULE_jinja_addition = 139, RULE_jinja_multiplication = 140, RULE_jinja_unary = 141, 
		RULE_jinja_primary = 142, RULE_jinja_atom = 143, RULE_jinja_trailer = 144;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simple_stmt", "small_stmt", "compound_stmt", 
			"assign_stmt", "template_literal", "html_content", "import_stmt", "import_name", 
			"import_from", "import_as_names", "import_as_name", "dotted_name", "global_stmt", 
			"decorated", "decorators", "decorator", "func_def", "parameters", "typedargslist", 
			"if_stmt", "return_stmt", "flow_stmt", "suite", "testlist", "test", "or_test", 
			"and_test", "not_test", "comparison", "comp_op", "expr", "term", "factor", 
			"power", "atom_expr", "trailer", "atom", "list_content", "comp_for", 
			"dict_maker", "arglist", "argument", "htmlElement", "tag_content", "stylesheet", 
			"charset", "imports", "namespace_", "namespacePrefix", "media", "mediaQueryList", 
			"mediaQuery", "mediaType", "mediaExpression", "mediaFeature", "page", 
			"pseudoPage", "selectorGroup", "selector", "combinator", "simpleSelectorSequence", 
			"typeSelector", "typeNamespacePrefix", "elementName", "universal", "className", 
			"attrib", "pseudo", "functionalPseudo", "expression", "negation", "negationArg", 
			"operator_", "property_", "ruleset", "declarationList", "declaration", 
			"prio", "value", "css_expr", "css_term", "function_", "dxImageTransform", 
			"hexcolor", "number", "percentage", "dimension", "unknownDimension", 
			"any_", "atRule", "unused", "block", "nestedStatement", "groupRuleBody", 
			"supportsRule", "supportsCondition", "supportsConditionInParens", "supportsNegation", 
			"supportsConjunction", "supportsDisjunction", "supportsDeclarationCondition", 
			"generalEnclosed", "url", "var_", "calc", "calcSum", "calcProduct", "calcValue", 
			"fontFaceRule", "fontFaceDeclaration", "keyframesRule", "keyframeBlock", 
			"keyframeSelector", "viewport", "counterStyle", "fontFeatureValuesRule", 
			"fontFamilyNameList", "fontFamilyName", "featureValueBlock", "featureType", 
			"featureValueDefinition", "ident", "jinja_part", "jinja_output", "jinja_statement", 
			"jinja_ifStatement", "jinja_elifBlock", "jinja_elseBlock", "jinja_forStatement", 
			"jinja_setStatement", "jinja_rawStatement", "jinja_rawText", "jinja_expr", 
			"jinja_logicalOr", "jinja_logicalAnd", "jinja_equality", "jinja_comparison", 
			"jinja_addition", "jinja_multiplication", "jinja_unary", "jinja_primary", 
			"jinja_atom", "jinja_trailer"
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
			null, null, null, null, null, null, null, "'~'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'_'", null, null, 
			null, "'<!--'", "'-->'", "'~='", "'|='", null, null, null, null, null, 
			"'@charset '", null, null, "'url('", null, null, null, null, null, null, 
			null, null, null, "'^='", "'$='", "'*='", null, null, null, null, null, 
			null, "'calc('", null, null, null, null, null, null, "'var('", null, 
			null, null, "'}}'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'%}'", null, null, null, "'endif'", 
			null, null, "'endfor'", "'set'", "'raw'", "'endraw'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'#}'"
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
			"SCRIPT_BODY", "STYLE_CLOSE", "Plus", "Minus", "Greater", "Comma", "Tilde", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Equal", "Colon", "Dot", "Multiply", "Divide", 
			"Pipe", "Underscore", "Comment", "Url", "Space", "Cdo", "Cdc", "Includes", 
			"DashMatch", "Hash", "Import", "Page", "Media", "Namespace", "Charset", 
			"Important", "Percentage", "Url_", "UnicodeRange", "MediaOnly", "Not", 
			"And", "Dimension", "UnknownDimension", "PseudoNot", "Number", "String_", 
			"PrefixMatch", "SuffixMatch", "SubstringMatch", "FontFace", "Supports", 
			"Or", "Keyframes", "From", "To", "Calc", "Viewport", "CounterStyle", 
			"FontFeatureValues", "DxImageTransform", "AtKeyword", "Variable", "Var", 
			"Ident", "Function_", "UnexpectedCharacter", "JINJA_EXPR_END", "J_WS", 
			"J_NUMBER", "J_STRING", "J_NAME", "J_PLUS", "J_MINUS", "J_TIMES", "J_DIVIDE", 
			"J_MOD", "J_POW", "J_EQ", "J_NE", "J_LE", "J_LT", "J_GE", "J_GT", "J_ASSIGN", 
			"J_DOT", "J_COMMA", "J_PIPE", "J_LPAREN", "J_RPAREN", "J_LBRACK", "J_RBRACK", 
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
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033421310495688L) != 0)) {
				{
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(290);
					statement();
					}
					break;
				case 2:
					{
					setState(291);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
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
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case IF:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
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
				setState(300);
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
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420974949248L) != 0)) {
				{
				setState(303);
				small_stmt();
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(304);
						match(SEMI);
						setState(305);
						small_stmt();
						}
						} 
					}
					setState(310);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
			}

			setState(313);
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
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				import_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				return_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				global_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
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
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				if_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				func_def();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
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
			setState(328);
			match(NAME);
			setState(329);
			match(ASSIGN);
			setState(332);
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
				setState(330);
				test();
				}
				break;
			case TRIPLE_DOUBLE_START:
			case TRIPLE_SINGLE_START:
				{
				setState(331);
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
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIPLE_DOUBLE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(TRIPLE_DOUBLE_START);
				setState(335);
				html_content();
				setState(336);
				match(TRIPLE_DOUBLE_END);
				}
				break;
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(TRIPLE_SINGLE_START);
				setState(339);
				html_content();
				setState(340);
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
		public List<Jinja_partContext> jinja_part() {
			return getRuleContexts(Jinja_partContext.class);
		}
		public Jinja_partContext jinja_part(int i) {
			return getRuleContext(Jinja_partContext.class,i);
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
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 15843L) != 0)) {
				{
				setState(347);
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
					setState(344);
					htmlElement();
					}
					break;
				case JINJA_EXPR_START:
				case JINJA_STMT_START:
					{
					setState(345);
					jinja_part();
					}
					break;
				case HTML_TEXT:
					{
					setState(346);
					match(HTML_TEXT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(351);
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
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
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
			setState(356);
			match(IMPORT);
			setState(357);
			dotted_name();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(358);
				match(AS);
				setState(359);
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
			setState(362);
			match(FROM);
			setState(363);
			dotted_name();
			setState(364);
			match(IMPORT);
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(365);
				match(STAR);
				}
				break;
			case NAME:
				{
				setState(366);
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
			setState(369);
			import_as_name();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(370);
				match(COMMA);
				setState(371);
				import_as_name();
				}
				}
				setState(376);
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
			setState(377);
			match(NAME);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(378);
				match(AS);
				setState(379);
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
			setState(382);
			match(NAME);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(383);
				match(DOT);
				setState(384);
				match(NAME);
				}
				}
				setState(389);
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
			setState(390);
			match(GLOBAL);
			setState(391);
			match(NAME);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(392);
				match(COMMA);
				setState(393);
				match(NAME);
				}
				}
				setState(398);
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
			setState(399);
			decorators();
			setState(400);
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
			setState(403); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(402);
				decorator();
				}
				}
				setState(405); 
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
			setState(407);
			match(AT);
			setState(408);
			dotted_name();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(409);
				match(LP);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(410);
					arglist();
					}
				}

				setState(413);
				match(RP);
				}
			}

			setState(416);
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
			setState(418);
			match(DEF);
			setState(419);
			match(NAME);
			setState(420);
			parameters();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(421);
				match(ARROW);
				setState(422);
				test();
				}
			}

			setState(425);
			match(COLON);
			setState(426);
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
			setState(428);
			match(LP);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(429);
				typedargslist();
				}
			}

			setState(432);
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
			setState(434);
			match(NAME);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(435);
				match(COMMA);
				setState(436);
				match(NAME);
				}
				}
				setState(441);
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
			setState(442);
			match(IF);
			setState(443);
			test();
			setState(444);
			match(COLON);
			setState(445);
			suite();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(446);
				match(ELIF);
				setState(447);
				test();
				setState(448);
				match(COLON);
				setState(449);
				suite();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(456);
				match(ELSE);
				setState(457);
				match(COLON);
				setState(458);
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
			setState(461);
			match(RETURN);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
				{
				setState(462);
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
			setState(465);
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
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(NEWLINE);
				setState(469);
				match(INDENT);
				setState(471); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(470);
					statement();
					}
					}
					setState(473); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4033421310495688L) != 0) );
				setState(475);
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
			setState(479);
			test();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(480);
				match(COMMA);
				setState(481);
				test();
				}
				}
				setState(486);
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
			setState(487);
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
			setState(489);
			and_test();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(490);
				match(OR);
				setState(491);
				and_test();
				}
				}
				setState(496);
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
			setState(497);
			not_test();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(498);
				match(AND);
				setState(499);
				not_test();
				}
				}
				setState(504);
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
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(NOT);
				setState(506);
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
				setState(507);
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
			setState(510);
			expr();
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					comp_op();
					setState(512);
					expr();
					}
					} 
				}
				setState(518);
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
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(GT);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				match(NEQ);
				}
				break;
			case GTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(523);
				match(GTE);
				}
				break;
			case LTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(524);
				match(LTE);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(525);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(526);
				match(NOT);
				setState(527);
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
			setState(530);
			term();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(532);
				term();
				}
				}
				setState(537);
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
			setState(538);
			factor();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				{
				setState(539);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				factor();
				}
				}
				setState(545);
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
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(547);
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
				setState(548);
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
			setState(551);
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
			setState(553);
			atom();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 303465209266176L) != 0)) {
				{
				{
				setState(554);
				trailer();
				}
				}
				setState(559);
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
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(LP);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(561);
					arglist();
					}
				}

				setState(564);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(LBRACK);
				setState(566);
				test();
				setState(567);
				match(RBRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				match(DOT);
				setState(570);
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
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(NAME);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(576); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(575);
					match(STRING);
					}
					}
					setState(578); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(581);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				match(FALSE);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				match(LP);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(584);
					test();
					}
				}

				setState(587);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(588);
				match(LBRACK);
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(589);
					list_content();
					}
				}

				setState(592);
				match(RBRACK);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 9);
				{
				setState(593);
				match(LBRACE);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(594);
					dict_maker();
					}
				}

				setState(597);
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
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				test();
				setState(601);
				comp_for();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				test();
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(604);
					match(COMMA);
					setState(605);
					test();
					}
					}
					setState(610);
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
			setState(613);
			match(FOR);
			setState(614);
			test();
			setState(615);
			match(IN);
			setState(616);
			test();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(617);
				match(IF);
				setState(618);
				test();
				}
				}
				setState(623);
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
			setState(624);
			test();
			setState(625);
			match(COLON);
			setState(626);
			test();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(627);
				match(COMMA);
				setState(628);
				test();
				setState(629);
				match(COLON);
				setState(630);
				test();
				}
				}
				setState(636);
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
			setState(637);
			argument();
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(638);
				match(COMMA);
				setState(639);
				argument();
				}
				}
				setState(644);
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
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(NAME);
				setState(647);
				match(ASSIGN);
				setState(648);
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
		enterRule(_localctx, 88, RULE_htmlElement);
		int _la;
		try {
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(TAG_OPEN);
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 458755L) != 0)) {
					{
					{
					setState(652);
					tag_content();
					}
					}
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(658);
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
				setState(659);
				match(SCRIPT_OPEN);
				setState(660);
				match(SCRIPT_BODY);
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				match(STYLE_OPEN);
				setState(662);
				stylesheet();
				setState(663);
				match(STYLE_CLOSE);
				}
				break;
			case XML_DECLARATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(XML_DECLARATION);
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(666);
				match(CDATA);
				}
				break;
			case DTD:
				enterOuterAlt(_localctx, 6);
				{
				setState(667);
				match(DTD);
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 7);
				{
				setState(668);
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
		public Jinja_partContext jinja_part() {
			return getRuleContext(Jinja_partContext.class,0);
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
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(TAG_NAME);
				setState(674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(672);
					match(TAG_EQUALS);
					setState(673);
					match(ATTVALUE_VALUE);
					}
					break;
				}
				}
				break;
			case JINJA_EXPR_START:
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				jinja_part();
				}
				break;
			case TAG_SLASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				match(TAG_SLASH);
				}
				break;
			case TAG_EQUALS:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
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
		public TerminalNode EOF() { return getToken(JinjaFlaskParser.EOF, 0); }
		public List<CharsetContext> charset() {
			return getRuleContexts(CharsetContext.class);
		}
		public CharsetContext charset(int i) {
			return getRuleContext(CharsetContext.class,i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<Namespace_Context> namespace_() {
			return getRuleContexts(Namespace_Context.class);
		}
		public Namespace_Context namespace_(int i) {
			return getRuleContext(Namespace_Context.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public List<TerminalNode> Comment() { return getTokens(JinjaFlaskParser.Comment); }
		public TerminalNode Comment(int i) {
			return getToken(JinjaFlaskParser.Comment, i);
		}
		public List<TerminalNode> Space() { return getTokens(JinjaFlaskParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(JinjaFlaskParser.Space, i);
		}
		public List<TerminalNode> Cdo() { return getTokens(JinjaFlaskParser.Cdo); }
		public TerminalNode Cdo(int i) {
			return getToken(JinjaFlaskParser.Cdo, i);
		}
		public List<TerminalNode> Cdc() { return getTokens(JinjaFlaskParser.Cdc); }
		public TerminalNode Cdc(int i) {
			return getToken(JinjaFlaskParser.Cdc, i);
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
		enterRule(_localctx, 92, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Charset) {
				{
				{
				setState(681);
				charset();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 29L) != 0)) {
					{
					{
					setState(682);
					_la = _input.LA(1);
					if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 29L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(693);
				imports();
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 29L) != 0)) {
					{
					{
					setState(694);
					_la = _input.LA(1);
					if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 29L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Namespace) {
				{
				{
				setState(705);
				namespace_();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 29L) != 0)) {
					{
					{
					setState(706);
					_la = _input.LA(1);
					if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 29L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7340744239645647523L) != 0)) {
				{
				{
				setState(717);
				nestedStatement();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 29L) != 0)) {
					{
					{
					setState(718);
					_la = _input.LA(1);
					if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 29L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
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
	public static class CharsetContext extends ParserRuleContext {
		public CharsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset; }
	 
		public CharsetContext() { }
		public void copyFrom(CharsetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadCharsetContext extends CharsetContext {
		public TerminalNode Charset() { return getToken(JinjaFlaskParser.Charset, 0); }
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public BadCharsetContext(CharsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterBadCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitBadCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitBadCharset(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodCharsetContext extends CharsetContext {
		public TerminalNode Charset() { return getToken(JinjaFlaskParser.Charset, 0); }
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public TerminalNode SemiColon() { return getToken(JinjaFlaskParser.SemiColon, 0); }
		public GoodCharsetContext(CharsetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterGoodCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitGoodCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitGoodCharset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharsetContext charset() throws RecognitionException {
		CharsetContext _localctx = new CharsetContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_charset);
		try {
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new GoodCharsetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				match(Charset);
				setState(732);
				match(String_);
				setState(733);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new BadCharsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(Charset);
				setState(735);
				match(String_);
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
	public static class ImportsContext extends ParserRuleContext {
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	 
		public ImportsContext() { }
		public void copyFrom(ImportsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadImportContext extends ImportsContext {
		public TerminalNode Import() { return getToken(JinjaFlaskParser.Import, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public BadImportContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterBadImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitBadImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitBadImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodImportContext extends ImportsContext {
		public TerminalNode Import() { return getToken(JinjaFlaskParser.Import, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JinjaFlaskParser.SemiColon, 0); }
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public GoodImportContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterGoodImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitGoodImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitGoodImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_imports);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				match(Import);
				setState(741);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(739);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(740);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(743);
				mediaQueryList();
				setState(744);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(Import);
				setState(749);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(747);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(748);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(751);
				match(SemiColon);
				}
				break;
			case 3:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(752);
				match(Import);
				setState(755);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(753);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(754);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(757);
				mediaQueryList();
				}
				break;
			case 4:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(758);
				match(Import);
				setState(761);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(759);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(760);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class Namespace_Context extends ParserRuleContext {
		public Namespace_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_; }
	 
		public Namespace_Context() { }
		public void copyFrom(Namespace_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodNamespaceContext extends Namespace_Context {
		public TerminalNode Namespace() { return getToken(JinjaFlaskParser.Namespace, 0); }
		public TerminalNode SemiColon() { return getToken(JinjaFlaskParser.SemiColon, 0); }
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public GoodNamespaceContext(Namespace_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterGoodNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitGoodNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitGoodNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadNamespaceContext extends Namespace_Context {
		public TerminalNode Namespace() { return getToken(JinjaFlaskParser.Namespace, 0); }
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public BadNamespaceContext(Namespace_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterBadNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitBadNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitBadNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_Context namespace_() throws RecognitionException {
		Namespace_Context _localctx = new Namespace_Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_namespace_);
		int _la;
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new GoodNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				match(Namespace);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 33660935L) != 0)) {
					{
					setState(766);
					namespacePrefix();
					}
				}

				setState(771);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(769);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(770);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(773);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new BadNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
				match(Namespace);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 33660935L) != 0)) {
					{
					setState(775);
					namespacePrefix();
					}
				}

				setState(780);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(778);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(779);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class NamespacePrefixContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public NamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacePrefixContext namespacePrefix() throws RecognitionException {
		NamespacePrefixContext _localctx = new NamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_namespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaContext extends ParserRuleContext {
		public TerminalNode Media() { return getToken(JinjaFlaskParser.Media, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitMedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitMedia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(Media);
			setState(787);
			mediaQueryList();
			setState(788);
			groupRuleBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<TerminalNode> Comma() { return getTokens(JinjaFlaskParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JinjaFlaskParser.Comma, i);
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
		enterRule(_localctx, 104, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(790);
				mediaQuery();
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(791);
					match(Comma);
					setState(792);
					mediaQuery();
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class MediaQueryContext extends ParserRuleContext {
		public MediaTypeContext mediaType() {
			return getRuleContext(MediaTypeContext.class,0);
		}
		public List<TerminalNode> And() { return getTokens(JinjaFlaskParser.And); }
		public TerminalNode And(int i) {
			return getToken(JinjaFlaskParser.And, i);
		}
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public TerminalNode MediaOnly() { return getToken(JinjaFlaskParser.MediaOnly, 0); }
		public TerminalNode Not() { return getToken(JinjaFlaskParser.Not, 0); }
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
		enterRule(_localctx, 106, RULE_mediaQuery);
		int _la;
		try {
			int _alt;
			setState(819);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(800);
					_la = _input.LA(1);
					if ( !(_la==MediaOnly || _la==Not) ) {
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
				setState(803);
				mediaType();
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(804);
						match(And);
						setState(805);
						mediaExpression();
						}
						} 
					}
					setState(810);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				mediaExpression();
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(812);
						match(And);
						setState(813);
						mediaExpression();
						}
						} 
					}
					setState(818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
	public static class MediaTypeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MediaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterMediaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitMediaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitMediaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaTypeContext mediaType() throws RecognitionException {
		MediaTypeContext _localctx = new MediaTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_mediaType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaExpressionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(JinjaFlaskParser.OpenParen, 0); }
		public MediaFeatureContext mediaFeature() {
			return getRuleContext(MediaFeatureContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public TerminalNode Colon() { return getToken(JinjaFlaskParser.Colon, 0); }
		public Css_exprContext css_expr() {
			return getRuleContext(Css_exprContext.class,0);
		}
		public MediaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterMediaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitMediaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitMediaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaExpressionContext mediaExpression() throws RecognitionException {
		MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_mediaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(OpenParen);
			setState(824);
			mediaFeature();
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(825);
				match(Colon);
				setState(826);
				css_expr();
				}
			}

			setState(829);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaFeatureContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MediaFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterMediaFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitMediaFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitMediaFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaFeatureContext mediaFeature() throws RecognitionException {
		MediaFeatureContext _localctx = new MediaFeatureContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_mediaFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode Page() { return getToken(JinjaFlaskParser.Page, 0); }
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public PseudoPageContext pseudoPage() {
			return getRuleContext(PseudoPageContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(JinjaFlaskParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JinjaFlaskParser.SemiColon, i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			match(Page);
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(834);
				pseudoPage();
				}
			}

			setState(837);
			match(OpenBrace);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 88184283201545L) != 0)) {
				{
				setState(838);
				declaration();
				}
			}

			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(841);
				match(SemiColon);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 88184283201545L) != 0)) {
					{
					setState(842);
					declaration();
					}
				}

				}
				}
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(850);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoPageContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(JinjaFlaskParser.Colon, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PseudoPageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoPage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterPseudoPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitPseudoPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitPseudoPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoPageContext pseudoPage() throws RecognitionException {
		PseudoPageContext _localctx = new PseudoPageContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_pseudoPage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(Colon);
			setState(853);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<TerminalNode> Comma() { return getTokens(JinjaFlaskParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JinjaFlaskParser.Comma, i);
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
		enterRule(_localctx, 118, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			selector();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(856);
				match(Comma);
				setState(857);
				selector();
				}
				}
				setState(862);
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
		enterRule(_localctx, 120, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			simpleSelectorSequence();
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2097173L) != 0)) {
				{
				{
				setState(864);
				combinator();
				setState(865);
				simpleSelectorSequence();
				}
				}
				setState(871);
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
		public TerminalNode Plus() { return getToken(JinjaFlaskParser.Plus, 0); }
		public TerminalNode Greater() { return getToken(JinjaFlaskParser.Greater, 0); }
		public TerminalNode Tilde() { return getToken(JinjaFlaskParser.Tilde, 0); }
		public TerminalNode Space() { return getToken(JinjaFlaskParser.Space, 0); }
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
		enterRule(_localctx, 122, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2097173L) != 0)) ) {
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
		public List<TerminalNode> Hash() { return getTokens(JinjaFlaskParser.Hash); }
		public TerminalNode Hash(int i) {
			return getToken(JinjaFlaskParser.Hash, i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
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
		enterRule(_localctx, 124, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Multiply:
			case Pipe:
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(874);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(875);
					universal();
					}
					break;
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 68721574657L) != 0)) {
					{
					setState(883);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(878);
						match(Hash);
						}
						break;
					case Dot:
						{
						setState(879);
						className();
						}
						break;
					case OpenBracket:
						{
						setState(880);
						attrib();
						}
						break;
					case Colon:
						{
						setState(881);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(882);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case OpenBracket:
			case Colon:
			case Dot:
			case Hash:
			case PseudoNot:
				enterOuterAlt(_localctx, 2);
				{
				setState(893); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(893);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(888);
						match(Hash);
						}
						break;
					case Dot:
						{
						setState(889);
						className();
						}
						break;
					case OpenBracket:
						{
						setState(890);
						attrib();
						}
						break;
					case Colon:
						{
						setState(891);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(892);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(895); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 68721574657L) != 0) );
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
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
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
		enterRule(_localctx, 126, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(899);
				typeNamespacePrefix();
				}
				break;
			}
			setState(902);
			elementName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNamespacePrefixContext extends ParserRuleContext {
		public TerminalNode Pipe() { return getToken(JinjaFlaskParser.Pipe, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode Multiply() { return getToken(JinjaFlaskParser.Multiply, 0); }
		public TypeNamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTypeNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTypeNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTypeNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamespacePrefixContext typeNamespacePrefix() throws RecognitionException {
		TypeNamespacePrefixContext _localctx = new TypeNamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typeNamespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				{
				setState(904);
				ident();
				}
				break;
			case Multiply:
				{
				setState(905);
				match(Multiply);
				}
				break;
			case Pipe:
				break;
			default:
				break;
			}
			setState(908);
			match(Pipe);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode Multiply() { return getToken(JinjaFlaskParser.Multiply, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
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
		enterRule(_localctx, 132, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(912);
				typeNamespacePrefix();
				}
				break;
			}
			setState(915);
			match(Multiply);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(JinjaFlaskParser.Dot, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(Dot);
			setState(918);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttribContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(JinjaFlaskParser.OpenBracket, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(JinjaFlaskParser.CloseBracket, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TerminalNode PrefixMatch() { return getToken(JinjaFlaskParser.PrefixMatch, 0); }
		public TerminalNode SuffixMatch() { return getToken(JinjaFlaskParser.SuffixMatch, 0); }
		public TerminalNode SubstringMatch() { return getToken(JinjaFlaskParser.SubstringMatch, 0); }
		public TerminalNode Equal() { return getToken(JinjaFlaskParser.Equal, 0); }
		public TerminalNode Includes() { return getToken(JinjaFlaskParser.Includes, 0); }
		public TerminalNode DashMatch() { return getToken(JinjaFlaskParser.DashMatch, 0); }
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(OpenBracket);
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(921);
				typeNamespacePrefix();
				}
				break;
			}
			setState(924);
			ident();
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 30064783361L) != 0)) {
				{
				setState(925);
				_la = _input.LA(1);
				if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 30064783361L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(928);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MediaOnly:
				case Not:
				case And:
				case Or:
				case From:
				case To:
				case Ident:
					{
					setState(926);
					ident();
					}
					break;
				case String_:
					{
					setState(927);
					match(String_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(932);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<TerminalNode> Colon() { return getTokens(JinjaFlaskParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(JinjaFlaskParser.Colon, i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FunctionalPseudoContext functionalPseudo() {
			return getRuleContext(FunctionalPseudoContext.class,0);
		}
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
		enterRule(_localctx, 138, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(Colon);
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(935);
				match(Colon);
				}
			}

			setState(940);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				{
				setState(938);
				ident();
				}
				break;
			case Function_:
				{
				setState(939);
				functionalPseudo();
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
	public static class FunctionalPseudoContext extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(JinjaFlaskParser.Function_, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public FunctionalPseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalPseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFunctionalPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFunctionalPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFunctionalPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalPseudoContext functionalPseudo() throws RecognitionException {
		FunctionalPseudoContext _localctx = new FunctionalPseudoContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionalPseudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(Function_);
			setState(943);
			expression();
			setState(944);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<TerminalNode> Plus() { return getTokens(JinjaFlaskParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(JinjaFlaskParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(JinjaFlaskParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(JinjaFlaskParser.Minus, i);
		}
		public List<TerminalNode> Dimension() { return getTokens(JinjaFlaskParser.Dimension); }
		public TerminalNode Dimension(int i) {
			return getToken(JinjaFlaskParser.Dimension, i);
		}
		public List<TerminalNode> UnknownDimension() { return getTokens(JinjaFlaskParser.UnknownDimension); }
		public TerminalNode UnknownDimension(int i) {
			return getToken(JinjaFlaskParser.UnknownDimension, i);
		}
		public List<TerminalNode> Number() { return getTokens(JinjaFlaskParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(JinjaFlaskParser.Number, i);
		}
		public List<TerminalNode> String_() { return getTokens(JinjaFlaskParser.String_); }
		public TerminalNode String_(int i) {
			return getToken(JinjaFlaskParser.String_, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
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
		enterRule(_localctx, 142, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(953);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(946);
					match(Plus);
					}
					break;
				case Minus:
					{
					setState(947);
					match(Minus);
					}
					break;
				case Dimension:
					{
					setState(948);
					match(Dimension);
					}
					break;
				case UnknownDimension:
					{
					setState(949);
					match(UnknownDimension);
					}
					break;
				case Number:
					{
					setState(950);
					match(Number);
					}
					break;
				case String_:
					{
					setState(951);
					match(String_);
					}
					break;
				case MediaOnly:
				case Not:
				case And:
				case Or:
				case From:
				case To:
				case Ident:
					{
					setState(952);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(957); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 2313176683051483139L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends ParserRuleContext {
		public TerminalNode PseudoNot() { return getToken(JinjaFlaskParser.PseudoNot, 0); }
		public NegationArgContext negationArg() {
			return getRuleContext(NegationArgContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(PseudoNot);
			setState(960);
			negationArg();
			setState(961);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegationArgContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public TerminalNode Hash() { return getToken(JinjaFlaskParser.Hash, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public NegationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterNegationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitNegationArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitNegationArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationArgContext negationArg() throws RecognitionException {
		NegationArgContext _localctx = new NegationArgContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_negationArg);
		try {
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				typeSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				universal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				match(Hash);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(966);
				className();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(967);
				attrib();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(968);
				pseudo();
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
	public static class Operator_Context extends ParserRuleContext {
		public Operator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_; }
	 
		public Operator_Context() { }
		public void copyFrom(Operator_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadOperatorContext extends Operator_Context {
		public TerminalNode Equal() { return getToken(JinjaFlaskParser.Equal, 0); }
		public BadOperatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterBadOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitBadOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitBadOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodOperatorContext extends Operator_Context {
		public TerminalNode Divide() { return getToken(JinjaFlaskParser.Divide, 0); }
		public TerminalNode Comma() { return getToken(JinjaFlaskParser.Comma, 0); }
		public TerminalNode Space() { return getToken(JinjaFlaskParser.Space, 0); }
		public GoodOperatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterGoodOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitGoodOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitGoodOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_operator_);
		try {
			setState(975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Divide:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(Divide);
				}
				break;
			case Comma:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				match(Comma);
				}
				break;
			case Space:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(973);
				match(Space);
				}
				break;
			case Equal:
				_localctx = new BadOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(974);
				match(Equal);
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
	public static class Property_Context extends ParserRuleContext {
		public Property_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_; }
	 
		public Property_Context() { }
		public void copyFrom(Property_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadPropertyContext extends Property_Context {
		public TerminalNode Multiply() { return getToken(JinjaFlaskParser.Multiply, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode Underscore() { return getToken(JinjaFlaskParser.Underscore, 0); }
		public BadPropertyContext(Property_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterBadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitBadProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitBadProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodPropertyContext extends Property_Context {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode Variable() { return getToken(JinjaFlaskParser.Variable, 0); }
		public GoodPropertyContext(Property_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterGoodProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitGoodProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitGoodProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_Context property_() throws RecognitionException {
		Property_Context _localctx = new Property_Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_property_);
		try {
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(977);
				ident();
				}
				break;
			case Variable:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				match(Variable);
				}
				break;
			case Multiply:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(979);
				match(Multiply);
				setState(980);
				ident();
				}
				break;
			case Underscore:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(981);
				match(Underscore);
				setState(982);
				ident();
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
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
	 
		public RulesetContext() { }
		public void copyFrom(RulesetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownRulesetContext extends RulesetContext {
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public UnknownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterUnknownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitUnknownRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitUnknownRuleset(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownRulesetContext extends RulesetContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public KnownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterKnownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitKnownRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitKnownRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ruleset);
		int _la;
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				_localctx = new KnownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				selectorGroup();
				setState(986);
				match(OpenBrace);
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 1410948531224721L) != 0)) {
					{
					setState(987);
					declarationList();
					}
				}

				setState(990);
				match(CloseBrace);
				}
				break;
			case 2:
				_localctx = new UnknownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 6924862761726910627L) != 0)) {
					{
					{
					setState(992);
					any_();
					}
					}
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(998);
				match(OpenBrace);
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 1410948531224721L) != 0)) {
					{
					setState(999);
					declarationList();
					}
				}

				setState(1002);
				match(CloseBrace);
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
		public List<TerminalNode> SemiColon() { return getTokens(JinjaFlaskParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JinjaFlaskParser.SemiColon, i);
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
		enterRule(_localctx, 154, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(1005);
				match(SemiColon);
				}
				}
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1011);
			declaration();
			setState(1018);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1012);
					match(SemiColon);
					setState(1014);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						setState(1013);
						declaration();
						}
						break;
					}
					}
					} 
				}
				setState(1020);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownDeclarationContext extends DeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(JinjaFlaskParser.Colon, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterUnknownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitUnknownDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitUnknownDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownDeclarationContext extends DeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(JinjaFlaskParser.Colon, 0); }
		public Css_exprContext css_expr() {
			return getRuleContext(Css_exprContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public KnownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterKnownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitKnownDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitKnownDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_declaration);
		int _la;
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				_localctx = new KnownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				property_();
				setState(1022);
				match(Colon);
				setState(1023);
				css_expr();
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Important) {
					{
					setState(1024);
					prio();
					}
				}

				}
				break;
			case 2:
				_localctx = new UnknownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				property_();
				setState(1028);
				match(Colon);
				setState(1029);
				value();
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
	public static class PrioContext extends ParserRuleContext {
		public TerminalNode Important() { return getToken(JinjaFlaskParser.Important, 0); }
		public PrioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterPrio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitPrio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitPrio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrioContext prio() throws RecognitionException {
		PrioContext _localctx = new PrioContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_prio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(Important);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> AtKeyword() { return getTokens(JinjaFlaskParser.AtKeyword); }
		public TerminalNode AtKeyword(int i) {
			return getToken(JinjaFlaskParser.AtKeyword, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1038); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1038);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Plus:
					case Minus:
					case OpenBracket:
					case OpenParen:
					case Colon:
					case Url:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Url_:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Number:
					case String_:
					case Or:
					case From:
					case To:
					case Ident:
					case Function_:
						{
						setState(1035);
						any_();
						}
						break;
					case OpenBrace:
						{
						setState(1036);
						block();
						}
						break;
					case AtKeyword:
						{
						setState(1037);
						match(AtKeyword);
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
				setState(1040); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
	public static class Css_exprContext extends ParserRuleContext {
		public List<Css_termContext> css_term() {
			return getRuleContexts(Css_termContext.class);
		}
		public Css_termContext css_term(int i) {
			return getRuleContext(Css_termContext.class,i);
		}
		public List<Operator_Context> operator_() {
			return getRuleContexts(Operator_Context.class);
		}
		public Operator_Context operator_(int i) {
			return getRuleContext(Operator_Context.class,i);
		}
		public Css_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCss_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCss_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCss_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_exprContext css_expr() throws RecognitionException {
		Css_exprContext _localctx = new Css_exprContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_css_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			css_term();
			setState(1049);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1044);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 270849L) != 0)) {
						{
						setState(1043);
						operator_();
						}
					}

					setState(1046);
					css_term();
					}
					} 
				}
				setState(1051);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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
		public Css_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_term; }
	 
		public Css_termContext() { }
		public void copyFrom(Css_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadTermContext extends Css_termContext {
		public DxImageTransformContext dxImageTransform() {
			return getRuleContext(DxImageTransformContext.class,0);
		}
		public BadTermContext(Css_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterBadTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitBadTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitBadTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownTermContext extends Css_termContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public TerminalNode UnicodeRange() { return getToken(JinjaFlaskParser.UnicodeRange, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public HexcolorContext hexcolor() {
			return getRuleContext(HexcolorContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public KnownTermContext(Css_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterKnownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitKnownTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitKnownTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownTermContext extends Css_termContext {
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public UnknownTermContext(Css_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterUnknownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitUnknownTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitUnknownTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_termContext css_term() throws RecognitionException {
		Css_termContext _localctx = new Css_termContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_css_term);
		try {
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				number();
				}
				break;
			case 2:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				percentage();
				}
				break;
			case 3:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1054);
				dimension();
				}
				break;
			case 4:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1055);
				match(String_);
				}
				break;
			case 5:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1056);
				match(UnicodeRange);
				}
				break;
			case 6:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1057);
				ident();
				}
				break;
			case 7:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1058);
				var_();
				}
				break;
			case 8:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1059);
				url();
				}
				break;
			case 9:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1060);
				hexcolor();
				}
				break;
			case 10:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1061);
				calc();
				}
				break;
			case 11:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1062);
				function_();
				}
				break;
			case 12:
				_localctx = new UnknownTermContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1063);
				unknownDimension();
				}
				break;
			case 13:
				_localctx = new BadTermContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1064);
				dxImageTransform();
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
	public static class Function_Context extends ParserRuleContext {
		public TerminalNode Function_() { return getToken(JinjaFlaskParser.Function_, 0); }
		public Css_exprContext css_expr() {
			return getRuleContext(Css_exprContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFunction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFunction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFunction_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_function_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(Function_);
			setState(1068);
			css_expr();
			setState(1069);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DxImageTransformContext extends ParserRuleContext {
		public TerminalNode DxImageTransform() { return getToken(JinjaFlaskParser.DxImageTransform, 0); }
		public Css_exprContext css_expr() {
			return getRuleContext(Css_exprContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public DxImageTransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dxImageTransform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDxImageTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDxImageTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDxImageTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DxImageTransformContext dxImageTransform() throws RecognitionException {
		DxImageTransformContext _localctx = new DxImageTransformContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dxImageTransform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			match(DxImageTransform);
			setState(1072);
			css_expr();
			setState(1073);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HexcolorContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(JinjaFlaskParser.Hash, 0); }
		public HexcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterHexcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitHexcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitHexcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexcolorContext hexcolor() throws RecognitionException {
		HexcolorContext _localctx = new HexcolorContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_hexcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(Hash);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(JinjaFlaskParser.Number, 0); }
		public TerminalNode Plus() { return getToken(JinjaFlaskParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JinjaFlaskParser.Minus, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1077);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1080);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PercentageContext extends ParserRuleContext {
		public TerminalNode Percentage() { return getToken(JinjaFlaskParser.Percentage, 0); }
		public TerminalNode Plus() { return getToken(JinjaFlaskParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JinjaFlaskParser.Minus, 0); }
		public PercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitPercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitPercentage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentageContext percentage() throws RecognitionException {
		PercentageContext _localctx = new PercentageContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_percentage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1082);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1085);
			match(Percentage);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode Dimension() { return getToken(JinjaFlaskParser.Dimension, 0); }
		public TerminalNode Plus() { return getToken(JinjaFlaskParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JinjaFlaskParser.Minus, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1087);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1090);
			match(Dimension);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnknownDimensionContext extends ParserRuleContext {
		public TerminalNode UnknownDimension() { return getToken(JinjaFlaskParser.UnknownDimension, 0); }
		public TerminalNode Plus() { return getToken(JinjaFlaskParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(JinjaFlaskParser.Minus, 0); }
		public UnknownDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterUnknownDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitUnknownDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitUnknownDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownDimensionContext unknownDimension() throws RecognitionException {
		UnknownDimensionContext _localctx = new UnknownDimensionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_unknownDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1092);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1095);
			match(UnknownDimension);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_Context extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode Hash() { return getToken(JinjaFlaskParser.Hash, 0); }
		public TerminalNode UnicodeRange() { return getToken(JinjaFlaskParser.UnicodeRange, 0); }
		public TerminalNode Includes() { return getToken(JinjaFlaskParser.Includes, 0); }
		public TerminalNode DashMatch() { return getToken(JinjaFlaskParser.DashMatch, 0); }
		public TerminalNode Colon() { return getToken(JinjaFlaskParser.Colon, 0); }
		public TerminalNode Function_() { return getToken(JinjaFlaskParser.Function_, 0); }
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public TerminalNode OpenParen() { return getToken(JinjaFlaskParser.OpenParen, 0); }
		public TerminalNode OpenBracket() { return getToken(JinjaFlaskParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(JinjaFlaskParser.CloseBracket, 0); }
		public Any_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAny_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAny_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAny_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_Context any_() throws RecognitionException {
		Any_Context _localctx = new Any_Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_any_);
		int _la;
		try {
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1099);
				percentage();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1100);
				dimension();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1101);
				unknownDimension();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1102);
				match(String_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1103);
				url();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1104);
				match(Hash);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1105);
				match(UnicodeRange);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1106);
				match(Includes);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1107);
				match(DashMatch);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1108);
				match(Colon);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1109);
				match(Function_);
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7213093137891207843L) != 0)) {
					{
					setState(1112);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Plus:
					case Minus:
					case OpenBracket:
					case OpenParen:
					case Colon:
					case Url:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Url_:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Number:
					case String_:
					case Or:
					case From:
					case To:
					case Ident:
					case Function_:
						{
						setState(1110);
						any_();
						}
						break;
					case OpenBrace:
					case SemiColon:
					case Cdo:
					case Cdc:
					case AtKeyword:
						{
						setState(1111);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1117);
				match(CloseParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1118);
				match(OpenParen);
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7213093137891207843L) != 0)) {
					{
					setState(1121);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Plus:
					case Minus:
					case OpenBracket:
					case OpenParen:
					case Colon:
					case Url:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Url_:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Number:
					case String_:
					case Or:
					case From:
					case To:
					case Ident:
					case Function_:
						{
						setState(1119);
						any_();
						}
						break;
					case OpenBrace:
					case SemiColon:
					case Cdo:
					case Cdc:
					case AtKeyword:
						{
						setState(1120);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1126);
				match(CloseParen);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1127);
				match(OpenBracket);
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7213093137891207843L) != 0)) {
					{
					setState(1130);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Plus:
					case Minus:
					case OpenBracket:
					case OpenParen:
					case Colon:
					case Url:
					case Includes:
					case DashMatch:
					case Hash:
					case Percentage:
					case Url_:
					case UnicodeRange:
					case MediaOnly:
					case Not:
					case And:
					case Dimension:
					case UnknownDimension:
					case Number:
					case String_:
					case Or:
					case From:
					case To:
					case Ident:
					case Function_:
						{
						setState(1128);
						any_();
						}
						break;
					case OpenBrace:
					case SemiColon:
					case Cdo:
					case Cdc:
					case AtKeyword:
						{
						setState(1129);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1135);
				match(CloseBracket);
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
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
	 
		public AtRuleContext() { }
		public void copyFrom(AtRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownAtRuleContext extends AtRuleContext {
		public TerminalNode AtKeyword() { return getToken(JinjaFlaskParser.AtKeyword, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(JinjaFlaskParser.SemiColon, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public UnknownAtRuleContext(AtRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterUnknownAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitUnknownAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitUnknownAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_atRule);
		int _la;
		try {
			_localctx = new UnknownAtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			match(AtKeyword);
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 6924862761726910627L) != 0)) {
				{
				{
				setState(1139);
				any_();
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				setState(1145);
				block();
				}
				break;
			case SemiColon:
				{
				setState(1146);
				match(SemiColon);
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
	public static class UnusedContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AtKeyword() { return getToken(JinjaFlaskParser.AtKeyword, 0); }
		public TerminalNode SemiColon() { return getToken(JinjaFlaskParser.SemiColon, 0); }
		public TerminalNode Cdo() { return getToken(JinjaFlaskParser.Cdo, 0); }
		public TerminalNode Cdc() { return getToken(JinjaFlaskParser.Cdc, 0); }
		public UnusedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unused; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterUnused(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitUnused(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitUnused(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnusedContext unused() throws RecognitionException {
		UnusedContext _localctx = new UnusedContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_unused);
		try {
			setState(1154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				block();
				}
				break;
			case AtKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				match(AtKeyword);
				}
				break;
			case SemiColon:
				enterOuterAlt(_localctx, 3);
				{
				setState(1151);
				match(SemiColon);
				}
				break;
			case Cdo:
				enterOuterAlt(_localctx, 4);
				{
				setState(1152);
				match(Cdo);
				}
				break;
			case Cdc:
				enterOuterAlt(_localctx, 5);
				{
				setState(1153);
				match(Cdc);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public List<DeclarationListContext> declarationList() {
			return getRuleContexts(DeclarationListContext.class);
		}
		public DeclarationListContext declarationList(int i) {
			return getRuleContext(DeclarationListContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> AtKeyword() { return getTokens(JinjaFlaskParser.AtKeyword); }
		public TerminalNode AtKeyword(int i) {
			return getToken(JinjaFlaskParser.AtKeyword, i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(JinjaFlaskParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JinjaFlaskParser.SemiColon, i);
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
		enterRule(_localctx, 186, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			match(OpenBrace);
			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7917204991949335203L) != 0)) {
				{
				setState(1163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1157);
					declarationList();
					}
					break;
				case 2:
					{
					setState(1158);
					nestedStatement();
					}
					break;
				case 3:
					{
					setState(1159);
					any_();
					}
					break;
				case 4:
					{
					setState(1160);
					block();
					}
					break;
				case 5:
					{
					setState(1161);
					match(AtKeyword);
					}
					break;
				case 6:
					{
					setState(1162);
					match(SemiColon);
					}
					break;
				}
				}
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1168);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedStatementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public FontFaceRuleContext fontFaceRule() {
			return getRuleContext(FontFaceRuleContext.class,0);
		}
		public KeyframesRuleContext keyframesRule() {
			return getRuleContext(KeyframesRuleContext.class,0);
		}
		public SupportsRuleContext supportsRule() {
			return getRuleContext(SupportsRuleContext.class,0);
		}
		public ViewportContext viewport() {
			return getRuleContext(ViewportContext.class,0);
		}
		public CounterStyleContext counterStyle() {
			return getRuleContext(CounterStyleContext.class,0);
		}
		public FontFeatureValuesRuleContext fontFeatureValuesRule() {
			return getRuleContext(FontFeatureValuesRuleContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public NestedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterNestedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitNestedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitNestedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedStatementContext nestedStatement() throws RecognitionException {
		NestedStatementContext _localctx = new NestedStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_nestedStatement);
		try {
			setState(1180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
			case Minus:
			case OpenBracket:
			case OpenParen:
			case OpenBrace:
			case Colon:
			case Dot:
			case Multiply:
			case Pipe:
			case Url:
			case Includes:
			case DashMatch:
			case Hash:
			case Percentage:
			case Url_:
			case UnicodeRange:
			case MediaOnly:
			case Not:
			case And:
			case Dimension:
			case UnknownDimension:
			case PseudoNot:
			case Number:
			case String_:
			case Or:
			case From:
			case To:
			case Ident:
			case Function_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1170);
				ruleset();
				}
				break;
			case Media:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171);
				media();
				}
				break;
			case Page:
				enterOuterAlt(_localctx, 3);
				{
				setState(1172);
				page();
				}
				break;
			case FontFace:
				enterOuterAlt(_localctx, 4);
				{
				setState(1173);
				fontFaceRule();
				}
				break;
			case Keyframes:
				enterOuterAlt(_localctx, 5);
				{
				setState(1174);
				keyframesRule();
				}
				break;
			case Supports:
				enterOuterAlt(_localctx, 6);
				{
				setState(1175);
				supportsRule();
				}
				break;
			case Viewport:
				enterOuterAlt(_localctx, 7);
				{
				setState(1176);
				viewport();
				}
				break;
			case CounterStyle:
				enterOuterAlt(_localctx, 8);
				{
				setState(1177);
				counterStyle();
				}
				break;
			case FontFeatureValues:
				enterOuterAlt(_localctx, 9);
				{
				setState(1178);
				fontFeatureValuesRule();
				}
				break;
			case AtKeyword:
				enterOuterAlt(_localctx, 10);
				{
				setState(1179);
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
	public static class GroupRuleBodyContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public GroupRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupRuleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterGroupRuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitGroupRuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitGroupRuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupRuleBodyContext groupRuleBody() throws RecognitionException {
		GroupRuleBodyContext _localctx = new GroupRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_groupRuleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(OpenBrace);
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7340744239645647523L) != 0)) {
				{
				{
				setState(1183);
				nestedStatement();
				}
				}
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1189);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsRuleContext extends ParserRuleContext {
		public TerminalNode Supports() { return getToken(JinjaFlaskParser.Supports, 0); }
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public SupportsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSupportsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSupportsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSupportsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsRuleContext supportsRule() throws RecognitionException {
		SupportsRuleContext _localctx = new SupportsRuleContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_supportsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(Supports);
			setState(1192);
			supportsCondition();
			setState(1193);
			groupRuleBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsConditionContext extends ParserRuleContext {
		public SupportsNegationContext supportsNegation() {
			return getRuleContext(SupportsNegationContext.class,0);
		}
		public SupportsConjunctionContext supportsConjunction() {
			return getRuleContext(SupportsConjunctionContext.class,0);
		}
		public SupportsDisjunctionContext supportsDisjunction() {
			return getRuleContext(SupportsDisjunctionContext.class,0);
		}
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSupportsCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSupportsCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSupportsCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConditionContext supportsCondition() throws RecognitionException {
		SupportsConditionContext _localctx = new SupportsConditionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_supportsCondition);
		try {
			setState(1199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1195);
				supportsNegation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				supportsConjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
				supportsDisjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1198);
				supportsConditionInParens();
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
	public static class SupportsConditionInParensContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(JinjaFlaskParser.OpenParen, 0); }
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public SupportsDeclarationConditionContext supportsDeclarationCondition() {
			return getRuleContext(SupportsDeclarationConditionContext.class,0);
		}
		public GeneralEnclosedContext generalEnclosed() {
			return getRuleContext(GeneralEnclosedContext.class,0);
		}
		public SupportsConditionInParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConditionInParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSupportsConditionInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSupportsConditionInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSupportsConditionInParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConditionInParensContext supportsConditionInParens() throws RecognitionException {
		SupportsConditionInParensContext _localctx = new SupportsConditionInParensContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_supportsConditionInParens);
		try {
			setState(1207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				match(OpenParen);
				setState(1202);
				supportsCondition();
				setState(1203);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1205);
				supportsDeclarationCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1206);
				generalEnclosed();
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
	public static class SupportsNegationContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(JinjaFlaskParser.Not, 0); }
		public TerminalNode Space() { return getToken(JinjaFlaskParser.Space, 0); }
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSupportsNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSupportsNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSupportsNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsNegationContext supportsNegation() throws RecognitionException {
		SupportsNegationContext _localctx = new SupportsNegationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_supportsNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			match(Not);
			setState(1210);
			match(Space);
			setState(1211);
			supportsConditionInParens();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsConjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(JinjaFlaskParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(JinjaFlaskParser.Space, i);
		}
		public List<TerminalNode> And() { return getTokens(JinjaFlaskParser.And); }
		public TerminalNode And(int i) {
			return getToken(JinjaFlaskParser.And, i);
		}
		public SupportsConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSupportsConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSupportsConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSupportsConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConjunctionContext supportsConjunction() throws RecognitionException {
		SupportsConjunctionContext _localctx = new SupportsConjunctionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_supportsConjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			supportsConditionInParens();
			setState(1218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1214);
				match(Space);
				setState(1215);
				match(And);
				setState(1216);
				match(Space);
				setState(1217);
				supportsConditionInParens();
				}
				}
				setState(1220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Space );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsDisjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(JinjaFlaskParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(JinjaFlaskParser.Space, i);
		}
		public List<TerminalNode> Or() { return getTokens(JinjaFlaskParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(JinjaFlaskParser.Or, i);
		}
		public SupportsDisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDisjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSupportsDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSupportsDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSupportsDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsDisjunctionContext supportsDisjunction() throws RecognitionException {
		SupportsDisjunctionContext _localctx = new SupportsDisjunctionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_supportsDisjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			supportsConditionInParens();
			setState(1227); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1223);
				match(Space);
				setState(1224);
				match(Or);
				setState(1225);
				match(Space);
				setState(1226);
				supportsConditionInParens();
				}
				}
				setState(1229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Space );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsDeclarationConditionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(JinjaFlaskParser.OpenParen, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public SupportsDeclarationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDeclarationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSupportsDeclarationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSupportsDeclarationCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSupportsDeclarationCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsDeclarationConditionContext supportsDeclarationCondition() throws RecognitionException {
		SupportsDeclarationConditionContext _localctx = new SupportsDeclarationConditionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_supportsDeclarationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(OpenParen);
			setState(1232);
			declaration();
			setState(1233);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GeneralEnclosedContext extends ParserRuleContext {
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public TerminalNode Function_() { return getToken(JinjaFlaskParser.Function_, 0); }
		public TerminalNode OpenParen() { return getToken(JinjaFlaskParser.OpenParen, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public GeneralEnclosedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalEnclosed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterGeneralEnclosed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitGeneralEnclosed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitGeneralEnclosed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralEnclosedContext generalEnclosed() throws RecognitionException {
		GeneralEnclosedContext _localctx = new GeneralEnclosedContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_generalEnclosed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			_la = _input.LA(1);
			if ( !(_la==OpenParen || _la==Function_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7213093137891207843L) != 0)) {
				{
				setState(1238);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
				case Minus:
				case OpenBracket:
				case OpenParen:
				case Colon:
				case Url:
				case Includes:
				case DashMatch:
				case Hash:
				case Percentage:
				case Url_:
				case UnicodeRange:
				case MediaOnly:
				case Not:
				case And:
				case Dimension:
				case UnknownDimension:
				case Number:
				case String_:
				case Or:
				case From:
				case To:
				case Ident:
				case Function_:
					{
					setState(1236);
					any_();
					}
					break;
				case OpenBrace:
				case SemiColon:
				case Cdo:
				case Cdc:
				case AtKeyword:
					{
					setState(1237);
					unused();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1243);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode Url_() { return getToken(JinjaFlaskParser.Url_, 0); }
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public TerminalNode Url() { return getToken(JinjaFlaskParser.Url, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_url);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Url_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				match(Url_);
				setState(1246);
				match(String_);
				setState(1247);
				match(CloseParen);
				}
				break;
			case Url:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(Url);
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
	public static class Var_Context extends ParserRuleContext {
		public TerminalNode Var() { return getToken(JinjaFlaskParser.Var, 0); }
		public TerminalNode Variable() { return getToken(JinjaFlaskParser.Variable, 0); }
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public Var_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterVar_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitVar_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitVar_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_Context var_() throws RecognitionException {
		Var_Context _localctx = new Var_Context(_ctx, getState());
		enterRule(_localctx, 210, RULE_var_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			match(Var);
			setState(1252);
			match(Variable);
			setState(1253);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcContext extends ParserRuleContext {
		public TerminalNode Calc() { return getToken(JinjaFlaskParser.Calc, 0); }
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(Calc);
			setState(1256);
			calcSum();
			setState(1257);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcSumContext extends ParserRuleContext {
		public List<CalcProductContext> calcProduct() {
			return getRuleContexts(CalcProductContext.class);
		}
		public CalcProductContext calcProduct(int i) {
			return getRuleContext(CalcProductContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(JinjaFlaskParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(JinjaFlaskParser.Space, i);
		}
		public List<TerminalNode> Plus() { return getTokens(JinjaFlaskParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(JinjaFlaskParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(JinjaFlaskParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(JinjaFlaskParser.Minus, i);
		}
		public CalcSumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcSum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCalcSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCalcSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCalcSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcSumContext calcSum() throws RecognitionException {
		CalcSumContext _localctx = new CalcSumContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_calcSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			calcProduct();
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(1260);
				match(Space);
				setState(1261);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1262);
				match(Space);
				setState(1263);
				calcProduct();
				}
				}
				setState(1268);
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
	public static class CalcProductContext extends ParserRuleContext {
		public List<CalcValueContext> calcValue() {
			return getRuleContexts(CalcValueContext.class);
		}
		public CalcValueContext calcValue(int i) {
			return getRuleContext(CalcValueContext.class,i);
		}
		public List<TerminalNode> Multiply() { return getTokens(JinjaFlaskParser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(JinjaFlaskParser.Multiply, i);
		}
		public List<TerminalNode> Divide() { return getTokens(JinjaFlaskParser.Divide); }
		public TerminalNode Divide(int i) {
			return getToken(JinjaFlaskParser.Divide, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public CalcProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCalcProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCalcProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCalcProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcProductContext calcProduct() throws RecognitionException {
		CalcProductContext _localctx = new CalcProductContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_calcProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			calcValue();
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Multiply || _la==Divide) {
				{
				setState(1274);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
					{
					setState(1270);
					match(Multiply);
					setState(1271);
					calcValue();
					}
					break;
				case Divide:
					{
					setState(1272);
					match(Divide);
					setState(1273);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1278);
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
	public static class CalcValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(JinjaFlaskParser.OpenParen, 0); }
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(JinjaFlaskParser.CloseParen, 0); }
		public CalcValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCalcValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCalcValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCalcValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcValueContext calcValue() throws RecognitionException {
		CalcValueContext _localctx = new CalcValueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_calcValue);
		try {
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1279);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1280);
				dimension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1281);
				unknownDimension();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1282);
				percentage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1283);
				match(OpenParen);
				setState(1284);
				calcSum();
				setState(1285);
				match(CloseParen);
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
	public static class FontFaceRuleContext extends ParserRuleContext {
		public TerminalNode FontFace() { return getToken(JinjaFlaskParser.FontFace, 0); }
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public List<FontFaceDeclarationContext> fontFaceDeclaration() {
			return getRuleContexts(FontFaceDeclarationContext.class);
		}
		public FontFaceDeclarationContext fontFaceDeclaration(int i) {
			return getRuleContext(FontFaceDeclarationContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(JinjaFlaskParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JinjaFlaskParser.SemiColon, i);
		}
		public FontFaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFontFaceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFontFaceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFontFaceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceRuleContext fontFaceRule() throws RecognitionException {
		FontFaceRuleContext _localctx = new FontFaceRuleContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_fontFaceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(FontFace);
			setState(1290);
			match(OpenBrace);
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 88184283201545L) != 0)) {
				{
				setState(1291);
				fontFaceDeclaration();
				}
			}

			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(1294);
				match(SemiColon);
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 88184283201545L) != 0)) {
					{
					setState(1295);
					fontFaceDeclaration();
					}
				}

				}
				}
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1303);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFaceDeclarationContext extends ParserRuleContext {
		public FontFaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceDeclaration; }
	 
		public FontFaceDeclarationContext() { }
		public void copyFrom(FontFaceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(JinjaFlaskParser.Colon, 0); }
		public Css_exprContext css_expr() {
			return getRuleContext(Css_exprContext.class,0);
		}
		public KnownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterKnownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitKnownFontFaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitKnownFontFaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode Colon() { return getToken(JinjaFlaskParser.Colon, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterUnknownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitUnknownFontFaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitUnknownFontFaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceDeclarationContext fontFaceDeclaration() throws RecognitionException {
		FontFaceDeclarationContext _localctx = new FontFaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_fontFaceDeclaration);
		try {
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				_localctx = new KnownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				property_();
				setState(1306);
				match(Colon);
				setState(1307);
				css_expr();
				}
				break;
			case 2:
				_localctx = new UnknownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
				property_();
				setState(1310);
				match(Colon);
				setState(1311);
				value();
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
	public static class KeyframesRuleContext extends ParserRuleContext {
		public TerminalNode Keyframes() { return getToken(JinjaFlaskParser.Keyframes, 0); }
		public TerminalNode Space() { return getToken(JinjaFlaskParser.Space, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public List<KeyframeBlockContext> keyframeBlock() {
			return getRuleContexts(KeyframeBlockContext.class);
		}
		public KeyframeBlockContext keyframeBlock(int i) {
			return getRuleContext(KeyframeBlockContext.class,i);
		}
		public KeyframesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterKeyframesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitKeyframesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitKeyframesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframesRuleContext keyframesRule() throws RecognitionException {
		KeyframesRuleContext _localctx = new KeyframesRuleContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_keyframesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(Keyframes);
			setState(1316);
			match(Space);
			setState(1317);
			ident();
			setState(1318);
			match(OpenBrace);
			setState(1322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 786433L) != 0)) {
				{
				{
				setState(1319);
				keyframeBlock();
				}
				}
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1325);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
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
		enterRule(_localctx, 226, RULE_keyframeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1327);
			keyframeSelector();
			setState(1328);
			match(OpenBrace);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 1410948531224721L) != 0)) {
				{
				setState(1329);
				declarationList();
				}
			}

			setState(1332);
			match(CloseBrace);
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
	public static class KeyframeSelectorContext extends ParserRuleContext {
		public List<TerminalNode> From() { return getTokens(JinjaFlaskParser.From); }
		public TerminalNode From(int i) {
			return getToken(JinjaFlaskParser.From, i);
		}
		public List<TerminalNode> To() { return getTokens(JinjaFlaskParser.To); }
		public TerminalNode To(int i) {
			return getToken(JinjaFlaskParser.To, i);
		}
		public List<TerminalNode> Percentage() { return getTokens(JinjaFlaskParser.Percentage); }
		public TerminalNode Percentage(int i) {
			return getToken(JinjaFlaskParser.Percentage, i);
		}
		public List<TerminalNode> Comma() { return getTokens(JinjaFlaskParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JinjaFlaskParser.Comma, i);
		}
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
		enterRule(_localctx, 228, RULE_keyframeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			_la = _input.LA(1);
			if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 786433L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1335);
				match(Comma);
				setState(1336);
				_la = _input.LA(1);
				if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 786433L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1341);
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
	public static class ViewportContext extends ParserRuleContext {
		public TerminalNode Viewport() { return getToken(JinjaFlaskParser.Viewport, 0); }
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public ViewportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterViewport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitViewport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitViewport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportContext viewport() throws RecognitionException {
		ViewportContext _localctx = new ViewportContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_viewport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(Viewport);
			setState(1343);
			match(OpenBrace);
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 1410948531224721L) != 0)) {
				{
				setState(1344);
				declarationList();
				}
			}

			setState(1347);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CounterStyleContext extends ParserRuleContext {
		public TerminalNode CounterStyle() { return getToken(JinjaFlaskParser.CounterStyle, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public CounterStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_counterStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCounterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCounterStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCounterStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CounterStyleContext counterStyle() throws RecognitionException {
		CounterStyleContext _localctx = new CounterStyleContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_counterStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(CounterStyle);
			setState(1350);
			ident();
			setState(1351);
			match(OpenBrace);
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 1410948531224721L) != 0)) {
				{
				setState(1352);
				declarationList();
				}
			}

			setState(1355);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFeatureValuesRuleContext extends ParserRuleContext {
		public TerminalNode FontFeatureValues() { return getToken(JinjaFlaskParser.FontFeatureValues, 0); }
		public FontFamilyNameListContext fontFamilyNameList() {
			return getRuleContext(FontFamilyNameListContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public List<FeatureValueBlockContext> featureValueBlock() {
			return getRuleContexts(FeatureValueBlockContext.class);
		}
		public FeatureValueBlockContext featureValueBlock(int i) {
			return getRuleContext(FeatureValueBlockContext.class,i);
		}
		public FontFeatureValuesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFeatureValuesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFontFeatureValuesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFontFeatureValuesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFontFeatureValuesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFeatureValuesRuleContext fontFeatureValuesRule() throws RecognitionException {
		FontFeatureValuesRuleContext _localctx = new FontFeatureValuesRuleContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_fontFeatureValuesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			match(FontFeatureValues);
			setState(1358);
			fontFamilyNameList();
			setState(1359);
			match(OpenBrace);
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtKeyword) {
				{
				{
				setState(1360);
				featureValueBlock();
				}
				}
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1366);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyNameListContext extends ParserRuleContext {
		public List<FontFamilyNameContext> fontFamilyName() {
			return getRuleContexts(FontFamilyNameContext.class);
		}
		public FontFamilyNameContext fontFamilyName(int i) {
			return getRuleContext(FontFamilyNameContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JinjaFlaskParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JinjaFlaskParser.Comma, i);
		}
		public FontFamilyNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFontFamilyNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFontFamilyNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFontFamilyNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyNameListContext fontFamilyNameList() throws RecognitionException {
		FontFamilyNameListContext _localctx = new FontFamilyNameListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_fontFamilyNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			fontFamilyName();
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1369);
				match(Comma);
				setState(1370);
				fontFamilyName();
				}
				}
				setState(1375);
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
	public static class FontFamilyNameContext extends ParserRuleContext {
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public FontFamilyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFontFamilyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFontFamilyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFontFamilyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyNameContext fontFamilyName() throws RecognitionException {
		FontFamilyNameContext _localctx = new FontFamilyNameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_fontFamilyName);
		int _la;
		try {
			setState(1384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				match(String_);
				}
				break;
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				ident();
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 33660935L) != 0)) {
					{
					{
					setState(1378);
					ident();
					}
					}
					setState(1383);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class FeatureValueBlockContext extends ParserRuleContext {
		public FeatureTypeContext featureType() {
			return getRuleContext(FeatureTypeContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(JinjaFlaskParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaFlaskParser.CloseBrace, 0); }
		public List<FeatureValueDefinitionContext> featureValueDefinition() {
			return getRuleContexts(FeatureValueDefinitionContext.class);
		}
		public FeatureValueDefinitionContext featureValueDefinition(int i) {
			return getRuleContext(FeatureValueDefinitionContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(JinjaFlaskParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JinjaFlaskParser.SemiColon, i);
		}
		public FeatureValueBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFeatureValueBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFeatureValueBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFeatureValueBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureValueBlockContext featureValueBlock() throws RecognitionException {
		FeatureValueBlockContext _localctx = new FeatureValueBlockContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_featureValueBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			featureType();
			setState(1387);
			match(OpenBrace);
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 33660935L) != 0)) {
				{
				setState(1388);
				featureValueDefinition();
				}
			}

			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(1391);
				match(SemiColon);
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 33660935L) != 0)) {
					{
					setState(1392);
					featureValueDefinition();
					}
				}

				}
				}
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1400);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureTypeContext extends ParserRuleContext {
		public TerminalNode AtKeyword() { return getToken(JinjaFlaskParser.AtKeyword, 0); }
		public FeatureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFeatureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFeatureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFeatureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureTypeContext featureType() throws RecognitionException {
		FeatureTypeContext _localctx = new FeatureTypeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_featureType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(AtKeyword);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureValueDefinitionContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode Colon() { return getToken(JinjaFlaskParser.Colon, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public FeatureValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFeatureValueDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFeatureValueDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFeatureValueDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureValueDefinitionContext featureValueDefinition() throws RecognitionException {
		FeatureValueDefinitionContext _localctx = new FeatureValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_featureValueDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			ident();
			setState(1405);
			match(Colon);
			setState(1406);
			number();
			setState(1410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4398046511107L) != 0)) {
				{
				{
				setState(1407);
				number();
				}
				}
				setState(1412);
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
	public static class IdentContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(JinjaFlaskParser.Ident, 0); }
		public TerminalNode MediaOnly() { return getToken(JinjaFlaskParser.MediaOnly, 0); }
		public TerminalNode Not() { return getToken(JinjaFlaskParser.Not, 0); }
		public TerminalNode And() { return getToken(JinjaFlaskParser.And, 0); }
		public TerminalNode Or() { return getToken(JinjaFlaskParser.Or, 0); }
		public TerminalNode From() { return getToken(JinjaFlaskParser.From, 0); }
		public TerminalNode To() { return getToken(JinjaFlaskParser.To, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 33660935L) != 0)) ) {
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
	public static class Jinja_partContext extends ParserRuleContext {
		public Jinja_outputContext jinja_output() {
			return getRuleContext(Jinja_outputContext.class,0);
		}
		public Jinja_statementContext jinja_statement() {
			return getRuleContext(Jinja_statementContext.class,0);
		}
		public Jinja_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_partContext jinja_part() throws RecognitionException {
		Jinja_partContext _localctx = new Jinja_partContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_jinja_part);
		try {
			setState(1417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(1415);
				jinja_output();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(1416);
				jinja_statement();
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
		public TerminalNode JINJA_EXPR_START() { return getToken(JinjaFlaskParser.JINJA_EXPR_START, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(JinjaFlaskParser.JINJA_EXPR_END, 0); }
		public Jinja_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_outputContext jinja_output() throws RecognitionException {
		Jinja_outputContext _localctx = new Jinja_outputContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_jinja_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			match(JINJA_EXPR_START);
			setState(1420);
			jinja_expr();
			setState(1421);
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
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_statementContext jinja_statement() throws RecognitionException {
		Jinja_statementContext _localctx = new Jinja_statementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_jinja_statement);
		try {
			setState(1427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1423);
				jinja_ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1424);
				jinja_forStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1425);
				jinja_setStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1426);
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
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(JinjaFlaskParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_START, i);
		}
		public TerminalNode IF() { return getToken(JinjaFlaskParser.IF, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
		}
		public TerminalNode J_ENDIF() { return getToken(JinjaFlaskParser.J_ENDIF, 0); }
		public List<Jinja_partContext> jinja_part() {
			return getRuleContexts(Jinja_partContext.class);
		}
		public Jinja_partContext jinja_part(int i) {
			return getRuleContext(Jinja_partContext.class,i);
		}
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
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_ifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_ifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_ifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_ifStatementContext jinja_ifStatement() throws RecognitionException {
		Jinja_ifStatementContext _localctx = new Jinja_ifStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_jinja_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(JINJA_STMT_START);
			setState(1430);
			match(IF);
			setState(1431);
			jinja_expr();
			setState(1432);
			match(JINJA_STMT_END);
			setState(1436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1433);
					jinja_part();
					}
					} 
				}
				setState(1438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			setState(1442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1439);
					jinja_elifBlock();
					}
					} 
				}
				setState(1444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1445);
				jinja_elseBlock();
				}
				break;
			}
			setState(1448);
			match(JINJA_STMT_START);
			setState(1449);
			match(J_ENDIF);
			setState(1450);
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
	public static class Jinja_elifBlockContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public TerminalNode ELIF() { return getToken(JinjaFlaskParser.ELIF, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaFlaskParser.JINJA_STMT_END, 0); }
		public List<Jinja_partContext> jinja_part() {
			return getRuleContexts(Jinja_partContext.class);
		}
		public Jinja_partContext jinja_part(int i) {
			return getRuleContext(Jinja_partContext.class,i);
		}
		public Jinja_elifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_elifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_elifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_elifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_elifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_elifBlockContext jinja_elifBlock() throws RecognitionException {
		Jinja_elifBlockContext _localctx = new Jinja_elifBlockContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_jinja_elifBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(JINJA_STMT_START);
			setState(1453);
			match(ELIF);
			setState(1454);
			jinja_expr();
			setState(1455);
			match(JINJA_STMT_END);
			setState(1459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1456);
					jinja_part();
					}
					} 
				}
				setState(1461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
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
	public static class Jinja_elseBlockContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public TerminalNode ELSE() { return getToken(JinjaFlaskParser.ELSE, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaFlaskParser.JINJA_STMT_END, 0); }
		public List<Jinja_partContext> jinja_part() {
			return getRuleContexts(Jinja_partContext.class);
		}
		public Jinja_partContext jinja_part(int i) {
			return getRuleContext(Jinja_partContext.class,i);
		}
		public Jinja_elseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_elseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_elseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_elseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_elseBlockContext jinja_elseBlock() throws RecognitionException {
		Jinja_elseBlockContext _localctx = new Jinja_elseBlockContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_jinja_elseBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(JINJA_STMT_START);
			setState(1463);
			match(ELSE);
			setState(1464);
			match(JINJA_STMT_END);
			setState(1468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1465);
					jinja_part();
					}
					} 
				}
				setState(1470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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
	public static class Jinja_forStatementContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(JinjaFlaskParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_START, i);
		}
		public TerminalNode FOR() { return getToken(JinjaFlaskParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode IN() { return getToken(JinjaFlaskParser.IN, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
		}
		public TerminalNode J_ENDFOR() { return getToken(JinjaFlaskParser.J_ENDFOR, 0); }
		public List<Jinja_partContext> jinja_part() {
			return getRuleContexts(Jinja_partContext.class);
		}
		public Jinja_partContext jinja_part(int i) {
			return getRuleContext(Jinja_partContext.class,i);
		}
		public Jinja_forStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_forStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_forStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_forStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_forStatementContext jinja_forStatement() throws RecognitionException {
		Jinja_forStatementContext _localctx = new Jinja_forStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_jinja_forStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			match(JINJA_STMT_START);
			setState(1472);
			match(FOR);
			setState(1473);
			match(NAME);
			setState(1474);
			match(IN);
			setState(1475);
			jinja_expr();
			setState(1476);
			match(JINJA_STMT_END);
			setState(1480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1477);
					jinja_part();
					}
					} 
				}
				setState(1482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			setState(1483);
			match(JINJA_STMT_START);
			setState(1484);
			match(J_ENDFOR);
			setState(1485);
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
	public static class Jinja_setStatementContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(JinjaFlaskParser.JINJA_STMT_START, 0); }
		public TerminalNode J_SET() { return getToken(JinjaFlaskParser.J_SET, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(JinjaFlaskParser.ASSIGN, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode JINJA_STMT_END() { return getToken(JinjaFlaskParser.JINJA_STMT_END, 0); }
		public Jinja_setStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_setStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_setStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_setStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_setStatementContext jinja_setStatement() throws RecognitionException {
		Jinja_setStatementContext _localctx = new Jinja_setStatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_jinja_setStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			match(JINJA_STMT_START);
			setState(1488);
			match(J_SET);
			setState(1489);
			match(NAME);
			setState(1490);
			match(ASSIGN);
			setState(1491);
			jinja_expr();
			setState(1492);
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
	public static class Jinja_rawStatementContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(JinjaFlaskParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_START, i);
		}
		public TerminalNode J_RAW() { return getToken(JinjaFlaskParser.J_RAW, 0); }
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
		}
		public Jinja_rawTextContext jinja_rawText() {
			return getRuleContext(Jinja_rawTextContext.class,0);
		}
		public TerminalNode J_ENDRAW() { return getToken(JinjaFlaskParser.J_ENDRAW, 0); }
		public Jinja_rawStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_rawStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_rawStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_rawStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_rawStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_rawStatementContext jinja_rawStatement() throws RecognitionException {
		Jinja_rawStatementContext _localctx = new Jinja_rawStatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_jinja_rawStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(JINJA_STMT_START);
			setState(1495);
			match(J_RAW);
			setState(1496);
			match(JINJA_STMT_END);
			setState(1497);
			jinja_rawText();
			setState(1498);
			match(JINJA_STMT_START);
			setState(1499);
			match(J_ENDRAW);
			setState(1500);
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
	public static class Jinja_rawTextContext extends ParserRuleContext {
		public List<TerminalNode> J_RAW() { return getTokens(JinjaFlaskParser.J_RAW); }
		public TerminalNode J_RAW(int i) {
			return getToken(JinjaFlaskParser.J_RAW, i);
		}
		public Jinja_rawTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_rawText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_rawText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_rawText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_rawText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_rawTextContext jinja_rawText() throws RecognitionException {
		Jinja_rawTextContext _localctx = new Jinja_rawTextContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_jinja_rawText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1502);
				match(J_RAW);
				}
				}
				setState(1505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==J_RAW );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_exprContext jinja_expr() throws RecognitionException {
		Jinja_exprContext _localctx = new Jinja_exprContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_jinja_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
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
		public List<TerminalNode> OR() { return getTokens(JinjaFlaskParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JinjaFlaskParser.OR, i);
		}
		public Jinja_logicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_logicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_logicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_logicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_logicalOrContext jinja_logicalOr() throws RecognitionException {
		Jinja_logicalOrContext _localctx = new Jinja_logicalOrContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_jinja_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			jinja_logicalAnd();
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1510);
				match(OR);
				setState(1511);
				jinja_logicalAnd();
				}
				}
				setState(1516);
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
		public List<TerminalNode> AND() { return getTokens(JinjaFlaskParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JinjaFlaskParser.AND, i);
		}
		public Jinja_logicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_logicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_logicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_logicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_logicalAndContext jinja_logicalAnd() throws RecognitionException {
		Jinja_logicalAndContext _localctx = new Jinja_logicalAndContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_jinja_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			jinja_equality();
			setState(1522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1518);
				match(AND);
				setState(1519);
				jinja_equality();
				}
				}
				setState(1524);
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
		public List<TerminalNode> EQ() { return getTokens(JinjaFlaskParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(JinjaFlaskParser.EQ, i);
		}
		public List<TerminalNode> J_NE() { return getTokens(JinjaFlaskParser.J_NE); }
		public TerminalNode J_NE(int i) {
			return getToken(JinjaFlaskParser.J_NE, i);
		}
		public Jinja_equalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_equality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_equality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_equality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_equalityContext jinja_equality() throws RecognitionException {
		Jinja_equalityContext _localctx = new Jinja_equalityContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_jinja_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			jinja_comparison();
			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==J_NE) {
				{
				{
				setState(1526);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==J_NE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1527);
				jinja_comparison();
				}
				}
				setState(1532);
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
		public List<TerminalNode> LT() { return getTokens(JinjaFlaskParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JinjaFlaskParser.LT, i);
		}
		public List<TerminalNode> J_LE() { return getTokens(JinjaFlaskParser.J_LE); }
		public TerminalNode J_LE(int i) {
			return getToken(JinjaFlaskParser.J_LE, i);
		}
		public List<TerminalNode> GT() { return getTokens(JinjaFlaskParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JinjaFlaskParser.GT, i);
		}
		public List<TerminalNode> J_GE() { return getTokens(JinjaFlaskParser.J_GE); }
		public TerminalNode J_GE(int i) {
			return getToken(JinjaFlaskParser.J_GE, i);
		}
		public Jinja_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_comparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_comparisonContext jinja_comparison() throws RecognitionException {
		Jinja_comparisonContext _localctx = new Jinja_comparisonContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_jinja_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			jinja_addition();
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GT || _la==LT || _la==J_LE || _la==J_GE) {
				{
				{
				setState(1534);
				_la = _input.LA(1);
				if ( !(_la==GT || _la==LT || _la==J_LE || _la==J_GE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1535);
				jinja_addition();
				}
				}
				setState(1540);
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
		public List<TerminalNode> PLUS() { return getTokens(JinjaFlaskParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JinjaFlaskParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JinjaFlaskParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JinjaFlaskParser.MINUS, i);
		}
		public Jinja_additionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_addition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_addition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_addition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_additionContext jinja_addition() throws RecognitionException {
		Jinja_additionContext _localctx = new Jinja_additionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_jinja_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			jinja_multiplication();
			setState(1546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(1542);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1543);
				jinja_multiplication();
				}
				}
				setState(1548);
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
		public Jinja_multiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_multiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_multiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_multiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_multiplicationContext jinja_multiplication() throws RecognitionException {
		Jinja_multiplicationContext _localctx = new Jinja_multiplicationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_jinja_multiplication);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			jinja_unary();
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 7L) != 0)) {
				{
				{
				setState(1550);
				_la = _input.LA(1);
				if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1551);
				jinja_unary();
				}
				}
				setState(1556);
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
		public TerminalNode PLUS() { return getToken(JinjaFlaskParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JinjaFlaskParser.MINUS, 0); }
		public Jinja_primaryContext jinja_primary() {
			return getRuleContext(Jinja_primaryContext.class,0);
		}
		public Jinja_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_unaryContext jinja_unary() throws RecognitionException {
		Jinja_unaryContext _localctx = new Jinja_unaryContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_jinja_unary);
		int _la;
		try {
			setState(1560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1558);
				jinja_unary();
				}
				break;
			case NAME:
			case NUMBER:
			case STRING:
			case J_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1559);
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
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_primaryContext jinja_primary() throws RecognitionException {
		Jinja_primaryContext _localctx = new Jinja_primaryContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_jinja_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			jinja_atom();
			setState(1566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT || _la==J_LPAREN) {
				{
				{
				setState(1563);
				jinja_trailer();
				}
				}
				setState(1568);
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
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(JinjaFlaskParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(JinjaFlaskParser.STRING, 0); }
		public TerminalNode J_LPAREN() { return getToken(JinjaFlaskParser.J_LPAREN, 0); }
		public Jinja_exprContext jinja_expr() {
			return getRuleContext(Jinja_exprContext.class,0);
		}
		public TerminalNode J_RPAREN() { return getToken(JinjaFlaskParser.J_RPAREN, 0); }
		public Jinja_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_atomContext jinja_atom() throws RecognitionException {
		Jinja_atomContext _localctx = new Jinja_atomContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_jinja_atom);
		try {
			setState(1576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				match(NAME);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1571);
				match(STRING);
				}
				break;
			case J_LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1572);
				match(J_LPAREN);
				setState(1573);
				jinja_expr();
				setState(1574);
				match(J_RPAREN);
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
		public TerminalNode DOT() { return getToken(JinjaFlaskParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode LBRACK() { return getToken(JinjaFlaskParser.LBRACK, 0); }
		public List<Jinja_exprContext> jinja_expr() {
			return getRuleContexts(Jinja_exprContext.class);
		}
		public Jinja_exprContext jinja_expr(int i) {
			return getRuleContext(Jinja_exprContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(JinjaFlaskParser.RBRACK, 0); }
		public TerminalNode J_LPAREN() { return getToken(JinjaFlaskParser.J_LPAREN, 0); }
		public TerminalNode J_RPAREN() { return getToken(JinjaFlaskParser.J_RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public Jinja_trailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterJinja_trailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitJinja_trailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitJinja_trailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_trailerContext jinja_trailer() throws RecognitionException {
		Jinja_trailerContext _localctx = new Jinja_trailerContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_jinja_trailer);
		int _la;
		try {
			setState(1596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1578);
				match(DOT);
				setState(1579);
				match(NAME);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1580);
				match(LBRACK);
				setState(1581);
				jinja_expr();
				setState(1582);
				match(RBRACK);
				}
				break;
			case J_LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1584);
				match(J_LPAREN);
				setState(1593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3941061990809600L) != 0) || _la==J_LPAREN) {
					{
					setState(1585);
					jinja_expr();
					setState(1590);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1586);
						match(COMMA);
						setState(1587);
						jinja_expr();
						}
						}
						setState(1592);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1595);
				match(J_RPAREN);
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
		"\u0004\u0001\u00d2\u063f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0001\u0000\u0001\u0000\u0005\u0000\u0125"+
		"\b\u0000\n\u0000\f\u0000\u0128\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u012e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u0133\b\u0002\n\u0002\f\u0002\u0136\t\u0002\u0003\u0002\u0138"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0142\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0147\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u014d\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0157\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u015c"+
		"\b\u0007\n\u0007\f\u0007\u015f\t\u0007\u0001\b\u0001\b\u0003\b\u0163\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0169\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0170\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0175\b\u000b\n\u000b\f\u000b\u0178\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u017d\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u0182\b\r"+
		"\n\r\f\r\u0185\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u018b\b\u000e\n\u000e\f\u000e\u018e\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010\u0194\b\u0010\u000b\u0010\f\u0010"+
		"\u0195\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u019c"+
		"\b\u0011\u0001\u0011\u0003\u0011\u019f\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01a8\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01af\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u01b6\b\u0014\n\u0014\f\u0014\u01b9\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01c4\b\u0015\n\u0015\f\u0015"+
		"\u01c7\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01cc\b"+
		"\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u01d0\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u01d8"+
		"\b\u0018\u000b\u0018\f\u0018\u01d9\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u01de\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01e3\b"+
		"\u0019\n\u0019\f\u0019\u01e6\t\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u01ed\b\u001b\n\u001b\f\u001b\u01f0"+
		"\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01f5\b\u001c"+
		"\n\u001c\f\u001c\u01f8\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01fd\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0203\b\u001e\n\u001e\f\u001e\u0206\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0211\b\u001f\u0001 \u0001 \u0001 \u0005 \u0216"+
		"\b \n \f \u0219\t \u0001!\u0001!\u0001!\u0005!\u021e\b!\n!\f!\u0221\t"+
		"!\u0001\"\u0001\"\u0001\"\u0003\"\u0226\b\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0005$\u022c\b$\n$\f$\u022f\t$\u0001%\u0001%\u0003%\u0233\b%\u0001%"+
		"\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u023c\b%\u0001&\u0001"+
		"&\u0001&\u0004&\u0241\b&\u000b&\f&\u0242\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u024a\b&\u0001&\u0001&\u0001&\u0003&\u024f\b&\u0001&\u0001&\u0001"+
		"&\u0003&\u0254\b&\u0001&\u0003&\u0257\b&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u025f\b\'\n\'\f\'\u0262\t\'\u0003\'\u0264\b"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u026c\b(\n(\f(\u026f"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0279"+
		"\b)\n)\f)\u027c\t)\u0001*\u0001*\u0001*\u0005*\u0281\b*\n*\f*\u0284\t"+
		"*\u0001+\u0001+\u0001+\u0001+\u0003+\u028a\b+\u0001,\u0001,\u0005,\u028e"+
		"\b,\n,\f,\u0291\t,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0003,\u029e\b,\u0001-\u0001-\u0001-\u0003-\u02a3"+
		"\b-\u0001-\u0001-\u0001-\u0003-\u02a8\b-\u0001.\u0001.\u0005.\u02ac\b"+
		".\n.\f.\u02af\t.\u0005.\u02b1\b.\n.\f.\u02b4\t.\u0001.\u0001.\u0005.\u02b8"+
		"\b.\n.\f.\u02bb\t.\u0005.\u02bd\b.\n.\f.\u02c0\t.\u0001.\u0001.\u0005"+
		".\u02c4\b.\n.\f.\u02c7\t.\u0005.\u02c9\b.\n.\f.\u02cc\t.\u0001.\u0001"+
		".\u0005.\u02d0\b.\n.\f.\u02d3\t.\u0005.\u02d5\b.\n.\f.\u02d8\t.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02e1\b/\u00010\u0001"+
		"0\u00010\u00030\u02e6\b0\u00010\u00010\u00010\u00010\u00010\u00010\u0003"+
		"0\u02ee\b0\u00010\u00010\u00010\u00010\u00030\u02f4\b0\u00010\u00010\u0001"+
		"0\u00010\u00030\u02fa\b0\u00030\u02fc\b0\u00011\u00011\u00031\u0300\b"+
		"1\u00011\u00011\u00031\u0304\b1\u00011\u00011\u00011\u00031\u0309\b1\u0001"+
		"1\u00011\u00031\u030d\b1\u00031\u030f\b1\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00054\u031a\b4\n4\f4\u031d\t4\u00034\u031f"+
		"\b4\u00015\u00035\u0322\b5\u00015\u00015\u00015\u00055\u0327\b5\n5\f5"+
		"\u032a\t5\u00015\u00015\u00015\u00055\u032f\b5\n5\f5\u0332\t5\u00035\u0334"+
		"\b5\u00016\u00016\u00017\u00017\u00017\u00017\u00037\u033c\b7\u00017\u0001"+
		"7\u00018\u00018\u00019\u00019\u00039\u0344\b9\u00019\u00019\u00039\u0348"+
		"\b9\u00019\u00019\u00039\u034c\b9\u00059\u034e\b9\n9\f9\u0351\t9\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0005;\u035b\b;\n;"+
		"\f;\u035e\t;\u0001<\u0001<\u0001<\u0001<\u0005<\u0364\b<\n<\f<\u0367\t"+
		"<\u0001=\u0001=\u0001>\u0001>\u0003>\u036d\b>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0005>\u0374\b>\n>\f>\u0377\t>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0004>\u037e\b>\u000b>\f>\u037f\u0003>\u0382\b>\u0001?\u0003?\u0385"+
		"\b?\u0001?\u0001?\u0001@\u0001@\u0003@\u038b\b@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001B\u0003B\u0392\bB\u0001B\u0001B\u0001C\u0001C\u0001C\u0001D\u0001"+
		"D\u0003D\u039b\bD\u0001D\u0001D\u0001D\u0001D\u0003D\u03a1\bD\u0003D\u03a3"+
		"\bD\u0001D\u0001D\u0001E\u0001E\u0003E\u03a9\bE\u0001E\u0001E\u0003E\u03ad"+
		"\bE\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u03ba\bG\u0004G\u03bc\bG\u000bG\fG\u03bd\u0001H\u0001"+
		"H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u03ca"+
		"\bI\u0001J\u0001J\u0001J\u0001J\u0003J\u03d0\bJ\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0003K\u03d8\bK\u0001L\u0001L\u0001L\u0003L\u03dd\bL\u0001"+
		"L\u0001L\u0001L\u0005L\u03e2\bL\nL\fL\u03e5\tL\u0001L\u0001L\u0003L\u03e9"+
		"\bL\u0001L\u0003L\u03ec\bL\u0001M\u0005M\u03ef\bM\nM\fM\u03f2\tM\u0001"+
		"M\u0001M\u0001M\u0003M\u03f7\bM\u0005M\u03f9\bM\nM\fM\u03fc\tM\u0001N"+
		"\u0001N\u0001N\u0001N\u0003N\u0402\bN\u0001N\u0001N\u0001N\u0001N\u0003"+
		"N\u0408\bN\u0001O\u0001O\u0001P\u0001P\u0001P\u0004P\u040f\bP\u000bP\f"+
		"P\u0410\u0001Q\u0001Q\u0003Q\u0415\bQ\u0001Q\u0005Q\u0418\bQ\nQ\fQ\u041b"+
		"\tQ\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0003R\u042a\bR\u0001S\u0001S\u0001S\u0001S\u0001"+
		"T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001V\u0003V\u0437\bV\u0001V\u0001"+
		"V\u0001W\u0003W\u043c\bW\u0001W\u0001W\u0001X\u0003X\u0441\bX\u0001X\u0001"+
		"X\u0001Y\u0003Y\u0446\bY\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0005Z\u0459\bZ\nZ\fZ\u045c\tZ\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u0462"+
		"\bZ\nZ\fZ\u0465\tZ\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u046b\bZ\nZ\fZ\u046e"+
		"\tZ\u0001Z\u0003Z\u0471\bZ\u0001[\u0001[\u0005[\u0475\b[\n[\f[\u0478\t"+
		"[\u0001[\u0001[\u0003[\u047c\b[\u0001\\\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0003\\\u0483\b\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]"+
		"\u0005]\u048c\b]\n]\f]\u048f\t]\u0001]\u0001]\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u049d\b^\u0001_\u0001"+
		"_\u0005_\u04a1\b_\n_\f_\u04a4\t_\u0001_\u0001_\u0001`\u0001`\u0001`\u0001"+
		"`\u0001a\u0001a\u0001a\u0001a\u0003a\u04b0\ba\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0003b\u04b8\bb\u0001c\u0001c\u0001c\u0001c\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0004d\u04c3\bd\u000bd\fd\u04c4\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0004e\u04cc\be\u000be\fe\u04cd\u0001f\u0001f\u0001f\u0001"+
		"f\u0001g\u0001g\u0001g\u0005g\u04d7\bg\ng\fg\u04da\tg\u0001g\u0001g\u0001"+
		"h\u0001h\u0001h\u0001h\u0003h\u04e2\bh\u0001i\u0001i\u0001i\u0001i\u0001"+
		"j\u0001j\u0001j\u0001j\u0001k\u0001k\u0001k\u0001k\u0001k\u0005k\u04f1"+
		"\bk\nk\fk\u04f4\tk\u0001l\u0001l\u0001l\u0001l\u0001l\u0005l\u04fb\bl"+
		"\nl\fl\u04fe\tl\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001"+
		"m\u0003m\u0508\bm\u0001n\u0001n\u0001n\u0003n\u050d\bn\u0001n\u0001n\u0003"+
		"n\u0511\bn\u0005n\u0513\bn\nn\fn\u0516\tn\u0001n\u0001n\u0001o\u0001o"+
		"\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u0522\bo\u0001p\u0001"+
		"p\u0001p\u0001p\u0001p\u0005p\u0529\bp\np\fp\u052c\tp\u0001p\u0001p\u0001"+
		"q\u0001q\u0001q\u0003q\u0533\bq\u0001q\u0001q\u0001r\u0001r\u0001r\u0005"+
		"r\u053a\br\nr\fr\u053d\tr\u0001s\u0001s\u0001s\u0003s\u0542\bs\u0001s"+
		"\u0001s\u0001t\u0001t\u0001t\u0001t\u0003t\u054a\bt\u0001t\u0001t\u0001"+
		"u\u0001u\u0001u\u0001u\u0005u\u0552\bu\nu\fu\u0555\tu\u0001u\u0001u\u0001"+
		"v\u0001v\u0001v\u0005v\u055c\bv\nv\fv\u055f\tv\u0001w\u0001w\u0001w\u0005"+
		"w\u0564\bw\nw\fw\u0567\tw\u0003w\u0569\bw\u0001x\u0001x\u0001x\u0003x"+
		"\u056e\bx\u0001x\u0001x\u0003x\u0572\bx\u0005x\u0574\bx\nx\fx\u0577\t"+
		"x\u0001x\u0001x\u0001y\u0001y\u0001z\u0001z\u0001z\u0001z\u0005z\u0581"+
		"\bz\nz\fz\u0584\tz\u0001{\u0001{\u0001|\u0001|\u0003|\u058a\b|\u0001}"+
		"\u0001}\u0001}\u0001}\u0001~\u0001~\u0001~\u0001~\u0003~\u0594\b~\u0001"+
		"\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0005\u007f\u059b"+
		"\b\u007f\n\u007f\f\u007f\u059e\t\u007f\u0001\u007f\u0005\u007f\u05a1\b"+
		"\u007f\n\u007f\f\u007f\u05a4\t\u007f\u0001\u007f\u0003\u007f\u05a7\b\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080\u05b2\b\u0080\n\u0080"+
		"\f\u0080\u05b5\t\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0005\u0081\u05bb\b\u0081\n\u0081\f\u0081\u05be\t\u0081\u0001\u0082\u0001"+
		"\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0005"+
		"\u0082\u05c7\b\u0082\n\u0082\f\u0082\u05ca\t\u0082\u0001\u0082\u0001\u0082"+
		"\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083"+
		"\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0085"+
		"\u0004\u0085\u05e0\b\u0085\u000b\u0085\f\u0085\u05e1\u0001\u0086\u0001"+
		"\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0005\u0087\u05e9\b\u0087\n"+
		"\u0087\f\u0087\u05ec\t\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0005"+
		"\u0088\u05f1\b\u0088\n\u0088\f\u0088\u05f4\t\u0088\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0005\u0089\u05f9\b\u0089\n\u0089\f\u0089\u05fc\t\u0089\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0005\u008a\u0601\b\u008a\n\u008a\f\u008a"+
		"\u0604\t\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0005\u008b\u0609\b"+
		"\u008b\n\u008b\f\u008b\u060c\t\u008b\u0001\u008c\u0001\u008c\u0001\u008c"+
		"\u0005\u008c\u0611\b\u008c\n\u008c\f\u008c\u0614\t\u008c\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0003\u008d\u0619\b\u008d\u0001\u008e\u0001\u008e\u0005"+
		"\u008e\u061d\b\u008e\n\u008e\f\u008e\u0620\t\u008e\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003\u008f"+
		"\u0629\b\u008f\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0005\u0090"+
		"\u0635\b\u0090\n\u0090\f\u0090\u0638\t\u0090\u0003\u0090\u063a\b\u0090"+
		"\u0001\u0090\u0003\u0090\u063d\b\u0090\u0001\u0090\u0000\u0000\u0091\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0000\u000f\u0002\u0000\u0003\u0003"+
		"\u001c\u001c\u0001\u0000%&\u0001\u0000\')\u0001\u0000FG\u0002\u0000bb"+
		"df\u0001\u0000st\u0004\u0000OOQQSSdd\u0003\u0000[[gh{}\u0001\u0000OP\u0002"+
		"\u0000VV\u008d\u008d\u0002\u0000pp\u0082\u0083\u0004\u0000su\u0080\u0080"+
		"\u0082\u0083\u008c\u008c\u0002\u0000\u001f\u001f\u009b\u009b\u0003\u0000"+
		"!\"\u009c\u009c\u009e\u009e\u0001\u0000\u0096\u0098\u06cd\u0000\u0126"+
		"\u0001\u0000\u0000\u0000\u0002\u012d\u0001\u0000\u0000\u0000\u0004\u0137"+
		"\u0001\u0000\u0000\u0000\u0006\u0141\u0001\u0000\u0000\u0000\b\u0146\u0001"+
		"\u0000\u0000\u0000\n\u0148\u0001\u0000\u0000\u0000\f\u0156\u0001\u0000"+
		"\u0000\u0000\u000e\u015d\u0001\u0000\u0000\u0000\u0010\u0162\u0001\u0000"+
		"\u0000\u0000\u0012\u0164\u0001\u0000\u0000\u0000\u0014\u016a\u0001\u0000"+
		"\u0000\u0000\u0016\u0171\u0001\u0000\u0000\u0000\u0018\u0179\u0001\u0000"+
		"\u0000\u0000\u001a\u017e\u0001\u0000\u0000\u0000\u001c\u0186\u0001\u0000"+
		"\u0000\u0000\u001e\u018f\u0001\u0000\u0000\u0000 \u0193\u0001\u0000\u0000"+
		"\u0000\"\u0197\u0001\u0000\u0000\u0000$\u01a2\u0001\u0000\u0000\u0000"+
		"&\u01ac\u0001\u0000\u0000\u0000(\u01b2\u0001\u0000\u0000\u0000*\u01ba"+
		"\u0001\u0000\u0000\u0000,\u01cd\u0001\u0000\u0000\u0000.\u01d1\u0001\u0000"+
		"\u0000\u00000\u01dd\u0001\u0000\u0000\u00002\u01df\u0001\u0000\u0000\u0000"+
		"4\u01e7\u0001\u0000\u0000\u00006\u01e9\u0001\u0000\u0000\u00008\u01f1"+
		"\u0001\u0000\u0000\u0000:\u01fc\u0001\u0000\u0000\u0000<\u01fe\u0001\u0000"+
		"\u0000\u0000>\u0210\u0001\u0000\u0000\u0000@\u0212\u0001\u0000\u0000\u0000"+
		"B\u021a\u0001\u0000\u0000\u0000D\u0225\u0001\u0000\u0000\u0000F\u0227"+
		"\u0001\u0000\u0000\u0000H\u0229\u0001\u0000\u0000\u0000J\u023b\u0001\u0000"+
		"\u0000\u0000L\u0256\u0001\u0000\u0000\u0000N\u0263\u0001\u0000\u0000\u0000"+
		"P\u0265\u0001\u0000\u0000\u0000R\u0270\u0001\u0000\u0000\u0000T\u027d"+
		"\u0001\u0000\u0000\u0000V\u0289\u0001\u0000\u0000\u0000X\u029d\u0001\u0000"+
		"\u0000\u0000Z\u02a7\u0001\u0000\u0000\u0000\\\u02b2\u0001\u0000\u0000"+
		"\u0000^\u02e0\u0001\u0000\u0000\u0000`\u02fb\u0001\u0000\u0000\u0000b"+
		"\u030e\u0001\u0000\u0000\u0000d\u0310\u0001\u0000\u0000\u0000f\u0312\u0001"+
		"\u0000\u0000\u0000h\u031e\u0001\u0000\u0000\u0000j\u0333\u0001\u0000\u0000"+
		"\u0000l\u0335\u0001\u0000\u0000\u0000n\u0337\u0001\u0000\u0000\u0000p"+
		"\u033f\u0001\u0000\u0000\u0000r\u0341\u0001\u0000\u0000\u0000t\u0354\u0001"+
		"\u0000\u0000\u0000v\u0357\u0001\u0000\u0000\u0000x\u035f\u0001\u0000\u0000"+
		"\u0000z\u0368\u0001\u0000\u0000\u0000|\u0381\u0001\u0000\u0000\u0000~"+
		"\u0384\u0001\u0000\u0000\u0000\u0080\u038a\u0001\u0000\u0000\u0000\u0082"+
		"\u038e\u0001\u0000\u0000\u0000\u0084\u0391\u0001\u0000\u0000\u0000\u0086"+
		"\u0395\u0001\u0000\u0000\u0000\u0088\u0398\u0001\u0000\u0000\u0000\u008a"+
		"\u03a6\u0001\u0000\u0000\u0000\u008c\u03ae\u0001\u0000\u0000\u0000\u008e"+
		"\u03bb\u0001\u0000\u0000\u0000\u0090\u03bf\u0001\u0000\u0000\u0000\u0092"+
		"\u03c9\u0001\u0000\u0000\u0000\u0094\u03cf\u0001\u0000\u0000\u0000\u0096"+
		"\u03d7\u0001\u0000\u0000\u0000\u0098\u03eb\u0001\u0000\u0000\u0000\u009a"+
		"\u03f0\u0001\u0000\u0000\u0000\u009c\u0407\u0001\u0000\u0000\u0000\u009e"+
		"\u0409\u0001\u0000\u0000\u0000\u00a0\u040e\u0001\u0000\u0000\u0000\u00a2"+
		"\u0412\u0001\u0000\u0000\u0000\u00a4\u0429\u0001\u0000\u0000\u0000\u00a6"+
		"\u042b\u0001\u0000\u0000\u0000\u00a8\u042f\u0001\u0000\u0000\u0000\u00aa"+
		"\u0433\u0001\u0000\u0000\u0000\u00ac\u0436\u0001\u0000\u0000\u0000\u00ae"+
		"\u043b\u0001\u0000\u0000\u0000\u00b0\u0440\u0001\u0000\u0000\u0000\u00b2"+
		"\u0445\u0001\u0000\u0000\u0000\u00b4\u0470\u0001\u0000\u0000\u0000\u00b6"+
		"\u0472\u0001\u0000\u0000\u0000\u00b8\u0482\u0001\u0000\u0000\u0000\u00ba"+
		"\u0484\u0001\u0000\u0000\u0000\u00bc\u049c\u0001\u0000\u0000\u0000\u00be"+
		"\u049e\u0001\u0000\u0000\u0000\u00c0\u04a7\u0001\u0000\u0000\u0000\u00c2"+
		"\u04af\u0001\u0000\u0000\u0000\u00c4\u04b7\u0001\u0000\u0000\u0000\u00c6"+
		"\u04b9\u0001\u0000\u0000\u0000\u00c8\u04bd\u0001\u0000\u0000\u0000\u00ca"+
		"\u04c6\u0001\u0000\u0000\u0000\u00cc\u04cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u04d3\u0001\u0000\u0000\u0000\u00d0\u04e1\u0001\u0000\u0000\u0000\u00d2"+
		"\u04e3\u0001\u0000\u0000\u0000\u00d4\u04e7\u0001\u0000\u0000\u0000\u00d6"+
		"\u04eb\u0001\u0000\u0000\u0000\u00d8\u04f5\u0001\u0000\u0000\u0000\u00da"+
		"\u0507\u0001\u0000\u0000\u0000\u00dc\u0509\u0001\u0000\u0000\u0000\u00de"+
		"\u0521\u0001\u0000\u0000\u0000\u00e0\u0523\u0001\u0000\u0000\u0000\u00e2"+
		"\u052f\u0001\u0000\u0000\u0000\u00e4\u0536\u0001\u0000\u0000\u0000\u00e6"+
		"\u053e\u0001\u0000\u0000\u0000\u00e8\u0545\u0001\u0000\u0000\u0000\u00ea"+
		"\u054d\u0001\u0000\u0000\u0000\u00ec\u0558\u0001\u0000\u0000\u0000\u00ee"+
		"\u0568\u0001\u0000\u0000\u0000\u00f0\u056a\u0001\u0000\u0000\u0000\u00f2"+
		"\u057a\u0001\u0000\u0000\u0000\u00f4\u057c\u0001\u0000\u0000\u0000\u00f6"+
		"\u0585\u0001\u0000\u0000\u0000\u00f8\u0589\u0001\u0000\u0000\u0000\u00fa"+
		"\u058b\u0001\u0000\u0000\u0000\u00fc\u0593\u0001\u0000\u0000\u0000\u00fe"+
		"\u0595\u0001\u0000\u0000\u0000\u0100\u05ac\u0001\u0000\u0000\u0000\u0102"+
		"\u05b6\u0001\u0000\u0000\u0000\u0104\u05bf\u0001\u0000\u0000\u0000\u0106"+
		"\u05cf\u0001\u0000\u0000\u0000\u0108\u05d6\u0001\u0000\u0000\u0000\u010a"+
		"\u05df\u0001\u0000\u0000\u0000\u010c\u05e3\u0001\u0000\u0000\u0000\u010e"+
		"\u05e5\u0001\u0000\u0000\u0000\u0110\u05ed\u0001\u0000\u0000\u0000\u0112"+
		"\u05f5\u0001\u0000\u0000\u0000\u0114\u05fd\u0001\u0000\u0000\u0000\u0116"+
		"\u0605\u0001\u0000\u0000\u0000\u0118\u060d\u0001\u0000\u0000\u0000\u011a"+
		"\u0618\u0001\u0000\u0000\u0000\u011c\u061a\u0001\u0000\u0000\u0000\u011e"+
		"\u0628\u0001\u0000\u0000\u0000\u0120\u063c\u0001\u0000\u0000\u0000\u0122"+
		"\u0125\u0003\u0002\u0001\u0000\u0123\u0125\u0005\u0003\u0000\u0000\u0124"+
		"\u0122\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125"+
		"\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0000\u0000\u0001\u012a"+
		"\u0001\u0001\u0000\u0000\u0000\u012b\u012e\u0003\b\u0004\u0000\u012c\u012e"+
		"\u0003\u0004\u0002\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c"+
		"\u0001\u0000\u0000\u0000\u012e\u0003\u0001\u0000\u0000\u0000\u012f\u0134"+
		"\u0003\u0006\u0003\u0000\u0130\u0131\u0005\u001c\u0000\u0000\u0131\u0133"+
		"\u0003\u0006\u0003\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0136"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0137\u012f\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0007\u0000\u0000\u0000\u013a\u0005\u0001\u0000\u0000\u0000\u013b\u0142"+
		"\u0003\n\u0005\u0000\u013c\u0142\u0003\u0010\b\u0000\u013d\u0142\u0003"+
		",\u0016\u0000\u013e\u0142\u0003\u001c\u000e\u0000\u013f\u0142\u0003@ "+
		"\u0000\u0140\u0142\u0003.\u0017\u0000\u0141\u013b\u0001\u0000\u0000\u0000"+
		"\u0141\u013c\u0001\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000"+
		"\u0141\u013e\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0007\u0001\u0000\u0000\u0000"+
		"\u0143\u0147\u0003*\u0015\u0000\u0144\u0147\u0003$\u0012\u0000\u0145\u0147"+
		"\u0003\u001e\u000f\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0146\u0144"+
		"\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\t\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u00051\u0000\u0000\u0149\u014c\u0005\u001e"+
		"\u0000\u0000\u014a\u014d\u00034\u001a\u0000\u014b\u014d\u0003\f\u0006"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d\u000b\u0001\u0000\u0000\u0000\u014e\u014f\u00054\u0000\u0000"+
		"\u014f\u0150\u0003\u000e\u0007\u0000\u0150\u0151\u00056\u0000\u0000\u0151"+
		"\u0157\u0001\u0000\u0000\u0000\u0152\u0153\u00055\u0000\u0000\u0153\u0154"+
		"\u0003\u000e\u0007\u0000\u0154\u0155\u00057\u0000\u0000\u0155\u0157\u0001"+
		"\u0000\u0000\u0000\u0156\u014e\u0001\u0000\u0000\u0000\u0156\u0152\u0001"+
		"\u0000\u0000\u0000\u0157\r\u0001\u0000\u0000\u0000\u0158\u015c\u0003X"+
		",\u0000\u0159\u015c\u0003\u00f8|\u0000\u015a\u015c\u0005E\u0000\u0000"+
		"\u015b\u0158\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000"+
		"\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000"+
		"\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u000f\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u0160\u0163\u0003\u0012\t\u0000\u0161\u0163\u0003\u0014\n\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163"+
		"\u0011\u0001\u0000\u0000\u0000\u0164\u0165\u0005\t\u0000\u0000\u0165\u0168"+
		"\u0003\u001a\r\u0000\u0166\u0167\u0005\n\u0000\u0000\u0167\u0169\u0005"+
		"1\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000"+
		"\u0000\u0000\u0169\u0013\u0001\u0000\u0000\u0000\u016a\u016b\u0005\b\u0000"+
		"\u0000\u016b\u016c\u0003\u001a\r\u0000\u016c\u016f\u0005\t\u0000\u0000"+
		"\u016d\u0170\u0005\'\u0000\u0000\u016e\u0170\u0003\u0016\u000b\u0000\u016f"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0015\u0001\u0000\u0000\u0000\u0171\u0176\u0003\u0018\f\u0000\u0172\u0173"+
		"\u0005\u001d\u0000\u0000\u0173\u0175\u0003\u0018\f\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0017\u0001"+
		"\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017c\u0005"+
		"1\u0000\u0000\u017a\u017b\u0005\n\u0000\u0000\u017b\u017d\u00051\u0000"+
		"\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u0019\u0001\u0000\u0000\u0000\u017e\u0183\u00051\u0000\u0000"+
		"\u017f\u0180\u00050\u0000\u0000\u0180\u0182\u00051\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u001b"+
		"\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0005\u0010\u0000\u0000\u0187\u018c\u00051\u0000\u0000\u0188\u0189\u0005"+
		"\u001d\u0000\u0000\u0189\u018b\u00051\u0000\u0000\u018a\u0188\u0001\u0000"+
		"\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u001d\u0001\u0000"+
		"\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0003 \u0010"+
		"\u0000\u0190\u0191\u0003$\u0012\u0000\u0191\u001f\u0001\u0000\u0000\u0000"+
		"\u0192\u0194\u0003\"\u0011\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196!\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0005\u001a\u0000\u0000\u0198\u019e\u0003\u001a\r\u0000\u0199\u019b\u0005"+
		"*\u0000\u0000\u019a\u019c\u0003T*\u0000\u019b\u019a\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d\u019f\u0005+\u0000\u0000\u019e\u0199\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0005\u0003\u0000\u0000\u01a1#\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0005\u0006\u0000\u0000\u01a3\u01a4\u00051\u0000\u0000\u01a4\u01a7"+
		"\u0003&\u0013\u0000\u01a5\u01a6\u0005\u0019\u0000\u0000\u01a6\u01a8\u0003"+
		"4\u001a\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u001b"+
		"\u0000\u0000\u01aa\u01ab\u00030\u0018\u0000\u01ab%\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ae\u0005*\u0000\u0000\u01ad\u01af\u0003(\u0014\u0000\u01ae\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005+\u0000\u0000\u01b1\'\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b7\u00051\u0000\u0000\u01b3\u01b4\u0005\u001d"+
		"\u0000\u0000\u01b4\u01b6\u00051\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8)\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005\u000b\u0000\u0000"+
		"\u01bb\u01bc\u00034\u001a\u0000\u01bc\u01bd\u0005\u001b\u0000\u0000\u01bd"+
		"\u01c5\u00030\u0018\u0000\u01be\u01bf\u0005\f\u0000\u0000\u01bf\u01c0"+
		"\u00034\u001a\u0000\u01c0\u01c1\u0005\u001b\u0000\u0000\u01c1\u01c2\u0003"+
		"0\u0018\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01be\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01cb\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005\r\u0000"+
		"\u0000\u01c9\u01ca\u0005\u001b\u0000\u0000\u01ca\u01cc\u00030\u0018\u0000"+
		"\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc+\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005\u0007\u0000\u0000\u01ce"+
		"\u01d0\u00032\u0019\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0-\u0001\u0000\u0000\u0000\u01d1\u01d2\u0003"+
		",\u0016\u0000\u01d2/\u0001\u0000\u0000\u0000\u01d3\u01de\u0003\u0004\u0002"+
		"\u0000\u01d4\u01d5\u0005\u0003\u0000\u0000\u01d5\u01d7\u0005\u0001\u0000"+
		"\u0000\u01d6\u01d8\u0003\u0002\u0001\u0000\u01d7\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0005\u0002\u0000\u0000\u01dc\u01de\u0001\u0000\u0000"+
		"\u0000\u01dd\u01d3\u0001\u0000\u0000\u0000\u01dd\u01d4\u0001\u0000\u0000"+
		"\u0000\u01de1\u0001\u0000\u0000\u0000\u01df\u01e4\u00034\u001a\u0000\u01e0"+
		"\u01e1\u0005\u001d\u0000\u0000\u01e1\u01e3\u00034\u001a\u0000\u01e2\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e53\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e8\u0003"+
		"6\u001b\u0000\u01e85\u0001\u0000\u0000\u0000\u01e9\u01ee\u00038\u001c"+
		"\u0000\u01ea\u01eb\u0005\u0012\u0000\u0000\u01eb\u01ed\u00038\u001c\u0000"+
		"\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef7\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f6\u0003:\u001d\u0000\u01f2\u01f3\u0005\u0011\u0000\u0000\u01f3\u01f5"+
		"\u0003:\u001d\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f79\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0005\u0013\u0000\u0000\u01fa\u01fd\u0003:\u001d"+
		"\u0000\u01fb\u01fd\u0003<\u001e\u0000\u01fc\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd;\u0001\u0000\u0000\u0000\u01fe"+
		"\u0204\u0003@ \u0000\u01ff\u0200\u0003>\u001f\u0000\u0200\u0201\u0003"+
		"@ \u0000\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01ff\u0001\u0000\u0000"+
		"\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205=\u0001\u0000\u0000\u0000"+
		"\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u0211\u0005\"\u0000\u0000\u0208"+
		"\u0211\u0005!\u0000\u0000\u0209\u0211\u0005\u001f\u0000\u0000\u020a\u0211"+
		"\u0005 \u0000\u0000\u020b\u0211\u0005#\u0000\u0000\u020c\u0211\u0005$"+
		"\u0000\u0000\u020d\u0211\u0005\u000f\u0000\u0000\u020e\u020f\u0005\u0013"+
		"\u0000\u0000\u020f\u0211\u0005\u000f\u0000\u0000\u0210\u0207\u0001\u0000"+
		"\u0000\u0000\u0210\u0208\u0001\u0000\u0000\u0000\u0210\u0209\u0001\u0000"+
		"\u0000\u0000\u0210\u020a\u0001\u0000\u0000\u0000\u0210\u020b\u0001\u0000"+
		"\u0000\u0000\u0210\u020c\u0001\u0000\u0000\u0000\u0210\u020d\u0001\u0000"+
		"\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211?\u0001\u0000\u0000"+
		"\u0000\u0212\u0217\u0003B!\u0000\u0213\u0214\u0007\u0001\u0000\u0000\u0214"+
		"\u0216\u0003B!\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u0219\u0001"+
		"\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001"+
		"\u0000\u0000\u0000\u0218A\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000"+
		"\u0000\u0000\u021a\u021f\u0003D\"\u0000\u021b\u021c\u0007\u0002\u0000"+
		"\u0000\u021c\u021e\u0003D\"\u0000\u021d\u021b\u0001\u0000\u0000\u0000"+
		"\u021e\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0001\u0000\u0000\u0000\u0220C\u0001\u0000\u0000\u0000\u0221"+
		"\u021f\u0001\u0000\u0000\u0000\u0222\u0223\u0007\u0001\u0000\u0000\u0223"+
		"\u0226\u0003D\"\u0000\u0224\u0226\u0003F#\u0000\u0225\u0222\u0001\u0000"+
		"\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226E\u0001\u0000\u0000"+
		"\u0000\u0227\u0228\u0003H$\u0000\u0228G\u0001\u0000\u0000\u0000\u0229"+
		"\u022d\u0003L&\u0000\u022a\u022c\u0003J%\u0000\u022b\u022a\u0001\u0000"+
		"\u0000\u0000\u022c\u022f\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000"+
		"\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022eI\u0001\u0000\u0000"+
		"\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230\u0232\u0005*\u0000\u0000"+
		"\u0231\u0233\u0003T*\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0232\u0233"+
		"\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u023c"+
		"\u0005+\u0000\u0000\u0235\u0236\u0005,\u0000\u0000\u0236\u0237\u00034"+
		"\u001a\u0000\u0237\u0238\u0005-\u0000\u0000\u0238\u023c\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\u00050\u0000\u0000\u023a\u023c\u00051\u0000\u0000\u023b"+
		"\u0230\u0001\u0000\u0000\u0000\u023b\u0235\u0001\u0000\u0000\u0000\u023b"+
		"\u0239\u0001\u0000\u0000\u0000\u023cK\u0001\u0000\u0000\u0000\u023d\u0257"+
		"\u00051\u0000\u0000\u023e\u0257\u00052\u0000\u0000\u023f\u0241\u00053"+
		"\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000"+
		"\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0257\u0001\u0000\u0000\u0000\u0244\u0257\u0005\u0016"+
		"\u0000\u0000\u0245\u0257\u0005\u0014\u0000\u0000\u0246\u0257\u0005\u0015"+
		"\u0000\u0000\u0247\u0249\u0005*\u0000\u0000\u0248\u024a\u00034\u001a\u0000"+
		"\u0249\u0248\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000"+
		"\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u0257\u0005+\u0000\u0000\u024c"+
		"\u024e\u0005,\u0000\u0000\u024d\u024f\u0003N\'\u0000\u024e\u024d\u0001"+
		"\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0001"+
		"\u0000\u0000\u0000\u0250\u0257\u0005-\u0000\u0000\u0251\u0253\u0005.\u0000"+
		"\u0000\u0252\u0254\u0003R)\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255"+
		"\u0257\u0005/\u0000\u0000\u0256\u023d\u0001\u0000\u0000\u0000\u0256\u023e"+
		"\u0001\u0000\u0000\u0000\u0256\u0240\u0001\u0000\u0000\u0000\u0256\u0244"+
		"\u0001\u0000\u0000\u0000\u0256\u0245\u0001\u0000\u0000\u0000\u0256\u0246"+
		"\u0001\u0000\u0000\u0000\u0256\u0247\u0001\u0000\u0000\u0000\u0256\u024c"+
		"\u0001\u0000\u0000\u0000\u0256\u0251\u0001\u0000\u0000\u0000\u0257M\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u00034\u001a\u0000\u0259\u025a\u0003P("+
		"\u0000\u025a\u0264\u0001\u0000\u0000\u0000\u025b\u0260\u00034\u001a\u0000"+
		"\u025c\u025d\u0005\u001d\u0000\u0000\u025d\u025f\u00034\u001a\u0000\u025e"+
		"\u025c\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260"+
		"\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261"+
		"\u0264\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263"+
		"\u0258\u0001\u0000\u0000\u0000\u0263\u025b\u0001\u0000\u0000\u0000\u0264"+
		"O\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u000e\u0000\u0000\u0266\u0267"+
		"\u00034\u001a\u0000\u0267\u0268\u0005\u000f\u0000\u0000\u0268\u026d\u0003"+
		"4\u001a\u0000\u0269\u026a\u0005\u000b\u0000\u0000\u026a\u026c\u00034\u001a"+
		"\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026f\u0001\u0000\u0000"+
		"\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000"+
		"\u0000\u026eQ\u0001\u0000\u0000\u0000\u026f\u026d\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u00034\u001a\u0000\u0271\u0272\u0005\u001b\u0000\u0000\u0272"+
		"\u027a\u00034\u001a\u0000\u0273\u0274\u0005\u001d\u0000\u0000\u0274\u0275"+
		"\u00034\u001a\u0000\u0275\u0276\u0005\u001b\u0000\u0000\u0276\u0277\u0003"+
		"4\u001a\u0000\u0277\u0279\u0001\u0000\u0000\u0000\u0278\u0273\u0001\u0000"+
		"\u0000\u0000\u0279\u027c\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027bS\u0001\u0000\u0000"+
		"\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u0282\u0003V+\u0000\u027e"+
		"\u027f\u0005\u001d\u0000\u0000\u027f\u0281\u0003V+\u0000\u0280\u027e\u0001"+
		"\u0000\u0000\u0000\u0281\u0284\u0001\u0000\u0000\u0000\u0282\u0280\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283U\u0001\u0000"+
		"\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0285\u028a\u00034\u001a"+
		"\u0000\u0286\u0287\u00051\u0000\u0000\u0287\u0288\u0005\u001e\u0000\u0000"+
		"\u0288\u028a\u00034\u001a\u0000\u0289\u0285\u0001\u0000\u0000\u0000\u0289"+
		"\u0286\u0001\u0000\u0000\u0000\u028aW\u0001\u0000\u0000\u0000\u028b\u028f"+
		"\u0005D\u0000\u0000\u028c\u028e\u0003Z-\u0000\u028d\u028c\u0001\u0000"+
		"\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0292\u0001\u0000"+
		"\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u029e\u0007\u0003"+
		"\u0000\u0000\u0293\u0294\u0005B\u0000\u0000\u0294\u029e\u0005M\u0000\u0000"+
		"\u0295\u0296\u0005C\u0000\u0000\u0296\u0297\u0003\\.\u0000\u0297\u0298"+
		"\u0005N\u0000\u0000\u0298\u029e\u0001\u0000\u0000\u0000\u0299\u029e\u0005"+
		"=\u0000\u0000\u029a\u029e\u0005>\u0000\u0000\u029b\u029e\u0005?\u0000"+
		"\u0000\u029c\u029e\u0005@\u0000\u0000\u029d\u028b\u0001\u0000\u0000\u0000"+
		"\u029d\u0293\u0001\u0000\u0000\u0000\u029d\u0295\u0001\u0000\u0000\u0000"+
		"\u029d\u0299\u0001\u0000\u0000\u0000\u029d\u029a\u0001\u0000\u0000\u0000"+
		"\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029c\u0001\u0000\u0000\u0000"+
		"\u029eY\u0001\u0000\u0000\u0000\u029f\u02a2\u0005J\u0000\u0000\u02a0\u02a1"+
		"\u0005I\u0000\u0000\u02a1\u02a3\u0005L\u0000\u0000\u02a2\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a8\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a8\u0003\u00f8|\u0000\u02a5\u02a8\u0005H\u0000\u0000"+
		"\u02a6\u02a8\u0005I\u0000\u0000\u02a7\u029f\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a8[\u0001\u0000\u0000\u0000\u02a9\u02ad"+
		"\u0003^/\u0000\u02aa\u02ac\u0007\u0004\u0000\u0000\u02ab\u02aa\u0001\u0000"+
		"\u0000\u0000\u02ac\u02af\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b1\u0001\u0000"+
		"\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02b0\u02a9\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02be\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b9\u0003`0\u0000"+
		"\u02b6\u02b8\u0007\u0004\u0000\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b8\u02bb\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bd\u0001\u0000\u0000\u0000"+
		"\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bc\u02b5\u0001\u0000\u0000\u0000"+
		"\u02bd\u02c0\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000"+
		"\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02ca\u0001\u0000\u0000\u0000"+
		"\u02c0\u02be\u0001\u0000\u0000\u0000\u02c1\u02c5\u0003b1\u0000\u02c2\u02c4"+
		"\u0007\u0004\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c8\u02c1\u0001\u0000\u0000\u0000\u02c9\u02cc"+
		"\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cb\u02d6\u0001\u0000\u0000\u0000\u02cc\u02ca"+
		"\u0001\u0000\u0000\u0000\u02cd\u02d1\u0003\u00bc^\u0000\u02ce\u02d0\u0007"+
		"\u0004\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000\u02d3\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d4\u02cd\u0001\u0000\u0000\u0000\u02d5\u02d8\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d9\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d9\u02da\u0005\u0000\u0000\u0001\u02da]\u0001\u0000"+
		"\u0000\u0000\u02db\u02dc\u0005n\u0000\u0000\u02dc\u02dd\u0005z\u0000\u0000"+
		"\u02dd\u02e1\u0005Z\u0000\u0000\u02de\u02df\u0005n\u0000\u0000\u02df\u02e1"+
		"\u0005z\u0000\u0000\u02e0\u02db\u0001\u0000\u0000\u0000\u02e0\u02de\u0001"+
		"\u0000\u0000\u0000\u02e1_\u0001\u0000\u0000\u0000\u02e2\u02e5\u0005j\u0000"+
		"\u0000\u02e3\u02e6\u0005z\u0000\u0000\u02e4\u02e6\u0003\u00d0h\u0000\u02e5"+
		"\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e8\u0003h4\u0000\u02e8\u02e9\u0005"+
		"Z\u0000\u0000\u02e9\u02fc\u0001\u0000\u0000\u0000\u02ea\u02ed\u0005j\u0000"+
		"\u0000\u02eb\u02ee\u0005z\u0000\u0000\u02ec\u02ee\u0003\u00d0h\u0000\u02ed"+
		"\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ef\u0001\u0000\u0000\u0000\u02ef\u02fc\u0005Z\u0000\u0000\u02f0\u02f3"+
		"\u0005j\u0000\u0000\u02f1\u02f4\u0005z\u0000\u0000\u02f2\u02f4\u0003\u00d0"+
		"h\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02fc\u0003h4\u0000\u02f6"+
		"\u02f9\u0005j\u0000\u0000\u02f7\u02fa\u0005z\u0000\u0000\u02f8\u02fa\u0003"+
		"\u00d0h\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02f9\u02f8\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fc\u0001\u0000\u0000\u0000\u02fb\u02e2\u0001\u0000"+
		"\u0000\u0000\u02fb\u02ea\u0001\u0000\u0000\u0000\u02fb\u02f0\u0001\u0000"+
		"\u0000\u0000\u02fb\u02f6\u0001\u0000\u0000\u0000\u02fca\u0001\u0000\u0000"+
		"\u0000\u02fd\u02ff\u0005m\u0000\u0000\u02fe\u0300\u0003d2\u0000\u02ff"+
		"\u02fe\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300"+
		"\u0303\u0001\u0000\u0000\u0000\u0301\u0304\u0005z\u0000\u0000\u0302\u0304"+
		"\u0003\u00d0h\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303\u0302\u0001"+
		"\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305\u030f\u0005"+
		"Z\u0000\u0000\u0306\u0308\u0005m\u0000\u0000\u0307\u0309\u0003d2\u0000"+
		"\u0308\u0307\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000"+
		"\u0309\u030c\u0001\u0000\u0000\u0000\u030a\u030d\u0005z\u0000\u0000\u030b"+
		"\u030d\u0003\u00d0h\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030c\u030b"+
		"\u0001\u0000\u0000\u0000\u030d\u030f\u0001\u0000\u0000\u0000\u030e\u02fd"+
		"\u0001\u0000\u0000\u0000\u030e\u0306\u0001\u0000\u0000\u0000\u030fc\u0001"+
		"\u0000\u0000\u0000\u0310\u0311\u0003\u00f6{\u0000\u0311e\u0001\u0000\u0000"+
		"\u0000\u0312\u0313\u0005l\u0000\u0000\u0313\u0314\u0003h4\u0000\u0314"+
		"\u0315\u0003\u00be_\u0000\u0315g\u0001\u0000\u0000\u0000\u0316\u031b\u0003"+
		"j5\u0000\u0317\u0318\u0005R\u0000\u0000\u0318\u031a\u0003j5\u0000\u0319"+
		"\u0317\u0001\u0000\u0000\u0000\u031a\u031d\u0001\u0000\u0000\u0000\u031b"+
		"\u0319\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c"+
		"\u031f\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031e"+
		"\u0316\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f"+
		"i\u0001\u0000\u0000\u0000\u0320\u0322\u0007\u0005\u0000\u0000\u0321\u0320"+
		"\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0323"+
		"\u0001\u0000\u0000\u0000\u0323\u0328\u0003l6\u0000\u0324\u0325\u0005u"+
		"\u0000\u0000\u0325\u0327\u0003n7\u0000\u0326\u0324\u0001\u0000\u0000\u0000"+
		"\u0327\u032a\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000"+
		"\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u0334\u0001\u0000\u0000\u0000"+
		"\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u0330\u0003n7\u0000\u032c\u032d"+
		"\u0005u\u0000\u0000\u032d\u032f\u0003n7\u0000\u032e\u032c\u0001\u0000"+
		"\u0000\u0000\u032f\u0332\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000"+
		"\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0334\u0001\u0000"+
		"\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0333\u0321\u0001\u0000"+
		"\u0000\u0000\u0333\u032b\u0001\u0000\u0000\u0000\u0334k\u0001\u0000\u0000"+
		"\u0000\u0335\u0336\u0003\u00f6{\u0000\u0336m\u0001\u0000\u0000\u0000\u0337"+
		"\u0338\u0005V\u0000\u0000\u0338\u033b\u0003p8\u0000\u0339\u033a\u0005"+
		"\\\u0000\u0000\u033a\u033c\u0003\u00a2Q\u0000\u033b\u0339\u0001\u0000"+
		"\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000"+
		"\u0000\u0000\u033d\u033e\u0005W\u0000\u0000\u033eo\u0001\u0000\u0000\u0000"+
		"\u033f\u0340\u0003\u00f6{\u0000\u0340q\u0001\u0000\u0000\u0000\u0341\u0343"+
		"\u0005k\u0000\u0000\u0342\u0344\u0003t:\u0000\u0343\u0342\u0001\u0000"+
		"\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000"+
		"\u0000\u0000\u0345\u0347\u0005X\u0000\u0000\u0346\u0348\u0003\u009cN\u0000"+
		"\u0347\u0346\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000"+
		"\u0348\u034f\u0001\u0000\u0000\u0000\u0349\u034b\u0005Z\u0000\u0000\u034a"+
		"\u034c\u0003\u009cN\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034b\u034c"+
		"\u0001\u0000\u0000\u0000\u034c\u034e\u0001\u0000\u0000\u0000\u034d\u0349"+
		"\u0001\u0000\u0000\u0000\u034e\u0351\u0001\u0000\u0000\u0000\u034f\u034d"+
		"\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0352"+
		"\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0352\u0353"+
		"\u0005Y\u0000\u0000\u0353s\u0001\u0000\u0000\u0000\u0354\u0355\u0005\\"+
		"\u0000\u0000\u0355\u0356\u0003\u00f6{\u0000\u0356u\u0001\u0000\u0000\u0000"+
		"\u0357\u035c\u0003x<\u0000\u0358\u0359\u0005R\u0000\u0000\u0359\u035b"+
		"\u0003x<\u0000\u035a\u0358\u0001\u0000\u0000\u0000\u035b\u035e\u0001\u0000"+
		"\u0000\u0000\u035c\u035a\u0001\u0000\u0000\u0000\u035c\u035d\u0001\u0000"+
		"\u0000\u0000\u035dw\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000"+
		"\u0000\u035f\u0365\u0003|>\u0000\u0360\u0361\u0003z=\u0000\u0361\u0362"+
		"\u0003|>\u0000\u0362\u0364\u0001\u0000\u0000\u0000\u0363\u0360\u0001\u0000"+
		"\u0000\u0000\u0364\u0367\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000"+
		"\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366y\u0001\u0000\u0000"+
		"\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0368\u0369\u0007\u0006\u0000"+
		"\u0000\u0369{\u0001\u0000\u0000\u0000\u036a\u036d\u0003~?\u0000\u036b"+
		"\u036d\u0003\u0084B\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036c\u036b"+
		"\u0001\u0000\u0000\u0000\u036d\u0375\u0001\u0000\u0000\u0000\u036e\u0374"+
		"\u0005i\u0000\u0000\u036f\u0374\u0003\u0086C\u0000\u0370\u0374\u0003\u0088"+
		"D\u0000\u0371\u0374\u0003\u008aE\u0000\u0372\u0374\u0003\u0090H\u0000"+
		"\u0373\u036e\u0001\u0000\u0000\u0000\u0373\u036f\u0001\u0000\u0000\u0000"+
		"\u0373\u0370\u0001\u0000\u0000\u0000\u0373\u0371\u0001\u0000\u0000\u0000"+
		"\u0373\u0372\u0001\u0000\u0000\u0000\u0374\u0377\u0001\u0000\u0000\u0000"+
		"\u0375\u0373\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000"+
		"\u0376\u0382\u0001\u0000\u0000\u0000\u0377\u0375\u0001\u0000\u0000\u0000"+
		"\u0378\u037e\u0005i\u0000\u0000\u0379\u037e\u0003\u0086C\u0000\u037a\u037e"+
		"\u0003\u0088D\u0000\u037b\u037e\u0003\u008aE\u0000\u037c\u037e\u0003\u0090"+
		"H\u0000\u037d\u0378\u0001\u0000\u0000\u0000\u037d\u0379\u0001\u0000\u0000"+
		"\u0000\u037d\u037a\u0001\u0000\u0000\u0000\u037d\u037b\u0001\u0000\u0000"+
		"\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000"+
		"\u0000\u037f\u037d\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000"+
		"\u0000\u0380\u0382\u0001\u0000\u0000\u0000\u0381\u036c\u0001\u0000\u0000"+
		"\u0000\u0381\u037d\u0001\u0000\u0000\u0000\u0382}\u0001\u0000\u0000\u0000"+
		"\u0383\u0385\u0003\u0080@\u0000\u0384\u0383\u0001\u0000\u0000\u0000\u0384"+
		"\u0385\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386"+
		"\u0387\u0003\u0082A\u0000\u0387\u007f\u0001\u0000\u0000\u0000\u0388\u038b"+
		"\u0003\u00f6{\u0000\u0389\u038b\u0005^\u0000\u0000\u038a\u0388\u0001\u0000"+
		"\u0000\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000"+
		"\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038d\u0005`\u0000"+
		"\u0000\u038d\u0081\u0001\u0000\u0000\u0000\u038e\u038f\u0003\u00f6{\u0000"+
		"\u038f\u0083\u0001\u0000\u0000\u0000\u0390\u0392\u0003\u0080@\u0000\u0391"+
		"\u0390\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392"+
		"\u0393\u0001\u0000\u0000\u0000\u0393\u0394\u0005^\u0000\u0000\u0394\u0085"+
		"\u0001\u0000\u0000\u0000\u0395\u0396\u0005]\u0000\u0000\u0396\u0397\u0003"+
		"\u00f6{\u0000\u0397\u0087\u0001\u0000\u0000\u0000\u0398\u039a\u0005T\u0000"+
		"\u0000\u0399\u039b\u0003\u0080@\u0000\u039a\u0399\u0001\u0000\u0000\u0000"+
		"\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000"+
		"\u039c\u03a2\u0003\u00f6{\u0000\u039d\u03a0\u0007\u0007\u0000\u0000\u039e"+
		"\u03a1\u0003\u00f6{\u0000\u039f\u03a1\u0005z\u0000\u0000\u03a0\u039e\u0001"+
		"\u0000\u0000\u0000\u03a0\u039f\u0001\u0000\u0000\u0000\u03a1\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a2\u039d\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03a5\u0005"+
		"U\u0000\u0000\u03a5\u0089\u0001\u0000\u0000\u0000\u03a6\u03a8\u0005\\"+
		"\u0000\u0000\u03a7\u03a9\u0005\\\u0000\u0000\u03a8\u03a7\u0001\u0000\u0000"+
		"\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03ac\u0001\u0000\u0000"+
		"\u0000\u03aa\u03ad\u0003\u00f6{\u0000\u03ab\u03ad\u0003\u008cF\u0000\u03ac"+
		"\u03aa\u0001\u0000\u0000\u0000\u03ac\u03ab\u0001\u0000\u0000\u0000\u03ad"+
		"\u008b\u0001\u0000\u0000\u0000\u03ae\u03af\u0005\u008d\u0000\u0000\u03af"+
		"\u03b0\u0003\u008eG\u0000\u03b0\u03b1\u0005W\u0000\u0000\u03b1\u008d\u0001"+
		"\u0000\u0000\u0000\u03b2\u03ba\u0005O\u0000\u0000\u03b3\u03ba\u0005P\u0000"+
		"\u0000\u03b4\u03ba\u0005v\u0000\u0000\u03b5\u03ba\u0005w\u0000\u0000\u03b6"+
		"\u03ba\u0005y\u0000\u0000\u03b7\u03ba\u0005z\u0000\u0000\u03b8\u03ba\u0003"+
		"\u00f6{\u0000\u03b9\u03b2\u0001\u0000\u0000\u0000\u03b9\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b9\u03b4\u0001\u0000\u0000\u0000\u03b9\u03b5\u0001\u0000"+
		"\u0000\u0000\u03b9\u03b6\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001\u0000"+
		"\u0000\u0000\u03b9\u03b8\u0001\u0000\u0000\u0000\u03ba\u03bc\u0001\u0000"+
		"\u0000\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000"+
		"\u0000\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000"+
		"\u0000\u0000\u03be\u008f\u0001\u0000\u0000\u0000\u03bf\u03c0\u0005x\u0000"+
		"\u0000\u03c0\u03c1\u0003\u0092I\u0000\u03c1\u03c2\u0005W\u0000\u0000\u03c2"+
		"\u0091\u0001\u0000\u0000\u0000\u03c3\u03ca\u0003~?\u0000\u03c4\u03ca\u0003"+
		"\u0084B\u0000\u03c5\u03ca\u0005i\u0000\u0000\u03c6\u03ca\u0003\u0086C"+
		"\u0000\u03c7\u03ca\u0003\u0088D\u0000\u03c8\u03ca\u0003\u008aE\u0000\u03c9"+
		"\u03c3\u0001\u0000\u0000\u0000\u03c9\u03c4\u0001\u0000\u0000\u0000\u03c9"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c9\u03c6\u0001\u0000\u0000\u0000\u03c9"+
		"\u03c7\u0001\u0000\u0000\u0000\u03c9\u03c8\u0001\u0000\u0000\u0000\u03ca"+
		"\u0093\u0001\u0000\u0000\u0000\u03cb\u03d0\u0005_\u0000\u0000\u03cc\u03d0"+
		"\u0005R\u0000\u0000\u03cd\u03d0\u0005d\u0000\u0000\u03ce\u03d0\u0005["+
		"\u0000\u0000\u03cf\u03cb\u0001\u0000\u0000\u0000\u03cf\u03cc\u0001\u0000"+
		"\u0000\u0000\u03cf\u03cd\u0001\u0000\u0000\u0000\u03cf\u03ce\u0001\u0000"+
		"\u0000\u0000\u03d0\u0095\u0001\u0000\u0000\u0000\u03d1\u03d8\u0003\u00f6"+
		"{\u0000\u03d2\u03d8\u0005\u008a\u0000\u0000\u03d3\u03d4\u0005^\u0000\u0000"+
		"\u03d4\u03d8\u0003\u00f6{\u0000\u03d5\u03d6\u0005a\u0000\u0000\u03d6\u03d8"+
		"\u0003\u00f6{\u0000\u03d7\u03d1\u0001\u0000\u0000\u0000\u03d7\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d7\u03d3\u0001\u0000\u0000\u0000\u03d7\u03d5\u0001"+
		"\u0000\u0000\u0000\u03d8\u0097\u0001\u0000\u0000\u0000\u03d9\u03da\u0003"+
		"v;\u0000\u03da\u03dc\u0005X\u0000\u0000\u03db\u03dd\u0003\u009aM\u0000"+
		"\u03dc\u03db\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000"+
		"\u03dd\u03de\u0001\u0000\u0000\u0000\u03de\u03df\u0005Y\u0000\u0000\u03df"+
		"\u03ec\u0001\u0000\u0000\u0000\u03e0\u03e2\u0003\u00b4Z\u0000\u03e1\u03e0"+
		"\u0001\u0000\u0000\u0000\u03e2\u03e5\u0001\u0000\u0000\u0000\u03e3\u03e1"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000\u0000\u0000\u03e4\u03e6"+
		"\u0001\u0000\u0000\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e6\u03e8"+
		"\u0005X\u0000\u0000\u03e7\u03e9\u0003\u009aM\u0000\u03e8\u03e7\u0001\u0000"+
		"\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000"+
		"\u0000\u0000\u03ea\u03ec\u0005Y\u0000\u0000\u03eb\u03d9\u0001\u0000\u0000"+
		"\u0000\u03eb\u03e3\u0001\u0000\u0000\u0000\u03ec\u0099\u0001\u0000\u0000"+
		"\u0000\u03ed\u03ef\u0005Z\u0000\u0000\u03ee\u03ed\u0001\u0000\u0000\u0000"+
		"\u03ef\u03f2\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000"+
		"\u03f0\u03f1\u0001\u0000\u0000\u0000\u03f1\u03f3\u0001\u0000\u0000\u0000"+
		"\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f3\u03fa\u0003\u009cN\u0000\u03f4"+
		"\u03f6\u0005Z\u0000\u0000\u03f5\u03f7\u0003\u009cN\u0000\u03f6\u03f5\u0001"+
		"\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7\u03f9\u0001"+
		"\u0000\u0000\u0000\u03f8\u03f4\u0001\u0000\u0000\u0000\u03f9\u03fc\u0001"+
		"\u0000\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fb\u009b\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001"+
		"\u0000\u0000\u0000\u03fd\u03fe\u0003\u0096K\u0000\u03fe\u03ff\u0005\\"+
		"\u0000\u0000\u03ff\u0401\u0003\u00a2Q\u0000\u0400\u0402\u0003\u009eO\u0000"+
		"\u0401\u0400\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000"+
		"\u0402\u0408\u0001\u0000\u0000\u0000\u0403\u0404\u0003\u0096K\u0000\u0404"+
		"\u0405\u0005\\\u0000\u0000\u0405\u0406\u0003\u00a0P\u0000\u0406\u0408"+
		"\u0001\u0000\u0000\u0000\u0407\u03fd\u0001\u0000\u0000\u0000\u0407\u0403"+
		"\u0001\u0000\u0000\u0000\u0408\u009d\u0001\u0000\u0000\u0000\u0409\u040a"+
		"\u0005o\u0000\u0000\u040a\u009f\u0001\u0000\u0000\u0000\u040b\u040f\u0003"+
		"\u00b4Z\u0000\u040c\u040f\u0003\u00ba]\u0000\u040d\u040f\u0005\u0089\u0000"+
		"\u0000\u040e\u040b\u0001\u0000\u0000\u0000\u040e\u040c\u0001\u0000\u0000"+
		"\u0000\u040e\u040d\u0001\u0000\u0000\u0000\u040f\u0410\u0001\u0000\u0000"+
		"\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000"+
		"\u0000\u0411\u00a1\u0001\u0000\u0000\u0000\u0412\u0419\u0003\u00a4R\u0000"+
		"\u0413\u0415\u0003\u0094J\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0414"+
		"\u0415\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000\u0416"+
		"\u0418\u0003\u00a4R\u0000\u0417\u0414\u0001\u0000\u0000\u0000\u0418\u041b"+
		"\u0001\u0000\u0000\u0000\u0419\u0417\u0001\u0000\u0000\u0000\u0419\u041a"+
		"\u0001\u0000\u0000\u0000\u041a\u00a3\u0001\u0000\u0000\u0000\u041b\u0419"+
		"\u0001\u0000\u0000\u0000\u041c\u042a\u0003\u00acV\u0000\u041d\u042a\u0003"+
		"\u00aeW\u0000\u041e\u042a\u0003\u00b0X\u0000\u041f\u042a\u0005z\u0000"+
		"\u0000\u0420\u042a\u0005r\u0000\u0000\u0421\u042a\u0003\u00f6{\u0000\u0422"+
		"\u042a\u0003\u00d2i\u0000\u0423\u042a\u0003\u00d0h\u0000\u0424\u042a\u0003"+
		"\u00aaU\u0000\u0425\u042a\u0003\u00d4j\u0000\u0426\u042a\u0003\u00a6S"+
		"\u0000\u0427\u042a\u0003\u00b2Y\u0000\u0428\u042a\u0003\u00a8T\u0000\u0429"+
		"\u041c\u0001\u0000\u0000\u0000\u0429\u041d\u0001\u0000\u0000\u0000\u0429"+
		"\u041e\u0001\u0000\u0000\u0000\u0429\u041f\u0001\u0000\u0000\u0000\u0429"+
		"\u0420\u0001\u0000\u0000\u0000\u0429\u0421\u0001\u0000\u0000\u0000\u0429"+
		"\u0422\u0001\u0000\u0000\u0000\u0429\u0423\u0001\u0000\u0000\u0000\u0429"+
		"\u0424\u0001\u0000\u0000\u0000\u0429\u0425\u0001\u0000\u0000\u0000\u0429"+
		"\u0426\u0001\u0000\u0000\u0000\u0429\u0427\u0001\u0000\u0000\u0000\u0429"+
		"\u0428\u0001\u0000\u0000\u0000\u042a\u00a5\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0005\u008d\u0000\u0000\u042c\u042d\u0003\u00a2Q\u0000\u042d\u042e"+
		"\u0005W\u0000\u0000\u042e\u00a7\u0001\u0000\u0000\u0000\u042f\u0430\u0005"+
		"\u0088\u0000\u0000\u0430\u0431\u0003\u00a2Q\u0000\u0431\u0432\u0005W\u0000"+
		"\u0000\u0432\u00a9\u0001\u0000\u0000\u0000\u0433\u0434\u0005i\u0000\u0000"+
		"\u0434\u00ab\u0001\u0000\u0000\u0000\u0435\u0437\u0007\b\u0000\u0000\u0436"+
		"\u0435\u0001\u0000\u0000\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437"+
		"\u0438\u0001\u0000\u0000\u0000\u0438\u0439\u0005y\u0000\u0000\u0439\u00ad"+
		"\u0001\u0000\u0000\u0000\u043a\u043c\u0007\b\u0000\u0000\u043b\u043a\u0001"+
		"\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u043d\u0001"+
		"\u0000\u0000\u0000\u043d\u043e\u0005p\u0000\u0000\u043e\u00af\u0001\u0000"+
		"\u0000\u0000\u043f\u0441\u0007\b\u0000\u0000\u0440\u043f\u0001\u0000\u0000"+
		"\u0000\u0440\u0441\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000"+
		"\u0000\u0442\u0443\u0005v\u0000\u0000\u0443\u00b1\u0001\u0000\u0000\u0000"+
		"\u0444\u0446\u0007\b\u0000\u0000\u0445\u0444\u0001\u0000\u0000\u0000\u0445"+
		"\u0446\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447"+
		"\u0448\u0005w\u0000\u0000\u0448\u00b3\u0001\u0000\u0000\u0000\u0449\u0471"+
		"\u0003\u00f6{\u0000\u044a\u0471\u0003\u00acV\u0000\u044b\u0471\u0003\u00ae"+
		"W\u0000\u044c\u0471\u0003\u00b0X\u0000\u044d\u0471\u0003\u00b2Y\u0000"+
		"\u044e\u0471\u0005z\u0000\u0000\u044f\u0471\u0003\u00d0h\u0000\u0450\u0471"+
		"\u0005i\u0000\u0000\u0451\u0471\u0005r\u0000\u0000\u0452\u0471\u0005g"+
		"\u0000\u0000\u0453\u0471\u0005h\u0000\u0000\u0454\u0471\u0005\\\u0000"+
		"\u0000\u0455\u045a\u0005\u008d\u0000\u0000\u0456\u0459\u0003\u00b4Z\u0000"+
		"\u0457\u0459\u0003\u00b8\\\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0458"+
		"\u0457\u0001\u0000\u0000\u0000\u0459\u045c\u0001\u0000\u0000\u0000\u045a"+
		"\u0458\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000\u045b"+
		"\u045d\u0001\u0000\u0000\u0000\u045c\u045a\u0001\u0000\u0000\u0000\u045d"+
		"\u0471\u0005W\u0000\u0000\u045e\u0463\u0005V\u0000\u0000\u045f\u0462\u0003"+
		"\u00b4Z\u0000\u0460\u0462\u0003\u00b8\\\u0000\u0461\u045f\u0001\u0000"+
		"\u0000\u0000\u0461\u0460\u0001\u0000\u0000\u0000\u0462\u0465\u0001\u0000"+
		"\u0000\u0000\u0463\u0461\u0001\u0000\u0000\u0000\u0463\u0464\u0001\u0000"+
		"\u0000\u0000\u0464\u0466\u0001\u0000\u0000\u0000\u0465\u0463\u0001\u0000"+
		"\u0000\u0000\u0466\u0471\u0005W\u0000\u0000\u0467\u046c\u0005T\u0000\u0000"+
		"\u0468\u046b\u0003\u00b4Z\u0000\u0469\u046b\u0003\u00b8\\\u0000\u046a"+
		"\u0468\u0001\u0000\u0000\u0000\u046a\u0469\u0001\u0000\u0000\u0000\u046b"+
		"\u046e\u0001\u0000\u0000\u0000\u046c\u046a\u0001\u0000\u0000\u0000\u046c"+
		"\u046d\u0001\u0000\u0000\u0000\u046d\u046f\u0001\u0000\u0000\u0000\u046e"+
		"\u046c\u0001\u0000\u0000\u0000\u046f\u0471\u0005U\u0000\u0000\u0470\u0449"+
		"\u0001\u0000\u0000\u0000\u0470\u044a\u0001\u0000\u0000\u0000\u0470\u044b"+
		"\u0001\u0000\u0000\u0000\u0470\u044c\u0001\u0000\u0000\u0000\u0470\u044d"+
		"\u0001\u0000\u0000\u0000\u0470\u044e\u0001\u0000\u0000\u0000\u0470\u044f"+
		"\u0001\u0000\u0000\u0000\u0470\u0450\u0001\u0000\u0000\u0000\u0470\u0451"+
		"\u0001\u0000\u0000\u0000\u0470\u0452\u0001\u0000\u0000\u0000\u0470\u0453"+
		"\u0001\u0000\u0000\u0000\u0470\u0454\u0001\u0000\u0000\u0000\u0470\u0455"+
		"\u0001\u0000\u0000\u0000\u0470\u045e\u0001\u0000\u0000\u0000\u0470\u0467"+
		"\u0001\u0000\u0000\u0000\u0471\u00b5\u0001\u0000\u0000\u0000\u0472\u0476"+
		"\u0005\u0089\u0000\u0000\u0473\u0475\u0003\u00b4Z\u0000\u0474\u0473\u0001"+
		"\u0000\u0000\u0000\u0475\u0478\u0001\u0000\u0000\u0000\u0476\u0474\u0001"+
		"\u0000\u0000\u0000\u0476\u0477\u0001\u0000\u0000\u0000\u0477\u047b\u0001"+
		"\u0000\u0000\u0000\u0478\u0476\u0001\u0000\u0000\u0000\u0479\u047c\u0003"+
		"\u00ba]\u0000\u047a\u047c\u0005Z\u0000\u0000\u047b\u0479\u0001\u0000\u0000"+
		"\u0000\u047b\u047a\u0001\u0000\u0000\u0000\u047c\u00b7\u0001\u0000\u0000"+
		"\u0000\u047d\u0483\u0003\u00ba]\u0000\u047e\u0483\u0005\u0089\u0000\u0000"+
		"\u047f\u0483\u0005Z\u0000\u0000\u0480\u0483\u0005e\u0000\u0000\u0481\u0483"+
		"\u0005f\u0000\u0000\u0482\u047d\u0001\u0000\u0000\u0000\u0482\u047e\u0001"+
		"\u0000\u0000\u0000\u0482\u047f\u0001\u0000\u0000\u0000\u0482\u0480\u0001"+
		"\u0000\u0000\u0000\u0482\u0481\u0001\u0000\u0000\u0000\u0483\u00b9\u0001"+
		"\u0000\u0000\u0000\u0484\u048d\u0005X\u0000\u0000\u0485\u048c\u0003\u009a"+
		"M\u0000\u0486\u048c\u0003\u00bc^\u0000\u0487\u048c\u0003\u00b4Z\u0000"+
		"\u0488\u048c\u0003\u00ba]\u0000\u0489\u048c\u0005\u0089\u0000\u0000\u048a"+
		"\u048c\u0005Z\u0000\u0000\u048b\u0485\u0001\u0000\u0000\u0000\u048b\u0486"+
		"\u0001\u0000\u0000\u0000\u048b\u0487\u0001\u0000\u0000\u0000\u048b\u0488"+
		"\u0001\u0000\u0000\u0000\u048b\u0489\u0001\u0000\u0000\u0000\u048b\u048a"+
		"\u0001\u0000\u0000\u0000\u048c\u048f\u0001\u0000\u0000\u0000\u048d\u048b"+
		"\u0001\u0000\u0000\u0000\u048d\u048e\u0001\u0000\u0000\u0000\u048e\u0490"+
		"\u0001\u0000\u0000\u0000\u048f\u048d\u0001\u0000\u0000\u0000\u0490\u0491"+
		"\u0005Y\u0000\u0000\u0491\u00bb\u0001\u0000\u0000\u0000\u0492\u049d\u0003"+
		"\u0098L\u0000\u0493\u049d\u0003f3\u0000\u0494\u049d\u0003r9\u0000\u0495"+
		"\u049d\u0003\u00dcn\u0000\u0496\u049d\u0003\u00e0p\u0000\u0497\u049d\u0003"+
		"\u00c0`\u0000\u0498\u049d\u0003\u00e6s\u0000\u0499\u049d\u0003\u00e8t"+
		"\u0000\u049a\u049d\u0003\u00eau\u0000\u049b\u049d\u0003\u00b6[\u0000\u049c"+
		"\u0492\u0001\u0000\u0000\u0000\u049c\u0493\u0001\u0000\u0000\u0000\u049c"+
		"\u0494\u0001\u0000\u0000\u0000\u049c\u0495\u0001\u0000\u0000\u0000\u049c"+
		"\u0496\u0001\u0000\u0000\u0000\u049c\u0497\u0001\u0000\u0000\u0000\u049c"+
		"\u0498\u0001\u0000\u0000\u0000\u049c\u0499\u0001\u0000\u0000\u0000\u049c"+
		"\u049a\u0001\u0000\u0000\u0000\u049c\u049b\u0001\u0000\u0000\u0000\u049d"+
		"\u00bd\u0001\u0000\u0000\u0000\u049e\u04a2\u0005X\u0000\u0000\u049f\u04a1"+
		"\u0003\u00bc^\u0000\u04a0\u049f\u0001\u0000\u0000\u0000\u04a1\u04a4\u0001"+
		"\u0000\u0000\u0000\u04a2\u04a0\u0001\u0000\u0000\u0000\u04a2\u04a3\u0001"+
		"\u0000\u0000\u0000\u04a3\u04a5\u0001\u0000\u0000\u0000\u04a4\u04a2\u0001"+
		"\u0000\u0000\u0000\u04a5\u04a6\u0005Y\u0000\u0000\u04a6\u00bf\u0001\u0000"+
		"\u0000\u0000\u04a7\u04a8\u0005\u007f\u0000\u0000\u04a8\u04a9\u0003\u00c2"+
		"a\u0000\u04a9\u04aa\u0003\u00be_\u0000\u04aa\u00c1\u0001\u0000\u0000\u0000"+
		"\u04ab\u04b0\u0003\u00c6c\u0000\u04ac\u04b0\u0003\u00c8d\u0000\u04ad\u04b0"+
		"\u0003\u00cae\u0000\u04ae\u04b0\u0003\u00c4b\u0000\u04af\u04ab\u0001\u0000"+
		"\u0000\u0000\u04af\u04ac\u0001\u0000\u0000\u0000\u04af\u04ad\u0001\u0000"+
		"\u0000\u0000\u04af\u04ae\u0001\u0000\u0000\u0000\u04b0\u00c3\u0001\u0000"+
		"\u0000\u0000\u04b1\u04b2\u0005V\u0000\u0000\u04b2\u04b3\u0003\u00c2a\u0000"+
		"\u04b3\u04b4\u0005W\u0000\u0000\u04b4\u04b8\u0001\u0000\u0000\u0000\u04b5"+
		"\u04b8\u0003\u00ccf\u0000\u04b6\u04b8\u0003\u00ceg\u0000\u04b7\u04b1\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b5\u0001\u0000\u0000\u0000\u04b7\u04b6\u0001"+
		"\u0000\u0000\u0000\u04b8\u00c5\u0001\u0000\u0000\u0000\u04b9\u04ba\u0005"+
		"t\u0000\u0000\u04ba\u04bb\u0005d\u0000\u0000\u04bb\u04bc\u0003\u00c4b"+
		"\u0000\u04bc\u00c7\u0001\u0000\u0000\u0000\u04bd\u04c2\u0003\u00c4b\u0000"+
		"\u04be\u04bf\u0005d\u0000\u0000\u04bf\u04c0\u0005u\u0000\u0000\u04c0\u04c1"+
		"\u0005d\u0000\u0000\u04c1\u04c3\u0003\u00c4b\u0000\u04c2\u04be\u0001\u0000"+
		"\u0000\u0000\u04c3\u04c4\u0001\u0000\u0000\u0000\u04c4\u04c2\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000\u04c5\u00c9\u0001\u0000"+
		"\u0000\u0000\u04c6\u04cb\u0003\u00c4b\u0000\u04c7\u04c8\u0005d\u0000\u0000"+
		"\u04c8\u04c9\u0005\u0080\u0000\u0000\u04c9\u04ca\u0005d\u0000\u0000\u04ca"+
		"\u04cc\u0003\u00c4b\u0000\u04cb\u04c7\u0001\u0000\u0000\u0000\u04cc\u04cd"+
		"\u0001\u0000\u0000\u0000\u04cd\u04cb\u0001\u0000\u0000\u0000\u04cd\u04ce"+
		"\u0001\u0000\u0000\u0000\u04ce\u00cb\u0001\u0000\u0000\u0000\u04cf\u04d0"+
		"\u0005V\u0000\u0000\u04d0\u04d1\u0003\u009cN\u0000\u04d1\u04d2\u0005W"+
		"\u0000\u0000\u04d2\u00cd\u0001\u0000\u0000\u0000\u04d3\u04d8\u0007\t\u0000"+
		"\u0000\u04d4\u04d7\u0003\u00b4Z\u0000\u04d5\u04d7\u0003\u00b8\\\u0000"+
		"\u04d6\u04d4\u0001\u0000\u0000\u0000\u04d6\u04d5\u0001\u0000\u0000\u0000"+
		"\u04d7\u04da\u0001\u0000\u0000\u0000\u04d8\u04d6\u0001\u0000\u0000\u0000"+
		"\u04d8\u04d9\u0001\u0000\u0000\u0000\u04d9\u04db\u0001\u0000\u0000\u0000"+
		"\u04da\u04d8\u0001\u0000\u0000\u0000\u04db\u04dc\u0005W\u0000\u0000\u04dc"+
		"\u00cf\u0001\u0000\u0000\u0000\u04dd\u04de\u0005q\u0000\u0000\u04de\u04df"+
		"\u0005z\u0000\u0000\u04df\u04e2\u0005W\u0000\u0000\u04e0\u04e2\u0005c"+
		"\u0000\u0000\u04e1\u04dd\u0001\u0000\u0000\u0000\u04e1\u04e0\u0001\u0000"+
		"\u0000\u0000\u04e2\u00d1\u0001\u0000\u0000\u0000\u04e3\u04e4\u0005\u008b"+
		"\u0000\u0000\u04e4\u04e5\u0005\u008a\u0000\u0000\u04e5\u04e6\u0005W\u0000"+
		"\u0000\u04e6\u00d3\u0001\u0000\u0000\u0000\u04e7\u04e8\u0005\u0084\u0000"+
		"\u0000\u04e8\u04e9\u0003\u00d6k\u0000\u04e9\u04ea\u0005W\u0000\u0000\u04ea"+
		"\u00d5\u0001\u0000\u0000\u0000\u04eb\u04f2\u0003\u00d8l\u0000\u04ec\u04ed"+
		"\u0005d\u0000\u0000\u04ed\u04ee\u0007\b\u0000\u0000\u04ee\u04ef\u0005"+
		"d\u0000\u0000\u04ef\u04f1\u0003\u00d8l\u0000\u04f0\u04ec\u0001\u0000\u0000"+
		"\u0000\u04f1\u04f4\u0001\u0000\u0000\u0000\u04f2\u04f0\u0001\u0000\u0000"+
		"\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u00d7\u0001\u0000\u0000"+
		"\u0000\u04f4\u04f2\u0001\u0000\u0000\u0000\u04f5\u04fc\u0003\u00dam\u0000"+
		"\u04f6\u04f7\u0005^\u0000\u0000\u04f7\u04fb\u0003\u00dam\u0000\u04f8\u04f9"+
		"\u0005_\u0000\u0000\u04f9\u04fb\u0003\u00acV\u0000\u04fa\u04f6\u0001\u0000"+
		"\u0000\u0000\u04fa\u04f8\u0001\u0000\u0000\u0000\u04fb\u04fe\u0001\u0000"+
		"\u0000\u0000\u04fc\u04fa\u0001\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000"+
		"\u0000\u0000\u04fd\u00d9\u0001\u0000\u0000\u0000\u04fe\u04fc\u0001\u0000"+
		"\u0000\u0000\u04ff\u0508\u0003\u00acV\u0000\u0500\u0508\u0003\u00b0X\u0000"+
		"\u0501\u0508\u0003\u00b2Y\u0000\u0502\u0508\u0003\u00aeW\u0000\u0503\u0504"+
		"\u0005V\u0000\u0000\u0504\u0505\u0003\u00d6k\u0000\u0505\u0506\u0005W"+
		"\u0000\u0000\u0506\u0508\u0001\u0000\u0000\u0000\u0507\u04ff\u0001\u0000"+
		"\u0000\u0000\u0507\u0500\u0001\u0000\u0000\u0000\u0507\u0501\u0001\u0000"+
		"\u0000\u0000\u0507\u0502\u0001\u0000\u0000\u0000\u0507\u0503\u0001\u0000"+
		"\u0000\u0000\u0508\u00db\u0001\u0000\u0000\u0000\u0509\u050a\u0005~\u0000"+
		"\u0000\u050a\u050c\u0005X\u0000\u0000\u050b\u050d\u0003\u00deo\u0000\u050c"+
		"\u050b\u0001\u0000\u0000\u0000\u050c\u050d\u0001\u0000\u0000\u0000\u050d"+
		"\u0514\u0001\u0000\u0000\u0000\u050e\u0510\u0005Z\u0000\u0000\u050f\u0511"+
		"\u0003\u00deo\u0000\u0510\u050f\u0001\u0000\u0000\u0000\u0510\u0511\u0001"+
		"\u0000\u0000\u0000\u0511\u0513\u0001\u0000\u0000\u0000\u0512\u050e\u0001"+
		"\u0000\u0000\u0000\u0513\u0516\u0001\u0000\u0000\u0000\u0514\u0512\u0001"+
		"\u0000\u0000\u0000\u0514\u0515\u0001\u0000\u0000\u0000\u0515\u0517\u0001"+
		"\u0000\u0000\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0517\u0518\u0005"+
		"Y\u0000\u0000\u0518\u00dd\u0001\u0000\u0000\u0000\u0519\u051a\u0003\u0096"+
		"K\u0000\u051a\u051b\u0005\\\u0000\u0000\u051b\u051c\u0003\u00a2Q\u0000"+
		"\u051c\u0522\u0001\u0000\u0000\u0000\u051d\u051e\u0003\u0096K\u0000\u051e"+
		"\u051f\u0005\\\u0000\u0000\u051f\u0520\u0003\u00a0P\u0000\u0520\u0522"+
		"\u0001\u0000\u0000\u0000\u0521\u0519\u0001\u0000\u0000\u0000\u0521\u051d"+
		"\u0001\u0000\u0000\u0000\u0522\u00df\u0001\u0000\u0000\u0000\u0523\u0524"+
		"\u0005\u0081\u0000\u0000\u0524\u0525\u0005d\u0000\u0000\u0525\u0526\u0003"+
		"\u00f6{\u0000\u0526\u052a\u0005X\u0000\u0000\u0527\u0529\u0003\u00e2q"+
		"\u0000\u0528\u0527\u0001\u0000\u0000\u0000\u0529\u052c\u0001\u0000\u0000"+
		"\u0000\u052a\u0528\u0001\u0000\u0000\u0000\u052a\u052b\u0001\u0000\u0000"+
		"\u0000\u052b\u052d\u0001\u0000\u0000\u0000\u052c\u052a\u0001\u0000\u0000"+
		"\u0000\u052d\u052e\u0005Y\u0000\u0000\u052e\u00e1\u0001\u0000\u0000\u0000"+
		"\u052f\u0530\u0003\u00e4r\u0000\u0530\u0532\u0005X\u0000\u0000\u0531\u0533"+
		"\u0003\u009aM\u0000\u0532\u0531\u0001\u0000\u0000\u0000\u0532\u0533\u0001"+
		"\u0000\u0000\u0000\u0533\u0534\u0001\u0000\u0000\u0000\u0534\u0535\u0005"+
		"Y\u0000\u0000\u0535\u00e3\u0001\u0000\u0000\u0000\u0536\u053b\u0007\n"+
		"\u0000\u0000\u0537\u0538\u0005R\u0000\u0000\u0538\u053a\u0007\n\u0000"+
		"\u0000\u0539\u0537\u0001\u0000\u0000\u0000\u053a\u053d\u0001\u0000\u0000"+
		"\u0000\u053b\u0539\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000"+
		"\u0000\u053c\u00e5\u0001\u0000\u0000\u0000\u053d\u053b\u0001\u0000\u0000"+
		"\u0000\u053e\u053f\u0005\u0085\u0000\u0000\u053f\u0541\u0005X\u0000\u0000"+
		"\u0540\u0542\u0003\u009aM\u0000\u0541\u0540\u0001\u0000\u0000\u0000\u0541"+
		"\u0542\u0001\u0000\u0000\u0000\u0542\u0543\u0001\u0000\u0000\u0000\u0543"+
		"\u0544\u0005Y\u0000\u0000\u0544\u00e7\u0001\u0000\u0000\u0000\u0545\u0546"+
		"\u0005\u0086\u0000\u0000\u0546\u0547\u0003\u00f6{\u0000\u0547\u0549\u0005"+
		"X\u0000\u0000\u0548\u054a\u0003\u009aM\u0000\u0549\u0548\u0001\u0000\u0000"+
		"\u0000\u0549\u054a\u0001\u0000\u0000\u0000\u054a\u054b\u0001\u0000\u0000"+
		"\u0000\u054b\u054c\u0005Y\u0000\u0000\u054c\u00e9\u0001\u0000\u0000\u0000"+
		"\u054d\u054e\u0005\u0087\u0000\u0000\u054e\u054f\u0003\u00ecv\u0000\u054f"+
		"\u0553\u0005X\u0000\u0000\u0550\u0552\u0003\u00f0x\u0000\u0551\u0550\u0001"+
		"\u0000\u0000\u0000\u0552\u0555\u0001\u0000\u0000\u0000\u0553\u0551\u0001"+
		"\u0000\u0000\u0000\u0553\u0554\u0001\u0000\u0000\u0000\u0554\u0556\u0001"+
		"\u0000\u0000\u0000\u0555\u0553\u0001\u0000\u0000\u0000\u0556\u0557\u0005"+
		"Y\u0000\u0000\u0557\u00eb\u0001\u0000\u0000\u0000\u0558\u055d\u0003\u00ee"+
		"w\u0000\u0559\u055a\u0005R\u0000\u0000\u055a\u055c\u0003\u00eew\u0000"+
		"\u055b\u0559\u0001\u0000\u0000\u0000\u055c\u055f\u0001\u0000\u0000\u0000"+
		"\u055d\u055b\u0001\u0000\u0000\u0000\u055d\u055e\u0001\u0000\u0000\u0000"+
		"\u055e\u00ed\u0001\u0000\u0000\u0000\u055f\u055d\u0001\u0000\u0000\u0000"+
		"\u0560\u0569\u0005z\u0000\u0000\u0561\u0565\u0003\u00f6{\u0000\u0562\u0564"+
		"\u0003\u00f6{\u0000\u0563\u0562\u0001\u0000\u0000\u0000\u0564\u0567\u0001"+
		"\u0000\u0000\u0000\u0565\u0563\u0001\u0000\u0000\u0000\u0565\u0566\u0001"+
		"\u0000\u0000\u0000\u0566\u0569\u0001\u0000\u0000\u0000\u0567\u0565\u0001"+
		"\u0000\u0000\u0000\u0568\u0560\u0001\u0000\u0000\u0000\u0568\u0561\u0001"+
		"\u0000\u0000\u0000\u0569\u00ef\u0001\u0000\u0000\u0000\u056a\u056b\u0003"+
		"\u00f2y\u0000\u056b\u056d\u0005X\u0000\u0000\u056c\u056e\u0003\u00f4z"+
		"\u0000\u056d\u056c\u0001\u0000\u0000\u0000\u056d\u056e\u0001\u0000\u0000"+
		"\u0000\u056e\u0575\u0001\u0000\u0000\u0000\u056f\u0571\u0005Z\u0000\u0000"+
		"\u0570\u0572\u0003\u00f4z\u0000\u0571\u0570\u0001\u0000\u0000\u0000\u0571"+
		"\u0572\u0001\u0000\u0000\u0000\u0572\u0574\u0001\u0000\u0000\u0000\u0573"+
		"\u056f\u0001\u0000\u0000\u0000\u0574\u0577\u0001\u0000\u0000\u0000\u0575"+
		"\u0573\u0001\u0000\u0000\u0000\u0575\u0576\u0001\u0000\u0000\u0000\u0576"+
		"\u0578\u0001\u0000\u0000\u0000\u0577\u0575\u0001\u0000\u0000\u0000\u0578"+
		"\u0579\u0005Y\u0000\u0000\u0579\u00f1\u0001\u0000\u0000\u0000\u057a\u057b"+
		"\u0005\u0089\u0000\u0000\u057b\u00f3\u0001\u0000\u0000\u0000\u057c\u057d"+
		"\u0003\u00f6{\u0000\u057d\u057e\u0005\\\u0000\u0000\u057e\u0582\u0003"+
		"\u00acV\u0000\u057f\u0581\u0003\u00acV\u0000\u0580\u057f\u0001\u0000\u0000"+
		"\u0000\u0581\u0584\u0001\u0000\u0000\u0000\u0582\u0580\u0001\u0000\u0000"+
		"\u0000\u0582\u0583\u0001\u0000\u0000\u0000\u0583\u00f5\u0001\u0000\u0000"+
		"\u0000\u0584\u0582\u0001\u0000\u0000\u0000\u0585\u0586\u0007\u000b\u0000"+
		"\u0000\u0586\u00f7\u0001\u0000\u0000\u0000\u0587\u058a\u0003\u00fa}\u0000"+
		"\u0588\u058a\u0003\u00fc~\u0000\u0589\u0587\u0001\u0000\u0000\u0000\u0589"+
		"\u0588\u0001\u0000\u0000\u0000\u058a\u00f9\u0001\u0000\u0000\u0000\u058b"+
		"\u058c\u00058\u0000\u0000\u058c\u058d\u0003\u010c\u0086\u0000\u058d\u058e"+
		"\u0005\u008f\u0000\u0000\u058e\u00fb\u0001\u0000\u0000\u0000\u058f\u0594"+
		"\u0003\u00fe\u007f\u0000\u0590\u0594\u0003\u0104\u0082\u0000\u0591\u0594"+
		"\u0003\u0106\u0083\u0000\u0592\u0594\u0003\u0108\u0084\u0000\u0593\u058f"+
		"\u0001\u0000\u0000\u0000\u0593\u0590\u0001\u0000\u0000\u0000\u0593\u0591"+
		"\u0001\u0000\u0000\u0000\u0593\u0592\u0001\u0000\u0000\u0000\u0594\u00fd"+
		"\u0001\u0000\u0000\u0000\u0595\u0596\u00059\u0000\u0000\u0596\u0597\u0005"+
		"\u000b\u0000\u0000\u0597\u0598\u0003\u010c\u0086\u0000\u0598\u059c\u0005"+
		"\u00ab\u0000\u0000\u0599\u059b\u0003\u00f8|\u0000\u059a\u0599\u0001\u0000"+
		"\u0000\u0000\u059b\u059e\u0001\u0000\u0000\u0000\u059c\u059a\u0001\u0000"+
		"\u0000\u0000\u059c\u059d\u0001\u0000\u0000\u0000\u059d\u05a2\u0001\u0000"+
		"\u0000\u0000\u059e\u059c\u0001\u0000\u0000\u0000\u059f\u05a1\u0003\u0100"+
		"\u0080\u0000\u05a0\u059f\u0001\u0000\u0000\u0000\u05a1\u05a4\u0001\u0000"+
		"\u0000\u0000\u05a2\u05a0\u0001\u0000\u0000\u0000\u05a2\u05a3\u0001\u0000"+
		"\u0000\u0000\u05a3\u05a6\u0001\u0000\u0000\u0000\u05a4\u05a2\u0001\u0000"+
		"\u0000\u0000\u05a5\u05a7\u0003\u0102\u0081\u0000\u05a6\u05a5\u0001\u0000"+
		"\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000\u0000\u05a7\u05a8\u0001\u0000"+
		"\u0000\u0000\u05a8\u05a9\u00059\u0000\u0000\u05a9\u05aa\u0005\u00af\u0000"+
		"\u0000\u05aa\u05ab\u0005\u00ab\u0000\u0000\u05ab\u00ff\u0001\u0000\u0000"+
		"\u0000\u05ac\u05ad\u00059\u0000\u0000\u05ad\u05ae\u0005\f\u0000\u0000"+
		"\u05ae\u05af\u0003\u010c\u0086\u0000\u05af\u05b3\u0005\u00ab\u0000\u0000"+
		"\u05b0\u05b2\u0003\u00f8|\u0000\u05b1\u05b0\u0001\u0000\u0000\u0000\u05b2"+
		"\u05b5\u0001\u0000\u0000\u0000\u05b3\u05b1\u0001\u0000\u0000\u0000\u05b3"+
		"\u05b4\u0001\u0000\u0000\u0000\u05b4\u0101\u0001\u0000\u0000\u0000\u05b5"+
		"\u05b3\u0001\u0000\u0000\u0000\u05b6\u05b7\u00059\u0000\u0000\u05b7\u05b8"+
		"\u0005\r\u0000\u0000\u05b8\u05bc\u0005\u00ab\u0000\u0000\u05b9\u05bb\u0003"+
		"\u00f8|\u0000\u05ba\u05b9\u0001\u0000\u0000\u0000\u05bb\u05be\u0001\u0000"+
		"\u0000\u0000\u05bc\u05ba\u0001\u0000\u0000\u0000\u05bc\u05bd\u0001\u0000"+
		"\u0000\u0000\u05bd\u0103\u0001\u0000\u0000\u0000\u05be\u05bc\u0001\u0000"+
		"\u0000\u0000\u05bf\u05c0\u00059\u0000\u0000\u05c0\u05c1\u0005\u000e\u0000"+
		"\u0000\u05c1\u05c2\u00051\u0000\u0000\u05c2\u05c3\u0005\u000f\u0000\u0000"+
		"\u05c3\u05c4\u0003\u010c\u0086\u0000\u05c4\u05c8\u0005\u00ab\u0000\u0000"+
		"\u05c5\u05c7\u0003\u00f8|\u0000\u05c6\u05c5\u0001\u0000\u0000\u0000\u05c7"+
		"\u05ca\u0001\u0000\u0000\u0000\u05c8\u05c6\u0001\u0000\u0000\u0000\u05c8"+
		"\u05c9\u0001\u0000\u0000\u0000\u05c9\u05cb\u0001\u0000\u0000\u0000\u05ca"+
		"\u05c8\u0001\u0000\u0000\u0000\u05cb\u05cc\u00059\u0000\u0000\u05cc\u05cd"+
		"\u0005\u00b2\u0000\u0000\u05cd\u05ce\u0005\u00ab\u0000\u0000\u05ce\u0105"+
		"\u0001\u0000\u0000\u0000\u05cf\u05d0\u00059\u0000\u0000\u05d0\u05d1\u0005"+
		"\u00b3\u0000\u0000\u05d1\u05d2\u00051\u0000\u0000\u05d2\u05d3\u0005\u001e"+
		"\u0000\u0000\u05d3\u05d4\u0003\u010c\u0086\u0000\u05d4\u05d5\u0005\u00ab"+
		"\u0000\u0000\u05d5\u0107\u0001\u0000\u0000\u0000\u05d6\u05d7\u00059\u0000"+
		"\u0000\u05d7\u05d8\u0005\u00b4\u0000\u0000\u05d8\u05d9\u0005\u00ab\u0000"+
		"\u0000\u05d9\u05da\u0003\u010a\u0085\u0000\u05da\u05db\u00059\u0000\u0000"+
		"\u05db\u05dc\u0005\u00b5\u0000\u0000\u05dc\u05dd\u0005\u00ab\u0000\u0000"+
		"\u05dd\u0109\u0001\u0000\u0000\u0000\u05de\u05e0\u0005\u00b4\u0000\u0000"+
		"\u05df\u05de\u0001\u0000\u0000\u0000\u05e0\u05e1\u0001\u0000\u0000\u0000"+
		"\u05e1\u05df\u0001\u0000\u0000\u0000\u05e1\u05e2\u0001\u0000\u0000\u0000"+
		"\u05e2\u010b\u0001\u0000\u0000\u0000\u05e3\u05e4\u0003\u010e\u0087\u0000"+
		"\u05e4\u010d\u0001\u0000\u0000\u0000\u05e5\u05ea\u0003\u0110\u0088\u0000"+
		"\u05e6\u05e7\u0005\u0012\u0000\u0000\u05e7\u05e9\u0003\u0110\u0088\u0000"+
		"\u05e8\u05e6\u0001\u0000\u0000\u0000\u05e9\u05ec\u0001\u0000\u0000\u0000"+
		"\u05ea\u05e8\u0001\u0000\u0000\u0000\u05ea\u05eb\u0001\u0000\u0000\u0000"+
		"\u05eb\u010f\u0001\u0000\u0000\u0000\u05ec\u05ea\u0001\u0000\u0000\u0000"+
		"\u05ed\u05f2\u0003\u0112\u0089\u0000\u05ee\u05ef\u0005\u0011\u0000\u0000"+
		"\u05ef\u05f1\u0003\u0112\u0089\u0000\u05f0\u05ee\u0001\u0000\u0000\u0000"+
		"\u05f1\u05f4\u0001\u0000\u0000\u0000\u05f2\u05f0\u0001\u0000\u0000\u0000"+
		"\u05f2\u05f3\u0001\u0000\u0000\u0000\u05f3\u0111\u0001\u0000\u0000\u0000"+
		"\u05f4\u05f2\u0001\u0000\u0000\u0000\u05f5\u05fa\u0003\u0114\u008a\u0000"+
		"\u05f6\u05f7\u0007\f\u0000\u0000\u05f7\u05f9\u0003\u0114\u008a\u0000\u05f8"+
		"\u05f6\u0001\u0000\u0000\u0000\u05f9\u05fc\u0001\u0000\u0000\u0000\u05fa"+
		"\u05f8\u0001\u0000\u0000\u0000\u05fa\u05fb\u0001\u0000\u0000\u0000\u05fb"+
		"\u0113\u0001\u0000\u0000\u0000\u05fc\u05fa\u0001\u0000\u0000\u0000\u05fd"+
		"\u0602\u0003\u0116\u008b\u0000\u05fe\u05ff\u0007\r\u0000\u0000\u05ff\u0601"+
		"\u0003\u0116\u008b\u0000\u0600\u05fe\u0001\u0000\u0000\u0000\u0601\u0604"+
		"\u0001\u0000\u0000\u0000\u0602\u0600\u0001\u0000\u0000\u0000\u0602\u0603"+
		"\u0001\u0000\u0000\u0000\u0603\u0115\u0001\u0000\u0000\u0000\u0604\u0602"+
		"\u0001\u0000\u0000\u0000\u0605\u060a\u0003\u0118\u008c\u0000\u0606\u0607"+
		"\u0007\u0001\u0000\u0000\u0607\u0609\u0003\u0118\u008c\u0000\u0608\u0606"+
		"\u0001\u0000\u0000\u0000\u0609\u060c\u0001\u0000\u0000\u0000\u060a\u0608"+
		"\u0001\u0000\u0000\u0000\u060a\u060b\u0001\u0000\u0000\u0000\u060b\u0117"+
		"\u0001\u0000\u0000\u0000\u060c\u060a\u0001\u0000\u0000\u0000\u060d\u0612"+
		"\u0003\u011a\u008d\u0000\u060e\u060f\u0007\u000e\u0000\u0000\u060f\u0611"+
		"\u0003\u011a\u008d\u0000\u0610\u060e\u0001\u0000\u0000\u0000\u0611\u0614"+
		"\u0001\u0000\u0000\u0000\u0612\u0610\u0001\u0000\u0000\u0000\u0612\u0613"+
		"\u0001\u0000\u0000\u0000\u0613\u0119\u0001\u0000\u0000\u0000\u0614\u0612"+
		"\u0001\u0000\u0000\u0000\u0615\u0616\u0007\u0001\u0000\u0000\u0616\u0619"+
		"\u0003\u011a\u008d\u0000\u0617\u0619\u0003\u011c\u008e\u0000\u0618\u0615"+
		"\u0001\u0000\u0000\u0000\u0618\u0617\u0001\u0000\u0000\u0000\u0619\u011b"+
		"\u0001\u0000\u0000\u0000\u061a\u061e\u0003\u011e\u008f\u0000\u061b\u061d"+
		"\u0003\u0120\u0090\u0000\u061c\u061b\u0001\u0000\u0000\u0000\u061d\u0620"+
		"\u0001\u0000\u0000\u0000\u061e\u061c\u0001\u0000\u0000\u0000\u061e\u061f"+
		"\u0001\u0000\u0000\u0000\u061f\u011d\u0001\u0000\u0000\u0000\u0620\u061e"+
		"\u0001\u0000\u0000\u0000\u0621\u0629\u00051\u0000\u0000\u0622\u0629\u0005"+
		"2\u0000\u0000\u0623\u0629\u00053\u0000\u0000\u0624\u0625\u0005\u00a4\u0000"+
		"\u0000\u0625\u0626\u0003\u010c\u0086\u0000\u0626\u0627\u0005\u00a5\u0000"+
		"\u0000\u0627\u0629\u0001\u0000\u0000\u0000\u0628\u0621\u0001\u0000\u0000"+
		"\u0000\u0628\u0622\u0001\u0000\u0000\u0000\u0628\u0623\u0001\u0000\u0000"+
		"\u0000\u0628\u0624\u0001\u0000\u0000\u0000\u0629\u011f\u0001\u0000\u0000"+
		"\u0000\u062a\u062b\u00050\u0000\u0000\u062b\u063d\u00051\u0000\u0000\u062c"+
		"\u062d\u0005,\u0000\u0000\u062d\u062e\u0003\u010c\u0086\u0000\u062e\u062f"+
		"\u0005-\u0000\u0000\u062f\u063d\u0001\u0000\u0000\u0000\u0630\u0639\u0005"+
		"\u00a4\u0000\u0000\u0631\u0636\u0003\u010c\u0086\u0000\u0632\u0633\u0005"+
		"\u001d\u0000\u0000\u0633\u0635\u0003\u010c\u0086\u0000\u0634\u0632\u0001"+
		"\u0000\u0000\u0000\u0635\u0638\u0001\u0000\u0000\u0000\u0636\u0634\u0001"+
		"\u0000\u0000\u0000\u0636\u0637\u0001\u0000\u0000\u0000\u0637\u063a\u0001"+
		"\u0000\u0000\u0000\u0638\u0636\u0001\u0000\u0000\u0000\u0639\u0631\u0001"+
		"\u0000\u0000\u0000\u0639\u063a\u0001\u0000\u0000\u0000\u063a\u063b\u0001"+
		"\u0000\u0000\u0000\u063b\u063d\u0005\u00a5\u0000\u0000\u063c\u062a\u0001"+
		"\u0000\u0000\u0000\u063c\u062c\u0001\u0000\u0000\u0000\u063c\u0630\u0001"+
		"\u0000\u0000\u0000\u063d\u0121\u0001\u0000\u0000\u0000\u00bc\u0124\u0126"+
		"\u012d\u0134\u0137\u0141\u0146\u014c\u0156\u015b\u015d\u0162\u0168\u016f"+
		"\u0176\u017c\u0183\u018c\u0195\u019b\u019e\u01a7\u01ae\u01b7\u01c5\u01cb"+
		"\u01cf\u01d9\u01dd\u01e4\u01ee\u01f6\u01fc\u0204\u0210\u0217\u021f\u0225"+
		"\u022d\u0232\u023b\u0242\u0249\u024e\u0253\u0256\u0260\u0263\u026d\u027a"+
		"\u0282\u0289\u028f\u029d\u02a2\u02a7\u02ad\u02b2\u02b9\u02be\u02c5\u02ca"+
		"\u02d1\u02d6\u02e0\u02e5\u02ed\u02f3\u02f9\u02fb\u02ff\u0303\u0308\u030c"+
		"\u030e\u031b\u031e\u0321\u0328\u0330\u0333\u033b\u0343\u0347\u034b\u034f"+
		"\u035c\u0365\u036c\u0373\u0375\u037d\u037f\u0381\u0384\u038a\u0391\u039a"+
		"\u03a0\u03a2\u03a8\u03ac\u03b9\u03bd\u03c9\u03cf\u03d7\u03dc\u03e3\u03e8"+
		"\u03eb\u03f0\u03f6\u03fa\u0401\u0407\u040e\u0410\u0414\u0419\u0429\u0436"+
		"\u043b\u0440\u0445\u0458\u045a\u0461\u0463\u046a\u046c\u0470\u0476\u047b"+
		"\u0482\u048b\u048d\u049c\u04a2\u04af\u04b7\u04c4\u04cd\u04d6\u04d8\u04e1"+
		"\u04f2\u04fa\u04fc\u0507\u050c\u0510\u0514\u0521\u052a\u0532\u053b\u0541"+
		"\u0549\u0553\u055d\u0565\u0568\u056d\u0571\u0575\u0582\u0589\u0593\u059c"+
		"\u05a2\u05a6\u05b3\u05bc\u05c8\u05e1\u05ea\u05f2\u05fa\u0602\u060a\u0612"+
		"\u0618\u061e\u0628\u0636\u0639\u063c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}