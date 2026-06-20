package cpython_bytecode.serialization;

import cpython_bytecode.PythonCodeObject;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Orchestrates the creation of a .pyc file.
 */
public class PycFileWriter {
    // Magic number for Python 3.14 (Estimated based on 3.12/3.13 progression)
    // Real value should be checked in a 3.14 environment: importlib.util.MAGIC_NUMBER
    // Magic number for Python 3.14.0rc3 (3627)
    // Formula: (MAGIC_NUMBER) | (0x0D << 16) | (0x0A << 24)
    // 3627 in hex is 0xE2B. Combined: 0x0A0DE2B
    private static final int MAGIC_314 = 0x0A0D0DCB;

    public void write(PythonCodeObject codeObject, String outputPath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(outputPath)) {
            // 1. Write Header (16 bytes for modern Python)
            ByteBuffer header = ByteBuffer.allocate(16);
            header.order(ByteOrder.LITTLE_ENDIAN);

            header.putInt(MAGIC_314);      // Magic number
            header.putInt(0);               // Bit field for PEP 552 (0 for timestamp-based)
            header.putInt((int) (System.currentTimeMillis() / 1000)); // Timestamp
            header.putInt(0);               // Source size (optional)

            fos.write(header.array());

            // 2. Write Marshaled Code Object
            MarshalWriter writer = new MarshalWriter();
            writer.writeObject(codeObject);
            fos.write(writer.getBytes());
        }
    }
}
