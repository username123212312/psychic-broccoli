package cpython_bytecode.codegen;

import ast.*;
import ast.argsList.*;
import ast.argument.*;
import ast.assignStmt.*;
import ast.atom.*;
import ast.atomExpression.*;
import ast.compundStmt.*;
import ast.condition.*;
import ast.comparisonOp.*;
import ast.functionDef.*;
import ast.keyValue.*;
import ast.simpleExpr.*;
import cpython_bytecode.PythonCodeObject;
import cpython_bytecode.PythonInstruction;
import cpython_bytecode.PythonOpCode;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.io.*;
import java.util.*;

public class CodegenContext {

    private static final Map<PythonOpCode, Integer> CACHE_COUNTS = new HashMap<>();
    static {
        CACHE_COUNTS.put(PythonOpCode.BINARY_OP, 5);
        CACHE_COUNTS.put(PythonOpCode.LOAD_ATTR, 9);
        CACHE_COUNTS.put(PythonOpCode.CALL, 3);
        CACHE_COUNTS.put(PythonOpCode.LOAD_GLOBAL, 4);
        CACHE_COUNTS.put(PythonOpCode.COMPARE_OP, 1);
        CACHE_COUNTS.put(PythonOpCode.STORE_SUBSCR, 1);
        CACHE_COUNTS.put(PythonOpCode.FOR_ITER, 1);
        CACHE_COUNTS.put(PythonOpCode.JUMP_BACKWARD, 1);
        CACHE_COUNTS.put(PythonOpCode.POP_JUMP_IF_TRUE, 1);
        CACHE_COUNTS.put(PythonOpCode.POP_JUMP_IF_FALSE, 1);
        CACHE_COUNTS.put(PythonOpCode.STORE_ATTR, 4);
        CACHE_COUNTS.put(PythonOpCode.TO_BOOL, 3);
        CACHE_COUNTS.put(PythonOpCode.CONTAINS_OP, 1);
        CACHE_COUNTS.put(PythonOpCode.SEND, 1);
        CACHE_COUNTS.put(PythonOpCode.CALL_KW, 3);
    }

    public static final int BINARY_ADD = 0;
    public static final int BINARY_SUBTRACT = 1;
    public static final int BINARY_MULTIPLY = 2;
    public static final int BINARY_TRUE_DIVIDE = 3;

    // Python 3.14 COMPARE_OP argument encoding:
    // oparg = (cmp_idx << 5) | bitmask, where bitmask bits:
    //   0x01=NaN, 0x02=<, 0x04=>, 0x08==
    public static final int CMP_LT = 2 | 0x10;   // 18  (bool <)
    public static final int CMP_LE = 42 | 0x10;  // 58  (bool <=)
    public static final int CMP_EQ = 72 | 0x10;  // 88  (bool ==)
    public static final int CMP_NE = 103 | 0x10; // 119 (bool !=)
    public static final int CMP_GT = 132 | 0x10; // 148 (bool >)
    public static final int CMP_GE = 172 | 0x10; // 188 (bool >=)

    private PythonCodeObject currentCodeObject;
    private List<PythonInstruction> currentInstructions;
    private final ConstantPoolManager constantPoolManager;
    private final NameManager nameManager;
    private final LabelManager labelManager;
    private final StackDepthCalculator stackDepthCalculator;
    private boolean inFunction = false;
    private int labelCounter = 0;
    private final Set<String> assignedLocals = new HashSet<>();
    private final Set<String> globalDeclared = new HashSet<>();
    private final Deque<SavedState> savedStates = new ArrayDeque<>();
    private final Deque<Set<String>> enclosingLocalsStack = new ArrayDeque<>();

    private static class SavedState {
        final PythonCodeObject codeObject;
        final List<PythonInstruction> instructions;
        final List<Object> constants;
        final List<String> names;
        final List<String> varNames;
        final boolean inFunction;
        final Set<String> globalDeclared;
        final Set<String> assignedLocals;
        final int labelCounter;
        final Map<String, Integer> labels;
        final List<LabelManager.JumpRequest> pendingJumps;

