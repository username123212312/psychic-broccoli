package ast.compundStmt;

import ast.ASTNode;
import cpython_bytecode.codegen.CodegenContext;

public abstract class CompoundStatement extends ASTNode {
    public CompoundStatement(String node_name, int line_number) {
        super(node_name, line_number);
    }

    @Override
    public abstract void generateBytecode(CodegenContext ctx);
}
