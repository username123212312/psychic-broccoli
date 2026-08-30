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

    /** The context variables from the last successful full compilation. */
    public Map<String, Object> getContext() {
        return new LinkedHashMap<>(compiledContext);
    }

    /**
     * Regenerates only rendered output and runtime support files after a data change.
     * The given context is used as-is: the caller is expected to merge the latest
     * data of every editable collection (plus the compiled snapshot context), so
     * templates that read several collections stay consistent. Compiler artefacts
     * (AST and semantic report) intentionally remain from this snapshot.
     */
    public synchronized void rerender(String causeCollection, Map<String, Object> liveContext) throws IOException {
        JinjaRenderer renderer = new JinjaRenderer(new LinkedHashMap<>(liveContext), templateMap, routes);

        OutputWriter outputWriter = new OutputWriter(projectDirectory);
        outputWriter.createDirectories();

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
                "Cause: collection '" + causeCollection + "' updated from the Java web server.\n" +
                "Skipped: Lexer -> Parser -> Visitor -> AST -> Semantic.\n" +
                "Re-rendered templates using the latest successful compilation snapshot.\n" +
                "Updated runtime support files copied to output/.\n" +
                "AST and semantic-report files describe the last full compilation.\n");
    }
}
