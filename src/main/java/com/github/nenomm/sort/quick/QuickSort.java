package com.github.nenomm.sort.quick;

public class QuickSort {
	public static void sort(int[] array) {
		int pivot, pivotIndex, leftArray[], rightArray[], leftIndex = 0, rightIndex = 0;

		if ((array == null) || array.length <= 1) {
			return;
		}

		// this is an overstatement, but it is easiest way to do it.
		leftArray = new int[array.length];
		rightArray = new int[array.length];

		pivotIndex = array.length / 2;
		pivot = array[pivotIndex];


		for (int i = 0; i < array.length; i++) {
			if (array[i] < pivot) {
				leftArray[leftIndex++] = array[i];
			} else {
				rightArray[rightIndex++] = array[i];
			}
		}

		sort(leftArray);
		sort(rightArray);

		combine(leftArray, array, 0, leftIndex);
		array[leftArray.length] = pivot;
		combine(rightArray, array, leftArray.length + 1, rightIndex);
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
