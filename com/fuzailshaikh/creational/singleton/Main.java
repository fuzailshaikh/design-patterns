package com.fuzailshaikh.creational.singleton;

public class Main {
	public static void main(String[] args) {
		// NOTE: This is not possible
		// Singleton obj = new Singleton();

		Singleton obj = Singleton.createInstance();
		System.out.println(obj.greeting());
	}
}