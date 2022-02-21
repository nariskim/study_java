package com.urdomain.lecture.ch06;

public class Korean {

	String nation = "대한민국";
	String name = "";
	String ssn;		//ssn : Social Security Number : 사회보장번호 : 주민등록번호

	public Korean() {
		
	}
	
//	public Korean(String n, String s) {
//		
//		name = n;
//		ssn = s;
//		
//	}
	
	public Korean(String name, String ssn) {
		
		this.name = name;
		this.ssn = ssn;
	}
	
}
