package edu.design.observer.test1.code3;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();

		// 3개 목록의 DataSheetView 생성
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		
		// 5개 목록의 DataSheetView 생성
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		scoreRecord.addDataSheetView(dataSheetView3);
		scoreRecord.addDataSheetView(dataSheetView5);
		scoreRecord.setMinMaxView(minMaxView);
		for (int index = 1; index <= 5; index++) {
			int score = index * 10;
			System.out.println("Adding " + score);
			// 10 20 30 40 50을 추가함
			// 추가할 때마다 최대 3개목록, 최대 5개 목록, 그리고 최소/최대 점수가 출력됨
			scoreRecord.addScore(score);
		}
	}
}
