package edu.design.singleton.test1.code3;

public class Singleton {
	// 인스턴스를 static 초기화 블록에서 미리 생성
	private static final Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
