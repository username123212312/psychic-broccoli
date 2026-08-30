package app;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;

/**
 * Runs the generated files and exposes a small same-origin CRUD API.
 * app.py remains the single source of truth: each successful API mutation is
 * written into the matching top-level collection literal and then sent through
 * the existing renderer.
 *
 * <p>Editable collections are discovered from the compiled context: any
 * top-level variable whose value is a list of dictionaries that carry a numeric
 * {@code "id"} key (e.g. {@code products}, {@code posts}, {@code books}). Each
 * such collection is exposed at {@code /api/<collectionName>} and everything in
 * the data path is generic - no field set is hard-coded.</p>
 */
public final class CompilerWebServer implements AutoCloseable {
    private static final int MAX_REQUEST_BODY_BYTES = 64 * 1024;

    private final Path projectDirectory;
    private final Path outputDirectory;
    private final Map<String, PythonDataStore> stores;
    private final HttpServer server;
    private final SseHub events = new SseHub();
    private final Object compilationLock = new Object();
    private volatile CompilationSnapshot snapshot;

    public CompilerWebServer(Path projectDirectory, int port, CompilationSnapshot initialSnapshot) throws IOException {
        this.projectDirectory = projectDirectory.toAbsolutePath().normalize();
        this.outputDirectory = this.projectDirectory.resolve("output").normalize();
        this.snapshot = initialSnapshot;
        this.server = HttpServer.create(new InetSocketAddress("127.0.0.1", port), 0);
        this.server.setExecutor(Executors.newVirtualThreadPerTaskExecutor());

        Map<String, PythonDataStore> discovered = new LinkedHashMap<>();
        Path appPy = this.projectDirectory.resolve("app.py");
        if (Files.isRegularFile(appPy)) {
            for (String collection : discoverCollections(initialSnapshot.getContext())) {
                if (discovered.containsKey(collection)) {
                    continue;
                }
                PythonDataStore store = new PythonDataStore(appPy, collection);
                discovered.put(collection, store);
                String contextPath = "/api/" + collection;
                server.createContext(contextPath, exchange -> handleCollection(exchange, collection, store));
                System.out.println("API endpoint registered: " + contextPath);
            }
        }
        this.stores = Collections.unmodifiableMap(new LinkedHashMap<>(discovered));

        this.server.createContext("/events", this::handleEvents);
        this.server.createContext("/", this::handleGeneratedFile);
    }

    public void start() {
        server.start();
        System.out.println("Web server running at http://127.0.0.1:" + getPort());
    }

    public int getPort() {
        return server.getAddress().getPort();
    }

    public boolean shouldIgnoreSourceEvent(Path changedPath) {
        for (PythonDataStore store : stores.values()) {
            if (store.shouldIgnoreSourceEvent(changedPath)) {
                return true;
            }
        }
        return false;
    }

    public void onExternalSourceChange(Path changedPath) {
        try {
            synchronized (compilationLock) {
                snapshot = App.processFlaskProject(projectDirectory);
            }
            events.broadcast("regenerated", eventData("source-change", changedPath.toString()));
        } catch (Exception exception) {
            System.err.println("Regeneration after source change failed: " + exception.getMessage());
            events.broadcast("compiler-error", eventData("source-change", exception.getMessage()));
        }
    }

    private void handleCollection(HttpExchange exchange, String collection, PythonDataStore store) throws IOException {
        try {
            String prefix = "/api/" + collection;
            String path = exchange.getRequestURI().getPath();
            String tail = path.substring(prefix.length());
            String method = exchange.getRequestMethod();

            if (tail.isEmpty() || "/".equals(tail)) {
                if ("GET".equals(method)) {
                    sendJson(exchange, 200, listJson(store.list()));
                    return;
                }
                if ("POST".equals(method)) {
                    Map<String, String> form = readForm(exchange);
                    DataRecord created = store.create(form);
                    regenerateAfterUiMutation(collection, "create", created.id());
                    sendJson(exchange, 201, created.toJson());
                    return;
                }
                sendMethodNotAllowed(exchange, "GET, POST");
                return;
            }

            int recordId = parseId(tail);
            if ("GET".equals(method)) {
                DataRecord record = store.find(recordId)
                        .orElseThrow(() -> new PythonDataStore.NotFoundException(collection, recordId));
                sendJson(exchange, 200, record.toJson());
                return;
            }
            if ("PUT".equals(method)) {
                Map<String, String> form = readForm(exchange);
                DataRecord updated = store.update(recordId, form);
                regenerateAfterUiMutation(collection, "update", updated.id());
                sendJson(exchange, 200, updated.toJson());
                return;
            }
            if ("DELETE".equals(method)) {
                store.delete(recordId);
                regenerateAfterUiMutation(collection, "delete", recordId);
                sendEmpty(exchange, 204);
                return;
            }
            sendMethodNotAllowed(exchange, "GET, PUT, DELETE");
        } catch (PythonDataStore.NotFoundException exception) {
            sendJson(exchange, 404, errorJson(exception.getMessage()));
        } catch (IllegalArgumentException exception) {
            sendJson(exchange, 400, errorJson(exception.getMessage()));
        } catch (Exception exception) {
            exception.printStackTrace();
            sendJson(exchange, 500, errorJson("The request could not be completed: " + exception.getMessage()));
        }
    }

