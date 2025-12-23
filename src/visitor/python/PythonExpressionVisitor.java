package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.AtomComplexExpression;
import ast.atom.Atom;
import ast.complexExp.ComplexExpression;
import ast.compundStmt.PythonExpression;

import java.util.ArrayList;
import java.util.List;

public class PythonExpressionVisitor extends JinjaFlaskParserBaseVisitor<PythonExpression> {
    private ComplexExpressionVisitor complexExpressionVisitor = new ComplexExpressionVisitor();

    @Override
    public PythonExpression visitComplexExpression(JinjaFlaskParser.ComplexExpressionContext ctx) {
        return complexExpressionVisitor.visit(ctx.complex_expr());
    }

    @Override
    public PythonExpression visitAtomComplexExpression(JinjaFlaskParser.AtomComplexExpressionContext ctx) {
        AtomComplexExpression atomComplexExpression = new AtomComplexExpression(ctx.getStart().getLine());
        Atom atom = new AtomVisitor().visit(ctx.atom());
        List<ComplexExpression> complexExpressionList = new ArrayList<>();
        for (JinjaFlaskParser.Complex_exprContext complexExprContext : ctx.complex_expr()) {
            ComplexExpression complexExpression = complexExpressionVisitor.visit(complexExprContext);
            complexExpressionList.add(complexExpression);
        }
        atomComplexExpression.setComplexExpressionList(complexExpressionList);

        return atomComplexExpression;
    }
}
