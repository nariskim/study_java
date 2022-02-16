package com.urdomain.lecture.function;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		함수의 사용
		int sum = add(3, 4);
		System.out.println(sum);
		
		int sum1= minus(3, 4);
		System.out.println(sum1);
		
		int sum2= times(3, 4);
		System.out.println(sum2);
		
		double sum3= slash(3, 4);
		System.out.println(sum3);
	}




//public 리턴자료형 메소드명 (입력자료형1 입력변수1, 입력자료형2 입력변수3, ...) {
//	...
//	return 리턴값; // 리턴자료형이 void 인 경우에는 return 문이 필요없다.
//	}


//	함수선언
	public static int add (int a, int d) {
		
		int sum = a + d;
		
		return sum;
	}

//	- * % / 대한 함수를 선언 후 사용하는 프로그래밍을 완성하시요
	
	public static int minus(int m, int n) {
		int sum1 = m - n;
		return sum1;
	}
	
	public static int times(int t, int i) {
		int sum2 = t * i;
		return sum2;
	}
	
	public static double slash(double s, double l) {
		double sum3 = s/l;
		return sum3;
	}
	
	
	
	public int aaa(int a, int b, int c, String d, boolean e) {
		return 1;
	}
	
	
}