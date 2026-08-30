package ast.complexExp;

import ast.compundStmt.PythonExpression;

import java.util.List;

public class ListItems extends ComplexExpression {
    private List<PythonExpression> items;

    public ListItems(int line_number) {
        super("ExpressionList", line_number);
    }

    public void setItems(List<PythonExpression> items) {
        this.items = items;
    }

    public List<PythonExpression> getItems() {
        return items;
    }
}
