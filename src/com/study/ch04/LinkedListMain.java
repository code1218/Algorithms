package com.study.ch04;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList.Node node = new LinkedList().new Node("test");
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(40);
		list.add(2, 50);
		
		System.out.println(list.getHead());
		System.out.println(list.getTail());
		System.out.println(list.node(2));
		
	}
	
}
