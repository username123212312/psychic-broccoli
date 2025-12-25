package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.arithmeticExpr.ArithmeticExpression;
import ast.simpleExpr.SimpleExpression;

public class SimpleExpressionVisitor extends JinjaFlaskParserBaseVisitor<SimpleExpression> {
    @Override
    public SimpleExpression visitArithmeticExpression(JinjaFlaskParser.ArithmeticExpressionContext ctx) {
        return new ArithmeticExpressionVisitor().visit(ctx.arithmetic_expr());
    }

    @Override
    public SimpleExpression visitSimpleComparisonExpression(JinjaFlaskParser.SimpleComparisonExpressionContext ctx) {
        return super.visitSimpleComparisonExpression(ctx);
    }

}
