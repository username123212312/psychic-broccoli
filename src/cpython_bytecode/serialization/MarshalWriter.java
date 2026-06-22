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
    private static final byte FLAG_REF = (byte) 0x80;
    private static final byte TYPE_NULL = '0';
    private static final byte TYPE_NONE = 'N';
    private static final byte TYPE_FALSE = 'F';
    private static final byte TYPE_TRUE = 'T';
    private static final byte TYPE_INT = 'i';
    private static final byte TYPE_STRING = 's';
    private static final byte TYPE_TUPLE = '(';
    private static final byte TYPE_SMALL_TUPLE = ')';
    private static final byte TYPE_CODE = 'c';
    private static final byte TYPE_ASCII = 'a';
    private static final byte TYPE_SHORT_ASCII = 'z';
    private static final byte TYPE_INTERNED = 's';

    public void writeObject(Object obj) throws IOException {
        switch (obj) {
            case null -> out.writeByte(TYPE_NONE);
            case Boolean b -> out.writeByte(b ? TYPE_TRUE : TYPE_FALSE);
            case Integer i -> {
                out.writeByte(TYPE_INT);
                writeInt32(i);
            }
            case String s -> {
                // Default to 0xDA for general strings
                out.writeByte((byte) 0xDA);
                out.writeByte(s.length());
                out.writeBytes(s);
            }
            case List list -> {
                // co_consts starts with 0x29 (TYPE_SMALL_TUPLE) without FLAG_REF sometimes
                // but the dump showed 0x29 (41) then 0x02
                out.writeByte((byte) 0x29);
                out.writeByte(list.size());
                for (Object item : list) {
                    if (item instanceof String s && s.equals("NONE_PLACEHOLDER")) {
                        out.writeByte(TYPE_NONE);
                    } else {
                        writeObject(item);
                    }
                }
            }
            case PythonCodeObject pythonCodeObject -> writeCodeObject(pythonCodeObject);
            case byte[] bytes -> {
                // co_code is serialized as 0xF3 (TYPE_SHORT_ASCII | FLAG_REF | ???)
                out.writeByte((byte) 0xF3);
                writeInt32(bytes.length);
                out.write(bytes);
            }
            default -> throw new IOException("Unsupported object type for marshal: " + obj.getClass().getName());
        }
    }

    private void writeCodeObject(PythonCodeObject co) throws IOException {
        out.writeByte((byte) 0xE3);
        writeInt32(0); // co_version (New in 3.11)
        writeInt32(co.co_argcount);
        writeInt32(co.co_posonlyargcount);
        writeInt32(co.co_kwonlyargcount);
        writeInt32(co.co_nlocals);
        writeInt32(co.co_stacksize);
        writeInt32(co.co_flags);

        // 1. co_code
        out.writeByte((byte) 0xF3);
        writeInt32(co.co_code.length);
        out.write(co.co_code);

        // 2. co_consts
        writeObject(co.co_consts);

        // 3. co_names
        out.writeByte((byte) 0xA9);
        out.writeByte(co.co_names.size());
        for (String name : co.co_names) writeObject(name);

        // 4. co_localsplusnames (Empty tuple reference placeholder 0x72 0x03 0x00 0x00 0x00)
        // For simplicity, just write an empty small tuple 0xA9 0x00
        out.writeByte((byte) 0xA9);
        out.writeByte(0);

        // 5. co_localspluskinds (Empty bytes placeholder 0xF3 0x00 0x00 0x00 0x00)
        out.writeByte((byte) 0xF3);
        writeInt32(0);

        // 6. co_filename
        out.writeByte((byte) 0xFA);
        out.writeByte(co.co_filename.length());
        out.writeBytes(co.co_filename);

        // 7. co_name
        out.writeByte((byte) 0xDA);
        out.writeByte(co.co_name.length());
        out.writeBytes(co.co_name);

        // 8. co_qualname
        out.writeByte((byte) 0xDA);
        out.writeByte(co.co_qualname.length());
        out.writeBytes(co.co_qualname);

        // 9. co_firstlineno
        writeInt32(co.co_firstlineno);

        // 10. co_linetable
        out.writeByte((byte) 0xF3);
        writeInt32(co.co_lnotab.length);
        out.write(co.co_lnotab);

        // 11. co_exceptiontable
        out.writeByte((byte) 0xF3);
        writeInt32(co.co_exceptiontable.length);
        out.write(co.co_exceptiontable);
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
