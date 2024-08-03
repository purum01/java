package cleancode.section03.casting;

class A {
	public void methodA1() {
		System.out.println("A클래스 methodA1()");
	}

	public void methodA2() {
		System.out.println("A클래스 methodA2()");
	}

	public void methodA3() {
		System.out.println("A클래스 methodA3()");
	}
}

class B extends A {
	public void methodA1() {
		System.out.println("B클래스 methodA1()");
	}

	public void methodB1() {
		System.out.println("B클래스 methodB1()");
	}

	public void methodB2() {
		System.out.println("B클래스 methodB1()");
	}
}

public class ClassCastingTest {
	public static void main(String[] argv) {
		A a = new A(); 
		a.methodA1(); 
		
		A b = new B(); 
		b.methodA1(); 

		((B) b).methodB1(); 
	}
}