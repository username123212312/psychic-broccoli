package ast.htmlContentItem;

public class HtmlTextItem extends HtmlContentItem {
    private String text;

    public HtmlTextItem(int line_number) {
        super("HtmlTextItem", line_number);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + text + " ) ";
    }
}
