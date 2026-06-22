package ast.tagContent;

import ast.ASTNode;

public class TagElementItem extends ASTNode {
    private String attributeName;
    private String attributeValue;

    public TagElementItem(int line_number) {
        super("TagContent", line_number);
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    @Override
    public String generateCode() {
        if (attributeName != null && !attributeName.isEmpty()) {
            if (attributeValue != null) {
                // بنشيل علامات التنصيص الموجودة أصلاً عشان ما تتكرر
                String val = attributeValue.replace("\"", "");
                return attributeName + "=\"" + val + "\"";
            } else {
                return attributeName;
            }
        }
        return "";
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
