package edu.exercise.answer04.prob03;

public class FindNumbers {
	public static void main(String[] args) {
		FindNumbers fn = new FindNumbers();
		System.out.println(fn.countNumber(228754462, 2)); // Expected output: 3
		System.out.println(fn.countNumber(228754462, 4)); // Expected output: 2
	}

	public int countNumber(long number, int i) {
		int count = 0;
		String numStr = Long.toString(number);
		char target = Character.forDigit(i, 10); // int i를 char로 변환

		for (int j = 0; j < numStr.length(); j++) {
			if (numStr.charAt(j) == target) {
				count++;
			}
		}

		return count;
	}
}