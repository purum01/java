//package chapter01.section07.lod;
//
//import java.util.HashMap;
//import java.util.Map;
//
//class Bank {
//	private Map<String, Integer> safe;
//
//	public Bank() {
//		safe = new HashMap<String, Integer>();
//	}
//
//	public int widtrawal(String customerCode, int money) {
//		int balance = safe.get(customerCode) - money;
//		safe.put(customerCode, balance);
//		return balance;
//	}
//
//	public int deposit(String customerCode, int money) {
//		int balance = safe.get(customerCode) + money;
//		safe.put(customerCode, balance);
//		return balance;
//	}
//
//	public void makeAccount(String customerCode, int currentMoney) {
//		safe.put(customerCode, currentMoney);
//	}
//}
//
//class BankTeller {
//	private Bank bank;
//
//	public BankTeller() {
//		bank = new Bank();
//	}
//
//	public int withdrawal(String customerCode, int money) {
//		return bank.widtrawal(customerCode, money);
//	}
//
//	public int deposit(String customerCode, int money) {
//		return bank.deposit(customerCode, money);
//	}
//
//	public void makeAccount(String customerCode, int currentMoney) {
//		bank.makeAccount(customerCode, currentMoney);
//	}
//}
//
//class Customer {
//	private String customerCode;
//	private int currentMoney;
//	private BankTeller teller;
//
//	public Customer(String customerCode, int money) {
//		teller = new BankTeller();
//		this.currentMoney = money;
//		this.customerCode = customerCode;
//	}
//
//	public int withdrawal(int money) {
//		teller.withdrawal(customerCode, money);
//		return currentMoney -= money;
//	}
//
//	public int deposit(int money) {
//		teller.deposit(customerCode, money);
//		return currentMoney += money;
//	}
//
//	public void makeAccount() {
//		teller.makeAccount(customerCode, currentMoney);
//	}
//}
//
//public class BankingTest2 {
//	public static void main(String[] args) {
//		Customer kim = new Customer("CUST-A0001", 1000);
//		kim.makeAccount();
//
//		System.out.println("입금 후 잔액 : " + kim.deposit(10));
//		System.out.println("출금 후 잔액 : " + kim.withdrawal(20));
//	}
//}