package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.jinja.jinjaStatment.JinjaStmtItem;

public class JinjaStatementVisitor extends JinjaFlaskParserBaseVisitor<JinjaStmtItem> {
    @Override
    public JinjaStmtItem visitJinjaExtendsStmt(JinjaFlaskParser.JinjaExtendsStmtContext ctx) {
        return super.visitJinjaExtendsStmt(ctx);
    }

    @Override
    public JinjaStmtItem visitJinjaBlockStmt(JinjaFlaskParser.JinjaBlockStmtContext ctx) {
        return super.visitJinjaBlockStmt(ctx);
    }

    @Override
    public JinjaStmtItem visitJinjaIfStmt(JinjaFlaskParser.JinjaIfStmtContext ctx) {
        return super.visitJinjaIfStmt(ctx);
    }

    @Override
    public JinjaStmtItem visitJinjaForStmt(JinjaFlaskParser.JinjaForStmtContext ctx) {
        return super.visitJinjaForStmt(ctx);
    }
}
