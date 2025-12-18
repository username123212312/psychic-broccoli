package ast.jinjaArg;

import ast.jinja.JinjaExpression;

public class JinjaKeywordArgument extends JinjaArgument {
    private final String id;
    private final JinjaExpression jinjaExpression;

    public JinjaKeywordArgument(int line_number, String id, JinjaExpression jinjaExpression) {
        super("JinjaKeywordArgument", line_number);
        this.id = id;
        this.jinjaExpression = jinjaExpression;
    }
}
