package edu.design.command.test1.code3;

public class Button {
	private Lamp theLamp;
	private Alarm theAlarm;
	private Mode theMode;

	public Button(Lamp theLamp, Alarm theAlarm) {
		this.theLamp = theLamp;
		this.theAlarm = theAlarm;
	}

	public void setMode(Mode mode) {
		this.theMode = mode;
	}

	public void pressed() {
		switch (theMode) {
		case LAMP:
			theLamp.turnOn();
			break;
		case ALARM:
			theAlarm.start();
			break;
		}
	}
}
