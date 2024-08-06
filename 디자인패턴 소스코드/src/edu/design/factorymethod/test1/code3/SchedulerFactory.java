package edu.design.factorymethod.test1.code3;

import java.util.Calendar;

enum SchedulingStrategyID {
	RESPONSE_TIME, THROUGHPUT, DYNAMIC
}

public class SchedulerFactory {
	public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
		ElevatorScheduler scheduler = null;
		switch (strategyID) {
		case RESPONSE_TIME:
			scheduler = new ResponseTimeScheduler();
			break;
		case THROUGHPUT:
			scheduler = new ThroughputScheduler();
			break;
		case DYNAMIC: {
			// 오전에는 대기 시간 최소화 전략, 오후에는 처리량 최적화 전략
			int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			if (hour < 12) // 오전
				scheduler = new ResponseTimeScheduler();
			else // 오후
				scheduler = new ThroughputScheduler();
			break;
		}
		}
		return scheduler;
	}
}
