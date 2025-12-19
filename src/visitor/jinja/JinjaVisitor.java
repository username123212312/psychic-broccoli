package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.jinja.*;
import visitor.UniversalVisitor;

public class JinjaVisitor extends JinjaFlaskParserBaseVisitor<ASTNode> {
    @Override
    public JinjaStatement visitJinjaStmt(JinjaFlaskParser.JinjaStmtContext ctx) {
        JinjaStatementVisitor jinjaStatementVisitor = new JinjaStatementVisitor();
        return jinjaStatementVisitor.visit(ctx.jStatement());
    }

    @Override
    public JinjaExpression visitJinjaExpr(JinjaFlaskParser.JinjaExprContext ctx) {
        JinjaExpressionVisitor jinjaExpressionVisitor = new JinjaExpressionVisitor();
        return jinjaExpressionVisitor.visit(ctx.j_expression());
    }

    @Override
    public JinjaExtendStatement visitJinjaExtendsDirective(JinjaFlaskParser.JinjaExtendsDirectiveContext ctx) {
        return new JinjaExtendStatement(ctx.getStart().getLine(), "");
    }

    @Override
    public ASTNode visitJinjaBlockDefinition(JinjaFlaskParser.JinjaBlockDefinitionContext ctx) {
        return super.visitJinjaBlockDefinition(ctx);
    }

    @Override
    public ASTNode visitJinjaForLoopDefinition(JinjaFlaskParser.JinjaForLoopDefinitionContext ctx) {
        return super.visitJinjaForLoopDefinition(ctx);
    }

    @Override
    public ASTNode visitJinjaConditional(JinjaFlaskParser.JinjaConditionalContext ctx) {
        return super.visitJinjaConditional(ctx);
    }

    @Override
    public ASTNode visitJinjaDottedName(JinjaFlaskParser.JinjaDottedNameContext ctx) {
        return super.visitJinjaDottedName(ctx);
    }

    @Override
    public ASTNode visitJinjaArgList(JinjaFlaskParser.JinjaArgListContext ctx) {
        return super.visitJinjaArgList(ctx);
    }

}
