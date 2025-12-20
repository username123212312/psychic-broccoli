package ast.jinja.jinjaExpression;

import ast.jinja.jinjaCallExpr.JinjaCallExpression;

public class JinjaSimpleExpr extends JinjaExpression{
    private JinjaCallExpression expr;

    public JinjaSimpleExpr(int line_number,JinjaCallExpression expr ) {

        super("JinjaSimpleExpr node", line_number);
        this.expr = expr;

    }
}
