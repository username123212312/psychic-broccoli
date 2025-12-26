package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.jinja.JinjaArgumentsList;
import ast.jinja.jinjaArg.JinjaArgument;
import ast.jinja.jinjaCallExpr.JinjaVariableAccess;

import java.util.ArrayList;
import java.util.List;


public class JinjaVisitor extends JinjaFlaskParserBaseVisitor<ASTNode> {

    @Override
    public JinjaVariableAccess visitJinjaVarAccessOnlyDef(JinjaFlaskParser.JinjaVarAccessOnlyDefContext ctx) {
        JinjaVariableAccess jinjaVariableAccess = new JinjaVariableAccess(ctx.start.getLine());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.J_NAME(0));
        for (int i = 1; i < ctx.J_NAME().size(); i++) {
            stringBuilder.append(".").append(ctx.J_NAME(i));
        }
        jinjaVariableAccess.setDottedName(stringBuilder.toString());
        return jinjaVariableAccess;
    }

    @Override
    public JinjaArgumentsList visitJinjaArgListDef(JinjaFlaskParser.JinjaArgListDefContext ctx) {
        JinjaArgumentsList jinjaArgumentsList = new JinjaArgumentsList(ctx.start.getLine());
        JinjaArgumentVisitor jinjaArgumentVisitor = new JinjaArgumentVisitor();
        List<JinjaArgument> arguments = new ArrayList<>();
        for(int i = 0; i < ctx.j_argument().size();i ++){
            JinjaArgument jinjaArgument = jinjaArgumentVisitor.visit(ctx.j_argument(i));
            arguments.add(jinjaArgument);
        }
        jinjaArgumentsList.setArguments(arguments);
        return jinjaArgumentsList;
    }
}
