package com.github.nenomm.codility.lesson05;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTest {
	@Test
	public void test() {
		assertEquals(3, CountDiv.solution(6, 11, 2));
		assertEquals(4, CountDiv.solution(6, 12, 2));
		assertEquals(3, CountDiv.solution(5, 11, 2));
		assertEquals(0, CountDiv.solution(6, 11, 20));
		assertEquals(1, CountDiv.solution(6, 20, 20));
		assertEquals(2, CountDiv.solution(6, 49, 20));
	}
}
