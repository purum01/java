package edu.design.singleton.test1.code1;

public class Singleton {
	// Singleton 인스턴스를 static으로 선언
	private static Singleton instance;

	// 생성자를 private으로 선언하여 외부에서 인스턴스 생성을 막음
	private Singleton() {
	}

	// 인스턴스를 반환하는 static 메소드
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
