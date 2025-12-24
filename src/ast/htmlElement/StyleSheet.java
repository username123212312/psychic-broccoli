package ast.htmlElement;

import ast.Consts;
import ast.Statement;
import ast.css.RuleSet;

import java.util.List;

public class StyleSheet extends HtmlElementItem {
    private List<RuleSet> ruleSets;
    public StyleSheet(int line_number, List<RuleSet> ruleSets) {
        super("StyleSheet", line_number);
        this.ruleSets = ruleSets;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        for(RuleSet s : this.ruleSets){
            stringBuilder.append(Consts.STRING_INDENT).append(s.toString());
        }
        return stringBuilder.toString();
    }


}
