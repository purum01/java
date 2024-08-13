package edu.design.abstractfactory.test1.code4;

import edu.design.abstractfactory.test1.code1.Direction;
import edu.design.abstractfactory.test1.code1.Motor;

public class SamsungMotor extends Motor {
    protected void moveMotor(Direction direction) {
        System.out.println("move Samsung Motor");
    }
}
