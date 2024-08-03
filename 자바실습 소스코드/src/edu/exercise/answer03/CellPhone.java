package edu.exercise.answer03;

public class CellPhone {
	private String model; // 핸드폰 모델 번호
	private double battery; // 남은 배터리 양

	// 모델 번호를 인자로 받는 생성자
	public CellPhone(String model) {
		this.model = model;
		this.battery = 0.0; // 초기 배터리 양을 100으로 설정
	}

	// 통화 시간(분)을 출력하고, 통화 시간에 따라 배터리 양을 감소시킨다.
	public void call(int time) {
		if (time < 0) {
			System.out.println("통화시간입력오류");
			return;
		}
		double batteryUsage = time * 0.5;
		battery -= batteryUsage;
		if (battery < 0) {
			battery = 0;
		}
		System.out.println("통화 시간: " + time + "분");
	}

	// 충전한 시간(분)을 출력하고, 충전한 시간에 따라 배터리 양을 증가시킨다.
	public void charge(int time) {
		if (time < 0) {
			System.out.println("충전시간입력오류");
			return;
		}
		double batteryCharge = time * 3;
		battery += batteryCharge;
		if (battery > 100) {
			battery = 100;
		}
		System.out.println("충전 시간: " + time + "분");
	}

	// 남은 배터리 양을 출력한다.
	public void printBattery() {
		System.out.println("남은 배터리 양: " + battery );
	}

	// Object 타입의 객체를 입력받고, 입력받은 객체가 CellPhone 타입의 클래스이면서 모델 번호가 같은 경우에 true를 리턴한다.
	@Override
	public boolean equals(Object otherObject) {
		if (this == otherObject) {
			return true;
		}
		if (otherObject == null || getClass() != otherObject.getClass()) {
			return false;
		}
		CellPhone otherPhone = (CellPhone) otherObject;
		return model.equals(otherPhone.model);
	}

}
