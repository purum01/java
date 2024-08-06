package edu.design.singleton.exam;

import java.util.ArrayList;
import java.util.List;

public class Logger {
	// 인스턴스를 저장하는 변수 선언
	private static Logger instance;

	// 로그 메시지를 저장할 리스트 선언
	private List<String> logs;

	// 1. private 생성자를 정의하여 외부에서 인스턴스를 생성하지 못하도록 합니다.
	private Logger() {
		// 로그 리스트 초기화
		logs = new ArrayList<>();
	}

	// 2. getInstance() 메소드를 통해 인스턴스를 반환합니다.
	public static synchronized Logger getInstance() {
		// 인스턴스가 null인지 확인하고, null이면 새 인스턴스를 생성합니다.
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	// 3. 로그 메시지를 기록하는 메소드
	public void log(String message) {
		// 로그 메시지를 리스트에 추가합니다.
		logs.add(message);
	}

	// 4. 로그 메시지를 출력하는 메소드
	public void printLogs() {
		// 리스트의 각 로그 메시지를 출력합니다.
		for (String log : logs) {
			System.out.println(log);
		}
	}
}
