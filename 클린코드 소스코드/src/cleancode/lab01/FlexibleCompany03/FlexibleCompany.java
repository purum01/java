package cleancode.lab01.FlexibleCompany03;


/* 직원 클래스 */
class Employee {
	String name; // 이름
	SalaryRole salaryRole = null;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		// SalaryRole 객체에게 위임함.
		return salaryRole.getSalary();
	}

	public void setSalary(double salary) {
		// SalaryRole 객체에게 위임함.
		salaryRole.setSalary(salary);
	}

	public void manageSalary(double rate) {
		// SalaryRole 객체에게 위임함.
		salaryRole.manageSalary(rate);
	}

	public void setSalaryRole(SalaryRole salaryRole) {
		this.salaryRole = salaryRole;
	}

	public SalaryRole getSalaryRole() {
		return salaryRole;
	}

}

/* 직원 역할 클래스 */
abstract class SalaryRole {
	double salary;

	SalaryRole(double salary) {
		this.salary = salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	// 추상 메소드로서 rate는 %비율이다.
	public void manageSalary(double rate) {
	}

}

/* 평사원 역할 클래스 */
class MereClerkSalaryRole extends SalaryRole {
	public MereClerkSalaryRole(double salary) {
		super(salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}
}

/* 관리자 역할 클래스 */
class ManagerSalaryRole extends SalaryRole {
	public ManagerSalaryRole(double salary) {
		super(salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20만원을 추가로 받는다.
	}
}

public class FlexibleCompany {
	public static void main(String[] args) {

		Employee[] workers = new Employee[3];
		
		workers[0] = new Employee("철수"); // 철수 직원
		workers[0].setSalaryRole(new MereClerkSalaryRole(100)); // 평사원 철수

		workers[1] = new Employee("영희"); // 영희 직원
		workers[1].setSalaryRole(new MereClerkSalaryRole(100)); // 평사원 영희

		workers[2] = new Employee("홍길동"); // 홍길동 직원
		workers[2].setSalaryRole(new ManagerSalaryRole(200)); // 관리자 홍길동

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

		System.out.println("");
		System.out.println("철수가 관리자로 승진하였습니다. 승진후의 월급은 다음과 같습니다.");

		// 철수가 관리자가 됨.
		workers[0].setSalaryRole(new ManagerSalaryRole(200));
		workers[0].manageSalary(10);
		System.out.println(workers[0].getName() + "의 현재 월급은 " + workers[0].getSalary() + " 만원 입니다.");

	}
}
