package ast.condition;

import ast.compundStmt.PythonExpression;

public class NotExpression extends Condition{
    private PythonExpression pythonExpression;
    public NotExpression(int line_number) {
        super("NotExpression", line_number);
    }

    public void setPythonExpression(PythonExpression pythonExpression) {
        this.pythonExpression = pythonExpression;
    }
}
