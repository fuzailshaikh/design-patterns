package com.fuzailshaikh.creational.builder;

public class Main {
	public static void main(String[] args) {
		Cage shed = Cage.Builder.newInstance()
		.setCapacity(1)
		.setId(100)
		.build();
		
		System.out.println(shed.getId() + " has capacity of " + shed.getCapacity());
	}
}
