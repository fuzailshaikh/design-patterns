package com.fuzailshaikh.behavioral.command;

public class OpenTextFileOperation implements TextFileOperation {

	private TextFile textFile;

	@Override
	public void execute() {
			textFile.open();
	}
}
