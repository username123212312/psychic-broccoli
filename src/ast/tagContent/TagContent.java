package ast.tagContent;

import ast.ASTNode;

public class TagContent extends ASTNode {
    private String attributeName;
    private String attributeValue;

    public TagContent(int line_number, String attributeName, String attributeValue) {
        super("TagContent", line_number);
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }
}
