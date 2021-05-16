package com.fuzailshaikh.structural.facade;

public class BillingSystem {
	public void getInvoice(String id, double amt) {
		System.out.println("Billed for $" + amt + " on order: " + id);
	}
}
