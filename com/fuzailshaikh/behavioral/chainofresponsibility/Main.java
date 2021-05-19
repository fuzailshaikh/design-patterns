package com.fuzailshaikh.behavioral.chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		AbstractLogger logger = getLogger();
		logger.logMessage(AbstractLogger.INFO, "Very detailed information");
		logger.logMessage(AbstractLogger.DEBUG, "Reached an assertion");
		logger.logMessage(AbstractLogger.ERROR, "An error occured");
	}

	private static AbstractLogger getLogger() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);

		return errorLogger;
	}
}
