package ast;

public class TemplateLiteral extends ASTNode {
    private HtmlContent htmlContent;

    public TemplateLiteral(int line_number, HtmlContent htmlContent) {
        super("TemplateLiteral", line_number);
        this.htmlContent = htmlContent;
    }
}
