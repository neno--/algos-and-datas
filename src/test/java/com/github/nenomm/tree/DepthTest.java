package com.github.nenomm.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepthTest {
	BinaryTree<Integer> tree;

	@Test
	public void testDepthLinear() {
		tree = new BinaryTree<>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		assertEquals(10, tree.getDepth());
	}

	@Test
	public void testDepthBalanced() {
		tree = new BinaryTree<>(5, 2, 7, 1, 3, 6, 8, 0, 9);
		assertEquals(4, tree.getDepth());
	}

	@Test
	public void testDepthUneven() {
		tree = new BinaryTree<>(10, 5, 20, 4, 8, 7, 6);
		assertEquals(5, tree.getDepth());
	}

	@Test
	public void testDepthNoElement() {
		tree = new BinaryTree<>();
		assertEquals(0, tree.getDepth());
	}

	@Test
	public void testDepthJustRoot() {
		tree = new BinaryTree<>(100);
		assertEquals(1, tree.getDepth());
	}
}
