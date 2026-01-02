package antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

import java.util.ArrayDeque;
import java.util.Deque;

abstract class JinjaFlaskLexerBase extends Lexer {
    // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
    private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
    // The stack that keeps track of the indentation level.
    private Deque<Integer> indents = new ArrayDeque<>();
    // The amount of opened braces, brackets and parenthesis.
    protected int opened = 0;
    // The most recently produced token.
    private Token lastToken = null;
    // Track the start position of the current NEWLINE rule match

    protected JinjaFlaskLexerBase(CharStream input) {
        super(input);
    }

    @Override
    public void emit(Token t) {
        super.setToken(t);
        tokens.offer(t);
    }

    @Override
    public Token nextToken() {
        if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
            for (int i = tokens.size() - 1; i >= 0; i--) {
                if (tokens.get(i).getType() == EOF) {
                    tokens.remove(i);
                }
            }

            this.emit(createSyntheticToken(JinjaFlaskLexer.NEWLINE, "\n"));

            while (!indents.isEmpty()) {
                this.emit(createSyntheticToken(JinjaFlaskLexer.DEDENT, ""));
                indents.pop();
            }

            this.emit(createSyntheticToken(JinjaFlaskLexer.EOF, "<EOF>"));
        }

        Token next = super.nextToken();

        if (next.getChannel() == Token.DEFAULT_CHANNEL) {
            this.lastToken = next;
        }

        return tokens.isEmpty() ? next : tokens.poll();
    }

    private Token createSyntheticToken(int type, String text) {
        CommonToken token = new CommonToken(type, text);

        token.setStartIndex(-1);
        token.setStopIndex(-1);

        if (lastToken != null) {
            token.setLine(lastToken.getLine());
            token.setCharPositionInLine(lastToken.getCharPositionInLine() + 1);
        } else {
            token.setLine(1);
            token.setCharPositionInLine(0);
        }

        return token;
    }

    private Token createDEDENT() {
        int pos = getCharIndex();
        CommonToken token = new CommonToken(JinjaFlaskLexer.DEDENT, "");
        token.setStartIndex(pos);
        token.setStopIndex(pos);
        token.setLine(getLine());
        token.setCharPositionInLine(getCharPositionInLine());
        return token;
    }

    private CommonToken createTokenAtPosition() {

        return (CommonToken) createDEDENT();
    }

    private CommonToken createTokenWithPositions(int type, String text, int start, int stop) {
        if (start < 0) start = 0;
        if (stop < 0) stop = 0;

        return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
    }

    static int getIndentationCount(String spaces) {
        int count = 0;
        for (char ch : spaces.toCharArray()) {
            if (ch == '\t') {
                count += 8 - (count % 8);
            } else {
                count++;
            }
        }

        return count;
    }

    boolean atStartOfInput() {
        return super.getCharPositionInLine() == 0 && super.getLine() == 1;
    }

    void openBrace(){
        this.opened++;
    }

    void closeBrace(){
        this.opened--;
    }

    void onNewLine(){
        // Save the start position of this rule match
        int ruleStart = _tokenStartCharIndex;
        String original = getText();



        String newLine = original.replaceAll("[^\r\n\f]+", "");
        String spaces = original.replaceAll("[\r\n\f]+", "");

        int next = _input.LA(1);
        int nextnext = _input.LA(2);
        if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
            skip();
        }
        else {

            int newLineEnd = ruleStart + newLine.length() - 1;
            emit(createTokenWithPositions(JinjaFlaskLexer.NEWLINE, newLine, ruleStart, newLineEnd));

            int indent = getIndentationCount(spaces);
            int previous = indents.isEmpty() ? 0 : indents.peek();

            if (indent == previous) {
                skip();
            }
            else if (indent > previous) {
                indents.push(indent);
                int spacesStart = ruleStart + newLine.length();
                int spacesEnd = ruleStart + original.length() - 1;
                emit(createTokenWithPositions(JinjaFlaskLexer.INDENT, spaces, spacesStart, spacesEnd));
            }
            else {
                while(!indents.isEmpty() && indents.peek() > indent) {
                    emit(createTokenAtPosition());
                    indents.pop();
                }
            }
        }
    }

    String escapeString(String s) {
        return s.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    @Override
    public void reset()
    {
        tokens = new java.util.LinkedList<>();
        indents = new ArrayDeque<>();
        opened = 0;
        lastToken = null;
        super.reset();
    }
}