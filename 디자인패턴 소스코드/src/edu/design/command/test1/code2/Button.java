package edu.design.command.test1.code2;

public class Button {
	private Alarm theAlarm;

	public Button(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}

	public void pressed() {
		theAlarm.start();
	}
}
