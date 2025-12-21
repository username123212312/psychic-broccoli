package ast.functionDef;

import ast.ASTNode;

import java.util.List;

public class FunctionParameters extends ASTNode {
    private List<FunctionParameter> parameters;

    public FunctionParameters(int line_number, List<FunctionParameter> parameters) {
        super("FunctionParameters", line_number);
        this.parameters = parameters;
    }
}
