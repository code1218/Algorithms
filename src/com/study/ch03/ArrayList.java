package com.study.ch03;

public class ArrayList<E> {
	private E[] array;
	
	public ArrayList() {
		array = (E[]) new Object[0];
	}
	
	public void add(E value) {
		E[] newArray = (E[]) new Object[array.length + 1];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		newArray[array.length] = value;
		array = newArray;
	}
	
	public void add(int index, E value) {
		
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		
		for(int i = 0; i < array.length; i++) {
			str.append(array[i]);
			if(i < array.length - 1) {
				str.append(", ");
			}
		}
		
		str.append("]");
		
		return str.toString();
	}
}






