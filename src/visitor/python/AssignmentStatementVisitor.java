package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.assignStmt.AssignmentStatement;

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
        return super.visitComplexExpressionAssignStatement(ctx);
    }

    @Override
    public AssignmentStatement visitArithmeticAssignStmt(JinjaFlaskParser.ArithmeticAssignStmtContext ctx) {
        return super.visitArithmeticAssignStmt(ctx);
    }
}
