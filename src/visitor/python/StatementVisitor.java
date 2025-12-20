package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.Statement;
import ast.compundStmt.CompoundStatement;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends JinjaFlaskParserBaseVisitor<Statement> {
    @Override
    public Statement visitCompoundStatement(JinjaFlaskParser.CompoundStatementContext ctx) {
        List<CompoundStatement> compoundStatementList = new ArrayList<>();
        CompoundStatementVisitor compoundStatementVisitor = new CompoundStatementVisitor();
        for (int i = 0; i < ctx.compound_stmt().size(); i++) {
            compoundStatementList.add(compoundStatementVisitor.visit(ctx.compound_stmt(i)));
        }
        return new Statement(ctx.getStart().getLine(), compoundStatementList);
    }

    @Override
    public Statement visitPassStatement(JinjaFlaskParser.PassStatementContext ctx) {
        return super.visitPassStatement(ctx);
    }


}
