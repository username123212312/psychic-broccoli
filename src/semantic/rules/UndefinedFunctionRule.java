package semantic.rules;

import ast.ASTNode;
import ast.atomExpression.FunctionCall;
import semantic.ErrorReporter;
import semantic.errors.SemanticError;
import symbolTable.SymbolTable;

import java.util.Set;

public class UndefinedFunctionRule implements SemanticRule {
    private static final Set<String> BUILTIN_FUNCTIONS = Set.of(
            "print", "input", "len", "range", "int", "float", "str", "bool",
            "list", "dict", "tuple", "set", "max", "min", "sum", "abs",
            "sorted", "type", "isinstance", "id", "open", "map", "filter",
            "all", "any", "enumerate", "zip", "reversed", "chr", "ord"
    );

    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (!(node instanceof FunctionCall functionCall)) {
            return;
        }

        String functionName = functionCall.getVarName();
        if (functionName == null || functionName.isBlank() || BUILTIN_FUNCTIONS.contains(functionName)) {
            return;
        }

        if (symbolTable.lookup(functionName) != null) {
            return;
        }

        String errorMessage = "Undefined function '" + functionName + "' at line " + node.line_number;
        reporter.addError(errorMessage);
        throw new SemanticError(errorMessage);
    }
}
