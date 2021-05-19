package com.fuzailshaikh.behavioral.strategy;

public class SelectionSortStrategy implements SortingStrategy {

	@Override
	public int[] sort(int[] input) {
		printMessage();

		int n = input.length;
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (input[j] < input[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first element
			swap(input, min_idx, i);
		}
		return input;
	}

}
