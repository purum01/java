package edu.exercise.answer05.prob02;

public interface LoanPossible {
	void lend(double amount) throws BalanceInsufficientException;
}