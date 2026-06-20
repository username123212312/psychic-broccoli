package app;

import antlr.css.CssLexer;
import antlr.css.CssParser;
import antlr.html.HtmlLexer;
import antlr.html.HtmlParser;
import antlr.python.PythonLexer;
import antlr.python.PythonParser;
import ast.ASTNode;
import ast.HtmlContent;
import ast.Program;
import cpython_bytecode.PythonCodeObject;
import cpython_bytecode.codegen.CPythonBytecodeGenerator;
import cpython_bytecode.serialization.PycFileWriter;
import listener.CustomErrorListener;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.jinja.JinjaSemanticAnalyzer;
import symbolTable.SymbolTableManager;
import visitor.css.StyleSheetVisitor;
import visitor.html.HtmlContentVisitor;
import visitor.python.ProgramVisitor;

import javax.swing.*;
import java.awt.*;
import java.io.File;
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
                List<Path> files = paths.filter(Files::isRegularFile).sorted().toList();

                files.stream()
                        .filter(path -> path.toString().endsWith(".py"))
                        .forEach(path -> {
                            System.out.println("\n--- Processing Python: " + path + " ---");
                            processFile(path);
                        });

                files.stream()
                        .filter(path -> !path.toString().endsWith(".py"))
                        .forEach(path -> {
                            System.out.println("\n--- Processing Other: " + path + " ---");
                            processFile(path);
                        });
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void processFile(Path filePath) {
        String fileName = filePath.toString();
        try {
            if (fileName.endsWith(".py")) {
                PythonLexer lexer = new PythonLexer(CharStreams.fromFileName(fileName));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                PythonParser parser = new PythonParser(tokens);
                parser.removeErrorListeners();
                parser.addErrorListener(new CustomErrorListener());
                ParseTree tree = parser.prog();

                showParseTree(parser.getRuleNames(), tree);

                // 1. Visit Python AST
                ProgramVisitor visitor = new ProgramVisitor();
                Program program = visitor.visit(tree);
                System.out.println("[1/4] AST Generated.");

                // 2. Run semantic analysis pass
                semantic.SemanticAnalyzer analyzer = new semantic.SemanticAnalyzer();
                analyzer.analyze(program);
                System.out.println("[2/4] Semantic Analysis Completed.");
                System.out.println("Symbol Table: " + SymbolTableManager.INSTANCE.getSymbolTable());

                // 3. Bytecode Generation
                CPythonBytecodeGenerator generator = new CPythonBytecodeGenerator();
                String moduleName = getModuleName(fileName);
                PythonCodeObject compiledCode = generator.generate(program, fileName, moduleName);
                System.out.println("[3/4] CPython Bytecode Generated.");

                // 4. Bytecode Serialization (.pyc creation)
                ensurePycacheDirectory();
                String outputPycPath = "./__pycache__/" + moduleName + ".cpython-314.pyc";
                PycFileWriter pycWriter = new PycFileWriter();
                pycWriter.write(compiledCode, outputPycPath);
                System.out.println("[4/4] .pyc file created at: " + outputPycPath);

            } else if (fileName.endsWith(".html") || fileName.endsWith(".j2")) {
                HtmlLexer lexer = new HtmlLexer(CharStreams.fromFileName(fileName));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                HtmlParser parser = new HtmlParser(tokens);
                ParseTree tree = parser.html_content();
                parser.removeErrorListeners();
                parser.addErrorListener(new CustomErrorListener());

                showParseTree(parser.getRuleNames(), tree);
                HtmlContentVisitor visitor = new HtmlContentVisitor();
                HtmlContent htmlContent = visitor.visit(tree);
                System.out.println(htmlContent);

                JinjaSemanticAnalyzer analyzer = new JinjaSemanticAnalyzer();
                analyzer.analyze(htmlContent);
                System.out.println(SymbolTableManager.INSTANCE.getSymbolTable());

            } else if (fileName.endsWith(".css")) {
                CssLexer lexer = new CssLexer(CharStreams.fromFileName(fileName));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CssParser parser = new CssParser(tokens);
                ParseTree tree = parser.style_sheet();
                parser.removeErrorListeners();
                parser.addErrorListener(new CustomErrorListener());

                showParseTree(parser.getRuleNames(), tree);
                StyleSheetVisitor visitor = new StyleSheetVisitor();
                ASTNode styleSheet = visitor.visit(tree);
                System.out.println(styleSheet);
            }
        } catch (Exception e) {
            System.err.println("Error processing " + fileName + ": " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static String getModuleName(String path) {
        String filename = new File(path).getName();
        int dotIndex = filename.lastIndexOf('.');
        return (dotIndex == -1) ? filename : filename.substring(0, dotIndex);
    }

    private static void ensurePycacheDirectory() {
        File pycache = new File("./__pycache__");
        if (!pycache.exists()) {
            pycache.mkdirs();
        }
    }

    private static void showParseTree(String[] ruleNames, ParseTree parseTree) {
        if (GraphicsEnvironment.isHeadless()) {
            return;
        }

        TreeViewer viewer = new TreeViewer(java.util.Arrays.asList(ruleNames), parseTree);
        viewer.setScale(1.5);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(viewer, BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(mainPanel);

        JPanel controlPanel = new JPanel();
        JButton zoomInButton = new JButton("Zoom In");
        JButton zoomOutButton = new JButton("Zoom Out");
        JButton resetButton = new JButton("Reset Zoom");

        zoomInButton.addActionListener(e -> { viewer.setScale(viewer.getScale() * 1.2); viewer.repaint(); });
        zoomOutButton.addActionListener(e -> { viewer.setScale(viewer.getScale() / 1.2); viewer.repaint(); });
        resetButton.addActionListener(e -> { viewer.setScale(1.0); viewer.repaint(); });

        controlPanel.add(zoomInButton);
        controlPanel.add(zoomOutButton);
        controlPanel.add(resetButton);

        JFrame frame = new JFrame("Parse Tree Viewer");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);
        frame.setSize(1000, 640);
        frame.setVisible(true);
    }
}
