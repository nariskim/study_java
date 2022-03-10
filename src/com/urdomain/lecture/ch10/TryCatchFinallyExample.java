package com.urdomain.lecture.ch10;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			/* e.printStackTrace(); */
			System.out.println("클래스가 존재하지 않습니다.");
//			System.out.println("runtime exception !!!");
		} finally {
			System.out.println("finally");
		}
	}

//	public static void main(String[] args) throws ClassNotFoundException {
//		Class clazz = Class.forName("java.lang.String2");
//	}

//	public static void main(String[] args) {
//		Class clazz = Class.forName("java.lang.String2");
//	}
}