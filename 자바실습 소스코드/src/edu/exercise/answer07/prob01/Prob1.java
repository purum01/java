package edu.exercise.answer07.prob01;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Prob1 {

    // main 메서드는 수정하지 마세요.
    public static void main(String[] args) throws Exception {
        Prob1 fdu = new Prob1();		
        String file1 = "src\\edu\\exercise\\answer07\\prob01\\data1.txt";
        String file2 = "src\\edu\\exercise\\answer07\\prob01\\data2.txt";
        String file3 = "src\\edu\\exercise\\answer07\\prob01\\output.txt";
        fdu.dataCheck(file1, file2, file3);
    }
    
    public void dataCheck(String file1, String file2, String file3) throws Exception {
        // Read the lines from both files
        List<String> file1Lines = readFileLines(file1);
        List<String> file2Lines = readFileLines(file2);

        // Verify content read from files
//        System.out.println("Content of file1:");
//        file1Lines.forEach(System.out::println);
//        System.out.println("Content of file2:");
//        file2Lines.forEach(System.out::println);
        
        // Compare lines and write results to the output file
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(file3))) {
            for (int i = 0; i < file1Lines.size(); i++) {
                String line1 = file1Lines.get(i);
                String line2 = file2Lines.get(i);
                
                String result;
                if (line1.equalsIgnoreCase(line2)) {
                    result = "Line " + (i + 1) + ": Equal";
                } else {
                    result = "Line " + (i + 1) + ": Not Equal";
                }
                writer.write(result);
                writer.newLine();
                System.out.println(result); // Print to console for verification
            }
        }
    }

    private List<String> readFileLines(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
}
