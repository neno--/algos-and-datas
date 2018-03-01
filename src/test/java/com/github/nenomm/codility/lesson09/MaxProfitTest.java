package com.github.nenomm.codility.lesson09;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxProfitTest {

	@Test
	public void test() {
		assertEquals(356, MaxProfit.solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
		assertEquals(0, MaxProfit.solution(new int[]{1}));
		assertEquals(0, MaxProfit.solution(new int[]{1, 1, 1, 1, 1}));
		assertEquals(9, MaxProfit.solution(new int[]{1, 1, 10, 1, 1}));
	}
}
