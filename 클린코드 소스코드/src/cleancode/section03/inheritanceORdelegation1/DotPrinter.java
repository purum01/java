package cleancode.section03.inheritanceORdelegation1;

public class DotPrinter extends Printer {

    public DotPrinter(String id) {
        super(id);
    }

    public void print(Object msg) {
        System.out.println("*도트 방식으로 프린트를 시작합니다.*");
        System.out.println(msg.toString());
        System.out.println("*도트 방식으로 프린트를 종료합니다.*");
    }
}
