package ast;

import java.util.List;

public class Program extends ASTNode{

    private List<Statement> statements;

    public Program(int line_number, List<Statement> statements) {
        super("Program", line_number);
        this.statements = statements;
    }

}
