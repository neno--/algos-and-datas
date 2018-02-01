package com.github.nenomm.tree;

public class BinaryTree<T extends Comparable> {
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

		public TreeNode getLeft() {
			return left;
		}

		public TreeNode getRight() {
			return right;
		}

		public T getValue() {
			return element;
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

	public TreeNode getRoot() {
		return root;
	}
}
