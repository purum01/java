package edu.design.abstractfactory.test1.code3;

import edu.design.abstractfactory.test1.code1.Door;
import edu.design.abstractfactory.test1.code1.LGDoor;
import edu.design.abstractfactory.test1.code1.LGMotor;
import edu.design.abstractfactory.test1.code1.Motor;

public class LGElevatorFactory extends ElevatorFactory {
    public Motor createMotor() {
        return new LGMotor();
    }
    public Door createDoor() {
        return new LGDoor();
    }
}