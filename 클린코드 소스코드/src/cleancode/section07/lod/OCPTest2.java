//package chapter01.section07.lod;
//
//abstract class Employee {
//	private int empSalary;
//	private String empType;
//	
//	public Employee(int empSalary, String empType) {
//		this.empSalary = empSalary;
//		this.empType = empType;
//	}
//
//	public abstract int calculateSalary();
//
//	public int getEmpSalary() {
//		return empSalary;
//	}
//
//	public String getEmpType() {
//		return empType;
//	}	
//}
//
//class MereEmployee extends Employee {
//	public MereEmployee(int empSalary, String empType) {
//		super(empSalary, empType);
//	}
//
//	public int calculateSalary() {
//		int salary = getEmpSalary();
//		return salary += 90;
//	}	
//}
//
//class ManagerEmployee extends Employee {
//	public ManagerEmployee(int empSalary, String empType) {
//		super(empSalary, empType);
//	}
//
//	public int calculateSalary() {
//		int salary = getEmpSalary();
//		return salary += 120;
//	}	
//}
//
//public class OCPTest2 {
//	public static void main(String[] args) {
//		Employee kim = new MereEmployee(100, "Mere");
//		Employee park = new ManagerEmployee(150, "Manager");
//		System.out.println("kim의 급여 : " + kim.calculateSalary());
//		System.out.println("park의 급여 : " + park.calculateSalary());
//	}
//}
