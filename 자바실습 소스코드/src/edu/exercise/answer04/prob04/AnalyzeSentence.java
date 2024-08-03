package edu.exercise.answer04.prob04;

public class AnalyzeSentence {

	public static void main(String[] args) {
		AnalyzeSentence analyzer = new AnalyzeSentence();
		String sentence = "I have the strangest feeling.";
		int resultWithTrue = 0;
		int resultWithFalse = 0;

		resultWithTrue = analyzer.analyzeSentence(sentence, true);
		resultWithFalse = analyzer.analyzeSentence(sentence, false);

		System.out.println("결과 예상값 : 5, 실제 결과값 : " + resultWithTrue);
		System.out.println("결과 예상값 : 29, 실제 결과값 : " + resultWithFalse);
	}

	public int analyzeSentence(String sentence, boolean isWord) {
		if (isWord) {
			// 단어의 개수를 세기
			String[] words = sentence.split("\\s+");
			return words.length;
		} else {
			// 문자열의 개수를 세기
			return sentence.length();
		}
	}
}
