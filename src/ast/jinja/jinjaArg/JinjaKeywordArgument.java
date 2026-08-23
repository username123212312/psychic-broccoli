package ast.jinja.jinjaArg;


public class JinjaKeywordArgument extends JinjaArgument {
    private String id;

    public JinjaKeywordArgument(int line_number) {
        super("JinjaKeywordArgument", line_number);

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + id + " = " +getArgument().toString() + " ) ";
    }
    @Override
    public String generateCode() {
        StringBuilder builder = new StringBuilder();
        if (id != null) {
            builder.append(id).append("=");
        }
        if (getArgument() != null) {
            builder.append(getArgument().generateCode());
        }
        return builder.toString();
    }
}
