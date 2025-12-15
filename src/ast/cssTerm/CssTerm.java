package ast.cssTerm;

import ast.ASTNode;

public abstract class CssTerm extends ASTNode {
    public CssTerm(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
