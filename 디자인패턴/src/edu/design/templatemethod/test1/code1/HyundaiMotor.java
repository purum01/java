package edu.design.templatemethod.test1.code1;

public class HyundaiMotor {
	private Door door;
	private MotorStatus motorStatus;

	public HyundaiMotor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED; // 초기에는 멈춘 상태
	}

	private void moveHyundaiMotor(Direction direction) {
		// Hyundai Motor를 구동시킨다.
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return; // 이미 이동 중이면 아무 작업을 하지 않음

		DoorStatus doorStatus = door.getDoorStatus();
		if (doorStatus == DoorStatus.OPENED)
			door.close(); // 만약 문이 열려 있으면 먼저 문을 닫음

		moveHyundaiMotor(direction); // 모터를 주어진 방향으로 이동
		setMotorStatus(MotorStatus.MOVING); // 모터 상태를 이동 중으로 변경함
	}
}
