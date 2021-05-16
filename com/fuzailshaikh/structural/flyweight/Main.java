package com.fuzailshaikh.structural.flyweight;

public class Main {
	public static void main(String[] args) {
		Circle circle = (Circle) ShapeFactory.getCircle("RED");
		circle.setRadius(100);
		circle.draw();

		Circle anotherRed = (Circle) ShapeFactory.getCircle("RED");
		anotherRed.setRadius(120);
		anotherRed.draw();

	}
}
