package visitor.python;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.TemplateLiteral;
import ast.arithmeticExpr.ArithmeticExpression;
import ast.assignStmt.*;
import ast.complexExp.ComplexExpression;
import ast.compundStmt.PythonExpression;
import ast.condition.Condition;
import visitor.UniversalVisitor;

public class AssignmentStatementVisitor extends JinjaFlaskParserBaseVisitor<AssignmentStatement> {
    PythonExpressionVisitor leftSide = new PythonExpressionVisitor();

    @Override
    public AssignmentStatement visitComparisonAssignStmt(JinjaFlaskParser.ComparisonAssignStmtContext ctx) {
        ComparisonAssignmentStmt node = new ComparisonAssignmentStmt(ctx.getStart().getLine());
        ConditionVisitor rightSide = new ConditionVisitor();
        PythonExpression p  = (PythonExpression)  leftSide.visit(ctx.python_expr());
        Condition c = (Condition) rightSide.visit(ctx.condition());
        node.setVar(p);
        node.setValue(c);
        return node;
    }

    @Override
    public AssignmentStatement visitTemplateLiteralAssignStmt(JinjaFlaskParser.TemplateLiteralAssignStmtContext ctx) {
        TemplateLiteralAssignmentStatement node = new TemplateLiteralAssignmentStatement(ctx.getStart().getLine());
        TemplateLiteralVisitor rightSide = new TemplateLiteralVisitor();
        PythonExpression p  = (PythonExpression)  leftSide.visit(ctx.python_expr());
        TemplateLiteral c = (TemplateLiteral) rightSide.visit(ctx.template_literal());
        node.setVar(p);
        node.setTemplateLiteral(c);
        return node;
    }

    @Override
    public AssignmentStatement visitComplexExpressionAssignStatement(JinjaFlaskParser.ComplexExpressionAssignStatementContext ctx) {
        ComplexExpressionAssignStatement node = new ComplexExpressionAssignStatement(ctx.getStart().getLine());
        ComplexExpressionVisitor rightSide = new ComplexExpressionVisitor();
        PythonExpression p  = (PythonExpression)  leftSide.visit(ctx.python_expr());
        ComplexExpression c = (ComplexExpression) rightSide.visit(ctx.complex_expr());
        node.setVar(p);
        node.setComplexExpression(c);
        return node;
    }

    @Override
    public AssignmentStatement visitArithmeticAssignStmt(JinjaFlaskParser.ArithmeticAssignStmtContext ctx) {
        ArithmeticAssignStatement node = new ArithmeticAssignStatement(ctx.getStart().getLine());
        ArithmeticExpressionVisitor rightSide = new ArithmeticExpressionVisitor();
        PythonExpression p  = (PythonExpression)  leftSide.visit(ctx.python_expr());
        ArithmeticExpression c = (ArithmeticExpression) rightSide.visit(ctx.arithmetic_expr());
        node.setVar(p);
        node.setArithmeticExpression(c);
        return node;
    }

}
