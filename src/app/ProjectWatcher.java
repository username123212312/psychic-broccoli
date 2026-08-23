package app;

import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;

public class ProjectWatcher {
    private final Path projectPath;
    private final WatchService watcher;

    public ProjectWatcher(Path projectPath) throws IOException {
        this.projectPath = projectPath;
        this.watcher = FileSystems.getDefault().newWatchService();
    }

    public void startWatching() {
        try {
            registerAll(projectPath);

            System.out.println("The Regeneration System has started..monitoring...");

            while (true) {
                WatchKey key = watcher.take();

                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    Path dir = (Path) key.watchable();
                    Path fullPath = dir.resolve((Path) event.context());

                    // New directory created -> register it so files inside are watched too
                    if (kind == ENTRY_CREATE && Files.isDirectory(fullPath)) {
                        registerAll(fullPath);
                    }

                    // Only react to .py / .html source files, and skip generated output
                    if (Files.isRegularFile(fullPath) && isSourceFile(fullPath) && !isGeneratedPath(fullPath)) {
                        System.out.println("\n A change was detected in " + fullPath + " Reloading.....");

                        try {
                            App.processFlaskProject(projectPath);
                            System.out.println("Regeneration process has been successfully completed..monitoring...");
                        } catch (Exception e) {
                            System.err.println(" Error during the generation process " + e.getMessage());
                        }
                    }
                }

                if (!key.reset()) break;
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void registerAll(Path start) throws IOException {
        Files.walk(start)
                .filter(Files::isDirectory)
                .filter(p -> !isGeneratedPath(p))
                .forEach(p -> {
                    try {
                        p.register(watcher, ENTRY_MODIFY, ENTRY_CREATE, ENTRY_DELETE);
                    } catch (IOException e) {
                        System.err.println("Error registering " + p + ": " + e.getMessage());
                    }
                });
    }

    private boolean isSourceFile(Path path) {
        String name = path.getFileName().toString();
        return name.endsWith(".py") || name.endsWith(".html");
    }

    private boolean isGeneratedPath(Path path) {
        String p = path.toString();
        return p.endsWith("\\output") || p.endsWith("/output")
                || p.endsWith("\\compiler_output") || p.endsWith("/compiler_output")
                || p.contains("\\output\\") || p.contains("/output/")
                || p.contains("\\compiler_output\\") || p.contains("/compiler_output/")
                || p.contains("\\__pycache__") || p.contains("/__pycache__")
                || p.contains("\\generated\\") || p.contains("/generated/");
    }
}
