package com.github.nenomm.codility.lesson08;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DominatorTest {
	@Test
	public void test() {
		assertEquals(-1, Dominator.solution(new int[]{1, 2, 3, 4, 5}));
		assertEquals(4, Dominator.solution(new int[]{1, 1, 3, 4, 1}));
		assertEquals(2, Dominator.solution(new int[]{1, 1, 1, 4, 1}));
	}
}
