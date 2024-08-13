package edu.design.command.test1.code1;

public class Button {
	private Lamp theLamp;

	public Button(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	public void pressed() {
		theLamp.turnOn();
	}
}
