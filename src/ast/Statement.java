package ast;

import ast.compundStmt.CompoundStatement;

import java.util.List;

public class Statement extends ASTNode{

    private List<CompoundStatement> compoundStatements;

    public Statement(String node_name, int line_number) {
        super("Statement", line_number);
    }
}
