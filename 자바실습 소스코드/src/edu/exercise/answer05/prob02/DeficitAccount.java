package edu.exercise.answer05.prob02;

public class DeficitAccount extends Account {

	public DeficitAccount(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}