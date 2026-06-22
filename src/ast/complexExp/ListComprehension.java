package ast.complexExp;

import ast.atom.Atom;
import ast.condition.Condition;
import ast.compundStmt.ForLoop;
import cpython_bytecode.codegen.CodegenContext;

public class ListComprehension extends ComplexExpression {
    private ForLoop forLoop;

    public ListComprehension(int line_number) {
        super("ListComprehension", line_number);
    }

    public void setForLoop(ForLoop forLoop) {
        this.forLoop = forLoop;
    }

    public ForLoop getForLoop() {
        return forLoop;
    }

    @Override
    public String symbolTablePrint() {
        return " [ " + forLoop.symbolTablePrint() + " ] ";
    }

    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (forLoop == null) {
            ctx.emitBuildList(0);
            return;
        }

        Atom yieldAtom = forLoop.getYieldExpr();
        Atom loopVarAtom = forLoop.getVar();
        Condition condition = forLoop.getCondition();
        String loopVarName = loopVarAtom instanceof ast.atom.Name n
            ? (String) n.getValue() : null;

        // Build result list before loading iterable, so result is below iterator on stack
        ctx.emitBuildList(0);

        // Load the iterable and get iterator
        forLoop.getIter().generateBytecode(ctx);
        ctx.emitGetIter();

        // Loop
        String loopLabel = ctx.newLabel();
        String endLabel = ctx.newLabel();
        ctx.markLabel(loopLabel);

        // FOR_ITER jumps to endLabel when exhausted (pops iterator)
        ctx.emitForIter(endLabel);

        // Store loop variable
        if (loopVarName != null) {
            ctx.storeVariable(loopVarName);
        }

        if (condition != null) {
            String skipAppend = ctx.newLabel();
            condition.generateBytecode(ctx);
            ctx.emitPopJumpIfFalse(skipAppend);
            if (yieldAtom != null) {
                ctx.emitAtom(yieldAtom);
            } else {
                int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
                ctx.emitLoadConst(noneIdx);
            }
            ctx.emitListAppend(2);
            ctx.markLabel(skipAppend);
        } else {
            if (yieldAtom != null) {
                ctx.emitAtom(yieldAtom);
            } else {
                int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
                ctx.emitLoadConst(noneIdx);
            }
            ctx.emitListAppend(2);
        }

        ctx.emitJumpBackward(loopLabel);
        ctx.markLabel(endLabel);

        // Python 3.12+: FOR_ITER on exhaustion pushes None (sentinel) and jumps.
        // END_FOR pops the None sentinel; POP_ITER pops the iterator.
        // After cleanup, only the result list remains on TOS.
        ctx.emitEndFor();
        ctx.emitPopIter();
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + forLoop.toString() + " ) ";
    }
}
