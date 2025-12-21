package ast.jinja.jinjaCallExpr.JinjaAtom;

public class JinjaNameAtom extends JinjaAtom{

    private String value;

    public JinjaNameAtom( int line_number , String value) {
        super("JinjaNameAtom node ", line_number);
        this.value = value;
    }
}
