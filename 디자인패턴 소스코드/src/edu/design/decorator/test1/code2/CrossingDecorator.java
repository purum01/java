package edu.design.decorator.test1.code2;

public class CrossingDecorator extends DisplayDecorator {
	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	public void draw() {
		super.draw();
		drawCrossing();
	}

	private void drawCrossing() {
		System.out.println("\t횡단보도 표시");
	}
}