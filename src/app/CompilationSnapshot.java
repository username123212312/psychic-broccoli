package app;

import ast.HtmlContent;
import generator.JinjaRenderer;
import generator.OutputWriter;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The result of the latest successful full compilation.  It is safe to reuse
 * for data-only updates because templates, routes and semantic structure have
 * already been validated.  It never invokes a lexer, parser, visitor or semantic analyser.
 */
public final class CompilationSnapshot {
    private final Path projectDirectory;
    private final Map<String, Object> compiledContext;
    private final Map<String, HtmlContent> templateMap;
    private final Map<String, String> routes;

    public CompilationSnapshot(Path projectDirectory,
                               Map<String, Object> compiledContext,
                               Map<String, HtmlContent> templateMap,
                               Map<String, String> routes) {
        this.projectDirectory = projectDirectory.toAbsolutePath().normalize();
        this.compiledContext = new LinkedHashMap<>(compiledContext);
        this.templateMap = new LinkedHashMap<>(templateMap);
        this.routes = new LinkedHashMap<>(routes);
    }

    /**
     * Regenerates only rendered output and runtime support files after a CRUD data change.
     * Compiler artefacts (AST and semantic report) intentionally remain from this snapshot.
     */
    public synchronized void renderProductsOnly(List<Product> products) throws IOException {
        Map<String, Object> liveContext = new LinkedHashMap<>(compiledContext);
        liveContext.put("products", productsToContext(products));

        OutputWriter outputWriter = new OutputWriter(projectDirectory);
        outputWriter.createDirectories();
        JinjaRenderer renderer = new JinjaRenderer(liveContext, templateMap, routes);

        System.out.println("=== Data-only Render Mode ===");
        System.out.println("Skipping Lexer -> Parser -> Visitor -> AST -> Semantic; rendering with the latest successful snapshot.");
        for (Map.Entry<String, HtmlContent> entry : templateMap.entrySet()) {
            String templateName = entry.getKey();
            if ("base.html".equals(templateName)) {
                continue;
            }
            String renderedHtml = renderer.render(entry.getValue());
            String outputName = App.mapToOutputName(templateName);
            outputWriter.writeHtmlFile(outputName, renderedHtml);
            System.out.println("  Re-rendered: " + templateName + " -> output/" + outputName);
        }

        App.copyRuntimeSupportFiles(projectDirectory, outputWriter);
        outputWriter.writeGenerationLog("=== Data-only Render Log ===\n" +
                "At: " + Instant.now() + "\n" +
                "Cause: product CRUD update from the Java web server.\n" +
                "Skipped: Lexer -> Parser -> Visitor -> AST -> Semantic.\n" +
                "Re-rendered templates using the latest successful compilation snapshot.\n" +
                "Updated runtime support files copied to output/.\n" +
                "AST and semantic-report files describe the last full compilation.\n");
    }

    private static List<Map<String, Object>> productsToContext(List<Product> products) {
        return products.stream().map(product -> {
            Map<String, Object> row = new LinkedHashMap<>();
            row.put("id", product.id());
            row.put("name", product.name());
            row.put("price", product.price());
            row.put("description", product.description());
            row.put("specification", product.specification());
            row.put("img", product.img());
            return row;
        }).toList();
    }
}
