package com.urdomain.lecture.ch02;

public class LongExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long var1 = 10;
		long var2 = 20;
		long var3 = 2147483647;
		
		//컴파일에러
		//int 범위를 벗어나는 리터럴인 경우에는 뒤에 'L'을 붙여주어야 된다.
		
		
		//long var4 = 2147483648; // int 범위 넘어서면 L 붙여야함
		long var5 = 100000000000L;
		
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}

}
