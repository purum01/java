package edu.exercise.answer04.prob02;

public class FindCharacters {

	public static void main(String[] args) {
		FindCharacters fc = new FindCharacters();
		int count1 = fc.countChar("Boys, be ambitious", 'i');
		System.out.println(count1); // Expected output: 2

		int count2 = fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count2); // Expected output: 2
	}

	public int countChar(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
}
