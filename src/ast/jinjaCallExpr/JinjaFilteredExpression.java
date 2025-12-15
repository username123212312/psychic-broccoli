package ast.jinjaCallExpr;

public class JinjaFilteredExpression extends JinjaCallExpression{
    private JinjaVariableAccess jinjaVariableAccess;
    private String filterName;
    public JinjaFilteredExpression(String node_name, int line_number, JinjaVariableAccess jinjaVariableAccess) {
        super(node_name, line_number);
        this.jinjaVariableAccess = jinjaVariableAccess;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }
}
