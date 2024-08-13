package edu.design.templatemethod.test1.code4;

import edu.design.templatemethod.test1.code1.Direction;
import edu.design.templatemethod.test1.code1.Door;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door);
    }

    protected void moveMotor(Direction direction) {
        // Hyundai Motor를 구동시킨다.
    }
}