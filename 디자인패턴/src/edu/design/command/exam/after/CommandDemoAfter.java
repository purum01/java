package edu.design.command.exam.after;

public class CommandDemoAfter {
	public static void main(String[] args) {
		MagicButton magicButton = new MagicButton();
		
		Light light = new Light();
		testMagicButton(magicButton, new LightOnCommand(light), new LightOffCommand(light));
		
		Door door = new Door();
		testMagicButton(magicButton, new DoorOpenCommand(door), new DoorCloseCommand(door));				
		
	}	
	public static void testMagicButton(MagicButton mButton, Command upCommand, Command downCommand) {
		mButton.setCommand(upCommand, downCommand);
		mButton.pressUpButton();
		mButton.pressDownButton();		
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

interface Command {
	public abstract void execute();
}

class LightOnCommand implements Command {
	private Light myLight;
	public LightOnCommand(Light myLight) {
		this.myLight = myLight;
	}
	public void execute() {
		myLight.turnOn();
	}
}

class LightOffCommand implements Command {
	private Light myLight;
	public LightOffCommand(Light myLight) {
		this.myLight = myLight;
	}
	public void execute() {
		myLight.turnOff();
	}
}

class DoorOpenCommand implements Command {
	private Door myDoor;
	public DoorOpenCommand(Door myDoor) {
		this.myDoor = myDoor;
	}
	public void execute() {
		myDoor.openDoor();
	}
}

class DoorCloseCommand implements Command {
	private Door myDoor;
	public DoorCloseCommand(Door myDoor) {
		this.myDoor = myDoor;
	}
	public void execute() {
		myDoor.closeDoor();
	}
}

class MagicButton {
	private Command UpCommand, DownCommand;
	public MagicButton() {}	
	public void setCommand(Command Up, Command Down) {
		UpCommand = Up;
		DownCommand = Down;
	}		
	void pressUpButton() {
		UpCommand.execute();
	}
	void pressDownButton() {
		DownCommand.execute();
	}
}
//public class CommandDemoAfter {
//	public static void main(String[] args) {
//		MagicButton magicButton = new MagicButton();
//		
//		Light light = new Light();
//		testMagicButton(magicButton, new LightOnCommand(light), new LightOffCommand(light));
//		
//		Door door = new Door();
//		testMagicButton(magicButton, new DoorOpenCommand(door), new DoorCloseCommand(door));
//				
//		ElectricFan fan = new ElectricFan();
//		testMagicButton(magicButton, new ElectricFanOnCommand(fan), new ElectricFanOffCommand(fan));		
//	}
//	
//	public static void testMagicButton(MagicButton mButton, Command upCommand, Command downCommand) {
//		mButton.setCommand(upCommand, downCommand);
//		mButton.pressUpButton(); // 위쪽의 버튼을 누른다.
//		mButton.pressDownButton(); // 아래쪽의 버튼을 누른다.		
//	}
//	
//}
//
//interface Command {
//	public abstract void execute();
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
//class ElectricFan {
//	public void switchOn() {
//		System.out.println("선풍기를 킨다.");
//	}
//	
//	public void switchOff() {
//		System.out.println("선풍기를 끈다.");
//	}
//}
//
//class MagicButton {
//	private Command UpCommand, DownCommand;
//
//	public MagicButton() {
//		
//	}
//	
//	public MagicButton(Command Up, Command Down) {
//		setCommand(Up, Down);		
//	}
//	
//	public void setCommand(Command Up, Command Down) {
//		UpCommand = Up;
//		DownCommand = Down;
//	}		
//
//	void pressUpButton() {
//		UpCommand.execute();
//
//	}
//
//	void pressDownButton() {
//		DownCommand.execute();
//	}
//}
//
//class LightOnCommand implements Command {
//	private Light myLight;
//
//	public LightOnCommand(Light myLight) {
//		this.myLight = myLight;
//	}
//
//	public void execute() {
//		myLight.turnOn();
//	}
//}
//
//class LightOffCommand implements Command {
//	private Light myLight;
//
//	public LightOffCommand(Light myLight) {
//		this.myLight = myLight;
//	}
//
//	public void execute() {
//		myLight.turnOff();
//	}
//}
//
//class DoorOpenCommand implements Command {
//	private Door myDoor;
//
//	public DoorOpenCommand(Door myDoor) {
//		this.myDoor = myDoor;
//	}
//
//	public void execute() {
//		myDoor.openDoor();
//	}
//}
//
//class DoorCloseCommand implements Command {
//	private Door myDoor;
//
//	public DoorCloseCommand(Door myDoor) {
//		this.myDoor = myDoor;
//	}
//
//	public void execute() {
//		myDoor.closeDoor();
//	}
//}
//
//class ElectricFanOnCommand implements Command {
//	private ElectricFan myFan;
//
//	public ElectricFanOnCommand(ElectricFan myFan) {
//		this.myFan = myFan;
//	}
//
//	public void execute() {
//		myFan.switchOn();
//	}
//}
//
//class ElectricFanOffCommand implements Command {
//	private ElectricFan myFan;
//
//	public ElectricFanOffCommand(ElectricFan myFan) {
//		this.myFan = myFan;
//	}
//
//	public void execute() {
//		myFan.switchOff();
//	}
//}
