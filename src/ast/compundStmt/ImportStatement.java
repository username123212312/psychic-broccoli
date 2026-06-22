package ast.compundStmt;

import ast.Consts;
import ast.Imported;
import cpython_bytecode.codegen.CodegenContext;

import java.util.List;

public class ImportStatement extends CompoundStatement {
    private String module;
    private List<Imported> importedList;

    public ImportStatement(int line_number) {
        super("ImportStatement", line_number);
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getModule() {
        return module;
    }

    public void setImportedList(List<Imported> importedList) {
        this.importedList = importedList;
    }

    public List<Imported> getImportedList() {
        return importedList;
    }


    @Override
    public void generateBytecode(CodegenContext ctx) {
        if (module != null && !module.isEmpty()) {
            // from X import Y
            int zeroIdx = ctx.addConstant(java.math.BigInteger.ZERO);
            ctx.emitLoadConst(zeroIdx);

            if (importedList != null && !importedList.isEmpty()) {
                java.util.List<String> names = new java.util.ArrayList<>();
                for (ast.Imported im : importedList) {
                    if (im != null && im.getName() != null) {
                        names.add(im.getName());
                    }
                }
                int fromlistIdx = ctx.addConstant(names);
                ctx.emitLoadConst(fromlistIdx);
            } else {
                int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
                ctx.emitLoadConst(noneIdx);
            }

            int moduleIdx = ctx.addName(module);
            ctx.emitImportName(moduleIdx);

            if (importedList != null) {
                for (ast.Imported im : importedList) {
                    if (im == null || im.getName() == null) continue;
                    int fromIdx = ctx.addName(im.getName());
                    ctx.emitImportFrom(fromIdx);
                    String storeAs = (im.getAlias() != null) ? im.getAlias() : im.getName();
                    ctx.storeVariable(storeAs);
                }
                ctx.emitPopTop();
            } else {
                ctx.storeVariable(module);
            }
        } else if (importedList != null) {
            // plain import X
            for (ast.Imported im : importedList) {
                if (im == null || im.getName() == null) continue;
                int zeroIdx = ctx.addConstant(java.math.BigInteger.ZERO);
                ctx.emitLoadConst(zeroIdx);
                int noneIdx = ctx.addConstant("NONE_PLACEHOLDER");
                ctx.emitLoadConst(noneIdx);
                int nameIdx = ctx.addName(im.getName());
                ctx.emitImportName(nameIdx);
                String storeAs = (im.getAlias() != null) ? im.getAlias() : extractTopLevelName(im.getName());
                ctx.storeVariable(storeAs);
            }
        }
    }

    private static String extractTopLevelName(String dottedName) {
        int dot = dottedName.indexOf('.');
        return (dot < 0) ? dottedName : dottedName.substring(0, dot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImportStatement [Line: ").append(this.line_number).append("] (module:" + module + ")");

        for (Imported imp : importedList) {
            sb.append("\n        ").append(imp.toString());
        }
        return sb.toString();
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(super.toString())
//                .append(", ( ").append("module_name : ").append(module).append(" )");
//        for(Imported imported : importedList){
//            stringBuilder.append(Consts.printIndent(2)).append(imported.toString());
//        }
//        return stringBuilder.toString();
    }
}
