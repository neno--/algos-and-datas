package com.github.nenomm.codility.lesson03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {
	@Test
	public void test() {
		assertEquals(1, TapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
		assertEquals(1, TapeEquilibrium.solution(new int[]{1, 2}));
		assertEquals(0, TapeEquilibrium.solution(new int[]{0, 0, 0, 0}));
	}
}
