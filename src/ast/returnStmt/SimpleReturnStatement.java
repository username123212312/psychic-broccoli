package ast.returnStmt;

import ast.atom.Atom;
import cpython_bytecode.codegen.CodegenContext;

public class SimpleReturnStatement extends ReturnStatement {
    private Atom atom;
    public SimpleReturnStatement(int line_number) {
        super("SimpleReturnStatement", line_number);
    }

    public void setAtom(Atom atom) {
        this.atom = atom;
    }

    public Atom getAtom() {
        return atom;
    }

    @Override
    public String toString() {
        return super.toString() + atom.toString();
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (atom != null) {
            if (atom instanceof ast.atom.None) {
                int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
                ctx.emitLoadConst(noneIdx);
                ctx.emitReturnValue();
                return;
            }
            int constIdx = ctx.addAtomConstant(atom);
            if (constIdx >= 0) {
                ctx.emitLoadConst(constIdx);
                ctx.emitReturnValue();
                return;
            }
            ctx.emitAtom(atom);
            ctx.emitReturnValue();
        } else {
            int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
            ctx.emitLoadConst(noneIdx);
            ctx.emitReturnValue();
        }
    }
}
