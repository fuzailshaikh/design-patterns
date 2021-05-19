package com.fuzailshaikh.behavioral.memento;

import java.util.Stack;

public class EditorHistory {

	private Stack<TextEditorState> states;

	public EditorHistory() {
		this.states = new Stack<>();
	}

	public void push(TextEditorState state) {
		this.states.push(state);
	}

	public TextEditorState pop() {
		return this.states.pop();
	}

	public TextEditorState peek() {
		return this.states.peek();
	}
}