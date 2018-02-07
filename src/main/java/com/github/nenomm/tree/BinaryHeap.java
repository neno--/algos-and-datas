package com.github.nenomm.tree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class BinaryHeap<T extends Comparable> {
	private static Logger log = LoggerFactory.getLogger(BinaryHeap.class);

	private TreeNode root;
	private int size = 0;

	public BinaryHeap(T... elements) {
		for (T element : elements) {
			insert(element);
		}
	}

	public static class TreeNode<T extends Comparable> {
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

		}

		private void setElement(T element) {
			this.element = element;
		}
	}

	public boolean isEmpty() {
		return (root == null);
	}


	public void insert(T element) {
		if (element == null) {
			return;
		}

		TreeNode newNode = new TreeNode(element);
		size++;

		if (isEmpty()) {
			log.info("Creating new root: {}", element);
			root = newNode;
		} else {
			log.info("Level of deepest leftie is: {}, element is: {}", getLevelOfDeepestLeftie(root), getDeepestLeftie(root).getElement());
			TreeNode vacantParent = findFirstVacantParent(getLevelOfDeepestLeftie(root) - 1, 0, root);

			if (vacantParent != null) log.info("Vacant parent is: {}", vacantParent.getElement());

			if (vacantParent == null) {
				log.info("No vacant parents for: {}", element);
				TreeNode leftie = getDeepestLeftie(root);
				log.info("Deepest leftie is: {}", leftie.getElement());
				leftie.left = newNode;
			} else if (!vacantParent.hasLeft()) {
				log.info("Creating left child {} of parent: {}", newNode.getElement(), vacantParent.getElement());
				vacantParent.left = newNode;
			} else {
				log.info("Creating right child {} of parent: {}", newNode.getElement(), vacantParent.getElement());
				vacantParent.right = newNode;
			}
			swap(root, newNode);
		}
	}

	private boolean swap(TreeNode parent, TreeNode newNode) {
		T tmp = (T) parent.getElement();

		log.info("entered swap");

		if ((parent.left == newNode) || (parent.right == newNode)) {
			if (parent.getElement().compareTo(newNode.getElement()) < 0) {
				log.info("Reached the node. swapping new node {} with parent {}", newNode.getElement(), parent.getElement());
				parent.setElement(newNode.getElement());
				newNode.setElement(tmp);
				return true;
			}
			log.info("Reached the node, no swap");
			return false;
		}

		if (parent.hasLeft() && swap(parent.left, newNode)) {
			if (parent.getElement().compareTo(parent.left.getElement()) < 0) {
				parent.setElement(parent.left.getElement());
				parent.left.setElement(tmp);
				return true;
			}
			return false;
		} else if (parent.hasRight() && swap(parent.right, newNode)) {
			if (parent.getElement().compareTo(parent.right.getElement()) < 0) {
				parent.setElement(parent.right.getElement());
				parent.right.setElement(tmp);
				return true;
			}
			return false;
		}

		return false;
	}

	private int getLevelOfDeepestLeftie(TreeNode node) {
		int level = 0;
		while (node.hasLeft()) {
			level++;
			node = node.left;
		}

		return level;
	}

	private TreeNode getDeepestLeftie(TreeNode node) {
		while (node.hasLeft()) {
			node = node.left;
		}

		return node;
	}

	private TreeNode findFirstVacantParent(int targetLevel, int currentLevel, TreeNode node) {
		TreeNode result;

		if (currentLevel < targetLevel) {
			result = findFirstVacantParent(targetLevel, currentLevel + 1, node.left);
			if (result == null) {
				return findFirstVacantParent(targetLevel, currentLevel + 1, node.right);
			}
			return result;
		} else {
			if (!node.hasLeft() || !node.hasRight()) {
				return node;
			} else {
				return null;
			}
		}
	}

	public List<T> flattenByLevel() {
		List<T> result = new ArrayList<T>(size);
		int level = 0;
		do {
			log.info("Flattening level {}, list size is {}", level, result.size());
			flattenByLevel(0, level++, result, root);
		} while (result.size() < size);

		return result;
	}

	private void flattenByLevel(int currentLevel, int targetLevel, List<T> elements, TreeNode node) {
		if (node == null) {
			return;
		}

		if (currentLevel == targetLevel) {
			elements.add((T) node.getElement());
		} else {
			flattenByLevel(currentLevel + 1, targetLevel, elements, node.left);
			flattenByLevel(currentLevel + 1, targetLevel, elements, node.right);
		}
	}
}
