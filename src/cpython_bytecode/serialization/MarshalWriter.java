package cpython_bytecode.serialization;

import cpython_bytecode.PythonCodeObject;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Serializes Java objects into Python's marshal format.
 */
public class MarshalWriter {
    private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    private final DataOutputStream out = new DataOutputStream(baos);

    // Marshal type codes
    private static final byte TYPE_NULL = '0';
    private static final byte TYPE_NONE = 'N';
    private static final byte TYPE_FALSE = 'F';
    private static final byte TYPE_TRUE = 'T';
    private static final byte TYPE_INT = 'i';
    private static final byte TYPE_STRING = 's';
    private static final byte TYPE_TUPLE = '(';
    private static final byte TYPE_CODE = 'c';
    private static final byte TYPE_SHORT_ASCII = 'z';

    public void writeObject(Object obj) throws IOException {
        switch (obj) {
            case null -> out.writeByte(TYPE_NONE);
            case Boolean b -> out.writeByte(b ? TYPE_TRUE : TYPE_FALSE);
            case Integer i -> {
                out.writeByte(TYPE_INT);
                writeInt32(i);
            }
            case String s -> {
                out.writeByte(TYPE_SHORT_ASCII);
                out.writeByte(s.length());
                out.writeBytes(s);
            }
            case List list -> {
                out.writeByte(TYPE_TUPLE);
                writeInt32(list.size());
                for (Object item : list) {
                    writeObject(item);
                }
            }
            case PythonCodeObject pythonCodeObject -> writeCodeObject(pythonCodeObject);
            case byte[] bytes -> {
                out.writeByte(TYPE_STRING);
                writeInt32(bytes.length);
                out.write(bytes);
            }
            default -> throw new IOException("Unsupported object type for marshal: " + obj.getClass().getName());
        }
    }

    private void writeCodeObject(PythonCodeObject co) throws IOException {
        out.writeByte(TYPE_CODE);
        writeInt32(co.co_argcount);
        writeInt32(co.co_posonlyargcount);
        writeInt32(co.co_kwonlyargcount);
        writeInt32(co.co_nlocals);
        writeInt32(co.co_stacksize);
        writeInt32(co.co_flags);

        writeObject(co.co_code);
        writeObject(co.co_consts);
        writeObject(co.co_names);
        writeObject(co.co_varnames);
        writeObject(co.co_freevars);
        writeObject(co.co_cellvars);

        writeObject(co.co_filename);
        writeObject(co.co_name);
        writeInt32(co.co_firstlineno);
        writeObject(co.co_lnotab);
    }

    private void writeInt32(int v) throws IOException {
        // Little-endian
        out.write(v & 0xFF);
        out.write((v >> 8) & 0xFF);
        out.write((v >> 16) & 0xFF);
        out.write((v >> 24) & 0xFF);
    }

    public byte[] getBytes() {
        return baos.toByteArray();
    }
}
