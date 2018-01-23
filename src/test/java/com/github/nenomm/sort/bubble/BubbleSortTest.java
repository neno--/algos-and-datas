package com.github.nenomm.sort.bubble;

import com.github.nenomm.sort.SortTestDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;


public class BubbleSortTest extends SortTestDataProvider {
	@Test
	public void testSomeLibraryMethod() {
		BubbleSort.sort(inputArray);
		assertArrayEquals(expectedResult, inputArray);

		//assertThat(numbers, contains(expected));
	}
}
