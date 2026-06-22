package ast.jinja.jinjaExpression;

import ast.jinja.jinjaCallExpr.JinjaCallExpression;

public class JinjaBinaryExpression extends JinjaExpression {

    private JinjaCallExpression left;
    private JinjaCallExpression right;
    private String operator;

    public JinjaBinaryExpression(int line_number) {
        super(" JinjaBinaryExpr node", line_number);
    }

    public void setLeft(JinjaCallExpression left) {
        this.left = left;
    }

    public void setRight(JinjaCallExpression right) {
        this.right = right;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public JinjaCallExpression getLeft() {
        return left;
    }

    public JinjaCallExpression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        return left.toString() + " " + operator + " " + right.toString();
    }
}
