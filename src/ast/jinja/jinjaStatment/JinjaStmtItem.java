package ast.jinja.jinjaStatment;

import ast.htmlContentItem.HtmlContentItem;

public abstract class JinjaStmtItem extends HtmlContentItem {
    public JinjaStmtItem(String node_name, int line_number) {
        super(node_name, line_number);
    }

}
