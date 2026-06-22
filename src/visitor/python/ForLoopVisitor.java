package visitor.python;

import antlr.python.PythonParser;
import antlr.python.PythonParserBaseVisitor;
import ast.Statement;
import ast.atom.Atom;
import ast.compundStmt.ForLoop;
import ast.compundStmt.PythonExpression;
import ast.condition.Condition;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableManager;

public class ForLoopVisitor extends PythonParserBaseVisitor<ForLoop> {
    AtomVisitor atomVisitor = new AtomVisitor();
    PythonExpressionVisitor pythonExpressionVisitor = new PythonExpressionVisitor();
    private final SymbolTable symbolTable = SymbolTableManager.INSTANCE.getSymbolTable();


    @Override
    public ForLoop visitSimpleForLoop(PythonParser.SimpleForLoopContext ctx) {
        ForLoop forLoop = new ForLoop(ctx.getStart().getLine());
        symbolTable.enterTemporaryScope("for", forLoop);
        try {
            Atom atom = atomVisitor.visit(ctx.atom());
            PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
            Statement statement = new StatementVisitor().visit(ctx.statement());
            forLoop.setStatement(statement);
            forLoop.setVar(atom);
            forLoop.setIter(pythonExpression);
        } finally {
            symbolTable.exitScope();
        }
        return forLoop;
    }

    @Override
    public ForLoop visitComplexForLoop(PythonParser.ComplexForLoopContext ctx) {
        ForLoop forLoop = new ForLoop(ctx.getStart().getLine());
        symbolTable.enterTemporaryScope("for", forLoop);
        try {
            // atom(0) = yield expression (before 'for'), atom(1) = loop variable (after 'for')
            Atom yieldAtom = atomVisitor.visit(ctx.atom(0));
            Atom loopAtom = atomVisitor.visit(ctx.atom(1));
            PythonExpression pythonExpression = pythonExpressionVisitor.visit(ctx.python_expr());
            forLoop.setYieldExpr(yieldAtom);
            forLoop.setVar(loopAtom);
            forLoop.setIter(pythonExpression);
            if (ctx.condition() != null) {
                Condition condition = new ConditionVisitor().visit(ctx.condition());
                forLoop.setCondition(condition);
            }
        } finally {
            symbolTable.exitScope();
        }
        return forLoop;
    }

}
