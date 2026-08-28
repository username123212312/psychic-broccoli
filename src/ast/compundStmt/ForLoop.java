package ast.compundStmt;

import ast.Consts;
import ast.Statement;
import ast.atom.Atom;
import ast.condition.Condition;

public class ForLoop extends CompoundStatement {
    private Atom var;
    private PythonExpression iter;
    private Condition condition;
    private Statement statement;
    private Atom yieldExpr;  // For comprehensions: the expression before 'for'

    public ForLoop(int line_number) {
        super("ForLoop", line_number);
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void setVar(Atom var) {
        this.var = var;
    }

    public void setIter(PythonExpression iter) {
        this.iter = iter;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Atom getVar() {
        return var;
    }

    public PythonExpression getIter() {
        return iter;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setYieldExpr(Atom yieldExpr) {
        this.yieldExpr = yieldExpr;
    }

    public Atom getYieldExpr() {
        return yieldExpr;
    }

    @Override
    public String symbolTablePrint() {
        return "for " +
                var.toString() + " in " +
                iter.symbolTablePrint() + (condition == null ? ""
                : " if " + condition.symbolTablePrint()) + (statement == null ? "" : Consts.printIndent(2) + statement.symbolTablePrint());
    }


    @Override
    public String toString() {
        return super.toString() +
                (var == null ? "" : " ( " + var.toString() + " in " +
                        iter.toString() + (condition == null ? ""
                        : condition.toString()) + " ) " + (statement == null ? "" : " : " + Consts.printIndent(2) + statement));
    }
}
