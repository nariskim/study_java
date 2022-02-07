package com.urdomain.lecture.ch02;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		// byte < short < int < long
		// float < double
		
		// 강제 형번환 : casting : (원하는 형) 변수형
		
		
	
		int intValue = 44032;
		System.out.println("intValue : " + intValue);
		
		char charValue = (char)intValue;
		System.out.println(charValue);			//44032 -> char	//가 나 다 라
		
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
	
		
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	
	
	
	
	}
	

}
