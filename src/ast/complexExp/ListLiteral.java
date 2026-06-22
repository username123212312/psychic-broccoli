package ast.complexExp;

import ast.atom.Atom;
import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class ListLiteral extends ComplexExpression {
    private List<Atom> listItems;

    public ListLiteral(int line_number) {
        super("ListLiteral", line_number);
    }

    public void setListItems(List<Atom> listItems) {
        this.listItems = listItems;
    }

    public List<Atom> getListItems() {
        return listItems;
    }

    @Override
    public String symbolTablePrint() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" [ ");
        if (listItems != null) {
            for (Atom listItem : listItems) {
                stringBuilder.append(listItem.toString())
                        .append((listItems.indexOf(listItem) == listItems.size() - 1)
                                ? "" : ", ");
            }
        }
        stringBuilder.append(" ] ");

        return stringBuilder.toString();
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (listItems != null) {
            for (ast.atom.Atom item : listItems) {
                ctx.emitAtom(item);
            }
            ctx.emitBuildList(listItems.size());
        } else {
            ctx.emitBuildList(0);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(" ( [ ");
        if (listItems != null) {
            for (Atom listItem : listItems) {
                stringBuilder.append(listItem.toString())
                        .append((listItems.indexOf(listItem) == listItems.size() - 1)
                                ? "" : ", ");
            }
        }
        stringBuilder.append(" ] ) ");

        return stringBuilder.toString();
    }
}
