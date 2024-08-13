package edu.design.abstractfactory.test1.code2;

import edu.design.abstractfactory.test1.code1.Door;
import edu.design.abstractfactory.test1.code1.HyundaiDoor;
import edu.design.abstractfactory.test1.code1.LGDoor;

public class DoorFactory { // 팩토리 메서드 패턴을 사용함
	// venderID에 따라 LGDoor 또는 HyundaiDoor 객체를 생성함
	public static Door createDoor(VendorID vendorID) {
		Door door = null;
		switch (vendorID) {
		case LG:
			door = new LGDoor();
			break;
		case HYUNDAI:
			door = new HyundaiDoor();
			break;
		}
		return door;
	}

}
