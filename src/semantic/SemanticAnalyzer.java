package semantic;

import ast.ASTNode;
import ast.ElIfStatement;
import ast.Program;
import ast.Statement;
import ast.WhileStatement;
import ast.compundStmt.ForLoop;
import ast.compundStmt.IfStatement;
import ast.functionDef.FunctionDefinition;
import semantic.rules.SemanticError;
import semantic.rules.TypeError;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableManager;

import java.util.ArrayList;
import java.util.List;

public class SemanticAnalyzer {
    private final List<SemanticError> rules = new ArrayList<>();
    private final SymbolTable symbolTable = SymbolTableManager.INSTANCE.getSymbolTable();

    public SemanticAnalyzer() {
    }

    public void registerRule(SemanticError r) {
        if (r != null) rules.add(r);
    }

    public void analyze(Program program) {
        if (program == null) return;

        ErrorReporter reporter = new ErrorReporter();
        if (rules.isEmpty()) {
            registerRule(new TypeError());
        }

        walk(program, reporter);
        reporter.printErrors();
    }

    private void walk(ASTNode node, ErrorReporter reporter) {
        if (node == null) return;

        for (SemanticError rule : rules) {
            try {
                rule.apply(node, symbolTable, reporter);
            } catch (Exception ex) {
                reporter.addError("Rule error: " + ex.getMessage());
            }
        }

        switch (node) {
            case Program program -> {
                for (Statement statement : program.getStatements()) {
                    walk(statement, reporter);
                }
                return;
            }
            case Statement statement -> {
                if (statement.getCompoundStatements() != null) {
                    for (var compoundStatement : statement.getCompoundStatements()) {
                        walk(compoundStatement, reporter);
                    }
                }
                return;
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
                return;
            }
            case ElIfStatement elIfStatement -> {
                walk(elIfStatement.getCondition(), reporter);
                walk(elIfStatement.getStatement(), reporter);
                return;
            }
            case WhileStatement whileStatement -> {
                walk(whileStatement.getCondition(), reporter);
                walk(whileStatement.getStatement(), reporter);
                return;
            }
            case ForLoop forLoop -> {
                walk(forLoop.getCondition(), reporter);
                walk(forLoop.getStatement(), reporter);
                return;
            }
            case FunctionDefinition functionDefinition -> walk(functionDefinition.getFunctionBody(), reporter);
            default -> {
            }
        }

    }
}
