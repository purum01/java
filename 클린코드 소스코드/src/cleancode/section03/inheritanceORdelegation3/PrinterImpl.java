package cleancode.section03.inheritanceORdelegation3;

abstract public class PrinterImpl {
    private String id;

    public PrinterImpl(String id) {
        this.id = id;
    }

    // int를 반환하도록 수정
    public int getId() {
        return Integer.parseInt(id);
    }

    abstract public void print(Object msg);
}