package edu.design.command.test1.code2;

public class Client {
	public static void main(String[] args) {
		Alarm alarm = new Alarm();
		Button alarmButton = new Button(alarm);
		alarmButton.pressed();
	}
}
