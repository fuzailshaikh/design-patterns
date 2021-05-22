package com.fuzailshaikh.behavioral.observer;

public class Client implements Observer {
	private String name;

	public Client(String name) {
		this.name = name;
	}

	@Override
	public void update(Object msg) {
		System.out.println(name + " got new message: " + msg);
	}
	
}
