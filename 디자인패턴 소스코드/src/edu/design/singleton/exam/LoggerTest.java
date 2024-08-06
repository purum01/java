package edu.design.singleton.exam;


public class LoggerTest {
    public static void main(String[] args) {
        // 1. Logger 클래스의 인스턴스를 가져와 로그 메시지를 기록합니다.
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");
        logger1.log("Second log message");

        // 2. 다른 인스턴스를 가져와 로그 메시지가 동일한지 확인합니다.
        Logger logger2 = Logger.getInstance();
        logger2.log("Third log message");

        // 3. 모든 로그 메시지를 출력합니다.
        logger1.printLogs();

        // 4. 두 인스턴스가 같은지 확인하여 Singleton 패턴이 올바르게 동작하는지 검증합니다.
        if (logger1 == logger2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}

