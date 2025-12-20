package ast.jinja.jinjaCallExpr;

import ast.jinja.JinjaArgumentsList;

public class JinjaFunctionCall extends JinjaCallExpression {
    private JinjaArgumentsList argumentsList;
    private String functionName;
    public JinjaFunctionCall(int line_number, String functionName) {
        super("JinjaFunctionCall", line_number);
        this.functionName = functionName;
    }

    public void setArgumentsList(JinjaArgumentsList argumentsList) {
        this.argumentsList = argumentsList;
    }
}
