package edu.design.state.test1.after;

interface State {
	public void on_button_pushed(Light light);
	public void off_button_pushed(Light light);
}

class ON implements State {
	public void on_button_pushed(Light light) {
		System.out.println("반응 없음");

	}
	public void off_button_pushed(Light light) {
		System.out.println("Light Off");
		light.setState(new OFF());
	};
}

class OFF implements State {
	public void on_button_pushed(Light light) {
		System.out.println("Light On");
		light.setState(new ON());
	}
	public void off_button_pushed(Light light) {
		System.out.println("반응 없음");
	}
}

class Light {
	private State state;

	public Light() {
		state = new OFF();
	}

	public void setState(State state) {
		this.state = state;
	}

	public void on_button_pushed() {
		state.on_button_pushed(this);
	}

	public void off_button_pushed() {
		state.off_button_pushed(this);
	}
}

public class Main {
	public static void main(String[] args) {
		Light light = new Light();
		light.off_button_pushed();
		light.on_button_pushed();
		light.off_button_pushed();

	}

}
