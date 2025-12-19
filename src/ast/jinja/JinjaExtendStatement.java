package ast.jinja;

public class JinjaExtendStatement extends JinjaStatement {
    private String extended;

    public JinjaExtendStatement(int line_number, String extended) {
        super("JinjaExtendStatement", line_number);
        this.extended = extended;
    }
}
