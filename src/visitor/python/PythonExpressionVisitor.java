package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.compundStmt.PythonExpression;

public class PythonExpressionVisitor extends JinjaFlaskParserBaseVisitor<PythonExpression> {
    @Override
    public PythonExpression visitComplexExpression(JinjaFlaskParser.ComplexExpressionContext ctx) {
        return super.visitComplexExpression(ctx);
    }

    @Override
    public PythonExpression visitAtomComplexExpression(JinjaFlaskParser.AtomComplexExpressionContext ctx) {
        return super.visitAtomComplexExpression(ctx);
    }
}
