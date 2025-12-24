package ast.compundStmt;

import ast.Consts;
import ast.Imported;

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

    public void setImportedList(List<Imported> importedList) {
        this.importedList = importedList;
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
