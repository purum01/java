package refactoring.lab02.one;

/*
 * 회사원의 봉급을 관리(인상, 인하)하는 프로그램을 만들자. 현재 회사에 3명의 직원이 있다고 가정한다.
 * 그들 중 두 명은 사원이며 나머지 한 사람은 그들의 관리자이다.
 * 참고로 현재는 회사가 작아서 관리자의 관리자는 없는 것으로 구현한다. 
 * 이들의 현재 월급은 사원은 100만원, 관리자는 200만원이다. 
 * 현재는 월급의 10%만큼 인상할 것이며, 관리자는 20만원을 더 올려준다. 
 * 앞으로 이 회사에 더 많은 직원이 채용될 것이며, 그들의 월급도 관리되어야 한다. 
*/
class Employee {
	static final int CLERK = 1;
	static final int MANAGER = 2;

	private String name;
	private double salary;
	private int type;
	private Employee manager;

	public Employee(int type, String name, double salary, Employee manager) {
		this.type = type;
		this.name = name;
		this.salary = salary;
		this.manager = manager;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public Employee getManager() {
		return manager;
	}

	public void manageES(double rate) {
		if (type == CLERK) {
			salary = salary + salary * (rate / 100);
		} else if (type == MANAGER) {
			salary = salary + salary * (rate / 100);
			salary += 20; // 관리자는 20만원을 추가로 받는다.
		}
	}
}

public class CompanyExample {
	public static void main(String[] args) {

		Employee manager = new Employee(Employee.MANAGER, "홍길동", 200, null);
		Employee mereClerk1 = new Employee(Employee.CLERK, "철수", 100, manager);
		Employee mereClerk2 = new Employee(Employee.CLERK, "영희", 100, manager);

		System.out.println("현재 월급입니다.");

		System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");
		System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
		System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");

		System.out.println("");

		System.out.println("올린 후의 월급입니다.");

		mereClerk1.manageES(10);
		System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");

		mereClerk2.manageES(10);
		System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");

		manager.manageES(10);
		System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");

		System.out.println("");
		System.out.println(mereClerk1.getName() + "의 매니저는 " + mereClerk1.getManager().getName() + "이다.");
		System.out.println(mereClerk2.getName() + "의 매니저는 " + mereClerk2.getManager().getName() + "이다.");

	}
}
