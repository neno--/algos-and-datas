package com.github.nenomm.sort.quick;

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
	public static void combine(int[] source, int[] destination, int destinationBeginIndex, int sourceEndIndex) {
		for (int i = 0; i <= sourceEndIndex; i++) {
			destination[destinationBeginIndex + i] = source[i];
		}
	}
}
