package ast.css;

import ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class CssSelector extends ASTNode {
    private String elementName;
    private String id;
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
