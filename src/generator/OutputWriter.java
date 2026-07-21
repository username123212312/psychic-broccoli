package generator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Map;

public class OutputWriter {
    private Path outputDir;
    private Path compilerOutputDir;

    public OutputWriter(Path baseDir) {
        this.outputDir = baseDir.resolve("output");
        this.compilerOutputDir = baseDir.resolve("compiler_output");
    }

    public void createDirectories() throws IOException {
        Files.createDirectories(outputDir);
        Files.createDirectories(compilerOutputDir);
    }

    public void writeHtmlFile(String filename, String content) throws IOException {
        Files.writeString(outputDir.resolve(filename), content);
    }

    public void copySupportFile(Path sourcePath) throws IOException {
        Path target = outputDir.resolve(sourcePath.getFileName());
        Files.copy(sourcePath, target, StandardCopyOption.REPLACE_EXISTING);
    }

    public void writeAstPythonJson(String json) throws IOException {
        Files.writeString(compilerOutputDir.resolve("ast_python.json"), json);
    }

    public void writeAstJinjaJson(String json) throws IOException {
        Files.writeString(compilerOutputDir.resolve("ast_jinja.json"), json);
    }

    public void writeSemanticReport(String report) throws IOException {
        Files.writeString(compilerOutputDir.resolve("semantic_report.txt"), report);
    }

    public void writeGenerationLog(String log) throws IOException {
        Files.writeString(compilerOutputDir.resolve("generation_log.txt"), log);
    }

    public void writeFile(String relativePath, String content) throws IOException {
        Path target = outputDir.resolve(relativePath);
        Files.createDirectories(target.getParent());
        Files.writeString(target, content);
    }

    public Path getOutputDir() {
        return outputDir;
    }

    public Path getCompilerOutputDir() {
        return compilerOutputDir;
    }
}
