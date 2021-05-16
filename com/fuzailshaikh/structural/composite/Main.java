package com.fuzailshaikh.structural.composite;

public class Main {
	public static void main(String[] args) {
		BasicNode root = new BasicNode("*");
		BasicNode left = new BasicNode("<-");
		BasicNode right = new BasicNode("->");

		root.add(left);
		root.add(right);

		root.print();
	}
}
