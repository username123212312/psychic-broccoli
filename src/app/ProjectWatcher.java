package app;

import java.io.IOException;
import java.nio.file.*;
import static java.nio.file.StandardWatchEventKinds.*;

public class ProjectWatcher {
    private final Path projectPath;

    public ProjectWatcher(Path projectPath) {
        this.projectPath = projectPath;
    }

    public void startWatching() {
        try (WatchService watcher = FileSystems.getDefault().newWatchService()) {

            projectPath.register(watcher, ENTRY_MODIFY);

            System.out.println("The Rengeration System has started..monitoring...");

            while (true) {
                WatchKey key = watcher.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    Path fileName = (Path) event.context();


                    if (fileName.toString().endsWith(".py") || fileName.toString().endsWith(".html")) {
                        System.out.println("\n A change was detected in " + fileName + "Reloading.....");


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
}