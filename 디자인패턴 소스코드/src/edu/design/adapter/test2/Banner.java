package edu.design.adapter.test2;

public class Banner {
	String string;

	public Banner(String string) {
		super();
		this.string = string;
	}

	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
