package edu.design.abstractfactory.test1.code3;

import edu.design.abstractfactory.test1.code1.Door;
import edu.design.abstractfactory.test1.code1.HyundaiDoor;
import edu.design.abstractfactory.test1.code1.HyundaiMotor;
import edu.design.abstractfactory.test1.code1.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory {
    public Motor createMotor() {
        return new HyundaiMotor();
    }
    public Door createDoor() {
        return new HyundaiDoor();
    }
}
