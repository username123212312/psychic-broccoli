package ast.complexExp;

import ast.compundStmt.PythonExpression;

import java.util.List;

public class ListLiteral extends ComplexExpression {
    private List<PythonExpression> listItems;

    public ListLiteral(int line_number) {
        super("ListLiteral", line_number);
    }

    public void setListItems(List<PythonExpression> listItems) {
        this.listItems = listItems;
    }

    public List<PythonExpression> getListItems() {
        return listItems;
    }

    @Override
    public String symbolTablePrint() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" [ ");
        if (listItems != null) {
            for (int i = 0; i < listItems.size(); i++) {
                stringBuilder.append(listItems.get(i).symbolTablePrint());
                if (i < listItems.size() - 1) stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ] ");
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(" ( [ ");
        if (listItems != null) {
            for (int i = 0; i < listItems.size(); i++) {
                stringBuilder.append(listItems.get(i).toString());
                if (i < listItems.size() - 1) stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ] ) ");
        return stringBuilder.toString();
    }
}
