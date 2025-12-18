package ast.jinja;

import ast.htmlContentItem.HtmlContentItem;

public class JinjaExpression extends HtmlContentItem {
    public JinjaExpression(int line_number) {
        super("JinjaExpression", line_number);
    }
}
