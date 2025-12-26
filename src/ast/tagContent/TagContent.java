package ast.tagContent;

import ast.ASTNode;

public class TagContent extends ASTNode {
    private String attributeName;
    private String attributeValue;

    public TagContent(int line_number) {
        super("TagContent", line_number);
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        if (!attributeName.isEmpty()) {
            return "Tag [ " + super.line_number + " ] " + attributeName
                    + (attributeValue == null ? "" : (" = " + attributeValue));
        } else {
            return "";
        }
    }
}
