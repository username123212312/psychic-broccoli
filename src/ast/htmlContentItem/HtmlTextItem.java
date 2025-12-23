package ast.htmlContentItem;

public class HtmlTextItem extends HtmlContentItem {
    private String text;

    public HtmlTextItem( String text ,int line_number) {
        super("HtmlTextItem", line_number);
        this.text = text;
    }

    @Override
    public String toString() {
        return super.node_name + " \"" + text + "\"";
    }

}
