package com.fuzailshaikh.behavioral.memento;

public class Main {
	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor(new EditorHistory());
		textEditor.write("The Memento Design Pattern");
		textEditor.write("Let's save this text");
		textEditor.hitSave();
		textEditor.display();

		textEditor.write("Some more change");

		textEditor.hitUndo();
		textEditor.display();
	}
}
