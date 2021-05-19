package com.fuzailshaikh.behavioral.command;

public class SaveTextFileOperation implements TextFileOperation {
      
	private TextFile textFile;

	@Override
	public void execute() {
			textFile.save();
	}
}