package com.github.nenomm.sort.bubble;

import com.github.nenomm.sort.SortTestDataProvider;
import org.junit.Test;

import static com.github.nenomm.sort.SortTestDataProvider.TestType.INT_ARRAY;
import static org.junit.Assert.assertArrayEquals;


public class BubbleSortTest extends SortTestDataProvider {
	@Test
	public void testSomeLibraryMethod() {
		if (testType == INT_ARRAY) {
			BubbleSort.sort((int[]) inputArray);
			assertArrayEquals((int[]) expectedResult, (int[]) inputArray);

			//assertThat(numbers, contains(expected));
		}
	}
}
