package ast.argument;

import ast.compundStmt.PythonExpression;

public class KeywordArgument extends Argument {
    private String argName;

    public KeywordArgument(int line_number) {
        super("KeywordArgument", line_number);
    }

    public void setArgName(String argName) {
        this.argName = argName;
    }

    @Override
    public String toString() {
        return argName + " = " + super.getArg().toString();
    }
}
