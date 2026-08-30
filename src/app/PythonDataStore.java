package app;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Keeps app.py as the source of truth for any top-level collection literal
 * (for example {@code products}, {@code posts} or {@code books}). Only the
 * literal assigned to {@code collectionName} is replaced; all Flask routes and
 * the rest of the Python file remain untouched.
 *
 * <p>The dictionary schema (field order and value types) is read from the
 * literal itself, so no field set is hard-coded. The {@code "id"} field is the
 * numeric key used for updates and deletes.</p>
 */
public final class PythonDataStore {

    /** Kind of a value in the collection literal. */
    private enum FieldKind { STRING, NUMBER, BOOLEAN, RAW }

    private record Schema(List<String> order, Map<String, FieldKind> kinds) {
    }

    private record Parsed(List<DataRecord> records, Schema schema) {
    }

    private record Key(String name, int nextIndex) {
    }

    private record Value(Object typedValue, FieldKind kind, String rawText, int nextIndex) {
    }

    private final Path pythonSource;
    private final String collectionName;
    private final Pattern assignmentPattern;
    private volatile long ignoreEventsUntilMillis = 0L;

    private static final Pattern PYTHON_INTEGER = Pattern.compile(
            "-?\\d+([eE][+-]?\\d+)?");
    private static final Pattern PYTHON_NUMBER = Pattern.compile(
            "-?(\\d+\\.\\d*|\\.\\d+|\\d+)([eE][+-]?\\d+)?");

    public PythonDataStore(Path pythonSource, String collectionName) {
        this.pythonSource = pythonSource.toAbsolutePath().normalize();
        this.collectionName = collectionName;
        this.assignmentPattern = Pattern.compile(
                "(?m)^" + Pattern.quote(collectionName) + "\\s*=\\s*\\[");
    }

    public String collectionName() {
        return collectionName;
    }

    public synchronized List<DataRecord> list() throws IOException {
        return parseSource().records();
    }

    /** Records rendered as plain maps (including the {@code "id"} key) for the Jinja renderer. */
    public synchronized List<Map<String, Object>> listAsMaps() throws IOException {
        List<Map<String, Object>> maps = new ArrayList<>();
        for (DataRecord record : parseSource().records()) {
            maps.add(record.fields());
        }
        return maps;
    }

    public synchronized Optional<DataRecord> find(int id) throws IOException {
        for (DataRecord record : parseSource().records()) {
            if (record.id() == id) {
                return Optional.of(record);
            }
        }
        return Optional.empty();
    }

    public synchronized DataRecord create(Map<String, String> form) throws IOException {
        Parsed parsed = parseSource();
        List<DataRecord> records = new ArrayList<>(parsed.records());
        int nextId = records.stream().map(DataRecord::id)
                .max(Comparator.naturalOrder()).orElse(0) + 1;
        Map<String, Object> values = coerceFields(parsed.schema(), nextId, form);
        DataRecord created = new DataRecord(nextId, values);
        records.add(created);
        save(parsed, records);
        return created;
    }

