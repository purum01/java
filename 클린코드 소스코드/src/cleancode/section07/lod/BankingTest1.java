package cleancode.section07.lod;

import java.util.HashMap;
import java.util.Map;

class Bank {
	public Map<String, Integer> safe;

	public Bank() {
		safe = new HashMap<String, Integer>();
	}

	public void makeAccount(String customerCode, int currentMoney) {
		safe.put(customerCode, currentMoney);
	}
}

class BankTeller {
	public Bank bank;

	public BankTeller() {
		bank = new Bank();
	}

	public void makeAccount(String customerCode, int currentMoney) {
		bank.makeAccount(customerCode, currentMoney);
	}
}

class Customer {
	public String customerCode;
	public int currentMoney;
	public BankTeller teller;

	public Customer(String customerCode, int currentMoney) {
		teller = new BankTeller();
		this.currentMoney = currentMoney;
		this.customerCode = customerCode;
	}

	public int withdrawal(int money) {
		int deposit = teller.bank.safe.get(customerCode);
		teller.bank.safe.put(customerCode, deposit - money);
		return deposit - money;
	}

	public int deposit(int money) {
		int deposit = teller.bank.safe.get(customerCode);
		teller.bank.safe.put(customerCode, deposit + money);
		return deposit + money;
	}
	
	public void makeAccount() {
		teller.makeAccount(customerCode, currentMoney);
	}
}

public class BankingTest1 {
	public static void main(String[] args) {
		Customer kim = new Customer("CUST-A0001", 1000);
		kim.makeAccount();
		
		System.out.println("입금 후 잔액 : " + kim.deposit(10));
		System.out.println("출금 후 잔액 : " + kim.withdrawal(20));
	}
}