package com.fuzailshaikh.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {
	public List<Observer> observers = new ArrayList<>();

	default void addObserver(Observer observer) {
		Observable.observers.add(observer);
	}

	default void removeObserver(Observer observer) {
		Observable.observers.remove(observer);
	}

	default void notify(Object msg) {
		observers.forEach(observer -> {
			observer.update(msg);
		});
	}
}
