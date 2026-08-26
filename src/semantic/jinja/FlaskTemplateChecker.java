package semantic.jinja;

import ast.HtmlContent;
import ast.htmlContentItem.HtmlContentItem;
import ast.htmlElement.TagElement;
import ast.jinja.jinjaCallExpr.JinjaCallExpression;
import ast.jinja.jinjaCallExpr.JinjaFilteredExpression;
import ast.jinja.jinjaCallExpr.JinjaVariableAccess;
import ast.jinja.jinjaExpression.JinjaBinaryExpression;
import ast.jinja.jinjaExpression.JinjaExpression;
import ast.jinja.jinjaExpression.JinjaSimpleExpression;
import ast.jinja.jinjaStatment.JinjaBlockStatement;
import ast.jinja.jinjaStatment.JinjaForStatement;
import ast.jinja.jinjaStatment.JinjaIfStatement;
import ast.jinja.jinjaStatment.JinjaStatement;
import ast.tagContent.TagElementItem;
import semantic.ErrorReporter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlaskTemplateChecker {

    private static final Pattern JINJA_TOKEN_PATTERN = Pattern.compile("\\{\\{\\s*([A-Za-z_][A-Za-z0-9_]*)");

    private static final Set<String> JINJA_GLOBALS = Set.of(
            "loop", "request", "session", "config", "g", "url_for",
            "get_flashed_messages", "csrf_token", "self", "super", "caller",
            "namespace", "cycler", "joiner", "range", "dict", "lipsum"
    );

    private final Set<String> reported = new HashSet<>();

    public void analyze(HtmlContent content, String templateName, Set<String> providedVars, ErrorReporter reporter) {
        if (content == null || content.getItems() == null) return;
        walk(content.getItems(), new HashSet<>(providedVars), templateName, reporter);
    }

    private void walk(List<HtmlContentItem> items, Set<String> available, String templateName, ErrorReporter reporter) {
        if (items == null) return;
        for (HtmlContentItem item : items) {
            analyzeItem(item, available, templateName, reporter);
        }
    }

    private void analyzeItem(HtmlContentItem item, Set<String> available, String templateName, ErrorReporter reporter) {
        if (item == null) return;
        switch (item) {
            case JinjaForStatement forStatement -> {
                requireRoot(iterableRoot(forStatement.getIterable()),
                        forStatement.line_number, templateName, available, reporter);
                Set<String> bodyAvailable = new HashSet<>(available);
                if (forStatement.getId() != null && !forStatement.getId().isBlank()) {
                    bodyAvailable.add(forStatement.getId().trim());
                }
                walkItemsOf(forStatement.getHtmlContent(), bodyAvailable, templateName, reporter);
            }
            case JinjaIfStatement ifStatement -> {
                analyzeJinjaExpression(ifStatement.getCondition(), available, templateName, reporter);
                walkItemsOf(ifStatement.getHtmlContent(), available, templateName, reporter);
            }
            case JinjaBlockStatement blockStatement ->
                    walkItemsOf(blockStatement.getHtmlContent(), available, templateName, reporter);
            case JinjaStatement ignored -> { }
            case TagElement tagElement -> analyzeTag(tagElement, available, templateName, reporter);
            default -> { }
        }
    }

    private void walkItemsOf(HtmlContent content, Set<String> available, String templateName, ErrorReporter reporter) {
        if (content != null) walk(content.getItems(), available, templateName, reporter);
    }

    private void analyzeTag(TagElement tagElement, Set<String> available, String templateName, ErrorReporter reporter) {
        if (tagElement.getTags() == null) return;
        for (TagElementItem attribute : tagElement.getTags()) {
            if (attribute == null || attribute.getAttributeValue() == null) continue;
            Matcher matcher = JINJA_TOKEN_PATTERN.matcher(attribute.getAttributeValue());
            while (matcher.find()) {
                requireRoot(matcher.group(1), attribute.line_number, templateName, available, reporter);
            }
        }
    }

    private void analyzeJinjaExpression(JinjaExpression expression, Set<String> available, String templateName, ErrorReporter reporter) {
        if (expression == null) return;
        switch (expression) {
            case JinjaSimpleExpression simpleExpression ->
                    analyzeJinjaCall(simpleExpression.getExpr(), expression.line_number, available, templateName, reporter);
            case JinjaBinaryExpression binaryExpression -> {
                analyzeJinjaCall(binaryExpression.getLeft(), expression.line_number, available, templateName, reporter);
                analyzeJinjaCall(binaryExpression.getRight(), expression.line_number, available, templateName, reporter);
            }
            default -> { }
        }
    }

    private void analyzeJinjaCall(JinjaCallExpression call, int lineNumber, Set<String> available, String templateName, ErrorReporter reporter) {
        if (call == null) return;
        if (call instanceof JinjaVariableAccess variableAccess) {
            requireRoot(rootOf(variableAccess.getDottedName()), lineNumber, templateName, available, reporter);
        } else if (call instanceof JinjaFilteredExpression filteredExpression
                && filteredExpression.getJinjaVariableAccess() != null) {
            requireRoot(rootOf(filteredExpression.getJinjaVariableAccess().getDottedName()),
                    lineNumber, templateName, available, reporter);
        }
    }

    private String iterableRoot(JinjaExpression iterable) {
        if (!(iterable instanceof JinjaSimpleExpression simpleExpression)) return null;
        JinjaCallExpression callExpression = simpleExpression.getExpr();
        if (callExpression instanceof JinjaVariableAccess variableAccess) {
            return rootOf(variableAccess.getDottedName());
        }
        if (callExpression instanceof JinjaFilteredExpression filteredExpression
                && filteredExpression.getJinjaVariableAccess() != null) {
            return rootOf(filteredExpression.getJinjaVariableAccess().getDottedName());
        }
        return null;
    }

    private String rootOf(String dottedName) {
        if (dottedName == null) return null;
        String trimmed = dottedName.trim();
        int end = trimmed.length();
        int dotIndex = trimmed.indexOf('.');
        if (dotIndex >= 0) end = Math.min(end, dotIndex);
        int pipeIndex = trimmed.indexOf('|');
        if (pipeIndex >= 0) end = Math.min(end, pipeIndex);
        return trimmed.substring(0, end).trim();
    }

    private void requireRoot(String root, int lineNumber, String templateName, Set<String> available, ErrorReporter reporter) {
        if (root == null || !root.matches("[A-Za-z_][A-Za-z0-9_]*")) return;
        String deduplicationKey = templateName + "@" + root + "@" + lineNumber;
        if (!reported.add(deduplicationKey)) return;
        if (JINJA_GLOBALS.contains(root) || available.contains(root)) return;
        reporter.addError("Missing Flask variable '" + root + "' at line " + lineNumber
                + ": template '" + templateName + "' expects it but render_template does not pass it.");
    }
}
