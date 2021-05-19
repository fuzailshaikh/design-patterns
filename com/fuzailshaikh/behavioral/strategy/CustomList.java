package com.fuzailshaikh.behavioral.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList {
	private SortingStrategy sortingStrategy;
	private List<Integer> elements;

	public CustomList(Integer[] arr) {
		elements =  Arrays.asList(arr);
		sortingStrategy = new BubbleSortStrategy();
	}

	public void setSortingStrategy(SortingStrategy newSortingStrategy) {
		sortingStrategy = newSortingStrategy;
	}

	public void sortAndDisplay() {
		int[] result = sort();
		List<Integer> list = Arrays.stream(result).boxed().collect(Collectors.toList());
		list.forEach(System.out::println);
	}

	public int[] sort() {
		int[] arr = elements.stream()
												.mapToInt(Integer::intValue)
												.toArray();
		return sortingStrategy.sort(arr);
	}

}
