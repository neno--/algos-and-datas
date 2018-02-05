package com.github.nenomm.tree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryTree<T extends Comparable> {
	private static Logger log = LoggerFactory.getLogger(BinaryTree.class);

	private TreeNode root;

	public BinaryTree(T... elements) {
		for (T element : elements) {
			insert(element);
		}
	}

	static class TreeNode<T extends Comparable> {
		private T element;

		private TreeNode left;
		private TreeNode right;

		public TreeNode(T element) {
			this.element = element;
		}

		public T getElement() {
			return element;
		}

		public boolean hasLeft() {
			return left != null;
		}

		public boolean hasRight() {
			return right != null;
		}

		protected void insert(T element) {
			if (element.compareTo(getElement()) < 0) {
				if (hasLeft()) {
					left.insert(element);
				} else {
					left = new TreeNode(element);
				}
			} else {
				if (hasRight()) {
					right.insert(element);
				} else {
					right = new TreeNode(element);
				}
			}
		}

		protected boolean search(T element) {
			if (element.compareTo(getElement()) == 0) {
				return true;
			} else if ((element.compareTo(getElement()) < 0) && hasLeft()) {
				return left.search(element);
			} else if ((element.compareTo(getElement()) >= 0) && hasRight()) {
				return right.search(element);
			}
			return false;
		}

		protected TreeNode getNodeFor(T element) {
			if (element.compareTo(getElement()) == 0) {
				return this;
			} else if ((element.compareTo(getElement()) < 0) && hasLeft()) {
				return left.getNodeFor(element);
			} else if ((element.compareTo(getElement()) >= 0) && hasRight()) {
				return right.getNodeFor(element);
			}
			return null;
		}

		public TreeNode getLeft() {
			return left;
		}

		public TreeNode getRight() {
			return right;
		}

		public T getValue() {
			return element;
		}

		private int getDepth(int currentMax, int currentLevel) {
			int localLeftMax = currentMax, localRightMax = currentMax;
			if (this.hasLeft()) {
				localLeftMax = this.getLeft().getDepth((currentMax > (currentLevel + 1)) ? currentMax : currentLevel + 1, currentLevel + 1);
			}

			if (this.hasRight()) {
				localRightMax = this.getRight().getDepth((currentMax > (currentLevel + 1)) ? currentMax : currentLevel + 1, currentLevel + 1);
			}

			return (localLeftMax > localRightMax) ? localLeftMax : localRightMax;
		}
	}

	public void insert(T element) {
		if (element == null) {
			return;
		}

		if (isEmpty()) {
			root = new TreeNode(element);
		} else {
			root.insert(element);
		}
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public boolean search(T element) {
		if (isEmpty()) {
			return false;
		}

		return root.search(element);
	}

	public TreeNode<T> getNodeFor(T element) {
		TreeNode node = null;
		if (isEmpty()) {
			return node;
		}

		return root.getNodeFor(element);
	}

	public TreeNode getRoot() {
		return root;
	}

	public int getDepth() {
		if (isEmpty()) {
			return 0;
		}
		return root.getDepth(0, 0) + 1;
	}

	/**
	 * @param first
	 * @param second
	 * @return lowest common ancestor
	 * <p>
	 * If one of the node is the ancestor to another, this node will be returned.
	 */
	public TreeNode<T> findClosestCommonAncestor(TreeNode<T> first, TreeNode<T> second) {
		TreeNode firstWalker = root;
		TreeNode temp = first;
		if (first.getValue().compareTo(second.getValue()) > 0) {
			temp = first;
			first = second;
			second = temp;
		}


		if (isEmpty()) {
			return null;
		}

		while ((firstWalker != null) && (second.getValue().compareTo(firstWalker.getValue()) < 0)) {
			log.info("Current common is: {}", firstWalker.getValue());


			if (firstWalker.getValue().compareTo(first.getValue()) > 0) {
				firstWalker = firstWalker.getLeft();
			} else if (firstWalker.getValue().compareTo(first.getValue()) < 0) {
				firstWalker = firstWalker.getRight();
			} else {
				return firstWalker;
			}
		}

		return firstWalker;
	}
}
