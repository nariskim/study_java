package com.urdomain.lecture.ch06.T;

public class ComputerExample  {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		int r = 7;
		
		System.out.println("원의 반지름 : " + r);
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원의 넓이 : " + calculator.circleArea(r));
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원의 넓이 : " + computer.circleArea2(r));		
	}

}
