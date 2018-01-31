package com.github.nenomm.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {
	private static Logger log = LoggerFactory.getLogger(BinarySearch.class);

	public static boolean search(int[] array, int e) {
		if ((array == null) || (array.length == 0)) {
			return false;
		}

		int i = 1, j = 0, previous;
		j = array.length / 2 * i;


		do {
			i++;
			previous = j;
			log.info("Index {}, value {}", j, array[j]);
			if (array[j] < e) {
				j = j + (array.length / (2 * i));
				log.info("go right, next index: {}, i: {}", j, i);
			} else if (array[j] > e) {
				j = j - (array.length / (2 * i));
				log.info("go left, next index: {}, i: {}", j, i);
			} else {
				return true;
			}
		} while (previous != j);
		return false;
	}

	public static boolean recursiveIntSearch(int[] array, int element) {
		if ((array == null) || (array.length == 0)) {
			return false;
		}

		return recursiveIntSearch(array, element, 0, array.length - 1);
	}

	private static boolean recursiveIntSearch(int[] array, int element, int startIndex, int endIndex) {
		// middle index may be equal to startIndex, but it can never be equal to endIndex
		int middleIndex = (startIndex + endIndex) / 2;

		if (startIndex == endIndex) {
			return array[middleIndex] == element;
		}

		log.info("Start index: {}, middle index: {}, end index: {}, value: {}", startIndex, middleIndex, endIndex, array[middleIndex]);

		if (array[middleIndex] < element) {

			log.info("go right, start index: {}, end index: {}", middleIndex + 1, endIndex);
			return recursiveIntSearch(array, element, middleIndex + 1, endIndex);
		} else {
			log.info("go left, start index: {}, end index: {}", startIndex, middleIndex);
			return recursiveIntSearch(array, element, startIndex, middleIndex);
		}
	}
}
