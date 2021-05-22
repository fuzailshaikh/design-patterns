package com.fuzailshaikh.behavioral.mediator;

public class Trader {
	private String name;
	private StockExchange exchange;

	public Trader(String name) {
		this.name = name;
	}

	public void subscribe(StockExchange exchange) {
		this.exchange = exchange;
	}

	public void trade(String stockName, TradeAction action, int quantity) {
		if (action == TradeAction.BUY) {
			System.out.println("Buying " + quantity + " of " + stockName);
			exchange.buy(stockName, quantity);
		}
		else {
			System.out.println("Selling " + quantity + " of " + stockName);
			exchange.sell(stockName, quantity);
		}
	}

	public String getName() {
		return name;
	}
}
