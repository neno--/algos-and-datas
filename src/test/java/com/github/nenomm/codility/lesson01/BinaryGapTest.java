package com.github.nenomm.codility.lesson01;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BinaryGapTest {

	@Test
	public void testBinaryGap() {
		assertEquals(0, BinaryGap.solution(0));
		assertEquals(2, BinaryGap.solution(9));
		assertEquals(4, BinaryGap.solution(529));
		assertEquals(0, BinaryGap.solution(15));
		assertEquals(0, BinaryGap.solution(4));
	}
}
