package semantic.rules;

import ast.ASTNode;
import ast.functionDef.FunctionDefinition;
import semantic.ErrorReporter;
import semantic.errors.SemanticError;
import symbolTable.SymbolTable;

public class DuplicateFunctionRule implements SemanticRule {
    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (node instanceof FunctionDefinition fd) {
            String funcName = fd.getFunctionName();
            Object existing = symbolTable.getAttribute(funcName, "Value");
            if ("FunctionDefinition".equals(existing)) {
                String msg = "Semantic Error: Function '" + funcName + "' is already defined.";
                reporter.addError(msg);
                // اختياري: throw new SemanticError(msg);
            }
        }
    }
}
