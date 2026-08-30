package app;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

/** Watches source files only. Generated files are deliberately excluded to avoid feedback loops. */
public class ProjectWatcher {
    private final Path projectPath;
    private final WatchService watcher;
    private final Consumer<Path> onSourceChange;
    private final Predicate<Path> shouldIgnore;

    public ProjectWatcher(Path projectPath) throws IOException {
        this(projectPath, changedPath -> {
            try {
                App.processFlaskProject(projectPath);
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }, ignored -> false);
    }

    public ProjectWatcher(Path projectPath, Consumer<Path> onSourceChange, Predicate<Path> shouldIgnore) throws IOException {
        this.projectPath = projectPath.toAbsolutePath().normalize();
        this.watcher = FileSystems.getDefault().newWatchService();
        this.onSourceChange = Objects.requireNonNull(onSourceChange, "onSourceChange");
        this.shouldIgnore = Objects.requireNonNull(shouldIgnore, "shouldIgnore");
    }

    public void startWatching() {
        try {
            registerAll(projectPath);
            System.out.println("The regeneration system has started; monitoring source files...");

            while (!Thread.currentThread().isInterrupted()) {
                WatchKey key = watcher.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    if (event.kind() == java.nio.file.StandardWatchEventKinds.OVERFLOW) {
                        continue;
                    }
                    Path directory = (Path) key.watchable();
                    Path fullPath = directory.resolve((Path) event.context()).toAbsolutePath().normalize();

                    if (event.kind() == ENTRY_CREATE && Files.isDirectory(fullPath)) {
                        registerAll(fullPath);
                        continue;
                    }

                    if (isSourceFile(fullPath) && !isGeneratedPath(fullPath) && !shouldIgnore.test(fullPath)) {
                        System.out.println("\nSource change detected in " + fullPath + "; regenerating...");
                        try {
                            onSourceChange.accept(fullPath);
                            System.out.println("Regeneration completed; monitoring continues...");
                        } catch (Exception exception) {
                            System.err.println("Generation error: " + exception.getMessage());
                        }
                    }
                }
                if (!key.reset()) {
                    break;
                }
            }
        } catch (IOException | InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.err.println("Project watcher stopped: " + exception.getMessage());
        } finally {
            try {
                watcher.close();
            } catch (IOException ignored) {
                // Watch service is already stopping.
            }
        }
    }

    private void registerAll(Path start) throws IOException {
        try (var paths = Files.walk(start)) {
            paths.filter(Files::isDirectory)
                    .filter(path -> !isGeneratedPath(path))
                    .forEach(path -> {
                        try {
                            path.register(watcher, ENTRY_MODIFY, ENTRY_CREATE, ENTRY_DELETE);
                        } catch (IOException exception) {
                            System.err.println("Could not monitor " + path + ": " + exception.getMessage());
                        }
                    });
        }
    }

    private boolean isSourceFile(Path path) {
        String name = path.getFileName().toString();
        return name.endsWith(".py") || name.endsWith(".html") || name.endsWith(".css") || name.endsWith(".js");
    }

    private boolean isGeneratedPath(Path path) {
        String normal = path.toString().replace('\\', '/');
        return normal.endsWith("/output")
                || normal.endsWith("/compiler_output")
                || normal.contains("/output/")
                || normal.contains("/compiler_output/")
                || normal.contains("/__pycache__/")
                || normal.contains("/generated/");
    }
}