    private void regenerateAfterUiMutation(String collection, String action, int recordId) throws Exception {
        synchronized (compilationLock) {
            CompilationSnapshot currentSnapshot = snapshot;
            if (currentSnapshot == null) {
                throw new IllegalStateException("No successful full compilation is available. Fix the source and let the watcher complete a full compilation first.");
            }
            currentSnapshot.rerender(collection, liveContext(currentSnapshot));
        }
        events.broadcast("regenerated", eventData(action, collection + "=" + recordId));
    }

    /**
     * Current render context: the compiled snapshot values for every variable,
     * overlaid with the live data of all editable collections, so a template
     * that reads several collections is re-rendered with consistent data.
     */
    private Map<String, Object> liveContext(CompilationSnapshot currentSnapshot) throws IOException {
        Map<String, Object> context = currentSnapshot.getContext();
        for (Map.Entry<String, PythonDataStore> entry : stores.entrySet()) {
            context.put(entry.getKey(), entry.getValue().listAsMaps());
        }
        return context;
    }

    /** Finds the editable top-level collections in the compiled context. */
    private static List<String> discoverCollections(Map<String, Object> context) {
        List<String> collections = new ArrayList<>();
        for (Map.Entry<String, Object> entry : context.entrySet()) {
            if (isEditableCollection(entry.getValue())) {
                collections.add(entry.getKey());
            }
        }
        return collections;
    }

    private static boolean isEditableCollection(Object value) {
        if (!(value instanceof List<?> list) || list.isEmpty()) {
            return false;
        }
        for (Object element : list) {
            if (!(element instanceof Map<?, ?> map)) {
                return false;
            }
            if (!(map.get("id") instanceof Number)) {
                return false;
            }
        }
        return true;
    }

    private static String listJson(List<DataRecord> records) {
        List<String> encoded = new ArrayList<>();
        for (DataRecord record : records) {
            encoded.add(record.toJson());
        }
        return "[" + String.join(",", encoded) + "]";
    }

    private void handleEvents(HttpExchange exchange) throws IOException {
        if (!"GET".equals(exchange.getRequestMethod())) {
            sendMethodNotAllowed(exchange, "GET");
            return;
        }
        Headers headers = exchange.getResponseHeaders();
        headers.set("Content-Type", "text/event-stream; charset=utf-8");
        headers.set("Cache-Control", "no-cache, no-transform");
        headers.set("Connection", "keep-alive");
        exchange.sendResponseHeaders(200, 0);
        OutputStream output = exchange.getResponseBody();
        events.add(output);
        try {
            writeEvent(output, "connected", eventData("connected", ""));
            while (!Thread.currentThread().isInterrupted()) {
                Thread.sleep(60_000);
                writeEvent(output, "ping", "{}");
            }
        } catch (InterruptedException interrupted) {
            Thread.currentThread().interrupt();
        } catch (IOException ignored) {
            // Browser closed the page; the next broadcast also removes the stream.
        } finally {
            events.remove(output);
            output.close();
            exchange.close();
        }
    }

