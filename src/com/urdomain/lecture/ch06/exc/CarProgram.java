package com.urdomain.lecture.ch06.exc;

public class CarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Car car = new Car();	//선언 + 생성
		
//		Car car2;	//선언
//		car2 = new Car();	//생성
		
		
//		객체접근연산자		
//		car.company;
		
		System.out.println("car.company : " + car.company);
		
		car.c = car.a + car.b;
		
		System.out.println("car.c : " + car.c);
		
		car.c = car.speedUp(10);
		
		System.out.println("car.c : " + car.c);
	}

}
