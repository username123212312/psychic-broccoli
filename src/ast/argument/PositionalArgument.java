package ast.argument;

import ast.compundStmt.PythonExpression;

public class PositionalArgument extends Argument {

    public PositionalArgument(int line_number, PythonExpression arg) {
        super("PositionalArgument", line_number, arg);
    }
}
