package edu.design.factorymethod.test1.code1;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private ThroughputScheduler scheduler;

	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(1);
			controllers.add(controller);
		}
		scheduler = new ThroughputScheduler();
	}

	void requestElevator(int destination, Direction direction) {
		// ThroughputScheduler를 이용해서 엘리베이터를 선택함
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination); // 선택된 엘리베이터를 이동 시킴
	}
}

