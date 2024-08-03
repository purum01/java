package edu.exercise.answer02.prob03;

public class Spider extends Animal {

    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spiders catch flies in their webs to eat.");
    }
}
