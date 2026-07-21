package generator;

import ast.Program;
import ast.Statement;
import ast.assignStmt.*;
import ast.atom.*;
import ast.atomExpression.*;
import ast.compundStmt.CompoundStatement;
import ast.compundStmt.PythonExpression;
import ast.complexExp.*;
import ast.functionDef.Decorator;
import ast.functionDef.FunctionDefinition;
import ast.keyValue.*;
import ast.argsList.*;
import ast.argument.*;
import cpython_bytecode.codegen.CodegenContext;

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
            return CodegenContext.parseLiteralValue(le.getLiteralValue());
        }
        return null;
    }

    private Object extractPythonExpressionValue(PythonExpression expr) {
        if (expr instanceof LiteralExpression le) {
            return CodegenContext.parseLiteralValue(le.getLiteralValue());
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
}
