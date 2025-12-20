package ast.jinja.jinjaCallExpr.JinjaAtom;

public class JinjaTrueAtom extends JinjaAtom{
    private final boolean value = true;

    public JinjaTrueAtom( int line_number , boolean value) {
        super("JinjaTrueAtom node ", line_number);
    }

    public boolean getValue() {
        return value;
    }

}
