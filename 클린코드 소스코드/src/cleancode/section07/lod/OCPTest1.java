package cleancode.section07.lod;

class Employee {
	private int empSalary;
	private String empType;
	
	public Employee(int empSalary, String empType) {
		this.empSalary = empSalary;
		this.empType = empType;
	}

	public int calculateSalary() {
		if(empType.equals("Mere"))
			empSalary += 90;
		else if(empType.equals("Manager"))
			empSalary += 120;
		return empSalary;
	}
	
}

public class OCPTest1 {
	public static void main(String[] args) {
		Employee kim = new Employee(100, "Mere");
		Employee park = new Employee(150, "Manager");
		System.out.println("kim의 급여 : " + kim.calculateSalary());
		System.out.println("park의 급여 : " + park.calculateSalary());
	}
}
