package com.fuzailshaikh.behavioral.strategy;

public class Main {
	public static void main(String[] args) {
		Integer arr[] = {1, 2, 8, 7, 30, 3};
		CustomList list = new CustomList(arr);
		list.sortAndDisplay();

		// Changing strategy
		list.setSortingStrategy(new SelectionSortStrategy());
		list.sortAndDisplay();
	}
}
