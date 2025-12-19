package visitor;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.compundStmt.CompoundStatement;

public class CompoundStatementVisitor extends JinjaFlaskParserBaseVisitor<CompoundStatement> {
    @Override
    public CompoundStatement visitIfStatement(JinjaFlaskParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx);
    }

    @Override
    public CompoundStatement visitAssignmentStatement(JinjaFlaskParser.AssignmentStatementContext ctx) {
        return super.visitAssignmentStatement(ctx);
    }

    @Override
    public CompoundStatement visitForLoopStatement(JinjaFlaskParser.ForLoopStatementContext ctx) {
        return super.visitForLoopStatement(ctx);
    }

    @Override
    public CompoundStatement visitPythonExpression(JinjaFlaskParser.PythonExpressionContext ctx) {
        return super.visitPythonExpression(ctx);
    }

    @Override
    public CompoundStatement visitFunctionDefinition(JinjaFlaskParser.FunctionDefinitionContext ctx) {
        return super.visitFunctionDefinition(ctx);
    }

    @Override
    public CompoundStatement visitReturnStatement(JinjaFlaskParser.ReturnStatementContext ctx) {
        return super.visitReturnStatement(ctx);
    }

    @Override
    public CompoundStatement visitImportStatement(JinjaFlaskParser.ImportStatementContext ctx) {
        return super.visitImportStatement(ctx);
    }

    @Override
    public CompoundStatement visitGlobalStatement(JinjaFlaskParser.GlobalStatementContext ctx) {
        return super.visitGlobalStatement(ctx);
    }
}
