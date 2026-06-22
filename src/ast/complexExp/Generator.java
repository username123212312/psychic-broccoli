package ast.complexExp;

import ast.atom.Atom;
import ast.condition.Condition;
import ast.compundStmt.ForLoop;
import cpython_bytecode.PythonOpCode;
import cpython_bytecode.codegen.CodegenContext;

public class Generator extends ComplexExpression{
    private ForLoop forLoop;
    public Generator(int line_number) {
        super("Generator", line_number);
    }

    public void setForLoop(ForLoop forLoop) {
        this.forLoop = forLoop;
    }

    public ForLoop getForLoop() {
        return forLoop;
    }

    @Override
    public String symbolTablePrint() {
        return  " ( " + forLoop.symbolTablePrint() + " ) ";
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

        ctx.pushFunctionScope("<genexpr>", ctx.getFilename(), line_number, false);
        ctx.getCodeObject().co_flags = 0x23;
        ctx.addVarName(".0");
        ctx.getCodeObject().co_argcount = 1;

        ctx.emitReturnGenerator();
        ctx.emitPopTop();

        // Entry point for generator execution
        ctx.emitResume(0);

        int dotZeroIdx = 0;
        ctx.emitLoadFast(dotZeroIdx);

        String startLabel = ctx.newLabel();
        String endLabel = ctx.newLabel();
        ctx.markLabel(startLabel);
        ctx.emitForIter(endLabel);

        if (loopVarName != null) {
            ctx.storeVariable(loopVarName);
        }

        if (condition != null) {
            String skipYield = ctx.newLabel();
            condition.generateBytecode(ctx);
            ctx.emitPopJumpIfFalse(skipYield);
            if (yieldAtom != null) {
                ctx.emitAtom(yieldAtom);
            } else {
                int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
                ctx.emitLoadConst(noneIdx);
            }
            ctx.emitYieldValue(0);
            ctx.emit(PythonOpCode.RESUME, 5);
            ctx.emitPopTop();
            ctx.markLabel(skipYield);
        } else {
            if (yieldAtom != null) {
                ctx.emitAtom(yieldAtom);
            } else {
                int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
                ctx.emitLoadConst(noneIdx);
            }
            ctx.emitYieldValue(0);
            ctx.emit(PythonOpCode.RESUME, 5);
            ctx.emitPopTop();
        }

        ctx.emitJumpBackward(startLabel);
        ctx.markLabel(endLabel);

        ctx.emit(PythonOpCode.END_FOR);
        ctx.emit(PythonOpCode.POP_ITER);

        int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
        ctx.emitLoadConst(noneIdx);
        ctx.emitReturnValue();

        ctx.saveFunctionAndEmit(false);

        forLoop.getIter().generateBytecode(ctx);
        ctx.emitGetIter();
        ctx.emitCall(0);
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + forLoop.toString() + " ) ";
    }
}
