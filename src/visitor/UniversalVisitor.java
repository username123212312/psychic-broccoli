package visitor;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.HtmlContent;
import ast.Imported;
import ast.complexExp.ExpressionList;
import ast.functionDef.Decorator;
import ast.functionDef.FunctionParameters;
import ast.htmlElement.StyleSheet;
import ast.keyValue.KeyValue;
import visitor.css.StyleSheetVisitor;
import visitor.python.ArgumentListVisitor;
import visitor.python.KeyValueVisitor;

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

    @Override
    public Imported visitImported(JinjaFlaskParser.ImportedContext ctx) {
        return new Imported(ctx.getStart().getLine(), "");
    }

    @Override
    public KeyValue visitKeyValuePairs(JinjaFlaskParser.KeyValuePairsContext ctx) {
        KeyValueVisitor keyValueVisitor = new KeyValueVisitor();
        // Dummy
        return keyValueVisitor.visit(ctx.key_value(0));
    }

    @Override
    public ExpressionList visitExpressionList(JinjaFlaskParser.ExpressionListContext ctx) {
        return new ExpressionList(ctx.getStart().getLine(), new ArrayList<>());
    }

    @Override
    public HtmlContent visitHtmlContent(JinjaFlaskParser.HtmlContentContext ctx) {
        return new HtmlContent(ctx.getStart().getLine(), new ArrayList<>());
    }

    @Override
    public StyleSheet visitStyleSheet(JinjaFlaskParser.StyleSheetContext ctx) {
        StyleSheetVisitor styleSheetVisitor = new StyleSheetVisitor();
        return styleSheetVisitor.visitStyleSheet(ctx);
    }


}
