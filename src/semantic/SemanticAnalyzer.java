package semantic;

import ast.ASTNode;
import ast.ElIfStatement;
import ast.Program;
import ast.Statement;
import ast.WhileStatement;
import ast.compundStmt.ForLoop;
import ast.compundStmt.IfStatement;
import ast.functionDef.FunctionDefinition;
import semantic.errors.SemanticError;
import semantic.rules.*;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableManager;

import java.util.ArrayList;
import java.util.List;

public class SemanticAnalyzer {
    private final List<SemanticRule> rules = new ArrayList<>();
    private final SymbolTable symbolTable = SymbolTableManager.INSTANCE.getSymbolTable();


    private boolean inFunctionScope = false;

    public void registerRule(SemanticRule r) {
        if (r != null) rules.add(r);
    }

    public void analyze(Program program) {
        if (program == null) return;
        ErrorReporter reporter = new ErrorReporter();

        if (rules.isEmpty()) {
            registerRule(new DuplicateArgumentRule());
            registerRule(new DuplicateFunctionRule());
            registerRule(new NotIterableRule());
            registerRule(new ReturnOutsideFunctionRule());
            registerRule(new TypeRule());
            registerRule(new UndefinedFunctionRule());
            registerRule(new UndefinedVariableRule());
        }

        walk(program, reporter);
        reporter.printErrors();
        if (reporter.hasErrors()) {
            throw reporter.getErrors().get(0);
        }
    }

    private void walk(ASTNode node, ErrorReporter reporter) {
        if (node == null) return;


        for (SemanticRule rule : rules) {

            if (rule instanceof ReturnOutsideFunctionRule returnRule) {
                if (inFunctionScope) returnRule.enterFunction();
                else returnRule.exitFunction();
            }

            try {
                rule.apply(node, symbolTable, reporter);
            } catch (SemanticError se) {
                //reporter.addError("Rule error: " + se.getMessage());
            }
        }


        switch (node) {
            case Program program -> {
                for (Statement statement : program.getStatements()) {
                    walk(statement, reporter);
                }
            }
            case Statement statement -> {
                if (statement.getCompoundStatements() != null) {
                    for (var compoundStatement : statement.getCompoundStatements()) {
                        walk(compoundStatement, reporter);
                    }
                }
            }
            case FunctionDefinition functionDefinition -> {

                boolean wasInFunction = inFunctionScope;
                inFunctionScope = true;

                for (SemanticRule rule : rules) {
                    if (rule instanceof FunctionScopeAware scopeAwareRule) {
                        scopeAwareRule.pushFunction(functionDefinition.getFunctionName());
                    }
                }

                walk(functionDefinition.getFunctionBody(), reporter);

                for (SemanticRule rule : rules) {
                    if (rule instanceof FunctionScopeAware scopeAwareRule) {
                        scopeAwareRule.popFunction();
                    }
                }

                inFunctionScope = wasInFunction;
            }
            case IfStatement ifStatement -> {
                walk(ifStatement.getCondition(), reporter);
                walk(ifStatement.getStatement(), reporter);
                if (ifStatement.getElifStatements() != null) {
                    for (ElIfStatement elIfStatement : ifStatement.getElifStatements()) {
                        walk(elIfStatement, reporter);
                    }
                }
                walk(ifStatement.getElseStatement(), reporter);
            }
            case ElIfStatement elIfStatement -> {
                walk(elIfStatement.getCondition(), reporter);
                walk(elIfStatement.getStatement(), reporter);
            }
            case WhileStatement whileStatement -> {
                walk(whileStatement.getCondition(), reporter);
                walk(whileStatement.getStatement(), reporter);
            }
            case ForLoop forLoop -> {
                walk(forLoop.getCondition(), reporter);
                walk(forLoop.getStatement(), reporter);
            }
            default -> {
            }
        }
    }
}
