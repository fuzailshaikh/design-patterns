package com.fuzailshaikh.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class StockExchange {
	private Map<String, Stock> stocks = new HashMap<>();

	public void registerStock(Stock stock) {
		stocks.put(stock.name, stock);
	}

	public double pollPrice(String stockName) {
		return stocks.get(stockName).price;
	}

	public void buy(String stockName, int quantity) {
		Stock stock = stocks.get(stockName);
		stock.price += quantity;
	}

	public void sell(String stockName, int quantity) {
		Stock stock = stocks.get(stockName);
		stock.price -= quantity;
	}
	
}
