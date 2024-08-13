package edu.design.abstractfactory.test1.code4;

import edu.design.abstractfactory.test1.code1.Direction;
import edu.design.abstractfactory.test1.code1.Door;
import edu.design.abstractfactory.test1.code1.Motor;
import edu.design.abstractfactory.test1.code3.ElevatorFactory;
import edu.design.abstractfactory.test1.code3.HyundaiElevatorFactory;
import edu.design.abstractfactory.test1.code3.LGElevatorFactory;

public class Client {
    public static void main(String[] args) {
        ElevatorFactory factory = null;
        String vendorName = args[0];
        if (vendorName.equalsIgnoreCase("LG")) {
            factory = new LGElevatorFactory();
        } else if (vendorName.equalsIgnoreCase("Samsung")) {
            factory = new SamsungElevatorFactory();
        } else {
            factory = new HyundaiElevatorFactory();
        }
        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);

        door.open();
        motor.move(Direction.UP);
    }
}

