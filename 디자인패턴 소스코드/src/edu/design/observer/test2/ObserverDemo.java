package edu.design.observer.test2;

import java.util.ArrayList;
import java.util.List;

interface Subject {
	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}

class ConcreteSubject implements Subject {
	private List<Observer> observers;
	private String message;

	public ConcreteSubject() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

	public void setMessage(String message) {
		this.message = message;
		notifyObservers();
	}
}

interface Observer {
	void update(String message);
}

class ConcreteObserver implements Observer {
	private String name;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + " received message: " + message);
	}
}

public class ObserverDemo {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();

		Observer observer1 = new ConcreteObserver("Observer 1");
		Observer observer2 = new ConcreteObserver("Observer 2");

		subject.registerObserver(observer1);
		subject.registerObserver(observer2);

		subject.setMessage("Hello, Observers!"); // Both observers will receive this message

		subject.removeObserver(observer1);

		subject.setMessage("Observer 1 should not see this."); // Only observer2 will receive this message
	}
}
