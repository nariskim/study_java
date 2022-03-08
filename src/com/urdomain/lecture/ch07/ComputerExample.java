package com.urdomain.lecture.ch07;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 10;
			
		Calculator calculator = new Calculator();
		
		System.out.println("원의 넓이 : " + calculator.areaCircle(2));
		

		
		Computer computer = new Computer();
		
		System.out.println("원의 넓이 : " + computer.areaCircle(2));
	
	}

}
