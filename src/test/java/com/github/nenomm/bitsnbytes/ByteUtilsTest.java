package com.github.nenomm.bitsnbytes;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ByteUtilsTest {
	private static Logger log = LoggerFactory.getLogger(ByteUtilsTest.class);

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

	@Test
	public void testComplements() {

		// 20 -> -20
		int number = 20;

		assertEquals("00000000000000000000000000010100", ByteUtils.showBits(number));

		number = ~number;
		number = number + 1;

		assertEquals(-20, number);

		assertEquals("11111111111111111111111111101100", ByteUtils.showBits(number));

		// -20 -> 20

		number = ~number;
		number = number + 1;

		assertEquals(20, number);

		assertEquals("00000000000000000000000000010100", ByteUtils.showBits(number));
	}

	@Test
	public void testShifts() {
		int number = 1;

		assertEquals("00000000000000000000000000000001", ByteUtils.showBits(number));

		number = ~number;
		number = number + 1;

		assertEquals(-1, number);
		assertEquals("11111111111111111111111111111111", ByteUtils.showBits(number));

		number = number >> 10;

		assertEquals(-1, number);

		number = number << 10;

		assertNotEquals(-1, number);

		number = -1;
		number = number >>> 10;

		assertNotEquals(-1, number);
	}

	@Test
	public void testBitArithmetics() {
		int number = 5;

		assertEquals(40, number << 3);
		assertEquals(9, 73 >> 3);

		number = -5;
		assertEquals(-40, number << 3);
		assertEquals(-10, (-73) >> 3);    // -73 / 2 = -36.5 => -37 / 2 = -18.5 => -19 / 2 = -9.5 => -10

		assertEquals(-37, (-73) >> 1);
		assertEquals(-19, (-37) >> 1);
		assertEquals(-10, (-19) >> 1);
	}

	@Test
	public void contrivedProblemTest() {
		int number = 0b1000_0000_0000_0000_0000_0000_0000_0000;
		log.info("This special number is... {}", number);

		log.info("Number: {}, negative number: {}", number - 1, -(number - 1));
		log.info("Number: {}, negative number: {}", number, -number);
		log.info("Number: {}, negative number: {}", number + 1, -(number + 1));

		log.info("Min int is {}, max int is: {}", Integer.MIN_VALUE, Integer.MAX_VALUE);
	}


}
