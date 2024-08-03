package cleancode.section03.inheritanceORdelegation1;

public class LaserPrinter extends Printer {

    public LaserPrinter(String id) {
        super(id);
    }

    public void print(Object msg) {
        System.out.println("*레이저 방식으로 프린트를 시작합니다.*");
        System.out.println(msg.toString());
        System.out.println("*레이저 방식으로 프린트를 종료합니다.*");
    }
}