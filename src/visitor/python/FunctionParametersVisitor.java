package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.atom.Atom;
import ast.functionDef.FunctionParameter;
import ast.functionDef.FunctionParameters;

import java.util.ArrayList;
import java.util.List;

public class FunctionParametersVisitor extends JinjaFlaskParserBaseVisitor<FunctionParameters> {
    @Override
    public FunctionParameters visitKeywordParams(JinjaFlaskParser.KeywordParamsContext ctx) {
        FunctionParameters functionParameters = new FunctionParameters(ctx.getStart().getLine());
        AtomVisitor atomVisitor = new AtomVisitor();
        List<FunctionParameter> functionParameterList = new ArrayList<>();
        for (int i = 0; i < ctx.NAME().size(); i++) {
            FunctionParameter functionParameter = new FunctionParameter(ctx.NAME(i).getSymbol().getLine());
            functionParameter.setId(ctx.NAME(i).getText());
            Atom atom = atomVisitor.visit(ctx.atom(i));
            functionParameter.setValue(atom);
        }
        functionParameters.setParameters(functionParameterList);
        return functionParameters;
    }

    @Override
    public FunctionParameters visitPositionalParams(JinjaFlaskParser.PositionalParamsContext ctx) {
        FunctionParameters functionParameters = new FunctionParameters(ctx.getStart().getLine());
        List<FunctionParameter> functionParameterList = new ArrayList<>();
        for (int i = 0; i < ctx.NAME().size(); i++) {
            FunctionParameter functionParameter = new FunctionParameter(ctx.NAME(i).getSymbol().getLine());
            functionParameter.setId(ctx.NAME(i).getText());
        }
        functionParameters.setParameters(functionParameterList);
        return functionParameters;
    }
}
