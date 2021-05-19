package com.fuzailshaikh.behavioral.memento;

public class TextEditorState {

	private String content;

	public TextEditorState(String content) {
			this.content = content;
	}

	public String getText() {
			return content;
	}
}