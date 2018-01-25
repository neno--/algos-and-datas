package com.github.nenomm.sort;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.github.nenomm.sort.SortTestDataProvider.TestType.INTEGER_LIST;
import static com.github.nenomm.sort.SortTestDataProvider.TestType.INT_ARRAY;

@RunWith(Parameterized.class)
public class SortTestDataProvider {
	public enum TestType {INT_ARRAY, INTEGER_LIST}

	;

	@Parameterized.Parameters
	public static Collection<Object[]> ints() {
		return Arrays.asList(new Object[][]{
				{INT_ARRAY, null, null},
				{INT_ARRAY, new int[]{}, new int[]{}},
				{INT_ARRAY, new int[]{-1}, new int[]{-1}},
				{INT_ARRAY, new int[]{-1, -1}, new int[]{-1, -1}},
				{INT_ARRAY, new int[]{-1, 1}, new int[]{-1, 1}},
				{INT_ARRAY, new int[]{1, -1}, new int[]{-1, 1}},
				{INT_ARRAY, new int[]{-1, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, -1}},
				{INT_ARRAY, new int[]{-1, 1, 2, 3, 4}, new int[]{-1, 1, 2, 3, 4}},
				{INT_ARRAY, new int[]{4, 3, 2, 1, -1}, new int[]{-1, 1, 2, 3, 4}},
				{INT_ARRAY, new int[]{10, -1, 0, 5, 22}, new int[]{-1, 0, 5, 10, 22}},
				{INTEGER_LIST, null, null},
				{INTEGER_LIST, Arrays.asList(-1), Arrays.asList(-1)},
				{INTEGER_LIST, Arrays.asList(-1, -1), Arrays.asList(-1, -1)},
				{INTEGER_LIST, Arrays.asList(-1, 1), Arrays.asList(-1, 1)},
				{INTEGER_LIST, Arrays.asList(1, -1), Arrays.asList(-1, 1)},
				{INTEGER_LIST, Arrays.asList(-1, -1, -1, -1, -1), Arrays.asList(-1, -1, -1, -1, -1)},
				{INTEGER_LIST, Arrays.asList(-1, 1, 2, 3, 4), Arrays.asList(-1, 1, 2, 3, 4)},
				{INTEGER_LIST, Arrays.asList(4, 3, 2, 1, -1), Arrays.asList(-1, 1, 2, 3, 4)},
				{INTEGER_LIST, Arrays.asList(10, -1, 0, 5, 22), Arrays.asList(-1, 0, 5, 10, 22)},
		});
	}

	@Parameterized.Parameter(0)
	public TestType testType;

	@Parameterized.Parameter(1)
	public Object inputArray;

	@Parameterized.Parameter(2)
	public Object expectedResult;
}
