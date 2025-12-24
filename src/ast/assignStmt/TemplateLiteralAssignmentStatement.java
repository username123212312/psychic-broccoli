package ast.assignStmt;

import ast.TemplateLiteral;
import ast.compundStmt.PythonExpression;

public class TemplateLiteralAssignmentStatement extends AssignmentStatement {

    private TemplateLiteral templateLiteral;
    public TemplateLiteralAssignmentStatement(int line_number) {
        super("TemplateLiteralAssignmentStatement", line_number);
    }

    public void setTemplateLiteral(TemplateLiteral templateLiteral) {
        this.templateLiteral = templateLiteral;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TemplateLiteral [Line: ").append(this.line_number).append("] (templateLiteral:" + templateLiteral + ")");
        return sb.toString();
    }
}
