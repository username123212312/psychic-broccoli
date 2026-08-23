package cpython_bytecode;

/**
 * Represents a single CPython bytecode instruction.
 */
public record PythonInstruction(PythonOpCode opcode, int arg) {
    public PythonInstruction(PythonOpCode opcode) {
        this(opcode, -1);
    }

    @Override
    public String toString() {
        if (opcode.hasArg()) {
            return String.format("%s(%d)", opcode.name(), arg);
        } else {
            return opcode.name();
        }
    }
}
