package com.github.nenomm.codility.lesson04;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaxCountersTest {
	@Test
	public void test() {
		assertArrayEquals(new int[]{3, 2, 2, 4, 2}, MaxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
		assertArrayEquals(new int[]{1, 0, 2, 4, 0}, MaxCounters.solution(5, new int[]{3, 4, 4, 3, 1, 4, 4}));
		assertArrayEquals(new int[]{4, 4, 4, 4, 4}, MaxCounters.solution(5, new int[]{3, 4, 4, 3, 1, 4, 4, 6}));
		assertArrayEquals(new int[]{4}, MaxCounters.solution(1, new int[]{1, 1, 1, 1}));
		assertArrayEquals(new int[]{4}, MaxCounters.solution(1, new int[]{1, 1, 1, 1, 2}));
	}
}
