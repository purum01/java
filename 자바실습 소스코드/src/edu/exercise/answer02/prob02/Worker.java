package edu.exercise.answer02.prob02;

public class Worker extends Man implements Speakable {
    public Worker(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return getName() + " 일꾼은 자기가 맡은 일을 열심히 한다!!";
    }
}

