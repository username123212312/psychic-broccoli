package semantic.rules;

import ast.ASTNode;
import ast.returnStmt.ReturnStatement;
import semantic.ErrorReporter;
import semantic.errors.ReturnOutsideFunctionError;
import symbolTable.SymbolTable;


public class ReturnOutsideFunctionRule implements SemanticRule {


    private boolean insideFunction = false;


    public void enterFunction() {
        insideFunction = true;
    }


    public void exitFunction() {
        insideFunction = false;
    }

    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (node instanceof ReturnStatement rs) {
            if (!insideFunction) {
                String msg = "Semantic Error at line " + rs.line_number
                        + ": 'return' statement used outside of a function.";
                reporter.addError(new ReturnOutsideFunctionError(msg));
                throw new ReturnOutsideFunctionError(msg);
            }
        }
    }
}
