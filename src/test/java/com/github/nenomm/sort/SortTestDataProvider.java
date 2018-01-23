package com.github.nenomm.sort;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortTestDataProvider {
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
				{new int[]{}, new int[]{}},
				{new int[]{0}, new int[]{0}},
				{new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 3, 4}},
				{new int[]{4, 3, 2, 1, 0}, new int[]{0, 1, 2, 3, 4}},
				{new int[]{10, -1, 0, 5, 22}, new int[]{-1, 0, 5, 10, 22}}
		});
	}

	@Parameterized.Parameter
	public int[] inputArray;

	@Parameterized.Parameter(1)
	public int[] expectedResult;
}
