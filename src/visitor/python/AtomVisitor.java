package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.atom.*;
import ast.atom.Number;

public class AtomVisitor extends JinjaFlaskParserBaseVisitor<Atom> {
    @Override
    public Atom visitNameAtom(JinjaFlaskParser.NameAtomContext ctx) {
        Name name = new Name(ctx.getStart().getLine());
        name.setValue(ctx.NAME().getText());
        return name;
    }

    @Override
    public ClassAtom visitClassAtom(JinjaFlaskParser.ClassAtomContext ctx) {
        ClassAtom classAtom = new ClassAtom(ctx.getStart().getLine());
        classAtom.setValue(ctx.CLASS_NAME());
        return classAtom;
    }

    @Override
    public Atom visitNumberAtom(JinjaFlaskParser.NumberAtomContext ctx) {
        Number number = new Number(ctx.getStart().getLine());
        number.setValue(ctx.NUMBER().getText());
        return number;
    }

    @Override
    public Atom visitStringAtom(JinjaFlaskParser.StringAtomContext ctx) {
        Str str = new Str(ctx.getStart().getLine());
        str.setValue(ctx.STRING().getText());
        return str;
    }

    @Override
    public Atom visitNoneAtom(JinjaFlaskParser.NoneAtomContext ctx) {
        return new None(ctx.getStart().getLine());
    }

    @Override
    public Atom visitBooleanAtom(JinjaFlaskParser.BooleanAtomContext ctx) {
        Bool bool = new Bool(ctx.getStart().getLine());
        if (ctx.getChild(0) instanceof JinjaFlaskParser.TrueAtomContext) {
            bool.setValue("True");
        } else {
            bool.setValue("False");
        }
        return bool;
    }


}
