package com.study.ch03;

public class ResponseMain {

	public static void main(String[] args) {
		ResponseData<? extends String> data = 
				new ResponseData<String>("test", "문자열 데이터 응답성공!");
		
		System.out.println(data);
	}
}
