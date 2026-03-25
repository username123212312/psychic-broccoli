package app;

import antlr.JinjaFlaskLexer;
import antlr.JinjaFlaskParser;
import antlr.css.CssLexer;
import antlr.css.CssParser;
import antlr.html.HtmlLexer;
import antlr.html.HtmlParser;
import antlr.python.PythonLexer;
import antlr.python.PythonParser;
import ast.ASTNode;
import ast.HtmlContent;
import ast.Program;
import ast.htmlElement.StyleSheet;
import listener.CustomErrorListener;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import symbolTable.SymbolTableManager;
import visitor.css.StyleSheetVisitor;
import visitor.html.HtmlContentItemVisitor;
import visitor.html.HtmlContentVisitor;
import visitor.python.ProgramVisitor;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java app.App <directory_path_or_file>");
        } else {
            Path startPath = Paths.get(args[0]);

            try (Stream<Path> paths = Files.walk(startPath)) {
                paths.filter(Files::isRegularFile)
                        .forEach(path -> {
                            String fileName = path.toString();
                            System.out.println("\n--- Processing: " + fileName + " ---");
                            processFile(fileName);
                        });
            } catch (IOException e) {
                e.printStackTrace();
            }
//            String fileName = args[0];
//            try {
//                // Step 1: Get the tokens stream
//                CommonTokenStream tokens = getTokenStream(fileName);
//
//                // CRITICAL DEBUG STEP: Print all tokens before parsing
//                debugTokenStream(tokens);
//
//                // Step 2: Create the parser and parse
//                tokens.reset(); // Reset the stream to the beginning for the parser
//                JinjaFlaskParser parser = new JinjaFlaskParser(tokens);
//
//                // Add the custom error listener
//                parser.removeErrorListeners();
//                parser.addErrorListener(new CustomErrorListener());
//
//                // tell ANTLR to build a parse tree
//                ParseTree antlrAST = parser.prog();
//                showParseTree(parser.getRuleNames(), antlrAST);
//                ProgramVisitor programVisitor = new ProgramVisitor();
//                Program program = programVisitor.visit(antlrAST);
//                System.out.println(program);
//
//                System.out.println(SymbolTableManager.INSTANCE.getSymbolTable());
//                // If we reach here, the parse was successful!
//                System.out.println("--- Parsing SUCCESSFUL! ---");
//
//            } catch (Exception e) {
//                System.err.println("Parsing halted due to error: " + (e.getMessage() != null ? e.getMessage() : "Unknown Error (Likely ANTLR Stack Crash)"));
//                // Print stack trace for better debugging of 'null' errors
//                e.printStackTrace();
//            }
        }
    }

    private static void processFile(String fileName) {
        try {
            if (fileName.endsWith(".py")) {
                PythonLexer lexer = new PythonLexer(CharStreams.fromFileName(fileName));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PythonParser parser = new PythonParser(tokens);
                ParseTree tree = parser.prog(); // Start rule for Python
                parser.removeErrorListeners();
                parser.addErrorListener(new CustomErrorListener());

                // tell ANTLR to build a parse tree
                showParseTree(parser.getRuleNames(), tree);
                // Visit Python AST
                ProgramVisitor visitor = new ProgramVisitor();
                Program program = visitor.visit(tree);
                System.out.println(program);
                System.out.println(SymbolTableManager.INSTANCE.getSymbolTable());
            } else if (fileName.endsWith(".html") || fileName.endsWith(".j2")) {
                HtmlLexer lexer = new HtmlLexer(CharStreams.fromFileName(fileName));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                HtmlParser parser = new HtmlParser(tokens);
                ParseTree tree = parser.html_content(); // Start rule for Python
                // Visit Python AST
                parser.removeErrorListeners();
                parser.addErrorListener(new CustomErrorListener());

                // tell ANTLR to build a parse tree
                showParseTree(parser.getRuleNames(), tree);
                HtmlContentVisitor visitor = new HtmlContentVisitor();
                HtmlContent htmlContent = visitor.visit(tree);
                System.out.println(htmlContent);
            } else if (fileName.endsWith(".css")) {
                CssLexer lexer = new CssLexer(CharStreams.fromFileName(fileName));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CssParser parser = new CssParser(tokens);
                ParseTree tree = parser.style_sheet(); // Start rule for Python
                parser.removeErrorListeners();
                parser.addErrorListener(new CustomErrorListener());

                // tell ANTLR to build a parse tree
                showParseTree(parser.getRuleNames(), tree);
                // Visit Python AST
                StyleSheetVisitor visitor = new StyleSheetVisitor();
                ASTNode styleSheet = visitor.visit(tree);
                System.out.println(styleSheet);
            }
        } catch (Exception e) {
            System.err.println("Error parsing " + fileName + ": " + e.getMessage());
        }

    }


    private static void showParseTree(String[] ruleNames, ParseTree parseTree) {
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