package com.github.nenomm.recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
	@Test
	public void computeTest() {
		assertEquals(1, Factorial.compute(0));
		assertEquals(1, Factorial.compute(1));
		assertEquals(2, Factorial.compute(2));
		assertEquals(120, Factorial.compute(5));
	}
}
