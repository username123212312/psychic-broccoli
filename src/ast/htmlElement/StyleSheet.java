package ast.htmlElement;

import ast.css.RuleSet;

import java.util.List;

public class StyleSheet extends HtmlElementItem {
    private List<RuleSet> ruleSets;
    public StyleSheet(int line_number, List<RuleSet> ruleSets) {
        super("StyleSheet", line_number);
        this.ruleSets = ruleSets;
    }
<<<<<<< HEAD
    @Override
    public String toString(){
        return "StyleSheet" ;
    }
=======
>>>>>>> origin/raghad
}
