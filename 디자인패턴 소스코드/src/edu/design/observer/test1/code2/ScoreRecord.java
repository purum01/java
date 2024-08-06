package edu.design.observer.test1.code2;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();
	private MinMaxView minMaxView;

	public void setMinMaxView(MinMaxView minMaxView) { // MinMaxView를 설정함
		this.minMaxView = minMaxView;
	}

	public void addScore(int score) {
		scores.add(score);
		minMaxView.update(); // MinMaxView에게 점수의 변경을 통보함
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}