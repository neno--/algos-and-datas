package com.github.nenomm.codility.lesson04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogRiverOneTest {
	@Test
	public void test() {
		assertEquals(6, FrogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
		assertEquals(0, FrogRiverOne.solution(1, new int[]{1}));
		assertEquals(-1, FrogRiverOne.solution(5, new int[]{1, 3, 1, 4, 3, 5, 4}));

	}
}
