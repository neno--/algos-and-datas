package com.github.nenomm.recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CombinationTest {
	@Test
	public void testSimpleIterative() {
		Combination.simple("abcd");
	}

	@Test
	public void testSimpleRecursive() {
		Combination.simpleRecursive("abcd");
	}

	@Test
	public void auxilliaryTest() {
		assertEquals("1234", new String(new char[]{'1', '2', '3', '4', 0, 0, 0, 0}, 0, 4));
	}

	@Test
	public void testHardRecursive() {
		Combination.hardRecursive("abcd");
	}
}
