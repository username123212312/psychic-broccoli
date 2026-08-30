package semantic.rules;

import ast.ASTNode;
import ast.functionDef.FunctionDefinition;
import ast.functionDef.FunctionParameter;
import semantic.ErrorReporter;
import semantic.errors.DuplicateArgumentError;
import symbolTable.SymbolTable;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArgumentRule implements SemanticRule {
    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (node instanceof FunctionDefinition fd) {
            if (fd.getFunctionParameters() != null && fd.getFunctionParameters().getParameters() != null) {
                Set<String> seenArguments = new HashSet<>();

                for (FunctionParameter param : fd.getFunctionParameters().getParameters()) {
                    String paramName = param.getId();

                    if (seenArguments.contains(paramName)) {
                        String message = "Semantic Error at line " + param.line_number
                                + ": Duplicate argument '" + paramName
                                + "' in function '" + fd.getFunctionName() + "'.";
                        reporter.addError(new DuplicateArgumentError(message));
                        throw new DuplicateArgumentError(message);
                    }
                    seenArguments.add(paramName);
                }
            }
        }
    }
}