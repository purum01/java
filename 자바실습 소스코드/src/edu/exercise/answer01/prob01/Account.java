package edu.exercise.answer01.prob01;

public class Account {
    private String accNo; // 계좌 번호
    private int balance;  // 잔고

    // 생성자: 계좌 번호를 초기화
    public Account(String accNo) {
        this.accNo = accNo;
        this.balance = 0;
        System.out.println(accNo + " 계좌가 개설되었습니다.");
    }

    // 입금 메소드
    public void save(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accNo + " 계좌에 " + amount + "만원이 입금되었습니다.");
        }
    }

    // 출금 메소드
    public void deposit(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(accNo + " 계좌에 " + amount + "만원이 출금되었습니다.");
        }
    }

    // 잔고 확인 메소드
    public int getBalance() {
        return balance;
    }

    // 계좌 번호 확인 메소드
    public String getAccNo() {
        return accNo;
    }
}
