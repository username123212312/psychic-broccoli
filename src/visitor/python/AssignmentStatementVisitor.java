package visitor.python;

import antlr.python.PythonParser;
import antlr.python.PythonParserBaseVisitor;
import ast.TemplateLiteral;
import ast.arithmeticExpr.ArithmeticExpression;
import ast.assignStmt.*;
import ast.atomExpression.AtomExpression;
import ast.compundStmt.PythonExpression;
import ast.condition.Condition;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableManager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentStatementVisitor extends PythonParserBaseVisitor<AssignmentStatement> {
    private final PythonExpressionVisitor pythonExpressionVisitor = new PythonExpressionVisitor();
    private final SymbolTable sb = SymbolTableManager.INSTANCE.getSymbolTable();
    private static final Pattern GET_STRING_KEY_PATTERN =
            Pattern.compile("\\bget\\s*\\(\\s*[\"']([A-Za-z_][A-Za-z0-9_]*)[\"']\\s*\\)");

    @Override
    public AssignmentStatement visitComparisonAssignStmt(PythonParser.ComparisonAssignStmtContext ctx) {
        ComparisonAssignmentStmt comparisonAssignmentStmt = new ComparisonAssignmentStmt(ctx.getStart().getLine());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        Condition condition = new ConditionVisitor().visit(ctx.condition());
        comparisonAssignmentStmt.setVar(pythonExpression);
        String symbolEntryName = resolveSymbolName(pythonExpression);
        String conditionValue = condition.symbolTablePrint();
        if (symbolEntryName != null && !isStringKeyFetchAlias(symbolEntryName, conditionValue)) {
            sb.setAttribute(symbolEntryName, "Value", conditionValue);
            sb.setAttribute(symbolEntryName, "Type", condition.node_name);
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
            sb.setAttribute(symbolEntryName, "Value", "Multiline String");
            sb.setAttribute(symbolEntryName, "Type", pythonExpression.node_name);
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
        if (symbolEntryName != null && !isStringKeyFetchAlias(symbolEntryName, valueText)) {
            sb.setAttribute(symbolEntryName, "Value", valueText);
            sb.setAttribute(symbolEntryName, "Type", value.node_name);
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
            sb.setAttribute(symbolEntryName, "Value", arithmeticExpression.symbolTablePrint());
            sb.setAttribute(symbolEntryName, "Type", arithmeticExpression.node_name);
        }

        return arithmeticAssignStatement;
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

    private boolean isStringKeyFetchAlias(String symbolName, String expressionText) {
        if (symbolName == null || expressionText == null) {
            return false;
        }
        Matcher matcher = GET_STRING_KEY_PATTERN.matcher(expressionText);
        while (matcher.find()) {
            if (symbolName.equals(matcher.group(1))) {
                return true;
            }
        }
        return false;
    }
}
