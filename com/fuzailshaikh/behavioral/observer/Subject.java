package com.fuzailshaikh.behavioral.observer;

public class Subject implements Observable {
	private String status;

	public Subject(String status) {
		this.status = status;
	}

	public void next(String newStatus) {
		System.out.println("Changing status from " + status + " to " + newStatus);
		status = newStatus;
		notify(status);
	}
	
}
