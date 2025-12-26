package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.atom.*;
import ast.atom.Number;

public class JinjaAtomVisitor extends JinjaFlaskParserBaseVisitor<Atom> {
    @Override
    public Atom visitJinjaNumberAtom(JinjaFlaskParser.JinjaNumberAtomContext ctx) {
        Number number = new Number(ctx.start.getLine());
        number.setValue(ctx.J_NUMBER().getText());
        return number;
    }

    @Override
    public Atom visitJinjaStringAtom(JinjaFlaskParser.JinjaStringAtomContext ctx) {
        Str str = new Str(ctx.start.getLine());
        str.setValue(ctx.J_STRING().getText());
        return str;
    }

    @Override
    public Atom visitJinjaTrueAtom(JinjaFlaskParser.JinjaTrueAtomContext ctx) {
        Bool bool = new Bool(ctx.start.getLine());
        bool.setValue("True");
        return bool;
    }

    @Override
    public Atom visitJinjaFalseAtom(JinjaFlaskParser.JinjaFalseAtomContext ctx) {
        Bool bool = new Bool(ctx.start.getLine());
        bool.setValue("False");
        return bool;
    }

    @Override
    public Atom visitJinjaNoneAtom(JinjaFlaskParser.JinjaNoneAtomContext ctx) {
        return new None(ctx.start.getLine());
    }

    @Override
    public Atom visitJinjaNameAtom(JinjaFlaskParser.JinjaNameAtomContext ctx) {
        Name name = new Name(ctx.start.getLine());
        name.setValue(ctx.J_NAME().getText());
        return name;
    }
}
