package ast.argsList;

import ast.ASTNode;

import java.util.List;

public abstract class ArgumentsList extends ASTNode {
    public ArgumentsList(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
