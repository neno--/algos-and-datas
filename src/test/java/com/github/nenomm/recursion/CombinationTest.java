package com.github.nenomm.recursion;

import org.junit.Test;

public class CombinationTest {
	@Test
	public void testSimpleIterative() {
		Combination.simple("abcd");
	}

	@Test
	public void testSimpleRecursive() {
		Combination.simpleRecursive("abcd");
	}
}
