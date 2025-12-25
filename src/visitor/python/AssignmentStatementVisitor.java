package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.TemplateLiteral;
import ast.arithmeticExpr.ArithmeticExpression;
import ast.assignStmt.*;
import ast.compundStmt.PythonExpression;
import ast.condition.Condition;

public class AssignmentStatementVisitor extends JinjaFlaskParserBaseVisitor<AssignmentStatement> {
    private final PythonExpressionVisitor pythonExpressionVisitor = new PythonExpressionVisitor();

    @Override
    public AssignmentStatement visitComparisonAssignStmt(JinjaFlaskParser.ComparisonAssignStmtContext ctx) {
        ComparisonAssignmentStmt comparisonAssignmentStmt = new ComparisonAssignmentStmt(ctx.getStart().getLine());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        Condition condition = new ConditionVisitor().visit(ctx.condition());
        comparisonAssignmentStmt.setVar(pythonExpression);
        comparisonAssignmentStmt.setValue(condition);
        return comparisonAssignmentStmt;
    }

    @Override
    public AssignmentStatement visitTemplateLiteralAssignStmt(JinjaFlaskParser.TemplateLiteralAssignStmtContext ctx) {
        TemplateLiteralAssignmentStatement templateLiteralAssignmentStatement
                = new TemplateLiteralAssignmentStatement(ctx.getStart().getLine());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        TemplateLiteral templateLiteral = new TemplateLiteralVisitor().visit(ctx.template_literal());
        templateLiteralAssignmentStatement.setVar(pythonExpression);
        templateLiteralAssignmentStatement.setTemplateLiteral(templateLiteral);
        return templateLiteralAssignmentStatement;
    }

    @Override
    public AssignmentStatement visitPythonExpressionAssignStmt(JinjaFlaskParser.PythonExpressionAssignStmtContext ctx) {

        PythonExpressionAssignStatement pythonExpressionAssignStatement
                = new PythonExpressionAssignStatement(ctx.getStart().getLine());
        PythonExpression var = pythonExpressionVisitor.visit(ctx.python_expr(0));
        PythonExpression value = pythonExpressionVisitor.visit(ctx.python_expr(1));

        pythonExpressionAssignStatement.setVar(var);
        pythonExpressionAssignStatement.setValue(value);
        return pythonExpressionAssignStatement;
    }


    @Override
    public AssignmentStatement visitArithmeticAssignStmt(JinjaFlaskParser.ArithmeticAssignStmtContext ctx) {
        ArithmeticAssignStatement arithmeticAssignStatement = new ArithmeticAssignStatement(ctx.getStart().getLine());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        ArithmeticExpression arithmeticExpression = new ArithmeticExpressionVisitor().visit(ctx.arithmetic_expr());
        arithmeticAssignStatement.setVar(pythonExpression);
        arithmeticAssignStatement.setArithmeticExpression(arithmeticExpression);

        return arithmeticAssignStatement;
    }
}
