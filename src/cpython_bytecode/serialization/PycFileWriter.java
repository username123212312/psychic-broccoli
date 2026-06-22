package cpython_bytecode.serialization;

import cpython_bytecode.PythonCodeObject;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Orchestrates the creation of a .pyc file.
 * Python 3.14 header (16 bytes):
 *   [0:4]  magic number
 *   [4:8]  flags (0=mtime, 1=unchecked_hash, 3=checked_hash)
 *   [8:16] source_hash (8 bytes, for hash-based) or mtime(4)+size(4)
 */
public class PycFileWriter {
    private static final int MAGIC_314 = 0x0A0D0E2B;

    public void write(PythonCodeObject codeObject, String outputPath) throws IOException {
        write(codeObject, outputPath, null);
    }

    public void write(PythonCodeObject codeObject, String outputPath, String sourcePath) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(outputPath)) {
            // 16-byte header with CHECKED_HASH
            ByteBuffer header = ByteBuffer.allocate(16);
            header.order(ByteOrder.LITTLE_ENDIAN);

            header.putInt(MAGIC_314);
            header.putInt(1);                     // flags = 1 (hash_based, no source check)

            long timestamp = System.currentTimeMillis() / 1000;
            header.putLong(timestamp);            // 8 bytes (unused for hash-based, but fills header)

            fos.write(header.array());

            MarshalWriter writer = new MarshalWriter();
            writer.writeObject(codeObject);
            fos.write(writer.getBytes());
        }
    }

    private byte[] computeSourceHash(String sourcePath) throws IOException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            try (FileInputStream fis = new FileInputStream(sourcePath)) {
                byte[] buf = new byte[8192];
                int n;
                while ((n = fis.read(buf)) != -1) {
                    md.update(buf, 0, n);
                }
            }
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new IOException("SHA-256 not available", e);
        }
    }
}
