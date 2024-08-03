package edu.exercise.answer05.prob01;

public class CellPhone {
	// Fields
	private String model; // 핸드폰 모델 번호
	private double battery; // 남은 배터리 양

	// Constructor
	public CellPhone(String model) {
		this.model = model;
		this.battery = 0; // 초기 배터리 양을 100으로 설정
	}

	// Methods
	public void call(int time) {
		if (time < 0) {
			throw new IllegalArgumentException("통화시간입력오류");
		}
		double batteryUsage = time * 0.5;
		battery -= batteryUsage;
		if (battery < 0) {
			battery = 0;
		}
		System.out.println("통화 시간: " + time + "분");
	}

	public void charge(int time) {
		if (time < 0) {
			throw new IllegalArgumentException("충전시간입력오류");
		}
		double batteryCharge = time * 3;
		battery += batteryCharge;
		if (battery > 100) {
			battery = 100;
		}
		System.out.println("충전 시간: " + time + "분");
	}

	public void printBattery() {
		System.out.println("남은 배터리 양: " + battery);
	}

	@Override
	public boolean equals(Object otherObject) {
		if (this == otherObject) {
			return true;
		}
		if (otherObject == null || getClass() != otherObject.getClass()) {
			return false;
		}
		CellPhone otherPhone = (CellPhone) otherObject;
		return this.model.equals(otherPhone.model);
	}

	// Optional: Override toString method for better representation
	@Override
	public String toString() {
		return "CellPhone{" + "model='" + model + '\'' + ", battery=" + battery + '}';
	}

}
