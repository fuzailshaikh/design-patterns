package com.fuzailshaikh.structural.bridge;

public interface IAccount {
  public void setLogger(ILogger logger);
	void create(String id);
	void logMessage(String message);
}
