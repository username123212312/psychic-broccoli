package ast.functionDef;

import ast.Consts;
import ast.Statement;
import ast.compundStmt.CompoundStatement;

public class FunctionDefinition extends CompoundStatement {
    private Decorator decorator;
    private String functionName;
    private FunctionParameters functionParameters;
    private Statement functionBody;

    public FunctionDefinition(int line_number) {
        super("FunctionDefinition", line_number);
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    public Decorator getDecorator() {
        return decorator;
    }

    public void setFunctionParameters(FunctionParameters functionParameters) {
        this.functionParameters = functionParameters;
    }

    public FunctionParameters getFunctionParameters() {
        return functionParameters;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionBody(Statement functionBody) {
        this.functionBody = functionBody;
    }

    public Statement getFunctionBody() {
        return functionBody;
    }

    @Override
    public String toString() {
        return super.toString() + "( " + (decorator == null ? "" : decorator.toString())
                + functionName + "(" + functionParameters.toString() + ") ) "
                + Consts.printIndent(2) + functionBody.toString()
                ;
    }

    @Override
    public String generateCode() {
        return "";
    }
}
