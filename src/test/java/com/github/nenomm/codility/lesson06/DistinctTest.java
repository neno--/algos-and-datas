package com.github.nenomm.codility.lesson06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistinctTest {
	@Test
	public void test() {
		assertEquals(0, Distinct.solution(new int[]{}));
		assertEquals(1, Distinct.solution(new int[]{1}));
		assertEquals(1, Distinct.solution(new int[]{1, 1}));
		assertEquals(2, Distinct.solution(new int[]{1, 1, 2}));
	}
}
