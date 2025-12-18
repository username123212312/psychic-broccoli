package ast.jinja;

import ast.HtmlContent;

public class JinjaBlockStatement extends JinjaStatement {
    private String blockName;
    private HtmlContent htmlContent;
    public JinjaBlockStatement(int line_number, String blockName, HtmlContent htmlContent) {
        super("JinjaBlockStatement", line_number);
        this.blockName = blockName;
        this.htmlContent = htmlContent;
    }
}
