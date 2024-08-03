package edu.exercise.answer02.prob01;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("이름: " + name + " 나이: " + age);
    }
}
