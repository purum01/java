package edu.design.templatemethod.test2;

abstract class Game {
	// Template method
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}

	protected abstract void initialize();

	protected abstract void startPlay();

	protected abstract void endPlay();
}

class Football extends Game {
	@Override
	protected void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	@Override
	protected void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");
	}

	@Override
	protected void endPlay() {
		System.out.println("Football Game Finished!");
	}
}

class Cricket extends Game {
	@Override
	protected void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	@Override
	protected void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}

	@Override
	protected void endPlay() {
		System.out.println("Cricket Game Finished!");
	}
}

public class TemplateMethodDemo {
	public static void main(String[] args) {
		Game game = new Football();
		game.play(); // Output the sequence of methods for Football

		System.out.println();

		game = new Cricket();
		game.play(); // Output the sequence of methods for Cricket
	}
}
