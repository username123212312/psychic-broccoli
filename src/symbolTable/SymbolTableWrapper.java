package symbolTable;

import java.util.Objects;

public class SymbolTableWrapper {
    private static SymbolTable symbolTable;

    public SymbolTableWrapper() {
        symbolTable = createSymbolTable();
    }

    private static SymbolTable createSymbolTable() {
        return Objects.requireNonNullElseGet(symbolTable, () -> new SymbolTable());
    }

    public static SymbolTable getSymbolTable() {
        return createSymbolTable();
    }
}
