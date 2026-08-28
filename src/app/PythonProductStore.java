package app;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Keeps app.py as the source of truth. Only the literal assigned to `products`
 * is replaced; all Flask routes and the rest of the Python file remain untouched.
 */
public final class PythonProductStore {
    private static final Pattern PRODUCTS_ASSIGNMENT = Pattern.compile("(?m)^products\\s*=\\s*\\[");
    private static final Pattern PRODUCT_LITERAL = Pattern.compile(
            "(?s)\\{\\s*\"id\"\\s*:\\s*(\\d+)\\s*,\\s*" +
                    "\"name\"\\s*:\\s*\"((?:\\\\.|[^\"])*)\"\\s*,\\s*" +
                    "\"price\"\\s*:\\s*([^,\\n]+)\\s*,\\s*" +
                    "\"description\"\\s*:\\s*\"((?:\\\\.|[^\"])*)\"\\s*,\\s*" +
                    "\"specification\"\\s*:\\s*\"((?:\\\\.|[^\"])*)\"\\s*,\\s*" +
                    "\"img\"\\s*:\\s*\"((?:\\\\.|[^\"])*)\"\\s*\\}"
    );

    private final Path pythonSource;
    private volatile long ignoreEventsUntilMillis = 0L;

    public PythonProductStore(Path pythonSource) {
        this.pythonSource = pythonSource.toAbsolutePath().normalize();
    }

    public synchronized List<Product> list() throws IOException {
        return parseProducts(Files.readString(pythonSource, StandardCharsets.UTF_8));
    }

    public synchronized Optional<Product> find(int id) throws IOException {
        return list().stream().filter(product -> product.id() == id).findFirst();
    }

    public synchronized Product create(Product productWithoutId) throws IOException {
        List<Product> products = new ArrayList<>(list());
        int nextId = products.stream().map(Product::id).max(Comparator.naturalOrder()).orElse(0) + 1;
        Product created = new Product(nextId, productWithoutId.name(), productWithoutId.price(),
                productWithoutId.description(), productWithoutId.specification(), productWithoutId.img());
        products.add(created);
        saveProducts(products);
        return created;
    }

    public synchronized Product update(int id, Product replacement) throws IOException {
        List<Product> products = new ArrayList<>(list());
        for (int index = 0; index < products.size(); index++) {
            if (products.get(index).id() == id) {
                Product updated = new Product(id, replacement.name(), replacement.price(),
                        replacement.description(), replacement.specification(), replacement.img());
                products.set(index, updated);
                saveProducts(products);
                return updated;
            }
        }
        throw new ProductNotFoundException(id);
    }

    public synchronized void delete(int id) throws IOException {
        List<Product> products = new ArrayList<>(list());
        boolean removed = products.removeIf(product -> product.id() == id);
        if (!removed) {
            throw new ProductNotFoundException(id);
        }
        saveProducts(products);
    }

    public boolean shouldIgnoreSourceEvent(Path changedPath) {
        return pythonSource.equals(changedPath.toAbsolutePath().normalize())
                && System.currentTimeMillis() < ignoreEventsUntilMillis;
    }

    private void saveProducts(List<Product> products) throws IOException {
        String source = Files.readString(pythonSource, StandardCharsets.UTF_8);
        int openingBracket = findProductsOpeningBracket(source);
        int closingBracket = findMatchingBracket(source, openingBracket);
        String renderedList = renderProductsList(products);
        String rewritten = source.substring(0, openingBracket) + renderedList + source.substring(closingBracket + 1);

        Path temporary = Files.createTempFile(pythonSource.getParent(), "app.py.", ".tmp");
        try {
            Files.writeString(temporary, rewritten, StandardCharsets.UTF_8);
            // Set this before the atomic move because WatchService may publish the event immediately.
            ignoreEventsUntilMillis = System.currentTimeMillis() + Duration.ofSeconds(2).toMillis();
            try {
                Files.move(temporary, pythonSource, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException ignored) {
                Files.move(temporary, pythonSource, StandardCopyOption.REPLACE_EXISTING);
            }
        } finally {
            Files.deleteIfExists(temporary);
        }
    }

    private static List<Product> parseProducts(String source) throws IOException {
        int openingBracket = findProductsOpeningBracket(source);
        int closingBracket = findMatchingBracket(source, openingBracket);
        String listBody = source.substring(openingBracket + 1, closingBracket);
        Matcher matcher = PRODUCT_LITERAL.matcher(listBody);
        List<Product> products = new ArrayList<>();
        while (matcher.find()) {
            products.add(new Product(
                    Integer.parseInt(matcher.group(1)),
                    pythonUnescape(matcher.group(2)),
                    matcher.group(3).trim().replace("\"", ""),
                    pythonUnescape(matcher.group(4)),
                    pythonUnescape(matcher.group(5)),
                    pythonUnescape(matcher.group(6))
            ));
        }
        if (!listBody.trim().isEmpty() && products.isEmpty()) {
            throw new IOException("Could not parse the literal 'products' list in app.py. Keep each product as a dictionary with id, name, price, description, specification and img.");
        }
        return List.copyOf(products);
    }

    private static int findProductsOpeningBracket(String source) throws IOException {
        Matcher matcher = PRODUCTS_ASSIGNMENT.matcher(source);
        if (!matcher.find()) {
            throw new IOException("No top-level 'products = [...]' declaration was found in app.py.");
        }
        return source.indexOf('[', matcher.start());
    }

    private static int findMatchingBracket(String source, int openingBracket) throws IOException {
        int depth = 0;
        boolean inString = false;
        boolean escaping = false;
        char quote = 0;
        for (int index = openingBracket; index < source.length(); index++) {
            char current = source.charAt(index);
            if (inString) {
                if (escaping) {
                    escaping = false;
                } else if (current == '\\') {
                    escaping = true;
                } else if (current == quote) {
                    inString = false;
                }
                continue;
            }
            if (current == '\'' || current == '\"') {
                inString = true;
                quote = current;
            } else if (current == '[') {
                depth++;
            } else if (current == ']' && --depth == 0) {
                return index;
            }
        }
        throw new IOException("The 'products' list in app.py has no matching closing bracket.");
    }

    private static String renderProductsList(List<Product> products) {
        if (products.isEmpty()) {
            return "[]";
        }
        StringBuilder out = new StringBuilder("[\n");
        for (int index = 0; index < products.size(); index++) {
            out.append(products.get(index).toPythonLiteral());
            if (index < products.size() - 1) {
                out.append(',');
            }
            out.append('\n');
        }
        return out.append(']').toString();
    }

    private static String pythonUnescape(String value) {
        StringBuilder out = new StringBuilder();
        boolean escaping = false;
        for (int index = 0; index < value.length(); index++) {
            char current = value.charAt(index);
            if (escaping) {
                switch (current) {
                    case 'n' -> out.append('\n');
                    case 'r' -> out.append('\r');
                    case 't' -> out.append('\t');
                    default -> out.append(current);
                }
                escaping = false;
            } else if (current == '\\') {
                escaping = true;
            } else {
                out.append(current);
            }
        }
        if (escaping) {
            out.append('\\');
        }
        return out.toString();
    }

    public static final class ProductNotFoundException extends RuntimeException {
        public ProductNotFoundException(int id) {
            super("Product " + id + " was not found.");
        }
    }
}
