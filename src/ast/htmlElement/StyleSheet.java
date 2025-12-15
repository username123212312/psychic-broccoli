package ast.htmlElement;

import ast.css.RuleSet;

import java.util.List;

public class StyleSheet extends HtmlElementItem {
    private List<RuleSet> ruleSets;
    public StyleSheet(int line_number) {
        super("StyleSheet", line_number);
    }
}
