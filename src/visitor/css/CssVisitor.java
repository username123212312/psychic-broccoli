package visitor.css;

import antlr.JinjaFlaskParser;
import antlr.JinjaFlaskParserBaseVisitor;
import ast.ASTNode;
import ast.css.RuleSet;

import java.util.ArrayList;
import java.util.List;

public class CssVisitor
        extends JinjaFlaskParserBaseVisitor<List<RuleSet>> {

    @Override
    public List<RuleSet> visitStyleSheet(
            JinjaFlaskParser.StyleSheetContext ctx
    ) {
        List<RuleSet> rules = new ArrayList<>();

        for (var ruleCtx : ctx.ruleSet()) {
            rules.add((RuleSet) visit(ruleCtx));
        }

        return rules;
    }

//    @Override
//    public RuleSet visitCssRule(
//            JinjaFlaskParser.CssRuleContext ctx
//    ) {}
}
