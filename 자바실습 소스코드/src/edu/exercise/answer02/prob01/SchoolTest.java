package edu.exercise.answer02.prob01;

public class SchoolTest {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 20, 2008123);
		Teacher t = new Teacher("이순신", 50, "Java");
		Employee e = new Employee("유관순", 40, "교무과");

		s.print();
		t.print();
		e.print();
	}
}
