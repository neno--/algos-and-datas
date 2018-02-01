package com.github.nenomm.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BinarySearchTest {
	private static Logger log = LoggerFactory.getLogger(BinarySearchTest.class);

	@Parameterized.Parameters
	public static Collection<Object[]> ints() {
		return Arrays.asList(new Object[][]{
				{null, 0, false},
				{new int[]{}, -1, false},
				{new int[]{-1}, 0, false},
				{new int[]{-1}, -1, true},
				{new int[]{-1, 1}, 0, false},
				{new int[]{-1, 1}, -1, true},
				{new int[]{-1, 1}, 1, true},
				{new int[]{-1, 0, 1}, 5, false},
				{new int[]{-1, 0, 1}, -1, true},
				{new int[]{-1, 0, 1}, 0, true},
				{new int[]{-1, 0, 1}, 1, true},
				{new int[]{-1, 0, 1, 2, 3}, 15, false},
				{new int[]{-1, 0, 1, 2, 3}, 2, true},
				{new int[]{-1, 0, 1, 2, 3}, 3, true},
				{new int[]{-1, 0, 1, 2, 3}, -1, true}}
		);
	}


	@Parameterized.Parameter(0)
	public int[] array;

	@Parameterized.Parameter(1)
	public int element;

	@Parameterized.Parameter(2)
	public boolean expectedResult;

	@Test(timeout = 5000)
	public void testIntSearch() {
		log.info("Array: {}, element: {}, expected result: {}", array, element, expectedResult);
		assertEquals(expectedResult, BinarySearch.intSearch(array, element));
	}

	@Test
	public void testRecursiveIntSearch() {
		log.info("Array: {}, element: {}, expected result: {}", array, element, expectedResult);
		assertEquals(expectedResult, BinarySearch.recursiveIntSearch(array, element));
	}
}
