package com.fuzailshaikh.creational.factory;

public class ShapeFactory {

	public Shape getShape(String shapeName) {
		switch (shapeName) {
			case "CIRCLE":
				return new Circle();
			case "RECTANGLE":
				return new Rectangle();
			case "TRIANGLE":
				return new Triangle();
			default:
				return null;
		}
	}
}