        SavedState(PythonCodeObject codeObject, List<PythonInstruction> instructions,
                   List<Object> constants, List<String> names, List<String> varNames,
                   boolean inFunction, Set<String> globalDeclared,
                   Set<String> assignedLocals, int labelCounter,
                   Map<String, Integer> labels, List<LabelManager.JumpRequest> pendingJumps) {
            this.codeObject = codeObject;
            this.instructions = instructions;
            this.constants = constants;
            this.names = names;
            this.varNames = varNames;
            this.inFunction = inFunction;
            this.globalDeclared = globalDeclared;
            this.assignedLocals = assignedLocals;
            this.labelCounter = labelCounter;
            this.labels = labels;
            this.pendingJumps = pendingJumps;
        }
    }

    private final List<String> pendingCellVars = new ArrayList<>();

    public CodegenContext() {
        this.constantPoolManager = new ConstantPoolManager();
        this.nameManager = new NameManager();
        this.labelManager = new LabelManager();
        this.stackDepthCalculator = new StackDepthCalculator();
    }

    public PythonCodeObject getCodeObject() {
        return currentCodeObject;
    }

    public NameManager getNameManager() {
        return nameManager;
    }

    public void initModule(String moduleName, String filename, int line) {
        currentCodeObject = new PythonCodeObject("<module>", filename, line);
        currentCodeObject.co_qualname = "<module>";
        currentCodeObject.co_flags = 0;
        currentInstructions = new ArrayList<>();
        constantPoolManager.clear();
        nameManager.clear();
        labelManager.clear();
        inFunction = false;
        labelCounter = 0;
        assignedLocals.clear();
        globalDeclared.clear();

        emit(PythonOpCode.RESUME, 0);
        addConstant("NONE_PLACEHOLDER");
    }

    public int nextInsnIndex() {
        return currentInstructions.size();
    }

    public int emit(PythonOpCode opcode) {
        currentInstructions.add(new PythonInstruction(opcode));
        int idx = currentInstructions.size() - 1;
        emitCacheEntries(opcode);
        return idx;
    }

    public int emit(PythonOpCode opcode, int arg) {
        currentInstructions.add(new PythonInstruction(opcode, arg));
        int idx = currentInstructions.size() - 1;
        emitCacheEntries(opcode);
        return idx;
    }

    private void emitCacheEntries(PythonOpCode opcode) {
        Integer count = CACHE_COUNTS.get(opcode);
        if (count != null) {
            for (int i = 0; i < count; i++) {
                currentInstructions.add(new PythonInstruction(PythonOpCode.CACHE, 0));
            }
        }
    }

    public String newLabel() {
        return "L" + (labelCounter++);
    }

    public void markLabel(String label) {
        labelManager.markLabel(label, nextInsnIndex());
    }

    public void emitJump(PythonOpCode jumpOp, String targetLabel) {
        int idx = emit(jumpOp, 0);
        labelManager.addJumpRequest(targetLabel, idx, jumpOp);
    }

    public int addConstant(Object value) {
        return constantPoolManager.addConstant(value);
    }

    public int addName(String name) {
        return nameManager.addName(name);
    }

    public int addVarName(String name) {
        return nameManager.addVarName(name);
    }

    public boolean isInFunction() {
        return inFunction;
    }

    public void addGlobalDeclared(String name) {
        globalDeclared.add(name);
    }

    public boolean isGlobalDeclared(String name) {
        return globalDeclared.contains(name);
    }

    public void addAssignedLocal(String name) {
        assignedLocals.add(name);
    }

    public boolean isAssignedLocal(String name) {
        return assignedLocals.contains(name);
    }

    public void clearScope() {
        assignedLocals.clear();
        globalDeclared.clear();
    }

