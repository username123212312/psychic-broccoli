package ast.arithmeticExpr;

import ast.compundStmt.PythonExpression;
import ast.simpleExpr.SimpleExpression;

public abstract class ArithmeticExpression extends SimpleExpression {
    private PythonExpression left;
    private PythonExpression right;
    private Character operator;

    public ArithmeticExpression(String node_name, int line_number,
                                PythonExpression left, PythonExpression right, Character operator) {
        super(node_name, line_number);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }
}
