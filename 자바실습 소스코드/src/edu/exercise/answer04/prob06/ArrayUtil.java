package edu.exercise.answer04.prob06;

public class ArrayUtil {

    public char[] reverseString(char[] s, int start, int end) {
        // 인덱스가 유효한지 확인
        if (s == null || start < 0 || end >= s.length || start >= end) {
            return s;
        }

        while (start < end) {
            // 문자 교환
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        return s;
    }

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};

        System.out.println(util.reverseString(s.clone(), 0, 3));  // Expected output: avaJProgram
        System.out.println(util.reverseString(s.clone(), 4, 7));  // Expected output: JavagorPram
        System.out.println(util.reverseString(s.clone(), 8, 10)); // Expected output: JavaProgmar
        System.out.println(util.reverseString(s.clone(), 0, 10)); // Expected output: margorPavaJ
    }
}

