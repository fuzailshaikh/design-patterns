package com.fuzailshaikh.creational.prototype;

public class Main {
	public static void main(String[] args) {
		// Initialise all prototypes
		EmployeeRegistry.loadCache();

		// Clone from an existing instance
		Employee john = EmployeeRegistry.getEmployeePrototype("FULLTIME");
		john.setId(1);
		john.setName("John");
		john.setDesignation("Senior Developer");
		System.out.println(john);
	}
}
