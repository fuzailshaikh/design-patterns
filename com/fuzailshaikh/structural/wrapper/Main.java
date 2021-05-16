package com.fuzailshaikh.structural.wrapper;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Shape redCircle = new RedStrokedCircle(circle);
		redCircle.draw();
	}
}
