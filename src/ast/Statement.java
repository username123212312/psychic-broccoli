package ast;

import ast.compundStmt.CompoundStatement;

import java.util.List;

public class Statement extends ASTNode {

    private List<CompoundStatement> compoundStatements;

    public Statement(int line_number, List<CompoundStatement> compoundStatements) {
        super("Statement", line_number);
        this.compoundStatements = compoundStatements;

        if (compoundStatements != null) {
            this.children.addAll(compoundStatements);
        }
    }
}
