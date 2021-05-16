package com.fuzailshaikh.structural.facade;

public class Order {
	TrackingSystem trackingSystem = new TrackingSystem();
	BillingSystem billingSystem = new BillingSystem();
	String id;
	double amount;

	Order(String id, double amount) {
		this.id = id;
		this.amount = amount;
	}

	public void getInvoice() {
		billingSystem.getInvoice(id, amount);
	}

	public void track() {
		trackingSystem.trackOrder(id);
	}
	
}
