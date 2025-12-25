package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.atom.Atom;
import ast.compundStmt.ForLoop;
import ast.compundStmt.PythonExpression;
import ast.condition.Condition;

public class ForLoopVisitor extends JinjaFlaskParserBaseVisitor<ForLoop> {
    AtomVisitor atomVisitor = new AtomVisitor();
    PythonExpressionVisitor pythonExpressionVisitor = new PythonExpressionVisitor();

    @Override
    public ForLoop visitSimpleForLoop(JinjaFlaskParser.SimpleForLoopContext ctx) {
        ForLoop forLoop = new ForLoop(ctx.getStart().getLine());
        Atom atom = atomVisitor.visit(ctx.atom());
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        forLoop.setVar(atom);
        forLoop.setIter(pythonExpression);
        return forLoop;
    }

    @Override
    public ForLoop visitComplexForLoop(JinjaFlaskParser.ComplexForLoopContext ctx) {
        ForLoop forLoop = new ForLoop(ctx.getStart().getLine());
        Atom atom = atomVisitor.visit(ctx.atom(0));
        PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
        forLoop.setVar(atom);
        forLoop.setIter(pythonExpression);
        if (ctx.condition() != null) {
            Condition condition = new ConditionVisitor().visit(ctx.condition());
            forLoop.setCondition(condition);
        }
        return forLoop;
    }

}
