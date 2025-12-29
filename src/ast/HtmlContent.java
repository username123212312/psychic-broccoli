package ast;

import ast.htmlContentItem.HtmlContentItem;

import java.util.List;

public class HtmlContent extends ASTNode {
    private List<HtmlContentItem> items;

    public HtmlContent(int line_number) {
        super("HtmlContent", line_number);
    }

    public void setItems(List<HtmlContentItem> items) {
        this.items = items;


        if (items != null) {
            this.children.addAll(items);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (items != null) {
            for (HtmlContentItem htmlContentItem : items) {
                stringBuilder.append(Consts.printIndent(2))
                        .append(htmlContentItem.toString());
            }
        }

        return stringBuilder.toString();
    }
}
