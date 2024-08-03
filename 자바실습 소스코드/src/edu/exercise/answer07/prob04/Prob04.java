package edu.exercise.answer07.prob04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prob04 {
    public static void main(String[] args) {
        String fileName = "src\\edu\\exercise\\answer07\\prob04\\data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                String name = parts[0];
                int sum = 0;
                for (int i = 1; i < parts.length; i++) {
                    sum += Integer.parseInt(parts[i]);
                }
                double average = (double) sum / (parts.length - 1);
                System.out.printf("%s의 평균은 %.1f입니다.%n", name, average);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
