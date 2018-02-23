package com.github.nenomm.codility.lesson03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {
	@Test
	public void test() {
		assertEquals(4, PermMissingElem.solution(new int[]{2, 3, 1, 5}));
		assertEquals(1, PermMissingElem.solution(new int[]{}));
		assertEquals(4, PermMissingElem.solution(new int[]{1, 2, 3}));
	}
}
