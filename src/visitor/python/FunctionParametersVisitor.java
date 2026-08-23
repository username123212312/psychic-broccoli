package visitor.python;

import antlr.python.PythonParser;
import antlr.python.PythonParserBaseVisitor;
import ast.atom.Atom;
import ast.functionDef.FunctionParameter;
import ast.functionDef.FunctionParameters;

import java.util.ArrayList;
import java.util.List;

public class FunctionParametersVisitor extends PythonParserBaseVisitor<FunctionParameters> {
    @Override
    public FunctionParameters visitFunctionParamList(PythonParser.FunctionParamListContext ctx) {
        FunctionParameters functionParameters = new FunctionParameters(ctx.getStart().getLine());
        AtomVisitor atomVisitor = new AtomVisitor();
        List<FunctionParameter> functionParameterList = new ArrayList<>();
        for (PythonParser.Fun_paramContext paramCtx : ctx.fun_param()) {
            FunctionParameter functionParameter = new FunctionParameter(paramCtx.getStart().getLine());
            if (paramCtx instanceof PythonParser.ParamWithDefaultContext) {
                PythonParser.ParamWithDefaultContext defCtx = (PythonParser.ParamWithDefaultContext) paramCtx;
                functionParameter.setId(defCtx.NAME().getText());
                Atom atom = atomVisitor.visit(defCtx.atom());
                functionParameter.setValue(atom);
            } else {
                functionParameter.setId(paramCtx.getText());
            }
            functionParameterList.add(functionParameter);
        }
        functionParameters.setParameters(functionParameterList);
        return functionParameters;
    }
}
