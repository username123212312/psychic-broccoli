package ast.arithmeticExpr;

import ast.compundStmt.PythonExpression;

public class Multiplication extends ArithmeticExpression {
    public Multiplication(int line_number, PythonExpression left, PythonExpression right) {
        super("Multiplication", line_number, left, right,'*');
    }
}
