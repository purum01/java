package edu.design.decorator.test1.code1;

public class RoadDisplayWithLane extends RoadDisplay { // 기본 도로 표시 + 차선 표시 클래스
	public void draw() {
		super.draw(); // 상위 클래스 즉 RoadDisplay의 draw 메서드를 호출해서 기본 도로를 표시
		drawLane();
	}

	private void drawLane() {
		System.out.println("차선 표시");
	}
}