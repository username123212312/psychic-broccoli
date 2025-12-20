package ast.jinja.jinjaArg;

import ast.jinja.JinjaExprItem;

public class JinjaKeywordArgument extends JinjaArgument {
    private final String id;
    private final JinjaExprItem jinjaExpression;

    public JinjaKeywordArgument(int line_number, String id, JinjaExprItem jinjaExpression) {
        super("JinjaKeywordArgument", line_number);
        this.id = id;
        this.jinjaExpression = jinjaExpression;
    }
}
