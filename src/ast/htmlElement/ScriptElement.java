package ast.htmlElement;

public class ScriptElement extends HtmlElementItem {
    private String scriptBody;

    public ScriptElement(int line_number, String scriptBody) {
        super("ScriptElement", line_number);
        this.scriptBody = scriptBody;
    }
}