    public void storeVariable(String name) {
        if (name == null || name.isEmpty()) return;
        if (inFunction) {
            if (globalDeclared.contains(name)) {
                int idx = addName(name);
                emit(PythonOpCode.STORE_GLOBAL, idx);
            } else if (nameManager.isCellVar(name)) {
                int cellIdx = nameManager.getCellVars().indexOf(name);
                int derefIdx = nameManager.getVarNames().size() + cellIdx;
                emit(PythonOpCode.STORE_DEREF, derefIdx);
            } else if (assignedLocals.contains(name)) {
                int idx = addVarName(name);
                emit(PythonOpCode.STORE_FAST, idx);
            } else {
                int idx = addVarName(name);
                emit(PythonOpCode.STORE_FAST, idx);
                addAssignedLocal(name);
            }
        } else {
            int idx = addName(name);
            emit(PythonOpCode.STORE_NAME, idx);
        }
    }

    public void loadVariable(String name) {
        if (name == null || name.isEmpty()) return;
        if (inFunction) {
            if (globalDeclared.contains(name)) {
                int idx = addName(name);
                emit(PythonOpCode.LOAD_GLOBAL, idx << 1);
            } else if (nameManager.isCellVar(name)) {
                int cellIdx = nameManager.getCellVars().indexOf(name);
                int derefIdx = nameManager.getVarNames().size() + cellIdx;
                emit(PythonOpCode.LOAD_DEREF, derefIdx);
            } else if (assignedLocals.contains(name)) {
                int idx = addVarName(name);
                emit(PythonOpCode.LOAD_FAST, idx);
            } else if (!enclosingLocalsStack.isEmpty()) {
                if (enclosingLocalsStack.peek().contains(name)) {
                    int freeIdx = nameManager.addFreeVar(name);
                    int derefIdx = nameManager.getVarNames().size() + freeIdx;
                    emit(PythonOpCode.LOAD_DEREF, derefIdx);
                } else {
                    int idx = addName(name);
                    emit(PythonOpCode.LOAD_GLOBAL, idx << 1);
                }
            } else {
                int idx = addName(name);
                emit(PythonOpCode.LOAD_GLOBAL, idx << 1);
            }
        } else {
            int idx = addName(name);
            emit(PythonOpCode.LOAD_NAME, idx);
        }
    }

    public boolean loadVariableForCall(String name) {
        if (name == null || name.isEmpty()) return false;
        if (inFunction) {
            if (globalDeclared.contains(name)) {
                int idx = addName(name);
                emit(PythonOpCode.LOAD_GLOBAL, (idx << 1) | 1);
                return true;
            } else if (nameManager.isCellVar(name)) {
                int cellIdx = nameManager.getCellVars().indexOf(name);
                int derefIdx = nameManager.getVarNames().size() + cellIdx;
                emit(PythonOpCode.LOAD_DEREF, derefIdx);
                return false;
            } else if (assignedLocals.contains(name)) {
                int idx = addVarName(name);
                emit(PythonOpCode.LOAD_FAST, idx);
                return false;
            } else if (!enclosingLocalsStack.isEmpty() && enclosingLocalsStack.peek().contains(name)) {
                int freeIdx = nameManager.addFreeVar(name);
                int derefIdx = nameManager.getVarNames().size() + freeIdx;
                emit(PythonOpCode.LOAD_DEREF, derefIdx);
                return false;
            } else {
                int idx = addName(name);
                emit(PythonOpCode.LOAD_GLOBAL, (idx << 1) | 1);
                return true;
            }
        } else {
            int idx = addName(name);
            emit(PythonOpCode.LOAD_NAME, idx);
            return false;
        }
    }

    public String getFilename() {
        return currentCodeObject.co_filename;
    }

    public String extractVarName(ast.compundStmt.PythonExpression var) {
        if (var instanceof ast.atomExpression.SimpleVariable sv) {
            return sv.getVarName();
        }
        if (var instanceof ast.atomExpression.LiteralExpression le) {
            return le.getLiteralValue();
        }
        return var != null ? var.toString().replaceAll("[^a-zA-Z0-9_]", "") : "";
    }

    // ============ Convenience emit wrappers ============

