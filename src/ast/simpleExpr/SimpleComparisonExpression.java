package ast.simpleExpr;

import ast.condition.Condition;

public class SimpleComparisonExpression extends SimpleExpression {
    private Condition condition;

    public SimpleComparisonExpression(int line_number, Condition condition) {
        super("SimpleComparisonExpression", line_number);
        this.condition = condition;
    }
}
