package edu.exercise.answer01.prob03;

public class Sparrow {
	private String name;
	private int legs;
	private double length;

	public Sparrow() {
		this.legs = 2; // Sparrows have 2 legs
		this.length = 0.15; // Example length in meters
	}

	public void fly() {
		System.out.println("참새(" + name + ")가 날아다닙니다.");
	}

	public void sing() {
		System.out.println("참새(" + name + ")가 소리내어 웁니다.");
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "참새의 이름은 " + name + " 입니다.";
	}
}
