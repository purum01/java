package edu.exercise.answer07.prob02;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Prob2 {

    public static void main(String[] args) throws Exception {
    	Prob2 fdu = new Prob2();
        String filePath = "src\\edu\\exercise\\answer07\\prob02\\list.txt";
        System.out.println("Reading from: " + new File(filePath).getAbsolutePath());
        List<String[]> result = fdu.getList(filePath);
        for (String[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }

    // list.txt의 내용을 읽어서 조건에 맞게 처리하는 메소드
    public List<String[]> getList(String filePath) throws IOException {
        List<String[]> resultList = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        
        for (String line : lines) {
            String[] parts = line.split("/");
            if (parts.length == 3) {
                String name = parts[0];
                String subject = parts[1];
                int score = Integer.parseInt(parts[2]);
                String status = getStatus(subject, score);
                resultList.add(new String[] {name, subject, parts[2], status});
            }
        }
        
        return resultList;
    }

    // 과목명과 점수를 기준으로 수료 여부를 판단하는 메소드
    private String getStatus(String subject, int score) {
        if (subject.equalsIgnoreCase("JAVA") && score >= 80) {
            return "수료";
        } else if (subject.equalsIgnoreCase("SQL") && score >= 90) {
            return "수료";
        } else {
            return "미수료";
        }
    }
}
