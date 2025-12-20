package visitor.jinja;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.atom.Atom;

public class JinjaAtomVisitor extends JinjaFlaskParserBaseVisitor<Atom> {
    @Override
    public Atom visitJinjaNumberAtom(JinjaFlaskParser.JinjaNumberAtomContext ctx) {
        return super.visitJinjaNumberAtom(ctx);
    }

    @Override
    public Atom visitJinjaStringAtom(JinjaFlaskParser.JinjaStringAtomContext ctx) {
        return super.visitJinjaStringAtom(ctx);
    }

    @Override
    public Atom visitJinjaTrueAtom(JinjaFlaskParser.JinjaTrueAtomContext ctx) {
        return super.visitJinjaTrueAtom(ctx);
    }

    @Override
    public Atom visitJinjaFalseAtom(JinjaFlaskParser.JinjaFalseAtomContext ctx) {
        return super.visitJinjaFalseAtom(ctx);
    }

    @Override
    public Atom visitJinjaNoneAtom(JinjaFlaskParser.JinjaNoneAtomContext ctx) {
        return super.visitJinjaNoneAtom(ctx);
    }

    @Override
    public Atom visitJinjaNameAtom(JinjaFlaskParser.JinjaNameAtomContext ctx) {
        return super.visitJinjaNameAtom(ctx);
    }
}
