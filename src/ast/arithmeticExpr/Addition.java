package ast.arithmeticExpr;

import ast.compundStmt.PythonExpression;

public class Addition extends ArithmeticExpression {
    public Addition(int line_number, PythonExpression left, PythonExpression right) {
        super("Addition", line_number, left, right, '+');
    }
}
