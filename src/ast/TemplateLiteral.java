package ast;

public class TemplateLiteral extends ASTNode {
    private HtmlContent htmlContent;
    private String content;

    public TemplateLiteral(int line_number) {
        super("TemplateLiteral", line_number);
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



    @Override
    public String toString() {
        return super.toString() + Consts.printIndent(2) + htmlContent.toString();
    }
}
