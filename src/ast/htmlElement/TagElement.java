package ast.htmlElement;

import ast.Consts;
import ast.htmlContentItem.HtmlContentItem;
import ast.tagContent.TagElementItem;
import ast.ASTNode;

import java.util.List;
import java.util.Locale;

public class TagElement extends HtmlElement {
    private List<TagElementItem> tags;
    private String tagName;
    private boolean selfClosing = false;

    public TagElement(int line_number) {
        super("TagElement", line_number);
    }

    public void setTags(List<TagElementItem> tags) {
        this.tags = tags;
    }

    public List<TagElementItem> getTags() {
        return tags;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public boolean isSelfClosing() {
        return selfClosing;
    }

    public void addChild(ASTNode child) {
        if (child != null) {
            this.children.add(child);
        }
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    public String getTagName() {
        return tagName;
    }

    private boolean isClosingTag = false; // ضيف هذا المتغير فوق مع الـ tagName

    public void setClosingTag(boolean closingTag) {
        isClosingTag = closingTag;
    }

    @Override
    public String generateCode() {
        StringBuilder builder = new StringBuilder();

        if (isClosingTag) {
            // إذا كان وسم إغلاق يطبع فقط </name>
            builder.append("</").append(tagName).append(">");
        } else {
            // إذا كان وسم فتح يطبع <name attrs>
            builder.append("<").append(tagName);
            if (tags != null) {
                for (TagElementItem attr : tags) {
                    if (attr != null) {
                        builder.append(" ").append(attr.generateCode());
                    }
                }
            }
            if (isSelfClosing()) {
                builder.append(" />");
            } else {
                builder.append(">");
            }
        }
        return builder.toString();
    }



    private static boolean isVoidElement(String name) {
        if (name == null) return false;
        switch (name.toLowerCase(Locale.ROOT)) {
            case "area":
            case "base":
            case "br":
            case "col":
            case "embed":
            case "hr":
            case "img":
            case "input":
            case "link":
            case "meta":
            case "param":
            case "source":
            case "track":
            case "wbr":
                return true;
            default:
                return false;
        }
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" [Tag: ").append(tagName).append("]");

        if (tags != null) {
            for (TagElementItem tagElementItem : tags) {
                if (tagElementItem != null) {
                    stringBuilder.append(Consts.printIndent(3)).append(tagElementItem);
                }
            }
        }
        return stringBuilder.toString();
    }
}
