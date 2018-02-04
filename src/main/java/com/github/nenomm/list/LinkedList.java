package com.github.nenomm.list;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkedList<T> {
	private static Logger log = LoggerFactory.getLogger(LinkedList.class);

	public static class Node<T> {
		private T value;
		private Node next;

		public Node(T value) {
			this.value = value;
		}

		protected void setNext(Node next) {
			this.next = next;
		}

		public Node getNext() {
			return next;
		}

		public T getValue() {
			return value;
		}
	}

	private Node root;
	private Node last;

	public LinkedList(T... elements) {
		for (int i = 0; i < elements.length; i++) {
			if (i == 0) {
				root = new Node(i);
				last = root;
			} else {
				add(elements[i]);
			}
		}
	}

	public void add(T element) {
		last.setNext(new Node(element));
		last = last.getNext();
	}

	// creates a loop
	public void connectTo(int index) {
		Node node = root;
		for (int i = 0; i < index; i++) {
			node = node.getNext();
		}
		last.setNext(node);
	}

	public Node getAt(int index) {
		Node node = root;
		for (int i = 0; i < index; i++) {
			node = node.getNext();
		}

		return node;
	}

	public boolean isLoop() {
		Node fast, slow;
		slow = root;
		fast = root.getNext();

		while (true) {
			log.info("Slow: {}, Fast: {}", slow.getValue(), fast.getValue());
			if ((fast == null) || (fast.getNext() == null)) {
				log.info("There is no loop");
				return false;
			} else if ((fast == slow) || (fast.getNext() == slow)) {
				log.info("There is a loop");
				return true;
			} else {
				slow = slow.getNext();
				fast = fast.getNext().getNext();
			}
		}
	}
}

