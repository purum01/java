package edu.design.factorymethod.test1.code3;

public class ElevatorController {
    private int id;
    private int curFloor;

    public ElevatorController(int id) {
        this.id = id;
        curFloor = 1;
    }

    public void gotoFloor(int destination) {
        System.out.print("Elevator [" + id + "] Floor: " + curFloor);
        // 현재 층 갱신, 즉 주어진 목적지 층으로 엘리베이터가 이동함
        curFloor = destination;
        System.out.println(" ==> " + curFloor);
    }
}
