package com.github.nenomm.codility.lesson07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BracketsTest {
	@Test
	public void test() {
		assertEquals(1, Brackets.solution(""));
		assertEquals(1, Brackets.solution("()"));
		assertEquals(1, Brackets.solution("{[()()]}"));
		assertEquals(1, Brackets.solution("{[()()]}{[()()]}{{}}"));
		assertEquals(0, Brackets.solution("{[()()]}{[(()]}{{}}"));
		assertEquals(0, Brackets.solution("}"));
		assertEquals(0, Brackets.solution("{[()()]}{[()()]}{{}}}"));
		assertEquals(0, Brackets.solution("{[()()]}{[()()]}{{}}{"));
	}
}
