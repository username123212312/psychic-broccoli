package ast;

import ast.htmlContentItem.HtmlContentItem;

import java.util.List;

public class HtmlContent extends ASTNode {
    private List<HtmlContentItem> items;

    public HtmlContent(int line_number, List<HtmlContentItem> items) {
        super("HtmlContent", line_number);
        this.items = items;


        if (items != null) {
            this.children.addAll(items);
        }
    }
}
