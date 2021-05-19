package com.fuzailshaikh.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class TextFileOperationExecutor {

	private final List<TextFileOperation> textFileOperations = new ArrayList<>();

	public void executeOperation(TextFileOperation textFileOperation) {
		textFileOperations.add(textFileOperation);
		textFileOperation.execute();
	}

	public void replayExecution() {
		textFileOperations.forEach(TextFileOperation::execute);
	}
}
