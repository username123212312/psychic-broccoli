package cpython_bytecode;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates a CPython Code Object (PyCodeObject).
 */
public class PythonCodeObject {
    // Metadata
    public int co_argcount = 0;
    public int co_posonlyargcount = 0;
    public int co_kwonlyargcount = 0;
    public int co_nlocals = 0;
    public int co_stacksize = 0;
    public int co_flags = 0;

    // Content
    public byte[] co_code = new byte[0];
    public List<Object> co_consts = new ArrayList<>();
    public List<String> co_names = new ArrayList<>();
    public List<String> co_varnames = new ArrayList<>();
    public List<String> co_freevars = new ArrayList<>();
    public List<String> co_cellvars = new ArrayList<>();
    public byte[] co_exceptiontable = new byte[0];

    // Debug/Source info
    public String co_filename = "<string>";
    public String co_name = "<module>";
    public String co_qualname = "<module>";
    public int co_firstlineno = 1;
    public byte[] co_lnotab = new byte[0];

    public PythonCodeObject() {}

    public PythonCodeObject(String name, String filename, int firstlineno) {
        this.co_name = name;
        this.co_filename = filename;
        this.co_firstlineno = firstlineno;
    }

    @Override
    public String toString() {
        return String.format("PythonCodeObject(name='%s', filename='%s', argcount=%d, locals=%d)",
                co_name, co_filename, co_argcount, co_nlocals);
    }
}
