package com.github.nenomm.sort.quick;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuickSort {
	public static void sort(int[] array) {
		if (array == null) {
			return;
		}
		sort(array, array.length);
	}

	private static void sort(int[] array, int size) {
		int pivot, pivotIndex, leftArray[], rightArray[], nextLeftIndex = 0, nextRightIndex = 0;

		if (size <= 1) {
			return;
		}

		// this is an overstatement, but it is easiest way to do it.
		leftArray = new int[size - 1];
		rightArray = new int[size - 1];

		pivotIndex = size / 2;
		pivot = array[pivotIndex];


		for (int i = 0; i < size; i++) {
			if (i == pivotIndex) continue;

			if (array[i] < pivot) {
				leftArray[nextLeftIndex++] = array[i];
			} else {
				rightArray[nextRightIndex++] = array[i];
			}
		}

		sort(leftArray, nextLeftIndex);
		sort(rightArray, nextRightIndex);

		combine(leftArray, array, 0, nextLeftIndex - 1);
		array[nextLeftIndex] = pivot;
		combine(rightArray, array, nextLeftIndex + 1, nextRightIndex - 1);
	}

	/**
	 * @param destinationBeginIndex inclusive
	 * @param sourceEndIndex        inclusive
	 *                              <p>
	 *                              assumes source and destination are of same size.
	 */
	private static void combine(int[] source, int[] destination, int destinationBeginIndex, int sourceEndIndex) {
		for (int i = 0; i <= sourceEndIndex; i++) {
			destination[destinationBeginIndex + i] = source[i];
		}
	}

	public static List<Integer> sort(List<Integer> source) {
		if (source == null) {
			return null;
		} else if (source.size() < 2) {
			return new ArrayList<>(source);
		}

		List<Integer> left = new ArrayList<>(source.size() - 1);
		List<Integer> right = new ArrayList<>(source.size() - 1);

		Integer pivot = source.get(source.size() / 2);
		Iterator it = source.iterator();

		for (int i = 0; it.hasNext(); i++) {
			Integer element = (Integer) it.next();
			if (i == source.size() / 2) {
				continue;
			}

			if (pivot.compareTo(element) < 0) {
				right.add(element);
			} else {
				left.add(element);
			}
		}

		left = sort(left);
		right = sort(right);

		left.add(pivot);
		left.addAll(right);

		return left;
	}
}
