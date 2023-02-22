package com.study.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest1 {
	
	public static void test(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9};
		int[] numbers2 = new int[9];
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		numbers2[3] = 4;
		numbers2[4] = 5;
		numbers2[5] = 6;
		numbers2[6] = 7;
		numbers2[7] = 8;
		numbers2[8] = 9;
		int[] numbers3 = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> tempList = Arrays.asList(new Integer[] {1,2,3,4,5});
		List<Integer> numberList = new ArrayList<>();
		numberList.addAll(tempList);
		
		numberList.add(1, 100);
		
		for(int i = 0; i < numberList.size(); i++) {
			System.out.println(numberList.get(i));
		}
		
		
	}

}
