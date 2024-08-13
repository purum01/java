package edu.design.singleton.test2;

class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class SingletonTest1 {
	public static void main(String args[]) {

		Singleton.getInstance();
		System.out.println("A 객체 하나를 생성해서 얻었습니다.");
		Singleton.getInstance();
		System.out.println("A 객체  또 하나를 생성해서 얻었습니다.");
	}
}