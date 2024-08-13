package edu.design.templatemethod.test1.code2;

import edu.design.factorymethod.test1.code1.Direction;
import edu.design.templatemethod.test1.code1.Door;
import edu.design.templatemethod.test1.code1.DoorStatus;
import edu.design.templatemethod.test1.code1.MotorStatus;

public class LGMotor {
    private Door door;
    private MotorStatus motorStatus;

    public LGMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    private void moveLGMotor(Direction direction) {
        // LG Motor를 구동시킴
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;
        
        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) door.close();
        
        moveLGMotor(direction); // move 메서드는 이 문장을 제외하면 HyundaiMotor와 동일함
        setMotorStatus(MotorStatus.MOVING);
    }
}
