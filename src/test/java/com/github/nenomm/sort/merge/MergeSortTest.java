package com.github.nenomm.sort.merge;

import com.github.nenomm.sort.SortTestDataProvider;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.github.nenomm.sort.SortTestDataProvider.TestType.INT_ARRAY;
import static org.junit.Assert.assertArrayEquals;


public class MergeSortTest extends SortTestDataProvider {
	private static Logger log = LoggerFactory.getLogger(MergeSortTest.class);

	@Test
	public void testSortForInts() {
		if (testType == INT_ARRAY) {
			log.info("Presort: {}", inputArray);
			MergeSort.sort((int[]) inputArray);
			log.info("Postsort: {}", inputArray);
			assertArrayEquals((int[]) expectedResult, (int[]) inputArray);
		}
	}
}
