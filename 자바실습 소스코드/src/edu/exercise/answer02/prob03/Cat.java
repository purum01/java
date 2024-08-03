package edu.exercise.answer02.prob03;

public class Cat extends Animal implements Pet {
	private String name;

	public Cat(String name) {
		super(4);
		this.name = name;
	}

	public Cat() {
		this("");
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void play() {
		System.out.println(name + " likes to play with string.");
	}

	@Override
	public void eat() {
		System.out.println("Cats like to eat spiders and mice.");
	}
}
