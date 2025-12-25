package ast.jinja.jinjaStatment;

import ast.HtmlContent;
import ast.jinja.JinjaExprItem;

public class JinjaForStatement extends JinjaStatement {
    private String id;
    private HtmlContent htmlContent;
    private JinjaExprItem iterable;

    public JinjaForStatement(int line_number, String id, HtmlContent htmlContent,
                             JinjaExprItem iterable) {
        super("JinjaForStatement", line_number);
        this.id = id;
        this.htmlContent = htmlContent;
        this.iterable = iterable;
    }
}
