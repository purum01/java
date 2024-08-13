package edu.design.singleton.test1.code2;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // synchronized 키워드를 사용하여 동기화
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
