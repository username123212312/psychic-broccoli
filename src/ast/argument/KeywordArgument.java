package ast.argument;

import ast.compundStmt.PythonExpression;

public class KeywordArgument extends Argument {
    private String argName;

    public KeywordArgument(int line_number, PythonExpression arg, String argName) {
        super("KeywordArgument", line_number, arg);
        this.argName = argName;
    }
}
