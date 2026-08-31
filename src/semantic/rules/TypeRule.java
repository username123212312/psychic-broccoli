package semantic.rules;

import ast.ASTNode;
import ast.assignStmt.AssignmentStatement;
import ast.assignStmt.ArithmeticAssignStatement;
import ast.assignStmt.ComparisonAssignmentStmt;
import ast.assignStmt.PythonExpressionAssignStatement;
import ast.assignStmt.TemplateLiteralAssignmentStatement;
import ast.arithmeticExpr.ArithmeticExpression;
import ast.atomExpression.FunctionCall;
import ast.atomExpression.LiteralExpression;
import ast.atomExpression.SimpleVariable;
import ast.compundStmt.PythonExpression;
import ast.complexExp.DictionaryLiteral;
import ast.complexExp.ListLiteral;
import ast.condition.BooleanCondition;
import ast.condition.ComparisonExpression;
import ast.condition.NotExpression;
import ast.returnStmt.ComplexReturnStatement;
import ast.returnStmt.ReturnStatement;
import semantic.ErrorReporter;
import semantic.errors.TypeError;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class TypeRule implements SemanticRule {

    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (node == null) return;
        if (node instanceof AssignmentStatement asg) {
            PythonExpression var = asg.getVar();
            ASTNode value = null;
            switch (asg) {
                case PythonExpressionAssignStatement pea -> value = pea.getValue();
                case ArithmeticAssignStatement aea -> value = aea.getValue();
                case ComparisonAssignmentStmt cas -> value = cas.getValue();
                case TemplateLiteralAssignmentStatement tlas -> value = tlas.getTemplateLiteral();
                default -> {
                }
            }

            if (var == null || value == null) return;
            String symbolName = var.symbolTablePrint();
            if (symbolName == null || !symbolName.matches("[A-Za-z_][A-Za-z0-9_]*")) return;

            inferType(value, symbolTable, reporter);
        } else if (node instanceof ComparisonExpression comparisonExpression) {
            checkComparison(comparisonExpression, symbolTable, reporter);
        } else if (node instanceof ReturnStatement returnStatement) {
            analyzeReturnValue(returnStatement, symbolTable, reporter);
        }
    }

    private void analyzeReturnValue(ReturnStatement returnStatement, SymbolTable symbolTable, ErrorReporter reporter) {
        if (returnStatement instanceof ComplexReturnStatement complexReturnStatement) {
            ASTNode returned = complexReturnStatement.getPythonExpression() != null
                    ? complexReturnStatement.getPythonExpression()
                    : complexReturnStatement.getExpression();
            if (returned != null) {
                inferType(returned, symbolTable, reporter);
            }
        }
    }

    private void checkComparison(ComparisonExpression ce, SymbolTable symbolTable, ErrorReporter reporter) {
        String baseType = inferType(ce.getBaseExpr(), symbolTable, reporter);
        if (ce.getOperatorPythonExpressionMap() != null) {
            for (var entry : ce.getOperatorPythonExpressionMap().entrySet()) {
                String operandType = inferType(entry.getValue(), symbolTable, reporter);
                String cmpOp = entry.getKey() == null ? null : entry.getKey().getOperator();
                boolean ordering = ">".equals(cmpOp) || "<".equals(cmpOp) || ">=".equals(cmpOp) || "<=".equals(cmpOp);
                if (ordering && isOrderingIncompatible(baseType, operandType)) {
                    String message = "Type error at line " + ce.line_number + ": cannot apply '" + cmpOp
                            + "' to [" + baseType + ", " + operandType + "]";
                    reporter.addError(new TypeError(message));
                    throw new TypeError(message);
                }
            }
        }
    }

    private String inferType(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        switch (node) {
            case null -> {
                return "Unknown";
            }
            case LiteralExpression lit -> {
                return inferLiteralType(lit.symbolTablePrint());
            }
            case SimpleVariable sv -> {
                Object t = symbolTable.getAttribute(sv.getVarName(), "Type");
                return t == null ? "Unknown" : t.toString();
            }
            case ArithmeticExpression ae -> {
                return inferArithmetic(ae, symbolTable, reporter);
            }
            case FunctionCall fc -> {
                return inferFunctionReturnType(fc);
            }
            case ListLiteral ignored -> { return "List"; }
            case DictionaryLiteral ignored -> { return "Dictionary"; }
            case ComparisonExpression ce -> {
                checkComparison(ce, symbolTable, reporter);
                return "Boolean";
            }
            case BooleanCondition ignored -> { return "Boolean"; }
            case NotExpression ignored -> { return "Boolean"; }
            default -> {
            }
        }
        return "Unknown";
    }

    private String inferFunctionReturnType(FunctionCall fc) {
        if (fc.getVarName() == null) return "Unknown";
        switch (fc.getVarName()) {
            case "str": return "String";
            case "len": return "Integer";
            case "int": return "Integer";
            case "float": return "Float";
            case "bool": return "Boolean";
            case "list": return "List";
            case "dict": return "Dictionary";
            case "range": return "List";
            default: return "Unknown";
        }
    }

    private String inferArithmetic(ArithmeticExpression ae, SymbolTable symbolTable, ErrorReporter reporter) {
        List<String> operandTypes = new ArrayList<>();
        operandTypes.add(inferType(ae.getLeft(), symbolTable, reporter));
        if (ae.getRight() != null) {
            for (PythonExpression e : ae.getRight()) {
                operandTypes.add(inferType(e, symbolTable, reporter));
            }
        }

        String op = ae.getOperator();

        boolean anyUnknown = operandTypes.stream().anyMatch("Unknown"::equals);
        boolean allNumeric = operandTypes.stream().allMatch(this::isNumeric);
        if (allNumeric) return operandTypes.contains("Float") ? "Float" : "Integer";

        boolean allString = operandTypes.stream().allMatch("String"::equals);
        if ("+".equals(op) && allString) return "String";

        boolean allList = operandTypes.stream().allMatch("List"::equals);
        if ("+".equals(op) && allList) return "List";

        boolean error = false;
        if (!anyUnknown) {
            long stringCount = operandTypes.stream().filter("String"::equals).count();
            boolean anyString = stringCount > 0;
            boolean anyList = operandTypes.stream().anyMatch("List"::equals);
            boolean anyDict = operandTypes.stream().anyMatch("Dictionary"::equals);
            boolean anyNone = operandTypes.stream().anyMatch("None"::equals);

            if (anyNone) {
                error = true;
            } else if (anyDict) {
                error = true;
            } else if (anyString) {
                if ("+".equals(op)) {
                    error = operandTypes.stream().anyMatch(t -> !t.equals("String"));
                } else if ("-".equals(op) || "/".equals(op)) {
                    error = true;
                } else if ("*".equals(op)) {
                    error = stringCount > 1
                            || operandTypes.stream().anyMatch(t -> !t.equals("String") && !t.equals("Integer") && !t.equals("Boolean"));
                }
            } else if (anyList) {
                if ("+".equals(op)) {
                    error = operandTypes.stream().anyMatch(t -> !t.equals("List"));
                } else if ("-".equals(op) || "/".equals(op)) {
                    error = true;
                } else if ("*".equals(op)) {
                    error = operandTypes.stream().anyMatch(t -> !t.equals("List") && !t.equals("Integer") && !t.equals("Boolean"));
                }
            }
        }
        if (error) {
            String errorMessage = "Type error at line " + ae.line_number + ": cannot apply '" + op + "' to " + operandTypes;
            reporter.addError(new TypeError(errorMessage));
            throw new TypeError(errorMessage);
        }
        return "Unknown";
    }

    private boolean isOrderingIncompatible(String a, String b) {
        if (a == null || b == null || "Unknown".equals(a) || "Unknown".equals(b)) return false;
        if ("None".equals(a) || "None".equals(b)) return true;
        if ("Dictionary".equals(a) || "Dictionary".equals(b)) return true;
        if (isNumeric(a) && isNumeric(b)) return false;
        if (a.equals(b)) return false;
        return true;
    }

    private boolean isNumeric(String t) {
        return "Integer".equals(t) || "Float".equals(t) || "Boolean".equals(t);
    }

    private String inferLiteralType(String s) {
        if (s == null) return "Unknown";
        s = s.trim();
        if ((s.startsWith("\"") && s.endsWith("\"")) || (s.startsWith("'") && s.endsWith("'"))) return "String";
        if (s.equals("True") || s.equals("False")) return "Boolean";
        if (s.equals("None")) return "None";
        if (s.matches("[0-9]+\\.[0-9]+")) return "Float";
        if (s.matches("[0-9]+")) return "Integer";
        return "Unknown";
    }
}
