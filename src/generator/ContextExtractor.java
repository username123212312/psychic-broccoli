package generator;

import ast.ASTNode;
import ast.ElIfStatement;
import ast.Program;
import ast.Statement;
import ast.WhileStatement;
import ast.assignStmt.*;
import ast.atom.*;
import ast.atomExpression.*;
import ast.compundStmt.CompoundStatement;
import ast.compundStmt.ForLoop;
import ast.compundStmt.IfStatement;
import ast.compundStmt.PythonExpression;
import ast.complexExp.*;
import ast.functionDef.Decorator;
import ast.functionDef.FunctionDefinition;
import ast.keyValue.*;
import ast.argsList.*;
import ast.argument.*;
import ast.returnStmt.ComplexReturnStatement;
import ast.returnStmt.ReturnStatement;

import java.math.BigInteger;
import java.util.*;

public class ContextExtractor {

    public Map<String, Object> extract(Program program) {
        Map<String, Object> context = new LinkedHashMap<>();
        if (program == null || program.getStatements() == null) return context;
        for (Statement stmt : program.getStatements()) {
            if (stmt.getCompoundStatements() == null) continue;
            for (CompoundStatement cs : stmt.getCompoundStatements()) {
                if (cs instanceof AssignmentStatement as) {
                    String varName = extractVarName(as.getVar());
                    if (varName == null) continue;
                    Object value = extractAssignmentValue(as);
                    if (value != null) {
                        context.put(varName, value);
                    }
                }
            }
        }
        return context;
    }

    public Map<String, String> extractRoutes(Program program) {
        Map<String, String> routes = new LinkedHashMap<>();
        if (program == null || program.getStatements() == null) return routes;
        for (Statement stmt : program.getStatements()) {
            if (stmt.getCompoundStatements() == null) continue;
            for (CompoundStatement cs : stmt.getCompoundStatements()) {
                if (cs instanceof FunctionDefinition fd) {
                    Decorator dec = fd.getDecorator();
                    if (dec == null || dec.getArguments() == null) continue;
                    String decName = dec.getDecoratorName();
                    if (decName == null || !decName.endsWith("route")) continue;
                    String path = extractFirstStringArg(dec.getArguments());
                    if (path != null) {
                        routes.put(fd.getFunctionName(), path);
                    }
                }
            }
        }
        return routes;
    }

    private String extractFirstStringArg(ArgumentsList args) {
        if (args instanceof AtomArguments atomArgs) {
            if (atomArgs.getArgs() != null && !atomArgs.getArgs().isEmpty()) {
                Atom first = atomArgs.getArgs().get(0);
                if (first instanceof Str s) {
                    String val = String.valueOf(s.getValue());
                    if (val.length() >= 2) {
                        val = val.substring(1, val.length() - 1);
                    }
                    return val;
                }
            }
        } else if (args instanceof ComplexArguments complexArgs) {
            if (complexArgs.getArguments() != null && !complexArgs.getArguments().isEmpty()) {
                Argument first = complexArgs.getArguments().get(0);
                if (first instanceof PositionalArgument pos) {
                    PythonExpression argExpr = pos.getArg();
                    return extractStringFromExpression(argExpr);
                }
            }
        }
        return null;
    }

    private String extractStringFromExpression(PythonExpression expr) {
        if (expr instanceof ast.atomExpression.LiteralExpression lit) {
            String val = lit.getLiteralValue();
            if (val != null && val.length() >= 2) {
                val = val.substring(1, val.length() - 1);
            }
            return val;
        }
        return null;
    }

    private String extractVarName(PythonExpression var) {
        if (var instanceof SimpleVariable sv) {
            return sv.getVarName();
        }
        return null;
    }

    private Object extractAssignmentValue(AssignmentStatement stmt) {
        if (stmt instanceof PythonExpressionAssignStatement pyStmt) {
            return extractValue(pyStmt.getValue());
        }
        if (stmt instanceof TemplateLiteralAssignmentStatement tlStmt) {
            if (tlStmt.getTemplateLiteral() != null) {
                return tlStmt.getTemplateLiteral().getContent();
            }
        }
        return null;
    }

    private Object extractValue(PythonExpression expr) {
        if (expr == null) return null;
        if (expr instanceof ListLiteral listLit) {
            List<Object> items = new ArrayList<>();
            if (listLit.getListItems() != null) {
                for (PythonExpression item : listLit.getListItems()) {
                    items.add(extractPythonExpressionValue(item));
                }
            }
            return items;
        }
        if (expr instanceof DictionaryLiteral dictLit) {
            return extractDict(dictLit);
        }
        if (expr instanceof LiteralExpression le) {
            return parseLiteralValue(le.getLiteralValue());
        }
        return null;
    }

