package com.github.nenomm.sort.selection;

public class SelectionSort {
	public static void iterative(int[] array) {
		if ((array == null) || (array.length == 1)) {
			return;
		}

		int min, tmp;
		int j = 0, minIndex = 0;
		for (int i = 0; i < array.length - 1; i++) {
			min = array[i];
			minIndex = i;

			j = i + 1;
			do {
				if (min > array[j]) {
					min = array[j];
					minIndex = j;
				}
				j++;

			} while (j < array.length);

			if (i != minIndex) {
				tmp = array[i];
				array[i] = min;
				array[minIndex] = tmp;
			}
		}
	}
}
