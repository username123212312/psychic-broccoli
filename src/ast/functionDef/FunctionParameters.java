package ast.functionDef;

import ast.ASTNode;

import java.util.List;

public class FunctionParameters extends ASTNode {
    List<FunctionParameter> parameters;

    public FunctionParameters(String node_name, int line_number) {
        super(node_name, line_number);
    }
}