    private static Object parseLiteralValue(String val) {
        if (val == null) return "NONE_PLACEHOLDER";
        if ("True".equals(val)) return Boolean.TRUE;
        if ("False".equals(val)) return Boolean.FALSE;
        if (val.length() >= 2) {
            char first = val.charAt(0);
            char last = val.charAt(val.length() - 1);
            if ((first == '\'' && last == '\'') || (first == '"' && last == '"')) {
                return val.substring(1, val.length() - 1);
            }
        }
        try {
            if (val.contains(".") || val.contains("e") || val.contains("E")) {
                return Double.parseDouble(val);
            } else {
                return new BigInteger(val);
            }
        } catch (NumberFormatException e) {
            return val;
        }
    }

    private Object extractPythonExpressionValue(PythonExpression expr) {
        if (expr instanceof LiteralExpression le) {
            return parseLiteralValue(le.getLiteralValue());
        }
        if (expr instanceof DictionaryLiteral dictLit) {
            return extractDict(dictLit);
        }
        if (expr instanceof ListLiteral listLit) {
            List<Object> items = new ArrayList<>();
            if (listLit.getListItems() != null) {
                for (PythonExpression item : listLit.getListItems()) {
                    items.add(extractPythonExpressionValue(item));
                }
            }
            return items;
        }
        return expr.symbolTablePrint();
    }

    private Map<String, Object> extractDict(DictionaryLiteral dict) {
        Map<String, Object> result = new LinkedHashMap<>();
        if (dict.getKeyValues() != null) {
            for (KeyValue kv : dict.getKeyValues()) {
                if (kv.getKey() == null || kv.getKey().getValue() == null) continue;
                String key = String.valueOf(kv.getKey().getValue());
                if (key.length() >= 2) {
                    char f = key.charAt(0), l = key.charAt(key.length() - 1);
                    if ((f == '\'' && l == '\'') || (f == '"' && l == '"')) {
                        key = key.substring(1, key.length() - 1);
                    }
                }
                if (kv instanceof AtomKeyValue akv) {
                    Object val = extractAtomValue(akv.getValue());
                    if (val instanceof java.lang.Number || val instanceof Boolean || val instanceof String || val == null) {
                        result.put(key, val);
                    } else {
                        result.put(key, String.valueOf(val));
                    }
                } else if (kv instanceof SimpleKeyValue skv) {
                    result.put(key, skv.symbolTablePrint());
                }
            }
        }
        return result;
    }

    private Object extractAtomValue(Atom atom) {
        if (atom == null) return null;
        Object raw = atom.getValue();
        if (atom instanceof Str s && raw instanceof String strVal) {
            if (strVal.length() >= 2) {
                char f = strVal.charAt(0), l = strVal.charAt(strVal.length() - 1);
                if ((f == '\'' && l == '\'') || (f == '"' && l == '"')) {
                    return strVal.substring(1, strVal.length() - 1);
                }
            }
            return strVal;
        }
        if (atom instanceof ast.atom.Number) {
            try {
                String s = String.valueOf(raw);
                if (s.contains(".")) return Double.parseDouble(s);
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return raw;
            }
        }
        if (atom instanceof Bool) {
            return "True".equals(String.valueOf(raw));
        }
        return raw;
    }

    public Map<String, Set<String>> extractRenderTemplateVars(Program program) {
        Map<String, Set<String>> templateVars = new LinkedHashMap<>();
        if (program == null || program.getStatements() == null) return templateVars;
        for (Statement statement : program.getStatements()) {
            scanStatement(statement, templateVars);
        }
        return templateVars;
    }

    private void scanStatement(Statement statement, Map<String, Set<String>> templateVars) {
        if (statement == null || statement.getCompoundStatements() == null) return;
        for (CompoundStatement compoundStatement : statement.getCompoundStatements()) {
            scanCompound(compoundStatement, templateVars);
        }
    }

