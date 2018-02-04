package com.github.nenomm.list;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CyclicalTest {
	private static Logger log = LoggerFactory.getLogger(CyclicalTest.class);

	LinkedList<Integer> list = new LinkedList<>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

	@Test
	public void testRead() {
		assertEquals(3, list.getAt(3).getValue());
	}

	@Test
	public void testLoop() {
		list.connectTo(3);
		assertEquals(3, list.getAt(9).getNext().getValue());
	}

	@Test
	public void testLoopFalse() {
		assertFalse(list.isLoop());
	}

	@Test
	public void testLoopTrue() {
		list.connectTo(4);
		assertTrue(list.isLoop());
	}

}
