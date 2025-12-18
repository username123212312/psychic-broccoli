package ast.returnStmt;

import ast.compundStmt.PythonExpression;

public class ComplexReturnStatement extends ReturnStatement{
    private PythonExpression pythonExpression;

    public ComplexReturnStatement(int line_number, PythonExpression pythonExpression) {
        super("ComplexReturnStatement", line_number);
        this.pythonExpression = pythonExpression;
    }
}
