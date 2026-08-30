package semantic.rules;

import ast.ASTNode;
import ast.atomExpression.FunctionCall;
import ast.atomExpression.LiteralExpression;
import ast.atomExpression.SimpleVariable;
import ast.compundStmt.ForLoop;
import ast.compundStmt.PythonExpression;
import ast.complexExp.ListLiteral;
import semantic.ErrorReporter;
import semantic.errors.NotIterableError;
import symbolTable.SymbolTable;

import java.util.Set;

public class NotIterableRule implements SemanticRule {

    private static final Set<String> NON_ITERABLE_TYPES = Set.of("int", "float", "bool", "NoneType");

    private static final Set<String> ITERABLE_PRODUCERS = Set.of(
            "range", "list", "str", "dict", "tuple", "set", "sorted",
            "map", "filter", "zip", "enumerate", "reversed"
    );

    private static final Set<String> NON_ITERABLE_PRODUCERS = Set.of("int", "float", "bool");

    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        if (!(node instanceof ForLoop forLoop) || forLoop.getIter() == null) {
            return;
        }
        String iterableType = inferStaticType(forLoop.getIter(), symbolTable);
        if (iterableType != null && NON_ITERABLE_TYPES.contains(iterableType)) {
            String errorMessage = "Type error at line " + forLoop.line_number + ": '"
                    + iterableType + "' object is not iterable";
            reporter.addError(new NotIterableError(errorMessage));
            throw new NotIterableError(errorMessage);
        }
    }

    private String inferStaticType(PythonExpression expression, SymbolTable symbolTable) {
        if (expression == null) return null;
        return switch (expression) {
            case LiteralExpression literalExpression ->
                    inferLiteralType(literalExpression.getLiteralValue());
            case SimpleVariable simpleVariable -> {
                var candidates = symbolTable.lookupAll(simpleVariable.getVarName());
                if (candidates.isEmpty()) yield null;
                Object typeAttribute = candidates.get(0).getAttribute("Type");
                yield normalizeDeclaredType(typeAttribute);
            }
            case FunctionCall functionCall -> {
                String callee = functionCall.getVarName();
                if (callee == null) yield null;
                if (ITERABLE_PRODUCERS.contains(callee)) yield "list";
                if (NON_ITERABLE_PRODUCERS.contains(callee)) yield callee;
                yield null;
            }
            case ListLiteral ignored -> "list";
            default -> null;
        };
    }

    private String inferLiteralType(String literalValue) {
        if (literalValue == null) return null;
        String trimmed = literalValue.trim();
        if (trimmed.startsWith("'") || trimmed.startsWith("\"")) return "str";
        if ("True".equals(trimmed) || "False".equals(trimmed)) return "bool";
        if ("None".equals(trimmed)) return "NoneType";
        if (trimmed.matches("\\d+")) return "int";
        if (trimmed.matches("\\d+\\.\\d+")) return "float";
        return null;
    }

    private String normalizeDeclaredType(Object typeAttribute) {
        if (typeAttribute == null) return null;
        return switch (typeAttribute.toString()) {
            case "Integer" -> "int";
            case "Float" -> "float";
            case "Boolean" -> "bool";
            case "None" -> "NoneType";
            case "String" -> "str";
            case "List" -> "list";
            case "Dictionary" -> "dict";
            default -> null;
        };
    }
}
