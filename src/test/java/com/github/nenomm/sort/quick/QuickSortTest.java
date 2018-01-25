package com.github.nenomm.sort.quick;

import com.github.nenomm.sort.SortTestDataProvider;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.github.nenomm.sort.SortTestDataProvider.TestType.INT_ARRAY;
import static org.junit.Assert.assertArrayEquals;


public class QuickSortTest extends SortTestDataProvider {
	private static Logger log = LoggerFactory.getLogger(QuickSortTest.class);

	@Test
	public void testSortForInts() {
		if (testType == INT_ARRAY) {
			log.info("Presort: {}", inputArray);
			QuickSort.sort((int[]) inputArray);
			log.info("Postsort: {}", inputArray);
			assertArrayEquals((int[]) expectedResult, (int[]) inputArray);
		}
	}

	@Test
	public void testCombineMethod() {
		int[] source = {-1, 1, 2, 3, 4, 5, 6, 7, 8};
		int[] destination = {8, 9, 10, 11, 12, 13, 14, 15, 19};

		log.info("destination before: {}", destination);
		QuickSort.combine(source, destination, 3, 3);
		log.info("destination after: {}", destination);

		assertArrayEquals(new int[]{8, 9, 10, -1, 1, 2, 3, 15, 19}, destination);
	}
}
