package app;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A generic row of a top-level collection literal in app.py
 * (e.g. {@code products}, {@code posts}, {@code books}). Every record has a
 * numeric {@code "id"} key used by the CRUD API and the web UI.
 *
 * <p>The {@code fields} map preserves the field order that appeared in the
 * literal and keeps the typed values (Integer/BigDecimal/Boolean/String) so the
 * same data can be written back to app.py and served as JSON without losing
 * its type.</p>
 */
public record DataRecord(int id, Map<String, Object> fields) {

    public DataRecord {
        fields = new LinkedHashMap<>(fields);
    }

    /** JSON object form of this record, preserving numeric and boolean types. */
    public String toJson() {
        StringBuilder json = new StringBuilder("{");
        boolean first = true;
        for (Map.Entry<String, Object> entry : fields.entrySet()) {
            if (!first) {
                json.append(',');
            }
            first = false;
            json.append('"').append(jsonEscape(entry.getKey())).append("\":");
            json.append(jsonValue(entry.getValue()));
        }
        return json.append('}').toString();
    }

    private static String jsonValue(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof Boolean booleanValue) {
            return booleanValue ? "true" : "false";
        }
        if (value instanceof Number number) {
            if (number instanceof BigDecimal decimal) {
                return decimal.toPlainString();
            }
            return number.toString();
        }
        return "\"" + jsonEscape(String.valueOf(value)) + "\"";
    }

    static String jsonEscape(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    static String pythonEscape(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
