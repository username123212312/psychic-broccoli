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
            case LOAD_CONST, LOAD_FAST, LOAD_NAME, LOAD_DEREF, PUSH_NULL -> 1;
            case LOAD_GLOBAL, LOAD_ATTR -> (instr.arg() & 1) + 1;
            case STORE_FAST, STORE_NAME, STORE_GLOBAL, STORE_DEREF, POP_TOP, POP_JUMP_IF_FALSE, POP_JUMP_IF_TRUE, POP_JUMP_IF_NONE, POP_JUMP_IF_NOT_NONE, DELETE_FAST, STORE_SUBSCR -> -1;
            case STORE_ATTR -> -2;
            case BINARY_OP, COMPARE_OP, IS_OP, CONTAINS_OP -> -1;
            case UNARY_NEGATIVE, UNARY_NOT -> 0;
            case CALL -> -instr.arg();
            case CALL_KW -> -(instr.arg() + 1);
            case BUILD_TUPLE, BUILD_LIST, BUILD_SET -> 1 - instr.arg();
            case BUILD_MAP -> 1 - (2 * instr.arg());
            case RETURN_VALUE, YIELD_VALUE -> -1;
            case IMPORT_NAME -> 0;
            case IMPORT_FROM -> 1;
            case MAKE_FUNCTION, GET_ITER, TO_BOOL, COPY_FREE_VARS, SET_FUNCTION_ATTRIBUTE, MAKE_CELL -> 0;
            case FOR_ITER -> 1;
            case JUMP_BACKWARD, JUMP_FORWARD, JUMP_BACKWARD_NO_INTERRUPT -> 0;
            case LIST_APPEND, MAP_ADD -> -1;
            case SETUP_ANNOTATIONS, RERAISE, END_FOR, COPY, SWAP, NOP, CALL_FUNCTION_EX -> 0;
            case RESUME, EXTENDED_ARG, CACHE, SEND -> 0;
            case CALL_INTRINSIC_1 -> -1;
            case LOAD_SMALL_INT, LOAD_COMMON_CONSTANT -> 1;
            case RETURN_GENERATOR -> -1;
            case POP_ITER -> -1;
            default -> 0;
        };
    }
}
