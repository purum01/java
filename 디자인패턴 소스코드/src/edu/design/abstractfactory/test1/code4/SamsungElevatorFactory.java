package edu.design.abstractfactory.test1.code4;

import edu.design.abstractfactory.test1.code1.Door;
import edu.design.abstractfactory.test1.code1.Motor;
import edu.design.abstractfactory.test1.code3.ElevatorFactory;

public class SamsungElevatorFactory extends ElevatorFactory {
    public Motor createMotor() {
        return new SamsungMotor();
    }
    public Door createDoor() {
        return new SamsungDoor();
    }
}
