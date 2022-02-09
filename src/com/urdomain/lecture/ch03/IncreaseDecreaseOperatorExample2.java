package com.urdomain.lecture.ch03;

public class IncreaseDecreaseOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		// ++ (1증가), -- (1감소)
		
		
		//++x; // 피연산자를 1증가 시키고 다른 연산 수행
		//x++; // 다른 연산 수행 후 피연산자 1 증가
		// 다른연산자가 없으면 앞에 있나 뒤에 있나 결과는 동일하다
		

		int x = 10;
		int y = 10;
		int a = 0;
		int b = 0;
		
		++x;
		System.out.println(x);
		
		
		y++;
		System.out.println(y);
		
		
		a = ++x;
		b = x++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);


		
	}

}
