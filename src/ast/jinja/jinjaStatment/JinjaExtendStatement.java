package ast.jinja.jinjaStatment;

public class JinjaExtendStatement extends JinjaStmtItem{
    private String extended;

    public JinjaExtendStatement(int line_number, String extended) {
        super("JinjaExtendStatement", line_number);
        this.extended = extended;
    }
}
