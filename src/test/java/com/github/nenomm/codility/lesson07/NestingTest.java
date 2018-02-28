package com.github.nenomm.codility.lesson07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NestingTest {
	@Test
	public void test() {
		assertEquals(1, Nesting.solution(""));
		assertEquals(0, Nesting.solution("("));
		assertEquals(0, Nesting.solution(")"));
		assertEquals(1, Nesting.solution("(())"));
		assertEquals(0, Nesting.solution("()())"));
		assertEquals(0, Nesting.solution("((((((("));
	}
}
