package ast.complexExp;

import ast.compundStmt.ForLoop;

public class ListComprehension extends ComplexExpression{
    private ForLoop forLoop;
    public ListComprehension(int line_number) {
        super("ListComprehension", line_number);
    }
}
