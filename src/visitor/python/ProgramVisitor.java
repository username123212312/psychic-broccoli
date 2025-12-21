package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.Program;
import ast.Statement;

import java.util.ArrayList;
import java.util.List;

public class ProgramVisitor extends JinjaFlaskParserBaseVisitor<Program> {
    @Override
    public Program visitProgram(JinjaFlaskParser.ProgramContext ctx) {
        List<Statement> statements = new ArrayList<>();
        StatementVisitor statementVisitor = new StatementVisitor();
        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add(statementVisitor.visit(ctx.statement(i)));
        }
        return new Program(ctx.getStart().getLine(), statements);
    }
}
