package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.Condition;

public class ConditionVisitor extends JinjaFlaskParserBaseVisitor<Condition> {
    @Override
    public Condition visitNotExpression(JinjaFlaskParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public Condition visitComparisonExpression(JinjaFlaskParser.ComparisonExpressionContext ctx) {
        return super.visitComparisonExpression(ctx);
    }
}
