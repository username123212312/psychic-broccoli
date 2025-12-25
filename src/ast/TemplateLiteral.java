package ast;

public class TemplateLiteral extends ASTNode {
    private HtmlContent htmlContent;

    public TemplateLiteral(int line_number) {
        super("TemplateLiteral", line_number);
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }
}
