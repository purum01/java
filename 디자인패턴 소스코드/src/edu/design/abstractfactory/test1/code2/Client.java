package edu.design.abstractfactory.test1.code2;

import edu.design.abstractfactory.test1.code1.Direction;
import edu.design.abstractfactory.test1.code1.Door;
import edu.design.abstractfactory.test1.code1.Motor;

public class Client {

    public static void main(String[] args) {
        Door lgDoor = DoorFactory.createDoor(VendorID.LG);
        Motor lgMotor = MotorFactory.createMotor(VendorID.LG);
        lgMotor.setDoor(lgDoor);

        lgDoor.open();
        lgMotor.move(Direction.UP);
    }
}

