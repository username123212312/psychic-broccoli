package ast.atomExpression;

import ast.atom.Atom;
import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class AttributeAccess extends AtomExpression {
    private List<Atom> attributes;

    public AttributeAccess(int line_number) {
        super("AttributeAccess", line_number);
    }

    public void setAttributes(List<Atom> attributes) {
        this.attributes = attributes;
    }

    public List<Atom> getAttributes() {
        return attributes;
    }

    @Override
    public String symbolTablePrint() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getVarName());
        for (Atom atom : attributes) {
            stringBuilder.append(".").append(atom.toString());
        }
        return stringBuilder.toString();
    }

    @Override
    public void generateBytecode(CodegenContext ctx) {
        String base = getVarName();
        if (base != null) ctx.loadVariable(base);
        if (attributes != null) {
            for (ast.atom.Atom attr : attributes) {
                if (attr != null && attr.getValue() != null) {
                    int nameIdx = ctx.addName(attr.getValue().toString());
                    ctx.emitLoadAttr((nameIdx << 1) | 0);
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for (Atom atom : attributes) {
            stringBuilder.append(".").append(atom.toString());
        }
        stringBuilder.append(" ) ");
        return stringBuilder.toString();
    }
}
