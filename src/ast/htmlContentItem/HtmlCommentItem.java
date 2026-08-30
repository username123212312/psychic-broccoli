package ast.htmlContentItem;

public class HtmlCommentItem extends HtmlContentItem {
    private String comment;

    public HtmlCommentItem(int line_number) {
        super("HtmlCommentItem", line_number);
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String generateCode() {
        return (comment != null) ? comment : "";
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + comment + " ) ";
    }
}