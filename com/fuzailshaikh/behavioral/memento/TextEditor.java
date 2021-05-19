package com.fuzailshaikh.behavioral.memento;

public class TextEditor {

	private EditorHistory history;
	private TextEditorState currentState;

	public TextEditor(EditorHistory history) {
		this.history = history;
	}

	public void write(String content) {
		currentState = new TextEditorState(content);
	}

	public void display() {
		System.out.println(currentState.getText());
	}

	public void hitSave() {
		history.push(currentState);
	}

	public void hitUndo() {
		currentState = history.pop();
	}
}