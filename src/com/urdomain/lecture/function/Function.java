package com.urdomain.lecture.function;

import java.util.Random;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		함수의 사용

		add(3, 4);
		println(add(3, 4));
		println(minus(3, 4));

		println("asdfasdf");
		
		System.out.println(bbb("김나리","최고"));
		
		System.out.println();

	}
//public 리턴자료형 메소드명 (입력자료형1 입력변수1, 입력자료형2 입력변수3, ...) {
//	...
//	return 리턴값; // 리턴자료형이 void 인 경우에는 return 문이 필요없다.
//	}

//	함수선언
	public static int add(int a, int b) {

		return a+b;
	}
	public static int minus(int a, int b) {
		
		return a-b;
	}
	public static int multiply(int a, int b) {
		
		return a*b;
	}
	public static int divide(int a, int b) {
		
		return a/b;
	}
	public static int reminder(int a, int b) {
		
		return a%b;
	}

//	- * % / 대한 함수를 선언 후 사용하는 프로그래밍을 완성하시요

	public static void println(int num) {
		System.out.println(num);
	}

	public static void println(Double num) {
		System.out.println(num);
	}

	public static void println(String str) {
		System.out.println(str);
	}

	public int aaa(int a, int b, int c, String d, boolean e) {
		System.out.println(a);
		return 1;
	}

	
	
	public static String bbb(String a, String b) {
		
		String ccc = a + b;
		
		return ccc;
		
	}
	

	
	public static String ate(String ddd){
		 
	     String eats[] = { "중식", "한식", "양식", "일식" };
	 
	 
	    Random menus = new Random();
	    int menu = menus.nextInt(eats.length);     
	
	 
	 
	    return eats[menu];
	
}
	
}	