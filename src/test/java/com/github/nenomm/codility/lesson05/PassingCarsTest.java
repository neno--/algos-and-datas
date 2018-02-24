package com.github.nenomm.codility.lesson05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassingCarsTest {
	@Test
	public void test() {
		assertEquals(5, PassingCars.solution(new int[]{0, 1, 0, 1, 1}));
		assertEquals(0, PassingCars.solution(new int[]{0, 0, 0, 0, 0}));
		assertEquals(0, PassingCars.solution(new int[]{1, 1, 1, 1, 1}));
		assertEquals(0, PassingCars.solution(new int[]{1, 0, 0, 0, 0, 0}));
		assertEquals(0, PassingCars.solution(new int[]{1, 1, 1, 1, 1, 0}));
	}
}
