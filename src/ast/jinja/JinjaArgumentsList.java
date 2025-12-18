package ast.jinja;

import ast.ASTNode;
import ast.jinjaArg.JinjaArgument;

import java.util.List;

public class JinjaArgumentsList extends ASTNode {
    private List<JinjaArgument> arguments;
    public JinjaArgumentsList(int line_number, List<JinjaArgument> arguments) {
        super("JinjaArgumentsList", line_number);
        this.arguments = arguments;
    }
}
