package semantic.rules;

import ast.ASTNode;
import ast.atom.Name;
import semantic.ErrorReporter;
import semantic.errors.SemanticError;
import symbolTable.SymbolTable;

public class UndefinedVariableRule implements SemanticRule {
    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (node instanceof Name name) {
            String identifier = extractName(name);
            if (identifier != null) {
                reportIfUndefined(identifier, node, symbolTable, reporter);
            }
        }
    }

    private String extractName(Name name) {
        Object value = name.getValue();
        return value == null ? null : value.toString();
    }

    private void reportIfUndefined(String name, ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (name.isBlank() || symbolTable.lookup(name) != null) {
            return;
        }
        String errorMessage = "Undefined variable '" + name + "' at line " + node.line_number;
        reporter.addError(errorMessage);
        throw new SemanticError(errorMessage);
    }
}
