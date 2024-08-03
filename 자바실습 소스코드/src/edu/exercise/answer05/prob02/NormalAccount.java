package edu.exercise.answer05.prob02;

public class NormalAccount extends Account {

	public NormalAccount(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
	}

	@Override
	public void withdraw(double amount) throws BalanceInsufficientException {
		if (balance - amount < 0) {
			throw new BalanceInsufficientException("잔액이 부족합니다.");
		}
		balance -= amount;
	}
}
