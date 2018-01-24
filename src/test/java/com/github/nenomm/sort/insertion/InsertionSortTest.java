package com.github.nenomm.sort.insertion;

import com.github.nenomm.sort.SortTestDataProvider;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertArrayEquals;


public class InsertionSortTest extends SortTestDataProvider {
	private static Logger log = LoggerFactory.getLogger(InsertionSortTest.class);

	@Test
	public void testSomeLibraryMethod() {
		log.info("Presort: {}", inputArray);
		InsertionSort.sort(inputArray);
		log.info("Postsort: {}", inputArray);
		assertArrayEquals(expectedResult, inputArray);


		//assertThat(numbers, contains(expected));
	}
}
