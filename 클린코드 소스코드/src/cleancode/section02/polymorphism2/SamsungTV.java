package cleancode.section02.polymorphism2;

public class SamsungTV extends TV {
	public SamsungTV() {
		System.out.println("===> SamsungTV 생성");
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원을 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---전원을 끈다.");
	}
	public void volumeUp() {
		System.out.println("SamsungTV---소리를 올린다.");
	}
	public void volumeDown() {
		System.out.println("SamsungTV---소리를 내린다.");
	}
}
