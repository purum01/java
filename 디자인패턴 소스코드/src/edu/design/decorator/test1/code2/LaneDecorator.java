package edu.design.decorator.test1.code2;

public class LaneDecorator extends DisplayDecorator { // 차선표시를 축하는 클래스
	public LaneDecorator(Display decoratedDisplay) { // 기존 표시 클래스의 설정
		super(decoratedDisplay);
	}

	public void draw() {
		super.draw(); // 설정된 기존 표시 기능을 수행
		drawLane(); // 추가적으로 차선을 표시
	}

	private void drawLane() {
		System.out.println("\t차선 표시");
	}
}