    public void emitResume(int arg) { emit(PythonOpCode.RESUME, arg); }
    public void emitLoadConst(int idx) { emit(PythonOpCode.LOAD_CONST, idx); }
    public void emitReturnValue() { emit(PythonOpCode.RETURN_VALUE); }
    public void emitReturnGenerator() { emit(PythonOpCode.RETURN_GENERATOR); }
    public void emitPopTop() { emit(PythonOpCode.POP_TOP); }
    public void emitPushNull() { emit(PythonOpCode.PUSH_NULL); }
    public void emitMakeFunction(int arg) { emit(PythonOpCode.MAKE_FUNCTION, arg); }
    public void emitCall(int arg) { emit(PythonOpCode.CALL, arg); }
    public void emitCallKw(int arg) { emit(PythonOpCode.CALL_KW, arg); }
    public void emitGetIter() { emit(PythonOpCode.GET_ITER); }
    public void emitUnaryNot() { emit(PythonOpCode.UNARY_NOT); }
    public void emitStoreSubscr() { emit(PythonOpCode.STORE_SUBSCR); }
    public void emitBuildList(int arg) { emit(PythonOpCode.BUILD_LIST, arg); }
    public void emitBuildTuple(int arg) { emit(PythonOpCode.BUILD_TUPLE, arg); }
    public void emitBuildMap(int arg) { emit(PythonOpCode.BUILD_MAP, arg); }
    public void emitBinaryOp(int arg) { emit(PythonOpCode.BINARY_OP, arg); }
    public void emitCompareOp(int arg) { emit(PythonOpCode.COMPARE_OP, arg); }
    public void emitContainsOp(int arg) { emit(PythonOpCode.CONTAINS_OP, arg); }
    public void emitIsOp(int arg) { emit(PythonOpCode.IS_OP, arg); }
    public void emitImportName(int arg) { emit(PythonOpCode.IMPORT_NAME, arg); }
    public void emitImportFrom(int arg) { emit(PythonOpCode.IMPORT_FROM, arg); }
    public void emitLoadAttr(int arg) { emit(PythonOpCode.LOAD_ATTR, arg); }
    public void emitYieldValue(int arg) { emit(PythonOpCode.YIELD_VALUE, arg); }
    public void emitEndFor() { emit(PythonOpCode.END_FOR, 0); }
    public void emitPopIter() { emit(PythonOpCode.POP_ITER, 0); }
    public void emitListAppend(int arg) { emit(PythonOpCode.LIST_APPEND, arg); }
    public void emitStoreFast(int idx) { emit(PythonOpCode.STORE_FAST, idx); }
    public void emitStoreName(int idx) { emit(PythonOpCode.STORE_NAME, idx); }
    public void emitStoreGlobal(int idx) { emit(PythonOpCode.STORE_GLOBAL, idx); }
    public void emitLoadFast(int idx) { emit(PythonOpCode.LOAD_FAST, idx); }
    public void emitLoadName(int idx) { emit(PythonOpCode.LOAD_NAME, idx); }
    public void emitLoadGlobal(int idx) { emit(PythonOpCode.LOAD_GLOBAL, idx); }
    public void emitStoreAttr(int arg) { emit(PythonOpCode.STORE_ATTR, arg); }

    public void emitJumpForward(String label) { emitJump(PythonOpCode.JUMP_FORWARD, label); }
    public void emitJumpBackward(String label) { emitJump(PythonOpCode.JUMP_BACKWARD, label); }
    public void emitPopJumpIfFalse(String label) { emitJump(PythonOpCode.POP_JUMP_IF_FALSE, label); }
    public void emitPopJumpIfTrue(String label) { emitJump(PythonOpCode.POP_JUMP_IF_TRUE, label); }
    public void emitForIter(String label) { emitJump(PythonOpCode.FOR_ITER, label); }

    public int addAtomConstant(Atom atom) {
        if (atom instanceof None) {
            return addConstant("NONE_PLACEHOLDER");
        }
        if (atom instanceof ast.atom.Number n) {
            String val = (String) n.getValue();
            try {
                if (val.contains(".")) {
                    return addConstant(Double.parseDouble(val));
                } else {
                    return addConstant(new BigInteger(val));
                }
            } catch (NumberFormatException e) {
                return addConstant(val);
            }
        }
        if (atom instanceof Str s) {
            String raw = (String) s.getValue();
            if (raw != null && raw.length() >= 2) {
                String unquoted = raw.substring(1, raw.length() - 1);
                return addConstant(unquoted);
            }
            return addConstant(raw);
        }
        if (atom instanceof Bool b) {
            if ("True".equals(b.getValue())) {
                return addConstant(Boolean.TRUE);
            } else {
                return addConstant(Boolean.FALSE);
            }
        }
        if (atom instanceof Name nameAtom) {
            return addConstant(nameAtom.getValue());
        }
        if (atom instanceof ClassAtom ca) {
            return addConstant(ca.getValue());
        }
        return -1;
    }

