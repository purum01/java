package cleancode.section06.coupling;
//package chapter01.section05.coupling;
//
//class A {
//	private B b;
//	
//	// 속성 객체 결합
//	public void a1() { 
//		b.b1();
//	}
//	
//	// 파라메터 객체 결합
//	public void a2(E e) {
//		e.e1();
//	}
//	
//	// 로컬 객체 결합
//	public void a3() {
//		C c = new C();
//		c.c1();
//	}
//	
//	// 반환 객체 결합
//	public void a4() {
//		b.b2().d1();
//	}
//}
//
//class B {
//	private D d;
//	
//	public void b1() {
//		
//	}
//	
//	public D b2() {
//		return d;
//	}
//}
//
//class C {
//	public void c1() {}
//}
//class D {
//	public void d1() {}
//}
//class E {
//	public void e1() {}
//}
//
//public class CouplingTest1 {
//
//}
