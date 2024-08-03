package edu.exercise.answer05.prob02;

public abstract class Account {
	protected String accountNumber;
	protected double balance;

	public Account(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public abstract void withdraw(double amount) throws BalanceInsufficientException;

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void printBalanceInfo() {
		System.out.println("계좌번호:" + accountNumber);
		System.out.println("현재잔액:" + balance + "원");
	}
}