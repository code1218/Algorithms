package com.study.ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayTest2 {
	
	private static int[] numArray;
	
	public void arrayInit() {
		numArray = new int[0];
	}
	
	public void add(int value) {
		int[] tempArray = new int[numArray.length + 1];
		for(int i = 0; i < numArray.length; i++) {
			tempArray[i] = numArray[i];
		}
		tempArray[numArray.length] = value;
		numArray = tempArray;
		System.gc();
	}
	
	public void add(int index, int value) {
		int arraySize = index < numArray.length + 1 ? numArray.length + 1 : index + 1;
		int[] tempArray = new int[arraySize];
		if(index != 0 || numArray.length != 0) {
			for(int i = 0; i < index; i++) {
				if(i < numArray.length) {
					tempArray[i] = numArray[i];					
				}
			}
		}
		tempArray[index] = value;
		for(int i = index; i < arraySize; i++) {
			if(i < numArray.length) {
				tempArray[i + 1] = numArray[i];					
			}
		}
		numArray = tempArray;
	}
	
	public int indexOf(int value) {
		int findIndex = -1;
		
//		int i = 0;
//		
//		while(i < numArray.length) {
//			
//			if(numArray[i] == value) {
//				findIndex = i;
//				break;
//			}
//			
//			i++;
//		}
		
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] == value) {
				findIndex = i;
				break;
			}
		}
		
		
		return findIndex;
	}
	
	public int lastIndexOf(int value) {
		int findLastIndex = -1;
		
		for(int i = 0; i < numArray.length; i++) {
			int index = numArray.length - i - 1;
			
			if(numArray[index] == value) {
				findLastIndex = index;
				break;
			}
		}
		
		
		return findLastIndex;
	}
	
	public int count(int value) {
		int count = 0;
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] == value) {
				count++;
			}
		}
		return count;		
	}
	
	public boolean contains(int value) {
		boolean flag = false;
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i] == value) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean update(int index, int oldValue, int newValue) {
		boolean flag = false;
		
		if(numArray[index] == oldValue) {
			numArray[index] = newValue;
			flag = true;
		}
		
		return flag;
	}
	
	public int remove(int index) {
		int removeValue = 0;
		
		int[] tempArray = new int[numArray.length - 1];
		
		try {
			for(int i = 0; i < index; i++) {
				tempArray[i] = numArray[i];
			}
			removeValue = numArray[index];
			for(int i = index + 1; i < numArray.length; i++) {
				tempArray[i - 1] = numArray[i];
			}
			numArray = tempArray;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 배열의 크기를 초과한 인덱스 참조입니다.");
		}
		
		return removeValue;
	}
	
	public void selectionSort() {
		for(int i = 0; i < numArray.length - 1; i++) {
			for(int j = i + 1; j < numArray.length; j++) {
				if(numArray[j] < numArray[i]) {
					int temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ ");
		for(int num : numArray) {
			builder.append(num + ", ");
			
		}
		if(builder.length() != 2) {
			builder.delete(builder.length() - 2, builder.length());			
		}
		builder.append(" ]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		ArrayTest2 t = new ArrayTest2();
		t.arrayInit();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String select = null;
			
			System.out.println("[ 배열 자료구조 ]");
			System.out.println("1. 값 추가");
			System.out.println("2. 선택 위치에 값 추가");
			System.out.println("3. 전체 조회");
			System.out.println("4. indexOf");
			System.out.println("5. lastIndexOf");
			System.out.println("6. count");
			System.out.println("7. contains");
			System.out.println("8. 값 수정");
			System.out.println("9. 값 삭제");
			System.out.println("10. 선택정렬");
			System.out.println("q. 프로그램 종료");
			System.out.println("==============================");
			System.out.print("명령 선택 >> ");
			select = scanner.nextLine();
			
			if(select.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료 중!!!");
				break;
			} else if(select.equals("1")) {
				System.out.print("값: ");
				t.add(scanner.nextInt());
				scanner.nextLine();
				
			} else if(select.equals("2")) {
				System.out.print("위치: ");
				int index = scanner.nextInt();
				
				System.out.print("값: ");
				int value = scanner.nextInt();
				scanner.nextLine();
				t.add(index, value);
				
			} else if(select.equals("3")) {
				System.out.println(t);
				
			} else if(select.equals("4")) {
				System.out.print("찾을 값: ");
				int searchValue = scanner.nextInt();
				
				System.out.print("인덱스 위치: ");
				System.out.println(t.indexOf(searchValue));
				
			} else if(select.equals("5")) {
				
			} else if(select.equals("9")) {
				System.out.print("삭제할 인덱스: ");
				int index = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("삭제한 값: " + t.remove(index));
			} else if(select.equals("10")) {
				t.selectionSort();
			} else {
				System.out.println("다시 입력하세요.");
			}
			System.out.println();
		}
		
		System.out.println("프로그램이 정상 종료 되었습니다.");
	}

}









