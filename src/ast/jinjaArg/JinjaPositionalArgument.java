package ast.jinjaArg;

import ast.jinja.JinjaExpression;

public class JinjaPositionalArgument extends JinjaArgument {
    private JinjaExpression jinjaExpression;

    public JinjaPositionalArgument(int line_number) {
        super("JinjaPositionalArgument", line_number);
    }
}
