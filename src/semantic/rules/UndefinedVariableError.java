package semantic.rules;

import ast.ASTNode;
import ast.atom.Name;
import semantic.ErrorReporter;
import symbolTable.SymbolTable;

public class UndefinedVariableError implements SemanticError {
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

        reporter.addError("Undefined variable '" + name + "' at line " + node.line_number);
    }
}
