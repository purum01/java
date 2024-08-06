package edu.design.composit.test2;

import java.util.ArrayList;
import java.util.List;

interface Graphic {
	void draw();
}

class Circle implements Graphic {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

class Square implements Graphic {
	@Override
	public void draw() {
		System.out.println("Drawing a Square");
	}
}

class CompositeGraphic implements Graphic {
	private List<Graphic> graphics = new ArrayList<>();

	public void add(Graphic graphic) {
		graphics.add(graphic);
	}

	public void remove(Graphic graphic) {
		graphics.remove(graphic);
	}

	@Override
	public void draw() {
		for (Graphic graphic : graphics) {
			graphic.draw();
		}
	}
}

public class CompositDemo1 {
	public static void main(String[] args) {
		// Create individual graphics
		Graphic circle1 = new Circle();
		Graphic circle2 = new Circle();
		Graphic square1 = new Square();

		// Create composite graphic
		CompositeGraphic compositeGraphic = new CompositeGraphic();
		compositeGraphic.add(circle1);
		compositeGraphic.add(circle2);
		compositeGraphic.add(square1);

		// Draw all graphics
		compositeGraphic.draw();
	}
}
