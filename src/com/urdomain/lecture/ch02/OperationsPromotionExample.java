package com.urdomain.lecture.ch02;

public class OperationsPromotionExample {

	public static void main(String[] args) {

		
		// 연산 : + - * / %
		// 형이 틀린 경우에는 큰 형으로 자동 형변환
		
		int a = 10;
		double b = 10.0;
		// int c = (a + b); // Type mismatch: cannot convert from double to int
		int d = (int)(a + b);
		
		double e = a + b;
		
		//정수형 연산(byte, short, int)은 int로 자동 형변환, long은 제외
		
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; //컴파일 에러
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		
		// char은 int와 연산가능
		// char은 int와 연산이 되면 int로 자동 형변환이 되어 연산 가능 
		char charValue1 = 'A';
		char charValue2 = 1;
		
		// char charValue3 = charValue1 + charValue2; //컴파일 에러
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println("intValue4 : " + intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 /4.0;	//컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println("doubleValue : " + doubleValue);
		
		long aa = 1;
		long bb = 2;
		long cc = aa + bb;
		
		System.out.println("cc : " + cc);
		
		short aaa = 1;
		short bbb = 2;
	//	short ccc = aaa + bbb;
		
		
		
	}

}
