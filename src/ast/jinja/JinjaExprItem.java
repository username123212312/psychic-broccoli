package ast.jinja;

import ast.htmlContentItem.HtmlContentItem;
import ast.jinja.jinjaExpression.JinjaExpression;

public class JinjaExprItem extends HtmlContentItem {
    private JinjaExpression expr;

    public JinjaExprItem(int line_number ,  JinjaExpression expr) {

        super("JinjaExpression", line_number);
        this.expr = expr;
    }
}
