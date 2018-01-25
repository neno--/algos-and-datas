package com.github.nenomm.sort.insertion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
	private static Logger log = LoggerFactory.getLogger(InsertionSort.class);

	public static void sort(int[] array) {
		if (array == null) {
			return;
		}

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

	public static List<Integer> sort(List<Integer> source) {
		if (source == null) {
			return null;
		} else if (source.size() <= 1) {
			return new ArrayList<>(source);
		}

		List<Integer> result = new ArrayList<>(source.size());
		int i;

		for (Integer element : source) {
			for (i = 0; i < result.size(); i++) {
				if (result.get(i) > element) {
					break;
				}

			}
			result.add(i, element);
		}

		return result;
	}

	public static List<Integer> sortImproved(List<Integer> source) {
		List<Integer> result = new LinkedList<Integer>();

		if (source == null) {
			return null;
		}

		outerLoop:
		for (Integer element : source) {
			for (int i = 0; i < result.size(); i++) {
				if (result.get(i) > element) {
					result.add(i, element);
					continue outerLoop;
				}
			}
			result.add(element);
		}

		return result;
	}
}
