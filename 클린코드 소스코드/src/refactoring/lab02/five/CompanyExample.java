package refactoring.lab02.five;

/* Replace Inheritance with Delegation. Tease Apart Inheritance */

public class CompanyExample {
	public static void main(String[] args) {

		
		Manager manager;
		MereClerk clerk1, clerk2;
		Manager managerDog;
		MereClerk clerkDog;

		manager = new Manager("홍길동", 200);
		clerk1 = new MereClerk("철수", 100, manager);
		clerk2 = new MereClerk("영희", 100, manager);
		managerDog = new Manager("돌돌이", 80);
		clerkDog = new MereClerk("똘똘이", 100, managerDog);

		System.out.println("현재 월급입니다.");
		printCurrentSalary(manager);
		printCurrentSalary(clerk1);
		printCurrentSalary(clerk2);
		printCurrentSalary(managerDog);
		printCurrentSalary(clerkDog);

		System.out.println("");
		manager.manageSalary(10); // 월급을 10% 올린다.
		clerk1.manageSalary(10);
		clerk2.manageSalary(10);
		managerDog.manageSalary(10);
		clerkDog.manageSalary(10);

		System.out.println("올린 후의 월급입니다.");
		printCurrentSalary(manager);
		printCurrentSalary(clerk1);
		printCurrentSalary(clerk2);
		printCurrentSalary(managerDog);
		printCurrentSalary(clerkDog);

		System.out.println("");
		printManager(clerk1);
		printManager(clerk2);
		printManager(clerkDog);
	}

	static void printCurrentSalary(Employee worker) {
		System.out.println(worker.getName() + "의 현재 월급은 " + worker.getSalary() + " 만원 입니다.");
	}

	static void printManager(MereClerk clerk) {
		System.out.println(clerk.getName() + "의 매니저는 " + clerk.getManagerName() + "이다.");
	}
}

// 직원 클래스
abstract class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	// 추상 메소드로서 rate는 %비율이다.
	abstract void manageSalary(double rate);

}

class MereClerk extends Employee {
	Manager manager;

	public MereClerk(String name, double salary, Manager manager) {
		super(name, salary);
		this.manager = manager;
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}

	public String getManagerName() {
		return manager.getName();
	}
}

class ClerkDog extends MereClerk {
	public ClerkDog(String name, double salary, Manager manager) {
		super(name, salary, manager);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100) * 0.3; // 올리는 비율의 30% 만큼만 증가
	}
}

class Manager extends Employee {
	public Manager(String name, double salary) {
		super(name, salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20만원을 추가로 받는다.
	}
}

class ManagerDog extends Manager {
	public ManagerDog(String name, double salary) {
		super(name, salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100) * 0.5; // 올리는 비율의 50% 만큼만 증가
	}
}