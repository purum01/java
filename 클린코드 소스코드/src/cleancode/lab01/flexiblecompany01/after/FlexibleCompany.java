package cleancode.lab01.flexiblecompany01.after;


//평사원 클래스
class MereClerk {
	String name;
	double salary;

	public MereClerk(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}
}

//관리자 클래스
class Manager {
	String name;
	double salary;

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20만원을 추가로 받는다.
	}
}

//아르바이트 생 클래스
class StudentWorker {
	String name;
	double salary;

	public StudentWorker(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary -= 20; // 20만원을 빼고 받는다.
	}
}

public class FlexibleCompany {
	public static void main(String[] args) {
		MereClerk mereClerk1 = new MereClerk("철수", 100);
		MereClerk mereClerk2 = new MereClerk("영희", 100);
		Manager manager = new Manager("홍길동", 200);
		StudentWorker studentWorker = new StudentWorker("영철", 60);

		System.out.println("현재 월급입니다.");
		System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");
		System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
		System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");
		System.out.println(studentWorker.getName() + "의 현재 월급은 " + studentWorker.getSalary() + " 만원 입니다."); // 아르바이트생

		System.out.println("");

		System.out.println("올린 후의 월급입니다.");
		mereClerk1.manageSalary(10);
		System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");

		mereClerk2.manageSalary(10);
		System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");

		manager.manageSalary(10);
		System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");

		studentWorker.manageSalary(10); // 아르바이트 생 추가
		System.out.println(studentWorker.getName() + "의 현재 월급은 " + studentWorker.getSalary() + " 만원 입니다.");
	}
}
