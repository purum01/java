package edu.exercise.answer01.prob03;

public class Duck {
	private String name;
	private int legs;
	private double length;

	public Duck() {
		this.legs = 2; // Ducks have 2 legs
		this.length = 0.5; // Example length in meters
	}

	public void fly() {
		System.out.println("오리(" + name + ")는 날지 않습니다.");
	}

	public void sing() {
		System.out.println("오리(" + name + ")가 소리내어 웁니다.");
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "오리의 이름은 " + name + " 입니다.";
	}
}
