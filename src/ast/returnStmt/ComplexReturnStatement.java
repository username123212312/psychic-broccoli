package ast.returnStmt;

import ast.ASTNode;
import ast.compundStmt.PythonExpression;

public class ComplexReturnStatement extends ReturnStatement {
    private ASTNode expression;

    public ComplexReturnStatement(int line_number) {
        super("ComplexReturnStatement", line_number);
    }

    public void setPythonExpression(PythonExpression pythonExpression) {
        this.expression = pythonExpression;
    }

    public PythonExpression getPythonExpression() {
        return expression instanceof PythonExpression ? (PythonExpression) expression : null;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }

    public ASTNode getExpression() {
        return expression;
    }


    @Override
    public String toString() {
        return super.toString() + expression.toString();
    }
}
