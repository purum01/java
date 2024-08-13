package edu.design.composit.test1.code3;

public class Client {
	public static void main(String[] args) {
		

		// 컴퓨터의 부품으로서 Body, Keyboard, Monitor 객체를 생성함
		Body body = new Body(100, 70);
		Keyboard keyboard = new Keyboard(5, 2);
		Monitor monitor = new Monitor(20, 30);

		// Computer 객체를 생성하고 부품 객체들을 설정함
		Computer computer = new Computer();
		computer.addComponent(body);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);
		
		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();
		System.out.println("Computer Power: " + computerPower + " W");
		System.out.println("Computer Price: " + computerPrice + " 만원");
	}
}
