package ast.cssTerm;

public class FunctionTerm extends CssTerm {
    private CssFunctionArguments arguments;

    public FunctionTerm(int line_number, CssFunctionArguments arguments) {
        super("FunctionTerm", line_number);
        this.arguments = arguments;
    }
}
