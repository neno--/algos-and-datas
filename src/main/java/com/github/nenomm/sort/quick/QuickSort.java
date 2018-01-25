package com.github.nenomm.sort.quick;

public class QuickSort {
	public static void sort(int[] array) {
/*		int pivot, pivotIndex, leftArray[], rightArray[];

		if ((array == null) || array.length <= 1) {
			return;
		}

		pivotIndex = array.length / 2;
		pivot = array[pivotIndex];


		for (int i = 0; i< array.length; i++) {
			if (array[i] < pivot) {
				leftArray
			}
		}

		sort(leftArray);
		sort(rightArray);

		combine(leftArray, array, 0);
		array[leftArray.length] = pivot;
		combine(rightArray, array, leftArray.length + 1);*/
	}

	/**
	 * @param beginIndex inclusive
	 */
	private static void combine(int[] source, int[] destination, int beginIndex) {
		for (int i = 0; i < source.length; i++) {
			destination[beginIndex + i] = source[i];
		}
	}
}