    public synchronized DataRecord update(int id, Map<String, String> form) throws IOException {
        Parsed parsed = parseSource();
        List<DataRecord> records = new ArrayList<>(parsed.records());
        int index = -1;
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).id() == id) {
                index = i;
                break;
            }
        }
        if (index < 0) {
            throw new NotFoundException(collectionName, id);
        }
        Map<String, Object> values = coerceFields(parsed.schema(), id, form);
        records.set(index, new DataRecord(id, values));
        save(parsed, records);
        return new DataRecord(id, values);
    }

    public synchronized void delete(int id) throws IOException {
        Parsed parsed = parseSource();
        List<DataRecord> records = new ArrayList<>(parsed.records());
        boolean removed = records.removeIf(record -> record.id() == id);
        if (!removed) {
            throw new NotFoundException(collectionName, id);
        }
        save(parsed, records);
    }

    public boolean shouldIgnoreSourceEvent(Path changedPath) {
        return pythonSource.equals(changedPath.toAbsolutePath().normalize())
                && System.currentTimeMillis() < ignoreEventsUntilMillis;
    }

    private Map<String, Object> coerceFields(Schema schema, int id, Map<String, String> form) {
        Map<String, Object> values = new LinkedHashMap<>();
        values.put("id", id);
        for (String field : schema.order()) {
            if ("id".equals(field)) {
                continue;
            }
            FieldKind kind = schema.kinds().getOrDefault(field, FieldKind.STRING);
            String raw = form.get(field);
            Object coerced = coerce(kind, field, raw);
            if (coerced != null) {
                values.put(field, coerced);
            }
        }
        return values;
    }

    private Object coerce(FieldKind kind, String field, String raw) {
        switch (kind) {
            case NUMBER:
                if (raw == null || raw.trim().isEmpty()) {
                    throw new IllegalArgumentException("The field '" + field + "' must be a number.");
                }
                try {
                    BigDecimal value = new BigDecimal(raw.trim());
                    return normalizeNumber(value);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("The field '" + field + "' must be a number.");
                }
            case BOOLEAN:
                if (raw == null) {
                    return Boolean.FALSE;
                }
                String lower = raw.trim().toLowerCase(Locale.ROOT);
                return "true".equals(lower) || "1".equals(lower)
                        || "on".equals(lower) || "yes".equals(lower);
            case STRING:
            case RAW:
            default:
                return raw == null ? "" : raw;
        }
    }

    private void save(Parsed parsed, List<DataRecord> records) throws IOException {
        String source = Files.readString(pythonSource, StandardCharsets.UTF_8);
        int openingBracket = findOpeningBracket(source);
        int closingBracket = findMatchingBracket(source, openingBracket);
        String renderedList = renderList(parsed.schema(), records);
        String rewritten = source.substring(0, openingBracket)
                + renderedList
                + source.substring(closingBracket + 1);

        Path temporary = Files.createTempFile(pythonSource.getParent(), collectionName + ".", ".tmp");
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

    // ------------------------------------------------------------------
    // Reading: locate the literal and turn it into typed DataRecords.
    // ------------------------------------------------------------------

    private Parsed parseSource() throws IOException {
        String source = Files.readString(pythonSource, StandardCharsets.UTF_8);
        int openingBracket = findOpeningBracket(source);
        int closingBracket = findMatchingBracket(source, openingBracket);
        String body = source.substring(openingBracket + 1, closingBracket);
        return parseBody(body);
    }

    private Parsed parseBody(String body) throws IOException {
        List<DataRecord> records = new ArrayList<>();
        Map<String, FieldKind> kinds = new LinkedHashMap<>();
        List<String> order = new ArrayList<>();
        int index = 0;
        while (true) {
            while (index < body.length() && Character.isWhitespace(body.charAt(index))) {
                index++;
            }
            if (index >= body.length()) {
                break;
            }
            char current = body.charAt(index);
            if (current == ',') {
                index++;
                continue;
            }
            if (current != '{') {
                throw new IOException("Unexpected content in the '" + collectionName
                        + "' literal in app.py: ensure each entry is a dict literal.");
            }
            ParsedDict parsedDict = parseDict(body, index);
            index = parsedDict.nextIndex();
            if (parsedDict.id() == null) {
                throw new IOException("Each item in '" + collectionName
                        + "' in app.py must contain a numeric \"id\" key.");
            }
            records.add(new DataRecord(parsedDict.id(), parsedDict.values()));
            if (order.isEmpty()) {
                order.addAll(parsedDict.values().keySet());
            } else {
                for (String key : parsedDict.values().keySet()) {
                    if (!order.contains(key)) {
                        order.add(key);
                    }
                }
            }
            for (Map.Entry<String, Object> entry : parsedDict.values().entrySet()) {
                kinds.merge(entry.getKey(), kindOfValue(entry.getValue()), PythonDataStore::mostSpecificKind);
            }
        }
        if (!body.isBlank() && records.isEmpty()) {
            throw new IOException("Could not parse the '" + collectionName
                    + "' list in app.py. Ensure each entry is a dict literal.");
        }
        return new Parsed(List.copyOf(records), new Schema(List.copyOf(order), Map.copyOf(kinds)));
    }

    private record ParsedDict(Integer id, Map<String, Object> values, int nextIndex) {
    }

    private ParsedDict parseDict(String body, int startIndex) throws IOException {
        int index = startIndex + 1; // skip the opening '{'
        Integer id = null;
        Map<String, Object> values = new LinkedHashMap<>();
        while (true) {
            while (index < body.length()
                    && (Character.isWhitespace(body.charAt(index)) || body.charAt(index) == ',')) {
                index++;
            }
            if (index >= body.length()) {
                throw new IOException("Unterminated dict literal in '" + collectionName + "'.");
            }
            if (body.charAt(index) == '}') {
                index++;
                break;
            }
            Key key = readKey(body, index);
            index = key.nextIndex();
            while (index < body.length() && Character.isWhitespace(body.charAt(index))) {
                index++;
            }
            if (index >= body.length() || body.charAt(index) != ':') {
                throw new IOException("Expected ':' after key '" + key.name() + "' in '" + collectionName + "'.");
            }
            index++;
            while (index < body.length() && Character.isWhitespace(body.charAt(index))) {
                index++;
            }
            Value value = readValue(body, index);
            index = value.nextIndex();
            values.put(key.name(), value.typedValue());
            if ("id".equals(key.name())) {
                id = parseIdValue(value, key.name());
            }
        }
        return new ParsedDict(id, values, index);
    }

    private Key readKey(String body, int index) throws IOException {
        char current = body.charAt(index);
        if (current == '"' || current == '\'') {
            Value quoted = readQuoted(body, index);
            return new Key(pythonUnescape(quoted.rawText()), quoted.nextIndex());
        }
        int cursor = index;
        while (cursor < body.length()
                && (Character.isLetterOrDigit(body.charAt(cursor)) || body.charAt(cursor) == '_')) {
            cursor++;
        }
        if (cursor == index) {
            throw new IOException("Invalid key in '" + collectionName + "' literal at index " + index + ".");
        }
        return new Key(body.substring(index, cursor), cursor);
    }

    private Value readValue(String body, int index) throws IOException {
        char current = body.charAt(index);
        if (current == '"' || current == '\'') {
            return readQuoted(body, index);
        }
        int cursor = index;
        int depth = 0;
        StringBuilder raw = new StringBuilder();
        while (cursor < body.length()) {
            char ch = body.charAt(cursor);
            if (ch == '"' || ch == '\'') {
                raw.append(ch);
                cursor++;
                while (cursor < body.length()) {
                    char inner = body.charAt(cursor);
                    raw.append(inner);
                    if (inner == '\\') {
                        if (cursor + 1 < body.length()) {
                            cursor++;
                            raw.append(body.charAt(cursor));
                        }
                    } else if (inner == ch) {
                        cursor++;
                        break;
                    }
                    cursor++;
                }
                continue;
            }
            if (ch == '[' || ch == '{' || ch == '(') {
                depth++;
            } else if (ch == ']' || ch == '}') {
                if (depth == 0) {
                    break;
                }
                depth--;
            } else if (ch == ')' ) {
                if (depth == 0) {
                    break;
                }
                depth--;
            } else if ((ch == ',' || ch == '}') && depth == 0) {
                break;
            }
            raw.append(ch);
            cursor++;
        }
        String text = raw.toString().trim();
        return classifyRaw(text, cursor);
    }

    private Value classifyRaw(String text, int nextIndex) throws IOException {
        if (!text.isEmpty() && (text.startsWith("\"") || text.startsWith("'"))) {
            throw new IOException("Unexpected quoted value while parsing '" + collectionName + "'.");
        }
        if ("True".equals(text)) {
            return new Value(Boolean.TRUE, FieldKind.BOOLEAN, text, nextIndex);
        }
        if ("False".equals(text)) {
            return new Value(Boolean.FALSE, FieldKind.BOOLEAN, text, nextIndex);
        }
        if (PYTHON_NUMBER.matcher(text).matches()) {
            try {
                BigDecimal number = new BigDecimal(text);
                return new Value(normalizeNumber(number), FieldKind.NUMBER, text, nextIndex);
            } catch (NumberFormatException ignored) {
                // Fall through and treat as a raw expression.
            }
        }
        return new Value(text, FieldKind.RAW, text, nextIndex);
    }

    /** Reads a quoted token; {@code rawText} keeps escapes, excluding the surrounding quotes. */
    private Value readQuoted(String body, int index) throws IOException {
        char quote = body.charAt(index);
        if (index >= body.length()) {
            throw new IOException("Unterminated string in '" + collectionName + "' literal.");
        }
        int cursor = index + 1;
        StringBuilder inner = new StringBuilder();
        boolean escaping = false;
        while (cursor < body.length()) {
            char current = body.charAt(cursor);
            if (escaping) {
                inner.append(current);
                escaping = false;
            } else if (current == '\\') {
                escaping = true;
            } else if (current == quote) {
                cursor++;
                return new Value(pythonUnescape(inner.toString()), FieldKind.STRING, inner.toString(), cursor);
            } else {
                inner.append(current);
            }
            cursor++;
        }
        throw new IOException("Unterminated string literal in '" + collectionName + "'.");
    }

    private int parseIdValue(Value value, String field) throws IOException {
        if (value.kind() == FieldKind.NUMBER && value.typedValue() instanceof BigDecimal decimal) {
            try {
                return decimal.intValueExact();
            } catch (ArithmeticException ignored) {
                throw new IOException("The \"id\" values in '" + collectionName + "' must be integers.");
            }
        }
        String text = value.rawText() == null ? "" : value.rawText().trim();
        if (!PYTHON_INTEGER.matcher(text).matches()) {
            throw new IOException("The \"id\" values in '" + collectionName + "' must be integers.");
        }
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new IOException("The \"id\" values in '" + collectionName + "' must be integers.");
        }
    }

    /** Whole numbers become {@code Long} (clean JSON/rendered output); anything else keeps full precision. */
    private static Object normalizeNumber(BigDecimal number) {
        BigDecimal stripped = number.stripTrailingZeros();
        if (stripped.scale() <= 0 && stripped.precision() - stripped.scale() <= 18) {
            try {
                return stripped.longValueExact();
            } catch (ArithmeticException ignored) {
                // Too large for a long; keep full precision.
            }
        }
        return stripped;
    }

    private static FieldKind kindOfValue(Object value) {
        if (value instanceof BigDecimal) {
            return FieldKind.NUMBER;
        }
        if (value instanceof Boolean) {
            return FieldKind.BOOLEAN;
        }
        if (value instanceof Number) {
            return FieldKind.NUMBER;
        }
        // RAW values that are not reached here because they are stored as raw strings.
        return FieldKind.STRING;
    }

    private static FieldKind mostSpecificKind(FieldKind existing, FieldKind candidate) {
        // Number/boolean/string precedence is decided on the first occurrence;
        // a field is NUMBER/BOOLEAN only when all rows agree.
        if (existing == candidate) {
            return existing;
        }
        if (existing == FieldKind.RAW) {
            return candidate;
        }
        if (candidate == FieldKind.RAW) {
            return existing;
        }
        return FieldKind.STRING;
    }

    // ------------------------------------------------------------------
    // Writing: render the collection back to a Python literal.
    // ------------------------------------------------------------------

    private static String renderList(Schema schema, List<DataRecord> records) {
        if (records.isEmpty()) {
            return "[]";
        }
        StringBuilder out = new StringBuilder("[\n");
        for (int index = 0; index < records.size(); index++) {
            out.append(renderRecord(schema, records.get(index)));
            if (index < records.size() - 1) {
                out.append(',');
            }
            out.append('\n');
        }
        return out.append(']').toString();
    }

    private static String renderRecord(Schema schema, DataRecord record) {
        Map<String, Object> fields = record.fields();
        StringBuilder out = new StringBuilder("    {\n");
        List<String> fieldLines = new ArrayList<>();
        for (String field : schema.order()) {
            Object value = fields.get(field);
            if (value == null) {
                continue;
            }
            FieldKind kind = schema.kinds().getOrDefault(field, FieldKind.STRING);
            String renderedValue = renderValue(kind, value);
            fieldLines.add("        \"" + DataRecord.pythonEscape(field) + "\": " + renderedValue);
        }
        if (fieldLines.isEmpty()) {
            return "    { }";
        }
        for (int index = 0; index < fieldLines.size(); index++) {
            out.append(fieldLines.get(index));
            if (index < fieldLines.size() - 1) {
                out.append(',');
            }
            out.append('\n');
        }
        return out.append("    }").toString();
    }

    private static String renderValue(FieldKind kind, Object value) {
        if (value == null) {
            return "";
        }
        switch (kind) {
            case NUMBER:
                if (value instanceof BigDecimal decimal) {
                    return decimal.stripTrailingZeros().toPlainString();
                }
                return String.valueOf(value);
            case BOOLEAN:
                return Boolean.TRUE.equals(value) ? "True" : "False";
            case RAW:
                return String.valueOf(value);
            case STRING:
            default:
                return "\"" + DataRecord.pythonEscape(String.valueOf(value)) + "\"";
        }
    }

    // ------------------------------------------------------------------
    // Locating and boundary scanning of the collection literal.
    // ------------------------------------------------------------------

    private int findOpeningBracket(String source) throws IOException {
        Matcher matcher = assignmentPattern.matcher(source);
        if (!matcher.find()) {
            throw new IOException("No top-level '" + collectionName
                    + " = [...]' declaration was found in app.py.");
        }
        int bracket = source.indexOf('[', matcher.start());
        if (bracket < 0) {
            throw new IOException("The '" + collectionName + "' declaration in app.py has no '['.");
        }
        return bracket;
    }

    private int findMatchingBracket(String source, int openingBracket) throws IOException {
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
            if (current == '\'' || current == '"') {
                inString = true;
                quote = current;
            } else if (current == '[') {
                depth++;
            } else if (current == ']' && --depth == 0) {
                return index;
            }
        }
        throw new IOException("The '" + collectionName + "' list in app.py has no matching closing bracket.");
    }

    // ------------------------------------------------------------------
    // Escaping helpers shared with earlier parser versions.
    // ------------------------------------------------------------------

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

    public static final class NotFoundException extends RuntimeException {
        public NotFoundException(String collection, int id) {
            super(collection + " " + id + " was not found.");
        }
    }
}
