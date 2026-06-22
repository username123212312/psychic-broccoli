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
    private final Map<String, Integer> labels = new HashMap<>();
    private final List<JumpRequest> pendingJumps = new ArrayList<>();

    private record JumpRequest(String labelName, int instructionIndex, PythonOpCode opcode) {
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
     * Resolves all pending jumps and updates the instruction list.
     * In Python 3.12+, jump arguments are instruction offsets, not byte offsets.
     */
    public void backpatch(List<PythonInstruction> instructions) {
        for (JumpRequest request : pendingJumps) {
            Integer targetIndex = labels.get(request.labelName);
            if (targetIndex == null) {
                throw new RuntimeException("Undefined label: " + request.labelName);
            }

            int offset;
            if (request.opcode == PythonOpCode.JUMP_FORWARD) {
                // Forward jumps are relative to the instruction AFTER the jump
                offset = targetIndex - (request.instructionIndex + 1);
            } else if (request.opcode == PythonOpCode.JUMP_BACKWARD ||
                    request.opcode == PythonOpCode.JUMP_BACKWARD_NO_INTERRUPT) {
                // Backward jumps are also relative in modern Python
                offset = (request.instructionIndex + 1) - targetIndex;
            } else {
                // For POP_JUMP_IF_*, it depends on the specific version's logic.
                // In 3.12+, most are relative or absolute instruction offsets.
                offset = targetIndex;
            }

            instructions.set(request.instructionIndex, new PythonInstruction(request.opcode, offset));
        }
    }

    public void clear() {
        labels.clear();
        pendingJumps.clear();
    }
}
