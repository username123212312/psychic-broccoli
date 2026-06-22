package ast.jinja.jinjaExpression;

import ast.htmlContentItem.HtmlContentItem;

public abstract class JinjaExpression extends HtmlContentItem {
    private boolean isBlock = false;

    public JinjaExpression(String node_name, int line_number) {
        super(node_name, line_number);
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public boolean isBlock() {
        return isBlock;
    }
}