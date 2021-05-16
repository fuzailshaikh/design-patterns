package com.fuzailshaikh.structural.bridge;

public class FileLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("Logging to file: " + message);
	}
	
}
