package com.fuzailshaikh.creational.prototype;

import java.util.Hashtable;

public class EmployeeRegistry {
	private static Hashtable<String, Employee> cache = new Hashtable<String, Employee>();

	public static Employee getEmployeePrototype(String id) {
		Employee cachedObject = cache.get(id);
		return (Employee) cachedObject.clone();
	}

	public static void addEmployeePrototype(String id, Employee instance) {
		cache.put(id, instance);
	}

	public static void loadCache() {
		Employee fullTimeEmployee = new Employee();
		fullTimeEmployee.setEmploymentType("FULL TIME");
		addEmployeePrototype("FULLTIME", fullTimeEmployee);

		Employee seniorEmployee = new Employee();
		seniorEmployee.setDesignation("Senior Developer");
		addEmployeePrototype("SENIOR", seniorEmployee);
	}

}
