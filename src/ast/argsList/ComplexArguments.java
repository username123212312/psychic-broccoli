package ast.argsList;

import ast.argument.Argument;

import java.util.List;

public class ComplexArguments extends ArgumentsList {
    private List<Argument> arguments;
    public ComplexArguments(int line_number, List<Argument> arguments) {
        super("ComplexArguments", line_number);
        this.arguments = arguments;
    }
}
