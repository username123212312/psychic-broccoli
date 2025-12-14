package ast.arithmeticExpr;

import ast.compundStmt.PythonExpression;

public class Subtraction extends ArithmeticExpression {
    public Subtraction(int line_number, PythonExpression left, PythonExpression right) {
        super("Subtraction", line_number, left, right,'-');
    }
}
