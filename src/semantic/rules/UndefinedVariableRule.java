package semantic.rules;

import ast.ASTNode;
import ast.arithmeticExpr.ArithmeticExpression;
import ast.argsList.ArgumentsList;
import ast.argsList.AtomArguments;
import ast.argsList.ComplexArguments;
import ast.assignStmt.ArithmeticAssignStatement;
import ast.assignStmt.AssignmentStatement;
import ast.assignStmt.ComparisonAssignmentStmt;
import ast.assignStmt.PythonExpressionAssignStatement;
import ast.assignStmt.TemplateLiteralAssignmentStatement;
import ast.atom.Atom;
import ast.atom.ClassAtom;
import ast.atom.Name;
import ast.atomExpression.AtomExpression;
import ast.atomExpression.AttributeAccess;
import ast.atomExpression.DictionaryAccess;
import ast.atomExpression.FunctionCall;
import ast.atomExpression.ListAccess;
import ast.atomExpression.LiteralExpression;
import ast.atomExpression.MethodAccess;
import ast.atomExpression.ObjectCreation;
import ast.atomExpression.SimpleVariable;
import ast.compundStmt.ForLoop;
import ast.compundStmt.GlobalStatement;
import ast.compundStmt.ImportStatement;
import ast.compundStmt.PythonExpression;
import ast.complexExp.ComplexExpression;
import ast.complexExp.DictionaryLiteral;
import ast.complexExp.Generator;
import ast.complexExp.ListComprehension;
import ast.complexExp.ListLiteral;
import ast.condition.BooleanCondition;
import ast.condition.ComparisonExpression;
import ast.condition.Condition;
import ast.condition.NotExpression;
import ast.functionDef.Decorator;
import ast.functionDef.FunctionDefinition;
import ast.keyValue.AtomKeyValue;
import ast.keyValue.KeyValue;
import ast.keyValue.SimpleKeyValue;
import ast.returnStmt.ComplexReturnStatement;
import ast.returnStmt.ReturnStatement;
import ast.returnStmt.SimpleReturnStatement;
import ast.simpleExpr.SimpleComparisonExpression;
import ast.simpleExpr.SimpleExpression;
import semantic.ErrorReporter;
import semantic.errors.ScopeError;
import semantic.errors.SemanticError;
import semantic.errors.UndefinedVariableError;
import symbolTable.SymbolEntry;
import symbolTable.SymbolTable;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UndefinedVariableRule implements SemanticRule, FunctionScopeAware {

    private final Deque<String> functionStack = new ArrayDeque<>();
    private final Set<String> loopVariables = new HashSet<>();
    private final Set<String> reportedUsages = new HashSet<>();

    @Override
    public void pushFunction(String functionName) {
        if (functionName != null && !functionName.isBlank()) {
            functionStack.push(functionName);
        }
    }

    @Override
    public void popFunction() {
        functionStack.pop();
    }

    @Override
    public void apply(ASTNode node, SymbolTable symbolTable, ErrorReporter reporter) {
        switch (node) {
            case ForLoop forLoop -> analyzeForLoop(forLoop, symbolTable, reporter);
            case PythonExpressionAssignStatement assignStatement ->
                    traverseExpression(assignStatement.getValue(), symbolTable, reporter);
            case ArithmeticAssignStatement arithmeticAssignStatement ->
                    traverseArithmetic(arithmeticAssignStatement.getValue(), symbolTable, reporter);
            case ComparisonAssignmentStmt comparisonAssignmentStmt ->
                    traverseCondition(comparisonAssignmentStmt.getValue(), symbolTable, reporter);
            case TemplateLiteralAssignmentStatement ignored -> { }
            case AssignmentStatement ignored -> { }
            case ReturnStatement returnStatement -> analyzeReturn(returnStatement, symbolTable, reporter);
            case Condition condition -> traverseCondition(condition, symbolTable, reporter);
            case SimpleExpression simpleExpression ->
                    traverseSimpleExpression(simpleExpression, symbolTable, reporter);
            case PythonExpression pythonExpression ->
                    traverseExpression(pythonExpression, symbolTable, reporter);
            case FunctionDefinition functionDefinition ->
                    analyzeDecorator(functionDefinition.getDecorator(), symbolTable, reporter);
            case GlobalStatement ignored -> { }
            case ImportStatement ignored -> { }
            default -> { }
        }
    }

    private void analyzeForLoop(ForLoop forLoop, SymbolTable symbolTable, ErrorReporter reporter) {
        Atom loopVar = forLoop.getVar();
        if (loopVar instanceof Name nameAtom && nameAtom.getValue() != null) {
            loopVariables.add(nameAtom.getValue().toString());
        }
        traverseExpression(forLoop.getIter(), symbolTable, reporter);
    }

    private void analyzeReturn(ReturnStatement returnStatement, SymbolTable symbolTable, ErrorReporter reporter) {
        if (returnStatement instanceof ComplexReturnStatement complexReturnStatement) {
            ASTNode returned = complexReturnStatement.getPythonExpression() != null
                    ? complexReturnStatement.getPythonExpression()
                    : complexReturnStatement.getExpression();
            if (returned instanceof PythonExpression pythonExpression) {
                traverseExpression(pythonExpression, symbolTable, reporter);
            } else if (returned instanceof Condition condition) {
                traverseCondition(condition, symbolTable, reporter);
            } else if (returned instanceof Atom atom) {
                traverseAtom(atom, symbolTable, reporter);
            }
        } else if (returnStatement instanceof SimpleReturnStatement simpleReturnStatement) {
            traverseAtom(simpleReturnStatement.getAtom(), symbolTable, reporter);
        }
    }

    private void analyzeDecorator(Decorator decorator, SymbolTable symbolTable, ErrorReporter reporter) {
        if (decorator == null) return;
        String decoratorName = decorator.getDecoratorName();
        if (decoratorName != null && !decoratorName.isBlank()) {
            String root = decoratorName.split("\\.")[0];
            usage(root, decorator.line_number, symbolTable, reporter);
        }
        traverseArguments(decorator.getArguments(), symbolTable, reporter);
    }

    private void traverseExpression(PythonExpression expression, SymbolTable symbolTable, ErrorReporter reporter) {
        if (expression == null) return;
        switch (expression) {
            case SimpleVariable simpleVariable ->
                    usage(simpleVariable.getVarName(), expression.line_number, symbolTable, reporter);
            case LiteralExpression ignored -> { }
            case FunctionCall functionCall ->
                    traverseArguments(functionCall.getArgumentsList(), symbolTable, reporter);
            case ObjectCreation objectCreation ->
                    traverseArguments(objectCreation.getArgumentsList(), symbolTable, reporter);
            case AttributeAccess attributeAccess ->
                    usage(attributeAccess.getVarName(), expression.line_number, symbolTable, reporter);
            case ListAccess listAccess ->
                    usage(listAccess.getVarName(), expression.line_number, symbolTable, reporter);
            case DictionaryAccess dictionaryAccess ->
                    usage(dictionaryAccess.getVarName(), expression.line_number, symbolTable, reporter);
            case MethodAccess methodAccess -> {
                usage(methodAccess.getVarName(), expression.line_number, symbolTable, reporter);
                if (methodAccess.getMethodCalls() != null) {
                    for (AtomExpression call : methodAccess.getMethodCalls()) {
                        traverseMethodChain(call, symbolTable, reporter);
                    }
                }
            }
            case ListLiteral listLiteral -> {
                if (listLiteral.getListItems() != null) {
                    for (PythonExpression item : listLiteral.getListItems()) {
                        traverseExpression(item, symbolTable, reporter);
                    }
                }
            }
            case DictionaryLiteral dictionaryLiteral -> {
                if (dictionaryLiteral.getKeyValues() == null) return;
                for (KeyValue keyValue : dictionaryLiteral.getKeyValues()) {
                    if (keyValue.getKey() instanceof Name keyName && keyName.getValue() != null) {
                        usage(keyName.getValue().toString(), keyValue.line_number, symbolTable, reporter);
                    }
                    if (keyValue instanceof AtomKeyValue atomKeyValue) {
                        traverseAtom(atomKeyValue.getValue(), symbolTable, reporter);
                    } else if (keyValue instanceof SimpleKeyValue simpleKeyValue) {
                        traverseSimpleExpression(simpleKeyValue.getValue(), symbolTable, reporter);
                    }
                }
            }
            case ListComprehension ignored -> { }
            case Generator ignored -> { }
            case ComplexExpression ignored -> { }
            default -> { }
        }
    }

    private void traverseMethodChain(AtomExpression call, SymbolTable symbolTable, ErrorReporter reporter) {
        if (call == null) return;
        switch (call) {
            case FunctionCall functionCall ->
                    traverseArguments(functionCall.getArgumentsList(), symbolTable, reporter);
            case MethodAccess methodAccess -> {
                if (methodAccess.getMethodCalls() != null) {
                    for (AtomExpression inner : methodAccess.getMethodCalls()) {
                        traverseMethodChain(inner, symbolTable, reporter);
                    }
                }
            }
            default -> { }
        }
    }

    private void traverseSimpleExpression(SimpleExpression simpleExpression, SymbolTable symbolTable, ErrorReporter reporter) {
        if (simpleExpression == null) return;
        if (simpleExpression instanceof ArithmeticExpression arithmeticExpression) {
            traverseArithmetic(arithmeticExpression, symbolTable, reporter);
        } else if (simpleExpression instanceof SimpleComparisonExpression comparisonExpression) {
            traverseCondition(comparisonExpression.getCondition(), symbolTable, reporter);
        }
    }

    private void traverseArithmetic(ArithmeticExpression arithmeticExpression, SymbolTable symbolTable, ErrorReporter reporter) {
        if (arithmeticExpression == null) return;
        traverseExpression(arithmeticExpression.getLeft(), symbolTable, reporter);
        if (arithmeticExpression.getRight() != null) {
            for (PythonExpression operand : arithmeticExpression.getRight()) {
                traverseExpression(operand, symbolTable, reporter);
            }
        }
    }

    private void traverseCondition(Condition condition, SymbolTable symbolTable, ErrorReporter reporter) {
        if (condition == null || condition instanceof BooleanCondition) return;
        if (condition instanceof ComparisonExpression comparisonExpression) {
            traverseExpression(comparisonExpression.getBaseExpr(), symbolTable, reporter);
            if (comparisonExpression.getOperatorPythonExpressionMap() != null) {
                for (PythonExpression operand : comparisonExpression.getOperatorPythonExpressionMap().values()) {
                    traverseExpression(operand, symbolTable, reporter);
                }
            }
        } else if (condition instanceof NotExpression notExpression) {
            traverseExpression(notExpression.getPythonExpression(), symbolTable, reporter);
        }
    }

    private void traverseArguments(ArgumentsList argumentsList, SymbolTable symbolTable, ErrorReporter reporter) {
        if (argumentsList == null) return;
        if (argumentsList instanceof AtomArguments atomArguments && atomArguments.getArgs() != null) {
            for (Atom argument : atomArguments.getArgs()) {
                if (!(argument instanceof ClassAtom)) {
                    traverseAtom(argument, symbolTable, reporter);
                }
            }
        } else if (argumentsList instanceof ComplexArguments complexArguments
                && complexArguments.getArguments() != null) {
            for (var argument : complexArguments.getArguments()) {
                traverseExpression(argument.getArg(), symbolTable, reporter);
            }
        }
    }

    private void traverseAtom(Atom atom, SymbolTable symbolTable, ErrorReporter reporter) {
        if (atom instanceof Name name && name.getValue() != null) {
            usage(name.getValue().toString(), atom.line_number, symbolTable, reporter);
        }
    }

    private void usage(String name, int lineNumber, SymbolTable symbolTable, ErrorReporter reporter) {
        if (name == null || name.isBlank()) return;
        if (name.startsWith("__") && name.endsWith("__")) return;
        String deduplicationKey = name + "@" + lineNumber;
        if (!reportedUsages.add(deduplicationKey)) return;
        if (loopVariables.contains(name)) return;
        if (name.startsWith("_")) return;

        List<SymbolEntry> candidates = symbolTable.lookupAll(name);
        if (candidates.isEmpty()) {
            fail(new UndefinedVariableError("Undefined variable '" + name + "' at line " + lineNumber), reporter);
            return;
        }

        boolean accessible = false;
        SymbolEntry functionScopedEntry = null;
        for (SymbolEntry entry : candidates) {
            switch (entry.getScopeKind()) {
                case SymbolEntry.SCOPE_GLOBAL, SymbolEntry.SCOPE_BLOCK -> accessible = true;
                case SymbolEntry.SCOPE_FUNCTION -> {
                    if (functionStack.contains(entry.getScopeName())) {
                        accessible = true;
                    } else if (functionScopedEntry == null) {
                        functionScopedEntry = entry;
                    }
                }
                default -> { }
            }
        }

        if (!accessible && functionScopedEntry != null) {
            fail(new ScopeError("Scope error at line " + lineNumber + ": '" + name
                    + "' is defined inside function '" + functionScopedEntry.getScopeName()
                    + "' and cannot be accessed here."), reporter);
        }
    }

    private void fail(SemanticError error, ErrorReporter reporter) {
        reporter.addError(error);
        throw error;
    }
}
