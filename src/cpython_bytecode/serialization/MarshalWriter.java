package cpython_bytecode.serialization;

import cpython_bytecode.PythonCodeObject;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

/**
 * Serializes Java objects into Python's marshal format (version 4, Python 3.14).
 */
public class MarshalWriter {
    private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    private final DataOutputStream out = new DataOutputStream(baos);

    // Marshal type codes (without FLAG_REF)
    private static final byte TYPE_NONE = 'N';
    private static final byte TYPE_INT = 'i';
    private static final byte TYPE_BINARY_FLOAT = 'g';
    private static final byte TYPE_STRING = 's';
    private static final byte TYPE_SMALL_TUPLE = ')';
    private static final byte TYPE_CODE = 'c';
    private static final byte TYPE_SHORT_ASCII = 'Z';
    private static final byte FLAG_REF = (byte) 0x80;

    // With FLAG_REF pre-applied
    private static final byte TYPE_CODE_REF = (byte) (TYPE_CODE | FLAG_REF);               // 0xe3
    private static final byte TYPE_STRING_REF = (byte) (TYPE_STRING | FLAG_REF);           // 0xf3
    private static final byte TYPE_SMALL_TUPLE_REF = (byte) (TYPE_SMALL_TUPLE | FLAG_REF); // 0xa9
    private static final byte TYPE_SHORT_ASCII_REF = (byte) (TYPE_SHORT_ASCII | FLAG_REF); // 0xda
    private static final byte TYPE_BINARY_FLOAT_REF = (byte) (TYPE_BINARY_FLOAT | FLAG_REF); // 0xe7

    private void writeShortAsciiRef(String s) throws IOException {
        out.writeByte(TYPE_SHORT_ASCII_REF);
        out.writeByte(s.length());
        out.writeBytes(s);
        nextRef++;
    }

    private void writeStringRef(byte[] data) throws IOException {
        out.writeByte(TYPE_STRING_REF);
        writeInt32(data.length);
        out.write(data);
        nextRef++;
    }

    private int nextRef = 0;

    public void writeObject(Object obj) throws IOException {
        switch (obj) {
            case null -> out.writeByte(TYPE_NONE);
            case Boolean b -> out.writeByte(b ? (byte) 'T' : (byte) 'F');
            case Integer i -> {
                out.writeByte(TYPE_INT);
                writeInt32(i);
            }
            case BigInteger bi -> {
                out.writeByte(TYPE_INT);
                writeInt32(bi.intValue());
            }
            case Double d -> {
                writeRef(TYPE_BINARY_FLOAT_REF);
                writeDouble64(d);
            }
            case String s -> writeShortAsciiRef(s);
            case List list -> {
                writeRef(TYPE_SMALL_TUPLE_REF);
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
            case byte[] bytes -> writeStringRef(bytes);
            default -> throw new IOException("Unsupported object type for marshal: " + obj.getClass().getName());
        }
    }

    private void writeCodeObject(PythonCodeObject co) throws IOException {
        writeRef(TYPE_CODE_REF);
        writeInt32(co.co_argcount);
        writeInt32(co.co_posonlyargcount);
        writeInt32(co.co_kwonlyargcount);
        writeInt32(co.co_stacksize);
        writeInt32(co.co_flags);

        // co_code (bytecode bytes)
        writeObject(co.co_code);

        // co_consts
        writeObject(co.co_consts);

        // co_names
        writeRef(TYPE_SMALL_TUPLE_REF);
        out.writeByte(co.co_names.size());
        for (String name : co.co_names) writeObject(name);

        // co_localsplusnames (concatenation of varnames + cellvars + freevars)
        writeRef(TYPE_SMALL_TUPLE_REF);
        int totalLocals = co.co_varnames.size() + co.co_cellvars.size() + co.co_freevars.size();
        out.writeByte(totalLocals);
        for (String v : co.co_varnames) writeObject(v);
        for (String v : co.co_cellvars) writeObject(v);
        for (String v : co.co_freevars) writeObject(v);

        // co_localspluskinds (byte per local: 0x20=local, 0x40=cell, 0x60=free)
        byte[] kinds = new byte[totalLocals];
        int kindIdx = 0;
        for (int i = 0; i < co.co_varnames.size(); i++) kinds[kindIdx++] = (byte) 0x20;
        for (int i = 0; i < co.co_cellvars.size(); i++) kinds[kindIdx++] = (byte) 0x40;
        for (int i = 0; i < co.co_freevars.size(); i++) kinds[kindIdx++] = (byte) 0x80;
        writeStringRef(kinds);

        // co_filename
        writeShortAsciiRef(co.co_filename);

        // co_name
        writeShortAsciiRef(co.co_name);

        // co_qualname
        writeShortAsciiRef(co.co_qualname);

        // co_firstlineno
        writeInt32(co.co_firstlineno);

        // co_linetable
        writeObject(co.co_lnotab);

        // co_exceptiontable
        writeObject(co.co_exceptiontable);
    }

    private void writeRef(int typeWithFlag) throws IOException {
        out.writeByte(typeWithFlag);
        nextRef++;
    }

    private void writeInt32(int v) throws IOException {
        out.write(v & 0xFF);
        out.write((v >> 8) & 0xFF);
        out.write((v >> 16) & 0xFF);
        out.write((v >> 24) & 0xFF);
    }

    private void writeDouble64(double d) throws IOException {
        long bits = Double.doubleToRawLongBits(d);
        out.write((int) (bits & 0xFF));
        out.write((int) ((bits >> 8) & 0xFF));
        out.write((int) ((bits >> 16) & 0xFF));
        out.write((int) ((bits >> 24) & 0xFF));
        out.write((int) ((bits >> 32) & 0xFF));
        out.write((int) ((bits >> 40) & 0xFF));
        out.write((int) ((bits >> 48) & 0xFF));
        out.write((int) ((bits >> 56) & 0xFF));
    }

    public byte[] getBytes() {
        return baos.toByteArray();
    }
}
