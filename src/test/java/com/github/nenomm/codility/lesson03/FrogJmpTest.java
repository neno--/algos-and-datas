package com.github.nenomm.codility.lesson03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrogJmpTest {
	@Test
	public void test() {
		assertEquals(3, FrogJmp.solution(10, 85, 30));
		assertEquals(1, FrogJmp.solution(1, 2, 1));
		assertEquals(9, FrogJmp.solution(1, 10, 1));
		assertEquals(0, FrogJmp.solution(10, 10, 1));
	}
}
