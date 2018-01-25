package com.github.nenomm.sort;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortTest {
	private static Logger log = LoggerFactory.getLogger(SortTest.class);

	@Test
	public void testSomeLibraryMethod() {
		final int[] numbers = {-3, -5, 1, 7, 4, -2};
		final int[] expected = {-5, -3, -2, 1, 4, 7};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);

		//assertThat(numbers, contains(expected));
	}

	@Test
	public void insertElementWhereTest() {
		List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));

		list.add(0, -1);
		assertEquals(Arrays.asList(-1, 0, 1, 2, 3, 4), list);
	}
}
