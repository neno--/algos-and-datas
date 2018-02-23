package com.github.nenomm.codility.lesson02;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OddOccurrencesInArrayTest {
	@Test
	public void test() {
		assertEquals(1, OddOccurrencesInArray.solution(new int[]{1}));
		assertEquals(2, OddOccurrencesInArray.solution(new int[]{1, 2, 1}));
		assertEquals(1, OddOccurrencesInArray.solution(new int[]{1, 2, 1, 2, 1, 2, 2}));
		assertEquals(7, OddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
	}
}
