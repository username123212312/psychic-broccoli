package visitor.css;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.cssTerm.*;

public class CssTermVisitor extends JinjaFlaskParserBaseVisitor<CssTerm> {
//    @Override
//    public FunctionTerm visitFunctionTerm(JinjaFlaskParser.FunctionTermContext ctx) {
//        CssFunctionArguments args = (CssTerm) visit(ctx.css_function_call());
//        return new FunctionTerm(ctx.getStart().getLine(),args );
//    }

    @Override
    public StringTerm visitStringTerm(JinjaFlaskParser.StringTermContext ctx) {
        String text = ctx.CSS_STRING().getText();
        return new StringTerm(ctx.getStart().getLine(), text );
    }

    @Override
    public ColorTerm visitColorTerm(JinjaFlaskParser.ColorTermContext ctx) {
        String hex = ctx.CSS_HEX_COLOR().getText();
        return new ColorTerm(ctx.getStart().getLine(), hex );
    }

    @Override
    public UnitNumberTerm visitUnitNumberTerm(JinjaFlaskParser.UnitNumberTermContext ctx) {
        double value = Double.parseDouble(ctx.CSS_NUMBER().getText());
        String text = ctx.CSS_UNIT().getText();
        return new UnitNumberTerm(ctx.getStart().getLine(), value, text );
    }


    @Override
    public NumberTerm visitNumberTerm(JinjaFlaskParser.NumberTermContext ctx) {
        double value = Double.parseDouble(ctx.CSS_NUMBER().getText());
        return new NumberTerm(ctx.getStart().getLine(), value );
    }

    @Override
    public IdentifierTerm visitIdentifierTerm(JinjaFlaskParser.IdentifierTermContext ctx) {
        String text = ctx.CSS_ID().getText();
        return new IdentifierTerm(ctx.getStart().getLine(), text );
    }
}
