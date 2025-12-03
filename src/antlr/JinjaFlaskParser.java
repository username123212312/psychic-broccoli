// Generated from C:/Users/center/psychic-broccoli/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.2
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
		CSS_SEMICOLON=84, CSS_UNDERSCORE=85, CSS_PIPE=86, CSS_LPAREN=87, CSS_RPAREN=88, 
		CSS_COMMA=89, CSS_DOT=90, CSS_SLASH=91, CSS_PERCENT=92, CSS_PLUS=93, CSS_MINUS=94, 
		CSS_GREATER=95, CSS_TILDE=96, CSS_EQUALS=97, CSS_LBRACKET=98, CSS_RBRACKET=99, 
		CSS_ASTERISK=100, Comment=101, Url=102, Space=103, Cdo=104, Cdc=105, Includes=106, 
		DashMatch=107, Hash=108, Import=109, Page=110, Media=111, Namespace=112, 
		Charset=113, Important=114, Percentage=115, Url_=116, UnicodeRange=117, 
		MediaOnly=118, Not=119, And=120, Dimension=121, UnknownDimension=122, 
		PseudoNot=123, Number=124, String_=125, PrefixMatch=126, SuffixMatch=127, 
		SubstringMatch=128, FontFace=129, Supports=130, Or=131, Keyframes=132, 
		From=133, To=134, Calc=135, Viewport=136, CounterStyle=137, FontFeatureValues=138, 
		DxImageTransform=139, AtKeyword=140, Variable=141, Var=142, Ident=143, 
		Function_=144, UnexpectedCharacter=145, JINJA_EXPR_END=146, J_WS=147, 
		J_NUMBER=148, J_STRING=149, J_NAME=150, J_PLUS=151, J_MINUS=152, J_TIMES=153, 
		J_DIVIDE=154, J_MOD=155, J_POW=156, J_EQ=157, J_NE=158, J_LE=159, J_LT=160, 
		J_GE=161, J_GT=162, J_ASSIGN=163, J_DOT=164, J_COMMA=165, J_PIPE=166, 
		J_LPAREN=167, J_RPAREN=168, J_LBRACK=169, J_RBRACK=170, J_LBRACE=171, 
		J_RBRACE=172, J_COLON=173, JINJA_STMT_END=174, J_IF=175, J_ELIF=176, J_ELSE=177, 
		J_ENDIF=178, J_FOR=179, J_IN=180, J_ENDFOR=181, J_SET=182, J_RAW=183, 
		J_ENDRAW=184, J_OR=185, J_AND=186, J_NOT=187, J_WS_STMT=188, J_NUMBER_STMT=189, 
		J_STRING_STMT=190, J_NAME_STMT=191, J_PLUS_STMT=192, J_MINUS_STMT=193, 
		J_TIMES_STMT=194, J_DIVIDE_STMT=195, J_MOD_STMT=196, J_POW_STMT=197, J_EQ_STMT=198, 
		J_NE_STMT=199, J_LE_STMT=200, J_LT_STMT=201, J_GE_STMT=202, J_GT_STMT=203, 
		J_ASSIGN_STMT=204, J_DOT_STMT=205, J_COMMA_STMT=206, J_PIPE_STMT=207, 
		J_LPAREN_STMT=208, J_RPAREN_STMT=209, J_LBRACK_STMT=210, J_RBRACK_STMT=211, 
		JINJA_COMMENT_END=212, JINJA_COMMENT_CONTENT=213;
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
		RULE_style_content = 46, RULE_stylesheet = 47, RULE_charset = 48, RULE_imports = 49, 
		RULE_namespace_ = 50, RULE_namespacePrefix = 51, RULE_media = 52, RULE_mediaQueryList = 53, 
		RULE_mediaQuery = 54, RULE_mediaType = 55, RULE_mediaExpression = 56, 
		RULE_mediaFeature = 57, RULE_page = 58, RULE_pseudoPage = 59, RULE_selectorGroup = 60, 
		RULE_selector = 61, RULE_combinator = 62, RULE_simpleSelectorSequence = 63, 
		RULE_typeSelector = 64, RULE_typeNamespacePrefix = 65, RULE_elementName = 66, 
		RULE_universal = 67, RULE_className = 68, RULE_attrib = 69, RULE_pseudo = 70, 
		RULE_functionalPseudo = 71, RULE_expression = 72, RULE_negation = 73, 
		RULE_negationArg = 74, RULE_operator_ = 75, RULE_property_ = 76, RULE_ruleset = 77, 
		RULE_declarationList = 78, RULE_declaration = 79, RULE_prio = 80, RULE_value = 81, 
		RULE_css_expr = 82, RULE_css_term = 83, RULE_function_ = 84, RULE_dxImageTransform = 85, 
		RULE_hexcolor = 86, RULE_number = 87, RULE_percentage = 88, RULE_dimension = 89, 
		RULE_unknownDimension = 90, RULE_any_ = 91, RULE_atRule = 92, RULE_unused = 93, 
		RULE_block = 94, RULE_nestedStatement = 95, RULE_groupRuleBody = 96, RULE_supportsRule = 97, 
		RULE_supportsCondition = 98, RULE_supportsConditionInParens = 99, RULE_supportsNegation = 100, 
		RULE_supportsConjunction = 101, RULE_supportsDisjunction = 102, RULE_supportsDeclarationCondition = 103, 
		RULE_generalEnclosed = 104, RULE_url = 105, RULE_var_ = 106, RULE_calc = 107, 
		RULE_calcSum = 108, RULE_calcProduct = 109, RULE_calcValue = 110, RULE_fontFaceRule = 111, 
		RULE_fontFaceDeclaration = 112, RULE_keyframesRule = 113, RULE_keyframeBlock = 114, 
		RULE_keyframeSelector = 115, RULE_viewport = 116, RULE_counterStyle = 117, 
		RULE_fontFeatureValuesRule = 118, RULE_fontFamilyNameList = 119, RULE_fontFamilyName = 120, 
		RULE_featureValueBlock = 121, RULE_featureType = 122, RULE_featureValueDefinition = 123, 
		RULE_ident = 124, RULE_css_ws = 125, RULE_jinjaStatement = 126, RULE_jStatement = 127, 
		RULE_jRawStatement = 128, RULE_jIfStatement = 129, RULE_jForStatement = 130, 
		RULE_jTargetList = 131, RULE_jinjaExpression = 132, RULE_jExpression = 133, 
		RULE_jFilter = 134, RULE_jTestExpr = 135, RULE_jOrTest = 136, RULE_jAndTest = 137, 
		RULE_jNotTest = 138, RULE_jComparison = 139, RULE_jCompOp = 140, RULE_jMathExpr = 141, 
		RULE_jTerm = 142, RULE_jFactor = 143, RULE_jAtomExpr = 144, RULE_jTrailer = 145, 
		RULE_jAtom = 146, RULE_jTestExprList = 147, RULE_jArgumentList = 148, 
		RULE_jDictMaker = 149;
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
			"stylesheet", "charset", "imports", "namespace_", "namespacePrefix", 
			"media", "mediaQueryList", "mediaQuery", "mediaType", "mediaExpression", 
			"mediaFeature", "page", "pseudoPage", "selectorGroup", "selector", "combinator", 
			"simpleSelectorSequence", "typeSelector", "typeNamespacePrefix", "elementName", 
			"universal", "className", "attrib", "pseudo", "functionalPseudo", "expression", 
			"negation", "negationArg", "operator_", "property_", "ruleset", "declarationList", 
			"declaration", "prio", "value", "css_expr", "css_term", "function_", 
			"dxImageTransform", "hexcolor", "number", "percentage", "dimension", 
			"unknownDimension", "any_", "atRule", "unused", "block", "nestedStatement", 
			"groupRuleBody", "supportsRule", "supportsCondition", "supportsConditionInParens", 
			"supportsNegation", "supportsConjunction", "supportsDisjunction", "supportsDeclarationCondition", 
			"generalEnclosed", "url", "var_", "calc", "calcSum", "calcProduct", "calcValue", 
			"fontFaceRule", "fontFaceDeclaration", "keyframesRule", "keyframeBlock", 
			"keyframeSelector", "viewport", "counterStyle", "fontFeatureValuesRule", 
			"fontFamilyNameList", "fontFamilyName", "featureValueBlock", "featureType", 
			"featureValueDefinition", "ident", "css_ws", "jinjaStatement", "jStatement", 
			"jRawStatement", "jIfStatement", "jForStatement", "jTargetList", "jinjaExpression", 
			"jExpression", "jFilter", "jTestExpr", "jOrTest", "jAndTest", "jNotTest", 
			"jComparison", "jCompOp", "jMathExpr", "jTerm", "jFactor", "jAtomExpr", 
			"jTrailer", "jAtom", "jTestExprList", "jArgumentList", "jDictMaker"
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
			null, null, null, null, null, null, null, null, null, "'_'", null, null, 
			null, null, null, null, null, null, null, null, "'~'", null, null, null, 
			null, null, null, null, "'<!--'", "'-->'", "'~='", "'|='", null, null, 
			null, null, null, "'@charset '", null, null, "'url('", null, null, null, 
			null, null, null, null, null, null, "'^='", "'$='", "'*='", null, null, 
			null, null, null, null, "'calc('", null, null, null, null, null, null, 
			"'var('", null, null, null, "'}}'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'%}'", null, null, 
			null, "'endif'", null, null, "'endfor'", "'set'", "'raw'", "'endraw'", 
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
			"CSS_RBRACE", "CSS_COLON", "CSS_SEMICOLON", "CSS_UNDERSCORE", "CSS_PIPE", 
			"CSS_LPAREN", "CSS_RPAREN", "CSS_COMMA", "CSS_DOT", "CSS_SLASH", "CSS_PERCENT", 
			"CSS_PLUS", "CSS_MINUS", "CSS_GREATER", "CSS_TILDE", "CSS_EQUALS", "CSS_LBRACKET", 
			"CSS_RBRACKET", "CSS_ASTERISK", "Comment", "Url", "Space", "Cdo", "Cdc", 
			"Includes", "DashMatch", "Hash", "Import", "Page", "Media", "Namespace", 
			"Charset", "Important", "Percentage", "Url_", "UnicodeRange", "MediaOnly", 
			"Not", "And", "Dimension", "UnknownDimension", "PseudoNot", "Number", 
			"String_", "PrefixMatch", "SuffixMatch", "SubstringMatch", "FontFace", 
			"Supports", "Or", "Keyframes", "From", "To", "Calc", "Viewport", "CounterStyle", 
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
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033421310495688L) != 0)) {
				{
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(300);
					statement();
					}
					break;
				case 2:
					{
					setState(301);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
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
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case IF:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
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
				setState(310);
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
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420974949248L) != 0)) {
				{
				setState(313);
				small_stmt();
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314);
						match(SEMI);
						setState(315);
						small_stmt();
						}
						} 
					}
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
			}

			setState(323);
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
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				assign_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				import_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				return_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				global_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(330);
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
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				if_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				func_def();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
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
			setState(338);
			match(NAME);
			setState(339);
			match(ASSIGN);
			setState(342);
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
				setState(340);
				test();
				}
				break;
			case TRIPLE_DOUBLE_START:
			case TRIPLE_SINGLE_START:
				{
				setState(341);
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
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIPLE_DOUBLE_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(TRIPLE_DOUBLE_START);
				setState(345);
				html_content();
				setState(346);
				match(TRIPLE_DOUBLE_END);
				}
				break;
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(TRIPLE_SINGLE_START);
				setState(349);
				html_content();
				setState(350);
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
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 15843L) != 0)) {
				{
				setState(358);
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
					setState(354);
					htmlElement();
					}
					break;
				case JINJA_STMT_START:
					{
					setState(355);
					jinjaStatement();
					}
					break;
				case JINJA_EXPR_START:
					{
					setState(356);
					jinjaExpression();
					}
					break;
				case HTML_TEXT:
					{
					setState(357);
					match(HTML_TEXT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(362);
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
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
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
			setState(367);
			match(IMPORT);
			setState(368);
			dotted_name();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(369);
				match(AS);
				setState(370);
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
			setState(373);
			match(FROM);
			setState(374);
			dotted_name();
			setState(375);
			match(IMPORT);
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(376);
				match(STAR);
				}
				break;
			case NAME:
				{
				setState(377);
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
			setState(380);
			import_as_name();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(381);
				match(COMMA);
				setState(382);
				import_as_name();
				}
				}
				setState(387);
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
			setState(388);
			match(NAME);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(389);
				match(AS);
				setState(390);
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
			setState(393);
			match(NAME);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(394);
				match(DOT);
				setState(395);
				match(NAME);
				}
				}
				setState(400);
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
			setState(401);
			match(GLOBAL);
			setState(402);
			match(NAME);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(403);
				match(COMMA);
				setState(404);
				match(NAME);
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
			setState(410);
			decorators();
			setState(411);
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
			setState(414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413);
				decorator();
				}
				}
				setState(416); 
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
			setState(418);
			match(AT);
			setState(419);
			dotted_name();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(420);
				match(LP);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(421);
					arglist();
					}
				}

				setState(424);
				match(RP);
				}
			}

			setState(427);
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
			setState(429);
			match(DEF);
			setState(430);
			match(NAME);
			setState(431);
			parameters();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(432);
				match(ARROW);
				setState(433);
				test();
				}
			}

			setState(436);
			match(COLON);
			setState(437);
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
			setState(439);
			match(LP);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(440);
				typedargslist();
				}
			}

			setState(443);
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
			setState(445);
			match(NAME);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(446);
				match(COMMA);
				setState(447);
				match(NAME);
				}
				}
				setState(452);
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
			setState(453);
			match(IF);
			setState(454);
			test();
			setState(455);
			match(COLON);
			setState(456);
			suite();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(457);
				match(ELIF);
				setState(458);
				test();
				setState(459);
				match(COLON);
				setState(460);
				suite();
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(467);
				match(ELSE);
				setState(468);
				match(COLON);
				setState(469);
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
			setState(472);
			match(RETURN);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
				{
				setState(473);
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
			setState(476);
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
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(NEWLINE);
				setState(480);
				match(INDENT);
				setState(482); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(481);
					statement();
					}
					}
					setState(484); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4033421310495688L) != 0) );
				setState(486);
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
			setState(490);
			test();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(491);
				match(COMMA);
				setState(492);
				test();
				}
				}
				setState(497);
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
			setState(498);
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
			setState(500);
			and_test();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(501);
				match(OR);
				setState(502);
				and_test();
				}
				}
				setState(507);
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
			setState(508);
			not_test();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(509);
				match(AND);
				setState(510);
				not_test();
				}
				}
				setState(515);
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
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(NOT);
				setState(517);
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
				setState(518);
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
			setState(521);
			expr();
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(522);
					comp_op();
					setState(523);
					expr();
					}
					} 
				}
				setState(529);
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
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				match(GT);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				match(NEQ);
				}
				break;
			case GTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(534);
				match(GTE);
				}
				break;
			case LTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(535);
				match(LTE);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(536);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(537);
				match(NOT);
				setState(538);
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
			setState(541);
			term();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(542);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(543);
				term();
				}
				}
				setState(548);
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
			setState(549);
			factor();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				{
				setState(550);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(551);
				factor();
				}
				}
				setState(556);
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
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(558);
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
				setState(559);
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
			setState(562);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			atom();
			setState(568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(565);
					trailer();
					}
					} 
				}
				setState(570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(LP);
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(572);
					arglist();
					}
				}

				setState(575);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				match(LBRACK);
				setState(577);
				test();
				setState(578);
				match(RBRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				match(DOT);
				setState(581);
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
			int _alt;
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(NAME);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(587); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(586);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(589); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(592);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(593);
				match(FALSE);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 7);
				{
				setState(594);
				match(LP);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(595);
					test();
					}
				}

				setState(598);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(599);
				match(LBRACK);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(600);
					list_content();
					}
				}

				setState(603);
				match(RBRACK);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 9);
				{
				setState(604);
				match(LBRACE);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(605);
					dict_maker();
					}
				}

				setState(608);
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
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				test();
				setState(612);
				comp_for();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				test();
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(615);
					match(COMMA);
					setState(616);
					test();
					}
					}
					setState(621);
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
			setState(624);
			match(FOR);
			setState(625);
			test();
			setState(626);
			match(IN);
			setState(627);
			test();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(628);
				match(IF);
				setState(629);
				test();
				}
				}
				setState(634);
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
			setState(635);
			test();
			setState(636);
			match(COLON);
			setState(637);
			test();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(638);
				match(COMMA);
				setState(639);
				test();
				setState(640);
				match(COLON);
				setState(641);
				test();
				}
				}
				setState(647);
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
			setState(648);
			argument();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(649);
				match(COMMA);
				setState(650);
				argument();
				}
				}
				setState(655);
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
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(NAME);
				setState(658);
				match(ASSIGN);
				setState(659);
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
			setState(680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(TAG_OPEN);
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 458755L) != 0)) {
					{
					{
					setState(663);
					tag_content();
					}
					}
					setState(668);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(669);
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
				setState(670);
				match(SCRIPT_OPEN);
				setState(671);
				match(SCRIPT_BODY);
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				match(STYLE_OPEN);
				setState(673);
				style_content();
				setState(674);
				match(STYLE_CLOSE);
				}
				break;
			case XML_DECLARATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(676);
				match(XML_DECLARATION);
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				match(CDATA);
				}
				break;
			case DTD:
				enterOuterAlt(_localctx, 6);
				{
				setState(678);
				match(DTD);
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 7);
				{
				setState(679);
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
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				match(TAG_NAME);
				setState(685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(683);
					match(TAG_EQUALS);
					setState(684);
					match(ATTVALUE_VALUE);
					}
					break;
				}
				}
				break;
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				jinjaExpression();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				jinjaStatement();
				}
				break;
			case TAG_SLASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				match(TAG_SLASH);
				}
				break;
			case TAG_EQUALS:
				enterOuterAlt(_localctx, 5);
				{
				setState(690);
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
			setState(693);
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
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
		public List<TerminalNode> CSS_COMMENT() { return getTokens(JinjaFlaskParser.CSS_COMMENT); }
		public TerminalNode CSS_COMMENT(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMENT, i);
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
		enterRule(_localctx, 94, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			css_ws();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Charset) {
				{
				{
				setState(696);
				charset();
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 58720257L) != 0)) {
					{
					{
					setState(697);
					_la = _input.LA(1);
					if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 58720257L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(708);
				imports();
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 58720257L) != 0)) {
					{
					{
					setState(709);
					_la = _input.LA(1);
					if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 58720257L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Namespace) {
				{
				{
				setState(720);
				namespace_();
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 58720257L) != 0)) {
					{
					{
					setState(721);
					_la = _input.LA(1);
					if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 58720257L) != 0)) ) {
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
				}
				}
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & -3765255594417966491L) != 0)) {
				{
				{
				setState(732);
				nestedStatement();
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 58720257L) != 0)) {
					{
					{
					setState(733);
					_la = _input.LA(1);
					if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 58720257L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(744);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public TerminalNode CSS_SEMICOLON() { return getToken(JinjaFlaskParser.CSS_SEMICOLON, 0); }
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
		enterRule(_localctx, 96, RULE_charset);
		try {
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new GoodCharsetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				match(Charset);
				setState(747);
				css_ws();
				setState(748);
				match(String_);
				setState(749);
				css_ws();
				setState(750);
				match(CSS_SEMICOLON);
				setState(751);
				css_ws();
				}
				break;
			case 2:
				_localctx = new BadCharsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				match(Charset);
				setState(754);
				css_ws();
				setState(755);
				match(String_);
				setState(756);
				css_ws();
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode CSS_SEMICOLON() { return getToken(JinjaFlaskParser.CSS_SEMICOLON, 0); }
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
		enterRule(_localctx, 98, RULE_imports);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				match(Import);
				setState(761);
				css_ws();
				setState(764);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(762);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(763);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(766);
				css_ws();
				setState(767);
				mediaQueryList();
				setState(768);
				match(CSS_SEMICOLON);
				setState(769);
				css_ws();
				}
				break;
			case 2:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				match(Import);
				setState(772);
				css_ws();
				setState(775);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(773);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(774);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(777);
				css_ws();
				setState(778);
				match(CSS_SEMICOLON);
				setState(779);
				css_ws();
				}
				break;
			case 3:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
				match(Import);
				setState(782);
				css_ws();
				setState(785);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(783);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(784);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(787);
				css_ws();
				setState(788);
				mediaQueryList();
				}
				break;
			case 4:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(790);
				match(Import);
				setState(791);
				css_ws();
				setState(794);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(792);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(793);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(796);
				css_ws();
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_SEMICOLON() { return getToken(JinjaFlaskParser.CSS_SEMICOLON, 0); }
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
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
		enterRule(_localctx, 100, RULE_namespace_);
		int _la;
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new GoodNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				match(Namespace);
				setState(801);
				css_ws();
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 33660935L) != 0)) {
					{
					setState(802);
					namespacePrefix();
					setState(803);
					css_ws();
					}
				}

				setState(809);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(807);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(808);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(811);
				css_ws();
				setState(812);
				match(CSS_SEMICOLON);
				setState(813);
				css_ws();
				}
				break;
			case 2:
				_localctx = new BadNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(Namespace);
				setState(816);
				css_ws();
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 33660935L) != 0)) {
					{
					setState(817);
					namespacePrefix();
					setState(818);
					css_ws();
					}
				}

				setState(824);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(822);
					match(String_);
					}
					break;
				case Url:
				case Url_:
					{
					setState(823);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(826);
				css_ws();
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
		enterRule(_localctx, 102, RULE_namespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
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
		enterRule(_localctx, 104, RULE_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(Media);
			setState(833);
			css_ws();
			setState(834);
			mediaQueryList();
			setState(835);
			groupRuleBody();
			setState(836);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
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
		enterRule(_localctx, 106, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(838);
				mediaQuery();
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COMMA) {
					{
					{
					setState(839);
					match(CSS_COMMA);
					setState(840);
					css_ws();
					setState(841);
					mediaQuery();
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(850);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
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
		enterRule(_localctx, 108, RULE_mediaQuery);
		int _la;
		try {
			int _alt;
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_COMMENT:
			case Space:
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(852);
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
				setState(855);
				css_ws();
				setState(856);
				mediaType();
				setState(857);
				css_ws();
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(858);
						match(And);
						setState(859);
						css_ws();
						setState(860);
						mediaExpression();
						}
						} 
					}
					setState(866);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				}
				}
				break;
			case CSS_LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				mediaExpression();
				setState(874);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(868);
						match(And);
						setState(869);
						css_ws();
						setState(870);
						mediaExpression();
						}
						} 
					}
					setState(876);
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
		enterRule(_localctx, 110, RULE_mediaType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
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
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public MediaFeatureContext mediaFeature() {
			return getRuleContext(MediaFeatureContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		enterRule(_localctx, 112, RULE_mediaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(CSS_LPAREN);
			setState(882);
			css_ws();
			setState(883);
			mediaFeature();
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_COLON) {
				{
				setState(884);
				match(CSS_COLON);
				setState(885);
				css_ws();
				setState(886);
				expr();
				}
			}

			setState(890);
			match(CSS_RPAREN);
			setState(891);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
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
		enterRule(_localctx, 114, RULE_mediaFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			ident();
			setState(894);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public PseudoPageContext pseudoPage() {
			return getRuleContext(PseudoPageContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(JinjaFlaskParser.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(JinjaFlaskParser.CSS_SEMICOLON, i);
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
		enterRule(_localctx, 116, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(Page);
			setState(897);
			css_ws();
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_COLON) {
				{
				setState(898);
				pseudoPage();
				}
			}

			setState(901);
			match(CSS_LBRACE);
			setState(902);
			css_ws();
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 361202823993524225L) != 0)) {
				{
				setState(903);
				declaration();
				}
			}

			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_SEMICOLON) {
				{
				{
				setState(906);
				match(CSS_SEMICOLON);
				setState(907);
				css_ws();
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 361202823993524225L) != 0)) {
					{
					setState(908);
					declaration();
					}
				}

				}
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(916);
			match(CSS_RBRACE);
			setState(917);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
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
		enterRule(_localctx, 118, RULE_pseudoPage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(CSS_COLON);
			setState(920);
			ident();
			setState(921);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
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
		enterRule(_localctx, 120, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			selector();
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(924);
				match(CSS_COMMA);
				setState(925);
				css_ws();
				setState(926);
				selector();
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
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorSequenceContext> simpleSelectorSequence() {
			return getRuleContexts(SimpleSelectorSequenceContext.class);
		}
		public SimpleSelectorSequenceContext simpleSelectorSequence(int i) {
			return getRuleContext(SimpleSelectorSequenceContext.class,i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
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
		enterRule(_localctx, 122, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			simpleSelectorSequence();
			setState(934);
			css_ws();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1037L) != 0)) {
				{
				{
				setState(935);
				combinator();
				setState(936);
				simpleSelectorSequence();
				setState(937);
				css_ws();
				}
				}
				setState(943);
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public TerminalNode CSS_GREATER() { return getToken(JinjaFlaskParser.CSS_GREATER, 0); }
		public TerminalNode CSS_TILDE() { return getToken(JinjaFlaskParser.CSS_TILDE, 0); }
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
		enterRule(_localctx, 124, RULE_combinator);
		try {
			setState(952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				match(CSS_PLUS);
				setState(945);
				css_ws();
				}
				break;
			case CSS_GREATER:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				match(CSS_GREATER);
				setState(947);
				css_ws();
				}
				break;
			case CSS_TILDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(948);
				match(CSS_TILDE);
				setState(949);
				css_ws();
				}
				break;
			case Space:
				enterOuterAlt(_localctx, 4);
				{
				setState(950);
				match(Space);
				setState(951);
				css_ws();
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
		enterRule(_localctx, 126, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_PIPE:
			case CSS_ASTERISK:
			case MediaOnly:
			case Not:
			case And:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(954);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(955);
					universal();
					}
					break;
				}
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1099545215105L) != 0)) {
					{
					setState(963);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(958);
						match(Hash);
						}
						break;
					case CSS_DOT:
						{
						setState(959);
						className();
						}
						break;
					case CSS_LBRACKET:
						{
						setState(960);
						attrib();
						}
						break;
					case CSS_COLON:
						{
						setState(961);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(962);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CSS_COLON:
			case CSS_DOT:
			case CSS_LBRACKET:
			case Hash:
			case PseudoNot:
				enterOuterAlt(_localctx, 2);
				{
				setState(973); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(973);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(968);
						match(Hash);
						}
						break;
					case CSS_DOT:
						{
						setState(969);
						className();
						}
						break;
					case CSS_LBRACKET:
						{
						setState(970);
						attrib();
						}
						break;
					case CSS_COLON:
						{
						setState(971);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(972);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(975); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1099545215105L) != 0) );
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
		enterRule(_localctx, 128, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(979);
				typeNamespacePrefix();
				}
				break;
			}
			setState(982);
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
		public TerminalNode CSS_PIPE() { return getToken(JinjaFlaskParser.CSS_PIPE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode CSS_ASTERISK() { return getToken(JinjaFlaskParser.CSS_ASTERISK, 0); }
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
		enterRule(_localctx, 130, RULE_typeNamespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
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
				setState(984);
				ident();
				}
				break;
			case CSS_ASTERISK:
				{
				setState(985);
				match(CSS_ASTERISK);
				}
				break;
			case CSS_PIPE:
				break;
			default:
				break;
			}
			setState(988);
			match(CSS_PIPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 132, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
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
		public TerminalNode CSS_ASTERISK() { return getToken(JinjaFlaskParser.CSS_ASTERISK, 0); }
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
		enterRule(_localctx, 134, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(992);
				typeNamespacePrefix();
				}
				break;
			}
			setState(995);
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
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode CSS_DOT() { return getToken(JinjaFlaskParser.CSS_DOT, 0); }
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
		enterRule(_localctx, 136, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(CSS_DOT);
			setState(998);
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
		public TerminalNode CSS_LBRACKET() { return getToken(JinjaFlaskParser.CSS_LBRACKET, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode CSS_RBRACKET() { return getToken(JinjaFlaskParser.CSS_RBRACKET, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TerminalNode PrefixMatch() { return getToken(JinjaFlaskParser.PrefixMatch, 0); }
		public TerminalNode SuffixMatch() { return getToken(JinjaFlaskParser.SuffixMatch, 0); }
		public TerminalNode SubstringMatch() { return getToken(JinjaFlaskParser.SubstringMatch, 0); }
		public TerminalNode CSS_EQUALS() { return getToken(JinjaFlaskParser.CSS_EQUALS, 0); }
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
		enterRule(_localctx, 138, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(CSS_LBRACKET);
			setState(1001);
			css_ws();
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1002);
				typeNamespacePrefix();
				}
				break;
			}
			setState(1005);
			ident();
			setState(1006);
			css_ws();
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 3758097921L) != 0)) {
				{
				setState(1007);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 3758097921L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1008);
				css_ws();
				setState(1011);
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
					setState(1009);
					ident();
					}
					break;
				case String_:
					{
					setState(1010);
					match(String_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1013);
				css_ws();
				}
			}

			setState(1017);
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
	public static class PseudoContext extends ParserRuleContext {
		public List<TerminalNode> CSS_COLON() { return getTokens(JinjaFlaskParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(JinjaFlaskParser.CSS_COLON, i);
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
		enterRule(_localctx, 140, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(CSS_COLON);
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_COLON) {
				{
				setState(1020);
				match(CSS_COLON);
				}
			}

			setState(1025);
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
				setState(1023);
				ident();
				}
				break;
			case Function_:
				{
				setState(1024);
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 142, RULE_functionalPseudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(Function_);
			setState(1028);
			css_ws();
			setState(1029);
			expression();
			setState(1030);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_PLUS() { return getTokens(JinjaFlaskParser.CSS_PLUS); }
		public TerminalNode CSS_PLUS(int i) {
			return getToken(JinjaFlaskParser.CSS_PLUS, i);
		}
		public List<TerminalNode> CSS_MINUS() { return getTokens(JinjaFlaskParser.CSS_MINUS); }
		public TerminalNode CSS_MINUS(int i) {
			return getToken(JinjaFlaskParser.CSS_MINUS, i);
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
		enterRule(_localctx, 144, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1039);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_PLUS:
					{
					setState(1032);
					match(CSS_PLUS);
					}
					break;
				case CSS_MINUS:
					{
					setState(1033);
					match(CSS_MINUS);
					}
					break;
				case Dimension:
					{
					setState(1034);
					match(Dimension);
					}
					break;
				case UnknownDimension:
					{
					setState(1035);
					match(UnknownDimension);
					}
					break;
				case Number:
					{
					setState(1036);
					match(Number);
					}
					break;
				case String_:
					{
					setState(1037);
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
					setState(1038);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1041);
				css_ws();
				}
				}
				setState(1044); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1129480802271235L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public NegationArgContext negationArg() {
			return getRuleContext(NegationArgContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 146, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(PseudoNot);
			setState(1047);
			css_ws();
			setState(1048);
			negationArg();
			setState(1049);
			css_ws();
			setState(1050);
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
		enterRule(_localctx, 148, RULE_negationArg);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				typeSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				universal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1054);
				match(Hash);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1055);
				className();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1056);
				attrib();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1057);
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
		public TerminalNode CSS_EQUALS() { return getToken(JinjaFlaskParser.CSS_EQUALS, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
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
		public TerminalNode CSS_SLASH() { return getToken(JinjaFlaskParser.CSS_SLASH, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public TerminalNode CSS_COMMA() { return getToken(JinjaFlaskParser.CSS_COMMA, 0); }
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
		enterRule(_localctx, 150, RULE_operator_);
		try {
			setState(1068);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_SLASH:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				match(CSS_SLASH);
				setState(1061);
				css_ws();
				}
				break;
			case CSS_COMMA:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1062);
				match(CSS_COMMA);
				setState(1063);
				css_ws();
				}
				break;
			case Space:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1064);
				match(Space);
				setState(1065);
				css_ws();
				}
				break;
			case CSS_EQUALS:
				_localctx = new BadOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1066);
				match(CSS_EQUALS);
				setState(1067);
				css_ws();
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
		public TerminalNode CSS_ASTERISK() { return getToken(JinjaFlaskParser.CSS_ASTERISK, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode CSS_UNDERSCORE() { return getToken(JinjaFlaskParser.CSS_UNDERSCORE, 0); }
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
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
		enterRule(_localctx, 152, RULE_property_);
		try {
			setState(1079);
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
				setState(1070);
				ident();
				setState(1071);
				css_ws();
				}
				break;
			case Variable:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1073);
				match(Variable);
				setState(1074);
				css_ws();
				}
				break;
			case CSS_ASTERISK:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				match(CSS_ASTERISK);
				setState(1076);
				ident();
				}
				break;
			case CSS_UNDERSCORE:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1077);
				match(CSS_UNDERSCORE);
				setState(1078);
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
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
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
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
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
		enterRule(_localctx, 154, RULE_ruleset);
		int _la;
		try {
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new KnownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				selectorGroup();
				setState(1082);
				match(CSS_LBRACE);
				setState(1083);
				css_ws();
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 722405647987048451L) != 0)) {
					{
					setState(1084);
					declarationList();
					}
				}

				setState(1087);
				match(CSS_RBRACE);
				setState(1088);
				css_ws();
				}
				break;
			case 2:
				_localctx = new UnknownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 3462431380863486993L) != 0)) {
					{
					{
					setState(1090);
					any_();
					}
					}
					setState(1095);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1096);
				match(CSS_LBRACE);
				setState(1097);
				css_ws();
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 722405647987048451L) != 0)) {
					{
					setState(1098);
					declarationList();
					}
				}

				setState(1101);
				match(CSS_RBRACE);
				setState(1102);
				css_ws();
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(JinjaFlaskParser.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(JinjaFlaskParser.CSS_SEMICOLON, i);
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
		enterRule(_localctx, 156, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_SEMICOLON) {
				{
				{
				setState(1106);
				match(CSS_SEMICOLON);
				setState(1107);
				css_ws();
				}
				}
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1113);
			declaration();
			setState(1114);
			css_ws();
			setState(1122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1115);
					match(CSS_SEMICOLON);
					setState(1116);
					css_ws();
					setState(1118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(1117);
						declaration();
						}
						break;
					}
					}
					} 
				}
				setState(1124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
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
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
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
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
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
		enterRule(_localctx, 158, RULE_declaration);
		int _la;
		try {
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new KnownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				property_();
				setState(1126);
				match(CSS_COLON);
				setState(1127);
				css_ws();
				setState(1128);
				css_expr();
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Important) {
					{
					setState(1129);
					prio();
					}
				}

				}
				break;
			case 2:
				_localctx = new UnknownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				property_();
				setState(1133);
				match(CSS_COLON);
				setState(1134);
				css_ws();
				setState(1135);
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
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
		enterRule(_localctx, 160, RULE_prio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(Important);
			setState(1140);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
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
		enterRule(_localctx, 162, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1146); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1146);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_COLON:
					case CSS_LPAREN:
					case CSS_PLUS:
					case CSS_MINUS:
					case CSS_LBRACKET:
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
						setState(1142);
						any_();
						}
						break;
					case CSS_LBRACE:
						{
						setState(1143);
						block();
						}
						break;
					case AtKeyword:
						{
						setState(1144);
						match(AtKeyword);
						setState(1145);
						css_ws();
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
				setState(1148); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
		public Css_termContext css_term() {
			return getRuleContext(Css_termContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
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
		enterRule(_localctx, 164, RULE_css_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			css_term();
			setState(1157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 16645L) != 0)) {
						{
						setState(1151);
						operator_();
						}
					}

					setState(1154);
					term();
					}
					} 
				}
				setState(1159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
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
		enterRule(_localctx, 166, RULE_css_term);
		try {
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				number();
				setState(1161);
				css_ws();
				}
				break;
			case 2:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
				percentage();
				setState(1164);
				css_ws();
				}
				break;
			case 3:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1166);
				dimension();
				setState(1167);
				css_ws();
				}
				break;
			case 4:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1169);
				match(String_);
				setState(1170);
				css_ws();
				}
				break;
			case 5:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1171);
				match(UnicodeRange);
				setState(1172);
				css_ws();
				}
				break;
			case 6:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1173);
				ident();
				setState(1174);
				css_ws();
				}
				break;
			case 7:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1176);
				var_();
				}
				break;
			case 8:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1177);
				url();
				setState(1178);
				css_ws();
				}
				break;
			case 9:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1180);
				hexcolor();
				}
				break;
			case 10:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1181);
				calc();
				}
				break;
			case 11:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1182);
				function_();
				}
				break;
			case 12:
				_localctx = new UnknownTermContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1183);
				unknownDimension();
				setState(1184);
				css_ws();
				}
				break;
			case 13:
				_localctx = new BadTermContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1186);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public Css_exprContext css_expr() {
			return getRuleContext(Css_exprContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 168, RULE_function_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			match(Function_);
			setState(1190);
			css_ws();
			setState(1191);
			css_expr();
			setState(1192);
			match(CSS_RPAREN);
			setState(1193);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public Css_exprContext css_expr() {
			return getRuleContext(Css_exprContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 170, RULE_dxImageTransform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(DxImageTransform);
			setState(1196);
			css_ws();
			setState(1197);
			css_expr();
			setState(1198);
			match(CSS_RPAREN);
			setState(1199);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
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
		enterRule(_localctx, 172, RULE_hexcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(Hash);
			setState(1202);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode CSS_PLUS() { return getToken(JinjaFlaskParser.CSS_PLUS, 0); }
		public TerminalNode CSS_MINUS() { return getToken(JinjaFlaskParser.CSS_MINUS, 0); }
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
		enterRule(_localctx, 174, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PLUS || _la==CSS_MINUS) {
				{
				setState(1204);
				_la = _input.LA(1);
				if ( !(_la==CSS_PLUS || _la==CSS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1207);
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
		public TerminalNode CSS_PLUS() { return getToken(JinjaFlaskParser.CSS_PLUS, 0); }
		public TerminalNode CSS_MINUS() { return getToken(JinjaFlaskParser.CSS_MINUS, 0); }
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
		enterRule(_localctx, 176, RULE_percentage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PLUS || _la==CSS_MINUS) {
				{
				setState(1209);
				_la = _input.LA(1);
				if ( !(_la==CSS_PLUS || _la==CSS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1212);
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
		public TerminalNode CSS_PLUS() { return getToken(JinjaFlaskParser.CSS_PLUS, 0); }
		public TerminalNode CSS_MINUS() { return getToken(JinjaFlaskParser.CSS_MINUS, 0); }
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
		enterRule(_localctx, 178, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PLUS || _la==CSS_MINUS) {
				{
				setState(1214);
				_la = _input.LA(1);
				if ( !(_la==CSS_PLUS || _la==CSS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1217);
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
		public TerminalNode CSS_PLUS() { return getToken(JinjaFlaskParser.CSS_PLUS, 0); }
		public TerminalNode CSS_MINUS() { return getToken(JinjaFlaskParser.CSS_MINUS, 0); }
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
		enterRule(_localctx, 180, RULE_unknownDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_PLUS || _la==CSS_MINUS) {
				{
				setState(1219);
				_la = _input.LA(1);
				if ( !(_la==CSS_PLUS || _la==CSS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1222);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
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
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public TerminalNode Function_() { return getToken(JinjaFlaskParser.Function_, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_LBRACKET() { return getToken(JinjaFlaskParser.CSS_LBRACKET, 0); }
		public TerminalNode CSS_RBRACKET() { return getToken(JinjaFlaskParser.CSS_RBRACKET, 0); }
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
		enterRule(_localctx, 182, RULE_any_);
		int _la;
		try {
			setState(1290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				ident();
				setState(1225);
				css_ws();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				number();
				setState(1228);
				css_ws();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1230);
				percentage();
				setState(1231);
				css_ws();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1233);
				dimension();
				setState(1234);
				css_ws();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1236);
				unknownDimension();
				setState(1237);
				css_ws();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1239);
				match(String_);
				setState(1240);
				css_ws();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1241);
				url();
				setState(1242);
				css_ws();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1244);
				match(Hash);
				setState(1245);
				css_ws();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1246);
				match(UnicodeRange);
				setState(1247);
				css_ws();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1248);
				match(Includes);
				setState(1249);
				css_ws();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1250);
				match(DashMatch);
				setState(1251);
				css_ws();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1252);
				match(CSS_COLON);
				setState(1253);
				css_ws();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1254);
				match(Function_);
				setState(1255);
				css_ws();
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & -4020557797927014323L) != 0)) {
					{
					setState(1258);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_COLON:
					case CSS_LPAREN:
					case CSS_PLUS:
					case CSS_MINUS:
					case CSS_LBRACKET:
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
						setState(1256);
						any_();
						}
						break;
					case CSS_LBRACE:
					case CSS_SEMICOLON:
					case Cdo:
					case Cdc:
					case AtKeyword:
						{
						setState(1257);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1263);
				match(CSS_RPAREN);
				setState(1264);
				css_ws();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1266);
				match(CSS_LPAREN);
				setState(1267);
				css_ws();
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & -4020557797927014323L) != 0)) {
					{
					setState(1270);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_COLON:
					case CSS_LPAREN:
					case CSS_PLUS:
					case CSS_MINUS:
					case CSS_LBRACKET:
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
						setState(1268);
						any_();
						}
						break;
					case CSS_LBRACE:
					case CSS_SEMICOLON:
					case Cdo:
					case Cdc:
					case AtKeyword:
						{
						setState(1269);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1275);
				match(CSS_RPAREN);
				setState(1276);
				css_ws();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1278);
				match(CSS_LBRACKET);
				setState(1279);
				css_ws();
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & -4020557797927014323L) != 0)) {
					{
					setState(1282);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_COLON:
					case CSS_LPAREN:
					case CSS_PLUS:
					case CSS_MINUS:
					case CSS_LBRACKET:
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
						setState(1280);
						any_();
						}
						break;
					case CSS_LBRACE:
					case CSS_SEMICOLON:
					case Cdo:
					case Cdc:
					case AtKeyword:
						{
						setState(1281);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1287);
				match(CSS_RBRACKET);
				setState(1288);
				css_ws();
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CSS_SEMICOLON() { return getToken(JinjaFlaskParser.CSS_SEMICOLON, 0); }
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
		enterRule(_localctx, 184, RULE_atRule);
		int _la;
		try {
			_localctx = new UnknownAtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(AtKeyword);
			setState(1293);
			css_ws();
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 3462431380863486993L) != 0)) {
				{
				{
				setState(1294);
				any_();
				}
				}
				setState(1299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_LBRACE:
				{
				setState(1300);
				block();
				}
				break;
			case CSS_SEMICOLON:
				{
				setState(1301);
				match(CSS_SEMICOLON);
				setState(1302);
				css_ws();
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
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public TerminalNode CSS_SEMICOLON() { return getToken(JinjaFlaskParser.CSS_SEMICOLON, 0); }
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
		enterRule(_localctx, 186, RULE_unused);
		try {
			setState(1314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				block();
				}
				break;
			case AtKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(AtKeyword);
				setState(1307);
				css_ws();
				}
				break;
			case CSS_SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(1308);
				match(CSS_SEMICOLON);
				setState(1309);
				css_ws();
				}
				break;
			case Cdo:
				enterOuterAlt(_localctx, 4);
				{
				setState(1310);
				match(Cdo);
				setState(1311);
				css_ws();
				}
				break;
			case Cdc:
				enterOuterAlt(_localctx, 5);
				{
				setState(1312);
				match(Cdc);
				setState(1313);
				css_ws();
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
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
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
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(JinjaFlaskParser.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(JinjaFlaskParser.CSS_SEMICOLON, i);
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
		enterRule(_localctx, 188, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1316);
			match(CSS_LBRACE);
			setState(1317);
			css_ws();
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & -2612334089811119491L) != 0)) {
				{
				setState(1326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1318);
					declarationList();
					}
					break;
				case 2:
					{
					setState(1319);
					nestedStatement();
					}
					break;
				case 3:
					{
					setState(1320);
					any_();
					}
					break;
				case 4:
					{
					setState(1321);
					block();
					}
					break;
				case 5:
					{
					setState(1322);
					match(AtKeyword);
					setState(1323);
					css_ws();
					}
					break;
				case 6:
					{
					setState(1324);
					match(CSS_SEMICOLON);
					setState(1325);
					css_ws();
					}
					break;
				}
				}
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1331);
			match(CSS_RBRACE);
			setState(1332);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 190, RULE_nestedStatement);
		try {
			setState(1344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_LBRACE:
			case CSS_COLON:
			case CSS_PIPE:
			case CSS_LPAREN:
			case CSS_DOT:
			case CSS_PLUS:
			case CSS_MINUS:
			case CSS_LBRACKET:
			case CSS_ASTERISK:
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
				setState(1334);
				ruleset();
				}
				break;
			case Media:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				media();
				}
				break;
			case Page:
				enterOuterAlt(_localctx, 3);
				{
				setState(1336);
				page();
				}
				break;
			case FontFace:
				enterOuterAlt(_localctx, 4);
				{
				setState(1337);
				fontFaceRule();
				}
				break;
			case Keyframes:
				enterOuterAlt(_localctx, 5);
				{
				setState(1338);
				keyframesRule();
				}
				break;
			case Supports:
				enterOuterAlt(_localctx, 6);
				{
				setState(1339);
				supportsRule();
				}
				break;
			case Viewport:
				enterOuterAlt(_localctx, 7);
				{
				setState(1340);
				viewport();
				}
				break;
			case CounterStyle:
				enterOuterAlt(_localctx, 8);
				{
				setState(1341);
				counterStyle();
				}
				break;
			case FontFeatureValues:
				enterOuterAlt(_localctx, 9);
				{
				setState(1342);
				fontFeatureValuesRule();
				}
				break;
			case AtKeyword:
				enterOuterAlt(_localctx, 10);
				{
				setState(1343);
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
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
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
		enterRule(_localctx, 192, RULE_groupRuleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(CSS_LBRACE);
			setState(1347);
			css_ws();
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & -3765255594417966491L) != 0)) {
				{
				{
				setState(1348);
				nestedStatement();
				}
				}
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1354);
			match(CSS_RBRACE);
			setState(1355);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
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
		enterRule(_localctx, 194, RULE_supportsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			match(Supports);
			setState(1358);
			css_ws();
			setState(1359);
			supportsCondition();
			setState(1360);
			css_ws();
			setState(1361);
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
		enterRule(_localctx, 196, RULE_supportsCondition);
		try {
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1363);
				supportsNegation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1364);
				supportsConjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1365);
				supportsDisjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1366);
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
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 198, RULE_supportsConditionInParens);
		try {
			setState(1377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1369);
				match(CSS_LPAREN);
				setState(1370);
				css_ws();
				setState(1371);
				supportsCondition();
				setState(1372);
				css_ws();
				setState(1373);
				match(CSS_RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1375);
				supportsDeclarationCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1376);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
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
		enterRule(_localctx, 200, RULE_supportsNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(Not);
			setState(1380);
			css_ws();
			setState(1381);
			match(Space);
			setState(1382);
			css_ws();
			setState(1383);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
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
		enterRule(_localctx, 202, RULE_supportsConjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			supportsConditionInParens();
			setState(1395); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1386);
					css_ws();
					setState(1387);
					match(Space);
					setState(1388);
					css_ws();
					setState(1389);
					match(And);
					setState(1390);
					css_ws();
					setState(1391);
					match(Space);
					setState(1392);
					css_ws();
					setState(1393);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1397); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
	public static class SupportsDisjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
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
		enterRule(_localctx, 204, RULE_supportsDisjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			supportsConditionInParens();
			setState(1409); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1400);
					css_ws();
					setState(1401);
					match(Space);
					setState(1402);
					css_ws();
					setState(1403);
					match(Or);
					setState(1404);
					css_ws();
					setState(1405);
					match(Space);
					setState(1406);
					css_ws();
					setState(1407);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1411); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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
	public static class SupportsDeclarationConditionContext extends ParserRuleContext {
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 206, RULE_supportsDeclarationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(CSS_LPAREN);
			setState(1414);
			css_ws();
			setState(1415);
			declaration();
			setState(1416);
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
	public static class GeneralEnclosedContext extends ParserRuleContext {
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
		public TerminalNode Function_() { return getToken(JinjaFlaskParser.Function_, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
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
		enterRule(_localctx, 208, RULE_generalEnclosed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_la = _input.LA(1);
			if ( !(_la==CSS_LPAREN || _la==Function_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & -4020557797927014323L) != 0)) {
				{
				setState(1421);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_COLON:
				case CSS_LPAREN:
				case CSS_PLUS:
				case CSS_MINUS:
				case CSS_LBRACKET:
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
					setState(1419);
					any_();
					}
					break;
				case CSS_LBRACE:
				case CSS_SEMICOLON:
				case Cdo:
				case Cdc:
				case AtKeyword:
					{
					setState(1420);
					unused();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1426);
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
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode Url_() { return getToken(JinjaFlaskParser.Url_, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode String_() { return getToken(JinjaFlaskParser.String_, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 210, RULE_url);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Url_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				match(Url_);
				setState(1429);
				css_ws();
				setState(1430);
				match(String_);
				setState(1431);
				css_ws();
				setState(1432);
				match(CSS_RPAREN);
				}
				break;
			case Url:
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode Variable() { return getToken(JinjaFlaskParser.Variable, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 212, RULE_var_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(Var);
			setState(1438);
			css_ws();
			setState(1439);
			match(Variable);
			setState(1440);
			css_ws();
			setState(1441);
			match(CSS_RPAREN);
			setState(1442);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 214, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(Calc);
			setState(1445);
			css_ws();
			setState(1446);
			calcSum();
			setState(1447);
			match(CSS_RPAREN);
			setState(1448);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_PLUS() { return getTokens(JinjaFlaskParser.CSS_PLUS); }
		public TerminalNode CSS_PLUS(int i) {
			return getToken(JinjaFlaskParser.CSS_PLUS, i);
		}
		public List<TerminalNode> CSS_MINUS() { return getTokens(JinjaFlaskParser.CSS_MINUS); }
		public TerminalNode CSS_MINUS(int i) {
			return getToken(JinjaFlaskParser.CSS_MINUS, i);
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
		enterRule(_localctx, 216, RULE_calcSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			calcProduct();
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(1451);
				match(Space);
				setState(1452);
				css_ws();
				setState(1453);
				_la = _input.LA(1);
				if ( !(_la==CSS_PLUS || _la==CSS_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1454);
				css_ws();
				setState(1455);
				match(Space);
				setState(1456);
				css_ws();
				setState(1457);
				calcProduct();
				}
				}
				setState(1463);
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
		public List<TerminalNode> CSS_ASTERISK() { return getTokens(JinjaFlaskParser.CSS_ASTERISK); }
		public TerminalNode CSS_ASTERISK(int i) {
			return getToken(JinjaFlaskParser.CSS_ASTERISK, i);
		}
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_SLASH() { return getTokens(JinjaFlaskParser.CSS_SLASH); }
		public TerminalNode CSS_SLASH(int i) {
			return getToken(JinjaFlaskParser.CSS_SLASH, i);
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
		enterRule(_localctx, 218, RULE_calcProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			calcValue();
			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_SLASH || _la==CSS_ASTERISK) {
				{
				setState(1474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_ASTERISK:
					{
					setState(1465);
					match(CSS_ASTERISK);
					setState(1466);
					css_ws();
					setState(1467);
					calcValue();
					}
					break;
				case CSS_SLASH:
					{
					setState(1469);
					match(CSS_SLASH);
					setState(1470);
					css_ws();
					setState(1471);
					number();
					setState(1472);
					css_ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1478);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
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
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
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
		enterRule(_localctx, 220, RULE_calcValue);
		try {
			setState(1497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				number();
				setState(1480);
				css_ws();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1482);
				dimension();
				setState(1483);
				css_ws();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				unknownDimension();
				setState(1486);
				css_ws();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1488);
				percentage();
				setState(1489);
				css_ws();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1491);
				match(CSS_LPAREN);
				setState(1492);
				css_ws();
				setState(1493);
				calcSum();
				setState(1494);
				match(CSS_RPAREN);
				setState(1495);
				css_ws();
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public List<FontFaceDeclarationContext> fontFaceDeclaration() {
			return getRuleContexts(FontFaceDeclarationContext.class);
		}
		public FontFaceDeclarationContext fontFaceDeclaration(int i) {
			return getRuleContext(FontFaceDeclarationContext.class,i);
		}
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(JinjaFlaskParser.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(JinjaFlaskParser.CSS_SEMICOLON, i);
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
		enterRule(_localctx, 222, RULE_fontFaceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(FontFace);
			setState(1500);
			css_ws();
			setState(1501);
			match(CSS_LBRACE);
			setState(1502);
			css_ws();
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 361202823993524225L) != 0)) {
				{
				setState(1503);
				fontFaceDeclaration();
				}
			}

			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_SEMICOLON) {
				{
				{
				setState(1506);
				match(CSS_SEMICOLON);
				setState(1507);
				css_ws();
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 361202823993524225L) != 0)) {
					{
					setState(1508);
					fontFaceDeclaration();
					}
				}

				}
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1516);
			match(CSS_RBRACE);
			setState(1517);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
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
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public Css_wsContext css_ws() {
			return getRuleContext(Css_wsContext.class,0);
		}
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
		enterRule(_localctx, 224, RULE_fontFaceDeclaration);
		try {
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				_localctx = new KnownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				property_();
				setState(1520);
				match(CSS_COLON);
				setState(1521);
				css_ws();
				setState(1522);
				css_expr();
				}
				break;
			case 2:
				_localctx = new UnknownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1524);
				property_();
				setState(1525);
				match(CSS_COLON);
				setState(1526);
				css_ws();
				setState(1527);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode Space() { return getToken(JinjaFlaskParser.Space, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
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
		enterRule(_localctx, 226, RULE_keyframesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			match(Keyframes);
			setState(1532);
			css_ws();
			setState(1533);
			match(Space);
			setState(1534);
			css_ws();
			setState(1535);
			ident();
			setState(1536);
			css_ws();
			setState(1537);
			match(CSS_LBRACE);
			setState(1538);
			css_ws();
			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 786433L) != 0)) {
				{
				{
				setState(1539);
				keyframeBlock();
				}
				}
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1545);
			match(CSS_RBRACE);
			setState(1546);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
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
		enterRule(_localctx, 228, RULE_keyframeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1548);
			keyframeSelector();
			setState(1549);
			match(CSS_LBRACE);
			setState(1550);
			css_ws();
			setState(1552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 722405647987048451L) != 0)) {
				{
				setState(1551);
				declarationList();
				}
			}

			setState(1554);
			match(CSS_RBRACE);
			setState(1555);
			css_ws();
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
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
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
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
		enterRule(_localctx, 230, RULE_keyframeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 786433L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1558);
			css_ws();
			setState(1566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(1559);
				match(CSS_COMMA);
				setState(1560);
				css_ws();
				setState(1561);
				_la = _input.LA(1);
				if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 786433L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1562);
				css_ws();
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
	public static class ViewportContext extends ParserRuleContext {
		public TerminalNode Viewport() { return getToken(JinjaFlaskParser.Viewport, 0); }
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
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
		enterRule(_localctx, 232, RULE_viewport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
			match(Viewport);
			setState(1570);
			css_ws();
			setState(1571);
			match(CSS_LBRACE);
			setState(1572);
			css_ws();
			setState(1574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 722405647987048451L) != 0)) {
				{
				setState(1573);
				declarationList();
				}
			}

			setState(1576);
			match(CSS_RBRACE);
			setState(1577);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
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
		enterRule(_localctx, 234, RULE_counterStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1579);
			match(CounterStyle);
			setState(1580);
			css_ws();
			setState(1581);
			ident();
			setState(1582);
			css_ws();
			setState(1583);
			match(CSS_LBRACE);
			setState(1584);
			css_ws();
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 722405647987048451L) != 0)) {
				{
				setState(1585);
				declarationList();
				}
			}

			setState(1588);
			match(CSS_RBRACE);
			setState(1589);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public FontFamilyNameListContext fontFamilyNameList() {
			return getRuleContext(FontFamilyNameListContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
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
		enterRule(_localctx, 236, RULE_fontFeatureValuesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(FontFeatureValues);
			setState(1592);
			css_ws();
			setState(1593);
			fontFamilyNameList();
			setState(1594);
			css_ws();
			setState(1595);
			match(CSS_LBRACE);
			setState(1596);
			css_ws();
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtKeyword) {
				{
				{
				setState(1597);
				featureValueBlock();
				}
				}
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1603);
			match(CSS_RBRACE);
			setState(1604);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
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
		enterRule(_localctx, 238, RULE_fontFamilyNameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			fontFamilyName();
			setState(1614);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1607);
					css_ws();
					setState(1608);
					match(CSS_COMMA);
					setState(1609);
					css_ws();
					setState(1610);
					fontFamilyName();
					}
					} 
				}
				setState(1616);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
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
		enterRule(_localctx, 240, RULE_fontFamilyName);
		try {
			int _alt;
			setState(1627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
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
				setState(1618);
				ident();
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1619);
						css_ws();
						setState(1620);
						ident();
						}
						} 
					}
					setState(1626);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public List<FeatureValueDefinitionContext> featureValueDefinition() {
			return getRuleContexts(FeatureValueDefinitionContext.class);
		}
		public FeatureValueDefinitionContext featureValueDefinition(int i) {
			return getRuleContext(FeatureValueDefinitionContext.class,i);
		}
		public List<TerminalNode> CSS_SEMICOLON() { return getTokens(JinjaFlaskParser.CSS_SEMICOLON); }
		public TerminalNode CSS_SEMICOLON(int i) {
			return getToken(JinjaFlaskParser.CSS_SEMICOLON, i);
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
		enterRule(_localctx, 242, RULE_featureValueBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			featureType();
			setState(1630);
			css_ws();
			setState(1631);
			match(CSS_LBRACE);
			setState(1632);
			css_ws();
			setState(1634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 33660935L) != 0)) {
				{
				setState(1633);
				featureValueDefinition();
				}
			}

			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 8388625L) != 0)) {
				{
				{
				setState(1636);
				css_ws();
				setState(1637);
				match(CSS_SEMICOLON);
				setState(1638);
				css_ws();
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 33660935L) != 0)) {
					{
					setState(1639);
					featureValueDefinition();
					}
				}

				}
				}
				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1647);
			match(CSS_RBRACE);
			setState(1648);
			css_ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 244, RULE_featureType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
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
		public List<Css_wsContext> css_ws() {
			return getRuleContexts(Css_wsContext.class);
		}
		public Css_wsContext css_ws(int i) {
			return getRuleContext(Css_wsContext.class,i);
		}
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
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
		enterRule(_localctx, 246, RULE_featureValueDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1652);
			ident();
			setState(1653);
			css_ws();
			setState(1654);
			match(CSS_COLON);
			setState(1655);
			css_ws();
			setState(1656);
			number();
			setState(1662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1657);
					css_ws();
					setState(1658);
					number();
					}
					} 
				}
				setState(1664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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
		enterRule(_localctx, 248, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			_la = _input.LA(1);
			if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 33660935L) != 0)) ) {
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
	public static class Css_wsContext extends ParserRuleContext {
		public List<TerminalNode> CSS_COMMENT() { return getTokens(JinjaFlaskParser.CSS_COMMENT); }
		public TerminalNode CSS_COMMENT(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMENT, i);
		}
		public List<TerminalNode> Space() { return getTokens(JinjaFlaskParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(JinjaFlaskParser.Space, i);
		}
		public Css_wsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCss_ws(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCss_ws(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCss_ws(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_wsContext css_ws() throws RecognitionException {
		Css_wsContext _localctx = new Css_wsContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_css_ws);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1667);
					_la = _input.LA(1);
					if ( !(_la==CSS_COMMENT || _la==Space) ) {
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
				setState(1672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
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
		enterRule(_localctx, 252, RULE_jinjaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(JINJA_STMT_START);
			setState(1674);
			jStatement();
			setState(1675);
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
		enterRule(_localctx, 254, RULE_jStatement);
		int _la;
		try {
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				jIfStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				jForStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1679);
				match(J_NAME);
				setState(1681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & 549766823967L) != 0)) {
					{
					setState(1680);
					jTestExpr();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1683);
				match(J_SET);
				setState(1684);
				jExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1685);
				jRawStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1686);
				match(J_NAME);
				setState(1691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==J_LPAREN) {
					{
					setState(1687);
					match(J_LPAREN);
					setState(1688);
					jArgumentList();
					setState(1689);
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
		enterRule(_localctx, 256, RULE_jRawStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(J_RAW);
			setState(1696);
			html_content();
			setState(1697);
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
		enterRule(_localctx, 258, RULE_jIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			match(J_IF);
			setState(1700);
			jTestExpr();
			setState(1701);
			html_content();
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_ELIF) {
				{
				{
				setState(1702);
				match(J_ELIF);
				setState(1703);
				jTestExpr();
				setState(1704);
				html_content();
				}
				}
				setState(1710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_ELSE) {
				{
				setState(1711);
				match(J_ELSE);
				setState(1712);
				html_content();
				}
			}

			setState(1715);
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
		enterRule(_localctx, 260, RULE_jForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			match(J_FOR);
			setState(1718);
			jTargetList();
			setState(1719);
			match(J_IN);
			setState(1720);
			jExpression();
			setState(1721);
			html_content();
			setState(1724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_ELSE) {
				{
				setState(1722);
				match(J_ELSE);
				setState(1723);
				html_content();
				}
			}

			setState(1726);
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
		enterRule(_localctx, 262, RULE_jTargetList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			match(J_NAME);
			setState(1733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1729);
				match(J_COMMA);
				setState(1730);
				match(J_NAME);
				}
				}
				setState(1735);
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
		enterRule(_localctx, 264, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			match(JINJA_EXPR_START);
			setState(1737);
			jExpression();
			setState(1738);
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
		enterRule(_localctx, 266, RULE_jExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			jTestExpr();
			setState(1745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_PIPE) {
				{
				{
				setState(1741);
				match(J_PIPE);
				setState(1742);
				jFilter();
				}
				}
				setState(1747);
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
		enterRule(_localctx, 268, RULE_jFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(J_NAME);
			setState(1754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_LPAREN) {
				{
				setState(1749);
				match(J_LPAREN);
				setState(1751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & 549766823967L) != 0)) {
					{
					setState(1750);
					jArgumentList();
					}
				}

				setState(1753);
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
		enterRule(_localctx, 270, RULE_jTestExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
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
		enterRule(_localctx, 272, RULE_jOrTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			jAndTest();
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_OR) {
				{
				{
				setState(1759);
				match(J_OR);
				setState(1760);
				jAndTest();
				}
				}
				setState(1765);
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
		enterRule(_localctx, 274, RULE_jAndTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			jNotTest();
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_AND) {
				{
				{
				setState(1767);
				match(J_AND);
				setState(1768);
				jNotTest();
				}
				}
				setState(1773);
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
		enterRule(_localctx, 276, RULE_jNotTest);
		try {
			setState(1777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1774);
				match(J_NOT);
				setState(1775);
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
				setState(1776);
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
		enterRule(_localctx, 278, RULE_jComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			jMathExpr();
			setState(1785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 1082130495L) != 0)) {
				{
				{
				setState(1780);
				jCompOp();
				setState(1781);
				jMathExpr();
				}
				}
				setState(1787);
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
		enterRule(_localctx, 280, RULE_jCompOp);
		try {
			setState(1797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1788);
				match(J_LT);
				}
				break;
			case J_GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
				match(J_GT);
				}
				break;
			case J_EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(1790);
				match(J_EQ);
				}
				break;
			case J_NE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1791);
				match(J_NE);
				}
				break;
			case J_GE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1792);
				match(J_GE);
				}
				break;
			case J_LE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1793);
				match(J_LE);
				}
				break;
			case J_IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1794);
				match(J_IN);
				}
				break;
			case J_NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1795);
				match(J_NOT);
				setState(1796);
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
		enterRule(_localctx, 282, RULE_jMathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			jTerm();
			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_PLUS || _la==J_MINUS) {
				{
				{
				setState(1800);
				_la = _input.LA(1);
				if ( !(_la==J_PLUS || _la==J_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1801);
				jTerm();
				}
				}
				setState(1806);
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
		enterRule(_localctx, 284, RULE_jTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			jFactor();
			setState(1812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 15L) != 0)) {
				{
				{
				setState(1808);
				_la = _input.LA(1);
				if ( !(((((_la - 153)) & ~0x3f) == 0 && ((1L << (_la - 153)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1809);
				jFactor();
				}
				}
				setState(1814);
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
		enterRule(_localctx, 286, RULE_jFactor);
		int _la;
		try {
			setState(1818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_PLUS:
			case J_MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1815);
				_la = _input.LA(1);
				if ( !(_la==J_PLUS || _la==J_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1816);
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
				setState(1817);
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
		enterRule(_localctx, 288, RULE_jAtomExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			jAtom();
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & 41L) != 0)) {
				{
				{
				setState(1821);
				jTrailer();
				}
				}
				setState(1826);
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
		enterRule(_localctx, 290, RULE_jTrailer);
		int _la;
		try {
			setState(1838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1827);
				match(J_LPAREN);
				setState(1829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & 549766823967L) != 0)) {
					{
					setState(1828);
					jArgumentList();
					}
				}

				setState(1831);
				match(J_RPAREN);
				}
				break;
			case J_LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1832);
				match(J_LBRACK);
				setState(1833);
				jTestExpr();
				setState(1834);
				match(J_RBRACK);
				}
				break;
			case J_DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1836);
				match(J_DOT);
				setState(1837);
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
		enterRule(_localctx, 292, RULE_jAtom);
		int _la;
		try {
			setState(1857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1840);
				match(J_NAME);
				}
				break;
			case J_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1841);
				match(J_NUMBER);
				}
				break;
			case J_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1842);
				match(J_STRING);
				}
				break;
			case J_LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1843);
				match(J_LPAREN);
				setState(1844);
				jTestExpr();
				setState(1845);
				match(J_RPAREN);
				}
				break;
			case J_LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1847);
				match(J_LBRACK);
				setState(1849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & 549766823967L) != 0)) {
					{
					setState(1848);
					jTestExprList();
					}
				}

				setState(1851);
				match(J_RBRACK);
				}
				break;
			case J_LBRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1852);
				match(J_LBRACE);
				setState(1854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & 549766823967L) != 0)) {
					{
					setState(1853);
					jDictMaker();
					}
				}

				setState(1856);
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
		enterRule(_localctx, 294, RULE_jTestExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			jTestExpr();
			setState(1864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1860);
				match(J_COMMA);
				setState(1861);
				jTestExpr();
				}
				}
				setState(1866);
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
		enterRule(_localctx, 296, RULE_jArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			jTestExpr();
			setState(1872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1868);
				match(J_COMMA);
				setState(1869);
				jTestExpr();
				}
				}
				setState(1874);
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
		enterRule(_localctx, 298, RULE_jDictMaker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			jTestExpr();
			setState(1876);
			match(J_COLON);
			setState(1877);
			jTestExpr();
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1878);
				match(J_COMMA);
				setState(1879);
				jTestExpr();
				setState(1880);
				match(J_COLON);
				setState(1881);
				jTestExpr();
				}
				}
				setState(1887);
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
		"\u0004\u0001\u00d5\u0761\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0001\u0000\u0001\u0000\u0005\u0000\u012f\b\u0000\n\u0000\f\u0000"+
		"\u0132\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0138\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u013d\b"+
		"\u0002\n\u0002\f\u0002\u0140\t\u0002\u0003\u0002\u0142\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u014c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u0151\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0157\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0161\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0167\b\u0007"+
		"\n\u0007\f\u0007\u016a\t\u0007\u0001\b\u0001\b\u0003\b\u016e\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0174\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u017b\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u0180\b\u000b\n\u000b\f\u000b\u0183\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0188\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u018d\b\r\n\r\f\r"+
		"\u0190\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0196\b\u000e\n\u000e\f\u000e\u0199\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0004\u0010\u019f\b\u0010\u000b\u0010\f\u0010\u01a0"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01a7\b\u0011"+
		"\u0001\u0011\u0003\u0011\u01aa\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01b3\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01ba\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u01c1\b\u0014\n\u0014\f\u0014\u01c4\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u01cf\b\u0015\n\u0015\f\u0015\u01d2\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d7\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01db\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u01e3\b\u0018\u000b\u0018"+
		"\f\u0018\u01e4\u0001\u0018\u0001\u0018\u0003\u0018\u01e9\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01ee\b\u0019\n\u0019\f\u0019"+
		"\u01f1\t\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u01f8\b\u001b\n\u001b\f\u001b\u01fb\t\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0200\b\u001c\n\u001c\f\u001c\u0203\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0208\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u020e\b\u001e\n\u001e"+
		"\f\u001e\u0211\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u021c\b\u001f\u0001 \u0001 \u0001 \u0005 \u0221\b \n \f \u0224\t \u0001"+
		"!\u0001!\u0001!\u0005!\u0229\b!\n!\f!\u022c\t!\u0001\"\u0001\"\u0001\""+
		"\u0003\"\u0231\b\"\u0001#\u0001#\u0001$\u0001$\u0005$\u0237\b$\n$\f$\u023a"+
		"\t$\u0001%\u0001%\u0003%\u023e\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u0247\b%\u0001&\u0001&\u0001&\u0004&\u024c\b&\u000b&\f"+
		"&\u024d\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0255\b&\u0001&\u0001"+
		"&\u0001&\u0003&\u025a\b&\u0001&\u0001&\u0001&\u0003&\u025f\b&\u0001&\u0003"+
		"&\u0262\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u026a"+
		"\b\'\n\'\f\'\u026d\t\'\u0003\'\u026f\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0005(\u0277\b(\n(\f(\u027a\t(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0005)\u0284\b)\n)\f)\u0287\t)\u0001*\u0001*\u0001"+
		"*\u0005*\u028c\b*\n*\f*\u028f\t*\u0001+\u0001+\u0001+\u0001+\u0003+\u0295"+
		"\b+\u0001,\u0001,\u0005,\u0299\b,\n,\f,\u029c\t,\u0001,\u0001,\u0001,"+
		"\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02a9"+
		"\b,\u0001-\u0001-\u0001-\u0003-\u02ae\b-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u02b4\b-\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u02bb\b/\n/\f/\u02be"+
		"\t/\u0005/\u02c0\b/\n/\f/\u02c3\t/\u0001/\u0001/\u0005/\u02c7\b/\n/\f"+
		"/\u02ca\t/\u0005/\u02cc\b/\n/\f/\u02cf\t/\u0001/\u0001/\u0005/\u02d3\b"+
		"/\n/\f/\u02d6\t/\u0005/\u02d8\b/\n/\f/\u02db\t/\u0001/\u0001/\u0005/\u02df"+
		"\b/\n/\f/\u02e2\t/\u0005/\u02e4\b/\n/\f/\u02e7\t/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u02f7\b0\u00011\u00011\u00011\u00011\u00031\u02fd\b1\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u0308"+
		"\b1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u0312"+
		"\b1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u031b\b1\u0001"+
		"1\u00011\u00031\u031f\b1\u00012\u00012\u00012\u00012\u00012\u00032\u0326"+
		"\b2\u00012\u00012\u00032\u032a\b2\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u0335\b2\u00012\u00012\u00032\u0339\b2\u0001"+
		"2\u00012\u00032\u033d\b2\u00013\u00013\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00015\u00055\u034c\b5\n5\f5\u034f"+
		"\t5\u00035\u0351\b5\u00015\u00015\u00016\u00036\u0356\b6\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00056\u035f\b6\n6\f6\u0362\t6\u0001"+
		"6\u00016\u00016\u00016\u00016\u00056\u0369\b6\n6\f6\u036c\t6\u00036\u036e"+
		"\b6\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u0379\b8\u00018\u00018\u00018\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0003:\u0384\b:\u0001:\u0001:\u0001:\u0003:\u0389\b:\u0001:\u0001:\u0001"+
		":\u0003:\u038e\b:\u0005:\u0390\b:\n:\f:\u0393\t:\u0001:\u0001:\u0001:"+
		"\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0005"+
		"<\u03a1\b<\n<\f<\u03a4\t<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0005"+
		"=\u03ac\b=\n=\f=\u03af\t=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0003>\u03b9\b>\u0001?\u0001?\u0003?\u03bd\b?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0005?\u03c4\b?\n?\f?\u03c7\t?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0004?\u03ce\b?\u000b?\f?\u03cf\u0003?\u03d2\b?\u0001@\u0003"+
		"@\u03d5\b@\u0001@\u0001@\u0001A\u0001A\u0003A\u03db\bA\u0001A\u0001A\u0001"+
		"B\u0001B\u0001C\u0003C\u03e2\bC\u0001C\u0001C\u0001D\u0001D\u0001D\u0001"+
		"E\u0001E\u0001E\u0003E\u03ec\bE\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0003E\u03f4\bE\u0001E\u0001E\u0003E\u03f8\bE\u0001E\u0001E\u0001F\u0001"+
		"F\u0003F\u03fe\bF\u0001F\u0001F\u0003F\u0402\bF\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u0410"+
		"\bH\u0001H\u0004H\u0413\bH\u000bH\fH\u0414\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u0423"+
		"\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u042d"+
		"\bK\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003"+
		"L\u0438\bL\u0001M\u0001M\u0001M\u0001M\u0003M\u043e\bM\u0001M\u0001M\u0001"+
		"M\u0001M\u0005M\u0444\bM\nM\fM\u0447\tM\u0001M\u0001M\u0001M\u0003M\u044c"+
		"\bM\u0001M\u0001M\u0001M\u0003M\u0451\bM\u0001N\u0001N\u0005N\u0455\b"+
		"N\nN\fN\u0458\tN\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u045f\bN\u0005"+
		"N\u0461\bN\nN\fN\u0464\tN\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u046b"+
		"\bO\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u0472\bO\u0001P\u0001P\u0001"+
		"P\u0001Q\u0001Q\u0001Q\u0001Q\u0004Q\u047b\bQ\u000bQ\fQ\u047c\u0001R\u0001"+
		"R\u0003R\u0481\bR\u0001R\u0005R\u0484\bR\nR\fR\u0487\tR\u0001S\u0001S"+
		"\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u04a4\bS\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"V\u0001V\u0001V\u0001W\u0003W\u04b6\bW\u0001W\u0001W\u0001X\u0003X\u04bb"+
		"\bX\u0001X\u0001X\u0001Y\u0003Y\u04c0\bY\u0001Y\u0001Y\u0001Z\u0003Z\u04c5"+
		"\bZ\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0005[\u04eb\b[\n[\f[\u04ee"+
		"\t[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0005[\u04f7\b[\n"+
		"[\f[\u04fa\t[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0005["+
		"\u0503\b[\n[\f[\u0506\t[\u0001[\u0001[\u0001[\u0003[\u050b\b[\u0001\\"+
		"\u0001\\\u0001\\\u0005\\\u0510\b\\\n\\\f\\\u0513\t\\\u0001\\\u0001\\\u0001"+
		"\\\u0003\\\u0518\b\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]"+
		"\u0001]\u0001]\u0003]\u0523\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0005^\u052f\b^\n^\f^\u0532\t^\u0001^\u0001"+
		"^\u0001^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0003_\u0541\b_\u0001`\u0001`\u0001`\u0005`\u0546\b`\n`\f`\u0549"+
		"\t`\u0001`\u0001`\u0001`\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"b\u0001b\u0001b\u0001b\u0003b\u0558\bb\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0003c\u0562\bc\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0004e\u0574\be\u000be\fe\u0575\u0001f\u0001f\u0001f\u0001f\u0001"+
		"f\u0001f\u0001f\u0001f\u0001f\u0001f\u0004f\u0582\bf\u000bf\ff\u0583\u0001"+
		"g\u0001g\u0001g\u0001g\u0001g\u0001h\u0001h\u0001h\u0005h\u058e\bh\nh"+
		"\fh\u0591\th\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0003i\u059c\bi\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001"+
		"k\u0001k\u0001k\u0001k\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001"+
		"l\u0001l\u0001l\u0001l\u0001l\u0005l\u05b4\bl\nl\fl\u05b7\tl\u0001m\u0001"+
		"m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0001m\u0005m\u05c3"+
		"\bm\nm\fm\u05c6\tm\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001"+
		"n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001n\u0001"+
		"n\u0003n\u05da\bn\u0001o\u0001o\u0001o\u0001o\u0001o\u0003o\u05e1\bo\u0001"+
		"o\u0001o\u0001o\u0003o\u05e6\bo\u0005o\u05e8\bo\no\fo\u05eb\to\u0001o"+
		"\u0001o\u0001o\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0001p\u0001p\u0003p\u05fa\bp\u0001q\u0001q\u0001q\u0001q\u0001q\u0001"+
		"q\u0001q\u0001q\u0001q\u0005q\u0605\bq\nq\fq\u0608\tq\u0001q\u0001q\u0001"+
		"q\u0001r\u0001r\u0001r\u0001r\u0003r\u0611\br\u0001r\u0001r\u0001r\u0001"+
		"s\u0001s\u0001s\u0001s\u0001s\u0001s\u0001s\u0005s\u061d\bs\ns\fs\u0620"+
		"\ts\u0001t\u0001t\u0001t\u0001t\u0001t\u0003t\u0627\bt\u0001t\u0001t\u0001"+
		"t\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0001u\u0003u\u0633\bu\u0001"+
		"u\u0001u\u0001u\u0001v\u0001v\u0001v\u0001v\u0001v\u0001v\u0001v\u0005"+
		"v\u063f\bv\nv\fv\u0642\tv\u0001v\u0001v\u0001v\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0005w\u064d\bw\nw\fw\u0650\tw\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0005x\u0657\bx\nx\fx\u065a\tx\u0003x\u065c\bx\u0001y\u0001y"+
		"\u0001y\u0001y\u0001y\u0003y\u0663\by\u0001y\u0001y\u0001y\u0001y\u0003"+
		"y\u0669\by\u0005y\u066b\by\ny\fy\u066e\ty\u0001y\u0001y\u0001y\u0001z"+
		"\u0001z\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0005"+
		"{\u067d\b{\n{\f{\u0680\t{\u0001|\u0001|\u0001}\u0005}\u0685\b}\n}\f}\u0688"+
		"\t}\u0001~\u0001~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0001"+
		"\u007f\u0003\u007f\u0692\b\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001"+
		"\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u069c"+
		"\b\u007f\u0003\u007f\u069e\b\u007f\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0081\u0005\u0081\u06ab\b\u0081\n\u0081\f\u0081\u06ae"+
		"\t\u0081\u0001\u0081\u0001\u0081\u0003\u0081\u06b2\b\u0081\u0001\u0081"+
		"\u0001\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082"+
		"\u0001\u0082\u0001\u0082\u0003\u0082\u06bd\b\u0082\u0001\u0082\u0001\u0082"+
		"\u0001\u0083\u0001\u0083\u0001\u0083\u0005\u0083\u06c4\b\u0083\n\u0083"+
		"\f\u0083\u06c7\t\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0005\u0085\u06d0\b\u0085\n\u0085"+
		"\f\u0085\u06d3\t\u0085\u0001\u0086\u0001\u0086\u0001\u0086\u0003\u0086"+
		"\u06d8\b\u0086\u0001\u0086\u0003\u0086\u06db\b\u0086\u0001\u0087\u0001"+
		"\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0005\u0088\u06e2\b\u0088\n"+
		"\u0088\f\u0088\u06e5\t\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0005"+
		"\u0089\u06ea\b\u0089\n\u0089\f\u0089\u06ed\t\u0089\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0003\u008a\u06f2\b\u008a\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0005\u008b\u06f8\b\u008b\n\u008b\f\u008b\u06fb\t\u008b\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001"+
		"\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u0706\b\u008c\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0005\u008d\u070b\b\u008d\n\u008d\f\u008d\u070e\t\u008d"+
		"\u0001\u008e\u0001\u008e\u0001\u008e\u0005\u008e\u0713\b\u008e\n\u008e"+
		"\f\u008e\u0716\t\u008e\u0001\u008f\u0001\u008f\u0001\u008f\u0003\u008f"+
		"\u071b\b\u008f\u0001\u0090\u0001\u0090\u0005\u0090\u071f\b\u0090\n\u0090"+
		"\f\u0090\u0722\t\u0090\u0001\u0091\u0001\u0091\u0003\u0091\u0726\b\u0091"+
		"\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091"+
		"\u0001\u0091\u0003\u0091\u072f\b\u0091\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0003\u0092\u073a\b\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0003\u0092"+
		"\u073f\b\u0092\u0001\u0092\u0003\u0092\u0742\b\u0092\u0001\u0093\u0001"+
		"\u0093\u0001\u0093\u0005\u0093\u0747\b\u0093\n\u0093\f\u0093\u074a\t\u0093"+
		"\u0001\u0094\u0001\u0094\u0001\u0094\u0005\u0094\u074f\b\u0094\n\u0094"+
		"\f\u0094\u0752\t\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095"+
		"\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0005\u0095\u075c\b\u0095"+
		"\n\u0095\f\u0095\u075f\t\u0095\u0001\u0095\u0000\u0000\u0096\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u0000\u000e"+
		"\u0002\u0000\u0003\u0003\u001c\u001c\u0001\u0000%&\u0001\u0000\')\u0001"+
		"\u0000FG\u0002\u0000PPgi\u0001\u0000vw\u0003\u0000aajk~\u0080\u0001\u0000"+
		"]^\u0002\u0000WW\u0090\u0090\u0002\u0000ss\u0085\u0086\u0004\u0000vx\u0083"+
		"\u0083\u0085\u0086\u008f\u008f\u0002\u0000PPgg\u0001\u0000\u0097\u0098"+
		"\u0001\u0000\u0099\u009c\u0800\u0000\u0130\u0001\u0000\u0000\u0000\u0002"+
		"\u0137\u0001\u0000\u0000\u0000\u0004\u0141\u0001\u0000\u0000\u0000\u0006"+
		"\u014b\u0001\u0000\u0000\u0000\b\u0150\u0001\u0000\u0000\u0000\n\u0152"+
		"\u0001\u0000\u0000\u0000\f\u0160\u0001\u0000\u0000\u0000\u000e\u0168\u0001"+
		"\u0000\u0000\u0000\u0010\u016d\u0001\u0000\u0000\u0000\u0012\u016f\u0001"+
		"\u0000\u0000\u0000\u0014\u0175\u0001\u0000\u0000\u0000\u0016\u017c\u0001"+
		"\u0000\u0000\u0000\u0018\u0184\u0001\u0000\u0000\u0000\u001a\u0189\u0001"+
		"\u0000\u0000\u0000\u001c\u0191\u0001\u0000\u0000\u0000\u001e\u019a\u0001"+
		"\u0000\u0000\u0000 \u019e\u0001\u0000\u0000\u0000\"\u01a2\u0001\u0000"+
		"\u0000\u0000$\u01ad\u0001\u0000\u0000\u0000&\u01b7\u0001\u0000\u0000\u0000"+
		"(\u01bd\u0001\u0000\u0000\u0000*\u01c5\u0001\u0000\u0000\u0000,\u01d8"+
		"\u0001\u0000\u0000\u0000.\u01dc\u0001\u0000\u0000\u00000\u01e8\u0001\u0000"+
		"\u0000\u00002\u01ea\u0001\u0000\u0000\u00004\u01f2\u0001\u0000\u0000\u0000"+
		"6\u01f4\u0001\u0000\u0000\u00008\u01fc\u0001\u0000\u0000\u0000:\u0207"+
		"\u0001\u0000\u0000\u0000<\u0209\u0001\u0000\u0000\u0000>\u021b\u0001\u0000"+
		"\u0000\u0000@\u021d\u0001\u0000\u0000\u0000B\u0225\u0001\u0000\u0000\u0000"+
		"D\u0230\u0001\u0000\u0000\u0000F\u0232\u0001\u0000\u0000\u0000H\u0234"+
		"\u0001\u0000\u0000\u0000J\u0246\u0001\u0000\u0000\u0000L\u0261\u0001\u0000"+
		"\u0000\u0000N\u026e\u0001\u0000\u0000\u0000P\u0270\u0001\u0000\u0000\u0000"+
		"R\u027b\u0001\u0000\u0000\u0000T\u0288\u0001\u0000\u0000\u0000V\u0294"+
		"\u0001\u0000\u0000\u0000X\u02a8\u0001\u0000\u0000\u0000Z\u02b3\u0001\u0000"+
		"\u0000\u0000\\\u02b5\u0001\u0000\u0000\u0000^\u02b7\u0001\u0000\u0000"+
		"\u0000`\u02f6\u0001\u0000\u0000\u0000b\u031e\u0001\u0000\u0000\u0000d"+
		"\u033c\u0001\u0000\u0000\u0000f\u033e\u0001\u0000\u0000\u0000h\u0340\u0001"+
		"\u0000\u0000\u0000j\u0350\u0001\u0000\u0000\u0000l\u036d\u0001\u0000\u0000"+
		"\u0000n\u036f\u0001\u0000\u0000\u0000p\u0371\u0001\u0000\u0000\u0000r"+
		"\u037d\u0001\u0000\u0000\u0000t\u0380\u0001\u0000\u0000\u0000v\u0397\u0001"+
		"\u0000\u0000\u0000x\u039b\u0001\u0000\u0000\u0000z\u03a5\u0001\u0000\u0000"+
		"\u0000|\u03b8\u0001\u0000\u0000\u0000~\u03d1\u0001\u0000\u0000\u0000\u0080"+
		"\u03d4\u0001\u0000\u0000\u0000\u0082\u03da\u0001\u0000\u0000\u0000\u0084"+
		"\u03de\u0001\u0000\u0000\u0000\u0086\u03e1\u0001\u0000\u0000\u0000\u0088"+
		"\u03e5\u0001\u0000\u0000\u0000\u008a\u03e8\u0001\u0000\u0000\u0000\u008c"+
		"\u03fb\u0001\u0000\u0000\u0000\u008e\u0403\u0001\u0000\u0000\u0000\u0090"+
		"\u0412\u0001\u0000\u0000\u0000\u0092\u0416\u0001\u0000\u0000\u0000\u0094"+
		"\u0422\u0001\u0000\u0000\u0000\u0096\u042c\u0001\u0000\u0000\u0000\u0098"+
		"\u0437\u0001\u0000\u0000\u0000\u009a\u0450\u0001\u0000\u0000\u0000\u009c"+
		"\u0456\u0001\u0000\u0000\u0000\u009e\u0471\u0001\u0000\u0000\u0000\u00a0"+
		"\u0473\u0001\u0000\u0000\u0000\u00a2\u047a\u0001\u0000\u0000\u0000\u00a4"+
		"\u047e\u0001\u0000\u0000\u0000\u00a6\u04a3\u0001\u0000\u0000\u0000\u00a8"+
		"\u04a5\u0001\u0000\u0000\u0000\u00aa\u04ab\u0001\u0000\u0000\u0000\u00ac"+
		"\u04b1\u0001\u0000\u0000\u0000\u00ae\u04b5\u0001\u0000\u0000\u0000\u00b0"+
		"\u04ba\u0001\u0000\u0000\u0000\u00b2\u04bf\u0001\u0000\u0000\u0000\u00b4"+
		"\u04c4\u0001\u0000\u0000\u0000\u00b6\u050a\u0001\u0000\u0000\u0000\u00b8"+
		"\u050c\u0001\u0000\u0000\u0000\u00ba\u0522\u0001\u0000\u0000\u0000\u00bc"+
		"\u0524\u0001\u0000\u0000\u0000\u00be\u0540\u0001\u0000\u0000\u0000\u00c0"+
		"\u0542\u0001\u0000\u0000\u0000\u00c2\u054d\u0001\u0000\u0000\u0000\u00c4"+
		"\u0557\u0001\u0000\u0000\u0000\u00c6\u0561\u0001\u0000\u0000\u0000\u00c8"+
		"\u0563\u0001\u0000\u0000\u0000\u00ca\u0569\u0001\u0000\u0000\u0000\u00cc"+
		"\u0577\u0001\u0000\u0000\u0000\u00ce\u0585\u0001\u0000\u0000\u0000\u00d0"+
		"\u058a\u0001\u0000\u0000\u0000\u00d2\u059b\u0001\u0000\u0000\u0000\u00d4"+
		"\u059d\u0001\u0000\u0000\u0000\u00d6\u05a4\u0001\u0000\u0000\u0000\u00d8"+
		"\u05aa\u0001\u0000\u0000\u0000\u00da\u05b8\u0001\u0000\u0000\u0000\u00dc"+
		"\u05d9\u0001\u0000\u0000\u0000\u00de\u05db\u0001\u0000\u0000\u0000\u00e0"+
		"\u05f9\u0001\u0000\u0000\u0000\u00e2\u05fb\u0001\u0000\u0000\u0000\u00e4"+
		"\u060c\u0001\u0000\u0000\u0000\u00e6\u0615\u0001\u0000\u0000\u0000\u00e8"+
		"\u0621\u0001\u0000\u0000\u0000\u00ea\u062b\u0001\u0000\u0000\u0000\u00ec"+
		"\u0637\u0001\u0000\u0000\u0000\u00ee\u0646\u0001\u0000\u0000\u0000\u00f0"+
		"\u065b\u0001\u0000\u0000\u0000\u00f2\u065d\u0001\u0000\u0000\u0000\u00f4"+
		"\u0672\u0001\u0000\u0000\u0000\u00f6\u0674\u0001\u0000\u0000\u0000\u00f8"+
		"\u0681\u0001\u0000\u0000\u0000\u00fa\u0686\u0001\u0000\u0000\u0000\u00fc"+
		"\u0689\u0001\u0000\u0000\u0000\u00fe\u069d\u0001\u0000\u0000\u0000\u0100"+
		"\u069f\u0001\u0000\u0000\u0000\u0102\u06a3\u0001\u0000\u0000\u0000\u0104"+
		"\u06b5\u0001\u0000\u0000\u0000\u0106\u06c0\u0001\u0000\u0000\u0000\u0108"+
		"\u06c8\u0001\u0000\u0000\u0000\u010a\u06cc\u0001\u0000\u0000\u0000\u010c"+
		"\u06d4\u0001\u0000\u0000\u0000\u010e\u06dc\u0001\u0000\u0000\u0000\u0110"+
		"\u06de\u0001\u0000\u0000\u0000\u0112\u06e6\u0001\u0000\u0000\u0000\u0114"+
		"\u06f1\u0001\u0000\u0000\u0000\u0116\u06f3\u0001\u0000\u0000\u0000\u0118"+
		"\u0705\u0001\u0000\u0000\u0000\u011a\u0707\u0001\u0000\u0000\u0000\u011c"+
		"\u070f\u0001\u0000\u0000\u0000\u011e\u071a\u0001\u0000\u0000\u0000\u0120"+
		"\u071c\u0001\u0000\u0000\u0000\u0122\u072e\u0001\u0000\u0000\u0000\u0124"+
		"\u0741\u0001\u0000\u0000\u0000\u0126\u0743\u0001\u0000\u0000\u0000\u0128"+
		"\u074b\u0001\u0000\u0000\u0000\u012a\u0753\u0001\u0000\u0000\u0000\u012c"+
		"\u012f\u0003\u0002\u0001\u0000\u012d\u012f\u0005\u0003\u0000\u0000\u012e"+
		"\u012c\u0001\u0000\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f"+
		"\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u0000\u0000\u0001\u0134"+
		"\u0001\u0001\u0000\u0000\u0000\u0135\u0138\u0003\b\u0004\u0000\u0136\u0138"+
		"\u0003\u0004\u0002\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136"+
		"\u0001\u0000\u0000\u0000\u0138\u0003\u0001\u0000\u0000\u0000\u0139\u013e"+
		"\u0003\u0006\u0003\u0000\u013a\u013b\u0005\u001c\u0000\u0000\u013b\u013d"+
		"\u0003\u0006\u0003\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0140"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e"+
		"\u0001\u0000\u0000\u0000\u0141\u0139\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0007\u0000\u0000\u0000\u0144\u0005\u0001\u0000\u0000\u0000\u0145\u014c"+
		"\u0003\n\u0005\u0000\u0146\u014c\u0003\u0010\b\u0000\u0147\u014c\u0003"+
		",\u0016\u0000\u0148\u014c\u0003\u001c\u000e\u0000\u0149\u014c\u0003@ "+
		"\u0000\u014a\u014c\u0003.\u0017\u0000\u014b\u0145\u0001\u0000\u0000\u0000"+
		"\u014b\u0146\u0001\u0000\u0000\u0000\u014b\u0147\u0001\u0000\u0000\u0000"+
		"\u014b\u0148\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u0007\u0001\u0000\u0000\u0000"+
		"\u014d\u0151\u0003*\u0015\u0000\u014e\u0151\u0003$\u0012\u0000\u014f\u0151"+
		"\u0003\u001e\u000f\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151\t\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u00051\u0000\u0000\u0153\u0156\u0005\u001e"+
		"\u0000\u0000\u0154\u0157\u00034\u001a\u0000\u0155\u0157\u0003\f\u0006"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u000b\u0001\u0000\u0000\u0000\u0158\u0159\u00054\u0000\u0000"+
		"\u0159\u015a\u0003\u000e\u0007\u0000\u015a\u015b\u00056\u0000\u0000\u015b"+
		"\u0161\u0001\u0000\u0000\u0000\u015c\u015d\u00055\u0000\u0000\u015d\u015e"+
		"\u0003\u000e\u0007\u0000\u015e\u015f\u00057\u0000\u0000\u015f\u0161\u0001"+
		"\u0000\u0000\u0000\u0160\u0158\u0001\u0000\u0000\u0000\u0160\u015c\u0001"+
		"\u0000\u0000\u0000\u0161\r\u0001\u0000\u0000\u0000\u0162\u0167\u0003X"+
		",\u0000\u0163\u0167\u0003\u00fc~\u0000\u0164\u0167\u0003\u0108\u0084\u0000"+
		"\u0165\u0167\u0005E\u0000\u0000\u0166\u0162\u0001\u0000\u0000\u0000\u0166"+
		"\u0163\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0165\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168"+
		"\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169"+
		"\u000f\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b"+
		"\u016e\u0003\u0012\t\u0000\u016c\u016e\u0003\u0014\n\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0011"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0005\t\u0000\u0000\u0170\u0173\u0003"+
		"\u001a\r\u0000\u0171\u0172\u0005\n\u0000\u0000\u0172\u0174\u00051\u0000"+
		"\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0013\u0001\u0000\u0000\u0000\u0175\u0176\u0005\b\u0000\u0000"+
		"\u0176\u0177\u0003\u001a\r\u0000\u0177\u017a\u0005\t\u0000\u0000\u0178"+
		"\u017b\u0005\'\u0000\u0000\u0179\u017b\u0003\u0016\u000b\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u0015"+
		"\u0001\u0000\u0000\u0000\u017c\u0181\u0003\u0018\f\u0000\u017d\u017e\u0005"+
		"\u001d\u0000\u0000\u017e\u0180\u0003\u0018\f\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0017\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0187\u00051\u0000"+
		"\u0000\u0185\u0186\u0005\n\u0000\u0000\u0186\u0188\u00051\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000"+
		"\u0188\u0019\u0001\u0000\u0000\u0000\u0189\u018e\u00051\u0000\u0000\u018a"+
		"\u018b\u00050\u0000\u0000\u018b\u018d\u00051\u0000\u0000\u018c\u018a\u0001"+
		"\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u001b\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0192\u0005"+
		"\u0010\u0000\u0000\u0192\u0197\u00051\u0000\u0000\u0193\u0194\u0005\u001d"+
		"\u0000\u0000\u0194\u0196\u00051\u0000\u0000\u0195\u0193\u0001\u0000\u0000"+
		"\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u001d\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u019b\u0003 \u0010\u0000"+
		"\u019b\u019c\u0003$\u0012\u0000\u019c\u001f\u0001\u0000\u0000\u0000\u019d"+
		"\u019f\u0003\"\u0011\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1!\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005"+
		"\u001a\u0000\u0000\u01a3\u01a9\u0003\u001a\r\u0000\u01a4\u01a6\u0005*"+
		"\u0000\u0000\u01a5\u01a7\u0003T*\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a8\u01aa\u0005+\u0000\u0000\u01a9\u01a4\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0005\u0003\u0000\u0000\u01ac#\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0005\u0006\u0000\u0000\u01ae\u01af\u00051\u0000\u0000\u01af\u01b2\u0003"+
		"&\u0013\u0000\u01b0\u01b1\u0005\u0019\u0000\u0000\u01b1\u01b3\u00034\u001a"+
		"\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u001b\u0000"+
		"\u0000\u01b5\u01b6\u00030\u0018\u0000\u01b6%\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b9\u0005*\u0000\u0000\u01b8\u01ba\u0003(\u0014\u0000\u01b9\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0005+\u0000\u0000\u01bc\'\u0001\u0000"+
		"\u0000\u0000\u01bd\u01c2\u00051\u0000\u0000\u01be\u01bf\u0005\u001d\u0000"+
		"\u0000\u01bf\u01c1\u00051\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3)\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u000b\u0000\u0000\u01c6"+
		"\u01c7\u00034\u001a\u0000\u01c7\u01c8\u0005\u001b\u0000\u0000\u01c8\u01d0"+
		"\u00030\u0018\u0000\u01c9\u01ca\u0005\f\u0000\u0000\u01ca\u01cb\u0003"+
		"4\u001a\u0000\u01cb\u01cc\u0005\u001b\u0000\u0000\u01cc\u01cd\u00030\u0018"+
		"\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005\r\u0000\u0000"+
		"\u01d4\u01d5\u0005\u001b\u0000\u0000\u01d5\u01d7\u00030\u0018\u0000\u01d6"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7"+
		"+\u0001\u0000\u0000\u0000\u01d8\u01da\u0005\u0007\u0000\u0000\u01d9\u01db"+
		"\u00032\u0019\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db\u0001"+
		"\u0000\u0000\u0000\u01db-\u0001\u0000\u0000\u0000\u01dc\u01dd\u0003,\u0016"+
		"\u0000\u01dd/\u0001\u0000\u0000\u0000\u01de\u01e9\u0003\u0004\u0002\u0000"+
		"\u01df\u01e0\u0005\u0003\u0000\u0000\u01e0\u01e2\u0005\u0001\u0000\u0000"+
		"\u01e1\u01e3\u0003\u0002\u0001\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0005\u0002\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e8\u01de\u0001\u0000\u0000\u0000\u01e8\u01df\u0001\u0000\u0000\u0000"+
		"\u01e91\u0001\u0000\u0000\u0000\u01ea\u01ef\u00034\u001a\u0000\u01eb\u01ec"+
		"\u0005\u001d\u0000\u0000\u01ec\u01ee\u00034\u001a\u0000\u01ed\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f03\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f3\u00036\u001b"+
		"\u0000\u01f35\u0001\u0000\u0000\u0000\u01f4\u01f9\u00038\u001c\u0000\u01f5"+
		"\u01f6\u0005\u0012\u0000\u0000\u01f6\u01f8\u00038\u001c\u0000\u01f7\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa7\u0001"+
		"\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u0201\u0003"+
		":\u001d\u0000\u01fd\u01fe\u0005\u0011\u0000\u0000\u01fe\u0200\u0003:\u001d"+
		"\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000"+
		"\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000"+
		"\u0000\u02029\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0005\u0013\u0000\u0000\u0205\u0208\u0003:\u001d\u0000\u0206"+
		"\u0208\u0003<\u001e\u0000\u0207\u0204\u0001\u0000\u0000\u0000\u0207\u0206"+
		"\u0001\u0000\u0000\u0000\u0208;\u0001\u0000\u0000\u0000\u0209\u020f\u0003"+
		"@ \u0000\u020a\u020b\u0003>\u001f\u0000\u020b\u020c\u0003@ \u0000\u020c"+
		"\u020e\u0001\u0000\u0000\u0000\u020d\u020a\u0001\u0000\u0000\u0000\u020e"+
		"\u0211\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0001\u0000\u0000\u0000\u0210=\u0001\u0000\u0000\u0000\u0211\u020f"+
		"\u0001\u0000\u0000\u0000\u0212\u021c\u0005\"\u0000\u0000\u0213\u021c\u0005"+
		"!\u0000\u0000\u0214\u021c\u0005\u001f\u0000\u0000\u0215\u021c\u0005 \u0000"+
		"\u0000\u0216\u021c\u0005#\u0000\u0000\u0217\u021c\u0005$\u0000\u0000\u0218"+
		"\u021c\u0005\u000f\u0000\u0000\u0219\u021a\u0005\u0013\u0000\u0000\u021a"+
		"\u021c\u0005\u000f\u0000\u0000\u021b\u0212\u0001\u0000\u0000\u0000\u021b"+
		"\u0213\u0001\u0000\u0000\u0000\u021b\u0214\u0001\u0000\u0000\u0000\u021b"+
		"\u0215\u0001\u0000\u0000\u0000\u021b\u0216\u0001\u0000\u0000\u0000\u021b"+
		"\u0217\u0001\u0000\u0000\u0000\u021b\u0218\u0001\u0000\u0000\u0000\u021b"+
		"\u0219\u0001\u0000\u0000\u0000\u021c?\u0001\u0000\u0000\u0000\u021d\u0222"+
		"\u0003B!\u0000\u021e\u021f\u0007\u0001\u0000\u0000\u021f\u0221\u0003B"+
		"!\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0224\u0001\u0000\u0000"+
		"\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000"+
		"\u0000\u0223A\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000"+
		"\u0225\u022a\u0003D\"\u0000\u0226\u0227\u0007\u0002\u0000\u0000\u0227"+
		"\u0229\u0003D\"\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0229\u022c"+
		"\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u022b"+
		"\u0001\u0000\u0000\u0000\u022bC\u0001\u0000\u0000\u0000\u022c\u022a\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0007\u0001\u0000\u0000\u022e\u0231\u0003"+
		"D\"\u0000\u022f\u0231\u0003F#\u0000\u0230\u022d\u0001\u0000\u0000\u0000"+
		"\u0230\u022f\u0001\u0000\u0000\u0000\u0231E\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0003H$\u0000\u0233G\u0001\u0000\u0000\u0000\u0234\u0238\u0003"+
		"L&\u0000\u0235\u0237\u0003J%\u0000\u0236\u0235\u0001\u0000\u0000\u0000"+
		"\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0001\u0000\u0000\u0000\u0239I\u0001\u0000\u0000\u0000\u023a"+
		"\u0238\u0001\u0000\u0000\u0000\u023b\u023d\u0005*\u0000\u0000\u023c\u023e"+
		"\u0003T*\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000"+
		"\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0247\u0005+\u0000"+
		"\u0000\u0240\u0241\u0005,\u0000\u0000\u0241\u0242\u00034\u001a\u0000\u0242"+
		"\u0243\u0005-\u0000\u0000\u0243\u0247\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u00050\u0000\u0000\u0245\u0247\u00051\u0000\u0000\u0246\u023b\u0001\u0000"+
		"\u0000\u0000\u0246\u0240\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000"+
		"\u0000\u0000\u0247K\u0001\u0000\u0000\u0000\u0248\u0262\u00051\u0000\u0000"+
		"\u0249\u0262\u00052\u0000\u0000\u024a\u024c\u00053\u0000\u0000\u024b\u024a"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024b"+
		"\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0262"+
		"\u0001\u0000\u0000\u0000\u024f\u0262\u0005\u0016\u0000\u0000\u0250\u0262"+
		"\u0005\u0014\u0000\u0000\u0251\u0262\u0005\u0015\u0000\u0000\u0252\u0254"+
		"\u0005*\u0000\u0000\u0253\u0255\u00034\u001a\u0000\u0254\u0253\u0001\u0000"+
		"\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000"+
		"\u0000\u0000\u0256\u0262\u0005+\u0000\u0000\u0257\u0259\u0005,\u0000\u0000"+
		"\u0258\u025a\u0003N\'\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259"+
		"\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b"+
		"\u0262\u0005-\u0000\u0000\u025c\u025e\u0005.\u0000\u0000\u025d\u025f\u0003"+
		"R)\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000"+
		"\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0262\u0005/\u0000\u0000"+
		"\u0261\u0248\u0001\u0000\u0000\u0000\u0261\u0249\u0001\u0000\u0000\u0000"+
		"\u0261\u024b\u0001\u0000\u0000\u0000\u0261\u024f\u0001\u0000\u0000\u0000"+
		"\u0261\u0250\u0001\u0000\u0000\u0000\u0261\u0251\u0001\u0000\u0000\u0000"+
		"\u0261\u0252\u0001\u0000\u0000\u0000\u0261\u0257\u0001\u0000\u0000\u0000"+
		"\u0261\u025c\u0001\u0000\u0000\u0000\u0262M\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u00034\u001a\u0000\u0264\u0265\u0003P(\u0000\u0265\u026f\u0001"+
		"\u0000\u0000\u0000\u0266\u026b\u00034\u001a\u0000\u0267\u0268\u0005\u001d"+
		"\u0000\u0000\u0268\u026a\u00034\u001a\u0000\u0269\u0267\u0001\u0000\u0000"+
		"\u0000\u026a\u026d\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026f\u0001\u0000\u0000"+
		"\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026e\u0263\u0001\u0000\u0000"+
		"\u0000\u026e\u0266\u0001\u0000\u0000\u0000\u026fO\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0005\u000e\u0000\u0000\u0271\u0272\u00034\u001a\u0000\u0272"+
		"\u0273\u0005\u000f\u0000\u0000\u0273\u0278\u00034\u001a\u0000\u0274\u0275"+
		"\u0005\u000b\u0000\u0000\u0275\u0277\u00034\u001a\u0000\u0276\u0274\u0001"+
		"\u0000\u0000\u0000\u0277\u027a\u0001\u0000\u0000\u0000\u0278\u0276\u0001"+
		"\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279Q\u0001\u0000"+
		"\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u027c\u00034\u001a"+
		"\u0000\u027c\u027d\u0005\u001b\u0000\u0000\u027d\u0285\u00034\u001a\u0000"+
		"\u027e\u027f\u0005\u001d\u0000\u0000\u027f\u0280\u00034\u001a\u0000\u0280"+
		"\u0281\u0005\u001b\u0000\u0000\u0281\u0282\u00034\u001a\u0000\u0282\u0284"+
		"\u0001\u0000\u0000\u0000\u0283\u027e\u0001\u0000\u0000\u0000\u0284\u0287"+
		"\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286"+
		"\u0001\u0000\u0000\u0000\u0286S\u0001\u0000\u0000\u0000\u0287\u0285\u0001"+
		"\u0000\u0000\u0000\u0288\u028d\u0003V+\u0000\u0289\u028a\u0005\u001d\u0000"+
		"\u0000\u028a\u028c\u0003V+\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c"+
		"\u028f\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\u0001\u0000\u0000\u0000\u028eU\u0001\u0000\u0000\u0000\u028f\u028d"+
		"\u0001\u0000\u0000\u0000\u0290\u0295\u00034\u001a\u0000\u0291\u0292\u0005"+
		"1\u0000\u0000\u0292\u0293\u0005\u001e\u0000\u0000\u0293\u0295\u00034\u001a"+
		"\u0000\u0294\u0290\u0001\u0000\u0000\u0000\u0294\u0291\u0001\u0000\u0000"+
		"\u0000\u0295W\u0001\u0000\u0000\u0000\u0296\u029a\u0005D\u0000\u0000\u0297"+
		"\u0299\u0003Z-\u0000\u0298\u0297\u0001\u0000\u0000\u0000\u0299\u029c\u0001"+
		"\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000\u029a\u029b\u0001"+
		"\u0000\u0000\u0000\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u029a\u0001"+
		"\u0000\u0000\u0000\u029d\u02a9\u0007\u0003\u0000\u0000\u029e\u029f\u0005"+
		"B\u0000\u0000\u029f\u02a9\u0005M\u0000\u0000\u02a0\u02a1\u0005C\u0000"+
		"\u0000\u02a1\u02a2\u0003\\.\u0000\u02a2\u02a3\u0005N\u0000\u0000\u02a3"+
		"\u02a9\u0001\u0000\u0000\u0000\u02a4\u02a9\u0005=\u0000\u0000\u02a5\u02a9"+
		"\u0005>\u0000\u0000\u02a6\u02a9\u0005?\u0000\u0000\u02a7\u02a9\u0005@"+
		"\u0000\u0000\u02a8\u0296\u0001\u0000\u0000\u0000\u02a8\u029e\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a0\u0001\u0000\u0000\u0000\u02a8\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a5\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a9Y\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ad\u0005J\u0000\u0000\u02ab\u02ac\u0005I\u0000\u0000\u02ac"+
		"\u02ae\u0005L\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae"+
		"\u0001\u0000\u0000\u0000\u02ae\u02b4\u0001\u0000\u0000\u0000\u02af\u02b4"+
		"\u0003\u0108\u0084\u0000\u02b0\u02b4\u0003\u00fc~\u0000\u02b1\u02b4\u0005"+
		"H\u0000\u0000\u02b2\u02b4\u0005I\u0000\u0000\u02b3\u02aa\u0001\u0000\u0000"+
		"\u0000\u02b3\u02af\u0001\u0000\u0000\u0000\u02b3\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b4[\u0001\u0000\u0000\u0000\u02b5\u02b6\u0003^/\u0000\u02b6"+
		"]\u0001\u0000\u0000\u0000\u02b7\u02c1\u0003\u00fa}\u0000\u02b8\u02bc\u0003"+
		"`0\u0000\u02b9\u02bb\u0007\u0004\u0000\u0000\u02ba\u02b9\u0001\u0000\u0000"+
		"\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000"+
		"\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000"+
		"\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02b8\u0001\u0000\u0000"+
		"\u0000\u02c0\u02c3\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02cd\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c4\u02c8\u0003b1\u0000\u02c5"+
		"\u02c7\u0007\u0004\u0000\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c7"+
		"\u02ca\u0001\u0000\u0000\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca"+
		"\u02c8\u0001\u0000\u0000\u0000\u02cb\u02c4\u0001\u0000\u0000\u0000\u02cc"+
		"\u02cf\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd"+
		"\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d9\u0001\u0000\u0000\u0000\u02cf"+
		"\u02cd\u0001\u0000\u0000\u0000\u02d0\u02d4\u0003d2\u0000\u02d1\u02d3\u0007"+
		"\u0004\u0000\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d8\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d0\u0001\u0000\u0000\u0000\u02d8\u02db\u0001"+
		"\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001"+
		"\u0000\u0000\u0000\u02da\u02e5\u0001\u0000\u0000\u0000\u02db\u02d9\u0001"+
		"\u0000\u0000\u0000\u02dc\u02e0\u0003\u00be_\u0000\u02dd\u02df\u0007\u0004"+
		"\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e4\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000"+
		"\u0000\u0000\u02e3\u02dc\u0001\u0000\u0000\u0000\u02e4\u02e7\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e8\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e9\u0005\u0000\u0000\u0001\u02e9_\u0001\u0000\u0000"+
		"\u0000\u02ea\u02eb\u0005q\u0000\u0000\u02eb\u02ec\u0003\u00fa}\u0000\u02ec"+
		"\u02ed\u0005}\u0000\u0000\u02ed\u02ee\u0003\u00fa}\u0000\u02ee\u02ef\u0005"+
		"T\u0000\u0000\u02ef\u02f0\u0003\u00fa}\u0000\u02f0\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u0005q\u0000\u0000\u02f2\u02f3\u0003\u00fa}\u0000\u02f3"+
		"\u02f4\u0005}\u0000\u0000\u02f4\u02f5\u0003\u00fa}\u0000\u02f5\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f6\u02ea\u0001\u0000\u0000\u0000\u02f6\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f7a\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005m\u0000"+
		"\u0000\u02f9\u02fc\u0003\u00fa}\u0000\u02fa\u02fd\u0005}\u0000\u0000\u02fb"+
		"\u02fd\u0003\u00d2i\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fb"+
		"\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u02ff"+
		"\u0003\u00fa}\u0000\u02ff\u0300\u0003j5\u0000\u0300\u0301\u0005T\u0000"+
		"\u0000\u0301\u0302\u0003\u00fa}\u0000\u0302\u031f\u0001\u0000\u0000\u0000"+
		"\u0303\u0304\u0005m\u0000\u0000\u0304\u0307\u0003\u00fa}\u0000\u0305\u0308"+
		"\u0005}\u0000\u0000\u0306\u0308\u0003\u00d2i\u0000\u0307\u0305\u0001\u0000"+
		"\u0000\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000"+
		"\u0000\u0000\u0309\u030a\u0003\u00fa}\u0000\u030a\u030b\u0005T\u0000\u0000"+
		"\u030b\u030c\u0003\u00fa}\u0000\u030c\u031f\u0001\u0000\u0000\u0000\u030d"+
		"\u030e\u0005m\u0000\u0000\u030e\u0311\u0003\u00fa}\u0000\u030f\u0312\u0005"+
		"}\u0000\u0000\u0310\u0312\u0003\u00d2i\u0000\u0311\u030f\u0001\u0000\u0000"+
		"\u0000\u0311\u0310\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0003\u00fa}\u0000\u0314\u0315\u0003j5\u0000\u0315"+
		"\u031f\u0001\u0000\u0000\u0000\u0316\u0317\u0005m\u0000\u0000\u0317\u031a"+
		"\u0003\u00fa}\u0000\u0318\u031b\u0005}\u0000\u0000\u0319\u031b\u0003\u00d2"+
		"i\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031a\u0319\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0003\u00fa}\u0000"+
		"\u031d\u031f\u0001\u0000\u0000\u0000\u031e\u02f8\u0001\u0000\u0000\u0000"+
		"\u031e\u0303\u0001\u0000\u0000\u0000\u031e\u030d\u0001\u0000\u0000\u0000"+
		"\u031e\u0316\u0001\u0000\u0000\u0000\u031fc\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0005p\u0000\u0000\u0321\u0325\u0003\u00fa}\u0000\u0322\u0323\u0003"+
		"f3\u0000\u0323\u0324\u0003\u00fa}\u0000\u0324\u0326\u0001\u0000\u0000"+
		"\u0000\u0325\u0322\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000"+
		"\u0000\u0326\u0329\u0001\u0000\u0000\u0000\u0327\u032a\u0005}\u0000\u0000"+
		"\u0328\u032a\u0003\u00d2i\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329"+
		"\u0328\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b"+
		"\u032c\u0003\u00fa}\u0000\u032c\u032d\u0005T\u0000\u0000\u032d\u032e\u0003"+
		"\u00fa}\u0000\u032e\u033d\u0001\u0000\u0000\u0000\u032f\u0330\u0005p\u0000"+
		"\u0000\u0330\u0334\u0003\u00fa}\u0000\u0331\u0332\u0003f3\u0000\u0332"+
		"\u0333\u0003\u00fa}\u0000\u0333\u0335\u0001\u0000\u0000\u0000\u0334\u0331"+
		"\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0338"+
		"\u0001\u0000\u0000\u0000\u0336\u0339\u0005}\u0000\u0000\u0337\u0339\u0003"+
		"\u00d2i\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0338\u0337\u0001\u0000"+
		"\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u033b\u0003\u00fa"+
		"}\u0000\u033b\u033d\u0001\u0000\u0000\u0000\u033c\u0320\u0001\u0000\u0000"+
		"\u0000\u033c\u032f\u0001\u0000\u0000\u0000\u033de\u0001\u0000\u0000\u0000"+
		"\u033e\u033f\u0003\u00f8|\u0000\u033fg\u0001\u0000\u0000\u0000\u0340\u0341"+
		"\u0005o\u0000\u0000\u0341\u0342\u0003\u00fa}\u0000\u0342\u0343\u0003j"+
		"5\u0000\u0343\u0344\u0003\u00c0`\u0000\u0344\u0345\u0003\u00fa}\u0000"+
		"\u0345i\u0001\u0000\u0000\u0000\u0346\u034d\u0003l6\u0000\u0347\u0348"+
		"\u0005Y\u0000\u0000\u0348\u0349\u0003\u00fa}\u0000\u0349\u034a\u0003l"+
		"6\u0000\u034a\u034c\u0001\u0000\u0000\u0000\u034b\u0347\u0001\u0000\u0000"+
		"\u0000\u034c\u034f\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000"+
		"\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u0351\u0001\u0000\u0000"+
		"\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u0350\u0346\u0001\u0000\u0000"+
		"\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000"+
		"\u0000\u0352\u0353\u0003\u00fa}\u0000\u0353k\u0001\u0000\u0000\u0000\u0354"+
		"\u0356\u0007\u0005\u0000\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0355"+
		"\u0356\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357"+
		"\u0358\u0003\u00fa}\u0000\u0358\u0359\u0003n7\u0000\u0359\u0360\u0003"+
		"\u00fa}\u0000\u035a\u035b\u0005x\u0000\u0000\u035b\u035c\u0003\u00fa}"+
		"\u0000\u035c\u035d\u0003p8\u0000\u035d\u035f\u0001\u0000\u0000\u0000\u035e"+
		"\u035a\u0001\u0000\u0000\u0000\u035f\u0362\u0001\u0000\u0000\u0000\u0360"+
		"\u035e\u0001\u0000\u0000\u0000\u0360\u0361\u0001\u0000\u0000\u0000\u0361"+
		"\u036e\u0001\u0000\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0363"+
		"\u036a\u0003p8\u0000\u0364\u0365\u0005x\u0000\u0000\u0365\u0366\u0003"+
		"\u00fa}\u0000\u0366\u0367\u0003p8\u0000\u0367\u0369\u0001\u0000\u0000"+
		"\u0000\u0368\u0364\u0001\u0000\u0000\u0000\u0369\u036c\u0001\u0000\u0000"+
		"\u0000\u036a\u0368\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000"+
		"\u0000\u036b\u036e\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000"+
		"\u0000\u036d\u0355\u0001\u0000\u0000\u0000\u036d\u0363\u0001\u0000\u0000"+
		"\u0000\u036em\u0001\u0000\u0000\u0000\u036f\u0370\u0003\u00f8|\u0000\u0370"+
		"o\u0001\u0000\u0000\u0000\u0371\u0372\u0005W\u0000\u0000\u0372\u0373\u0003"+
		"\u00fa}\u0000\u0373\u0378\u0003r9\u0000\u0374\u0375\u0005S\u0000\u0000"+
		"\u0375\u0376\u0003\u00fa}\u0000\u0376\u0377\u0003@ \u0000\u0377\u0379"+
		"\u0001\u0000\u0000\u0000\u0378\u0374\u0001\u0000\u0000\u0000\u0378\u0379"+
		"\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037b"+
		"\u0005X\u0000\u0000\u037b\u037c\u0003\u00fa}\u0000\u037cq\u0001\u0000"+
		"\u0000\u0000\u037d\u037e\u0003\u00f8|\u0000\u037e\u037f\u0003\u00fa}\u0000"+
		"\u037fs\u0001\u0000\u0000\u0000\u0380\u0381\u0005n\u0000\u0000\u0381\u0383"+
		"\u0003\u00fa}\u0000\u0382\u0384\u0003v;\u0000\u0383\u0382\u0001\u0000"+
		"\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000"+
		"\u0000\u0000\u0385\u0386\u0005Q\u0000\u0000\u0386\u0388\u0003\u00fa}\u0000"+
		"\u0387\u0389\u0003\u009eO\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0388"+
		"\u0389\u0001\u0000\u0000\u0000\u0389\u0391\u0001\u0000\u0000\u0000\u038a"+
		"\u038b\u0005T\u0000\u0000\u038b\u038d\u0003\u00fa}\u0000\u038c\u038e\u0003"+
		"\u009eO\u0000\u038d\u038c\u0001\u0000\u0000\u0000\u038d\u038e\u0001\u0000"+
		"\u0000\u0000\u038e\u0390\u0001\u0000\u0000\u0000\u038f\u038a\u0001\u0000"+
		"\u0000\u0000\u0390\u0393\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000"+
		"\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392\u0394\u0001\u0000"+
		"\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0394\u0395\u0005R\u0000"+
		"\u0000\u0395\u0396\u0003\u00fa}\u0000\u0396u\u0001\u0000\u0000\u0000\u0397"+
		"\u0398\u0005S\u0000\u0000\u0398\u0399\u0003\u00f8|\u0000\u0399\u039a\u0003"+
		"\u00fa}\u0000\u039aw\u0001\u0000\u0000\u0000\u039b\u03a2\u0003z=\u0000"+
		"\u039c\u039d\u0005Y\u0000\u0000\u039d\u039e\u0003\u00fa}\u0000\u039e\u039f"+
		"\u0003z=\u0000\u039f\u03a1\u0001\u0000\u0000\u0000\u03a0\u039c\u0001\u0000"+
		"\u0000\u0000\u03a1\u03a4\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000\u0000\u03a3y\u0001\u0000\u0000"+
		"\u0000\u03a4\u03a2\u0001\u0000\u0000\u0000\u03a5\u03a6\u0003~?\u0000\u03a6"+
		"\u03ad\u0003\u00fa}\u0000\u03a7\u03a8\u0003|>\u0000\u03a8\u03a9\u0003"+
		"~?\u0000\u03a9\u03aa\u0003\u00fa}\u0000\u03aa\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ab\u03a7\u0001\u0000\u0000\u0000\u03ac\u03af\u0001\u0000\u0000"+
		"\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000"+
		"\u0000\u03ae{\u0001\u0000\u0000\u0000\u03af\u03ad\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b1\u0005]\u0000\u0000\u03b1\u03b9\u0003\u00fa}\u0000\u03b2\u03b3"+
		"\u0005_\u0000\u0000\u03b3\u03b9\u0003\u00fa}\u0000\u03b4\u03b5\u0005`"+
		"\u0000\u0000\u03b5\u03b9\u0003\u00fa}\u0000\u03b6\u03b7\u0005g\u0000\u0000"+
		"\u03b7\u03b9\u0003\u00fa}\u0000\u03b8\u03b0\u0001\u0000\u0000\u0000\u03b8"+
		"\u03b2\u0001\u0000\u0000\u0000\u03b8\u03b4\u0001\u0000\u0000\u0000\u03b8"+
		"\u03b6\u0001\u0000\u0000\u0000\u03b9}\u0001\u0000\u0000\u0000\u03ba\u03bd"+
		"\u0003\u0080@\u0000\u03bb\u03bd\u0003\u0086C\u0000\u03bc\u03ba\u0001\u0000"+
		"\u0000\u0000\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bd\u03c5\u0001\u0000"+
		"\u0000\u0000\u03be\u03c4\u0005l\u0000\u0000\u03bf\u03c4\u0003\u0088D\u0000"+
		"\u03c0\u03c4\u0003\u008aE\u0000\u03c1\u03c4\u0003\u008cF\u0000\u03c2\u03c4"+
		"\u0003\u0092I\u0000\u03c3\u03be\u0001\u0000\u0000\u0000\u03c3\u03bf\u0001"+
		"\u0000\u0000\u0000\u03c3\u03c0\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001"+
		"\u0000\u0000\u0000\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c7\u0001"+
		"\u0000\u0000\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c5\u03c6\u0001"+
		"\u0000\u0000\u0000\u03c6\u03d2\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001"+
		"\u0000\u0000\u0000\u03c8\u03ce\u0005l\u0000\u0000\u03c9\u03ce\u0003\u0088"+
		"D\u0000\u03ca\u03ce\u0003\u008aE\u0000\u03cb\u03ce\u0003\u008cF\u0000"+
		"\u03cc\u03ce\u0003\u0092I\u0000\u03cd\u03c8\u0001\u0000\u0000\u0000\u03cd"+
		"\u03c9\u0001\u0000\u0000\u0000\u03cd\u03ca\u0001\u0000\u0000\u0000\u03cd"+
		"\u03cb\u0001\u0000\u0000\u0000\u03cd\u03cc\u0001\u0000\u0000\u0000\u03ce"+
		"\u03cf\u0001\u0000\u0000\u0000\u03cf\u03cd\u0001\u0000\u0000\u0000\u03cf"+
		"\u03d0\u0001\u0000\u0000\u0000\u03d0\u03d2\u0001\u0000\u0000\u0000\u03d1"+
		"\u03bc\u0001\u0000\u0000\u0000\u03d1\u03cd\u0001\u0000\u0000\u0000\u03d2"+
		"\u007f\u0001\u0000\u0000\u0000\u03d3\u03d5\u0003\u0082A\u0000\u03d4\u03d3"+
		"\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6"+
		"\u0001\u0000\u0000\u0000\u03d6\u03d7\u0003\u0084B\u0000\u03d7\u0081\u0001"+
		"\u0000\u0000\u0000\u03d8\u03db\u0003\u00f8|\u0000\u03d9\u03db\u0005d\u0000"+
		"\u0000\u03da\u03d8\u0001\u0000\u0000\u0000\u03da\u03d9\u0001\u0000\u0000"+
		"\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000"+
		"\u0000\u03dc\u03dd\u0005V\u0000\u0000\u03dd\u0083\u0001\u0000\u0000\u0000"+
		"\u03de\u03df\u0003\u00f8|\u0000\u03df\u0085\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e2\u0003\u0082A\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e1\u03e2"+
		"\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e4"+
		"\u0005d\u0000\u0000\u03e4\u0087\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005"+
		"Z\u0000\u0000\u03e6\u03e7\u0003\u00f8|\u0000\u03e7\u0089\u0001\u0000\u0000"+
		"\u0000\u03e8\u03e9\u0005b\u0000\u0000\u03e9\u03eb\u0003\u00fa}\u0000\u03ea"+
		"\u03ec\u0003\u0082A\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03eb\u03ec"+
		"\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000\u03ed\u03ee"+
		"\u0003\u00f8|\u0000\u03ee\u03f7\u0003\u00fa}\u0000\u03ef\u03f0\u0007\u0006"+
		"\u0000\u0000\u03f0\u03f3\u0003\u00fa}\u0000\u03f1\u03f4\u0003\u00f8|\u0000"+
		"\u03f2\u03f4\u0005}\u0000\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f3"+
		"\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5"+
		"\u03f6\u0003\u00fa}\u0000\u03f6\u03f8\u0001\u0000\u0000\u0000\u03f7\u03ef"+
		"\u0001\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03f9"+
		"\u0001\u0000\u0000\u0000\u03f9\u03fa\u0005c\u0000\u0000\u03fa\u008b\u0001"+
		"\u0000\u0000\u0000\u03fb\u03fd\u0005S\u0000\u0000\u03fc\u03fe\u0005S\u0000"+
		"\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fe\u0401\u0001\u0000\u0000\u0000\u03ff\u0402\u0003\u00f8|\u0000"+
		"\u0400\u0402\u0003\u008eG\u0000\u0401\u03ff\u0001\u0000\u0000\u0000\u0401"+
		"\u0400\u0001\u0000\u0000\u0000\u0402\u008d\u0001\u0000\u0000\u0000\u0403"+
		"\u0404\u0005\u0090\u0000\u0000\u0404\u0405\u0003\u00fa}\u0000\u0405\u0406"+
		"\u0003\u0090H\u0000\u0406\u0407\u0005X\u0000\u0000\u0407\u008f\u0001\u0000"+
		"\u0000\u0000\u0408\u0410\u0005]\u0000\u0000\u0409\u0410\u0005^\u0000\u0000"+
		"\u040a\u0410\u0005y\u0000\u0000\u040b\u0410\u0005z\u0000\u0000\u040c\u0410"+
		"\u0005|\u0000\u0000\u040d\u0410\u0005}\u0000\u0000\u040e\u0410\u0003\u00f8"+
		"|\u0000\u040f\u0408\u0001\u0000\u0000\u0000\u040f\u0409\u0001\u0000\u0000"+
		"\u0000\u040f\u040a\u0001\u0000\u0000\u0000\u040f\u040b\u0001\u0000\u0000"+
		"\u0000\u040f\u040c\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000"+
		"\u0000\u040f\u040e\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000"+
		"\u0000\u0411\u0413\u0003\u00fa}\u0000\u0412\u040f\u0001\u0000\u0000\u0000"+
		"\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u0412\u0001\u0000\u0000\u0000"+
		"\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0091\u0001\u0000\u0000\u0000"+
		"\u0416\u0417\u0005{\u0000\u0000\u0417\u0418\u0003\u00fa}\u0000\u0418\u0419"+
		"\u0003\u0094J\u0000\u0419\u041a\u0003\u00fa}\u0000\u041a\u041b\u0005X"+
		"\u0000\u0000\u041b\u0093\u0001\u0000\u0000\u0000\u041c\u0423\u0003\u0080"+
		"@\u0000\u041d\u0423\u0003\u0086C\u0000\u041e\u0423\u0005l\u0000\u0000"+
		"\u041f\u0423\u0003\u0088D\u0000\u0420\u0423\u0003\u008aE\u0000\u0421\u0423"+
		"\u0003\u008cF\u0000\u0422\u041c\u0001\u0000\u0000\u0000\u0422\u041d\u0001"+
		"\u0000\u0000\u0000\u0422\u041e\u0001\u0000\u0000\u0000\u0422\u041f\u0001"+
		"\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0422\u0421\u0001"+
		"\u0000\u0000\u0000\u0423\u0095\u0001\u0000\u0000\u0000\u0424\u0425\u0005"+
		"[\u0000\u0000\u0425\u042d\u0003\u00fa}\u0000\u0426\u0427\u0005Y\u0000"+
		"\u0000\u0427\u042d\u0003\u00fa}\u0000\u0428\u0429\u0005g\u0000\u0000\u0429"+
		"\u042d\u0003\u00fa}\u0000\u042a\u042b\u0005a\u0000\u0000\u042b\u042d\u0003"+
		"\u00fa}\u0000\u042c\u0424\u0001\u0000\u0000\u0000\u042c\u0426\u0001\u0000"+
		"\u0000\u0000\u042c\u0428\u0001\u0000\u0000\u0000\u042c\u042a\u0001\u0000"+
		"\u0000\u0000\u042d\u0097\u0001\u0000\u0000\u0000\u042e\u042f\u0003\u00f8"+
		"|\u0000\u042f\u0430\u0003\u00fa}\u0000\u0430\u0438\u0001\u0000\u0000\u0000"+
		"\u0431\u0432\u0005\u008d\u0000\u0000\u0432\u0438\u0003\u00fa}\u0000\u0433"+
		"\u0434\u0005d\u0000\u0000\u0434\u0438\u0003\u00f8|\u0000\u0435\u0436\u0005"+
		"U\u0000\u0000\u0436\u0438\u0003\u00f8|\u0000\u0437\u042e\u0001\u0000\u0000"+
		"\u0000\u0437\u0431\u0001\u0000\u0000\u0000\u0437\u0433\u0001\u0000\u0000"+
		"\u0000\u0437\u0435\u0001\u0000\u0000\u0000\u0438\u0099\u0001\u0000\u0000"+
		"\u0000\u0439\u043a\u0003x<\u0000\u043a\u043b\u0005Q\u0000\u0000\u043b"+
		"\u043d\u0003\u00fa}\u0000\u043c\u043e\u0003\u009cN\u0000\u043d\u043c\u0001"+
		"\u0000\u0000\u0000\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u043f\u0001"+
		"\u0000\u0000\u0000\u043f\u0440\u0005R\u0000\u0000\u0440\u0441\u0003\u00fa"+
		"}\u0000\u0441\u0451\u0001\u0000\u0000\u0000\u0442\u0444\u0003\u00b6[\u0000"+
		"\u0443\u0442\u0001\u0000\u0000\u0000\u0444\u0447\u0001\u0000\u0000\u0000"+
		"\u0445\u0443\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000"+
		"\u0446\u0448\u0001\u0000\u0000\u0000\u0447\u0445\u0001\u0000\u0000\u0000"+
		"\u0448\u0449\u0005Q\u0000\u0000\u0449\u044b\u0003\u00fa}\u0000\u044a\u044c"+
		"\u0003\u009cN\u0000\u044b\u044a\u0001\u0000\u0000\u0000\u044b\u044c\u0001"+
		"\u0000\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044e\u0005"+
		"R\u0000\u0000\u044e\u044f\u0003\u00fa}\u0000\u044f\u0451\u0001\u0000\u0000"+
		"\u0000\u0450\u0439\u0001\u0000\u0000\u0000\u0450\u0445\u0001\u0000\u0000"+
		"\u0000\u0451\u009b\u0001\u0000\u0000\u0000\u0452\u0453\u0005T\u0000\u0000"+
		"\u0453\u0455\u0003\u00fa}\u0000\u0454\u0452\u0001\u0000\u0000\u0000\u0455"+
		"\u0458\u0001\u0000\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456"+
		"\u0457\u0001\u0000\u0000\u0000\u0457\u0459\u0001\u0000\u0000\u0000\u0458"+
		"\u0456\u0001\u0000\u0000\u0000\u0459\u045a\u0003\u009eO\u0000\u045a\u0462"+
		"\u0003\u00fa}\u0000\u045b\u045c\u0005T\u0000\u0000\u045c\u045e\u0003\u00fa"+
		"}\u0000\u045d\u045f\u0003\u009eO\u0000\u045e\u045d\u0001\u0000\u0000\u0000"+
		"\u045e\u045f\u0001\u0000\u0000\u0000\u045f\u0461\u0001\u0000\u0000\u0000"+
		"\u0460\u045b\u0001\u0000\u0000\u0000\u0461\u0464\u0001\u0000\u0000\u0000"+
		"\u0462\u0460\u0001\u0000\u0000\u0000\u0462\u0463\u0001\u0000\u0000\u0000"+
		"\u0463\u009d\u0001\u0000\u0000\u0000\u0464\u0462\u0001\u0000\u0000\u0000"+
		"\u0465\u0466\u0003\u0098L\u0000\u0466\u0467\u0005S\u0000\u0000\u0467\u0468"+
		"\u0003\u00fa}\u0000\u0468\u046a\u0003\u00a4R\u0000\u0469\u046b\u0003\u00a0"+
		"P\u0000\u046a\u0469\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000"+
		"\u0000\u046b\u0472\u0001\u0000\u0000\u0000\u046c\u046d\u0003\u0098L\u0000"+
		"\u046d\u046e\u0005S\u0000\u0000\u046e\u046f\u0003\u00fa}\u0000\u046f\u0470"+
		"\u0003\u00a2Q\u0000\u0470\u0472\u0001\u0000\u0000\u0000\u0471\u0465\u0001"+
		"\u0000\u0000\u0000\u0471\u046c\u0001\u0000\u0000\u0000\u0472\u009f\u0001"+
		"\u0000\u0000\u0000\u0473\u0474\u0005r\u0000\u0000\u0474\u0475\u0003\u00fa"+
		"}\u0000\u0475\u00a1\u0001\u0000\u0000\u0000\u0476\u047b\u0003\u00b6[\u0000"+
		"\u0477\u047b\u0003\u00bc^\u0000\u0478\u0479\u0005\u008c\u0000\u0000\u0479"+
		"\u047b\u0003\u00fa}\u0000\u047a\u0476\u0001\u0000\u0000\u0000\u047a\u0477"+
		"\u0001\u0000\u0000\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047b\u047c"+
		"\u0001\u0000\u0000\u0000\u047c\u047a\u0001\u0000\u0000\u0000\u047c\u047d"+
		"\u0001\u0000\u0000\u0000\u047d\u00a3\u0001\u0000\u0000\u0000\u047e\u0485"+
		"\u0003\u00a6S\u0000\u047f\u0481\u0003\u0096K\u0000\u0480\u047f\u0001\u0000"+
		"\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u0482\u0001\u0000"+
		"\u0000\u0000\u0482\u0484\u0003B!\u0000\u0483\u0480\u0001\u0000\u0000\u0000"+
		"\u0484\u0487\u0001\u0000\u0000\u0000\u0485\u0483\u0001\u0000\u0000\u0000"+
		"\u0485\u0486\u0001\u0000\u0000\u0000\u0486\u00a5\u0001\u0000\u0000\u0000"+
		"\u0487\u0485\u0001\u0000\u0000\u0000\u0488\u0489\u0003\u00aeW\u0000\u0489"+
		"\u048a\u0003\u00fa}\u0000\u048a\u04a4\u0001\u0000\u0000\u0000\u048b\u048c"+
		"\u0003\u00b0X\u0000\u048c\u048d\u0003\u00fa}\u0000\u048d\u04a4\u0001\u0000"+
		"\u0000\u0000\u048e\u048f\u0003\u00b2Y\u0000\u048f\u0490\u0003\u00fa}\u0000"+
		"\u0490\u04a4\u0001\u0000\u0000\u0000\u0491\u0492\u0005}\u0000\u0000\u0492"+
		"\u04a4\u0003\u00fa}\u0000\u0493\u0494\u0005u\u0000\u0000\u0494\u04a4\u0003"+
		"\u00fa}\u0000\u0495\u0496\u0003\u00f8|\u0000\u0496\u0497\u0003\u00fa}"+
		"\u0000\u0497\u04a4\u0001\u0000\u0000\u0000\u0498\u04a4\u0003\u00d4j\u0000"+
		"\u0499\u049a\u0003\u00d2i\u0000\u049a\u049b\u0003\u00fa}\u0000\u049b\u04a4"+
		"\u0001\u0000\u0000\u0000\u049c\u04a4\u0003\u00acV\u0000\u049d\u04a4\u0003"+
		"\u00d6k\u0000\u049e\u04a4\u0003\u00a8T\u0000\u049f\u04a0\u0003\u00b4Z"+
		"\u0000\u04a0\u04a1\u0003\u00fa}\u0000\u04a1\u04a4\u0001\u0000\u0000\u0000"+
		"\u04a2\u04a4\u0003\u00aaU\u0000\u04a3\u0488\u0001\u0000\u0000\u0000\u04a3"+
		"\u048b\u0001\u0000\u0000\u0000\u04a3\u048e\u0001\u0000\u0000\u0000\u04a3"+
		"\u0491\u0001\u0000\u0000\u0000\u04a3\u0493\u0001\u0000\u0000\u0000\u04a3"+
		"\u0495\u0001\u0000\u0000\u0000\u04a3\u0498\u0001\u0000\u0000\u0000\u04a3"+
		"\u0499\u0001\u0000\u0000\u0000\u04a3\u049c\u0001\u0000\u0000\u0000\u04a3"+
		"\u049d\u0001\u0000\u0000\u0000\u04a3\u049e\u0001\u0000\u0000\u0000\u04a3"+
		"\u049f\u0001\u0000\u0000\u0000\u04a3\u04a2\u0001\u0000\u0000\u0000\u04a4"+
		"\u00a7\u0001\u0000\u0000\u0000\u04a5\u04a6\u0005\u0090\u0000\u0000\u04a6"+
		"\u04a7\u0003\u00fa}\u0000\u04a7\u04a8\u0003\u00a4R\u0000\u04a8\u04a9\u0005"+
		"X\u0000\u0000\u04a9\u04aa\u0003\u00fa}\u0000\u04aa\u00a9\u0001\u0000\u0000"+
		"\u0000\u04ab\u04ac\u0005\u008b\u0000\u0000\u04ac\u04ad\u0003\u00fa}\u0000"+
		"\u04ad\u04ae\u0003\u00a4R\u0000\u04ae\u04af\u0005X\u0000\u0000\u04af\u04b0"+
		"\u0003\u00fa}\u0000\u04b0\u00ab\u0001\u0000\u0000\u0000\u04b1\u04b2\u0005"+
		"l\u0000\u0000\u04b2\u04b3\u0003\u00fa}\u0000\u04b3\u00ad\u0001\u0000\u0000"+
		"\u0000\u04b4\u04b6\u0007\u0007\u0000\u0000\u04b5\u04b4\u0001\u0000\u0000"+
		"\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001\u0000\u0000"+
		"\u0000\u04b7\u04b8\u0005|\u0000\u0000\u04b8\u00af\u0001\u0000\u0000\u0000"+
		"\u04b9\u04bb\u0007\u0007\u0000\u0000\u04ba\u04b9\u0001\u0000\u0000\u0000"+
		"\u04ba\u04bb\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000"+
		"\u04bc\u04bd\u0005s\u0000\u0000\u04bd\u00b1\u0001\u0000\u0000\u0000\u04be"+
		"\u04c0\u0007\u0007\u0000\u0000\u04bf\u04be\u0001\u0000\u0000\u0000\u04bf"+
		"\u04c0\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1"+
		"\u04c2\u0005y\u0000\u0000\u04c2\u00b3\u0001\u0000\u0000\u0000\u04c3\u04c5"+
		"\u0007\u0007\u0000\u0000\u04c4\u04c3\u0001\u0000\u0000\u0000\u04c4\u04c5"+
		"\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000\u0000\u0000\u04c6\u04c7"+
		"\u0005z\u0000\u0000\u04c7\u00b5\u0001\u0000\u0000\u0000\u04c8\u04c9\u0003"+
		"\u00f8|\u0000\u04c9\u04ca\u0003\u00fa}\u0000\u04ca\u050b\u0001\u0000\u0000"+
		"\u0000\u04cb\u04cc\u0003\u00aeW\u0000\u04cc\u04cd\u0003\u00fa}\u0000\u04cd"+
		"\u050b\u0001\u0000\u0000\u0000\u04ce\u04cf\u0003\u00b0X\u0000\u04cf\u04d0"+
		"\u0003\u00fa}\u0000\u04d0\u050b\u0001\u0000\u0000\u0000\u04d1\u04d2\u0003"+
		"\u00b2Y\u0000\u04d2\u04d3\u0003\u00fa}\u0000\u04d3\u050b\u0001\u0000\u0000"+
		"\u0000\u04d4\u04d5\u0003\u00b4Z\u0000\u04d5\u04d6\u0003\u00fa}\u0000\u04d6"+
		"\u050b\u0001\u0000\u0000\u0000\u04d7\u04d8\u0005}\u0000\u0000\u04d8\u050b"+
		"\u0003\u00fa}\u0000\u04d9\u04da\u0003\u00d2i\u0000\u04da\u04db\u0003\u00fa"+
		"}\u0000\u04db\u050b\u0001\u0000\u0000\u0000\u04dc\u04dd\u0005l\u0000\u0000"+
		"\u04dd\u050b\u0003\u00fa}\u0000\u04de\u04df\u0005u\u0000\u0000\u04df\u050b"+
		"\u0003\u00fa}\u0000\u04e0\u04e1\u0005j\u0000\u0000\u04e1\u050b\u0003\u00fa"+
		"}\u0000\u04e2\u04e3\u0005k\u0000\u0000\u04e3\u050b\u0003\u00fa}\u0000"+
		"\u04e4\u04e5\u0005S\u0000\u0000\u04e5\u050b\u0003\u00fa}\u0000\u04e6\u04e7"+
		"\u0005\u0090\u0000\u0000\u04e7\u04ec\u0003\u00fa}\u0000\u04e8\u04eb\u0003"+
		"\u00b6[\u0000\u04e9\u04eb\u0003\u00ba]\u0000\u04ea\u04e8\u0001\u0000\u0000"+
		"\u0000\u04ea\u04e9\u0001\u0000\u0000\u0000\u04eb\u04ee\u0001\u0000\u0000"+
		"\u0000\u04ec\u04ea\u0001\u0000\u0000\u0000\u04ec\u04ed\u0001\u0000\u0000"+
		"\u0000\u04ed\u04ef\u0001\u0000\u0000\u0000\u04ee\u04ec\u0001\u0000\u0000"+
		"\u0000\u04ef\u04f0\u0005X\u0000\u0000\u04f0\u04f1\u0003\u00fa}\u0000\u04f1"+
		"\u050b\u0001\u0000\u0000\u0000\u04f2\u04f3\u0005W\u0000\u0000\u04f3\u04f8"+
		"\u0003\u00fa}\u0000\u04f4\u04f7\u0003\u00b6[\u0000\u04f5\u04f7\u0003\u00ba"+
		"]\u0000\u04f6\u04f4\u0001\u0000\u0000\u0000\u04f6\u04f5\u0001\u0000\u0000"+
		"\u0000\u04f7\u04fa\u0001\u0000\u0000\u0000\u04f8\u04f6\u0001\u0000\u0000"+
		"\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9\u04fb\u0001\u0000\u0000"+
		"\u0000\u04fa\u04f8\u0001\u0000\u0000\u0000\u04fb\u04fc\u0005X\u0000\u0000"+
		"\u04fc\u04fd\u0003\u00fa}\u0000\u04fd\u050b\u0001\u0000\u0000\u0000\u04fe"+
		"\u04ff\u0005b\u0000\u0000\u04ff\u0504\u0003\u00fa}\u0000\u0500\u0503\u0003"+
		"\u00b6[\u0000\u0501\u0503\u0003\u00ba]\u0000\u0502\u0500\u0001\u0000\u0000"+
		"\u0000\u0502\u0501\u0001\u0000\u0000\u0000\u0503\u0506\u0001\u0000\u0000"+
		"\u0000\u0504\u0502\u0001\u0000\u0000\u0000\u0504\u0505\u0001\u0000\u0000"+
		"\u0000\u0505\u0507\u0001\u0000\u0000\u0000\u0506\u0504\u0001\u0000\u0000"+
		"\u0000\u0507\u0508\u0005c\u0000\u0000\u0508\u0509\u0003\u00fa}\u0000\u0509"+
		"\u050b\u0001\u0000\u0000\u0000\u050a\u04c8\u0001\u0000\u0000\u0000\u050a"+
		"\u04cb\u0001\u0000\u0000\u0000\u050a\u04ce\u0001\u0000\u0000\u0000\u050a"+
		"\u04d1\u0001\u0000\u0000\u0000\u050a\u04d4\u0001\u0000\u0000\u0000\u050a"+
		"\u04d7\u0001\u0000\u0000\u0000\u050a\u04d9\u0001\u0000\u0000\u0000\u050a"+
		"\u04dc\u0001\u0000\u0000\u0000\u050a\u04de\u0001\u0000\u0000\u0000\u050a"+
		"\u04e0\u0001\u0000\u0000\u0000\u050a\u04e2\u0001\u0000\u0000\u0000\u050a"+
		"\u04e4\u0001\u0000\u0000\u0000\u050a\u04e6\u0001\u0000\u0000\u0000\u050a"+
		"\u04f2\u0001\u0000\u0000\u0000\u050a\u04fe\u0001\u0000\u0000\u0000\u050b"+
		"\u00b7\u0001\u0000\u0000\u0000\u050c\u050d\u0005\u008c\u0000\u0000\u050d"+
		"\u0511\u0003\u00fa}\u0000\u050e\u0510\u0003\u00b6[\u0000\u050f\u050e\u0001"+
		"\u0000\u0000\u0000\u0510\u0513\u0001\u0000\u0000\u0000\u0511\u050f\u0001"+
		"\u0000\u0000\u0000\u0511\u0512\u0001\u0000\u0000\u0000\u0512\u0517\u0001"+
		"\u0000\u0000\u0000\u0513\u0511\u0001\u0000\u0000\u0000\u0514\u0518\u0003"+
		"\u00bc^\u0000\u0515\u0516\u0005T\u0000\u0000\u0516\u0518\u0003\u00fa}"+
		"\u0000\u0517\u0514\u0001\u0000\u0000\u0000\u0517\u0515\u0001\u0000\u0000"+
		"\u0000\u0518\u00b9\u0001\u0000\u0000\u0000\u0519\u0523\u0003\u00bc^\u0000"+
		"\u051a\u051b\u0005\u008c\u0000\u0000\u051b\u0523\u0003\u00fa}\u0000\u051c"+
		"\u051d\u0005T\u0000\u0000\u051d\u0523\u0003\u00fa}\u0000\u051e\u051f\u0005"+
		"h\u0000\u0000\u051f\u0523\u0003\u00fa}\u0000\u0520\u0521\u0005i\u0000"+
		"\u0000\u0521\u0523\u0003\u00fa}\u0000\u0522\u0519\u0001\u0000\u0000\u0000"+
		"\u0522\u051a\u0001\u0000\u0000\u0000\u0522\u051c\u0001\u0000\u0000\u0000"+
		"\u0522\u051e\u0001\u0000\u0000\u0000\u0522\u0520\u0001\u0000\u0000\u0000"+
		"\u0523\u00bb\u0001\u0000\u0000\u0000\u0524\u0525\u0005Q\u0000\u0000\u0525"+
		"\u0530\u0003\u00fa}\u0000\u0526\u052f\u0003\u009cN\u0000\u0527\u052f\u0003"+
		"\u00be_\u0000\u0528\u052f\u0003\u00b6[\u0000\u0529\u052f\u0003\u00bc^"+
		"\u0000\u052a\u052b\u0005\u008c\u0000\u0000\u052b\u052f\u0003\u00fa}\u0000"+
		"\u052c\u052d\u0005T\u0000\u0000\u052d\u052f\u0003\u00fa}\u0000\u052e\u0526"+
		"\u0001\u0000\u0000\u0000\u052e\u0527\u0001\u0000\u0000\u0000\u052e\u0528"+
		"\u0001\u0000\u0000\u0000\u052e\u0529\u0001\u0000\u0000\u0000\u052e\u052a"+
		"\u0001\u0000\u0000\u0000\u052e\u052c\u0001\u0000\u0000\u0000\u052f\u0532"+
		"\u0001\u0000\u0000\u0000\u0530\u052e\u0001\u0000\u0000\u0000\u0530\u0531"+
		"\u0001\u0000\u0000\u0000\u0531\u0533\u0001\u0000\u0000\u0000\u0532\u0530"+
		"\u0001\u0000\u0000\u0000\u0533\u0534\u0005R\u0000\u0000\u0534\u0535\u0003"+
		"\u00fa}\u0000\u0535\u00bd\u0001\u0000\u0000\u0000\u0536\u0541\u0003\u009a"+
		"M\u0000\u0537\u0541\u0003h4\u0000\u0538\u0541\u0003t:\u0000\u0539\u0541"+
		"\u0003\u00deo\u0000\u053a\u0541\u0003\u00e2q\u0000\u053b\u0541\u0003\u00c2"+
		"a\u0000\u053c\u0541\u0003\u00e8t\u0000\u053d\u0541\u0003\u00eau\u0000"+
		"\u053e\u0541\u0003\u00ecv\u0000\u053f\u0541\u0003\u00b8\\\u0000\u0540"+
		"\u0536\u0001\u0000\u0000\u0000\u0540\u0537\u0001\u0000\u0000\u0000\u0540"+
		"\u0538\u0001\u0000\u0000\u0000\u0540\u0539\u0001\u0000\u0000\u0000\u0540"+
		"\u053a\u0001\u0000\u0000\u0000\u0540\u053b\u0001\u0000\u0000\u0000\u0540"+
		"\u053c\u0001\u0000\u0000\u0000\u0540\u053d\u0001\u0000\u0000\u0000\u0540"+
		"\u053e\u0001\u0000\u0000\u0000\u0540\u053f\u0001\u0000\u0000\u0000\u0541"+
		"\u00bf\u0001\u0000\u0000\u0000\u0542\u0543\u0005Q\u0000\u0000\u0543\u0547"+
		"\u0003\u00fa}\u0000\u0544\u0546\u0003\u00be_\u0000\u0545\u0544\u0001\u0000"+
		"\u0000\u0000\u0546\u0549\u0001\u0000\u0000\u0000\u0547\u0545\u0001\u0000"+
		"\u0000\u0000\u0547\u0548\u0001\u0000\u0000\u0000\u0548\u054a\u0001\u0000"+
		"\u0000\u0000\u0549\u0547\u0001\u0000\u0000\u0000\u054a\u054b\u0005R\u0000"+
		"\u0000\u054b\u054c\u0003\u00fa}\u0000\u054c\u00c1\u0001\u0000\u0000\u0000"+
		"\u054d\u054e\u0005\u0082\u0000\u0000\u054e\u054f\u0003\u00fa}\u0000\u054f"+
		"\u0550\u0003\u00c4b\u0000\u0550\u0551\u0003\u00fa}\u0000\u0551\u0552\u0003"+
		"\u00c0`\u0000\u0552\u00c3\u0001\u0000\u0000\u0000\u0553\u0558\u0003\u00c8"+
		"d\u0000\u0554\u0558\u0003\u00cae\u0000\u0555\u0558\u0003\u00ccf\u0000"+
		"\u0556\u0558\u0003\u00c6c\u0000\u0557\u0553\u0001\u0000\u0000\u0000\u0557"+
		"\u0554\u0001\u0000\u0000\u0000\u0557\u0555\u0001\u0000\u0000\u0000\u0557"+
		"\u0556\u0001\u0000\u0000\u0000\u0558\u00c5\u0001\u0000\u0000\u0000\u0559"+
		"\u055a\u0005W\u0000\u0000\u055a\u055b\u0003\u00fa}\u0000\u055b\u055c\u0003"+
		"\u00c4b\u0000\u055c\u055d\u0003\u00fa}\u0000\u055d\u055e\u0005X\u0000"+
		"\u0000\u055e\u0562\u0001\u0000\u0000\u0000\u055f\u0562\u0003\u00ceg\u0000"+
		"\u0560\u0562\u0003\u00d0h\u0000\u0561\u0559\u0001\u0000\u0000\u0000\u0561"+
		"\u055f\u0001\u0000\u0000\u0000\u0561\u0560\u0001\u0000\u0000\u0000\u0562"+
		"\u00c7\u0001\u0000\u0000\u0000\u0563\u0564\u0005w\u0000\u0000\u0564\u0565"+
		"\u0003\u00fa}\u0000\u0565\u0566\u0005g\u0000\u0000\u0566\u0567\u0003\u00fa"+
		"}\u0000\u0567\u0568\u0003\u00c6c\u0000\u0568\u00c9\u0001\u0000\u0000\u0000"+
		"\u0569\u0573\u0003\u00c6c\u0000\u056a\u056b\u0003\u00fa}\u0000\u056b\u056c"+
		"\u0005g\u0000\u0000\u056c\u056d\u0003\u00fa}\u0000\u056d\u056e\u0005x"+
		"\u0000\u0000\u056e\u056f\u0003\u00fa}\u0000\u056f\u0570\u0005g\u0000\u0000"+
		"\u0570\u0571\u0003\u00fa}\u0000\u0571\u0572\u0003\u00c6c\u0000\u0572\u0574"+
		"\u0001\u0000\u0000\u0000\u0573\u056a\u0001\u0000\u0000\u0000\u0574\u0575"+
		"\u0001\u0000\u0000\u0000\u0575\u0573\u0001\u0000\u0000\u0000\u0575\u0576"+
		"\u0001\u0000\u0000\u0000\u0576\u00cb\u0001\u0000\u0000\u0000\u0577\u0581"+
		"\u0003\u00c6c\u0000\u0578\u0579\u0003\u00fa}\u0000\u0579\u057a\u0005g"+
		"\u0000\u0000\u057a\u057b\u0003\u00fa}\u0000\u057b\u057c\u0005\u0083\u0000"+
		"\u0000\u057c\u057d\u0003\u00fa}\u0000\u057d\u057e\u0005g\u0000\u0000\u057e"+
		"\u057f\u0003\u00fa}\u0000\u057f\u0580\u0003\u00c6c\u0000\u0580\u0582\u0001"+
		"\u0000\u0000\u0000\u0581\u0578\u0001\u0000\u0000\u0000\u0582\u0583\u0001"+
		"\u0000\u0000\u0000\u0583\u0581\u0001\u0000\u0000\u0000\u0583\u0584\u0001"+
		"\u0000\u0000\u0000\u0584\u00cd\u0001\u0000\u0000\u0000\u0585\u0586\u0005"+
		"W\u0000\u0000\u0586\u0587\u0003\u00fa}\u0000\u0587\u0588\u0003\u009eO"+
		"\u0000\u0588\u0589\u0005X\u0000\u0000\u0589\u00cf\u0001\u0000\u0000\u0000"+
		"\u058a\u058f\u0007\b\u0000\u0000\u058b\u058e\u0003\u00b6[\u0000\u058c"+
		"\u058e\u0003\u00ba]\u0000\u058d\u058b\u0001\u0000\u0000\u0000\u058d\u058c"+
		"\u0001\u0000\u0000\u0000\u058e\u0591\u0001\u0000\u0000\u0000\u058f\u058d"+
		"\u0001\u0000\u0000\u0000\u058f\u0590\u0001\u0000\u0000\u0000\u0590\u0592"+
		"\u0001\u0000\u0000\u0000\u0591\u058f\u0001\u0000\u0000\u0000\u0592\u0593"+
		"\u0005X\u0000\u0000\u0593\u00d1\u0001\u0000\u0000\u0000\u0594\u0595\u0005"+
		"t\u0000\u0000\u0595\u0596\u0003\u00fa}\u0000\u0596\u0597\u0005}\u0000"+
		"\u0000\u0597\u0598\u0003\u00fa}\u0000\u0598\u0599\u0005X\u0000\u0000\u0599"+
		"\u059c\u0001\u0000\u0000\u0000\u059a\u059c\u0005f\u0000\u0000\u059b\u0594"+
		"\u0001\u0000\u0000\u0000\u059b\u059a\u0001\u0000\u0000\u0000\u059c\u00d3"+
		"\u0001\u0000\u0000\u0000\u059d\u059e\u0005\u008e\u0000\u0000\u059e\u059f"+
		"\u0003\u00fa}\u0000\u059f\u05a0\u0005\u008d\u0000\u0000\u05a0\u05a1\u0003"+
		"\u00fa}\u0000\u05a1\u05a2\u0005X\u0000\u0000\u05a2\u05a3\u0003\u00fa}"+
		"\u0000\u05a3\u00d5\u0001\u0000\u0000\u0000\u05a4\u05a5\u0005\u0087\u0000"+
		"\u0000\u05a5\u05a6\u0003\u00fa}\u0000\u05a6\u05a7\u0003\u00d8l\u0000\u05a7"+
		"\u05a8\u0005X\u0000\u0000\u05a8\u05a9\u0003\u00fa}\u0000\u05a9\u00d7\u0001"+
		"\u0000\u0000\u0000\u05aa\u05b5\u0003\u00dam\u0000\u05ab\u05ac\u0005g\u0000"+
		"\u0000\u05ac\u05ad\u0003\u00fa}\u0000\u05ad\u05ae\u0007\u0007\u0000\u0000"+
		"\u05ae\u05af\u0003\u00fa}\u0000\u05af\u05b0\u0005g\u0000\u0000\u05b0\u05b1"+
		"\u0003\u00fa}\u0000\u05b1\u05b2\u0003\u00dam\u0000\u05b2\u05b4\u0001\u0000"+
		"\u0000\u0000\u05b3\u05ab\u0001\u0000\u0000\u0000\u05b4\u05b7\u0001\u0000"+
		"\u0000\u0000\u05b5\u05b3\u0001\u0000\u0000\u0000\u05b5\u05b6\u0001\u0000"+
		"\u0000\u0000\u05b6\u00d9\u0001\u0000\u0000\u0000\u05b7\u05b5\u0001\u0000"+
		"\u0000\u0000\u05b8\u05c4\u0003\u00dcn\u0000\u05b9\u05ba\u0005d\u0000\u0000"+
		"\u05ba\u05bb\u0003\u00fa}\u0000\u05bb\u05bc\u0003\u00dcn\u0000\u05bc\u05c3"+
		"\u0001\u0000\u0000\u0000\u05bd\u05be\u0005[\u0000\u0000\u05be\u05bf\u0003"+
		"\u00fa}\u0000\u05bf\u05c0\u0003\u00aeW\u0000\u05c0\u05c1\u0003\u00fa}"+
		"\u0000\u05c1\u05c3\u0001\u0000\u0000\u0000\u05c2\u05b9\u0001\u0000\u0000"+
		"\u0000\u05c2\u05bd\u0001\u0000\u0000\u0000\u05c3\u05c6\u0001\u0000\u0000"+
		"\u0000\u05c4\u05c2\u0001\u0000\u0000\u0000\u05c4\u05c5\u0001\u0000\u0000"+
		"\u0000\u05c5\u00db\u0001\u0000\u0000\u0000\u05c6\u05c4\u0001\u0000\u0000"+
		"\u0000\u05c7\u05c8\u0003\u00aeW\u0000\u05c8\u05c9\u0003\u00fa}\u0000\u05c9"+
		"\u05da\u0001\u0000\u0000\u0000\u05ca\u05cb\u0003\u00b2Y\u0000\u05cb\u05cc"+
		"\u0003\u00fa}\u0000\u05cc\u05da\u0001\u0000\u0000\u0000\u05cd\u05ce\u0003"+
		"\u00b4Z\u0000\u05ce\u05cf\u0003\u00fa}\u0000\u05cf\u05da\u0001\u0000\u0000"+
		"\u0000\u05d0\u05d1\u0003\u00b0X\u0000\u05d1\u05d2\u0003\u00fa}\u0000\u05d2"+
		"\u05da\u0001\u0000\u0000\u0000\u05d3\u05d4\u0005W\u0000\u0000\u05d4\u05d5"+
		"\u0003\u00fa}\u0000\u05d5\u05d6\u0003\u00d8l\u0000\u05d6\u05d7\u0005X"+
		"\u0000\u0000\u05d7\u05d8\u0003\u00fa}\u0000\u05d8\u05da\u0001\u0000\u0000"+
		"\u0000\u05d9\u05c7\u0001\u0000\u0000\u0000\u05d9\u05ca\u0001\u0000\u0000"+
		"\u0000\u05d9\u05cd\u0001\u0000\u0000\u0000\u05d9\u05d0\u0001\u0000\u0000"+
		"\u0000\u05d9\u05d3\u0001\u0000\u0000\u0000\u05da\u00dd\u0001\u0000\u0000"+
		"\u0000\u05db\u05dc\u0005\u0081\u0000\u0000\u05dc\u05dd\u0003\u00fa}\u0000"+
		"\u05dd\u05de\u0005Q\u0000\u0000\u05de\u05e0\u0003\u00fa}\u0000\u05df\u05e1"+
		"\u0003\u00e0p\u0000\u05e0\u05df\u0001\u0000\u0000\u0000\u05e0\u05e1\u0001"+
		"\u0000\u0000\u0000\u05e1\u05e9\u0001\u0000\u0000\u0000\u05e2\u05e3\u0005"+
		"T\u0000\u0000\u05e3\u05e5\u0003\u00fa}\u0000\u05e4\u05e6\u0003\u00e0p"+
		"\u0000\u05e5\u05e4\u0001\u0000\u0000\u0000\u05e5\u05e6\u0001\u0000\u0000"+
		"\u0000\u05e6\u05e8\u0001\u0000\u0000\u0000\u05e7\u05e2\u0001\u0000\u0000"+
		"\u0000\u05e8\u05eb\u0001\u0000\u0000\u0000\u05e9\u05e7\u0001\u0000\u0000"+
		"\u0000\u05e9\u05ea\u0001\u0000\u0000\u0000\u05ea\u05ec\u0001\u0000\u0000"+
		"\u0000\u05eb\u05e9\u0001\u0000\u0000\u0000\u05ec\u05ed\u0005R\u0000\u0000"+
		"\u05ed\u05ee\u0003\u00fa}\u0000\u05ee\u00df\u0001\u0000\u0000\u0000\u05ef"+
		"\u05f0\u0003\u0098L\u0000\u05f0\u05f1\u0005S\u0000\u0000\u05f1\u05f2\u0003"+
		"\u00fa}\u0000\u05f2\u05f3\u0003\u00a4R\u0000\u05f3\u05fa\u0001\u0000\u0000"+
		"\u0000\u05f4\u05f5\u0003\u0098L\u0000\u05f5\u05f6\u0005S\u0000\u0000\u05f6"+
		"\u05f7\u0003\u00fa}\u0000\u05f7\u05f8\u0003\u00a2Q\u0000\u05f8\u05fa\u0001"+
		"\u0000\u0000\u0000\u05f9\u05ef\u0001\u0000\u0000\u0000\u05f9\u05f4\u0001"+
		"\u0000\u0000\u0000\u05fa\u00e1\u0001\u0000\u0000\u0000\u05fb\u05fc\u0005"+
		"\u0084\u0000\u0000\u05fc\u05fd\u0003\u00fa}\u0000\u05fd\u05fe\u0005g\u0000"+
		"\u0000\u05fe\u05ff\u0003\u00fa}\u0000\u05ff\u0600\u0003\u00f8|\u0000\u0600"+
		"\u0601\u0003\u00fa}\u0000\u0601\u0602\u0005Q\u0000\u0000\u0602\u0606\u0003"+
		"\u00fa}\u0000\u0603\u0605\u0003\u00e4r\u0000\u0604\u0603\u0001\u0000\u0000"+
		"\u0000\u0605\u0608\u0001\u0000\u0000\u0000\u0606\u0604\u0001\u0000\u0000"+
		"\u0000\u0606\u0607\u0001\u0000\u0000\u0000\u0607\u0609\u0001\u0000\u0000"+
		"\u0000\u0608\u0606\u0001\u0000\u0000\u0000\u0609\u060a\u0005R\u0000\u0000"+
		"\u060a\u060b\u0003\u00fa}\u0000\u060b\u00e3\u0001\u0000\u0000\u0000\u060c"+
		"\u060d\u0003\u00e6s\u0000\u060d\u060e\u0005Q\u0000\u0000\u060e\u0610\u0003"+
		"\u00fa}\u0000\u060f\u0611\u0003\u009cN\u0000\u0610\u060f\u0001\u0000\u0000"+
		"\u0000\u0610\u0611\u0001\u0000\u0000\u0000\u0611\u0612\u0001\u0000\u0000"+
		"\u0000\u0612\u0613\u0005R\u0000\u0000\u0613\u0614\u0003\u00fa}\u0000\u0614"+
		"\u00e5\u0001\u0000\u0000\u0000\u0615\u0616\u0007\t\u0000\u0000\u0616\u061e"+
		"\u0003\u00fa}\u0000\u0617\u0618\u0005Y\u0000\u0000\u0618\u0619\u0003\u00fa"+
		"}\u0000\u0619\u061a\u0007\t\u0000\u0000\u061a\u061b\u0003\u00fa}\u0000"+
		"\u061b\u061d\u0001\u0000\u0000\u0000\u061c\u0617\u0001\u0000\u0000\u0000"+
		"\u061d\u0620\u0001\u0000\u0000\u0000\u061e\u061c\u0001\u0000\u0000\u0000"+
		"\u061e\u061f\u0001\u0000\u0000\u0000\u061f\u00e7\u0001\u0000\u0000\u0000"+
		"\u0620\u061e\u0001\u0000\u0000\u0000\u0621\u0622\u0005\u0088\u0000\u0000"+
		"\u0622\u0623\u0003\u00fa}\u0000\u0623\u0624\u0005Q\u0000\u0000\u0624\u0626"+
		"\u0003\u00fa}\u0000\u0625\u0627\u0003\u009cN\u0000\u0626\u0625\u0001\u0000"+
		"\u0000\u0000\u0626\u0627\u0001\u0000\u0000\u0000\u0627\u0628\u0001\u0000"+
		"\u0000\u0000\u0628\u0629\u0005R\u0000\u0000\u0629\u062a\u0003\u00fa}\u0000"+
		"\u062a\u00e9\u0001\u0000\u0000\u0000\u062b\u062c\u0005\u0089\u0000\u0000"+
		"\u062c\u062d\u0003\u00fa}\u0000\u062d\u062e\u0003\u00f8|\u0000\u062e\u062f"+
		"\u0003\u00fa}\u0000\u062f\u0630\u0005Q\u0000\u0000\u0630\u0632\u0003\u00fa"+
		"}\u0000\u0631\u0633\u0003\u009cN\u0000\u0632\u0631\u0001\u0000\u0000\u0000"+
		"\u0632\u0633\u0001\u0000\u0000\u0000\u0633\u0634\u0001\u0000\u0000\u0000"+
		"\u0634\u0635\u0005R\u0000\u0000\u0635\u0636\u0003\u00fa}\u0000\u0636\u00eb"+
		"\u0001\u0000\u0000\u0000\u0637\u0638\u0005\u008a\u0000\u0000\u0638\u0639"+
		"\u0003\u00fa}\u0000\u0639\u063a\u0003\u00eew\u0000\u063a\u063b\u0003\u00fa"+
		"}\u0000\u063b\u063c\u0005Q\u0000\u0000\u063c\u0640\u0003\u00fa}\u0000"+
		"\u063d\u063f\u0003\u00f2y\u0000\u063e\u063d\u0001\u0000\u0000\u0000\u063f"+
		"\u0642\u0001\u0000\u0000\u0000\u0640\u063e\u0001\u0000\u0000\u0000\u0640"+
		"\u0641\u0001\u0000\u0000\u0000\u0641\u0643\u0001\u0000\u0000\u0000\u0642"+
		"\u0640\u0001\u0000\u0000\u0000\u0643\u0644\u0005R\u0000\u0000\u0644\u0645"+
		"\u0003\u00fa}\u0000\u0645\u00ed\u0001\u0000\u0000\u0000\u0646\u064e\u0003"+
		"\u00f0x\u0000\u0647\u0648\u0003\u00fa}\u0000\u0648\u0649\u0005Y\u0000"+
		"\u0000\u0649\u064a\u0003\u00fa}\u0000\u064a\u064b\u0003\u00f0x\u0000\u064b"+
		"\u064d\u0001\u0000\u0000\u0000\u064c\u0647\u0001\u0000\u0000\u0000\u064d"+
		"\u0650\u0001\u0000\u0000\u0000\u064e\u064c\u0001\u0000\u0000\u0000\u064e"+
		"\u064f\u0001\u0000\u0000\u0000\u064f\u00ef\u0001\u0000\u0000\u0000\u0650"+
		"\u064e\u0001\u0000\u0000\u0000\u0651\u065c\u0005}\u0000\u0000\u0652\u0658"+
		"\u0003\u00f8|\u0000\u0653\u0654\u0003\u00fa}\u0000\u0654\u0655\u0003\u00f8"+
		"|\u0000\u0655\u0657\u0001\u0000\u0000\u0000\u0656\u0653\u0001\u0000\u0000"+
		"\u0000\u0657\u065a\u0001\u0000\u0000\u0000\u0658\u0656\u0001\u0000\u0000"+
		"\u0000\u0658\u0659\u0001\u0000\u0000\u0000\u0659\u065c\u0001\u0000\u0000"+
		"\u0000\u065a\u0658\u0001\u0000\u0000\u0000\u065b\u0651\u0001\u0000\u0000"+
		"\u0000\u065b\u0652\u0001\u0000\u0000\u0000\u065c\u00f1\u0001\u0000\u0000"+
		"\u0000\u065d\u065e\u0003\u00f4z\u0000\u065e\u065f\u0003\u00fa}\u0000\u065f"+
		"\u0660\u0005Q\u0000\u0000\u0660\u0662\u0003\u00fa}\u0000\u0661\u0663\u0003"+
		"\u00f6{\u0000\u0662\u0661\u0001\u0000\u0000\u0000\u0662\u0663\u0001\u0000"+
		"\u0000\u0000\u0663\u066c\u0001\u0000\u0000\u0000\u0664\u0665\u0003\u00fa"+
		"}\u0000\u0665\u0666\u0005T\u0000\u0000\u0666\u0668\u0003\u00fa}\u0000"+
		"\u0667\u0669\u0003\u00f6{\u0000\u0668\u0667\u0001\u0000\u0000\u0000\u0668"+
		"\u0669\u0001\u0000\u0000\u0000\u0669\u066b\u0001\u0000\u0000\u0000\u066a"+
		"\u0664\u0001\u0000\u0000\u0000\u066b\u066e\u0001\u0000\u0000\u0000\u066c"+
		"\u066a\u0001\u0000\u0000\u0000\u066c\u066d\u0001\u0000\u0000\u0000\u066d"+
		"\u066f\u0001\u0000\u0000\u0000\u066e\u066c\u0001\u0000\u0000\u0000\u066f"+
		"\u0670\u0005R\u0000\u0000\u0670\u0671\u0003\u00fa}\u0000\u0671\u00f3\u0001"+
		"\u0000\u0000\u0000\u0672\u0673\u0005\u008c\u0000\u0000\u0673\u00f5\u0001"+
		"\u0000\u0000\u0000\u0674\u0675\u0003\u00f8|\u0000\u0675\u0676\u0003\u00fa"+
		"}\u0000\u0676\u0677\u0005S\u0000\u0000\u0677\u0678\u0003\u00fa}\u0000"+
		"\u0678\u067e\u0003\u00aeW\u0000\u0679\u067a\u0003\u00fa}\u0000\u067a\u067b"+
		"\u0003\u00aeW\u0000\u067b\u067d\u0001\u0000\u0000\u0000\u067c\u0679\u0001"+
		"\u0000\u0000\u0000\u067d\u0680\u0001\u0000\u0000\u0000\u067e\u067c\u0001"+
		"\u0000\u0000\u0000\u067e\u067f\u0001\u0000\u0000\u0000\u067f\u00f7\u0001"+
		"\u0000\u0000\u0000\u0680\u067e\u0001\u0000\u0000\u0000\u0681\u0682\u0007"+
		"\n\u0000\u0000\u0682\u00f9\u0001\u0000\u0000\u0000\u0683\u0685\u0007\u000b"+
		"\u0000\u0000\u0684\u0683\u0001\u0000\u0000\u0000\u0685\u0688\u0001\u0000"+
		"\u0000\u0000\u0686\u0684\u0001\u0000\u0000\u0000\u0686\u0687\u0001\u0000"+
		"\u0000\u0000\u0687\u00fb\u0001\u0000\u0000\u0000\u0688\u0686\u0001\u0000"+
		"\u0000\u0000\u0689\u068a\u00059\u0000\u0000\u068a\u068b\u0003\u00fe\u007f"+
		"\u0000\u068b\u068c\u0005\u00ae\u0000\u0000\u068c\u00fd\u0001\u0000\u0000"+
		"\u0000\u068d\u069e\u0003\u0102\u0081\u0000\u068e\u069e\u0003\u0104\u0082"+
		"\u0000\u068f\u0691\u0005\u0096\u0000\u0000\u0690\u0692\u0003\u010e\u0087"+
		"\u0000\u0691\u0690\u0001\u0000\u0000\u0000\u0691\u0692\u0001\u0000\u0000"+
		"\u0000\u0692\u069e\u0001\u0000\u0000\u0000\u0693\u0694\u0005\u00b6\u0000"+
		"\u0000\u0694\u069e\u0003\u010a\u0085\u0000\u0695\u069e\u0003\u0100\u0080"+
		"\u0000\u0696\u069b\u0005\u0096\u0000\u0000\u0697\u0698\u0005\u00a7\u0000"+
		"\u0000\u0698\u0699\u0003\u0128\u0094\u0000\u0699\u069a\u0005\u00a8\u0000"+
		"\u0000\u069a\u069c\u0001\u0000\u0000\u0000\u069b\u0697\u0001\u0000\u0000"+
		"\u0000\u069b\u069c\u0001\u0000\u0000\u0000\u069c\u069e\u0001\u0000\u0000"+
		"\u0000\u069d\u068d\u0001\u0000\u0000\u0000\u069d\u068e\u0001\u0000\u0000"+
		"\u0000\u069d\u068f\u0001\u0000\u0000\u0000\u069d\u0693\u0001\u0000\u0000"+
		"\u0000\u069d\u0695\u0001\u0000\u0000\u0000\u069d\u0696\u0001\u0000\u0000"+
		"\u0000\u069e\u00ff\u0001\u0000\u0000\u0000\u069f\u06a0\u0005\u00b7\u0000"+
		"\u0000\u06a0\u06a1\u0003\u000e\u0007\u0000\u06a1\u06a2\u0005\u00b8\u0000"+
		"\u0000\u06a2\u0101\u0001\u0000\u0000\u0000\u06a3\u06a4\u0005\u00af\u0000"+
		"\u0000\u06a4\u06a5\u0003\u010e\u0087\u0000\u06a5\u06ac\u0003\u000e\u0007"+
		"\u0000\u06a6\u06a7\u0005\u00b0\u0000\u0000\u06a7\u06a8\u0003\u010e\u0087"+
		"\u0000\u06a8\u06a9\u0003\u000e\u0007\u0000\u06a9\u06ab\u0001\u0000\u0000"+
		"\u0000\u06aa\u06a6\u0001\u0000\u0000\u0000\u06ab\u06ae\u0001\u0000\u0000"+
		"\u0000\u06ac\u06aa\u0001\u0000\u0000\u0000\u06ac\u06ad\u0001\u0000\u0000"+
		"\u0000\u06ad\u06b1\u0001\u0000\u0000\u0000\u06ae\u06ac\u0001\u0000\u0000"+
		"\u0000\u06af\u06b0\u0005\u00b1\u0000\u0000\u06b0\u06b2\u0003\u000e\u0007"+
		"\u0000\u06b1\u06af\u0001\u0000\u0000\u0000\u06b1\u06b2\u0001\u0000\u0000"+
		"\u0000\u06b2\u06b3\u0001\u0000\u0000\u0000\u06b3\u06b4\u0005\u00b2\u0000"+
		"\u0000\u06b4\u0103\u0001\u0000\u0000\u0000\u06b5\u06b6\u0005\u00b3\u0000"+
		"\u0000\u06b6\u06b7\u0003\u0106\u0083\u0000\u06b7\u06b8\u0005\u00b4\u0000"+
		"\u0000\u06b8\u06b9\u0003\u010a\u0085\u0000\u06b9\u06bc\u0003\u000e\u0007"+
		"\u0000\u06ba\u06bb\u0005\u00b1\u0000\u0000\u06bb\u06bd\u0003\u000e\u0007"+
		"\u0000\u06bc\u06ba\u0001\u0000\u0000\u0000\u06bc\u06bd\u0001\u0000\u0000"+
		"\u0000\u06bd\u06be\u0001\u0000\u0000\u0000\u06be\u06bf\u0005\u00b5\u0000"+
		"\u0000\u06bf\u0105\u0001\u0000\u0000\u0000\u06c0\u06c5\u0005\u0096\u0000"+
		"\u0000\u06c1\u06c2\u0005\u00a5\u0000\u0000\u06c2\u06c4\u0005\u0096\u0000"+
		"\u0000\u06c3\u06c1\u0001\u0000\u0000\u0000\u06c4\u06c7\u0001\u0000\u0000"+
		"\u0000\u06c5\u06c3\u0001\u0000\u0000\u0000\u06c5\u06c6\u0001\u0000\u0000"+
		"\u0000\u06c6\u0107\u0001\u0000\u0000\u0000\u06c7\u06c5\u0001\u0000\u0000"+
		"\u0000\u06c8\u06c9\u00058\u0000\u0000\u06c9\u06ca\u0003\u010a\u0085\u0000"+
		"\u06ca\u06cb\u0005\u0092\u0000\u0000\u06cb\u0109\u0001\u0000\u0000\u0000"+
		"\u06cc\u06d1\u0003\u010e\u0087\u0000\u06cd\u06ce\u0005\u00a6\u0000\u0000"+
		"\u06ce\u06d0\u0003\u010c\u0086\u0000\u06cf\u06cd\u0001\u0000\u0000\u0000"+
		"\u06d0\u06d3\u0001\u0000\u0000\u0000\u06d1\u06cf\u0001\u0000\u0000\u0000"+
		"\u06d1\u06d2\u0001\u0000\u0000\u0000\u06d2\u010b\u0001\u0000\u0000\u0000"+
		"\u06d3\u06d1\u0001\u0000\u0000\u0000\u06d4\u06da\u0005\u0096\u0000\u0000"+
		"\u06d5\u06d7\u0005\u00a7\u0000\u0000\u06d6\u06d8\u0003\u0128\u0094\u0000"+
		"\u06d7\u06d6\u0001\u0000\u0000\u0000\u06d7\u06d8\u0001\u0000\u0000\u0000"+
		"\u06d8\u06d9\u0001\u0000\u0000\u0000\u06d9\u06db\u0005\u00a8\u0000\u0000"+
		"\u06da\u06d5\u0001\u0000\u0000\u0000\u06da\u06db\u0001\u0000\u0000\u0000"+
		"\u06db\u010d\u0001\u0000\u0000\u0000\u06dc\u06dd\u0003\u0110\u0088\u0000"+
		"\u06dd\u010f\u0001\u0000\u0000\u0000\u06de\u06e3\u0003\u0112\u0089\u0000"+
		"\u06df\u06e0\u0005\u00b9\u0000\u0000\u06e0\u06e2\u0003\u0112\u0089\u0000"+
		"\u06e1\u06df\u0001\u0000\u0000\u0000\u06e2\u06e5\u0001\u0000\u0000\u0000"+
		"\u06e3\u06e1\u0001\u0000\u0000\u0000\u06e3\u06e4\u0001\u0000\u0000\u0000"+
		"\u06e4\u0111\u0001\u0000\u0000\u0000\u06e5\u06e3\u0001\u0000\u0000\u0000"+
		"\u06e6\u06eb\u0003\u0114\u008a\u0000\u06e7\u06e8\u0005\u00ba\u0000\u0000"+
		"\u06e8\u06ea\u0003\u0114\u008a\u0000\u06e9\u06e7\u0001\u0000\u0000\u0000"+
		"\u06ea\u06ed\u0001\u0000\u0000\u0000\u06eb\u06e9\u0001\u0000\u0000\u0000"+
		"\u06eb\u06ec\u0001\u0000\u0000\u0000\u06ec\u0113\u0001\u0000\u0000\u0000"+
		"\u06ed\u06eb\u0001\u0000\u0000\u0000\u06ee\u06ef\u0005\u00bb\u0000\u0000"+
		"\u06ef\u06f2\u0003\u0114\u008a\u0000\u06f0\u06f2\u0003\u0116\u008b\u0000"+
		"\u06f1\u06ee\u0001\u0000\u0000\u0000\u06f1\u06f0\u0001\u0000\u0000\u0000"+
		"\u06f2\u0115\u0001\u0000\u0000\u0000\u06f3\u06f9\u0003\u011a\u008d\u0000"+
		"\u06f4\u06f5\u0003\u0118\u008c\u0000\u06f5\u06f6\u0003\u011a\u008d\u0000"+
		"\u06f6\u06f8\u0001\u0000\u0000\u0000\u06f7\u06f4\u0001\u0000\u0000\u0000"+
		"\u06f8\u06fb\u0001\u0000\u0000\u0000\u06f9\u06f7\u0001\u0000\u0000\u0000"+
		"\u06f9\u06fa\u0001\u0000\u0000\u0000\u06fa\u0117\u0001\u0000\u0000\u0000"+
		"\u06fb\u06f9\u0001\u0000\u0000\u0000\u06fc\u0706\u0005\u00a0\u0000\u0000"+
		"\u06fd\u0706\u0005\u00a2\u0000\u0000\u06fe\u0706\u0005\u009d\u0000\u0000"+
		"\u06ff\u0706\u0005\u009e\u0000\u0000\u0700\u0706\u0005\u00a1\u0000\u0000"+
		"\u0701\u0706\u0005\u009f\u0000\u0000\u0702\u0706\u0005\u00b4\u0000\u0000"+
		"\u0703\u0704\u0005\u00bb\u0000\u0000\u0704\u0706\u0005\u00b4\u0000\u0000"+
		"\u0705\u06fc\u0001\u0000\u0000\u0000\u0705\u06fd\u0001\u0000\u0000\u0000"+
		"\u0705\u06fe\u0001\u0000\u0000\u0000\u0705\u06ff\u0001\u0000\u0000\u0000"+
		"\u0705\u0700\u0001\u0000\u0000\u0000\u0705\u0701\u0001\u0000\u0000\u0000"+
		"\u0705\u0702\u0001\u0000\u0000\u0000\u0705\u0703\u0001\u0000\u0000\u0000"+
		"\u0706\u0119\u0001\u0000\u0000\u0000\u0707\u070c\u0003\u011c\u008e\u0000"+
		"\u0708\u0709\u0007\f\u0000\u0000\u0709\u070b\u0003\u011c\u008e\u0000\u070a"+
		"\u0708\u0001\u0000\u0000\u0000\u070b\u070e\u0001\u0000\u0000\u0000\u070c"+
		"\u070a\u0001\u0000\u0000\u0000\u070c\u070d\u0001\u0000\u0000\u0000\u070d"+
		"\u011b\u0001\u0000\u0000\u0000\u070e\u070c\u0001\u0000\u0000\u0000\u070f"+
		"\u0714\u0003\u011e\u008f\u0000\u0710\u0711\u0007\r\u0000\u0000\u0711\u0713"+
		"\u0003\u011e\u008f\u0000\u0712\u0710\u0001\u0000\u0000\u0000\u0713\u0716"+
		"\u0001\u0000\u0000\u0000\u0714\u0712\u0001\u0000\u0000\u0000\u0714\u0715"+
		"\u0001\u0000\u0000\u0000\u0715\u011d\u0001\u0000\u0000\u0000\u0716\u0714"+
		"\u0001\u0000\u0000\u0000\u0717\u0718\u0007\f\u0000\u0000\u0718\u071b\u0003"+
		"\u011e\u008f\u0000\u0719\u071b\u0003\u0120\u0090\u0000\u071a\u0717\u0001"+
		"\u0000\u0000\u0000\u071a\u0719\u0001\u0000\u0000\u0000\u071b\u011f\u0001"+
		"\u0000\u0000\u0000\u071c\u0720\u0003\u0124\u0092\u0000\u071d\u071f\u0003"+
		"\u0122\u0091\u0000\u071e\u071d\u0001\u0000\u0000\u0000\u071f\u0722\u0001"+
		"\u0000\u0000\u0000\u0720\u071e\u0001\u0000\u0000\u0000\u0720\u0721\u0001"+
		"\u0000\u0000\u0000\u0721\u0121\u0001\u0000\u0000\u0000\u0722\u0720\u0001"+
		"\u0000\u0000\u0000\u0723\u0725\u0005\u00a7\u0000\u0000\u0724\u0726\u0003"+
		"\u0128\u0094\u0000\u0725\u0724\u0001\u0000\u0000\u0000\u0725\u0726\u0001"+
		"\u0000\u0000\u0000\u0726\u0727\u0001\u0000\u0000\u0000\u0727\u072f\u0005"+
		"\u00a8\u0000\u0000\u0728\u0729\u0005\u00a9\u0000\u0000\u0729\u072a\u0003"+
		"\u010e\u0087\u0000\u072a\u072b\u0005\u00aa\u0000\u0000\u072b\u072f\u0001"+
		"\u0000\u0000\u0000\u072c\u072d\u0005\u00a4\u0000\u0000\u072d\u072f\u0005"+
		"\u0096\u0000\u0000\u072e\u0723\u0001\u0000\u0000\u0000\u072e\u0728\u0001"+
		"\u0000\u0000\u0000\u072e\u072c\u0001\u0000\u0000\u0000\u072f\u0123\u0001"+
		"\u0000\u0000\u0000\u0730\u0742\u0005\u0096\u0000\u0000\u0731\u0742\u0005"+
		"\u0094\u0000\u0000\u0732\u0742\u0005\u0095\u0000\u0000\u0733\u0734\u0005"+
		"\u00a7\u0000\u0000\u0734\u0735\u0003\u010e\u0087\u0000\u0735\u0736\u0005"+
		"\u00a8\u0000\u0000\u0736\u0742\u0001\u0000\u0000\u0000\u0737\u0739\u0005"+
		"\u00a9\u0000\u0000\u0738\u073a\u0003\u0126\u0093\u0000\u0739\u0738\u0001"+
		"\u0000\u0000\u0000\u0739\u073a\u0001\u0000\u0000\u0000\u073a\u073b\u0001"+
		"\u0000\u0000\u0000\u073b\u0742\u0005\u00aa\u0000\u0000\u073c\u073e\u0005"+
		"\u00ab\u0000\u0000\u073d\u073f\u0003\u012a\u0095\u0000\u073e\u073d\u0001"+
		"\u0000\u0000\u0000\u073e\u073f\u0001\u0000\u0000\u0000\u073f\u0740\u0001"+
		"\u0000\u0000\u0000\u0740\u0742\u0005\u00ac\u0000\u0000\u0741\u0730\u0001"+
		"\u0000\u0000\u0000\u0741\u0731\u0001\u0000\u0000\u0000\u0741\u0732\u0001"+
		"\u0000\u0000\u0000\u0741\u0733\u0001\u0000\u0000\u0000\u0741\u0737\u0001"+
		"\u0000\u0000\u0000\u0741\u073c\u0001\u0000\u0000\u0000\u0742\u0125\u0001"+
		"\u0000\u0000\u0000\u0743\u0748\u0003\u010e\u0087\u0000\u0744\u0745\u0005"+
		"\u00a5\u0000\u0000\u0745\u0747\u0003\u010e\u0087\u0000\u0746\u0744\u0001"+
		"\u0000\u0000\u0000\u0747\u074a\u0001\u0000\u0000\u0000\u0748\u0746\u0001"+
		"\u0000\u0000\u0000\u0748\u0749\u0001\u0000\u0000\u0000\u0749\u0127\u0001"+
		"\u0000\u0000\u0000\u074a\u0748\u0001\u0000\u0000\u0000\u074b\u0750\u0003"+
		"\u010e\u0087\u0000\u074c\u074d\u0005\u00a5\u0000\u0000\u074d\u074f\u0003"+
		"\u010e\u0087\u0000\u074e\u074c\u0001\u0000\u0000\u0000\u074f\u0752\u0001"+
		"\u0000\u0000\u0000\u0750\u074e\u0001\u0000\u0000\u0000\u0750\u0751\u0001"+
		"\u0000\u0000\u0000\u0751\u0129\u0001\u0000\u0000\u0000\u0752\u0750\u0001"+
		"\u0000\u0000\u0000\u0753\u0754\u0003\u010e\u0087\u0000\u0754\u0755\u0005"+
		"\u00ad\u0000\u0000\u0755\u075d\u0003\u010e\u0087\u0000\u0756\u0757\u0005"+
		"\u00a5\u0000\u0000\u0757\u0758\u0003\u010e\u0087\u0000\u0758\u0759\u0005"+
		"\u00ad\u0000\u0000\u0759\u075a\u0003\u010e\u0087\u0000\u075a\u075c\u0001"+
		"\u0000\u0000\u0000\u075b\u0756\u0001\u0000\u0000\u0000\u075c\u075f\u0001"+
		"\u0000\u0000\u0000\u075d\u075b\u0001\u0000\u0000\u0000\u075d\u075e\u0001"+
		"\u0000\u0000\u0000\u075e\u012b\u0001\u0000\u0000\u0000\u075f\u075d\u0001"+
		"\u0000\u0000\u0000\u00c4\u012e\u0130\u0137\u013e\u0141\u014b\u0150\u0156"+
		"\u0160\u0166\u0168\u016d\u0173\u017a\u0181\u0187\u018e\u0197\u01a0\u01a6"+
		"\u01a9\u01b2\u01b9\u01c2\u01d0\u01d6\u01da\u01e4\u01e8\u01ef\u01f9\u0201"+
		"\u0207\u020f\u021b\u0222\u022a\u0230\u0238\u023d\u0246\u024d\u0254\u0259"+
		"\u025e\u0261\u026b\u026e\u0278\u0285\u028d\u0294\u029a\u02a8\u02ad\u02b3"+
		"\u02bc\u02c1\u02c8\u02cd\u02d4\u02d9\u02e0\u02e5\u02f6\u02fc\u0307\u0311"+
		"\u031a\u031e\u0325\u0329\u0334\u0338\u033c\u034d\u0350\u0355\u0360\u036a"+
		"\u036d\u0378\u0383\u0388\u038d\u0391\u03a2\u03ad\u03b8\u03bc\u03c3\u03c5"+
		"\u03cd\u03cf\u03d1\u03d4\u03da\u03e1\u03eb\u03f3\u03f7\u03fd\u0401\u040f"+
		"\u0414\u0422\u042c\u0437\u043d\u0445\u044b\u0450\u0456\u045e\u0462\u046a"+
		"\u0471\u047a\u047c\u0480\u0485\u04a3\u04b5\u04ba\u04bf\u04c4\u04ea\u04ec"+
		"\u04f6\u04f8\u0502\u0504\u050a\u0511\u0517\u0522\u052e\u0530\u0540\u0547"+
		"\u0557\u0561\u0575\u0583\u058d\u058f\u059b\u05b5\u05c2\u05c4\u05d9\u05e0"+
		"\u05e5\u05e9\u05f9\u0606\u0610\u061e\u0626\u0632\u0640\u064e\u0658\u065b"+
		"\u0662\u0668\u066c\u067e\u0686\u0691\u069b\u069d\u06ac\u06b1\u06bc\u06c5"+
		"\u06d1\u06d7\u06da\u06e3\u06eb\u06f1\u06f9\u0705\u070c\u0714\u071a\u0720"+
		"\u0725\u072e\u0739\u073e\u0741\u0748\u0750\u075d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}