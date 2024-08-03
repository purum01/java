package edu.exercise.answer01.prob02;

public class FlowerTest {
	public static void main(String[] args) {
		Flower flower = new Flower("장미", "빨간색", false);
		printInfo(flower);

		flower = new Flower("해바라기", "노란색");
		printInfo(flower);

		flower = new Flower("패랭이꽃");
		printInfo(flower);
	}

	static public void printInfo(Flower flower) {
		System.out.println("이름 : " + flower.getName());
		System.out.println("색깔 : " + flower.getColor());
		System.out.println("야생 : " + flower.isWild() + "\n");
	}
}
