package com.github.nenomm.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsTest {

	@Test
	public void test1() {
		assertEquals(null, ReverseWords.reverseWords(null));
	}

	@Test
	public void test2() {
		assertEquals("", ReverseWords.reverseWords(""));
	}

	@Test
	public void test3() {
		assertEquals("a", ReverseWords.reverseWords("a"));
	}

	@Test
	public void test4() {
		assertEquals("ab", ReverseWords.reverseWords("ab"));
	}

	@Test
	public void test5() {
		assertEquals("a b c d", ReverseWords.reverseWords("d c b a"));
	}

	@Test
	public void test6() {
		assertEquals("   a b c d  ", ReverseWords.reverseWords("  d c b a   "));
	}

	@Test
	public void test7() {
		assertEquals("a ", ReverseWords.reverseWords(" a"));
	}
}
