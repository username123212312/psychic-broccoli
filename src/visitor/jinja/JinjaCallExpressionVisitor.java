package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.atom.Atom;
import ast.jinja.JinjaArgumentsList;
import ast.jinja.jinjaCallExpr.JinjaAtom;
import ast.jinja.jinjaCallExpr.JinjaCallExpression;
import ast.jinja.jinjaCallExpr.JinjaFilteredExpression;
import ast.jinja.jinjaCallExpr.JinjaFunctionCall;
import ast.jinja.jinjaCallExpr.JinjaVariableAccess;

public class JinjaCallExpressionVisitor extends JinjaFlaskParserBaseVisitor<JinjaCallExpression> {
    JinjaVisitor jinjaVisitor = new JinjaVisitor();

    @Override
    public JinjaCallExpression visitJinjaFilteredExpr(JinjaFlaskParser.JinjaFilteredExprContext ctx) {
        JinjaFilteredExpression jinjaFilteredExpression = new JinjaFilteredExpression(ctx.start.getLine());
        JinjaVariableAccess jinjaVariableAccess = (JinjaVariableAccess) jinjaVisitor.visit(ctx.j_var_access());
        jinjaFilteredExpression.setJinjaVariableAccess(jinjaVariableAccess);
        if (ctx.getChild(2) != null) {
            jinjaFilteredExpression.setFilterName(ctx.getChild(2).getText());
        }
        return jinjaFilteredExpression;
    }

    @Override
    public JinjaCallExpression visitJinjaFunctionCall(JinjaFlaskParser.JinjaFunctionCallContext ctx) {
        JinjaFunctionCall jinjaFunctionCall = new JinjaFunctionCall(ctx.start.getLine());
        jinjaFunctionCall.setFunctionName(ctx.J_NAME().getText());
        if (ctx.j_argument_list() != null) {
            JinjaArgumentsList jinjaArgumentsList = (JinjaArgumentsList) jinjaVisitor.visit(ctx.j_argument_list());
            jinjaFunctionCall.setArgumentsList(jinjaArgumentsList);
        }
        return jinjaFunctionCall;
    }

    @Override
    public JinjaCallExpression visitJinjaVarAccessOnly(JinjaFlaskParser.JinjaVarAccessOnlyContext ctx) {
        return visit(ctx.j_var_access());
    }

    @Override
    public JinjaCallExpression visitJinjaVarAccessOnlyDef(JinjaFlaskParser.JinjaVarAccessOnlyDefContext ctx) {
        JinjaVariableAccess jinjaVariableAccess = new JinjaVariableAccess(ctx.start.getLine());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.J_NAME(0));
        for (int i = 0; i < ctx.J_NAME().size(); i++) {
            stringBuilder.append(".").append(ctx.J_NAME(i));
        }
        jinjaVariableAccess.setDottedName(stringBuilder.toString());
        return jinjaVariableAccess;
    }

    @Override
    public JinjaCallExpression visitJinjaAtomOnly(JinjaFlaskParser.JinjaAtomOnlyContext ctx) {
        JinjaAtomVisitor jinjaAtomVisitor = new JinjaAtomVisitor();
        Atom atom = jinjaAtomVisitor.visit(ctx.j_atom());
        return new JinjaAtom(ctx.start.getLine(), atom);
    }
}
