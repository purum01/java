package edu.design.singleton.test3;

class MyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public MyException() {
	}

	public MyException(String str) {
		super(str);
	}
}

class Singleton {
	private static Singleton instance;
	private static boolean flag = false;

	private Singleton() {
	}

	public static Singleton getInstance() throws MyException {
		if (instance == null) {
			instance = new Singleton();
		}
		if (flag) {
			throw new MyException("이미 사용되고 있습니다.");
		} else {
			flag = true;
			return instance;
		}
	}

}

public class SingletonTest2 {
	public static void main(String args[]) {
		try {
			Singleton.getInstance();
			System.out.println("A 객체 하나를 생성해서 얻었습니다.");
			Singleton.getInstance();
			System.out.println("A 객체  또 하나를 생성해서 얻었습니다.");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}