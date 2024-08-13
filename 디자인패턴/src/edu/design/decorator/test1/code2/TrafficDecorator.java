package edu.design.decorator.test1.code2;

public class TrafficDecorator extends DisplayDecorator { // 교통량 표시를 추가하는 클래스
	public TrafficDecorator(Display decoratedDisplay) { // 기존 표시 클래스의 설정
		super(decoratedDisplay);
	}

	public void draw() {
		super.draw(); // 설정된 기존 표시 기능을 수행
		drawTraffic(); // 추가적으로 교통량을 표시
	}

	private void drawTraffic() {
		System.out.println("\t교통량 표시");
	}
}
