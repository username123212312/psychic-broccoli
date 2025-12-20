package ast.jinja.jinjaStatment;

import ast.HtmlContent;

public class JinjaBlockStatement extends JinjaStmtItem{
    private String blockName;
    private HtmlContent htmlContent;
    public JinjaBlockStatement(int line_number, String blockName, HtmlContent htmlContent) {
        super("JinjaBlockStatement", line_number);
        this.blockName = blockName;
        this.htmlContent = htmlContent;
    }
}
