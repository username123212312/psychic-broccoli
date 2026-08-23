package ast.compundStmt;

import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class GlobalStatement extends CompoundStatement{
    private List<String> globals;

    public GlobalStatement(int line_number) {
        super("GlobalStatement", line_number);
    }

    public void setGlobals(List<String> globals) {
        this.globals = globals;
    }

    public List<String> getGlobals() {
        return globals;
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
    }

    @Override
    public String generateCode() {
        return ""; // مؤقتاً نعيد نصاً فارغاً لكي يعمل المشروع
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append("( ");
        for(String global : globals){
            stringBuilder.append(global)
                    .append(globals.indexOf(global) == globals.size() - 1 ? "" : ",");
        }
        stringBuilder.append(" ) ");
        return stringBuilder.toString();
    }
}