    private void handleGeneratedFile(HttpExchange exchange) throws IOException {
        if (!"GET".equals(exchange.getRequestMethod()) && !"HEAD".equals(exchange.getRequestMethod())) {
            sendMethodNotAllowed(exchange, "GET, HEAD");
            return;
        }
        String requestPath = exchange.getRequestURI().getPath();
        Path target = resolveGeneratedPath(requestPath);
        if (target == null || !Files.isRegularFile(target)) {
            sendText(exchange, 404, "text/plain; charset=utf-8", "Not found");
            return;
        }
        byte[] content = Files.readAllBytes(target);
        String contentType = contentType(target);
        exchange.getResponseHeaders().set("Content-Type", contentType);
        exchange.getResponseHeaders().set("Cache-Control", "no-store");
        if ("HEAD".equals(exchange.getRequestMethod())) {
            exchange.sendResponseHeaders(200, -1);
            exchange.close();
            return;
        }
        if (contentType.startsWith("text/html")) {
            String html = new String(content, StandardCharsets.UTF_8);
            if (html.contains("<head>") && !html.contains("<base ")) {
                html = html.replace("<head>", "<head><base href=\"/\">");
            }
            byte[] patched = html.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, patched.length);
            try (OutputStream body = exchange.getResponseBody()) {
                body.write(patched);
            }
            return;
        }
        exchange.sendResponseHeaders(200, content.length);
        try (OutputStream body = exchange.getResponseBody()) {
            body.write(content);
        }
    }

    private Path resolveGeneratedPath(String requestPath) {
        if (requestPath.startsWith("/static/")) {
            return safeResolve(projectDirectory, requestPath.substring(1));
        }
        String outputName;
        if ("/".equals(requestPath) || "/index.html".equals(requestPath)) {
            outputName = "index.html";
        } else if ("/add".equals(requestPath) || "/add_product.html".equals(requestPath)) {
            outputName = "add_product.html";
        } else if (requestPath.matches("/edit/\\d+") || "/edit_product.html".equals(requestPath)) {
            outputName = "edit_product.html";
        } else if (requestPath.matches("/product/\\d+") || "/detail.html".equals(requestPath)) {
            outputName = "detail.html";
        } else {
            outputName = requestPath.startsWith("/") ? requestPath.substring(1) : requestPath;
        }
        return safeResolve(outputDirectory, outputName);
    }

    private static Path safeResolve(Path root, String relativePath) {
        Path candidate = root.resolve(relativePath).normalize();
        return candidate.startsWith(root) ? candidate : null;
    }

    private static Map<String, String> readForm(HttpExchange exchange) throws IOException {
        String contentType = exchange.getRequestHeaders().getFirst("Content-Type");
        if (contentType == null || !contentType.startsWith("application/x-www-form-urlencoded")) {
            throw new IllegalArgumentException("Send form data with Content-Type application/x-www-form-urlencoded.");
        }
        byte[] body = exchange.getRequestBody().readNBytes(MAX_REQUEST_BODY_BYTES + 1);
        if (body.length > MAX_REQUEST_BODY_BYTES) {
            throw new IllegalArgumentException("Request body is too large.");
        }
        Map<String, String> values = new LinkedHashMap<>();
        String encoded = new String(body, StandardCharsets.UTF_8);
        if (encoded.isBlank()) {
            return values;
        }
        for (String pair : encoded.split("&")) {
            String[] pieces = pair.split("=", 2);
            String key = URLDecoder.decode(pieces[0], StandardCharsets.UTF_8);
            String value = pieces.length == 2 ? URLDecoder.decode(pieces[1], StandardCharsets.UTF_8) : "";
            values.put(key, value);
        }
        return values;
    }

    private static int parseId(String tail) {
        if (!tail.matches("/\\d+")) {
            throw new IllegalArgumentException("The id must be a positive integer.");
        }
        try {
            int id = Integer.parseInt(tail.substring(1));
            if (id < 1) {
                throw new NumberFormatException();
            }
            return id;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("The id must be a positive integer.");
        }
    }

    private static String errorJson(String message) {
        return "{\"error\":\"" + DataRecord.jsonEscape(message == null ? "Unknown error" : message) + "\"}";
    }

    private static String eventData(String reason, String detail) {
        return "{\"reason\":\"" + DataRecord.jsonEscape(reason) + "\",\"detail\":\"" +
                DataRecord.jsonEscape(detail == null ? "" : detail) + "\",\"at\":\"" + Instant.now() + "\"}";
    }

    private static void sendJson(HttpExchange exchange, int status, String json) throws IOException {
        sendText(exchange, status, "application/json; charset=utf-8", json);
    }

    private static void sendText(HttpExchange exchange, int status, String contentType, String text) throws IOException {
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", contentType);
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream body = exchange.getResponseBody()) {
            body.write(bytes);
        }
    }

    private static void sendEmpty(HttpExchange exchange, int status) throws IOException {
        exchange.sendResponseHeaders(status, -1);
        exchange.close();
    }

    private static void sendMethodNotAllowed(HttpExchange exchange, String allowed) throws IOException {
        exchange.getResponseHeaders().set("Allow", allowed);
        sendJson(exchange, 405, errorJson("Method not allowed."));
    }

    private static String contentType(Path target) {
        String fileName = target.getFileName().toString().toLowerCase();
        if (fileName.endsWith(".html")) return "text/html; charset=utf-8";
        if (fileName.endsWith(".css")) return "text/css; charset=utf-8";
        if (fileName.endsWith(".js")) return "application/javascript; charset=utf-8";
        if (fileName.endsWith(".json")) return "application/json; charset=utf-8";
        if (fileName.endsWith(".png")) return "image/png";
        if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg")) return "image/jpeg";
        if (fileName.endsWith(".svg")) return "image/svg+xml";
        return "application/octet-stream";
    }

    private static void writeEvent(OutputStream output, String event, String data) throws IOException {
        synchronized (output) {
            output.write(("event: " + event + "\n" + "data: " + data + "\n\n").getBytes(StandardCharsets.UTF_8));
            output.flush();
        }
    }

    @Override
    public void close() {
        events.close();
        server.stop(0);
    }

    private static final class SseHub {
        private final CopyOnWriteArrayList<OutputStream> clients = new CopyOnWriteArrayList<>();

        void add(OutputStream output) {
            clients.add(output);
        }

        void remove(OutputStream output) {
            clients.remove(output);
        }

        void broadcast(String event, String data) {
            for (OutputStream client : clients) {
                try {
                    writeEvent(client, event, data);
                } catch (IOException exception) {
                    clients.remove(client);
                    try {
                        client.close();
                    } catch (IOException ignored) {
                        // Nothing else to release.
                    }
                }
            }
        }

        void close() {
            for (OutputStream client : clients) {
                try {
                    client.close();
                } catch (IOException ignored) {
                    // Nothing else to release.
                }
            }
            clients.clear();
        }
    }
}
