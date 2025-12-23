package ast.css;

import ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class CssSelector extends ASTNode {
    // 1. Element Name (Type Selector, e.g., "div")
    private String elementName;

    // 2. ID Selector (e.g., "main"). Note: A selector should only have one ID.
    private String id;

    // 3. Class Selectors (e.g., ["active", "large"])
    private List<String> classes;

    public CssSelector(String node_name, int line_number) {
        super(node_name, line_number);
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }


}
