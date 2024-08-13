package edu.design.abstractfactory.test1.code3;

import edu.design.abstractfactory.test1.code1.Door;
import edu.design.abstractfactory.test1.code1.Motor;

public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
}