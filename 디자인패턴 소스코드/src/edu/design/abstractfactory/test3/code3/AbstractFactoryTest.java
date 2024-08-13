package edu.design.abstractfactory.test3.code3;

class Robot {
	private Head head;
	private Body body;
	private Leg leg;
	private Arm arm;

	public void addHead(Head head) {
		this.head = head;
	}
	public void addBody(Body body) {
		this.body = body;
	}
	public void addLeg(Leg leg) {
		this.leg = leg;
	}
	public void addArm(Arm arm) {
		this.arm = arm;
	}
	public void displayRobot() {
		System.out.println("완성된 로봇은 다음과 같은 기능을 가지고 있습니다.");
		head.display();
		body.display();
		arm.display();
		leg.display();
	}
}

/*추상적인 부품들 정의*/
abstract class Head {
	abstract public void display();
}
abstract class Leg {
	abstract public void display();
}
abstract class Body {
	abstract public void display();
}
abstract class Arm {
	abstract public void display();
}

/*구체적인 부품들(가정용 로봇)*/
class CircleHead extends Head {
	public void display() {
		System.out.println("둥근 타입의 머리를 가졌습니다.");
	}
}
class WheelLeg extends Leg {
	public void display() {
		System.out.println("바퀴 타입의 다리를 가졌습니다.");
	}
}
class LCDBody extends Body {
	public void display() {
		System.out.println("몸통에는 LCD 화면을 가지고 있습니다.");
	}
}
class FingerArm extends Arm {
	public void display() {
		System.out.println("손가락 팔을 가지고 있습니다. ");
	}
}

/*구체적인 부품들(전투용 로봇)*/
class HelmatHead extends Head {
	public void display() {
		System.out.println("헬멧을 착용한  머리를 가졌습니다.");
	}
}
class ChainLeg extends Leg {
	public void display() {
		System.out.println("체인 타입의  다리를 가졌습니다.");
	}
}
class MissileBody extends Body {
	public void display() {
		System.out.println("몸통은 미사일 발사가 가능한  형태입니다. ");
	}
}
class GunArm extends Arm {
	public void display() {
		System.out.println("기관총 팔을 가지고 있습니다. ");
	}
}

/*공장 기능의 클래스*/
abstract class RobotFactory {
	abstract public Head createHead();
	abstract public Body createBody();
	abstract public Leg createLeg();
	abstract public Arm createArm();
}

/*가정용 로봇 공장*/
class HomeRobotFactory extends RobotFactory {
	public Head createHead() {
		return new CircleHead();
	}
	public Body createBody() {
		return new LCDBody();
	}
	public Leg createLeg() {
		return new WheelLeg();
	}
	public Arm createArm() {
		return new FingerArm();
	}
}

/*전투용 로봇 공장*/
class BattleRobotFactory extends RobotFactory {
	public Head createHead() {
		return new HelmatHead();
	}
	public Body createBody() {
		return new MissileBody();
	}
	public Leg createLeg() {
		return new ChainLeg();
	}
	public Arm createArm() {
		return new GunArm();
	}
}

public class AbstractFactoryTest {
	public static void main(String[] args) {
		System.out.println("\n================ 가정용 로봇 생산 ================\n");
		RobotFactory homeFactory = new HomeRobotFactory();
		Robot robot = makeRobot(homeFactory);
		robot.displayRobot();
		
		
		System.out.println("\n================ 전투용 로봇 생산 ================\n");
		RobotFactory battleFactory = new BattleRobotFactory();
		robot = makeRobot(battleFactory);

		robot.displayRobot();
	}
	
	public static Robot makeRobot(RobotFactory factory){
		Robot robot = new Robot();
		robot.addHead(factory.createHead());
		robot.addBody(factory.createBody());
		robot.addLeg(factory.createLeg());
		robot.addArm(factory.createArm());
		return robot;
	}
}
