package com.github.nenomm.sort.insertion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertionSort {
	private static Logger log = LoggerFactory.getLogger(InsertionSort.class);

	public static void sort(int[] array) {
		int[] sorted = new int[array.length];
		int sortedSize = 0, insertPosition = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < sortedSize; j++) {
				insertPosition = j;
				if (array[i] < sorted[j]) {
					shiftToTheRight(sorted, j, sortedSize);
					break;
				} else {
					insertPosition++;
				}
			}
			sorted[insertPosition] = array[i];
			sortedSize++;
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = sorted[i];
		}
	}

	// this should always go at most to the n-1 element.
	private static void shiftToTheRight(int[] sorted, int beginIndex, int sortedSize) {
		for (int i = sortedSize - 1; i >= beginIndex; i--) {
			sorted[i + 1] = sorted[i];
		}
	}
}