    private void scanCompound(CompoundStatement compoundStatement, Map<String, Set<String>> templateVars) {
        if (compoundStatement == null) return;
        switch (compoundStatement) {
            case ReturnStatement returnStatement -> scanReturn(returnStatement, templateVars);
            case FunctionDefinition functionDefinition ->
                    scanStatement(functionDefinition.getFunctionBody(), templateVars);
            case IfStatement ifStatement -> {
                scanStatement(ifStatement.getStatement(), templateVars);
                if (ifStatement.getElifStatements() != null) {
                    for (ElIfStatement elIfStatement : ifStatement.getElifStatements()) {
                        scanStatement(elIfStatement.getStatement(), templateVars);
                    }
                }
                scanStatement(ifStatement.getElseStatement(), templateVars);
            }
            case WhileStatement whileStatement -> scanStatement(whileStatement.getStatement(), templateVars);
            case ForLoop forLoop -> scanStatement(forLoop.getStatement(), templateVars);
            case PythonExpressionAssignStatement pythonExpressionAssignStatement ->
                    scanExpression(pythonExpressionAssignStatement.getValue(), templateVars);
            default -> { }
        }
    }

    private void scanReturn(ReturnStatement returnStatement, Map<String, Set<String>> templateVars) {
        if (!(returnStatement instanceof ComplexReturnStatement complexReturnStatement)) return;
        ASTNode returned = complexReturnStatement.getPythonExpression() != null
                ? complexReturnStatement.getPythonExpression()
                : complexReturnStatement.getExpression();
        if (returned instanceof PythonExpression pythonExpression) {
            scanExpression(pythonExpression, templateVars);
        }
    }

    private void scanExpression(PythonExpression expression, Map<String, Set<String>> templateVars) {
        if (expression == null) return;
        switch (expression) {
            case FunctionCall functionCall -> {
                harvestRenderTemplate(functionCall, templateVars);
                scanArguments(functionCall.getArgumentsList(), templateVars);
            }
            case ObjectCreation objectCreation -> scanArguments(objectCreation.getArgumentsList(), templateVars);
            case MethodAccess methodAccess -> {
                if (methodAccess.getMethodCalls() != null) {
                    for (PythonExpression call : methodAccess.getMethodCalls()) {
                        scanExpression(call, templateVars);
                    }
                }
            }
            case ListLiteral listLiteral -> {
                if (listLiteral.getListItems() != null) {
                    for (PythonExpression item : listLiteral.getListItems()) {
                        scanExpression(item, templateVars);
                    }
                }
            }
            default -> { }
        }
    }

    private void scanArguments(ArgumentsList argumentsList, Map<String, Set<String>> templateVars) {
        if (!(argumentsList instanceof ComplexArguments complexArguments)
                || complexArguments.getArguments() == null) return;
        for (Argument argument : complexArguments.getArguments()) {
            scanExpression(argument.getArg(), templateVars);
        }
    }

    private void harvestRenderTemplate(FunctionCall functionCall, Map<String, Set<String>> templateVars) {
        if (!"render_template".equals(functionCall.getVarName())) return;
        ArgumentsList argumentsList = functionCall.getArgumentsList();
        if (argumentsList == null) return;

        String templateName = extractTemplateName(argumentsList);
        if (templateName == null) return;

        Set<String> providedVars = templateVars.computeIfAbsent(templateName, key -> new LinkedHashSet<>());
        if (argumentsList instanceof ComplexArguments complexArguments
                && complexArguments.getArguments() != null) {
            for (Argument argument : complexArguments.getArguments()) {
                if (argument instanceof KeywordArgument keywordArgument && keywordArgument.getArgName() != null) {
                    providedVars.add(keywordArgument.getArgName());
                }
            }
        }
    }

    private String extractTemplateName(ArgumentsList argumentsList) {
        if (argumentsList instanceof AtomArguments atomArguments
                && atomArguments.getArgs() != null && !atomArguments.getArgs().isEmpty()) {
            return stripQuotes(String.valueOf(atomArguments.getArgs().get(0).getValue()));
        }
        if (argumentsList instanceof ComplexArguments complexArguments
                && complexArguments.getArguments() != null && !complexArguments.getArguments().isEmpty()) {
            Argument first = complexArguments.getArguments().get(0);
            if (first instanceof PositionalArgument positionalArgument
                    && positionalArgument.getArg() instanceof LiteralExpression literalExpression) {
                return stripQuotes(literalExpression.getLiteralValue());
            }
        }
        return null;
    }

    private String stripQuotes(String value) {
        if (value == null || value.length() < 2) return value;
        char first = value.charAt(0);
        char last = value.charAt(value.length() - 1);
        if ((first == '\'' && last == '\'') || (first == '"' && last == '"')) {
            return value.substring(1, value.length() - 1);
        }
        return value;
    }
}
