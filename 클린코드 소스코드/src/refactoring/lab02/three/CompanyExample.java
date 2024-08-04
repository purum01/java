package refactoring.lab02.three;

/* Hide Delegate */
public class CompanyExample {
	public static void main(String[] args) {

		Manager manager;
		MereClerk clerk1, clerk2;

		manager = new Manager("홍길동", 200);
		clerk1 = new MereClerk("철수", 100, manager);
		clerk2 = new MereClerk("영희", 100, manager);

		System.out.println("현재 월급입니다.");
		printCurrentSalary(manager);
		printCurrentSalary(clerk1);
		printCurrentSalary(clerk2);

		System.out.println("");
		manager.manageSalary(10); // 월급을 10% 올린다.
		clerk1.manageSalary(10);
		clerk2.manageSalary(10);

		System.out.println("올린 후의 월급입니다.");
		printCurrentSalary(manager);
		printCurrentSalary(clerk1);
		printCurrentSalary(clerk2);

		System.out.println("");
		printManager(clerk1);
		printManager(clerk2);
	}

	static void printCurrentSalary(Employee worker) {
		System.out.println(worker.getName() + "의 현재 월급은 " + worker.getSalary() + " 만원 입니다.");
	}

	static void printManager(MereClerk clerk) {
		System.out.println(clerk.getName() + "의 매니저는 " + clerk.getManager().getName() + "이다.");
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

// 평사원 클래스
class MereClerk extends Employee {
	Manager manager;

	public MereClerk(String name, double salary, Manager manager) {
		super(name, salary);
		this.manager = manager;
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}

	public Manager getManager() {
		return manager;
	}
}

// 관리자 클래스
class Manager extends Employee {
	public Manager(String name, double salary) {
		super(name, salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20만원을 추가로 받는다.
	}

}
