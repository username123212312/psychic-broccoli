package cpython_bytecode.codegen;

import cpython_bytecode.PythonInstruction;
import cpython_bytecode.PythonOpCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handles jump targets and backpatching for control flow instructions.
 */
public class LabelManager {
    private static final Map<PythonOpCode, Integer> CACHE_COUNTS = new HashMap<>();
    static {
        CACHE_COUNTS.put(PythonOpCode.FOR_ITER, 1);
        CACHE_COUNTS.put(PythonOpCode.JUMP_BACKWARD, 1);
        CACHE_COUNTS.put(PythonOpCode.POP_JUMP_IF_TRUE, 1);
        CACHE_COUNTS.put(PythonOpCode.POP_JUMP_IF_FALSE, 1);
    }

    private final Map<String, Integer> labels = new HashMap<>();
    private final List<JumpRequest> pendingJumps = new ArrayList<>();

    record JumpRequest(String labelName, int instructionIndex, PythonOpCode opcode) {
    }

    /**
     * Marks a label at the current instruction position.
     */
    public void markLabel(String labelName, int currentPosition) {
        labels.put(labelName, currentPosition);
    }

    /**
     * Records a jump request to be patched later.
     */
    public void addJumpRequest(String labelName, int instructionIndex, PythonOpCode opcode) {
        pendingJumps.add(new JumpRequest(labelName, instructionIndex, opcode));
    }

    /**
     * Computes byte offset for each instruction, accounting for
     * inline cache entries (each cache entry = 2 bytes).
     */
    private int[] computeByteOffsets(List<PythonInstruction> instructions) {
        int[] offsets = new int[instructions.size()];
        int offset = 0;
        for (int i = 0; i < instructions.size(); i++) {
            offsets[i] = offset;
            offset += 2;
        }
        return offsets;
    }

