package com.github.diwakar1988.ll;

public class Node implements Cloneable{

	public int data;
	public Node next;

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Node(this.data, this.next); 
	}
	
}
