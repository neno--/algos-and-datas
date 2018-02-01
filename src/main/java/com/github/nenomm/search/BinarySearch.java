package com.github.nenomm.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {
	private static Logger log = LoggerFactory.getLogger(BinarySearch.class);

	public static boolean intSearch(int[] array, int element) {
		if ((array == null) || (array.length == 0)) {
			return false;
		}

		int startIndex = 0, endIndex = array.length - 1;
		int middleIndex;

		while (true) {
			middleIndex = (startIndex + endIndex) / 2;

			if (array[middleIndex] == element) {
				return true;
			}

			if (startIndex == endIndex) {
				return false;
			}

			if (array[middleIndex] < element) {
				startIndex = middleIndex + 1;
				log.info("go right, start index: {}, end index: {}", startIndex, endIndex);
			} else {
				endIndex = middleIndex;
				log.info("go left, start index: {}, end index: {}", startIndex, endIndex);
			}
		}
	}

	public static boolean recursiveIntSearch(int[] array, int element) {
		if ((array == null) || (array.length == 0)) {
			return false;
		}

		return recursiveIntSearch(array, element, 0, array.length - 1);
	}

	/**
	 * @param array
	 * @param element
	 * @param startIndex - inclusive
	 * @param endIndex   - inclusive
	 * @return whether element is in the array or not
	 */
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
