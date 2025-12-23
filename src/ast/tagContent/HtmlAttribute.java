package ast.tagContent;

import ast.ASTNode;

public class HtmlAttribute extends TagContent {
    private String attributeName;
    private String attributeValue;

    public HtmlAttribute(int line_number, String attributeName, String attributeValue) {
        super("TagContent", line_number);
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }
    @Override
    public String toString() {
        return "HtmlAttribute " + attributeName + "=\"" + attributeValue + "\"";
    }

}
