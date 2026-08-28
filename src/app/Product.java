package app;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;

/**
 * Immutable product model used by the Java HTTP runtime and the Python source synchronizer.
 */
public record Product(
        int id,
        String name,
        String price,
        String description,
        String specification,
        String img
) {
    public Product {
        if (id < 1) {
            throw new IllegalArgumentException("Product id must be positive.");
        }
        name = required(name, "name");
        price = normalisePrice(required(price, "price"));
        description = required(description, "description");
        specification = required(specification, "specification");
        img = blankToDefault(img);
    }

    public static Product fromForm(int id, Map<String, String> form) {
        return new Product(
                id,
                form.get("name"),
                form.get("price"),
                form.get("description"),
                form.get("specification"),
                form.get("img")
        );
    }

    public String toJson() {
        return "{" +
                "\"id\":" + id + "," +
                "\"name\":\"" + jsonEscape(name) + "\"," +
                "\"price\":\"" + jsonEscape(price) + "\"," +
                "\"description\":\"" + jsonEscape(description) + "\"," +
                "\"specification\":\"" + jsonEscape(specification) + "\"," +
                "\"img\":\"" + jsonEscape(img) + "\"" +
                "}";
    }

    public String toPythonLiteral() {
        return "    {\n" +
                "        \"id\": " + id + ",\n" +
                "        \"name\": \"" + pythonEscape(name) + "\",\n" +
                "        \"price\": " + price + ",\n" +
                "        \"description\": \"" + pythonEscape(description) + "\",\n" +
                "        \"specification\": \"" + pythonEscape(specification) + "\",\n" +
                "        \"img\": \"" + pythonEscape(img) + "\"\n" +
                "    }";
    }

    private static String required(String value, String field) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("The field '" + field + "' is required.");
        }
        return value.trim();
    }

    private static String blankToDefault(String value) {
        if (value == null || value.trim().isEmpty()) {
            return "static/images/default.png";
        }
        return value.trim();
    }

    private static String normalisePrice(String rawPrice) {
        try {
            BigDecimal value = new BigDecimal(rawPrice);
            if (value.signum() < 0) {
                throw new NumberFormatException("negative price");
            }
            return value.stripTrailingZeros().toPlainString();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("The field 'price' must be a non-negative number.");
        }
    }

    static String jsonEscape(String value) {
        return value.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    private static String pythonEscape(String value) {
        return value.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
