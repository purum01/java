package edu.design.decorator.test1.code2;

//다양한 추가 기능에 대한 공통 클래스
public class DisplayDecorator extends Display {
	private Display decoratedDisplay;

	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}

	public void draw() {
		decoratedDisplay.draw();
	}
}