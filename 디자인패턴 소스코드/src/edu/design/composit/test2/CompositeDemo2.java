package edu.design.composit.test2;

import java.util.ArrayList;
import java.util.Iterator;

abstract class Entry {
	public abstract String getName();

	public abstract void print();

	public void add(Entry entry) {
		throw new RuntimeException("사원에는 추가할 수 없습니다.");
	}
}

class Employee extends Entry {
	public String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return "사원 이름 : " + name;
	}

	public void print() {
		System.out.println("사원명 : " + name);
	}
}

class Department extends Entry {
	private String departmentName;
	private ArrayList<Entry> list;

	public Department(String departmentName) {
		this.departmentName = departmentName;
		list = new ArrayList<Entry>();
	}

	public String getName() {
		return departmentName;
	}

	public void add(Entry entry) {
		list.add(entry);
	}

	public void print() {
		System.out.println(departmentName + " 정보");
		Iterator<Entry> iter = list.iterator();
		while (iter.hasNext()) {
			Entry entry = (Entry) iter.next();
			if (entry instanceof Department) {
				System.out.println("\n부서명 : " + entry.getName() + "\n");
			}
			entry.print();
		}
	}
}

public class CompositeDemo2 {
	public static void main(String[] args) {
		Department d1 = new Department("전체부서");
		Department d2 = new Department("총무부");
		Department d3 = new Department("영업부");
		d1.add(d2);
		d1.add(d3);

		Employee e1 = new Employee("홍길동");
		Employee e2 = new Employee("둘리");
		Employee e3 = new Employee("도우너");
		Employee e4 = new Employee("또치");

		d2.add(e1);
		d2.add(e2);
		d2.add(e3);
		d3.add(e4);

		d1.print();
	}
}
