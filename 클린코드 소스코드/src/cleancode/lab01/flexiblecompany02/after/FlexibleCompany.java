package cleancode.lab01.flexiblecompany02.after;


//직원 클래스
abstract class Employee {
	String name; // 이름
	double salary; // 월급

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	// 추상 메소드로서 rate는 %비율이다.
	public abstract void manageSalary(double rate);

}

//평사원 클래스
class MereClerk extends Employee {
	public MereClerk(String name, double salary) {
		super(name, salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}
}

//관리자 클래스
class Manager extends Employee {
	public Manager(String name, double salary) {
		super(name, salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20만원을 추가로 받는다.
	}
}

//아르바이트생 클래스
class StudentWorker extends Employee {
	public StudentWorker(String name, double salary) {
		super(name, salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary -= 20; // 20만원을 빼고 받는다.
	}
}

public class FlexibleCompany {
	public static void main(String[] args) {

		// 아르바이트생이 추가되었기 때문에 종업원 수를 4명으로 한다.
		Employee[] workers = new Employee[4];
		workers[0] = new MereClerk("철수", 100); // 평사원 철수
		workers[1] = new MereClerk("영희", 100); // 평사원 영희
		workers[2] = new Manager("홍길동", 200); // 관리자 홍길동
		workers[3] = new StudentWorker("영철", 60); // 아르바이트생 영철

		// 현재 월급
		System.out.println("현재 월급입니다.");
		for (int i = 0; i < workers.length; i++)
			// 현재 월급을 프린트한다.
			System.out.println(workers[i].getName() + "의 현재 월급은 " + workers[i].getSalary() + " 만원 입니다.");

		System.out.println("");

		// 현재 월급에서 10%를 올린 월급
		System.out.println("올린 후의 월급입니다.");
		for (int i = 0; i < workers.length; i++) {
			workers[i].manageSalary(10); // 월급을 10% 올린다.
			// 현재 월급을 프린트한다.
			System.out.println(workers[i].getName() + "의 현재 월급은 " + workers[i].getSalary() + " 만원 입니다.");

		}
	}
}