package edu.exercise.answer04.prob01;

public class Prob1 {

    public static void main(String[] args) {
        String sourceString = "everyday we have is one more than we deserve";
        String encodedString = "";

        // 프로그램을 구현부 시작.
        int shift = 3;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sourceString.length(); i++) {
            char ch = sourceString.charAt(i);

            // Apply the shift only to alphabetic characters
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }

            result.append(ch);
        }

        encodedString = result.toString();
        // 프로그램 구현부 끝.

        System.out.println("암호화할 문자열 : " + sourceString);
        System.out.println("암호화된 문자열 : " + encodedString);
    }
}


