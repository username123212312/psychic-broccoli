package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.atom.Atom;

public class AtomVisitor extends JinjaFlaskParserBaseVisitor<Atom> {
    @Override
    public Atom visitNameAtom(JinjaFlaskParser.NameAtomContext ctx) {
        return super.visitNameAtom(ctx);
    }

    @Override
    public Atom visitNumberAtom(JinjaFlaskParser.NumberAtomContext ctx) {
        return super.visitNumberAtom(ctx);
    }

    @Override
    public Atom visitStringAtom(JinjaFlaskParser.StringAtomContext ctx) {
        return super.visitStringAtom(ctx);
    }

    @Override
    public Atom visitNoneAtom(JinjaFlaskParser.NoneAtomContext ctx) {
        return super.visitNoneAtom(ctx);
    }

    @Override
    public Atom visitBooleanAtom(JinjaFlaskParser.BooleanAtomContext ctx) {
        return super.visitBooleanAtom(ctx);
    }
}
