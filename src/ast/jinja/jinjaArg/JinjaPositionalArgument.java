package ast.jinja.jinjaArg;

import ast.jinja.JinjaExprItem;

public class JinjaPositionalArgument extends JinjaArgument {
    private JinjaExprItem jinjaExpression;

    public JinjaPositionalArgument(int line_number) {
        super("JinjaPositionalArgument", line_number);
    }
}
