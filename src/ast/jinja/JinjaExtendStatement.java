package ast.jinja;

public class JinjaExtendStatement extends JinjaStatement {
    private String extended;

    public JinjaExtendStatement(int line_number) {
        super("JinjaExtendStatement", line_number);
    }
}
