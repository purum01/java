package edu.exercise.answer07.prob05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prob05 {
    public static void main(String[] args) {
        String inputFileName = "src\\edu\\exercise\\answer07\\prob05\\input.txt";
        String outputFileName = "src\\edu\\exercise\\answer07\\prob05\\output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                String name = parts[0];
                String[] scores = parts[1].split("/");
                int sum = 0;
                for (String score : scores) {
                    sum += Integer.parseInt(score);
                }
                int average = sum / scores.length;
                bw.write(String.format("%s 의 평균 : %d%n", name, average));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
