// Generated from C:/Users/Rama Alwanni/Desktop/psychic-broccoli-main/grammars/JinjaFlaskParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JinjaFlaskParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, NEWLINE=3, WS=4, COMMENT=5, DEF=6, RETURN=7, FROM=8, 
		IMPORT=9, AS=10, IF=11, ELIF=12, ELSE=13, FOR=14, IN=15, GLOBAL=16, AND=17, 
		OR=18, NOT=19, TRUE=20, FALSE=21, NONE=22, PRINT=23, WHILE=24, AT=25, 
		COLON=26, SEMI=27, COMMA=28, ASSIGN=29, EQ=30, NEQ=31, GT=32, LT=33, GTE=34, 
		LTE=35, PLUS=36, MINUS=37, STAR=38, SLASH=39, SLASHSLASH=40, LP=41, RP=42, 
		LBRACK=43, RBRACK=44, LBRACE=45, RBRACE=46, DOT=47, NAME=48, NUMBER=49, 
		TRIPLE_DOUBLE_STRING=50, TRIPLE_SINGLE_STRING=51, STRING=52, JINJA_EXPR_START=53, 
		JINJA_STMT_START=54, JINJA_COMMENT_START=55, TRIPLE_DOUBLE_START=56, TRIPLE_SINGLE_START=57, 
		TRIPLE_DOUBLE_END=58, TRIPLE_SINGLE_END=59, HTML_COMMENT=60, HTML_CONDITIONAL_COMMENT=61, 
		XML_DECLARATION=62, CDATA=63, DTD=64, SCRIPTLET=65, SEA_WS=66, SCRIPT_OPEN=67, 
		STYLE_OPEN=68, TAG_OPEN=69, HTML_TEXT=70, TAG_CLOSE=71, TAG_SLASH_CLOSE=72, 
		TAG_SLASH=73, TAG_EQUALS=74, TAG_NAME=75, TAG_WHITESPACE=76, ATTVALUE_VALUE=77, 
		SCRIPT_BODY=78, STYLE_CLOSE=79, CSS_WS=80, CSS_COMMENT=81, CSS_LBRACE=82, 
		CSS_RBRACE=83, CSS_COLON=84, CSS_SEMICOLON=85, CSS_LPAREN=86, CSS_RPAREN=87, 
		CSS_COMMA=88, CSS_DOT=89, CSS_SLASH=90, CSS_PERCENT=91, CSS_PLUS=92, CSS_GREATER=93, 
		CSS_TILDE=94, CSS_EQUALS=95, CSS_LBRACKET=96, CSS_RBRACKET=97, CSS_ASTERISK=98, 
		AT_IMPORT=99, AT_MEDIA=100, AT_FONT_FACE=101, AT_KEYFRAMES=102, AT_SUPPORTS=103, 
		CSS_NUMBER=104, COLOR_HEX=105, CSS_STRING=106, HASH=107, CLASS=108, PSEUDO_ELEMENT=109, 
		PSEUDO_CLASS=110, IDENT=111, JINJA_EXPR_END=112, JINJA_EXPR_CONTENT=113, 
		JINJA_STMT_END=114, JINJA_STMT_CONTENT=115, JINJA_COMMENT_END=116, JINJA_COMMENT_CONTENT=117, 
		JINJA_STATEMENT=118, JINJA_EXPR=119;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_decorator = 2, RULE_decoratedDef = 3, 
		RULE_defStmt = 4, RULE_simpleStmt = 5, RULE_ifStmt = 6, RULE_block = 7, 
		RULE_assignmentStmt = 8, RULE_returnStmt = 9, RULE_globalStmt = 10, RULE_importStmt = 11, 
		RULE_forLoop = 12, RULE_whileLoop = 13, RULE_tripleQuotedString = 14, 
		RULE_document = 15, RULE_content = 16, RULE_element = 17, RULE_attribute = 18, 
		RULE_styleElement = 19, RULE_styleContent = 20, RULE_cssStatement = 21, 
		RULE_ruleset = 22, RULE_selectorGroup = 23, RULE_selector = 24, RULE_combinator = 25, 
		RULE_simpleSelectorSequence = 26, RULE_simpleSelector = 27, RULE_typeSelector = 28, 
		RULE_universal = 29, RULE_hash = 30, RULE_classSelector = 31, RULE_pseudo = 32, 
		RULE_attributeSelector = 33, RULE_atRule = 34, RULE_importTerminator = 35, 
		RULE_mediaQueryList = 36, RULE_mediaQuery = 37, RULE_declarationBlock = 38, 
		RULE_declaration = 39, RULE_propertyName = 40, RULE_value = 41, RULE_term = 42, 
		RULE_functionCall = 43, RULE_valueList = 44, RULE_keyframeBlock = 45, 
		RULE_keyframeSelector = 46, RULE_expression = 47, RULE_comparisonExpression = 48, 
		RULE_additiveExpression = 49, RULE_multiplicativeExpression = 50, RULE_primaryExpression = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "decorator", "decoratedDef", "defStmt", "simpleStmt", 
			"ifStmt", "block", "assignmentStmt", "returnStmt", "globalStmt", "importStmt", 
			"forLoop", "whileLoop", "tripleQuotedString", "document", "content", 
			"element", "attribute", "styleElement", "styleContent", "cssStatement", 
			"ruleset", "selectorGroup", "selector", "combinator", "simpleSelectorSequence", 
			"simpleSelector", "typeSelector", "universal", "hash", "classSelector", 
			"pseudo", "attributeSelector", "atRule", "importTerminator", "mediaQueryList", 
			"mediaQuery", "declarationBlock", "declaration", "propertyName", "value", 
			"term", "functionCall", "valueList", "keyframeBlock", "keyframeSelector", 
			"expression", "comparisonExpression", "additiveExpression", "multiplicativeExpression", 
			"primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'def'", "'return'", "'from'", "'import'", 
			"'as'", "'if'", "'elif'", "'else'", "'for'", "'in'", "'global'", "'and'", 
			"'or'", "'not'", "'True'", "'False'", "'None'", "'print'", "'while'", 
			"'@'", null, null, null, null, "'=='", "'!='", null, null, "'>='", "'<='", 
			null, "'-'", null, null, "'//'", null, null, null, null, null, null, 
			null, null, null, null, null, null, "'{{'", "'{%'", "'{#'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'/>'", null, null, null, null, null, null, null, null, null, 
			"'{'", "'}'", null, null, "'('", "')'", null, null, null, "'%'", null, 
			null, "'~'", null, "'['", "']'", null, "'@import'", "'@media'", "'@font-face'", 
			"'@keyframes'", "'@supports'", null, null, null, null, null, null, null, 
			null, "'}}'", null, "'%}'", null, "'#}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "NEWLINE", "WS", "COMMENT", "DEF", "RETURN", 
			"FROM", "IMPORT", "AS", "IF", "ELIF", "ELSE", "FOR", "IN", "GLOBAL", 
			"AND", "OR", "NOT", "TRUE", "FALSE", "NONE", "PRINT", "WHILE", "AT", 
			"COLON", "SEMI", "COMMA", "ASSIGN", "EQ", "NEQ", "GT", "LT", "GTE", "LTE", 
			"PLUS", "MINUS", "STAR", "SLASH", "SLASHSLASH", "LP", "RP", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "DOT", "NAME", "NUMBER", "TRIPLE_DOUBLE_STRING", 
			"TRIPLE_SINGLE_STRING", "STRING", "JINJA_EXPR_START", "JINJA_STMT_START", 
			"JINJA_COMMENT_START", "TRIPLE_DOUBLE_START", "TRIPLE_SINGLE_START", 
			"TRIPLE_DOUBLE_END", "TRIPLE_SINGLE_END", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML_DECLARATION", "CDATA", "DTD", "SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", 
			"STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "ATTVALUE_VALUE", 
			"SCRIPT_BODY", "STYLE_CLOSE", "CSS_WS", "CSS_COMMENT", "CSS_LBRACE", 
			"CSS_RBRACE", "CSS_COLON", "CSS_SEMICOLON", "CSS_LPAREN", "CSS_RPAREN", 
			"CSS_COMMA", "CSS_DOT", "CSS_SLASH", "CSS_PERCENT", "CSS_PLUS", "CSS_GREATER", 
			"CSS_TILDE", "CSS_EQUALS", "CSS_LBRACKET", "CSS_RBRACKET", "CSS_ASTERISK", 
			"AT_IMPORT", "AT_MEDIA", "AT_FONT_FACE", "AT_KEYFRAMES", "AT_SUPPORTS", 
			"CSS_NUMBER", "COLOR_HEX", "CSS_STRING", "HASH", "CLASS", "PSEUDO_ELEMENT", 
			"PSEUDO_CLASS", "IDENT", "JINJA_EXPR_END", "JINJA_EXPR_CONTENT", "JINJA_STMT_END", 
			"JINJA_STMT_CONTENT", "JINJA_COMMENT_END", "JINJA_COMMENT_CONTENT", "JINJA_STATEMENT", 
			"JINJA_EXPR"
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
		public List<TerminalNode> NEWLINE() { return getTokens(JinjaFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JinjaFlaskParser.NEWLINE, i);
		}
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(104);
				match(NEWLINE);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224944685938461632L) != 0)) {
				{
				{
				setState(110);
				statement();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(111);
					match(NEWLINE);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public TripleQuotedStringContext tripleQuotedString() {
			return getRuleContext(TripleQuotedStringContext.class,0);
		}
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public DecoratedDefContext decoratedDef() {
			return getRuleContext(DecoratedDefContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public GlobalStmtContext globalStmt() {
			return getRuleContext(GlobalStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DefStmtContext defStmt() {
			return getRuleContext(DefStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				importStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				simpleStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				tripleQuotedString();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				decorator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				decoratedDef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				assignmentStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				globalStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				ifStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				forLoop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				whileLoop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(134);
				defStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(135);
				returnStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(136);
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
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JinjaFlaskParser.AT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(JinjaFlaskParser.NEWLINE, 0); }
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
		enterRule(_localctx, 4, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(AT);
			setState(140);
			expression();
			setState(141);
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
	public static class DecoratedDefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(JinjaFlaskParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JinjaFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JinjaFlaskParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratedDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratedDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDecoratedDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDecoratedDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDecoratedDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratedDefContext decoratedDef() throws RecognitionException {
		DecoratedDefContext _localctx = new DecoratedDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decoratedDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(143);
				decorator();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(DEF);
			setState(150);
			match(NAME);
			setState(151);
			match(LP);
			setState(152);
			match(RP);
			setState(153);
			match(COLON);
			setState(154);
			match(NEWLINE);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(155);
				match(NEWLINE);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
	public static class DefStmtContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(JinjaFlaskParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(JinjaFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JinjaFlaskParser.NEWLINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDefStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDefStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefStmtContext defStmt() throws RecognitionException {
		DefStmtContext _localctx = new DefStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(DEF);
			setState(164);
			match(NAME);
			setState(165);
			match(LP);
			setState(166);
			match(RP);
			setState(167);
			match(COLON);
			setState(168);
			match(NEWLINE);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(169);
				match(NEWLINE);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
	public static class SimpleStmtContext extends ParserRuleContext {
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public GlobalStmtContext globalStmt() {
			return getRuleContext(GlobalStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSimpleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleStmt);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				returnStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				importStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				globalStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JinjaFlaskParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(JinjaFlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JinjaFlaskParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JinjaFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JinjaFlaskParser.NEWLINE, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(JinjaFlaskParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(JinjaFlaskParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(JinjaFlaskParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IF);
			setState(185);
			expression();
			setState(186);
			match(COLON);
			setState(187);
			match(NEWLINE);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(188);
				match(NEWLINE);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			block();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(195);
				match(ELIF);
				setState(196);
				expression();
				setState(197);
				match(COLON);
				setState(198);
				match(NEWLINE);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(199);
					match(NEWLINE);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				block();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(212);
				match(ELSE);
				setState(213);
				match(COLON);
				setState(214);
				match(NEWLINE);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(215);
					match(NEWLINE);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				block();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(JinjaFlaskParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(JinjaFlaskParser.DEDENT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(INDENT);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224944685938461632L) != 0)) {
				{
				{
				setState(225);
				statement();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(226);
					match(NEWLINE);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(JinjaFlaskParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(NAME);
			setState(240);
			match(ASSIGN);
			setState(241);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(243);
			match(RETURN);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(244);
				expression();
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
	public static class GlobalStmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(JinjaFlaskParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public GlobalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterGlobalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitGlobalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitGlobalStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStmtContext globalStmt() throws RecognitionException {
		GlobalStmtContext _localctx = new GlobalStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_globalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(GLOBAL);
			setState(248);
			match(NAME);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(249);
				match(COMMA);
				setState(250);
				match(NAME);
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
	public static class ImportStmtContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(JinjaFlaskParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(JinjaFlaskParser.IMPORT, 0); }
		public TerminalNode STAR() { return getToken(JinjaFlaskParser.STAR, 0); }
		public List<TerminalNode> NAME() { return getTokens(JinjaFlaskParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(JinjaFlaskParser.NAME, i);
		}
		public List<TerminalNode> AS() { return getTokens(JinjaFlaskParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(JinjaFlaskParser.AS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
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
		enterRule(_localctx, 22, RULE_importStmt);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(FROM);
				setState(257);
				expression();
				setState(258);
				match(IMPORT);
				setState(276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(259);
					match(STAR);
					}
					break;
				case NAME:
					{
					setState(260);
					match(NAME);
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(261);
						match(AS);
						setState(262);
						match(NAME);
						}
					}

					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(265);
						match(COMMA);
						setState(266);
						match(NAME);
						setState(269);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AS) {
							{
							setState(267);
							match(AS);
							setState(268);
							match(NAME);
							}
						}

						}
						}
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(IMPORT);
				setState(279);
				match(NAME);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(280);
					match(AS);
					setState(281);
					match(NAME);
					}
				}

				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(284);
					match(COMMA);
					setState(285);
					match(NAME);
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(286);
						match(AS);
						setState(287);
						match(NAME);
						}
					}

					}
					}
					setState(294);
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(JinjaFlaskParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode IN() { return getToken(JinjaFlaskParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(FOR);
			setState(298);
			match(NAME);
			setState(299);
			match(IN);
			setState(300);
			expression();
			setState(301);
			match(COLON);
			setState(302);
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
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(JinjaFlaskParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(WHILE);
			setState(305);
			expression();
			setState(306);
			match(COLON);
			setState(307);
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
	public static class TripleQuotedStringContext extends ParserRuleContext {
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public TerminalNode TRIPLE_DOUBLE_START() { return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_START, 0); }
		public TerminalNode TRIPLE_SINGLE_START() { return getToken(JinjaFlaskParser.TRIPLE_SINGLE_START, 0); }
		public TerminalNode TRIPLE_DOUBLE_END() { return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_END, 0); }
		public TerminalNode TRIPLE_SINGLE_END() { return getToken(JinjaFlaskParser.TRIPLE_SINGLE_END, 0); }
		public TripleQuotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tripleQuotedString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTripleQuotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTripleQuotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTripleQuotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TripleQuotedStringContext tripleQuotedString() throws RecognitionException {
		TripleQuotedStringContext _localctx = new TripleQuotedStringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tripleQuotedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !(_la==TRIPLE_DOUBLE_START || _la==TRIPLE_SINGLE_START) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(310);
			document();
			setState(311);
			_la = _input.LA(1);
			if ( !(_la==TRIPLE_DOUBLE_END || _la==TRIPLE_SINGLE_END) ) {
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
	public static class DocumentContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> SCRIPTLET() { return getTokens(JinjaFlaskParser.SCRIPTLET); }
		public TerminalNode SCRIPTLET(int i) {
			return getToken(JinjaFlaskParser.SCRIPTLET, i);
		}
		public List<TerminalNode> SEA_WS() { return getTokens(JinjaFlaskParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(JinjaFlaskParser.SEA_WS, i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCRIPTLET || _la==SEA_WS) {
				{
				{
				setState(313);
				_la = _input.LA(1);
				if ( !(_la==SCRIPTLET || _la==SEA_WS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE_OPEN || _la==TAG_OPEN) {
				{
				{
				setState(319);
				element();
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SCRIPTLET || _la==SEA_WS) {
					{
					{
					setState(320);
					_la = _input.LA(1);
					if ( !(_la==SCRIPTLET || _la==SEA_WS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(330);
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
	public static class ContentContext extends ParserRuleContext {
		public List<TerminalNode> HTML_TEXT() { return getTokens(JinjaFlaskParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(JinjaFlaskParser.HTML_TEXT, i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(JinjaFlaskParser.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(JinjaFlaskParser.CDATA, i);
		}
		public List<TerminalNode> SCRIPTLET() { return getTokens(JinjaFlaskParser.SCRIPTLET); }
		public TerminalNode SCRIPTLET(int i) {
			return getToken(JinjaFlaskParser.SCRIPTLET, i);
		}
		public List<TerminalNode> JINJA_EXPR_START() { return getTokens(JinjaFlaskParser.JINJA_EXPR_START); }
		public TerminalNode JINJA_EXPR_START(int i) {
			return getToken(JinjaFlaskParser.JINJA_EXPR_START, i);
		}
		public List<TerminalNode> JINJA_EXPR_CONTENT() { return getTokens(JinjaFlaskParser.JINJA_EXPR_CONTENT); }
		public TerminalNode JINJA_EXPR_CONTENT(int i) {
			return getToken(JinjaFlaskParser.JINJA_EXPR_CONTENT, i);
		}
		public List<TerminalNode> JINJA_EXPR_END() { return getTokens(JinjaFlaskParser.JINJA_EXPR_END); }
		public TerminalNode JINJA_EXPR_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_EXPR_END, i);
		}
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(JinjaFlaskParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_START, i);
		}
		public List<TerminalNode> JINJA_STMT_CONTENT() { return getTokens(JinjaFlaskParser.JINJA_STMT_CONTENT); }
		public TerminalNode JINJA_STMT_CONTENT(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_CONTENT, i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(JinjaFlaskParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT_END, i);
		}
		public List<TerminalNode> JINJA_COMMENT_START() { return getTokens(JinjaFlaskParser.JINJA_COMMENT_START); }
		public TerminalNode JINJA_COMMENT_START(int i) {
			return getToken(JinjaFlaskParser.JINJA_COMMENT_START, i);
		}
		public List<TerminalNode> JINJA_COMMENT_CONTENT() { return getTokens(JinjaFlaskParser.JINJA_COMMENT_CONTENT); }
		public TerminalNode JINJA_COMMENT_CONTENT(int i) {
			return getToken(JinjaFlaskParser.JINJA_COMMENT_CONTENT, i);
		}
		public List<TerminalNode> JINJA_COMMENT_END() { return getTokens(JinjaFlaskParser.JINJA_COMMENT_END); }
		public TerminalNode JINJA_COMMENT_END(int i) {
			return getToken(JinjaFlaskParser.JINJA_COMMENT_END, i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(344);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HTML_TEXT:
						{
						setState(331);
						match(HTML_TEXT);
						}
						break;
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(332);
						element();
						}
						break;
					case CDATA:
						{
						setState(333);
						match(CDATA);
						}
						break;
					case SCRIPTLET:
						{
						setState(334);
						match(SCRIPTLET);
						}
						break;
					case JINJA_EXPR_START:
						{
						setState(335);
						match(JINJA_EXPR_START);
						setState(336);
						match(JINJA_EXPR_CONTENT);
						setState(337);
						match(JINJA_EXPR_END);
						}
						break;
					case JINJA_STMT_START:
						{
						setState(338);
						match(JINJA_STMT_START);
						setState(339);
						match(JINJA_STMT_CONTENT);
						setState(340);
						match(JINJA_STMT_END);
						}
						break;
					case JINJA_COMMENT_START:
						{
						setState(341);
						match(JINJA_COMMENT_START);
						setState(342);
						match(JINJA_COMMENT_CONTENT);
						setState(343);
						match(JINJA_COMMENT_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class ElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(JinjaFlaskParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(JinjaFlaskParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(JinjaFlaskParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(JinjaFlaskParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(JinjaFlaskParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(JinjaFlaskParser.TAG_CLOSE, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(JinjaFlaskParser.TAG_SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(JinjaFlaskParser.TAG_SLASH_CLOSE, 0); }
		public StyleElementContext styleElement() {
			return getRuleContext(StyleElementContext.class,0);
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
		enterRule(_localctx, 34, RULE_element);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(TAG_OPEN);
				setState(350);
				match(TAG_NAME);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(351);
					attribute();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357);
				match(TAG_CLOSE);
				setState(358);
				content();
				setState(359);
				match(TAG_OPEN);
				setState(360);
				match(TAG_SLASH);
				setState(361);
				match(TAG_NAME);
				setState(362);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(TAG_OPEN);
				setState(365);
				match(TAG_NAME);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(366);
					attribute();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(TAG_OPEN);
				setState(374);
				match(TAG_NAME);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(375);
					attribute();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				match(TAG_CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				styleElement();
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(JinjaFlaskParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(JinjaFlaskParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(JinjaFlaskParser.ATTVALUE_VALUE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(TAG_NAME);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(386);
				match(TAG_EQUALS);
				setState(387);
				match(ATTVALUE_VALUE);
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
	public static class StyleElementContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(JinjaFlaskParser.STYLE_OPEN, 0); }
		public StyleContentContext styleContent() {
			return getRuleContext(StyleContentContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(JinjaFlaskParser.STYLE_CLOSE, 0); }
		public StyleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementContext styleElement() throws RecognitionException {
		StyleElementContext _localctx = new StyleElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_styleElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(STYLE_OPEN);
			setState(391);
			styleContent();
			setState(392);
			match(STYLE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContentContext extends ParserRuleContext {
		public List<CssStatementContext> cssStatement() {
			return getRuleContexts(CssStatementContext.class);
		}
		public CssStatementContext cssStatement(int i) {
			return getRuleContext(CssStatementContext.class,i);
		}
		public List<TerminalNode> JINJA_STATEMENT() { return getTokens(JinjaFlaskParser.JINJA_STATEMENT); }
		public TerminalNode JINJA_STATEMENT(int i) {
			return getToken(JinjaFlaskParser.JINJA_STATEMENT, i);
		}
		public StyleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterStyleContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitStyleContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitStyleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContentContext styleContent() throws RecognitionException {
		StyleContentContext _localctx = new StyleContentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_styleContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 4257917L) != 0)) {
				{
				setState(396);
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
					setState(394);
					cssStatement();
					}
					break;
				case JINJA_STATEMENT:
					{
					setState(395);
					match(JINJA_STATEMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
	public static class CssStatementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public CssStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCssStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCssStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCssStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStatementContext cssStatement() throws RecognitionException {
		CssStatementContext _localctx = new CssStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cssStatement);
		try {
			setState(403);
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
				setState(401);
				ruleset();
				}
				break;
			case AT_IMPORT:
			case AT_MEDIA:
			case AT_FONT_FACE:
			case AT_KEYFRAMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
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
		enterRule(_localctx, 44, RULE_ruleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			selectorGroup();
			setState(406);
			match(CSS_LBRACE);
			setState(407);
			declarationBlock();
			setState(408);
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
		enterRule(_localctx, 46, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			selector();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(411);
				match(CSS_COMMA);
				setState(412);
				selector();
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
		enterRule(_localctx, 48, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			simpleSelectorSequence();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 1015895L) != 0)) {
				{
				{
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 7L) != 0)) {
					{
					setState(419);
					combinator();
					}
				}

				setState(422);
				simpleSelectorSequence();
				}
				}
				setState(427);
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
		enterRule(_localctx, 50, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 7L) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_simpleSelectorSequence);
		try {
			int _alt;
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_ASTERISK:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(430);
					typeSelector();
					}
					break;
				case CSS_ASTERISK:
					{
					setState(431);
					universal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(438);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(434);
							hash();
							}
							break;
						case CLASS:
							{
							setState(435);
							classSelector();
							}
							break;
						case PSEUDO_ELEMENT:
						case PSEUDO_CLASS:
							{
							setState(436);
							pseudo();
							}
							break;
						case CSS_LBRACKET:
							{
							setState(437);
							attributeSelector();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(442);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
				setState(447); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(447);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case HASH:
							{
							setState(443);
							hash();
							}
							break;
						case CLASS:
							{
							setState(444);
							classSelector();
							}
							break;
						case PSEUDO_ELEMENT:
						case PSEUDO_CLASS:
							{
							setState(445);
							pseudo();
							}
							break;
						case CSS_LBRACKET:
							{
							setState(446);
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
					setState(449); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public ClassSelectorContext classSelector() {
			return getRuleContext(ClassSelectorContext.class,0);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public AttributeSelectorContext attributeSelector() {
			return getRuleContext(AttributeSelectorContext.class,0);
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
		enterRule(_localctx, 54, RULE_simpleSelector);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				typeSelector();
				}
				break;
			case CSS_ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				universal();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
				hash();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				classSelector();
				}
				break;
			case PSEUDO_ELEMENT:
			case PSEUDO_CLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(457);
				pseudo();
				}
				break;
			case CSS_LBRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(458);
				attributeSelector();
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
		enterRule(_localctx, 56, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
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
		enterRule(_localctx, 58, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
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
		enterRule(_localctx, 60, RULE_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
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
		enterRule(_localctx, 62, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		enterRule(_localctx, 64, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 66, RULE_attributeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(CSS_LBRACKET);
			setState(472);
			match(IDENT);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_EQUALS) {
				{
				setState(473);
				match(CSS_EQUALS);
				setState(474);
				value();
				}
			}

			setState(477);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode AT_MEDIA() { return getToken(JinjaFlaskParser.AT_MEDIA, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> JINJA_STATEMENT() { return getTokens(JinjaFlaskParser.JINJA_STATEMENT); }
		public TerminalNode JINJA_STATEMENT(int i) {
			return getToken(JinjaFlaskParser.JINJA_STATEMENT, i);
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
		enterRule(_localctx, 68, RULE_atRule);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(AT_IMPORT);
				setState(482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_STRING:
					{
					setState(480);
					match(CSS_STRING);
					}
					break;
				case IDENT:
					{
					setState(481);
					functionCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(484);
				importTerminator();
				}
				break;
			case AT_MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(AT_MEDIA);
				setState(486);
				mediaQueryList();
				setState(487);
				match(CSS_LBRACE);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224944685938461632L) != 0) || _la==JINJA_STATEMENT) {
					{
					setState(490);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
					case RETURN:
					case FROM:
					case IMPORT:
					case IF:
					case FOR:
					case GLOBAL:
					case NOT:
					case TRUE:
					case FALSE:
					case NONE:
					case WHILE:
					case AT:
					case LP:
					case LBRACK:
					case LBRACE:
					case NAME:
					case NUMBER:
					case TRIPLE_DOUBLE_STRING:
					case TRIPLE_SINGLE_STRING:
					case STRING:
					case TRIPLE_DOUBLE_START:
					case TRIPLE_SINGLE_START:
						{
						setState(488);
						statement();
						}
						break;
					case JINJA_STATEMENT:
						{
						setState(489);
						match(JINJA_STATEMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				match(CSS_RBRACE);
				}
				break;
			case AT_FONT_FACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(AT_FONT_FACE);
				setState(498);
				match(CSS_LBRACE);
				setState(499);
				declarationBlock();
				setState(500);
				match(CSS_RBRACE);
				}
				break;
			case AT_KEYFRAMES:
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				match(AT_KEYFRAMES);
				setState(503);
				match(IDENT);
				setState(504);
				match(CSS_LBRACE);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 135274497L) != 0)) {
					{
					setState(507);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_PERCENT:
					case CSS_NUMBER:
					case IDENT:
						{
						setState(505);
						keyframeBlock();
						}
						break;
					case JINJA_STATEMENT:
						{
						setState(506);
						match(JINJA_STATEMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
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
		enterRule(_localctx, 70, RULE_importTerminator);
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				mediaQueryList();
				setState(516);
				match(CSS_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
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
		enterRule(_localctx, 72, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			mediaQuery();
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(522);
				match(CSS_COMMA);
				setState(523);
				mediaQuery();
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
		enterRule(_localctx, 74, RULE_mediaQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(529);
				match(IDENT);
				}
				break;
			}
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(532);
				match(IDENT);
				}
				break;
			}
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_LPAREN) {
				{
				setState(535);
				match(CSS_LPAREN);
				setState(536);
				declaration();
				setState(537);
				match(CSS_RPAREN);
				}
			}

			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(541);
				match(IDENT);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_LPAREN) {
					{
					setState(542);
					match(CSS_LPAREN);
					setState(543);
					declaration();
					setState(544);
					match(CSS_RPAREN);
					}
				}

				}
				}
				setState(552);
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
		public List<TerminalNode> JINJA_STATEMENT() { return getTokens(JinjaFlaskParser.JINJA_STATEMENT); }
		public TerminalNode JINJA_STATEMENT(int i) {
			return getToken(JinjaFlaskParser.JINJA_STATEMENT, i);
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
		enterRule(_localctx, 76, RULE_declarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT || _la==JINJA_STATEMENT) {
				{
				setState(558);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(553);
					declaration();
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CSS_SEMICOLON) {
						{
						setState(554);
						match(CSS_SEMICOLON);
						}
					}

					}
					break;
				case JINJA_STATEMENT:
					{
					setState(557);
					match(JINJA_STATEMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(562);
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
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
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
		enterRule(_localctx, 78, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			propertyName();
			setState(564);
			match(CSS_COLON);
			setState(565);
			valueList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 80, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
	public static class ValueContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
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
		enterRule(_localctx, 82, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(569);
					term();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(572); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
	public static class TermContext extends ParserRuleContext {
		public TerminalNode CSS_NUMBER() { return getToken(JinjaFlaskParser.CSS_NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public TerminalNode CSS_PERCENT() { return getToken(JinjaFlaskParser.CSS_PERCENT, 0); }
		public TerminalNode CSS_STRING() { return getToken(JinjaFlaskParser.CSS_STRING, 0); }
		public TerminalNode COLOR_HEX() { return getToken(JinjaFlaskParser.COLOR_HEX, 0); }
		public TerminalNode HASH() { return getToken(JinjaFlaskParser.HASH, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode JINJA_EXPR() { return getToken(JinjaFlaskParser.JINJA_EXPR, 0); }
		public TerminalNode JINJA_STATEMENT() { return getToken(JinjaFlaskParser.JINJA_STATEMENT, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
		public TerminalNode CSS_SLASH() { return getToken(JinjaFlaskParser.CSS_SLASH, 0); }
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
		enterRule(_localctx, 84, RULE_term);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				match(CSS_NUMBER);
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(575);
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
				setState(578);
				match(CSS_STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(579);
				match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(580);
				match(COLOR_HEX);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(581);
				match(HASH);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(583);
				match(JINJA_EXPR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(584);
				match(JINJA_STATEMENT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(585);
				match(CSS_LPAREN);
				setState(586);
				value();
				setState(587);
				match(CSS_RPAREN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(589);
				match(CSS_SLASH);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
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
		enterRule(_localctx, 86, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(IDENT);
			setState(593);
			match(CSS_LPAREN);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 12922388497L) != 0)) {
				{
				setState(594);
				valueList();
				}
			}

			setState(597);
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
	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			value();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(600);
				match(CSS_COMMA);
				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(601);
					value();
					}
					break;
				case 2:
					{
					setState(602);
					functionCall();
					}
					break;
				}
				}
				}
				setState(609);
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
		enterRule(_localctx, 90, RULE_keyframeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			keyframeSelector();
			setState(611);
			match(CSS_LBRACE);
			setState(612);
			declarationBlock();
			setState(613);
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
		enterRule(_localctx, 92, RULE_keyframeSelector);
		int _la;
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_PERCENT:
			case CSS_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				_la = _input.LA(1);
				if ( !(_la==CSS_PERCENT || _la==CSS_NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COMMA) {
					{
					{
					setState(616);
					match(CSS_COMMA);
					setState(617);
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
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotOpContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(JinjaFlaskParser.NOT, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public NotOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterNotOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitNotOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitNotOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOpContext extends ExpressionContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JinjaFlaskParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JinjaFlaskParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(JinjaFlaskParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JinjaFlaskParser.OR, i);
		}
		public LogicalOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expression);
		int _la;
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NONE:
			case LP:
			case LBRACK:
			case LBRACE:
			case NAME:
			case NUMBER:
			case TRIPLE_DOUBLE_STRING:
			case TRIPLE_SINGLE_STRING:
			case STRING:
				_localctx = new LogicalOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				comparisonExpression();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(627);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(628);
					comparisonExpression();
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NOT:
				_localctx = new NotOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(NOT);
				setState(635);
				comparisonExpression();
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
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
	 
		public ComparisonExpressionContext() { }
		public void copyFrom(ComparisonExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOpContext extends ComparisonExpressionContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(JinjaFlaskParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(JinjaFlaskParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(JinjaFlaskParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(JinjaFlaskParser.NEQ, i);
		}
		public List<TerminalNode> GT() { return getTokens(JinjaFlaskParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JinjaFlaskParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(JinjaFlaskParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JinjaFlaskParser.LT, i);
		}
		public List<TerminalNode> GTE() { return getTokens(JinjaFlaskParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(JinjaFlaskParser.GTE, i);
		}
		public List<TerminalNode> LTE() { return getTokens(JinjaFlaskParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(JinjaFlaskParser.LTE, i);
		}
		public ComparisonOpContext(ComparisonExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterComparisonOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitComparisonOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitComparisonOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_comparisonExpression);
		int _la;
		try {
			_localctx = new ComparisonOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			additiveExpression();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) {
				{
				{
				setState(639);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(640);
				additiveExpression();
				}
				}
				setState(645);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveOpContext extends AdditiveExpressionContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(JinjaFlaskParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JinjaFlaskParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JinjaFlaskParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JinjaFlaskParser.MINUS, i);
		}
		public AdditiveOpContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAdditiveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAdditiveOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAdditiveOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_additiveExpression);
		int _la;
		try {
			_localctx = new AdditiveOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			multiplicativeExpression();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(647);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(648);
				multiplicativeExpression();
				}
				}
				setState(653);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeOpContext extends MultiplicativeExpressionContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(JinjaFlaskParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(JinjaFlaskParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(JinjaFlaskParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(JinjaFlaskParser.SLASH, i);
		}
		public MultiplicativeOpContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterMultiplicativeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitMultiplicativeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitMultiplicativeOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_multiplicativeExpression);
		int _la;
		try {
			_localctx = new MultiplicativeOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			primaryExpression();
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH) {
				{
				{
				setState(655);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(656);
				primaryExpression();
				}
				}
				setState(661);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends PrimaryExpressionContext {
		public TerminalNode NUMBER() { return getToken(JinjaFlaskParser.NUMBER, 0); }
		public NumberContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class DictOrSetLiteralContext extends PrimaryExpressionContext {
		public TerminalNode LBRACE() { return getToken(JinjaFlaskParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JinjaFlaskParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(JinjaFlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JinjaFlaskParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public DictOrSetLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterDictOrSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitDictOrSetLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitDictOrSetLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends PrimaryExpressionContext {
		public TerminalNode STRING() { return getToken(JinjaFlaskParser.STRING, 0); }
		public StringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TripleSingleStringContext extends PrimaryExpressionContext {
		public TerminalNode TRIPLE_SINGLE_STRING() { return getToken(JinjaFlaskParser.TRIPLE_SINGLE_STRING, 0); }
		public TripleSingleStringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTripleSingleString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTripleSingleString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTripleSingleString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends PrimaryExpressionContext {
		public TerminalNode TRUE() { return getToken(JinjaFlaskParser.TRUE, 0); }
		public TrueContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends PrimaryExpressionContext {
		public TerminalNode FALSE() { return getToken(JinjaFlaskParser.FALSE, 0); }
		public FalseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends PrimaryExpressionContext {
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public NameContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends PrimaryExpressionContext {
		public TerminalNode LBRACK() { return getToken(JinjaFlaskParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JinjaFlaskParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public ListLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class NoneContext extends PrimaryExpressionContext {
		public TerminalNode NONE() { return getToken(JinjaFlaskParser.NONE, 0); }
		public NoneContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitNone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisContext extends PrimaryExpressionContext {
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public ParenthesisContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TripleDoubleStringContext extends PrimaryExpressionContext {
		public TerminalNode TRIPLE_DOUBLE_STRING() { return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_STRING, 0); }
		public TripleDoubleStringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterTripleDoubleString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitTripleDoubleString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitTripleDoubleString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_primaryExpression);
		int _la;
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(STRING);
				}
				break;
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(665);
				match(FALSE);
				}
				break;
			case NONE:
				_localctx = new NoneContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(666);
				match(NONE);
				}
				break;
			case NAME:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(667);
				match(NAME);
				}
				break;
			case LP:
				_localctx = new ParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(668);
				match(LP);
				setState(669);
				expression();
				setState(670);
				match(RP);
				}
				break;
			case LBRACK:
				_localctx = new ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(672);
				match(LBRACK);
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903774261248L) != 0)) {
					{
					setState(673);
					expression();
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(674);
						match(COMMA);
						setState(675);
						expression();
						}
						}
						setState(680);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(683);
				match(RBRACK);
				}
				break;
			case TRIPLE_DOUBLE_STRING:
				_localctx = new TripleDoubleStringContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(684);
				match(TRIPLE_DOUBLE_STRING);
				}
				break;
			case TRIPLE_SINGLE_STRING:
				_localctx = new TripleSingleStringContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(685);
				match(TRIPLE_SINGLE_STRING);
				}
				break;
			case LBRACE:
				_localctx = new DictOrSetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(686);
				match(LBRACE);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903774261248L) != 0)) {
					{
					setState(687);
					expression();
					setState(690);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(688);
						match(COLON);
						setState(689);
						expression();
						}
					}

					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(692);
						match(COMMA);
						setState(693);
						expression();
						setState(696);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(694);
							match(COLON);
							setState(695);
							expression();
							}
						}

						}
						}
						setState(702);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(705);
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

	public static final String _serializedATN =
		"\u0004\u0001w\u02c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u0001\u0000\u0005\u0000j\b\u0000\n\u0000\f\u0000"+
		"m\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000q\b\u0000\n\u0000\f\u0000"+
		"t\t\u0000\u0005\u0000v\b\u0000\n\u0000\f\u0000y\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u008a\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0005\u0003\u0091\b\u0003\n\u0003\f\u0003"+
		"\u0094\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u009d\b\u0003\n\u0003\f\u0003\u00a0"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00ab\b\u0004\n"+
		"\u0004\f\u0004\u00ae\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b7\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00be"+
		"\b\u0006\n\u0006\f\u0006\u00c1\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c9\b\u0006\n\u0006"+
		"\f\u0006\u00cc\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00d0\b\u0006"+
		"\n\u0006\f\u0006\u00d3\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00d9\b\u0006\n\u0006\f\u0006\u00dc\t\u0006\u0001\u0006"+
		"\u0003\u0006\u00df\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00e4\b\u0007\n\u0007\f\u0007\u00e7\t\u0007\u0005\u0007\u00e9\b\u0007"+
		"\n\u0007\f\u0007\u00ec\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00f6\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00fc\b\n\n\n\f\n\u00ff\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0108\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u010e\b\u000b\u0005\u000b\u0110\b\u000b\n\u000b\f\u000b\u0113\t\u000b"+
		"\u0003\u000b\u0115\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u011b\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0121\b\u000b\u0005\u000b\u0123\b\u000b\n\u000b\f\u000b\u0126"+
		"\t\u000b\u0003\u000b\u0128\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0005\u000f\u013b\b\u000f"+
		"\n\u000f\f\u000f\u013e\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0142"+
		"\b\u000f\n\u000f\f\u000f\u0145\t\u000f\u0005\u000f\u0147\b\u000f\n\u000f"+
		"\f\u000f\u014a\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0159\b\u0010\n\u0010"+
		"\f\u0010\u015c\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0161\b\u0011\n\u0011\f\u0011\u0164\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0170\b\u0011\n\u0011\f\u0011\u0173\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0179\b\u0011"+
		"\n\u0011\f\u0011\u017c\t\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0180"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0185\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u018d\b\u0014\n\u0014\f\u0014\u0190\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0194\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u019e"+
		"\b\u0017\n\u0017\f\u0017\u01a1\t\u0017\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u01a5\b\u0018\u0001\u0018\u0005\u0018\u01a8\b\u0018\n\u0018\f\u0018\u01ab"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u01b1"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01b7"+
		"\b\u001a\n\u001a\f\u001a\u01ba\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0004\u001a\u01c0\b\u001a\u000b\u001a\f\u001a\u01c1\u0003"+
		"\u001a\u01c4\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01cc\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u01dc\b!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01e3\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u01eb\b\"\n\"\f\"\u01ee\t\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0005\"\u01fc\b\"\n\"\f\"\u01ff\t\"\u0001\"\u0003\"\u0202\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u0208\b#\u0001$\u0001$\u0001$\u0005$\u020d"+
		"\b$\n$\f$\u0210\t$\u0001%\u0003%\u0213\b%\u0001%\u0003%\u0216\b%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u021c\b%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u0223\b%\u0005%\u0225\b%\n%\f%\u0228\t%\u0001&\u0001&\u0003&"+
		"\u022c\b&\u0001&\u0005&\u022f\b&\n&\f&\u0232\t&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001)\u0004)\u023b\b)\u000b)\f)\u023c\u0001"+
		"*\u0001*\u0003*\u0241\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u024f\b*\u0001+\u0001+\u0001"+
		"+\u0003+\u0254\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0003,\u025c"+
		"\b,\u0005,\u025e\b,\n,\f,\u0261\t,\u0001-\u0001-\u0001-\u0001-\u0001-"+
		"\u0001.\u0001.\u0001.\u0005.\u026b\b.\n.\f.\u026e\t.\u0001.\u0003.\u0271"+
		"\b.\u0001/\u0001/\u0001/\u0005/\u0276\b/\n/\f/\u0279\t/\u0001/\u0001/"+
		"\u0003/\u027d\b/\u00010\u00010\u00010\u00050\u0282\b0\n0\f0\u0285\t0\u0001"+
		"1\u00011\u00011\u00051\u028a\b1\n1\f1\u028d\t1\u00012\u00012\u00012\u0005"+
		"2\u0292\b2\n2\f2\u0295\t2\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00053\u02a5\b3\n3"+
		"\f3\u02a8\t3\u00033\u02aa\b3\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00033\u02b3\b3\u00013\u00013\u00013\u00013\u00033\u02b9\b3\u0005"+
		"3\u02bb\b3\n3\f3\u02be\t3\u00033\u02c0\b3\u00013\u00033\u02c3\b3\u0001"+
		"3\u0000\u00004\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u000b"+
		"\u0001\u000089\u0001\u0000:;\u0001\u0000AB\u0001\u0000\\^\u0001\u0000"+
		"mn\u0002\u0000[[oo\u0002\u0000[[hh\u0001\u0000\u0011\u0012\u0001\u0000"+
		"\u001e#\u0001\u0000$%\u0001\u0000&\'\u0315\u0000k\u0001\u0000\u0000\u0000"+
		"\u0002\u0089\u0001\u0000\u0000\u0000\u0004\u008b\u0001\u0000\u0000\u0000"+
		"\u0006\u0092\u0001\u0000\u0000\u0000\b\u00a3\u0001\u0000\u0000\u0000\n"+
		"\u00b6\u0001\u0000\u0000\u0000\f\u00b8\u0001\u0000\u0000\u0000\u000e\u00e0"+
		"\u0001\u0000\u0000\u0000\u0010\u00ef\u0001\u0000\u0000\u0000\u0012\u00f3"+
		"\u0001\u0000\u0000\u0000\u0014\u00f7\u0001\u0000\u0000\u0000\u0016\u0127"+
		"\u0001\u0000\u0000\u0000\u0018\u0129\u0001\u0000\u0000\u0000\u001a\u0130"+
		"\u0001\u0000\u0000\u0000\u001c\u0135\u0001\u0000\u0000\u0000\u001e\u013c"+
		"\u0001\u0000\u0000\u0000 \u015a\u0001\u0000\u0000\u0000\"\u017f\u0001"+
		"\u0000\u0000\u0000$\u0181\u0001\u0000\u0000\u0000&\u0186\u0001\u0000\u0000"+
		"\u0000(\u018e\u0001\u0000\u0000\u0000*\u0193\u0001\u0000\u0000\u0000,"+
		"\u0195\u0001\u0000\u0000\u0000.\u019a\u0001\u0000\u0000\u00000\u01a2\u0001"+
		"\u0000\u0000\u00002\u01ac\u0001\u0000\u0000\u00004\u01c3\u0001\u0000\u0000"+
		"\u00006\u01cb\u0001\u0000\u0000\u00008\u01cd\u0001\u0000\u0000\u0000:"+
		"\u01cf\u0001\u0000\u0000\u0000<\u01d1\u0001\u0000\u0000\u0000>\u01d3\u0001"+
		"\u0000\u0000\u0000@\u01d5\u0001\u0000\u0000\u0000B\u01d7\u0001\u0000\u0000"+
		"\u0000D\u0201\u0001\u0000\u0000\u0000F\u0207\u0001\u0000\u0000\u0000H"+
		"\u0209\u0001\u0000\u0000\u0000J\u0212\u0001\u0000\u0000\u0000L\u0230\u0001"+
		"\u0000\u0000\u0000N\u0233\u0001\u0000\u0000\u0000P\u0237\u0001\u0000\u0000"+
		"\u0000R\u023a\u0001\u0000\u0000\u0000T\u024e\u0001\u0000\u0000\u0000V"+
		"\u0250\u0001\u0000\u0000\u0000X\u0257\u0001\u0000\u0000\u0000Z\u0262\u0001"+
		"\u0000\u0000\u0000\\\u0270\u0001\u0000\u0000\u0000^\u027c\u0001\u0000"+
		"\u0000\u0000`\u027e\u0001\u0000\u0000\u0000b\u0286\u0001\u0000\u0000\u0000"+
		"d\u028e\u0001\u0000\u0000\u0000f\u02c2\u0001\u0000\u0000\u0000hj\u0005"+
		"\u0003\u0000\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lw\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000nr\u0003\u0002\u0001\u0000oq\u0005\u0003"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000un\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0000\u0000\u0001{\u0001"+
		"\u0001\u0000\u0000\u0000|\u008a\u0003\u0016\u000b\u0000}\u008a\u0003\n"+
		"\u0005\u0000~\u008a\u0003\u001c\u000e\u0000\u007f\u008a\u0003\u0004\u0002"+
		"\u0000\u0080\u008a\u0003\u0006\u0003\u0000\u0081\u008a\u0003\u0010\b\u0000"+
		"\u0082\u008a\u0003\u0014\n\u0000\u0083\u008a\u0003\f\u0006\u0000\u0084"+
		"\u008a\u0003\u0018\f\u0000\u0085\u008a\u0003\u001a\r\u0000\u0086\u008a"+
		"\u0003\b\u0004\u0000\u0087\u008a\u0003\u0012\t\u0000\u0088\u008a\u0003"+
		"^/\u0000\u0089|\u0001\u0000\u0000\u0000\u0089}\u0001\u0000\u0000\u0000"+
		"\u0089~\u0001\u0000\u0000\u0000\u0089\u007f\u0001\u0000\u0000\u0000\u0089"+
		"\u0080\u0001\u0000\u0000\u0000\u0089\u0081\u0001\u0000\u0000\u0000\u0089"+
		"\u0082\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000\u0000\u0089"+
		"\u0084\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u0089"+
		"\u0086\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0003\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0005\u0019\u0000\u0000\u008c\u008d\u0003^/\u0000\u008d\u008e\u0005"+
		"\u0003\u0000\u0000\u008e\u0005\u0001\u0000\u0000\u0000\u008f\u0091\u0003"+
		"\u0004\u0002\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\u0006\u0000\u0000\u0096\u0097\u0005"+
		"0\u0000\u0000\u0097\u0098\u0005)\u0000\u0000\u0098\u0099\u0005*\u0000"+
		"\u0000\u0099\u009a\u0005\u001a\u0000\u0000\u009a\u009e\u0005\u0003\u0000"+
		"\u0000\u009b\u009d\u0005\u0003\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u000e\u0007"+
		"\u0000\u00a2\u0007\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0006\u0000"+
		"\u0000\u00a4\u00a5\u00050\u0000\u0000\u00a5\u00a6\u0005)\u0000\u0000\u00a6"+
		"\u00a7\u0005*\u0000\u0000\u00a7\u00a8\u0005\u001a\u0000\u0000\u00a8\u00ac"+
		"\u0005\u0003\u0000\u0000\u00a9\u00ab\u0005\u0003\u0000\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0003\u000e\u0007\u0000\u00b0\t\u0001\u0000\u0000\u0000\u00b1\u00b7\u0003"+
		"\u0010\b\u0000\u00b2\u00b7\u0003\u0012\t\u0000\u00b3\u00b7\u0003\u0016"+
		"\u000b\u0000\u00b4\u00b7\u0003\u0014\n\u0000\u00b5\u00b7\u0003^/\u0000"+
		"\u00b6\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u000b\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0005\u000b\u0000\u0000\u00b9\u00ba\u0003^/\u0000\u00ba\u00bb"+
		"\u0005\u001a\u0000\u0000\u00bb\u00bf\u0005\u0003\u0000\u0000\u00bc\u00be"+
		"\u0005\u0003\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00d1\u0003\u000e\u0007\u0000\u00c3\u00c4"+
		"\u0005\f\u0000\u0000\u00c4\u00c5\u0003^/\u0000\u00c5\u00c6\u0005\u001a"+
		"\u0000\u0000\u00c6\u00ca\u0005\u0003\u0000\u0000\u00c7\u00c9\u0005\u0003"+
		"\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0003\u000e\u0007\u0000\u00ce\u00d0\u0001\u0000"+
		"\u0000\u0000\u00cf\u00c3\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00de\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005\r\u0000\u0000\u00d5\u00d6\u0005\u001a\u0000"+
		"\u0000\u00d6\u00da\u0005\u0003\u0000\u0000\u00d7\u00d9\u0005\u0003\u0000"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0003\u000e\u0007\u0000\u00de\u00d4\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\r\u0001\u0000\u0000\u0000"+
		"\u00e0\u00ea\u0005\u0001\u0000\u0000\u00e1\u00e5\u0003\u0002\u0001\u0000"+
		"\u00e2\u00e4\u0005\u0003\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0002\u0000\u0000"+
		"\u00ee\u000f\u0001\u0000\u0000\u0000\u00ef\u00f0\u00050\u0000\u0000\u00f0"+
		"\u00f1\u0005\u001d\u0000\u0000\u00f1\u00f2\u0003^/\u0000\u00f2\u0011\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0005\u0007\u0000\u0000\u00f4\u00f6\u0003"+
		"^/\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u0013\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0010\u0000"+
		"\u0000\u00f8\u00fd\u00050\u0000\u0000\u00f9\u00fa\u0005\u001c\u0000\u0000"+
		"\u00fa\u00fc\u00050\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u0015\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u0100\u0101\u0005\b\u0000\u0000\u0101\u0102"+
		"\u0003^/\u0000\u0102\u0114\u0005\t\u0000\u0000\u0103\u0115\u0005&\u0000"+
		"\u0000\u0104\u0107\u00050\u0000\u0000\u0105\u0106\u0005\n\u0000\u0000"+
		"\u0106\u0108\u00050\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0111\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005\u001c\u0000\u0000\u010a\u010d\u00050\u0000\u0000\u010b\u010c"+
		"\u0005\n\u0000\u0000\u010c\u010e\u00050\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001"+
		"\u0000\u0000\u0000\u010f\u0109\u0001\u0000\u0000\u0000\u0110\u0113\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0114\u0103\u0001\u0000\u0000\u0000\u0114\u0104\u0001"+
		"\u0000\u0000\u0000\u0115\u0128\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		"\t\u0000\u0000\u0117\u011a\u00050\u0000\u0000\u0118\u0119\u0005\n\u0000"+
		"\u0000\u0119\u011b\u00050\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0124\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0005\u001c\u0000\u0000\u011d\u0120\u00050\u0000\u0000\u011e"+
		"\u011f\u0005\n\u0000\u0000\u011f\u0121\u00050\u0000\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0123"+
		"\u0001\u0000\u0000\u0000\u0122\u011c\u0001\u0000\u0000\u0000\u0123\u0126"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0127\u0100\u0001\u0000\u0000\u0000\u0127\u0116"+
		"\u0001\u0000\u0000\u0000\u0128\u0017\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0005\u000e\u0000\u0000\u012a\u012b\u00050\u0000\u0000\u012b\u012c\u0005"+
		"\u000f\u0000\u0000\u012c\u012d\u0003^/\u0000\u012d\u012e\u0005\u001a\u0000"+
		"\u0000\u012e\u012f\u0003\u000e\u0007\u0000\u012f\u0019\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005\u0018\u0000\u0000\u0131\u0132\u0003^/\u0000\u0132"+
		"\u0133\u0005\u001a\u0000\u0000\u0133\u0134\u0003\u000e\u0007\u0000\u0134"+
		"\u001b\u0001\u0000\u0000\u0000\u0135\u0136\u0007\u0000\u0000\u0000\u0136"+
		"\u0137\u0003\u001e\u000f\u0000\u0137\u0138\u0007\u0001\u0000\u0000\u0138"+
		"\u001d\u0001\u0000\u0000\u0000\u0139\u013b\u0007\u0002\u0000\u0000\u013a"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d"+
		"\u0148\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f"+
		"\u0143\u0003\"\u0011\u0000\u0140\u0142\u0007\u0002\u0000\u0000\u0141\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0147"+
		"\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u013f"+
		"\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u001f"+
		"\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u0159"+
		"\u0005F\u0000\u0000\u014c\u0159\u0003\"\u0011\u0000\u014d\u0159\u0005"+
		"?\u0000\u0000\u014e\u0159\u0005A\u0000\u0000\u014f\u0150\u00055\u0000"+
		"\u0000\u0150\u0151\u0005q\u0000\u0000\u0151\u0159\u0005p\u0000\u0000\u0152"+
		"\u0153\u00056\u0000\u0000\u0153\u0154\u0005s\u0000\u0000\u0154\u0159\u0005"+
		"r\u0000\u0000\u0155\u0156\u00057\u0000\u0000\u0156\u0157\u0005u\u0000"+
		"\u0000\u0157\u0159\u0005t\u0000\u0000\u0158\u014b\u0001\u0000\u0000\u0000"+
		"\u0158\u014c\u0001\u0000\u0000\u0000\u0158\u014d\u0001\u0000\u0000\u0000"+
		"\u0158\u014e\u0001\u0000\u0000\u0000\u0158\u014f\u0001\u0000\u0000\u0000"+
		"\u0158\u0152\u0001\u0000\u0000\u0000\u0158\u0155\u0001\u0000\u0000\u0000"+
		"\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b!\u0001\u0000\u0000\u0000\u015c"+
		"\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0005E\u0000\u0000\u015e\u0162"+
		"\u0005K\u0000\u0000\u015f\u0161\u0003$\u0012\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0005G\u0000"+
		"\u0000\u0166\u0167\u0003 \u0010\u0000\u0167\u0168\u0005E\u0000\u0000\u0168"+
		"\u0169\u0005I\u0000\u0000\u0169\u016a\u0005K\u0000\u0000\u016a\u016b\u0005"+
		"G\u0000\u0000\u016b\u0180\u0001\u0000\u0000\u0000\u016c\u016d\u0005E\u0000"+
		"\u0000\u016d\u0171\u0005K\u0000\u0000\u016e\u0170\u0003$\u0012\u0000\u016f"+
		"\u016e\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0174\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174"+
		"\u0180\u0005H\u0000\u0000\u0175\u0176\u0005E\u0000\u0000\u0176\u017a\u0005"+
		"K\u0000\u0000\u0177\u0179\u0003$\u0012\u0000\u0178\u0177\u0001\u0000\u0000"+
		"\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017d\u0001\u0000\u0000"+
		"\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0180\u0005G\u0000\u0000"+
		"\u017e\u0180\u0003&\u0013\u0000\u017f\u015d\u0001\u0000\u0000\u0000\u017f"+
		"\u016c\u0001\u0000\u0000\u0000\u017f\u0175\u0001\u0000\u0000\u0000\u017f"+
		"\u017e\u0001\u0000\u0000\u0000\u0180#\u0001\u0000\u0000\u0000\u0181\u0184"+
		"\u0005K\u0000\u0000\u0182\u0183\u0005J\u0000\u0000\u0183\u0185\u0005M"+
		"\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000"+
		"\u0000\u0000\u0185%\u0001\u0000\u0000\u0000\u0186\u0187\u0005D\u0000\u0000"+
		"\u0187\u0188\u0003(\u0014\u0000\u0188\u0189\u0005O\u0000\u0000\u0189\'"+
		"\u0001\u0000\u0000\u0000\u018a\u018d\u0003*\u0015\u0000\u018b\u018d\u0005"+
		"v\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018b\u0001\u0000"+
		"\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f)\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0194\u0003,\u0016\u0000"+
		"\u0192\u0194\u0003D\"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193"+
		"\u0192\u0001\u0000\u0000\u0000\u0194+\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0003.\u0017\u0000\u0196\u0197\u0005R\u0000\u0000\u0197\u0198\u0003L"+
		"&\u0000\u0198\u0199\u0005S\u0000\u0000\u0199-\u0001\u0000\u0000\u0000"+
		"\u019a\u019f\u00030\u0018\u0000\u019b\u019c\u0005X\u0000\u0000\u019c\u019e"+
		"\u00030\u0018\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u01a1\u0001"+
		"\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0/\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a9\u00034\u001a\u0000\u01a3\u01a5\u00032\u0019\u0000"+
		"\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u00034\u001a\u0000\u01a7"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"1\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0007\u0003\u0000\u0000\u01ad3\u0001\u0000\u0000\u0000\u01ae\u01b1\u0003"+
		"8\u001c\u0000\u01af\u01b1\u0003:\u001d\u0000\u01b0\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b7\u0003<\u001e\u0000\u01b3\u01b7\u0003>\u001f\u0000\u01b4"+
		"\u01b7\u0003@ \u0000\u01b5\u01b7\u0003B!\u0000\u01b6\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01c4\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01bb\u01c0\u0003<\u001e\u0000\u01bc\u01c0\u0003>\u001f\u0000"+
		"\u01bd\u01c0\u0003@ \u0000\u01be\u01c0\u0003B!\u0000\u01bf\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01b0\u0001"+
		"\u0000\u0000\u0000\u01c3\u01bf\u0001\u0000\u0000\u0000\u01c45\u0001\u0000"+
		"\u0000\u0000\u01c5\u01cc\u00038\u001c\u0000\u01c6\u01cc\u0003:\u001d\u0000"+
		"\u01c7\u01cc\u0003<\u001e\u0000\u01c8\u01cc\u0003>\u001f\u0000\u01c9\u01cc"+
		"\u0003@ \u0000\u01ca\u01cc\u0003B!\u0000\u01cb\u01c5\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c6\u0001\u0000\u0000\u0000\u01cb\u01c7\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc7\u0001\u0000\u0000\u0000"+
		"\u01cd\u01ce\u0005o\u0000\u0000\u01ce9\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0005b\u0000\u0000\u01d0;\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005k"+
		"\u0000\u0000\u01d2=\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005l\u0000\u0000"+
		"\u01d4?\u0001\u0000\u0000\u0000\u01d5\u01d6\u0007\u0004\u0000\u0000\u01d6"+
		"A\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005`\u0000\u0000\u01d8\u01db\u0005"+
		"o\u0000\u0000\u01d9\u01da\u0005_\u0000\u0000\u01da\u01dc\u0003R)\u0000"+
		"\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0005a\u0000\u0000\u01de"+
		"C\u0001\u0000\u0000\u0000\u01df\u01e2\u0005c\u0000\u0000\u01e0\u01e3\u0005"+
		"j\u0000\u0000\u01e1\u01e3\u0003V+\u0000\u01e2\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e4\u0202\u0003F#\u0000\u01e5\u01e6\u0005d\u0000\u0000\u01e6"+
		"\u01e7\u0003H$\u0000\u01e7\u01ec\u0005R\u0000\u0000\u01e8\u01eb\u0003"+
		"\u0002\u0001\u0000\u01e9\u01eb\u0005v\u0000\u0000\u01ea\u01e8\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0005S\u0000\u0000\u01f0\u0202\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0005e\u0000\u0000\u01f2\u01f3\u0005R\u0000\u0000\u01f3"+
		"\u01f4\u0003L&\u0000\u01f4\u01f5\u0005S\u0000\u0000\u01f5\u0202\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0005f\u0000\u0000\u01f7\u01f8\u0005o\u0000"+
		"\u0000\u01f8\u01fd\u0005R\u0000\u0000\u01f9\u01fc\u0003Z-\u0000\u01fa"+
		"\u01fc\u0005v\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0200"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0202"+
		"\u0005S\u0000\u0000\u0201\u01df\u0001\u0000\u0000\u0000\u0201\u01e5\u0001"+
		"\u0000\u0000\u0000\u0201\u01f1\u0001\u0000\u0000\u0000\u0201\u01f6\u0001"+
		"\u0000\u0000\u0000\u0202E\u0001\u0000\u0000\u0000\u0203\u0204\u0003H$"+
		"\u0000\u0204\u0205\u0005U\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000"+
		"\u0206\u0208\u0005U\u0000\u0000\u0207\u0203\u0001\u0000\u0000\u0000\u0207"+
		"\u0206\u0001\u0000\u0000\u0000\u0208G\u0001\u0000\u0000\u0000\u0209\u020e"+
		"\u0003J%\u0000\u020a\u020b\u0005X\u0000\u0000\u020b\u020d\u0003J%\u0000"+
		"\u020c\u020a\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000"+
		"\u020fI\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211"+
		"\u0213\u0005o\u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0001\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u0216"+
		"\u0005o\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216\u021b\u0001\u0000\u0000\u0000\u0217\u0218\u0005"+
		"V\u0000\u0000\u0218\u0219\u0003N\'\u0000\u0219\u021a\u0005W\u0000\u0000"+
		"\u021a\u021c\u0001\u0000\u0000\u0000\u021b\u0217\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u0226\u0001\u0000\u0000\u0000"+
		"\u021d\u0222\u0005o\u0000\u0000\u021e\u021f\u0005V\u0000\u0000\u021f\u0220"+
		"\u0003N\'\u0000\u0220\u0221\u0005W\u0000\u0000\u0221\u0223\u0001\u0000"+
		"\u0000\u0000\u0222\u021e\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000"+
		"\u0000\u0000\u0223\u0225\u0001\u0000\u0000\u0000\u0224\u021d\u0001\u0000"+
		"\u0000\u0000\u0225\u0228\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227K\u0001\u0000\u0000"+
		"\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0229\u022b\u0003N\'\u0000"+
		"\u022a\u022c\u0005U\u0000\u0000\u022b\u022a\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000\u0000\u022d"+
		"\u022f\u0005v\u0000\u0000\u022e\u0229\u0001\u0000\u0000\u0000\u022e\u022d"+
		"\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u022e"+
		"\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231M\u0001"+
		"\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u0234\u0003"+
		"P(\u0000\u0234\u0235\u0005T\u0000\u0000\u0235\u0236\u0003X,\u0000\u0236"+
		"O\u0001\u0000\u0000\u0000\u0237\u0238\u0005o\u0000\u0000\u0238Q\u0001"+
		"\u0000\u0000\u0000\u0239\u023b\u0003T*\u0000\u023a\u0239\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023dS\u0001\u0000\u0000\u0000"+
		"\u023e\u0240\u0005h\u0000\u0000\u023f\u0241\u0007\u0005\u0000\u0000\u0240"+
		"\u023f\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241"+
		"\u024f\u0001\u0000\u0000\u0000\u0242\u024f\u0005j\u0000\u0000\u0243\u024f"+
		"\u0005o\u0000\u0000\u0244\u024f\u0005i\u0000\u0000\u0245\u024f\u0005k"+
		"\u0000\u0000\u0246\u024f\u0003V+\u0000\u0247\u024f\u0005w\u0000\u0000"+
		"\u0248\u024f\u0005v\u0000\u0000\u0249\u024a\u0005V\u0000\u0000\u024a\u024b"+
		"\u0003R)\u0000\u024b\u024c\u0005W\u0000\u0000\u024c\u024f\u0001\u0000"+
		"\u0000\u0000\u024d\u024f\u0005Z\u0000\u0000\u024e\u023e\u0001\u0000\u0000"+
		"\u0000\u024e\u0242\u0001\u0000\u0000\u0000\u024e\u0243\u0001\u0000\u0000"+
		"\u0000\u024e\u0244\u0001\u0000\u0000\u0000\u024e\u0245\u0001\u0000\u0000"+
		"\u0000\u024e\u0246\u0001\u0000\u0000\u0000\u024e\u0247\u0001\u0000\u0000"+
		"\u0000\u024e\u0248\u0001\u0000\u0000\u0000\u024e\u0249\u0001\u0000\u0000"+
		"\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024fU\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0005o\u0000\u0000\u0251\u0253\u0005V\u0000\u0000\u0252\u0254"+
		"\u0003X,\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000"+
		"\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256\u0005W\u0000"+
		"\u0000\u0256W\u0001\u0000\u0000\u0000\u0257\u025f\u0003R)\u0000\u0258"+
		"\u025b\u0005X\u0000\u0000\u0259\u025c\u0003R)\u0000\u025a\u025c\u0003"+
		"V+\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025a\u0001\u0000\u0000"+
		"\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u0258\u0001\u0000\u0000"+
		"\u0000\u025e\u0261\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000"+
		"\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260Y\u0001\u0000\u0000\u0000"+
		"\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u0263\u0003\\.\u0000\u0263"+
		"\u0264\u0005R\u0000\u0000\u0264\u0265\u0003L&\u0000\u0265\u0266\u0005"+
		"S\u0000\u0000\u0266[\u0001\u0000\u0000\u0000\u0267\u026c\u0007\u0006\u0000"+
		"\u0000\u0268\u0269\u0005X\u0000\u0000\u0269\u026b\u0007\u0006\u0000\u0000"+
		"\u026a\u0268\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000"+
		"\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000"+
		"\u026d\u0271\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000"+
		"\u026f\u0271\u0005o\u0000\u0000\u0270\u0267\u0001\u0000\u0000\u0000\u0270"+
		"\u026f\u0001\u0000\u0000\u0000\u0271]\u0001\u0000\u0000\u0000\u0272\u0277"+
		"\u0003`0\u0000\u0273\u0274\u0007\u0007\u0000\u0000\u0274\u0276\u0003`"+
		"0\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000"+
		"\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000"+
		"\u0000\u0278\u027d\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000"+
		"\u0000\u027a\u027b\u0005\u0013\u0000\u0000\u027b\u027d\u0003`0\u0000\u027c"+
		"\u0272\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d"+
		"_\u0001\u0000\u0000\u0000\u027e\u0283\u0003b1\u0000\u027f\u0280\u0007"+
		"\b\u0000\u0000\u0280\u0282\u0003b1\u0000\u0281\u027f\u0001\u0000\u0000"+
		"\u0000\u0282\u0285\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284a\u0001\u0000\u0000\u0000"+
		"\u0285\u0283\u0001\u0000\u0000\u0000\u0286\u028b\u0003d2\u0000\u0287\u0288"+
		"\u0007\t\u0000\u0000\u0288\u028a\u0003d2\u0000\u0289\u0287\u0001\u0000"+
		"\u0000\u0000\u028a\u028d\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028cc\u0001\u0000\u0000"+
		"\u0000\u028d\u028b\u0001\u0000\u0000\u0000\u028e\u0293\u0003f3\u0000\u028f"+
		"\u0290\u0007\n\u0000\u0000\u0290\u0292\u0003f3\u0000\u0291\u028f\u0001"+
		"\u0000\u0000\u0000\u0292\u0295\u0001\u0000\u0000\u0000\u0293\u0291\u0001"+
		"\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294e\u0001\u0000"+
		"\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0296\u02c3\u00051\u0000"+
		"\u0000\u0297\u02c3\u00054\u0000\u0000\u0298\u02c3\u0005\u0014\u0000\u0000"+
		"\u0299\u02c3\u0005\u0015\u0000\u0000\u029a\u02c3\u0005\u0016\u0000\u0000"+
		"\u029b\u02c3\u00050\u0000\u0000\u029c\u029d\u0005)\u0000\u0000\u029d\u029e"+
		"\u0003^/\u0000\u029e\u029f\u0005*\u0000\u0000\u029f\u02c3\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a9\u0005+\u0000\u0000\u02a1\u02a6\u0003^/\u0000"+
		"\u02a2\u02a3\u0005\u001c\u0000\u0000\u02a3\u02a5\u0003^/\u0000\u02a4\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02aa"+
		"\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ab"+
		"\u0001\u0000\u0000\u0000\u02ab\u02c3\u0005,\u0000\u0000\u02ac\u02c3\u0005"+
		"2\u0000\u0000\u02ad\u02c3\u00053\u0000\u0000\u02ae\u02bf\u0005-\u0000"+
		"\u0000\u02af\u02b2\u0003^/\u0000\u02b0\u02b1\u0005\u001a\u0000\u0000\u02b1"+
		"\u02b3\u0003^/\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b3\u02bc\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005"+
		"\u001c\u0000\u0000\u02b5\u02b8\u0003^/\u0000\u02b6\u02b7\u0005\u001a\u0000"+
		"\u0000\u02b7\u02b9\u0003^/\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b9\u0001\u0000\u0000\u0000\u02b9\u02bb\u0001\u0000\u0000\u0000\u02ba"+
		"\u02b4\u0001\u0000\u0000\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd"+
		"\u02c0\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf"+
		"\u02af\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c3\u0005.\u0000\u0000\u02c2\u0296"+
		"\u0001\u0000\u0000\u0000\u02c2\u0297\u0001\u0000\u0000\u0000\u02c2\u0298"+
		"\u0001\u0000\u0000\u0000\u02c2\u0299\u0001\u0000\u0000\u0000\u02c2\u029a"+
		"\u0001\u0000\u0000\u0000\u02c2\u029b\u0001\u0000\u0000\u0000\u02c2\u029c"+
		"\u0001\u0000\u0000\u0000\u02c2\u02a0\u0001\u0000\u0000\u0000\u02c2\u02ac"+
		"\u0001\u0000\u0000\u0000\u02c2\u02ad\u0001\u0000\u0000\u0000\u02c2\u02ae"+
		"\u0001\u0000\u0000\u0000\u02c3g\u0001\u0000\u0000\u0000Ukrw\u0089\u0092"+
		"\u009e\u00ac\u00b6\u00bf\u00ca\u00d1\u00da\u00de\u00e5\u00ea\u00f5\u00fd"+
		"\u0107\u010d\u0111\u0114\u011a\u0120\u0124\u0127\u013c\u0143\u0148\u0158"+
		"\u015a\u0162\u0171\u017a\u017f\u0184\u018c\u018e\u0193\u019f\u01a4\u01a9"+
		"\u01b0\u01b6\u01b8\u01bf\u01c1\u01c3\u01cb\u01db\u01e2\u01ea\u01ec\u01fb"+
		"\u01fd\u0201\u0207\u020e\u0212\u0215\u021b\u0222\u0226\u022b\u022e\u0230"+
		"\u023c\u0240\u024e\u0253\u025b\u025f\u026c\u0270\u0277\u027c\u0283\u028b"+
		"\u0293\u02a6\u02a9\u02b2\u02b8\u02bc\u02bf\u02c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}