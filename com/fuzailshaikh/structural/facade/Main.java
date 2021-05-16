package com.fuzailshaikh.structural.facade;

public class Main {
	public static void main(String[] args) {
		Order order = new Order("ABCD1", 50);
		order.getInvoice();
		order.track();
	}
}
