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
		OR=18, NOT=19, TRUE=20, FALSE=21, NONE=22, PRINT=23, WHILE=24, AT=25, 
		COLON=26, SEMI=27, COMMA=28, ASSIGN=29, EQ=30, NEQ=31, GT=32, LT=33, GTE=34, 
		LTE=35, PLUS=36, MINUS=37, STAR=38, SLASH=39, SLASHSLASH=40, LP=41, RP=42, 
		LBRACK=43, RBRACK=44, LBRACE=45, RBRACE=46, DOT=47, NAME=48, NUMBER=49, 
		STRING=50, TRIPLE_DOUBLE_START=51, TRIPLE_SINGLE_START=52, TRIPLE_DOUBLE_END=53, 
		TRIPLE_SINGLE_END=54, JINJA_EXPR_START=55, JINJA_STMT_START=56, JINJA_COMMENT_START=57, 
		HTML_COMMENT=58, HTML_CONDITIONAL_COMMENT=59, XML_DECLARATION=60, CDATA=61, 
		DTD=62, SCRIPTLET=63, SEA_WS=64, SCRIPT_OPEN=65, STYLE_OPEN=66, TAG_OPEN=67, 
		HTML_TEXT=68, TAG_CLOSE=69, TAG_SLASH_CLOSE=70, TAG_SLASH=71, TAG_EQUALS=72, 
		TAG_NAME=73, TAG_WHITESPACE=74, ATTVALUE_VALUE=75, SCRIPT_BODY=76, STYLE_CLOSE=77, 
		CSS_WS=78, CSS_COMMENT=79, CSS_LBRACE=80, CSS_RBRACE=81, CSS_COLON=82, 
		CSS_SEMICOLON=83, CSS_LPAREN=84, CSS_RPAREN=85, CSS_COMMA=86, CSS_DOT=87, 
		CSS_SLASH=88, CSS_PERCENT=89, CSS_PLUS=90, CSS_GREATER=91, CSS_TILDE=92, 
		CSS_EQUALS=93, CSS_LBRACKET=94, CSS_RBRACKET=95, CSS_ASTERISK=96, AT_IMPORT=97, 
		AT_MEDIA=98, AT_FONT_FACE=99, AT_KEYFRAMES=100, AT_SUPPORTS=101, CSS_NUMBER=102, 
		COLOR_HEX=103, CSS_STRING=104, HASH=105, CLASS=106, PSEUDO_ELEMENT=107, 
		PSEUDO_CLASS=108, IDENT=109, JINJA_EXPR_END=110, JINJA_EXPR_CONTENT=111, 
		JINJA_STMT_END=112, JINJA_STMT_CONTENT=113, JINJA_COMMENT_END=114, JINJA_COMMENT_CONTENT=115, 
		JINJA_STMT=116, JINJA_COMMENT=117, JINJA_STATEMENT=118;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_decorator = 2, RULE_decoratedDef = 3, 
		RULE_defStmt = 4, RULE_simpleStmt = 5, RULE_ifStmt = 6, RULE_block = 7, 
		RULE_assignmentStmt = 8, RULE_returnStmt = 9, RULE_globalStmt = 10, RULE_importStmt = 11, 
		RULE_forLoop = 12, RULE_whileLoop = 13, RULE_tripleQuotedString = 14, 
		RULE_document = 15, RULE_content = 16, RULE_element = 17, RULE_attribute = 18, 
		RULE_styleElement = 19, RULE_styleContent = 20, RULE_cssStatement = 21, 
		RULE_ruleset = 22, RULE_selectorList = 23, RULE_selectorGroup = 24, RULE_selector = 25, 
		RULE_combinator = 26, RULE_simpleSelectorSequence = 27, RULE_simpleSelector = 28, 
		RULE_typeSelector = 29, RULE_universal = 30, RULE_hash = 31, RULE_classSelector = 32, 
		RULE_pseudo = 33, RULE_attributeSelector = 34, RULE_atRule = 35, RULE_declarationList = 36, 
		RULE_importTerminator = 37, RULE_mediaQueryList = 38, RULE_mediaQuery = 39, 
		RULE_declarationBlock = 40, RULE_declaration = 41, RULE_anyValue = 42, 
		RULE_propertyName = 43, RULE_value = 44, RULE_term = 45, RULE_functionCall = 46, 
		RULE_expression = 47, RULE_comparisonExpression = 48, RULE_additiveExpression = 49, 
		RULE_multiplicativeExpression = 50, RULE_primaryExpression = 51, RULE_trailer = 52, 
		RULE_atom = 53, RULE_argumentList = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "decorator", "decoratedDef", "defStmt", "simpleStmt", 
			"ifStmt", "block", "assignmentStmt", "returnStmt", "globalStmt", "importStmt", 
			"forLoop", "whileLoop", "tripleQuotedString", "document", "content", 
			"element", "attribute", "styleElement", "styleContent", "cssStatement", 
			"ruleset", "selectorList", "selectorGroup", "selector", "combinator", 
			"simpleSelectorSequence", "simpleSelector", "typeSelector", "universal", 
			"hash", "classSelector", "pseudo", "attributeSelector", "atRule", "declarationList", 
			"importTerminator", "mediaQueryList", "mediaQuery", "declarationBlock", 
			"declaration", "anyValue", "propertyName", "value", "term", "functionCall", 
			"expression", "comparisonExpression", "additiveExpression", "multiplicativeExpression", 
			"primaryExpression", "trailer", "atom", "argumentList"
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
			null, null, null, null, null, null, null, null, "'{{'", "'{%'", "'{#'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'/>'", null, null, null, null, null, null, null, null, null, "'{'", 
			"'}'", null, null, "'('", "')'", null, null, null, "'%'", null, null, 
			"'~'", null, "'['", "']'", null, "'@import'", "'@media'", "'@font-face'", 
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
			"PSEUDO_CLASS", "IDENT", "JINJA_EXPR_END", "JINJA_EXPR_CONTENT", "JINJA_STMT_END", 
			"JINJA_STMT_CONTENT", "JINJA_COMMENT_END", "JINJA_COMMENT_CONTENT", "JINJA_STMT", 
			"JINJA_COMMENT", "JINJA_STATEMENT"
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
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(110);
				match(NEWLINE);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903824677824L) != 0)) {
				{
				{
				setState(116);
				statement();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(117);
					match(NEWLINE);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				importStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				simpleStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				tripleQuotedString();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				decorator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				decoratedDef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				assignmentStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				globalStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				ifStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				forLoop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(139);
				whileLoop();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(140);
				defStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(141);
				returnStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(142);
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
			setState(145);
			match(AT);
			setState(146);
			expression();
			setState(147);
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
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(149);
				decorator();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(DEF);
			setState(156);
			match(NAME);
			setState(157);
			match(LP);
			setState(158);
			match(RP);
			setState(159);
			match(COLON);
			setState(160);
			match(NEWLINE);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(161);
				match(NEWLINE);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
			setState(169);
			match(DEF);
			setState(170);
			match(NAME);
			setState(171);
			match(LP);
			setState(172);
			match(RP);
			setState(173);
			match(COLON);
			setState(174);
			match(NEWLINE);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(175);
				match(NEWLINE);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				returnStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				importStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				globalStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
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
			setState(190);
			match(IF);
			setState(191);
			expression();
			setState(192);
			match(COLON);
			setState(193);
			match(NEWLINE);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(194);
				match(NEWLINE);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			block();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(201);
				match(ELIF);
				setState(202);
				expression();
				setState(203);
				match(COLON);
				setState(204);
				match(NEWLINE);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(205);
					match(NEWLINE);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				block();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(218);
				match(ELSE);
				setState(219);
				match(COLON);
				setState(220);
				match(NEWLINE);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(221);
					match(NEWLINE);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
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
			setState(230);
			match(INDENT);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903824677824L) != 0)) {
				{
				{
				setState(231);
				statement();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(232);
					match(NEWLINE);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
			setState(245);
			match(NAME);
			setState(246);
			match(ASSIGN);
			setState(247);
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
			setState(249);
			match(RETURN);
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(250);
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
			setState(253);
			match(GLOBAL);
			setState(254);
			match(NAME);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				match(NAME);
				}
				}
				setState(261);
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
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(FROM);
				setState(263);
				expression();
				setState(264);
				match(IMPORT);
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(265);
					match(STAR);
					}
					break;
				case NAME:
					{
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

					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(271);
						match(COMMA);
						setState(272);
						match(NAME);
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AS) {
							{
							setState(273);
							match(AS);
							setState(274);
							match(NAME);
							}
						}

						}
						}
						setState(281);
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
				setState(284);
				match(IMPORT);
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

				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(290);
					match(COMMA);
					setState(291);
					match(NAME);
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(292);
						match(AS);
						setState(293);
						match(NAME);
						}
					}

					}
					}
					setState(300);
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
			setState(303);
			match(FOR);
			setState(304);
			match(NAME);
			setState(305);
			match(IN);
			setState(306);
			expression();
			setState(307);
			match(COLON);
			setState(308);
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
			setState(310);
			match(WHILE);
			setState(311);
			expression();
			setState(312);
			match(COLON);
			setState(313);
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
		public TerminalNode TRIPLE_DOUBLE_START() { return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_START, 0); }
		public TerminalNode TRIPLE_SINGLE_START() { return getToken(JinjaFlaskParser.TRIPLE_SINGLE_START, 0); }
		public TerminalNode TRIPLE_DOUBLE_END() { return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_END, 0); }
		public TerminalNode TRIPLE_SINGLE_END() { return getToken(JinjaFlaskParser.TRIPLE_SINGLE_END, 0); }
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
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
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==TRIPLE_DOUBLE_START || _la==TRIPLE_SINGLE_START) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(316);
				document();
				}
				break;
			}
			setState(319);
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
		public List<TerminalNode> SCRIPTLET() { return getTokens(JinjaFlaskParser.SCRIPTLET); }
		public TerminalNode SCRIPTLET(int i) {
			return getToken(JinjaFlaskParser.SCRIPTLET, i);
		}
		public List<TerminalNode> SEA_WS() { return getTokens(JinjaFlaskParser.SEA_WS); }
		public TerminalNode SEA_WS(int i) {
			return getToken(JinjaFlaskParser.SEA_WS, i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> HTML_TEXT() { return getTokens(JinjaFlaskParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(JinjaFlaskParser.HTML_TEXT, i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(334);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
						{
						setState(321);
						match(SCRIPTLET);
						}
						break;
					case SEA_WS:
						{
						setState(322);
						match(SEA_WS);
						}
						break;
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(323);
						element();
						}
						break;
					case HTML_TEXT:
						{
						setState(324);
						match(HTML_TEXT);
						}
						break;
					case JINJA_EXPR_START:
						{
						setState(325);
						match(JINJA_EXPR_START);
						setState(326);
						match(JINJA_EXPR_CONTENT);
						setState(327);
						match(JINJA_EXPR_END);
						}
						break;
					case JINJA_STMT_START:
						{
						setState(328);
						match(JINJA_STMT_START);
						setState(329);
						match(JINJA_STMT_CONTENT);
						setState(330);
						match(JINJA_STMT_END);
						}
						break;
					case JINJA_COMMENT_START:
						{
						setState(331);
						match(JINJA_COMMENT_START);
						setState(332);
						match(JINJA_COMMENT_CONTENT);
						setState(333);
						match(JINJA_COMMENT_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 15687L) != 0)) {
				{
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_TEXT:
					{
					setState(339);
					match(HTML_TEXT);
					}
					break;
				case SCRIPT_OPEN:
				case STYLE_OPEN:
				case TAG_OPEN:
					{
					setState(340);
					element();
					}
					break;
				case CDATA:
					{
					setState(341);
					match(CDATA);
					}
					break;
				case SCRIPTLET:
					{
					setState(342);
					match(SCRIPTLET);
					}
					break;
				case JINJA_EXPR_START:
					{
					setState(343);
					match(JINJA_EXPR_START);
					setState(344);
					match(JINJA_EXPR_CONTENT);
					setState(345);
					match(JINJA_EXPR_END);
					}
					break;
				case JINJA_STMT_START:
					{
					setState(346);
					match(JINJA_STMT_START);
					setState(347);
					match(JINJA_STMT_CONTENT);
					setState(348);
					match(JINJA_STMT_END);
					}
					break;
				case JINJA_COMMENT_START:
					{
					setState(349);
					match(JINJA_COMMENT_START);
					setState(350);
					match(JINJA_COMMENT_CONTENT);
					setState(351);
					match(JINJA_COMMENT_END);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(356);
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
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(JinjaFlaskParser.TAG_SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(JinjaFlaskParser.TAG_SLASH_CLOSE, 0); }
		public TerminalNode SCRIPT_OPEN() { return getToken(JinjaFlaskParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(JinjaFlaskParser.SCRIPT_BODY, 0); }
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
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(TAG_OPEN);
				setState(358);
				match(TAG_NAME);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(359);
					attribute();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(365);
				match(TAG_CLOSE);
				setState(366);
				document();
				setState(367);
				match(TAG_OPEN);
				setState(368);
				match(TAG_SLASH);
				setState(369);
				match(TAG_NAME);
				setState(370);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(TAG_OPEN);
				setState(373);
				match(TAG_NAME);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(374);
					attribute();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(380);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(SCRIPT_OPEN);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCRIPT_BODY) {
					{
					setState(382);
					match(SCRIPT_BODY);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
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
			setState(388);
			match(TAG_NAME);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(389);
				match(TAG_EQUALS);
				setState(390);
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
		public TerminalNode STYLE_CLOSE() { return getToken(JinjaFlaskParser.STYLE_CLOSE, 0); }
		public StyleContentContext styleContent() {
			return getRuleContext(StyleContentContext.class,0);
		}
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
			setState(393);
			match(STYLE_OPEN);
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(394);
				styleContent();
				}
				break;
			}
			setState(397);
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
		public List<RulesetContext> ruleset() {
			return getRuleContexts(RulesetContext.class);
		}
		public RulesetContext ruleset(int i) {
			return getRuleContext(RulesetContext.class,i);
		}
		public List<AtRuleContext> atRule() {
			return getRuleContexts(AtRuleContext.class);
		}
		public AtRuleContext atRule(int i) {
			return getRuleContext(AtRuleContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT() { return getTokens(JinjaFlaskParser.JINJA_STMT); }
		public TerminalNode JINJA_STMT(int i) {
			return getToken(JinjaFlaskParser.JINJA_STMT, i);
		}
		public List<TerminalNode> JINJA_COMMENT() { return getTokens(JinjaFlaskParser.JINJA_COMMENT); }
		public TerminalNode JINJA_COMMENT(int i) {
			return getToken(JinjaFlaskParser.JINJA_COMMENT, i);
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
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 3161663L) != 0)) {
				{
				setState(403);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_ASTERISK:
				case HASH:
				case CLASS:
				case PSEUDO_ELEMENT:
				case PSEUDO_CLASS:
				case IDENT:
					{
					setState(399);
					ruleset();
					}
					break;
				case AT_IMPORT:
				case AT_MEDIA:
				case AT_FONT_FACE:
				case AT_KEYFRAMES:
				case AT_SUPPORTS:
					{
					setState(400);
					atRule();
					}
					break;
				case JINJA_STMT:
					{
					setState(401);
					match(JINJA_STMT);
					}
					break;
				case JINJA_COMMENT:
					{
					setState(402);
					match(JINJA_COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(407);
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
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_ASTERISK:
			case HASH:
			case CLASS:
			case PSEUDO_ELEMENT:
			case PSEUDO_CLASS:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				ruleset();
				}
				break;
			case AT_IMPORT:
			case AT_MEDIA:
			case AT_FONT_FACE:
			case AT_KEYFRAMES:
			case AT_SUPPORTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
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
		public SelectorListContext selectorList() {
			return getRuleContext(SelectorListContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			selectorList();
			setState(413);
			match(CSS_LBRACE);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(414);
				declarationList();
				}
			}

			setState(417);
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
		enterRule(_localctx, 46, RULE_selectorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			selector();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(420);
				match(CSS_COMMA);
				setState(421);
				selector();
				}
				}
				setState(426);
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
		enterRule(_localctx, 48, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			selector();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(428);
				match(CSS_COMMA);
				setState(429);
				selector();
				}
				}
				setState(434);
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
		public List<TerminalNode> IDENT() { return getTokens(JinjaFlaskParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(JinjaFlaskParser.IDENT, i);
		}
		public List<TerminalNode> CSS_ASTERISK() { return getTokens(JinjaFlaskParser.CSS_ASTERISK); }
		public TerminalNode CSS_ASTERISK(int i) {
			return getToken(JinjaFlaskParser.CSS_ASTERISK, i);
		}
		public List<TerminalNode> HASH() { return getTokens(JinjaFlaskParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(JinjaFlaskParser.HASH, i);
		}
		public List<TerminalNode> CLASS() { return getTokens(JinjaFlaskParser.CLASS); }
		public TerminalNode CLASS(int i) {
			return getToken(JinjaFlaskParser.CLASS, i);
		}
		public List<TerminalNode> PSEUDO_CLASS() { return getTokens(JinjaFlaskParser.PSEUDO_CLASS); }
		public TerminalNode PSEUDO_CLASS(int i) {
			return getToken(JinjaFlaskParser.PSEUDO_CLASS, i);
		}
		public List<TerminalNode> PSEUDO_ELEMENT() { return getTokens(JinjaFlaskParser.PSEUDO_ELEMENT); }
		public TerminalNode PSEUDO_ELEMENT(int i) {
			return getToken(JinjaFlaskParser.PSEUDO_ELEMENT, i);
		}
		public List<TerminalNode> CSS_GREATER() { return getTokens(JinjaFlaskParser.CSS_GREATER); }
		public TerminalNode CSS_GREATER(int i) {
			return getToken(JinjaFlaskParser.CSS_GREATER, i);
		}
		public List<TerminalNode> CSS_PLUS() { return getTokens(JinjaFlaskParser.CSS_PLUS); }
		public TerminalNode CSS_PLUS(int i) {
			return getToken(JinjaFlaskParser.CSS_PLUS, i);
		}
		public List<TerminalNode> CSS_TILDE() { return getTokens(JinjaFlaskParser.CSS_TILDE); }
		public TerminalNode CSS_TILDE(int i) {
			return getToken(JinjaFlaskParser.CSS_TILDE, i);
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
		enterRule(_localctx, 50, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(435);
				_la = _input.LA(1);
				if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 15873L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 15873L) != 0) );
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 7L) != 0)) {
				{
				{
				setState(440);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(441);
					_la = _input.LA(1);
					if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 15873L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(444); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 15873L) != 0) );
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
		enterRule(_localctx, 52, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 7L) != 0)) ) {
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
		enterRule(_localctx, 54, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_ASTERISK:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(453);
					typeSelector();
					}
					break;
				case CSS_ASTERISK:
					{
					setState(454);
					universal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 30721L) != 0)) {
					{
					setState(461);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HASH:
						{
						setState(457);
						hash();
						}
						break;
					case CLASS:
						{
						setState(458);
						classSelector();
						}
						break;
					case PSEUDO_ELEMENT:
					case PSEUDO_CLASS:
						{
						setState(459);
						pseudo();
						}
						break;
					case CSS_LBRACKET:
						{
						setState(460);
						attributeSelector();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(470);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HASH:
						{
						setState(466);
						hash();
						}
						break;
					case CLASS:
						{
						setState(467);
						classSelector();
						}
						break;
					case PSEUDO_ELEMENT:
					case PSEUDO_CLASS:
						{
						setState(468);
						pseudo();
						}
						break;
					case CSS_LBRACKET:
						{
						setState(469);
						attributeSelector();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(472); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 30721L) != 0) );
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
		enterRule(_localctx, 56, RULE_simpleSelector);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				typeSelector();
				}
				break;
			case CSS_ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				universal();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				hash();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				classSelector();
				}
				break;
			case PSEUDO_ELEMENT:
			case PSEUDO_CLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				pseudo();
				}
				break;
			case CSS_LBRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
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
		enterRule(_localctx, 58, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
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
		enterRule(_localctx, 60, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
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
		enterRule(_localctx, 62, RULE_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
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
		enterRule(_localctx, 64, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		enterRule(_localctx, 66, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		enterRule(_localctx, 68, RULE_attributeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(CSS_LBRACKET);
			setState(495);
			match(IDENT);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_EQUALS) {
				{
				setState(496);
				match(CSS_EQUALS);
				setState(497);
				value();
				}
			}

			setState(500);
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
		public TerminalNode CSS_LBRACE() { return getToken(JinjaFlaskParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(JinjaFlaskParser.CSS_RBRACE, 0); }
		public TerminalNode AT_MEDIA() { return getToken(JinjaFlaskParser.AT_MEDIA, 0); }
		public TerminalNode AT_SUPPORTS() { return getToken(JinjaFlaskParser.AT_SUPPORTS, 0); }
		public List<AnyValueContext> anyValue() {
			return getRuleContexts(AnyValueContext.class);
		}
		public AnyValueContext anyValue(int i) {
			return getRuleContext(AnyValueContext.class,i);
		}
		public List<RulesetContext> ruleset() {
			return getRuleContexts(RulesetContext.class);
		}
		public RulesetContext ruleset(int i) {
			return getRuleContext(RulesetContext.class,i);
		}
		public List<AtRuleContext> atRule() {
			return getRuleContexts(AtRuleContext.class);
		}
		public AtRuleContext atRule(int i) {
			return getRuleContext(AtRuleContext.class,i);
		}
		public TerminalNode AT_IMPORT() { return getToken(JinjaFlaskParser.AT_IMPORT, 0); }
		public TerminalNode AT_KEYFRAMES() { return getToken(JinjaFlaskParser.AT_KEYFRAMES, 0); }
		public TerminalNode AT_FONT_FACE() { return getToken(JinjaFlaskParser.AT_FONT_FACE, 0); }
		public TerminalNode CSS_SEMICOLON() { return getToken(JinjaFlaskParser.CSS_SEMICOLON, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
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
		enterRule(_localctx, 70, RULE_atRule);
		int _la;
		try {
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_MEDIA:
			case AT_SUPPORTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				_la = _input.LA(1);
				if ( !(_la==AT_MEDIA || _la==AT_SUPPORTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 9371669L) != 0)) {
					{
					{
					setState(503);
					anyValue();
					}
					}
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(509);
				match(CSS_LBRACE);
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 15935L) != 0)) {
					{
					setState(512);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_ASTERISK:
					case HASH:
					case CLASS:
					case PSEUDO_ELEMENT:
					case PSEUDO_CLASS:
					case IDENT:
						{
						setState(510);
						ruleset();
						}
						break;
					case AT_IMPORT:
					case AT_MEDIA:
					case AT_FONT_FACE:
					case AT_KEYFRAMES:
					case AT_SUPPORTS:
						{
						setState(511);
						atRule();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(517);
				match(CSS_RBRACE);
				}
				break;
			case AT_IMPORT:
			case AT_FONT_FACE:
			case AT_KEYFRAMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 13L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 9371669L) != 0)) {
					{
					{
					setState(519);
					anyValue();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(531);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_LBRACE:
					{
					setState(525);
					match(CSS_LBRACE);
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENT) {
						{
						setState(526);
						declarationList();
						}
					}

					setState(529);
					match(CSS_RBRACE);
					}
					break;
				case CSS_SEMICOLON:
					{
					setState(530);
					match(CSS_SEMICOLON);
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 72, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			declaration();
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(536);
					match(CSS_SEMICOLON);
					setState(537);
					declaration();
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMICOLON) {
				{
				setState(543);
				match(CSS_SEMICOLON);
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
		enterRule(_localctx, 74, RULE_importTerminator);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				mediaQueryList();
				setState(547);
				match(CSS_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
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
		enterRule(_localctx, 76, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			mediaQuery();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(553);
				match(CSS_COMMA);
				setState(554);
				mediaQuery();
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
		enterRule(_localctx, 78, RULE_mediaQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(560);
				match(IDENT);
				}
				break;
			}
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(563);
				match(IDENT);
				}
				break;
			}
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_LPAREN) {
				{
				setState(566);
				match(CSS_LPAREN);
				setState(567);
				declaration();
				setState(568);
				match(CSS_RPAREN);
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(572);
				match(IDENT);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_LPAREN) {
					{
					setState(573);
					match(CSS_LPAREN);
					setState(574);
					declaration();
					setState(575);
					match(CSS_RPAREN);
					}
				}

				}
				}
				setState(583);
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
		enterRule(_localctx, 80, RULE_declarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT || _la==JINJA_STATEMENT) {
				{
				setState(589);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(584);
					declaration();
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CSS_SEMICOLON) {
						{
						setState(585);
						match(CSS_SEMICOLON);
						}
					}

					}
					break;
				case JINJA_STATEMENT:
					{
					setState(588);
					match(JINJA_STATEMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(593);
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
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public TerminalNode CSS_COLON() { return getToken(JinjaFlaskParser.CSS_COLON, 0); }
		public AnyValueContext anyValue() {
			return getRuleContext(AnyValueContext.class,0);
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
		enterRule(_localctx, 82, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(IDENT);
			setState(595);
			match(CSS_COLON);
			setState(596);
			anyValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnyValueContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(JinjaFlaskParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(JinjaFlaskParser.CSS_COMMA, i);
		}
		public List<TerminalNode> CSS_SLASH() { return getTokens(JinjaFlaskParser.CSS_SLASH); }
		public TerminalNode CSS_SLASH(int i) {
			return getToken(JinjaFlaskParser.CSS_SLASH, i);
		}
		public AnyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAnyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAnyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAnyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyValueContext anyValue() throws RecognitionException {
		AnyValueContext _localctx = new AnyValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_anyValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(598);
						term();
						}
						break;
					case 2:
						{
						setState(599);
						functionCall();
						}
						break;
					case 3:
						{
						setState(600);
						match(CSS_COMMA);
						}
						break;
					case 4:
						{
						setState(601);
						match(CSS_SLASH);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(604); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		enterRule(_localctx, 86, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
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
		enterRule(_localctx, 88, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(608);
				term();
				}
				}
				setState(611); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MINUS || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 585729L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode CSS_PLUS() { return getToken(JinjaFlaskParser.CSS_PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JinjaFlaskParser.MINUS, 0); }
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public TerminalNode CSS_PERCENT() { return getToken(JinjaFlaskParser.CSS_PERCENT, 0); }
		public TerminalNode CSS_STRING() { return getToken(JinjaFlaskParser.CSS_STRING, 0); }
		public TerminalNode COLOR_HEX() { return getToken(JinjaFlaskParser.COLOR_HEX, 0); }
		public TerminalNode HASH() { return getToken(JinjaFlaskParser.HASH, 0); }
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
		enterRule(_localctx, 90, RULE_term);
		int _la;
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case CSS_PLUS:
			case CSS_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==CSS_PLUS) {
					{
					setState(613);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==CSS_PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				{
				setState(616);
				match(CSS_NUMBER);
				setState(618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(617);
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
				}
				break;
			case CSS_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(CSS_STRING);
				}
				break;
			case COLOR_HEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				match(COLOR_HEX);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				match(IDENT);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(623);
				match(HASH);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(JinjaFlaskParser.IDENT, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(JinjaFlaskParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(JinjaFlaskParser.CSS_RPAREN, 0); }
		public AnyValueContext anyValue() {
			return getRuleContext(AnyValueContext.class,0);
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
		enterRule(_localctx, 92, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(IDENT);
			setState(627);
			match(CSS_LPAREN);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 9371669L) != 0)) {
				{
				setState(628);
				anyValue();
				}
			}

			setState(631);
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
			setState(643);
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
			case STRING:
			case TRIPLE_DOUBLE_START:
			case TRIPLE_SINGLE_START:
				_localctx = new LogicalOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				comparisonExpression();
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(634);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(635);
					comparisonExpression();
					}
					}
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NOT:
				_localctx = new NotOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(NOT);
				setState(642);
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
			setState(645);
			additiveExpression();
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) {
				{
				{
				setState(646);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(647);
				additiveExpression();
				}
				}
				setState(652);
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
			setState(653);
			multiplicativeExpression();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(654);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(655);
				multiplicativeExpression();
				}
				}
				setState(660);
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
			setState(661);
			primaryExpression();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH) {
				{
				{
				setState(662);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(663);
				primaryExpression();
				}
				}
				setState(668);
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
	public static class AtomExpressionContext extends PrimaryExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public AtomExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAtomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAtomExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_primaryExpression);
		try {
			int _alt;
			_localctx = new AtomExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			atom();
			setState(673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(670);
					trailer();
					}
					} 
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
	 
		public TrailerContext() { }
		public void copyFrom(TrailerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeAccessTrailerContext extends TrailerContext {
		public TerminalNode DOT() { return getToken(JinjaFlaskParser.DOT, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public AttributeAccessTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterAttributeAccessTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitAttributeAccessTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitAttributeAccessTrailer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptTrailerContext extends TrailerContext {
		public TerminalNode LBRACK() { return getToken(JinjaFlaskParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JinjaFlaskParser.RBRACK, 0); }
		public SubscriptTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterSubscriptTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitSubscriptTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitSubscriptTrailer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallTrailerContext extends TrailerContext {
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallTrailerContext(TrailerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterFunctionCallTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitFunctionCallTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitFunctionCallTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_trailer);
		int _la;
		try {
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				_localctx = new FunctionCallTrailerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(LP);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903774261248L) != 0)) {
					{
					setState(677);
					argumentList();
					}
				}

				setState(680);
				match(RP);
				}
				break;
			case LBRACK:
				_localctx = new SubscriptTrailerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				match(LBRACK);
				setState(682);
				expression();
				setState(683);
				match(RBRACK);
				}
				break;
			case DOT:
				_localctx = new AttributeAccessTrailerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(685);
				match(DOT);
				setState(686);
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
		public TerminalNode NUMBER() { return getToken(JinjaFlaskParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(JinjaFlaskParser.STRING, 0); }
		public TripleQuotedStringContext tripleQuotedString() {
			return getRuleContext(TripleQuotedStringContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(JinjaFlaskParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JinjaFlaskParser.FALSE, 0); }
		public TerminalNode NONE() { return getToken(JinjaFlaskParser.NONE, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public TerminalNode LBRACK() { return getToken(JinjaFlaskParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JinjaFlaskParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JinjaFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JinjaFlaskParser.COMMA, i);
		}
		public TerminalNode LBRACE() { return getToken(JinjaFlaskParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JinjaFlaskParser.RBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(JinjaFlaskParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JinjaFlaskParser.COLON, i);
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
		enterRule(_localctx, 106, RULE_atom);
		int _la;
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(STRING);
				}
				break;
			case TRIPLE_DOUBLE_START:
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				tripleQuotedString();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(692);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(693);
				match(FALSE);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 6);
				{
				setState(694);
				match(NONE);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 7);
				{
				setState(695);
				match(NAME);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 8);
				{
				setState(696);
				match(LP);
				setState(697);
				expression();
				setState(698);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 9);
				{
				setState(700);
				match(LBRACK);
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903774261248L) != 0)) {
					{
					setState(701);
					expression();
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(702);
						match(COMMA);
						setState(703);
						expression();
						}
						}
						setState(708);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(711);
				match(RBRACK);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 10);
				{
				setState(712);
				match(LBRACE);
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903774261248L) != 0)) {
					{
					setState(713);
					expression();
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(714);
						match(COLON);
						setState(715);
						expression();
						}
					}

					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(718);
						match(COMMA);
						setState(719);
						expression();
						setState(722);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(720);
							match(COLON);
							setState(721);
							expression();
							}
						}

						}
						}
						setState(728);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(731);
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
	public static class ArgumentListContext extends ParserRuleContext {
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
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			expression();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(735);
				match(COMMA);
				setState(736);
				expression();
				}
				}
				setState(741);
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
		"\u0004\u0001v\u02e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0005\u0000p\b\u0000\n\u0000\f\u0000s\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000w\b\u0000\n\u0000\f\u0000z\t\u0000\u0005\u0000|\b\u0000"+
		"\n\u0000\f\u0000\u007f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0090\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0005\u0003\u0097\b\u0003\n\u0003\f\u0003\u009a\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u00a3\b\u0003\n\u0003\f\u0003\u00a6\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00b1\b\u0004\n\u0004\f\u0004\u00b4\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00bd\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00c4\b\u0006\n\u0006\f\u0006\u00c7"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00cf\b\u0006\n\u0006\f\u0006\u00d2\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00d6\b\u0006\n\u0006\f\u0006\u00d9\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00df\b\u0006\n"+
		"\u0006\f\u0006\u00e2\t\u0006\u0001\u0006\u0003\u0006\u00e5\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ea\b\u0007\n\u0007\f\u0007"+
		"\u00ed\t\u0007\u0005\u0007\u00ef\b\u0007\n\u0007\f\u0007\u00f2\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0003\t\u00fc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0102\b\n"+
		"\n\n\f\n\u0105\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u010e\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0114\b\u000b\u0005\u000b\u0116"+
		"\b\u000b\n\u000b\f\u000b\u0119\t\u000b\u0003\u000b\u011b\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0121\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0127\b\u000b\u0005"+
		"\u000b\u0129\b\u000b\n\u000b\f\u000b\u012c\t\u000b\u0003\u000b\u012e\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u013e"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u014f\b\u000f\n"+
		"\u000f\f\u000f\u0152\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0161\b\u0010\n"+
		"\u0010\f\u0010\u0164\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0169\b\u0011\n\u0011\f\u0011\u016c\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0178\b\u0011\n\u0011\f\u0011\u017b"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0180\b\u0011"+
		"\u0001\u0011\u0003\u0011\u0183\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0188\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u018c\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0194\b\u0014\n\u0014\f\u0014\u0197\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u019b\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u01a0\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u01a7\b\u0017\n\u0017\f\u0017\u01aa\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01af\b\u0018\n\u0018\f\u0018"+
		"\u01b2\t\u0018\u0001\u0019\u0004\u0019\u01b5\b\u0019\u000b\u0019\f\u0019"+
		"\u01b6\u0001\u0019\u0001\u0019\u0004\u0019\u01bb\b\u0019\u000b\u0019\f"+
		"\u0019\u01bc\u0005\u0019\u01bf\b\u0019\n\u0019\f\u0019\u01c2\t\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u01c8\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01ce\b\u001b\n"+
		"\u001b\f\u001b\u01d1\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0004\u001b\u01d7\b\u001b\u000b\u001b\f\u001b\u01d8\u0003\u001b"+
		"\u01db\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01e3\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u01f3\b\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0005#\u01f9\b#\n#\f#\u01fc\t#\u0001#\u0001#\u0001#\u0005#\u0201\b#"+
		"\n#\f#\u0204\t#\u0001#\u0001#\u0001#\u0005#\u0209\b#\n#\f#\u020c\t#\u0001"+
		"#\u0001#\u0003#\u0210\b#\u0001#\u0001#\u0003#\u0214\b#\u0003#\u0216\b"+
		"#\u0001$\u0001$\u0001$\u0005$\u021b\b$\n$\f$\u021e\t$\u0001$\u0003$\u0221"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0003%\u0227\b%\u0001&\u0001&\u0001&\u0005"+
		"&\u022c\b&\n&\f&\u022f\t&\u0001\'\u0003\'\u0232\b\'\u0001\'\u0003\'\u0235"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u023b\b\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u0242\b\'\u0005\'\u0244\b\'\n\'\f\'\u0247"+
		"\t\'\u0001(\u0001(\u0003(\u024b\b(\u0001(\u0005(\u024e\b(\n(\f(\u0251"+
		"\t(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0004*\u025b"+
		"\b*\u000b*\f*\u025c\u0001+\u0001+\u0001,\u0004,\u0262\b,\u000b,\f,\u0263"+
		"\u0001-\u0003-\u0267\b-\u0001-\u0001-\u0003-\u026b\b-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u0271\b-\u0001.\u0001.\u0001.\u0003.\u0276\b.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0005/\u027d\b/\n/\f/\u0280\t/\u0001/\u0001/\u0003"+
		"/\u0284\b/\u00010\u00010\u00010\u00050\u0289\b0\n0\f0\u028c\t0\u00011"+
		"\u00011\u00011\u00051\u0291\b1\n1\f1\u0294\t1\u00012\u00012\u00012\u0005"+
		"2\u0299\b2\n2\f2\u029c\t2\u00013\u00013\u00053\u02a0\b3\n3\f3\u02a3\t"+
		"3\u00014\u00014\u00034\u02a7\b4\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00034\u02b0\b4\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00055\u02c1"+
		"\b5\n5\f5\u02c4\t5\u00035\u02c6\b5\u00015\u00015\u00015\u00015\u00015"+
		"\u00035\u02cd\b5\u00015\u00015\u00015\u00015\u00035\u02d3\b5\u00055\u02d5"+
		"\b5\n5\f5\u02d8\t5\u00035\u02da\b5\u00015\u00035\u02dd\b5\u00016\u0001"+
		"6\u00016\u00056\u02e2\b6\n6\f6\u02e5\t6\u00016\u0000\u00007\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\r\u0001\u000034\u0001"+
		"\u000056\u0002\u0000``im\u0001\u0000Z\\\u0001\u0000kl\u0002\u0000bbee"+
		"\u0002\u0000aacd\u0002\u0000%%ZZ\u0002\u0000YYmm\u0001\u0000\u0011\u0012"+
		"\u0001\u0000\u001e#\u0001\u0000$%\u0001\u0000&\'\u0340\u0000q\u0001\u0000"+
		"\u0000\u0000\u0002\u008f\u0001\u0000\u0000\u0000\u0004\u0091\u0001\u0000"+
		"\u0000\u0000\u0006\u0098\u0001\u0000\u0000\u0000\b\u00a9\u0001\u0000\u0000"+
		"\u0000\n\u00bc\u0001\u0000\u0000\u0000\f\u00be\u0001\u0000\u0000\u0000"+
		"\u000e\u00e6\u0001\u0000\u0000\u0000\u0010\u00f5\u0001\u0000\u0000\u0000"+
		"\u0012\u00f9\u0001\u0000\u0000\u0000\u0014\u00fd\u0001\u0000\u0000\u0000"+
		"\u0016\u012d\u0001\u0000\u0000\u0000\u0018\u012f\u0001\u0000\u0000\u0000"+
		"\u001a\u0136\u0001\u0000\u0000\u0000\u001c\u013b\u0001\u0000\u0000\u0000"+
		"\u001e\u0150\u0001\u0000\u0000\u0000 \u0162\u0001\u0000\u0000\u0000\""+
		"\u0182\u0001\u0000\u0000\u0000$\u0184\u0001\u0000\u0000\u0000&\u0189\u0001"+
		"\u0000\u0000\u0000(\u0195\u0001\u0000\u0000\u0000*\u019a\u0001\u0000\u0000"+
		"\u0000,\u019c\u0001\u0000\u0000\u0000.\u01a3\u0001\u0000\u0000\u00000"+
		"\u01ab\u0001\u0000\u0000\u00002\u01b4\u0001\u0000\u0000\u00004\u01c3\u0001"+
		"\u0000\u0000\u00006\u01da\u0001\u0000\u0000\u00008\u01e2\u0001\u0000\u0000"+
		"\u0000:\u01e4\u0001\u0000\u0000\u0000<\u01e6\u0001\u0000\u0000\u0000>"+
		"\u01e8\u0001\u0000\u0000\u0000@\u01ea\u0001\u0000\u0000\u0000B\u01ec\u0001"+
		"\u0000\u0000\u0000D\u01ee\u0001\u0000\u0000\u0000F\u0215\u0001\u0000\u0000"+
		"\u0000H\u0217\u0001\u0000\u0000\u0000J\u0226\u0001\u0000\u0000\u0000L"+
		"\u0228\u0001\u0000\u0000\u0000N\u0231\u0001\u0000\u0000\u0000P\u024f\u0001"+
		"\u0000\u0000\u0000R\u0252\u0001\u0000\u0000\u0000T\u025a\u0001\u0000\u0000"+
		"\u0000V\u025e\u0001\u0000\u0000\u0000X\u0261\u0001\u0000\u0000\u0000Z"+
		"\u0270\u0001\u0000\u0000\u0000\\\u0272\u0001\u0000\u0000\u0000^\u0283"+
		"\u0001\u0000\u0000\u0000`\u0285\u0001\u0000\u0000\u0000b\u028d\u0001\u0000"+
		"\u0000\u0000d\u0295\u0001\u0000\u0000\u0000f\u029d\u0001\u0000\u0000\u0000"+
		"h\u02af\u0001\u0000\u0000\u0000j\u02dc\u0001\u0000\u0000\u0000l\u02de"+
		"\u0001\u0000\u0000\u0000np\u0005\u0003\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000r}\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tx\u0003"+
		"\u0002\u0001\u0000uw\u0005\u0003\u0000\u0000vu\u0001\u0000\u0000\u0000"+
		"wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{t\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u0000\u0000\u0001\u0081\u0001\u0001"+
		"\u0000\u0000\u0000\u0082\u0090\u0003\u0016\u000b\u0000\u0083\u0090\u0003"+
		"\n\u0005\u0000\u0084\u0090\u0003\u001c\u000e\u0000\u0085\u0090\u0003\u0004"+
		"\u0002\u0000\u0086\u0090\u0003\u0006\u0003\u0000\u0087\u0090\u0003\u0010"+
		"\b\u0000\u0088\u0090\u0003\u0014\n\u0000\u0089\u0090\u0003\f\u0006\u0000"+
		"\u008a\u0090\u0003\u0018\f\u0000\u008b\u0090\u0003\u001a\r\u0000\u008c"+
		"\u0090\u0003\b\u0004\u0000\u008d\u0090\u0003\u0012\t\u0000\u008e\u0090"+
		"\u0003^/\u0000\u008f\u0082\u0001\u0000\u0000\u0000\u008f\u0083\u0001\u0000"+
		"\u0000\u0000\u008f\u0084\u0001\u0000\u0000\u0000\u008f\u0085\u0001\u0000"+
		"\u0000\u0000\u008f\u0086\u0001\u0000\u0000\u0000\u008f\u0087\u0001\u0000"+
		"\u0000\u0000\u008f\u0088\u0001\u0000\u0000\u0000\u008f\u0089\u0001\u0000"+
		"\u0000\u0000\u008f\u008a\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000"+
		"\u0000\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0003\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005\u0019\u0000\u0000\u0092\u0093\u0003^/\u0000"+
		"\u0093\u0094\u0005\u0003\u0000\u0000\u0094\u0005\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0003\u0004\u0002\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0006\u0000\u0000"+
		"\u009c\u009d\u00050\u0000\u0000\u009d\u009e\u0005)\u0000\u0000\u009e\u009f"+
		"\u0005*\u0000\u0000\u009f\u00a0\u0005\u001a\u0000\u0000\u00a0\u00a4\u0005"+
		"\u0003\u0000\u0000\u00a1\u00a3\u0005\u0003\u0000\u0000\u00a2\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003"+
		"\u000e\u0007\u0000\u00a8\u0007\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0006\u0000\u0000\u00aa\u00ab\u00050\u0000\u0000\u00ab\u00ac\u0005)\u0000"+
		"\u0000\u00ac\u00ad\u0005*\u0000\u0000\u00ad\u00ae\u0005\u001a\u0000\u0000"+
		"\u00ae\u00b2\u0005\u0003\u0000\u0000\u00af\u00b1\u0005\u0003\u0000\u0000"+
		"\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0003\u000e\u0007\u0000\u00b6\t\u0001\u0000\u0000\u0000\u00b7"+
		"\u00bd\u0003\u0010\b\u0000\u00b8\u00bd\u0003\u0012\t\u0000\u00b9\u00bd"+
		"\u0003\u0016\u000b\u0000\u00ba\u00bd\u0003\u0014\n\u0000\u00bb\u00bd\u0003"+
		"^/\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u000b\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005\u000b\u0000\u0000\u00bf\u00c0\u0003^/\u0000\u00c0"+
		"\u00c1\u0005\u001a\u0000\u0000\u00c1\u00c5\u0005\u0003\u0000\u0000\u00c2"+
		"\u00c4\u0005\u0003\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c8\u00d7\u0003\u000e\u0007\u0000\u00c9"+
		"\u00ca\u0005\f\u0000\u0000\u00ca\u00cb\u0003^/\u0000\u00cb\u00cc\u0005"+
		"\u001a\u0000\u0000\u00cc\u00d0\u0005\u0003\u0000\u0000\u00cd\u00cf\u0005"+
		"\u0003\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0003\u000e\u0007\u0000\u00d4\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d5\u00c9\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00e4\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005\r\u0000\u0000\u00db\u00dc\u0005\u001a"+
		"\u0000\u0000\u00dc\u00e0\u0005\u0003\u0000\u0000\u00dd\u00df\u0005\u0003"+
		"\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e5\u0003\u000e\u0007\u0000\u00e4\u00da\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\r\u0001\u0000\u0000"+
		"\u0000\u00e6\u00f0\u0005\u0001\u0000\u0000\u00e7\u00eb\u0003\u0002\u0001"+
		"\u0000\u00e8\u00ea\u0005\u0003\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0002\u0000"+
		"\u0000\u00f4\u000f\u0001\u0000\u0000\u0000\u00f5\u00f6\u00050\u0000\u0000"+
		"\u00f6\u00f7\u0005\u001d\u0000\u0000\u00f7\u00f8\u0003^/\u0000\u00f8\u0011"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fb\u0005\u0007\u0000\u0000\u00fa\u00fc"+
		"\u0003^/\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u0013\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0010"+
		"\u0000\u0000\u00fe\u0103\u00050\u0000\u0000\u00ff\u0100\u0005\u001c\u0000"+
		"\u0000\u0100\u0102\u00050\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0015\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005\b\u0000\u0000\u0107"+
		"\u0108\u0003^/\u0000\u0108\u011a\u0005\t\u0000\u0000\u0109\u011b\u0005"+
		"&\u0000\u0000\u010a\u010d\u00050\u0000\u0000\u010b\u010c\u0005\n\u0000"+
		"\u0000\u010c\u010e\u00050\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0117\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0005\u001c\u0000\u0000\u0110\u0113\u00050\u0000\u0000\u0111"+
		"\u0112\u0005\n\u0000\u0000\u0112\u0114\u00050\u0000\u0000\u0113\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u0001\u0000\u0000\u0000\u0115\u010f\u0001\u0000\u0000\u0000\u0116\u0119"+
		"\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u011a\u0109\u0001\u0000\u0000\u0000\u011a\u010a"+
		"\u0001\u0000\u0000\u0000\u011b\u012e\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0005\t\u0000\u0000\u011d\u0120\u00050\u0000\u0000\u011e\u011f\u0005"+
		"\n\u0000\u0000\u011f\u0121\u00050\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u012a\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0005\u001c\u0000\u0000\u0123\u0126\u00050\u0000"+
		"\u0000\u0124\u0125\u0005\n\u0000\u0000\u0125\u0127\u00050\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0122\u0001\u0000\u0000\u0000"+
		"\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000"+
		"\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0106\u0001\u0000\u0000\u0000"+
		"\u012d\u011c\u0001\u0000\u0000\u0000\u012e\u0017\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0005\u000e\u0000\u0000\u0130\u0131\u00050\u0000\u0000\u0131"+
		"\u0132\u0005\u000f\u0000\u0000\u0132\u0133\u0003^/\u0000\u0133\u0134\u0005"+
		"\u001a\u0000\u0000\u0134\u0135\u0003\u000e\u0007\u0000\u0135\u0019\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0005\u0018\u0000\u0000\u0137\u0138\u0003"+
		"^/\u0000\u0138\u0139\u0005\u001a\u0000\u0000\u0139\u013a\u0003\u000e\u0007"+
		"\u0000\u013a\u001b\u0001\u0000\u0000\u0000\u013b\u013d\u0007\u0000\u0000"+
		"\u0000\u013c\u013e\u0003\u001e\u000f\u0000\u013d\u013c\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0007\u0001\u0000\u0000\u0140\u001d\u0001\u0000\u0000"+
		"\u0000\u0141\u014f\u0005?\u0000\u0000\u0142\u014f\u0005@\u0000\u0000\u0143"+
		"\u014f\u0003\"\u0011\u0000\u0144\u014f\u0005D\u0000\u0000\u0145\u0146"+
		"\u00057\u0000\u0000\u0146\u0147\u0005o\u0000\u0000\u0147\u014f\u0005n"+
		"\u0000\u0000\u0148\u0149\u00058\u0000\u0000\u0149\u014a\u0005q\u0000\u0000"+
		"\u014a\u014f\u0005p\u0000\u0000\u014b\u014c\u00059\u0000\u0000\u014c\u014d"+
		"\u0005s\u0000\u0000\u014d\u014f\u0005r\u0000\u0000\u014e\u0141\u0001\u0000"+
		"\u0000\u0000\u014e\u0142\u0001\u0000\u0000\u0000\u014e\u0143\u0001\u0000"+
		"\u0000\u0000\u014e\u0144\u0001\u0000\u0000\u0000\u014e\u0145\u0001\u0000"+
		"\u0000\u0000\u014e\u0148\u0001\u0000\u0000\u0000\u014e\u014b\u0001\u0000"+
		"\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u001f\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0161\u0005D\u0000"+
		"\u0000\u0154\u0161\u0003\"\u0011\u0000\u0155\u0161\u0005=\u0000\u0000"+
		"\u0156\u0161\u0005?\u0000\u0000\u0157\u0158\u00057\u0000\u0000\u0158\u0159"+
		"\u0005o\u0000\u0000\u0159\u0161\u0005n\u0000\u0000\u015a\u015b\u00058"+
		"\u0000\u0000\u015b\u015c\u0005q\u0000\u0000\u015c\u0161\u0005p\u0000\u0000"+
		"\u015d\u015e\u00059\u0000\u0000\u015e\u015f\u0005s\u0000\u0000\u015f\u0161"+
		"\u0005r\u0000\u0000\u0160\u0153\u0001\u0000\u0000\u0000\u0160\u0154\u0001"+
		"\u0000\u0000\u0000\u0160\u0155\u0001\u0000\u0000\u0000\u0160\u0156\u0001"+
		"\u0000\u0000\u0000\u0160\u0157\u0001\u0000\u0000\u0000\u0160\u015a\u0001"+
		"\u0000\u0000\u0000\u0160\u015d\u0001\u0000\u0000\u0000\u0161\u0164\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163!\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0005C\u0000\u0000\u0166\u016a\u0005I\u0000\u0000"+
		"\u0167\u0169\u0003$\u0012\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169"+
		"\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c"+
		"\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0005E\u0000\u0000\u016e\u016f"+
		"\u0003\u001e\u000f\u0000\u016f\u0170\u0005C\u0000\u0000\u0170\u0171\u0005"+
		"G\u0000\u0000\u0171\u0172\u0005I\u0000\u0000\u0172\u0173\u0005E\u0000"+
		"\u0000\u0173\u0183\u0001\u0000\u0000\u0000\u0174\u0175\u0005C\u0000\u0000"+
		"\u0175\u0179\u0005I\u0000\u0000\u0176\u0178\u0003$\u0012\u0000\u0177\u0176"+
		"\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c"+
		"\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u0183"+
		"\u0005F\u0000\u0000\u017d\u017f\u0005A\u0000\u0000\u017e\u0180\u0005L"+
		"\u0000\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u0183\u0003&\u0013"+
		"\u0000\u0182\u0165\u0001\u0000\u0000\u0000\u0182\u0174\u0001\u0000\u0000"+
		"\u0000\u0182\u017d\u0001\u0000\u0000\u0000\u0182\u0181\u0001\u0000\u0000"+
		"\u0000\u0183#\u0001\u0000\u0000\u0000\u0184\u0187\u0005I\u0000\u0000\u0185"+
		"\u0186\u0005H\u0000\u0000\u0186\u0188\u0005K\u0000\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188%\u0001\u0000"+
		"\u0000\u0000\u0189\u018b\u0005B\u0000\u0000\u018a\u018c\u0003(\u0014\u0000"+
		"\u018b\u018a\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0005M\u0000\u0000\u018e"+
		"\'\u0001\u0000\u0000\u0000\u018f\u0194\u0003,\u0016\u0000\u0190\u0194"+
		"\u0003F#\u0000\u0191\u0194\u0005t\u0000\u0000\u0192\u0194\u0005u\u0000"+
		"\u0000\u0193\u018f\u0001\u0000\u0000\u0000\u0193\u0190\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196)\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019b\u0003,\u0016\u0000\u0199"+
		"\u019b\u0003F#\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u0199\u0001"+
		"\u0000\u0000\u0000\u019b+\u0001\u0000\u0000\u0000\u019c\u019d\u0003.\u0017"+
		"\u0000\u019d\u019f\u0005P\u0000\u0000\u019e\u01a0\u0003H$\u0000\u019f"+
		"\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005Q\u0000\u0000\u01a2-\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a8\u00032\u0019\u0000\u01a4\u01a5\u0005V\u0000"+
		"\u0000\u01a5\u01a7\u00032\u0019\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9/\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ab\u01b0\u00032\u0019\u0000\u01ac\u01ad"+
		"\u0005V\u0000\u0000\u01ad\u01af\u00032\u0019\u0000\u01ae\u01ac\u0001\u0000"+
		"\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b11\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b5\u0007\u0002\u0000"+
		"\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01c0\u0001\u0000\u0000\u0000\u01b8\u01ba\u0007\u0003\u0000"+
		"\u0000\u01b9\u01bb\u0007\u0002\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bf\u0001\u0000\u0000"+
		"\u0000\u01be\u01b8\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c13\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0007\u0003\u0000\u0000\u01c45\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c8\u0003:\u001d\u0000\u01c6\u01c8\u0003<\u001e\u0000\u01c7\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c8\u01cf\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ce\u0003>\u001f\u0000\u01ca\u01ce\u0003@ "+
		"\u0000\u01cb\u01ce\u0003B!\u0000\u01cc\u01ce\u0003D\"\u0000\u01cd\u01c9"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001\u0000\u0000\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01db\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d7\u0003>\u001f\u0000\u01d3\u01d7\u0003"+
		"@ \u0000\u01d4\u01d7\u0003B!\u0000\u01d5\u01d7\u0003D\"\u0000\u01d6\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01c7"+
		"\u0001\u0000\u0000\u0000\u01da\u01d6\u0001\u0000\u0000\u0000\u01db7\u0001"+
		"\u0000\u0000\u0000\u01dc\u01e3\u0003:\u001d\u0000\u01dd\u01e3\u0003<\u001e"+
		"\u0000\u01de\u01e3\u0003>\u001f\u0000\u01df\u01e3\u0003@ \u0000\u01e0"+
		"\u01e3\u0003B!\u0000\u01e1\u01e3\u0003D\"\u0000\u01e2\u01dc\u0001\u0000"+
		"\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2\u01de\u0001\u0000"+
		"\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e39\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0005m\u0000\u0000\u01e5;\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e7\u0005`\u0000\u0000\u01e7=\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005"+
		"i\u0000\u0000\u01e9?\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005j\u0000"+
		"\u0000\u01ebA\u0001\u0000\u0000\u0000\u01ec\u01ed\u0007\u0004\u0000\u0000"+
		"\u01edC\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005^\u0000\u0000\u01ef\u01f2"+
		"\u0005m\u0000\u0000\u01f0\u01f1\u0005]\u0000\u0000\u01f1\u01f3\u0003X"+
		",\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005_\u0000\u0000"+
		"\u01f5E\u0001\u0000\u0000\u0000\u01f6\u01fa\u0007\u0005\u0000\u0000\u01f7"+
		"\u01f9\u0003T*\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fd\u0202\u0005P\u0000\u0000\u01fe\u0201\u0003,\u0016"+
		"\u0000\u01ff\u0201\u0003F#\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200"+
		"\u01ff\u0001\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000\u0202"+
		"\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203"+
		"\u0205\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205"+
		"\u0216\u0005Q\u0000\u0000\u0206\u020a\u0007\u0006\u0000\u0000\u0207\u0209"+
		"\u0003T*\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000"+
		"\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b\u0213\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000"+
		"\u0000\u0000\u020d\u020f\u0005P\u0000\u0000\u020e\u0210\u0003H$\u0000"+
		"\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0214\u0005Q\u0000\u0000\u0212"+
		"\u0214\u0005S\u0000\u0000\u0213\u020d\u0001\u0000\u0000\u0000\u0213\u0212"+
		"\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000\u0215\u01f6"+
		"\u0001\u0000\u0000\u0000\u0215\u0206\u0001\u0000\u0000\u0000\u0216G\u0001"+
		"\u0000\u0000\u0000\u0217\u021c\u0003R)\u0000\u0218\u0219\u0005S\u0000"+
		"\u0000\u0219\u021b\u0003R)\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b"+
		"\u021e\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0001\u0000\u0000\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e"+
		"\u021c\u0001\u0000\u0000\u0000\u021f\u0221\u0005S\u0000\u0000\u0220\u021f"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221I\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0003L&\u0000\u0223\u0224\u0005S\u0000"+
		"\u0000\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0227\u0005S\u0000\u0000"+
		"\u0226\u0222\u0001\u0000\u0000\u0000\u0226\u0225\u0001\u0000\u0000\u0000"+
		"\u0227K\u0001\u0000\u0000\u0000\u0228\u022d\u0003N\'\u0000\u0229\u022a"+
		"\u0005V\u0000\u0000\u022a\u022c\u0003N\'\u0000\u022b\u0229\u0001\u0000"+
		"\u0000\u0000\u022c\u022f\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000"+
		"\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022eM\u0001\u0000\u0000"+
		"\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230\u0232\u0005m\u0000\u0000"+
		"\u0231\u0230\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232\u0234\u0001\u0000\u0000\u0000\u0233\u0235\u0005m\u0000\u0000\u0234"+
		"\u0233\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235"+
		"\u023a\u0001\u0000\u0000\u0000\u0236\u0237\u0005T\u0000\u0000\u0237\u0238"+
		"\u0003R)\u0000\u0238\u0239\u0005U\u0000\u0000\u0239\u023b\u0001\u0000"+
		"\u0000\u0000\u023a\u0236\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000"+
		"\u0000\u0000\u023b\u0245\u0001\u0000\u0000\u0000\u023c\u0241\u0005m\u0000"+
		"\u0000\u023d\u023e\u0005T\u0000\u0000\u023e\u023f\u0003R)\u0000\u023f"+
		"\u0240\u0005U\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u023d"+
		"\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0244"+
		"\u0001\u0000\u0000\u0000\u0243\u023c\u0001\u0000\u0000\u0000\u0244\u0247"+
		"\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0001\u0000\u0000\u0000\u0246O\u0001\u0000\u0000\u0000\u0247\u0245\u0001"+
		"\u0000\u0000\u0000\u0248\u024a\u0003R)\u0000\u0249\u024b\u0005S\u0000"+
		"\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000"+
		"\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024e\u0005v\u0000\u0000"+
		"\u024d\u0248\u0001\u0000\u0000\u0000\u024d\u024c\u0001\u0000\u0000\u0000"+
		"\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0001\u0000\u0000\u0000\u0250Q\u0001\u0000\u0000\u0000\u0251"+
		"\u024f\u0001\u0000\u0000\u0000\u0252\u0253\u0005m\u0000\u0000\u0253\u0254"+
		"\u0005R\u0000\u0000\u0254\u0255\u0003T*\u0000\u0255S\u0001\u0000\u0000"+
		"\u0000\u0256\u025b\u0003Z-\u0000\u0257\u025b\u0003\\.\u0000\u0258\u025b"+
		"\u0005V\u0000\u0000\u0259\u025b\u0005X\u0000\u0000\u025a\u0256\u0001\u0000"+
		"\u0000\u0000\u025a\u0257\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000"+
		"\u0000\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000"+
		"\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000"+
		"\u0000\u0000\u025dU\u0001\u0000\u0000\u0000\u025e\u025f\u0005m\u0000\u0000"+
		"\u025fW\u0001\u0000\u0000\u0000\u0260\u0262\u0003Z-\u0000\u0261\u0260"+
		"\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0261"+
		"\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264Y\u0001"+
		"\u0000\u0000\u0000\u0265\u0267\u0007\u0007\u0000\u0000\u0266\u0265\u0001"+
		"\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0001"+
		"\u0000\u0000\u0000\u0268\u026a\u0005f\u0000\u0000\u0269\u026b\u0007\b"+
		"\u0000\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000"+
		"\u0000\u0000\u026b\u0271\u0001\u0000\u0000\u0000\u026c\u0271\u0005h\u0000"+
		"\u0000\u026d\u0271\u0005g\u0000\u0000\u026e\u0271\u0005m\u0000\u0000\u026f"+
		"\u0271\u0005i\u0000\u0000\u0270\u0266\u0001\u0000\u0000\u0000\u0270\u026c"+
		"\u0001\u0000\u0000\u0000\u0270\u026d\u0001\u0000\u0000\u0000\u0270\u026e"+
		"\u0001\u0000\u0000\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0271[\u0001"+
		"\u0000\u0000\u0000\u0272\u0273\u0005m\u0000\u0000\u0273\u0275\u0005T\u0000"+
		"\u0000\u0274\u0276\u0003T*\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275"+
		"\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277"+
		"\u0278\u0005U\u0000\u0000\u0278]\u0001\u0000\u0000\u0000\u0279\u027e\u0003"+
		"`0\u0000\u027a\u027b\u0007\t\u0000\u0000\u027b\u027d\u0003`0\u0000\u027c"+
		"\u027a\u0001\u0000\u0000\u0000\u027d\u0280\u0001\u0000\u0000\u0000\u027e"+
		"\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f"+
		"\u0284\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0005\u0013\u0000\u0000\u0282\u0284\u0003`0\u0000\u0283\u0279\u0001"+
		"\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0284_\u0001\u0000"+
		"\u0000\u0000\u0285\u028a\u0003b1\u0000\u0286\u0287\u0007\n\u0000\u0000"+
		"\u0287\u0289\u0003b1\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028c"+
		"\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028a\u028b"+
		"\u0001\u0000\u0000\u0000\u028ba\u0001\u0000\u0000\u0000\u028c\u028a\u0001"+
		"\u0000\u0000\u0000\u028d\u0292\u0003d2\u0000\u028e\u028f\u0007\u000b\u0000"+
		"\u0000\u028f\u0291\u0003d2\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291"+
		"\u0294\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292"+
		"\u0293\u0001\u0000\u0000\u0000\u0293c\u0001\u0000\u0000\u0000\u0294\u0292"+
		"\u0001\u0000\u0000\u0000\u0295\u029a\u0003f3\u0000\u0296\u0297\u0007\f"+
		"\u0000\u0000\u0297\u0299\u0003f3\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0299\u029c\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000\u0000\u0000"+
		"\u029a\u029b\u0001\u0000\u0000\u0000\u029be\u0001\u0000\u0000\u0000\u029c"+
		"\u029a\u0001\u0000\u0000\u0000\u029d\u02a1\u0003j5\u0000\u029e\u02a0\u0003"+
		"h4\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a2g\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a6\u0005)\u0000\u0000\u02a5\u02a7\u0003l6\u0000\u02a6\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8"+
		"\u0001\u0000\u0000\u0000\u02a8\u02b0\u0005*\u0000\u0000\u02a9\u02aa\u0005"+
		"+\u0000\u0000\u02aa\u02ab\u0003^/\u0000\u02ab\u02ac\u0005,\u0000\u0000"+
		"\u02ac\u02b0\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005/\u0000\u0000\u02ae"+
		"\u02b0\u00050\u0000\u0000\u02af\u02a4\u0001\u0000\u0000\u0000\u02af\u02a9"+
		"\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02b0i\u0001"+
		"\u0000\u0000\u0000\u02b1\u02dd\u00051\u0000\u0000\u02b2\u02dd\u00052\u0000"+
		"\u0000\u02b3\u02dd\u0003\u001c\u000e\u0000\u02b4\u02dd\u0005\u0014\u0000"+
		"\u0000\u02b5\u02dd\u0005\u0015\u0000\u0000\u02b6\u02dd\u0005\u0016\u0000"+
		"\u0000\u02b7\u02dd\u00050\u0000\u0000\u02b8\u02b9\u0005)\u0000\u0000\u02b9"+
		"\u02ba\u0003^/\u0000\u02ba\u02bb\u0005*\u0000\u0000\u02bb\u02dd\u0001"+
		"\u0000\u0000\u0000\u02bc\u02c5\u0005+\u0000\u0000\u02bd\u02c2\u0003^/"+
		"\u0000\u02be\u02bf\u0005\u001c\u0000\u0000\u02bf\u02c1\u0003^/\u0000\u02c0"+
		"\u02be\u0001\u0000\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5"+
		"\u02bd\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c7\u02dd\u0005,\u0000\u0000\u02c8\u02d9"+
		"\u0005-\u0000\u0000\u02c9\u02cc\u0003^/\u0000\u02ca\u02cb\u0005\u001a"+
		"\u0000\u0000\u02cb\u02cd\u0003^/\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02d6\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cf\u0005\u001c\u0000\u0000\u02cf\u02d2\u0003^/\u0000\u02d0\u02d1"+
		"\u0005\u001a\u0000\u0000\u02d1\u02d3\u0003^/\u0000\u02d2\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d4\u02ce\u0001\u0000\u0000\u0000\u02d5\u02d8\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000"+
		"\u0000\u0000\u02d7\u02da\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000"+
		"\u0000\u0000\u02d9\u02c9\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000"+
		"\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dd\u0005.\u0000"+
		"\u0000\u02dc\u02b1\u0001\u0000\u0000\u0000\u02dc\u02b2\u0001\u0000\u0000"+
		"\u0000\u02dc\u02b3\u0001\u0000\u0000\u0000\u02dc\u02b4\u0001\u0000\u0000"+
		"\u0000\u02dc\u02b5\u0001\u0000\u0000\u0000\u02dc\u02b6\u0001\u0000\u0000"+
		"\u0000\u02dc\u02b7\u0001\u0000\u0000\u0000\u02dc\u02b8\u0001\u0000\u0000"+
		"\u0000\u02dc\u02bc\u0001\u0000\u0000\u0000\u02dc\u02c8\u0001\u0000\u0000"+
		"\u0000\u02ddk\u0001\u0000\u0000\u0000\u02de\u02e3\u0003^/\u0000\u02df"+
		"\u02e0\u0005\u001c\u0000\u0000\u02e0\u02e2\u0003^/\u0000\u02e1\u02df\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4m\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000_qx}\u008f\u0098\u00a4"+
		"\u00b2\u00bc\u00c5\u00d0\u00d7\u00e0\u00e4\u00eb\u00f0\u00fb\u0103\u010d"+
		"\u0113\u0117\u011a\u0120\u0126\u012a\u012d\u013d\u014e\u0150\u0160\u0162"+
		"\u016a\u0179\u017f\u0182\u0187\u018b\u0193\u0195\u019a\u019f\u01a8\u01b0"+
		"\u01b6\u01bc\u01c0\u01c7\u01cd\u01cf\u01d6\u01d8\u01da\u01e2\u01f2\u01fa"+
		"\u0200\u0202\u020a\u020f\u0213\u0215\u021c\u0220\u0226\u022d\u0231\u0234"+
		"\u023a\u0241\u0245\u024a\u024d\u024f\u025a\u025c\u0263\u0266\u026a\u0270"+
		"\u0275\u027e\u0283\u028a\u0292\u029a\u02a1\u02a6\u02af\u02c2\u02c5\u02cc"+
		"\u02d2\u02d6\u02d9\u02dc\u02e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}