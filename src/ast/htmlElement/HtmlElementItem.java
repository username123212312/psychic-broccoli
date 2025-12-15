package ast.htmlElement;

import ast.htmlContentItem.HtmlContentItem;

public abstract class HtmlElementItem extends HtmlContentItem {
    public HtmlElementItem(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
