package edu.exercise.answer05.prob02;

public class LoanAccount extends Account implements LoanPossible {

	public LoanAccount(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public void lend(double amount) {
		balance -= amount;
		if (balance < 0) {
			balance += balance * 0.1;
		}
	}
}