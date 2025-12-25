package ast.htmlElement;

import ast.tagContent.TagContent;

import java.util.List;

public class TagElement extends HtmlElementItem{
    private List<TagContent> tags;
    public TagElement(int line_number) {
        super("TagElement", line_number);
    }

    public void setTags(List<TagContent> tags) {
        this.tags = tags;
    }
}
