package ast.htmlElement;

import ast.Consts;
import ast.tagContent.TagContent;

import java.util.List;

public class TagElement extends HtmlElementItem {
    private List<TagContent> tags;

    public TagElement(int line_number) {
        super("TagElement", line_number);
    }

    public void setTags(List<TagContent> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (tags != null) {
            for (TagContent tagContent : tags) {
                if (tagContent != null) {
                    stringBuilder.append(Consts.printIndent(3)).append(tagContent);
                }
            }
        }
        return stringBuilder.toString();
    }
}
