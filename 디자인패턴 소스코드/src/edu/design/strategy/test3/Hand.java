package edu.design.strategy.test3;
public class Hand {
    public static final int HANDVALUE_GUU = 0;  // 주먹을 나타내는 값
    public static final int HANDVALUE_CHO = 1;  // 가위를 나타내는 값
    public static final int HANDVALUE_PAA = 2;  // 보를 나타내는 값
    
    public static final Hand[] hand = {         // 가위바위보의 손을 나타내는 3개의 인스턴스
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };
    
    private static final String[] name = {      // 가위바위보의 손의 문자열 표현
        "주먹", "가위", "보",
    };
    private int handvalue;                      // 가위바위보의 손의 값
    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue) { // 값으로부터 인스턴스를 얻는다.
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) {     // this가 h보다 강할 때true
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) {       // this가h보다 약할 때true
        return fight(h) == -1;
    }
    public int getHandvalue() {
		return handvalue;
	}
    private int fight(Hand h) {                 // 무승부는 0, this가 이기면1, h가 이기면-1
	////아래를 수정한다
	////1을 더한 값의 3으로 나머지 연산결과와 h를 비교한다.
    	int result= (handvalue+1)%3; 
    	if(result==h.getHandvalue()) {
    		return 1;
    	} else if(result>h.getHandvalue()) {
    		return 0;
    	} else {
    		return -1;
    	}
    }
    public String toString() {                  // 문자열 표현으로 변환
        return name[handvalue];
    }
}
