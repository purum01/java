package cleancode.section06.coupling;

class A {
	private B b;
	
	public void a1() {
		b.b1();
	}
	
	public void a2(E e) {
		e.e1();
	}
	
	public void a3() {
		C c = new C();
		c.c1();
	}
	public void a4() {
		b.b3();
	}
}

class B {
	private D d;
	
	public void b1() {
		
	}
	
	public D b2() {
		return d;
	}
	
	public void b3() {
		d.d1();
	}
}

class C {
	public void c1() {}
}
class D {
	public void d1() {}
}
class E {
	public void e1() {}
}

public class CouplingTest2 {

}
