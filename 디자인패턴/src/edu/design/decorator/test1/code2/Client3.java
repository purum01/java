package edu.design.decorator.test1.code2;

public class Client3 {
	public static void main(String[] args) {
		Display roadWithLaneAndTraffic = new LaneDecorator(
				new TrafficDecorator(new CrossingDecorator(new RoadDisplay())));
		roadWithLaneAndTraffic.draw();
	}
}