    public void emitAtom(Atom atom) {
        if (atom instanceof Name nameAtom) {
            String varName = (String) nameAtom.getValue();
            loadVariable(varName);
            return;
        }
        int idx = addAtomConstant(atom);
        if (idx >= 0) {
            emit(PythonOpCode.LOAD_CONST, idx);
        } else {
            emit(PythonOpCode.LOAD_CONST, addConstant("NONE_PLACEHOLDER"));
        }
    }

    public static Object parseLiteralValue(String val) {
        if (val == null) return "NONE_PLACEHOLDER";
        if ("True".equals(val)) return Boolean.TRUE;
        if ("False".equals(val)) return Boolean.FALSE;
        if (val.length() >= 2) {
            char first = val.charAt(0);
            char last = val.charAt(val.length() - 1);
            if ((first == '\'' && last == '\'') || (first == '"' && last == '"')) {
                return val.substring(1, val.length() - 1);
            }
        }
        try {
            if (val.contains(".") || val.contains("e") || val.contains("E")) {
                return Double.parseDouble(val);
            } else {
                return new BigInteger(val);
            }
        } catch (NumberFormatException e) {
            return val;
        }
    }

    public void pushFunctionScope(String name, String filename, int line) {
        pushFunctionScope(name, filename, line, true);
    }

    public void pushFunctionScope(String name, String filename, int line, boolean emitResume) {
        savedStates.push(new SavedState(
            currentCodeObject, currentInstructions,
            constantPoolManager.getConstants(), nameManager.getNames(), nameManager.getVarNames(),
            inFunction, new HashSet<>(globalDeclared), new HashSet<>(assignedLocals), labelCounter,
            labelManager.getLabels(), labelManager.getPendingJumps()
        ));

        // Save the current function's local-like vars for closure detection
        Set<String> currentLocals = new HashSet<>(nameManager.getVarNames());
        currentLocals.addAll(this.assignedLocals);
        enclosingLocalsStack.push(currentLocals);

        currentCodeObject = new PythonCodeObject(name, filename, line);
        currentCodeObject.co_qualname = name;
        currentCodeObject.co_flags = 0x03;
        currentInstructions = new ArrayList<>();
        constantPoolManager.clear();
        nameManager.clear();
        inFunction = true;
        labelCounter = 0;
        clearScope();

        if (emitResume) {
            emit(PythonOpCode.RESUME, 0);
        }
    }

