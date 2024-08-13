package edu.design.factorymethod.test1.code3;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyID;

	public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
		controllers = new ArrayList<ElevatorController>(controllerCount);
		
		for (int i = 0; i < controllerCount; i++) {
			ElevatorController controller = new ElevatorController(i+1);
			controllers.add(controller);
		}
		this.strategyID = strategyID;
	}
	
	public void setStrategyID(SchedulingStrategyID strategyID) {
		this.strategyID = strategyID;
	}

	void requestElevator(int destination, Direction direction) {
		// 주어진 전략 ID에 해당하는 ElevatorScheduler를 사용
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
		System.out.println(scheduler);
		int selectedElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectedElevator).gotoFloor(destination); // 선택된 엘리베이터를 이동 시킴
	}
}

