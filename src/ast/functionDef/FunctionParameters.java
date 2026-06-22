package ast.functionDef;

import ast.ASTNode;

import java.util.List;

public class FunctionParameters extends ASTNode {
    private List<FunctionParameter> parameters;

    public FunctionParameters(int line_number) {
        super("FunctionParameters", line_number);
    }

    public void setParameters(List<FunctionParameter> parameters) {
        this.parameters = parameters;
    }

    public List<FunctionParameter> getParameters() {
        return parameters;
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (FunctionParameter functionParameter : parameters) {
            stringBuilder.append(functionParameter).append((parameters
                    .indexOf(functionParameter) == parameters.size() - 1) ? "" : ",");
        }
        return stringBuilder.toString();
    }
}
