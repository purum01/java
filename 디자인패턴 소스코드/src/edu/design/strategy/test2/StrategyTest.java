package edu.design.strategy.test2;


interface FortuneCookies {
	public void print();
}

class Five implements FortuneCookies {
	public void print() {
		System.out.println("5가 나왔으니 난 숙제를 해야지");
	}
}

class Two implements FortuneCookies {
	public void print() {
		System.out.println("2가 나왔으니 난 TV를 봐야지");
	}
}

class Null implements FortuneCookies {
	public void print() {
		System.out.println("난 아무것도 하지 않을꺼야");
	}
}

class Dice {
	public int throwIt() {
		return (int) (Math.random() * 6) + 1;
	}
}

class Player {
	private FortuneCookies fc;

	public void setFortuneCookies(FortuneCookies fc) {
		this.fc = fc;
	}

	public void play() {
		fc.print();
	}
}

class StrategyTest {
	static void goodFortune() {
		int luckyNum = new Dice().throwIt();
		Player p = new Player();
		switch (luckyNum) {
		case 2:
			p.setFortuneCookies(new Two());
			break;
		case 5:
			p.setFortuneCookies(new Five());
			break;
		default:
			p.setFortuneCookies(new Null());
		}
		p.play();
	}

	public static void main(String[] args) {
		goodFortune();
	}
}
