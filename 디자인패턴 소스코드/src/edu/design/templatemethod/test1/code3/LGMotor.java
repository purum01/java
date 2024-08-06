package edu.design.templatemethod.test1.code3;

import edu.design.templatemethod.test1.code1.Direction;
import edu.design.templatemethod.test1.code1.Door;
import edu.design.templatemethod.test1.code1.DoorStatus;
import edu.design.templatemethod.test1.code1.MotorStatus;

public class LGMotor extends Motor {
    public LGMotor(Door door) {
        super(door);
    }

    private void moveLGMotor(Direction direction) {
        // LG Motor를 구동시킨다.
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) return;
        
        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED)
            door.close();
        
        moveLGMotor(direction); // move 메서드는 이 구문을 제외하면 HyundaiMotor와 동일함

        setMotorStatus(MotorStatus.MOVING);
    }
}
