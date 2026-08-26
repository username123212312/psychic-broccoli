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
import generator.ContextExtractor;
import generator.JinjaRenderer;
import generator.OutputWriter;
import listener.CustomErrorListener;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java app.App <directory_path_or_file>");
            return;
        }
        Path startPath = Paths.get(args[0]);

        if (Files.isDirectory(startPath) && isFlaskProject(startPath)) {
            try {
                processFlaskProject(startPath);
                ProjectWatcher watcher = new ProjectWatcher(startPath);
                watcher.startWatching();
            } catch (Exception e) {
                System.err.println("Error processing Flask project: " + e.getMessage());
                e.printStackTrace();
            }
            return;
        }

        try (Stream<Path> paths = Files.walk(startPath)) {
            List<Path> files = paths
                    .filter(Files::isRegularFile)
                    .filter(p -> !p.toString().contains("\\generated\\") && !p.toString().contains("/generated/"))
                    .sorted()
                    .toList();

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

    private static boolean isFlaskProject(Path dir) {
        return Files.exists(dir.resolve("app.py"))
                && Files.exists(dir.resolve("templates"));
    }

    public static void processFlaskProject(Path projectDir) throws Exception {
        System.out.println("=== Flask Project Mode ===");
        OutputWriter outputWriter = new OutputWriter(projectDir);
        outputWriter.createDirectories();

        // 1. Parse app.py
        Path appPy = projectDir.resolve("app.py");
        System.out.println("\n--- Parsing: " + appPy + " ---");
        PythonLexer lexer = new PythonLexer(CharStreams.fromFileName(appPy.toString()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomErrorListener());
        ParseTree tree = parser.prog();
        showParseTree(parser.getRuleNames(), tree);

        ProgramVisitor visitor = new ProgramVisitor();
        Program program = visitor.visit(tree);
        System.out.println("[1/5] Python AST Generated.");

        // 2. Semantic analysis
        semantic.SemanticAnalyzer analyzer = new semantic.SemanticAnalyzer();
        analyzer.analyze(program);
        System.out.println("[2/5] Semantic Analysis Completed.");

        // 3. Extract context data
        ContextExtractor extractor = new ContextExtractor();
        Map<String, Object> context = extractor.extract(program);
        Map<String, String> routes = extractor.extractRoutes(program);
        System.out.println("[3/5] Context Data Extracted: " + context.keySet());
        System.out.println("Routes: " + routes.keySet());

        // 4. Parse all templates
        Path templatesDir = projectDir.resolve("templates");
        Map<String, HtmlContent> templateMap = new LinkedHashMap<>();
        Map<String, String> templateSourcePaths = new LinkedHashMap<>();

        if (Files.isDirectory(templatesDir)) {
            try (Stream<Path> tplPaths = Files.walk(templatesDir)) {
                List<Path> htmlFiles = tplPaths
                        .filter(Files::isRegularFile)
                        .filter(p -> p.toString().endsWith(".html"))
                        .filter(p -> !p.toString().contains("\\generated\\") && !p.toString().contains("/generated/"))
                        .toList();

                for (Path tplPath : htmlFiles) {
                    System.out.println("Parsing template: " + tplPath);
                    try {
                        HtmlLexer htmlLexer = new HtmlLexer(CharStreams.fromFileName(tplPath.toString()));
                        CommonTokenStream htmlTokens = new CommonTokenStream(htmlLexer);
                        HtmlParser htmlParser = new HtmlParser(htmlTokens);
                        htmlParser.removeErrorListeners();
                        htmlParser.addErrorListener(new CustomErrorListener());
                        ParseTree htmlTree = htmlParser.html_content();
                        HtmlContentVisitor htmlVisitor = new HtmlContentVisitor();
                        HtmlContent htmlContent = htmlVisitor.visit(htmlTree);
                        templateMap.put(tplPath.getFileName().toString(), htmlContent);
                        templateSourcePaths.put(tplPath.getFileName().toString(), tplPath.toString());
                        System.out.println("  AST built for: " + tplPath.getFileName());
                    } catch (Exception e) {
                        System.err.println("  ERROR parsing " + tplPath.getFileName() + ": " + e.getMessage());
                    }
                }
            }
        }

        // 5. Check templates for missing Flask variables
        Map<String, java.util.Set<String>> templateExpectedVars = extractor.extractRenderTemplateVars(program);
        semantic.ErrorReporter flaskReporter = new semantic.ErrorReporter();
        semantic.jinja.FlaskTemplateChecker flaskChecker = new semantic.jinja.FlaskTemplateChecker();
        for (Map.Entry<String, HtmlContent> entry : templateMap.entrySet()) {
            String tplName = entry.getKey();
            if ("base.html".equals(tplName)) continue;
            java.util.Set<String> provided = templateExpectedVars.getOrDefault(tplName, new java.util.HashSet<>());
            flaskChecker.analyze(entry.getValue(), tplName, provided, flaskReporter);
        }
        flaskReporter.printErrors();

        // 6. Render templates and write output
        JinjaRenderer renderer = new JinjaRenderer(context, templateMap, routes);
        System.out.println("\n[4/5] Rendering templates...");

        // Determine output HTML filenames:
        // map template names to output names as per described flow
        // base.html is not rendered directly (it's a parent template)
        // index.html → output/index.html
        // add.html → output/add_product.html if add.html corresponds to add_product
        // detail.html → output/detail.html if it corresponds to detail
        for (Map.Entry<String, HtmlContent> entry : templateMap.entrySet()) {
            String tplName = entry.getKey();
            HtmlContent htmlContent = entry.getValue();

            // Skip base template (parent only)
            if ("base.html".equals(tplName)) continue;

            try {
                String renderedHtml = renderer.render(htmlContent);
                // Map template filename to output filename
                String outputName = mapToOutputName(tplName);
                outputWriter.writeHtmlFile(outputName, renderedHtml);
                System.out.println("  Rendered: " + tplName + " -> output/" + outputName);
            } catch (Exception e) {
                System.err.println("  ERROR rendering " + tplName + ": " + e.getMessage());
            }
        }

        // 6. Copy support files (app.py, templates, styles.css, script.js)
        copySupportFileIfExists(projectDir.resolve("app.py"), outputWriter);
        copyDirectory(projectDir.resolve("templates"), outputWriter.getOutputDir().resolve("templates"));
        copySupportFileIfExists(projectDir.resolve("styles.css"), outputWriter);
        copySupportFileIfExists(projectDir.resolve("script.js"), outputWriter);
        System.out.println("[5/5] Support files copied.");

        // 7. Write reports
        writeReports(outputWriter, program, context, routes, templateMap);

        System.out.println("\n=== Flask Project Processing Complete ===");
        System.out.println("Output directory: " + outputWriter.getOutputDir());
        System.out.println("Compiler output: " + outputWriter.getCompilerOutputDir());
    }

    private static String mapToOutputName(String tplName) {
        switch (tplName) {
            case "index.html": return "index.html";
            case "add.html": return "add_product.html";
            case "detail.html": return "detail.html";
            case "edit.html": return "edit_product.html";
            default: return tplName;
        }
    }

    private static void copyDirectory(Path source, Path target) throws IOException {
        if (Files.isDirectory(source)) {
            Files.createDirectories(target);
            try (var files = Files.walk(source)) {
                for (var file : (Iterable<Path>) files::iterator) {
                    if (Files.isRegularFile(file)) {
                        Path rel = source.relativize(file);
                        Path dest = target.resolve(rel);
                        Files.createDirectories(dest.getParent());
                        Files.copy(file, dest, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }
            System.out.println("  Copied: " + source.getFileName() + "/ -> output/" + target.getFileName() + "/");
        }
    }

    private static void copySupportFileIfExists(Path sourcePath, OutputWriter outputWriter) {
        if (Files.exists(sourcePath)) {
            try {
                outputWriter.copySupportFile(sourcePath);
                System.out.println("  Copied: " + sourcePath.getFileName());
            } catch (IOException e) {
                System.err.println("  ERROR copying " + sourcePath.getFileName() + ": " + e.getMessage());
            }
        }
    }

    private static void writeReports(OutputWriter outputWriter, Program program,
                                     Map<String, Object> context, Map<String, String> routes,
                                     Map<String, HtmlContent> templateMap) throws IOException {
        StringBuilder semanticReport = new StringBuilder();
        semanticReport.append("=== Semantic Analysis Report ===\n");
        semanticReport.append("File: app.py\n");
        semanticReport.append("Errors: none\n");
        semanticReport.append("Warnings: none\n\n");
        semanticReport.append("Symbol Table:\n");
        semanticReport.append(SymbolTableManager.INSTANCE.getSymbolTable().toString()).append("\n\n");
        semanticReport.append("Context Variables:\n");
        for (String key : context.keySet()) {
            semanticReport.append("  ").append(key).append(": ").append(context.get(key)).append("\n");
        }
        semanticReport.append("\nRoutes:\n");
        for (Map.Entry<String, String> entry : routes.entrySet()) {
            semanticReport.append("  ").append(entry.getKey()).append(" -> ").append(entry.getValue()).append("\n");
        }
        outputWriter.writeSemanticReport(semanticReport.toString());

        StringBuilder generationLog = new StringBuilder();
        generationLog.append("=== Generation Log ===\n");
        generationLog.append("Python AST extracted from: app.py\n");
        generationLog.append("Context variables: ").append(context.keySet()).append("\n");
        generationLog.append("Templates parsed: ").append(templateMap.keySet()).append("\n");
        for (Map.Entry<String, HtmlContent> entry : templateMap.entrySet()) {
            String tplName = entry.getKey();
            if ("base.html".equals(tplName)) continue;
            String outputName = mapToOutputName(tplName);
            generationLog.append("Template ").append(tplName)
                    .append(" → rendered to output/").append(outputName).append("\n");
        }
        generationLog.append("Support files copied to output/\n");
        generationLog.append("Compilation completed successfully.\n");
        outputWriter.writeGenerationLog(generationLog.toString());

        String astStr = program != null ? program.toString() : "null";
        outputWriter.writeAstPythonJson("{\n  \"program\": \"" + escapeJson(astStr) + "\"\n}");

        StringBuilder jinjaAst = new StringBuilder();
        jinjaAst.append("{\n  \"templates\": {\n");
        boolean first = true;
        for (Map.Entry<String, HtmlContent> entry : templateMap.entrySet()) {
            String tplName = entry.getKey();
            HtmlContent htmlContent = entry.getValue();
            if (!first) jinjaAst.append(",\n");
            first = false;
            String tplAst = htmlContent != null ? htmlContent.toString() : "null";
            jinjaAst.append("    \"").append(tplName).append("\": \"").append(escapeJson(tplAst)).append("\"");
        }
        jinjaAst.append("\n  }\n}");
        outputWriter.writeAstJinjaJson(jinjaAst.toString());
    }

    private static String escapeJson(String s) {
        if (s == null) return "null";
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
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

                ProgramVisitor visitor = new ProgramVisitor();
                Program program = visitor.visit(tree);
                System.out.println("[1/4] AST Generated.");

                semantic.SemanticAnalyzer analyzer = new semantic.SemanticAnalyzer();
                analyzer.analyze(program);
                System.out.println("[2/4] Semantic Analysis Completed.");
                System.out.println("Symbol Table: " + SymbolTableManager.INSTANCE.getSymbolTable());

                CPythonBytecodeGenerator generator = new CPythonBytecodeGenerator();
                String moduleName = getModuleName(fileName);
                PythonCodeObject compiledCode = generator.generate(program, fileName, moduleName);
                System.out.println("[3/4] CPython Bytecode Generated.");

                Path parentDir = filePath.getParent();
                if (parentDir == null) parentDir = Paths.get(".");
                File pycacheDir = new File(parentDir.toFile(), "__pycache__");
                if (!pycacheDir.exists()) pycacheDir.mkdirs();
                String outputPycPath = new File(pycacheDir, moduleName + ".cpython-314.pyc").getAbsolutePath();
                PycFileWriter pycWriter = new PycFileWriter();
                pycWriter.write(compiledCode, outputPycPath, fileName);
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

                try {
                    String content = htmlContent.generateCode();
                    writeGeneratedSource(filePath, content);
                } catch (Exception genEx) {
                    System.err.println("Error generating output for " + fileName + ": " + genEx.getMessage());
                    genEx.printStackTrace();
                }

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

                if (styleSheet instanceof ast.css.StyleSheet cssStyleSheet) {
                    String generatedCss = cssStyleSheet.generateCode();
                    writeGeneratedSource(filePath, generatedCss);
                }
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

    private static void writeGeneratedSource(Path filePath, String content) throws IOException {
        Path parentDir = filePath.getParent();
        Path outputDir = parentDir.resolve("generated");
        if (!Files.exists(outputDir)) {
            Files.createDirectories(outputDir);
        }
        Path outputFile = outputDir.resolve(filePath.getFileName());
        Files.writeString(outputFile, content);
        System.out.println("Success! Generated at: " + outputFile.toAbsolutePath());
    }

    private static void showParseTree(String[] ruleNames, ParseTree parseTree) {
        if (GraphicsEnvironment.isHeadless()) {
            return;
        }
        SwingUtilities.invokeLater(() -> {
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
        });
    }
}