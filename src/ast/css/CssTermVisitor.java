package ast.css;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.cssTerm.CssTerm;

public class CssTermVisitor extends JinjaFlaskParserBaseVisitor<CssTerm> {
    @Override
    public CssTerm visitFunctionTerm(JinjaFlaskParser.FunctionTermContext ctx) {
        return super.visitFunctionTerm(ctx);
    }

    @Override
    public CssTerm visitStringTerm(JinjaFlaskParser.StringTermContext ctx) {
        return super.visitStringTerm(ctx);
    }

    @Override
    public CssTerm visitColorTerm(JinjaFlaskParser.ColorTermContext ctx) {
        return super.visitColorTerm(ctx);
    }

    @Override
    public CssTerm visitUnitNumberTerm(JinjaFlaskParser.UnitNumberTermContext ctx) {
        return super.visitUnitNumberTerm(ctx);
    }

    @Override
    public CssTerm visitNumberTerm(JinjaFlaskParser.NumberTermContext ctx) {
        return super.visitNumberTerm(ctx);
    }

    @Override
    public CssTerm visitIdentifierTerm(JinjaFlaskParser.IdentifierTermContext ctx) {
        return super.visitIdentifierTerm(ctx);
    }
}
