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

	public static void recursive(int[] array) {
		if ((array == null) || (array.length == 1)) {
			return;
		}

		recursive_internal(array, 0);
	}

	private static void recursive_internal(int[] array, int position) {
		int min, minIndex, tmp;
		if (position < (array.length - 1)) {
			minIndex = position;
			min = array[minIndex];
			for (int i = position + 1; i < array.length; i++) {
				if (min > array[i]) {
					min = array[i];
					minIndex = i;
				}
			}

			if (position != minIndex) {
				tmp = array[position];
				array[position] = array[minIndex];
				array[minIndex] = tmp;
			}
			recursive_internal(array, position + 1);
		}
	}

	public static void recursiveHardcore(int[] array) {
		if ((array == null) || (array.length == 1)) {
			return;
		}

		recursive_internal(array, 0);
	}

	private static void recursive_internal_hardcore(int[] array, int position, int searchIndex, int minIndex) {
		if (position != array.length) {
			if (searchIndex == array.length) {
				int tmp = array[position];
				array[position] = array[minIndex];
				array[minIndex] = tmp;
				recursive_internal_hardcore(array, position + 1, position + 2, position + 1);
			} else {
				if (array[minIndex] > array[searchIndex]) {
					minIndex = searchIndex;
				}
				recursive_internal_hardcore(array, position, searchIndex + 1, minIndex);
			}
		}
	}
}
