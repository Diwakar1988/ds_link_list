package com.github.diwakar1988.ll;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public Node cloneHead() {
		try {
			return (Node) head.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public Node add(int data) {
		if (head == null) {
			return head = new Node(data, null);
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}

			return n.next = new Node(data, null);
		}
	}

	public List<Integer> getAll() {
		List<Integer> list = new ArrayList<>();
		Node n = head;
		while (n != null) {
			list.add(n.data);
			n = n.next;
		}
		return list;
	}

	public int size() {
		Node n = head;
		int count = 0;
		while (n != null) {
			count++;
			n = n.next;
		}
		return count;
	}
	public Node search(int data) {
		Node n = head;
		while (n != null) {
			if (n.data==data) {
				return n;
			}
			n = n.next;
		}
		return null;
	}

}
