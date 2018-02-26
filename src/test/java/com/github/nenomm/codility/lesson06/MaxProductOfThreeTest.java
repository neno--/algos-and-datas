package com.github.nenomm.codility.lesson06;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProductOfThreeTest {
	@Test
	public void test() {
		assertEquals(60, MaxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6}));
		assertEquals(3 * 90 * 6, MaxProductOfThree.solution(new int[]{-3, 1, 2, -90, 5, 6}));
	}
}
