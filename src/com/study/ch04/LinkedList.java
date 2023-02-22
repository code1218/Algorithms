package com.study.ch04;

import lombok.Getter;
import lombok.ToString;

public class LinkedList {

	@ToString
	public class Node {
		private Object data;
		private Node next;
		
		public Node(Object data) {
			this.data = data;
		}
	}
	
	@Getter
	private Node head;
	@Getter
	private Node tail;
	private int size;
	
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		if(tail == null) {
			tail = newNode;
		}
		size++;
	}
	
	public void addLast(Object data) {
		if(tail == null) {
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		tail.next = newNode;
		tail = newNode;
		size++;
	}
	
	public void add(int index, Object data) {
		
	}
	
	public Node node(int index) {
		if(!(index < size)) {
			throw new IndexOutOfBoundsException(index);
		}
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}
}




