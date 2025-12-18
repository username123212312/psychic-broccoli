package ast.jinja;

import ast.HtmlContent;

public class JinjaIfStatement extends JinjaStatement {
    private JinjaExpression condition;
    private HtmlContent htmlContent;

    public JinjaIfStatement(int line_number, JinjaExpression condition, HtmlContent htmlContent) {
        super("JinjaIfStatement", line_number);
        this.condition = condition;
        this.htmlContent = htmlContent;
    }
}
