package cleancode.section03.inheritanceORdelegation3;

public class Printer {
    private PrinterImpl printerImpl;

    public Printer(PrinterImpl printerImpl) {
        this.printerImpl = printerImpl;
    }

    public String getId() {
        return new Integer(printerImpl.getId()).toString();
    }

    public void print(Object msg) {
        printerImpl.print(msg);
    }
}