package visitor.ast;

import ast.ASTNode;
import ast.htmlContentItem.HtmlTextItem;
import ast.htmlContentItem.HtmlContentItem;
import ast.htmlElement.*;
import ast.tagContent.HtmlAttribute;

import java.util.List;

public class ASTPrinterVisitor {


    public void print(ASTNode node) {
        print(node, 0);
    }


    private void print(ASTNode node, int level) {
        if (node == null) return;

        printIndent(level);


        System.out.println(node.toString() + " (line " + node.toString() + ")");


        if (node instanceof HtmlBodyItem body) {
            for (HtmlContentItem item : body.getContentItems()) {
                print(item, level + 1);
            }
        }

        else if (node instanceof HtmlTagItem tag) {


            List<HtmlAttribute> attrs = tag.getAttributes();
            if (attrs != null) {
                for (HtmlAttribute attr : attrs) {
                    printIndent(level + 1);
                    System.out.println(attr.toString() + " (line " + attr.toString() + ")");
                }
            }

            List<HtmlContentItem> children = tag.getChildren();
            if (children != null) {
                for (HtmlContentItem child : children) {
                    print(child, level + 1);
                }
            }
        }
        else if (node instanceof InnerCssItem) {

        }
        else if (node instanceof ScriptElement) {

        }

        else if (node instanceof StyleSheet) {

        }
    }
    private void printIndent(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("│   ");
        }
    }
}
