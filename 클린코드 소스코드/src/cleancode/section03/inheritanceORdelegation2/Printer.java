package cleancode.section03.inheritanceORdelegation2;

public class Printer {
    private PrinterImpl printerImpl; // 실제 본 프린터를 구현한 클래스

    public Printer(PrinterImpl printerImpl) {
        this.printerImpl = printerImpl;
    }

    public String getId() {
        return printerImpl.getId();
    }

    public void print(Object msg) {
        printerImpl.print(msg);
    }
}