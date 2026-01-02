package app;

import antlr.JinjaFlaskLexer;
import antlr.JinjaFlaskParser;
import ast.Program;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symbolTable.SymbolTableManager;
import visitor.python.ProgramVisitor;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java app.App <file_name>");
        } else {
            String fileName = args[0];
            try {
                CommonTokenStream tokens = getTokenStream(fileName);

                JinjaFlaskParser parser = new JinjaFlaskParser(tokens);

                ParseTree antlrAST = parser.prog();
                showParseTree(parser.getRuleNames(), antlrAST);
                ProgramVisitor programVisitor = new ProgramVisitor();
                Program program = programVisitor.visit(antlrAST);
                System.out.println(program);

                System.out.println(SymbolTableManager.INSTANCE.getSymbolTable());
                System.out.println("--- Parsing SUCCESSFUL! ---");

            } catch (Exception e) {
                System.err.println("Parsing halted due to error: " + (e.getMessage() != null ? e.getMessage() : "Unknown Error (Likely ANTLR Stack Crash)"));
                e.printStackTrace();
            }
        }
    }

    private static void showParseTree(String[] ruleNames, ParseTree parseTree) {
        TreeViewer viewer = new TreeViewer(
                java.util.Arrays.asList(ruleNames),
                parseTree
        );

        viewer.setScale(1.5);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(viewer, BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

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

        JFrame frame = new JFrame("Parse Tree Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setSize(1000, 640);
        frame.setVisible(true);
    }

    private static CommonTokenStream getTokenStream(String fileName) throws IOException {
        CharStream input = CharStreams.fromFileName(fileName);

        JinjaFlaskLexer lexer = new JinjaFlaskLexer(input);

        return new CommonTokenStream(lexer);
    }


}