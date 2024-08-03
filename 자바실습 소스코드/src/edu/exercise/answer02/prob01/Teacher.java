package edu.exercise.answer02.prob01;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("과목: " + subject);
    }
}

