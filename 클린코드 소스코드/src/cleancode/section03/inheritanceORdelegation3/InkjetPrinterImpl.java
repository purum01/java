package cleancode.section03.inheritanceORdelegation3;

class InkjetPrinterImpl extends PrinterImpl {

    public InkjetPrinterImpl(String id) {
        super(id);
    }

    public void print(Object msg) {
        System.out.println("*잉크젯 방식으로 프린트를 시작합니다.*");
        System.out.println(msg.toString());
        System.out.println("*잉크젯 방식으로 프린트를 종료합니다.*");
    }
}