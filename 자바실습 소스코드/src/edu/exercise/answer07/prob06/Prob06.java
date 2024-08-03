package edu.exercise.answer07.prob06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prob06 {
	public static void main(String[] args) {
		String fileName = "src\\edu\\exercise\\answer07\\prob06\\movie.txt";
		Map<String, String> movieMap = new HashMap<>();

		// Read the movie data from the file and store it in a map
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(",", 3);
				String title = parts[0];
				String actors = parts[2];
				movieMap.put(title, actors);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(System.in);
		String inputTitle;

		// Keep running until the user chooses to exit
		while (true) {
			System.out.println("영화 제목을 입력하세요 (종료하려면 '종료' 입력):");
			inputTitle = scanner.nextLine();

			if (inputTitle.equalsIgnoreCase("종료")) {
				break;
			}

			if (movieMap.containsKey(inputTitle)) {
				System.out.println(inputTitle + "의 주연 배우: " + movieMap.get(inputTitle));
			} else {
				System.out.println("영화를 찾을 수 없습니다.");
			}
		}

		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}
}
