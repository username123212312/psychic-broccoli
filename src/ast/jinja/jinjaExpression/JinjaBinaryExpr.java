package ast.jinja.jinjaExpression;

import ast.jinja.jinjaCallExpr.JinjaCallExpression;

public class JinjaBinaryExpr extends JinjaExpression{

    private JinjaCallExpression left;
    private JinjaCallExpression right;
    private Character operation;

    public JinjaBinaryExpr(int line_number , JinjaCallExpression left ,JinjaCallExpression right, Character operation) {
        super(" JinjaBinaryExpr node", line_number);
        this.left = left ;
        this.right = right ;
        this.operation = operation;
    }
}
