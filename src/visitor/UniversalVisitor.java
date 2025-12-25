package visitor;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.HtmlContent;
import ast.Imported;
import ast.atom.Atom;
import ast.atom.Bool;
import ast.complexExp.ListItems;
import ast.functionDef.Decorator;
import ast.functionDef.FunctionParameters;
import ast.htmlElement.StyleSheet;
import ast.keyValue.KeyValue;
import visitor.css.StyleSheetVisitor;
import visitor.python.ArgumentListVisitor;
import visitor.python.AtomVisitor;
import visitor.python.KeyValueVisitor;

import java.util.ArrayList;
import java.util.List;

public class UniversalVisitor extends JinjaFlaskParserBaseVisitor<ASTNode> {
    @Override
    public FunctionParameters visitFunctionParameters(JinjaFlaskParser.FunctionParametersContext ctx) {
        return new FunctionParameters(ctx.getStart().getLine(), new ArrayList<>());
    }

    @Override
    public ListItems visitListItems(JinjaFlaskParser.ListItemsContext ctx) {
        ListItems listItems = new ListItems(ctx.getStart().getLine());
        List<Atom> atomList = new ArrayList<>();
        AtomVisitor atomVisitor = new AtomVisitor();
        for (int i = 0; i < ctx.atom().size(); i++) {
            Atom atom = atomVisitor.visit(ctx.atom(i));
            atomList.add(atom);
        }
        listItems.setAtomList(atomList);

        return listItems;
    }

    @Override
    public Decorator visitDecorator(JinjaFlaskParser.DecoratorContext ctx) {
        ArgumentListVisitor argumentListVisitor = new ArgumentListVisitor();
        return new Decorator(ctx.getStart().getLine(), "", argumentListVisitor.visit(ctx));
    }

    @Override
    public Imported visitImported(JinjaFlaskParser.ImportedContext ctx) {
        Imported imported = new Imported(ctx.getStart().getLine());
        imported.setName(ctx.NAME(0).getText());
        if (ctx.NAME(1) != null) {
            imported.setAlias(ctx.NAME(1).getText());
        }
        return imported;
    }


    @Override
    public KeyValue visitKeyValuePairs(JinjaFlaskParser.KeyValuePairsContext ctx) {
        KeyValueVisitor keyValueVisitor = new KeyValueVisitor();
        // Dummy
        return keyValueVisitor.visit(ctx.key_value(0));
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

    @Override
    public Bool visitTrueAtom(JinjaFlaskParser.TrueAtomContext ctx) {
        Bool bool = new Bool(ctx.getStart().getLine());
        bool.setValue("True");
        return bool;
    }

    @Override
    public Bool visitFalseAtom(JinjaFlaskParser.FalseAtomContext ctx) {
        Bool bool = new Bool(ctx.getStart().getLine());
        bool.setValue("False");
        return bool;
    }

}
