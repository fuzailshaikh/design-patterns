package com.fuzailshaikh.behavioral.mediator;

public class Main {
	public static void main(String[] args) {
		// Create a common mediator to exchange messages
		StockExchange nyse = new StockExchange();

		// Some piece of information that atleast two parties would be interested in
		Stock appleStock = new Stock("AAPL", 500);
		nyse.registerStock(appleStock);

		// Some observer that wants to get latest results
		StockObserver yahooFinance = new StockObserver("YAHOO!");
		yahooFinance.subscribeToExchange(nyse);

		yahooFinance.retrievePriceOf("AAPL");

		// An actor which can fluctuate the price of stock
		Trader trader = new Trader("John Doe");
		trader.subscribe(nyse);
		trader.trade("AAPL", TradeAction.BUY, 10);

		yahooFinance.retrievePriceOf("AAPL");
	}
}
