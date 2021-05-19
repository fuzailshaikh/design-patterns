package com.fuzailshaikh.behavioral.command;

public class Main {
	public static void main(String[] args) {
		TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
		TextFile textFile = new TextFile("file1.txt");

		textFileOperationExecutor.executeOperation(textFile::open);
		textFileOperationExecutor.executeOperation(textFile::save);

		System.out.println("Replaying previous executions");
		textFileOperationExecutor.replayExecution();
	}
}


