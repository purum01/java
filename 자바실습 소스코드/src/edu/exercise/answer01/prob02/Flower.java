package edu.exercise.answer01.prob02;

public class Flower {
	private String name;
	private String color;
	private boolean wild;

	// Constructor with all parameters
	public Flower(String name, String color, boolean wild) {
		this.name = name;
		this.color = color;
		this.wild = wild;
	}

	// Constructor with name and color, defaults wild to true
	public Flower(String name, String color) {
		this(name, color, true);
	}

	// Constructor with name only, defaults color to "알지못함" and wild to true
	public Flower(String name) {
		this(name, "알지못함", true);
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public boolean isWild() {
		return wild;
	}
}
