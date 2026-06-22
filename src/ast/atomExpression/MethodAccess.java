package ast.atomExpression;

import ast.compundStmt.PythonExpression;
import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class MethodAccess extends AtomExpression {
    private List<AtomExpression> methodCalls;

    public MethodAccess(int line_number) {
        super("MethodAccess", line_number);
    }

    public void setMethodCalls(List<AtomExpression> methodCalls) {
        this.methodCalls = methodCalls;
    }

    public List<AtomExpression> getMethodCalls() {
        return methodCalls;
    }

    @Override
    public String symbolTablePrint() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getVarName());
        for (AtomExpression atomExpression : methodCalls) {
            stringBuilder.append(".").append(atomExpression.symbolTablePrint());
        }
        return stringBuilder.toString();
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        String base = getVarName();
        if (base != null) ctx.loadVariable(base);
        if (methodCalls != null) {
            for (AtomExpression call : methodCalls) {
                generateMethodCall(ctx, call);
            }
        }
    }

    private void generateMethodCall(CodegenContext ctx, AtomExpression call) {
        if (call instanceof FunctionCall fc) {
            int methodNameIdx = ctx.addName(fc.getVarName());
            ctx.emitLoadAttr((methodNameIdx << 1) | 1);
            java.util.List<Object> argList = ctx.collectArguments(fc.getArgumentsList());
            int positionalCount = 0;
            int keywordCount = 0;
            for (Object arg : argList) {
                if (arg instanceof cpython_bytecode.codegen.CodegenContext.KeywordArgPlaceholder) {
                    keywordCount++;
                } else {
                    positionalCount++;
                }
            }
            java.util.List<String> keywordNames = new java.util.ArrayList<>();
            for (Object arg : argList) {
                if (arg instanceof cpython_bytecode.codegen.CodegenContext.KeywordArgPlaceholder kw) {
                    keywordNames.add(kw.keywordName());
                    kw.value().generateBytecode(ctx);
                } else if (arg instanceof PythonExpression pe) {
                    pe.generateBytecode(ctx);
                } else if (arg instanceof ast.atom.Atom a) {
                    ctx.emitAtom(a);
                }
            }
            if (keywordCount > 0) {
                int tupleIdx = ctx.addConstant(keywordNames);
                ctx.emitLoadConst(tupleIdx);
                ctx.emitCallKw(positionalCount + keywordCount);
            } else {
                ctx.emitCall(positionalCount);
            }
        } else if (call instanceof AttributeAccess aa) {
            String attrBase = aa.getVarName();
            if (attrBase != null) ctx.loadVariable(attrBase);
            if (aa.getAttributes() != null) {
                for (ast.atom.Atom attr : aa.getAttributes()) {
                    if (attr != null && attr.getValue() != null) {
                        int nameIdx = ctx.addName(attr.getValue().toString());
                        ctx.emitLoadAttr((nameIdx << 1) | 0);
                    }
                }
            }
        } else if (call instanceof SimpleVariable sv) {
            int attrIdx = ctx.addName(sv.getVarName());
            ctx.emitLoadAttr((attrIdx << 1) | 0);
        } else if (call instanceof MethodAccess ma) {
            String innerBase = ma.getVarName();
            if (innerBase != null) {
                int attrIdx = ctx.addName(innerBase);
                ctx.emitLoadAttr((attrIdx << 1) | 0);
            }
            if (ma.getMethodCalls() != null) {
                for (AtomExpression innerCall : ma.getMethodCalls()) {
                    generateMethodCall(ctx, innerCall);
                }
            }
        } else {
            String name = (call != null) ? call.getVarName() : null;
            if (name != null) {
                int attrIdx = ctx.addName(name);
                ctx.emitLoadAttr((attrIdx << 1) | 0);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for (AtomExpression atomExpression : methodCalls) {
            stringBuilder.append(".").append(atomExpression.toString());
        }
        return stringBuilder.toString() + " ) ";
    }
}
