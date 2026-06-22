package cpython_bytecode;

public enum PythonOpCode {
    // Stack manipulation
    POP_TOP(1, false),
    PUSH_NULL(2, false),
    INTERPRETER_EXIT(3, false),
    END_FOR(4, false),
    END_SEND(5, false),
    NOP(9, false),

    // Unary operations
    UNARY_NEGATIVE(11, false),
    UNARY_NOT(12, false),
    UNARY_INVERT(15, false),

    // Binary operations (Python 3.11+ uses BINARY_OP for most)
    BINARY_SUBSCR(25, false),
    BINARY_SLICE(26, false),
    STORE_SLICE(27, false),
    BINARY_OP(122, true), // Uses oparg to specify the operation (NB_ADD, etc.)

    // Control flow
    RETURN_VALUE(83, false),
    RETURN_CONST(121, true),
    JUMP_FORWARD(110, true),
    JUMP_BACKWARD(140, true),
    JUMP_BACKWARD_NO_INTERRUPT(134, true),
    POP_JUMP_IF_FALSE(114, true),
    POP_JUMP_IF_TRUE(115, true),
    POP_JUMP_IF_NONE(129, true),
    POP_JUMP_IF_NOT_NONE(128, true),

    // Variable and attribute access
    LOAD_CONST(100, true),
    LOAD_NAME(101, true),
    STORE_NAME(90, true),
    DELETE_NAME(91, true),
    LOAD_FAST(124, true),
    STORE_FAST(125, true),
    DELETE_FAST(126, true),
    LOAD_GLOBAL(116, true),
    STORE_GLOBAL(97, true),
    DELETE_GLOBAL(98, true),
    LOAD_ATTR(106, true),
    STORE_ATTR(95, true),
    DELETE_ATTR(96, true),
    LOAD_DEREF(137, true),
    STORE_DEREF(138, true),
    DELETE_DEREF(139, true),

    // Function calls and object creation
    BUILD_TUPLE(102, true),
    BUILD_LIST(103, true),
    BUILD_SET(104, true),
    BUILD_MAP(105, true),
    CALL(171, true),
    MAKE_FUNCTION(132, true),

    // Iteration
    GET_ITER(68, false),
    FOR_ITER(93, true),

    // Miscellaneous
    IMPORT_NAME(108, true),
    IMPORT_FROM(109, true),
    COMPARE_OP(107, true),
    IS_OP(117, true),
    CONTAINS_OP(118, true),
    RESUME(151, true),
    EXTENDED_ARG(144, true);

    private final int value;
    private final boolean hasArg;

    PythonOpCode(int value, boolean hasArg) {
        this.value = value;
        this.hasArg = hasArg;
    }

    public int getValue() {
        return value;
    }

    public boolean hasArg() {
        return hasArg;
    }

    /**
     * Returns the PythonOpCode for a given numeric value.
     */
    public static PythonOpCode fromValue(int value) {
        for (PythonOpCode op : PythonOpCode.values()) {
            if (op.value == value) {
                return op;
            }
        }
        return null;
    }
}
