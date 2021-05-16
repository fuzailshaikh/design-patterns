package com.fuzailshaikh.structural.bridge;

public class Main {
	public static void main(String[] args) {
		IAccount account = new SavingsAccount();
		account.setLogger(new FileLogger());
		
		account.create("A1");
		account.logMessage("Account created");
	}
}
