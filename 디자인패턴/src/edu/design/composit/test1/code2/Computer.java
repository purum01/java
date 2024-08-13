package edu.design.composit.test1.code2;

import edu.design.composit.test1.code1.Body;
import edu.design.composit.test1.code1.Keyboard;
import edu.design.composit.test1.code1.Monitor;

public class Computer {
	private Body body;
	private Keyboard keyboard;
	private Monitor monitor;
	private Speaker speaker;

	public void addBody(Body body) {
		this.body = body;
	}

	public void addKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public void addMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void addSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public int getPrice() {
		int bodyPrice = body.getPrice();
		int keyboardPrice = keyboard.getPrice();
		int monitorPrice = monitor.getPrice();
		int speakerPrice = speaker.getPrice();
		return bodyPrice + keyboardPrice + monitorPrice + speakerPrice;
	}

	public int getPower() {
		int bodyPower = body.getPower();
		int keyboardPower = keyboard.getPower();
		int monitorPower = monitor.getPower();
		int speakerPower = speaker.getPower();
		return bodyPower + keyboardPower + monitorPower + speakerPower;
	}
}
