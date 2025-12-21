package ast.jinja.jinjaCallExpr.JinjaAtom;

public class JinjaStringAtom extends JinjaAtom{

    private String value;

    public JinjaStringAtom( int line_number , String value) {
        super("JinjaStringAtom node ", line_number);
        this.value = value;
    }
}
