package com.github.nenomm.codility.lesson09;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSliceTest {
	@Test
	public void test() {
		assertEquals(5, MaxSlice.solution(new int[]{3, 2, -6, 4, 0}));
		assertEquals(-10, MaxSlice.solution(new int[]{-10}));
	}
}
