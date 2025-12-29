package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.argsList.ArgumentsList;
import ast.atom.Atom;
import ast.atomExpression.*;
import visitor.UniversalVisitor;

import java.util.ArrayList;
import java.util.List;

public class AtomExpressionVisitor extends JinjaFlaskParserBaseVisitor<AtomExpression> {
    private final AtomVisitor atomVisitor = new AtomVisitor();

    @Override
    public AtomExpression visitListAccess(JinjaFlaskParser.ListAccessContext ctx) {
        ListAccess listAccess = new ListAccess(ctx.getStart().getLine());
        Atom atom = atomVisitor.visit(ctx.atom());
        listAccess.setVarName(atom.getValue().toString());
        listAccess.setIndex(ctx.NUMBER().getText());

        return listAccess;
    }

    @Override
    public AtomExpression visitDictionaryAccess(JinjaFlaskParser.DictionaryAccessContext ctx) {
        DictionaryAccess dictionaryAccess = new DictionaryAccess(ctx.getStart().getLine());
        Atom atom = atomVisitor.visit(ctx.atom());
        dictionaryAccess.setVarName(atom.getValue().toString());
        dictionaryAccess.setKey(ctx.STRING().getText());
        return dictionaryAccess;
    }

    @Override
    public AtomExpression visitAttributeAccess(JinjaFlaskParser.AttributeAccessContext ctx) {
        AttributeAccess attributeAccess = new AttributeAccess(ctx.getStart().getLine());
        Atom atom = atomVisitor.visit(ctx.atom(0));
        List<Atom> atomList = new ArrayList<>();
        for (int i = 1; i < ctx.atom().size(); i++) {
            Atom a = atomVisitor.visit(ctx.atom(i));
            atomList.add(a);
        }
        attributeAccess.setVarName(atom.getValue().toString());
        attributeAccess.setAttributes(atomList);
        return attributeAccess;
    }

    @Override
    public AtomExpression visitMethodAccess(JinjaFlaskParser.MethodAccessContext ctx) {
        MethodAccess methodAccess = new MethodAccess(ctx.getStart().getLine());
        Atom atom = atomVisitor.visit(ctx.atom());
        List<AtomExpression> atomExpressions = new ArrayList<>();
        for (int i = 0; i < ctx.atom_expr().size(); i++) {
            AtomExpression atomExpression = visit(ctx.atom_expr(i));
            atomExpressions.add(atomExpression);
        }
        methodAccess.setVarName(atom.getValue().toString());
        methodAccess.setMethodCalls(atomExpressions);
        return methodAccess;
    }

    @Override
    public AtomExpression visitObjectCreation(JinjaFlaskParser.ObjectCreationContext ctx) {
        ObjectCreation objectCreation = new ObjectCreation(ctx.getStart().getLine());
        objectCreation.setVarName(ctx.CLASS_NAME().getText());
        if (ctx.arglist() != null) {
            ArgumentsList argumentsList = new ArgumentListVisitor().visit(ctx.arglist());
            objectCreation.setArgumentsList(argumentsList);
        }
        return objectCreation;
    }

    @Override
    public AtomExpression visitFunctionCall(JinjaFlaskParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall(ctx.getStart().getLine());
        functionCall.setVarName(ctx.NAME().getText());
        if (ctx.arglist() != null) {
            ArgumentsList argumentsList = new ArgumentListVisitor().visit(ctx.arglist());
            functionCall.setArgumentsList(argumentsList);
        }
        return functionCall;
    }

    @Override
    public AtomExpression visitSimpleVar(JinjaFlaskParser.SimpleVarContext ctx) {
        SimpleVariable simpleVariable = new SimpleVariable(ctx.getStart().getLine());
        Atom atom = atomVisitor.visit(ctx.atom());
        simpleVariable.setVarName(atom.getValue().toString());
        return simpleVariable;
    }
}
