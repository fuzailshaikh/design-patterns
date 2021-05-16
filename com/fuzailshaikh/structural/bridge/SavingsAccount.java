package com.fuzailshaikh.structural.bridge;

public class SavingsAccount implements IAccount {
	ILogger logger;

	@Override
	public void create(String id) {
		System.out.println("Created savings account: " + id);
	}

	@Override
	public void setLogger(ILogger log) {
		this.logger = log;
	}

	@Override
	public void logMessage(String message) {
		this.logger.log(message);
	}
	
}
