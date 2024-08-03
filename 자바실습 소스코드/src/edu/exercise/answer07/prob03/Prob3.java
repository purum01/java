package edu.exercise.answer07.prob03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Score {
    private String name;
    private int score1;
    private int score2;
    private int score3;
    private int totalScore;

    public Score(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.totalScore = score1 + score2 + score3;
    }

    @Override
    public String toString() {
        return name + " : " + score1 + " " + score2 + " " + score3 + " " + totalScore;
    }
}

public class Prob3 {
    public static void main(String[] args) {
        List<Score> scores = new ArrayList<>();
        
        String file = "src\\edu\\exercise\\answer07\\prob03\\data.txt" ;
        try (BufferedReader br = Files.newBufferedReader(Paths.get(file))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("/");
                String name = parts[0];
                int score1 = Integer.parseInt(parts[1]);
                int score2 = Integer.parseInt(parts[2]);
                int score3 = Integer.parseInt(parts[3]);
                scores.add(new Score(name, score1, score2, score3));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Score score : scores) {
            System.out.println(score);
        }
    }
}
