package edu.design.adapter.test2;

//Banner를 상속, Print를 구현
public class AnotherPrintBanner implements Print {
	Banner banner;

	public AnotherPrintBanner(String string) {
		banner = new Banner(string);
	}

	public void printWeak() {
		// 어댑팅할 클래스의 showWithParen 실행
		banner.showWithParen();
	}

	public void printStrong() {
		// 어댑팅할 클래스의 showWithAster 실행
		banner.showWithAster();
	}
}
