package ast.htmlElement;

import ast.htmlContentItem.HtmlContentItem;
import ast.tagContent.TagContent;

import java.util.List;

public class TagElement extends HtmlElementItem{
    private List<TagContent> tags;
    private List<HtmlContentItem> body;
    public TagElement(int line_number, List<TagContent> tags , List<HtmlContentItem> body) {
        super("TagElement", line_number);
        this.tags = tags;
        this.body = body;
    }
}
