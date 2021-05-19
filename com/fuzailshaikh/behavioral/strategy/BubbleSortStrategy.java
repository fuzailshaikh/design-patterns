package com.fuzailshaikh.behavioral.strategy;

public class BubbleSortStrategy implements SortingStrategy {

	@Override
	public int[] sort(int[] input) {
		printMessage();

		int n = input.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (input[j] > input[j + 1]) {
					swap(input, j, j + 1);
				}
		return input;
	}

}
