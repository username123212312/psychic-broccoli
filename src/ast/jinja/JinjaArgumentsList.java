package ast.jinja;

import ast.ASTNode;
import ast.jinja.jinjaArg.JinjaArgument;
import java.util.List;

public class JinjaArgumentsList extends ASTNode{
    private List<JinjaArgument> arguments;
    public JinjaArgumentsList(int line_number) {
        super("JinjaArgumentsList", line_number);
    }

    public void setArguments(List<JinjaArgument> arguments) {
        this.arguments = arguments;
    }

    public List<JinjaArgument> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if(arguments != null){
            for(JinjaArgument jinjaArgument : arguments){
                stringBuilder.append(jinjaArgument.toString())
                        .append(arguments.indexOf(jinjaArgument)
                                == arguments.size() - 1 ? "" : ", ");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String generateCode() {
        StringBuilder builder = new StringBuilder();
        if (arguments != null && !arguments.isEmpty()) {
            for (int i = 0; i < arguments.size(); i++) {
                builder.append(arguments.get(i).generateCode());
                if (i < arguments.size() - 1) {
                    builder.append(", ");
                }
            }
        }
        return builder.toString();
    }}
