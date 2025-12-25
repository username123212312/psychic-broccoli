package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.assignStmt.AssignmentStatement;
import ast.assignStmt.ComplexExpressionAssignStatement;
import ast.complexExp.ComplexExpression;
import ast.compundStmt.PythonExpression;

public class AssignmentStatementVisitor extends JinjaFlaskParserBaseVisitor<AssignmentStatement> {
    @Override
    public AssignmentStatement visitComparisonAssignStmt(JinjaFlaskParser.ComparisonAssignStmtContext ctx) {
        return super.visitComparisonAssignStmt(ctx);
    }

    @Override
    public AssignmentStatement visitTemplateLiteralAssignStmt(JinjaFlaskParser.TemplateLiteralAssignStmtContext ctx) {
        return super.visitTemplateLiteralAssignStmt(ctx);
    }

    @Override
    public AssignmentStatement visitComplexExpressionAssignStatement(JinjaFlaskParser.ComplexExpressionAssignStatementContext ctx) {
        ComplexExpressionVisitor complexExpressionVisitor = new ComplexExpressionVisitor();
        PythonExpressionVisitor pythonExpressionVisitor = new PythonExpressionVisitor();
        ComplexExpressionAssignStatement complexExpressionAssignStatement
                = new ComplexExpressionAssignStatement(ctx.getStart().getLine());
        PythonExpression var = pythonExpressionVisitor.visit(ctx.python_expr());
        ComplexExpression complexExpression = complexExpressionVisitor.visit(ctx.complex_expr());
        complexExpressionAssignStatement.setVar(var);
        complexExpressionAssignStatement.setComplexExpression(complexExpression);

        return complexExpressionAssignStatement;
    }

    @Override
    public AssignmentStatement visitArithmeticAssignStmt(JinjaFlaskParser.ArithmeticAssignStmtContext ctx) {
        return super.visitArithmeticAssignStmt(ctx);
    }
}
