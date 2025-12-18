package ast.arithmeticExpr;

import ast.compundStmt.PythonExpression;

public class Division extends ArithmeticExpression {
    public Division(int line_number, PythonExpression left, PythonExpression right) {
        super("Division", line_number, left, right,'/');
    }
}
