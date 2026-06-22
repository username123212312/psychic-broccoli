package ast.complexExp;

import ast.keyValue.KeyValue;
import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class DictionaryLiteral extends ComplexExpression {
    private List<KeyValue> keyValues;

    public DictionaryLiteral(int line_number) {
        super("DictionaryLiteral", line_number);
    }

    public void setKeyValues(List<KeyValue> keyValues) {
        this.keyValues = keyValues;
    }

    public List<KeyValue> getKeyValues() {
        return keyValues;
    }

    @Override
    public String symbolTablePrint() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" { ");
        for (KeyValue keyValue : keyValues) {
            stringBuilder.append(keyValue.symbolTablePrint())
                    .append((keyValues.indexOf(keyValue) == (keyValues.size() - 1)) ? "" : ", ");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        ctx.emitBuildMap(0);
        if (keyValues != null) {
            for (ast.keyValue.KeyValue kv : keyValues) {
                ast.atom.Atom key = kv.getKey();
                if (key != null) {
                    int keyIdx = ctx.addAtomConstant(key);
                    if (keyIdx >= 0) ctx.emitLoadConst(keyIdx);
                }
                if (kv instanceof ast.keyValue.AtomKeyValue akv) {
                    ast.atom.Atom val = akv.getValue();
                    if (val != null) ctx.emitAtom(val);
                } else if (kv instanceof ast.keyValue.SimpleKeyValue skv) {
                    ast.simpleExpr.SimpleExpression se = skv.getValue();
                    if (se != null) se.generateBytecode(ctx);
                }
                ctx.emitStoreSubscr();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(" { ");
        for (KeyValue keyValue : keyValues) {
            stringBuilder.append(keyValue.toString())
                    .append((keyValues.indexOf(keyValue) == (keyValues.size() - 1)) ? "" : ", ");
        }
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
