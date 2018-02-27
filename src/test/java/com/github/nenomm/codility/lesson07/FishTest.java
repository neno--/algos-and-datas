package com.github.nenomm.codility.lesson07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishTest {
	@Test
	public void test() {
		assertEquals(2, Fish.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
	}
}
