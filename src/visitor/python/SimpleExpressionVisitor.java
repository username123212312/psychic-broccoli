package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.condition.Condition;
import ast.simpleExpr.SimpleComparisonExpression;
import ast.simpleExpr.SimpleExpression;

public class SimpleExpressionVisitor extends JinjaFlaskParserBaseVisitor<SimpleExpression> {
    @Override
    public SimpleExpression visitArithmeticExpression(JinjaFlaskParser.ArithmeticExpressionContext ctx) {
        return new ArithmeticExpressionVisitor().visit(ctx.arithmetic_expr());
    }

    @Override
    public SimpleExpression visitSimpleComparisonExpression(JinjaFlaskParser.SimpleComparisonExpressionContext ctx) {
        SimpleComparisonExpression simpleComparisonExpression = new SimpleComparisonExpression(ctx.getStart().getLine());
        Condition condition = new ConditionVisitor().visit(ctx.condition());
        simpleComparisonExpression.setCondition(condition);
        return simpleComparisonExpression;
    }

}
