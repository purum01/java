package edu.design.state.test2;


interface State {
	void increaseCoin(int coin, VendingMachine vm);
	void select(int productId, VendingMachine vm);
}


class NoCoinState implements State {
	@Override
	public void increaseCoin(int coin, VendingMachine vm) {
		System.out.println("Coin inserted: " + coin);
		vm.setState(new SelectableState());
	}

	@Override
	public void select(int productId, VendingMachine vm) {
		System.out.println("Insert coin first.");
	}
}


class SelectableState implements State {
	@Override
	public void increaseCoin(int coin, VendingMachine vm) {
		System.out.println("Additional coin inserted: " + coin);
	}

	@Override
	public void select(int productId, VendingMachine vm) {
		System.out.println("Product selected: " + productId);
		vm.setState(new NoCoinState()); // Change state to NoCoinState after selection
	}
}


class SoldoutState implements State {
	@Override
	public void increaseCoin(int coin, VendingMachine vm) {
		System.out.println("Cannot insert coin. Product is sold out.");
	}

	@Override
	public void select(int productId, VendingMachine vm) {
		System.out.println("Cannot select product. Product is sold out.");
	}
}

//VendingMachine.java
class VendingMachine {
	private State state;

	public VendingMachine() {
		this.state = new NoCoinState(); // Initial state
	}

	public void setState(State state) {
		this.state = state;
	}

	public void insertCoin(int coin) {
		state.increaseCoin(coin, this);
	}

	public void select(int productId) {
		state.select(productId, this);
	}
}

//Main.java
public class StateDemo {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();

		vm.insertCoin(10); // Coin inserted
		vm.select(1); // Product selected

		vm.insertCoin(5); // Coin inserted
		vm.select(2); // Product selected

		// Simulate sold out state
		vm.setState(new SoldoutState());
		vm.insertCoin(10); // Cannot insert coin. Product is sold out.
		vm.select(1); // Cannot select product. Product is sold out.
	}
}
