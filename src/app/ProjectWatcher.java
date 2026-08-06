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

            System.out.println("🔔 نظام الـ Regeneration يعمل الآن... راقب ملفاتك!");

            while (true) {
                WatchKey key = watcher.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    Path fileName = (Path) event.context();


                    if (fileName.toString().endsWith(".py") || fileName.toString().endsWith(".html")) {
                        System.out.println("\n🔄 تم كشف تغيير في: " + fileName + ". جاري إعادة التوليد...");


                        try {
                            App.processFlaskProject(projectPath);
                            System.out.println("✅ تم إعادة التوليد بنجاح!");
                        } catch (Exception e) {
                            System.err.println("❌ خطأ أثناء إعادة التوليد: " + e.getMessage());
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