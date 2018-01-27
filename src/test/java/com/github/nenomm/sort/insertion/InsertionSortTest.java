package com.github.nenomm.sort.insertion;

import com.github.nenomm.sort.SortTestDataProvider;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.github.nenomm.sort.SortTestDataProvider.TestType.INTEGER_LIST;
import static com.github.nenomm.sort.SortTestDataProvider.TestType.INT_ARRAY;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class InsertionSortTest extends SortTestDataProvider {
	private static Logger log = LoggerFactory.getLogger(InsertionSortTest.class);

	@Test
	public void testForInts() {
		if (testType == INT_ARRAY) {
			log.info("Presort: {}", inputArray);
			InsertionSort.sort((int[]) inputArray);
			log.info("Postsort: {}", inputArray);
			assertArrayEquals((int[]) expectedResult, (int[]) inputArray);
		}
	}

	@Test
	public void testForList() {
		if (testType == INTEGER_LIST) {
			log.info("Presort: {}", inputArray);
			List<Integer> result = InsertionSort.sort((List<Integer>) inputArray);
			log.info("Postsort: {}", result);
			assertEquals(expectedResult, result);
		}
	}

	@Test
	public void testForListImproved() {
		if (testType == INTEGER_LIST) {
			log.info("Presort: {}", inputArray);
			List<Integer> result = InsertionSort.sortImproved((List<Integer>) inputArray);
			log.info("Postsort: {}", result);
			assertEquals(expectedResult, result);
		}
	}
}
