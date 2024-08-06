package edu.design.command.test1.code1;

public class Client {
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Button lampButton = new Button(lamp);
		lampButton.pressed();
	}
}
