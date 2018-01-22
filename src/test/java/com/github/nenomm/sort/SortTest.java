package com.github.nenomm.sort;

import org.junit.Test;

import java.util.Arrays;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertArrayEquals;
import static org.hamcrest.Matchers.contains;

public class SortTest {
	@Test
	public void testSomeLibraryMethod() {
		final int[] numbers = {-3, -5, 1, 7, 4, -2};
		final int[] expected = {-5, -3, -2, 1, 4, 7};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);

		//assertThat(numbers, contains(expected));
	}
}
