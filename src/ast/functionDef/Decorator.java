package ast.functionDef;

import ast.ASTNode;
import ast.argsList.ArgumentsList;

public class Decorator extends ASTNode {
    private String decoratorName;
    private ArgumentsList arguments;

    public Decorator(int line_number, String decoratorName, ArgumentsList arguments) {
        super("Decorator", line_number);
        this.decoratorName = decoratorName;
        this.arguments = arguments;
    }
}
