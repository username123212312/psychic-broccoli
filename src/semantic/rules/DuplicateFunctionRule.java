package semantic.rules;

import ast.ASTNode;
import ast.functionDef.FunctionDefinition;
import semantic.ErrorReporter;
import semantic.errors.SemanticError;
import symbolTable.SymbolTable;

import java.util.HashSet;
import java.util.Set;



public class DuplicateFunctionRule implements SemanticRule {
    private final Set<String> seenFunctions = new HashSet<>();

    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (node instanceof FunctionDefinition fd) {
            String funcName = fd.getFunctionName();
            if (!seenFunctions.add(funcName)) {
                reporter.addError("Semantic Error: Function '" + funcName + "' is already defined.");
            }
        }
    }
}

