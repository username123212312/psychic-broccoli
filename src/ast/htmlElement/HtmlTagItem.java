package ast.htmlElement;

import ast.htmlContentItem.HtmlContentItem;
import ast.tagContent.HtmlAttribute;

import java.util.List;

public class HtmlTagItem extends HtmlElementItem {

    private String tagName;
    private List<HtmlAttribute> attributes;
    private List<HtmlContentItem> children;

    public HtmlTagItem(
            int line_number,
            String tagName,
            List<HtmlAttribute> attributes,
            List<HtmlContentItem> children
    ) {
        super("HtmlTagItem", line_number);
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }
    public List<HtmlAttribute> getAttributes() {
        return attributes;
    }

    public List<HtmlContentItem> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "HtmlTagItem "+ tagName ;
    }
}
