package cpython_bytecode;

public enum PythonOpCode {
    // Cache/Reserved
    CACHE(0, false),

    // Stack manipulation
    POP_TOP(31, false),
    PUSH_NULL(33, false),
    INTERPRETER_EXIT(20, false),
    END_FOR(9, false),
    END_SEND(10, false),
    CALL_INTRINSIC_1(53, true),
    RERAISE(105, true),
    MAKE_CELL(97, true),
    SET_FUNCTION_ATTRIBUTE(108, true),
    NOP(27, false),
    COPY(59, true),
    SWAP(117, true),

    // Unary operations
    UNARY_NEGATIVE(41, false),
    UNARY_NOT(42, false),
    UNARY_INVERT(40, false),

    // Binary operations
    BINARY_SLICE(1, false),
    STORE_SLICE(37, false),
    STORE_SUBSCR(38, false),
    BINARY_OP(44, true),

    // Control flow
    RETURN_VALUE(35, false),
    JUMP_FORWARD(77, true),
    JUMP_BACKWARD(75, true),
    JUMP_BACKWARD_NO_INTERRUPT(76, true),
    POP_JUMP_IF_FALSE(100, true),
    POP_JUMP_IF_TRUE(103, true),
    POP_JUMP_IF_NONE(101, true),
    POP_JUMP_IF_NOT_NONE(102, true),
    JUMP(257, true),

    // Variable and attribute access
    LOAD_CONST(82, true),
    LOAD_NAME(93, true),
    STORE_NAME(116, true),
    DELETE_NAME(65, true),
    LOAD_FAST(84, true),
    STORE_FAST(112, true),
    DELETE_FAST(63, true),
    LOAD_GLOBAL(92, true),
    STORE_GLOBAL(115, true),
    DELETE_GLOBAL(64, true),
    LOAD_ATTR(80, true),
    STORE_ATTR(110, true),
    DELETE_ATTR(61, true),
    LOAD_DEREF(83, true),
    STORE_DEREF(111, true),
    DELETE_DEREF(62, true),
    LOAD_SMALL_INT(94, true),
    LOAD_COMMON_CONSTANT(81, true),

    // Function calls and object creation
    BUILD_TUPLE(51, true),
    BUILD_LIST(46, true),
    BUILD_SET(48, true),
    BUILD_MAP(47, true),
    CALL(52, true),
    MAKE_FUNCTION(23, true),
    CALL_FUNCTION_EX(4, true),
    CALL_KW(55, true),
    COPY_FREE_VARS(60, true),

    // Iteration
    GET_ITER(16, false),
    FOR_ITER(70, true),
    POP_ITER(30, false),

    // Generators / Comprehensions
    YIELD_VALUE(120, true),
    LIST_APPEND(78, true),
    SET_ADD(107, true),
    MAP_ADD(98, true),
    SEND(106, true),

    // Miscellaneous
    IMPORT_NAME(73, true),
    IMPORT_FROM(72, true),
    COMPARE_OP(56, true),
    IS_OP(74, true),
    CONTAINS_OP(57, true),
    RESUME(128, true),
    EXTENDED_ARG(69, true),
    RETURN_GENERATOR(34, false),
    SETUP_ANNOTATIONS(36, false),
    TO_BOOL(39, true);

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

    public static PythonOpCode fromValue(int value) {
        for (PythonOpCode op : PythonOpCode.values()) {
            if (op.value == value) {
                return op;
            }
        }
        return null;
    }
}
