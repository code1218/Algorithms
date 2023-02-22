package com.study.ch03;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
// getter, setter, toString, hashCodeAndEquals
public class ResponseData<T> {
	private T data;
	private String messase;
}
