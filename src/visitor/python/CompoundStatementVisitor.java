package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ElIfStatement;
import ast.Imported;
import ast.Statement;
import ast.compundStmt.CompoundStatement;
import ast.compundStmt.IfStatement;
import ast.compundStmt.ImportStatement;
import ast.condition.Condition;
import org.antlr.v4.runtime.tree.TerminalNode;
import visitor.UniversalVisitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundStatementVisitor extends JinjaFlaskParserBaseVisitor<CompoundStatement> {
    UniversalVisitor universalVisitor = new UniversalVisitor();

    @Override
    public CompoundStatement visitIfStatement(JinjaFlaskParser.IfStatementContext ctx) {
        return visit(ctx.if_stmt());
    }

    @Override
    public CompoundStatement visitIfStatementDef(JinjaFlaskParser.IfStatementDefContext ctx) {
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
    public CompoundStatement visitAssignmentStatement(JinjaFlaskParser.AssignmentStatementContext ctx) {
        AssignmentStatementVisitor assignmentStatementVisitor = new AssignmentStatementVisitor();
        return assignmentStatementVisitor.visit(ctx.assign_stmt());
    }

    @Override
    public CompoundStatement visitForLoopStatement(JinjaFlaskParser.ForLoopStatementContext ctx) {
        return super.visitForLoopStatement(ctx);
    }

    @Override
    public CompoundStatement visitPythonExpression(JinjaFlaskParser.PythonExpressionContext ctx) {
        return super.visitPythonExpression(ctx);
    }

    @Override
    public CompoundStatement visitFunctionDefinition(JinjaFlaskParser.FunctionDefinitionContext ctx) {
        return super.visitFunctionDefinition(ctx);
    }

    @Override
    public CompoundStatement visitReturnStatement(JinjaFlaskParser.ReturnStatementContext ctx) {
        return super.visitReturnStatement(ctx);
    }

    @Override
    public CompoundStatement visitImportStatement(JinjaFlaskParser.ImportStatementContext ctx) {
        return visit(ctx.import_from());
    }

    @Override
    public ImportStatement visitImportFromDef(JinjaFlaskParser.ImportFromDefContext ctx) {
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

        for (JinjaFlaskParser.ImptdContext imported : ctx.imptd()) {
            importedList.add((Imported) universalVisitor.visit(imported));
        }
        importStatement.setImportedList(importedList);
        importStatement.setModule(module);

        return importStatement;
    }

    @Override
    public CompoundStatement visitGlobalStatement(JinjaFlaskParser.GlobalStatementContext ctx) {
        return super.visitGlobalStatement(ctx);
    }
}
