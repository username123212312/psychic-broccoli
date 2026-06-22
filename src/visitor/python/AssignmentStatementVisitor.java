package visitor.python;

import antlr.python.PythonParser;
import antlr.python.PythonParserBaseVisitor;
import ast.TemplateLiteral;
import ast.arithmeticExpr.ArithmeticExpression;
import ast.assignStmt.*;
import ast.atomExpression.AtomExpression;
import ast.atomExpression.AttributeAccess;
import ast.atomExpression.FunctionCall;
import ast.atomExpression.LiteralExpression;
import ast.atomExpression.MethodAccess;
import ast.atomExpression.ObjectCreation;
import ast.atomExpression.SimpleVariable;
import ast.compundStmt.PythonExpression;
import ast.condition.Condition;
import ast.complexExp.DictionaryLiteral;
import ast.complexExp.ListLiteral;
import symbolTable.SymbolEntry;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableManager;

import java.util.ArrayList;
import java.util.List;

public class AssignmentStatementVisitor extends PythonParserBaseVisitor<AssignmentStatement> {
    private final PythonExpressionVisitor pythonExpressionVisitor = new PythonExpressionVisitor();
    private final SymbolTable sb = SymbolTableManager.INSTANCE.getSymbolTable();


    @Override
    public AssignmentStatement visitComparisonAssignStmt(PythonParser.ComparisonAssignStmtContext ctx) {
        ComparisonAssignmentStmt comparisonAssignmentStmt = new ComparisonAssignmentStmt(ctx.getStart().getLine());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        Condition condition = new ConditionVisitor().visit(ctx.condition());
        comparisonAssignmentStmt.setVar(pythonExpression);
        String symbolEntryName = resolveSymbolName(pythonExpression);
        String conditionValue = condition.symbolTablePrint();
        if (symbolEntryName != null) {
            recordDynamicType(symbolEntryName, "Boolean", conditionValue, ctx.getStart().getLine());
        }
        comparisonAssignmentStmt.setValue(condition);
        return comparisonAssignmentStmt;
    }

    @Override
    public AssignmentStatement visitTemplateLiteralAssignStmt(PythonParser.TemplateLiteralAssignStmtContext ctx) {
        TemplateLiteralAssignmentStatement templateLiteralAssignmentStatement
                = new TemplateLiteralAssignmentStatement(ctx.getStart().getLine());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        TemplateLiteral templateLiteral = new TemplateLiteralVisitor().visit(ctx.template_literal());
        templateLiteralAssignmentStatement.setVar(pythonExpression);
        templateLiteralAssignmentStatement.setTemplateLiteral(templateLiteral);
        String symbolEntryName = resolveSymbolName(pythonExpression);
        if (symbolEntryName != null) {
            recordDynamicType(symbolEntryName, "String", templateLiteral.getContent(), ctx.getStart().getLine());
        }

        return templateLiteralAssignmentStatement;
    }

    @Override
    public AssignmentStatement visitPythonExpressionAssignStmt(PythonParser.PythonExpressionAssignStmtContext ctx) {

        PythonExpressionAssignStatement pythonExpressionAssignStatement
                = new PythonExpressionAssignStatement(ctx.getStart().getLine());
        PythonExpression var = pythonExpressionVisitor.visit(ctx.python_expr(0));
        PythonExpression value = pythonExpressionVisitor.visit(ctx.python_expr(1));
        String symbolEntryName = resolveSymbolName(var);
        String valueText = value.symbolTablePrint();
        if (symbolEntryName != null) {
            recordDynamicType(symbolEntryName, inferDynamicType(value), valueText, ctx.getStart().getLine());
        }
        pythonExpressionAssignStatement.setVar(var);
        pythonExpressionAssignStatement.setValue(value);
        return pythonExpressionAssignStatement;
    }


    @Override
    public AssignmentStatement visitArithmeticAssignStmt(PythonParser.ArithmeticAssignStmtContext ctx) {
        ArithmeticAssignStatement arithmeticAssignStatement = new ArithmeticAssignStatement(ctx.getStart().getLine());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        ArithmeticExpression arithmeticExpression = new ArithmeticExpressionVisitor().visit(ctx.arithmetic_expr());
        arithmeticAssignStatement.setVar(pythonExpression);
        arithmeticAssignStatement.setValue(arithmeticExpression);
        String symbolEntryName = resolveSymbolName(pythonExpression);
        if (symbolEntryName != null) {
            recordDynamicType(symbolEntryName, inferDynamicType(arithmeticExpression),
                    arithmeticExpression.symbolTablePrint(), ctx.getStart().getLine());
        }

        return arithmeticAssignStatement;
    }

