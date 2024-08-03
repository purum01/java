package edu.exercise.answer02.prob02;


public class SpeakTest {
public static void main(String[] args) {
	Object[] obj = {new Reader("길동"),
			new Worker("둘리"),
			new Student("마이콜")};
	for (int i = 0; i < obj.length; i++) {
		if(obj[i] instanceof Speakable){
			Speakable speaker = (Speakable)obj[i];
			System.out.println(speaker.speak());
		}
	}
}
}
