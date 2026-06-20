package cpython_bytecode.codegen;

import cpython_bytecode.PythonCodeObject;
import cpython_bytecode.PythonInstruction;
import cpython_bytecode.PythonOpCode;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Assuming you have an AST structure defined in your project, e.g., ast.ASTNode
// import ast.ASTNode;
// import ast.Program;
// import ast.Statement;
// import ast.Expression;

/**
 * Traverses the psychic-broccoli AST and emits CPython bytecode instructions.
 * This is the core component for converting your AST into executable Python bytecode.
 */
public class CPythonBytecodeGenerator {

    private PythonCodeObject currentCodeObject;
    private List<PythonInstruction> currentInstructions;
    private final ConstantPoolManager constantPoolManager;
    private final NameManager nameManager;
    private final LabelManager labelManager;
    private final StackDepthCalculator stackDepthCalculator;

    public CPythonBytecodeGenerator() {
        this.constantPoolManager = new ConstantPoolManager();
        this.nameManager = new NameManager();
        this.labelManager = new LabelManager();
        this.stackDepthCalculator = new StackDepthCalculator();
    }

    /**
     * Main method to generate a PythonCodeObject from your AST.
     * This method will need to be adapted to your specific AST structure.
     * For demonstration, we'll assume a simple entry point.
     */
    public PythonCodeObject generate(Object astRootNode, String filename, String moduleName) {
        currentCodeObject = new PythonCodeObject(moduleName, filename, 1);
        currentInstructions = new ArrayList<>();
        constantPoolManager.clear();
        nameManager.clear();
        labelManager.clear();

        // TODO: Implement AST traversal logic here.
        // This is where you would visit your AST nodes and emit instructions.
        // For example:
        // visit(astRootNode);

        // Example: Emit a simple LOAD_CONST and RETURN_VALUE for testing
        int constIndex = constantPoolManager.addConstant("Hello, CPython!");
        emit(constIndex);
        emit();

        // After emitting all instructions, finalize the code object
        finalizeCodeObject();

        return currentCodeObject;
    }

    protected void emit() {
        currentInstructions.add(new PythonInstruction(PythonOpCode.RETURN_VALUE));
    }

    protected void emit(int arg) {
        currentInstructions.add(new PythonInstruction(PythonOpCode.LOAD_CONST, arg));
    }

    private void finalizeCodeObject() {
        // Backpatch jumps after all instructions are emitted
        labelManager.backpatch(currentInstructions);

        // Convert List<PythonInstruction> to byte[] co_code
        ByteArrayBuilder codeBuilder = new ByteArrayBuilder();
        for (PythonInstruction instr : currentInstructions) {
            codeBuilder.appendByte((byte) instr.opcode().getValue());
            if (instr.opcode().hasArg()) {
                codeBuilder.appendShort(instr.arg()); // Arguments are typically 2 bytes
            }
        }
        currentCodeObject.co_code = codeBuilder.toByteArray();

        // Set other code object fields
        currentCodeObject.co_consts = constantPoolManager.getConstants();
        currentCodeObject.co_names = nameManager.getNames();
        currentCodeObject.co_varnames = nameManager.getVarNames();
        // co_freevars, co_cellvars would be populated during semantic analysis/closure detection

        currentCodeObject.co_stacksize = stackDepthCalculator.calculate(currentInstructions);
        // TODO: co_flags, co_firstlineno, co_lnotab (line number table) need to be set correctly
    }

    // Helper for building byte arrays (similar to Python's bytes.join)
    private static class ByteArrayBuilder {
        private final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        private final
        DataOutputStream dos = new DataOutputStream(bos);

        public void appendByte(byte b) {
            try {
                dos.writeByte(b);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void appendShort(int s) {
            try {
                // CPython arguments are little-endian 2-byte values
                dos.writeByte(s & 0xFF);
                dos.writeByte((s >> 8) & 0xFF);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public byte[] toByteArray() {
            try {
                dos.flush();
                return bos.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
