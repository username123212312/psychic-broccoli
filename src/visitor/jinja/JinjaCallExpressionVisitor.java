package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.jinja.jinjaCallExpr.JinjaCallExpression;

public class JinjaCallExpressionVisitor extends JinjaFlaskParserBaseVisitor<JinjaCallExpression> {
    @Override
    public JinjaCallExpression visitJinjaFilteredExpr(JinjaFlaskParser.JinjaFilteredExprContext ctx) {
        return super.visitJinjaFilteredExpr(ctx);
    }

    @Override
    public JinjaCallExpression visitJinjaFunctionCall(JinjaFlaskParser.JinjaFunctionCallContext ctx) {
        return super.visitJinjaFunctionCall(ctx);
    }

    @Override
    public JinjaCallExpression visitJinjaVarAccessOnly(JinjaFlaskParser.JinjaVarAccessOnlyContext ctx) {
        return super.visitJinjaVarAccessOnly(ctx);
    }

    @Override
    public JinjaCallExpression visitJinjaAtomOnly(JinjaFlaskParser.JinjaAtomOnlyContext ctx) {
        return super.visitJinjaAtomOnly(ctx);
    }
}
