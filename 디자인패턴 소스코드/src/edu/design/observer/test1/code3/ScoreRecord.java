package edu.design.observer.test1.code3;

import java.util.ArrayList;
import java.util.List;


public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();
	private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>();
	private MinMaxView minMaxView;

	public void addDataSheetView(DataSheetView dataSheetView) { //DataSheetView 추가
		dataSheetViews.add(dataSheetView);
	}

	public void setMinMaxView(MinMaxView minMaxView) { // MinMaxView 설정
		this.minMaxView = minMaxView;
	}

	public void addScore(int score) {
		scores.add(score);
		for (DataSheetView dataSheetView : dataSheetViews)
			dataSheetView.update(); // 각 DataSheetView에게 점수의 변경을 통보
		minMaxView.update(); // MinMaxView에게 점수의 변경을 통보
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}
