package ast.functionDef;

import ast.ASTNode;
import ast.Statement;

public class FunctionDefinition extends ASTNode {
    private Decorator decorator;
    private String functionName;
    private FunctionParameters functionParameters;
    private Statement functionBody;

    public FunctionDefinition(int line_number, String functionName, Statement functionBody) {
        super("FunctionDefinition", line_number);
        this.functionName = functionName;
        this.functionBody = functionBody;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public void setFunctionParameters(FunctionParameters functionParameters) {
        this.functionParameters = functionParameters;
    }
}
