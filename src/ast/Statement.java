package ast;

import ast.compundStmt.CompoundStatement;

import java.util.List;

public class Statement extends ASTNode {

    private List<CompoundStatement> compoundStatements;
    private boolean isPass = false;

    public Statement(int line_number, List<CompoundStatement> compoundStatements) {
        super("Statement", line_number);
        this.compoundStatements = compoundStatements;
    }

    @Override
    public String toString() {
        if (isPass) {
            return "PassStatement";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Statement [Line: ").append(this.line_number).append("]");

        for (CompoundStatement cs : compoundStatements) {
            String childStr = (cs == null) ? "[Empty/Null Node]" : cs.toString();

            childStr = childStr.replace("\n", "\n  ");
            sb.append("\n      ").append(childStr);
        }
        return sb.toString();
//        StringBuilder stringBuilder = new StringBuilder();
//        for (CompoundStatement compoundStatement : compoundStatements) {
//            stringBuilder.append((compoundStatements.indexOf(compoundStatement) == 0) ? "" : Consts.printIndent(1))
//                    .append(compoundStatement == null ? "Null"
//                    : compoundStatement.toString());
//        }
//        return stringBuilder.toString();
    }
}
