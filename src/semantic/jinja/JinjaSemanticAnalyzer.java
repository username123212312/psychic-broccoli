package semantic.jinja;

import ast.ASTNode;
import ast.HtmlContent;
import ast.jinja.JinjaArgumentsList;
import ast.jinja.jinjaArg.JinjaArgument;
import ast.jinja.jinjaCallExpr.JinjaAtom;
import ast.jinja.jinjaCallExpr.JinjaFilteredExpression;
import ast.jinja.jinjaCallExpr.JinjaFunctionCall;
import ast.jinja.jinjaCallExpr.JinjaVariableAccess;
import ast.jinja.jinjaExpression.JinjaBinaryExpression;
import ast.jinja.jinjaExpression.JinjaSimpleExpression;
import ast.jinja.jinjaStatment.JinjaBlockStatement;
import ast.jinja.jinjaStatment.JinjaForStatement;
import ast.jinja.jinjaStatment.JinjaIfStatement;
import ast.jinja.jinjaStatment.JinjaStatement;
import ast.htmlContentItem.HtmlContentItem;
import ast.atom.Name;
import semantic.ErrorReporter;
import semantic.errors.SemanticError;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableManager;

import java.util.Set;

public class JinjaSemanticAnalyzer {
    private final SymbolTable symbolTable = SymbolTableManager.INSTANCE.getSymbolTable();

    private static final Set<String> JINJA_BUILTINS = Set.of(
            "caller",
            "config",
            "cycler",
            "get_flashed_messages",
            "g",
            "joiner",
            "loop",
            "namespace",
            "request",
            "self",
            "session",
            "super",
            "url_for"
    );

    public void analyze(HtmlContent htmlContent) {
        if (htmlContent == null) {
            return;
        }

        ErrorReporter reporter = new ErrorReporter();
        walk(htmlContent, reporter);
        reporter.printErrors();
    }

    private void walk(ASTNode node, ErrorReporter reporter) {
        if (node == null) {
            return;
        }

        reportUndefinedIfNeeded(node, reporter);

        switch (node) {
            case HtmlContent htmlContent -> {
                if (htmlContent.getItems() != null) {
                    for (HtmlContentItem item : htmlContent.getItems()) {
                        walk(item, reporter);
                    }
                }
            }
            case JinjaIfStatement jinjaIfStatement -> {
                walk(jinjaIfStatement.getCondition(), reporter);
                walk(jinjaIfStatement.getHtmlContent(), reporter);
            }
            case JinjaForStatement jinjaForStatement -> {
                walk(jinjaForStatement.getIterable(), reporter);
                symbolTable.enterTemporaryScope("jinja for", jinjaForStatement);
                try {
                    if (jinjaForStatement.getId() != null && !jinjaForStatement.getId().isBlank()) {
                        symbolTable.define(jinjaForStatement.getId());
                    }
                    walk(jinjaForStatement.getHtmlContent(), reporter);
                } finally {
                    symbolTable.exitScope();
                }
            }
            case JinjaBlockStatement jinjaBlockStatement -> {
                walk(jinjaBlockStatement.getHtmlContent(), reporter);
            }
            case JinjaStatement jinjaStatement -> {
            }
            case JinjaSimpleExpression jinjaSimpleExpression -> {
                walk(jinjaSimpleExpression.getExpr(), reporter);
            }
            case JinjaBinaryExpression jinjaBinaryExpression -> {
                walk(jinjaBinaryExpression.getLeft(), reporter);
                walk(jinjaBinaryExpression.getRight(), reporter);
            }
            case JinjaFilteredExpression jinjaFilteredExpression -> {
                walk(jinjaFilteredExpression.getJinjaVariableAccess(), reporter);
            }
            case JinjaFunctionCall jinjaFunctionCall -> {
                walk(jinjaFunctionCall.getArgumentsList(), reporter);
            }
            case JinjaAtom jinjaAtom -> {
                Name name = jinjaAtom.getAtom() instanceof Name atomName ? atomName : null;
                if (name != null) {
                    Object value = name.getValue();
                    reportName(value == null ? null : value.toString(), node, reporter);
                }
            }
            case JinjaVariableAccess jinjaVariableAccess -> {
                reportDottedName(jinjaVariableAccess.getDottedName(), node, reporter);
            }
            case JinjaArgumentsList jinjaArgumentsList -> {
                if (jinjaArgumentsList.getArguments() != null) {
                    for (JinjaArgument argument : jinjaArgumentsList.getArguments()) {
                        walk(argument, reporter);
                    }
                }
            }
            case JinjaArgument jinjaArgument -> {
                walk(jinjaArgument.getArgument(), reporter);
            }
            default -> {
            }
        }

    }

    private void reportUndefinedIfNeeded(ASTNode node, ErrorReporter reporter) {
        if (node instanceof JinjaVariableAccess jinjaVariableAccess) {
            reportDottedName(jinjaVariableAccess.getDottedName(), node, reporter);
        } else if (node instanceof JinjaFilteredExpression jinjaFilteredExpression) {
            if (jinjaFilteredExpression.getJinjaVariableAccess() != null) {
                reportDottedName(jinjaFilteredExpression.getJinjaVariableAccess().getDottedName(), node, reporter);
            }
        } else if (node instanceof JinjaFunctionCall jinjaFunctionCall) {
            reportName(jinjaFunctionCall.getFunctionName(), node, reporter);
        } else if (node instanceof JinjaAtom jinjaAtom && jinjaAtom.getAtom() instanceof Name name) {
            reportName(name.getValue() == null ? null : name.getValue().toString(), node, reporter);
        }
    }

    private void reportDottedName(String dottedName, ASTNode node, ErrorReporter reporter) {
        if (dottedName == null || dottedName.isBlank()) {
            return;
        }

        String rootName = dottedName;
        int dotIndex = dottedName.indexOf('.');
        if (dotIndex >= 0) {
            rootName = dottedName.substring(0, dotIndex);
        }
        reportName(rootName, node, reporter);
    }

    private void reportName(String name, ASTNode node, ErrorReporter reporter) {
        if (name == null || name.isBlank()) {
            return;
        }

        if (JINJA_BUILTINS.contains(name) || symbolTable.lookup(name) != null) {
            return;
        }

        String errorMessage = "Undefined Jinja name '" + name + "' at line " + node.line_number;
        reporter.addError(errorMessage);
//        throw new SemanticError(errorMessage);
    }
}