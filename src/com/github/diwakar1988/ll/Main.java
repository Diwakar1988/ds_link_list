package com.github.diwakar1988.ll;

public class Main {

	public static void main(String[] args) {
		SingleLinkList ll = new SingleLinkList();
		ll.add(11);
		ll.add(1);
		ll.add(5);
		ll.add(10);
		ll.add(7);
		System.out.println(ll.getAll());
		
		System.out.println("SIZE= "+ll.size());
		
		System.out.println("SEARCH(15) = "+(ll.search(15)!=null));
	}
}
