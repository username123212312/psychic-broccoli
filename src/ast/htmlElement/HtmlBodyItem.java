package ast.htmlElement;

import ast.Consts;
import ast.htmlContentItem.HtmlContentItem;

import java.util.List;

public class HtmlBodyItem extends HtmlElementItem {
    private List<HtmlContentItem> contentItems;

    public HtmlBodyItem(int line_number, List<HtmlContentItem> contentItems) {
        super("Html Body ", line_number);
        this.contentItems = contentItems;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for (HtmlContentItem htmlContentItem : contentItems) {
            stringBuilder.append(Consts.printIndent(2)).append(htmlContentItem.toString());
        }
        return stringBuilder.toString();
    }
}
