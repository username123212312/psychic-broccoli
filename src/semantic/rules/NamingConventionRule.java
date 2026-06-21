package semantic.rules;

import ast.ASTNode;
import ast.functionDef.FunctionDefinition;
import semantic.ErrorReporter;
import symbolTable.SymbolTable;

public class NamingConventionRule implements SemanticRule {
    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (node instanceof FunctionDefinition fd) {
            String name = fd.getFunctionName();
            if (name.matches(".*[A-Z].*")) {
                reporter.addError("Style Warning at line " + fd.line_number +
                        ": Function name '" + name + "' should use snake_case (lowercase).");
            }
        }
    }
}
