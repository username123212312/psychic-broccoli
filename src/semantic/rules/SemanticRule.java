package semantic.rules;

import ast.ASTNode;
import semantic.ErrorReporter;
import symbolTable.SymbolTable;

public interface SemanticRule {
    void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter);
}
