package com.github.nenomm.codility.lesson04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {
	@Test
	public void test() {
		assertEquals(5, MissingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
		assertEquals(4, MissingInteger.solution(new int[]{1, 2, 3}));
		assertEquals(1, MissingInteger.solution(new int[]{-1, -3}));
		assertEquals(8, MissingInteger.solution(new int[]{1, 2, 3, 4, 5, 6, 7}));
		assertEquals(1, MissingInteger.solution(new int[]{-1, -2, -3, -4}));
		assertEquals(1, MissingInteger.solution(new int[]{0}));
	}
}
