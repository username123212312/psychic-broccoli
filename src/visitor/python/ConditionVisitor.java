package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.condition.Condition;
import ast.condition.NotExpression;

public class ConditionVisitor extends JinjaFlaskParserBaseVisitor<Condition> {
    PythonExpressionVisitor pythonExpressionVisitor = new PythonExpressionVisitor();

    @Override
    public Condition visitNotExpression(JinjaFlaskParser.NotExpressionContext ctx) {
        NotExpression notExpression = new NotExpression(ctx.getStart().getLine());
        notExpression.setPythonExpression(pythonExpressionVisitor.visit(ctx.python_expr()));
        return notExpression;
    }

    @Override
    public Condition visitComparisonExpression(JinjaFlaskParser.ComparisonExpressionContext ctx) {
        return super.visitComparisonExpression(ctx);
    }
}
