package edu.design.adapter.test2;

//Banner를 상속, Print를 구현
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	public void printWeak() {
		// 어댑팅할 클래스의 showWithParen 실행
		showWithParen();
	}

	public void printStrong() {
		// 어댑팅할 클래스의 showWithAster 실행
		showWithAster();
	}
}
