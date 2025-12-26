package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.HtmlContent;
import ast.jinja.jinjaExpression.JinjaExpression;
import ast.jinja.jinjaStatment.*;
import visitor.UniversalVisitor;

public class JinjaStatementVisitor extends JinjaFlaskParserBaseVisitor<JinjaStatement> {
    private final UniversalVisitor universalVisitor = new UniversalVisitor();

    @Override
    public JinjaStatement visitJinjaExtendsStmt(JinjaFlaskParser.JinjaExtendsStmtContext ctx) {
        return visit(ctx.j_extends_stmt());
    }

    @Override
    public JinjaExtendStatement visitJinjaExtendsStmtDef(JinjaFlaskParser.JinjaExtendsStmtDefContext ctx) {
        JinjaExtendStatement jinjaExtendStatement = new JinjaExtendStatement(ctx.start.getLine());
        jinjaExtendStatement.setExtended(ctx.J_STRING().getText());
        return jinjaExtendStatement;
    }

    @Override
    public JinjaStatement visitJinjaBlockStmt(JinjaFlaskParser.JinjaBlockStmtContext ctx) {
        return visit(ctx.j_block_stmt());
    }

    @Override
    public JinjaBlockStatement visitJinjaBlockStmtDef(JinjaFlaskParser.JinjaBlockStmtDefContext ctx) {
        JinjaBlockStatement jinjaBlockStatement = new JinjaBlockStatement(ctx.start.getLine());
        jinjaBlockStatement.setBlockName(ctx.J_NAME().getFirst().getText());
        HtmlContent htmlContent = (HtmlContent) universalVisitor.visit(ctx.html_content());
        jinjaBlockStatement.setHtmlContent(htmlContent);
        return jinjaBlockStatement;
    }

    @Override
    public JinjaStatement visitJinjaForStmt(JinjaFlaskParser.JinjaForStmtContext ctx) {
        return visit(ctx.j_for_stmt());
    }

    @Override
    public JinjaForStatement visitJinjaForStmtDef(JinjaFlaskParser.JinjaForStmtDefContext ctx) {
        JinjaForStatement jinjaForStatement = new JinjaForStatement(ctx.start.getLine());
        jinjaForStatement.setId(ctx.J_NAME().getText());
        JinjaExpressionVisitor jinjaExpressionVisitor = new JinjaExpressionVisitor();
        JinjaExpression jinjaExpression = jinjaExpressionVisitor.visit(ctx.j_expression());
        HtmlContent htmlContent = (HtmlContent) universalVisitor.visit(ctx.html_content());
        jinjaForStatement.setIterable(jinjaExpression);
        jinjaForStatement.setHtmlContent(htmlContent);
        return jinjaForStatement;
    }

    @Override
    public JinjaStatement visitJinjaIfStmt(JinjaFlaskParser.JinjaIfStmtContext ctx) {
        return visit(ctx.j_if_stmt());
    }

    @Override
    public JinjaStatement visitJinjaIfStmtDef(JinjaFlaskParser.JinjaIfStmtDefContext ctx) {
        JinjaIfStatement jinjaIfStatement = new JinjaIfStatement(ctx.start.getLine());
        JinjaExpression jinjaExpression = new JinjaExpressionVisitor().visit(ctx.j_expression());
        HtmlContent htmlContent = (HtmlContent) universalVisitor.visit(ctx.html_content());
        jinjaIfStatement.setHtmlContent(htmlContent);
        jinjaIfStatement.setCondition(jinjaExpression);
        return jinjaIfStatement;
    }
}
