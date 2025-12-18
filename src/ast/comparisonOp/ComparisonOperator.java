package ast.comparisonOp;

import ast.ASTNode;

public class ComparisonOperator extends ASTNode {
    private String operator;

    public ComparisonOperator(String node_name, int line_number, String operator) {
        super(node_name, line_number);
        this.operator = operator;
    }
}
