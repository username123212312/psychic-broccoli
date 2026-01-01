package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.compundStmt.PythonExpression;


public class PythonExpressionVisitor extends JinjaFlaskParserBaseVisitor<PythonExpression> {
    private final ComplexExpressionVisitor complexExpressionVisitor = new ComplexExpressionVisitor();

    @Override
    public PythonExpression visitComplexExpression(JinjaFlaskParser.ComplexExpressionContext ctx) {
        return complexExpressionVisitor.visit(ctx.complex_expr());
    }

    @Override
    public PythonExpression visitAtomComplexExpression(JinjaFlaskParser.AtomComplexExpressionContext ctx) {
        AtomExpressionVisitor atomExpressionVisitor = new AtomExpressionVisitor();
        return atomExpressionVisitor.visit(ctx.atom_expr());
    }

}
