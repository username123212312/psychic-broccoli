package visitor;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.argsList.ArgumentsList;
import ast.functionDef.Decorator;
import ast.functionDef.FunctionParameters;

import java.util.ArrayList;

public class UniversalVisitor extends JinjaFlaskParserBaseVisitor<ASTNode> {
    @Override
    public FunctionParameters visitFunctionParameters(JinjaFlaskParser.FunctionParametersContext ctx) {
        return new FunctionParameters(ctx.getStart().getLine(), new ArrayList<>());
    }

    @Override
    public Decorator visitDecorator(JinjaFlaskParser.DecoratorContext ctx) {
        ArgumentListVisitor argumentListVisitor = new ArgumentListVisitor();
        return new Decorator(ctx.getStart().getLine(), "", argumentListVisitor.visit(ctx));
    }

}
