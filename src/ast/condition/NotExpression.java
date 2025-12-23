package ast.condition;

import ast.Consts;
import ast.compundStmt.PythonExpression;

public class NotExpression extends Condition{
    private PythonExpression pythonExpression;
    public NotExpression(int line_number) {
        super("NotExpression", line_number);
    }

    public void setPythonExpression(PythonExpression pythonExpression) {
        this.pythonExpression = pythonExpression;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(Consts.printIndent(1))
                .append(pythonExpression.toString());
        return stringBuilder.toString();
    }
}
