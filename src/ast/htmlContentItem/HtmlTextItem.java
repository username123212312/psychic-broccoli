package ast.htmlContentItem;

public class HtmlTextItem extends HtmlContentItem {
    private String text;

    public HtmlTextItem(int line_number, String text) {
        super("HtmlTextItem", line_number);
        this.text = text;
    }
<<<<<<< HEAD
    @Override
    public String toString() {
        return "HtmlTextItem \"" + text + "\"";
    }

=======
>>>>>>> origin/raghad
}
