package com.github.nenomm.sort.selection;

import com.github.nenomm.sort.SortTestDataProvider;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.github.nenomm.sort.SortTestDataProvider.TestType.INT_ARRAY;
import static org.junit.Assert.assertArrayEquals;


public class SelectionSortTest extends SortTestDataProvider {
	private static Logger log = LoggerFactory.getLogger(SelectionSortTest.class);

	@Test
	public void testSortForIntsIterative() {
		if (testType == INT_ARRAY) {
			log.info("Presort: {}", inputArray);
			SelectionSort.iterative((int[]) inputArray);
			log.info("Postsort: {}", inputArray);
			assertArrayEquals((int[]) expectedResult, (int[]) inputArray);
		}
	}

	@Test
	public void testSortForIntsOnExampleIterative() {
		int[] inputArray = {4, 3, 2, 1, -1};
		int[] expectedResult = {-1, 1, 2, 3, 4};

		log.info("Presort: {}", inputArray);
		SelectionSort.iterative((int[]) inputArray);
		log.info("Postsort: {}", inputArray);
		assertArrayEquals((int[]) expectedResult, (int[]) inputArray);
	}

	@Test
	public void testSortForIntsRecursive() {
		if (testType == INT_ARRAY) {
			log.info("Presort: {}", inputArray);
			SelectionSort.recursive((int[]) inputArray);
			log.info("Postsort: {}", inputArray);
			assertArrayEquals((int[]) expectedResult, (int[]) inputArray);
		}
	}

	@Test
	public void testSortForIntsOnExampleRecursive() {
		int[] inputArray = {10, -1, 0, 5, 22};
		int[] expectedResult = {-1, 0, 5, 10, 22};

		log.info("Presort: {}", inputArray);
		SelectionSort.recursive((int[]) inputArray);
		log.info("Postsort: {}", inputArray);
		assertArrayEquals((int[]) expectedResult, (int[]) inputArray);
	}

	@Test
	public void testSortForIntsRecursiveHardcore() {
		if (testType == INT_ARRAY) {
			log.info("Presort: {}", inputArray);
			SelectionSort.recursiveHardcore((int[]) inputArray);
			log.info("Postsort: {}", inputArray);
			assertArrayEquals((int[]) expectedResult, (int[]) inputArray);
		}
	}
}
