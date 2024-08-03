package edu.exercise.answer04.prob05;

public class StringUtil {

	public static void main(String[] args) {
		String[] arr = { "java program", "array", "java program area", "append" };
		String result = replaceString(arr);
		System.out.println("변경된 문자열 : " + result);
	}

	/* 이곳에 replaceString 메소드를 작성하십시오. */
	public static String replaceString(String[] strArray) {
		String result = null;
		int maxCount = 0;

		for (String str : strArray) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a') {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				result = str;
			}
		}

		if (result != null) {
			result = result.replace('a', 'A');
		}

		return result;
	}
}
