package edu.design.abstractfactory.test1.code2;

import edu.design.abstractfactory.test1.code1.HyundaiMotor;
import edu.design.abstractfactory.test1.code1.LGMotor;
import edu.design.abstractfactory.test1.code1.Motor;

public class MotorFactory {
	public static Motor createMotor(VendorID vendorID) {
		Motor motor = null;
		switch (vendorID) {
		case LG:
			motor = new LGMotor();
			break;
		case HYUNDAI:
			motor = new HyundaiMotor();
			break;
		}
		return motor;
	}
}
