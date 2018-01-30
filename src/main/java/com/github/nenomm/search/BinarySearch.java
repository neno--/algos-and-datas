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


}
