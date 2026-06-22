package ast.jinja.jinjaStatment;

import ast.Consts;
import ast.HtmlContent;

public class JinjaBlockStatement extends JinjaStatement {
    private String blockName;
    private HtmlContent htmlContent;
    public JinjaBlockStatement(int line_number) {
        super("JinjaBlockStatement", line_number);
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getBlockName() {
        return blockName;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    @Override
    public String generateCode() {
        StringBuilder builder = new StringBuilder();
        builder.append("{% block ").append(blockName).append(" %}\n");
        if (htmlContent != null) {
            builder.append(htmlContent.generateCode());
        }
        builder.append("{% endblock %}");
        return builder.toString();
    }


    @Override
    public String toString() {
        return super.toString() +
                " ( " + blockName + Consts.printIndent(3) + htmlContent.toString();
    }
}
