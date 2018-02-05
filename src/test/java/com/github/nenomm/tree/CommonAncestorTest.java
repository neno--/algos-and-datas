package com.github.nenomm.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonAncestorTest {
	BinaryTree<Integer> tree = new BinaryTree<>(20, 10, 30, 5, 15, 3, 6, 11, 16);

	@Test
	public void getNodeForElement() {
		assertEquals((Integer) 5, tree.getNodeFor(5).getValue());
	}

	@Test
	public void getNodeForNonExistant() {
		assertEquals(null, tree.getNodeFor(40));
	}

	@Test
	public void findClosestTest() {
		BinaryTree.TreeNode lowestCommon = tree.getNodeFor(10);
		BinaryTree.TreeNode first = tree.getNodeFor(5);
		BinaryTree.TreeNode second = tree.getNodeFor(11);

		assertEquals(lowestCommon, tree.findClosestCommonAncestor(first, second));
	}

	@Test
	public void findClosestSwapTest() {
		BinaryTree.TreeNode lowestCommon = tree.getNodeFor(10);
		BinaryTree.TreeNode first = tree.getNodeFor(5);
		BinaryTree.TreeNode second = tree.getNodeFor(11);

		assertEquals(lowestCommon, tree.findClosestCommonAncestor(second, first));
	}

	@Test
	public void findClosestRootTest() {
		BinaryTree.TreeNode lowestCommon = tree.getNodeFor(20);
		BinaryTree.TreeNode first = tree.getNodeFor(3);
		BinaryTree.TreeNode second = tree.getNodeFor(30);

		assertEquals(lowestCommon, tree.findClosestCommonAncestor(first, second));
	}

	@Test
	public void findClosestSameLineTest() {
		BinaryTree.TreeNode lowestCommon = tree.getNodeFor(10);
		BinaryTree.TreeNode first = tree.getNodeFor(10);
		BinaryTree.TreeNode second = tree.getNodeFor(15);

		assertEquals(lowestCommon, tree.findClosestCommonAncestor(first, second));
	}
}
