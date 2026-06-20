package cpython_bytecode.codegen;

import cpython_bytecode.PythonInstruction;
import cpython_bytecode.PythonOpCode;
import java.util.List;

/**
 * Calculates the maximum stack depth required for a sequence of instructions.
 */
public class StackDepthCalculator {

    /**
     * Estimates the co_stacksize by simulating stack effects.
     * Note: This is a simplified version. A robust version would perform data-flow analysis.
     */
    public int calculate(List<PythonInstruction> instructions) {
        int maxDepth = 0;
        int currentDepth = 0;

        for (PythonInstruction instr : instructions) {
            currentDepth += getStackEffect(instr);
            if (currentDepth > maxDepth) {
                maxDepth = currentDepth;
            }
            if (currentDepth < 0) {
                // Should not happen in valid bytecode
                currentDepth = 0;
            }
        }

        // Ensure a minimum stack size for safety
        return Math.max(maxDepth, 2);
    }

    private int getStackEffect(PythonInstruction instr) {
        PythonOpCode op = instr.opcode();
        return switch (op) {
            case LOAD_CONST, LOAD_FAST, LOAD_NAME, LOAD_GLOBAL, LOAD_ATTR, PUSH_NULL -> 1;
            case STORE_FAST, STORE_NAME, STORE_GLOBAL, POP_TOP, POP_JUMP_IF_FALSE, POP_JUMP_IF_TRUE -> -1;
            case STORE_ATTR -> -2;
            case BINARY_OP -> -1; // Pops 2, pushes 1

            case CALL ->
                // Pops callable + N args, pushes 1 result
                    -instr.arg();
            case BUILD_TUPLE, BUILD_LIST, BUILD_SET ->
                // Pops N elements, pushes 1 collection
                    1 - instr.arg();
            case BUILD_MAP ->
                // Pops 2*N elements, pushes 1 map
                    1 - (2 * instr.arg());
            case RETURN_VALUE, RETURN_CONST -> -1;
            default -> 0;
        };
    }
}
