package com.github.nenomm.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParseIntegerTest {

	@Test
	public void toIntTest0() {
		assertEquals(0, ParseInteger.toInt("0"));
		assertEquals(0, ParseInteger.toInt("-0"));
		assertEquals(1, ParseInteger.toInt("1"));
		assertEquals(-1, ParseInteger.toInt("-1"));
	}

	@Test
	public void toIntTest1() {
		assertEquals(1, ParseInteger.toInt("01"));
		assertEquals(-1, ParseInteger.toInt("-01"));
	}

	@Test
	public void toIntTest2() {
		assertEquals(10, ParseInteger.toInt("10"));
		assertEquals(100, ParseInteger.toInt("100"));
		assertEquals(1234, ParseInteger.toInt("1234"));
		assertEquals(-9999, ParseInteger.toInt("-9999"));
	}

	@Test
	public void fromIntTest0() {
		assertEquals("0", ParseInteger.fromInt(0));
		assertEquals("0", ParseInteger.fromInt(-0));
		assertEquals("1", ParseInteger.fromInt(1));
		assertEquals("-1", ParseInteger.fromInt(-1));
	}

	@Test
	public void fromIntTest1() {
		assertEquals("10", ParseInteger.fromInt(10));
		assertEquals("100", ParseInteger.fromInt(100));
		assertEquals("1234", ParseInteger.fromInt(1234));
		assertEquals("-9999", ParseInteger.fromInt(-9999));
	}
}
