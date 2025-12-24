package ast.cssTerm;

import ast.Consts;
import ast.Statement;

public class FunctionTerm extends CssTerm {
    private CssFunctionArguments arguments;

    public FunctionTerm(int line_number, CssFunctionArguments arguments) {
        super("FunctionTerm", line_number);
        this.arguments = arguments;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        if (this.arguments != null) {
            stringBuilder.append(Consts.STRING_INDENT)
                    .append(this.arguments.toString());
        }
        return stringBuilder.toString();
    }
}
