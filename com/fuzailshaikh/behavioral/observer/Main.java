package com.fuzailshaikh.behavioral.observer;

public class Main {
	public static void main(String[] args) {
		Subject subject = new Subject("NEW");

		Client a = new Client("A");
		Client b = new Client("B");

		subject.addObserver(a);
		subject.addObserver(b);

		subject.next("READY");
		subject.next("COMPLETED");
	}
}
