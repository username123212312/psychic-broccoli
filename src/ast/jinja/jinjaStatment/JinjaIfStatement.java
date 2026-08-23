package ast.jinja.jinjaStatment;

import ast.Consts;
import ast.HtmlContent;
import ast.jinja.jinjaExpression.JinjaExpression;

public class JinjaIfStatement extends JinjaStatement {
    private JinjaExpression condition;
    private HtmlContent htmlContent;

    public JinjaIfStatement(int line_number) {
        super("JinjaIfStatement", line_number);
    }

    public void setCondition(JinjaExpression condition) {
        this.condition = condition;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public JinjaExpression getCondition() {
        return condition;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    @Override
    public String generateCode() {
        StringBuilder builder = new StringBuilder();
        builder.append("{% if ");
        if (condition != null) {
            builder.append(condition.generateCode());
        }
        builder.append(" %}\n");
        if (htmlContent != null) {
            builder.append(htmlContent.generateCode());
        }
        builder.append("{% endif %}");
        return builder.toString();
    }


    @Override
    public String toString() {
        return super.toString() +
                " ( " + condition.toString() + " ) " +
                Consts.printIndent(3) + htmlContent.toString();
    }
}

