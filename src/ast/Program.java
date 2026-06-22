package ast;

import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class Program extends ASTNode{

    private List<Statement> statements;

    public Program(int line_number, List<Statement> statements) {
        super("Program", line_number);
        this.statements = statements;

        if (statements != null) {
            this.children.addAll(statements);
        }
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for(Statement s : this.statements){
            stringBuilder.append(Consts.printIndent(1)).append(s.toString());
        }
        return stringBuilder.toString();
    }

    @Override
    public String generateCode() {
        if (statements == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Statement s : statements) {
            if (s != null) sb.append(s.generateCode());
        }
        return sb.toString();
    }

    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (statements == null) return;
        for (Statement s : statements) {
            if (s != null) s.generateBytecode(ctx);
        }
    }
}
