// Generated from C:/Users/TWL/Desktop/psychic-broccoli-main/grammars/JinjaFlaskLexer.g4 by ANTLR 4.13.2

package antlr;
    import org.antlr.v4.runtime.CommonToken;
    import org.antlr.v4.runtime.Token;
    import java.util.*;
    import org.antlr.v4.runtime.CharStream;
    import org.antlr.v4.runtime.TokenSource;
    import org.antlr.v4.runtime.misc.Pair;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JinjaFlaskLexer extends Lexer {
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
		STRING=51, TRIPLE_QUOTED_STRING=52;
	public static final int
		ERROR=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "ERROR"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "WS", "COMMENT", "DEF", "RETURN", "FROM", "IMPORT", "AS", 
			"IF", "ELIF", "ELSE", "FOR", "IN", "GLOBAL", "AND", "OR", "NOT", "TRUE", 
			"FALSE", "NONE", "PRINT", "WHILE", "ARROW", "AT", "COLON", "SEMI", "COMMA", 
			"ASSIGN", "EQ", "NEQ", "GT", "LT", "GTE", "LTE", "PLUS", "MINUS", "STAR", 
			"SLASH", "SLASHSLASH", "LP", "RP", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
			"DOT", "NAME", "NUMBER", "STRING", "TRIPLE_QUOTED_STRING", "TAG_NameChar", 
			"HEX_CHAR"
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
			"RBRACK", "LBRACE", "RBRACE", "DOT", "NAME", "NUMBER", "STRING", "TRIPLE_QUOTED_STRING"
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


	  public static final int HIDDEN = 1;
	  public static final int DEFAULT = Token.DEFAULT_CHANNEL;

	  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	  private java.util.LinkedList<Token> pending = new java.util.LinkedList<>();
	  // The stack that keeps track of the indentation level.
	  private java.util.Stack<Integer> indents = new java.util.Stack<>();
	  // The amount of opened braces, brackets and parenthesis.
	  private int opened = 0;

	  // CRITICAL FIX: Ensure the indentation stack is initialized with 0
	  {
	      indents.push(0);
	  }

	  // Helper method to emit tokens into the pending queue.
	  public void emit(Token t) {
	    super.setToken(t);
	    pending.offer(t);
	  }

	  private Token createDedent() {
	    return commonToken(DEDENT, "<DEDENT>");
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = this.getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	  }

	  static int getIndentationCount(String spaces) {
	    int count = 0;
	    for (char ch : spaces.toCharArray()) {
	      switch (ch) {
	        case '\t':
	          count += 8 - (count % 8);
	          break;
	        default:
	          count++;
	      }
	    }
	    return count;
	  }


	public JinjaFlaskLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JinjaFlaskLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			LP_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			RP_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			LBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			RBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			LBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			RBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			     String newLine = getText().replaceAll("[^\r\n]+", "");
			     String spaces = getText().replaceAll("[\r\n]+", "");
			     int next = _input.LA(1);

			     if (opened > 0 || next == '\r' || next == '\n' || next == '#') {
			       skip();
			     }
			     else {
			       emit(commonToken(JinjaFlaskLexer.NEWLINE, newLine));

			       int indent = getIndentationCount(spaces);
			       int previous = indents.peek();

			       if (indent > previous) {
			         indents.push(indent);
			         emit(commonToken(JinjaFlaskLexer.INDENT, spaces));
			       }
			       else if (indent < previous) {
			         while(!indents.isEmpty() && indents.peek() > indent) {
			           this.emit(createDedent());
			           indents.pop();
			         }
			         if (indents.peek() != indent) {
			            // Indentation error detection
			            // throw new InputMismatchException("Indentation error: Expected " + indents.peek() + ", got " + indent);
			         }
			       }
			       skip();
			     }
			   
			break;
		}
	}
	private void LP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			opened++;
			break;
		}
	}
	private void RP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			opened--;
			break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			opened++;
			break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			opened--;
			break;
		}
	}
	private void LBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			opened++;
			break;
		}
	}
	private void RBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			opened--;
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u00004\u016a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u0001\u0000\u0003\u0000k\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000o\b\u0000\u0001\u0000\u0005"+
		"\u0000r\b\u0000\n\u0000\f\u0000u\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001|\b\u0001\u000b\u0001\f\u0001"+
		"}\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u0084\b"+
		"\u0002\n\u0002\f\u0002\u0087\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0005.\u0125\b.\n.\f.\u0128"+
		"\t.\u0001/\u0004/\u012b\b/\u000b/\f/\u012c\u0001/\u0001/\u0004/\u0131"+
		"\b/\u000b/\f/\u0132\u0003/\u0135\b/\u00010\u00010\u00050\u0139\b0\n0\f"+
		"0\u013c\t0\u00010\u00010\u00010\u00050\u0141\b0\n0\f0\u0144\t0\u00010"+
		"\u00030\u0147\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u014f"+
		"\b1\n1\f1\u0152\t1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00051\u015d\b1\n1\f1\u0160\t1\u00011\u00011\u00011\u00031\u0165"+
		"\b1\u00012\u00012\u00013\u00013\u0002\u0150\u015e\u00004\u0001\u0003\u0003"+
		"\u0004\u0005\u0005\u0007\u0006\t\u0007\u000b\b\r\t\u000f\n\u0011\u000b"+
		"\u0013\f\u0015\r\u0017\u000e\u0019\u000f\u001b\u0010\u001d\u0011\u001f"+
		"\u0012!\u0013#\u0014%\u0015\'\u0016)\u0017+\u0018-\u0019/\u001a1\u001b"+
		"3\u001c5\u001d7\u001e9\u001f; =!?\"A#C$E%G&I\'K(M)O*Q+S,U-W.Y/[0]1_2a"+
		"3c4e\u0000g\u0000\u0001\u0000\t\u0002\u0000\t\t  \u0002\u0000\n\n\r\r"+
		"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\n\n\r"+
		"\r\'\'\u0003\u0000\n\n\r\r\"\"\b\u0000\t\n\r\r  \"\"\'\'--//<>\u0003\u0000"+
		"09AFaf\u0178\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
		"]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001"+
		"\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0001n\u0001\u0000\u0000"+
		"\u0000\u0003{\u0001\u0000\u0000\u0000\u0005\u0081\u0001\u0000\u0000\u0000"+
		"\u0007\u008a\u0001\u0000\u0000\u0000\t\u008e\u0001\u0000\u0000\u0000\u000b"+
		"\u0095\u0001\u0000\u0000\u0000\r\u009a\u0001\u0000\u0000\u0000\u000f\u00a1"+
		"\u0001\u0000\u0000\u0000\u0011\u00a4\u0001\u0000\u0000\u0000\u0013\u00a7"+
		"\u0001\u0000\u0000\u0000\u0015\u00ac\u0001\u0000\u0000\u0000\u0017\u00b1"+
		"\u0001\u0000\u0000\u0000\u0019\u00b5\u0001\u0000\u0000\u0000\u001b\u00b8"+
		"\u0001\u0000\u0000\u0000\u001d\u00bf\u0001\u0000\u0000\u0000\u001f\u00c3"+
		"\u0001\u0000\u0000\u0000!\u00c6\u0001\u0000\u0000\u0000#\u00ca\u0001\u0000"+
		"\u0000\u0000%\u00cf\u0001\u0000\u0000\u0000\'\u00d5\u0001\u0000\u0000"+
		"\u0000)\u00da\u0001\u0000\u0000\u0000+\u00e0\u0001\u0000\u0000\u0000-"+
		"\u00e6\u0001\u0000\u0000\u0000/\u00e9\u0001\u0000\u0000\u00001\u00eb\u0001"+
		"\u0000\u0000\u00003\u00ed\u0001\u0000\u0000\u00005\u00ef\u0001\u0000\u0000"+
		"\u00007\u00f1\u0001\u0000\u0000\u00009\u00f3\u0001\u0000\u0000\u0000;"+
		"\u00f6\u0001\u0000\u0000\u0000=\u00f9\u0001\u0000\u0000\u0000?\u00fb\u0001"+
		"\u0000\u0000\u0000A\u00fd\u0001\u0000\u0000\u0000C\u0100\u0001\u0000\u0000"+
		"\u0000E\u0103\u0001\u0000\u0000\u0000G\u0105\u0001\u0000\u0000\u0000I"+
		"\u0107\u0001\u0000\u0000\u0000K\u0109\u0001\u0000\u0000\u0000M\u010b\u0001"+
		"\u0000\u0000\u0000O\u010e\u0001\u0000\u0000\u0000Q\u0111\u0001\u0000\u0000"+
		"\u0000S\u0114\u0001\u0000\u0000\u0000U\u0117\u0001\u0000\u0000\u0000W"+
		"\u011a\u0001\u0000\u0000\u0000Y\u011d\u0001\u0000\u0000\u0000[\u0120\u0001"+
		"\u0000\u0000\u0000]\u0122\u0001\u0000\u0000\u0000_\u012a\u0001\u0000\u0000"+
		"\u0000a\u0146\u0001\u0000\u0000\u0000c\u0164\u0001\u0000\u0000\u0000e"+
		"\u0166\u0001\u0000\u0000\u0000g\u0168\u0001\u0000\u0000\u0000ik\u0005"+
		"\r\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lo\u0005\n\u0000\u0000mo\u0005\r\u0000\u0000nj\u0001"+
		"\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000os\u0001\u0000\u0000\u0000"+
		"pr\u0007\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0006\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xy\u0006\u0000\u0001\u0000y\u0002\u0001\u0000\u0000"+
		"\u0000z|\u0007\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0006\u0001\u0002\u0000\u0080\u0004"+
		"\u0001\u0000\u0000\u0000\u0081\u0085\u0005#\u0000\u0000\u0082\u0084\b"+
		"\u0001\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0006\u0002\u0002\u0000\u0089\u0006\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005d\u0000\u0000\u008b\u008c\u0005e\u0000"+
		"\u0000\u008c\u008d\u0005f\u0000\u0000\u008d\b\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005r\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090\u0091"+
		"\u0005t\u0000\u0000\u0091\u0092\u0005u\u0000\u0000\u0092\u0093\u0005r"+
		"\u0000\u0000\u0093\u0094\u0005n\u0000\u0000\u0094\n\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005f\u0000\u0000\u0096\u0097\u0005r\u0000\u0000\u0097"+
		"\u0098\u0005o\u0000\u0000\u0098\u0099\u0005m\u0000\u0000\u0099\f\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005i\u0000\u0000\u009b\u009c\u0005m\u0000"+
		"\u0000\u009c\u009d\u0005p\u0000\u0000\u009d\u009e\u0005o\u0000\u0000\u009e"+
		"\u009f\u0005r\u0000\u0000\u009f\u00a0\u0005t\u0000\u0000\u00a0\u000e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005a\u0000\u0000\u00a2\u00a3\u0005s\u0000"+
		"\u0000\u00a3\u0010\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005i\u0000\u0000"+
		"\u00a5\u00a6\u0005f\u0000\u0000\u00a6\u0012\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0005e\u0000\u0000\u00a8\u00a9\u0005l\u0000\u0000\u00a9\u00aa\u0005"+
		"i\u0000\u0000\u00aa\u00ab\u0005f\u0000\u0000\u00ab\u0014\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad\u00ae\u0005l\u0000\u0000\u00ae"+
		"\u00af\u0005s\u0000\u0000\u00af\u00b0\u0005e\u0000\u0000\u00b0\u0016\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005f\u0000\u0000\u00b2\u00b3\u0005o\u0000"+
		"\u0000\u00b3\u00b4\u0005r\u0000\u0000\u00b4\u0018\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005i\u0000\u0000\u00b6\u00b7\u0005n\u0000\u0000\u00b7\u001a"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005g\u0000\u0000\u00b9\u00ba\u0005"+
		"l\u0000\u0000\u00ba\u00bb\u0005o\u0000\u0000\u00bb\u00bc\u0005b\u0000"+
		"\u0000\u00bc\u00bd\u0005a\u0000\u0000\u00bd\u00be\u0005l\u0000\u0000\u00be"+
		"\u001c\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005a\u0000\u0000\u00c0\u00c1"+
		"\u0005n\u0000\u0000\u00c1\u00c2\u0005d\u0000\u0000\u00c2\u001e\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005o\u0000\u0000\u00c4\u00c5\u0005r\u0000\u0000"+
		"\u00c5 \u0001\u0000\u0000\u0000\u00c6\u00c7\u0005n\u0000\u0000\u00c7\u00c8"+
		"\u0005o\u0000\u0000\u00c8\u00c9\u0005t\u0000\u0000\u00c9\"\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005T\u0000\u0000\u00cb\u00cc\u0005r\u0000\u0000"+
		"\u00cc\u00cd\u0005u\u0000\u0000\u00cd\u00ce\u0005e\u0000\u0000\u00ce$"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005F\u0000\u0000\u00d0\u00d1\u0005"+
		"a\u0000\u0000\u00d1\u00d2\u0005l\u0000\u0000\u00d2\u00d3\u0005s\u0000"+
		"\u0000\u00d3\u00d4\u0005e\u0000\u0000\u00d4&\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005N\u0000\u0000\u00d6\u00d7\u0005o\u0000\u0000\u00d7\u00d8\u0005"+
		"n\u0000\u0000\u00d8\u00d9\u0005e\u0000\u0000\u00d9(\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005p\u0000\u0000\u00db\u00dc\u0005r\u0000\u0000\u00dc"+
		"\u00dd\u0005i\u0000\u0000\u00dd\u00de\u0005n\u0000\u0000\u00de\u00df\u0005"+
		"t\u0000\u0000\u00df*\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005w\u0000"+
		"\u0000\u00e1\u00e2\u0005h\u0000\u0000\u00e2\u00e3\u0005i\u0000\u0000\u00e3"+
		"\u00e4\u0005l\u0000\u0000\u00e4\u00e5\u0005e\u0000\u0000\u00e5,\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0005-\u0000\u0000\u00e7\u00e8\u0005>\u0000"+
		"\u0000\u00e8.\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005@\u0000\u0000\u00ea"+
		"0\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005:\u0000\u0000\u00ec2\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005;\u0000\u0000\u00ee4\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005,\u0000\u0000\u00f06\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0005=\u0000\u0000\u00f28\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"=\u0000\u0000\u00f4\u00f5\u0005=\u0000\u0000\u00f5:\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005!\u0000\u0000\u00f7\u00f8\u0005=\u0000\u0000\u00f8"+
		"<\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005>\u0000\u0000\u00fa>\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005<\u0000\u0000\u00fc@\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fe\u0005>\u0000\u0000\u00fe\u00ff\u0005=\u0000\u0000\u00ff"+
		"B\u0001\u0000\u0000\u0000\u0100\u0101\u0005<\u0000\u0000\u0101\u0102\u0005"+
		"=\u0000\u0000\u0102D\u0001\u0000\u0000\u0000\u0103\u0104\u0005+\u0000"+
		"\u0000\u0104F\u0001\u0000\u0000\u0000\u0105\u0106\u0005-\u0000\u0000\u0106"+
		"H\u0001\u0000\u0000\u0000\u0107\u0108\u0005*\u0000\u0000\u0108J\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005/\u0000\u0000\u010aL\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005/\u0000\u0000\u010c\u010d\u0005/\u0000\u0000\u010d"+
		"N\u0001\u0000\u0000\u0000\u010e\u010f\u0006\'\u0003\u0000\u010f\u0110"+
		"\u0005(\u0000\u0000\u0110P\u0001\u0000\u0000\u0000\u0111\u0112\u0006("+
		"\u0004\u0000\u0112\u0113\u0005)\u0000\u0000\u0113R\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0006)\u0005\u0000\u0115\u0116\u0005[\u0000\u0000\u0116T"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0006*\u0006\u0000\u0118\u0119\u0005"+
		"]\u0000\u0000\u0119V\u0001\u0000\u0000\u0000\u011a\u011b\u0006+\u0007"+
		"\u0000\u011b\u011c\u0005{\u0000\u0000\u011cX\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0006,\b\u0000\u011e\u011f\u0005}\u0000\u0000\u011fZ\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0005.\u0000\u0000\u0121\\\u0001\u0000\u0000"+
		"\u0000\u0122\u0126\u0007\u0002\u0000\u0000\u0123\u0125\u0007\u0003\u0000"+
		"\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127^\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u0007\u0004\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0134\u0001\u0000\u0000\u0000"+
		"\u012e\u0130\u0005.\u0000\u0000\u012f\u0131\u0007\u0004\u0000\u0000\u0130"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"\u0135\u0001\u0000\u0000\u0000\u0134\u012e\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0001\u0000\u0000\u0000\u0135`\u0001\u0000\u0000\u0000\u0136\u013a"+
		"\u0005\'\u0000\u0000\u0137\u0139\b\u0005\u0000\u0000\u0138\u0137\u0001"+
		"\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013d\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0147\u0005"+
		"\'\u0000\u0000\u013e\u0142\u0005\"\u0000\u0000\u013f\u0141\b\u0006\u0000"+
		"\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0145\u0147\u0005\"\u0000\u0000\u0146\u0136\u0001\u0000\u0000\u0000"+
		"\u0146\u013e\u0001\u0000\u0000\u0000\u0147b\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0005\"\u0000\u0000\u0149\u014a\u0005\"\u0000\u0000\u014a\u014b"+
		"\u0005\"\u0000\u0000\u014b\u0150\u0001\u0000\u0000\u0000\u014c\u014f\t"+
		"\u0000\u0000\u0000\u014d\u014f\u0007\u0001\u0000\u0000\u014e\u014c\u0001"+
		"\u0000\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0152\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0005\"\u0000\u0000\u0154\u0155\u0005\""+
		"\u0000\u0000\u0155\u0165\u0005\"\u0000\u0000\u0156\u0157\u0005\'\u0000"+
		"\u0000\u0157\u0158\u0005\'\u0000\u0000\u0158\u0159\u0005\'\u0000\u0000"+
		"\u0159\u015e\u0001\u0000\u0000\u0000\u015a\u015d\t\u0000\u0000\u0000\u015b"+
		"\u015d\u0007\u0001\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c"+
		"\u015b\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f"+
		"\u0161\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0005\'\u0000\u0000\u0162\u0163\u0005\'\u0000\u0000\u0163\u0165"+
		"\u0005\'\u0000\u0000\u0164\u0148\u0001\u0000\u0000\u0000\u0164\u0156\u0001"+
		"\u0000\u0000\u0000\u0165d\u0001\u0000\u0000\u0000\u0166\u0167\b\u0007"+
		"\u0000\u0000\u0167f\u0001\u0000\u0000\u0000\u0168\u0169\u0007\b\u0000"+
		"\u0000\u0169h\u0001\u0000\u0000\u0000\u0012\u0000jns}\u0085\u0126\u012c"+
		"\u0132\u0134\u013a\u0142\u0146\u014e\u0150\u015c\u015e\u0164\t\u0001\u0000"+
		"\u0000\u0000\u0001\u0000\u0006\u0000\u0000\u0001\'\u0001\u0001(\u0002"+
		"\u0001)\u0003\u0001*\u0004\u0001+\u0005\u0001,\u0006";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}