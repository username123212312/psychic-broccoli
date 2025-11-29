package antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Custom Lexer that extends JinjaFlaskLexer to manually inject INDENT/DEDENT tokens.
 * * CRITICAL UPDATE: The indentation logic is now only applied when the lexer is
 * in the assumed Python/Jinja control flow mode. We access the protected '_mode'
 * field directly to check the current lexer mode.
 * * FINAL FIX: Injects a virtual NEWLINE token before INDENT/DEDENT when a physical
 * line break is detected, satisfying the parser's requirement for a COLON NEWLINE INDENT sequence.
 * Includes the critical token duplication filter.
 */
public class JinjaFlaskIndentingLexer extends JinjaFlaskLexer {

    // Re-implemented indentation state to fix 'private access' errors
    protected Stack<Integer> indents = new Stack<>();
    protected Queue<Token> pending = new LinkedList<>();

    // State for token positioning and duplication filtering
    private Token lastToken = null; // Last token returned for positioning virtual tokens
    private Token lastRawToken = null; // Last raw token retrieved from super.nextToken()

    // Assuming the default mode (mode 0) is the Python/Jinja mode that requires indentation.
    private static final int PYTHON_MODE = 0;

    public JinjaFlaskIndentingLexer(CharStream input) {
        super(input);
        // Initialize indentation stack with base level (0)
        indents.push(0);
    }

    public JinjaFlaskIndentingLexer(CharStream input, TokenFactory<?> factory) {
        this(input);
        setTokenFactory(factory);
    }

    /**
     * Helper to create a DEDENT token.
     */
    protected Token createDedent() {
        Pair<TokenSource, CharStream> source = new Pair<>(this, _input);

        return _factory.create(
                source,
                DEDENT,
                "DEDENT", // Virtual token text
                DEFAULT_TOKEN_CHANNEL,
                -1, -1,
                lastToken != null ? lastToken.getLine() : 1,
                lastToken != null ? lastToken.getCharPositionInLine() : 0
        );
    }

    /**
     * Helper to create an INDENT token.
     */
    protected Token createIndent() {
        Pair<TokenSource, CharStream> source = new Pair<>(this, _input);

        return _factory.create(
                source,
                INDENT,
                "INDENT", // Virtual token text
                DEFAULT_TOKEN_CHANNEL,
                -1, -1,
                lastToken != null ? lastToken.getLine() : 1,
                lastToken != null ? lastToken.getCharPositionInLine() : 0
        );
    }

    /**
     * Helper to create a virtual NEWLINE token.
     */
    protected Token createNewline() {
        Pair<TokenSource, CharStream> source = new Pair<>(this, _input);

        return _factory.create(
                source,
                NEWLINE,
                "\\n", // Text representation of the virtual token
                DEFAULT_TOKEN_CHANNEL,
                -1, -1,
                lastToken != null ? lastToken.getLine() : 1,
                lastToken != null ? lastToken.getCharPositionInLine() : 0
        );
    }

    /**
     * Manually generates INDENT/DEDENT tokens based on the column position of the
     * token starting a new line.
     * @param token The token (NAME, KEYWORD, etc.) at the start of a new line.
     */
    protected void checkIndentation(Token token) {
        // The indentation level is simply the column position of the token
        int indentation = token.getCharPositionInLine();

        // Get the previous indentation level
        int previousIndentation = indents.peek();

        if (indentation > previousIndentation) {
            // PUSH INDENT
            indents.push(indentation);
            // Queue NEWLINE first, then INDENT
            pending.offer(createNewline());
            pending.offer(createIndent());

        } else if (indentation < previousIndentation) {
            // POP DEDENTs
            // Queue NEWLINE first to end the previous line properly
            pending.offer(createNewline());

            while (indents.peek() > indentation) {
                pending.offer(createDedent());
                indents.pop();
            }
            // Check if we dedented back to a valid level
            if (indents.peek() != indentation) {
                // Inconsistent indentation, but we proceed
            }
        } else {
            // If indentation == previousIndentation, just queue a NEWLINE to mark the end of the previous line
            pending.offer(createNewline());
        }
    }


    @Override
    public Token nextToken() {

        // 1. CRITICAL CHECK: Return pending tokens (NEWLINE, INDENT, DEDENT) first.
        if (!pending.isEmpty()) {
            return pending.poll();
        }

        // --- Core Loop: Get physical token and process ---
        Token next = null;
        while (next == null) {

            // 2. Get the next raw token from the base Lexer.
            Token rawNext = super.nextToken();

            // 3. Duplication Filter:
            if (lastRawToken != null &&
                    rawNext.getType() != Token.EOF &&
                    rawNext.getType() == lastRawToken.getType() &&
                    rawNext.getText().equals(lastRawToken.getText())) {

                // Discard duplicate.
                continue;
            }

            // 4. Update the tracker for the next iteration's duplication check.
            this.lastRawToken = rawNext;
            next = rawNext;


            // 5. Handle EOF and DEDENT flushing.
            if (next.getType() == Token.EOF) {
                // Generate DEDENTs until we return to the base indentation level, followed by EOF.
                if (indents.size() > 1) {
                    // Inject a final NEWLINE before the DEDENTS/EOF if the previous token wasn't a NEWLINE/DEDENT
                    if (lastToken == null || (lastToken.getType() != NEWLINE && lastToken.getType() != DEDENT)) {
                        pending.offer(createNewline());
                    }

                    while (indents.size() > 1) {
                        pending.offer(createDedent());
                        indents.pop();
                    }
                    pending.offer(next); // Queue EOF to be returned after DEDENTs
                    return pending.poll();
                }
                return next;
            }

            // 6. Ignore NEWLINE tokens from the base lexer if they appear.
            if (next.getType() == NEWLINE) {
                this.lastToken = next;
                next = null;
                continue;
            }

            // 7. MODE CHECK & POSITIONAL INDENTATION CHECK
            // Use the protected '_mode' field from the ANTLR Lexer class directly.
            if (_mode == PYTHON_MODE && lastToken != null && next.getLine() > lastToken.getLine()) {

                // A line break occurred. Check the indentation and queue virtual tokens.
                checkIndentation(next);

                // If NEWLINE/INDENT/DEDENT tokens were queued, return them first.
                if (!pending.isEmpty()) {
                    // Queue the physical token (next) to be returned immediately after the virtual tokens
                    pending.offer(next);

                    // Update lastToken with the current token to ensure correct positioning for virtual tokens.
                    this.lastToken = next;

                    return pending.poll();
                }
            }

            // 8. If we reached here, 'next' is the physical token to be returned.
            break;
        }

        // 9. Final update and return.
        if (next.getType() != INDENT && next.getType() != DEDENT) {
            this.lastToken = next;
        }

        return next;
    }
}