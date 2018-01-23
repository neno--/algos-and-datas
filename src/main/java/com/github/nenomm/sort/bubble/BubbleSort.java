package com.github.nenomm.sort.bubble;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int[] array) {
		if (array == null) {
			return;
		}

		int i, tmp;
		boolean swapOccured;

		do {
			swapOccured = false;
			for (i = 0; i < (array.length - 1); i++) {
				if (array[i] > array[i + 1]) {
					tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;
					swapOccured = true;
				}

			}
		} while (swapOccured);

	}

	public static int[] sortAndPreserve(int[] array) {
		int[] result = Arrays.copyOf(array, array.length);
		sort(result);
		return result;
	}
}
