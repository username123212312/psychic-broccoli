package ast.argument;

import ast.compundStmt.PythonExpression;

public class PositionalArgument extends Argument {

    public PositionalArgument(int line_number) {
        super("PositionalArgument", line_number);
    }
}
