package ast.jinja.jinjaStatment;

import ast.HtmlContent;
import ast.jinja.JinjaExprItem;

public class JinjaIfStatement extends JinjaStatement {
    private JinjaExprItem condition;
    private HtmlContent htmlContent;

    public JinjaIfStatement(int line_number, JinjaExprItem condition, HtmlContent htmlContent) {
        super("JinjaIfStatement", line_number);
        this.condition = condition;
        this.htmlContent = htmlContent;
    }
}

