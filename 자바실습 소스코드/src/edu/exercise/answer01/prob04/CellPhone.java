package edu.exercise.answer01.prob04;

public class CellPhone {
    private String model; // 핸드폰 모델 번호
    private double battery; // 남은 배터리 양

    // 모델 번호를 인자로 받는 생성자
    public CellPhone(String model) {
        this.model = model;
        this.battery = 0;
    }

    // 통화 시간(분)을 출력하고, 통화 시간에 따라 배터리 양을 감소시킨다.
    public void call(int time) {
        if (time < 0) {
            System.out.println("통화시간입력오류");
            return;
        }
        double batteryUsage = time * 0.5;
        battery -= batteryUsage;
        if (battery < 0) {
            battery = 0;
        }
        System.out.println("통화 시간: " + time + "분");
    }

    // 충전한 시간(분)을 출력하고, 충전한 시간에 따라 배터리 양을 증가시킨다.
    public void charge(int time) {
        if (time < 0) {
            System.out.println("충전시간입력오류");
            return;
        }
        double batteryCharge = time * 3;
        battery += batteryCharge;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("충전 시간: " + time + "분");
    }

    // 남은 배터리 양을 출력한다.
    public void printBattery() {
        System.out.println("남은 배터리 양: " + battery);
    }

    // 인자로 전달된 CellPhone의 모델 번호가 현재 객체의 모델 번호와 같은 경우에 true를 리턴한다.
    public boolean isEqual(CellPhone c) {
        return this.model.equals(c.model);
    }
}
