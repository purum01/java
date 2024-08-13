package edu.design.observer.test1.code4;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject { // 구체적인 변경 감시 대상 데이터
	private List<Integer> scores = new ArrayList<Integer>();

	public void addScore(int score) {
		scores.add(score);
		// 데이터가 변경되면 Subject 클래스의 notifyObservers 메서드를 호출해
		// 각 옵서버(통보 대상 객체)에게 데이터의 변경을 통보함
		notifyObservers();
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}
