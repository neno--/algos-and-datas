package com.github.nenomm.codility.lesson04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {
	@Test
	public void test() {
		assertEquals(1, PermCheck.solution(new int[]{1}));
		assertEquals(1, PermCheck.solution(new int[]{1, 2, 3, 4}));
		assertEquals(0, PermCheck.solution(new int[]{1, 2, 3, 5}));
		assertEquals(0, PermCheck.solution(new int[]{1, 2, 3, 4, 2}));
	}
}
