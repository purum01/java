package edu.design.state.test1.before1;

class Light {
	private static int ON = 0;// 형광등이 켜진 상태
	private static int OFF = 1;// 형광등이 꺼진 상태
	private int state; // 형광등의 현재 상태

	public Light() {
		state = OFF;
	}

	public void on_button_pushed() {
		if (state == ON) {
			System.out.println("반응 없음");
		} else { // 형광등이 꺼져 있을 때 On 버튼을 누르면 켜진 상태로 전환됨
			System.out.println("Light On");
			state = ON;
		}
	}

	public void off_button_pushed() {
		if (state == OFF) {
			System.out.println("반응 없음");
		} else {// 형광등이 켜져 있을 때 Off 버튼을 누르면 꺼진 상태로 전환됨
			System.out.println("Light Off");
			state = OFF;
		}
	}
}

public class Client {
	public static void main(String[] args) {
		Light light = new Light();
		light.off_button_pushed();// 반응없음
		light.on_button_pushed();
		light.off_button_pushed();
	}
}
