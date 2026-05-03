package visitor.python;

import antlr.python.PythonParser;
import antlr.python.PythonParserBaseVisitor;
import ast.ElIfStatement;
import ast.Imported;
import ast.Statement;
import ast.compundStmt.CompoundStatement;
import ast.compundStmt.GlobalStatement;
import ast.compundStmt.IfStatement;
import ast.compundStmt.ImportStatement;
import ast.condition.Condition;
import ast.functionDef.Decorator;
import ast.functionDef.FunctionParameter;
import ast.functionDef.FunctionDefinition;
import ast.functionDef.FunctionParameters;
import org.antlr.v4.runtime.tree.TerminalNode;
import visitor.UniversalPythonVisitor;
import symbolTable.SymbolTable;
import symbolTable.SymbolTableManager;

import java.util.ArrayList;
import java.util.List;

public class CompoundStatementVisitor extends PythonParserBaseVisitor<CompoundStatement> {
    UniversalPythonVisitor universalVisitor = new UniversalPythonVisitor();
    private final SymbolTable symbolTable = SymbolTableManager.INSTANCE.getSymbolTable();


    @Override
    public CompoundStatement visitAtomExpression(PythonParser.AtomExpressionContext ctx) {
        AtomExpressionVisitor atomExpressionVisitor = new AtomExpressionVisitor();
        return atomExpressionVisitor.visit(ctx.atom_expr());
    }

    @Override
    public CompoundStatement visitSimpleExpression(PythonParser.SimpleExpressionContext ctx) {
        SimpleExpressionVisitor simpleExpressionVisitor = new SimpleExpressionVisitor();
        return simpleExpressionVisitor.visit(ctx.simple_expr());
    }

    @Override
    public CompoundStatement visitIfStatement(PythonParser.IfStatementContext ctx) {
        return visit(ctx.if_stmt());
    }

    @Override
    public CompoundStatement visitIfStatementDef(PythonParser.IfStatementDefContext ctx) {
        IfStatement ifStatement = new IfStatement(ctx.getStart().getLine());
        ConditionVisitor conditionVisitor = new ConditionVisitor();
        StatementVisitor statementVisitor = new StatementVisitor();
        Condition condition = conditionVisitor.visit(ctx.condition(0));
        Statement statement = statementVisitor.visit(ctx.statement(0));
        ifStatement.setCondition(condition);
        ifStatement.setStatement(statement);

        int elifCount = ctx.ELIF().size();
        List<ElIfStatement> elIfStatements = new ArrayList<>();
        for (int i = 0; i < elifCount; i++) {
            ElIfStatement elIfStatement = new ElIfStatement(ctx.ELIF(i).getSymbol().getLine());
            condition = conditionVisitor.visit(ctx.condition(i + 1));
            statement = statementVisitor.visit(ctx.statement(i + 1));
            elIfStatement.setCondition(condition);
            elIfStatement.setStatement(statement);
            elIfStatements.add(elIfStatement);
        }
        ifStatement.setElifStatements(elIfStatements);
        if (ctx.ELSE() != null) {
            int elseStmtIndex = ctx.statement().size() - 1;
            statement = statementVisitor.visit(ctx.statement(elseStmtIndex));
            ifStatement.setElseStatement(statement);
        }
        return ifStatement;
    }

    @Override
    public CompoundStatement visitAssignmentStatement(PythonParser.AssignmentStatementContext ctx) {
        AssignmentStatementVisitor assignmentStatementVisitor = new AssignmentStatementVisitor();
        return assignmentStatementVisitor.visit(ctx.assign_stmt());
    }


    @Override
    public CompoundStatement visitFunctionDefinition(PythonParser.FunctionDefinitionContext ctx) {
        return visit(ctx.func_def());
    }

    @Override
    public CompoundStatement visitFunctionDefDef(PythonParser.FunctionDefDefContext ctx) {
        UniversalPythonVisitor universalVisitor = new UniversalPythonVisitor();
        FunctionDefinition functionDefinition = new FunctionDefinition(ctx.getStart().getLine());
        if (ctx.dec() != null) {
            Decorator decorator = (Decorator) universalVisitor.visit(ctx.dec());
            functionDefinition.setDecorator(decorator);
        }
        functionDefinition.setFunctionName(ctx.NAME().getText());
        FunctionParameters functionParameters = (FunctionParameters) universalVisitor.visit(ctx.parameters());
        functionDefinition.setFunctionParameters(functionParameters);
        symbolTable.setAttribute(functionDefinition.getFunctionName(), "Type", functionDefinition.node_name);
        symbolTable.setAttribute(functionDefinition.getFunctionName(), "Value", "FunctionDefinition");
        symbolTable.enterScope(functionDefinition.getFunctionName());
        try {
            if (functionParameters != null && functionParameters.getParameters() != null) {
                for (FunctionParameter functionParameter : functionParameters.getParameters()) {
                    symbolTable.setAttribute(functionParameter.getId(), "Type", "Parameter");
                    if (functionParameter.getValue() != null) {
                        symbolTable.setAttribute(functionParameter.getId(), "Value", functionParameter.getValue().symbolTablePrint());
                    }
                }
            }
            Statement statement = new StatementVisitor().visit(ctx.statement());
            functionDefinition.setFunctionBody(statement);
        } finally {
            symbolTable.exitScope();
        }
        return functionDefinition;
    }

    @Override
    public CompoundStatement visitReturnStatement(PythonParser.ReturnStatementContext ctx) {
        ReturnStatementVisitor returnStatementVisitor = new ReturnStatementVisitor();
        return returnStatementVisitor.visit(ctx.return_stmt());
    }

    @Override
    public CompoundStatement visitImportStatement(PythonParser.ImportStatementContext ctx) {
        return visit(ctx.import_from());
    }

    @Override
    public ImportStatement visitImportFromDef(PythonParser.ImportFromDefContext ctx) {
        ImportStatement importStatement = new ImportStatement(ctx.getStart().getLine());
        StringBuilder moduleBuilder = new StringBuilder();
        List<TerminalNode> moduleNameTokens = ctx.NAME();
        if (!moduleNameTokens.isEmpty()) {
            moduleBuilder.append(moduleNameTokens.getFirst().getText());

            for (int i = 1; i < moduleNameTokens.size() - ctx.imptd().size(); i++) {
                moduleBuilder.append(".").append(moduleNameTokens.get(i).getText());
            }
        }

        String module = moduleBuilder.toString();

        List<Imported> importedList = new ArrayList<>();

        for (PythonParser.ImptdContext imported : ctx.imptd()) {
            importedList.add((Imported) universalVisitor.visit(imported));
        }
        importStatement.setImportedList(importedList);
        importStatement.setModule(module);

        return importStatement;
    }

    @Override
    public CompoundStatement visitGlobalStatement(PythonParser.GlobalStatementContext ctx) {
        GlobalStatement globalStatement = (GlobalStatement) universalVisitor.visit(ctx.global_stmt());
        if (globalStatement.getGlobals() != null) {
            for (String globalName : globalStatement.getGlobals()) {
                symbolTable.declareGlobal(globalName);
            }
        }
        return globalStatement;
    }
}
