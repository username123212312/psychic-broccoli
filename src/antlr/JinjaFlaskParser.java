// Generated from C:/Users/TWL/Desktop/psychic-broccoli-main/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.2
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
		STRING=51, TRIPLE_QUOTED_STRING=52, HTML_TEXT=53, TAG_OPEN=54, TAG_CLOSE=55, 
		TAG_SLASH_CLOSE=56, SCRIPT_OPEN=57, SCRIPT_BODY=58, STYLE_OPEN=59, STYLE_CLOSE=60, 
		XML_DECLARATION=61, CDATA=62, DTD=63, SCRIPTLET=64, TAG_NAME=65, TAG_EQUALS=66, 
		ATTVALUE_VALUE=67, TAG_SLASH=68, Comment=69, Space=70, Cdo=71, Cdc=72, 
		Charset=73, String_=74, SemiColon=75, Import=76, Namespace=77, Media=78, 
		Comma=79, MediaOnly=80, Not=81, And=82, OpenParen=83, Colon=84, CloseParen=85, 
		Page=86, OpenBrace=87, CloseBrace=88, Plus=89, Greater=90, Tilde=91, Hash=92, 
		Multiply=93, Pipe=94, Dot=95, OpenBracket=96, PrefixMatch=97, SuffixMatch=98, 
		SubstringMatch=99, Equal=100, Includes=101, DashMatch=102, CloseBracket=103, 
		Function_=104, Minus=105, Dimension=106, UnknownDimension=107, Number=108, 
		PseudoNot=109, Divide=110, Variable=111, Important=112, AtKeyword=113, 
		UnicodeRange=114, DxImageTransform=115, Percentage=116, Supports=117, 
		Or=118, Url_=119, Url=120, Var=121, Calc=122, FontFace=123, Keyframes=124, 
		From=125, To=126, Viewport=127, CounterStyle=128, FontFeatureValues=129, 
		Ident=130, JINJA_STMT_START=131, JINJA_STMT_END=132, J_NAME=133, J_SET=134, 
		J_LPAREN=135, J_RPAREN=136, J_RAW=137, J_ENDRAW=138, J_IF=139, J_ELIF=140, 
		J_ELSE=141, J_ENDIF=142, J_FOR=143, J_IN=144, J_ENDFOR=145, J_COMMA=146, 
		JINJA_EXPR_START=147, JINJA_EXPR_END=148, J_PIPE=149, J_OR=150, J_AND=151, 
		J_NOT=152, J_LT=153, J_GT=154, J_EQ=155, J_NE=156, J_GE=157, J_LE=158, 
		J_PLUS=159, J_MINUS=160, J_TIMES=161, J_DIVIDE=162, J_MOD=163, J_POW=164, 
		J_LBRACK=165, J_RBRACK=166, J_DOT=167, J_NUMBER=168, J_STRING=169, J_LBRACE=170, 
		J_RBRACE=171, J_COLON=172;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simple_stmt = 2, RULE_small_stmt = 3, 
		RULE_compound_stmt = 4, RULE_template_literal = 5, RULE_html_content = 6, 
		RULE_import_stmt = 7, RULE_import_name = 8, RULE_import_from = 9, RULE_import_as_names = 10, 
		RULE_import_as_name = 11, RULE_dotted_name = 12, RULE_global_stmt = 13, 
		RULE_decorated = 14, RULE_decorators = 15, RULE_decorator = 16, RULE_func_def = 17, 
		RULE_parameters = 18, RULE_typedargslist = 19, RULE_if_stmt = 20, RULE_return_stmt = 21, 
		RULE_flow_stmt = 22, RULE_suite = 23, RULE_testlist = 24, RULE_test = 25, 
		RULE_or_test = 26, RULE_and_test = 27, RULE_not_test = 28, RULE_comparison = 29, 
		RULE_comp_op = 30, RULE_expr = 31, RULE_term = 32, RULE_factor = 33, RULE_power = 34, 
		RULE_atom_expr = 35, RULE_trailer = 36, RULE_atom = 37, RULE_list_content = 38, 
		RULE_comp_for = 39, RULE_dict_maker = 40, RULE_arglist = 41, RULE_argument = 42, 
		RULE_htmlElement = 43, RULE_tag_content = 44, RULE_stylesheet = 45, RULE_charset = 46, 
		RULE_imports = 47, RULE_namespace_ = 48, RULE_namespacePrefix = 49, RULE_media = 50, 
		RULE_mediaQueryList = 51, RULE_mediaQuery = 52, RULE_mediaType = 53, RULE_mediaExpression = 54, 
		RULE_mediaFeature = 55, RULE_page = 56, RULE_pseudoPage = 57, RULE_selectorGroup = 58, 
		RULE_selector = 59, RULE_combinator = 60, RULE_simpleSelectorSequence = 61, 
		RULE_typeSelector = 62, RULE_typeNamespacePrefix = 63, RULE_elementName = 64, 
		RULE_universal = 65, RULE_className = 66, RULE_attrib = 67, RULE_pseudo = 68, 
		RULE_functionalPseudo = 69, RULE_expression = 70, RULE_negation = 71, 
		RULE_negationArg = 72, RULE_operator_ = 73, RULE_property_ = 74, RULE_ruleset = 75, 
		RULE_declarationList = 76, RULE_declaration = 77, RULE_prio = 78, RULE_value = 79, 
		RULE_css_expr = 80, RULE_css_term = 81, RULE_function_ = 82, RULE_dxImageTransform = 83, 
		RULE_hexcolor = 84, RULE_number = 85, RULE_percentage = 86, RULE_dimension = 87, 
		RULE_unknownDimension = 88, RULE_any_ = 89, RULE_atRule = 90, RULE_unused = 91, 
		RULE_block = 92, RULE_nestedStatement = 93, RULE_groupRuleBody = 94, RULE_supportsRule = 95, 
		RULE_supportsCondition = 96, RULE_supportsConditionInParens = 97, RULE_supportsNegation = 98, 
		RULE_supportsConjunction = 99, RULE_supportsDisjunction = 100, RULE_supportsDeclarationCondition = 101, 
		RULE_generalEnclosed = 102, RULE_url = 103, RULE_var_ = 104, RULE_calc = 105, 
		RULE_calcSum = 106, RULE_calcProduct = 107, RULE_calcValue = 108, RULE_fontFaceRule = 109, 
		RULE_fontFaceDeclaration = 110, RULE_keyframesRule = 111, RULE_keyframeBlock = 112, 
		RULE_keyframeSelector = 113, RULE_viewport = 114, RULE_counterStyle = 115, 
		RULE_fontFeatureValuesRule = 116, RULE_fontFamilyNameList = 117, RULE_fontFamilyName = 118, 
		RULE_featureValueBlock = 119, RULE_featureType = 120, RULE_featureValueDefinition = 121, 
		RULE_ident = 122, RULE_jinjaStatement = 123, RULE_jStatement = 124, RULE_jRawStatement = 125, 
		RULE_jIfStatement = 126, RULE_jForStatement = 127, RULE_jTargetList = 128, 
		RULE_jinjaExpression = 129, RULE_jExpression = 130, RULE_jFilter = 131, 
		RULE_jTestExpr = 132, RULE_jOrTest = 133, RULE_jAndTest = 134, RULE_jNotTest = 135, 
		RULE_jComparison = 136, RULE_jCompOp = 137, RULE_jMathExpr = 138, RULE_jTerm = 139, 
		RULE_jFactor = 140, RULE_jAtomExpr = 141, RULE_jTrailer = 142, RULE_jAtom = 143, 
		RULE_jTestExprList = 144, RULE_jArgumentList = 145, RULE_jDictMaker = 146;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simple_stmt", "small_stmt", "compound_stmt", 
			"template_literal", "html_content", "import_stmt", "import_name", "import_from", 
			"import_as_names", "import_as_name", "dotted_name", "global_stmt", "decorated", 
			"decorators", "decorator", "func_def", "parameters", "typedargslist", 
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
			"featureValueDefinition", "ident", "jinjaStatement", "jStatement", "jRawStatement", 
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
			"'as'", "'if'", "'elif'", "'else'", "'for'", "'in'", "'global'", "'and'", 
			"'or'", "'not'", "'True'", "'False'", "'None'", "'print'", "'while'", 
			"'->'", "'@'", "':'", "';'", "','", "'='", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'//'", null, null, null, 
			null, null, null, "'.'"
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
			"RBRACK", "LBRACE", "RBRACE", "DOT", "NAME", "NUMBER", "STRING", "TRIPLE_QUOTED_STRING", 
			"HTML_TEXT", "TAG_OPEN", "TAG_CLOSE", "TAG_SLASH_CLOSE", "SCRIPT_OPEN", 
			"SCRIPT_BODY", "STYLE_OPEN", "STYLE_CLOSE", "XML_DECLARATION", "CDATA", 
			"DTD", "SCRIPTLET", "TAG_NAME", "TAG_EQUALS", "ATTVALUE_VALUE", "TAG_SLASH", 
			"Comment", "Space", "Cdo", "Cdc", "Charset", "String_", "SemiColon", 
			"Import", "Namespace", "Media", "Comma", "MediaOnly", "Not", "And", "OpenParen", 
			"Colon", "CloseParen", "Page", "OpenBrace", "CloseBrace", "Plus", "Greater", 
			"Tilde", "Hash", "Multiply", "Pipe", "Dot", "OpenBracket", "PrefixMatch", 
			"SuffixMatch", "SubstringMatch", "Equal", "Includes", "DashMatch", "CloseBracket", 
			"Function_", "Minus", "Dimension", "UnknownDimension", "Number", "PseudoNot", 
			"Divide", "Variable", "Important", "AtKeyword", "UnicodeRange", "DxImageTransform", 
			"Percentage", "Supports", "Or", "Url_", "Url", "Var", "Calc", "FontFace", 
			"Keyframes", "From", "To", "Viewport", "CounterStyle", "FontFeatureValues", 
			"Ident", "JINJA_STMT_START", "JINJA_STMT_END", "J_NAME", "J_SET", "J_LPAREN", 
			"J_RPAREN", "J_RAW", "J_ENDRAW", "J_IF", "J_ELIF", "J_ELSE", "J_ENDIF", 
			"J_FOR", "J_IN", "J_ENDFOR", "J_COMMA", "JINJA_EXPR_START", "JINJA_EXPR_END", 
			"J_PIPE", "J_OR", "J_AND", "J_NOT", "J_LT", "J_GT", "J_EQ", "J_NE", "J_GE", 
			"J_LE", "J_PLUS", "J_MINUS", "J_TIMES", "J_DIVIDE", "J_MOD", "J_POW", 
			"J_LBRACK", "J_RBRACK", "J_DOT", "J_NUMBER", "J_STRING", "J_LBRACE", 
			"J_RBRACE", "J_COLON"
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
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033421310495688L) != 0)) {
				{
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(294);
					statement();
					}
					break;
				case 2:
					{
					setState(295);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case IF:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
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
				setState(304);
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(307);
				small_stmt();
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						match(SEMI);
						setState(309);
						small_stmt();
						}
						} 
					}
					setState(314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			}
			setState(317);
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
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				import_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				return_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				global_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
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
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				if_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				func_def();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
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
	public static class Template_literalContext extends ParserRuleContext {
		public Token TRIPLE_QUOTED_STRING;
		public TerminalNode TRIPLE_QUOTED_STRING() { return getToken(JinjaFlaskParser.TRIPLE_QUOTED_STRING, 0); }
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
		enterRule(_localctx, 10, RULE_template_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			((Template_literalContext)_localctx).TRIPLE_QUOTED_STRING = match(TRIPLE_QUOTED_STRING);


			        String templateContent = ((Template_literalContext)_localctx).TRIPLE_QUOTED_STRING.getText();

			        templateContent = templateContent.substring(3, templateContent.length() - 3);


				htmlLexer hLexer = new htmlLexer(CharStreams.fromString(templateContent));
			        htmlParser hParser = new htmlParser(new CommonTokenStream(hLexer));


			        htmlParser.DocumentContext htmlTree = hParser.document();


			        System.out.println("Successfully parsed HTML content inside the string!");
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 12, RULE_html_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 3923L) != 0) || _la==JINJA_STMT_START || _la==JINJA_EXPR_START) {
				{
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_OPEN:
				case SCRIPT_OPEN:
				case STYLE_OPEN:
				case XML_DECLARATION:
				case CDATA:
				case DTD:
				case SCRIPTLET:
					{
					setState(335);
					htmlElement();
					}
					break;
				case JINJA_STMT_START:
					{
					setState(336);
					jinjaStatement();
					}
					break;
				case JINJA_EXPR_START:
					{
					setState(337);
					jinjaExpression();
					}
					break;
				case HTML_TEXT:
					{
					setState(338);
					match(HTML_TEXT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(343);
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
		enterRule(_localctx, 14, RULE_import_stmt);
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
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
		enterRule(_localctx, 16, RULE_import_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(IMPORT);
			setState(349);
			dotted_name();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(350);
				match(AS);
				setState(351);
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
		enterRule(_localctx, 18, RULE_import_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(FROM);
			setState(355);
			dotted_name();
			setState(356);
			match(IMPORT);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(357);
				match(STAR);
				}
				break;
			case NAME:
				{
				setState(358);
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
		enterRule(_localctx, 20, RULE_import_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			import_as_name();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(362);
				match(COMMA);
				setState(363);
				import_as_name();
				}
				}
				setState(368);
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
		enterRule(_localctx, 22, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(NAME);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(370);
				match(AS);
				setState(371);
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
		enterRule(_localctx, 24, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(NAME);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(375);
				match(DOT);
				setState(376);
				match(NAME);
				}
				}
				setState(381);
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
		enterRule(_localctx, 26, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(GLOBAL);
			setState(383);
			match(NAME);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(384);
				match(COMMA);
				setState(385);
				match(NAME);
				}
				}
				setState(390);
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
		enterRule(_localctx, 28, RULE_decorated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			decorators();
			setState(392);
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
		enterRule(_localctx, 30, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(394);
				decorator();
				}
				}
				setState(397); 
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
		enterRule(_localctx, 32, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(AT);
			setState(400);
			dotted_name();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(401);
				match(LP);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(402);
					arglist();
					}
				}

				setState(405);
				match(RP);
				}
			}

			setState(408);
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
		enterRule(_localctx, 34, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(DEF);
			setState(411);
			match(NAME);
			setState(412);
			parameters();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(413);
				match(ARROW);
				setState(414);
				test();
				}
			}

			setState(417);
			match(COLON);
			setState(418);
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
		enterRule(_localctx, 36, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(LP);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(421);
				typedargslist();
				}
			}

			setState(424);
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
		enterRule(_localctx, 38, RULE_typedargslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(NAME);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(427);
				match(COMMA);
				setState(428);
				match(NAME);
				}
				}
				setState(433);
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
		enterRule(_localctx, 40, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(IF);
			setState(435);
			test();
			setState(436);
			match(COLON);
			setState(437);
			suite();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(438);
				match(ELIF);
				setState(439);
				test();
				setState(440);
				match(COLON);
				setState(441);
				suite();
				}
				}
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(448);
				match(ELSE);
				setState(449);
				match(COLON);
				setState(450);
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
		enterRule(_localctx, 42, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(RETURN);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
				{
				setState(454);
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
		enterRule(_localctx, 44, RULE_flow_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
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
		enterRule(_localctx, 46, RULE_suite);
		int _la;
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(NEWLINE);
				setState(461);
				match(INDENT);
				setState(463); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(462);
					statement();
					}
					}
					setState(465); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4033421310495688L) != 0) );
				setState(467);
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
		enterRule(_localctx, 48, RULE_testlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			test();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(472);
				match(COMMA);
				setState(473);
				test();
				}
				}
				setState(478);
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
		enterRule(_localctx, 50, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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
		enterRule(_localctx, 52, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			and_test();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(482);
				match(OR);
				setState(483);
				and_test();
				}
				}
				setState(488);
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
		enterRule(_localctx, 54, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			not_test();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(490);
				match(AND);
				setState(491);
				not_test();
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
		enterRule(_localctx, 56, RULE_not_test);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(NOT);
				setState(498);
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
				setState(499);
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
		enterRule(_localctx, 58, RULE_comparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			expr();
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(503);
					comp_op();
					setState(504);
					expr();
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 60, RULE_comp_op);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(GT);
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				match(EQ);
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				match(NEQ);
				}
				break;
			case GTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(515);
				match(GTE);
				}
				break;
			case LTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(516);
				match(LTE);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(517);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(518);
				match(NOT);
				setState(519);
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
		enterRule(_localctx, 62, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			term();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(523);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(524);
				term();
				}
				}
				setState(529);
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
		enterRule(_localctx, 64, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			factor();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) {
				{
				{
				setState(531);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(532);
				factor();
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
		enterRule(_localctx, 66, RULE_factor);
		int _la;
		try {
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(539);
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
				setState(540);
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
		enterRule(_localctx, 68, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		enterRule(_localctx, 70, RULE_atom_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			atom();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 303465209266176L) != 0)) {
				{
				{
				setState(546);
				trailer();
				}
				}
				setState(551);
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
		enterRule(_localctx, 72, RULE_trailer);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				match(LP);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(553);
					arglist();
					}
				}

				setState(556);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(LBRACK);
				setState(558);
				test();
				setState(559);
				match(RBRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				match(DOT);
				setState(562);
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
		enterRule(_localctx, 74, RULE_atom);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(NAME);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(568); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(567);
					match(STRING);
					}
					}
					setState(570); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(573);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(574);
				match(FALSE);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 7);
				{
				setState(575);
				match(LP);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(576);
					test();
					}
				}

				setState(579);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 8);
				{
				setState(580);
				match(LBRACK);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(581);
					list_content();
					}
				}

				setState(584);
				match(RBRACK);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 9);
				{
				setState(585);
				match(LBRACE);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4033420975407104L) != 0)) {
					{
					setState(586);
					dict_maker();
					}
				}

				setState(589);
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
		enterRule(_localctx, 76, RULE_list_content);
		int _la;
		try {
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				test();
				setState(593);
				comp_for();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				test();
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(596);
					match(COMMA);
					setState(597);
					test();
					}
					}
					setState(602);
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
		enterRule(_localctx, 78, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(FOR);
			setState(606);
			test();
			setState(607);
			match(IN);
			setState(608);
			test();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(609);
				match(IF);
				setState(610);
				test();
				}
				}
				setState(615);
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
		enterRule(_localctx, 80, RULE_dict_maker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			test();
			setState(617);
			match(COLON);
			setState(618);
			test();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(619);
				match(COMMA);
				setState(620);
				test();
				setState(621);
				match(COLON);
				setState(622);
				test();
				}
				}
				setState(628);
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
		enterRule(_localctx, 82, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			argument();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(630);
				match(COMMA);
				setState(631);
				argument();
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
		enterRule(_localctx, 84, RULE_argument);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(NAME);
				setState(639);
				match(ASSIGN);
				setState(640);
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
		enterRule(_localctx, 86, RULE_htmlElement);
		int _la;
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(TAG_OPEN);
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 11L) != 0) || _la==JINJA_STMT_START || _la==JINJA_EXPR_START) {
					{
					{
					setState(644);
					tag_content();
					}
					}
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(650);
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
				setState(651);
				match(SCRIPT_OPEN);
				setState(652);
				match(SCRIPT_BODY);
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(653);
				match(STYLE_OPEN);
				setState(654);
				stylesheet();
				setState(655);
				match(STYLE_CLOSE);
				}
				break;
			case XML_DECLARATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(657);
				match(XML_DECLARATION);
				}
				break;
			case CDATA:
				enterOuterAlt(_localctx, 5);
				{
				setState(658);
				match(CDATA);
				}
				break;
			case DTD:
				enterOuterAlt(_localctx, 6);
				{
				setState(659);
				match(DTD);
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 7);
				{
				setState(660);
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
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				match(TAG_NAME);
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(664);
					match(TAG_EQUALS);
					setState(665);
					match(ATTVALUE_VALUE);
					}
					break;
				}
				}
				break;
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				jinjaExpression();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(669);
				jinjaStatement();
				}
				break;
			case TAG_SLASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(670);
				match(TAG_SLASH);
				}
				break;
			case TAG_EQUALS:
				enterOuterAlt(_localctx, 5);
				{
				setState(671);
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
		enterRule(_localctx, 90, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Charset) {
				{
				{
				setState(674);
				charset();
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) {
					{
					{
					setState(675);
					_la = _input.LA(1);
					if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Import) {
				{
				{
				setState(686);
				imports();
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) {
					{
					{
					setState(687);
					_la = _input.LA(1);
					if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Namespace) {
				{
				{
				setState(698);
				namespace_();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) {
					{
					{
					setState(699);
					_la = _input.LA(1);
					if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 143690294888282065L) != 0)) {
				{
				{
				setState(710);
				nestedStatement();
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) {
					{
					{
					setState(711);
					_la = _input.LA(1);
					if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(722);
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
		enterRule(_localctx, 92, RULE_charset);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new GoodCharsetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				match(Charset);
				setState(725);
				match(String_);
				setState(726);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new BadCharsetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				match(Charset);
				setState(728);
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
		enterRule(_localctx, 94, RULE_imports);
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				match(Import);
				setState(734);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(732);
					match(String_);
					}
					break;
				case Url_:
				case Url:
					{
					setState(733);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(736);
				mediaQueryList();
				setState(737);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new GoodImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(Import);
				setState(742);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(740);
					match(String_);
					}
					break;
				case Url_:
				case Url:
					{
					setState(741);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(744);
				match(SemiColon);
				}
				break;
			case 3:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(745);
				match(Import);
				setState(748);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(746);
					match(String_);
					}
					break;
				case Url_:
				case Url:
					{
					setState(747);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(750);
				mediaQueryList();
				}
				break;
			case 4:
				_localctx = new BadImportContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(751);
				match(Import);
				setState(754);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(752);
					match(String_);
					}
					break;
				case Url_:
				case Url:
					{
					setState(753);
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
		enterRule(_localctx, 96, RULE_namespace_);
		int _la;
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new GoodNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				match(Namespace);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231727901016071L) != 0)) {
					{
					setState(759);
					namespacePrefix();
					}
				}

				setState(764);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(762);
					match(String_);
					}
					break;
				case Url_:
				case Url:
					{
					setState(763);
					url();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(766);
				match(SemiColon);
				}
				break;
			case 2:
				_localctx = new BadNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				match(Namespace);
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231727901016071L) != 0)) {
					{
					setState(768);
					namespacePrefix();
					}
				}

				setState(773);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
					{
					setState(771);
					match(String_);
					}
					break;
				case Url_:
				case Url:
					{
					setState(772);
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
		enterRule(_localctx, 98, RULE_namespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
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
		enterRule(_localctx, 100, RULE_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(Media);
			setState(780);
			mediaQueryList();
			setState(781);
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
		enterRule(_localctx, 102, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(783);
				mediaQuery();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(784);
					match(Comma);
					setState(785);
					mediaQuery();
					}
					}
					setState(790);
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
		enterRule(_localctx, 104, RULE_mediaQuery);
		int _la;
		try {
			int _alt;
			setState(812);
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
				setState(794);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(793);
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
				setState(796);
				mediaType();
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(797);
						match(And);
						setState(798);
						mediaExpression();
						}
						} 
					}
					setState(803);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				}
				break;
			case OpenParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				mediaExpression();
				setState(809);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(805);
						match(And);
						setState(806);
						mediaExpression();
						}
						} 
					}
					setState(811);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		enterRule(_localctx, 106, RULE_mediaType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
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
		enterRule(_localctx, 108, RULE_mediaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(OpenParen);
			setState(817);
			mediaFeature();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(818);
				match(Colon);
				setState(819);
				css_expr();
				}
			}

			setState(822);
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
		enterRule(_localctx, 110, RULE_mediaFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
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
		enterRule(_localctx, 112, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(Page);
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(827);
				pseudoPage();
				}
			}

			setState(830);
			match(OpenBrace);
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231730048507911L) != 0)) {
				{
				setState(831);
				declaration();
				}
			}

			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(834);
				match(SemiColon);
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231730048507911L) != 0)) {
					{
					setState(835);
					declaration();
					}
				}

				}
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(843);
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
		enterRule(_localctx, 114, RULE_pseudoPage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(Colon);
			setState(846);
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
		enterRule(_localctx, 116, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			selector();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(849);
				match(Comma);
				setState(850);
				selector();
				}
				}
				setState(855);
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
		enterRule(_localctx, 118, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			simpleSelectorSequence();
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 3670017L) != 0)) {
				{
				{
				setState(857);
				combinator();
				setState(858);
				simpleSelectorSequence();
				}
				}
				setState(864);
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
		enterRule(_localctx, 120, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 3670017L) != 0)) ) {
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
		enterRule(_localctx, 122, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MediaOnly:
			case Not:
			case And:
			case Multiply:
			case Pipe:
			case Or:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(867);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(868);
					universal();
					}
					break;
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 33560833L) != 0)) {
					{
					setState(876);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(871);
						match(Hash);
						}
						break;
					case Dot:
						{
						setState(872);
						className();
						}
						break;
					case OpenBracket:
						{
						setState(873);
						attrib();
						}
						break;
					case Colon:
						{
						setState(874);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(875);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Colon:
			case Hash:
			case Dot:
			case OpenBracket:
			case PseudoNot:
				enterOuterAlt(_localctx, 2);
				{
				setState(886); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(886);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Hash:
						{
						setState(881);
						match(Hash);
						}
						break;
					case Dot:
						{
						setState(882);
						className();
						}
						break;
					case OpenBracket:
						{
						setState(883);
						attrib();
						}
						break;
					case Colon:
						{
						setState(884);
						pseudo();
						}
						break;
					case PseudoNot:
						{
						setState(885);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(888); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 33560833L) != 0) );
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
		enterRule(_localctx, 124, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(892);
				typeNamespacePrefix();
				}
				break;
			}
			setState(895);
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
		enterRule(_localctx, 126, RULE_typeNamespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
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
				setState(897);
				ident();
				}
				break;
			case Multiply:
				{
				setState(898);
				match(Multiply);
				}
				break;
			case Pipe:
				break;
			default:
				break;
			}
			setState(901);
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
		enterRule(_localctx, 128, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
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
		enterRule(_localctx, 130, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(905);
				typeNamespacePrefix();
				}
				break;
			}
			setState(908);
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
		enterRule(_localctx, 132, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(Dot);
			setState(911);
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
		enterRule(_localctx, 134, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(OpenBracket);
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(914);
				typeNamespacePrefix();
				}
				break;
			}
			setState(917);
			ident();
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 63L) != 0)) {
				{
				setState(918);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 63L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(921);
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
					setState(919);
					ident();
					}
					break;
				case String_:
					{
					setState(920);
					match(String_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(925);
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
		enterRule(_localctx, 136, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(Colon);
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(928);
				match(Colon);
				}
			}

			setState(933);
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
				setState(931);
				ident();
				}
				break;
			case Function_:
				{
				setState(932);
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
		enterRule(_localctx, 138, RULE_functionalPseudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(Function_);
			setState(936);
			expression();
			setState(937);
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
		enterRule(_localctx, 140, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(946);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
					{
					setState(939);
					match(Plus);
					}
					break;
				case Minus:
					{
					setState(940);
					match(Minus);
					}
					break;
				case Dimension:
					{
					setState(941);
					match(Dimension);
					}
					break;
				case UnknownDimension:
					{
					setState(942);
					match(UnknownDimension);
					}
					break;
				case Number:
					{
					setState(943);
					match(Number);
					}
					break;
				case String_:
					{
					setState(944);
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
					setState(945);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(950); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 78830617877316033L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 142, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(PseudoNot);
			setState(953);
			negationArg();
			setState(954);
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
		enterRule(_localctx, 144, RULE_negationArg);
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(956);
				typeSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				universal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				match(Hash);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(959);
				className();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(960);
				attrib();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(961);
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
		enterRule(_localctx, 146, RULE_operator_);
		try {
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Divide:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(Divide);
				}
				break;
			case Comma:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				match(Comma);
				}
				break;
			case Space:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(Space);
				}
				break;
			case Equal:
				_localctx = new BadOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
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
		enterRule(_localctx, 148, RULE_property_);
		try {
			setState(974);
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
				setState(970);
				ident();
				}
				break;
			case Variable:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				match(Variable);
				}
				break;
			case Multiply:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(972);
				match(Multiply);
				setState(973);
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
		enterRule(_localctx, 150, RULE_ruleset);
		int _la;
		try {
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new KnownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				selectorGroup();
				setState(977);
				match(OpenBrace);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 39415361552253153L) != 0)) {
					{
					setState(978);
					declarationList();
					}
				}

				setState(981);
				match(CloseBrace);
				}
				break;
			case 2:
				_localctx = new UnknownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 78941670032574401L) != 0)) {
					{
					{
					setState(983);
					any_();
					}
					}
					setState(988);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(989);
				match(OpenBrace);
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 39415361552253153L) != 0)) {
					{
					setState(990);
					declarationList();
					}
				}

				setState(993);
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
		enterRule(_localctx, 152, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(996);
				match(SemiColon);
				}
				}
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1002);
			declaration();
			setState(1009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1003);
					match(SemiColon);
					setState(1005);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(1004);
						declaration();
						}
						break;
					}
					}
					} 
				}
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
		enterRule(_localctx, 154, RULE_declaration);
		int _la;
		try {
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new KnownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				property_();
				setState(1013);
				match(Colon);
				setState(1014);
				css_expr();
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Important) {
					{
					setState(1015);
					prio();
					}
				}

				}
				break;
			case 2:
				_localctx = new UnknownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				property_();
				setState(1019);
				match(Colon);
				setState(1020);
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
		enterRule(_localctx, 156, RULE_prio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
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
		enterRule(_localctx, 158, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1029); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1029);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case String_:
					case MediaOnly:
					case Not:
					case And:
					case OpenParen:
					case Colon:
					case Plus:
					case Hash:
					case OpenBracket:
					case Includes:
					case DashMatch:
					case Function_:
					case Minus:
					case Dimension:
					case UnknownDimension:
					case Number:
					case UnicodeRange:
					case Percentage:
					case Or:
					case Url_:
					case Url:
					case From:
					case To:
					case Ident:
						{
						setState(1026);
						any_();
						}
						break;
					case OpenBrace:
						{
						setState(1027);
						block();
						}
						break;
					case AtKeyword:
						{
						setState(1028);
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
				setState(1031); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
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
		enterRule(_localctx, 160, RULE_css_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			css_term();
			setState(1040);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1035);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 1100585370113L) != 0)) {
						{
						setState(1034);
						operator_();
						}
					}

					setState(1037);
					css_term();
					}
					} 
				}
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
		enterRule(_localctx, 162, RULE_css_term);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				number();
				}
				break;
			case 2:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				percentage();
				}
				break;
			case 3:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1045);
				dimension();
				}
				break;
			case 4:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1046);
				match(String_);
				}
				break;
			case 5:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1047);
				match(UnicodeRange);
				}
				break;
			case 6:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1048);
				ident();
				}
				break;
			case 7:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1049);
				var_();
				}
				break;
			case 8:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1050);
				url();
				}
				break;
			case 9:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1051);
				hexcolor();
				}
				break;
			case 10:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1052);
				calc();
				}
				break;
			case 11:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1053);
				function_();
				}
				break;
			case 12:
				_localctx = new UnknownTermContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1054);
				unknownDimension();
				}
				break;
			case 13:
				_localctx = new BadTermContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1055);
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
		enterRule(_localctx, 164, RULE_function_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(Function_);
			setState(1059);
			css_expr();
			setState(1060);
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
		enterRule(_localctx, 166, RULE_dxImageTransform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(DxImageTransform);
			setState(1063);
			css_expr();
			setState(1064);
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
		enterRule(_localctx, 168, RULE_hexcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
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
		enterRule(_localctx, 170, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1068);
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

			setState(1071);
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
		enterRule(_localctx, 172, RULE_percentage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1073);
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

			setState(1076);
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
		enterRule(_localctx, 174, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1078);
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

			setState(1081);
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
		enterRule(_localctx, 176, RULE_unknownDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1083);
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

			setState(1086);
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
		enterRule(_localctx, 178, RULE_any_);
		int _la;
		try {
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1090);
				percentage();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1091);
				dimension();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1092);
				unknownDimension();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1093);
				match(String_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1094);
				url();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1095);
				match(Hash);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1096);
				match(UnicodeRange);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1097);
				match(Includes);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1098);
				match(DashMatch);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1099);
				match(Colon);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1100);
				match(Function_);
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 631537758307171867L) != 0)) {
					{
					setState(1103);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case String_:
					case MediaOnly:
					case Not:
					case And:
					case OpenParen:
					case Colon:
					case Plus:
					case Hash:
					case OpenBracket:
					case Includes:
					case DashMatch:
					case Function_:
					case Minus:
					case Dimension:
					case UnknownDimension:
					case Number:
					case UnicodeRange:
					case Percentage:
					case Or:
					case Url_:
					case Url:
					case From:
					case To:
					case Ident:
						{
						setState(1101);
						any_();
						}
						break;
					case Cdo:
					case Cdc:
					case SemiColon:
					case OpenBrace:
					case AtKeyword:
						{
						setState(1102);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1108);
				match(CloseParen);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1109);
				match(OpenParen);
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 631537758307171867L) != 0)) {
					{
					setState(1112);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case String_:
					case MediaOnly:
					case Not:
					case And:
					case OpenParen:
					case Colon:
					case Plus:
					case Hash:
					case OpenBracket:
					case Includes:
					case DashMatch:
					case Function_:
					case Minus:
					case Dimension:
					case UnknownDimension:
					case Number:
					case UnicodeRange:
					case Percentage:
					case Or:
					case Url_:
					case Url:
					case From:
					case To:
					case Ident:
						{
						setState(1110);
						any_();
						}
						break;
					case Cdo:
					case Cdc:
					case SemiColon:
					case OpenBrace:
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
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1118);
				match(OpenBracket);
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 631537758307171867L) != 0)) {
					{
					setState(1121);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case String_:
					case MediaOnly:
					case Not:
					case And:
					case OpenParen:
					case Colon:
					case Plus:
					case Hash:
					case OpenBracket:
					case Includes:
					case DashMatch:
					case Function_:
					case Minus:
					case Dimension:
					case UnknownDimension:
					case Number:
					case UnicodeRange:
					case Percentage:
					case Or:
					case Url_:
					case Url:
					case From:
					case To:
					case Ident:
						{
						setState(1119);
						any_();
						}
						break;
					case Cdo:
					case Cdc:
					case SemiColon:
					case OpenBrace:
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
		enterRule(_localctx, 180, RULE_atRule);
		int _la;
		try {
			_localctx = new UnknownAtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			match(AtKeyword);
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 78941670032574401L) != 0)) {
				{
				{
				setState(1130);
				any_();
				}
				}
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				setState(1136);
				block();
				}
				break;
			case SemiColon:
				{
				setState(1137);
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
		enterRule(_localctx, 182, RULE_unused);
		try {
			setState(1145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				block();
				}
				break;
			case AtKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				match(AtKeyword);
				}
				break;
			case SemiColon:
				enterOuterAlt(_localctx, 3);
				{
				setState(1142);
				match(SemiColon);
				}
				break;
			case Cdo:
				enterOuterAlt(_localctx, 4);
				{
				setState(1143);
				match(Cdo);
				}
				break;
			case Cdc:
				enterOuterAlt(_localctx, 5);
				{
				setState(1144);
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
		enterRule(_localctx, 184, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(OpenBrace);
			setState(1156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 143690432327235539L) != 0)) {
				{
				setState(1154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1148);
					declarationList();
					}
					break;
				case 2:
					{
					setState(1149);
					nestedStatement();
					}
					break;
				case 3:
					{
					setState(1150);
					any_();
					}
					break;
				case 4:
					{
					setState(1151);
					block();
					}
					break;
				case 5:
					{
					setState(1152);
					match(AtKeyword);
					}
					break;
				case 6:
					{
					setState(1153);
					match(SemiColon);
					}
					break;
				}
				}
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1159);
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
		enterRule(_localctx, 186, RULE_nestedStatement);
		try {
			setState(1171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String_:
			case MediaOnly:
			case Not:
			case And:
			case OpenParen:
			case Colon:
			case OpenBrace:
			case Plus:
			case Hash:
			case Multiply:
			case Pipe:
			case Dot:
			case OpenBracket:
			case Includes:
			case DashMatch:
			case Function_:
			case Minus:
			case Dimension:
			case UnknownDimension:
			case Number:
			case PseudoNot:
			case UnicodeRange:
			case Percentage:
			case Or:
			case Url_:
			case Url:
			case From:
			case To:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				ruleset();
				}
				break;
			case Media:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				media();
				}
				break;
			case Page:
				enterOuterAlt(_localctx, 3);
				{
				setState(1163);
				page();
				}
				break;
			case FontFace:
				enterOuterAlt(_localctx, 4);
				{
				setState(1164);
				fontFaceRule();
				}
				break;
			case Keyframes:
				enterOuterAlt(_localctx, 5);
				{
				setState(1165);
				keyframesRule();
				}
				break;
			case Supports:
				enterOuterAlt(_localctx, 6);
				{
				setState(1166);
				supportsRule();
				}
				break;
			case Viewport:
				enterOuterAlt(_localctx, 7);
				{
				setState(1167);
				viewport();
				}
				break;
			case CounterStyle:
				enterOuterAlt(_localctx, 8);
				{
				setState(1168);
				counterStyle();
				}
				break;
			case FontFeatureValues:
				enterOuterAlt(_localctx, 9);
				{
				setState(1169);
				fontFeatureValuesRule();
				}
				break;
			case AtKeyword:
				enterOuterAlt(_localctx, 10);
				{
				setState(1170);
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
		enterRule(_localctx, 188, RULE_groupRuleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(OpenBrace);
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 143690294888282065L) != 0)) {
				{
				{
				setState(1174);
				nestedStatement();
				}
				}
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1180);
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
		enterRule(_localctx, 190, RULE_supportsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(Supports);
			setState(1183);
			supportsCondition();
			setState(1184);
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
		enterRule(_localctx, 192, RULE_supportsCondition);
		try {
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				supportsNegation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				supportsConjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
				supportsDisjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
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
		enterRule(_localctx, 194, RULE_supportsConditionInParens);
		try {
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				match(OpenParen);
				setState(1193);
				supportsCondition();
				setState(1194);
				match(CloseParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				supportsDeclarationCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
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
		enterRule(_localctx, 196, RULE_supportsNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(Not);
			setState(1201);
			match(Space);
			setState(1202);
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
		enterRule(_localctx, 198, RULE_supportsConjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			supportsConditionInParens();
			setState(1209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1205);
				match(Space);
				setState(1206);
				match(And);
				setState(1207);
				match(Space);
				setState(1208);
				supportsConditionInParens();
				}
				}
				setState(1211); 
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
		enterRule(_localctx, 200, RULE_supportsDisjunction);
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
				match(Or);
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
		enterRule(_localctx, 202, RULE_supportsDeclarationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(OpenParen);
			setState(1223);
			declaration();
			setState(1224);
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
		enterRule(_localctx, 204, RULE_generalEnclosed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			_la = _input.LA(1);
			if ( !(_la==OpenParen || _la==Function_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 631537758307171867L) != 0)) {
				{
				setState(1229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case String_:
				case MediaOnly:
				case Not:
				case And:
				case OpenParen:
				case Colon:
				case Plus:
				case Hash:
				case OpenBracket:
				case Includes:
				case DashMatch:
				case Function_:
				case Minus:
				case Dimension:
				case UnknownDimension:
				case Number:
				case UnicodeRange:
				case Percentage:
				case Or:
				case Url_:
				case Url:
				case From:
				case To:
				case Ident:
					{
					setState(1227);
					any_();
					}
					break;
				case Cdo:
				case Cdc:
				case SemiColon:
				case OpenBrace:
				case AtKeyword:
					{
					setState(1228);
					unused();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1234);
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
		enterRule(_localctx, 206, RULE_url);
		try {
			setState(1240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Url_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				match(Url_);
				setState(1237);
				match(String_);
				setState(1238);
				match(CloseParen);
				}
				break;
			case Url:
				enterOuterAlt(_localctx, 2);
				{
				setState(1239);
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
		enterRule(_localctx, 208, RULE_var_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			match(Var);
			setState(1243);
			match(Variable);
			setState(1244);
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
		enterRule(_localctx, 210, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(Calc);
			setState(1247);
			calcSum();
			setState(1248);
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
		enterRule(_localctx, 212, RULE_calcSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			calcProduct();
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(1251);
				match(Space);
				setState(1252);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1253);
				match(Space);
				setState(1254);
				calcProduct();
				}
				}
				setState(1259);
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
		enterRule(_localctx, 214, RULE_calcProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			calcValue();
			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Multiply || _la==Divide) {
				{
				setState(1265);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
					{
					setState(1261);
					match(Multiply);
					setState(1262);
					calcValue();
					}
					break;
				case Divide:
					{
					setState(1263);
					match(Divide);
					setState(1264);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1269);
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
		enterRule(_localctx, 216, RULE_calcValue);
		try {
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1270);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271);
				dimension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1272);
				unknownDimension();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1273);
				percentage();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1274);
				match(OpenParen);
				setState(1275);
				calcSum();
				setState(1276);
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
		enterRule(_localctx, 218, RULE_fontFaceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			match(FontFace);
			setState(1281);
			match(OpenBrace);
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231730048507911L) != 0)) {
				{
				setState(1282);
				fontFaceDeclaration();
				}
			}

			setState(1291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(1285);
				match(SemiColon);
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231730048507911L) != 0)) {
					{
					setState(1286);
					fontFaceDeclaration();
					}
				}

				}
				}
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1294);
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
		enterRule(_localctx, 220, RULE_fontFaceDeclaration);
		try {
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				_localctx = new KnownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				property_();
				setState(1297);
				match(Colon);
				setState(1298);
				css_expr();
				}
				break;
			case 2:
				_localctx = new UnknownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				property_();
				setState(1301);
				match(Colon);
				setState(1302);
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
		enterRule(_localctx, 222, RULE_keyframesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			match(Keyframes);
			setState(1307);
			match(Space);
			setState(1308);
			ident();
			setState(1309);
			match(OpenBrace);
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 1537L) != 0)) {
				{
				{
				setState(1310);
				keyframeBlock();
				}
				}
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1316);
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
		enterRule(_localctx, 224, RULE_keyframeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1318);
			keyframeSelector();
			setState(1319);
			match(OpenBrace);
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 39415361552253153L) != 0)) {
				{
				setState(1320);
				declarationList();
				}
			}

			setState(1323);
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
		enterRule(_localctx, 226, RULE_keyframeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 1537L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1326);
				match(Comma);
				setState(1327);
				_la = _input.LA(1);
				if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 1537L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1332);
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
		enterRule(_localctx, 228, RULE_viewport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(Viewport);
			setState(1334);
			match(OpenBrace);
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 39415361552253153L) != 0)) {
				{
				setState(1335);
				declarationList();
				}
			}

			setState(1338);
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
		enterRule(_localctx, 230, RULE_counterStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			match(CounterStyle);
			setState(1341);
			ident();
			setState(1342);
			match(OpenBrace);
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 39415361552253153L) != 0)) {
				{
				setState(1343);
				declarationList();
				}
			}

			setState(1346);
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
		enterRule(_localctx, 232, RULE_fontFeatureValuesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(FontFeatureValues);
			setState(1349);
			fontFamilyNameList();
			setState(1350);
			match(OpenBrace);
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AtKeyword) {
				{
				{
				setState(1351);
				featureValueBlock();
				}
				}
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1357);
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
		enterRule(_localctx, 234, RULE_fontFamilyNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			fontFamilyName();
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1360);
				match(Comma);
				setState(1361);
				fontFamilyName();
				}
				}
				setState(1366);
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
		enterRule(_localctx, 236, RULE_fontFamilyName);
		int _la;
		try {
			setState(1375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
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
				setState(1368);
				ident();
				setState(1372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231727901016071L) != 0)) {
					{
					{
					setState(1369);
					ident();
					}
					}
					setState(1374);
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
		enterRule(_localctx, 238, RULE_featureValueBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			featureType();
			setState(1378);
			match(OpenBrace);
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231727901016071L) != 0)) {
				{
				setState(1379);
				featureValueDefinition();
				}
			}

			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(1382);
				match(SemiColon);
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231727901016071L) != 0)) {
					{
					setState(1383);
					featureValueDefinition();
					}
				}

				}
				}
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1391);
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
		enterRule(_localctx, 240, RULE_featureType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
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
		enterRule(_localctx, 242, RULE_featureValueDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			ident();
			setState(1396);
			match(Colon);
			setState(1397);
			number();
			setState(1401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 589825L) != 0)) {
				{
				{
				setState(1398);
				number();
				}
				}
				setState(1403);
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
		enterRule(_localctx, 244, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 1231727901016071L) != 0)) ) {
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
		enterRule(_localctx, 246, RULE_jinjaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(JINJA_STMT_START);
			setState(1407);
			jStatement();
			setState(1408);
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
		enterRule(_localctx, 248, RULE_jStatement);
		int _la;
		try {
			setState(1426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1410);
				jIfStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1411);
				jForStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1412);
				match(J_NAME);
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 245014986757L) != 0)) {
					{
					setState(1413);
					jTestExpr();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1416);
				match(J_SET);
				setState(1417);
				jExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1418);
				jRawStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1419);
				match(J_NAME);
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==J_LPAREN) {
					{
					setState(1420);
					match(J_LPAREN);
					setState(1421);
					jArgumentList();
					setState(1422);
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
		enterRule(_localctx, 250, RULE_jRawStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(J_RAW);
			setState(1429);
			html_content();
			setState(1430);
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
		enterRule(_localctx, 252, RULE_jIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(J_IF);
			setState(1433);
			jTestExpr();
			setState(1434);
			html_content();
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_ELIF) {
				{
				{
				setState(1435);
				match(J_ELIF);
				setState(1436);
				jTestExpr();
				setState(1437);
				html_content();
				}
				}
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_ELSE) {
				{
				setState(1444);
				match(J_ELSE);
				setState(1445);
				html_content();
				}
			}

			setState(1448);
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
		enterRule(_localctx, 254, RULE_jForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(J_FOR);
			setState(1451);
			jTargetList();
			setState(1452);
			match(J_IN);
			setState(1453);
			jExpression();
			setState(1454);
			html_content();
			setState(1457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_ELSE) {
				{
				setState(1455);
				match(J_ELSE);
				setState(1456);
				html_content();
				}
			}

			setState(1459);
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
		enterRule(_localctx, 256, RULE_jTargetList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			match(J_NAME);
			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1462);
				match(J_COMMA);
				setState(1463);
				match(J_NAME);
				}
				}
				setState(1468);
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
		enterRule(_localctx, 258, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(JINJA_EXPR_START);
			setState(1470);
			jExpression();
			setState(1471);
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
		enterRule(_localctx, 260, RULE_jExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			jTestExpr();
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_PIPE) {
				{
				{
				setState(1474);
				match(J_PIPE);
				setState(1475);
				jFilter();
				}
				}
				setState(1480);
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
		enterRule(_localctx, 262, RULE_jFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			match(J_NAME);
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_LPAREN) {
				{
				setState(1482);
				match(J_LPAREN);
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 245014986757L) != 0)) {
					{
					setState(1483);
					jArgumentList();
					}
				}

				setState(1486);
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
		enterRule(_localctx, 264, RULE_jTestExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
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
		enterRule(_localctx, 266, RULE_jOrTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			jAndTest();
			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_OR) {
				{
				{
				setState(1492);
				match(J_OR);
				setState(1493);
				jAndTest();
				}
				}
				setState(1498);
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
		enterRule(_localctx, 268, RULE_jAndTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			jNotTest();
			setState(1504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_AND) {
				{
				{
				setState(1500);
				match(J_AND);
				setState(1501);
				jNotTest();
				}
				}
				setState(1506);
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
		enterRule(_localctx, 270, RULE_jNotTest);
		try {
			setState(1510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				match(J_NOT);
				setState(1508);
				jNotTest();
				}
				break;
			case J_NAME:
			case J_LPAREN:
			case J_PLUS:
			case J_MINUS:
			case J_LBRACK:
			case J_NUMBER:
			case J_STRING:
			case J_LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1509);
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
		enterRule(_localctx, 272, RULE_jComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			jMathExpr();
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & 32513L) != 0)) {
				{
				{
				setState(1513);
				jCompOp();
				setState(1514);
				jMathExpr();
				}
				}
				setState(1520);
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
		enterRule(_localctx, 274, RULE_jCompOp);
		try {
			setState(1530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				match(J_LT);
				}
				break;
			case J_GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				match(J_GT);
				}
				break;
			case J_EQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				match(J_EQ);
				}
				break;
			case J_NE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1524);
				match(J_NE);
				}
				break;
			case J_GE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1525);
				match(J_GE);
				}
				break;
			case J_LE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1526);
				match(J_LE);
				}
				break;
			case J_IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1527);
				match(J_IN);
				}
				break;
			case J_NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1528);
				match(J_NOT);
				setState(1529);
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
		enterRule(_localctx, 276, RULE_jMathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			jTerm();
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_PLUS || _la==J_MINUS) {
				{
				{
				setState(1533);
				_la = _input.LA(1);
				if ( !(_la==J_PLUS || _la==J_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1534);
				jTerm();
				}
				}
				setState(1539);
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
		enterRule(_localctx, 278, RULE_jTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			jFactor();
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 15L) != 0)) {
				{
				{
				setState(1541);
				_la = _input.LA(1);
				if ( !(((((_la - 161)) & ~0x3f) == 0 && ((1L << (_la - 161)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1542);
				jFactor();
				}
				}
				setState(1547);
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
		enterRule(_localctx, 280, RULE_jFactor);
		int _la;
		try {
			setState(1551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_PLUS:
			case J_MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548);
				_la = _input.LA(1);
				if ( !(_la==J_PLUS || _la==J_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1549);
				jFactor();
				}
				break;
			case J_NAME:
			case J_LPAREN:
			case J_LBRACK:
			case J_NUMBER:
			case J_STRING:
			case J_LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550);
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
		enterRule(_localctx, 282, RULE_jAtomExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			jAtom();
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & 5368709121L) != 0)) {
				{
				{
				setState(1554);
				jTrailer();
				}
				}
				setState(1559);
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
		enterRule(_localctx, 284, RULE_jTrailer);
		int _la;
		try {
			setState(1571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				match(J_LPAREN);
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 245014986757L) != 0)) {
					{
					setState(1561);
					jArgumentList();
					}
				}

				setState(1564);
				match(J_RPAREN);
				}
				break;
			case J_LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				match(J_LBRACK);
				setState(1566);
				jTestExpr();
				setState(1567);
				match(J_RBRACK);
				}
				break;
			case J_DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1569);
				match(J_DOT);
				setState(1570);
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
		enterRule(_localctx, 286, RULE_jAtom);
		int _la;
		try {
			setState(1590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1573);
				match(J_NAME);
				}
				break;
			case J_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1574);
				match(J_NUMBER);
				}
				break;
			case J_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1575);
				match(J_STRING);
				}
				break;
			case J_LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1576);
				match(J_LPAREN);
				setState(1577);
				jTestExpr();
				setState(1578);
				match(J_RPAREN);
				}
				break;
			case J_LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(1580);
				match(J_LBRACK);
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 245014986757L) != 0)) {
					{
					setState(1581);
					jTestExprList();
					}
				}

				setState(1584);
				match(J_RBRACK);
				}
				break;
			case J_LBRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1585);
				match(J_LBRACE);
				setState(1587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & 245014986757L) != 0)) {
					{
					setState(1586);
					jDictMaker();
					}
				}

				setState(1589);
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
		enterRule(_localctx, 288, RULE_jTestExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			jTestExpr();
			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1593);
				match(J_COMMA);
				setState(1594);
				jTestExpr();
				}
				}
				setState(1599);
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
		enterRule(_localctx, 290, RULE_jArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			jTestExpr();
			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1601);
				match(J_COMMA);
				setState(1602);
				jTestExpr();
				}
				}
				setState(1607);
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
		enterRule(_localctx, 292, RULE_jDictMaker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			jTestExpr();
			setState(1609);
			match(J_COLON);
			setState(1610);
			jTestExpr();
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(1611);
				match(J_COMMA);
				setState(1612);
				jTestExpr();
				setState(1613);
				match(J_COLON);
				setState(1614);
				jTestExpr();
				}
				}
				setState(1620);
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
		"\u0004\u0001\u00ac\u0656\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0092\u0001\u0000\u0001\u0000\u0005\u0000\u0129\b\u0000\n\u0000\f\u0000"+
		"\u012c\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0132\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0137\b"+
		"\u0002\n\u0002\f\u0002\u013a\t\u0002\u0003\u0002\u013c\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0146\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u014b\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0154\b\u0006\n\u0006"+
		"\f\u0006\u0157\t\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u015b\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0161\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0168\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u016d"+
		"\b\n\n\n\f\n\u0170\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0175\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u017a\b\f\n\f\f\f\u017d"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0183\b\r\n\r\f\r\u0186\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u018c\b"+
		"\u000f\u000b\u000f\f\u000f\u018d\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0194\b\u0010\u0001\u0010\u0003\u0010\u0197\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u01a0\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u01a7\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01ae\b\u0013\n\u0013"+
		"\f\u0013\u01b1\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01bc\b\u0014\n\u0014\f\u0014\u01bf\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u01c4\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u01c8"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0004\u0017\u01d0\b\u0017\u000b\u0017\f\u0017\u01d1\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01d6\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u01db\b\u0018\n\u0018\f\u0018\u01de\t\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01e5\b\u001a\n"+
		"\u001a\f\u001a\u01e8\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u01ed\b\u001b\n\u001b\f\u001b\u01f0\t\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01f5\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u01fb\b\u001d\n\u001d\f\u001d\u01fe\t\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0209\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u020e\b\u001f\n\u001f\f\u001f\u0211\t\u001f"+
		"\u0001 \u0001 \u0001 \u0005 \u0216\b \n \f \u0219\t \u0001!\u0001!\u0001"+
		"!\u0003!\u021e\b!\u0001\"\u0001\"\u0001#\u0001#\u0005#\u0224\b#\n#\f#"+
		"\u0227\t#\u0001$\u0001$\u0003$\u022b\b$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0234\b$\u0001%\u0001%\u0001%\u0004%\u0239\b%\u000b"+
		"%\f%\u023a\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0242\b%\u0001%\u0001"+
		"%\u0001%\u0003%\u0247\b%\u0001%\u0001%\u0001%\u0003%\u024c\b%\u0001%\u0003"+
		"%\u024f\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0257\b&\n"+
		"&\f&\u025a\t&\u0003&\u025c\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0005\'\u0264\b\'\n\'\f\'\u0267\t\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0005(\u0271\b(\n(\f(\u0274\t(\u0001)\u0001"+
		")\u0001)\u0005)\u0279\b)\n)\f)\u027c\t)\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u0282\b*\u0001+\u0001+\u0005+\u0286\b+\n+\f+\u0289\t+\u0001+\u0001+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0296\b+\u0001,\u0001,\u0001,\u0003,\u029b\b,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u02a1\b,\u0001-\u0001-\u0005-\u02a5\b-\n-\f-\u02a8\t-\u0005-"+
		"\u02aa\b-\n-\f-\u02ad\t-\u0001-\u0001-\u0005-\u02b1\b-\n-\f-\u02b4\t-"+
		"\u0005-\u02b6\b-\n-\f-\u02b9\t-\u0001-\u0001-\u0005-\u02bd\b-\n-\f-\u02c0"+
		"\t-\u0005-\u02c2\b-\n-\f-\u02c5\t-\u0001-\u0001-\u0005-\u02c9\b-\n-\f"+
		"-\u02cc\t-\u0005-\u02ce\b-\n-\f-\u02d1\t-\u0001-\u0001-\u0001.\u0001."+
		"\u0001.\u0001.\u0001.\u0003.\u02da\b.\u0001/\u0001/\u0001/\u0003/\u02df"+
		"\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u02e7\b/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u02ed\b/\u0001/\u0001/\u0001/\u0001/\u0003/\u02f3"+
		"\b/\u0003/\u02f5\b/\u00010\u00010\u00030\u02f9\b0\u00010\u00010\u0003"+
		"0\u02fd\b0\u00010\u00010\u00010\u00030\u0302\b0\u00010\u00010\u00030\u0306"+
		"\b0\u00030\u0308\b0\u00011\u00011\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00053\u0313\b3\n3\f3\u0316\t3\u00033\u0318\b3\u00014\u00034"+
		"\u031b\b4\u00014\u00014\u00014\u00054\u0320\b4\n4\f4\u0323\t4\u00014\u0001"+
		"4\u00014\u00054\u0328\b4\n4\f4\u032b\t4\u00034\u032d\b4\u00015\u00015"+
		"\u00016\u00016\u00016\u00016\u00036\u0335\b6\u00016\u00016\u00017\u0001"+
		"7\u00018\u00018\u00038\u033d\b8\u00018\u00018\u00038\u0341\b8\u00018\u0001"+
		"8\u00038\u0345\b8\u00058\u0347\b8\n8\f8\u034a\t8\u00018\u00018\u00019"+
		"\u00019\u00019\u0001:\u0001:\u0001:\u0005:\u0354\b:\n:\f:\u0357\t:\u0001"+
		";\u0001;\u0001;\u0001;\u0005;\u035d\b;\n;\f;\u0360\t;\u0001<\u0001<\u0001"+
		"=\u0001=\u0003=\u0366\b=\u0001=\u0001=\u0001=\u0001=\u0001=\u0005=\u036d"+
		"\b=\n=\f=\u0370\t=\u0001=\u0001=\u0001=\u0001=\u0001=\u0004=\u0377\b="+
		"\u000b=\f=\u0378\u0003=\u037b\b=\u0001>\u0003>\u037e\b>\u0001>\u0001>"+
		"\u0001?\u0001?\u0003?\u0384\b?\u0001?\u0001?\u0001@\u0001@\u0001A\u0003"+
		"A\u038b\bA\u0001A\u0001A\u0001B\u0001B\u0001B\u0001C\u0001C\u0003C\u0394"+
		"\bC\u0001C\u0001C\u0001C\u0001C\u0003C\u039a\bC\u0003C\u039c\bC\u0001"+
		"C\u0001C\u0001D\u0001D\u0003D\u03a2\bD\u0001D\u0001D\u0003D\u03a6\bD\u0001"+
		"E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u03b3\bF\u0004F\u03b5\bF\u000bF\fF\u03b6\u0001G\u0001G\u0001"+
		"G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u03c3\bH\u0001"+
		"I\u0001I\u0001I\u0001I\u0003I\u03c9\bI\u0001J\u0001J\u0001J\u0001J\u0003"+
		"J\u03cf\bJ\u0001K\u0001K\u0001K\u0003K\u03d4\bK\u0001K\u0001K\u0001K\u0005"+
		"K\u03d9\bK\nK\fK\u03dc\tK\u0001K\u0001K\u0003K\u03e0\bK\u0001K\u0003K"+
		"\u03e3\bK\u0001L\u0005L\u03e6\bL\nL\fL\u03e9\tL\u0001L\u0001L\u0001L\u0003"+
		"L\u03ee\bL\u0005L\u03f0\bL\nL\fL\u03f3\tL\u0001M\u0001M\u0001M\u0001M"+
		"\u0003M\u03f9\bM\u0001M\u0001M\u0001M\u0001M\u0003M\u03ff\bM\u0001N\u0001"+
		"N\u0001O\u0001O\u0001O\u0004O\u0406\bO\u000bO\fO\u0407\u0001P\u0001P\u0003"+
		"P\u040c\bP\u0001P\u0005P\u040f\bP\nP\fP\u0412\tP\u0001Q\u0001Q\u0001Q"+
		"\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0003Q\u0421\bQ\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001"+
		"S\u0001T\u0001T\u0001U\u0003U\u042e\bU\u0001U\u0001U\u0001V\u0003V\u0433"+
		"\bV\u0001V\u0001V\u0001W\u0003W\u0438\bW\u0001W\u0001W\u0001X\u0003X\u043d"+
		"\bX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u0450\bY\nY"+
		"\fY\u0453\tY\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u0459\bY\nY\fY\u045c\t"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u0462\bY\nY\fY\u0465\tY\u0001Y\u0003"+
		"Y\u0468\bY\u0001Z\u0001Z\u0005Z\u046c\bZ\nZ\fZ\u046f\tZ\u0001Z\u0001Z"+
		"\u0003Z\u0473\bZ\u0001[\u0001[\u0001[\u0001[\u0001[\u0003[\u047a\b[\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u0483\b\\\n"+
		"\\\f\\\u0486\t\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0003]\u0494\b]\u0001^\u0001^\u0005^\u0498"+
		"\b^\n^\f^\u049b\t^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001_\u0001`\u0001"+
		"`\u0001`\u0001`\u0003`\u04a7\b`\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0003a\u04af\ba\u0001b\u0001b\u0001b\u0001b\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0004c\u04ba\bc\u000bc\fc\u04bb\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0004d\u04c3\bd\u000bd\fd\u04c4\u0001e\u0001e\u0001e\u0001e\u0001f\u0001"+
		"f\u0001f\u0005f\u04ce\bf\nf\ff\u04d1\tf\u0001f\u0001f\u0001g\u0001g\u0001"+
		"g\u0001g\u0003g\u04d9\bg\u0001h\u0001h\u0001h\u0001h\u0001i\u0001i\u0001"+
		"i\u0001i\u0001j\u0001j\u0001j\u0001j\u0001j\u0005j\u04e8\bj\nj\fj\u04eb"+
		"\tj\u0001k\u0001k\u0001k\u0001k\u0001k\u0005k\u04f2\bk\nk\fk\u04f5\tk"+
		"\u0001l\u0001l\u0001l\u0001l\u0001l\u0001l\u0001l\u0001l\u0003l\u04ff"+
		"\bl\u0001m\u0001m\u0001m\u0003m\u0504\bm\u0001m\u0001m\u0003m\u0508\b"+
		"m\u0005m\u050a\bm\nm\fm\u050d\tm\u0001m\u0001m\u0001n\u0001n\u0001n\u0001"+
		"n\u0001n\u0001n\u0001n\u0001n\u0003n\u0519\bn\u0001o\u0001o\u0001o\u0001"+
		"o\u0001o\u0005o\u0520\bo\no\fo\u0523\to\u0001o\u0001o\u0001p\u0001p\u0001"+
		"p\u0003p\u052a\bp\u0001p\u0001p\u0001q\u0001q\u0001q\u0005q\u0531\bq\n"+
		"q\fq\u0534\tq\u0001r\u0001r\u0001r\u0003r\u0539\br\u0001r\u0001r\u0001"+
		"s\u0001s\u0001s\u0001s\u0003s\u0541\bs\u0001s\u0001s\u0001t\u0001t\u0001"+
		"t\u0001t\u0005t\u0549\bt\nt\ft\u054c\tt\u0001t\u0001t\u0001u\u0001u\u0001"+
		"u\u0005u\u0553\bu\nu\fu\u0556\tu\u0001v\u0001v\u0001v\u0005v\u055b\bv"+
		"\nv\fv\u055e\tv\u0003v\u0560\bv\u0001w\u0001w\u0001w\u0003w\u0565\bw\u0001"+
		"w\u0001w\u0003w\u0569\bw\u0005w\u056b\bw\nw\fw\u056e\tw\u0001w\u0001w"+
		"\u0001x\u0001x\u0001y\u0001y\u0001y\u0001y\u0005y\u0578\by\ny\fy\u057b"+
		"\ty\u0001z\u0001z\u0001{\u0001{\u0001{\u0001{\u0001|\u0001|\u0001|\u0001"+
		"|\u0003|\u0587\b|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0001"+
		"|\u0003|\u0591\b|\u0003|\u0593\b|\u0001}\u0001}\u0001}\u0001}\u0001~\u0001"+
		"~\u0001~\u0001~\u0001~\u0001~\u0001~\u0005~\u05a0\b~\n~\f~\u05a3\t~\u0001"+
		"~\u0001~\u0003~\u05a7\b~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f\u0003\u007f\u05b2\b\u007f"+
		"\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0005\u0080"+
		"\u05b9\b\u0080\n\u0080\f\u0080\u05bc\t\u0080\u0001\u0081\u0001\u0081\u0001"+
		"\u0081\u0001\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0005\u0082\u05c5"+
		"\b\u0082\n\u0082\f\u0082\u05c8\t\u0082\u0001\u0083\u0001\u0083\u0001\u0083"+
		"\u0003\u0083\u05cd\b\u0083\u0001\u0083\u0003\u0083\u05d0\b\u0083\u0001"+
		"\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0005\u0085\u05d7"+
		"\b\u0085\n\u0085\f\u0085\u05da\t\u0085\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0005\u0086\u05df\b\u0086\n\u0086\f\u0086\u05e2\t\u0086\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0003\u0087\u05e7\b\u0087\u0001\u0088\u0001\u0088\u0001"+
		"\u0088\u0001\u0088\u0005\u0088\u05ed\b\u0088\n\u0088\f\u0088\u05f0\t\u0088"+
		"\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089"+
		"\u0001\u0089\u0001\u0089\u0001\u0089\u0003\u0089\u05fb\b\u0089\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0005\u008a\u0600\b\u008a\n\u008a\f\u008a\u0603"+
		"\t\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0005\u008b\u0608\b\u008b"+
		"\n\u008b\f\u008b\u060b\t\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0003"+
		"\u008c\u0610\b\u008c\u0001\u008d\u0001\u008d\u0005\u008d\u0614\b\u008d"+
		"\n\u008d\f\u008d\u0617\t\u008d\u0001\u008e\u0001\u008e\u0003\u008e\u061b"+
		"\b\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001"+
		"\u008e\u0001\u008e\u0003\u008e\u0624\b\u008e\u0001\u008f\u0001\u008f\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001"+
		"\u008f\u0003\u008f\u062f\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003"+
		"\u008f\u0634\b\u008f\u0001\u008f\u0003\u008f\u0637\b\u008f\u0001\u0090"+
		"\u0001\u0090\u0001\u0090\u0005\u0090\u063c\b\u0090\n\u0090\f\u0090\u063f"+
		"\t\u0090\u0001\u0091\u0001\u0091\u0001\u0091\u0005\u0091\u0644\b\u0091"+
		"\n\u0091\f\u0091\u0647\t\u0091\u0001\u0092\u0001\u0092\u0001\u0092\u0001"+
		"\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0005\u0092\u0651"+
		"\b\u0092\n\u0092\f\u0092\u0654\t\u0092\u0001\u0092\u0000\u0000\u0093\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0000\u000e\u0002\u0000"+
		"\u0003\u0003\u001c\u001c\u0001\u0000%&\u0001\u0000\')\u0001\u000078\u0001"+
		"\u0000EH\u0001\u0000PQ\u0002\u0000FFY[\u0001\u0000af\u0002\u0000YYii\u0002"+
		"\u0000SShh\u0002\u0000tt}~\u0004\u0000PRvv}~\u0082\u0082\u0001\u0000\u009f"+
		"\u00a0\u0001\u0000\u00a1\u00a4\u06f1\u0000\u012a\u0001\u0000\u0000\u0000"+
		"\u0002\u0131\u0001\u0000\u0000\u0000\u0004\u013b\u0001\u0000\u0000\u0000"+
		"\u0006\u0145\u0001\u0000\u0000\u0000\b\u014a\u0001\u0000\u0000\u0000\n"+
		"\u014c\u0001\u0000\u0000\u0000\f\u0155\u0001\u0000\u0000\u0000\u000e\u015a"+
		"\u0001\u0000\u0000\u0000\u0010\u015c\u0001\u0000\u0000\u0000\u0012\u0162"+
		"\u0001\u0000\u0000\u0000\u0014\u0169\u0001\u0000\u0000\u0000\u0016\u0171"+
		"\u0001\u0000\u0000\u0000\u0018\u0176\u0001\u0000\u0000\u0000\u001a\u017e"+
		"\u0001\u0000\u0000\u0000\u001c\u0187\u0001\u0000\u0000\u0000\u001e\u018b"+
		"\u0001\u0000\u0000\u0000 \u018f\u0001\u0000\u0000\u0000\"\u019a\u0001"+
		"\u0000\u0000\u0000$\u01a4\u0001\u0000\u0000\u0000&\u01aa\u0001\u0000\u0000"+
		"\u0000(\u01b2\u0001\u0000\u0000\u0000*\u01c5\u0001\u0000\u0000\u0000,"+
		"\u01c9\u0001\u0000\u0000\u0000.\u01d5\u0001\u0000\u0000\u00000\u01d7\u0001"+
		"\u0000\u0000\u00002\u01df\u0001\u0000\u0000\u00004\u01e1\u0001\u0000\u0000"+
		"\u00006\u01e9\u0001\u0000\u0000\u00008\u01f4\u0001\u0000\u0000\u0000:"+
		"\u01f6\u0001\u0000\u0000\u0000<\u0208\u0001\u0000\u0000\u0000>\u020a\u0001"+
		"\u0000\u0000\u0000@\u0212\u0001\u0000\u0000\u0000B\u021d\u0001\u0000\u0000"+
		"\u0000D\u021f\u0001\u0000\u0000\u0000F\u0221\u0001\u0000\u0000\u0000H"+
		"\u0233\u0001\u0000\u0000\u0000J\u024e\u0001\u0000\u0000\u0000L\u025b\u0001"+
		"\u0000\u0000\u0000N\u025d\u0001\u0000\u0000\u0000P\u0268\u0001\u0000\u0000"+
		"\u0000R\u0275\u0001\u0000\u0000\u0000T\u0281\u0001\u0000\u0000\u0000V"+
		"\u0295\u0001\u0000\u0000\u0000X\u02a0\u0001\u0000\u0000\u0000Z\u02ab\u0001"+
		"\u0000\u0000\u0000\\\u02d9\u0001\u0000\u0000\u0000^\u02f4\u0001\u0000"+
		"\u0000\u0000`\u0307\u0001\u0000\u0000\u0000b\u0309\u0001\u0000\u0000\u0000"+
		"d\u030b\u0001\u0000\u0000\u0000f\u0317\u0001\u0000\u0000\u0000h\u032c"+
		"\u0001\u0000\u0000\u0000j\u032e\u0001\u0000\u0000\u0000l\u0330\u0001\u0000"+
		"\u0000\u0000n\u0338\u0001\u0000\u0000\u0000p\u033a\u0001\u0000\u0000\u0000"+
		"r\u034d\u0001\u0000\u0000\u0000t\u0350\u0001\u0000\u0000\u0000v\u0358"+
		"\u0001\u0000\u0000\u0000x\u0361\u0001\u0000\u0000\u0000z\u037a\u0001\u0000"+
		"\u0000\u0000|\u037d\u0001\u0000\u0000\u0000~\u0383\u0001\u0000\u0000\u0000"+
		"\u0080\u0387\u0001\u0000\u0000\u0000\u0082\u038a\u0001\u0000\u0000\u0000"+
		"\u0084\u038e\u0001\u0000\u0000\u0000\u0086\u0391\u0001\u0000\u0000\u0000"+
		"\u0088\u039f\u0001\u0000\u0000\u0000\u008a\u03a7\u0001\u0000\u0000\u0000"+
		"\u008c\u03b4\u0001\u0000\u0000\u0000\u008e\u03b8\u0001\u0000\u0000\u0000"+
		"\u0090\u03c2\u0001\u0000\u0000\u0000\u0092\u03c8\u0001\u0000\u0000\u0000"+
		"\u0094\u03ce\u0001\u0000\u0000\u0000\u0096\u03e2\u0001\u0000\u0000\u0000"+
		"\u0098\u03e7\u0001\u0000\u0000\u0000\u009a\u03fe\u0001\u0000\u0000\u0000"+
		"\u009c\u0400\u0001\u0000\u0000\u0000\u009e\u0405\u0001\u0000\u0000\u0000"+
		"\u00a0\u0409\u0001\u0000\u0000\u0000\u00a2\u0420\u0001\u0000\u0000\u0000"+
		"\u00a4\u0422\u0001\u0000\u0000\u0000\u00a6\u0426\u0001\u0000\u0000\u0000"+
		"\u00a8\u042a\u0001\u0000\u0000\u0000\u00aa\u042d\u0001\u0000\u0000\u0000"+
		"\u00ac\u0432\u0001\u0000\u0000\u0000\u00ae\u0437\u0001\u0000\u0000\u0000"+
		"\u00b0\u043c\u0001\u0000\u0000\u0000\u00b2\u0467\u0001\u0000\u0000\u0000"+
		"\u00b4\u0469\u0001\u0000\u0000\u0000\u00b6\u0479\u0001\u0000\u0000\u0000"+
		"\u00b8\u047b\u0001\u0000\u0000\u0000\u00ba\u0493\u0001\u0000\u0000\u0000"+
		"\u00bc\u0495\u0001\u0000\u0000\u0000\u00be\u049e\u0001\u0000\u0000\u0000"+
		"\u00c0\u04a6\u0001\u0000\u0000\u0000\u00c2\u04ae\u0001\u0000\u0000\u0000"+
		"\u00c4\u04b0\u0001\u0000\u0000\u0000\u00c6\u04b4\u0001\u0000\u0000\u0000"+
		"\u00c8\u04bd\u0001\u0000\u0000\u0000\u00ca\u04c6\u0001\u0000\u0000\u0000"+
		"\u00cc\u04ca\u0001\u0000\u0000\u0000\u00ce\u04d8\u0001\u0000\u0000\u0000"+
		"\u00d0\u04da\u0001\u0000\u0000\u0000\u00d2\u04de\u0001\u0000\u0000\u0000"+
		"\u00d4\u04e2\u0001\u0000\u0000\u0000\u00d6\u04ec\u0001\u0000\u0000\u0000"+
		"\u00d8\u04fe\u0001\u0000\u0000\u0000\u00da\u0500\u0001\u0000\u0000\u0000"+
		"\u00dc\u0518\u0001\u0000\u0000\u0000\u00de\u051a\u0001\u0000\u0000\u0000"+
		"\u00e0\u0526\u0001\u0000\u0000\u0000\u00e2\u052d\u0001\u0000\u0000\u0000"+
		"\u00e4\u0535\u0001\u0000\u0000\u0000\u00e6\u053c\u0001\u0000\u0000\u0000"+
		"\u00e8\u0544\u0001\u0000\u0000\u0000\u00ea\u054f\u0001\u0000\u0000\u0000"+
		"\u00ec\u055f\u0001\u0000\u0000\u0000\u00ee\u0561\u0001\u0000\u0000\u0000"+
		"\u00f0\u0571\u0001\u0000\u0000\u0000\u00f2\u0573\u0001\u0000\u0000\u0000"+
		"\u00f4\u057c\u0001\u0000\u0000\u0000\u00f6\u057e\u0001\u0000\u0000\u0000"+
		"\u00f8\u0592\u0001\u0000\u0000\u0000\u00fa\u0594\u0001\u0000\u0000\u0000"+
		"\u00fc\u0598\u0001\u0000\u0000\u0000\u00fe\u05aa\u0001\u0000\u0000\u0000"+
		"\u0100\u05b5\u0001\u0000\u0000\u0000\u0102\u05bd\u0001\u0000\u0000\u0000"+
		"\u0104\u05c1\u0001\u0000\u0000\u0000\u0106\u05c9\u0001\u0000\u0000\u0000"+
		"\u0108\u05d1\u0001\u0000\u0000\u0000\u010a\u05d3\u0001\u0000\u0000\u0000"+
		"\u010c\u05db\u0001\u0000\u0000\u0000\u010e\u05e6\u0001\u0000\u0000\u0000"+
		"\u0110\u05e8\u0001\u0000\u0000\u0000\u0112\u05fa\u0001\u0000\u0000\u0000"+
		"\u0114\u05fc\u0001\u0000\u0000\u0000\u0116\u0604\u0001\u0000\u0000\u0000"+
		"\u0118\u060f\u0001\u0000\u0000\u0000\u011a\u0611\u0001\u0000\u0000\u0000"+
		"\u011c\u0623\u0001\u0000\u0000\u0000\u011e\u0636\u0001\u0000\u0000\u0000"+
		"\u0120\u0638\u0001\u0000\u0000\u0000\u0122\u0640\u0001\u0000\u0000\u0000"+
		"\u0124\u0648\u0001\u0000\u0000\u0000\u0126\u0129\u0003\u0002\u0001\u0000"+
		"\u0127\u0129\u0005\u0003\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0005\u0000\u0000\u0001\u012e\u0001\u0001\u0000\u0000\u0000"+
		"\u012f\u0132\u0003\b\u0004\u0000\u0130\u0132\u0003\u0004\u0002\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u0003\u0001\u0000\u0000\u0000\u0133\u0138\u0003\u0006\u0003\u0000\u0134"+
		"\u0135\u0005\u001c\u0000\u0000\u0135\u0137\u0003\u0006\u0003\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b"+
		"\u0133\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0007\u0000\u0000\u0000\u013e"+
		"\u0005\u0001\u0000\u0000\u0000\u013f\u0146\u0001\u0000\u0000\u0000\u0140"+
		"\u0146\u0003\u000e\u0007\u0000\u0141\u0146\u0003*\u0015\u0000\u0142\u0146"+
		"\u0003\u001a\r\u0000\u0143\u0146\u0003>\u001f\u0000\u0144\u0146\u0003"+
		",\u0016\u0000\u0145\u013f\u0001\u0000\u0000\u0000\u0145\u0140\u0001\u0000"+
		"\u0000\u0000\u0145\u0141\u0001\u0000\u0000\u0000\u0145\u0142\u0001\u0000"+
		"\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0007\u0001\u0000\u0000\u0000\u0147\u014b\u0003(\u0014"+
		"\u0000\u0148\u014b\u0003\"\u0011\u0000\u0149\u014b\u0003\u001c\u000e\u0000"+
		"\u014a\u0147\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014a\u0149\u0001\u0000\u0000\u0000\u014b\t\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u00054\u0000\u0000\u014d\u014e\u0006\u0005\uffff\uffff\u0000\u014e"+
		"\u000b\u0001\u0000\u0000\u0000\u014f\u0154\u0003V+\u0000\u0150\u0154\u0003"+
		"\u00f6{\u0000\u0151\u0154\u0003\u0102\u0081\u0000\u0152\u0154\u00055\u0000"+
		"\u0000\u0153\u014f\u0001\u0000\u0000\u0000\u0153\u0150\u0001\u0000\u0000"+
		"\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000"+
		"\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\r\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015b\u0003\u0010\b\u0000\u0159"+
		"\u015b\u0003\u0012\t\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u0159"+
		"\u0001\u0000\u0000\u0000\u015b\u000f\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0005\t\u0000\u0000\u015d\u0160\u0003\u0018\f\u0000\u015e\u015f\u0005"+
		"\n\u0000\u0000\u015f\u0161\u00051\u0000\u0000\u0160\u015e\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0011\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0005\b\u0000\u0000\u0163\u0164\u0003\u0018\f"+
		"\u0000\u0164\u0167\u0005\t\u0000\u0000\u0165\u0168\u0005\'\u0000\u0000"+
		"\u0166\u0168\u0003\u0014\n\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0166\u0001\u0000\u0000\u0000\u0168\u0013\u0001\u0000\u0000\u0000\u0169"+
		"\u016e\u0003\u0016\u000b\u0000\u016a\u016b\u0005\u001d\u0000\u0000\u016b"+
		"\u016d\u0003\u0016\u000b\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d"+
		"\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016f\u0015\u0001\u0000\u0000\u0000\u0170"+
		"\u016e\u0001\u0000\u0000\u0000\u0171\u0174\u00051\u0000\u0000\u0172\u0173"+
		"\u0005\n\u0000\u0000\u0173\u0175\u00051\u0000\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0017\u0001"+
		"\u0000\u0000\u0000\u0176\u017b\u00051\u0000\u0000\u0177\u0178\u00050\u0000"+
		"\u0000\u0178\u017a\u00051\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u0019\u0001\u0000\u0000\u0000"+
		"\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u0010\u0000\u0000"+
		"\u017f\u0184\u00051\u0000\u0000\u0180\u0181\u0005\u001d\u0000\u0000\u0181"+
		"\u0183\u00051\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0186"+
		"\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0001\u0000\u0000\u0000\u0185\u001b\u0001\u0000\u0000\u0000\u0186\u0184"+
		"\u0001\u0000\u0000\u0000\u0187\u0188\u0003\u001e\u000f\u0000\u0188\u0189"+
		"\u0003\"\u0011\u0000\u0189\u001d\u0001\u0000\u0000\u0000\u018a\u018c\u0003"+
		" \u0010\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000"+
		"\u0000\u0000\u018e\u001f\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u001a"+
		"\u0000\u0000\u0190\u0196\u0003\u0018\f\u0000\u0191\u0193\u0005*\u0000"+
		"\u0000\u0192\u0194\u0003R)\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195"+
		"\u0197\u0005+\u0000\u0000\u0196\u0191\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0005\u0003\u0000\u0000\u0199!\u0001\u0000\u0000\u0000\u019a\u019b\u0005"+
		"\u0006\u0000\u0000\u019b\u019c\u00051\u0000\u0000\u019c\u019f\u0003$\u0012"+
		"\u0000\u019d\u019e\u0005\u0019\u0000\u0000\u019e\u01a0\u00032\u0019\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u001b\u0000\u0000"+
		"\u01a2\u01a3\u0003.\u0017\u0000\u01a3#\u0001\u0000\u0000\u0000\u01a4\u01a6"+
		"\u0005*\u0000\u0000\u01a5\u01a7\u0003&\u0013\u0000\u01a6\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0005+\u0000\u0000\u01a9%\u0001\u0000\u0000\u0000"+
		"\u01aa\u01af\u00051\u0000\u0000\u01ab\u01ac\u0005\u001d\u0000\u0000\u01ac"+
		"\u01ae\u00051\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b1"+
		"\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b0\'\u0001\u0000\u0000\u0000\u01b1\u01af\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0005\u000b\u0000\u0000\u01b3\u01b4\u0003"+
		"2\u0019\u0000\u01b4\u01b5\u0005\u001b\u0000\u0000\u01b5\u01bd\u0003.\u0017"+
		"\u0000\u01b6\u01b7\u0005\f\u0000\u0000\u01b7\u01b8\u00032\u0019\u0000"+
		"\u01b8\u01b9\u0005\u001b\u0000\u0000\u01b9\u01ba\u0003.\u0017\u0000\u01ba"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b6\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0001\u0000\u0000\u0000\u01be\u01c3\u0001\u0000\u0000\u0000\u01bf"+
		"\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005\r\u0000\u0000\u01c1\u01c2"+
		"\u0005\u001b\u0000\u0000\u01c2\u01c4\u0003.\u0017\u0000\u01c3\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4)\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c7\u0005\u0007\u0000\u0000\u01c6\u01c8\u00030\u0018"+
		"\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c8+\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003*\u0015\u0000\u01ca"+
		"-\u0001\u0000\u0000\u0000\u01cb\u01d6\u0003\u0004\u0002\u0000\u01cc\u01cd"+
		"\u0005\u0003\u0000\u0000\u01cd\u01cf\u0005\u0001\u0000\u0000\u01ce\u01d0"+
		"\u0003\u0002\u0001\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0005\u0002\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01cb"+
		"\u0001\u0000\u0000\u0000\u01d5\u01cc\u0001\u0000\u0000\u0000\u01d6/\u0001"+
		"\u0000\u0000\u0000\u01d7\u01dc\u00032\u0019\u0000\u01d8\u01d9\u0005\u001d"+
		"\u0000\u0000\u01d9\u01db\u00032\u0019\u0000\u01da\u01d8\u0001\u0000\u0000"+
		"\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd1\u0001\u0000\u0000\u0000"+
		"\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e0\u00034\u001a\u0000\u01e0"+
		"3\u0001\u0000\u0000\u0000\u01e1\u01e6\u00036\u001b\u0000\u01e2\u01e3\u0005"+
		"\u0012\u0000\u0000\u01e3\u01e5\u00036\u001b\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e8\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e75\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ee\u00038\u001c\u0000"+
		"\u01ea\u01eb\u0005\u0011\u0000\u0000\u01eb\u01ed\u00038\u001c\u0000\u01ec"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef"+
		"7\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0005\u0013\u0000\u0000\u01f2\u01f5\u00038\u001c\u0000\u01f3\u01f5\u0003"+
		":\u001d\u0000\u01f4\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f59\u0001\u0000\u0000\u0000\u01f6\u01fc\u0003>\u001f\u0000"+
		"\u01f7\u01f8\u0003<\u001e\u0000\u01f8\u01f9\u0003>\u001f\u0000\u01f9\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fa\u01f7\u0001\u0000\u0000\u0000\u01fb\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fd;\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001"+
		"\u0000\u0000\u0000\u01ff\u0209\u0005\"\u0000\u0000\u0200\u0209\u0005!"+
		"\u0000\u0000\u0201\u0209\u0005\u001f\u0000\u0000\u0202\u0209\u0005 \u0000"+
		"\u0000\u0203\u0209\u0005#\u0000\u0000\u0204\u0209\u0005$\u0000\u0000\u0205"+
		"\u0209\u0005\u000f\u0000\u0000\u0206\u0207\u0005\u0013\u0000\u0000\u0207"+
		"\u0209\u0005\u000f\u0000\u0000\u0208\u01ff\u0001\u0000\u0000\u0000\u0208"+
		"\u0200\u0001\u0000\u0000\u0000\u0208\u0201\u0001\u0000\u0000\u0000\u0208"+
		"\u0202\u0001\u0000\u0000\u0000\u0208\u0203\u0001\u0000\u0000\u0000\u0208"+
		"\u0204\u0001\u0000\u0000\u0000\u0208\u0205\u0001\u0000\u0000\u0000\u0208"+
		"\u0206\u0001\u0000\u0000\u0000\u0209=\u0001\u0000\u0000\u0000\u020a\u020f"+
		"\u0003@ \u0000\u020b\u020c\u0007\u0001\u0000\u0000\u020c\u020e\u0003@"+
		" \u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000"+
		"\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000"+
		"\u0000\u0210?\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0212\u0217\u0003B!\u0000\u0213\u0214\u0007\u0002\u0000\u0000\u0214\u0216"+
		"\u0003B!\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000"+
		"\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000"+
		"\u0000\u0000\u0218A\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0007\u0001\u0000\u0000\u021b\u021e\u0003B!\u0000\u021c"+
		"\u021e\u0003D\"\u0000\u021d\u021a\u0001\u0000\u0000\u0000\u021d\u021c"+
		"\u0001\u0000\u0000\u0000\u021eC\u0001\u0000\u0000\u0000\u021f\u0220\u0003"+
		"F#\u0000\u0220E\u0001\u0000\u0000\u0000\u0221\u0225\u0003J%\u0000\u0222"+
		"\u0224\u0003H$\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u0227\u0001"+
		"\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001"+
		"\u0000\u0000\u0000\u0226G\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000"+
		"\u0000\u0000\u0228\u022a\u0005*\u0000\u0000\u0229\u022b\u0003R)\u0000"+
		"\u022a\u0229\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000"+
		"\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u0234\u0005+\u0000\u0000\u022d"+
		"\u022e\u0005,\u0000\u0000\u022e\u022f\u00032\u0019\u0000\u022f\u0230\u0005"+
		"-\u0000\u0000\u0230\u0234\u0001\u0000\u0000\u0000\u0231\u0232\u00050\u0000"+
		"\u0000\u0232\u0234\u00051\u0000\u0000\u0233\u0228\u0001\u0000\u0000\u0000"+
		"\u0233\u022d\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000"+
		"\u0234I\u0001\u0000\u0000\u0000\u0235\u024f\u00051\u0000\u0000\u0236\u024f"+
		"\u00052\u0000\u0000\u0237\u0239\u00053\u0000\u0000\u0238\u0237\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u024f\u0001\u0000"+
		"\u0000\u0000\u023c\u024f\u0005\u0016\u0000\u0000\u023d\u024f\u0005\u0014"+
		"\u0000\u0000\u023e\u024f\u0005\u0015\u0000\u0000\u023f\u0241\u0005*\u0000"+
		"\u0000\u0240\u0242\u00032\u0019\u0000\u0241\u0240\u0001\u0000\u0000\u0000"+
		"\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000"+
		"\u0243\u024f\u0005+\u0000\u0000\u0244\u0246\u0005,\u0000\u0000\u0245\u0247"+
		"\u0003L&\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000"+
		"\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024f\u0005-\u0000"+
		"\u0000\u0249\u024b\u0005.\u0000\u0000\u024a\u024c\u0003P(\u0000\u024b"+
		"\u024a\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0001\u0000\u0000\u0000\u024d\u024f\u0005/\u0000\u0000\u024e\u0235"+
		"\u0001\u0000\u0000\u0000\u024e\u0236\u0001\u0000\u0000\u0000\u024e\u0238"+
		"\u0001\u0000\u0000\u0000\u024e\u023c\u0001\u0000\u0000\u0000\u024e\u023d"+
		"\u0001\u0000\u0000\u0000\u024e\u023e\u0001\u0000\u0000\u0000\u024e\u023f"+
		"\u0001\u0000\u0000\u0000\u024e\u0244\u0001\u0000\u0000\u0000\u024e\u0249"+
		"\u0001\u0000\u0000\u0000\u024fK\u0001\u0000\u0000\u0000\u0250\u0251\u0003"+
		"2\u0019\u0000\u0251\u0252\u0003N\'\u0000\u0252\u025c\u0001\u0000\u0000"+
		"\u0000\u0253\u0258\u00032\u0019\u0000\u0254\u0255\u0005\u001d\u0000\u0000"+
		"\u0255\u0257\u00032\u0019\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257"+
		"\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000\u0000\u025a"+
		"\u0258\u0001\u0000\u0000\u0000\u025b\u0250\u0001\u0000\u0000\u0000\u025b"+
		"\u0253\u0001\u0000\u0000\u0000\u025cM\u0001\u0000\u0000\u0000\u025d\u025e"+
		"\u0005\u000e\u0000\u0000\u025e\u025f\u00032\u0019\u0000\u025f\u0260\u0005"+
		"\u000f\u0000\u0000\u0260\u0265\u00032\u0019\u0000\u0261\u0262\u0005\u000b"+
		"\u0000\u0000\u0262\u0264\u00032\u0019\u0000\u0263\u0261\u0001\u0000\u0000"+
		"\u0000\u0264\u0267\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000"+
		"\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266O\u0001\u0000\u0000\u0000"+
		"\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u0269\u00032\u0019\u0000\u0269"+
		"\u026a\u0005\u001b\u0000\u0000\u026a\u0272\u00032\u0019\u0000\u026b\u026c"+
		"\u0005\u001d\u0000\u0000\u026c\u026d\u00032\u0019\u0000\u026d\u026e\u0005"+
		"\u001b\u0000\u0000\u026e\u026f\u00032\u0019\u0000\u026f\u0271\u0001\u0000"+
		"\u0000\u0000\u0270\u026b\u0001\u0000\u0000\u0000\u0271\u0274\u0001\u0000"+
		"\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000"+
		"\u0000\u0000\u0273Q\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000"+
		"\u0000\u0275\u027a\u0003T*\u0000\u0276\u0277\u0005\u001d\u0000\u0000\u0277"+
		"\u0279\u0003T*\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027c\u0001"+
		"\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001"+
		"\u0000\u0000\u0000\u027bS\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000"+
		"\u0000\u0000\u027d\u0282\u00032\u0019\u0000\u027e\u027f\u00051\u0000\u0000"+
		"\u027f\u0280\u0005\u001e\u0000\u0000\u0280\u0282\u00032\u0019\u0000\u0281"+
		"\u027d\u0001\u0000\u0000\u0000\u0281\u027e\u0001\u0000\u0000\u0000\u0282"+
		"U\u0001\u0000\u0000\u0000\u0283\u0287\u00056\u0000\u0000\u0284\u0286\u0003"+
		"X,\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000"+
		"\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000"+
		"\u0000\u0288\u028a\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000"+
		"\u0000\u028a\u0296\u0007\u0003\u0000\u0000\u028b\u028c\u00059\u0000\u0000"+
		"\u028c\u0296\u0005:\u0000\u0000\u028d\u028e\u0005;\u0000\u0000\u028e\u028f"+
		"\u0003Z-\u0000\u028f\u0290\u0005<\u0000\u0000\u0290\u0296\u0001\u0000"+
		"\u0000\u0000\u0291\u0296\u0005=\u0000\u0000\u0292\u0296\u0005>\u0000\u0000"+
		"\u0293\u0296\u0005?\u0000\u0000\u0294\u0296\u0005@\u0000\u0000\u0295\u0283"+
		"\u0001\u0000\u0000\u0000\u0295\u028b\u0001\u0000\u0000\u0000\u0295\u028d"+
		"\u0001\u0000\u0000\u0000\u0295\u0291\u0001\u0000\u0000\u0000\u0295\u0292"+
		"\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0294"+
		"\u0001\u0000\u0000\u0000\u0296W\u0001\u0000\u0000\u0000\u0297\u029a\u0005"+
		"A\u0000\u0000\u0298\u0299\u0005B\u0000\u0000\u0299\u029b\u0005C\u0000"+
		"\u0000\u029a\u0298\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000"+
		"\u0000\u029b\u02a1\u0001\u0000\u0000\u0000\u029c\u02a1\u0003\u0102\u0081"+
		"\u0000\u029d\u02a1\u0003\u00f6{\u0000\u029e\u02a1\u0005D\u0000\u0000\u029f"+
		"\u02a1\u0005B\u0000\u0000\u02a0\u0297\u0001\u0000\u0000\u0000\u02a0\u029c"+
		"\u0001\u0000\u0000\u0000\u02a0\u029d\u0001\u0000\u0000\u0000\u02a0\u029e"+
		"\u0001\u0000\u0000\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1Y\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a6\u0003\\.\u0000\u02a3\u02a5\u0007\u0004"+
		"\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a8\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000"+
		"\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a9\u02a2\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000"+
		"\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02b7\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000"+
		"\u0000\u0000\u02ae\u02b2\u0003^/\u0000\u02af\u02b1\u0007\u0004\u0000\u0000"+
		"\u02b0\u02af\u0001\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b5\u02ae\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000"+
		"\u02b8\u02c3\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000"+
		"\u02ba\u02be\u0003`0\u0000\u02bb\u02bd\u0007\u0004\u0000\u0000\u02bc\u02bb"+
		"\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000\u0000\u02be\u02bc"+
		"\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c1\u02ba"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c5\u0001\u0000\u0000\u0000\u02c3\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02cf"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6\u02ca"+
		"\u0003\u00ba]\u0000\u02c7\u02c9\u0007\u0004\u0000\u0000\u02c8\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb\u02ce\u0001"+
		"\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02c6\u0001"+
		"\u0000\u0000\u0000\u02ce\u02d1\u0001\u0000\u0000\u0000\u02cf\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d2\u02d3\u0005"+
		"\u0000\u0000\u0001\u02d3[\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005I\u0000"+
		"\u0000\u02d5\u02d6\u0005J\u0000\u0000\u02d6\u02da\u0005K\u0000\u0000\u02d7"+
		"\u02d8\u0005I\u0000\u0000\u02d8\u02da\u0005J\u0000\u0000\u02d9\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02da]\u0001\u0000"+
		"\u0000\u0000\u02db\u02de\u0005L\u0000\u0000\u02dc\u02df\u0005J\u0000\u0000"+
		"\u02dd\u02df\u0003\u00ceg\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de"+
		"\u02dd\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e1\u0003f3\u0000\u02e1\u02e2\u0005K\u0000\u0000\u02e2\u02f5\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e6\u0005L\u0000\u0000\u02e4\u02e7\u0005J\u0000"+
		"\u0000\u02e5\u02e7\u0003\u00ceg\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e8\u02f5\u0005K\u0000\u0000\u02e9\u02ec\u0005L\u0000\u0000\u02ea\u02ed"+
		"\u0005J\u0000\u0000\u02eb\u02ed\u0003\u00ceg\u0000\u02ec\u02ea\u0001\u0000"+
		"\u0000\u0000\u02ec\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ee\u02f5\u0003f3\u0000\u02ef\u02f2\u0005L\u0000\u0000"+
		"\u02f0\u02f3\u0005J\u0000\u0000\u02f1\u02f3\u0003\u00ceg\u0000\u02f2\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f4\u02db\u0001\u0000\u0000\u0000\u02f4\u02e3"+
		"\u0001\u0000\u0000\u0000\u02f4\u02e9\u0001\u0000\u0000\u0000\u02f4\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f5_\u0001\u0000\u0000\u0000\u02f6\u02f8\u0005"+
		"M\u0000\u0000\u02f7\u02f9\u0003b1\u0000\u02f8\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fd\u0005J\u0000\u0000\u02fb\u02fd\u0003\u00ceg\u0000\u02fc"+
		"\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fe\u0001\u0000\u0000\u0000\u02fe\u0308\u0005K\u0000\u0000\u02ff\u0301"+
		"\u0005M\u0000\u0000\u0300\u0302\u0003b1\u0000\u0301\u0300\u0001\u0000"+
		"\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0305\u0001\u0000"+
		"\u0000\u0000\u0303\u0306\u0005J\u0000\u0000\u0304\u0306\u0003\u00ceg\u0000"+
		"\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0304\u0001\u0000\u0000\u0000"+
		"\u0306\u0308\u0001\u0000\u0000\u0000\u0307\u02f6\u0001\u0000\u0000\u0000"+
		"\u0307\u02ff\u0001\u0000\u0000\u0000\u0308a\u0001\u0000\u0000\u0000\u0309"+
		"\u030a\u0003\u00f4z\u0000\u030ac\u0001\u0000\u0000\u0000\u030b\u030c\u0005"+
		"N\u0000\u0000\u030c\u030d\u0003f3\u0000\u030d\u030e\u0003\u00bc^\u0000"+
		"\u030ee\u0001\u0000\u0000\u0000\u030f\u0314\u0003h4\u0000\u0310\u0311"+
		"\u0005O\u0000\u0000\u0311\u0313\u0003h4\u0000\u0312\u0310\u0001\u0000"+
		"\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0318\u0001\u0000"+
		"\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317\u030f\u0001\u0000"+
		"\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318g\u0001\u0000\u0000"+
		"\u0000\u0319\u031b\u0007\u0005\u0000\u0000\u031a\u0319\u0001\u0000\u0000"+
		"\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000"+
		"\u0000\u031c\u0321\u0003j5\u0000\u031d\u031e\u0005R\u0000\u0000\u031e"+
		"\u0320\u0003l6\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u0320\u0323\u0001"+
		"\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0321\u0322\u0001"+
		"\u0000\u0000\u0000\u0322\u032d\u0001\u0000\u0000\u0000\u0323\u0321\u0001"+
		"\u0000\u0000\u0000\u0324\u0329\u0003l6\u0000\u0325\u0326\u0005R\u0000"+
		"\u0000\u0326\u0328\u0003l6\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0328"+
		"\u032b\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329"+
		"\u032a\u0001\u0000\u0000\u0000\u032a\u032d\u0001\u0000\u0000\u0000\u032b"+
		"\u0329\u0001\u0000\u0000\u0000\u032c\u031a\u0001\u0000\u0000\u0000\u032c"+
		"\u0324\u0001\u0000\u0000\u0000\u032di\u0001\u0000\u0000\u0000\u032e\u032f"+
		"\u0003\u00f4z\u0000\u032fk\u0001\u0000\u0000\u0000\u0330\u0331\u0005S"+
		"\u0000\u0000\u0331\u0334\u0003n7\u0000\u0332\u0333\u0005T\u0000\u0000"+
		"\u0333\u0335\u0003\u00a0P\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0334"+
		"\u0335\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336"+
		"\u0337\u0005U\u0000\u0000\u0337m\u0001\u0000\u0000\u0000\u0338\u0339\u0003"+
		"\u00f4z\u0000\u0339o\u0001\u0000\u0000\u0000\u033a\u033c\u0005V\u0000"+
		"\u0000\u033b\u033d\u0003r9\u0000\u033c\u033b\u0001\u0000\u0000\u0000\u033c"+
		"\u033d\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e"+
		"\u0340\u0005W\u0000\u0000\u033f\u0341\u0003\u009aM\u0000\u0340\u033f\u0001"+
		"\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0348\u0001"+
		"\u0000\u0000\u0000\u0342\u0344\u0005K\u0000\u0000\u0343\u0345\u0003\u009a"+
		"M\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000"+
		"\u0000\u0345\u0347\u0001\u0000\u0000\u0000\u0346\u0342\u0001\u0000\u0000"+
		"\u0000\u0347\u034a\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000\u0000"+
		"\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034b\u0001\u0000\u0000"+
		"\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034b\u034c\u0005X\u0000\u0000"+
		"\u034cq\u0001\u0000\u0000\u0000\u034d\u034e\u0005T\u0000\u0000\u034e\u034f"+
		"\u0003\u00f4z\u0000\u034fs\u0001\u0000\u0000\u0000\u0350\u0355\u0003v"+
		";\u0000\u0351\u0352\u0005O\u0000\u0000\u0352\u0354\u0003v;\u0000\u0353"+
		"\u0351\u0001\u0000\u0000\u0000\u0354\u0357\u0001\u0000\u0000\u0000\u0355"+
		"\u0353\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356"+
		"u\u0001\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0358\u035e"+
		"\u0003z=\u0000\u0359\u035a\u0003x<\u0000\u035a\u035b\u0003z=\u0000\u035b"+
		"\u035d\u0001\u0000\u0000\u0000\u035c\u0359\u0001\u0000\u0000\u0000\u035d"+
		"\u0360\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035e"+
		"\u035f\u0001\u0000\u0000\u0000\u035fw\u0001\u0000\u0000\u0000\u0360\u035e"+
		"\u0001\u0000\u0000\u0000\u0361\u0362\u0007\u0006\u0000\u0000\u0362y\u0001"+
		"\u0000\u0000\u0000\u0363\u0366\u0003|>\u0000\u0364\u0366\u0003\u0082A"+
		"\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0365\u0364\u0001\u0000\u0000"+
		"\u0000\u0366\u036e\u0001\u0000\u0000\u0000\u0367\u036d\u0005\\\u0000\u0000"+
		"\u0368\u036d\u0003\u0084B\u0000\u0369\u036d\u0003\u0086C\u0000\u036a\u036d"+
		"\u0003\u0088D\u0000\u036b\u036d\u0003\u008eG\u0000\u036c\u0367\u0001\u0000"+
		"\u0000\u0000\u036c\u0368\u0001\u0000\u0000\u0000\u036c\u0369\u0001\u0000"+
		"\u0000\u0000\u036c\u036a\u0001\u0000\u0000\u0000\u036c\u036b\u0001\u0000"+
		"\u0000\u0000\u036d\u0370\u0001\u0000\u0000\u0000\u036e\u036c\u0001\u0000"+
		"\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u037b\u0001\u0000"+
		"\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0371\u0377\u0005\\\u0000"+
		"\u0000\u0372\u0377\u0003\u0084B\u0000\u0373\u0377\u0003\u0086C\u0000\u0374"+
		"\u0377\u0003\u0088D\u0000\u0375\u0377\u0003\u008eG\u0000\u0376\u0371\u0001"+
		"\u0000\u0000\u0000\u0376\u0372\u0001\u0000\u0000\u0000\u0376\u0373\u0001"+
		"\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0376\u0375\u0001"+
		"\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u0376\u0001"+
		"\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037b\u0001"+
		"\u0000\u0000\u0000\u037a\u0365\u0001\u0000\u0000\u0000\u037a\u0376\u0001"+
		"\u0000\u0000\u0000\u037b{\u0001\u0000\u0000\u0000\u037c\u037e\u0003~?"+
		"\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000"+
		"\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0380\u0003\u0080@\u0000"+
		"\u0380}\u0001\u0000\u0000\u0000\u0381\u0384\u0003\u00f4z\u0000\u0382\u0384"+
		"\u0005]\u0000\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383\u0382\u0001"+
		"\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0385\u0001"+
		"\u0000\u0000\u0000\u0385\u0386\u0005^\u0000\u0000\u0386\u007f\u0001\u0000"+
		"\u0000\u0000\u0387\u0388\u0003\u00f4z\u0000\u0388\u0081\u0001\u0000\u0000"+
		"\u0000\u0389\u038b\u0003~?\u0000\u038a\u0389\u0001\u0000\u0000\u0000\u038a"+
		"\u038b\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c"+
		"\u038d\u0005]\u0000\u0000\u038d\u0083\u0001\u0000\u0000\u0000\u038e\u038f"+
		"\u0005_\u0000\u0000\u038f\u0390\u0003\u00f4z\u0000\u0390\u0085\u0001\u0000"+
		"\u0000\u0000\u0391\u0393\u0005`\u0000\u0000\u0392\u0394\u0003~?\u0000"+
		"\u0393\u0392\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000"+
		"\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u039b\u0003\u00f4z\u0000\u0396"+
		"\u0399\u0007\u0007\u0000\u0000\u0397\u039a\u0003\u00f4z\u0000\u0398\u039a"+
		"\u0005J\u0000\u0000\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u0398\u0001"+
		"\u0000\u0000\u0000\u039a\u039c\u0001\u0000\u0000\u0000\u039b\u0396\u0001"+
		"\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u039d\u0001"+
		"\u0000\u0000\u0000\u039d\u039e\u0005g\u0000\u0000\u039e\u0087\u0001\u0000"+
		"\u0000\u0000\u039f\u03a1\u0005T\u0000\u0000\u03a0\u03a2\u0005T\u0000\u0000"+
		"\u03a1\u03a0\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a5\u0001\u0000\u0000\u0000\u03a3\u03a6\u0003\u00f4z\u0000\u03a4"+
		"\u03a6\u0003\u008aE\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a5\u03a4"+
		"\u0001\u0000\u0000\u0000\u03a6\u0089\u0001\u0000\u0000\u0000\u03a7\u03a8"+
		"\u0005h\u0000\u0000\u03a8\u03a9\u0003\u008cF\u0000\u03a9\u03aa\u0005U"+
		"\u0000\u0000\u03aa\u008b\u0001\u0000\u0000\u0000\u03ab\u03b3\u0005Y\u0000"+
		"\u0000\u03ac\u03b3\u0005i\u0000\u0000\u03ad\u03b3\u0005j\u0000\u0000\u03ae"+
		"\u03b3\u0005k\u0000\u0000\u03af\u03b3\u0005l\u0000\u0000\u03b0\u03b3\u0005"+
		"J\u0000\u0000\u03b1\u03b3\u0003\u00f4z\u0000\u03b2\u03ab\u0001\u0000\u0000"+
		"\u0000\u03b2\u03ac\u0001\u0000\u0000\u0000\u03b2\u03ad\u0001\u0000\u0000"+
		"\u0000\u03b2\u03ae\u0001\u0000\u0000\u0000\u03b2\u03af\u0001\u0000\u0000"+
		"\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000"+
		"\u0000\u03b3\u03b5\u0001\u0000\u0000\u0000\u03b4\u03b2\u0001\u0000\u0000"+
		"\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u008d\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b9\u0005m\u0000\u0000\u03b9\u03ba\u0003\u0090H\u0000\u03ba"+
		"\u03bb\u0005U\u0000\u0000\u03bb\u008f\u0001\u0000\u0000\u0000\u03bc\u03c3"+
		"\u0003|>\u0000\u03bd\u03c3\u0003\u0082A\u0000\u03be\u03c3\u0005\\\u0000"+
		"\u0000\u03bf\u03c3\u0003\u0084B\u0000\u03c0\u03c3\u0003\u0086C\u0000\u03c1"+
		"\u03c3\u0003\u0088D\u0000\u03c2\u03bc\u0001\u0000\u0000\u0000\u03c2\u03bd"+
		"\u0001\u0000\u0000\u0000\u03c2\u03be\u0001\u0000\u0000\u0000\u03c2\u03bf"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c1"+
		"\u0001\u0000\u0000\u0000\u03c3\u0091\u0001\u0000\u0000\u0000\u03c4\u03c9"+
		"\u0005n\u0000\u0000\u03c5\u03c9\u0005O\u0000\u0000\u03c6\u03c9\u0005F"+
		"\u0000\u0000\u03c7\u03c9\u0005d\u0000\u0000\u03c8\u03c4\u0001\u0000\u0000"+
		"\u0000\u03c8\u03c5\u0001\u0000\u0000\u0000\u03c8\u03c6\u0001\u0000\u0000"+
		"\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c9\u0093\u0001\u0000\u0000"+
		"\u0000\u03ca\u03cf\u0003\u00f4z\u0000\u03cb\u03cf\u0005o\u0000\u0000\u03cc"+
		"\u03cd\u0005]\u0000\u0000\u03cd\u03cf\u0003\u00f4z\u0000\u03ce\u03ca\u0001"+
		"\u0000\u0000\u0000\u03ce\u03cb\u0001\u0000\u0000\u0000\u03ce\u03cc\u0001"+
		"\u0000\u0000\u0000\u03cf\u0095\u0001\u0000\u0000\u0000\u03d0\u03d1\u0003"+
		"t:\u0000\u03d1\u03d3\u0005W\u0000\u0000\u03d2\u03d4\u0003\u0098L\u0000"+
		"\u03d3\u03d2\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000"+
		"\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d6\u0005X\u0000\u0000\u03d6"+
		"\u03e3\u0001\u0000\u0000\u0000\u03d7\u03d9\u0003\u00b2Y\u0000\u03d8\u03d7"+
		"\u0001\u0000\u0000\u0000\u03d9\u03dc\u0001\u0000\u0000\u0000\u03da\u03d8"+
		"\u0001\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dd"+
		"\u0001\u0000\u0000\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dd\u03df"+
		"\u0005W\u0000\u0000\u03de\u03e0\u0003\u0098L\u0000\u03df\u03de\u0001\u0000"+
		"\u0000\u0000\u03df\u03e0\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000"+
		"\u0000\u0000\u03e1\u03e3\u0005X\u0000\u0000\u03e2\u03d0\u0001\u0000\u0000"+
		"\u0000\u03e2\u03da\u0001\u0000\u0000\u0000\u03e3\u0097\u0001\u0000\u0000"+
		"\u0000\u03e4\u03e6\u0005K\u0000\u0000\u03e5\u03e4\u0001\u0000\u0000\u0000"+
		"\u03e6\u03e9\u0001\u0000\u0000\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03ea\u0001\u0000\u0000\u0000"+
		"\u03e9\u03e7\u0001\u0000\u0000\u0000\u03ea\u03f1\u0003\u009aM\u0000\u03eb"+
		"\u03ed\u0005K\u0000\u0000\u03ec\u03ee\u0003\u009aM\u0000\u03ed\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03f0\u0001"+
		"\u0000\u0000\u0000\u03ef\u03eb\u0001\u0000\u0000\u0000\u03f0\u03f3\u0001"+
		"\u0000\u0000\u0000\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001"+
		"\u0000\u0000\u0000\u03f2\u0099\u0001\u0000\u0000\u0000\u03f3\u03f1\u0001"+
		"\u0000\u0000\u0000\u03f4\u03f5\u0003\u0094J\u0000\u03f5\u03f6\u0005T\u0000"+
		"\u0000\u03f6\u03f8\u0003\u00a0P\u0000\u03f7\u03f9\u0003\u009cN\u0000\u03f8"+
		"\u03f7\u0001\u0000\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9"+
		"\u03ff\u0001\u0000\u0000\u0000\u03fa\u03fb\u0003\u0094J\u0000\u03fb\u03fc"+
		"\u0005T\u0000\u0000\u03fc\u03fd\u0003\u009eO\u0000\u03fd\u03ff\u0001\u0000"+
		"\u0000\u0000\u03fe\u03f4\u0001\u0000\u0000\u0000\u03fe\u03fa\u0001\u0000"+
		"\u0000\u0000\u03ff\u009b\u0001\u0000\u0000\u0000\u0400\u0401\u0005p\u0000"+
		"\u0000\u0401\u009d\u0001\u0000\u0000\u0000\u0402\u0406\u0003\u00b2Y\u0000"+
		"\u0403\u0406\u0003\u00b8\\\u0000\u0404\u0406\u0005q\u0000\u0000\u0405"+
		"\u0402\u0001\u0000\u0000\u0000\u0405\u0403\u0001\u0000\u0000\u0000\u0405"+
		"\u0404\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407"+
		"\u0405\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408"+
		"\u009f\u0001\u0000\u0000\u0000\u0409\u0410\u0003\u00a2Q\u0000\u040a\u040c"+
		"\u0003\u0092I\u0000\u040b\u040a\u0001\u0000\u0000\u0000\u040b\u040c\u0001"+
		"\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000\u0000\u040d\u040f\u0003"+
		"\u00a2Q\u0000\u040e\u040b\u0001\u0000\u0000\u0000\u040f\u0412\u0001\u0000"+
		"\u0000\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000"+
		"\u0000\u0000\u0411\u00a1\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000"+
		"\u0000\u0000\u0413\u0421\u0003\u00aaU\u0000\u0414\u0421\u0003\u00acV\u0000"+
		"\u0415\u0421\u0003\u00aeW\u0000\u0416\u0421\u0005J\u0000\u0000\u0417\u0421"+
		"\u0005r\u0000\u0000\u0418\u0421\u0003\u00f4z\u0000\u0419\u0421\u0003\u00d0"+
		"h\u0000\u041a\u0421\u0003\u00ceg\u0000\u041b\u0421\u0003\u00a8T\u0000"+
		"\u041c\u0421\u0003\u00d2i\u0000\u041d\u0421\u0003\u00a4R\u0000\u041e\u0421"+
		"\u0003\u00b0X\u0000\u041f\u0421\u0003\u00a6S\u0000\u0420\u0413\u0001\u0000"+
		"\u0000\u0000\u0420\u0414\u0001\u0000\u0000\u0000\u0420\u0415\u0001\u0000"+
		"\u0000\u0000\u0420\u0416\u0001\u0000\u0000\u0000\u0420\u0417\u0001\u0000"+
		"\u0000\u0000\u0420\u0418\u0001\u0000\u0000\u0000\u0420\u0419\u0001\u0000"+
		"\u0000\u0000\u0420\u041a\u0001\u0000\u0000\u0000\u0420\u041b\u0001\u0000"+
		"\u0000\u0000\u0420\u041c\u0001\u0000\u0000\u0000\u0420\u041d\u0001\u0000"+
		"\u0000\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0420\u041f\u0001\u0000"+
		"\u0000\u0000\u0421\u00a3\u0001\u0000\u0000\u0000\u0422\u0423\u0005h\u0000"+
		"\u0000\u0423\u0424\u0003\u00a0P\u0000\u0424\u0425\u0005U\u0000\u0000\u0425"+
		"\u00a5\u0001\u0000\u0000\u0000\u0426\u0427\u0005s\u0000\u0000\u0427\u0428"+
		"\u0003\u00a0P\u0000\u0428\u0429\u0005U\u0000\u0000\u0429\u00a7\u0001\u0000"+
		"\u0000\u0000\u042a\u042b\u0005\\\u0000\u0000\u042b\u00a9\u0001\u0000\u0000"+
		"\u0000\u042c\u042e\u0007\b\u0000\u0000\u042d\u042c\u0001\u0000\u0000\u0000"+
		"\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000"+
		"\u042f\u0430\u0005l\u0000\u0000\u0430\u00ab\u0001\u0000\u0000\u0000\u0431"+
		"\u0433\u0007\b\u0000\u0000\u0432\u0431\u0001\u0000\u0000\u0000\u0432\u0433"+
		"\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u0435"+
		"\u0005t\u0000\u0000\u0435\u00ad\u0001\u0000\u0000\u0000\u0436\u0438\u0007"+
		"\b\u0000\u0000\u0437\u0436\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000"+
		"\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u043a\u0005j\u0000"+
		"\u0000\u043a\u00af\u0001\u0000\u0000\u0000\u043b\u043d\u0007\b\u0000\u0000"+
		"\u043c\u043b\u0001\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000"+
		"\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u043f\u0005k\u0000\u0000\u043f"+
		"\u00b1\u0001\u0000\u0000\u0000\u0440\u0468\u0003\u00f4z\u0000\u0441\u0468"+
		"\u0003\u00aaU\u0000\u0442\u0468\u0003\u00acV\u0000\u0443\u0468\u0003\u00ae"+
		"W\u0000\u0444\u0468\u0003\u00b0X\u0000\u0445\u0468\u0005J\u0000\u0000"+
		"\u0446\u0468\u0003\u00ceg\u0000\u0447\u0468\u0005\\\u0000\u0000\u0448"+
		"\u0468\u0005r\u0000\u0000\u0449\u0468\u0005e\u0000\u0000\u044a\u0468\u0005"+
		"f\u0000\u0000\u044b\u0468\u0005T\u0000\u0000\u044c\u0451\u0005h\u0000"+
		"\u0000\u044d\u0450\u0003\u00b2Y\u0000\u044e\u0450\u0003\u00b6[\u0000\u044f"+
		"\u044d\u0001\u0000\u0000\u0000\u044f\u044e\u0001\u0000\u0000\u0000\u0450"+
		"\u0453\u0001\u0000\u0000\u0000\u0451\u044f\u0001\u0000\u0000\u0000\u0451"+
		"\u0452\u0001\u0000\u0000\u0000\u0452\u0454\u0001\u0000\u0000\u0000\u0453"+
		"\u0451\u0001\u0000\u0000\u0000\u0454\u0468\u0005U\u0000\u0000\u0455\u045a"+
		"\u0005S\u0000\u0000\u0456\u0459\u0003\u00b2Y\u0000\u0457\u0459\u0003\u00b6"+
		"[\u0000\u0458\u0456\u0001\u0000\u0000\u0000\u0458\u0457\u0001\u0000\u0000"+
		"\u0000\u0459\u045c\u0001\u0000\u0000\u0000\u045a\u0458\u0001\u0000\u0000"+
		"\u0000\u045a\u045b\u0001\u0000\u0000\u0000\u045b\u045d\u0001\u0000\u0000"+
		"\u0000\u045c\u045a\u0001\u0000\u0000\u0000\u045d\u0468\u0005U\u0000\u0000"+
		"\u045e\u0463\u0005`\u0000\u0000\u045f\u0462\u0003\u00b2Y\u0000\u0460\u0462"+
		"\u0003\u00b6[\u0000\u0461\u045f\u0001\u0000\u0000\u0000\u0461\u0460\u0001"+
		"\u0000\u0000\u0000\u0462\u0465\u0001\u0000\u0000\u0000\u0463\u0461\u0001"+
		"\u0000\u0000\u0000\u0463\u0464\u0001\u0000\u0000\u0000\u0464\u0466\u0001"+
		"\u0000\u0000\u0000\u0465\u0463\u0001\u0000\u0000\u0000\u0466\u0468\u0005"+
		"g\u0000\u0000\u0467\u0440\u0001\u0000\u0000\u0000\u0467\u0441\u0001\u0000"+
		"\u0000\u0000\u0467\u0442\u0001\u0000\u0000\u0000\u0467\u0443\u0001\u0000"+
		"\u0000\u0000\u0467\u0444\u0001\u0000\u0000\u0000\u0467\u0445\u0001\u0000"+
		"\u0000\u0000\u0467\u0446\u0001\u0000\u0000\u0000\u0467\u0447\u0001\u0000"+
		"\u0000\u0000\u0467\u0448\u0001\u0000\u0000\u0000\u0467\u0449\u0001\u0000"+
		"\u0000\u0000\u0467\u044a\u0001\u0000\u0000\u0000\u0467\u044b\u0001\u0000"+
		"\u0000\u0000\u0467\u044c\u0001\u0000\u0000\u0000\u0467\u0455\u0001\u0000"+
		"\u0000\u0000\u0467\u045e\u0001\u0000\u0000\u0000\u0468\u00b3\u0001\u0000"+
		"\u0000\u0000\u0469\u046d\u0005q\u0000\u0000\u046a\u046c\u0003\u00b2Y\u0000"+
		"\u046b\u046a\u0001\u0000\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000"+
		"\u046d\u046b\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000"+
		"\u046e\u0472\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000\u0000\u0000"+
		"\u0470\u0473\u0003\u00b8\\\u0000\u0471\u0473\u0005K\u0000\u0000\u0472"+
		"\u0470\u0001\u0000\u0000\u0000\u0472\u0471\u0001\u0000\u0000\u0000\u0473"+
		"\u00b5\u0001\u0000\u0000\u0000\u0474\u047a\u0003\u00b8\\\u0000\u0475\u047a"+
		"\u0005q\u0000\u0000\u0476\u047a\u0005K\u0000\u0000\u0477\u047a\u0005G"+
		"\u0000\u0000\u0478\u047a\u0005H\u0000\u0000\u0479\u0474\u0001\u0000\u0000"+
		"\u0000\u0479\u0475\u0001\u0000\u0000\u0000\u0479\u0476\u0001\u0000\u0000"+
		"\u0000\u0479\u0477\u0001\u0000\u0000\u0000\u0479\u0478\u0001\u0000\u0000"+
		"\u0000\u047a\u00b7\u0001\u0000\u0000\u0000\u047b\u0484\u0005W\u0000\u0000"+
		"\u047c\u0483\u0003\u0098L\u0000\u047d\u0483\u0003\u00ba]\u0000\u047e\u0483"+
		"\u0003\u00b2Y\u0000\u047f\u0483\u0003\u00b8\\\u0000\u0480\u0483\u0005"+
		"q\u0000\u0000\u0481\u0483\u0005K\u0000\u0000\u0482\u047c\u0001\u0000\u0000"+
		"\u0000\u0482\u047d\u0001\u0000\u0000\u0000\u0482\u047e\u0001\u0000\u0000"+
		"\u0000\u0482\u047f\u0001\u0000\u0000\u0000\u0482\u0480\u0001\u0000\u0000"+
		"\u0000\u0482\u0481\u0001\u0000\u0000\u0000\u0483\u0486\u0001\u0000\u0000"+
		"\u0000\u0484\u0482\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000"+
		"\u0000\u0485\u0487\u0001\u0000\u0000\u0000\u0486\u0484\u0001\u0000\u0000"+
		"\u0000\u0487\u0488\u0005X\u0000\u0000\u0488\u00b9\u0001\u0000\u0000\u0000"+
		"\u0489\u0494\u0003\u0096K\u0000\u048a\u0494\u0003d2\u0000\u048b\u0494"+
		"\u0003p8\u0000\u048c\u0494\u0003\u00dam\u0000\u048d\u0494\u0003\u00de"+
		"o\u0000\u048e\u0494\u0003\u00be_\u0000\u048f\u0494\u0003\u00e4r\u0000"+
		"\u0490\u0494\u0003\u00e6s\u0000\u0491\u0494\u0003\u00e8t\u0000\u0492\u0494"+
		"\u0003\u00b4Z\u0000\u0493\u0489\u0001\u0000\u0000\u0000\u0493\u048a\u0001"+
		"\u0000\u0000\u0000\u0493\u048b\u0001\u0000\u0000\u0000\u0493\u048c\u0001"+
		"\u0000\u0000\u0000\u0493\u048d\u0001\u0000\u0000\u0000\u0493\u048e\u0001"+
		"\u0000\u0000\u0000\u0493\u048f\u0001\u0000\u0000\u0000\u0493\u0490\u0001"+
		"\u0000\u0000\u0000\u0493\u0491\u0001\u0000\u0000\u0000\u0493\u0492\u0001"+
		"\u0000\u0000\u0000\u0494\u00bb\u0001\u0000\u0000\u0000\u0495\u0499\u0005"+
		"W\u0000\u0000\u0496\u0498\u0003\u00ba]\u0000\u0497\u0496\u0001\u0000\u0000"+
		"\u0000\u0498\u049b\u0001\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000"+
		"\u0000\u0499\u049a\u0001\u0000\u0000\u0000\u049a\u049c\u0001\u0000\u0000"+
		"\u0000\u049b\u0499\u0001\u0000\u0000\u0000\u049c\u049d\u0005X\u0000\u0000"+
		"\u049d\u00bd\u0001\u0000\u0000\u0000\u049e\u049f\u0005u\u0000\u0000\u049f"+
		"\u04a0\u0003\u00c0`\u0000\u04a0\u04a1\u0003\u00bc^\u0000\u04a1\u00bf\u0001"+
		"\u0000\u0000\u0000\u04a2\u04a7\u0003\u00c4b\u0000\u04a3\u04a7\u0003\u00c6"+
		"c\u0000\u04a4\u04a7\u0003\u00c8d\u0000\u04a5\u04a7\u0003\u00c2a\u0000"+
		"\u04a6\u04a2\u0001\u0000\u0000\u0000\u04a6\u04a3\u0001\u0000\u0000\u0000"+
		"\u04a6\u04a4\u0001\u0000\u0000\u0000\u04a6\u04a5\u0001\u0000\u0000\u0000"+
		"\u04a7\u00c1\u0001\u0000\u0000\u0000\u04a8\u04a9\u0005S\u0000\u0000\u04a9"+
		"\u04aa\u0003\u00c0`\u0000\u04aa\u04ab\u0005U\u0000\u0000\u04ab\u04af\u0001"+
		"\u0000\u0000\u0000\u04ac\u04af\u0003\u00cae\u0000\u04ad\u04af\u0003\u00cc"+
		"f\u0000\u04ae\u04a8\u0001\u0000\u0000\u0000\u04ae\u04ac\u0001\u0000\u0000"+
		"\u0000\u04ae\u04ad\u0001\u0000\u0000\u0000\u04af\u00c3\u0001\u0000\u0000"+
		"\u0000\u04b0\u04b1\u0005Q\u0000\u0000\u04b1\u04b2\u0005F\u0000\u0000\u04b2"+
		"\u04b3\u0003\u00c2a\u0000\u04b3\u00c5\u0001\u0000\u0000\u0000\u04b4\u04b9"+
		"\u0003\u00c2a\u0000\u04b5\u04b6\u0005F\u0000\u0000\u04b6\u04b7\u0005R"+
		"\u0000\u0000\u04b7\u04b8\u0005F\u0000\u0000\u04b8\u04ba\u0003\u00c2a\u0000"+
		"\u04b9\u04b5\u0001\u0000\u0000\u0000\u04ba\u04bb\u0001\u0000\u0000\u0000"+
		"\u04bb\u04b9\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000"+
		"\u04bc\u00c7\u0001\u0000\u0000\u0000\u04bd\u04c2\u0003\u00c2a\u0000\u04be"+
		"\u04bf\u0005F\u0000\u0000\u04bf\u04c0\u0005v\u0000\u0000\u04c0\u04c1\u0005"+
		"F\u0000\u0000\u04c1\u04c3\u0003\u00c2a\u0000\u04c2\u04be\u0001\u0000\u0000"+
		"\u0000\u04c3\u04c4\u0001\u0000\u0000\u0000\u04c4\u04c2\u0001\u0000\u0000"+
		"\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000\u04c5\u00c9\u0001\u0000\u0000"+
		"\u0000\u04c6\u04c7\u0005S\u0000\u0000\u04c7\u04c8\u0003\u009aM\u0000\u04c8"+
		"\u04c9\u0005U\u0000\u0000\u04c9\u00cb\u0001\u0000\u0000\u0000\u04ca\u04cf"+
		"\u0007\t\u0000\u0000\u04cb\u04ce\u0003\u00b2Y\u0000\u04cc\u04ce\u0003"+
		"\u00b6[\u0000\u04cd\u04cb\u0001\u0000\u0000\u0000\u04cd\u04cc\u0001\u0000"+
		"\u0000\u0000\u04ce\u04d1\u0001\u0000\u0000\u0000\u04cf\u04cd\u0001\u0000"+
		"\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000\u04d0\u04d2\u0001\u0000"+
		"\u0000\u0000\u04d1\u04cf\u0001\u0000\u0000\u0000\u04d2\u04d3\u0005U\u0000"+
		"\u0000\u04d3\u00cd\u0001\u0000\u0000\u0000\u04d4\u04d5\u0005w\u0000\u0000"+
		"\u04d5\u04d6\u0005J\u0000\u0000\u04d6\u04d9\u0005U\u0000\u0000\u04d7\u04d9"+
		"\u0005x\u0000\u0000\u04d8\u04d4\u0001\u0000\u0000\u0000\u04d8\u04d7\u0001"+
		"\u0000\u0000\u0000\u04d9\u00cf\u0001\u0000\u0000\u0000\u04da\u04db\u0005"+
		"y\u0000\u0000\u04db\u04dc\u0005o\u0000\u0000\u04dc\u04dd\u0005U\u0000"+
		"\u0000\u04dd\u00d1\u0001\u0000\u0000\u0000\u04de\u04df\u0005z\u0000\u0000"+
		"\u04df\u04e0\u0003\u00d4j\u0000\u04e0\u04e1\u0005U\u0000\u0000\u04e1\u00d3"+
		"\u0001\u0000\u0000\u0000\u04e2\u04e9\u0003\u00d6k\u0000\u04e3\u04e4\u0005"+
		"F\u0000\u0000\u04e4\u04e5\u0007\b\u0000\u0000\u04e5\u04e6\u0005F\u0000"+
		"\u0000\u04e6\u04e8\u0003\u00d6k\u0000\u04e7\u04e3\u0001\u0000\u0000\u0000"+
		"\u04e8\u04eb\u0001\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000"+
		"\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u00d5\u0001\u0000\u0000\u0000"+
		"\u04eb\u04e9\u0001\u0000\u0000\u0000\u04ec\u04f3\u0003\u00d8l\u0000\u04ed"+
		"\u04ee\u0005]\u0000\u0000\u04ee\u04f2\u0003\u00d8l\u0000\u04ef\u04f0\u0005"+
		"n\u0000\u0000\u04f0\u04f2\u0003\u00aaU\u0000\u04f1\u04ed\u0001\u0000\u0000"+
		"\u0000\u04f1\u04ef\u0001\u0000\u0000\u0000\u04f2\u04f5\u0001\u0000\u0000"+
		"\u0000\u04f3\u04f1\u0001\u0000\u0000\u0000\u04f3\u04f4\u0001\u0000\u0000"+
		"\u0000\u04f4\u00d7\u0001\u0000\u0000\u0000\u04f5\u04f3\u0001\u0000\u0000"+
		"\u0000\u04f6\u04ff\u0003\u00aaU\u0000\u04f7\u04ff\u0003\u00aeW\u0000\u04f8"+
		"\u04ff\u0003\u00b0X\u0000\u04f9\u04ff\u0003\u00acV\u0000\u04fa\u04fb\u0005"+
		"S\u0000\u0000\u04fb\u04fc\u0003\u00d4j\u0000\u04fc\u04fd\u0005U\u0000"+
		"\u0000\u04fd\u04ff\u0001\u0000\u0000\u0000\u04fe\u04f6\u0001\u0000\u0000"+
		"\u0000\u04fe\u04f7\u0001\u0000\u0000\u0000\u04fe\u04f8\u0001\u0000\u0000"+
		"\u0000\u04fe\u04f9\u0001\u0000\u0000\u0000\u04fe\u04fa\u0001\u0000\u0000"+
		"\u0000\u04ff\u00d9\u0001\u0000\u0000\u0000\u0500\u0501\u0005{\u0000\u0000"+
		"\u0501\u0503\u0005W\u0000\u0000\u0502\u0504\u0003\u00dcn\u0000\u0503\u0502"+
		"\u0001\u0000\u0000\u0000\u0503\u0504\u0001\u0000\u0000\u0000\u0504\u050b"+
		"\u0001\u0000\u0000\u0000\u0505\u0507\u0005K\u0000\u0000\u0506\u0508\u0003"+
		"\u00dcn\u0000\u0507\u0506\u0001\u0000\u0000\u0000\u0507\u0508\u0001\u0000"+
		"\u0000\u0000\u0508\u050a\u0001\u0000\u0000\u0000\u0509\u0505\u0001\u0000"+
		"\u0000\u0000\u050a\u050d\u0001\u0000\u0000\u0000\u050b\u0509\u0001\u0000"+
		"\u0000\u0000\u050b\u050c\u0001\u0000\u0000\u0000\u050c\u050e\u0001\u0000"+
		"\u0000\u0000\u050d\u050b\u0001\u0000\u0000\u0000\u050e\u050f\u0005X\u0000"+
		"\u0000\u050f\u00db\u0001\u0000\u0000\u0000\u0510\u0511\u0003\u0094J\u0000"+
		"\u0511\u0512\u0005T\u0000\u0000\u0512\u0513\u0003\u00a0P\u0000\u0513\u0519"+
		"\u0001\u0000\u0000\u0000\u0514\u0515\u0003\u0094J\u0000\u0515\u0516\u0005"+
		"T\u0000\u0000\u0516\u0517\u0003\u009eO\u0000\u0517\u0519\u0001\u0000\u0000"+
		"\u0000\u0518\u0510\u0001\u0000\u0000\u0000\u0518\u0514\u0001\u0000\u0000"+
		"\u0000\u0519\u00dd\u0001\u0000\u0000\u0000\u051a\u051b\u0005|\u0000\u0000"+
		"\u051b\u051c\u0005F\u0000\u0000\u051c\u051d\u0003\u00f4z\u0000\u051d\u0521"+
		"\u0005W\u0000\u0000\u051e\u0520\u0003\u00e0p\u0000\u051f\u051e\u0001\u0000"+
		"\u0000\u0000\u0520\u0523\u0001\u0000\u0000\u0000\u0521\u051f\u0001\u0000"+
		"\u0000\u0000\u0521\u0522\u0001\u0000\u0000\u0000\u0522\u0524\u0001\u0000"+
		"\u0000\u0000\u0523\u0521\u0001\u0000\u0000\u0000\u0524\u0525\u0005X\u0000"+
		"\u0000\u0525\u00df\u0001\u0000\u0000\u0000\u0526\u0527\u0003\u00e2q\u0000"+
		"\u0527\u0529\u0005W\u0000\u0000\u0528\u052a\u0003\u0098L\u0000\u0529\u0528"+
		"\u0001\u0000\u0000\u0000\u0529\u052a\u0001\u0000\u0000\u0000\u052a\u052b"+
		"\u0001\u0000\u0000\u0000\u052b\u052c\u0005X\u0000\u0000\u052c\u00e1\u0001"+
		"\u0000\u0000\u0000\u052d\u0532\u0007\n\u0000\u0000\u052e\u052f\u0005O"+
		"\u0000\u0000\u052f\u0531\u0007\n\u0000\u0000\u0530\u052e\u0001\u0000\u0000"+
		"\u0000\u0531\u0534\u0001\u0000\u0000\u0000\u0532\u0530\u0001\u0000\u0000"+
		"\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u00e3\u0001\u0000\u0000"+
		"\u0000\u0534\u0532\u0001\u0000\u0000\u0000\u0535\u0536\u0005\u007f\u0000"+
		"\u0000\u0536\u0538\u0005W\u0000\u0000\u0537\u0539\u0003\u0098L\u0000\u0538"+
		"\u0537\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539"+
		"\u053a\u0001\u0000\u0000\u0000\u053a\u053b\u0005X\u0000\u0000\u053b\u00e5"+
		"\u0001\u0000\u0000\u0000\u053c\u053d\u0005\u0080\u0000\u0000\u053d\u053e"+
		"\u0003\u00f4z\u0000\u053e\u0540\u0005W\u0000\u0000\u053f\u0541\u0003\u0098"+
		"L\u0000\u0540\u053f\u0001\u0000\u0000\u0000\u0540\u0541\u0001\u0000\u0000"+
		"\u0000\u0541\u0542\u0001\u0000\u0000\u0000\u0542\u0543\u0005X\u0000\u0000"+
		"\u0543\u00e7\u0001\u0000\u0000\u0000\u0544\u0545\u0005\u0081\u0000\u0000"+
		"\u0545\u0546\u0003\u00eau\u0000\u0546\u054a\u0005W\u0000\u0000\u0547\u0549"+
		"\u0003\u00eew\u0000\u0548\u0547\u0001\u0000\u0000\u0000\u0549\u054c\u0001"+
		"\u0000\u0000\u0000\u054a\u0548\u0001\u0000\u0000\u0000\u054a\u054b\u0001"+
		"\u0000\u0000\u0000\u054b\u054d\u0001\u0000\u0000\u0000\u054c\u054a\u0001"+
		"\u0000\u0000\u0000\u054d\u054e\u0005X\u0000\u0000\u054e\u00e9\u0001\u0000"+
		"\u0000\u0000\u054f\u0554\u0003\u00ecv\u0000\u0550\u0551\u0005O\u0000\u0000"+
		"\u0551\u0553\u0003\u00ecv\u0000\u0552\u0550\u0001\u0000\u0000\u0000\u0553"+
		"\u0556\u0001\u0000\u0000\u0000\u0554\u0552\u0001\u0000\u0000\u0000\u0554"+
		"\u0555\u0001\u0000\u0000\u0000\u0555\u00eb\u0001\u0000\u0000\u0000\u0556"+
		"\u0554\u0001\u0000\u0000\u0000\u0557\u0560\u0005J\u0000\u0000\u0558\u055c"+
		"\u0003\u00f4z\u0000\u0559\u055b\u0003\u00f4z\u0000\u055a\u0559\u0001\u0000"+
		"\u0000\u0000\u055b\u055e\u0001\u0000\u0000\u0000\u055c\u055a\u0001\u0000"+
		"\u0000\u0000\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u0560\u0001\u0000"+
		"\u0000\u0000\u055e\u055c\u0001\u0000\u0000\u0000\u055f\u0557\u0001\u0000"+
		"\u0000\u0000\u055f\u0558\u0001\u0000\u0000\u0000\u0560\u00ed\u0001\u0000"+
		"\u0000\u0000\u0561\u0562\u0003\u00f0x\u0000\u0562\u0564\u0005W\u0000\u0000"+
		"\u0563\u0565\u0003\u00f2y\u0000\u0564\u0563\u0001\u0000\u0000\u0000\u0564"+
		"\u0565\u0001\u0000\u0000\u0000\u0565\u056c\u0001\u0000\u0000\u0000\u0566"+
		"\u0568\u0005K\u0000\u0000\u0567\u0569\u0003\u00f2y\u0000\u0568\u0567\u0001"+
		"\u0000\u0000\u0000\u0568\u0569\u0001\u0000\u0000\u0000\u0569\u056b\u0001"+
		"\u0000\u0000\u0000\u056a\u0566\u0001\u0000\u0000\u0000\u056b\u056e\u0001"+
		"\u0000\u0000\u0000\u056c\u056a\u0001\u0000\u0000\u0000\u056c\u056d\u0001"+
		"\u0000\u0000\u0000\u056d\u056f\u0001\u0000\u0000\u0000\u056e\u056c\u0001"+
		"\u0000\u0000\u0000\u056f\u0570\u0005X\u0000\u0000\u0570\u00ef\u0001\u0000"+
		"\u0000\u0000\u0571\u0572\u0005q\u0000\u0000\u0572\u00f1\u0001\u0000\u0000"+
		"\u0000\u0573\u0574\u0003\u00f4z\u0000\u0574\u0575\u0005T\u0000\u0000\u0575"+
		"\u0579\u0003\u00aaU\u0000\u0576\u0578\u0003\u00aaU\u0000\u0577\u0576\u0001"+
		"\u0000\u0000\u0000\u0578\u057b\u0001\u0000\u0000\u0000\u0579\u0577\u0001"+
		"\u0000\u0000\u0000\u0579\u057a\u0001\u0000\u0000\u0000\u057a\u00f3\u0001"+
		"\u0000\u0000\u0000\u057b\u0579\u0001\u0000\u0000\u0000\u057c\u057d\u0007"+
		"\u000b\u0000\u0000\u057d\u00f5\u0001\u0000\u0000\u0000\u057e\u057f\u0005"+
		"\u0083\u0000\u0000\u057f\u0580\u0003\u00f8|\u0000\u0580\u0581\u0005\u0084"+
		"\u0000\u0000\u0581\u00f7\u0001\u0000\u0000\u0000\u0582\u0593\u0003\u00fc"+
		"~\u0000\u0583\u0593\u0003\u00fe\u007f\u0000\u0584\u0586\u0005\u0085\u0000"+
		"\u0000\u0585\u0587\u0003\u0108\u0084\u0000\u0586\u0585\u0001\u0000\u0000"+
		"\u0000\u0586\u0587\u0001\u0000\u0000\u0000\u0587\u0593\u0001\u0000\u0000"+
		"\u0000\u0588\u0589\u0005\u0086\u0000\u0000\u0589\u0593\u0003\u0104\u0082"+
		"\u0000\u058a\u0593\u0003\u00fa}\u0000\u058b\u0590\u0005\u0085\u0000\u0000"+
		"\u058c\u058d\u0005\u0087\u0000\u0000\u058d\u058e\u0003\u0122\u0091\u0000"+
		"\u058e\u058f\u0005\u0088\u0000\u0000\u058f\u0591\u0001\u0000\u0000\u0000"+
		"\u0590\u058c\u0001\u0000\u0000\u0000\u0590\u0591\u0001\u0000\u0000\u0000"+
		"\u0591\u0593\u0001\u0000\u0000\u0000\u0592\u0582\u0001\u0000\u0000\u0000"+
		"\u0592\u0583\u0001\u0000\u0000\u0000\u0592\u0584\u0001\u0000\u0000\u0000"+
		"\u0592\u0588\u0001\u0000\u0000\u0000\u0592\u058a\u0001\u0000\u0000\u0000"+
		"\u0592\u058b\u0001\u0000\u0000\u0000\u0593\u00f9\u0001\u0000\u0000\u0000"+
		"\u0594\u0595\u0005\u0089\u0000\u0000\u0595\u0596\u0003\f\u0006\u0000\u0596"+
		"\u0597\u0005\u008a\u0000\u0000\u0597\u00fb\u0001\u0000\u0000\u0000\u0598"+
		"\u0599\u0005\u008b\u0000\u0000\u0599\u059a\u0003\u0108\u0084\u0000\u059a"+
		"\u05a1\u0003\f\u0006\u0000\u059b\u059c\u0005\u008c\u0000\u0000\u059c\u059d"+
		"\u0003\u0108\u0084\u0000\u059d\u059e\u0003\f\u0006\u0000\u059e\u05a0\u0001"+
		"\u0000\u0000\u0000\u059f\u059b\u0001\u0000\u0000\u0000\u05a0\u05a3\u0001"+
		"\u0000\u0000\u0000\u05a1\u059f\u0001\u0000\u0000\u0000\u05a1\u05a2\u0001"+
		"\u0000\u0000\u0000\u05a2\u05a6\u0001\u0000\u0000\u0000\u05a3\u05a1\u0001"+
		"\u0000\u0000\u0000\u05a4\u05a5\u0005\u008d\u0000\u0000\u05a5\u05a7\u0003"+
		"\f\u0006\u0000\u05a6\u05a4\u0001\u0000\u0000\u0000\u05a6\u05a7\u0001\u0000"+
		"\u0000\u0000\u05a7\u05a8\u0001\u0000\u0000\u0000\u05a8\u05a9\u0005\u008e"+
		"\u0000\u0000\u05a9\u00fd\u0001\u0000\u0000\u0000\u05aa\u05ab\u0005\u008f"+
		"\u0000\u0000\u05ab\u05ac\u0003\u0100\u0080\u0000\u05ac\u05ad\u0005\u0090"+
		"\u0000\u0000\u05ad\u05ae\u0003\u0104\u0082\u0000\u05ae\u05b1\u0003\f\u0006"+
		"\u0000\u05af\u05b0\u0005\u008d\u0000\u0000\u05b0\u05b2\u0003\f\u0006\u0000"+
		"\u05b1\u05af\u0001\u0000\u0000\u0000\u05b1\u05b2\u0001\u0000\u0000\u0000"+
		"\u05b2\u05b3\u0001\u0000\u0000\u0000\u05b3\u05b4\u0005\u0091\u0000\u0000"+
		"\u05b4\u00ff\u0001\u0000\u0000\u0000\u05b5\u05ba\u0005\u0085\u0000\u0000"+
		"\u05b6\u05b7\u0005\u0092\u0000\u0000\u05b7\u05b9\u0005\u0085\u0000\u0000"+
		"\u05b8\u05b6\u0001\u0000\u0000\u0000\u05b9\u05bc\u0001\u0000\u0000\u0000"+
		"\u05ba\u05b8\u0001\u0000\u0000\u0000\u05ba\u05bb\u0001\u0000\u0000\u0000"+
		"\u05bb\u0101\u0001\u0000\u0000\u0000\u05bc\u05ba\u0001\u0000\u0000\u0000"+
		"\u05bd\u05be\u0005\u0093\u0000\u0000\u05be\u05bf\u0003\u0104\u0082\u0000"+
		"\u05bf\u05c0\u0005\u0094\u0000\u0000\u05c0\u0103\u0001\u0000\u0000\u0000"+
		"\u05c1\u05c6\u0003\u0108\u0084\u0000\u05c2\u05c3\u0005\u0095\u0000\u0000"+
		"\u05c3\u05c5\u0003\u0106\u0083\u0000\u05c4\u05c2\u0001\u0000\u0000\u0000"+
		"\u05c5\u05c8\u0001\u0000\u0000\u0000\u05c6\u05c4\u0001\u0000\u0000\u0000"+
		"\u05c6\u05c7\u0001\u0000\u0000\u0000\u05c7\u0105\u0001\u0000\u0000\u0000"+
		"\u05c8\u05c6\u0001\u0000\u0000\u0000\u05c9\u05cf\u0005\u0085\u0000\u0000"+
		"\u05ca\u05cc\u0005\u0087\u0000\u0000\u05cb\u05cd\u0003\u0122\u0091\u0000"+
		"\u05cc\u05cb\u0001\u0000\u0000\u0000\u05cc\u05cd\u0001\u0000\u0000\u0000"+
		"\u05cd\u05ce\u0001\u0000\u0000\u0000\u05ce\u05d0\u0005\u0088\u0000\u0000"+
		"\u05cf\u05ca\u0001\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000\u0000\u0000"+
		"\u05d0\u0107\u0001\u0000\u0000\u0000\u05d1\u05d2\u0003\u010a\u0085\u0000"+
		"\u05d2\u0109\u0001\u0000\u0000\u0000\u05d3\u05d8\u0003\u010c\u0086\u0000"+
		"\u05d4\u05d5\u0005\u0096\u0000\u0000\u05d5\u05d7\u0003\u010c\u0086\u0000"+
		"\u05d6\u05d4\u0001\u0000\u0000\u0000\u05d7\u05da\u0001\u0000\u0000\u0000"+
		"\u05d8\u05d6\u0001\u0000\u0000\u0000\u05d8\u05d9\u0001\u0000\u0000\u0000"+
		"\u05d9\u010b\u0001\u0000\u0000\u0000\u05da\u05d8\u0001\u0000\u0000\u0000"+
		"\u05db\u05e0\u0003\u010e\u0087\u0000\u05dc\u05dd\u0005\u0097\u0000\u0000"+
		"\u05dd\u05df\u0003\u010e\u0087\u0000\u05de\u05dc\u0001\u0000\u0000\u0000"+
		"\u05df\u05e2\u0001\u0000\u0000\u0000\u05e0\u05de\u0001\u0000\u0000\u0000"+
		"\u05e0\u05e1\u0001\u0000\u0000\u0000\u05e1\u010d\u0001\u0000\u0000\u0000"+
		"\u05e2\u05e0\u0001\u0000\u0000\u0000\u05e3\u05e4\u0005\u0098\u0000\u0000"+
		"\u05e4\u05e7\u0003\u010e\u0087\u0000\u05e5\u05e7\u0003\u0110\u0088\u0000"+
		"\u05e6\u05e3\u0001\u0000\u0000\u0000\u05e6\u05e5\u0001\u0000\u0000\u0000"+
		"\u05e7\u010f\u0001\u0000\u0000\u0000\u05e8\u05ee\u0003\u0114\u008a\u0000"+
		"\u05e9\u05ea\u0003\u0112\u0089\u0000\u05ea\u05eb\u0003\u0114\u008a\u0000"+
		"\u05eb\u05ed\u0001\u0000\u0000\u0000\u05ec\u05e9\u0001\u0000\u0000\u0000"+
		"\u05ed\u05f0\u0001\u0000\u0000\u0000\u05ee\u05ec\u0001\u0000\u0000\u0000"+
		"\u05ee\u05ef\u0001\u0000\u0000\u0000\u05ef\u0111\u0001\u0000\u0000\u0000"+
		"\u05f0\u05ee\u0001\u0000\u0000\u0000\u05f1\u05fb\u0005\u0099\u0000\u0000"+
		"\u05f2\u05fb\u0005\u009a\u0000\u0000\u05f3\u05fb\u0005\u009b\u0000\u0000"+
		"\u05f4\u05fb\u0005\u009c\u0000\u0000\u05f5\u05fb\u0005\u009d\u0000\u0000"+
		"\u05f6\u05fb\u0005\u009e\u0000\u0000\u05f7\u05fb\u0005\u0090\u0000\u0000"+
		"\u05f8\u05f9\u0005\u0098\u0000\u0000\u05f9\u05fb\u0005\u0090\u0000\u0000"+
		"\u05fa\u05f1\u0001\u0000\u0000\u0000\u05fa\u05f2\u0001\u0000\u0000\u0000"+
		"\u05fa\u05f3\u0001\u0000\u0000\u0000\u05fa\u05f4\u0001\u0000\u0000\u0000"+
		"\u05fa\u05f5\u0001\u0000\u0000\u0000\u05fa\u05f6\u0001\u0000\u0000\u0000"+
		"\u05fa\u05f7\u0001\u0000\u0000\u0000\u05fa\u05f8\u0001\u0000\u0000\u0000"+
		"\u05fb\u0113\u0001\u0000\u0000\u0000\u05fc\u0601\u0003\u0116\u008b\u0000"+
		"\u05fd\u05fe\u0007\f\u0000\u0000\u05fe\u0600\u0003\u0116\u008b\u0000\u05ff"+
		"\u05fd\u0001\u0000\u0000\u0000\u0600\u0603\u0001\u0000\u0000\u0000\u0601"+
		"\u05ff\u0001\u0000\u0000\u0000\u0601\u0602\u0001\u0000\u0000\u0000\u0602"+
		"\u0115\u0001\u0000\u0000\u0000\u0603\u0601\u0001\u0000\u0000\u0000\u0604"+
		"\u0609\u0003\u0118\u008c\u0000\u0605\u0606\u0007\r\u0000\u0000\u0606\u0608"+
		"\u0003\u0118\u008c\u0000\u0607\u0605\u0001\u0000\u0000\u0000\u0608\u060b"+
		"\u0001\u0000\u0000\u0000\u0609\u0607\u0001\u0000\u0000\u0000\u0609\u060a"+
		"\u0001\u0000\u0000\u0000\u060a\u0117\u0001\u0000\u0000\u0000\u060b\u0609"+
		"\u0001\u0000\u0000\u0000\u060c\u060d\u0007\f\u0000\u0000\u060d\u0610\u0003"+
		"\u0118\u008c\u0000\u060e\u0610\u0003\u011a\u008d\u0000\u060f\u060c\u0001"+
		"\u0000\u0000\u0000\u060f\u060e\u0001\u0000\u0000\u0000\u0610\u0119\u0001"+
		"\u0000\u0000\u0000\u0611\u0615\u0003\u011e\u008f\u0000\u0612\u0614\u0003"+
		"\u011c\u008e\u0000\u0613\u0612\u0001\u0000\u0000\u0000\u0614\u0617\u0001"+
		"\u0000\u0000\u0000\u0615\u0613\u0001\u0000\u0000\u0000\u0615\u0616\u0001"+
		"\u0000\u0000\u0000\u0616\u011b\u0001\u0000\u0000\u0000\u0617\u0615\u0001"+
		"\u0000\u0000\u0000\u0618\u061a\u0005\u0087\u0000\u0000\u0619\u061b\u0003"+
		"\u0122\u0091\u0000\u061a\u0619\u0001\u0000\u0000\u0000\u061a\u061b\u0001"+
		"\u0000\u0000\u0000\u061b\u061c\u0001\u0000\u0000\u0000\u061c\u0624\u0005"+
		"\u0088\u0000\u0000\u061d\u061e\u0005\u00a5\u0000\u0000\u061e\u061f\u0003"+
		"\u0108\u0084\u0000\u061f\u0620\u0005\u00a6\u0000\u0000\u0620\u0624\u0001"+
		"\u0000\u0000\u0000\u0621\u0622\u0005\u00a7\u0000\u0000\u0622\u0624\u0005"+
		"\u0085\u0000\u0000\u0623\u0618\u0001\u0000\u0000\u0000\u0623\u061d\u0001"+
		"\u0000\u0000\u0000\u0623\u0621\u0001\u0000\u0000\u0000\u0624\u011d\u0001"+
		"\u0000\u0000\u0000\u0625\u0637\u0005\u0085\u0000\u0000\u0626\u0637\u0005"+
		"\u00a8\u0000\u0000\u0627\u0637\u0005\u00a9\u0000\u0000\u0628\u0629\u0005"+
		"\u0087\u0000\u0000\u0629\u062a\u0003\u0108\u0084\u0000\u062a\u062b\u0005"+
		"\u0088\u0000\u0000\u062b\u0637\u0001\u0000\u0000\u0000\u062c\u062e\u0005"+
		"\u00a5\u0000\u0000\u062d\u062f\u0003\u0120\u0090\u0000\u062e\u062d\u0001"+
		"\u0000\u0000\u0000\u062e\u062f\u0001\u0000\u0000\u0000\u062f\u0630\u0001"+
		"\u0000\u0000\u0000\u0630\u0637\u0005\u00a6\u0000\u0000\u0631\u0633\u0005"+
		"\u00aa\u0000\u0000\u0632\u0634\u0003\u0124\u0092\u0000\u0633\u0632\u0001"+
		"\u0000\u0000\u0000\u0633\u0634\u0001\u0000\u0000\u0000\u0634\u0635\u0001"+
		"\u0000\u0000\u0000\u0635\u0637\u0005\u00ab\u0000\u0000\u0636\u0625\u0001"+
		"\u0000\u0000\u0000\u0636\u0626\u0001\u0000\u0000\u0000\u0636\u0627\u0001"+
		"\u0000\u0000\u0000\u0636\u0628\u0001\u0000\u0000\u0000\u0636\u062c\u0001"+
		"\u0000\u0000\u0000\u0636\u0631\u0001\u0000\u0000\u0000\u0637\u011f\u0001"+
		"\u0000\u0000\u0000\u0638\u063d\u0003\u0108\u0084\u0000\u0639\u063a\u0005"+
		"\u0092\u0000\u0000\u063a\u063c\u0003\u0108\u0084\u0000\u063b\u0639\u0001"+
		"\u0000\u0000\u0000\u063c\u063f\u0001\u0000\u0000\u0000\u063d\u063b\u0001"+
		"\u0000\u0000\u0000\u063d\u063e\u0001\u0000\u0000\u0000\u063e\u0121\u0001"+
		"\u0000\u0000\u0000\u063f\u063d\u0001\u0000\u0000\u0000\u0640\u0645\u0003"+
		"\u0108\u0084\u0000\u0641\u0642\u0005\u0092\u0000\u0000\u0642\u0644\u0003"+
		"\u0108\u0084\u0000\u0643\u0641\u0001\u0000\u0000\u0000\u0644\u0647\u0001"+
		"\u0000\u0000\u0000\u0645\u0643\u0001\u0000\u0000\u0000\u0645\u0646\u0001"+
		"\u0000\u0000\u0000\u0646\u0123\u0001\u0000\u0000\u0000\u0647\u0645\u0001"+
		"\u0000\u0000\u0000\u0648\u0649\u0003\u0108\u0084\u0000\u0649\u064a\u0005"+
		"\u00ac\u0000\u0000\u064a\u0652\u0003\u0108\u0084\u0000\u064b\u064c\u0005"+
		"\u0092\u0000\u0000\u064c\u064d\u0003\u0108\u0084\u0000\u064d\u064e\u0005"+
		"\u00ac\u0000\u0000\u064e\u064f\u0003\u0108\u0084\u0000\u064f\u0651\u0001"+
		"\u0000\u0000\u0000\u0650\u064b\u0001\u0000\u0000\u0000\u0651\u0654\u0001"+
		"\u0000\u0000\u0000\u0652\u0650\u0001\u0000\u0000\u0000\u0652\u0653\u0001"+
		"\u0000\u0000\u0000\u0653\u0125\u0001\u0000\u0000\u0000\u0654\u0652\u0001"+
		"\u0000\u0000\u0000\u00c0\u0128\u012a\u0131\u0138\u013b\u0145\u014a\u0153"+
		"\u0155\u015a\u0160\u0167\u016e\u0174\u017b\u0184\u018d\u0193\u0196\u019f"+
		"\u01a6\u01af\u01bd\u01c3\u01c7\u01d1\u01d5\u01dc\u01e6\u01ee\u01f4\u01fc"+
		"\u0208\u020f\u0217\u021d\u0225\u022a\u0233\u023a\u0241\u0246\u024b\u024e"+
		"\u0258\u025b\u0265\u0272\u027a\u0281\u0287\u0295\u029a\u02a0\u02a6\u02ab"+
		"\u02b2\u02b7\u02be\u02c3\u02ca\u02cf\u02d9\u02de\u02e6\u02ec\u02f2\u02f4"+
		"\u02f8\u02fc\u0301\u0305\u0307\u0314\u0317\u031a\u0321\u0329\u032c\u0334"+
		"\u033c\u0340\u0344\u0348\u0355\u035e\u0365\u036c\u036e\u0376\u0378\u037a"+
		"\u037d\u0383\u038a\u0393\u0399\u039b\u03a1\u03a5\u03b2\u03b6\u03c2\u03c8"+
		"\u03ce\u03d3\u03da\u03df\u03e2\u03e7\u03ed\u03f1\u03f8\u03fe\u0405\u0407"+
		"\u040b\u0410\u0420\u042d\u0432\u0437\u043c\u044f\u0451\u0458\u045a\u0461"+
		"\u0463\u0467\u046d\u0472\u0479\u0482\u0484\u0493\u0499\u04a6\u04ae\u04bb"+
		"\u04c4\u04cd\u04cf\u04d8\u04e9\u04f1\u04f3\u04fe\u0503\u0507\u050b\u0518"+
		"\u0521\u0529\u0532\u0538\u0540\u054a\u0554\u055c\u055f\u0564\u0568\u056c"+
		"\u0579\u0586\u0590\u0592\u05a1\u05a6\u05b1\u05ba\u05c6\u05cc\u05cf\u05d8"+
		"\u05e0\u05e6\u05ee\u05fa\u0601\u0609\u060f\u0615\u061a\u0623\u062e\u0633"+
		"\u0636\u063d\u0645\u0652";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}