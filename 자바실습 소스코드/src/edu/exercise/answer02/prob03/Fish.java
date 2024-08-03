package edu.exercise.answer02.prob03;

public class Fish extends Animal implements Pet {
	private String name;

	public Fish() {
		super(0);
		this.name = "Fish";
	}

	public Fish(String name) {
		super(0);
		this.name = name;
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
		System.out.println(name + " swim in their tanks all day.");
	}

	@Override
	public void walk() {
		super.walk();
		System.out.println("Fish, of course, can't walk; they swim.");
	}

	@Override
	public void eat() {
		System.out.println("Fish eat pond scum.");
	}
}
