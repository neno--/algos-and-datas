package com.github.nenomm.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BinaryTreeTest {
	@Test
	public void createTree() {
		final BinaryTree<Integer> tree = new BinaryTree<>(7, null, null);
		tree.insert(3);
		tree.insert(9);
		tree.insert(10);
		assertTrue(tree.search(10));
		assertEquals(Integer.valueOf(10),
				tree.getRoot().getRight().getRight().getValue());
	}
}
