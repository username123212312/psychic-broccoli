package app;

import antlr.JinjaFlaskLexer;
import antlr.JinjaFlaskParser;
import listener.CustomErrorListener;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

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
                ParseTree antlrAST = parser.prog();
                showParseTree(parser.getRuleNames(), antlrAST);

                // If we reach here, the parse was successful!
                System.out.println("--- Parsing SUCCESSFUL! ---");
                // Create TreeViewer

                // Optional: print antlrAST.toStringTree(parser); for debugging the tree structure

            } catch (Exception e) {
                System.err.println("Parsing halted due to error: " + (e.getMessage() != null ? e.getMessage() : "Unknown Error (Likely ANTLR Stack Crash)"));
                // Print stack trace for better debugging of 'null' errors
                e.printStackTrace();
            }
        }
    }

    private static void showParseTree(String[] ruleNames, ParseTree parseTree){
        TreeViewer viewer = new TreeViewer(
                java.util.Arrays.asList(ruleNames),
                parseTree
        );

        // Configure viewer for better display
        viewer.setScale(1.5);  // Make text larger (optional)

        // Create main panel with border layout
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(viewer, BorderLayout.CENTER);

        // Create scroll pane
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Add zoom controls for better navigation
        JPanel controlPanel = new JPanel();
        JButton zoomInButton = new JButton("Zoom In");
        JButton zoomOutButton = new JButton("Zoom Out");
        JButton resetButton = new JButton("Reset Zoom");

        zoomInButton.addActionListener(e -> {
            viewer.setScale(viewer.getScale() * 1.2);
            viewer.repaint();
        });

        zoomOutButton.addActionListener(e -> {
            viewer.setScale(viewer.getScale() / 1.2);
            viewer.repaint();
        });

        resetButton.addActionListener(e -> {
            viewer.setScale(1.0);
            viewer.repaint();
        });

        controlPanel.add(zoomInButton);
        controlPanel.add(zoomOutButton);
        controlPanel.add(resetButton);

        // Create frame
        JFrame frame = new JFrame("Parse Tree Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        // Set size and display
        frame.setSize(1000, 640);
        frame.setVisible(true);
    }

    private static CommonTokenStream getTokenStream(String fileName) throws IOException {
        CharStream input = CharStreams.fromFileName(fileName);

        // CRITICAL FIX: Use the custom JinjaFlaskLexer instead of the base Lexer.
        JinjaFlaskLexer lexer = new JinjaFlaskLexer(input);

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
                String tokenName = JinjaFlaskLexer.VOCABULARY.getSymbolicName(t.getType());
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