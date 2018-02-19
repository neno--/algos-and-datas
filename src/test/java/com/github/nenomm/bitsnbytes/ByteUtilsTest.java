package com.github.nenomm.bitsnbytes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ByteUtilsTest {

	@Test
	public void testOneCounting() {
		assertEquals(0, ByteUtils.countOnes(0));
		assertEquals(1, ByteUtils.countOnes(1));
		assertEquals(1, ByteUtils.countOnes(2));
		assertEquals(2, ByteUtils.countOnes(3));
		assertEquals(1, ByteUtils.countOnes(4));
	}

	@Test
	public void testShowBits() {
		assertEquals("00000000000000000000000000000000", ByteUtils.showBits(0));
		assertEquals("00000000000000000000000000000001", ByteUtils.showBits(1));
		assertEquals("00000000000000000000000000000010", ByteUtils.showBits(2));
		assertEquals("00000000000000000000000000000011", ByteUtils.showBits(3));
		assertEquals("00000000000000000000000000000100", ByteUtils.showBits(4));
	}

	// todo: test >> and << operators on two's complement values.
}
