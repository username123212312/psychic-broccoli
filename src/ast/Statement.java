package ast;

import ast.compundStmt.CompoundStatement;

import java.util.List;

public class Statement extends ASTNode {

    private List<CompoundStatement> compoundStatements;
    private boolean isPass = false;

    public Statement(int line_number, List<CompoundStatement> compoundStatements) {
        super("Statement", line_number);
        this.compoundStatements = compoundStatements;
    }

    @Override
    public String toString() {
        if (isPass) {
            return "PassStatement";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (CompoundStatement compoundStatement : compoundStatements) {
            stringBuilder.append(compoundStatement == null ? "Null"
                    : compoundStatement.toString());
        }
        return stringBuilder.toString();
    }
}
