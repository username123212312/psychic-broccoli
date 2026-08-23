package ast.functionDef;

import ast.ASTNode;
import ast.argsList.ArgumentsList;
import ast.compundStmt.PythonExpression;
import cpython_bytecode.codegen.CodegenContext;

public class Decorator extends ASTNode {
    private String decoratorName;
    private ArgumentsList arguments;

    public Decorator(int line_number) {
        super("Decorator", line_number);
    }

    public void setDecoratorName(String decoratorName) {
        this.decoratorName = decoratorName;
    }

    public String getDecoratorName() {
        return decoratorName;
    }

    public void setArguments(ArgumentsList arguments) {
        this.arguments = arguments;
    }

    public ArgumentsList getArguments() {
        return arguments;
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (decoratorName == null) return;
        String[] parts = decoratorName.split("\\.");

        java.util.List<Object> argList = ctx.collectArguments(arguments);
        int positionalCount = 0;
        int keywordCount = 0;
        for (Object arg : argList) {
            if (arg instanceof cpython_bytecode.codegen.CodegenContext.KeywordArgPlaceholder) {
                keywordCount++;
            } else {
                positionalCount++;
            }
        }
        int totalArgs = positionalCount + keywordCount;

        ctx.loadVariable(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            int attrIdx = ctx.addName(parts[i]);
            boolean isLast = (i == parts.length - 1);
            int methodBit = (isLast && totalArgs > 0) ? 1 : 0;
            ctx.emitLoadAttr((attrIdx << 1) | methodBit);
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
        if (totalArgs > 0) {
            if (keywordCount > 0) {
                int tupleIdx = ctx.addConstant(keywordNames);
                ctx.emitLoadConst(tupleIdx);
                ctx.emitCallKw(totalArgs);
            } else {
                ctx.emitCall(totalArgs);
            }
        }
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        return super.toString() + " ( @" + decoratorName + "( " + arguments.toString() + ") ";
    }
}
