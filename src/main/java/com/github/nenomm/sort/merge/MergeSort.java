package com.github.nenomm.sort.merge;

public class MergeSort {
	public static void sort(int[] array) {
		if (array == null) {
			return;
		}
		sort(array, 0, array.length - 1);
	}

	private static void sort(int[] array, int startIndex, int endIndex) {
		int size = endIndex - startIndex + 1;
		if (size < 2) {
			return;
		}

		int middleIndex = (size / 2 - 1) + startIndex;
		sort(array, startIndex, middleIndex);
		sort(array, middleIndex + 1, endIndex);

		int l = startIndex;
		int r = middleIndex + 1;
		int helperIndex = 0;
		int[] helper = new int[size];

		do {
			if (array[l] > array[r]) {
				helper[helperIndex++] = array[r++];
			} else {
				helper[helperIndex++] = array[l++];
			}
		} while ((l <= middleIndex) && (r <= endIndex));

		for (int i = l; i <= middleIndex; i++) {
			helper[helperIndex++] = array[i];
		}

		for (int i = r; i <= endIndex; i++) {
			helper[helperIndex++] = array[i];
		}

		for (int i = 0; i < helperIndex; i++) {
			array[startIndex + i] = helper[i];
		}
	}
}
