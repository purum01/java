package cleancode.section03.inheritanceORdelegation2;

abstract public class PrinterImpl {
    private String id;

    public PrinterImpl(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    abstract public void print(Object msg);
}