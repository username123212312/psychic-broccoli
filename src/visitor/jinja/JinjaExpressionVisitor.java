package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.jinja.jinjaExpression.JinjaExpression;

public class JinjaExpressionVisitor extends JinjaFlaskParserBaseVisitor<JinjaExpression> {

    @Override
    public JinjaExpression visitJinjaBinaryExpr(JinjaFlaskParser.JinjaBinaryExprContext ctx) {
        return super.visitJinjaBinaryExpr(ctx);
    }

    @Override
    public JinjaExpression visitJinjaSimpleExpr(JinjaFlaskParser.JinjaSimpleExprContext ctx) {
        return super.visitJinjaSimpleExpr(ctx);
    }
}