    private void recordDynamicType(String symbolEntryName, String dynamicType, String valueText, int lineNumber) {
        if (symbolEntryName == null) {
            return;
        }

        SymbolEntry currentEntry = sb.lookup(symbolEntryName);
        Object previousType = currentEntry == null ? null : currentEntry.getAttribute("Type");
        if (previousType != null && !previousType.toString().equals(dynamicType)) {
            sb.setAttribute(symbolEntryName, "PreviousType", previousType.toString());
        }

        sb.setAttribute(symbolEntryName, "Value", valueText);
        sb.setAttribute(symbolEntryName, "Type", dynamicType);
    }

    private String inferDynamicType(PythonExpression expression) {
        switch (expression) {
            case null -> {
                return "Unknown";
            }
            case LiteralExpression literalExpression -> {
                return inferLiteralType(literalExpression.symbolTablePrint());
            }
            case ObjectCreation objectCreation -> {
                return objectCreation.getVarName() == null ? "Object" : objectCreation.getVarName();
            }
            case FunctionCall functionCall -> {
                return "Unknown";
            }
            case ListLiteral listLiteral -> {
                return "List";
            }
            case DictionaryLiteral dictionaryLiteral -> {
                return "Dictionary";
            }
            case SimpleVariable simpleVariable -> {
                return resolveReferencedType(simpleVariable.getVarName());
            }
            default -> {
            }
        }

        if (expression instanceof AttributeAccess || expression instanceof MethodAccess) {
            return "Unknown";
        }

        return expression.node_name;
    }

    private String inferDynamicType(ArithmeticExpression arithmeticExpression) {
        if (arithmeticExpression == null) {
            return "Unknown";
        }
        return inferArithmeticType(arithmeticExpression);
    }

    private String inferArithmeticType(ArithmeticExpression arithmeticExpression) {
        List<String> operandTypes = new ArrayList<>();
        operandTypes.add(inferDynamicType(arithmeticExpression.getLeft()));
        if (arithmeticExpression.getRight() != null) {
            for (PythonExpression pythonExpression : arithmeticExpression.getRight()) {
                operandTypes.add(inferDynamicType(pythonExpression));
            }
        }

        boolean allNumeric = operandTypes.stream().allMatch(this::isNumericType);
        if (allNumeric) {
            return operandTypes.contains("Float") ? "Float" : "Integer";
        }

        boolean allString = operandTypes.stream().allMatch(type -> "String".equals(type));
        if ("+".equals(arithmeticExpression.getOperator()) && allString) {
            return "String";
        }

        boolean mixedStringAndNumeric = operandTypes.stream().anyMatch(type -> "String".equals(type))
                && operandTypes.stream().anyMatch(this::isNumericType);
        if (mixedStringAndNumeric) {
            System.out.println("Semantic error at line " + arithmeticExpression.line_number
                    + ": cannot apply operator '" + arithmeticExpression.getOperator()
                    + "' to incompatible types " + operandTypes);
            return "Unknown";
        }

        return "Unknown";
    }

    private String inferLiteralType(String literalValue) {
        if (literalValue == null) {
            return "Unknown";
        }

        if (literalValue.startsWith("\"") && literalValue.endsWith("\"")
                || literalValue.startsWith("'") && literalValue.endsWith("'")) {
            return "String";
        }

        if (literalValue.equals("True") || literalValue.equals("False")) {
            return "Boolean";
        }

        if (literalValue.equals("None")) {
            return "None";
        }

        if (literalValue.matches("[0-9]+\\.[0-9]+")) {
            return "Float";
        }

        if (literalValue.matches("[0-9]+")) {
            return "Integer";
        }

        return "Unknown";
    }

    private boolean isNumericType(String type) {
        return "Integer".equals(type) || "Float".equals(type);
    }

    private String resolveReferencedType(String symbolName) {
        if (symbolName == null) {
            return "Unknown";
        }

        Object currentType = sb.getAttribute(symbolName, "Type");
        if (currentType == null) {
            return "Unknown";
        }

        return currentType.toString();
    }

    private String resolveSymbolName(PythonExpression expression) {
        if (expression instanceof AtomExpression atomExpression) {
            String varName = atomExpression.getVarName();
            if (varName != null && varName.matches("[A-Za-z_][A-Za-z0-9_]*")) {
                return varName;
            }
        }
        return null;
    }

}
