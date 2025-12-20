package ast.jinja.jinjaCallExpr.JinjaAtom;

public class JinjaNumberAtom extends JinjaAtom{
    private int value;

    public JinjaNumberAtom( int line_number , int value) {
        super("JinjaNumberAtom node ", line_number);
        this.value = value;
    }
}