    public PythonCodeObject popFunctionScope() {
        fixCellVars();

        // Insert COPY_FREE_VARS at beginning if function has free variables
        if (!nameManager.getFreeVars().isEmpty()) {
            currentInstructions.add(0, new PythonInstruction(PythonOpCode.COPY_FREE_VARS, nameManager.getFreeVars().size()));
            labelManager.shiftIndices(1);
        }

        labelManager.backpatch(currentInstructions);

        ByteArrayBuilder codeBuilder = new ByteArrayBuilder();
        for (PythonInstruction instr : currentInstructions) {
            codeBuilder.appendByte((byte) instr.opcode().getValue());
            codeBuilder.appendByte((byte) (instr.arg() == -1 ? 0 : instr.arg()));
        }
        currentCodeObject.co_code = codeBuilder.toByteArray();
        currentCodeObject.co_consts = constantPoolManager.getConstants();
        currentCodeObject.co_names = nameManager.getNames();
        currentCodeObject.co_varnames = nameManager.getVarNames();
        currentCodeObject.co_freevars = nameManager.getFreeVars();
        currentCodeObject.co_cellvars = nameManager.getCellVars();
        currentCodeObject.co_stacksize = stackDepthCalculator.calculate(currentInstructions);
        currentCodeObject.co_nlocals = currentCodeObject.co_varnames.size();
        int numInstrs = currentInstructions.size();
        currentCodeObject.co_lnotab = generateLineTable(numInstrs);

        PythonCodeObject funcCode = currentCodeObject;

        // Save free var names before popping scope
        Set<String> childFreeVarNames = new HashSet<>(funcCode.co_freevars);
        enclosingLocalsStack.pop();

        SavedState saved = savedStates.pop();
        currentCodeObject = saved.codeObject;
        currentInstructions = saved.instructions;
        constantPoolManager.clear();
        for (Object c : saved.constants) constantPoolManager.addConstant(c);
        nameManager.clear();
        for (String n : saved.names) nameManager.addName(n);
        for (String v : saved.varNames) nameManager.addVarName(v);
        inFunction = saved.inFunction;
        globalDeclared.clear();
        globalDeclared.addAll(saved.globalDeclared);
        assignedLocals.clear();
        assignedLocals.addAll(saved.assignedLocals);
        labelCounter = saved.labelCounter;
        labelManager.setLabels(saved.labels);
        labelManager.setPendingJumps(saved.pendingJumps);

        // Add child's free vars as cell vars in the parent scope
        for (String fv : childFreeVarNames) {
            if (!fv.equals(".0")) {
                nameManager.addCellVar(fv);
                // Record cell vars that appear in parent's varnames for later fixup
                if (nameManager.getVarNames().contains(fv) && !pendingCellVars.contains(fv)) {
                    pendingCellVars.add(fv);
                }
            }
        }

        return funcCode;
    }

    private void fixCellVars() {
        if (pendingCellVars.isEmpty()) return;

        List<String> parentVarNames = nameManager.getVarNames();
        List<String> parentCellVars = nameManager.getCellVars();
        Set<String> cellVarSet = new HashSet<>(pendingCellVars);
        int argcount = currentCodeObject.co_argcount + currentCodeObject.co_posonlyargcount + currentCodeObject.co_kwonlyargcount;

        // Separate cell vars into parameters (keep in varnames) and locals (remove from varnames)
        List<String> paramCellVars = new ArrayList<>();
        List<String> localCellVars = new ArrayList<>();
        for (String cv : pendingCellVars) {
            int idx = parentVarNames.indexOf(cv);
            if (idx >= 0 && idx < argcount) {
                paramCellVars.add(cv);
            } else {
                localCellVars.add(cv);
            }
        }

        // Build new var names: keep all var names except local (non-parameter) cell vars
        List<String> newVarNames = new ArrayList<>();
        Set<String> localCellVarSet = new HashSet<>(localCellVars);
        for (String vn : parentVarNames) {
            if (!localCellVarSet.contains(vn)) {
                newVarNames.add(vn);
            }
        }

        // Patch FAST instructions:
        // - For param cell vars: leave as-is (LOAD_FAST/STORE_FAST with same index)
        // - For local cell vars: patch to LOAD_DEREF/STORE_DEREF
        // - For non-cell vars: re-index if needed
        for (int i = 0; i < currentInstructions.size(); i++) {
            PythonInstruction instr = currentInstructions.get(i);
            PythonOpCode op = instr.opcode();
            if ((op == PythonOpCode.STORE_FAST || op == PythonOpCode.LOAD_FAST) && instr.arg() >= 0 && instr.arg() < parentVarNames.size()) {
                String vn2 = parentVarNames.get(instr.arg());
                if (paramCellVars.contains(vn2)) {
                    // Parameter cell var: stays in varnames at same index
                } else if (cellVarSet.contains(vn2)) {
                    // Local cell var: patch to DEREF
                    int cellIdx = parentCellVars.indexOf(vn2);
                    int derefIdx = newVarNames.size() + cellIdx;
                    PythonOpCode newOp = (op == PythonOpCode.STORE_FAST) ? PythonOpCode.STORE_DEREF : PythonOpCode.LOAD_DEREF;
                    currentInstructions.set(i, new PythonInstruction(newOp, derefIdx));
                } else {
                    // Non-cell var: re-index if needed
                    int newIdx = newVarNames.indexOf(vn2);
                    if (newIdx != instr.arg()) {
                        currentInstructions.set(i, new PythonInstruction(op, newIdx));
                    }
                }
            }
        }

        // Remove local (non-parameter) cell vars from varNames in NameManager
        for (String cv : localCellVars) {
            nameManager.removeVarName(cv);
        }

        // Shift label indices by number of MAKE_CELL instructions we'll insert
        int numMakeCell = pendingCellVars.size();
        labelManager.shiftIndices(numMakeCell);

        // Insert MAKE_CELL at beginning (before RESUME 0), in reverse order
        for (int ci = pendingCellVars.size() - 1; ci >= 0; ci--) {
            String cv = pendingCellVars.get(ci);
            int cellIdx = parentCellVars.indexOf(cv);
            int originalVnIdx = parentVarNames.indexOf(cv);
            int makeCellArg;
            if (originalVnIdx >= 0 && originalVnIdx < argcount) {
                // Parameter cell var: MAKE_CELL references varnames slot
                makeCellArg = originalVnIdx;
            } else {
                // Local cell var: MAKE_CELL references cell section
                makeCellArg = newVarNames.size() + cellIdx;
            }
            currentInstructions.add(0, new PythonInstruction(PythonOpCode.MAKE_CELL, makeCellArg));
        }

        pendingCellVars.clear();
    }

