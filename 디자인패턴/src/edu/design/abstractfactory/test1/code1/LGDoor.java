package edu.design.abstractfactory.test1.code1;

public class LGDoor extends Door {
	protected void doClose() {
		System.out.println("close LG Door");
	}

	protected void doOpen() {
		System.out.println("open LG Door");
	}
}