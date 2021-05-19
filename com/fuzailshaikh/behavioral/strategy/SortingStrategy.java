package com.fuzailshaikh.behavioral.strategy;

public interface SortingStrategy {
	int[] sort(int[] input);

	default void swap(int[] arr, int xIndex, int yIndex) {
		int temp = arr[xIndex];
		arr[xIndex] = arr[yIndex];
		arr[yIndex] = temp;
	}

	default void printMessage() {
		System.out.println("Sorting by " + this.getClass().getName());
	}
}