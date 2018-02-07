package com.github.nenomm.tree;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class BinaryHeapTest {
	private static Logger log = LoggerFactory.getLogger(BinaryHeapTest.class);

	@Test
	public void createTree() {
		final BinaryHeap<Integer> tree = new BinaryHeap<>(6, 4, 5, 2, 3, 8, 7, 9, 0, 1);
		List<Integer> list = tree.flattenByLevel();

		log.info("List is: {}", list);
	}
}
