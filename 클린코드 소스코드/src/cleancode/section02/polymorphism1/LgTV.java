package cleancode.section02.polymorphism1;

public class LgTV {
	public LgTV() {
		System.out.println("===> LgTV 생성");
	}
	public void turnOn() {
		System.out.println("LgTV---전원을 켠다.");
	}
	public void turnOff() {
		System.out.println("LgTV---전원을 끈다.");
	}
	public void soundUp() {
		System.out.println("LgTV---소리를 올린다.");
	}
	public void soundDown() {
		System.out.println("LgTV---소리를 내린다.");
	}
}
