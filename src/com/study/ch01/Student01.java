package com.study.ch01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor			// 매개변수 값이 없다.
@AllArgsConstructor			// 모든 맴버변수와 일치하는 매개변수가 있다.
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Student01 {
	private final String name;
	private final int year;
	private String phone;
	private String address;
	
//	public Student01() {}
	
//	public Student01(String name, int year, String phone, String address) {
//		super();
//		this.name = name;
//		this.year = year;
//		this.phone = phone;
//		this.address = address;
//	}
	
//	public Student01(String name, int year) {
//		this.name = name;
//		this.year = year;
//	}
	
	
}






