package edu.design.command.exam.before;

public class CommandDemoBefore {
	public static void main(String[] args) {
		MagicButton magicButton = new MagicButton();
		
		magicButton.setButtonType(0); 
		magicButton.pressUpButton();
		magicButton.pressDownButton();
		
		magicButton.setButtonType(1); 
		magicButton.pressUpButton();
		magicButton.pressDownButton();		
	}	
}

class MagicButton {
	private int buttonType; // 0은 Light, 1은 Door
	private Light myLight;
	private Door myDoor;
		
	public MagicButton() {
		myLight = new Light();
		myDoor = new Door();				
		buttonType = 0;
	}
		
	public void setButtonType(int buttonType) {
		this.buttonType = buttonType;
	}
	
	public void pressUpButton() {
		if (buttonType == 0) {
			myLight.turnOn();
		} else if ( buttonType == 1) {
			myDoor.openDoor();
		}
	}
	
	public void pressDownButton() {
		if (buttonType == 0) {
			myLight.turnOff();
		} else if ( buttonType == 1) {
			myDoor.closeDoor();
		}		
	}	
}

class Door {
	public void openDoor() {
		System.out.println("문을 연다.");
	}	
	public void closeDoor() {
		System.out.println("문을 닫는다.");
	}
}

class Light {
	public void turnOn() {
		System.out.println("불을 킨다.");
	}	
	public void turnOff() {
		System.out.println("불을 끈다.");
	}
}

//public class CommandDemoBefore {
//	public static void main(String[] args) {
//		MagicButton magicButton = new MagicButton();
//		
//		magicButton.setButtonType(0); 
//		magicButton.pressUpButton(); // 불을 킨다.
//		magicButton.pressDownButton(); // 불을 끈다.
//		
//		magicButton.setButtonType(1); 
//		magicButton.pressUpButton(); // 문을 연다.
//		magicButton.pressDownButton(); // 문을 닫는다.
//		
//		magicButton.setButtonType(2); 
//		magicButton.pressUpButton(); // 선풍기를 튼다.
//		magicButton.pressDownButton(); // 선풍기를 끈다.	
//			
//	}
//	
//}
//
//class MagicButton {
//	private int buttonType; // 0은 Light, 1은 Door, 2는 ElectricFan
//	private Light myLight;
//	private Door myDoor;
//	private ElectricFan myElectricFan; 
//	
//	public MagicButton() {
//		myLight = new Light();
//		myDoor = new Door();
//		myElectricFan = new ElectricFan();
//		
//		buttonType = 0;
//	}
//		
//	public void setButtonType(int buttonType) {
//		this.buttonType = buttonType;
//	}
//	
//	public void pressUpButton() {
//		if (buttonType == 0) {
//			myLight.turnOn();
//		} else if ( buttonType == 1) {
//			myDoor.openDoor();
//		} else if ( buttonType == 2) {
//			myElectricFan.switchOn();
//		}		
//	}
//	
//	public void pressDownButton() {
//		if (buttonType == 0) {
//			myLight.turnOff();
//		} else if ( buttonType == 1) {
//			myDoor.closeDoor();
//		} else if ( buttonType == 2) {
//			myElectricFan.switchOff();
//		}			
//	}
//	
//}
//
//class Door {
//	public void openDoor() {
//		System.out.println("문을 연다.");
//	}
//	
//	public void closeDoor() {
//		System.out.println("문을 닫는다.");
//	}
//}
//
//
//class Light {
//	public void turnOn() {
//		System.out.println("불을 킨다.");
//	}
//	
//	public void turnOff() {
//		System.out.println("불을 끈다.");
//	}
//}
//
//
//class ElectricFan {
//	public void switchOn() {
//		System.out.println("선풍기를 킨다.");
//	}
//	
//	public void switchOff() {
//		System.out.println("선풍기를 끈다.");
//	}
//}



