package com.urdomain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();	//Car() 생성자 = 함수이다, new = 연산자
	
		Student student = new Student();
		int a = 1;
		
//		Student student = new Student();
		
		
//		객체접근연산자(.)을 사용하여 car 객체변수의 값을 창조
		
		System.out.println("company : " + car.company);
		System.out.println("model : " + car.model);
		System.out.println("color : " + car.color);
		System.out.println("maxSpeed : " + car.maxSpeed);
		System.out.println("speed : " + car.speed);	//0
		
		car.speed = 100;	//	대입
		
		System.out.println("speed : " + car.speed);	//100	
		
//		speed가 maxSpeed 보다 속도가 높은지 낮은지를 출력해 주는 함수를 만들어서 출력 하시요
		upDown(car.speed, car.maxSpeed);	//내가 빠트린 부분
	}
	
	public static void upDown(int speed, int maxSpeed) {	//static 빼먹음 주의
		if(speed>maxSpeed) {
			System.out.println("스피드가 맥스보다 높습니다");
		} else if(speed<maxSpeed) {
			System.out.println("스피드가 맥스보다 낮습니다");
		} else {
			System.out.println("스피드와 맥스가 같습니다");
		}
		
	}

}
