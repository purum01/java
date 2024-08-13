package edu.design.composit.test1.code3;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice {
	// 복수 개의 ComputerDevice를 가리킴
	private List<ComputerDevice> components = new ArrayList<ComputerDevice>();

	// ComputerDevice를 Computer에 추가
	public void addComponent(ComputerDevice component) {
		components.add(component);
	}

	// ComputerDevice를 Computer에서 제거
	public void removeComponent(ComputerDevice component) {
		components.remove(component);
	}

	public int getPrice() {
		int price = 0;
		for (ComputerDevice component : components)
			price += component.getPrice();
		return price;
	}

	public int getPower() {
		int power = 0;
		for (ComputerDevice component : components)
			power += component.getPower();
		return power;
	}
}