    public void saveFunctionAndEmit(boolean hasDecorator) {
        PythonCodeObject funcCode = popFunctionScope();
        // Emit closure tuple building if the child function has free variables
        if (!funcCode.co_freevars.isEmpty()) {
            for (String fv : funcCode.co_freevars) {
                int varIdx = nameManager.getVarNames().indexOf(fv);
                if (varIdx >= 0) {
                    emit(PythonOpCode.LOAD_FAST, varIdx);
                } else {
                    int cellIdx = nameManager.getCellVars().indexOf(fv);
                    if (cellIdx >= 0) {
                        int derefIdx = nameManager.getVarNames().size() + cellIdx;
                        emit(PythonOpCode.LOAD_DEREF, derefIdx);
                    } else {
                        loadVariable(fv);
                    }
                }
            }
            emit(PythonOpCode.BUILD_TUPLE, funcCode.co_freevars.size());
        }

        int codeConstIdx = addConstant(funcCode);
        emit(PythonOpCode.LOAD_CONST, codeConstIdx);
        emit(PythonOpCode.MAKE_FUNCTION, 0);

        if (!funcCode.co_freevars.isEmpty()) {
            emit(PythonOpCode.SET_FUNCTION_ATTRIBUTE, 8);
        }

        if (hasDecorator) {
            emit(PythonOpCode.CALL, 0);
        }
    }

    public PythonCodeObject finishModule() {
        fixCellVars();
        labelManager.backpatch(currentInstructions);

        ByteArrayBuilder codeBuilder = new ByteArrayBuilder();
        for (PythonInstruction instr : currentInstructions) {
            codeBuilder.appendByte((byte) instr.opcode().getValue());
            codeBuilder.appendByte((byte) (instr.arg() == -1 ? 0 : instr.arg()));
        }
        currentCodeObject.co_code = codeBuilder.toByteArray();

        currentCodeObject.co_consts = constantPoolManager.getConstants();
        currentCodeObject.co_names = nameManager.getNames();
        currentCodeObject.co_varnames = nameManager.getVarNames();
        currentCodeObject.co_freevars = nameManager.getFreeVars();
        currentCodeObject.co_cellvars = nameManager.getCellVars();

        currentCodeObject.co_stacksize = stackDepthCalculator.calculate(currentInstructions);
        currentCodeObject.co_nlocals = currentCodeObject.co_varnames.size();
        currentCodeObject.co_lnotab = generateLineTable(currentInstructions.size());

        return currentCodeObject;
    }

    // ============ Scope Analysis Helpers ============

