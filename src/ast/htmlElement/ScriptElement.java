package ast.htmlElement;

public class ScriptElement extends HtmlElement {
    private String scriptBody;

    public ScriptElement(int line_number) {
        super("ScriptElement", line_number);
    }

    public void setScriptBody(String scriptBody) {
        this.scriptBody = scriptBody;
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + scriptBody + " ) ";
    }
}
