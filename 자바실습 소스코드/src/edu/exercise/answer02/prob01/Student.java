package edu.exercise.answer02.prob01;

public class Student extends Person {
    private int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("ID: " + id);
    }
}

