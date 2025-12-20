package ast.complexExp;

import ast.compundStmt.ForLoop;

public class Generator extends ComplexExpression{
    private ForLoop forLoop;
    public Generator(int line_number, ForLoop forLoop) {
        super("Generator", line_number);
        this.forLoop = forLoop;
    }
}
