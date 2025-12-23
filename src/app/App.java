package app;

import antlr.JinjaFlaskLexer;
import antlr.JinjaFlaskParser;
import ast.htmlElement.HtmlBodyItem;
import listener.CustomErrorListener;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.html.HtmlBodyItemVisitor;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java app.App <file_name>");
            return;
        }

        String fileName = args[0];

        try {
            CommonTokenStream tokens = getTokenStream(fileName);


            debugTokenStream(tokens);
            tokens.reset();
            JinjaFlaskParser parser = new JinjaFlaskParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new CustomErrorListener());


            ParseTree tree = parser.html_content();
            showParseTree(parser.getRuleNames(), tree);
            HtmlBodyItemVisitor htmlBodyVisitor =
                    new HtmlBodyItemVisitor();

            HtmlBodyItem body = htmlBodyVisitor.visit(tree);
            System.out.println("\n=== HTML BODY RESULT ===");
            System.out.println(body);
            System.out.println(body.getContentItems());

            System.out.println("\n--- HTML Parsing SUCCESSFUL ---");

        } catch (Exception e) {
            System.err.println(
                    "Parsing halted due to error: " +
                            (e.getMessage() != null ? e.getMessage() : "Unknown Error")
            );
            e.printStackTrace();
        }
    }

    private static CommonTokenStream getTokenStream(String fileName)
            throws IOException {

        CharStream input = CharStreams.fromFileName(fileName);
        JinjaFlaskLexer lexer = new JinjaFlaskLexer(input);
        lexer.removeErrorListeners();

        return new CommonTokenStream(lexer);
    }

    private static void debugTokenStream(CommonTokenStream tokens) {
        tokens.fill();
        List<Token> allTokens = tokens.getTokens();

        System.out.println("\n--- LEXER TOKEN DEBUG OUTPUT ---");
        for (Token t : allTokens) {
            if (t.getChannel() == Token.DEFAULT_CHANNEL) {
                String tokenName =
                        JinjaFlaskLexer.VOCABULARY.getSymbolicName(t.getType());

                if (tokenName == null) {
                    tokenName = "VirtualType(" + t.getType() + ")";
                }

                String tokenText =
                        t.getText().replace("\n", "\\n").replace("\r", "\\r");

                System.out.printf(
                        "Line %d | %-20s | Text: '%s'%n",
                        t.getLine(), tokenName, tokenText
                );
            }
        }
        System.out.println("--------------------------------\n");
    }

    private static void showParseTree(String[] ruleNames, ParseTree parseTree) {
        TreeViewer viewer =
                new TreeViewer(
                        java.util.Arrays.asList(ruleNames),
                        parseTree
                );

        viewer.setScale(1.2);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(viewer, BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(mainPanel);

        JFrame frame = new JFrame("Parse Tree Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(1000, 650);
        frame.setVisible(true);
    }
}
