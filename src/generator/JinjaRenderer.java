package generator;

import ast.HtmlContent;
import ast.htmlContentItem.HtmlContentItem;
import ast.htmlContentItem.HtmlTextItem;
import ast.htmlElement.TagElement;
import ast.jinja.JinjaArgumentsList;
import ast.jinja.jinjaArg.*;
import ast.jinja.jinjaCallExpr.*;
import ast.jinja.jinjaExpression.*;
import ast.jinja.jinjaStatment.*;
import ast.tagContent.TagElementItem;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JinjaRenderer {
    private Map<String, Object> context;
    private Map<String, HtmlContent> templateMap;
    private Map<String, String> routeMap;

    public JinjaRenderer(Map<String, Object> context, Map<String, HtmlContent> templateMap,
                         Map<String, String> routeMap) {
        this.context = new HashMap<>(context);
        this.templateMap = templateMap;
        this.routeMap = routeMap;
    }

    public String render(HtmlContent content) {
        if (content == null || content.getItems() == null) return "";
        List<HtmlContentItem> items = content.getItems();
        if (!items.isEmpty() && items.get(0) instanceof JinjaExtendStatement) {
            return renderExtended(items);
        }
        return renderItems(items);
    }

    private String renderExtended(List<HtmlContentItem> items) {
        JinjaExtendStatement extendStmt = (JinjaExtendStatement) items.get(0);
        String parentName = extendStmt.getExtended();
        parentName = parentName.replaceAll("^['\"]|['\"]$", "");

        Map<String, HtmlContent> childBlocks = new LinkedHashMap<>();
        for (HtmlContentItem item : items) {
            if (item instanceof JinjaBlockStatement block) {
                childBlocks.put(block.getBlockName(), block.getHtmlContent());
            }
        }

        HtmlContent parentContent = templateMap.get(parentName);
        if (parentContent == null) {
            return "<!-- Template not found: " + parentName + " -->";
        }

        return renderWithBlocks(parentContent, childBlocks);
    }

    private String renderWithBlocks(HtmlContent parent, Map<String, HtmlContent> childBlocks) {
        if (parent == null || parent.getItems() == null) return "";
        StringBuilder sb = new StringBuilder();
        for (HtmlContentItem item : parent.getItems()) {
            if (item instanceof JinjaBlockStatement block) {
                HtmlContent override = childBlocks.get(block.getBlockName());
                if (override != null) {
                    sb.append(renderItems(override.getItems()));
                } else {
                    sb.append(renderItems(block.getHtmlContent() != null
                            ? block.getHtmlContent().getItems() : null));
                }
            } else if (item instanceof JinjaExtendStatement) {
                String parentName = ((JinjaExtendStatement) item).getExtended();
                parentName = parentName.replaceAll("^['\"]|['\"]$", "");
                HtmlContent grandParent = templateMap.get(parentName);
                if (grandParent != null) {
                    sb.append(renderWithBlocks(grandParent, childBlocks));
                }
            } else {
                sb.append(renderItem(item));
            }
        }
        return sb.toString();
    }

    private String renderItems(List<HtmlContentItem> items) {
        if (items == null) return "";
        StringBuilder sb = new StringBuilder();
        for (HtmlContentItem item : items) {
            sb.append(renderItem(item));
        }
        return sb.toString();
    }

    private String renderItem(HtmlContentItem item) {
        if (item == null) return "";
        if (item instanceof HtmlTextItem text) {
            return text.getText() != null ? text.getText() : "";
        }
        if (item instanceof JinjaSimpleExpression expr) {
            return evaluateExpression(expr);
        }
        if (item instanceof JinjaBinaryExpression expr) {
            return evaluateBinaryExpression(expr);
        }
        if (item instanceof JinjaForStatement forStmt) {
            return evaluateForStatement(forStmt);
        }
        if (item instanceof JinjaIfStatement ifStmt) {
            return evaluateIfStatement(ifStmt);
        }
        if (item instanceof JinjaExtendStatement) {
            return "";
        }
        if (item instanceof JinjaBlockStatement block) {
            return renderItems(block.getHtmlContent() != null
                    ? block.getHtmlContent().getItems() : null);
        }
        if (item instanceof TagElement tag) {
            return renderTagElement(tag);
        }
        return item.generateCode();
    }

    private String evaluateExpression(JinjaSimpleExpression expr) {
        if (expr.getExpr() == null) return "";
        return evaluateCallExpression(expr.getExpr());
    }

    private String evaluateBinaryExpression(JinjaBinaryExpression expr) {
        String leftVal = expr.getLeft() != null ? evaluateCallExpression(expr.getLeft()) : "";
        String rightVal = expr.getRight() != null ? evaluateCallExpression(expr.getRight()) : "";
        String op = expr.getOperator();
        if (op == null) return leftVal + rightVal;
        switch (op) {
            case "==": return leftVal.equals(rightVal) ? "true" : "";
            case "!=": return !leftVal.equals(rightVal) ? "true" : "";
            default: return leftVal + " " + op + " " + rightVal;
        }
    }

    private String evaluateCallExpression(JinjaCallExpression callExpr) {
        if (callExpr instanceof JinjaVariableAccess varAccess) {
            return evaluateVariableAccess(varAccess);
        }
        if (callExpr instanceof JinjaFunctionCall funcCall) {
            return evaluateFunctionCall(funcCall);
        }
        if (callExpr instanceof JinjaFilteredExpression filtered) {
            return evaluateFilteredExpression(filtered);
        }
        if (callExpr instanceof JinjaAtom atom) {
            return evaluateJinjaAtom(atom);
        }
        return callExpr.generateCode();
    }

    private String evaluateVariableAccess(JinjaVariableAccess varAccess) {
        String dottedName = varAccess.getDottedName();
        if (dottedName == null || dottedName.isEmpty()) return "";
        String[] parts = dottedName.split("\\.");
        Object current = context.get(parts[0]);
        if (current == null) return "";
        for (int i = 1; i < parts.length; i++) {
            if (current instanceof Map map) {
                current = map.get(parts[i]);
            } else if (current instanceof List list && "length".equals(parts[i])) {
                return String.valueOf(list.size());
            } else {
                return "";
            }
            if (current == null) return "";
        }
        return String.valueOf(current);
    }

    @SuppressWarnings("unchecked")
    private String evaluateFunctionCall(JinjaFunctionCall funcCall) {
        String name = funcCall.getFunctionName();
        if ("url_for".equals(name)) {
            return evaluateUrlFor(funcCall);
        }
        return funcCall.generateCode();
    }

    private String evaluateUrlFor(JinjaFunctionCall funcCall) {
        JinjaArgumentsList args = funcCall.getArgumentsList();
        if (args == null || args.getArguments() == null || args.getArguments().isEmpty()) {
            return "#";
        }
        JinjaArgument firstArg = args.getArguments().get(0);
        String endpoint = extractJinjaArgValue(firstArg);
        if (endpoint == null) return "#";

        // Mapping endpoints to static HTML files to avoid 404 in static generation
        switch (endpoint) {
            case "index": return "index.html";
            case "add_product": return "add_product.html";
            case "detail": return "detail.html";
            case "delete": return "#"; // Delete action is not supported in static sites
        }

        if (routeMap.containsKey(endpoint)) {
            String route = routeMap.get(endpoint);
            if (route.equals("/")) return "index.html";

            // For static sites, we convert the route to a relative .html file
            // e.g., /add -> add.html
            String staticName = route;
            if (staticName.startsWith("/")) {
                staticName = staticName.substring(1);
            }
            if (staticName.contains("<")) {
                staticName = staticName.split("/")[0]; // Use the first part of dynamic routes
            }
            if (staticName.isEmpty()) return "index.html";
            return staticName + ".html";
        }

        if ("static".equals(endpoint)) {
            if (args.getArguments().size() > 1) {
                JinjaArgument kwArg = args.getArguments().get(1);
                if (kwArg instanceof JinjaKeywordArgument kw) {
                    String val = extractJinjaArgValue(kw);
                    return val != null ? val : "";
                }
            }
            return "";
        }

        return "/" + endpoint;
    }

    @SuppressWarnings("unchecked")
    private String evaluateFilteredExpression(JinjaFilteredExpression filtered) {
        JinjaVariableAccess varAccess = filtered.getJinjaVariableAccess();
        String filterName = filtered.getFilterName();
        if (varAccess == null) return "";
        if (filterName == null) {
            return evaluateVariableAccess(varAccess);
        }
        String value = evaluateVariableAccess(varAccess);
        if ("length".equals(filterName)) {
            Object resolved = resolveVariable(varAccess.getDottedName());
            if (resolved instanceof List list) {
                return String.valueOf(list.size());
            }
            if (resolved instanceof Map map) {
                return String.valueOf(map.size());
            }
            if (resolved instanceof String s) {
                return String.valueOf(s.length());
            }
            return String.valueOf(value.length());
        }
        return value;
    }

    private String evaluateJinjaAtom(JinjaAtom atom) {
        if (atom.getAtom() == null || atom.getAtom().getValue() == null) return "";
        return String.valueOf(atom.getAtom().getValue());
    }

    private Object resolveVariable(String dottedName) {
        if (dottedName == null || dottedName.isEmpty()) return null;
        String[] parts = dottedName.split("\\.");
        Object current = context.get(parts[0]);
        for (int i = 1; i < parts.length && current != null; i++) {
            if (current instanceof Map map) {
                current = map.get(parts[i]);
            } else {
                return null;
            }
        }
        return current;
    }

    private String evaluateForStatement(JinjaForStatement forStmt) {
        String varName = forStmt.getIterable() != null
                ? extractVarNameForIterable(forStmt.getIterable()) : "";
        if (varName.isEmpty()) return "";
        Object iterObj = context.get(varName);
        if (iterObj == null) {
            iterObj = resolveVariable(varName);
        }
        if (!(iterObj instanceof List iterable)) return "";
        String loopVar = forStmt.getId();
        StringBuilder sb = new StringBuilder();
        for (Object item : iterable) {
            context.put(loopVar, item);
            sb.append(renderItems(forStmt.getHtmlContent() != null
                    ? forStmt.getHtmlContent().getItems() : null));
        }
        context.remove(loopVar);
        return sb.toString();
    }

    private String evaluateIfStatement(JinjaIfStatement ifStmt) {
        boolean condition = evaluateCondition(ifStmt.getCondition());
        if (condition) {
            return renderItems(ifStmt.getHtmlContent() != null
                    ? ifStmt.getHtmlContent().getItems() : null);
        }
        return "";
    }

    private boolean evaluateCondition(JinjaExpression condition) {
        if (condition == null) return true;
        if (condition instanceof JinjaBinaryExpression binExpr) {
            String op = binExpr.getOperator();
            String left = binExpr.getLeft() != null ? evaluateCallExpression(binExpr.getLeft()) : "";
            String right = binExpr.getRight() != null ? evaluateCallExpression(binExpr.getRight()) : "";
            if ("==".equals(op)) return left.equals(right);
            if ("!=".equals(op)) return !left.equals(right);
            if (">".equals(op)) {
                try { return Double.parseDouble(left) > Double.parseDouble(right); }
                catch (NumberFormatException e) { return false; }
            }
            if ("<".equals(op)) {
                try { return Double.parseDouble(left) < Double.parseDouble(right); }
                catch (NumberFormatException e) { return false; }
            }
            return true;
        }
        if (condition instanceof JinjaSimpleExpression simple) {
            String val = evaluateExpression(simple);
            return val != null && !val.isEmpty() && !"false".equalsIgnoreCase(val)
                    && !"0".equals(val) && !"none".equalsIgnoreCase(val);
        }
        return true;
    }

    private String evaluateJinjaExpression(JinjaExpression expr) {
        if (expr instanceof JinjaSimpleExpression simple) {
            return evaluateExpression(simple);
        }
        if (expr instanceof JinjaBinaryExpression binary) {
            return evaluateBinaryExpression(binary);
        }
        return expr.generateCode();
    }

    private String extractVarNameForIterable(JinjaExpression expr) {
        if (expr instanceof JinjaSimpleExpression simple) {
            JinjaCallExpression call = simple.getExpr();
            if (call instanceof JinjaVariableAccess va) {
                return va.getDottedName();
            }
            if (call instanceof JinjaFilteredExpression fe) {
                JinjaVariableAccess va = fe.getJinjaVariableAccess();
                if (va != null) return va.getDottedName();
            }
        }
        return "";
    }

    private String renderTagElement(TagElement tag) {
        if (tag == null) return "";
        if (tag.isClosingTag()) {
            String name = tag.getTagName();
            return name != null ? "</" + name + ">" : "";
        }
        StringBuilder builder = new StringBuilder();
        String name = tag.getTagName();
        if (name == null) return "";
        builder.append("<").append(name);
        List<TagElementItem> attrs = tag.getTags();
        if (attrs != null) {
            for (TagElementItem attr : attrs) {
                if (attr != null && attr.getAttributeName() != null) {
                    builder.append(" ").append(attr.getAttributeName()).append("=\"");
                    String val = attr.getAttributeValue();
                    if (val != null) {
                        if (val.contains("{{")) {
                            val = resolveAttributeValue(val);
                        }
                        val = val.replace("\"", "");
                    }
                    builder.append(val != null ? val : "").append("\"");
                }
            }
        }
        if (tag.isSelfClosing()) {
            builder.append(" />");
        } else {
            builder.append(">");
        }
        return builder.toString();
    }

    private String resolveAttributeValue(String value) {
        if (value == null) return "";
        Pattern pattern = Pattern.compile("\\{\\{\\s*(.+?)\\s*\\}\\}");
        Matcher matcher = pattern.matcher(value);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            String expr = matcher.group(1).trim();
            String resolved = evaluateAttrExpression(expr);
            matcher.appendReplacement(sb, Matcher.quoteReplacement(resolved));
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    private String evaluateAttrExpression(String expr) {
        if (expr == null || expr.isEmpty()) return "";
        expr = expr.trim();
        if (expr.startsWith("url_for(")) {
            return evaluateUrlForFromString(expr);
        }
        if (expr.matches("[a-zA-Z_][a-zA-Z0-9_]*(\\.[a-zA-Z_][a-zA-Z0-9_]*)*")) {
            Object val = resolveVariable(expr);
            return val != null ? String.valueOf(val) : "";
        }
        if ((expr.startsWith("'") && expr.endsWith("'"))
                || (expr.startsWith("\"") && expr.endsWith("\""))) {
            return expr.substring(1, expr.length() - 1);
        }
        return "";
    }

    private String evaluateUrlForFromString(String expr) {
        if (expr == null) return "#";
        int parenStart = expr.indexOf('(');
        int parenEnd = expr.lastIndexOf(')');
        if (parenStart < 0 || parenEnd < 0 || parenEnd <= parenStart) return "#";
        String argsStr = expr.substring(parenStart + 1, parenEnd);
        String[] parts = argsStr.split(",");
        if (parts.length == 0) return "#";
        String endpoint = extractStringLiteral(parts[0].trim());
        if (endpoint == null) return "#";

        // Static mapping for attributes
        switch (endpoint) {
            case "index": return "index.html";
            case "add_product": return "add_product.html";
            case "detail": return "detail.html";
            case "delete": return "#";
        }

        if (routeMap.containsKey(endpoint)) {
            String route = routeMap.get(endpoint);
            if (route.equals("/")) return "index.html";

            String staticName = route;
            if (staticName.startsWith("/")) staticName = staticName.substring(1);
            if (staticName.contains("<")) staticName = staticName.split("/")[0];
            if (staticName.isEmpty()) return "index.html";
            return staticName + ".html";
        }

        if ("static".equals(endpoint) && parts.length > 1) {
            for (int i = 1; i < parts.length; i++) {
                String part = parts[i].trim();
                int eqIdx = part.indexOf('=');
                if (eqIdx > 0) {
                    String val = part.substring(eqIdx + 1).trim();
                    String resolved = evaluateAttrExpression(val);
                    return resolved != null ? resolved : "";
                }
            }
            return "";
        }

        return "/" + endpoint;
    }

    private String extractStringLiteral(String s) {
        if (s == null) return null;
        s = s.trim();
        if ((s.startsWith("'") && s.endsWith("'"))
                || (s.startsWith("\"") && s.endsWith("\""))) {
            if (s.length() >= 2) {
                return s.substring(1, s.length() - 1);
            }
        }
        return null;
    }

    private String extractJinjaArgValue(JinjaArgument arg) {
        if (arg.getArgument() == null) return null;
        JinjaExpression expr = arg.getArgument();
        if (expr instanceof JinjaSimpleExpression simple) {
            if (simple.getExpr() instanceof JinjaAtom atom) {
                Object v = atom.getAtom() != null ? atom.getAtom().getValue() : null;
                if (v != null) {
                    String s = String.valueOf(v);
                    if (s.length() >= 2) {
                        char f = s.charAt(0), l = s.charAt(s.length() - 1);
                        if ((f == '\'' && l == '\'') || (f == '"' && l == '"')) {
                            return s.substring(1, s.length() - 1);
                        }
                    }
                    return s;
                }
            }
            if (simple.getExpr() instanceof JinjaVariableAccess va) {
                return evaluateVariableAccess(va);
            }
        }
        return null;
    }
}
