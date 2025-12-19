package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.simpleExpr.SimpleExpression;

public class SimpleExpressionVisitor extends JinjaFlaskParserBaseVisitor<SimpleExpression> {
    @Override
    public SimpleExpression visitArithmeticExpression(JinjaFlaskParser.ArithmeticExpressionContext ctx) {
        return super.visitArithmeticExpression(ctx);
    }

    @Override
    public SimpleExpression visitSimpleComparisonExpression(JinjaFlaskParser.SimpleComparisonExpressionContext ctx) {
        return super.visitSimpleComparisonExpression(ctx);
    }

}
