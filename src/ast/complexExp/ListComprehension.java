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

        ctx.pushFunctionScope("<listcomp>", ctx.getFilename(), line_number, false);
        ctx.addVarName(".0");
        ctx.getCodeObject().co_argcount = 1;

        ctx.emitResume(0);

        ctx.emitBuildList(0);

        int dotZeroIdx = 0;
        ctx.emitLoadFast(dotZeroIdx);
        ctx.emitGetIter();

        String startLabel = ctx.newLabel();
        String endLabel = ctx.newLabel();
        ctx.markLabel(startLabel);
        ctx.emitForIter(endLabel);

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
            ctx.emitListAppend(1);
            ctx.markLabel(skipAppend);
        } else {
            if (yieldAtom != null) {
                ctx.emitAtom(yieldAtom);
            } else {
                int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
                ctx.emitLoadConst(noneIdx);
            }
            ctx.emitListAppend(1);
        }

        ctx.emitJumpBackward(startLabel);
        ctx.markLabel(endLabel);

        ctx.emitReturnValue();

        ctx.saveFunctionAndEmit(false);

        forLoop.getIter().generateBytecode(ctx);
        ctx.emitGetIter();
        ctx.emitCall(1);
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + forLoop.toString() + " ) ";
    }
}
