package com.fuzailshaikh.behavioral.mediator;

public class StockObserver {
	private String name;
	private StockExchange exchange;

	public StockObserver(String name) {
		this.name = name;
	}

	public void subscribeToExchange(StockExchange exchange) {
		this.exchange = exchange;
	}

	public void retrievePriceOf(String stockName) {
		double price = exchange.pollPrice(stockName);
		System.out.println("Price for " + stockName + ": " + price);
	}

	public String getName() {
		return name;
	}
}
