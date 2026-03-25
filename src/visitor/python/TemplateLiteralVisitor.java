package visitor.python;

import antlr.python.PythonParser;
import antlr.python.PythonParserBaseVisitor;
import ast.TemplateLiteral;

public class TemplateLiteralVisitor extends PythonParserBaseVisitor<TemplateLiteral> {

    @Override
    public TemplateLiteral visitTemplateLiteral(PythonParser.TemplateLiteralContext ctx) {
        return super.visitTemplateLiteral(ctx);
    }
}
