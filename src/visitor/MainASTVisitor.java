package visitor;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.Program;
import ast.Statement;

import java.util.ArrayList;
import java.util.List;

public class MainASTVisitor extends JinjaFlaskParserBaseVisitor<ASTNode> {

    private final PythonVisitor pythonVisitor = new PythonVisitor();
    private final HtmlVisitor htmlVisitor = new HtmlVisitor();
    private final JinjaVisitor jinjaVisitor = new JinjaVisitor();
    private final CssVisitor cssVisitor = new CssVisitor();

    @Override
    public Program visitProgram(JinjaFlaskParser.ProgramContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (int i = 0 ; i < ctx.statement().size() ; i++) {
            statements.add((Statement)visit(ctx.statement(i)));
        }
        return new Program(ctx.getStart().getLine(), statements);
    }

    @Override
    public ASTNode visitCompoundStatement(JinjaFlaskParser.CompoundStatementContext ctx) {
        return pythonVisitor.visit(ctx);
    }

    @Override
    public ASTNode visitHtmlContent(JinjaFlaskParser.HtmlContentContext ctx) {
        return htmlVisitor.visit(ctx);
    }

    @Override
    public ASTNode visitJinjaStmtNode(JinjaFlaskParser.JinjaStmtNodeContext ctx) {
        return jinjaVisitor.visit(ctx);
    }

    @Override
    public ASTNode visitStyleSheet(JinjaFlaskParser.StyleSheetContext ctx) {
        return cssVisitor.visit(ctx);
    }


}
