package ast.htmlElement;

import ast.tagContent.TagContent;

import java.util.List;

public class TagElement extends HtmlElementItem{
    private List<TagContent> tags;
    public TagElement(int line_number, List<TagContent> tags) {
        super("TagElement", line_number);
        this.tags = tags;
    }
}
