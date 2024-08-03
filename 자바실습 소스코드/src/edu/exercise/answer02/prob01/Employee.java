package edu.exercise.answer02.prob01;

public class Employee extends Person {
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("부서: " + department);
    }
}

