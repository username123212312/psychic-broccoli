package app;

import listener.CustomErrorListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.List;

// CRITICAL IMPORT: Import the custom Lexer class
import antlr.JinjaFlaskIndentingLexer;
import antlr.JinjaFlaskParser;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java app.App <file_name>");
        } else {
            String fileName = args[0];
            try {
                // Step 1: Get the tokens stream
                CommonTokenStream tokens = getTokenStream(fileName);

                // CRITICAL DEBUG STEP: Print all tokens before parsing
                debugTokenStream(tokens);

                // Step 2: Create the parser and parse
                tokens.reset(); // Reset the stream to the beginning for the parser
                JinjaFlaskParser parser = new JinjaFlaskParser(tokens);

                // Add the custom error listener
                parser.removeErrorListeners();
                parser.addErrorListener(new CustomErrorListener());

                // tell ANTLR to build a parse tree
                ParseTree antlrAST = parser.program();

                // If we reach here, the parse was successful!
                System.out.println("--- Parsing SUCCESSFUL! ---");
                // Optional: print antlrAST.toStringTree(parser); for debugging the tree structure

            } catch (Exception e) {
                System.err.println("Parsing halted due to error: " + (e.getMessage() != null ? e.getMessage() : "Unknown Error (Likely ANTLR Stack Crash)"));
                // Print stack trace for better debugging of 'null' errors
                e.printStackTrace();
            }
        }
    }

    private static CommonTokenStream getTokenStream(String fileName) throws IOException {
        CharStream input = CharStreams.fromFileName(fileName);

        // CRITICAL FIX: Use the custom JinjaFlaskIndentingLexer instead of the base Lexer.
        JinjaFlaskIndentingLexer lexer = new JinjaFlaskIndentingLexer(input);

        // Remove default ConsoleErrorListener from the Lexer too, to reduce noise
        lexer.removeErrorListeners();

        return new CommonTokenStream(lexer);
    }

    private static void debugTokenStream(CommonTokenStream tokens) {
        tokens.fill(); // Ensure all tokens are generated
        List<Token> allTokens = tokens.getTokens();

        System.out.println("\n--- LEXER TOKEN DEBUG OUTPUT ---");
        for (Token t : allTokens) {
            // Only show tokens on the default channel (skipping WS and Comments)
            if (t.getChannel() == Token.DEFAULT_CHANNEL) {
                String tokenName = JinjaFlaskIndentingLexer.VOCABULARY.getSymbolicName(t.getType());
                String tokenText = t.getText().replace("\n", "\\n").replace("\r", "\\r");

                // Use the type number if the name is null (for virtual tokens like INDENT/DEDENT)
                if (tokenName == null) {
                    tokenName = "VirtualType(" + t.getType() + ")";
                }

                System.out.printf("Line %d | %-20s | Text: '%s'\n",
                        t.getLine(),
                        tokenName,
                        tokenText);
            }
        }
        System.out.println("--------------------------------\n");
    }
}