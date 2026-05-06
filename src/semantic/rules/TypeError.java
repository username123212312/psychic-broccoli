package semantic.rules;

import ast.ASTNode;
import ast.assignStmt.AssignmentStatement;
import ast.assignStmt.ArithmeticAssignStatement;
import ast.assignStmt.ComparisonAssignmentStmt;
import ast.assignStmt.PythonExpressionAssignStatement;
import ast.assignStmt.TemplateLiteralAssignmentStatement;
import ast.arithmeticExpr.ArithmeticExpression;
import ast.atomExpression.LiteralExpression;
import ast.atomExpression.SimpleVariable;
import ast.compundStmt.PythonExpression;
import semantic.ErrorReporter;
import symbolTable.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class TypeError implements SemanticError {

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

            String inferred = inferType(value, symbolTable, reporter);
            // keep this rule read-only: only detect invalid expressions here
            // the symbol table already contains the visitor-produced types/values
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
            default -> {
            }
        }
        // fallback: use node_name if present
        try {
            var field = node.getClass().getField("node_name");
            Object val = field.get(node);
            if (val != null) return val.toString();
        } catch (Exception ignored) {}
        return "Unknown";
    }

    private String inferArithmetic(ArithmeticExpression ae, SymbolTable symbolTable, ErrorReporter reporter) {
        List<String> operandTypes = new ArrayList<>();
        operandTypes.add(inferType(ae.getLeft(), symbolTable, reporter));
        if (ae.getRight() != null) {
            for (PythonExpression e : ae.getRight()) {
                operandTypes.add(inferType(e, symbolTable, reporter));
            }
        }

        boolean allNumeric = operandTypes.stream().allMatch(this::isNumeric);
        if (allNumeric) return operandTypes.contains("Float") ? "Float" : "Integer";

        boolean allString = operandTypes.stream().allMatch("String"::equals);
        if ("+".equals(ae.getOperator()) && allString) return "String";

        boolean mixed = operandTypes.stream().anyMatch("String"::equals) && operandTypes.stream().anyMatch(this::isNumeric);
        if (mixed) {
            reporter.addError("Type error at line " + ae.line_number + ": cannot apply '" + ae.getOperator() + "' to " + operandTypes);
            return "Unknown";
        }
        return "Unknown";
    }

    private boolean isNumeric(String t) {
        return "Integer".equals(t) || "Float".equals(t);
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
