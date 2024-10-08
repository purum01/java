package edu.design.observer.test1.code4;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject { // 추상화된 변경 관심 대상 데이터
	private List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) { // 옵서버 즉 통보 대상을 추가함
		observers.add(observer);
	}

	public void detach(Observer observer) { // 옵서버 즉 통보 대상을 제거함
		observers.remove(observer);
	}

// 통보 대상 목록, 즉 observers의 각 옵서버에게 변경을 통보함
	public void notifyObservers() {
		for (Observer o : observers)
			o.update();
	}
}