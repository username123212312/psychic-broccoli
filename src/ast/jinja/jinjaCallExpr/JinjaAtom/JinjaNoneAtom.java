package ast.jinja.jinjaCallExpr.JinjaAtom;

public class JinjaNoneAtom extends JinjaAtom{
    private String value;

    public JinjaNoneAtom( int line_number , String value) {
        super("JinjaNoneAtom node ", line_number);
        this.value = value;
    }
}