    /**
     * Resolves all pending jumps and updates the instruction list.
     * Python 3.12+ uses code-unit offsets (2 bytes each) with inline caches.
     *
     * Jump conventions (CPython 3.12+):
     *   JUMP_FORWARD:   from = instr + 2 (skip 4 bytes), JUMPBY(oparg) forward
     *   JUMP_BACKWARD:  from = instr + 2 + cache, JUMPBY(-(int)oparg) backward
     *   FOR_ITER:       from = instr + 2 + cache, JUMPBY(oparg) forward
     *   POP_JUMP_*:     absolute offset in code units: target = oparg * 2
     */
    public void backpatch(List<PythonInstruction> instructions) {
        int[] byteOffsets = computeByteOffsets(instructions);

        // Sort by instruction index DESCENDING so EXTENDED_ARG insertions
        // at higher indices don't affect unprocessed jumps at lower indices.
        List<JumpRequest> sortedJumps = new ArrayList<>(pendingJumps);
        sortedJumps.sort((a, b) -> Integer.compare(b.instructionIndex(), a.instructionIndex()));

        for (int ri = 0; ri < sortedJumps.size(); ri++) {
            JumpRequest request = sortedJumps.get(ri);
            Integer targetIdx = labels.get(request.labelName);
            if (targetIdx == null) {
                throw new RuntimeException("Undefined label: " + request.labelName);
            }

            int targetByte = byteOffsets[targetIdx];
            int instrByte = byteOffsets[request.instructionIndex];
            int cacheCount = CACHE_COUNTS.getOrDefault(request.opcode, 0);

            int arg;
            boolean isAbsolute;
            if (request.opcode == PythonOpCode.JUMP_FORWARD) {
                int from = instrByte + 2 + 2 * cacheCount;
                arg = (targetByte - from) / 2;
                isAbsolute = false;
            } else if (request.opcode == PythonOpCode.JUMP_BACKWARD ||
                       request.opcode == PythonOpCode.JUMP_BACKWARD_NO_INTERRUPT) {
                int from = instrByte + 2 + 2 * cacheCount;
                int backward = from - targetByte;
                arg = backward / 2;
                isAbsolute = false;
            } else if (request.opcode == PythonOpCode.FOR_ITER) {
                int from = instrByte + 2 + 2 * cacheCount;
                arg = (targetByte - from) / 2;
                isAbsolute = false;
            } else if (request.opcode == PythonOpCode.POP_JUMP_IF_TRUE ||
                       request.opcode == PythonOpCode.POP_JUMP_IF_FALSE) {
                int from = instrByte + 2 + 2 * cacheCount;
                arg = (targetByte - from) / 2;
                isAbsolute = false;
            } else {
                arg = targetByte / 2;
                isAbsolute = true;
            }

            if (arg < 0) {
                throw new RuntimeException("Negative jump offset for " + request.opcode +
                    " (instr=" + request.instructionIndex + " target=" + targetIdx + ")");
            }

            if (arg > 255) {
                // For absolute jumps (POP_JUMP_IF_*), inserting N EXTENDED_ARGs
                // shifts the target by N, so the encoded arg = arg + N.
                // Find N such that (arg + N) fits in N EXTENDED_ARGs.
                int extendedCount = 1;
                while (true) {
                    int shiftedArg = arg + extendedCount;
                    long maxVal = (extendedCount == 1) ? 65535L : (extendedCount == 2) ? 16777215L : 4294967295L;
                    if (shiftedArg <= maxVal) break;
                    extendedCount++;
                }

                // Insert EXTENDED_ARG instructions before the jump
                int encodedArg = arg + extendedCount;
                for (int e = extendedCount - 1; e >= 0; e--) {
                    int ea = (encodedArg >> (8 * (e + 1))) & 0xFF;
                    instructions.add(request.instructionIndex, new PythonInstruction(PythonOpCode.EXTENDED_ARG, ea));
                }

                // Shift any labels at or after the insertion point
                Map<String, Integer> shiftedLabels = new HashMap<>();
                for (Map.Entry<String, Integer> e : labels.entrySet()) {
                    int pos = e.getValue();
                    if (pos >= request.instructionIndex) {
                        pos += extendedCount;
                    }
                    shiftedLabels.put(e.getKey(), pos);
                }
                labels.clear();
                labels.putAll(shiftedLabels);

                // Shift any pending jumps at or after the insertion point
                List<JumpRequest> shiftedJumps = new ArrayList<>();
                for (JumpRequest jr : this.pendingJumps) {
                    int idx = jr.instructionIndex();
                    if (idx >= request.instructionIndex) {
                        shiftedJumps.add(new JumpRequest(jr.labelName(), idx + extendedCount, jr.opcode()));
                    } else {
                        shiftedJumps.add(jr);
                    }
                }
                this.pendingJumps.clear();
                this.pendingJumps.addAll(shiftedJumps);

                // Also update the sortedJumps copy for any subsequent iterations
                // whose instructionIndex is >= request.instructionIndex
                for (int sj = ri + 1; sj < sortedJumps.size(); sj++) {
                    JumpRequest sr = sortedJumps.get(sj);
                    if (sr.instructionIndex() >= request.instructionIndex) {
                        sortedJumps.set(sj, new JumpRequest(sr.labelName(), sr.instructionIndex() + extendedCount, sr.opcode()));
                    }
                }

                // Recompute byte offsets
                byteOffsets = computeByteOffsets(instructions);

                // Set the jump instruction with the low byte of the encoded arg
                int newJumpIdx = request.instructionIndex + extendedCount;
                instructions.set(newJumpIdx, new PythonInstruction(request.opcode, encodedArg & 0xFF));
            } else {
                instructions.set(request.instructionIndex, new PythonInstruction(request.opcode, arg));
            }
        }
        pendingJumps.clear();
        labels.clear();
    }

    public void clear() {
        labels.clear();
        pendingJumps.clear();
    }

    public Map<String, Integer> getLabels() { return new HashMap<>(labels); }
    public List<JumpRequest> getPendingJumps() { return new ArrayList<>(pendingJumps); }

    public void setLabels(Map<String, Integer> l) { labels.clear(); labels.putAll(l); }
    public void setPendingJumps(List<JumpRequest> j) { pendingJumps.clear(); pendingJumps.addAll(j); }

    public void shiftIndices(int delta) {
        if (delta == 0) return;
        Map<String, Integer> shifted = new HashMap<>();
        for (Map.Entry<String, Integer> e : labels.entrySet()) {
            shifted.put(e.getKey(), e.getValue() + delta);
        }
        labels.clear();
        labels.putAll(shifted);
        List<JumpRequest> shiftedJumps = new ArrayList<>();
        for (JumpRequest jr : pendingJumps) {
            shiftedJumps.add(new JumpRequest(jr.labelName(), jr.instructionIndex() + delta, jr.opcode()));
        }
        pendingJumps.clear();
        pendingJumps.addAll(shiftedJumps);
    }
}
