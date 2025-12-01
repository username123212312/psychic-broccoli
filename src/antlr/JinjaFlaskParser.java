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
		RULE_program = 0, RULE_statement = 1, RULE_compoundStmt = 2, RULE_defStmt = 3, 
		RULE_simpleStmt = 4, RULE_ifStmt = 5, RULE_block = 6, RULE_assignmentStmt = 7, 
		RULE_returnStmt = 8, RULE_globalStmt = 9, RULE_importStmt = 10, RULE_forLoop = 11, 
		RULE_whileLoop = 12, RULE_tripleQuotedString = 13, RULE_document = 14, 
		RULE_content = 15, RULE_element = 16, RULE_attribute = 17, RULE_styleElement = 18, 
		RULE_styleContent = 19, RULE_cssStatement = 20, RULE_ruleset = 21, RULE_selectorList = 22, 
		RULE_selectorGroup = 23, RULE_selector = 24, RULE_combinator = 25, RULE_simpleSelectorSequence = 26, 
		RULE_simpleSelector = 27, RULE_typeSelector = 28, RULE_universal = 29, 
		RULE_hash = 30, RULE_classSelector = 31, RULE_pseudo = 32, RULE_attributeSelector = 33, 
		RULE_atRule = 34, RULE_declarationList = 35, RULE_importTerminator = 36, 
		RULE_mediaQueryList = 37, RULE_mediaQuery = 38, RULE_declarationBlock = 39, 
		RULE_declaration = 40, RULE_anyValue = 41, RULE_propertyName = 42, RULE_value = 43, 
		RULE_term = 44, RULE_functionCall = 45, RULE_expression = 46, RULE_comparisonExpression = 47, 
		RULE_additiveExpression = 48, RULE_multiplicativeExpression = 49, RULE_primaryExpression = 50, 
		RULE_trailer = 51, RULE_atom = 52, RULE_argumentList = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "compoundStmt", "defStmt", "simpleStmt", "ifStmt", 
			"block", "assignmentStmt", "returnStmt", "globalStmt", "importStmt", 
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
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903824677832L) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(108);
					match(NEWLINE);
					}
					break;
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
				case STRING:
				case TRIPLE_DOUBLE_START:
				case TRIPLE_SINGLE_START:
					{
					setState(109);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case FROM:
			case IMPORT:
			case GLOBAL:
			case NOT:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				simpleStmt();
				}
				break;
			case DEF:
			case IF:
			case FOR:
			case WHILE:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				compoundStmt();
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
	public static class CompoundStmtContext extends ParserRuleContext {
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
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).enterCompoundStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaFlaskParserListener ) ((JinjaFlaskParserListener)listener).exitCompoundStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaFlaskParserVisitor ) return ((JinjaFlaskParserVisitor<? extends T>)visitor).visitCompoundStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compoundStmt);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				ifStmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				forLoop();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				whileLoop();
				}
				break;
			case DEF:
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				defStmt();
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
	public static class DefStmtContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(JinjaFlaskParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(JinjaFlaskParser.NAME, 0); }
		public TerminalNode LP() { return getToken(JinjaFlaskParser.LP, 0); }
		public TerminalNode RP() { return getToken(JinjaFlaskParser.RP, 0); }
		public TerminalNode COLON() { return getToken(JinjaFlaskParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> AT() { return getTokens(JinjaFlaskParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(JinjaFlaskParser.AT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(JinjaFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(JinjaFlaskParser.NEWLINE, i);
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
		enterRule(_localctx, 6, RULE_defStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(127);
				match(AT);
				setState(128);
				expression();
				setState(129);
				match(NEWLINE);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(DEF);
			setState(137);
			match(NAME);
			setState(138);
			match(LP);
			setState(139);
			match(RP);
			setState(140);
			match(COLON);
			setState(141);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public GlobalStmtContext globalStmt() {
			return getRuleContext(GlobalStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
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
		enterRule(_localctx, 8, RULE_simpleStmt);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				importStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				globalStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				returnStmt();
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
		enterRule(_localctx, 10, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IF);
			setState(151);
			expression();
			setState(152);
			match(COLON);
			setState(153);
			match(NEWLINE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(154);
				match(NEWLINE);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			block();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(161);
				match(ELIF);
				setState(162);
				expression();
				setState(163);
				match(COLON);
				setState(164);
				match(NEWLINE);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(165);
					match(NEWLINE);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				block();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(178);
				match(ELSE);
				setState(179);
				match(COLON);
				setState(180);
				match(NEWLINE);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(181);
					match(NEWLINE);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
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
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(INDENT);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903824677824L) != 0)) {
				{
				{
				setState(191);
				statement();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(192);
					match(NEWLINE);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
		enterRule(_localctx, 14, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(NAME);
			setState(206);
			match(ASSIGN);
			setState(207);
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
		enterRule(_localctx, 16, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(RETURN);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(210);
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
		enterRule(_localctx, 18, RULE_globalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(GLOBAL);
			setState(214);
			match(NAME);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				match(NAME);
				}
				}
				setState(221);
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
		enterRule(_localctx, 20, RULE_importStmt);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(FROM);
				setState(223);
				expression();
				setState(224);
				match(IMPORT);
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(225);
					match(STAR);
					}
					break;
				case NAME:
					{
					setState(226);
					match(NAME);
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(227);
						match(AS);
						setState(228);
						match(NAME);
						}
					}

					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(231);
						match(COMMA);
						setState(232);
						match(NAME);
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AS) {
							{
							setState(233);
							match(AS);
							setState(234);
							match(NAME);
							}
						}

						}
						}
						setState(241);
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
				setState(244);
				match(IMPORT);
				setState(245);
				match(NAME);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(246);
					match(AS);
					setState(247);
					match(NAME);
					}
				}

				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(250);
					match(COMMA);
					setState(251);
					match(NAME);
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(252);
						match(AS);
						setState(253);
						match(NAME);
						}
					}

					}
					}
					setState(260);
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
		enterRule(_localctx, 22, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(FOR);
			setState(264);
			match(NAME);
			setState(265);
			match(IN);
			setState(266);
			expression();
			setState(267);
			match(COLON);
			setState(268);
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
		enterRule(_localctx, 24, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(WHILE);
			setState(271);
			expression();
			setState(272);
			match(COLON);
			setState(273);
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
		enterRule(_localctx, 26, RULE_tripleQuotedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==TRIPLE_DOUBLE_START || _la==TRIPLE_SINGLE_START) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(276);
				document();
				}
				break;
			}
			setState(279);
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
		public List<TerminalNode> TRIPLE_DOUBLE_END() { return getTokens(JinjaFlaskParser.TRIPLE_DOUBLE_END); }
		public TerminalNode TRIPLE_DOUBLE_END(int i) {
			return getToken(JinjaFlaskParser.TRIPLE_DOUBLE_END, i);
		}
		public List<TerminalNode> TRIPLE_SINGLE_END() { return getTokens(JinjaFlaskParser.TRIPLE_SINGLE_END); }
		public TerminalNode TRIPLE_SINGLE_END(int i) {
			return getToken(JinjaFlaskParser.TRIPLE_SINGLE_END, i);
		}
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
		enterRule(_localctx, 28, RULE_document);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==TRIPLE_DOUBLE_END || _la==TRIPLE_SINGLE_END) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(295);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
						{
						setState(282);
						match(SCRIPTLET);
						}
						break;
					case SEA_WS:
						{
						setState(283);
						match(SEA_WS);
						}
						break;
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
						{
						setState(284);
						element();
						}
						break;
					case HTML_TEXT:
						{
						setState(285);
						match(HTML_TEXT);
						}
						break;
					case JINJA_EXPR_START:
						{
						setState(286);
						match(JINJA_EXPR_START);
						setState(287);
						match(JINJA_EXPR_CONTENT);
						setState(288);
						match(JINJA_EXPR_END);
						}
						break;
					case JINJA_STMT_START:
						{
						setState(289);
						match(JINJA_STMT_START);
						setState(290);
						match(JINJA_STMT_CONTENT);
						setState(291);
						match(JINJA_STMT_END);
						}
						break;
					case JINJA_COMMENT_START:
						{
						setState(292);
						match(JINJA_COMMENT_START);
						setState(293);
						match(JINJA_COMMENT_CONTENT);
						setState(294);
						match(JINJA_COMMENT_END);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 30, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 15687L) != 0)) {
				{
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_TEXT:
					{
					setState(302);
					match(HTML_TEXT);
					}
					break;
				case SCRIPT_OPEN:
				case STYLE_OPEN:
				case TAG_OPEN:
					{
					setState(303);
					element();
					}
					break;
				case CDATA:
					{
					setState(304);
					match(CDATA);
					}
					break;
				case SCRIPTLET:
					{
					setState(305);
					match(SCRIPTLET);
					}
					break;
				case JINJA_EXPR_START:
					{
					setState(306);
					match(JINJA_EXPR_START);
					setState(307);
					match(JINJA_EXPR_CONTENT);
					setState(308);
					match(JINJA_EXPR_END);
					}
					break;
				case JINJA_STMT_START:
					{
					setState(309);
					match(JINJA_STMT_START);
					setState(310);
					match(JINJA_STMT_CONTENT);
					setState(311);
					match(JINJA_STMT_END);
					}
					break;
				case JINJA_COMMENT_START:
					{
					setState(312);
					match(JINJA_COMMENT_START);
					setState(313);
					match(JINJA_COMMENT_CONTENT);
					setState(314);
					match(JINJA_COMMENT_END);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(319);
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
		enterRule(_localctx, 32, RULE_element);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(TAG_OPEN);
				setState(321);
				match(TAG_NAME);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(322);
					attribute();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				match(TAG_CLOSE);
				setState(329);
				document();
				setState(330);
				match(TAG_OPEN);
				setState(331);
				match(TAG_SLASH);
				setState(332);
				match(TAG_NAME);
				setState(333);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(TAG_OPEN);
				setState(336);
				match(TAG_NAME);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(337);
					attribute();
					}
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(343);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(SCRIPT_OPEN);
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(345);
					match(SCRIPT_BODY);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(348);
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
		enterRule(_localctx, 34, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(TAG_NAME);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(352);
				match(TAG_EQUALS);
				setState(353);
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
		enterRule(_localctx, 36, RULE_styleElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(STYLE_OPEN);
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(357);
				styleContent();
				}
				break;
			}
			setState(360);
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
		enterRule(_localctx, 38, RULE_styleContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 3161663L) != 0)) {
				{
				setState(366);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_ASTERISK:
				case HASH:
				case CLASS:
				case PSEUDO_ELEMENT:
				case PSEUDO_CLASS:
				case IDENT:
					{
					setState(362);
					ruleset();
					}
					break;
				case AT_IMPORT:
				case AT_MEDIA:
				case AT_FONT_FACE:
				case AT_KEYFRAMES:
				case AT_SUPPORTS:
					{
					setState(363);
					atRule();
					}
					break;
				case JINJA_STMT:
					{
					setState(364);
					match(JINJA_STMT);
					}
					break;
				case JINJA_COMMENT:
					{
					setState(365);
					match(JINJA_COMMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(370);
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
		enterRule(_localctx, 40, RULE_cssStatement);
		try {
			setState(373);
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
				setState(371);
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
				setState(372);
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
		enterRule(_localctx, 42, RULE_ruleset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			selectorList();
			setState(376);
			match(CSS_LBRACE);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(377);
				declarationList();
				}
			}

			setState(380);
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
		enterRule(_localctx, 44, RULE_selectorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			selector();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(383);
				match(CSS_COMMA);
				setState(384);
				selector();
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
			setState(390);
			selector();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(391);
				match(CSS_COMMA);
				setState(392);
				selector();
				}
				}
				setState(397);
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
		enterRule(_localctx, 48, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(398);
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
				setState(401); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 15873L) != 0) );
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 7L) != 0)) {
				{
				{
				setState(403);
				_la = _input.LA(1);
				if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(404);
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
					setState(407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 15873L) != 0) );
				}
				}
				setState(413);
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
			setState(414);
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
		enterRule(_localctx, 52, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_ASTERISK:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(416);
					typeSelector();
					}
					break;
				case CSS_ASTERISK:
					{
					setState(417);
					universal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 30721L) != 0)) {
					{
					setState(424);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HASH:
						{
						setState(420);
						hash();
						}
						break;
					case CLASS:
						{
						setState(421);
						classSelector();
						}
						break;
					case PSEUDO_ELEMENT:
					case PSEUDO_CLASS:
						{
						setState(422);
						pseudo();
						}
						break;
					case CSS_LBRACKET:
						{
						setState(423);
						attributeSelector();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(428);
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
				setState(433); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(433);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HASH:
						{
						setState(429);
						hash();
						}
						break;
					case CLASS:
						{
						setState(430);
						classSelector();
						}
						break;
					case PSEUDO_ELEMENT:
					case PSEUDO_CLASS:
						{
						setState(431);
						pseudo();
						}
						break;
					case CSS_LBRACKET:
						{
						setState(432);
						attributeSelector();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(435); 
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
		enterRule(_localctx, 54, RULE_simpleSelector);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				typeSelector();
				}
				break;
			case CSS_ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				universal();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				hash();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				classSelector();
				}
				break;
			case PSEUDO_ELEMENT:
			case PSEUDO_CLASS:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				pseudo();
				}
				break;
			case CSS_LBRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
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
			setState(447);
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
			setState(449);
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
			setState(451);
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
			setState(453);
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
			setState(455);
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
			setState(457);
			match(CSS_LBRACKET);
			setState(458);
			match(IDENT);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_EQUALS) {
				{
				setState(459);
				match(CSS_EQUALS);
				setState(460);
				value();
				}
			}

			setState(463);
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
		enterRule(_localctx, 68, RULE_atRule);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_MEDIA:
			case AT_SUPPORTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				_la = _input.LA(1);
				if ( !(_la==AT_MEDIA || _la==AT_SUPPORTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 9371669L) != 0)) {
					{
					{
					setState(466);
					anyValue();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(472);
				match(CSS_LBRACE);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 15935L) != 0)) {
					{
					setState(475);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CSS_ASTERISK:
					case HASH:
					case CLASS:
					case PSEUDO_ELEMENT:
					case PSEUDO_CLASS:
					case IDENT:
						{
						setState(473);
						ruleset();
						}
						break;
					case AT_IMPORT:
					case AT_MEDIA:
					case AT_FONT_FACE:
					case AT_KEYFRAMES:
					case AT_SUPPORTS:
						{
						setState(474);
						atRule();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480);
				match(CSS_RBRACE);
				}
				break;
			case AT_IMPORT:
			case AT_FONT_FACE:
			case AT_KEYFRAMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 13L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 9371669L) != 0)) {
					{
					{
					setState(482);
					anyValue();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(494);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_LBRACE:
					{
					setState(488);
					match(CSS_LBRACE);
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENT) {
						{
						setState(489);
						declarationList();
						}
					}

					setState(492);
					match(CSS_RBRACE);
					}
					break;
				case CSS_SEMICOLON:
					{
					setState(493);
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
		enterRule(_localctx, 70, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			declaration();
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(499);
					match(CSS_SEMICOLON);
					setState(500);
					declaration();
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_SEMICOLON) {
				{
				setState(506);
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
		enterRule(_localctx, 72, RULE_importTerminator);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				mediaQueryList();
				setState(510);
				match(CSS_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
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
		enterRule(_localctx, 74, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			mediaQuery();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(516);
				match(CSS_COMMA);
				setState(517);
				mediaQuery();
				}
				}
				setState(522);
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
		enterRule(_localctx, 76, RULE_mediaQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(523);
				match(IDENT);
				}
				break;
			}
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(526);
				match(IDENT);
				}
				break;
			}
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_LPAREN) {
				{
				setState(529);
				match(CSS_LPAREN);
				setState(530);
				declaration();
				setState(531);
				match(CSS_RPAREN);
				}
			}

			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(535);
				match(IDENT);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_LPAREN) {
					{
					setState(536);
					match(CSS_LPAREN);
					setState(537);
					declaration();
					setState(538);
					match(CSS_RPAREN);
					}
				}

				}
				}
				setState(546);
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
		enterRule(_localctx, 78, RULE_declarationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT || _la==JINJA_STATEMENT) {
				{
				setState(552);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(547);
					declaration();
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CSS_SEMICOLON) {
						{
						setState(548);
						match(CSS_SEMICOLON);
						}
					}

					}
					break;
				case JINJA_STATEMENT:
					{
					setState(551);
					match(JINJA_STATEMENT);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		enterRule(_localctx, 80, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(IDENT);
			setState(558);
			match(CSS_COLON);
			setState(559);
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
		enterRule(_localctx, 82, RULE_anyValue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(565);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(561);
						term();
						}
						break;
					case 2:
						{
						setState(562);
						functionCall();
						}
						break;
					case 3:
						{
						setState(563);
						match(CSS_COMMA);
						}
						break;
					case 4:
						{
						setState(564);
						match(CSS_SLASH);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(567); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
		enterRule(_localctx, 84, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
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
		enterRule(_localctx, 86, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(571);
				term();
				}
				}
				setState(574); 
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
		enterRule(_localctx, 88, RULE_term);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case CSS_PLUS:
			case CSS_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==CSS_PLUS) {
					{
					setState(576);
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
				setState(579);
				match(CSS_NUMBER);
				setState(581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(580);
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
				setState(583);
				match(CSS_STRING);
				}
				break;
			case COLOR_HEX:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(COLOR_HEX);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				match(IDENT);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(586);
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
		enterRule(_localctx, 90, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(IDENT);
			setState(590);
			match(CSS_LPAREN);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 9371669L) != 0)) {
				{
				setState(591);
				anyValue();
				}
			}

			setState(594);
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
		enterRule(_localctx, 92, RULE_expression);
		int _la;
		try {
			setState(606);
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
				setState(596);
				comparisonExpression();
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(597);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(598);
					comparisonExpression();
					}
					}
					setState(603);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NOT:
				_localctx = new NotOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				match(NOT);
				setState(605);
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
		enterRule(_localctx, 94, RULE_comparisonExpression);
		int _la;
		try {
			_localctx = new ComparisonOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			additiveExpression();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) {
				{
				{
				setState(609);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(610);
				additiveExpression();
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
		enterRule(_localctx, 96, RULE_additiveExpression);
		int _la;
		try {
			_localctx = new AdditiveOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			multiplicativeExpression();
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(617);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(618);
				multiplicativeExpression();
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
		enterRule(_localctx, 98, RULE_multiplicativeExpression);
		int _la;
		try {
			_localctx = new MultiplicativeOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			primaryExpression();
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || _la==SLASH) {
				{
				{
				setState(625);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==SLASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(626);
				primaryExpression();
				}
				}
				setState(631);
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
		enterRule(_localctx, 100, RULE_primaryExpression);
		try {
			int _alt;
			_localctx = new AtomExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			atom();
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(633);
					trailer();
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		enterRule(_localctx, 102, RULE_trailer);
		int _la;
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				_localctx = new FunctionCallTrailerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(LP);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903774261248L) != 0)) {
					{
					setState(640);
					argumentList();
					}
				}

				setState(643);
				match(RP);
				}
				break;
			case LBRACK:
				_localctx = new SubscriptTrailerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				match(LBRACK);
				setState(645);
				expression();
				setState(646);
				match(RBRACK);
				}
				break;
			case DOT:
				_localctx = new AttributeAccessTrailerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				match(DOT);
				setState(649);
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
		enterRule(_localctx, 104, RULE_atom);
		int _la;
		try {
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				match(STRING);
				}
				break;
			case TRIPLE_DOUBLE_START:
			case TRIPLE_SINGLE_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				tripleQuotedString();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(655);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(656);
				match(FALSE);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 6);
				{
				setState(657);
				match(NONE);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 7);
				{
				setState(658);
				match(NAME);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 8);
				{
				setState(659);
				match(LP);
				setState(660);
				expression();
				setState(661);
				match(RP);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 9);
				{
				setState(663);
				match(LBRACK);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903774261248L) != 0)) {
					{
					setState(664);
					expression();
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(665);
						match(COMMA);
						setState(666);
						expression();
						}
						}
						setState(671);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(674);
				match(RBRACK);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 10);
				{
				setState(675);
				match(LBRACE);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8771903774261248L) != 0)) {
					{
					setState(676);
					expression();
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(677);
						match(COLON);
						setState(678);
						expression();
						}
					}

					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(681);
						match(COMMA);
						setState(682);
						expression();
						setState(685);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(683);
							match(COLON);
							setState(684);
							expression();
							}
						}

						}
						}
						setState(691);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(694);
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
		enterRule(_localctx, 106, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			expression();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(698);
				match(COMMA);
				setState(699);
				expression();
				}
				}
				setState(704);
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
		"\u0004\u0001v\u02c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000\u0001\u0000"+
		"\u0005\u0000o\b\u0000\n\u0000\f\u0000r\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001x\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002~\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0084\b\u0003\n\u0003\f\u0003\u0087"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0095\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u009c\b\u0005\n\u0005\f\u0005\u009f\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00a7\b\u0005\n\u0005\f\u0005\u00aa\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00ae\b\u0005\n\u0005\f\u0005\u00b1\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b7\b\u0005\n\u0005"+
		"\f\u0005\u00ba\t\u0005\u0001\u0005\u0003\u0005\u00bd\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u00c2\b\u0006\n\u0006\f\u0006\u00c5"+
		"\t\u0006\u0005\u0006\u00c7\b\u0006\n\u0006\f\u0006\u00ca\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0003\b\u00d4\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00da"+
		"\b\t\n\t\f\t\u00dd\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00e6\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ec"+
		"\b\n\u0005\n\u00ee\b\n\n\n\f\n\u00f1\t\n\u0003\n\u00f3\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00f9\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00ff\b\n\u0005\n\u0101\b\n\n\n\f\n\u0104\t\n\u0003\n\u0106\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r"+
		"\u0116\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0128\b\u000e"+
		"\u0005\u000e\u012a\b\u000e\n\u000e\f\u000e\u012d\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u013c\b\u000f\n\u000f\f\u000f\u013f\t\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0144\b\u0010\n\u0010\f\u0010\u0147\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0153\b\u0010\n"+
		"\u0010\f\u0010\u0156\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u015b\b\u0010\u0001\u0010\u0003\u0010\u015e\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0163\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0167\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u016f\b\u0013\n\u0013\f\u0013\u0172"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0176\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u017b\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0182\b\u0016\n\u0016"+
		"\f\u0016\u0185\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u018a\b\u0017\n\u0017\f\u0017\u018d\t\u0017\u0001\u0018\u0004\u0018\u0190"+
		"\b\u0018\u000b\u0018\f\u0018\u0191\u0001\u0018\u0001\u0018\u0004\u0018"+
		"\u0196\b\u0018\u000b\u0018\f\u0018\u0197\u0005\u0018\u019a\b\u0018\n\u0018"+
		"\f\u0018\u019d\t\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01a3\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u01a9\b\u001a\n\u001a\f\u001a\u01ac\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u01b2\b\u001a\u000b\u001a\f"+
		"\u001a\u01b3\u0003\u001a\u01b6\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01be\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u01ce\b"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0005\"\u01d4\b\"\n\"\f\"\u01d7\t\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u01dc\b\"\n\"\f\"\u01df\t\"\u0001\"\u0001\""+
		"\u0001\"\u0005\"\u01e4\b\"\n\"\f\"\u01e7\t\"\u0001\"\u0001\"\u0003\"\u01eb"+
		"\b\"\u0001\"\u0001\"\u0003\"\u01ef\b\"\u0003\"\u01f1\b\"\u0001#\u0001"+
		"#\u0001#\u0005#\u01f6\b#\n#\f#\u01f9\t#\u0001#\u0003#\u01fc\b#\u0001$"+
		"\u0001$\u0001$\u0001$\u0003$\u0202\b$\u0001%\u0001%\u0001%\u0005%\u0207"+
		"\b%\n%\f%\u020a\t%\u0001&\u0003&\u020d\b&\u0001&\u0003&\u0210\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0216\b&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u021d\b&\u0005&\u021f\b&\n&\f&\u0222\t&\u0001\'\u0001\'\u0003"+
		"\'\u0226\b\'\u0001\'\u0005\'\u0229\b\'\n\'\f\'\u022c\t\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0004)\u0236\b)\u000b)\f)"+
		"\u0237\u0001*\u0001*\u0001+\u0004+\u023d\b+\u000b+\f+\u023e\u0001,\u0003"+
		",\u0242\b,\u0001,\u0001,\u0003,\u0246\b,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u024c\b,\u0001-\u0001-\u0001-\u0003-\u0251\b-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0005.\u0258\b.\n.\f.\u025b\t.\u0001.\u0001.\u0003.\u025f\b."+
		"\u0001/\u0001/\u0001/\u0005/\u0264\b/\n/\f/\u0267\t/\u00010\u00010\u0001"+
		"0\u00050\u026c\b0\n0\f0\u026f\t0\u00011\u00011\u00011\u00051\u0274\b1"+
		"\n1\f1\u0277\t1\u00012\u00012\u00052\u027b\b2\n2\f2\u027e\t2\u00013\u0001"+
		"3\u00033\u0282\b3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0003"+
		"3\u028b\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00054\u029c\b4\n4\f4\u029f"+
		"\t4\u00034\u02a1\b4\u00014\u00014\u00014\u00014\u00014\u00034\u02a8\b"+
		"4\u00014\u00014\u00014\u00014\u00034\u02ae\b4\u00054\u02b0\b4\n4\f4\u02b3"+
		"\t4\u00034\u02b5\b4\u00014\u00034\u02b8\b4\u00015\u00015\u00015\u0005"+
		"5\u02bd\b5\n5\f5\u02c0\t5\u00015\u0000\u00006\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\r\u0001\u000034\u0001\u000056\u0002"+
		"\u0000``im\u0001\u0000Z\\\u0001\u0000kl\u0002\u0000bbee\u0002\u0000aa"+
		"cd\u0002\u0000%%ZZ\u0002\u0000YYmm\u0001\u0000\u0011\u0012\u0001\u0000"+
		"\u001e#\u0001\u0000$%\u0001\u0000&\'\u0311\u0000p\u0001\u0000\u0000\u0000"+
		"\u0002w\u0001\u0000\u0000\u0000\u0004}\u0001\u0000\u0000\u0000\u0006\u0085"+
		"\u0001\u0000\u0000\u0000\b\u0094\u0001\u0000\u0000\u0000\n\u0096\u0001"+
		"\u0000\u0000\u0000\f\u00be\u0001\u0000\u0000\u0000\u000e\u00cd\u0001\u0000"+
		"\u0000\u0000\u0010\u00d1\u0001\u0000\u0000\u0000\u0012\u00d5\u0001\u0000"+
		"\u0000\u0000\u0014\u0105\u0001\u0000\u0000\u0000\u0016\u0107\u0001\u0000"+
		"\u0000\u0000\u0018\u010e\u0001\u0000\u0000\u0000\u001a\u0113\u0001\u0000"+
		"\u0000\u0000\u001c\u012b\u0001\u0000\u0000\u0000\u001e\u013d\u0001\u0000"+
		"\u0000\u0000 \u015d\u0001\u0000\u0000\u0000\"\u015f\u0001\u0000\u0000"+
		"\u0000$\u0164\u0001\u0000\u0000\u0000&\u0170\u0001\u0000\u0000\u0000("+
		"\u0175\u0001\u0000\u0000\u0000*\u0177\u0001\u0000\u0000\u0000,\u017e\u0001"+
		"\u0000\u0000\u0000.\u0186\u0001\u0000\u0000\u00000\u018f\u0001\u0000\u0000"+
		"\u00002\u019e\u0001\u0000\u0000\u00004\u01b5\u0001\u0000\u0000\u00006"+
		"\u01bd\u0001\u0000\u0000\u00008\u01bf\u0001\u0000\u0000\u0000:\u01c1\u0001"+
		"\u0000\u0000\u0000<\u01c3\u0001\u0000\u0000\u0000>\u01c5\u0001\u0000\u0000"+
		"\u0000@\u01c7\u0001\u0000\u0000\u0000B\u01c9\u0001\u0000\u0000\u0000D"+
		"\u01f0\u0001\u0000\u0000\u0000F\u01f2\u0001\u0000\u0000\u0000H\u0201\u0001"+
		"\u0000\u0000\u0000J\u0203\u0001\u0000\u0000\u0000L\u020c\u0001\u0000\u0000"+
		"\u0000N\u022a\u0001\u0000\u0000\u0000P\u022d\u0001\u0000\u0000\u0000R"+
		"\u0235\u0001\u0000\u0000\u0000T\u0239\u0001\u0000\u0000\u0000V\u023c\u0001"+
		"\u0000\u0000\u0000X\u024b\u0001\u0000\u0000\u0000Z\u024d\u0001\u0000\u0000"+
		"\u0000\\\u025e\u0001\u0000\u0000\u0000^\u0260\u0001\u0000\u0000\u0000"+
		"`\u0268\u0001\u0000\u0000\u0000b\u0270\u0001\u0000\u0000\u0000d\u0278"+
		"\u0001\u0000\u0000\u0000f\u028a\u0001\u0000\u0000\u0000h\u02b7\u0001\u0000"+
		"\u0000\u0000j\u02b9\u0001\u0000\u0000\u0000lo\u0005\u0003\u0000\u0000"+
		"mo\u0003\u0002\u0001\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005"+
		"\u0000\u0000\u0001t\u0001\u0001\u0000\u0000\u0000ux\u0003\b\u0004\u0000"+
		"vx\u0003\u0004\u0002\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000x\u0003\u0001\u0000\u0000\u0000y~\u0003\n\u0005\u0000z~\u0003\u0016"+
		"\u000b\u0000{~\u0003\u0018\f\u0000|~\u0003\u0006\u0003\u0000}y\u0001\u0000"+
		"\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u0005\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0019"+
		"\u0000\u0000\u0080\u0081\u0003\\.\u0000\u0081\u0082\u0005\u0003\u0000"+
		"\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000"+
		"\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0006\u0000"+
		"\u0000\u0089\u008a\u00050\u0000\u0000\u008a\u008b\u0005)\u0000\u0000\u008b"+
		"\u008c\u0005*\u0000\u0000\u008c\u008d\u0005\u001a\u0000\u0000\u008d\u008e"+
		"\u0003\f\u0006\u0000\u008e\u0007\u0001\u0000\u0000\u0000\u008f\u0095\u0003"+
		"\u000e\u0007\u0000\u0090\u0095\u0003\\.\u0000\u0091\u0095\u0003\u0014"+
		"\n\u0000\u0092\u0095\u0003\u0012\t\u0000\u0093\u0095\u0003\u0010\b\u0000"+
		"\u0094\u008f\u0001\u0000\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000"+
		"\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\u0093\u0001\u0000\u0000\u0000\u0095\t\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005\u000b\u0000\u0000\u0097\u0098\u0003\\.\u0000\u0098\u0099"+
		"\u0005\u001a\u0000\u0000\u0099\u009d\u0005\u0003\u0000\u0000\u009a\u009c"+
		"\u0005\u0003\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u00af\u0003\f\u0006\u0000\u00a1\u00a2\u0005"+
		"\f\u0000\u0000\u00a2\u00a3\u0003\\.\u0000\u00a3\u00a4\u0005\u001a\u0000"+
		"\u0000\u00a4\u00a8\u0005\u0003\u0000\u0000\u00a5\u00a7\u0005\u0003\u0000"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0003\f\u0006\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a1\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00bc\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\r\u0000\u0000\u00b3\u00b4\u0005\u001a\u0000\u0000\u00b4"+
		"\u00b8\u0005\u0003\u0000\u0000\u00b5\u00b7\u0005\u0003\u0000\u0000\u00b6"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bd\u0003\f\u0006\u0000\u00bc\u00b2\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u000b\u0001\u0000\u0000\u0000\u00be\u00c8"+
		"\u0005\u0001\u0000\u0000\u00bf\u00c3\u0003\u0002\u0001\u0000\u00c0\u00c2"+
		"\u0005\u0003\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00bf\u0001\u0000\u0000\u0000\u00c7\u00ca"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0002\u0000\u0000\u00cc\r\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u00050\u0000\u0000\u00ce\u00cf\u0005\u001d"+
		"\u0000\u0000\u00cf\u00d0\u0003\\.\u0000\u00d0\u000f\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d3\u0005\u0007\u0000\u0000\u00d2\u00d4\u0003\\.\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u0011\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0010\u0000\u0000"+
		"\u00d6\u00db\u00050\u0000\u0000\u00d7\u00d8\u0005\u001c\u0000\u0000\u00d8"+
		"\u00da\u00050\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u0013\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0005\b\u0000\u0000\u00df\u00e0\u0003"+
		"\\.\u0000\u00e0\u00f2\u0005\t\u0000\u0000\u00e1\u00f3\u0005&\u0000\u0000"+
		"\u00e2\u00e5\u00050\u0000\u0000\u00e3\u00e4\u0005\n\u0000\u0000\u00e4"+
		"\u00e6\u00050\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00ef\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0005\u001c\u0000\u0000\u00e8\u00eb\u00050\u0000\u0000\u00e9\u00ea\u0005"+
		"\n\u0000\u0000\u00ea\u00ec\u00050\u0000\u0000\u00eb\u00e9\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f2\u00e1\u0001\u0000\u0000\u0000\u00f2\u00e2\u0001\u0000"+
		"\u0000\u0000\u00f3\u0106\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\t\u0000"+
		"\u0000\u00f5\u00f8\u00050\u0000\u0000\u00f6\u00f7\u0005\n\u0000\u0000"+
		"\u00f7\u00f9\u00050\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9\u0102\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005\u001c\u0000\u0000\u00fb\u00fe\u00050\u0000\u0000\u00fc\u00fd"+
		"\u0005\n\u0000\u0000\u00fd\u00ff\u00050\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001"+
		"\u0000\u0000\u0000\u0100\u00fa\u0001\u0000\u0000\u0000\u0101\u0104\u0001"+
		"\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0105\u00de\u0001\u0000\u0000\u0000\u0105\u00f4\u0001"+
		"\u0000\u0000\u0000\u0106\u0015\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"\u000e\u0000\u0000\u0108\u0109\u00050\u0000\u0000\u0109\u010a\u0005\u000f"+
		"\u0000\u0000\u010a\u010b\u0003\\.\u0000\u010b\u010c\u0005\u001a\u0000"+
		"\u0000\u010c\u010d\u0003\f\u0006\u0000\u010d\u0017\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0005\u0018\u0000\u0000\u010f\u0110\u0003\\.\u0000\u0110"+
		"\u0111\u0005\u001a\u0000\u0000\u0111\u0112\u0003\f\u0006\u0000\u0112\u0019"+
		"\u0001\u0000\u0000\u0000\u0113\u0115\u0007\u0000\u0000\u0000\u0114\u0116"+
		"\u0003\u001c\u000e\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0007\u0001\u0000\u0000\u0118\u001b\u0001\u0000\u0000\u0000\u0119\u0127"+
		"\b\u0001\u0000\u0000\u011a\u0128\u0005?\u0000\u0000\u011b\u0128\u0005"+
		"@\u0000\u0000\u011c\u0128\u0003 \u0010\u0000\u011d\u0128\u0005D\u0000"+
		"\u0000\u011e\u011f\u00057\u0000\u0000\u011f\u0120\u0005o\u0000\u0000\u0120"+
		"\u0128\u0005n\u0000\u0000\u0121\u0122\u00058\u0000\u0000\u0122\u0123\u0005"+
		"q\u0000\u0000\u0123\u0128\u0005p\u0000\u0000\u0124\u0125\u00059\u0000"+
		"\u0000\u0125\u0126\u0005s\u0000\u0000\u0126\u0128\u0005r\u0000\u0000\u0127"+
		"\u011a\u0001\u0000\u0000\u0000\u0127\u011b\u0001\u0000\u0000\u0000\u0127"+
		"\u011c\u0001\u0000\u0000\u0000\u0127\u011d\u0001\u0000\u0000\u0000\u0127"+
		"\u011e\u0001\u0000\u0000\u0000\u0127\u0121\u0001\u0000\u0000\u0000\u0127"+
		"\u0124\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129"+
		"\u0119\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"\u001d\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e"+
		"\u013c\u0005D\u0000\u0000\u012f\u013c\u0003 \u0010\u0000\u0130\u013c\u0005"+
		"=\u0000\u0000\u0131\u013c\u0005?\u0000\u0000\u0132\u0133\u00057\u0000"+
		"\u0000\u0133\u0134\u0005o\u0000\u0000\u0134\u013c\u0005n\u0000\u0000\u0135"+
		"\u0136\u00058\u0000\u0000\u0136\u0137\u0005q\u0000\u0000\u0137\u013c\u0005"+
		"p\u0000\u0000\u0138\u0139\u00059\u0000\u0000\u0139\u013a\u0005s\u0000"+
		"\u0000\u013a\u013c\u0005r\u0000\u0000\u013b\u012e\u0001\u0000\u0000\u0000"+
		"\u013b\u012f\u0001\u0000\u0000\u0000\u013b\u0130\u0001\u0000\u0000\u0000"+
		"\u013b\u0131\u0001\u0000\u0000\u0000\u013b\u0132\u0001\u0000\u0000\u0000"+
		"\u013b\u0135\u0001\u0000\u0000\u0000\u013b\u0138\u0001\u0000\u0000\u0000"+
		"\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u001f\u0001\u0000\u0000\u0000"+
		"\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0005C\u0000\u0000\u0141"+
		"\u0145\u0005I\u0000\u0000\u0142\u0144\u0003\"\u0011\u0000\u0143\u0142"+
		"\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0005E\u0000\u0000\u0149\u014a\u0003\u001c\u000e\u0000\u014a\u014b\u0005"+
		"C\u0000\u0000\u014b\u014c\u0005G\u0000\u0000\u014c\u014d\u0005I\u0000"+
		"\u0000\u014d\u014e\u0005E\u0000\u0000\u014e\u015e\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0005C\u0000\u0000\u0150\u0154\u0005I\u0000\u0000\u0151\u0153"+
		"\u0003\"\u0011\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0156\u0001"+
		"\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0157\u015e\u0005F\u0000\u0000\u0158\u015a\u0005A\u0000"+
		"\u0000\u0159\u015b\u0005L\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000"+
		"\u015c\u015e\u0003$\u0012\u0000\u015d\u0140\u0001\u0000\u0000\u0000\u015d"+
		"\u014f\u0001\u0000\u0000\u0000\u015d\u0158\u0001\u0000\u0000\u0000\u015d"+
		"\u015c\u0001\u0000\u0000\u0000\u015e!\u0001\u0000\u0000\u0000\u015f\u0162"+
		"\u0005I\u0000\u0000\u0160\u0161\u0005H\u0000\u0000\u0161\u0163\u0005K"+
		"\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000"+
		"\u0000\u0000\u0163#\u0001\u0000\u0000\u0000\u0164\u0166\u0005B\u0000\u0000"+
		"\u0165\u0167\u0003&\u0013\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0005M\u0000\u0000\u0169%\u0001\u0000\u0000\u0000\u016a\u016f\u0003"+
		"*\u0015\u0000\u016b\u016f\u0003D\"\u0000\u016c\u016f\u0005t\u0000\u0000"+
		"\u016d\u016f\u0005u\u0000\u0000\u016e\u016a\u0001\u0000\u0000\u0000\u016e"+
		"\u016b\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170"+
		"\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171"+
		"\'\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0003*\u0015\u0000\u0174\u0176\u0003D\"\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0176)\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0003,\u0016\u0000\u0178\u017a\u0005P\u0000\u0000\u0179"+
		"\u017b\u0003F#\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017a\u017b\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0005"+
		"Q\u0000\u0000\u017d+\u0001\u0000\u0000\u0000\u017e\u0183\u00030\u0018"+
		"\u0000\u017f\u0180\u0005V\u0000\u0000\u0180\u0182\u00030\u0018\u0000\u0181"+
		"\u017f\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"-\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u018b"+
		"\u00030\u0018\u0000\u0187\u0188\u0005V\u0000\u0000\u0188\u018a\u00030"+
		"\u0018\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000"+
		"\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000"+
		"\u0000\u0000\u018c/\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000"+
		"\u0000\u018e\u0190\u0007\u0002\u0000\u0000\u018f\u018e\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u019b\u0001\u0000\u0000"+
		"\u0000\u0193\u0195\u0007\u0003\u0000\u0000\u0194\u0196\u0007\u0002\u0000"+
		"\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0193\u0001\u0000\u0000"+
		"\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c1\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u019f\u0007\u0003\u0000\u0000"+
		"\u019f3\u0001\u0000\u0000\u0000\u01a0\u01a3\u00038\u001c\u0000\u01a1\u01a3"+
		"\u0003:\u001d\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a3\u01aa\u0001\u0000\u0000\u0000\u01a4\u01a9\u0003"+
		"<\u001e\u0000\u01a5\u01a9\u0003>\u001f\u0000\u01a6\u01a9\u0003@ \u0000"+
		"\u01a7\u01a9\u0003B!\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000\u01a8\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01b6"+
		"\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01b2"+
		"\u0003<\u001e\u0000\u01ae\u01b2\u0003>\u001f\u0000\u01af\u01b2\u0003@"+
		" \u0000\u01b0\u01b2\u0003B!\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000"+
		"\u01b1\u01ae\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01a2\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b1\u0001\u0000\u0000\u0000\u01b65\u0001\u0000\u0000\u0000\u01b7"+
		"\u01be\u00038\u001c\u0000\u01b8\u01be\u0003:\u001d\u0000\u01b9\u01be\u0003"+
		"<\u001e\u0000\u01ba\u01be\u0003>\u001f\u0000\u01bb\u01be\u0003@ \u0000"+
		"\u01bc\u01be\u0003B!\u0000\u01bd\u01b7\u0001\u0000\u0000\u0000\u01bd\u01b8"+
		"\u0001\u0000\u0000\u0000\u01bd\u01b9\u0001\u0000\u0000\u0000\u01bd\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be7\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"m\u0000\u0000\u01c09\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005`\u0000"+
		"\u0000\u01c2;\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005i\u0000\u0000\u01c4"+
		"=\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005j\u0000\u0000\u01c6?\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0007\u0004\u0000\u0000\u01c8A\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0005^\u0000\u0000\u01ca\u01cd\u0005m\u0000\u0000"+
		"\u01cb\u01cc\u0005]\u0000\u0000\u01cc\u01ce\u0003V+\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005_\u0000\u0000\u01d0C\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d5\u0007\u0005\u0000\u0000\u01d2\u01d4\u0003R)\u0000"+
		"\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d8\u01dd\u0005P\u0000\u0000\u01d9\u01dc\u0003*\u0015\u0000\u01da\u01dc"+
		"\u0003D\"\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01da\u0001"+
		"\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001"+
		"\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01f1\u0005"+
		"Q\u0000\u0000\u01e1\u01e5\u0007\u0006\u0000\u0000\u01e2\u01e4\u0003R)"+
		"\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e6\u01ee\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e8\u01ea\u0005P\u0000\u0000\u01e9\u01eb\u0003F#\u0000\u01ea"+
		"\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ef\u0005Q\u0000\u0000\u01ed\u01ef"+
		"\u0005S\u0000\u0000\u01ee\u01e8\u0001\u0000\u0000\u0000\u01ee\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01d1\u0001"+
		"\u0000\u0000\u0000\u01f0\u01e1\u0001\u0000\u0000\u0000\u01f1E\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f7\u0003P(\u0000\u01f3\u01f4\u0005S\u0000\u0000"+
		"\u01f4\u01f6\u0003P(\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f9"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fc\u0005S\u0000\u0000\u01fb\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fcG\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\u0003J%\u0000\u01fe\u01ff\u0005S\u0000\u0000"+
		"\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u0202\u0005S\u0000\u0000\u0201"+
		"\u01fd\u0001\u0000\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202"+
		"I\u0001\u0000\u0000\u0000\u0203\u0208\u0003L&\u0000\u0204\u0205\u0005"+
		"V\u0000\u0000\u0205\u0207\u0003L&\u0000\u0206\u0204\u0001\u0000\u0000"+
		"\u0000\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000"+
		"\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209K\u0001\u0000\u0000\u0000"+
		"\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020d\u0005m\u0000\u0000\u020c"+
		"\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"+
		"\u020f\u0001\u0000\u0000\u0000\u020e\u0210\u0005m\u0000\u0000\u020f\u020e"+
		"\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0215"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0005T\u0000\u0000\u0212\u0213\u0003"+
		"P(\u0000\u0213\u0214\u0005U\u0000\u0000\u0214\u0216\u0001\u0000\u0000"+
		"\u0000\u0215\u0211\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000"+
		"\u0000\u0216\u0220\u0001\u0000\u0000\u0000\u0217\u021c\u0005m\u0000\u0000"+
		"\u0218\u0219\u0005T\u0000\u0000\u0219\u021a\u0003P(\u0000\u021a\u021b"+
		"\u0005U\u0000\u0000\u021b\u021d\u0001\u0000\u0000\u0000\u021c\u0218\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021f\u0001"+
		"\u0000\u0000\u0000\u021e\u0217\u0001\u0000\u0000\u0000\u021f\u0222\u0001"+
		"\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001"+
		"\u0000\u0000\u0000\u0221M\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000"+
		"\u0000\u0000\u0223\u0225\u0003P(\u0000\u0224\u0226\u0005S\u0000\u0000"+
		"\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u0229\u0001\u0000\u0000\u0000\u0227\u0229\u0005v\u0000\u0000\u0228"+
		"\u0223\u0001\u0000\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229"+
		"\u022c\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0001\u0000\u0000\u0000\u022bO\u0001\u0000\u0000\u0000\u022c\u022a"+
		"\u0001\u0000\u0000\u0000\u022d\u022e\u0005m\u0000\u0000\u022e\u022f\u0005"+
		"R\u0000\u0000\u022f\u0230\u0003R)\u0000\u0230Q\u0001\u0000\u0000\u0000"+
		"\u0231\u0236\u0003X,\u0000\u0232\u0236\u0003Z-\u0000\u0233\u0236\u0005"+
		"V\u0000\u0000\u0234\u0236\u0005X\u0000\u0000\u0235\u0231\u0001\u0000\u0000"+
		"\u0000\u0235\u0232\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000"+
		"\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000"+
		"\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000"+
		"\u0000\u0238S\u0001\u0000\u0000\u0000\u0239\u023a\u0005m\u0000\u0000\u023a"+
		"U\u0001\u0000\u0000\u0000\u023b\u023d\u0003X,\u0000\u023c\u023b\u0001"+
		"\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023c\u0001"+
		"\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023fW\u0001\u0000"+
		"\u0000\u0000\u0240\u0242\u0007\u0007\u0000\u0000\u0241\u0240\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0245\u0005f\u0000\u0000\u0244\u0246\u0007\b\u0000"+
		"\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246\u024c\u0001\u0000\u0000\u0000\u0247\u024c\u0005h\u0000\u0000"+
		"\u0248\u024c\u0005g\u0000\u0000\u0249\u024c\u0005m\u0000\u0000\u024a\u024c"+
		"\u0005i\u0000\u0000\u024b\u0241\u0001\u0000\u0000\u0000\u024b\u0247\u0001"+
		"\u0000\u0000\u0000\u024b\u0248\u0001\u0000\u0000\u0000\u024b\u0249\u0001"+
		"\u0000\u0000\u0000\u024b\u024a\u0001\u0000\u0000\u0000\u024cY\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0005m\u0000\u0000\u024e\u0250\u0005T\u0000\u0000"+
		"\u024f\u0251\u0003R)\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0250\u0251"+
		"\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253"+
		"\u0005U\u0000\u0000\u0253[\u0001\u0000\u0000\u0000\u0254\u0259\u0003^"+
		"/\u0000\u0255\u0256\u0007\t\u0000\u0000\u0256\u0258\u0003^/\u0000\u0257"+
		"\u0255\u0001\u0000\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000\u0259"+
		"\u0257\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a"+
		"\u025f\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0005\u0013\u0000\u0000\u025d\u025f\u0003^/\u0000\u025e\u0254\u0001"+
		"\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f]\u0001\u0000"+
		"\u0000\u0000\u0260\u0265\u0003`0\u0000\u0261\u0262\u0007\n\u0000\u0000"+
		"\u0262\u0264\u0003`0\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0264\u0267"+
		"\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266"+
		"\u0001\u0000\u0000\u0000\u0266_\u0001\u0000\u0000\u0000\u0267\u0265\u0001"+
		"\u0000\u0000\u0000\u0268\u026d\u0003b1\u0000\u0269\u026a\u0007\u000b\u0000"+
		"\u0000\u026a\u026c\u0003b1\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c"+
		"\u026f\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d"+
		"\u026e\u0001\u0000\u0000\u0000\u026ea\u0001\u0000\u0000\u0000\u026f\u026d"+
		"\u0001\u0000\u0000\u0000\u0270\u0275\u0003d2\u0000\u0271\u0272\u0007\f"+
		"\u0000\u0000\u0272\u0274\u0003d2\u0000\u0273\u0271\u0001\u0000\u0000\u0000"+
		"\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000"+
		"\u0275\u0276\u0001\u0000\u0000\u0000\u0276c\u0001\u0000\u0000\u0000\u0277"+
		"\u0275\u0001\u0000\u0000\u0000\u0278\u027c\u0003h4\u0000\u0279\u027b\u0003"+
		"f3\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000\u0000"+
		"\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000"+
		"\u0000\u027de\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000"+
		"\u027f\u0281\u0005)\u0000\u0000\u0280\u0282\u0003j5\u0000\u0281\u0280"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283"+
		"\u0001\u0000\u0000\u0000\u0283\u028b\u0005*\u0000\u0000\u0284\u0285\u0005"+
		"+\u0000\u0000\u0285\u0286\u0003\\.\u0000\u0286\u0287\u0005,\u0000\u0000"+
		"\u0287\u028b\u0001\u0000\u0000\u0000\u0288\u0289\u0005/\u0000\u0000\u0289"+
		"\u028b\u00050\u0000\u0000\u028a\u027f\u0001\u0000\u0000\u0000\u028a\u0284"+
		"\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028bg\u0001"+
		"\u0000\u0000\u0000\u028c\u02b8\u00051\u0000\u0000\u028d\u02b8\u00052\u0000"+
		"\u0000\u028e\u02b8\u0003\u001a\r\u0000\u028f\u02b8\u0005\u0014\u0000\u0000"+
		"\u0290\u02b8\u0005\u0015\u0000\u0000\u0291\u02b8\u0005\u0016\u0000\u0000"+
		"\u0292\u02b8\u00050\u0000\u0000\u0293\u0294\u0005)\u0000\u0000\u0294\u0295"+
		"\u0003\\.\u0000\u0295\u0296\u0005*\u0000\u0000\u0296\u02b8\u0001\u0000"+
		"\u0000\u0000\u0297\u02a0\u0005+\u0000\u0000\u0298\u029d\u0003\\.\u0000"+
		"\u0299\u029a\u0005\u001c\u0000\u0000\u029a\u029c\u0003\\.\u0000\u029b"+
		"\u0299\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000\u0000\u029d"+
		"\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e"+
		"\u02a1\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u02a0"+
		"\u0298\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a2\u02b8\u0005,\u0000\u0000\u02a3\u02b4"+
		"\u0005-\u0000\u0000\u02a4\u02a7\u0003\\.\u0000\u02a5\u02a6\u0005\u001a"+
		"\u0000\u0000\u02a6\u02a8\u0003\\.\u0000\u02a7\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02b1\u0001\u0000\u0000"+
		"\u0000\u02a9\u02aa\u0005\u001c\u0000\u0000\u02aa\u02ad\u0003\\.\u0000"+
		"\u02ab\u02ac\u0005\u001a\u0000\u0000\u02ac\u02ae\u0003\\.\u0000\u02ad"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae"+
		"\u02b0\u0001\u0000\u0000\u0000\u02af\u02a9\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b4\u02a4\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b8\u0005.\u0000\u0000\u02b7\u028c\u0001\u0000\u0000\u0000\u02b7\u028d"+
		"\u0001\u0000\u0000\u0000\u02b7\u028e\u0001\u0000\u0000\u0000\u02b7\u028f"+
		"\u0001\u0000\u0000\u0000\u02b7\u0290\u0001\u0000\u0000\u0000\u02b7\u0291"+
		"\u0001\u0000\u0000\u0000\u02b7\u0292\u0001\u0000\u0000\u0000\u02b7\u0293"+
		"\u0001\u0000\u0000\u0000\u02b7\u0297\u0001\u0000\u0000\u0000\u02b7\u02a3"+
		"\u0001\u0000\u0000\u0000\u02b8i\u0001\u0000\u0000\u0000\u02b9\u02be\u0003"+
		"\\.\u0000\u02ba\u02bb\u0005\u001c\u0000\u0000\u02bb\u02bd\u0003\\.\u0000"+
		"\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000\u0000"+
		"\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000"+
		"\u02bfk\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000]n"+
		"pw}\u0085\u0094\u009d\u00a8\u00af\u00b8\u00bc\u00c3\u00c8\u00d3\u00db"+
		"\u00e5\u00eb\u00ef\u00f2\u00f8\u00fe\u0102\u0105\u0115\u0127\u012b\u013b"+
		"\u013d\u0145\u0154\u015a\u015d\u0162\u0166\u016e\u0170\u0175\u017a\u0183"+
		"\u018b\u0191\u0197\u019b\u01a2\u01a8\u01aa\u01b1\u01b3\u01b5\u01bd\u01cd"+
		"\u01d5\u01db\u01dd\u01e5\u01ea\u01ee\u01f0\u01f7\u01fb\u0201\u0208\u020c"+
		"\u020f\u0215\u021c\u0220\u0225\u0228\u022a\u0235\u0237\u023e\u0241\u0245"+
		"\u024b\u0250\u0259\u025e\u0265\u026d\u0275\u027c\u0281\u028a\u029d\u02a0"+
		"\u02a7\u02ad\u02b1\u02b4\u02b7\u02be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}