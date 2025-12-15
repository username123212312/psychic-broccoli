package ast.jinja;

import ast.HtmlContent;

public class JinjaForStatement extends JinjaStatement {
    private String id;
    private HtmlContent htmlContent;
    private JinjaExpression iterable;

    public JinjaForStatement(int line_number, String id, HtmlContent htmlContent,
                             JinjaExpression iterable) {
        super("JinjaForStatement", line_number);
        this.id = id;
        this.htmlContent = htmlContent;
        this.iterable = iterable;
    }
}
