package ast.css;

import ast.ASTNode;

import java.util.List;

public class StyleSheet extends ASTNode {
    private List<RuleSet> ruleSets;

    public StyleSheet(int line_number) {
        super("StyleSheet", line_number);
    }

    public void setRuleSets(List<RuleSet> ruleSets) {
        this.ruleSets = ruleSets;
    }

    public List<RuleSet> getRuleSets() {
        return ruleSets;
    }

    @Override
    public String generateCode() {
        if (ruleSets == null || ruleSets.isEmpty()) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ruleSets.size(); i++) {
            String generated = ruleSets.get(i).generateCode();
            if (!generated.isBlank()) {
                builder.append(generated);
                if (i < ruleSets.size() - 1) {
                    builder.append("\n\n");
                }
            }
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
