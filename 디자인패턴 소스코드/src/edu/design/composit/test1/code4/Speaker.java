package edu.design.composit.test1.code4;

import edu.design.composit.test1.code3.ComputerDevice;

public class Speaker extends ComputerDevice {
	private int price;
	private int power;

	public Speaker(int power, int price) {
		this.power = power;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public int getPower() {
		return power;
	}
}