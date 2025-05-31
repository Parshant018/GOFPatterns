package behavioural.template;

public abstract class DataParser {

    public void parseData() {
        open();
        parse();
        close();
    }

    protected void open() {
        System.out.println("open File");
    }

    protected void close() {
        System.out.println("Close file");
    }

    protected abstract void parse();
}