    public void collectGlobals(Statement stmt) {
        if (stmt == null || stmt.getCompoundStatements() == null) return;
        for (CompoundStatement cs : stmt.getCompoundStatements()) {
            if (cs instanceof GlobalStatement gs && gs.getGlobals() != null) {
                for (String g : gs.getGlobals()) {
                    addGlobalDeclared(g);
                }
            }
        }
    }

    public void collectLocals(Statement stmt) {
        if (stmt == null || stmt.getCompoundStatements() == null) return;
        for (CompoundStatement cs : stmt.getCompoundStatements()) {
            collectLocalsCompound(cs);
        }
    }

    private void collectLocalsCompound(CompoundStatement cs) {
        switch (cs) {
            case AssignmentStatement as -> {
                PythonExpression var = as.getVar();
                if (var instanceof SimpleVariable sv) {
                    String name = sv.getVarName();
                    if (name != null && !name.isEmpty() && !isGlobalDeclared(name)) {
                        addAssignedLocal(name);
                    }
                }
            }
            case ForLoop fl -> {
                Atom loopVar = fl.getVar();
                if (loopVar instanceof Name n) {
                    Object val = n.getValue();
                    if (val instanceof String s && !isGlobalDeclared(s)) {
                        addAssignedLocal(s);
                    }
                }
                if (fl.getStatement() != null) collectLocals(fl.getStatement());
            }
            case FunctionDefinition fd -> {
                String name = fd.getFunctionName();
                if (name != null && !name.isEmpty() && !isGlobalDeclared(name)) {
                    addAssignedLocal(name);
                }
            }
            case IfStatement ifStmt -> {
                if (ifStmt.getStatement() != null) collectLocals(ifStmt.getStatement());
                if (ifStmt.getElifStatements() != null) {
                    for (ElIfStatement elif : ifStmt.getElifStatements()) {
                        if (elif.getStatement() != null) collectLocals(elif.getStatement());
                    }
                }
                if (ifStmt.getElseStatement() != null) collectLocals(ifStmt.getElseStatement());
            }
            case WhileStatement whileStmt -> {
                if (whileStmt.getStatement() != null) collectLocals(whileStmt.getStatement());
            }
            case ImportStatement imp -> {
                // Imported names are module-level globals; do NOT add to assignedLocals.
                // Inside functions they must be loaded via LOAD_GLOBAL, not LOAD_FAST.
            }
            default -> {}
        }
    }

    // ============ Argument Collection Helper ============

    public record KeywordArgPlaceholder(String keywordName, PythonExpression value) {}

    public List<Object> collectArguments(ArgumentsList argsList) {
        List<Object> result = new ArrayList<>();
        if (argsList == null) return result;
        switch (argsList) {
            case ast.argsList.AtomArguments aa -> {
                if (aa.getArgs() != null) result.addAll(aa.getArgs());
            }
            case ast.argsList.ComplexArguments ca -> {
                if (ca.getArguments() != null) {
                    for (ast.argument.Argument arg : ca.getArguments()) {
                        if (arg instanceof ast.argument.PositionalArgument pa) {
                            result.add(pa.getArg());
                        } else if (arg instanceof ast.argument.KeywordArgument ka) {
                            result.add(new KeywordArgPlaceholder(ka.getArgName(), ka.getArg()));
                        }
                    }
                }
            }
            default -> {}
        }
        return result;
    }

    // ============ Line Table Generator ============

    private byte[] generateLineTable(int numCodeUnits) {
        ByteArrayBuilder bb = new ByteArrayBuilder();
        int pos = 0;
        while (pos < numCodeUnits) {
            int length = Math.min(numCodeUnits - pos, 8);
            // Code 13 = NoColumnInfo: firstlineno delta=0, end line delta=0
            int firstByte = 0x80 | (13 << 3) | (length - 1);
            bb.appendByte((byte) firstByte);
            // svarint for start line delta: 0 encoded as 0
            bb.appendByte((byte) 0);
            pos += length;
        }
        return bb.toByteArray();
    }

    // ============ ByteArrayBuilder ============

    private static class ByteArrayBuilder {
        private final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        private final DataOutputStream dos = new DataOutputStream(bos);

        public void appendByte(byte b) {
            try {
                dos.writeByte(b);
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
