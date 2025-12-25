package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.jinja.jinjaStatment.JinjaStatement;

public class JinjaStatementVisitor extends JinjaFlaskParserBaseVisitor<JinjaStatement> {
    @Override
    public JinjaStatement visitJinjaExtendsStmt(JinjaFlaskParser.JinjaExtendsStmtContext ctx) {
        return super.visitJinjaExtendsStmt(ctx);
    }

    @Override
    public JinjaStatement visitJinjaBlockStmt(JinjaFlaskParser.JinjaBlockStmtContext ctx) {
        return super.visitJinjaBlockStmt(ctx);
    }

    @Override
    public JinjaStatement visitJinjaIfStmt(JinjaFlaskParser.JinjaIfStmtContext ctx) {
        return super.visitJinjaIfStmt(ctx);
    }

    @Override
    public JinjaStatement visitJinjaForStmt(JinjaFlaskParser.JinjaForStmtContext ctx) {
        return super.visitJinjaForStmt(ctx);
    }
}
